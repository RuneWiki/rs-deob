package deob;

@ObfuscatedName("s")
public class class11 {

    @ObfuscatedName("s.x")
    public final int field54;

    @ObfuscatedName("s.m")
    public final int field55;

    @ObfuscatedName("s.k")
    public final String field56;

    public class11(int arg0, int arg1, String arg2) {
        this.field54 = arg0;
        this.field55 = arg1;
        this.field56 = arg2;
    }

    public class11(class310 arg0) {
        this(arg0.method5137(), arg0.method5137(), arg0.method5257());
    }

    @ObfuscatedName("s.x()Ljava/lang/String;")
    public String method98() {
        return Integer.toHexString(this.field54) + Integer.toHexString(this.field55) + this.field56;
    }

    @ObfuscatedName("s.m()I")
    public int method100() {
        return this.field55;
    }
}
