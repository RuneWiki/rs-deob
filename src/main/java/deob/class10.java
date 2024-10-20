package deob;

@ObfuscatedName("e")
public class class10 implements class303 {

    @ObfuscatedName("e.n")
    public static final class10 field32 = new class10(0, "POST", true, true);

    @ObfuscatedName("e.c")
    public static final class10 field35 = new class10(1, "GET", true, false);

    @ObfuscatedName("e.m")
    public static final class10 field34 = new class10(2, "PUT", false, true);

    @ObfuscatedName("e.k")
    public static final class10 field36 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("e.o")
    public static final class10 field33 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("e.g")
    public int field37;

    @ObfuscatedName("e.z")
    public String field38;

    @ObfuscatedName("e.a")
    public boolean field39;

    @ObfuscatedName("e.u")
    public boolean field40;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field37 = arg0;
        this.field38 = arg1;
        this.field39 = arg2;
        this.field40 = arg3;
    }

    @ObfuscatedName("e.n(I)Z")
    public boolean method70() {
        return this.field39;
    }

    @ObfuscatedName("e.m(B)Ljava/lang/String;")
    public String method71() {
        return this.field38;
    }

    @ObfuscatedName("e.k(I)Z")
    public boolean method72() {
        return this.field40;
    }

    @ObfuscatedName("e.c(I)I")
    public int method42() {
        return this.field37;
    }
}
