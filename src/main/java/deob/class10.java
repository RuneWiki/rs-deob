package deob;

@ObfuscatedName("x")
public class class10 implements class330 {

    @ObfuscatedName("x.c")
    public static final class10 field35 = new class10(0, "POST", true, true);

    @ObfuscatedName("x.p")
    public static final class10 field33 = new class10(1, "GET", true, false);

    @ObfuscatedName("x.f")
    public static final class10 field34 = new class10(2, "PUT", false, true);

    @ObfuscatedName("x.n")
    public static final class10 field38 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("x.k")
    public static final class10 field36 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("x.w")
    public int field39;

    @ObfuscatedName("x.s")
    public String field41;

    @ObfuscatedName("x.q")
    public boolean field37;

    @ObfuscatedName("x.m")
    public boolean field40;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field39 = arg0;
        this.field41 = arg1;
        this.field37 = arg2;
        this.field40 = arg3;
    }

    @ObfuscatedName("x.c(I)Z")
    public boolean method81() {
        return this.field37;
    }

    @ObfuscatedName("x.f(I)Ljava/lang/String;")
    public String method72() {
        return this.field41;
    }

    @ObfuscatedName("x.n(I)Z")
    public boolean method73() {
        return this.field40;
    }

    @ObfuscatedName("x.p(B)I")
    public int method42() {
        return this.field39;
    }
}
