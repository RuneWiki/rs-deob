import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class415 extends class27 {

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lik;")
    public static class410 field5801 = new class410(8);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field5808 = 0;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Z")
    public static volatile boolean field5809 = true;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "S")
    public static short field5812 = 256;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Ljava/lang/String;")
    public static String field5811 = "green:";

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "S")
    public static short field5813 = 32767;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field5800;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field5805;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lhh;")
    public class184 field5807;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[Lmo;")
    public class197[] field5799;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 7)
    public static final void method2568(long[] arg0, Object[] arg1, byte arg2) {
        if (arg2 < -50) {
            field5803++;
            class307.method1979(arg0, 0, arg0.length - 1, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 19)
    public static void method2569(byte arg0) {
        field5801 = null;
        field5811 = null;
        if (arg0 != 115) {
            field5808 = -11;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 32)
    public static final void method2570(byte arg0) {
        if (class166.field2472 == 10) {
            class29.method340(28, (byte) -58);
        }
        field5802++;
        int var1 = -102 / ((20 - arg0) / 44);
        if (class166.field2472 == 30) {
            class29.method340(25, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII[[[BIILpe;IIB)V", line = 49)
    public static final void method2571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, class391 arg9, int arg10, int arg11, byte arg12) {
        field5806++;
        if (arg7 == 0 || arg8 == 0) {
            return;
        }
        int var13 = 3 / ((-arg12 - 63) / 39);
        if (arg7 == 9) {
            arg7 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        arg9.method153(arg0, arg4, arg10, arg5, arg11, arg1, arg6[arg7 - 1][arg3], arg8, arg2);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILpe;BI)Z", line = 88)
    public final boolean method2572(int arg0, class391 arg1, byte arg2, int arg3) {
        if (arg2 != 90) {
            this.field5800 = -49;
        }
        field5815++;
        if (this.field5799 != null) {
            for (int var5 = 0; var5 < this.field5799.length; var5++) {
                if (this.field5799[var5].method1398(arg3, arg0) && this.field5807.method583(arg0, arg3, arg1, 65536)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lug;III[Z)Z", line = 144)
    public static final boolean method2573(class325 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class91.field1351 != class244.field3367) {
            int var6 = class265.field3566[arg1].method1515(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class411 var8 = class265.field3566[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1515(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1502(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1511(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
