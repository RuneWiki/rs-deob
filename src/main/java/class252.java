import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class252 extends class310 {

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "[I")
    public static int[] field4258 = new int[500];

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field4260 = 0;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field4268 = 0;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "[I")
    public static int[] field4269 = new int[50];

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "Lwf;")
    public static class250 field4257;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "Lth;")
    public static class57 field4262;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(III)V", line = 8)
    private final void method1953(int arg0, int arg1, int arg2) {
        field4267++;
        int var4 = class230.field3818[arg1];
        int var5 = class293.field4737[arg2];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - 2048));
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class324.field5154 = arg1;
            class319.field5089 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class324.field5154 = arg2;
            class319.field5089 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class319.field5089 = class261.field4405 - arg1;
            class324.field5154 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class319.field5089 = arg2;
            class324.field5154 = class254.field4279 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class324.field5154 = class254.field4279 - arg1;
            class319.field5089 = class261.field4405 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class324.field5154 = class254.field4279 - arg2;
            class319.field5089 = class261.field4405 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class324.field5154 = class254.field4279 - arg2;
            class319.field5089 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class324.field5154 = arg1;
            class319.field5089 = class261.field4405 - arg2;
        }
        class324.field5154 &= class113.field1861;
        class319.field5089 &= class98.field1628;
        if (arg0 > -50) {
            this.method75((class227) null, -46, -41);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIBIII)V", line = 86)
    public static final void method1954(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4265++;
        class2.field14++;
        if (class6.field55 != null && class6.field55.field3577 + 64 - (class6.field55.method1634(-1) * 64) >> 7 == class241.field3988 && class6.field55.field3511 + 64 - class6.field55.method1634(arg2 + 64) * 64 >> 7 == class335.field5305) {
            class241.field3988 = 0;
            class326.field5182 = false;
        }
        class319.method2255((byte) 82);
        if (!arg0) {
            class81.method664((byte) -60);
        }
        class24.method161(arg2 ^ 0xFFFFFFC1);
        if (class42.field607) {
            class295.method2123(arg5, arg1, arg4, -2, true, arg3);
            arg5 = class118.field1984;
            arg3 = class169.field2686;
            arg4 = class254.field4294;
            arg1 = class117.field1974;
        }
        if (arg2 != -65) {
            return;
        }
        class158.field2492 = arg3;
        class158.field2501 = arg1;
        if (class112.field1827 == 1) {
            int var8 = (int) class84.field1426;
            if ((class148.field2376 / 256) > var8) {
                var8 = class148.field2376 / 256;
            }
            int var9 = (int) class261.field4396 + class296.field4763 & 0x7FF;
            if (class78.field1353[4] && var8 < class34.field505[4] + 128) {
                var8 = class34.field505[4] + 128;
            }
            class179.method1408(var8, arg5, (byte) 116, class282.field4621, class271.method2034(arg2 + 64, class6.field55.field3511, class6.field55.field3577, class186.field2991) - 50, var8 * 3 + 600, class206.field3259, var9);
        } else if (class112.field1827 == 4) {
            int var6 = (int) class261.field4396 & 0x7FF;
            int var7 = (int) class84.field1426;
            if ((class148.field2376 / 256) > var7) {
                var7 = class148.field2376 / 256;
            }
            if (class78.field1353[4] && class34.field505[4] + 128 > var7) {
                var7 = class34.field505[4] + 128;
            }
            class179.method1408(var7, arg5, (byte) 116, class282.field4621, class271.method2034(-1, class240.field3954, class350.field5565, class186.field2991) - 50, var7 * 3 + 600, class206.field3259, var6);
        } else if (class112.field1827 == 5) {
            class143.method1100(111, arg5);
        }
        int var10 = class281.field4617;
        int var11 = class206.field3250;
        int var12 = class229.field3807;
        int var13 = class194.field3095;
        int var14 = class176.field2818;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class78.field1353[var15]) {
                int var16 = (int) (Math.random() * (double) (class336.field5313[var15] * 2 + 1) + Math.sin((double) class338.field5389[var15] / 100.0D * (double) class194.field3094[var15]) * (double) class34.field505[var15] - (double) class336.field5313[var15]);
                if (var15 == 0) {
                    class281.field4617 += var16;
                }
                if (var15 == 2) {
                    class229.field3807 += var16;
                }
                if (var15 == 1) {
                    class206.field3250 += var16;
                }
                if (var15 == 3) {
                    class176.field2818 = class176.field2818 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class194.field3095 += var16;
                    if (class194.field3095 < 128) {
                        class194.field3095 = 128;
                    }
                    if (class194.field3095 > 383) {
                        class194.field3095 = 383;
                    }
                }
            }
        }
        class206.method1572((byte) -127);
        if (class42.field607) {
            class244.method1871(arg1, arg3, arg1 + arg4, arg3 + arg5);
            float var18 = (float) class194.field3095 * 0.17578125F;
            boolean var19 = false;
            float var20 = (float) class176.field2818 * 0.17578125F;
            if (class112.field1827 == 3) {
                var18 = class184.field2962 * 360.0F / 6.2831855F;
                var20 = class180.field2879 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class259.field4362 == 10) {
                var21 = class54.method429(arg2 ^ 0x3919, class166.field2649, class229.field3807 >> 10, class281.field4617 >> 10, class272.field4516);
            } else {
                var21 = class54.method429(-14682, class166.field2649, class6.field55.field3553[0] >> 3, class6.field55.field3519[0] >> 3, class272.field4516);
            }
            if (class293.field4732 >= 0) {
                class42.method308();
                class359 var22 = class121.method955(class125.field2139, 124, class89.field1501, class239.field3939, class293.field4732);
                var22.method2529(class326.field5186, arg1, arg3, arg4, arg5, class194.field3095, class176.field2818, var21);
            } else {
                class42.method274(var21);
            }
            class42.method295(arg1, arg3, arg4, arg5, arg1 + (arg4 / 2), arg3 - -(arg5 / 2), var18, var20, class308.field4916, class308.field4916);
            class2.method7(false, arg2 ^ 0xFFFFFFC2);
            class42.method287();
            class42.method278(true);
            class42.method286(true);
        } else {
            class246.method1889(arg1, arg3, arg1 + arg4, arg3 - -arg5);
            class153.method1179();
            if (class293.field4732 >= 0) {
                class359 var17 = class121.method955(class125.field2139, 127, class89.field1501, class239.field3939, class293.field4732);
                var17.method2525(class326.field5186, arg1, arg3, arg4, arg5, class194.field3095, class176.field2818, 0);
            } else {
                class246.method1885(arg1, arg3, arg4, arg5, 0);
            }
        }
        if (class358.field5687 || class45.field695 < arg1 || class45.field695 >= arg1 + arg4 || arg3 > class196.field3144 || arg3 + arg5 <= class196.field3144) {
            class275.field4544 = false;
            class298.field4775 = 0;
            class287.field4674 = true;
        } else {
            class275.field4544 = true;
            class298.field4775 = 0;
            class287.field4674 = true;
            int var23 = class338.field5393;
            int var24 = class241.field3987;
            int var25 = class45.field702;
            class98.field1623 = (var23 - var25) * (class45.field695 - arg1) / arg4 + var25;
            int var26 = class338.field5385;
            class271.field4503 = (class196.field3144 - arg3) * (var26 - var24) / arg5 + var24;
        }
        class195.method1506(false);
        byte var27 = class137.method1038(true) == 2 ? (byte) class2.field14 : 1;
        if (class42.field607) {
            class30.method200(class332.field5261, !class243.field4004);
            class73.method613(class229.field3807, class206.field3250, class281.field4617, class194.field3095, class176.field2818, -1236);
            class42.field609 = class332.field5261;
            method1956(class281.field4617, class206.field3250, class229.field3807, class194.field3095, class176.field2818, class274.field4541, class298.field4777, class319.field5080, class21.field235, class234.field3884, class210.field3305, class186.field2991 + 1, var27, class6.field55.field3577 >> 7, class6.field55.field3511 >> 7);
            class63.field1132 = true;
            class30.method201();
            class73.method613(0, 0, 0, 0, 0, -1236);
            class195.method1506(false);
            class166.method1291(arg4, (byte) -104, class308.field4916, arg3, arg5, class308.field4916, arg1);
            class131.method1008((byte) 80, class308.field4916, arg5, arg3, arg1, class308.field4916, arg4);
            class149.method1154();
        } else {
            method1956(class281.field4617, class206.field3250, class229.field3807, class194.field3095, class176.field2818, class274.field4541, class298.field4777, class319.field5080, class21.field235, class234.field3884, class210.field3305, class186.field2991 + 1, var27, class6.field55.field3577 >> 7, class6.field55.field3511 >> 7);
            class195.method1506(false);
            class149.method1154();
            class166.method1291(arg4, (byte) 104, 256, arg3, arg5, 256, arg1);
            class131.method1008((byte) 105, 256, arg5, arg3, arg1, 256, arg4);
        }
        ((class98) class153.field2439).method766(-25285, class272.field4516);
        class291.method2103(arg4, arg5, -1, arg1, arg3);
        class194.field3095 = var13;
        class176.field2818 = var14;
        class206.field3250 = var11;
        class229.field3807 = var12;
        class281.field4617 = var10;
        if (class336.field5318 && class241.field3991.method67((byte) 0) == 0) {
            class336.field5318 = false;
        }
        if (class336.field5318) {
            if (class42.field607) {
                class244.method1862(arg1, arg3, arg4, arg5, 0);
            } else {
                class246.method1885(arg1, arg3, arg4, arg5, 0);
            }
            class63.method552(class148.field2373, false, -124);
        }
        if (!arg0 && !class336.field5318 && !class358.field5687 && arg1 <= class45.field695 && arg1 + arg4 > class45.field695 && arg3 <= class196.field3144 && class196.field3144 < (arg3 + arg5)) {
            class214.method1617(class196.field3144, arg1, arg3, arg4, class45.field695, arg5, false);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lqm;II)V", line = 347)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4940 = arg0.method1720((byte) -35) == 1;
        }
        if (arg1 != -2470) {
            method1955(-15, -5, 20);
        }
        field4259++;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(III)J", line = 360)
    public static final long method1955(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field533 == null ? 0L : var3.field533.field5397;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 370)
    public class252() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I", line = 374)
    public final int[] method77(int arg0, int arg1) {
        field4261++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            for (int var4 = 0; var4 < class261.field4405; var4++) {
                this.method1953(-94, arg0, var4);
                int[] var5 = this.method2200(0, class324.field5154, (byte) 74);
                var3[var4] = var5[class319.field5089];
            }
        }
        if (arg1 != -13093) {
            this.method77(48, 78);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)[[I", line = 414)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            field4257 = (class250) null;
        }
        field4263++;
        int[][] var3 = this.field4942.method10((byte) -126, arg0);
        if (this.field4942.field30) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class261.field4405; var7++) {
                this.method1953(-60, arg0, var7);
                int[][] var8 = this.method2199(21101, class324.field5154, 0);
                var4[var7] = var8[0][class319.field5089];
                var5[var7] = var8[1][class319.field5089];
                var6[var7] = var8[2][class319.field5089];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 458)
    private static final void method1956(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class273.field4526 * 128) {
            arg0 = class273.field4526 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class162.field2574 * 128) {
            arg2 = class162.field2574 * 128 - 1;
        }
        class130.field2196 = class153.field2438[arg3];
        class75.field1284 = class153.field2445[arg3];
        class279.field4597 = class153.field2438[arg4];
        class281.field4613 = class153.field2445[arg4];
        class291.field4713 = arg0;
        class66.field1175 = arg1;
        class36.field550 = arg2;
        class245.field4011 = arg0 / 128;
        class125.field2138 = arg2 / 128;
        class184.field2971 = class245.field4011 - class172.field2740;
        if (class184.field2971 < 0) {
            class184.field2971 = 0;
        }
        class159.field2533 = class125.field2138 - class172.field2740;
        if (class159.field2533 < 0) {
            class159.field2533 = 0;
        }
        class83.field1414 = class245.field4011 + class172.field2740;
        if (class83.field1414 > class273.field4526) {
            class83.field1414 = class273.field4526;
        }
        class117.field1980 = class172.field2740 + class125.field2138;
        if (class117.field1980 > class162.field2574) {
            class117.field1980 = class162.field2574;
        }
        short var15;
        if (class42.field607) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class172.field2740 + class172.field2740 + 2; var16++) {
            for (int var17 = 0; var17 < class172.field2740 + class172.field2740 + 2; var17++) {
                int var18 = (var16 - class172.field2740 << 7) - (class291.field4713 & 0x7F);
                int var19 = (var17 - class172.field2740 << 7) - (class36.field550 & 0x7F);
                int var20 = class245.field4011 + var16 - class172.field2740;
                int var21 = class125.field2138 + var17 - class172.field2740;
                if (var20 >= 0 && var21 >= 0 && var20 < class273.field4526 && var21 < class162.field2574) {
                    int var22;
                    if (class27.field332 == null) {
                        var22 = class208.field3270[0][var20][var21] + 128 - class66.field1175;
                    } else {
                        var22 = class27.field332[0][var20][var21] + 128 - class66.field1175;
                    }
                    int var23 = class208.field3270[3][var20][var21] - class66.field1175 - 1000;
                    class112.field1842[var16][var17] = class71.method603(var18, var23, var22, var19, var15);
                } else {
                    class112.field1842[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class172.field2740 + class172.field2740 + 1; var24++) {
            for (int var25 = 0; var25 < class172.field2740 + class172.field2740 + 1; var25++) {
                class166.field2653[var24][var25] = class112.field1842[var24][var25] || class112.field1842[var24 + 1][var25] || class112.field1842[var24][var25 + 1] || class112.field1842[var24 + 1][var25 + 1];
            }
        }
        class142.field2320 = arg6;
        class70.field1223 = arg7;
        class16.field191 = arg8;
        class278.field4573 = arg9;
        class336.field5310 = arg10;
        class143.method1102();
        if (class51.field799 != null) {
            class298.method2132(true);
            class311.method2211(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class42.field607) {
                class348.field5529 = false;
                class310.method2203(0, 0, -125);
                class167.method1296((float[]) null);
                class30.method201();
            }
            class298.method2132(false);
        }
        class311.method2211(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V", line = 592)
    public static void method1957(byte arg0) {
        if (arg0 != -2) {
            method1954(false, 118, (byte) 13, 36, 35, 112);
        }
        field4258 = null;
        field4269 = null;
        field4262 = null;
        field4257 = null;
    }
}
