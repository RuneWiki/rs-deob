import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class256 {

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Z")
    public static boolean field4241 = false;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lbd;")
    public static class162 field4237 = class17.method142(0, "_");

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field4256 = 127;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lbd;")
    public static class162 field4250 = class17.method142(0, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lvb;")
    public static class166 field4234;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "Lek;")
    public class202 field4258;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[I")
    public int[] field4242;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
    public int[] field4245;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[I")
    public int[] field4249;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[I")
    public int[] field4252;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[I")
    public int[] field4254;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "[I")
    public int[] field4255;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[Lek;")
    public class202[] field4236;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[[I")
    public int[][] field4235;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "[[I")
    public int[][] field4247;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V", line = 4)
    public static final void method1766(boolean arg0, boolean arg1) {
        if (!arg1) {
            field4234 = (class166) null;
        }
        field4244++;
        if (arg0) {
            if (class265.field4412 != -1) {
                class61.method417(2, class265.field4412);
            }
            for (class172 var2 = (class172) class137.field2440.method1666((byte) -99); var2 != null; var2 = (class172) class137.field2440.method1673((byte) -120)) {
                class178.method1349(arg1, true, var2);
            }
            class265.field4412 = -1;
            class137.field2440 = new class235(8);
            class194.method1437(-6);
            class265.field4412 = class178.field3044;
            class162.method1284(false, -128);
            class119.method970((byte) 125);
            class141.method1104(84374508, class265.field4412);
        }
        class122.field2215 = new class39();
        class122.field2215.field5047 = 3000;
        class122.field2215.field5013 = 3000;
        if (!class117.field2159) {
            class126.method1019(11446, class35.field577);
            class122.method984(10, 2047);
            return;
        }
        if (class302.field5085 == 2) {
            class160.field2800 = class162.field2878 << 7;
            class67.field1083 = class13.field212 << 7;
        } else {
            class274.method1861(arg1);
        }
        class245.method1729((byte) -114);
        class160.method1228(71);
        class122.method984(28, 2047);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILrg;)V", line = 81)
    public static final void method1767(int arg0, class301 arg1) {
        arg1.field5064 = arg1.field5068;
        field4246++;
        if (arg1.field5006 == 0) {
            arg1.field5060 = 0;
            return;
        }
        if (arg1.field5057 != -1 && arg1.field5040 == 0) {
            class142 var2 = class139.method1084(-60, arg1.field5057);
            if (arg1.field5022 > 0 && var2.field2542 == 0) {
                arg1.field5060++;
                return;
            }
            if (arg1.field5022 <= 0 && var2.field2524 == 0) {
                arg1.field5060++;
                return;
            }
        }
        int var3 = arg1.field5013;
        int var4 = arg1.field5047;
        int var5 = arg1.field5050[arg1.field5006 - 1] * 128 + arg1.method293((byte) 25) * 64;
        int var6 = arg1.field5034[arg1.field5006 - 1] * 128 + arg1.method293((byte) 25) * 64;
        if (var5 - var3 > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || (var6 - var4) < -256) {
            arg1.field5047 = var6;
            arg1.field5013 = var5;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg1.field5025 = 1280;
            } else if (var4 <= var6) {
                arg1.field5025 = 1536;
            } else {
                arg1.field5025 = 1792;
            }
        } else if (var3 <= var5) {
            if (var4 < var6) {
                arg1.field5025 = 1024;
            } else if (var4 > var6) {
                arg1.field5025 = 0;
            }
        } else if (var6 > var4) {
            arg1.field5025 = 768;
        } else if (var6 < var4) {
            arg1.field5025 = 256;
        } else {
            arg1.field5025 = 512;
        }
        int var7 = arg1.field5025 - arg1.field5018 & 0x7FF;
        int var8 = arg1.field5072;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field5042;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field5066;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field5043;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg1.field5042;
        }
        arg1.field5064 = var8;
        boolean var10 = true;
        if (arg1 instanceof class60) {
            var10 = ((class60) arg1).field926.field1482;
        }
        if (var10) {
            if (arg1.field5025 != arg1.field5018 && arg1.field5019 == -1 && arg1.field5030 != 0) {
                var9 = 2;
            }
            if (arg1.field5006 > 2) {
                var9 = 6;
            }
            if (arg1.field5006 > 3) {
                var9 = 8;
            }
            if (arg1.field5060 > 0 && arg1.field5006 > 1) {
                var9 = 8;
                arg1.field5060--;
            }
        } else {
            if (arg1.field5006 > 1) {
                var9 = 6;
            }
            if (arg1.field5006 > 2) {
                var9 = 8;
            }
            if (arg1.field5060 > 0 && arg1.field5006 > 1) {
                arg1.field5060--;
                var9 = 8;
            }
        }
        int var11 = -1 / ((arg0 + 40) / 58);
        if (arg1.field5026[arg1.field5006 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field5047 += var9;
            if (arg1.field5047 > var6) {
                arg1.field5047 = var6;
            }
        } else if (var6 < var4) {
            arg1.field5047 -= var9;
            if (arg1.field5047 < var6) {
                arg1.field5047 = var6;
            }
        }
        if (var9 >= 8 && arg1.field5064 == arg1.field5042 && arg1.field5021 != -1) {
            arg1.field5064 = arg1.field5021;
        }
        if (var3 < var5) {
            arg1.field5013 += var9;
            if (var5 < arg1.field5013) {
                arg1.field5013 = var5;
            }
        } else if (var3 > var5) {
            arg1.field5013 -= var9;
            if (var5 > arg1.field5013) {
                arg1.field5013 = var5;
            }
        }
        if (arg1.field5013 == var5 && arg1.field5047 == var6) {
            arg1.field5006--;
            if (arg1.field5022 > 0) {
                arg1.field5022--;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)J", line = 298)
    public static final long method1768(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        return var3 == null || var3.field3763 == null ? 0L : var3.field3763.field2656;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V", line = 313)
    public static final void method1769(boolean arg0, int arg1) {
        if (arg1 == 1) {
            class198.field3369 = arg0;
            field4251++;
            field4241 = !class4.method19(-126);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBIII)I", line = 325)
    public static final int method1770(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4248++;
        if (class270.field4514) {
            class270.field4514 = false;
            arg4 = 1000000;
        }
        class160 var5 = class96.field1758[arg3][arg2];
        int var6 = var5.field2802;
        float var7 = var5.field2795;
        int var8 = var5.field2806;
        float var9 = ((float) arg0 * 0.1F + 0.7F) * var5.field2799;
        int var10 = 4 % ((5 - arg1) / 46);
        float var11 = var5.field2798;
        int var12 = var5.field2796;
        if (!class259.field4317) {
            var12 = 0;
        }
        if (class72.field1147 != var6 || class295.field4947 != var9 || class148.field2668 != var7 || class4.field31 != var11 || class119.field2176 != var8 || class120.field2189 != var12) {
            class4.field31 = var11;
            class72.field1147 = var6;
            class170.field2960 = class13.field219;
            class252.field4207 = class298.field4998;
            class148.field2668 = var7;
            class119.field2176 = var8;
            class120.field2189 = var12;
            class104.field1879 = class133.field2380;
            class32.field530 = 0;
            class178.field3054 = class194.field3267;
            class295.field4947 = var9;
            class270.field4522 = class1.field2;
            class266.field4423 = class201.field3416;
        }
        if (class32.field530 < 65536) {
            class32.field530 += arg4 * 250;
            if (class32.field530 >= 65536) {
                class32.field530 = 65536;
            }
            int var13 = 65536 - class32.field530 >> 8;
            int var14 = class32.field530 >> 8;
            class201.field3416 = ((class72.field1147 & 0xFF00) * var14 + (class266.field4423 & 0xFF00) * var13 & 0xFF0000) + ((class72.field1147 & 0xFF00FF) * var14 + (class266.field4423 & 0xFF00FF) * var13 & 0xFF00FF00) >> 8;
            class1.field2 = ((class270.field4522 & 0xFF00FF) * var13 + (class119.field2176 & 0xFF00FF) * var14 & 0xFF00FF00) + ((class270.field4522 & 0xFF00) * var13 + (class119.field2176 & 0xFF00) * var14 & 0xFF0000) >> 8;
            class194.field3267 = class178.field3054 * var13 + class120.field2189 * var14 >> 8;
            float var15 = (float) (65536 - class32.field530) / 65536.0F;
            float var16 = (float) class32.field530 / 65536.0F;
            class298.field4998 = class4.field31 * var16 + class252.field4207 * var15;
            class13.field219 = class295.field4947 * var16 + class170.field2960 * var15;
            class133.field2380 = class148.field2668 * var16 + class104.field1879 * var15;
        }
        class108.method872(class201.field3416, class13.field219, class133.field2380, class298.field4998);
        class108.method881(class1.field2, class194.field3267);
        class108.method876((float) class267.field4444, (float) class110.field1981, (float) class90.field1603);
        class108.method880();
        return class1.field2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 410)
    public static final void method1771(byte arg0) {
        if (class82.field1433 > 0) {
            class82.field1433--;
        }
        field4240++;
        if (class181.field3119 > 1) {
            class181.field3119--;
            class268.field4490 = class284.field4808;
        }
        if (arg0 >= -120) {
            method1770(107, (byte) -48, 87, 103, 10);
        }
        if (class163.field2890) {
            class163.field2890 = false;
            class141.method1099(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class258.method1787((byte) -69); var1++) {
        }
        if (class262.field4380 != 30) {
            return;
        }
        class217.method1576(24067, 74, class187.field3229);
        Object var2 = class184.field3182.field1164;
        synchronized (class184.field3182.field1164) {
            if (!class170.field2953) {
                class184.field3182.field1168 = 0;
            } else if (class238.field3954 != 0 || class184.field3182.field1168 >= 40) {
                class111.field2011++;
                class187.field3229.method338(145, (byte) 8);
                class187.field3229.method753(0, true);
                int var3 = class187.field3229.field1653;
                int var4 = 0;
                for (int var5 = 0; var5 < class184.field3182.field1168 && (class187.field3229.field1653 - var3) < 240; var5++) {
                    int var6 = class184.field3182.field1170[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class184.field3182.field1171[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    var4++;
                    boolean var8 = false;
                    if (class184.field3182.field1170[var5] == -1 && class184.field3182.field1171[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class289.field4873 != var7 || class245.field4067 != var6) {
                        int var9 = var7 - class289.field4873;
                        int var10 = var6 - class245.field4067;
                        class289.field4873 = var7;
                        class245.field4067 = var6;
                        if (class146.field2638 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class187.field3229.method751((var9 << 6) + (class146.field2638 << 12) + var10, -1044017976);
                            class146.field2638 = 0;
                        } else if (class146.field2638 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class187.field3229.method753(class146.field2638 + 128, true);
                            var9 += 128;
                            class187.field3229.method751((var9 << 8) + var10, -1044017976);
                            class146.field2638 = 0;
                        } else if (class146.field2638 < 32) {
                            class187.field3229.method753(class146.field2638 + 192, true);
                            if (var8) {
                                class187.field3229.method730(false, Integer.MIN_VALUE);
                            } else {
                                class187.field3229.method730(false, var6 << 16 | var7);
                            }
                            class146.field2638 = 0;
                        } else {
                            class187.field3229.method751(class146.field2638 + 57344, -1044017976);
                            if (var8) {
                                class187.field3229.method730(false, Integer.MIN_VALUE);
                            } else {
                                class187.field3229.method730(false, var7 | var6 << 16);
                            }
                            class146.field2638 = 0;
                        }
                    } else if (class146.field2638 < 2047) {
                        class146.field2638++;
                    }
                }
                class187.field3229.method742((byte) 77, class187.field3229.field1653 - var3);
                if (class184.field3182.field1168 <= var4) {
                    class184.field3182.field1168 = 0;
                } else {
                    class184.field3182.field1168 -= var4;
                    for (int var11 = 0; var11 < class184.field3182.field1168; var11++) {
                        class184.field3182.field1171[var11] = class184.field3182.field1171[var4 + var11];
                        class184.field3182.field1170[var11] = class184.field3182.field1170[var4 + var11];
                    }
                }
            }
        }
        if (class238.field3954 != 0) {
            class59.field918++;
            long var13 = (class66.field1048 - class229.field3818) / 50L;
            int var15 = class183.field3158;
            class229.field3818 = class66.field1048;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class153.field2721;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            int var18 = (int) var13;
            if (class238.field3954 == 2) {
                var17 = 1;
            }
            class187.field3229.method338(252, (byte) 8);
            class187.field3229.method730(false, var16 | var15 << 16);
            class187.field3229.method751(var17 << 15 | var18, -1044017976);
        }
        if (class63.field991[96] || class63.field991[97] || class63.field991[98] || class63.field991[99]) {
            class78.field1334 = true;
        }
        if (class262.field4367 > 0) {
            class262.field4367--;
        }
        if (class78.field1334 && class262.field4367 <= 0) {
            class262.field4367 = 20;
            class78.field1334 = false;
            class187.field3229.method338(118, (byte) 8);
            class286.field4820++;
            class187.field3229.method731(-4, class160.field2803);
            class187.field3229.method759(false, class265.field4414);
        }
        if (class141.field2498 && !class251.field4203) {
            class127.field2303++;
            class251.field4203 = true;
            class187.field3229.method338(221, (byte) 8);
            class187.field3229.method753(1, true);
        }
        if (!class141.field2498 && class251.field4203) {
            class251.field4203 = false;
            class187.field3229.method338(221, (byte) 8);
            class127.field2303++;
            class187.field3229.method753(0, true);
        }
        if (!class87.field1558) {
            class260.field4340++;
            class187.field3229.method338(161, (byte) 8);
            class187.field3229.method746(124, class34.method270((byte) -64));
            class87.field1558 = true;
        }
        class273.method1852(128);
        if (class262.field4380 != 30) {
            return;
        }
        class73.method526(64);
        class275.method1868(15812);
        class74.field1175++;
        if (class74.field1175 > 750) {
            class141.method1099(40);
            return;
        }
        class61.method418((byte) 124);
        class67.method476((byte) -79);
        class122.method989(10);
        if (class314.field5304 != null) {
            class96.method775(true);
        }
        for (int var19 = class136.method1069(true, 59); var19 != -1; var19 = class136.method1069(false, 70)) {
            class55.method389(0, var19);
            class82.field1434[class92.method695(class223.field3733++, 31)] = var19;
        }
        for (class63 var20 = class243.method1721(0); var20 != null; var20 = class243.method1721(0)) {
            int var21 = var20.method429((byte) -16);
            int var22 = var20.method434((byte) 120);
            if (var21 == 1) {
                class8.field91[var22] = var20.field971;
                class239.field3972[class92.method695(31, class267.field4458++)] = var22;
            } else if (var21 == 2) {
                class114.field2038[var22] = var20.field987;
                class68.field1100[class92.method695(31, class72.field1146++)] = var22;
            } else if (var21 == 3) {
                class78 var42 = class61.method419((byte) 28, var22);
                if (!var20.field987.method1248(var42.field1370, (byte) 103)) {
                    var42.field1370 = var20.field987;
                    class55.method386(0, var42);
                }
            } else if (var21 == 4) {
                class78 var39 = class61.method419((byte) 28, var22);
                int var40 = var20.field980;
                int var41 = var20.field971;
                if (var39.field1361 != var41 || var39.field1322 != var40) {
                    var39.field1361 = var41;
                    var39.field1322 = var40;
                    class55.method386(0, var39);
                }
            } else if (var21 == 5) {
                class78 var23 = class61.method419((byte) 28, var22);
                if (var20.field971 != var23.field1317 || var20.field971 == -1) {
                    var23.field1270 = 0;
                    var23.field1317 = var20.field971;
                    var23.field1288 = 0;
                    class55.method386(0, var23);
                }
            } else if (var21 == 6) {
                int var24 = var20.field971;
                int var25 = (var24 & 0x7F18) >> 10;
                int var26 = var24 >> 5 & 0x1F;
                int var27 = var24 & 0x1F;
                int var28 = (var27 << 3) + (var25 << 19) + (var26 << 11);
                class78 var29 = class61.method419((byte) 28, var22);
                if (var29.field1339 != var28) {
                    var29.field1339 = var28;
                    class55.method386(0, var29);
                }
            } else if (var21 == 7) {
                class78 var30 = class61.method419((byte) 28, var22);
                boolean var31 = var20.field971 == 1;
                if (var31 != var30.field1318) {
                    var30.field1318 = var31;
                    class55.method386(0, var30);
                }
            } else if (var21 == 8) {
                class78 var38 = class61.method419((byte) 28, var22);
                if (var20.field971 != var38.field1237 || var20.field980 != var38.field1323 || var20.field976 != var38.field1272) {
                    var38.field1237 = var20.field971;
                    var38.field1272 = var20.field976;
                    var38.field1323 = var20.field980;
                    if (var38.field1344 != -1) {
                        if (var38.field1273 > 0) {
                            var38.field1272 = var38.field1272 * 32 / var38.field1273;
                        } else if (var38.field1219 > 0) {
                            var38.field1272 = var38.field1272 * 32 / var38.field1219;
                        }
                    }
                    class55.method386(0, var38);
                }
            } else if (var21 == 9) {
                class78 var37 = class61.method419((byte) 28, var22);
                if (var20.field971 != var37.field1344 || var20.field980 != var37.field1271) {
                    var37.field1344 = var20.field971;
                    var37.field1271 = var20.field980;
                    class55.method386(0, var37);
                }
            } else if (var21 == 10) {
                class78 var32 = class61.method419((byte) 28, var22);
                if (var20.field971 != var32.field1327 || var20.field980 != var32.field1253 || var20.field976 != var32.field1249) {
                    var32.field1249 = var20.field976;
                    var32.field1253 = var20.field980;
                    var32.field1327 = var20.field971;
                    class55.method386(0, var32);
                }
            } else if (var21 == 11) {
                class78 var36 = class61.method419((byte) 28, var22);
                var36.field1244 = 0;
                var36.field1377 = var36.field1375 = var20.field971;
                var36.field1289 = var36.field1239 = var20.field980;
                var36.field1254 = 0;
                class55.method386(0, var36);
            } else if (var21 == 12) {
                class78 var34 = class61.method419((byte) 28, var22);
                int var35 = var20.field971;
                if (var34 != null && var34.field1231 == 0) {
                    if (var35 > var34.field1220 - var34.field1367) {
                        var35 = var34.field1220 - var34.field1367;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field1258 != var35) {
                        var34.field1258 = var35;
                        class55.method386(0, var34);
                    }
                }
            } else if (var21 == 13) {
                class78 var33 = class61.method419((byte) 28, var22);
                var33.field1233 = var20.field971;
            }
        }
        if (class110.field1977 != 0) {
            class34.field551 += 20;
            if (class34.field551 >= 400) {
                class110.field1977 = 0;
            }
        }
        class149.field2680++;
        if (class205.field3458 != null) {
            class291.field4908++;
            if (class291.field4908 >= 15) {
                class55.method386(0, class205.field3458);
                class205.field3458 = null;
            }
        }
        if (class115.field2041 != null) {
            class55.method386(0, class115.field2041);
            if (class203.field3430 + 5 < class109.field1961 || class109.field1961 < class203.field3430 - 5 || class167.field2946 + 5 < class274.field4554 || class274.field4554 < (class167.field2946 - 5)) {
                class64.field1008 = true;
            }
            class163.field2882++;
            if (class92.field1628 == 0) {
                if (class64.field1008 && class163.field2882 >= 5) {
                    if (class216.field3606 == class115.field2041 && class57.field886 != class235.field3931) {
                        class78 var43 = class115.field2041;
                        class231.field3856++;
                        byte var44 = 0;
                        if (class182.field3130 == 1 && var43.field1313 == 206) {
                            var44 = 1;
                        }
                        if (var43.field1381[class235.field3931] <= 0) {
                            var44 = 0;
                        }
                        if (class142.method1110(client.method861(var43), true)) {
                            int var47 = class235.field3931;
                            int var48 = class57.field886;
                            var43.field1381[var47] = var43.field1381[var48];
                            var43.field1368[var47] = var43.field1368[var48];
                            var43.field1381[var48] = -1;
                            var43.field1368[var48] = 0;
                        } else if (var44 == 1) {
                            int var45 = class235.field3931;
                            int var46 = class57.field886;
                            while (var45 != var46) {
                                if (var46 > var45) {
                                    var43.method598(var46, 1, var46 - 1);
                                    var46--;
                                } else if (var45 > var46) {
                                    var43.method598(var46, 1, var46 + 1);
                                    var46++;
                                }
                            }
                        } else {
                            var43.method598(class57.field886, 1, class235.field3931);
                        }
                        class187.field3229.method338(202, (byte) 8);
                        class187.field3229.method730(false, class115.field2041.field1235);
                        class187.field3229.method739(121, var44);
                        class187.field3229.method759(false, class57.field886);
                        class187.field3229.method751(class235.field3931, -1044017976);
                    }
                } else if ((class207.field3495 == 1 || class153.method1198(class293.field4931 - 1, 2000)) && class293.field4931 > 2) {
                    class178.method1346((byte) -124);
                } else if (class293.field4931 > 0) {
                    class289.method2002(-1);
                }
                class238.field3954 = 0;
                class115.field2041 = null;
                class291.field4908 = 10;
            }
        }
        class277.field4635 = null;
        class78 var49 = class289.field4863;
        class289.field4863 = null;
        class78 var50 = class70.field1111;
        class58.field909 = false;
        class70.field1111 = null;
        class230.field3839 = false;
        for (class209.field3529 = 0; class27.method220(25039) && class209.field3529 < 128; class209.field3529++) {
            class23.field393[class209.field3529] = class261.field4351;
            class56.field878[class209.field3529] = class308.field5174;
        }
        class123.field2236 = null;
        class314.field5304 = null;
        if (class265.field4412 != -1) {
            class255.method1764(class252.field4205, 0, class251.field4201, 0, class265.field4412, 0, -1803, 0);
        }
        class284.field4808++;
        if (class123.field2236 != null) {
            class70.method508(class220.field3681, class123.field2236, (byte) -120, class170.field2958);
            class123.field2236 = null;
        }
        while (true) {
            class180 var51;
            class78 var52;
            class78 var53;
            do {
                var51 = (class180) class39.field619.method170(127);
                if (var51 == null) {
                    while (true) {
                        class180 var54;
                        class78 var55;
                        class78 var56;
                        do {
                            var54 = (class180) class96.field1750.method170(124);
                            if (var54 == null) {
                                while (true) {
                                    class180 var57;
                                    class78 var58;
                                    class78 var59;
                                    do {
                                        var57 = (class180) class292.field4920.method170(92);
                                        if (var57 == null) {
                                            if (class168.field2948 && class314.field5304 == null) {
                                                class168.field2948 = false;
                                            }
                                            if (class17.field284 != null) {
                                                class153.method1191((byte) -56);
                                            }
                                            if (class83.field1438 > 0 && class63.field991[82] && class63.field991[81] && class157.field2766 != 0) {
                                                int var60 = class157.field2765 - class157.field2766;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class104.method848(var60, class258.field4294 + class122.field2215.field5034[0], 21, class178.field3052 + class122.field2215.field5050[0]);
                                            }
                                            if (class302.field5095 != -1) {
                                                int var61 = class302.field5095;
                                                int var62 = class286.field4828;
                                                if (class83.field1438 > 0 && class63.field991[82] && class63.field991[81]) {
                                                    class104.method848(class157.field2765, class258.field4294 + var62, 36, class178.field3052 + var61);
                                                } else if (class8.field94) {
                                                    class187.field3229.method338(235, (byte) 8);
                                                    class230.field3822++;
                                                    class187.field3229.method746(122, class282.field4795);
                                                    class187.field3229.method751(class178.field3052 + var61, -1044017976);
                                                    class187.field3229.method751(class258.field4294 + var62, -1044017976);
                                                    class187.field3229.method731(-4, class46.field729);
                                                    class225.field3751 = class183.field3158;
                                                    class110.field1977 = 1;
                                                    class286.field4822 = class153.field2721;
                                                    class34.field551 = 0;
                                                } else {
                                                    boolean var63 = class163.method1292(class122.field2215.field5050[0], 0, true, 0, 0, var61, 0, class122.field2215.field5034[0], var62, 0, 0, 1);
                                                    if (var63) {
                                                        class225.field3751 = class183.field3158;
                                                        class286.field4822 = class153.field2721;
                                                        class110.field1977 = 1;
                                                        class34.field551 = 0;
                                                    }
                                                }
                                                class302.field5095 = -1;
                                                class8.field94 = false;
                                            }
                                            class305.method2077(0);
                                            if (class289.field4863 != var49) {
                                                if (var49 != null) {
                                                    class55.method386(0, var49);
                                                }
                                                if (class289.field4863 != null) {
                                                    class55.method386(0, class289.field4863);
                                                }
                                            }
                                            if (class70.field1111 != var50 && class317.field5337 == class290.field4894) {
                                                if (var50 != null) {
                                                    class55.method386(0, var50);
                                                }
                                                if (class70.field1111 != null) {
                                                    class55.method386(0, class70.field1111);
                                                }
                                            }
                                            if (class70.field1111 == null) {
                                                if (class290.field4894 > 0) {
                                                    class290.field4894--;
                                                }
                                            } else if (class290.field4894 < class317.field5337) {
                                                class290.field4894++;
                                                if (class317.field5337 == class290.field4894) {
                                                    class55.method386(0, class70.field1111);
                                                }
                                            }
                                            if (class302.field5085 == 1) {
                                                class91.method687(13158);
                                            } else if (class302.field5085 == 2) {
                                                class34.method269(-28);
                                            } else {
                                                class274.method1861(true);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class62.field968[var64]++;
                                            }
                                            int var65 = class205.method1519(128);
                                            int var66 = class25.method205((byte) -105);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class82.field1433 = 250;
                                                class306.field5147++;
                                                class156.method1216((byte) -110, 4000);
                                                class187.field3229.method338(72, (byte) 8);
                                            }
                                            if (class177.field3041 != null && class177.field3041.field2934 == 1) {
                                                if (class177.field3041.field2933 != null) {
                                                    class72.method520(class307.field5157, 95, class244.field4065);
                                                }
                                                class244.field4065 = false;
                                                class307.field5157 = null;
                                                class177.field3041 = null;
                                            }
                                            class180.field3091++;
                                            class179.field3077++;
                                            class56.field881++;
                                            if (class56.field881 > 500) {
                                                class56.field881 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x4) == 4) {
                                                    class105.field1910 += class105.field1922;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class34.field561 += class12.field211;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class39.field620 += class296.field4961;
                                                }
                                            }
                                            if (class105.field1910 < -40) {
                                                class105.field1922 = 1;
                                            }
                                            if (class105.field1910 > 40) {
                                                class105.field1922 = -1;
                                            }
                                            if (class34.field561 < -55) {
                                                class12.field211 = 2;
                                            }
                                            if (class39.field620 < -50) {
                                                class296.field4961 = 2;
                                            }
                                            if (class34.field561 > 55) {
                                                class12.field211 = -2;
                                            }
                                            if (class39.field620 > 50) {
                                                class296.field4961 = -2;
                                            }
                                            if (class180.field3091 > 500) {
                                                class180.field3091 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class23.field396 += class93.field1646;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class305.field5137 += class98.field1782;
                                                }
                                            }
                                            if (class23.field396 < -20) {
                                                class93.field1646 = 1;
                                            }
                                            if (class23.field396 > 10) {
                                                class93.field1646 = -1;
                                            }
                                            if (class305.field5137 < -60) {
                                                class98.field1782 = 2;
                                            }
                                            if (class305.field5137 > 60) {
                                                class98.field1782 = -2;
                                            }
                                            if (class179.field3077 > 50) {
                                                class187.field3229.method338(173, (byte) 8);
                                                class146.field2649++;
                                            }
                                            if (class131.field2365) {
                                                class289.method2008(28);
                                                class131.field2365 = false;
                                            }
                                            try {
                                                if (class116.field2054 != null && class187.field3229.field1653 > 0) {
                                                    class116.field2054.method1827(0, 37, class187.field3229.field1681, class187.field3229.field1653);
                                                    class179.field3077 = 0;
                                                    class187.field3229.field1653 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class141.method1099(40);
                                            }
                                            return;
                                        }
                                        var58 = var57.field3099;
                                        if (var58.field1276 < 0) {
                                            break;
                                        }
                                        var59 = class61.method419((byte) 28, var58.field1371);
                                    } while (var59 == null || var59.field1363 == null || var59.field1363.length <= var58.field1276 || var59.field1363[var58.field1276] != var58);
                                    class31.method257(-32581, var57);
                                }
                            }
                            var55 = var54.field3099;
                            if (var55.field1276 < 0) {
                                break;
                            }
                            var56 = class61.method419((byte) 28, var55.field1371);
                        } while (var56 == null || var56.field1363 == null || var56.field1363.length <= var55.field1276 || var56.field1363[var55.field1276] != var55);
                        class31.method257(-32581, var54);
                    }
                }
                var52 = var51.field3099;
                if (var52.field1276 < 0) {
                    break;
                }
                var53 = class61.method419((byte) 28, var52.field1371);
            } while (var53 == null || var53.field1363 == null || var52.field1276 >= var53.field1363.length || var53.field1363[var52.field1276] != var52);
            class31.method257(-32581, var51);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[B)V", line = 1397)
    private final void method1772(int arg0, byte[] arg1) {
        if (arg0 >= -108) {
            return;
        }
        class94 var3 = new class94(class194.method1434((byte) 123, arg1));
        int var4 = var3.method756(915905888);
        field4239++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4257 = 0;
        } else {
            this.field4257 = var3.method747(false);
        }
        int var5 = var3.method756(915905888);
        int var6 = 0;
        this.field4253 = var3.method761((byte) 108);
        int var7 = -1;
        this.field4254 = new int[this.field4253];
        for (int var8 = 0; var8 < this.field4253; var8++) {
            this.field4254[var8] = var6 += var3.method761((byte) 108);
            if (var7 < this.field4254[var8]) {
                var7 = this.field4254[var8];
            }
        }
        this.field4238 = var7 + 1;
        this.field4249 = new int[this.field4238];
        this.field4247 = new int[this.field4238][];
        this.field4255 = new int[this.field4238];
        this.field4252 = new int[this.field4238];
        this.field4242 = new int[this.field4238];
        if (var5 != 0) {
            this.field4245 = new int[this.field4238];
            for (int var9 = 0; var9 < this.field4238; var9++) {
                this.field4245[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4253; var10++) {
                this.field4245[this.field4254[var10]] = var3.method747(false);
            }
            this.field4258 = new class202(this.field4245);
        }
        for (int var11 = 0; var11 < this.field4253; var11++) {
            this.field4252[this.field4254[var11]] = var3.method747(false);
        }
        for (int var12 = 0; var12 < this.field4253; var12++) {
            this.field4255[this.field4254[var12]] = var3.method747(false);
        }
        for (int var13 = 0; var13 < this.field4253; var13++) {
            this.field4249[this.field4254[var13]] = var3.method761((byte) 108);
        }
        for (int var14 = 0; var14 < this.field4253; var14++) {
            int var15 = 0;
            int var16 = this.field4254[var14];
            int var17 = this.field4249[var16];
            this.field4247[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field4247[var16][var19] = var15 += var3.method761((byte) 108);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field4242[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field4247[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4235 = new int[var7 + 1][];
        this.field4236 = new class202[var7 + 1];
        for (int var21 = 0; var21 < this.field4253; var21++) {
            int var22 = this.field4254[var21];
            int var23 = this.field4249[var22];
            this.field4235[var22] = new int[this.field4242[var22]];
            for (int var24 = 0; var24 < this.field4242[var22]; var24++) {
                this.field4235[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4247[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4247[var22][var25];
                }
                this.field4235[var22][var26] = var3.method747(false);
            }
            this.field4236[var22] = new class202(this.field4235[var22]);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 1571)
    public static void method1773(byte arg0) {
        if (arg0 < 0) {
            field4250 = null;
            field4237 = null;
            field4234 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([BI)V", line = 1585)
    public class256(byte[] arg0, int arg1) {
        this.field4243 = class125.method1011(-42, arg0, arg0.length);
        if (this.field4243 != arg1) {
            throw new RuntimeException();
        }
        this.method1772(-122, arg0);
    }
}
