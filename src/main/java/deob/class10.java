package deob;

@ObfuscatedName("i")
public class class10 implements class328 {

    @ObfuscatedName("i.c")
    public static final class10 field37 = new class10(0, "POST", true, true);

    @ObfuscatedName("i.v")
    public static final class10 field31 = new class10(1, "GET", true, false);

    @ObfuscatedName("i.q")
    public static final class10 field32 = new class10(2, "PUT", false, true);

    @ObfuscatedName("i.f")
    public static final class10 field40 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("i.j")
    public static final class10 field34 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("i.e")
    public int field30;

    @ObfuscatedName("i.g")
    public String field36;

    @ObfuscatedName("i.w")
    public boolean field41;

    @ObfuscatedName("i.y")
    public boolean field38;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field30 = arg0;
        this.field36 = arg1;
        this.field41 = arg2;
        this.field38 = arg3;
    }

    @ObfuscatedName("i.f(I)Z")
    public boolean method59() {
        return this.field41;
    }

    @ObfuscatedName("i.j(S)Ljava/lang/String;")
    public String method61() {
        return this.field36;
    }

    @ObfuscatedName("i.e(I)Z")
    public boolean method60() {
        return this.field38;
    }

    @ObfuscatedName("i.c(B)I")
    public int method33() {
        return this.field30;
    }
}
