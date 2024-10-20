package deob;

@ObfuscatedName("ap")
public class class10 implements class373 {

    @ObfuscatedName("ap.aw")
    public static final class10 field44 = new class10(0, "POST", true, true);

    @ObfuscatedName("ap.ay")
    public static final class10 field38 = new class10(1, "GET", true, false);

    @ObfuscatedName("ap.ar")
    public static final class10 field41 = new class10(2, "PUT", false, true);

    @ObfuscatedName("ap.am")
    public static final class10 field40 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("ap.as")
    public static final class10 field37 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("ap.aj")
    public int field42;

    @ObfuscatedName("ap.ag")
    public String field43;

    @ObfuscatedName("ap.az")
    public boolean field45;

    @ObfuscatedName("ap.av")
    public boolean field39;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field42 = arg0;
        this.field43 = arg1;
        this.field45 = arg2;
        this.field39 = arg3;
    }

    @ObfuscatedName("ap.aw(B)Z")
    public boolean method66() {
        return this.field45;
    }

    @ObfuscatedName("ap.ar(B)Ljava/lang/String;")
    public String method69() {
        return this.field43;
    }

    @ObfuscatedName("ap.am(I)Z")
    public boolean method68() {
        return this.field39;
    }

    @ObfuscatedName("ap.ay(I)I")
    public int method36() {
        return this.field42;
    }
}
