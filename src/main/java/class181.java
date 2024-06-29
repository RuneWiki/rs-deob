import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class181 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lsf;")
    public static class108 field3327 = class140.method973(255, "blinken1:");

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lsf;")
    public static class108 field3328 = class140.method973(255, "S-Blectionner");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lik;ZZLik;)V", line = 9)
    public static final void method1309(class262 arg0, boolean arg1, boolean arg2, class262 arg3) {
        class157.field2843 = arg3;
        field3330++;
        class92.field1472 = arg2;
        if (arg1) {
            field3327 = (class108) null;
        }
        class15.field202 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIII)V", line = 23)
    public static final void method1310(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class74 var6 = class99.field1759[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class140 var7 = var6.field1122;
        if (var7 != null) {
            int var8 = var7.field2469;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class18 var10 = var6.field1144;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field259;
        int var12 = var10.field248;
        int var13 = var10.field255;
        int var14 = var10.field243;
        int[] var15 = class255.field4440[var11];
        int[] var16 = class9.field113[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lrm;I)V", line = 143)
    public static final void method1311(class249 arg0, int arg1) {
        field3326++;
        int var2 = class287.field5020 >> 2 << 10;
        byte[][] var3 = new byte[class74.field1113][class152.field2757];
        int var4 = class143.field2522 >> 1;
        while (arg0.field4314 < arg0.field4338.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1731(true) == 1) {
                var6 = arg0.method1731(true);
                var7 = arg0.method1731(true);
                var5 = true;
            }
            int var8 = arg0.method1731(true);
            int var9 = arg0.method1731(true);
            int var10 = var8 * 64 - class144.field2546;
            int var11 = class83.field1288 + class152.field2757 - (var9 * 64) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && class74.field1113 > (var10 + 63) && var11 < class152.field2757) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var3[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || (var6 * 8) <= var12 && var12 < (var6 * 8 + 8) && var7 * 8 <= var14 && var14 < var7 * 8 + 8) {
                            var13[var11 - var14] = arg0.method1721((byte) 81);
                        }
                    }
                }
            } else if (var5) {
                arg0.field4314 += 64;
            } else {
                arg0.field4314 += 4096;
            }
        }
        int var15 = class74.field1113;
        int var16 = class152.field2757;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        if (arg1 != -1) {
            return;
        }
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var3[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class306 var26 = class131.method903(arg1 ^ 0xFFFFFF8D, var25 - 1);
                        var17[var23] += var26.field5334;
                        var18[var23] += var26.field5331;
                        var19[var23] += var26.field5330;
                        var20[var23] += var26.field5322;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var3[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class306 var29 = class131.method903(arg1 ^ 0x6E, var28 - 1);
                        var17[var23] -= var29.field5334;
                        var18[var23] -= var29.field5331;
                        var19[var23] -= var29.field5330;
                        var20[var23] -= var29.field5322;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class255.field4439[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var16 > var37) {
                        var35 += var21[var37];
                        var31 += var17[var37];
                        var33 += var19[var37];
                        var34 += var20[var37];
                        var32 += var18[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var34 -= var20[var38];
                        var33 -= var19[var38];
                        var31 -= var17[var38];
                        var35 -= var21[var38];
                        var32 -= var18[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class197.method1400(var31 * 256 / var34, var32 / var35, var33 / var35, 2);
                        if (var3[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var4;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class162.method1118(var22, 63) + (class162.method1118(63, var36) << 6)] = class263.field4657[class157.method1097(96, true, var42)];
                        } else if (var39 != null) {
                            var39[class162.method1118(63, var22) + (class162.method1118(63, var36) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JZ)V", line = 373)
    public static final void method1312(long arg0, boolean arg1) {
        field3329++;
        if (arg0 == 0L) {
            return;
        }
        class256.field4471.method1427(39, 0);
        class256.field4471.method1735((byte) -40, arg0);
        class154.field2778++;
        if (!arg1) {
            field3328 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Lcc;", line = 401)
    public static final class252 method1313(int arg0, int arg1, int arg2) {
        field3331++;
        class252 var3 = new class252();
        for (class173 var4 = (class173) class128.field2182.method13(0); var4 != null; var4 = (class173) class128.field2182.method15((byte) 47)) {
            if (var4.field3154 && var4.method1231(arg0, arg2, (byte) -123)) {
                var3.method1784(var4, true);
            }
        }
        if (arg1 != -65) {
            method1314((byte) 66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 428)
    public static void method1314(byte arg0) {
        if (arg0 != 29) {
            field3328 = (class108) null;
        }
        field3328 = null;
        field3327 = null;
    }
}
