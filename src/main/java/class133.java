import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class133 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1737 = "shake:";

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1745 = " has logged out.";

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILbd;IBLuh;Lw;Ltj;)V", line = 4)
    public static final void method948(int arg0, int arg1, class27 arg2, int arg3, byte arg4, class414 arg5, class170 arg6, class298 arg7) {
        field1739++;
        int var8 = arg2.field459 - (arg3 / 2 + 5);
        if (arg4 != 120) {
            return;
        }
        int var9 = arg0 + 2;
        if (arg6.field2306 != 0) {
            arg7.method2023(arg0 + (arg5.method2615() * arg1) + 1 - var9, var8, var9, arg4 ^ 0xFFFFD226, arg3 + 10, arg6.field2306);
        }
        if (arg6.field2324 != 0) {
            arg7.method2014(var9, arg4 - 120, arg6.field2324, var8, arg3 + 10, arg0 + 1 + (arg1 * arg5.method2615() - var9));
        }
        int var10 = arg6.field2298;
        if (arg2.field458 && arg6.field2339 != -1) {
            var10 = arg6.field2339;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class238.field3334[var11];
            if (var11 < arg1 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method2616(arg7, var12, arg2.field459, arg0, var10, true);
            arg0 += arg5.method2615();
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 45)
    public static void method949(boolean arg0) {
        field1737 = null;
        if (!arg0) {
            field1745 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lir;I)I", line = 61)
    public static final int method950(class185 arg0, int arg1) {
        field1744++;
        int var2 = arg1;
        if (arg0.method1205((byte) -48, class217.field3031)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1205((byte) -48, class208.field2840)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class69.field1009)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class351.field5215)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class149.field1892)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class325.field4811)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class95.field1285)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class195.field2705)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class256.field3736)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class204.field2816)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class435.field6317)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class240.field3370)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class247.field3474)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class57.field863)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class73.field1033)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IJ)V", line = 130)
    public static final void method951(int arg0, long arg1) {
        field1738++;
        if (class266.field3950 != null) {
            if (class212.field2884 == 1 || class212.field2884 == 5) {
                class383.method2489(arg1, arg0 + 845);
            } else if (class212.field2884 == 2) {
                class321.method2112(-247233885);
            } else if (class212.field2884 == 4) {
                class43.method310(arg1, (byte) 62);
            } else {
                class342.method2270((byte) -46);
            }
        }
        class116.method850(26091, class126.field1647, (long) class231.field3179);
        if (class233.field3246 != -1) {
            class7.method42(class233.field3246, (byte) -124);
        }
        for (int var3 = 0; var3 < class400.field5854; var3++) {
            if (class33.field536[var3]) {
                class101.field1335[var3] = true;
            }
            class297.field4482[var3] = class33.field536[var3];
            class33.field536[var3] = false;
        }
        class209.field2843 = class231.field3179;
        if (class126.field1647.method479()) {
            class181.field2427 = true;
        }
        class348.field5177 = null;
        if (class233.field3246 != -1) {
            class400.field5854 = 0;
            class297.method2010(true);
        }
        class126.field1647.method472();
        class316.method2073(true, class126.field1647);
        int var4 = class316.method2074(3);
        if (arg0 == var4) {
            var4 = class38.field571;
        }
        class191.method1272((byte) 59, var4);
        class106.method802(class268.field3973, class383.field5609.field5930, class383.field5609.field5921, 255, class216.field3021);
        class216.field3021 = 0;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Z)I", line = 195)
    public static final int method952(boolean arg0) {
        field1736++;
        if ((double) class200.field2769 == 3.0D) {
            return 37;
        } else if ((double) class200.field2769 == 4.0D) {
            return 50;
        } else if ((double) class200.field2769 == 6.0D) {
            return 75;
        } else if ((double) class200.field2769 == 8.0D) {
            return 100;
        } else {
            if (arg0) {
                method953((byte) 90);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 227)
    public static final void method953(byte arg0) {
        field1743++;
        class287.method1947();
        if (arg0 != 13) {
            method954(53, true);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V", line = 241)
    public static final void method954(int arg0, boolean arg1) {
        field1741++;
        class440 var2 = class186.method1241(arg0, 8, (byte) 56);
        if (arg1) {
            var2.method2749(13828096);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V", line = 254)
    public static final void method955(int arg0, byte arg1) {
        field1742++;
        class440 var2 = class186.method1241(arg0, 11, (byte) 56);
        if (arg1 == 48) {
            var2.method2749(13828096);
        }
    }
}
