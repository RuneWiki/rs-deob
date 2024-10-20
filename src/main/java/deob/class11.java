package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("g")
public class class11 {

    @ObfuscatedName("g.t")
    public int field180;

    @ObfuscatedName("g.n")
    public class37 field178;

    @ObfuscatedName("g.q")
    public DataInputStream field182;

    @ObfuscatedName("g.h")
    public byte[] field184 = new byte[4];

    @ObfuscatedName("g.k")
    public int field181;

    @ObfuscatedName("g.r")
    public byte[] field177;

    @ObfuscatedName("g.l")
    public int field183;

    @ObfuscatedName("g.i")
    public long field179;

    public class11(class34 arg0, URL arg1) {
        this.field178 = arg0.method434(arg1);
        this.field180 = 0;
        this.field179 = class63.method697() + 30000L;
    }

    @ObfuscatedName("g.t(I)[B")
    public byte[] method103() throws IOException {
        if (class63.method697() > this.field179) {
            throw new IOException();
        }
        if (this.field180 == 0) {
            if (this.field178.field500 == 2) {
                throw new IOException();
            }
            if (this.field178.field500 == 1) {
                this.field182 = (DataInputStream) this.field178.field501;
                this.field180 = 1;
            }
        }
        if (this.field180 == 1) {
            int var1 = this.field182.available();
            if (var1 > 0) {
                if (this.field181 + var1 > 4) {
                    var1 = 4 - this.field181;
                }
                this.field181 += this.field182.read(this.field184, this.field181, var1);
                if (this.field181 == 4) {
                    int var2 = (new class135(this.field184)).method1616();
                    this.field177 = new byte[var2];
                    this.field180 = 2;
                }
            }
        }
        if (this.field180 == 2) {
            int var3 = this.field182.available();
            if (var3 > 0) {
                if (this.field183 + var3 > this.field177.length) {
                    var3 = this.field177.length - this.field183;
                }
                this.field183 += this.field182.read(this.field177, this.field183, var3);
                if (this.field183 == this.field177.length) {
                    return this.field177;
                }
            }
        }
        return null;
    }
}
