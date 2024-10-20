package deob;

@ObfuscatedName("c")
public class class11 extends class17 {

    @ObfuscatedName("c.v(Lgx;Lgx;B)V")
    public void method118(class185 arg0, class185 arg1) {
        int var3 = arg1.method3274();
        if (class26.field228.field227 != var3) {
            throw new IllegalStateException("");
        }
        this.field137 = arg1.method3274();
        this.field134 = arg1.method3274();
        this.field133 = arg1.method3276();
        this.field142 = arg1.method3276();
        this.field131 = arg1.method3276();
        this.field132 = arg1.method3276();
        this.field134 = Math.min(this.field134, 4);
        this.field135 = new short[1][64][64];
        this.field136 = new short[this.field134][64][64];
        this.field130 = new byte[this.field134][64][64];
        this.field138 = new byte[this.field134][64][64];
        this.field139 = new class20[this.field134][64][64][];
        int var4 = arg0.method3274();
        if (class25.field226.field224 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3274();
        int var6 = arg0.method3274();
        if (this.field131 != var5 || this.field132 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method186(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field131 == var2.field131 && this.field132 == var2.field132;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field131 | this.field132 << 8;
    }
}
