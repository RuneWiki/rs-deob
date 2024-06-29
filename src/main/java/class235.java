import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class235 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Ljd;")
    public static class85 field4063 = class221.method1499("sl_back", (byte) 116);

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Ljd;")
    public static class85 field4070 = class221.method1499("0", (byte) 97);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[S")
    public static short[] field4060 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field4071 = 1;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljd;")
    public static class85 field4068 = class221.method1499("cookieprefix", (byte) 86);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lnj;")
    public static class138 field4073;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lqb;")
    public class56 field4062;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lge;")
    public static class68 field4066;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[Ljb;")
    public static class255[] field4061;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)I")
    public static final int method1568(int arg0, boolean arg1, int arg2) {
        field4069++;
        if (arg1) {
            field4073 = null;
        }
        int var3 = arg2 >> 31 & arg0 - 1;
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1569(int arg0, int arg1) {
        class25.field383 = 1000 / arg1;
        field4067++;
        if (arg0 != 14365) {
            field4070 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1570(int arg0) {
        field4066 = null;
        field4060 = null;
        field4073 = null;
        field4070 = null;
        field4068 = null;
        field4061 = null;
        if (arg0 == 945) {
            field4063 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZJ)Ljd;")
    public static final class85 method1571(boolean arg0, long arg1) {
        if (arg0) {
            return null;
        } else {
            field4064++;
            return class11.method91(false, 10, arg1, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method1572(byte arg0) {
        if (arg0 != 54) {
            return;
        }
        field4072++;
        for (class4 var1 = (class4) class213.field3738.method110(64); var1 != null; var1 = (class4) class213.field3738.method117((byte) 53)) {
            class48 var2 = var1.field45;
            if (class116.field2066 != var2.field837 || var2.field858) {
                var1.method1753(137);
            } else if (var2.field853 <= class151.field2555) {
                var2.method328(class218.field3820, false);
                if (var2.field858) {
                    var1.method1753(137);
                } else {
                    class130.method876(var2.field837, var2.field847, var2.field851, var2.field840, 60, var2, 0, -1L, false);
                }
            }
        }
    }
}
