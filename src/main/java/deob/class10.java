package deob;

@ObfuscatedName("v")
public class class10 implements class329 {

    @ObfuscatedName("v.o")
    public static final class10 field33 = new class10(0, "POST", true, true);

    @ObfuscatedName("v.q")
    public static final class10 field41 = new class10(1, "GET", true, false);

    @ObfuscatedName("v.l")
    public static final class10 field37 = new class10(2, "PUT", false, true);

    @ObfuscatedName("v.k")
    public static final class10 field35 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("v.a")
    public static final class10 field38 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("v.m")
    public int field34;

    @ObfuscatedName("v.p")
    public String field39;

    @ObfuscatedName("v.s")
    public boolean field40;

    @ObfuscatedName("v.r")
    public boolean field36;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field34 = arg0;
        this.field39 = arg1;
        this.field40 = arg2;
        this.field36 = arg3;
    }

    @ObfuscatedName("v.k(I)Z")
    public boolean method69() {
        return this.field40;
    }

    @ObfuscatedName("v.a(B)Ljava/lang/String;")
    public String method63() {
        return this.field39;
    }

    @ObfuscatedName("v.m(I)Z")
    public boolean method64() {
        return this.field36;
    }

    @ObfuscatedName("v.o(B)I")
    public int method40() {
        return this.field34;
    }
}
