import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class238 {

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "Los;")
    public static class379 field3393 = new class379();

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "[I")
    public static int[] field3396 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3397 = -1;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field3390;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILoa;ILlm;Llq;)Z")
    public static final boolean method1591(int arg0, int arg1, class605 arg2, int arg3, class431 arg4, class480 arg5) {
        field3394++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        if (arg0 != 1) {
            field3397 = 105;
        }
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field6428 != null) {
            var8 = class182.field2263 - (arg4.field6412 + arg5.field7057 - class182.field2275) * (class182.field2263 - class182.field2270) / (class182.field2281 - class182.field2275);
            var6 = class182.field2277 + ((arg4.field6391 + arg5.field7059 - class182.field2268) * (class182.field2276 - class182.field2277) / (class182.field2272 - class182.field2268));
            var7 = (arg4.field6410 + arg5.field7059 - class182.field2268) * (class182.field2276 - class182.field2277) / (class182.field2272 - class182.field2268) + class182.field2277;
            var9 = class182.field2263 - ((arg4.field6402 + arg5.field7057 - class182.field2275) * (class182.field2263 - class182.field2270) / (class182.field2281 - class182.field2275));
        }
        class433 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field6407 != -1) {
            if (arg5.field7055 && arg4.field6397 != -1) {
                var10 = arg4.method2691(true, arg2, 1768021437);
            } else {
                var10 = arg4.method2691(false, arg2, 1768021437);
            }
            if (var10 != null) {
                var11 = arg5.field7056 - (var10.method1577() + 1 >> 1);
                var12 = arg5.field7056 + (var10.method1577() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg5.field7058 - (var10.method1568() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg5.field7058 + (var10.method1568() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class476 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field6418 != null) {
            var15 = class343.method2206(false, arg4.field6400);
            if (var15 != null) {
                var16 = class327.field4720.method2561(arg4.field6418, null, (byte) -88, null, class484.field7095);
                int var23 = arg5.field7058;
                if (var10 == null) {
                    var17 = var23 - var15.method2911() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method1568() >> 1) + (var15.method2913() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class484.field7095[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2914(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field7056 + arg1 - (var18 / 2);
                var20 = var18 / 2 + arg1 + arg5.field7056;
                if (var19 < var6) {
                    var6 = var19;
                }
                var21 = var17 + arg3;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg3 + var15.method2913() * var16 + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class182.field2277 > var7 || var6 > class182.field2276 || class182.field2270 > var9 || var8 > class182.field2263) {
            return true;
        }
        if (arg4.field6428 != null) {
            int[] var27 = new int[arg4.field6428.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg4.field6428[var28 * 2] + arg5.field7059;
                int var31 = arg4.field6428[var28 * 2 + 1] + arg5.field7057;
                var27[var28 * 2] = (class182.field2276 - class182.field2277) * (var30 - class182.field2268) / (class182.field2272 - class182.field2268) + class182.field2277;
                var27[var28 * 2 + 1] = class182.field2263 - (var31 - class182.field2275) * (class182.field2263 - class182.field2270) / (class182.field2281 - class182.field2275);
            }
            class124.method765(arg2, var27, arg4.field6387);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg2.method3520(var27[var29 * 2 + 2 + 1], var27[var29 * 2], var27[var29 * 2 + 1], (byte) 0, var27[var29 * 2 + 2], arg4.field6399);
            }
            arg2.method3520(var27[1], var27[var27.length - 2], var27[var27.length - 1], (byte) 0, var27[0], arg4.field6399);
        }
        if (var10 != null) {
            if (class647.field9361 > 0 && (class330.field4756 != -1 && class330.field4756 == arg5.field7060 || class83.field945 != -1 && class83.field945 == arg4.field6403)) {
                int var32;
                if (class590.field8474 <= 50) {
                    var32 = class590.field8474 * 2;
                } else {
                    var32 = (100 - class590.field8474) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method3519(var33, true, var10.method1570() / 2 + 7, arg5.field7056, arg5.field7058);
                arg2.method3519(var33, true, var10.method1570() / 2 + 5, arg5.field7056, arg5.field7058);
                arg2.method3519(var33, true, var10.method1570() / 2 + 3, arg5.field7056, arg5.field7058);
                arg2.method3519(var33, true, var10.method1570() / 2 + 1, arg5.field7056, arg5.field7058);
                arg2.method3519(var33, true, var10.method1570() / 2, arg5.field7056, arg5.field7058);
            }
            var10.method2706(arg5.field7056 - (var10.method1577() >> 1), arg5.field7058 - (var10.method1568() >> 1));
        }
        if (arg4.field6418 != null && var15 != null) {
            class295.method1980(arg2, var18, false, arg5, var17, var15, var16, arg4);
        }
        if (arg4.field6407 != -1 || arg4.field6418 != null) {
            class491 var34 = new class491(arg5);
            var34.field7155 = var21;
            var34.field7162 = var12;
            var34.field7160 = var22;
            var34.field7151 = var20;
            var34.field7158 = var13;
            var34.field7161 = var19;
            var34.field7153 = var11;
            var34.field7154 = var14;
            class501.field7292.method706(var34, true);
        }
        return false;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[BII[BZI)V")
    public static final void method1592(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8) {
        field3395++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg6[var10001] = (byte) (arg6[var10001] - arg3[arg1++]);
                int var14 = arg8++;
                arg6[var14] = (byte) (arg6[var14] - arg3[arg1++]);
                int var15 = arg8++;
                arg6[var15] = (byte) (arg6[var15] - arg3[arg1++]);
                int var16 = arg8++;
                arg6[var16] = (byte) (arg6[var16] - arg3[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg6[var10001] = (byte) (arg6[var10001] - arg3[arg1++]);
            }
            arg1 += arg5;
            arg8 += arg0;
        }
        if (!arg7) {
            field3397 = -64;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1593(boolean arg0, byte[] arg1) {
        field3392++;
        class194 var2 = new class194(arg1);
        int var3 = var2.method1177(255);
        if (!arg0) {
            field3396 = null;
        }
        int var4 = var2.method1178(-230315992);
        if (var4 < 0 || !(class392.field6006 == 0 || var4 <= class392.field6006)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method1200(var8, (byte) -119, 0, var4);
            return var8;
        } else {
            int var5 = var2.method1178(-230315992);
            if (var5 < 0 || !(class392.field6006 == 0 || class392.field6006 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class422.method2659(var6, var5, arg1, var4, 9);
            } else {
                class296 var7 = class86.field984;
                synchronized (class86.field984) {
                    class86.field984.method1982(var2, -13227, var6);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method1594(byte arg0) {
        field3393 = null;
        field3396 = null;
        field3390 = null;
        int var1 = -94 % ((arg0 + 22) / 37);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public static final void method1595(int arg0) {
        if (class65.field721 == null) {
            class159 var1 = new class159();
            byte[] var2 = var1.method921(128, -22908, 128, 16);
            class65.field721 = class295.method1981(-1053, var2, false);
        }
        field3391++;
        if (class72.field777 == null) {
            class322 var3 = new class322();
            byte[] var4 = var3.method2099(128, 128, 1, 16);
            class72.field777 = class295.method1981(-1053, var4, false);
        }
        if (arg0 <= 83) {
            method1593(true, null);
        }
    }
}
