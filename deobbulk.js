const fs = require('fs');
const child_process = require('child_process');
const path = require('path');

const yauzl = require('yauzl');
const { decryptClient, unpack200 } = require('./gamepack.js');

function extractFile(zip, name, dest) {
    return new Promise((resolve, reject) => {
        yauzl.open(zip, { lazyEntries: true }, (err, zipfile) => {
            if (err) {
                reject(err);
                return;
            }

            zipfile.readEntry();
            zipfile.on('entry', entry => {
                if (entry.fileName === name) {
                    zipfile.openReadStream(entry, (err, readStream) => {
                        if (err) {
                            reject(err);
                            return;
                        }

                        const writeStream = fs.createWriteStream(dest);
                        readStream.pipe(writeStream);
                        writeStream.on('close', () => {
                            resolve();
                        });
                    });
                } else {
                    zipfile.readEntry();
                }
            });
        });
    });
}

async function main() {
    const rev = '822';
    const gamepacks = fs.readdirSync(`lib/${rev}`);

    let dir = 'work/';
    let num = 0;

    for (const file of gamepacks) {
        num++;

        if (fs.existsSync(`${dir}/${num}`)) {
            continue;
        }

        fs.rmSync(`${dir}/${num}`, { recursive: true, force: true });
        fs.mkdirSync(`${dir}/${num}/ref`, { recursive: true });

        await extractFile(`lib/${rev}/${file}`, 'parameters.txt', 'work/parameters.txt');
        const parameters = fs.readFileSync('work/parameters.txt', 'utf8').replace(/\r/g, '').split('\n');

        let secret = '';
        let vector = '';
        for (const line of parameters) {
            if (line.startsWith('"0"')) {
                secret = line.match(/ = "(.*)"/)[1];
            } else if (line.startsWith('"-1"')) {
                vector = line.match(/ = "(.*)"/)[1];
            }
        }

        await extractFile(`lib/${rev}/${file}`, 'inner.pack.gz', `${dir}/${num}/ref/innerpack.jar`);
        const innerPack = decryptClient(fs.readFileSync(`${dir}/${num}/ref/innerpack.jar`), secret, vector);
        unpack200(innerPack, `${dir}/${num}/ref/innerpack.jar`);

        console.log(file, secret, vector);
        fs.cpSync('profiles/rs3-2019.toml', `${dir}/${num}/deob.toml`);

        fs.mkdirSync(`${dir}/${num}/lib`, { recursive: true });
        fs.cpSync('lib/stub.jar', `${dir}/${num}/lib/stub.jar`);

        child_process.execSync('java -Xmx4G -jar ../../Deobfuscator.jar', {
            stdio: 'inherit',
            cwd: path.join(__dirname, `${dir}/${num}`)
        });
    }
}

main();
