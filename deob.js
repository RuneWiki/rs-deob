const fs = require('fs');
const child_process = require('child_process');
const path = require('path');

function deob(rev, client) {
    fs.rmSync('remap.txt', { force: true });
    fs.rmSync('deob.toml', { force: true });
    fs.rmSync('work', { recursive: true, force: true });

    fs.mkdirSync('work/ref', { recursive: true });
    fs.cpSync('lib/' + client, 'work/ref/runescape.jar');

    let toml = fs.readFileSync('deob.toml.template', 'ascii');
    // todo: apply any replacements
    fs.writeFileSync('work/deob.toml', toml);

    // deob!
    child_process.execSync('java -jar ../deobfuscator.jar', {
        stdio: 'inherit',
        cwd: path.join(__dirname, 'work')
    });

    // upload to git
    child_process.execSync('git init', {
        stdio: 'inherit',
        cwd: path.join(__dirname, 'work')
    });
    child_process.execSync('git checkout -b ' + rev, {
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
    child_process.execSync('git remote add origin https://github.com/RuneWiki/rs-deob', {
        stdio: 'inherit',
        cwd: path.join(__dirname, 'work')
    });
    child_process.execSync('git push -u origin ' + rev, {
        stdio: 'inherit',
        cwd: path.join(__dirname, 'work')
    });
}

const csv = fs.readFileSync('deob.csv', 'ascii').replace(/\r/g, '').split('\n').map(l => l.split(',')).slice(1);

// for (let i = 0; i < csv.length; i++) {
//     deob(...csv[i]);
// }

deob(...csv[0]);
