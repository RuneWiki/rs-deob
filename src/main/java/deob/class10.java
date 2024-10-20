package deob;

@ObfuscatedName("ad")
public class class10 implements class402 {

    @ObfuscatedName("ad.ab")
    public static final class10 field32 = new class10(0, "POST", true, true);

    @ObfuscatedName("ad.ay")
    public static final class10 field27 = new class10(1, "GET", true, false);

    @ObfuscatedName("ad.an")
    public static final class10 field36 = new class10(2, "PUT", false, true);

    @ObfuscatedName("ad.au")
    public static final class10 field29 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("ad.ax")
    public static final class10 field30 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("ad.ao")
    public int field31;

    @ObfuscatedName("ad.am")
    public String field28;

    @ObfuscatedName("ad.ac")
    public boolean field33;

    @ObfuscatedName("ad.ae")
    public boolean field39;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field31 = arg0;
        this.field28 = arg1;
        this.field33 = arg2;
        this.field39 = arg3;
    }

    @ObfuscatedName("ad.au(S)Z")
    public boolean method62() {
        return this.field33;
    }

    @ObfuscatedName("ad.ax(S)Ljava/lang/String;")
    public String method63() {
        return this.field28;
    }

    @ObfuscatedName("ad.ao(I)Z")
    public boolean method68() {
        return this.field39;
    }

    @ObfuscatedName("ad.ab(B)I")
    public int method33() {
        return this.field31;
    }
}
