const fs = require('fs');
const child_process = require('child_process');
const path = require('path');

const DISASSEMBLE = false;
const UPLOAD = false;

function deob(branch, client, profile, template, remap) {
    fs.rmSync('remap.txt', { force: true });
    fs.rmSync('deob.toml', { force: true });
    fs.rmSync('work', { recursive: true, force: true });

    fs.mkdirSync('work/ref', { recursive: true });
    fs.cpSync('lib/' + client, 'work/ref/runescape.jar');

    // copy deob profile to work folder
    let toml = fs.readFileSync('profiles/' + profile, 'ascii');
    // todo: apply any replacements
    fs.writeFileSync('work/deob.toml', toml);

    fs.writeFileSync('work/obforder.txt', '');

    if (remap) {
        fs.cpSync('remap/' + remap, 'work/remap.txt');
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
    child_process.execSync('java -jar ../deobfuscator.jar', {
        stdio: 'inherit',
        cwd: path.join(__dirname, 'work')
    });

    // copy template gradle project to work folder
    fs.cpSync('template/' + template, 'work', { recursive: true });

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
    if (UPLOAD) {
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

const csv = fs.readFileSync('deob.csv', 'ascii').replace(/\r/g, '').split('\n').map(l => l.split(',')).slice(1);

const args = process.argv.slice(2);
let target = args[0] || -1;

for (let i = 0; i < csv.length; i++) {
    const [ branch ] = csv[i];
    if (target !== 'all' && (branch != target || !branch.startsWith(target))) {
        continue;
    }

    console.log('------ ' + branch + ' -----');
    deob(...csv[i]);
}
