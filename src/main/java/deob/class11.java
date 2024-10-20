package deob;

@ObfuscatedName("v")
public class class11 extends class17 {

    @ObfuscatedName("v.y(Lge;Lge;B)V")
    public void method98(class185 arg0, class185 arg1) {
        int var3 = arg1.method3299();
        if (class26.field244.field245 != var3) {
            throw new IllegalStateException("");
        }
        this.field133 = arg1.method3299();
        this.field134 = arg1.method3299();
        this.field143 = arg1.method3280();
        this.field130 = arg1.method3280();
        this.field131 = arg1.method3280();
        this.field138 = arg1.method3280();
        this.field134 = Math.min(this.field134, 4);
        this.field135 = new short[1][64][64];
        this.field141 = new short[this.field134][64][64];
        this.field137 = new byte[this.field134][64][64];
        this.field129 = new byte[this.field134][64][64];
        this.field142 = new class20[this.field134][64][64][];
        int var4 = arg0.method3299();
        if (class25.field232.field235 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3299();
        int var6 = arg0.method3299();
        if (this.field131 != var5 || this.field138 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method154(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field131 == var2.field131 && this.field138 == var2.field138;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field131 | this.field138 << 8;
    }
}
