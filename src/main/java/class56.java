import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class56 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field699 = 0;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lhb;")
    public static class318 field704 = new class318(64);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lhb;")
    public static class318 field707 = new class318(64);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field708 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    public static int[] field713 = new int[2];

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
    public static int[] field711 = new int[32768];

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field709 = -2;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[[I")
    public static int[][] field705;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 5)
    public static final void method368(int arg0) {
        if (arg0 != -1892) {
            field704 = (class318) null;
        }
        for (int var1 = 0; var1 < class42.field513; var1++) {
            class56 var2 = class179.method1239(16, var1);
            if (var2 != null && var2.field699 == 0) {
                class265.field4058[var1] = 0;
                class185.field2763[var1] = 0;
            }
        }
        field698++;
        class285.field4305 = new class192(16);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLre;I)V", line = 32)
    private final void method369(byte arg0, class263 arg1, int arg2) {
        if (arg0 == 37) {
            field702++;
            if (arg2 == 5) {
                this.field699 = arg1.method1830((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 49)
    public static void method370(int arg0) {
        int var1 = 28 % ((arg0 - 60) / 62);
        field704 = null;
        field708 = null;
        field711 = null;
        field705 = (int[][]) null;
        field707 = null;
        field713 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lf;IB)I", line = 74)
    public static final int method371(class329 arg0, int arg1, byte arg2) {
        field700++;
        if (arg0.field4950 == null || arg1 >= arg0.field4950.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4950[arg1];
            int var4 = 0;
            int var5 = 0;
            if (arg2 < 88) {
                method373(21, -113, 87, (byte) -59, 41, true);
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class167.field2511[var3[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 2) {
                    var9 = class284.field4296[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class184.field2748[var3[var5++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class329 var12 = class80.method541((byte) 96, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class325.method2219(var13, -9379).field3850 || class36.field443)) {
                        for (int var14 = 0; var14 < var12.field4995.length; var14++) {
                            if (var13 + 1 == var12.field4995[var14]) {
                                var9 += var12.field4999[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class185.field2763[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class291.field4435[class284.field4296[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class185.field2763[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class114.field1750.field2927;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class184.field2755[var15]) {
                            var9 += class284.field4296[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class329 var18 = class80.method541((byte) 96, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class325.method2219(var19, -9379).field3850 || class36.field443)) {
                        for (int var20 = 0; var20 < var18.field4995.length; var20++) {
                            if (var19 + 1 == var18.field4995[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class136.field2067;
                }
                if (var7 == 12) {
                    var9 = class183.field2739;
                }
                if (var7 == 13) {
                    int var21 = class185.field2763[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class310.method2144(1, var23);
                }
                if (var7 == 18) {
                    var9 = (class114.field1750.field1566 >> 7) + class217.field3309;
                }
                if (var7 == 19) {
                    var9 = (class114.field1750.field1505 >> 7) + class189.field2807;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lre;I)V", line = 285)
    public final void method372(class263 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1787(false);
            if (var3 == 0) {
                field701++;
                if (arg1 != 64) {
                    method373(-107, 53, -16, (byte) 125, 62, true);
                }
                return;
            }
            this.method369((byte) 37, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBIZ)V", line = 317)
    public static final void method373(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        class207.field3135++;
        field703++;
        class8.method37((byte) 118);
        if (arg5) {
            class90.method636(false, false, -4741, 0);
        } else {
            class241.method1632(0, (byte) -128);
            class90.method636(true, false, -4741, 0);
            if (class206.field3103 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class90.method636(false, false, -4741, var6);
                    class90.method636(false, true, -4741, var6);
                    class241.method1632(var6, (byte) -120);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class241.method1632(var7, (byte) -107);
                    class90.method636(false, false, -4741, var7);
                    class90.method636(false, true, -4741, var7);
                }
            }
        }
        if (!arg5) {
            class224.method1563(73);
        }
        class221.method1551(true);
        int var8 = -94 % ((-arg3 - 83) / 43);
        if (class117.field1817) {
            class257.method1744(arg1, arg0, true, 334, arg2, arg4);
            arg1 = class187.field2785;
            arg0 = class123.field1929;
            arg2 = class176.field2603;
            arg4 = class126.field1972;
        }
        if (field710 == 1) {
            int var9 = class234.field3525;
            int var10 = class284.field4297 + class193.field2890 & 0x7FF;
            if ((class226.field3445 / 256) > var9) {
                var9 = class226.field3445 / 256;
            }
            if (class326.field4913[4] && class107.field1668[4] + 128 > var9) {
                var9 = class107.field1668[4] + 128;
            }
            class296.method2066(var10, class271.field4155, 111, arg2, var9, (var9 * 3) + 600, class160.field2402, class74.method473(class114.field1750.field1505, class114.field1750.field1566, 64, class180.field2697) - 50);
        }
        int var11 = class302.field4612;
        int var12 = class287.field4338;
        int var13 = class203.field3052;
        int var14 = class160.field2392;
        int var15 = class84.field1249;
        for (int var16 = 0; var16 < 5; var16++) {
            if (class326.field4913[var16]) {
                int var17 = (int) ((double) (-class162.field2433[var16]) + (double) (class162.field2433[var16] * 2 + 1) * Math.random() + Math.sin((double) class266.field4077[var16] / 100.0D * (double) class140.field2120[var16]) * (double) class107.field1668[var16]);
                if (var16 == 3) {
                    class84.field1249 = class84.field1249 + var17 & 0x7FF;
                }
                if (var16 == 4) {
                    class160.field2392 += var17;
                    if (class160.field2392 < 128) {
                        class160.field2392 = 128;
                    }
                    if (class160.field2392 > 383) {
                        class160.field2392 = 383;
                    }
                }
                if (var16 == 1) {
                    class287.field4338 += var17;
                }
                if (var16 == 2) {
                    class203.field3052 += var17;
                }
                if (var16 == 0) {
                    class302.field4612 += var17;
                }
            }
        }
        class249.method1683((byte) -81);
        if (class117.field1817) {
            class308.method2123(arg1, arg0, arg1 + arg4, arg0 + arg2);
            float var18 = (float) class84.field1249 * 0.17578125F;
            float var19 = (float) class160.field2392 * 0.17578125F;
            if (field710 == 3) {
                var18 = class19.field230 * 360.0F / 6.2831855F;
                var19 = class216.field3261 * 360.0F / 6.2831855F;
            }
            class117.method822(arg1, arg0, arg4, arg2, arg1 + (arg4 / 2), arg2 / 2 + arg0, var19, var18, class30.field405, class30.field405);
        } else {
            class46.method301(arg1, arg0, arg1 + arg4, arg0 - -arg2);
            class148.method1070();
        }
        if (class5.field27 || class317.field4783 < arg1 || class317.field4783 >= (arg1 + arg4) || class121.field1897 < arg0 || (arg0 + arg2) <= class121.field1897) {
            class131.field2026 = false;
            class21.field256 = 0;
        } else {
            class21.field256 = 0;
            int var20 = class300.field4591;
            int var21 = class161.field2418;
            int var22 = class169.field2532;
            class49.field627 = (class317.field4783 - arg1) * (var20 - var21) / arg4 + var21;
            class131.field2026 = true;
            int var23 = class104.field1646;
            class318.field4785 = (class121.field1897 - arg0) * (var23 - var22) / arg2 + var22;
        }
        class237.method1621(92);
        byte var24 = class130.method965((byte) 120) == 2 ? (byte) class207.field3135 : 1;
        if (class117.field1817) {
            boolean var25 = false;
            class117.method808();
            class117.method810(true);
            class117.method818(true);
            int var26;
            if (class293.field4490 == 10) {
                var26 = class29.method184(class272.field4167, class203.field3052 >> 10, (byte) 127, class288.field4352, class302.field4612 >> 10);
            } else {
                var26 = class29.method184(class272.field4167, class114.field1750.field1516[0] >> 3, (byte) 125, class288.field4352, class114.field1750.field1541[0] >> 3);
            }
            class31.method213(class304.field4641, !class210.field3171);
            class117.method807(var26);
            class64.method427(class287.field4338, class302.field4612, class203.field3052, class84.field1249, 3438, class160.field2392);
            class117.field1818 = class304.field4641;
            class23.method157(class302.field4612, class287.field4338, class203.field3052, class160.field2392, class84.field1249, class81.field1136, field713, class162.field2445, class74.field958, class8.field55, class210.field3167, class180.field2697 + 1, var24, class114.field1750.field1566 >> 7, class114.field1750.field1505 >> 7);
            class326.field4911 = true;
            class31.method211();
            class64.method427(0, 0, 0, 0, 3438, 0);
            class237.method1621(83);
            class242.method1644();
            class204.method1404(class30.field405, arg0, arg4, class30.field405, -100, arg2, arg1);
            class109.method760((byte) 105, class30.field405, arg2, arg4, arg1, class30.field405, arg0);
        } else {
            class46.method312(arg1, arg0, arg4, arg2, 0);
            class23.method157(class302.field4612, class287.field4338, class203.field3052, class160.field2392, class84.field1249, class81.field1136, field713, class162.field2445, class74.field958, class8.field55, class210.field3167, class180.field2697 + 1, var24, class114.field1750.field1566 >> 7, class114.field1750.field1505 >> 7);
            class237.method1621(110);
            class242.method1644();
            class204.method1404(256, arg0, arg4, 256, -100, arg2, arg1);
            class109.method760((byte) 76, 256, arg2, arg4, arg1, 256, arg0);
        }
        ((class292) class148.field2233).method2040((byte) -8, class288.field4352);
        class134.method982(arg0, arg1, arg4, (byte) -98, arg2);
        class84.field1249 = var15;
        class203.field3052 = var13;
        class160.field2392 = var14;
        class302.field4612 = var11;
        class287.field4338 = var12;
        if (class323.field4877 && class274.field4208.method653(512) == 0) {
            class323.field4877 = false;
        }
        if (class323.field4877) {
            if (class117.field1817) {
                class308.method2126(arg1, arg0, arg4, arg2, 0);
            } else {
                class46.method312(arg1, arg0, arg4, arg2, 0);
            }
            class274.method1930(class35.field434, false, 1);
        }
        if (!arg5 && !class323.field4877 && !class5.field27 && class317.field4783 >= arg1 && arg1 + arg4 > class317.field4783 && arg0 <= class121.field1897 && class121.field1897 < (arg0 + arg2)) {
            class80.method542(arg0, (byte) 86, class121.field1897, arg1, class317.field4783, arg4, arg2);
        }
    }
}
