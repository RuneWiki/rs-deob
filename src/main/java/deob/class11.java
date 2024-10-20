package deob;

@ObfuscatedName("a")
public class class11 extends class17 {

    @ObfuscatedName("a.f(Lgx;Lgx;I)V")
    public void method121(class185 arg0, class185 arg1) {
        int var3 = arg1.method3323();
        if (class26.field221.field220 != var3) {
            throw new IllegalStateException("");
        }
        this.field128 = arg1.method3323();
        this.field138 = arg1.method3323();
        this.field134 = arg1.method3325();
        this.field136 = arg1.method3325();
        this.field129 = arg1.method3325();
        this.field127 = arg1.method3325();
        this.field138 = Math.min(this.field138, 4);
        this.field124 = new short[1][64][64];
        this.field131 = new short[this.field138][64][64];
        this.field130 = new byte[this.field138][64][64];
        this.field133 = new byte[this.field138][64][64];
        this.field125 = new class20[this.field138][64][64][];
        int var4 = arg0.method3323();
        if (class25.field209.field213 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3323();
        int var6 = arg0.method3323();
        if (this.field129 != var5 || this.field127 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method185(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field129 == var2.field129 && this.field127 == var2.field127;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field129 | this.field127 << 8;
    }
}
