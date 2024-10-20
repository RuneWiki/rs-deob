package deob;

@ObfuscatedName("s")
public class class11 extends class17 {

    @ObfuscatedName("s.c(Lgg;Lgg;B)V")
    public void method114(class185 arg0, class185 arg1) {
        int var3 = arg1.method3243();
        if (class26.field239.field236 != var3) {
            throw new IllegalStateException("");
        }
        this.field150 = arg1.method3243();
        this.field147 = arg1.method3243();
        this.field144 = arg1.method3245();
        this.field143 = arg1.method3245();
        this.field152 = arg1.method3245();
        this.field145 = arg1.method3245();
        this.field147 = Math.min(this.field147, 4);
        this.field142 = new short[1][64][64];
        this.field149 = new short[this.field147][64][64];
        this.field148 = new byte[this.field147][64][64];
        this.field151 = new byte[this.field147][64][64];
        this.field146 = new class20[this.field147][64][64][];
        int var4 = arg0.method3243();
        if (class25.field234.field232 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3243();
        int var6 = arg0.method3243();
        if (this.field152 != var5 || this.field145 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method167(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field152 == var2.field152 && this.field145 == var2.field145;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field152 | this.field145 << 8;
    }
}
