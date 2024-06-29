import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class55 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Ljd;")
    public static class85 field964 = class221.method1499("loginscreen", (byte) -128);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lek;")
    public static class159 field969;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method368(int arg0) {
        field969 = null;
        field964 = null;
        if (arg0 != 0) {
            method370(false, -99);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method369(byte arg0) {
        class189.field3247.method1270((byte) 107);
        class199.field3454.method1270((byte) 107);
        if (arg0 == 108) {
            field972++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)Lah;")
    public static final class263 method370(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field970++;
        class263 var2 = (class263) class15.field217.method1269((long) arg1, (byte) 68);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class226.field3931.method464(-1, class272.method1856(arg1, -125), class231.method1546(-8959, arg1));
        class263 var4 = new class263();
        var4.field4669 = arg1;
        if (var3 != null) {
            var4.method1800((byte) 75, new class247(var3));
        }
        var4.method1796(71);
        class15.field217.method1271(-15561, var4, (long) arg1);
        return var4;
    }
}
