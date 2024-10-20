package deob;

@ObfuscatedName("b")
public class class10 implements class303 {

    @ObfuscatedName("b.i")
    public static final class10 field32 = new class10(0, "POST", true, true);

    @ObfuscatedName("b.w")
    public static final class10 field28 = new class10(1, "GET", true, false);

    @ObfuscatedName("b.s")
    public static final class10 field29 = new class10(2, "PUT", false, true);

    @ObfuscatedName("b.a")
    public static final class10 field30 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("b.o")
    public static final class10 field31 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("b.g")
    public int field34;

    @ObfuscatedName("b.e")
    public String field33;

    @ObfuscatedName("b.p")
    public boolean field38;

    @ObfuscatedName("b.j")
    public boolean field35;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field34 = arg0;
        this.field33 = arg1;
        this.field38 = arg2;
        this.field35 = arg3;
    }

    @ObfuscatedName("b.i(I)Z")
    public boolean method69() {
        return this.field38;
    }

    @ObfuscatedName("b.s(I)Ljava/lang/String;")
    public String method71() {
        return this.field33;
    }

    @ObfuscatedName("b.a(B)Z")
    public boolean method66() {
        return this.field35;
    }

    @ObfuscatedName("b.w(I)I")
    public int method38() {
        return this.field34;
    }
}
