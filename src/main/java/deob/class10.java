package deob;

@ObfuscatedName("o")
public class class10 implements class329 {

    @ObfuscatedName("o.v")
    public static final class10 field29 = new class10(0, "POST", true, true);

    @ObfuscatedName("o.c")
    public static final class10 field38 = new class10(1, "GET", true, false);

    @ObfuscatedName("o.i")
    public static final class10 field39 = new class10(2, "PUT", false, true);

    @ObfuscatedName("o.f")
    public static final class10 field30 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("o.b")
    public static final class10 field31 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("o.n")
    public int field32;

    @ObfuscatedName("o.s")
    public String field33;

    @ObfuscatedName("o.l")
    public boolean field28;

    @ObfuscatedName("o.q")
    public boolean field35;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field32 = arg0;
        this.field33 = arg1;
        this.field28 = arg2;
        this.field35 = arg3;
    }

    @ObfuscatedName("o.f(S)Z")
    public boolean method61() {
        return this.field28;
    }

    @ObfuscatedName("o.b(I)Ljava/lang/String;")
    public String method60() {
        return this.field33;
    }

    @ObfuscatedName("o.n(I)Z")
    public boolean method63() {
        return this.field35;
    }

    @ObfuscatedName("o.v(B)I")
    public int method38() {
        return this.field32;
    }
}
