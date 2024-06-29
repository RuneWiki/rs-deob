import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class563 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljv;")
    public static class86 field7993;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 7)
    public static void method3321(int arg0) {
        if (arg0 < 60) {
            field7993 = null;
        }
        field7993 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 17)
    public static final void method3322(byte arg0) {
        class21.field353.method4080(true, class21.field353.field10075, 1);
        field7995++;
        class21.field353.method4080(true, class21.field353.field10086, 1);
        class21.field353.method4080(true, class21.field353.field10058, 2);
        class21.field353.method4080(true, class21.field353.field10073, 2);
        class21.field353.method4080(true, class21.field353.field10067, 1);
        class21.field353.method4080(true, class21.field353.field10089, 1);
        class21.field353.method4080(true, class21.field353.field10104, 1);
        class21.field353.method4080(true, class21.field353.field10064, 1);
        class21.field353.method4080(true, class21.field353.field10069, 1);
        class21.field353.method4080(true, class21.field353.field10057, 1);
        class21.field353.method4080(true, class21.field353.field10062, 2);
        class21.field353.method4080(true, class21.field353.field10080, 1);
        class21.field353.method4080(true, class21.field353.field10072, 2);
        class21.field353.method4080(true, class21.field353.field10091, 1);
        class21.field353.method4080(true, class21.field353.field10096, 0);
        if (arg0 != 40) {
            field7993 = null;
        }
        class21.field353.method4080(true, class21.field353.field10070, 0);
        class21.field353.method4080(true, class21.field353.field10102, 2);
        class21.field353.method4080(true, class21.field353.field10100, 0);
        class21.field353.method4080(true, class21.field353.field10090, 0);
        class318.method2060(true);
        class21.field353.method4080(true, class21.field353.field10087, 0);
        class21.field353.method4080(true, class21.field353.field10088, 4);
        class594.method3464(true);
        class37.method289((byte) 68);
        class446.field6088 = true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 55)
    public static final void method3323(String arg0, int arg1, String arg2) {
        field7994++;
        if (arg0.length() > 320 || !class401.method2473((byte) -101)) {
            return;
        }
        if (class527.field7529 != null) {
            class527.field7529.method612((byte) 120);
            class527.field7529 = null;
        }
        class376.method2331((byte) 59);
        if (arg1 < 70) {
            field7993 = null;
        }
        class691.field9661 = arg0;
        class694.field9678 = arg2;
        class225.method1539(false, 5);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLha;IILpf;IIIIIILka;I)Lka;", line = 84)
    public static final class496 method3324(int arg0, boolean arg1, class65 arg2, int arg3, int arg4, class607 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class496 arg12, int arg13) {
        field7996++;
        if (arg12 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg5 != null) {
            int var15 = var14 | arg5.method3526(-1, false, 16775, arg7);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg4 << 48) + ((long) arg10 << 32) + (long) (arg9 - -(arg6 << 16) - -(arg11 << 24));
        class652 var18 = class663.field9221;
        class496 var19;
        synchronized (class663.field9221) {
            var19 = (class496) class663.field9221.method3742((byte) 67, var16);
        }
        if (var19 == null || arg2.method512(var19.method68(), var14) != 0) {
            if (var19 != null) {
                var14 = arg2.method542(var14, var19.method68());
            }
            byte var20;
            if (arg9 == 1) {
                var20 = 9;
            } else if (arg9 == 2) {
                var20 = 12;
            } else if (arg9 == 3) {
                var20 = 15;
            } else if (arg9 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class100 var23 = new class100(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method711((byte) 98, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class376.field5186[var30] * var27 >> 14;
                    int var32 = class376.field5188[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method711((byte) 57, 0, var32, var31);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg6 * var35 + arg11 * var34 >> 8);
                short var37 = (short) (((arg4 & 0x380) * var34 + (arg10 & 0x380) * var35 & 0x38000) + ((arg4 & 0xFC00) * var34 + (arg10 & 0xFC00) * var35 & 0xFC0000) + ((arg4 & 0x7F) * var34 + (arg10 & 0x7F) * var35 & 0x7F00) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method708((byte) 1, var24, var37, (byte) -1, (byte) 62, var25[0][var38], var25[0][(var38 + 1) % var20], var36, (short) -1);
                    } else {
                        var23.method708((byte) 1, var25[var33 - 1][var38], var37, (byte) -1, (byte) 93, var25[var33][(var38 + 1) % var20], var25[var33 - 1][(var38 + 1) % var20], var36, (short) -1);
                        var23.method708((byte) 1, var25[var33 - 1][var38], var37, (byte) -1, (byte) 119, var25[var33][var38], var25[var33][(var38 + 1) % var20], var36, (short) -1);
                    }
                }
            }
            var19 = arg2.method480(var23, var14, class751.field10391, 64, 768);
            class652 var39 = class663.field9221;
            synchronized (class663.field9221) {
                class663.field9221.method3739(var16, (byte) 93, var19);
            }
        }
        int var40 = arg12.method116();
        int var41 = arg12.method69();
        int var42 = arg12.method113();
        int var43 = arg12.method120();
        class369 var44 = null;
        if (!arg1) {
            field7993 = null;
        }
        if (arg5 != null) {
            int var45 = arg5.field8492[arg7];
            var44 = field7993.method648((byte) 64, var45 >> 16);
            arg7 = var45 & 0xFFFF;
        }
        class496 var46;
        if (var44 == null) {
            var46 = var19.method93((byte) 3, var14, true);
            var46.method84(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method114(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method93((byte) 3, var14, true);
            var46.method84(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method114(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method3019((byte) 71, arg7, var44);
        }
        if (arg3 != 0) {
            var46.method78(arg3);
        }
        if (arg13 != 0) {
            var46.method74(arg13);
        }
        if (arg8 != 0) {
            var46.method114(0, arg8, 0);
        }
        return var46;
    }
}
