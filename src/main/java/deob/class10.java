package deob;

@ObfuscatedName("b")
public class class10 implements class346 {

    @ObfuscatedName("b.h")
    public static final class10 field44 = new class10(0, "POST", true, true);

    @ObfuscatedName("b.e")
    public static final class10 field34 = new class10(1, "GET", true, false);

    @ObfuscatedName("b.v")
    public static final class10 field43 = new class10(2, "PUT", false, true);

    @ObfuscatedName("b.x")
    public static final class10 field36 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("b.m")
    public static final class10 field37 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("b.q")
    public int field46;

    @ObfuscatedName("b.f")
    public String field38;

    @ObfuscatedName("b.r")
    public boolean field35;

    @ObfuscatedName("b.u")
    public boolean field41;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field46 = arg0;
        this.field38 = arg1;
        this.field35 = arg2;
        this.field41 = arg3;
    }

    @ObfuscatedName("b.h(I)Z")
    public boolean method63() {
        return this.field35;
    }

    @ObfuscatedName("b.v(I)Ljava/lang/String;")
    public String method64() {
        return this.field38;
    }

    @ObfuscatedName("b.x(B)Z")
    public boolean method65() {
        return this.field41;
    }

    @ObfuscatedName("b.e(B)I")
    public int method32() {
        return this.field46;
    }
}
