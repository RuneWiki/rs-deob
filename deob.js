const fs = require('fs');
const child_process = require('child_process');
const path = require('path');

const yauzl = require('yauzl');
const { decryptClient, unpack200 } = require('./gamepack.js');

const DISASSEMBLE = false;
const TEMPLATE = true;
const UPLOAD = false;

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

async function deob(branch, client, profile, template, remap, secret, vector) {
    fs.rmSync('remap.txt', { force: true });
    fs.rmSync('deob.toml', { force: true });
    fs.rmSync('work', { recursive: true, force: true });

    fs.mkdirSync('work/ref', { recursive: true });

    if (secret && vector) {
        fs.cpSync('lib/' + client, 'work/ref/runescape.jar');
        await extractFile('lib/' + client, 'inner.pack.gz', 'work/ref/innerpack.jar');
        const innerPack = decryptClient(fs.readFileSync('work/ref/innerpack.jar'), secret, vector);
        unpack200(innerPack, 'work/ref/innerpack.jar');
    } else {
        fs.cpSync('lib/' + client, 'work/ref/runescape.jar');
    }

    // copy deob profile to work folder
    let toml = fs.readFileSync('profiles/' + profile + '.toml', 'ascii');
    // todo: apply any replacements
    fs.writeFileSync('work/deob.toml', toml);

    if (remap) {
        fs.cpSync('remap/' + remap + '.txt', 'work/remap.txt');
    }

    if (DISASSEMBLE) {
        // disassemble (can be useful)
        fs.mkdirSync('work/ref/dis', { recursive: true });
        child_process.execSync('krak2 dis --out ref/dis ref/runescape.jar', {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
    }

    // deob!
    child_process.execSync('java -Xmx4G -jar ../deobfuscator.jar', {
        stdio: 'inherit',
        cwd: path.join(__dirname, 'work')
    });

    if (TEMPLATE) {
        // copy template gradle project to work folder
        fs.cpSync('template/' + template, 'work', { recursive: true });
    }

    if (UPLOAD) {
        // initialize git repo with a new commit
        child_process.execSync('git init', {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
        child_process.execSync('git checkout -b ' + branch, {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
        child_process.execSync('git add --chmod=+x gradlew', {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
        child_process.execSync('git add .', {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
        child_process.execSync('git commit -m "feat: Initial commit"', {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });

        // upload to git
        child_process.execSync('git remote add origin https://github.com/RuneWiki/rs-deob', {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
        child_process.execSync('git push -f -u origin ' + branch, {
            stdio: 'inherit',
            cwd: path.join(__dirname, 'work')
        });
    }
}

async function run() {
    const csv = fs.readFileSync('deob.csv', 'ascii').replace(/\r/g, '').split('\n').map(l => l.split(',')).slice(1);

    const args = process.argv.slice(2);
    let target = args[0] || -1;

    for (let i = 0; i < csv.length; i++) {
        const [ branch ] = csv[i];
        if (target !== 'all' && (branch != target || !branch.startsWith(target))) {
            continue;
        }

        console.log('------ ' + branch + ' -----');
        await deob(...csv[i]);
    }
}

run();
