package deob;

@ObfuscatedName("ao")
public class class10 implements class400 {

    @ObfuscatedName("ao.ak")
    public static final class10 field36 = new class10(0, "POST", true, true);

    @ObfuscatedName("ao.al")
    public static final class10 field30 = new class10(1, "GET", true, false);

    @ObfuscatedName("ao.aj")
    public static final class10 field31 = new class10(2, "PUT", false, true);

    @ObfuscatedName("ao.az")
    public static final class10 field38 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("ao.af")
    public static final class10 field41 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("ao.aa")
    public int field34;

    @ObfuscatedName("ao.at")
    public String field35;

    @ObfuscatedName("ao.ab")
    public boolean field37;

    @ObfuscatedName("ao.ac")
    public boolean field39;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field34 = arg0;
        this.field35 = arg1;
        this.field37 = arg2;
        this.field39 = arg3;
    }

    @ObfuscatedName("ao.az(I)Z")
    public boolean method67() {
        return this.field37;
    }

    @ObfuscatedName("ao.af(B)Ljava/lang/String;")
    public String method66() {
        return this.field35;
    }

    @ObfuscatedName("ao.aa(I)Z")
    public boolean method73() {
        return this.field39;
    }

    @ObfuscatedName("ao.ak(I)I")
    public int method34() {
        return this.field34;
    }
}
