import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class103 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[Lmh;")
    public static class128[] field1759 = new class128[1000];

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lmh;")
    public static class128 field1765 = class22.method156(127, "<img=0>");

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1767 = 0;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lmh;")
    private static class128 field1771 = class22.method156(126, "glow1:");

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lmh;")
    public static class128 field1773 = class22.method156(122, "Konfig geladen)3");

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lmh;")
    public static class128 field1774 = field1771;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lmh;")
    public static class128 field1768 = class22.method156(123, "leuchten2:");

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[I")
    public static int[] field1770 = new int[4096];

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lmh;")
    public static class128 field1769 = field1771;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method632(byte arg0, int arg1) {
        field1772++;
        class229 var2 = class241.method1638(4, arg0 + 153, arg1);
        var2.method1566((byte) -3);
        if (arg0 != -26) {
            field1765 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 19)
    public static void method633(int arg0) {
        field1759 = null;
        field1774 = null;
        field1773 = null;
        field1768 = null;
        field1770 = null;
        field1769 = null;
        if (arg0 > -78) {
            field1773 = (class128) null;
        }
        field1765 = null;
        field1771 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Lmh;", line = 37)
    public static final class128 method634(int arg0, byte arg1) {
        if (arg1 != 1) {
            field1759 = (class128[]) null;
        }
        field1763++;
        if (arg0 >= 100000) {
            return arg0 >= 10000000 ? class28.method177((byte) -64, new class128[] { class223.field3911, class257.method1811(arg0 / 1000000, (byte) -118), class241.field4117, class121.field2040 }) : class28.method177((byte) -123, new class128[] { class210.field3723, class257.method1811(arg0 / 1000, (byte) -116), class293.field5013, class121.field2040 });
        } else {
            return class28.method177((byte) -78, new class128[] { class152.field2624, class257.method1811(arg0, (byte) 90), class121.field2040 });
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JBILmh;III)V", line = 57)
    public static final void method635(long arg0, byte arg1, int arg2, class128 arg3, int arg4, int arg5, int arg6) {
        field1764++;
        class194 var8 = new class194(128);
        var8.method1352(7528, 10);
        var8.method1324((int) (Math.random() * 99999.0D), 15803);
        var8.method1324(516, 15803);
        var8.method1344(98, arg0);
        var8.method1337(-122, (int) (Math.random() * 9.9999999E7D));
        var8.method1343((byte) 66, arg3);
        var8.method1337(-126, (int) (Math.random() * 9.9999999E7D));
        var8.method1324(class36.field743, 15803);
        var8.method1352(7528, arg6);
        var8.method1352(7528, arg2);
        int var9 = -54 / ((arg1 + 91) / 33);
        var8.method1337(-112, (int) (Math.random() * 9.9999999E7D));
        var8.method1324(arg5, 15803);
        var8.method1324(arg4, 15803);
        var8.method1337(-43, (int) (Math.random() * 9.9999999E7D));
        var8.method1305((byte) -114, class143.field2446, class9.field195);
        class71.field1320.field3380 = 0;
        class71.field1320.method1352(7528, 252);
        class71.field1320.method1352(7528, var8.field3380);
        class71.field1320.method1303((byte) 99, var8.field3380, 0, var8.field3417);
        class211.field3740 = 0;
        class4.field75 = 1;
        class176.field3103 = 0;
        class192.field3330 = -3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I", line = 93)
    public static final int method636(byte arg0) {
        field1760++;
        if (arg0 != -65) {
            method637((class60) null, 106, false, -81, 62, -106, -24, -85, (byte) 72, (class1) null, 49, 30, 107, 103);
        }
        return 6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lja;IZIIIIIBLaj;IIII)Lja;", line = 130)
    public static final class60 method637(class60 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, class1 arg9, int arg10, int arg11, int arg12, int arg13) {
        field1761++;
        long var14 = ((long) arg4 << 32) + (long) ((arg6 << 24) + (arg10 << 16) + arg12) + ((long) arg5 << 48);
        class60 var16 = (class60) class50.field985.method1836(var14, 0);
        if (var16 == null) {
            byte var17 = 3;
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19;
            if (arg12 == 1) {
                var19 = 9;
            } else if (arg12 == 2) {
                var19 = 12;
            } else if (arg12 == 3) {
                var19 = 15;
            } else if (arg12 == 4) {
                var19 = 18;
            } else {
                var19 = 21;
            }
            class168 var20 = new class168(var17 * var19 + 1, var19 * 2 * var17 + -var19, 0);
            int var21 = var20.method1103(0, 0, 0);
            int[][] var22 = new int[var17][var19];
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var19; var26++) {
                    int var27 = (var26 << 11) / var19;
                    int var28 = class141.field2424[var27] * var25 + arg13 >> 16;
                    int var29 = arg1 + (class141.field2411[var27] * var24) >> 16;
                    var22[var23][var26] = var20.method1103(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg6 * var31 + arg10 * var32 >> 8);
                short var34 = (short) (((arg4 & 0x380) * var32 + (arg5 & 0x380) * var31 & 0x38000) + ((arg4 & 0x7F) * var32 + (arg5 & 0x7F) * var31 & 0x7F00) + ((arg4 & 0xFC00) * var32 + (arg5 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var19; var35++) {
                    if (var30 == 0) {
                        var20.method1100(var21, var22[0][(var35 + 1) % var19], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1100(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var19], var22[var30][(var35 + 1) % var19], (byte) 1, var34, var33);
                        var20.method1100(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var19], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1105(64, 768, -50, -10, -50);
            class50.field985.method1835((byte) -81, var14, var16);
        }
        int var36 = arg12 * 64 - 1;
        int var37 = var36;
        int var38 = arg0.method205();
        int var39 = var36;
        int var40 = -var36;
        int var41 = -var36;
        if (arg2) {
            if (arg3 > 1664 || arg3 < 384) {
                var40 -= 128;
            }
            if (arg3 > 640 && arg3 < 1408) {
                var39 = var36 + 128;
            }
            if (arg3 > 1152 && arg3 < 1920) {
                var37 = var36 + 128;
            }
            if (arg3 > 128 && arg3 < 896) {
                var41 -= 128;
            }
        }
        if (var38 < var41) {
            var38 = var41;
        }
        class178 var42 = null;
        int var43 = arg0.method190();
        if (var43 > var37) {
            var43 = var37;
        }
        int var44 = arg0.method182();
        int var45 = arg0.method206();
        if (arg9 != null) {
            int var46 = arg9.field8[arg11];
            var42 = class38.method257(19, var46 >> 16);
            arg11 = var46 & 0xFFFF;
        }
        if (var40 > var44) {
            var44 = var40;
        }
        if (var39 < var45) {
            var45 = var39;
        }
        class60 var47;
        if (var42 == null) {
            var47 = var16.method212(true, true);
            var47.method213((var43 - var38) / 2, 128, (var45 - var44) / 2);
            var47.method186((var38 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method212(!var42.method1219(arg11, 255), true);
            var47.method213((var43 - var38) / 2, 128, (var45 - var44) / 2);
            var47.method186((var38 + var43) / 2, 0, (var44 + var45) / 2);
            var47.method203(var42, arg11);
        }
        if (arg3 != 0) {
            var47.method195(arg3);
        }
        if (class247.field4247) {
            class126 var48 = (class126) var47;
            if (arg7 != class64.method427(arg13 + var38, arg1 + var44, class133.field2315, (byte) 113) || class64.method427(arg13 + var43, arg1 + var45, class133.field2315, (byte) 116) != arg7) {
                for (int var49 = 0; var49 < var48.field2120; var49++) {
                    var48.field2124[var49] += class64.method427(var48.field2109[var49] + arg13, var48.field2144[var49] - -arg1, class133.field2315, (byte) 98) - arg7;
                }
                var48.field2136.field893 = false;
                var48.field2121.field3344 = false;
            }
        } else {
            class29 var50 = (class29) var47;
            if (arg7 != class64.method427(arg13 + var38, arg1 + var44, class133.field2315, (byte) 104) || arg7 != class64.method427(arg13 + var43, arg1 - -var45, class133.field2315, (byte) 105)) {
                for (int var51 = 0; var51 < var50.field621; var51++) {
                    var50.field620[var51] += class64.method427(var50.field607[var51] + arg13, var50.field600[var51] + arg1, class133.field2315, (byte) 127) - arg7;
                }
                var50.field608 = false;
            }
        }
        if (arg8 > -106) {
            field1759 = (class128[]) null;
        }
        return var47;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILjava/util/Random;)I", line = 362)
    public static final int method638(byte arg0, int arg1, Random arg2) {
        field1775++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class148.method997(arg1, (byte) -111)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            if (arg0 != 15) {
                method633(-17);
            }
            return class254.method1798(var4, (byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIII)I", line = 401)
    public static final int method639(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        if (!arg0) {
            field1770 = (int[]) null;
        }
        field1766++;
        return (arg2 >> 2 << 10) - (-(arg1 >> 5 << 7) - (arg3 >> 1));
    }
}
