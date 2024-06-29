import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class170 extends class184 {

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "S")
    public static short field2873 = 256;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field2880 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lok;")
    public static class146 field2867 = class235.method1724(-12908, "Cach-B");

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method1314(int arg0, byte arg1) {
        field2871++;
        class307 var2;
        if (class271.field4640 || class9.field187 == null) {
            var2 = new class307(512, 512);
        } else {
            var2 = (class307) class9.field187;
        }
        int[] var3 = var2.field5243;
        if (arg1 != 124) {
            return;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 2048 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class46.field775[arg0][var8][var6] & 0x18) == 0) {
                    class40.method278(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class46.field775[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class40.method278(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method2165();
        int var9 = ((int) (Math.random() * 20.0D)) + 238 - (10 - ((int) (Math.random() * 20.0D) + 228 << 16)) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8);
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class46.field775[arg0][var12][var11] & 0x18) == 0) {
                    class104.method707(arg1 ^ 0x7E, arg0, var10, var11, var9, var12);
                }
                if (arg0 < 3 && (class46.field775[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class104.method707(2, arg0 + 1, var10, var11, var9, var12);
                }
            }
        }
        class146.field2469 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class259.method1881(class203.field3387, var13, var14);
                if (var15 != 0L) {
                    class5 var17 = class112.method756((byte) 86, Integer.MAX_VALUE & (int) (var15 >>> 32));
                    int var18 = var17.field100;
                    if (var17.field105 != null) {
                        for (int var19 = 0; var19 < var17.field105.length; var19++) {
                            if (var17.field105[var19] != -1) {
                                class5 var20 = class112.method756((byte) -109, var17.field105[var19]);
                                if (var20.field100 >= 0) {
                                    var18 = var20.field100;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class251.field4202[class203.field3387].field2392;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > var13 - 3 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var13 + 3 > var21 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var14 - 3 < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var14 + 3 > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class91.field1440[class146.field2469] = var17.field68;
                        class214.field3533[class146.field2469] = var21;
                        class17.field344[class146.field2469] = var22;
                        class146.field2469++;
                    }
                }
            }
        }
        if (class271.field4640) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class9.field187 = new class8(var2);
        } else {
            class9.field187 = var2;
        }
        if (class271.field4640) {
            class181.field3040 = null;
        } else {
            class139.field2307.method146(arg1 ^ 0x4E94);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZIIII)V", line = 219)
    public static final void method1315(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2874++;
        if (class273.field4707 == arg0 && class55.field979 == arg1 && class201.field3358 == arg3 || class322.method2236(-7750)) {
            return;
        }
        class55.field979 = arg1;
        class273.field4707 = arg0;
        class201.field3358 = arg3;
        if (class322.method2236(arg4 ^ 0xFFFFE1D2)) {
            class201.field3358 = 0;
        }
        if (arg2) {
            class1.method4(-41, 28);
        } else {
            class1.method4(arg4 - 145, 25);
        }
        class55.method445(true, arg4 - 104, class71.field1169);
        int var7 = class201.field3357;
        class201.field3357 = arg1 * 8 - 48;
        int var8 = class15.field300;
        class15.field300 = arg0 * 8 - 48;
        class27.field475 = class88.method613(class55.field979 * 8, -99, class273.field4707 * 8);
        int var9 = class15.field300 - var8;
        int var10 = class15.field300;
        int var11 = class201.field3357 - var7;
        class277.field4758 = null;
        int var12 = class201.field3357;
        if (arg2) {
            class151.field2574 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class282 var17 = class173.field2906[var16];
                if (var17 != null) {
                    var17.field5380 -= var11 * 128;
                    var17.field5409 -= var9 * 128;
                    if (var17.field5409 >= 0 && var17.field5409 <= 13184 && var17.field5380 >= 0 && var17.field5380 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field5419[var18] -= var9;
                            var17.field5432[var18] -= var11;
                        }
                        class210.field3476[class151.field2574++] = var16;
                    } else {
                        class173.field2906[var16].field4838 = null;
                        class173.field2906[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class282 var14 = class173.field2906[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field5419[var15] -= var9;
                        var14.field5432[var15] -= var11;
                    }
                    var14.field5409 -= var9 * 128;
                    var14.field5380 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class234 var20 = class75.field1215[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field5419[var21] -= var9;
                    var20.field5432[var21] -= var11;
                }
                var20.field5380 -= var11 * 128;
                var20.field5409 -= var9 * 128;
            }
        }
        class203.field3387 = arg3;
        class102.field1639.method1718(arg5, arg4 ^ 0x6, arg6, false);
        byte var22 = 104;
        byte var23 = 0;
        byte var24 = 0;
        int var25 = arg4;
        byte var26 = 1;
        byte var27 = 1;
        if (var9 < 0) {
            var22 = -1;
            var23 = 103;
            var26 = -1;
        }
        if (var11 < 0) {
            var24 = 103;
            var25 = -1;
            var27 = -1;
        }
        for (int var28 = var23; var28 != var22; var28 += var26) {
            for (int var29 = var24; var29 != var25; var29 += var27) {
                int var30 = var28 + var9;
                int var31 = var29 + var11;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class268.field4614[var32][var28][var29] = class268.field4614[var32][var30][var31];
                    } else {
                        class268.field4614[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class185 var33 = (class185) class225.field3751.method1251(-53); var33 != null; var33 = (class185) class225.field3751.method1253(arg4 - 54)) {
            var33.field3095 -= var9;
            var33.field3087 -= var11;
            if (var33.field3095 < 0 || var33.field3087 < 0 || var33.field3095 >= 104 || var33.field3087 >= 104) {
                var33.method1325(-2935);
            }
        }
        if (arg2) {
            class161.field2719 -= var11 * 128;
            class104.field1693 -= var11;
            class107.field1742 -= var9 * 128;
            class227.field3787 -= var9;
            class63.field1094 -= var9;
            class145.field2423 -= var11;
        } else {
            class302.field5172 = 1;
        }
        if (class230.field3854 != 0) {
            class230.field3854 -= var9;
            class171.field2893 -= var11;
        }
        class89.field1428 = 0;
        if (class271.field4640 && arg2 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class1.method1(29659);
        }
        class127.field2066 = -1;
        class17.field345.method1257(2);
        class64.field1105.method1257(arg4 ^ 0x6A);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 466)
    public static final void method1316(int arg0, int arg1) {
        class236.field3937 = arg1;
        if (arg0 > 93) {
            field2876++;
            class138.field2299 = -1;
            class138.field2299 = -1;
            class95.method649((byte) -128);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 486)
    public static final void method1317(int arg0) {
        field2879++;
        class81.field1293 = 0;
        class182.field3045 = 0;
        class142.method1045(true);
        class140.method1037(19710);
        class152.method1201(-14850);
        int var1 = 103 % ((-arg0 - 34) / 38);
        class71.method526(118);
        for (int var2 = 0; var2 < class81.field1293; var2++) {
            int var3 = class190.field3140[var2];
            if (class203.field3385 != class75.field1215[var3].field5440) {
                if (class75.field1215[var3].field3914 > 0) {
                    class128.method910(class75.field1215[var3], 99);
                }
                class75.field1215[var3] = null;
            }
        }
        if (class46.field781 != client.field4080.field857) {
            throw new RuntimeException("gpp1 pos:" + client.field4080.field857 + " psize:" + class46.field781);
        }
        for (int var4 = 0; var4 < class158.field2670; var4++) {
            if (class75.field1215[class112.field1791[var4]] == null) {
                throw new RuntimeException("gpp2 pos:" + var4 + " size:" + class158.field2670);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 546)
    public static final void method1318(int arg0, int arg1, int arg2) {
        field2869++;
        class158 var3 = class206.method1564(arg1, 12, -110);
        var3.method1236(arg2 - 13730);
        var3.field2663 = arg0;
        if (arg2 != 0) {
            method1316(101, -1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)I", line = 561)
    public static final int method1319(int arg0, int arg1, int arg2, int arg3) {
        field2872++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        int var5 = 71 / ((arg0 - 40) / 62);
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Loh;IIILoh;)Lhe;", line = 596)
    public static final class90 method1320(class15 arg0, int arg1, int arg2, int arg3, class15 arg4) {
        field2878++;
        if (arg3 < 79) {
            field2867 = (class146) null;
        }
        return class230.method1688(arg2, arg1, 1221, arg0) ? class262.method1896((byte) -27, arg4.method92(arg2, 0, arg1)) : null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 622)
    public static void method1321(int arg0) {
        if (arg0 != 2875) {
            method1321(-50);
        }
        field2867 = null;
    }
}
