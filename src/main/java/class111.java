import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class111 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Le;")
    private static class191 field1863 = class54.method368("en", 2047);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Le;")
    private static class191 field1859 = class54.method368("de", 2047);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Le;")
    private static class191 field1865 = class54.method368("Loading title screen )2 ", 2047);

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
    public static boolean field1868 = true;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Le;")
    public static class191 field1862 = field1865;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Le;")
    private static class191 field1864 = class54.method368(")3fr", 2047);

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Le;")
    private static class191 field1870 = class54.method368(")3en", 2047);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[[I")
    public static int[][] field1861 = new int[104][104];

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Le;")
    private static class191 field1869 = class54.method368("fr", 2047);

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Z")
    public static boolean field1875 = false;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Le;")
    private static class191 field1874 = class54.method368(")3de", 2047);

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "[Le;")
    private static class191[] field1871 = new class191[] { field1870, field1874, field1864 };

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[Le;")
    public static class191[] field1866 = new class191[] { field1863, field1859, field1869 };

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method712(int arg0) {
        field1870 = null;
        field1866 = null;
        field1861 = null;
        if (arg0 != -32690) {
            method713(-57, (class251) null, 66, true, (byte) 122, -63, -127, 11, 107, -93, -28, 8, 50, (class248) null);
        }
        field1864 = null;
        field1859 = null;
        field1865 = null;
        field1874 = null;
        field1869 = null;
        field1863 = null;
        field1871 = null;
        field1862 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILee;IZBIIIIIIIILab;)Lee;")
    public static final class251 method713(int arg0, class251 arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class248 arg13) {
        long var14 = ((long) arg7 << 48) + ((long) arg8 << 32) + (long) ((arg0 << 24) + (arg6 - -(arg12 << 16)));
        class251 var16 = (class251) class232.field4142.method991(var14, -25858);
        if (var16 == null) {
            byte var17;
            if (arg6 == 1) {
                var17 = 9;
            } else if (arg6 == 2) {
                var17 = 12;
            } else if (arg6 == 3) {
                var17 = 15;
            } else if (arg6 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class187 var20 = new class187(var17 * var19 + 1, var17 * 2 * var19 + -var17, 0);
            int var21 = var20.method1276(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class15.field206[var33] * var30 + arg2 >> 16;
                    int var35 = class15.field204[var33] * var31 + arg11 >> 16;
                    var22[var23][var32] = var20.method1276(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg0 * var25 + arg12 * var26 >> 8);
                short var28 = (short) (((arg7 & 0x7F) * var25 + (arg8 & 0x7F) * var26 & 0x7F00) + ((arg7 & 0xFC00) * var25 + (arg8 & 0xFC00) * var26 & 0xFC0000) + ((arg7 & 0x380) * var25 + (arg8 & 0x380) * var26 & 0x38000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1264(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1264(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1264(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1280(64, 768, -50, -10, -50);
            class232.field4142.method987(var16, var14, -2438);
        }
        field1860++;
        int var36 = arg6 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg3) {
            if (arg5 > 128 && arg5 < 896) {
                var37 -= 128;
            }
            if (arg5 > 640 && arg5 < 1408) {
                var40 = var36 + 128;
            }
            if (arg5 > 1152 && arg5 < 1920) {
                var39 = var36 + 128;
            }
            if (arg5 > 1664 || arg5 < 384) {
                var38 -= 128;
            }
        }
        int var41 = arg1.method944();
        if (arg4 != -71) {
            method713(65, (class251) null, 74, false, (byte) -76, -67, 50, 109, -101, 54, -65, -38, 18, (class248) null);
        }
        int var42 = arg1.method947();
        if (var42 > var39) {
            var42 = var39;
        }
        if (var37 > var41) {
            var41 = var37;
        }
        int var43 = arg1.method949();
        if (var43 < var38) {
            var43 = var38;
        }
        int var44 = arg1.method973();
        if (var44 > var40) {
            var44 = var40;
        }
        class126 var45 = null;
        if (arg13 != null) {
            int var46 = arg13.field4419[arg10];
            var45 = class79.method513(-17500, var46 >> 16);
            arg10 = var46 & 0xFFFF;
        }
        class251 var47;
        if (var45 == null) {
            var47 = var16.method945(true, true);
            var47.method953((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method964((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method945(!var45.method855(false, arg10), true);
            var47.method953((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method964((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method968(var45, arg10);
        }
        if (arg5 != 0) {
            var47.method951(arg5);
        }
        class144 var48 = (class144) var47;
        if (class222.method1546(class261.field4598, arg11 + var41, arg2 + var43, arg4 ^ 0xF14095FE) != arg9 || arg9 != class222.method1546(class261.field4598, arg11 + var42, arg2 + var44, arg4 ^ 0xF14095FE)) {
            for (int var49 = 0; var49 < var48.field2401; var49++) {
                var48.field2393[var49] += class222.method1546(class261.field4598, var48.field2400[var49] + arg11, var48.field2391[var49] + arg2, 247425607) - arg9;
            }
            var48.field2405 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZILeg;)I")
    public static final int method714(boolean arg0, int arg1, class33 arg2) {
        field1872++;
        if (arg2.field461 == null || arg1 >= arg2.field461.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field461[arg1];
            int var5 = 0;
            if (arg0) {
                return 11;
            }
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var8 = class199.field3557[var4[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class239.field4256[var4[var5++]];
                }
                if (var7 == 3) {
                    var8 = class173.field2917[var4[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class33 var12 = class233.method1646(5877, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class100.method623(-1, var13).field2513 || class200.field3588)) {
                        for (int var14 = 0; var14 < var12.field515.length; var14++) {
                            if ((var13 + 1) == var12.field515[var14]) {
                                var8 += var12.field631[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 5) {
                    var8 = class164.field2778[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class32.field444[class239.field4256[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class164.field2778[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 8) {
                    var8 = class175.field2946.field1330;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class126.field2087[var15]) {
                            var8 += class239.field4256[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class33 var18 = class233.method1646(5877, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class100.method623(-1, var19).field2513 || class200.field3588)) {
                        for (int var20 = 0; var20 < var18.field515.length; var20++) {
                            if ((var19 + 1) == var18.field515[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class4.field38;
                }
                if (var7 == 12) {
                    var8 = class28.field399;
                }
                if (var7 == 13) {
                    int var21 = class164.field2778[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class33.method223((byte) -64, var23);
                }
                if (var7 == 18) {
                    var8 = (class175.field2946.field3003 >> 7) + class225.field4061;
                }
                if (var7 == 19) {
                    var8 = (class175.field2946.field2972 >> 7) + class193.field3474;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLtb;)Ltb;")
    public abstract class142 method7(byte arg0, class142 arg1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILaf;)V")
    public static final void method715(int arg0, class156 arg1) {
        field1867++;
        class57 var2 = (class57) class269.field4750.method1173(125);
        if (arg0 != -2854) {
            return;
        }
        while (var2 != null) {
            if (var2.field1041 == arg1) {
                if (var2.field1058 != null) {
                    class270.field4764.method504(var2.field1058);
                    var2.field1058 = null;
                }
                var2.method655(63);
                return;
            }
            var2 = (class57) class269.field4750.method1175(-1);
        }
    }
}
