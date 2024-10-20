package deob;

@ObfuscatedName("ai")
public class class10 implements class401 {

    @ObfuscatedName("ai.aq")
    public static final class10 field42 = new class10(0, "POST", true, true);

    @ObfuscatedName("ai.ad")
    public static final class10 field50 = new class10(1, "GET", true, false);

    @ObfuscatedName("ai.ag")
    public static final class10 field36 = new class10(2, "PUT", false, true);

    @ObfuscatedName("ai.ak")
    public static final class10 field37 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("ai.ap")
    public static final class10 field38 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("ai.an")
    public int field34;

    @ObfuscatedName("ai.aj")
    public String field40;

    @ObfuscatedName("ai.av")
    public boolean field35;

    @ObfuscatedName("ai.ab")
    public boolean field43;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field34 = arg0;
        this.field40 = arg1;
        this.field35 = arg2;
        this.field43 = arg3;
    }

    @ObfuscatedName("ai.ag(I)Z")
    public boolean method64() {
        return this.field35;
    }

    @ObfuscatedName("ai.ak(B)Ljava/lang/String;")
    public String method67() {
        return this.field40;
    }

    @ObfuscatedName("ai.ap(I)Z")
    public boolean method66() {
        return this.field43;
    }

    @ObfuscatedName("ai.aq(I)I")
    public int method32() {
        return this.field34;
    }
}
