package deob;

@ObfuscatedName("u")
public class class11 {

    @ObfuscatedName("u.h")
    public final int field48;

    @ObfuscatedName("u.v")
    public final int field49;

    @ObfuscatedName("u.x")
    public final String field50;

    public class11(int arg0, int arg1, String arg2) {
        this.field48 = arg0;
        this.field49 = arg1;
        this.field50 = arg2;
    }

    public class11(class311 arg0) {
        this(arg0.method5274(), arg0.method5274(), arg0.method5202());
    }

    @ObfuscatedName("u.h()Ljava/lang/String;")
    public String method104() {
        return Integer.toHexString(this.field48) + Integer.toHexString(this.field49) + this.field50;
    }

    @ObfuscatedName("u.v()I")
    public int method97() {
        return this.field49;
    }
}
