import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class119 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Ljn;")
    public static class409 field1600 = new class409("K", "T", "K", "K");

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Lhi;")
    public static class365 field1603;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method811(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1597++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg3 != -5230) {
            field1596 = -4;
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLjava/lang/String;)V", line = 28)
    public static final void method812(byte arg0, String arg1) {
        field1602++;
        if (arg1.equals("")) {
            return;
        }
        class257.method1773((byte) -10, class260.field3855);
        class452.field6666++;
        if (arg0 < -94) {
            class159.field2132.method1727(-128, class248.method1646(arg1, (byte) -109));
            class159.field2132.method1712(arg1, 124);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lsn;Z)V", line = 45)
    public static final void method813(class463 arg0, boolean arg1) {
        arg0.field6828 = null;
        field1599++;
        if (arg1 && class32.field443 < 20) {
            class129.field1719.method2024(10, arg0);
            class32.field443++;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[[B[[I[[BLui;IZ[[BILfp;[[BILui;)V", line = 72)
    public static final void method814(int arg0, byte[][] arg1, int[][] arg2, byte[][] arg3, class378 arg4, int arg5, boolean arg6, byte[][] arg7, int arg8, class9 arg9, byte[][] arg10, int arg11, class378 arg12) {
        if (class118.field1594 == 0 && !class29.field418) {
            class86.method579(arg11, arg3, arg7, arg6, arg1, -1, arg5, arg4, arg9, arg2, arg0, arg10, arg12);
        } else {
            class38.method342(arg3, arg9, arg12, arg8 ^ 0xFFFFFF85, arg10, arg0, arg2, arg5, arg6, arg1, arg7, arg11, arg4);
        }
        if (arg8 != -6) {
            method814(-57, (byte[][]) null, (int[][]) null, (byte[][]) null, (class378) null, 70, true, (byte[][]) null, 8, (class9) null, (byte[][]) null, -108, (class378) null);
        }
        field1601++;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 89)
    public static void method815(int arg0) {
        if (arg0 == 1) {
            field1600 = null;
            field1603 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLkg;)V", line = 100)
    public static final void method816(boolean arg0, class223 arg1) {
        if (!arg0) {
            method814(-59, (byte[][]) null, (int[][]) null, (byte[][]) null, (class378) null, -41, true, (byte[][]) null, -4, (class9) null, (byte[][]) null, 47, (class378) null);
        }
        if (arg1.field3216 == 5 && arg1.field3363 != -1) {
            class380.method2409(arg1, (byte) 76, class74.field942);
        }
        field1595++;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILwe;II)V", line = 121)
    public static final void method817(int arg0, class26 arg1, int arg2, int arg3) {
        if (arg1.field751 == arg3 && arg3 != -1) {
            class196 var4 = class83.method556(arg3, 123);
            int var5 = var4.field2769;
            if (var5 == 1) {
                arg1.field763 = 0;
                arg1.field717 = 0;
                arg1.field737 = arg2;
                arg1.field756 = 0;
                arg1.field780 = 1;
                class446.method2739(var4, false, arg1.field4960, arg1.field717, arg0 ^ 0x366A, arg1.field4954, arg1.field4951);
            }
            if (var5 == 2) {
                arg1.field763 = 0;
            }
        } else if (arg3 == -1 || arg1.field751 == -1 || class83.method556(arg3, 90).field2775 >= class83.method556(arg1.field751, 75).field2775) {
            arg1.field756 = 0;
            arg1.field763 = 0;
            arg1.field751 = arg3;
            arg1.field737 = arg2;
            arg1.field717 = 0;
            arg1.field785 = arg1.field790;
            arg1.field780 = 1;
            if (arg1.field751 != -1) {
                class446.method2739(class83.method556(arg1.field751, arg0 + 14036), false, arg1.field4960, arg1.field717, -49, arg1.field4954, arg1.field4951);
            }
        }
        field1598++;
        if (arg0 != -13915) {
            field1603 = null;
        }
    }
}
