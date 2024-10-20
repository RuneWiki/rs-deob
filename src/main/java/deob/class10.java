package deob;

@ObfuscatedName("a")
public class class10 implements class320 {

    @ObfuscatedName("a.c")
    public static final class10 field51 = new class10(0, "POST", true, true);

    @ObfuscatedName("a.l")
    public static final class10 field50 = new class10(1, "GET", true, false);

    @ObfuscatedName("a.s")
    public static final class10 field56 = new class10(2, "PUT", false, true);

    @ObfuscatedName("a.e")
    public static final class10 field55 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("a.r")
    public static final class10 field52 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("a.o")
    public int field53;

    @ObfuscatedName("a.i")
    public String field54;

    @ObfuscatedName("a.w")
    public boolean field48;

    @ObfuscatedName("a.v")
    public boolean field49;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field53 = arg0;
        this.field54 = arg1;
        this.field48 = arg2;
        this.field49 = arg3;
    }

    @ObfuscatedName("a.e(I)Z")
    public boolean method67() {
        return this.field48;
    }

    @ObfuscatedName("a.r(I)Ljava/lang/String;")
    public String method71() {
        return this.field54;
    }

    @ObfuscatedName("a.o(I)Z")
    public boolean method69() {
        return this.field49;
    }

    @ObfuscatedName("a.c(I)I")
    public int method38() {
        return this.field53;
    }
}
