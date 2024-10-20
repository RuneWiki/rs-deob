package deob;

@ObfuscatedName("bm")
public class class124 {

    @ObfuscatedName("bm.f")
    public int field1987;

    @ObfuscatedName("bm.g")
    public int field1986;

    @ObfuscatedName("bm.d")
    public int field1991;

    @ObfuscatedName("bm.b")
    public int field1995 = 2;

    @ObfuscatedName("bm.l")
    public int field1992;

    @ObfuscatedName("bm.j")
    public int field1996;

    @ObfuscatedName("bm.k")
    public int[] field1988 = new int[2];

    @ObfuscatedName("bm.h")
    public int[] field1989 = new int[2];

    @ObfuscatedName("bm.w")
    public int field1993;

    @ObfuscatedName("bm.t")
    public int field1990;

    @ObfuscatedName("bm.s")
    public int field1994;

    @ObfuscatedName("bm.b(Ldp;)V")
    public final void method2195(class50 arg0) {
        this.field1991 = arg0.method726();
        this.field1993 = arg0.method685();
        this.field1990 = arg0.method685();
        this.method2199(arg0);
    }

    @ObfuscatedName("bm.k()V")
    public final void method2197() {
        this.field1992 = 0;
        this.field1987 = 0;
        this.field1994 = 0;
        this.field1996 = 0;
        this.field1986 = 0;
    }

    @ObfuscatedName("bm.w(I)I")
    public final int method2198(int arg0) {
        if (this.field1986 >= this.field1992) {
            this.field1996 = this.field1988[this.field1987++] << 15;
            if (this.field1987 >= this.field1995) {
                this.field1987 = this.field1995 - 1;
            }
            this.field1992 = (int) ((double) this.field1989[this.field1987] / 65536.0D * (double) arg0);
            if (this.field1992 > this.field1986) {
                this.field1994 = ((this.field1988[this.field1987] << 15) - this.field1996) / (this.field1992 - this.field1986);
            }
        }
        this.field1996 += this.field1994;
        this.field1986++;
        return this.field1996 - this.field1994 >> 15;
    }

    @ObfuscatedName("bm.h(Ldp;)V")
    public final void method2199(class50 arg0) {
        this.field1995 = arg0.method726();
        this.field1989 = new int[this.field1995];
        this.field1988 = new int[this.field1995];
        for (int var2 = 0; var2 < this.field1995; var2++) {
            this.field1989[var2] = arg0.method720();
            this.field1988[var2] = arg0.method720();
        }
    }

    public class124() {
        this.field1989[0] = 0;
        this.field1989[1] = 65535;
        this.field1988[0] = 0;
        this.field1988[1] = 65535;
    }
}
