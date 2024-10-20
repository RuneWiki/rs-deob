package deob;

@ObfuscatedName("af")
public class class10 implements class372 {

    @ObfuscatedName("af.au")
    public static final class10 field33 = new class10(0, "POST", true, true);

    @ObfuscatedName("af.ae")
    public static final class10 field32 = new class10(1, "GET", true, false);

    @ObfuscatedName("af.ao")
    public static final class10 field36 = new class10(2, "PUT", false, true);

    @ObfuscatedName("af.at")
    public static final class10 field34 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("af.ac")
    public static final class10 field35 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("af.ai")
    public int field31;

    @ObfuscatedName("af.az")
    public String field37;

    @ObfuscatedName("af.ap")
    public boolean field46;

    @ObfuscatedName("af.aa")
    public boolean field39;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field31 = arg0;
        this.field37 = arg1;
        this.field46 = arg2;
        this.field39 = arg3;
    }

    @ObfuscatedName("af.au(I)Z")
    public boolean method60() {
        return this.field46;
    }

    @ObfuscatedName("af.ao(I)Ljava/lang/String;")
    public String method58() {
        return this.field37;
    }

    @ObfuscatedName("af.at(I)Z")
    public boolean method59() {
        return this.field39;
    }

    @ObfuscatedName("af.ae(B)I")
    public int method30() {
        return this.field31;
    }
}
