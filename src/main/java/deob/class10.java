package deob;

@ObfuscatedName("i")
public class class10 implements class303 {

    @ObfuscatedName("i.l")
    public static final class10 field47 = new class10(0, "POST", true, true);

    @ObfuscatedName("i.q")
    public static final class10 field44 = new class10(1, "GET", true, false);

    @ObfuscatedName("i.f")
    public static final class10 field43 = new class10(2, "PUT", false, true);

    @ObfuscatedName("i.j")
    public static final class10 field39 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("i.m")
    public static final class10 field40 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("i.k")
    public int field41;

    @ObfuscatedName("i.t")
    public String field42;

    @ObfuscatedName("i.a")
    public boolean field36;

    @ObfuscatedName("i.e")
    public boolean field37;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field41 = arg0;
        this.field42 = arg1;
        this.field36 = arg2;
        this.field37 = arg3;
    }

    @ObfuscatedName("i.m(I)Z")
    public boolean method71() {
        return this.field36;
    }

    @ObfuscatedName("i.k(I)Ljava/lang/String;")
    public String method79() {
        return this.field42;
    }

    @ObfuscatedName("i.t(B)Z")
    public boolean method73() {
        return this.field37;
    }

    @ObfuscatedName("i.l(I)I")
    public int method36() {
        return this.field41;
    }
}
