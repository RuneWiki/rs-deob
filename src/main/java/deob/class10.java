package deob;

@ObfuscatedName("av")
public class class10 implements class387 {

    @ObfuscatedName("av.ac")
    public static final class10 field42 = new class10(0, "POST", true, true);

    @ObfuscatedName("av.al")
    public static final class10 field33 = new class10(1, "GET", true, false);

    @ObfuscatedName("av.ak")
    public static final class10 field34 = new class10(2, "PUT", false, true);

    @ObfuscatedName("av.ax")
    public static final class10 field35 = new class10(3, "PATCH", false, true);

    @ObfuscatedName("av.ao")
    public static final class10 field43 = new class10(4, "DELETE", false, true);

    @ObfuscatedName("av.ah")
    public int field37;

    @ObfuscatedName("av.ar")
    public String field44;

    @ObfuscatedName("av.ab")
    public boolean field32;

    @ObfuscatedName("av.am")
    public boolean field40;

    public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
        this.field37 = arg0;
        this.field44 = arg1;
        this.field32 = arg2;
        this.field40 = arg3;
    }

    @ObfuscatedName("av.ar(I)Z")
    public boolean method66() {
        return this.field32;
    }

    @ObfuscatedName("av.ab(I)Ljava/lang/String;")
    public String method67() {
        return this.field44;
    }

    @ObfuscatedName("av.am(I)Z")
    public boolean method65() {
        return this.field40;
    }

    @ObfuscatedName("av.ac(I)I")
    public int method38() {
        return this.field37;
    }
}
