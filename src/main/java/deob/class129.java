package deob;

@ObfuscatedName("bb")
public class class129 {

    @ObfuscatedName("bb.f")
    public int field1965;

    @ObfuscatedName("bb.g")
    public int field1963;

    @ObfuscatedName("bb.e")
    public int field1964;

    @ObfuscatedName("bb.n")
    public int field1962;

    @ObfuscatedName("bb.o")
    public int[] field1956 = new int[2];

    @ObfuscatedName("bb.j")
    public int field1959 = 2;

    @ObfuscatedName("bb.h")
    public int field1960;

    @ObfuscatedName("bb.t")
    public int field1958;

    @ObfuscatedName("bb.r")
    public int field1961;

    @ObfuscatedName("bb.p")
    public int[] field1966 = new int[2];

    @ObfuscatedName("bb.z")
    public int field1957;

    @ObfuscatedName("bb.p(Ldy;)V")
    public final void method2181(class31 arg0) {
        this.field1959 = arg0.method512();
        this.field1966 = new int[this.field1959];
        this.field1956 = new int[this.field1959];
        for (int var2 = 0; var2 < this.field1959; var2++) {
            this.field1966[var2] = arg0.method373();
            this.field1956[var2] = arg0.method373();
        }
    }

    @ObfuscatedName("bb.o()V")
    public final void method2182() {
        this.field1962 = 0;
        this.field1963 = 0;
        this.field1964 = 0;
        this.field1965 = 0;
        this.field1957 = 0;
    }

    @ObfuscatedName("bb.j(Ldy;)V")
    public final void method2183(class31 arg0) {
        this.field1961 = arg0.method512();
        this.field1958 = arg0.method376();
        this.field1960 = arg0.method376();
        this.method2181(arg0);
    }

    @ObfuscatedName("bb.t(I)I")
    public final int method2191(int arg0) {
        if (this.field1957 >= this.field1962) {
            this.field1965 = this.field1956[this.field1963++] << 15;
            if (this.field1963 >= this.field1959) {
                this.field1963 = this.field1959 - 1;
            }
            this.field1962 = (int) ((double) this.field1966[this.field1963] / 65536.0D * (double) arg0);
            if (this.field1962 > this.field1957) {
                this.field1964 = ((this.field1956[this.field1963] << 15) - this.field1965) / (this.field1962 - this.field1957);
            }
        }
        this.field1965 += this.field1964;
        this.field1957++;
        return this.field1965 - this.field1964 >> 15;
    }

    public class129() {
        this.field1966[0] = 0;
        this.field1966[1] = 65535;
        this.field1956[0] = 0;
        this.field1956[1] = 65535;
    }
}
