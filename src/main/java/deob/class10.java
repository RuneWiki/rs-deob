package deob;

@ObfuscatedName("r")
public class class10 implements class343 {

    @ObfuscatedName("r.a")
    public static final class10 field43 = new class10(0, "POST", true, true);

    @ObfuscatedName("r.f")
    public static final class10 field40 = new class10(1, "GET", true, false);

    @ObfuscatedName("r.c")
    public static final class10 field44 = new class10(2, "PUT", false, true);

    @ObfuscatedName("r.x")
    public static final class10 field42 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("r.h")
    public static final class10 field47 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("r.j")
    public int field49;

    @ObfuscatedName("r.y")
    public String field45;

    @ObfuscatedName("r.d")
    public boolean field46;

    @ObfuscatedName("r.n")
    public boolean field39;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field49 = arg0;
        this.field45 = arg1;
        this.field46 = arg2;
        this.field39 = arg3;
    }

    @ObfuscatedName("r.c(I)Z")
    public boolean method68() {
        return this.field46;
    }

    @ObfuscatedName("r.x(I)Ljava/lang/String;")
    public String method65() {
        return this.field45;
    }

    @ObfuscatedName("r.h(I)Z")
    public boolean method59() {
        return this.field39;
    }

    @ObfuscatedName("r.a(B)I")
    public int method24() {
        return this.field49;
    }
}
