package deob;

@ObfuscatedName("e")
public class class11 {

    @ObfuscatedName("e.f")
    public final int field49;

    @ObfuscatedName("e.b")
    public final int field50;

    @ObfuscatedName("e.l")
    public final String field51;

    public class11(int arg0, int arg1, String arg2) {
        this.field49 = arg0;
        this.field50 = arg1;
        this.field51 = arg2;
    }

    public class11(class311 arg0) {
        this(arg0.method5276(), arg0.method5276(), arg0.method5189());
    }

    @ObfuscatedName("e.f()Ljava/lang/String;")
    public String method106() {
        return Integer.toHexString(this.field49) + Integer.toHexString(this.field50) + this.field51;
    }

    @ObfuscatedName("e.b()I")
    public int method107() {
        return this.field50;
    }
}
