package deob;

@ObfuscatedName("n")
public class class10 implements class329 {

    @ObfuscatedName("n.s")
    public static final class10 field47 = new class10(0, "POST", true, true);

    @ObfuscatedName("n.h")
    public static final class10 field37 = new class10(1, "GET", true, false);

    @ObfuscatedName("n.w")
    public static final class10 field44 = new class10(2, "PUT", false, true);

    @ObfuscatedName("n.v")
    public static final class10 field39 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("n.c")
    public static final class10 field40 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("n.q")
    public int field41;

    @ObfuscatedName("n.i")
    public String field42;

    @ObfuscatedName("n.k")
    public boolean field43;

    @ObfuscatedName("n.o")
    public boolean field36;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field41 = arg0;
        this.field42 = arg1;
        this.field43 = arg2;
        this.field36 = arg3;
    }

    @ObfuscatedName("n.s(I)Z")
    public boolean method61() {
        return this.field43;
    }

    @ObfuscatedName("n.w(S)Ljava/lang/String;")
    public String method71() {
        return this.field42;
    }

    @ObfuscatedName("n.v(I)Z")
    public boolean method63() {
        return this.field36;
    }

    @ObfuscatedName("n.h(B)I")
    public int method39() {
        return this.field41;
    }
}
