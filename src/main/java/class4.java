import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lph;")
    public static class229 field40 = class266.method1858("hitbar_default", 0);

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field42 = -2;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public static boolean field44 = false;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lph;")
    private static class229 field39 = class266.method1858("wishes to trade with you)3", 0);

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lph;")
    public static class229 field46 = field39;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Ldf;")
    public static class277 field47;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z", line = 17)
    public static final boolean method19(int arg0, int arg1) {
        if (arg0 != 0) {
            field43 = 83;
        }
        field48++;
        return (arg1 & 0x651C85DD) >> 30 != 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILsi;Lsi;II)Lfg;", line = 39)
    public static final class81 method20(int arg0, class66 arg1, class66 arg2, int arg3, int arg4) {
        if (arg4 != 23281) {
            method24(-97, -55);
        }
        field45++;
        return class176.method1264(arg3, (byte) 106, arg1, arg0) ? class111.method845(arg2.method523(-68, arg0, arg3), true) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 67)
    public static void method21(int arg0) {
        field46 = null;
        field40 = null;
        if (arg0 <= 5) {
            method21(100);
        }
        field39 = null;
        field47 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lsi;Z)V", line = 81)
    public static final void method22(class66 arg0, boolean arg1) {
        class111.field1876 = arg0;
        if (!arg1) {
            method23((byte) 109, (class164) null);
        }
        field41++;
        class203.field3354 = class111.field1876.method517((byte) -126, 16);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLhb;)Lef;", line = 120)
    public static final class273 method23(byte arg0, class164 arg1) {
        if (arg0 >= -28) {
            return (class273) null;
        } else {
            field38++;
            return new class273(arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1176(1048115912), arg1.method1176(1048115912), arg1.method1178(8));
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V", line = 160)
    public static final void method24(int arg0, int arg1) {
        field50++;
        if (arg0 >= 0 && class328.field5596.length > arg0) {
            int var2 = 84 % ((arg1 - 49) / 43);
            class328.field5596[arg0] = !class328.field5596[arg0];
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I", line = 188)
    public static final int method25(int arg0) {
        field49++;
        int var1 = 106 % ((arg0 - 18) / 39);
        return ((class184.field2996 == 0 ? 0 : 1) << 22) + ((class45.field687 ? 1 : 0) << 10) + ((class298.field4847 ? 1 : 0) << 7) + ((class296.field4836 ? 1 : 0) << 6) + ((class120.field2017 ? 1 : 0) << 5) + ((class175.field2877 ? 1 : 0) << 4) + ((class85.field1467 ? 1 : 0) << 3) + ((class191.field3153 & 0x7) + ((class171.field2807 ? 1 : 0) << 8) + ((class215.field3547 ? 1 : 0) << 9) + (class157.field2559 & 0x3 << 11) + ((class88.field1483 ? 1 : 0) << 13) + ((class281.field4661 ? 1 : 0) << 15) + ((class215.field3545 ? 1 : 0) << 16) + ((class143.field2313 ? 1 : 0) << 19) - (-((class265.field4462 == 0 ? 0 : 1) << 20) + (-((class234.field3860 == 0 ? 0 : 1) << 21) - (class194.method1371() << 23))));
    }
}
