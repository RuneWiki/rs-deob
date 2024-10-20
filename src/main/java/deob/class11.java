package deob;

@ObfuscatedName("w")
public class class11 {

    @ObfuscatedName("w.m")
    public final int field49;

    @ObfuscatedName("w.o")
    public final int field48;

    @ObfuscatedName("w.q")
    public final String field47;

    public class11(int arg0, int arg1, String arg2) {
        this.field49 = arg0;
        this.field48 = arg1;
        this.field47 = arg2;
    }

    public class11(class310 arg0) {
        this(arg0.method5227(), arg0.method5227(), arg0.method5236());
    }

    @ObfuscatedName("w.m()Ljava/lang/String;")
    public String method101() {
        return Integer.toHexString(this.field49) + Integer.toHexString(this.field48) + this.field47;
    }

    @ObfuscatedName("w.o()I")
    public int method98() {
        return this.field48;
    }
}
