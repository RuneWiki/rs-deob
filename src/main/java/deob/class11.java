package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("v")
public class class11 {

    @ObfuscatedName("v.q")
    public int field183;

    @ObfuscatedName("v.l")
    public class38 field181;

    @ObfuscatedName("v.a")
    public DataInputStream field182;

    @ObfuscatedName("v.o")
    public byte[] field184 = new byte[4];

    @ObfuscatedName("v.c")
    public int field180;

    @ObfuscatedName("v.h")
    public byte[] field185;

    @ObfuscatedName("v.r")
    public int field186;

    @ObfuscatedName("v.d")
    public long field187;

    public class11(class35 arg0, URL arg1) {
        this.field181 = arg0.method411(arg1);
        this.field183 = 0;
        this.field187 = class64.method535() + 30000L;
    }

    @ObfuscatedName("v.q(B)[B")
    public byte[] method94() throws IOException {
        if (class64.method535() > this.field187) {
            throw new IOException();
        }
        if (this.field183 == 0) {
            if (this.field181.field508 == 2) {
                throw new IOException();
            }
            if (this.field181.field508 == 1) {
                this.field182 = (DataInputStream) this.field181.field514;
                this.field183 = 1;
            }
        }
        if (this.field183 == 1) {
            int var1 = this.field182.available();
            if (var1 > 0) {
                if (this.field180 + var1 > 4) {
                    var1 = 4 - this.field180;
                }
                this.field180 += this.field182.read(this.field184, this.field180, var1);
                if (this.field180 == 4) {
                    int var2 = (new class136(this.field184)).method1607();
                    this.field185 = new byte[var2];
                    this.field183 = 2;
                }
            }
        }
        if (this.field183 == 2) {
            int var3 = this.field182.available();
            if (var3 > 0) {
                if (this.field186 + var3 > this.field185.length) {
                    var3 = this.field185.length - this.field186;
                }
                this.field186 += this.field182.read(this.field185, this.field186, var3);
                if (this.field186 == this.field185.length) {
                    return this.field185;
                }
            }
        }
        return null;
    }
}
