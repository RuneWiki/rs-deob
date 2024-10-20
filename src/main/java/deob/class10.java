package deob;

@ObfuscatedName("r")
public class class10 implements class315 {

    @ObfuscatedName("r.c")
    public static final class10 field38 = new class10(0, "POST", true, true);

    @ObfuscatedName("r.b")
    public static final class10 field37 = new class10(1, "GET", true, false);

    @ObfuscatedName("r.p")
    public static final class10 field45 = new class10(2, "PUT", false, true);

    @ObfuscatedName("r.m")
    public static final class10 field39 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("r.t")
    public static final class10 field40 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("r.s")
    public int field46;

    @ObfuscatedName("r.j")
    public String field36;

    @ObfuscatedName("r.w")
    public boolean field43;

    @ObfuscatedName("r.n")
    public boolean field44;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field46 = arg0;
        this.field36 = arg1;
        this.field43 = arg2;
        this.field44 = arg3;
    }

    @ObfuscatedName("r.c(B)Z")
    public boolean method81() {
        return this.field43;
    }

    @ObfuscatedName("r.p(I)Ljava/lang/String;")
    public String method92() {
        return this.field36;
    }

    @ObfuscatedName("r.w(I)Z")
    public boolean method82() {
        return this.field44;
    }

    @ObfuscatedName("r.b(B)I")
    public int method46() {
        return this.field46;
    }
}
