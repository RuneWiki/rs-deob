package deob;

@ObfuscatedName("s")
public class class11 {

    @ObfuscatedName("s.n")
    public final int field61;

    @ObfuscatedName("s.v")
    public final int field62;

    @ObfuscatedName("s.d")
    public final String field63;

    public class11(int arg0, int arg1, String arg2) {
        this.field61 = arg0;
        this.field62 = arg1;
        this.field63 = arg2;
    }

    public class11(class311 arg0) {
        this(arg0.method5310(), arg0.method5310(), arg0.method5465());
    }

    @ObfuscatedName("s.n()Ljava/lang/String;")
    public String method96() {
        return Integer.toHexString(this.field61) + Integer.toHexString(this.field62) + this.field63;
    }

    @ObfuscatedName("s.v()I")
    public int method92() {
        return this.field62;
    }
}
