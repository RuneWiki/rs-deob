package deob;

@ObfuscatedName("k")
public class class10 implements class350 {

    @ObfuscatedName("k.f")
    public static final class10 field32 = new class10(0, "POST", true, true);

    @ObfuscatedName("k.w")
    public static final class10 field33 = new class10(1, "GET", true, false);

    @ObfuscatedName("k.v")
    public static final class10 field34 = new class10(2, "PUT", false, true);

    @ObfuscatedName("k.s")
    public static final class10 field43 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("k.z")
    public static final class10 field36 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("k.j")
    public int field37;

    @ObfuscatedName("k.i")
    public String field38;

    @ObfuscatedName("k.n")
    public boolean field39;

    @ObfuscatedName("k.l")
    public boolean field40;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field37 = arg0;
        this.field38 = arg1;
        this.field39 = arg2;
        this.field40 = arg3;
    }

    @ObfuscatedName("k.v(B)Z")
    public boolean method85() {
        return this.field39;
    }

    @ObfuscatedName("k.s(B)Ljava/lang/String;")
    public String method75() {
        return this.field38;
    }

    @ObfuscatedName("k.z(B)Z")
    public boolean method78() {
        return this.field40;
    }

    @ObfuscatedName("k.f(B)I")
    public int method46() {
        return this.field37;
    }
}
