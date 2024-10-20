package deob;

@ObfuscatedName("p")
public class class11 extends class17 {

    @ObfuscatedName("p.z(Lgk;Lgk;I)V")
    public void method96(class183 arg0, class183 arg1) {
        int var3 = arg1.method3247();
        if (class26.field213.field212 != var3) {
            throw new IllegalStateException("");
        }
        this.field121 = arg1.method3247();
        this.field122 = arg1.method3247();
        this.field128 = arg1.method3253();
        this.field118 = arg1.method3253();
        this.field119 = arg1.method3253();
        this.field120 = arg1.method3253();
        this.field122 = Math.min(this.field122, 4);
        this.field126 = new short[1][64][64];
        this.field124 = new short[this.field122][64][64];
        this.field125 = new byte[this.field122][64][64];
        this.field117 = new byte[this.field122][64][64];
        this.field127 = new class20[this.field122][64][64][];
        int var4 = arg0.method3247();
        if (class25.field209.field206 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3247();
        int var6 = arg0.method3247();
        if (this.field119 != var5 || this.field120 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method151(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field119 == var2.field119 && this.field120 == var2.field120;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field119 | this.field120 << 8;
    }
}
