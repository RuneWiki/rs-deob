package deob;

@ObfuscatedName("at")
public class class10 implements class405 {

    @ObfuscatedName("at.ap")
    public static final class10 field28 = new class10(0, "POST", true, true);

    @ObfuscatedName("at.aw")
    public static final class10 field31 = new class10(1, "GET", true, false);

    @ObfuscatedName("at.ak")
    public static final class10 field30 = new class10(2, "PUT", false, true);

    @ObfuscatedName("at.aj")
    public static final class10 field29 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("at.ai")
    public static final class10 field27 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("at.ay")
    public int field36;

    @ObfuscatedName("at.as")
    public String field32;

    @ObfuscatedName("at.ae")
    public boolean field33;

    @ObfuscatedName("at.am")
    public boolean field34;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field36 = arg0;
        this.field32 = arg1;
        this.field33 = arg2;
        this.field34 = arg3;
    }

    @ObfuscatedName("at.ap(I)Z")
    public boolean method69() {
        return this.field33;
    }

    @ObfuscatedName("at.ak(S)Ljava/lang/String;")
    public String method68() {
        return this.field32;
    }

    @ObfuscatedName("at.aj(I)Z")
    public boolean method74() {
        return this.field34;
    }

    @ObfuscatedName("at.aw(I)I")
    public int method37() {
        return this.field36;
    }
}
