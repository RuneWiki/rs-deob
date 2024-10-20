package deob;

@ObfuscatedName("l")
public class class11 extends class17 {

    @ObfuscatedName("l.w(Lgy;Lgy;I)V")
    public void method105(class183 arg0, class183 arg1) {
        int var3 = arg1.method3436();
        if (class26.field228.field229 != var3) {
            throw new IllegalStateException("");
        }
        this.field134 = arg1.method3436();
        this.field135 = arg1.method3436();
        this.field132 = arg1.method3268();
        this.field136 = arg1.method3268();
        this.field142 = arg1.method3268();
        this.field133 = arg1.method3268();
        this.field135 = Math.min(this.field135, 4);
        this.field130 = new short[1][64][64];
        this.field131 = new short[this.field135][64][64];
        this.field138 = new byte[this.field135][64][64];
        this.field139 = new byte[this.field135][64][64];
        this.field140 = new class20[this.field135][64][64][];
        int var4 = arg0.method3436();
        if (class25.field223.field220 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3436();
        int var6 = arg0.method3436();
        if (this.field142 != var5 || this.field133 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method166(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class11)) {
            class11 var2 = (class11) arg0;
            return this.field142 == var2.field142 && this.field133 == var2.field133;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field142 | this.field133 << 8;
    }
}
