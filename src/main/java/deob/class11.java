package deob;

@ObfuscatedName("n")
public class class11 {

    @ObfuscatedName("n.z")
    public final int field56;

    @ObfuscatedName("n.k")
    public final int field57;

    @ObfuscatedName("n.s")
    public final String field55;

    public class11(int arg0, int arg1, String arg2) {
        this.field56 = arg0;
        this.field57 = arg1;
        this.field55 = arg2;
    }

    public class11(class310 arg0) {
        this(arg0.method5193(), arg0.method5193(), arg0.method5202());
    }

    @ObfuscatedName("n.z()Ljava/lang/String;")
    public String method94() {
        return Integer.toHexString(this.field56) + Integer.toHexString(this.field57) + this.field55;
    }

    @ObfuscatedName("n.k()I")
    public int method93() {
        return this.field57;
    }
}
