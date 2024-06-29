import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class474 extends class403 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[I")
    private int[] field6833 = new int[512];

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Luq;")
    public static class114 field6836 = null;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field6843 = -1;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
    public static int[] field6841 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "F")
    public static float field6845;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lcc;")
    public static class516 field6839;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field6837;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(BI)I")
    private static final int method2847(byte arg0, int arg1) {
        field6835++;
        int var2 = arg1 & 0x3F;
        if (arg0 != -66) {
            method2847((byte) -8, -50);
        }
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method2848(boolean arg0) {
        field6837 = null;
        if (!arg0) {
            field6836 = null;
            field6841 = null;
            field6839 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(FFIFIIII[FFI)V")
    public final void method2522(float arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, float arg9, int arg10) {
        field6832++;
        int var12 = (int) ((float) arg2 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg5 * arg9 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg4 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class261.method1746((byte) 3, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field6833[var25];
        int var27 = this.field6833[var24];
        for (int var28 = 0; var28 < arg5; var28++) {
            float var29 = (float) var28 * arg9;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class261.method1746((byte) 3, var32);
            int var36 = var31 & var15;
            int var37 = this.field6833[var34 + var26];
            int var38 = this.field6833[var26 + var36];
            int var39 = this.field6833[var27 + var34];
            int var40 = this.field6833[var27 + var36];
            for (int var41 = 0; var41 < arg2; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class261.method1746((byte) 3, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg8[arg7++] = class505.method3011(class505.method3011(class505.method3011(class507.method3021(true, var21, var45, var32, class74.method644(this.field6833[var49 + var40], 7)), class507.method3021(true, var21, var46, var32, class74.method644(7, this.field6833[var40 + var48])), 0, var47), class505.method3011(class507.method3021(true, var21, var45, var33, class74.method644(this.field6833[var39 + var49], 7)), class507.method3021(true, var21, var46, var33, class74.method644(7, this.field6833[var39 + var48])), 0, var47), 0, var35), class505.method3011(class505.method3011(class507.method3021(true, var22, var45, var32, class74.method644(this.field6833[var38 + var49], 7)), class507.method3021(true, var22, var46, var32, class74.method644(7, this.field6833[var38 + var48])), 0, var47), class505.method3011(class507.method3021(true, var22, var45, var33, class74.method644(7, this.field6833[var49 + var37])), class507.method3021(true, var22, var46, var33, class74.method644(this.field6833[var48 + var37], 7)), 0, var47), 0, var35), 0, var23) * arg3;
            }
        }
        if (arg6 != 6347) {
            field6845 = -1.3564008F;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILma;IIILuq;IILya;)V")
    public static final void method2849(int arg0, class10 arg1, int arg2, int arg3, int arg4, class114 arg5, int arg6, int arg7, class38 arg8) {
        field6838++;
        class519 var9 = class107.field1502.method3071(-127, arg0);
        if (var9 != null && var9.field7596 && var9.method3082(class195.field3271, arg7 ^ 0xFFF0BDBA)) {
            if (var9.field7578 != null) {
                int[] var10 = new int[var9.field7578.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class176.field2611 == 4) {
                        var13 = (int) class473.field6830 & 0x3FFF;
                    } else {
                        var13 = (int) class473.field6830 + class162.field2414 & 0x3FFF;
                    }
                    int var14 = class281.field4278[var13];
                    int var15 = class281.field4279[var13];
                    if (class176.field2611 != 4) {
                        var14 = var14 * 256 / (class4.field23 + 256);
                        var15 = var15 * 256 / (class4.field23 + 256);
                    }
                    var10[var11 * 2] = ((arg6 + (var9.field7578[var11 * 2] * 4)) * var15 + (arg4 + (var9.field7578[var11 * 2 + 1] * 4)) * var14 >> 15) + arg5.field1642 / 2 + arg2;
                    var10[var11 * 2 + 1] = arg5.field1627 / 2 + arg3 - ((var9.field7578[var11 * 2 + 1] * 4 + arg4) * var15 - (var9.field7578[var11 * 2] * 4 + arg6) * var14 >> 15);
                }
                class423.method2643(arg8, var10, var9.field7598, arg5.field1615, arg5.field1617);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg8.method266(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 1 + 2], var9.field7605, 1, arg1, arg2, arg3);
                }
                arg8.method266(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7605, 1, arg1, arg2, arg3);
            }
            class16 var16 = null;
            if (var9.field7581 != -1) {
                var16 = var9.method3085(arg8, 1599534109, false);
                if (var16 != null) {
                    class283.method1839(var16, arg2, arg3, arg4, arg6, arg5, arg1, -128);
                }
            }
            if (var9.field7576 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method125();
                }
                class317 var18 = class45.field585;
                class348 var19 = class431.field6391;
                if (var9.field7599 == 1) {
                    var19 = class401.field5963;
                    var18 = class313.field4722;
                }
                if (var9.field7599 == 2) {
                    var19 = class380.field5735;
                    var18 = class185.field2805;
                }
                class495.method2941(var9.field7566, arg7 - 999999, var18, var9.field7576, arg5, arg4, var19, var17, arg2, arg1, arg6, arg3);
            }
        }
        if (arg7 != 999999) {
            field6836 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
    public class474(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6833[var3] = this.field6833[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6833[var5];
            this.field6833[var5] = this.field6833[var5 + 256] = this.field6833[var4];
            this.field6833[var4] = this.field6833[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIII)V")
    public static final void method2850(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        if (class327.field4931 <= arg4 && class184.field2777 >= arg4) {
            int var5 = class385.method2403(class433.field6414, class404.field5987, arg2, arg0);
            int var6 = class385.method2403(class433.field6414, class404.field5987, arg1, arg0);
            class216.method1495(arg3, arg4, var5, (byte) -82, var6);
        }
        field6842++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Z")
    public static final boolean method2851(int arg0, byte arg1) {
        int var2 = 114 / ((40 - arg1) / 42);
        field6844++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI[[[Lfq;III)Z")
    public static final boolean method2852(boolean arg0, int arg1, class138[][][] arg2, int arg3, int arg4, int arg5) {
        field6834++;
        byte var6 = arg0 ? 1 : (byte) (class448.field6562 & 0xFF);
        if (class221.field3633[class154.field2286][arg5][arg3] == var6) {
            return false;
        } else if ((class476.field6873[class154.field2286][arg5][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class46.field596[var7] = arg5;
            int var8 = 0;
            int var35 = var7 + 1;
            class458.field6662[var7] = arg3;
            class221.field3633[class154.field2286][arg5][arg3] = var6;
            while (var35 != var8) {
                int var9 = class46.field596[var8] & 0xFFFF;
                int var10 = (class46.field596[var8] & 0xFF4070) >> 16;
                int var11 = class46.field596[var8] >> 24 & 0xFF;
                int var12 = class458.field6662[var8] & 0xFFFF;
                int var13 = (class458.field6662[var8] & 0xFFDEDF) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class476.field6873[class154.field2286][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class154.field2286 + 1; var16 <= 3; var16++) {
                    if ((class476.field6873[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field2114 != null) {
                                int var20 = method2847((byte) -66, var10);
                                if (arg2[var16][var9][var12].field2114.field4692 == var20 || arg2[var16][var9][var12].field2104 != null && arg2[var16][var9][var12].field2104.field4692 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = method2847((byte) -66, var11);
                                    if (arg2[var16][var9][var12].field2114.field4692 == var21 || arg2[var16][var9][var12].field2104 != null && arg2[var16][var9][var12].field2104.field4692 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = method2847((byte) -66, var13);
                                    if (arg2[var16][var9][var12].field2114.field4692 == var22 || arg2[var16][var9][var12].field2104 != null && arg2[var16][var9][var12].field2104.field4692 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class138 var23 = arg2[var16][var9][var12];
                            if (var23.field2118 != null) {
                                for (class327 var24 = var23.field2118; var24 != null; var24 = var24.field4922) {
                                    class389 var25 = var24.field4921;
                                    if (var25 instanceof class164) {
                                        class164 var26 = (class164) var25;
                                        int var27 = var26.method627(23326);
                                        int var28 = var26.method621(3021);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class138 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field2118 != null) {
                            for (class327 var31 = var30.field2118; var31 != null; var31 = var31.field4922) {
                                class389 var32 = var31.field4921;
                                if (var32.field5836 != var32.field5827 || var32.field5830 != var32.field5829) {
                                    for (int var33 = var32.field5836; var33 <= var32.field5827; var33++) {
                                        for (int var34 = var32.field5830; var34 <= var32.field5829; var34++) {
                                            class221.field3633[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class221.field3633[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class491.field7059[class154.field2286 + 1].method411(var9, var12);
                    if (class255.field3909[arg1] < var17) {
                        class255.field3909[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class220.field3617[arg1] > var18) {
                        class220.field3617[arg1] = var18;
                    } else if (class233.field3770[arg1] < var18) {
                        class233.field3770[arg1] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class488.field7034[arg1] > var19) {
                        class488.field7034[arg1] = var19;
                    } else if (class520.field7618[arg1] < var19) {
                        class520.field7618[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class221.field3633[class154.field2286][var9 - 1][var12] != var6) {
                        class46.field596[var35] = class264.method1763(-754974720, class264.method1763(1179648, var9 - 1));
                        class458.field6662[var35] = class264.method1763(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class221.field3633[class154.field2286][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class285.field4328) {
                        if (var9 - 1 >= 0 && class221.field3633[class154.field2286][var9 - 1][var12] != var6 && (class476.field6873[class154.field2286][var9][var12] & 0x4) == 0 && (class476.field6873[class154.field2286][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class46.field596[var35] = class264.method1763(1375731712, class264.method1763(var9 - 1, 1179648));
                            class458.field6662[var35] = class264.method1763(1245184, var12);
                            class221.field3633[class154.field2286][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class221.field3633[class154.field2286][var9][var12] != var6) {
                            class46.field596[var35] = class264.method1763(class264.method1763(var9, 5373952), 318767104);
                            class458.field6662[var35] = class264.method1763(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class221.field3633[class154.field2286][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class69.field976 && class221.field3633[class154.field2286][var9 + 1][var12] != var6 && (class476.field6873[class154.field2286][var9][var12] & 0x4) == 0 && (class476.field6873[class154.field2286][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class46.field596[var35] = class264.method1763(-1845493760, class264.method1763(5373952, var9 + 1));
                            class458.field6662[var35] = class264.method1763(var12, 5439488);
                            class221.field3633[class154.field2286][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class69.field976 > (var9 + 1) && class221.field3633[class154.field2286][var9 + 1][var12] != var6) {
                        class46.field596[var35] = class264.method1763(class264.method1763(9568256, var9 + 1), 1392508928);
                        class458.field6662[var35] = class264.method1763(9633792, var12);
                        class221.field3633[class154.field2286][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class221.field3633[class154.field2286][var9 - 1][var12] != var6 && (class476.field6873[class154.field2286][var9][var12] & 0x4) == 0 && (class476.field6873[class154.field2286][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class46.field596[var35] = class264.method1763(class264.method1763(var9 - 1, 13762560), 301989888);
                            class458.field6662[var35] = class264.method1763(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class221.field3633[class154.field2286][var9 - 1][var12] = var6;
                        }
                        if (class221.field3633[class154.field2286][var9][var12] != var6) {
                            class46.field596[var35] = class264.method1763(-1828716544, class264.method1763(13762560, var9));
                            class458.field6662[var35] = class264.method1763(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class221.field3633[class154.field2286][var9][var12] = var6;
                        }
                        if (class69.field976 > var9 + 1 && class221.field3633[class154.field2286][var9 + 1][var12] != var6 && (class476.field6873[class154.field2286][var9][var12] & 0x4) == 0 && (class476.field6873[class154.field2286][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class46.field596[var35] = class264.method1763(-771751936, class264.method1763(var9 + 1, 9568256));
                            class458.field6662[var35] = class264.method1763(9633792, var12);
                            class221.field3633[class154.field2286][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg4 != -1) {
                field6845 = -2.1397731F;
            }
            if (class255.field3909[arg1] != -1000000) {
                class255.field3909[arg1] += 10;
                class220.field3617[arg1] -= 50;
                class233.field3770[arg1] += 50;
                class520.field7618[arg1] += 50;
                class488.field7034[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method2853(byte arg0) {
        field6840++;
        for (int var1 = 0; var1 < 5; var1++) {
            class407.field6059[var1] = false;
        }
        class197.field3290 = 0;
        class412.field6175 = 0;
        class360.field5346 = -1;
        class368.field5409 = -1;
        if (arg0 != 30) {
            field6839 = null;
        }
        class176.field2611 = 1;
    }
}
