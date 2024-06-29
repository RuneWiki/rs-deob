import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class138 extends class50 {

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    private final int field2542;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    private final int field2536;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    private final int field2529;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    private final int field2537;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Lr;")
    private static class66 field2534 = class93.method641(43, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Lr;")
    public static class66 field2541 = field2534;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Lr;")
    public static class66 field2543 = class93.method641(43, "(Z");

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lr;")
    public static class66 field2532 = class93.method641(43, ")4l=");

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "Lc;")
    public static class125 field2535 = new class125();

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
    public static final void method946(byte arg0, int arg1) {
        class168 var2;
        if (class196.field3396 == null) {
            var2 = new class168(512, 512);
        } else {
            var2 = (class168) class196.field3396;
        }
        ++field2533;
        int[] var3 = var2.field3011;
        int var4 = var3.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; ~var6 > -104; ++var6) {
            int var24 = 24628 - -((-(var6 * 512) + 52736) * 4);
            for (int var25 = 1; var25 < 103; ++var25) {
                if (~(class47.field846[arg1][var25][var6] & 24) == -1) {
                    method949(var3, var24, 512, arg1, var25, var6);
                }
                if (~arg1 > -4 && ~(class47.field846[arg1 + 1][var25][var6] & 8) != -1) {
                    method949(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1148();
        if (arg0 != -124) {
            method954(-46, false);
        }
        int var7 = 238 + ((int) (Math.random() * 20.0D) - 10) << 16;
        int var8 = -10 + (int) (Math.random() * 20.0D) + 238 + (238 + (int) (Math.random() * 20.0D) + -10 << 8) + (228 - -((int) (20.0D * Math.random())) << 16);
        for (int var9 = 1; ~var9 > -104; ++var9) {
            for (int var23 = 1; ~var23 > -104; ++var23) {
                if ((24 & class47.field846[arg1][var23][var9]) == 0) {
                    class49.method345(arg1, var8, var23, var7, var9, (byte) 91);
                }
                if (~arg1 > -4 && ~(8 & class47.field846[arg1 - -1][var23][var9]) != -1) {
                    class49.method345(arg1 + 1, var8, var23, var7, var9, (byte) 92);
                }
            }
        }
        class242.field4233 = 0;
        for (int var10 = 0; ~var10 > -105; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                long var12 = class86.method612(class196.field3401, var10, var11);
                if (var12 != 0L) {
                    class231 var14 = class52.method359(arg0 + 212, Integer.MAX_VALUE & (int) (var12 >>> 32));
                    int var15 = var14.field4013;
                    if (var14.field4027 != null) {
                        for (int var16 = 0; var14.field4027.length > var16; ++var16) {
                            if (~var14.field4027[var16] != 0) {
                                class231 var17 = class52.method359(96, var14.field4027[var16]);
                                if (var17.field4013 >= 0) {
                                    var15 = var17.field4013;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var11;
                        int var19 = var10;
                        if (var15 != 22 && var15 != 29 && ~var15 != -35 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && var15 != 48) {
                            int[][] var20 = class193.field3346[class196.field3401].field2976;
                            for (int var21 = 0; ~var21 > -11; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (~var22 == -1 && ~var19 < -1 && ~var19 < ~(var10 + -3) && (var20[var19 + -1][var18] & 19661064) == 0) {
                                    --var19;
                                }
                                if (~var22 == -2 && ~var19 > -104 && ~(var10 + 3) < ~var19 && (19661184 & var20[var19 + 1][var18]) == 0) {
                                    ++var19;
                                }
                                if (~var22 == -3 && var18 > 0 && var18 > var11 + -3 && (var20[var19][var18 + -1] & 19661058) == 0) {
                                    --var18;
                                }
                                if (~var22 == -4 && var18 < 103 && var11 - -3 > var18 && ~(var20[var19][var18 - -1] & 19661088) == -1) {
                                    ++var18;
                                }
                            }
                        }
                        class53.field929[class242.field4233] = var14.field4064;
                        class32.field480[class242.field4233] = var19;
                        class215.field3709[class242.field4233] = var18;
                        ++class242.field4233;
                    }
                }
            }
        }
        class196.field3396 = var2;
        class52.field908.method1002(108);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZBI)Lr;")
    public static final class66 method947(int arg0, boolean arg1, byte arg2, int arg3) {
        ++field2546;
        if (~arg0 <= -3 && arg0 <= 36) {
            int var4 = arg3 / arg0;
            int var5 = 1;
            while (~var4 != -1) {
                ++var5;
                var4 /= arg0;
            }
            int var6 = var5;
            if (arg3 < 0 || arg1) {
                var6 = var5 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg3 >= 0) {
                if (arg1) {
                    var7[0] = 43;
                }
            } else {
                var7[0] = 45;
            }
            if (arg2 != 125) {
                method954(120, true);
            }
            for (int var8 = 0; ~var5 < ~var8; ++var8) {
                int var10 = arg3 % arg0;
                arg3 /= arg0;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                if (~var10 < -10) {
                    var10 += 39;
                }
                var7[var6 + -1 + -var8] = (byte) (var10 + 48);
            }
            class66 var9 = new class66();
            var9.field1283 = var7;
            var9.field1308 = var6;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lcj;IZI)[Lpc;")
    public static final class29[] method948(class28 arg0, int arg1, boolean arg2, int arg3) {
        ++field2530;
        if (arg2) {
            method947(-21, true, (byte) 121, 82);
        }
        return !class31.method174(-29381, arg3, arg0, arg1) ? null : class28.method125(32568);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
    public final void method80(int arg0, int arg1, int arg2) {
        ++field2540;
        int var4 = this.field2537 * arg0 >> 12;
        if (arg1 != 23700) {
            field2543 = null;
        }
        int var5 = this.field2529 * arg2 >> 12;
        int var6 = this.field2536 * arg0 >> 12;
        int var7 = this.field2542 * arg2 >> 12;
        class54.method366(super.field889, var6, var4, var5, var7, super.field895, super.field893, (byte) -12);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([IIIIII)V")
    private static final void method949(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class16 var6 = class110.field2124[arg3][arg4][arg5];
        if (var6 != null) {
            class162 var7 = var6.field206;
            if (var7 == null) {
                class213 var10 = var6.field227;
                if (var10 != null) {
                    int var11 = var10.field3656;
                    int var12 = var10.field3661;
                    int var13 = var10.field3668;
                    int var14 = var10.field3654;
                    int[] var15 = class139.field2549[var11];
                    int[] var16 = class162.field2907[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
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
                }
            } else {
                int var8 = var7.field2896;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lr;I)I")
    public static final int method950(class66 arg0, int arg1) {
        ++field2545;
        if (arg1 >= -104) {
            field2543 = null;
        }
        return arg0.method460((byte) -105) - -1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static final void method951(boolean arg0) {
        ++field2539;
        if (~class173.field3059 == -6) {
            if (arg0) {
                field2543 = null;
            }
            class173.field3059 = 6;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V")
    public final void method75(int arg0, int arg1, int arg2) {
        int var4 = this.field2537 * arg2 >> 12;
        ++field2531;
        int var5 = this.field2536 * arg2 >> 12;
        int var6 = -30 % ((-49 - arg1) / 43);
        int var7 = this.field2529 * arg0 >> 12;
        int var8 = this.field2542 * arg0 >> 12;
        class183.method1220(var5, (byte) 63, var8, var7, var4, super.field889);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field2548;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static void method952(int arg0) {
        field2532 = null;
        field2543 = null;
        int var1 = -84 % ((10 - arg0) / 38);
        field2534 = null;
        field2535 = null;
        field2541 = null;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static final void method953(int arg0) {
        ++field2538;
        if (class9.field101) {
            class109.field2119 = null;
            if (arg0 != 20) {
                field2535 = null;
            }
            class9.field101 = false;
            class170.field3026 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
    public static final void method954(int arg0, boolean arg1) {
        if (arg0 != -12915) {
            method952(47);
        }
        ++field2528;
        class129.method901(16322);
        if (~class244.field4258 == -31 || class244.field4258 == 25) {
            ++class72.field1424;
            if (class72.field1424 >= 50 || arg1) {
                class72.field1424 = 0;
                if (!class4.field47 && class101.field1972 != null) {
                    class28.field412.method578(-53, 115);
                    try {
                        class101.field1972.method1273(0, (byte) 33, class28.field412.field4335, class28.field412.field4350);
                        class28.field412.field4335 = 0;
                    } catch (IOException var2) {
                        class4.field47 = true;
                    }
                    ++class146.field2666;
                }
                class129.method901(arg0 + 29237);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIIIIII)V")
    public class138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2542 = arg3;
        this.field2536 = arg2;
        this.field2529 = arg1;
        this.field2537 = arg0;
    }
}
