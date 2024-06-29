import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class17 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lce;")
    public static class126 field230 = class206.method1445(-7923, "<col=ff0000>");

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
    public static boolean field232 = false;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lce;")
    public static class126 field234 = class206.method1445(-7923, ")4p=");

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[[[B")
    public static byte[][][] field238;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLbb;)V", line = 5)
    public static final void method93(byte arg0, class134 arg1) {
        int var2 = class272.field4579 >> 2 << 10;
        int var3 = class142.field2591 >> 1;
        byte[][] var4 = new byte[class36.field521][class143.field2602];
        while (arg1.field2299 < arg1.field2282.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method948(-125) == 1) {
                var5 = true;
                var6 = arg1.method948(-123);
                var7 = arg1.method948(-128);
            }
            int var8 = arg1.method948(-123);
            int var9 = arg1.method948(-121);
            int var10 = var8 * 64 - class220.field3702;
            int var11 = class143.field2602 - (var9 * 64 + -class306.field5140) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && var10 + 63 < class36.field521 && class143.field2602 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= var6 * 8 && var12 < (var6 * 8 + 8) && (var7 * 8) <= var14 && var14 < (var7 * 8 + 8)) {
                            var13[var11 - var14] = arg1.method977(19773);
                        }
                    }
                }
            } else if (var5) {
                arg1.field2299 += 64;
            } else {
                arg1.field2299 += 4096;
            }
        }
        field233++;
        int var15 = class143.field2602;
        int[] var16 = new int[var15];
        int[] var17 = new int[var15];
        if (arg0 >= -125) {
            field234 = (class126) null;
        }
        int var18 = class36.field521;
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var18; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var18) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class224 var26 = class9.method53(var25 - 1, 27993);
                        var17[var23] += var26.field3781;
                        var16[var23] += var26.field3778;
                        var20[var23] += var26.field3775;
                        var21[var23] += var26.field3782;
                        var10002 = var19[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class224 var29 = class9.method53(var28 - 1, 27993);
                        var17[var23] -= var29.field3781;
                        var16[var23] -= var29.field3778;
                        var20[var23] -= var29.field3775;
                        var21[var23] -= var29.field3782;
                        var10002 = var19[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class64.field1079[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var37 < var15) {
                        var31 += var20[var37];
                        var35 += var19[var37];
                        var32 += var17[var37];
                        var34 += var16[var37];
                        var33 += var21[var37];
                    }
                    if (var38 >= 0) {
                        var31 -= var20[var38];
                        var32 -= var17[var38];
                        var35 -= var19[var38];
                        var33 -= var21[var38];
                        var34 -= var16[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class103.method704(30924, var31 / var35, var32 * 256 / var33, var34 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 & 0x380) + ((var2 + var40 & 0xFC00) + var41);
                            var39[(class47.method289(var36, 63) << 6) + class47.method289(63, var22)] = class236.field3979[class107.method711(96, var42, (byte) -4)];
                        } else if (var39 != null) {
                            var39[class47.method289(var36 << 6, 4032) + class47.method289(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lem;", line = 233)
    public static final class88 method94(int arg0) {
        field235++;
        if (arg0 < 26) {
            method95(-59);
        }
        return class140.field2552.length <= class283.field4715 ? null : class140.field2552[class283.field4715++];
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 261)
    public static void method95(int arg0) {
        field230 = null;
        field238 = (byte[][][]) null;
        if (arg0 == 63) {
            field234 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([Lvj;Lcc;[Lie;B[Lie;[Lie;[Lie;)V", line = 289)
    public static final void method96(class184[] arg0, class313 arg1, class2[] arg2, byte arg3, class2[] arg4, class2[] arg5, class2[] arg6) {
        field237++;
        class15.field214 = arg0;
        class159.field2863 = arg1;
        class241.field4077 = arg5;
        class280.field4647 = arg6;
        class296.field4934 = arg2;
        class5.field34 = arg4;
        class185.field3201 = new boolean[class15.field214.length];
        if (arg3 < 126) {
            return;
        }
        class100.field1616.method905((byte) 126);
        int var7 = class159.field2863.method2176(class7.field88, 0);
        int[] var8 = class159.field2863.method2182(var7, (byte) -63);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class100.field1616.method899(class306.method2051(new class134(class159.field2863.method2173(var7, var8[var9], (byte) -43)), -64), -28);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 324)
    public static final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class260 var20 = new class260(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class297.field4940[var21][arg1][arg2] == null) {
                    class297.field4940[var21][arg1][arg2] = new class5(var21, arg1, arg2);
                }
            }
            class297.field4940[arg0][arg1][arg2].field43 = var20;
        } else if (arg3 == 1) {
            class260 var22 = new class260(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class297.field4940[var23][arg1][arg2] == null) {
                    class297.field4940[var23][arg1][arg2] = new class5(var23, arg1, arg2);
                }
            }
            class297.field4940[arg0][arg1][arg2].field43 = var22;
        } else {
            class77 var24 = new class77(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class297.field4940[var25][arg1][arg2] == null) {
                    class297.field4940[var25][arg1][arg2] = new class5(var25, arg1, arg2);
                }
            }
            class297.field4940[arg0][arg1][arg2].field44 = var24;
        }
    }
}
