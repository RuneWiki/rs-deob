package deob;

@ObfuscatedName("p")
public class class11 extends class17 {

    @ObfuscatedName("p.g(Lgl;Lgl;I)V")
    public void method107(class185 arg0, class185 arg1) {
        int var3 = arg1.method3679();
        if (class26.field259.field255 != var3) {
            throw new IllegalStateException("");
        }
        this.field151 = arg1.method3679();
        this.field149 = arg1.method3679();
        this.field147 = arg1.method3467();
        this.field152 = arg1.method3467();
        this.field148 = arg1.method3467();
        this.field150 = arg1.method3467();
        this.field149 = Math.min(this.field149, 4);
        this.field153 = new short[1][64][64];
        this.field154 = new short[this.field149][64][64];
        this.field155 = new byte[this.field149][64][64];
        this.field156 = new byte[this.field149][64][64];
        this.field157 = new class20[this.field149][64][64][];
        int var4 = arg0.method3679();
        if (class25.field252.field248 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3679();
        int var6 = arg0.method3679();
        if (this.field148 != var5 || this.field150 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method182(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field148 == var2.field148 && this.field150 == var2.field150;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field148 | this.field150 << 8;
    }
}
