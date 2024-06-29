import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "F")
    public static float field809 = 0.0F;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
    public static int[] field812 = new int[2];

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lfo;")
    public static class545 field816;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Ldm;")
    public class58 field811;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Lfe;")
    public class597 field815;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field818;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method409(byte arg0, String arg1) {
        field814++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class177.method1336(arg1, (byte) 75);
        if (var2 == null || arg0 > -19) {
            return;
        }
        for (int var3 = 0; var3 < class749.field10345; var3++) {
            String var4 = class463.field6303[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class177.method1336(var4, (byte) 75);
            if (var5 != null && var5.equals(var2)) {
                class749.field10345--;
                for (int var6 = var3; var6 < class749.field10345; var6++) {
                    class463.field6303[var6] = class463.field6303[var6 + 1];
                    class392.field5378[var6] = class392.field5378[var6 + 1];
                    class759.field10458[var6] = class759.field10458[var6 + 1];
                    class389.field5347[var6] = class389.field5347[var6 + 1];
                    class164.field2650[var6] = class164.field2650[var6 + 1];
                    class548.field7453[var6] = class548.field7453[var6 + 1];
                }
                class559.field7944++;
                class720.field9894 = class62.field859;
                class537 var7 = class476.method2729(class496.field6791, (byte) -46, class551.field7498);
                var7.field7295.method754(class703.method3926(120, arg1), 57);
                var7.field7295.method783((byte) -122, arg1);
                class173.method1314(false, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public final void method410(byte arg0) {
        field810++;
        if (class130.field2263 >= 500) {
            return;
        }
        this.field811 = class27.field512;
        if (arg0 > 9) {
            this.field815 = null;
            class130.field2263++;
            class27.field512 = this;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field816 = null;
        if (arg0 != -1) {
            method411(37);
        }
        field812 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILha;)Z")
    public static final boolean method412(int arg0, int arg1, class66 arg2) {
        field813++;
        int var3 = (class483.field6515 - 104) / 2;
        int var4 = (class65.field926 - 104) / 2;
        boolean var5 = true;
        if (arg0 >= -59) {
            field809 = -0.8070811F;
        }
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class652.method3654(18334, var6, var57, var58, arg1)) {
                        int var59 = var58;
                        if (class61.method425(var57, 16340, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class680.method3830(var6, var57, var59, true);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class435.field5918 = arg2.method495(0, 512, var7, 512, 512, true);
        class495.method2839((byte) 88);
        int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 228 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x59CCFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class239.field3403 + 2 + 1][class239.field3403 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class239.field3403) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class239.field3403) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class239.field3403 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class239.field3403;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg2.method512(0, 0, var37 + (class239.field3403 * 4), class239.field3403 * 4 + var38);
                arg2.method536(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class239.field3403; var50++) {
                        for (int var56 = 0; var56 <= class239.field3403; var56++) {
                            var12[var50][var56] = class652.method3654(18334, var39 + var50, var40 + var56, var43, arg1);
                        }
                    }
                    class142.field2418[var43].method1899(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class483.field6511) {
                        for (int var51 = -4; var51 < class239.field3403; var51++) {
                            for (int var52 = -4; var52 < class239.field3403; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var4 <= var54 && class652.method3654(18334, var53, var54, var43, arg1)) {
                                    int var55 = var43;
                                    if (class61.method425(var54, 16340, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class344.method2132(var55, var54, (class239.field3403 - var52) * 4 + var38 - 4, arg2, var9, var53, var37 + (var51 * 4), var10, -99);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class483.field6511) {
                    class355 var44 = class711.field9798[arg1];
                    for (int var45 = 0; var45 < class239.field3403; var45++) {
                        for (int var46 = 0; var46 < class239.field3403; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field4830[var47 - var44.field4843][var48 - var44.field4841];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method472(25692, 4, var45 * 4 + var37, 4, -1713569622, (class239.field3403 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method528(44, 4, -1713569622, var38 + ((class239.field3403 - var46) * 4) - 4, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method526(var45 * 4 + var37 + 3, 4, -1713569622, var38 - (4 - ((class239.field3403 - var46) * 4)), 1);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method528(-128, 4, -1713569622, var38 + ((class239.field3403 - var46) * 4) - 1, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method526(var37 + (var45 * 4), 4, -1713569622, var38 + ((class239.field3403 - var46) * 4) - 4, 1);
                            }
                        }
                    }
                }
                arg2.method537(var37, var38, class239.field3403 * 4, class239.field3403 * 4, var11, 2);
                class435.field5918.method642((var13 - var3) * 4 + 48, 464 - (var36 - var4) * 4 + -(class239.field3403 * 4), class239.field3403 * 4, class239.field3403 * 4, var37, var38);
            }
        }
        arg2.method575();
        arg2.method536(-16777215);
        class622.method3506(86);
        class338.field4577 = 0;
        class578.field8188.method3590((byte) 93);
        if (!class483.field6511) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; arg1 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class652.method3654(18334, var14, var20, var21, arg1)) {
                            class237 var22 = (class237) class572.method3313(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class237) class614.method3480(var21, var14, var20, field818 == null ? (field818 = method413("bea")) : field818);
                            }
                            if (var22 == null) {
                                var22 = (class237) class454.method2624(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class237) class728.method4037(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class445 var23 = class414.field5670.method2319(var22.method1032(false), false);
                                if (!var23.field6043 || class295.field4033) {
                                    int var24 = var23.field6120;
                                    if (var23.field6028 != null) {
                                        for (int var25 = 0; var25 < var23.field6028.length; var25++) {
                                            if (var23.field6028[var25] != -1) {
                                                class445 var26 = class414.field5670.method2319(var23.field6028[var25], false);
                                                if (var26.field6120 >= 0) {
                                                    var24 = var26.field6120;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class393 var28 = class430.field5863.method4031(36, var24);
                                            if (var28 != null && var28.field5422) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class711.field9798[var21].field4830;
                                            int var32 = class711.field9798[var21].field4843;
                                            int var33 = class711.field9798[var21].field4841;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - (var32 + 1)][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 103) && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class333.field4505[class338.field4577] = var23.field6104;
                                        class576.field8172[class338.field4577] = var29;
                                        class355.field4833[class338.field4577] = var30;
                                        class338.field4577++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class333.field4502 != null) {
                class527.field7156.field9185 = 1;
                class430.field5863.method4028(55, 1024, 64);
                for (int var15 = 0; var15 < class333.field4502.field9442; var15++) {
                    int var16 = class333.field4502.field9443[var15];
                    if ((var16 >> 28) == class235.field3379.field7391) {
                        int var17 = ((var16 & 0xFFFC8FA) >> 14) - class217.field3198;
                        int var18 = (var16 & 0x3FFF) - class400.field5510;
                        if (var17 >= 0 && var17 < class483.field6515 && var18 >= 0 && class65.field926 > var18) {
                            class578.field8188.method3594((byte) 99, new class345(var15));
                        } else {
                            class393 var19 = class430.field5863.method4031(36, class333.field4502.field9447[var15]);
                            if (var19.field5391 != null && (var19.field5440 + var17) >= 0 && (var19.field5393 + var17) < class483.field6515 && (var18 + var19.field5432) >= 0 && var19.field5428 + var18 < class65.field926) {
                                class578.field8188.method3594((byte) 122, new class345(var15));
                            }
                        }
                    }
                }
                class430.field5863.method4028(55, 128, 64);
                class527.field7156.field9185 = 2;
                class527.field7156.method3748(0);
            }
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method413(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
