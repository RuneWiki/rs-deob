import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class140 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lnn;")
    public static class151 field1879 = new class151("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lns;")
    public static class55 field1880 = new class55(4, 3);

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lje;")
    public static class169[] field1883 = new class169[2048];

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field1882 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
    public static boolean field1884;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lwl;")
    public static class452 field1885;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "F")
    public static float field1881;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
    public static int[] field1886;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method882(int arg0) {
        field1883 = null;
        field1882 = null;
        field1886 = null;
        field1885 = null;
        field1879 = null;
        field1880 = null;
        if (arg0 <= 15) {
            field1880 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lmb;")
    public static final class201 method883(byte arg0, int arg1) {
        field1877++;
        class201 var2 = (class201) class440.field6472.method927((long) arg1, 119);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 108) {
            field1886 = null;
        }
        byte[] var3 = class241.field3627.method823(arg1, -20334, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class201 var4 = class184.method1125((byte) -126, var3);
            class440.field6472.method929((long) arg1, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)J")
    public static final long method884(byte arg0) {
        if (arg0 < 111) {
            return 42L;
        } else {
            field1878++;
            return class37.field452.method150((byte) 124);
        }
    }

    static {
        new class151((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field1884 = true;
        field1885 = new class452(71, 8);
    }
}
