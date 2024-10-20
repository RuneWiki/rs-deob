package deob;

@ObfuscatedName("d")
public class class11 extends class17 {

    @ObfuscatedName("d.f(Lgm;Lgm;I)V")
    public void method95(class185 arg0, class185 arg1) {
        int var3 = arg1.method3344();
        if (class26.field250.field245 != var3) {
            throw new IllegalStateException("");
        }
        this.field153 = arg1.method3344();
        this.field146 = arg1.method3344();
        this.field157 = arg1.method3346();
        this.field151 = arg1.method3346();
        this.field145 = arg1.method3346();
        this.field144 = arg1.method3346();
        this.field146 = Math.min(this.field146, 4);
        this.field147 = new short[1][64][64];
        this.field148 = new short[this.field146][64][64];
        this.field149 = new byte[this.field146][64][64];
        this.field150 = new byte[this.field146][64][64];
        this.field156 = new class20[this.field146][64][64][];
        int var4 = arg0.method3344();
        if (class25.field238.field235 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3344();
        int var6 = arg0.method3344();
        if (this.field145 != var5 || this.field144 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method156(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field145 == var2.field145 && this.field144 == var2.field144;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field145 | this.field144 << 8;
    }
}
