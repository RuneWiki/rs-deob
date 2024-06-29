import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 {

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lpe;")
    public static class95 field2211 = new class95(5000);

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
    public static int[] field2222 = new int[25];

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lrc;")
    public static class105 field2220 = class43.method374(" )2> @lre@", 0);

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2223 = 0;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Lte;")
    public static class119 field2224 = null;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[I")
    public static int[] field2225 = new int[500];

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Lrc;")
    public static class105 field2226 = class43.method374("Lade Schrifts-=tze )2 ", 0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lfc;")
    public static class34 field2212;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lpb;")
    public static class92 field2219;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[Lbd;")
    public static class11[] field2214;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 3)
    public static void method791(int arg0) {
        field2226 = null;
        field2220 = null;
        if (arg0 != -20499) {
            method797(34, true, -122, 21, -74, -103, null);
        }
        field2211 = null;
        field2222 = null;
        field2224 = null;
        field2219 = null;
        field2212 = null;
        field2214 = null;
        field2225 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZILpb;IIII)V", line = 24)
    public static final synchronized void method792(int arg0, boolean arg1, int arg2, class92 arg3, int arg4, int arg5, int arg6, int arg7) {
        field2218++;
        if (!class75.method638(-12164)) {
            return;
        }
        class118.field2769 = arg2;
        class10.field193 = arg1;
        class72.field1584 = arg4;
        class78.field1754 = arg5;
        class119.field2793 = arg3;
        class72.field1601 = arg6;
        class122.field2982 = arg7;
        class29.field670 = true;
        class35.field813 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 48)
    public static final synchronized void method793(int arg0) {
        class37.method341(true);
        if (arg0 == -10305) {
            field2215++;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 59)
    public static final void method794(byte arg0) {
        field2216++;
        class83.field1854 = 0;
        for (int var1 = -1; var1 < class97.field2250 + class133.field3229; var1++) {
            class58 var19;
            if (var1 == -1) {
                var19 = class119.field2842;
            } else if (var1 < class97.field2250) {
                var19 = class58.field1303[class121.field2956[var1]];
            } else {
                var19 = class19.field466[class24.field578[var1 - class97.field2250]];
            }
            if (var19 != null && var19.method164(117)) {
                if (var19 instanceof class115) {
                    class19 var20 = ((class115) var19).field2681;
                    if (var20.field462 != null) {
                        var20 = var20.method223(true);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (class97.field2250 <= var1) {
                    class19 var21 = ((class115) var19).field2681;
                    if (var21.field485 >= 0 && var21.field485 < class75.field1668.length) {
                        class59.method479(var19.field1246 + 15, var19, (byte) -27);
                        if (class116.field2701 > -1) {
                            class75.field1668[var21.field485].method265(class116.field2701 - 12, class92.field2159 - 30);
                        }
                    }
                    if (class132.field3172 == 1 && class24.field578[var1 - class97.field2250] == class83.field1866 && class104.field2351 % 20 < 10) {
                        class59.method479(var19.field1246 + 15, var19, (byte) -43);
                        if (class116.field2701 > -1) {
                            class7.field112[0].method265(class116.field2701 - 12, class92.field2159 + -28);
                        }
                    }
                } else {
                    int var22 = 30;
                    class15 var23 = (class15) var19;
                    if (var23.field309 != -1 || var23.field291 != -1) {
                        class59.method479(var19.field1246 + 15, var19, (byte) -95);
                        if (class116.field2701 > -1) {
                            if (var23.field309 != -1) {
                                class28.field622[var23.field309].method265(class116.field2701 - 12, class92.field2159 - var22);
                                var22 += 25;
                            }
                            if (var23.field291 != -1) {
                                class75.field1668[var23.field291].method265(class116.field2701 - 12, -var22 + class92.field2159);
                                var22 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class132.field3172 == 10 && class121.field2956[var1] == class132.field3182) {
                        class59.method479(var19.field1246 + 15, var19, (byte) -108);
                        if (class116.field2701 > -1) {
                            class7.field112[1].method265(class116.field2701 - 12, -var22 + class92.field2159);
                        }
                    }
                }
                if (var19.field1264 != null && (var1 >= class97.field2250 || class17.field370 == 0 || class17.field370 == 3 || class17.field370 == 1 && class74.method627(((class15) var19).field300, -117))) {
                    class59.method479(var19.field1246, var19, (byte) -62);
                    if (class116.field2701 > -1 && class9.field163 > class83.field1854) {
                        class9.field181[class83.field1854] = class100.field2285.method662(var19.field1264) / 2;
                        class9.field162[class83.field1854] = class100.field2285.field1737;
                        class9.field155[class83.field1854] = class116.field2701;
                        class9.field168[class83.field1854] = class92.field2159;
                        class9.field182[class83.field1854] = var19.field1225;
                        class9.field159[class83.field1854] = var19.field1291;
                        class9.field186[class83.field1854] = var19.field1260;
                        class9.field157[class83.field1854] = var19.field1264;
                        class83.field1854++;
                    }
                }
                if (class104.field2351 < var19.field1221) {
                    class59.method479(var19.field1246 + 15, var19, (byte) -53);
                    if (class116.field2701 > -1) {
                        int var24 = var19.field1222 * 30 / var19.field1251;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class69.method580(class116.field2701 - 15, class92.field2159 + -3, var24, 5, 65280);
                        class69.method580(class116.field2701 + var24 - 15, class92.field2159 + -3, 30 - var24, 5, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var19.field1232[var25] > class104.field2351) {
                        class59.method479(var19.field1246 / 2, var19, (byte) -99);
                        if (class116.field2701 > -1) {
                            if (var25 == 1) {
                                class92.field2159 -= 20;
                            }
                            if (var25 == 2) {
                                class92.field2159 -= 10;
                                class116.field2701 -= 15;
                            }
                            if (var25 == 3) {
                                class116.field2701 += 15;
                                class92.field2159 -= 10;
                            }
                            class50.field1058[var19.field1247[var25]].method265(class116.field2701 - 12, class92.field2159 + -12);
                            class74.field1624.method668(class75.method637(var19.field1249[var25], 8241), class116.field2701, class92.field2159 + 4, 0);
                            class74.field1624.method668(class75.method637(var19.field1249[var25], 8241), class116.field2701 - 1, class92.field2159 + 3, 16777215);
                        }
                    }
                }
            }
        }
        int var2 = 2 % ((72 - arg0) / 47);
        for (int var3 = 0; var3 < class83.field1854; var3++) {
            int var4 = class9.field155[var3];
            int var5 = class9.field168[var3];
            int var6 = class9.field181[var3];
            int var7 = class9.field162[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; var18++) {
                    if (var5 + 2 > class9.field168[var18] + -class9.field162[var18] && class9.field168[var18] + 2 > -var7 + var5 && var4 - var6 < class9.field155[var18] - -class9.field181[var18] && class9.field155[var18] - class9.field181[var18] < var4 + var6 && class9.field168[var18] - class9.field162[var18] < var5) {
                        var5 = class9.field168[var18] - class9.field162[var18];
                        var8 = true;
                    }
                }
            }
            class116.field2701 = class9.field155[var3];
            class92.field2159 = class9.field168[var3] = var5;
            class105 var9 = class9.field157[var3];
            if (class86.field1947 == 0) {
                int var10 = 16776960;
                if (class9.field182[var3] < 6) {
                    var10 = class111.field2610[class9.field182[var3]];
                }
                if (class9.field182[var3] == 6) {
                    var10 = class105.field2421 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class9.field182[var3] == 7) {
                    var10 = class105.field2421 % 20 < 10 ? 255 : 65535;
                }
                if (class9.field182[var3] == 8) {
                    var10 = class105.field2421 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class9.field182[var3] == 9) {
                    int var11 = 150 - class9.field186[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (class9.field182[var3] == 10) {
                    int var12 = 150 - class9.field186[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 33095935 - var12 * 327680;
                    } else if (var12 < 150) {
                        var10 = var12 * 327680 + 255 - (var12 + -100) * 5 - 32768000;
                    }
                }
                if (class9.field182[var3] == 11) {
                    int var13 = 150 - class9.field186[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 + 32768000 - var13 * 327680;
                    }
                }
                if (class9.field159[var3] == 0) {
                    class100.field2285.method668(var9, class116.field2701, class92.field2159 + 1, 0);
                    class100.field2285.method668(var9, class116.field2701, class92.field2159, var10);
                }
                if (class9.field159[var3] == 1) {
                    class100.field2285.method660(var9, class116.field2701, class92.field2159 + 1, 0, class105.field2421);
                    class100.field2285.method660(var9, class116.field2701, class92.field2159, var10, class105.field2421);
                }
                if (class9.field159[var3] == 2) {
                    class100.field2285.method657(var9, class116.field2701, class92.field2159 + 1, 0, class105.field2421);
                    class100.field2285.method657(var9, class116.field2701, class92.field2159, var10, class105.field2421);
                }
                if (class9.field159[var3] == 3) {
                    class100.field2285.method670(var9, class116.field2701, class92.field2159 + 1, 0, class105.field2421, 150 - class9.field186[var3]);
                    class100.field2285.method670(var9, class116.field2701, class92.field2159, var10, class105.field2421, 150 - class9.field186[var3]);
                }
                if (class9.field159[var3] == 4) {
                    int var14 = class100.field2285.method662(var9);
                    int var15 = (150 - class9.field186[var3]) * (var14 + 100) / 150;
                    class69.method581(class116.field2701 - 50, 0, class116.field2701 + 50, 334);
                    class100.field2285.method664(var9, class116.field2701 + 50 - var15, class92.field2159 + 1, 0);
                    class100.field2285.method664(var9, class116.field2701 + 50 - var15, class92.field2159, var10);
                    class69.method593();
                }
                if (class9.field159[var3] == 5) {
                    int var16 = 150 - class9.field186[var3];
                    class69.method581(0, class92.field2159 - class100.field2285.field1737 - 1, 512, class92.field2159 + 5);
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class100.field2285.method668(var9, class116.field2701, class92.field2159 + var17 + 1, 0);
                    class100.field2285.method668(var9, class116.field2701, class92.field2159 + var17, var10);
                    class69.method593();
                }
            } else {
                class100.field2285.method668(var9, class116.field2701, class92.field2159 + 1, 0);
                class100.field2285.method668(var9, class116.field2701, class92.field2159, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZIIII)V", line = 442)
    public static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        class104 var10 = null;
        if (!arg5) {
            field2214 = null;
        }
        field2210++;
        for (class104 var11 = (class104) class130.field3151.method31(1280); var11 != null; var11 = (class104) class130.field3151.method26((byte) 108)) {
            if (var11.field2355 == arg4 && var11.field2348 == arg0 && var11.field2344 == arg7 && var11.field2340 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class104();
            var10.field2340 = arg8;
            var10.field2344 = arg7;
            var10.field2348 = arg0;
            var10.field2355 = arg4;
            class85.method710(76, var10);
            class130.field3151.method23(1024, var10);
        }
        var10.field2359 = arg9;
        var10.field2339 = arg1;
        var10.field2341 = arg2;
        var10.field2357 = arg6;
        var10.field2362 = arg3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 487)
    public static final synchronized void method796(boolean arg0) {
        field2217++;
        if (!class75.method638(-12164)) {
            return;
        }
        if (class29.field670) {
            byte[] var1 = class3.method33(class78.field1754, -9, class119.field2793, class118.field2769, class35.field813);
            if (var1 != null) {
                if (class72.field1601 >= 0) {
                    class18.method200(class72.field1601, class10.field193, class122.field2982, var1, -1);
                } else if (class72.field1584 < 0) {
                    class65.method547(var1, class10.field193, (byte) 98, class122.field2982);
                } else {
                    class18.method194(class122.field2982, class72.field1584, class10.field193, 126, var1);
                }
                class119.field2793 = null;
                class29.field670 = false;
            }
        }
        if (!arg0) {
            field2214 = null;
        }
        class113.method924(false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIIIILpb;)V", line = 522)
    public static final synchronized void method797(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class92 arg6) {
        field2209++;
        if (!class75.method638(-12164)) {
            return;
        }
        class118.field2769 = arg5;
        class78.field1754 = arg4;
        class122.field2982 = arg0;
        if (arg3 < 54) {
            return;
        }
        class10.field193 = arg1;
        class35.field813 = arg2;
        class29.field670 = true;
        class72.field1601 = -1;
        class119.field2793 = arg6;
        class72.field1584 = -1;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V", line = 546)
    public static final synchronized void method798(byte arg0) {
        int var1 = -49 % ((27 - arg0) / 63);
        field2208++;
        if (class75.method638(-12164)) {
            class41.method365(0);
            class29.field670 = false;
            class119.field2793 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[Lrc;)[Lrc;", line = 561)
    public static final class105[] method799(int arg0, class105[] arg1) {
        field2207++;
        class105[] var2 = new class105[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class108.method878(new class105[] { class75.method637(var3, 8241), class61.field1360 }, 2867);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class108.method878(new class105[] { var2[var3], arg1[var3] }, 2867);
            }
        }
        if (arg0 <= 52) {
            field2224 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIILrc;Lrc;ILpb;I)V", line = 589)
    public static final synchronized void method800(boolean arg0, int arg1, int arg2, class105 arg3, class105 arg4, int arg5, class92 arg6, int arg7) {
        field2213++;
        if (class75.method638(-12164) && arg1 == -11) {
            int var8 = arg6.method753(arg3, 3);
            int var9 = arg6.method765(var8, (byte) -47, arg4);
            method792(arg2, arg0, var9, arg6, -1, var8, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)I", line = 608)
    public static final int method801(boolean arg0) {
        field2206++;
        int var1 = 3;
        if (class100.field2291 < 310) {
            int var2 = class113.field2658 >> 7;
            int var3 = class119.field2842.field1274 >> 7;
            int var4 = class119.field2842.field1229 >> 7;
            int var5 = class78.field1755 >> 7;
            int var6;
            if (var4 <= var2) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if ((class57.field1185[class73.field1619][var2][var5] & 0x4) != 0) {
                var1 = class73.field1619;
            }
            int var7;
            if (var5 >= var3) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            if (var6 <= var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var5) {
                    var9 += var8;
                    if (var5 < var3) {
                        var5++;
                    } else if (var5 > var3) {
                        var5--;
                    }
                    if ((class57.field1185[class73.field1619][var2][var5] & 0x4) != 0) {
                        var1 = class73.field1619;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class57.field1185[class73.field1619][var2][var5] & 0x4) != 0) {
                            var1 = class73.field1619;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (var2 != var4) {
                    var10 += var11;
                    if (var4 > var2) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class57.field1185[class73.field1619][var2][var5] & 0x4) != 0) {
                        var1 = class73.field1619;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 > var5) {
                            var5++;
                        } else if (var3 < var5) {
                            var5--;
                        }
                        if ((class57.field1185[class73.field1619][var2][var5] & 0x4) != 0) {
                            var1 = class73.field1619;
                        }
                    }
                }
            }
        }
        if ((class57.field1185[class73.field1619][class119.field2842.field1229 >> 7][class119.field2842.field1274 >> 7] & 0x4) != 0) {
            var1 = class73.field1619;
        }
        if (!arg0) {
            method802((byte) 114, -39);
        }
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V", line = 742)
    public static final synchronized void method802(byte arg0, int arg1) {
        if (arg0 != 70) {
            return;
        }
        field2221++;
        if (class75.method638(-12164)) {
            class45.method382(arg1, 0);
            class119.field2793 = null;
            class29.field670 = false;
        }
    }
}
