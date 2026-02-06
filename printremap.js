const fs = require('fs');

const remap = fs.readFileSync('remap/osrs-1.txt', 'ascii').split('\n').filter(x => x.match(/^\w+=/));
const classes = new Map();
for (const names of remap) {
    const [obf, name] = names.split('=');
    classes.set(obf, name);
}

const obforder = fs.readFileSync('obforder/osrs-1.txt', 'ascii').split('\n');
const order = new Set();
for (const obf of obforder) {
    order.add(obf);
}

for (const obf of order) {
    console.log(obf + ',' + classes.get(obf));
}
