import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 extends class98 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    private int field1121 = -32768;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lwk;")
    public static class273 field1123 = new class273(4);

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Loa;")
    public static class99 field1131 = class221.method1463(2844, "(Y<)4col>");

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ltf;B)V")
    public static final void method440(class107 arg0, byte arg1) {
        field1132++;
        class107 var2 = class21.method127(arg0, 64);
        if (arg1 != 1) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class199.field3458;
            var4 = class24.field373;
        } else {
            var3 = var2.field1933;
            var4 = var2.field1793;
        }
        class169.method1143(arg0, var4, false, var3, 19);
        class150.method1003(arg0, var4, 122, var3);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method441(byte arg0) {
        field1131 = null;
        int var1 = 23 / ((arg0 + 47) / 41);
        field1123 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIZLcl;IIILjb;IIIBI)Lcl;")
    public static final class195 method442(int arg0, int arg1, int arg2, boolean arg3, class195 arg4, int arg5, int arg6, int arg7, class270 arg8, int arg9, int arg10, int arg11, byte arg12, int arg13) {
        field1128++;
        long var14 = ((long) arg5 << 48) + ((long) arg9 << 32) + (long) ((arg13 << 16) + (arg1 << 24) + arg7);
        class195 var16 = (class195) class189.field3336.method1811(var14, -59);
        if (var16 == null) {
            byte var17;
            if (arg7 == 1) {
                var17 = 9;
            } else if (arg7 == 2) {
                var17 = 12;
            } else if (arg7 == 3) {
                var17 = 15;
            } else if (arg7 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class285 var20 = new class285(var17 * var18 + 1, var18 * 2 * var17 - var17, 0);
            int var21 = var20.method1889(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class134.field2339[var33] * var30 + arg11 >> 16;
                    int var35 = class134.field2344[var33] * var31 + arg0 >> 16;
                    var22[var23][var32] = var20.method1889(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg1 * var25 + arg13 * var26 >> 8);
                short var28 = (short) (((arg5 & 0x380) * var25 + (arg9 & 0x380) * var26 & 0x38000) + ((arg5 & 0xFC00) * var25 + (arg9 & 0xFC00) * var26 & 0xFC0000) + ((arg5 & 0x7F) * var25 + (arg9 & 0x7F) * var26 & 0x7F00) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1860(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1860(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1860(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1884(64, 768, -50, -10, -50);
            class189.field3336.method1817(var14, 16, var16);
        }
        int var36 = arg7 * 64 - 1;
        int var37 = var36;
        int var38 = -var36;
        int var39 = -var36;
        int var40 = var36;
        if (arg3) {
            if (arg10 > 128 && arg10 < 896) {
                var38 -= 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var40 = var36 + 128;
            }
            if (arg10 > 1664 || arg10 < 384) {
                var39 -= 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var37 = var36 + 128;
            }
        }
        int var41 = arg4.method205();
        if (arg12 <= 6) {
            method442(89, 48, 56, true, (class195) null, 92, 74, -76, (class270) null, -109, -118, 7, (byte) -52, 64);
        }
        if (var41 < var38) {
            var41 = var38;
        }
        int var42 = arg4.method202();
        if (var37 < var42) {
            var42 = var37;
        }
        int var43 = arg4.method219();
        int var44 = arg4.method215();
        class39 var45 = null;
        if (var40 < var44) {
            var44 = var40;
        }
        if (arg8 != null) {
            int var46 = arg8.field4740[arg2];
            var45 = class82.method564(0, var46 >> 16);
            arg2 = var46 & 0xFFFF;
        }
        if (var39 > var43) {
            var43 = var39;
        }
        class195 var47;
        if (var45 == null) {
            var47 = var16.method211(true, true);
            var47.method221((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method231((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method211(!var45.method305(33, arg2), true);
            var47.method221((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method231((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method234(var45, arg2);
        }
        if (arg10 != 0) {
            var47.method210(arg10);
        }
        class27 var48 = (class27) var47;
        if (arg6 != class115.method777(-1, arg0 + var43, class255.field4407, arg11 + var41) || class115.method777(-1, arg0 + var44, class255.field4407, arg11 + var42) != arg6) {
            for (int var49 = 0; var49 < var48.field447; var49++) {
                var48.field455[var49] += class115.method777(-1, var48.field469[var49] + arg0, class255.field4407, var48.field462[var49] + arg11) - arg6;
            }
            var48.field467 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIJILkg;)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class136 arg10) {
        class195 var13 = class222.method1468(1, this.field1125).method1117(-30191, this.field1129, (class270) null, 0);
        field1122++;
        if (var13 != null) {
            var13.method233(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1121 = var13.method226();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1126++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method443(int arg0, int arg1) {
        field1124++;
        class258.field4497--;
        if (class258.field4497 == arg1) {
            return;
        }
        class241.method1573(class219.field3812, arg1 + 1, class219.field3812, arg1, class258.field4497 - arg1);
        if (arg0 != -32055) {
            field1131 = null;
        }
        class241.method1573(class122.field2147, arg1 + 1, class122.field2147, arg1, class258.field4497 - arg1);
        class241.method1570(class258.field4502, arg1 + 1, class258.field4502, arg1, class258.field4497 - arg1);
        class241.method1571(class249.field4293, arg1 + 1, class249.field4293, arg1, class258.field4497 - arg1);
        class241.method1567(class258.field4495, arg1 + 1, class258.field4495, arg1, class258.field4497 - arg1);
        class241.method1567(class83.field1451, arg1 + 1, class83.field1451, arg1, class258.field4497 - arg1);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
    public final int method226() {
        field1130++;
        return this.field1121;
    }
}
