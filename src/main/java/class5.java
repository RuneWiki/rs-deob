import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class5 {

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Lrg;")
    private class96 field62 = new class96();

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Lce;")
    private class246 field69 = new class246();

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Lsc;")
    private class259 field67;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
    public static boolean field54 = false;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Ln;")
    public static class282 field59 = new class282(20);

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "Lna;")
    public static class26 field72 = class69.method505("null", (byte) -123);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "Lve;")
    public static class266 field70;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Z", line = 16)
    public static final boolean method24(boolean arg0) {
        field56++;
        if (class277.field4634) {
            try {
                class321.field5525.method208(-1857, class45.field712.field2431);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0) {
            field59 = (class282) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lve;ZLve;BI)Lcl;", line = 36)
    public static final class132 method25(class266 arg0, boolean arg1, class266 arg2, byte arg3, int arg4) {
        field51++;
        boolean var5 = true;
        if (arg3 <= 71) {
            return (class132) null;
        }
        int[] var6 = arg0.method1897((byte) -128, arg4);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method1896(var6[var7], arg4, 0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method1896(var9, 0, 0);
                } else {
                    var10 = arg2.method1896(0, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class132(arg0, arg2, arg4, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)Lna;", line = 89)
    public static final class26 method26(byte arg0, int arg1) {
        field53++;
        if (arg0 > -86) {
            return (class26) null;
        } else {
            class26 var2 = new class26();
            var2.field436 = 0;
            var2.field418 = new byte[arg1];
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V", line = 106)
    public static final void method27(boolean arg0, int arg1) {
        byte var2;
        byte[][] var3;
        if (class255.field4184 && arg0) {
            var2 = 1;
            var3 = class2.field15;
        } else {
            var2 = 4;
            var3 = class51.field808;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class293.field4884[var5] >> 8) * 64 - class12.field157;
            int var7 = (class293.field4884[var5] & 0xFF) * 64 - class165.field2568;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class258.method1815(-16385);
                class82.method616(class218.field3479, arg0, class8.field99 * 8 - 48, var7, 4, var6, (class116.field1829 - 6) * 8, var8);
            }
        }
        int var9 = 0;
        if (arg1 > -66) {
            method24(true);
        }
        while (var4 > var9) {
            int var10 = (class293.field4884[var9] >> 8) * 64 - class12.field157;
            int var11 = (class293.field4884[var9] & 0xFF) * 64 - class165.field2568;
            byte[] var12 = var3[var9];
            if (var12 == null && class116.field1829 < 800) {
                class258.method1815(-16385);
                for (int var13 = 0; var13 < var2; var13++) {
                    class137.method917(var13, (byte) 102, var11, var10, 64, 64);
                }
            }
            var9++;
        }
        field60++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(JI)Lrg;", line = 176)
    public final class96 method28(long arg0, int arg1) {
        if (arg1 != 1400) {
            this.field71 = -79;
        }
        field65++;
        class96 var4 = (class96) this.field67.method1827(arg0, 0);
        if (var4 != null) {
            this.field69.method1695(var4, (byte) 44);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V", line = 198)
    public static final void method29(boolean arg0) {
        if (arg0) {
            method29(true);
        }
        field57++;
        for (int var1 = 0; var1 < 100; var1++) {
            class2.field21[var1] = true;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lab;", line = 224)
    public final class147 method30(int arg0) {
        if (arg0 == 0) {
            field61++;
            return this.field67.method1823(38);
        } else {
            return (class147) null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[Lbe;IIIIBI)V", line = 235)
    public static final void method31(int arg0, int arg1, int arg2, class297[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (class255.field4184) {
            class326.method2279(arg0, arg6, arg4, arg7);
        } else {
            class34.method287(arg0, arg6, arg4, arg7);
            class200.method1338();
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class297 var11 = arg3[var10];
            if (var11 != null && (var11.field4993 == arg5 || arg5 == -1412584499 && class95.field1549 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class53.field827[class66.field1041] = var11.field5118 + arg2;
                    class159.field2475[class66.field1041] = var11.field5014 + arg1;
                    class27.field457[class66.field1041] = var11.field4967;
                    class241.field3931[class66.field1041] = var11.field4996;
                    var12 = class66.field1041++;
                } else {
                    var12 = arg9;
                }
                var11.field5007 = class229.field3626;
                var11.field5103 = var12;
                if (!var11.field5038 || !client.method1737(var11)) {
                    if (var11.field4990 > 0) {
                        class9.method63((byte) -128, var11);
                    }
                    int var13 = var11.field5014 + arg1;
                    int var14 = var11.field5027;
                    int var15 = var11.field5118 + arg2;
                    if (class299.field5146 && (client.method1730(var11).field5661 != 0 || var11.field4988 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class95.field1549 == var11) {
                        if (arg5 != -1412584499 && !var11.field5003) {
                            class8.field92 = arg2;
                            class233.field3691 = arg1;
                            class86.field1419 = arg3;
                            continue;
                        }
                        if (class324.field5563 && class123.field1913) {
                            int var16 = class259.field4235;
                            int var17 = class136.field2090;
                            int var18 = var16 - class313.field5346;
                            if (var18 < class287.field4801) {
                                var18 = class287.field4801;
                            }
                            if ((var11.field4996 + var18) > (class287.field4801 + class163.field2540.field4996)) {
                                var18 = class163.field2540.field4996 + class287.field4801 - var11.field4996;
                            }
                            var13 = var18;
                            int var19 = var17 - class254.field4150;
                            if (class72.field1115 > var19) {
                                var19 = class72.field1115;
                            }
                            if ((class72.field1115 + class163.field2540.field4967) < (var11.field4967 + var19)) {
                                var19 = class72.field1115 + class163.field2540.field4967 - var11.field4967;
                            }
                            var15 = var19;
                        }
                        if (!var11.field5003) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field4988 == 2) {
                        var24 = arg7;
                        var25 = arg4;
                        var20 = arg6;
                        var21 = arg0;
                    } else {
                        var20 = var13 > arg6 ? var13 : arg6;
                        var21 = arg0 < var15 ? var15 : arg0;
                        int var22 = var11.field4967 + var15;
                        int var23 = var13 + var11.field4996;
                        if (var11.field4988 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = arg7 <= var23 ? arg7 : var23;
                        var25 = var22 >= arg4 ? arg4 : var22;
                    }
                    if (!var11.field5038 || var25 > var21 && var20 < var24) {
                        if (var11.field4990 != 0) {
                            if (var11.field4990 == 1337 || var11.field4990 == 1403 && class255.field4184) {
                                class89.field1465 = var11;
                                class96.field1561 = var13;
                                class291.field4842 = var15;
                                class264.method1854(-6403, var11.field4996, var11.field4990 == 1403, var15, var11.field4967, var13);
                                if (class255.field4184) {
                                    class326.method2279(arg0, arg6, arg4, arg7);
                                } else {
                                    class34.method287(arg0, arg6, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field4990 == 1338) {
                                if (!var11.method2089(-30721)) {
                                    continue;
                                }
                                class294.method2064(var12, (byte) 59, var13, var15, var11);
                                if (class255.field4184) {
                                    class326.method2279(arg0, arg6, arg4, arg7);
                                } else {
                                    class34.method287(arg0, arg6, arg4, arg7);
                                }
                                if (class154.field2402 != 0 && class154.field2402 != 3 || class11.field153 || var21 > class187.field2959 || class11.field150 < var20 || class187.field2959 >= var25 || var24 <= class11.field150) {
                                    continue;
                                }
                                int var126 = class187.field2959 - var15;
                                int var127 = class11.field150 - var13;
                                int var128 = var11.field5011[var127];
                                if (var126 < var128 || var126 > (var11.field5102[var127] + var128)) {
                                    continue;
                                }
                                int var129 = var127 - var11.field4996 / 2;
                                int var130 = class300.field5156 + class158.field2465 & 0x7FF;
                                int var131 = var126 - var11.field4967 / 2;
                                int var132 = class200.field3104[var130];
                                int var133 = class200.field3115[var130];
                                int var134 = (class51.field797 + 256) * var132 >> 8;
                                int var135 = (class51.field797 + 256) * var133 >> 8;
                                int var136 = var129 * var135 - (var131 * var134) >> 11;
                                int var137 = var129 * var134 + (var131 * var135) >> 11;
                                int var138 = class13.field221.field3962 + var137 >> 7;
                                int var139 = class13.field221.field3972 - var136 >> 7;
                                if (class86.field1420 && (class58.field940 & 0x40) != 0) {
                                    class297 var140 = class148.method1011((byte) -19, class29.field501, class297.field5087);
                                    if (var140 == null) {
                                        class39.method321((byte) -91);
                                    } else {
                                        class29.method237(class254.field4158, 1L, (byte) -49, class12.field169, var138, (short) 11, class33.field559, var139);
                                    }
                                    continue;
                                }
                                if (class170.field2670 == 1) {
                                    class29.method237(-1, 1L, (byte) -41, class2.field18, var138, (short) 36, class27.field450, var139);
                                }
                                class29.method237(-1, 1L, (byte) -125, class2.field18, var138, (short) 60, class112.field1771, var139);
                                continue;
                            }
                            if (var11.field4990 == 1339) {
                                if (var11.method2089(-30721)) {
                                    class228.method1528(var15, var13, var11, var12, (byte) 59);
                                    if (class255.field4184) {
                                        class326.method2279(arg0, arg6, arg4, arg7);
                                    } else {
                                        class34.method287(arg0, arg6, arg4, arg7);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4990 == 1400) {
                                class82.method638(var15, 64, var13, var11.field4996, var11.field4967);
                                class2.field21[var12] = true;
                                class139.field2123[var12] = true;
                                if (class255.field4184) {
                                    class326.method2279(arg0, arg6, arg4, arg7);
                                } else {
                                    class34.method287(arg0, arg6, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field4990 == 1401) {
                                class273.method1938(var15, var11.field4996, var11.field4967, 19481, var13);
                                class2.field21[var12] = true;
                                class139.field2123[var12] = true;
                                if (class255.field4184) {
                                    class326.method2279(arg0, arg6, arg4, arg7);
                                } else {
                                    class34.method287(arg0, arg6, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field4990 == 1402) {
                                if (!class255.field4184) {
                                    class271.method1925(var15, 95, var13);
                                    class2.field21[var12] = true;
                                    class139.field2123[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4990 == 1405) {
                                if (!class318.field5443) {
                                    continue;
                                }
                                int var26 = var11.field4967 + var15;
                                int var27 = var13 + 15;
                                class136.field2083.method1205(class236.method1587(new class26[] { class20.field275, class149.method1019((byte) 9, class249.field4066) }, (byte) -69), var26, var27, 16776960, -1);
                                int var141 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class136.field2083.method1205(class236.method1587(new class26[] { class304.field5237, class149.method1019((byte) 9, var29), class203.field3166 }, (byte) -128), var26, var141, var30, -1);
                                var27 = var141 + 15;
                                if (class255.field4184) {
                                    int var31 = 16776960;
                                    int var32 = (class197.field3061 + class197.field3060 + class197.field3056) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class136.field2083.method1205(class236.method1587(new class26[] { class97.field1584, class149.method1019((byte) 9, var32), class203.field3166 }, (byte) -97), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class82.field1338[var37].method1372((byte) 1);
                                    var36 += class82.field1338[var37].method1366(0);
                                    var35 += class82.field1338[var37].method1370(1);
                                }
                                int var38 = var36 * 10000 / var34;
                                int var39 = var35 * 100 / var34;
                                class26 var40 = class236.method1587(new class26[] { class318.field5441, class323.method2245(0, true, 2, (long) var38, 2), class23.field336, class149.method1019((byte) 9, var39), class306.field5273 }, (byte) -113);
                                class283.field4723.method1205(var40, var26, var27, var33, -1);
                                var27 += 12;
                                class2.field21[var12] = true;
                                class139.field2123[var12] = true;
                                continue;
                            }
                            if (var11.field4990 == 1406) {
                                class122.field1902 = var13;
                                class148.field2321 = var11;
                                class76.field1162 = var15;
                                continue;
                            }
                        }
                        if (!class11.field153) {
                            if (var11.field4988 == 0 && var11.field5023 && class187.field2959 >= var21 && class11.field150 >= var20 && class187.field2959 < var25 && var24 > class11.field150 && !class299.field5146) {
                                class126.field1955 = 1;
                                class85.field1404[0] = class132.field2013;
                                class141.field2154[0] = class154.field2406;
                                class252.field4138[0] = class2.field18;
                                class142.field2178[0] = 1005;
                            }
                            if (var21 <= class187.field2959 && var20 <= class11.field150 && var25 > class187.field2959 && var24 > class11.field150) {
                                class146.method970(class11.field150 - var13, true, class187.field2959 - var15, var11);
                            }
                        }
                        if (var11.field4988 == 0) {
                            if (!var11.field5038 && client.method1737(var11) && class204.field3193 != var11) {
                                continue;
                            }
                            if (!var11.field5038) {
                                if ((var11.field5058 - var11.field4996) < var11.field5012) {
                                    var11.field5012 = var11.field5058 - var11.field4996;
                                }
                                if (var11.field5012 < 0) {
                                    var11.field5012 = 0;
                                }
                            }
                            method31(var21, var13 - var11.field5012, -var11.field5053 + var15, arg3, var25, var11.field5088, var20, var24, (byte) 87, var12);
                            if (var11.field5068 != null) {
                                method31(var21, var13 - var11.field5012, -var11.field5053 + var15, var11.field5068, var25, var11.field5088, var20, var24, (byte) 52, var12);
                            }
                            class174 var41 = (class174) class74.field1132.method1827((long) var11.field5088, 0);
                            if (var41 != null) {
                                if (var41.field2722 == 0 && !class11.field153 && class187.field2959 >= var21 && var20 <= class11.field150 && var25 > class187.field2959 && class11.field150 < var24 && !class299.field5146) {
                                    class141.field2154[0] = class154.field2406;
                                    class126.field1955 = 1;
                                    class85.field1404[0] = class132.field2013;
                                    class142.field2178[0] = 1005;
                                    class252.field4138[0] = class2.field18;
                                }
                                class114.method796(-101, var41.field2721, var21, var25, var15, var12, var24, var20, var13);
                            }
                            if (class255.field4184) {
                                class326.method2279(arg0, arg6, arg4, arg7);
                            } else {
                                class34.method287(arg0, arg6, arg4, arg7);
                                class200.method1338();
                            }
                        }
                        if (class259.field4239[var12] || class4.field42 > 1) {
                            if (var11.field4988 == 0 && !var11.field5038 && var11.field5058 > var11.field4996) {
                                class31.method246((byte) 120, var11.field5012, var11.field5058, var11.field4967 + var15, var13, var11.field4996);
                            }
                            if (var11.field4988 != 1) {
                                if (var11.field4988 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field5050; var43++) {
                                        for (int var44 = 0; var44 < var11.field4976; var44++) {
                                            int var45 = (var11.field5101 + 32) * var43 + var13;
                                            int var46 = (var11.field5095 + 32) * var44 + var15;
                                            if (var42 < 20) {
                                                var45 += var11.field5111[var42];
                                                var46 += var11.field5081[var42];
                                            }
                                            if (var11.field5060[var42] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var11.field5060[var42] - 1;
                                                if (arg0 < var46 + 32 && var46 < arg4 && arg6 < (var45 + 32) && var45 < arg7 || class140.field2138 == var11 && class163.field2538 == var42) {
                                                    class148 var51;
                                                    if (class134.field2046 == 1 && class100.field1612 == var42 && class27.field453 == var11.field5088) {
                                                        var51 = class85.method662(2, var50, var11.field5032, var11.field5131[var42], 0, 65536);
                                                    } else {
                                                        var51 = class85.method662(1, var50, var11.field5032, var11.field5131[var42], 3153952, 65536);
                                                    }
                                                    if (class200.field3101) {
                                                        class2.field21[var12] = true;
                                                    }
                                                    if (var51 == null) {
                                                        class318.method2209(-106, var11);
                                                    } else if (class140.field2138 == var11 && class163.field2538 == var42) {
                                                        int var52 = class136.field2090 - class50.field790;
                                                        int var53 = class259.field4235 - class61.field986;
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (class308.field5304 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method883(var46 + var52, var45 - -var53, 128);
                                                        if (arg5 != -1) {
                                                            class297 var54 = arg3[arg5 & 0xFFFF];
                                                            int var55;
                                                            int var56;
                                                            if (class255.field4184) {
                                                                var55 = class326.field5652;
                                                                var56 = class326.field5649;
                                                            } else {
                                                                var56 = class34.field566;
                                                                var55 = class34.field570;
                                                            }
                                                            if (var56 > (var45 + var53) && var54.field5012 > 0) {
                                                                int var57 = (var56 - var45 - var53) * class25.field366 / 3;
                                                                if (var57 > (class25.field366 * 10)) {
                                                                    var57 = class25.field366 * 10;
                                                                }
                                                                if (var57 > var54.field5012) {
                                                                    var57 = var54.field5012;
                                                                }
                                                                var54.field5012 -= var57;
                                                                class61.field986 += var57;
                                                                class318.method2209(121, var54);
                                                            }
                                                            if (var55 < var45 + var53 + 32 && var54.field5012 < var54.field5058 - var54.field4996) {
                                                                int var58 = (var45 + var53 + 32 - var55) * class25.field366 / 3;
                                                                if (var58 > class25.field366 * 10) {
                                                                    var58 = class25.field366 * 10;
                                                                }
                                                                if (var54.field5058 - var54.field4996 - var54.field5012 < var58) {
                                                                    var58 = var54.field5058 - var54.field5012 - var54.field4996;
                                                                }
                                                                var54.field5012 += var58;
                                                                class61.field986 -= var58;
                                                                class318.method2209(-81, var54);
                                                            }
                                                        }
                                                    } else if (class73.field1123 == var11 && class22.field325 == var42) {
                                                        var51.method883(var46, var45, 128);
                                                    } else {
                                                        var51.method876(var46, var45);
                                                    }
                                                }
                                            } else if (var11.field5000 != null && var42 < 20) {
                                                class148 var47 = var11.method2093(true, var42);
                                                if (var47 != null) {
                                                    var47.method876(var46, var45);
                                                } else if (class325.field5632) {
                                                    class318.method2209(125, var11);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field4988 == 3) {
                                    int var125;
                                    if (class250.method1716(var11, 26)) {
                                        var125 = var11.field5059;
                                        if (class204.field3193 == var11 && var11.field5026 != 0) {
                                            var125 = var11.field5026;
                                        }
                                    } else {
                                        var125 = var11.field5022;
                                        if (class204.field3193 == var11 && var11.field5033 != 0) {
                                            var125 = var11.field5033;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field5030) {
                                            if (class255.field4184) {
                                                class326.method2278(var15, var13, var11.field4967, var11.field4996, var125);
                                            } else {
                                                class34.method286(var15, var13, var11.field4967, var11.field4996, var125);
                                            }
                                        } else if (class255.field4184) {
                                            class326.method2271(var15, var13, var11.field4967, var11.field4996, var125);
                                        } else {
                                            class34.method274(var15, var13, var11.field4967, var11.field4996, var125);
                                        }
                                    } else if (var11.field5030) {
                                        if (class255.field4184) {
                                            class326.method2274(var15, var13, var11.field4967, var11.field4996, var125, 256 - (var14 & 0xFF));
                                        } else {
                                            class34.method275(var15, var13, var11.field4967, var11.field4996, var125, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class255.field4184) {
                                        class326.method2272(var15, var13, var11.field4967, var11.field4996, var125, 256 - (var14 & 0xFF));
                                    } else {
                                        class34.method278(var15, var13, var11.field4967, var11.field4996, var125, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field4988 == 4) {
                                    class175 var59 = var11.method2102(class268.field4428, 0);
                                    if (var59 != null) {
                                        class26 var60 = var11.field5037;
                                        int var61;
                                        if (class250.method1716(var11, 97)) {
                                            var61 = var11.field5059;
                                            if (class204.field3193 == var11 && var11.field5026 != 0) {
                                                var61 = var11.field5026;
                                            }
                                            if (var11.field4971.method171(-99) > 0) {
                                                var60 = var11.field4971;
                                            }
                                        } else {
                                            var61 = var11.field5022;
                                            if (class204.field3193 == var11 && var11.field5033 != 0) {
                                                var61 = var11.field5033;
                                            }
                                        }
                                        if (var11.field5038 && var11.field4995 != -1) {
                                            class217 var62 = class45.method341(var11.field4995, (byte) 113);
                                            var60 = var62.field3422;
                                            if (var60 == null) {
                                                var60 = class121.field1895;
                                            }
                                            if ((var62.field3415 == 1 || var11.field5078 != 1) && var11.field5078 != -1) {
                                                var60 = class236.method1587(new class26[] { class1.field3, var60, class294.field4906, class260.method1834((byte) -125, var11.field5078) }, (byte) -89);
                                            }
                                        }
                                        if (class142.field2165 == var11) {
                                            var61 = var11.field5022;
                                            var60 = class55.field871;
                                        }
                                        if (!var11.field5038) {
                                            var60 = class233.method1570(var11, var60, 0);
                                        }
                                        var59.method1195(var60, var15, var13, var11.field4967, var11.field4996, var61, var11.field5019 ? 0 : -1, var11.field4997, var11.field5029, var11.field5009);
                                    } else if (class325.field5632) {
                                        class318.method2209(-13, var11);
                                    }
                                } else if (var11.field4988 == 5) {
                                    if (var11.field5038) {
                                        class148 var110;
                                        if (var11.field4995 == -1) {
                                            var110 = var11.method2100((byte) -113, false);
                                        } else {
                                            var110 = class85.method662(var11.field5098, var11.field4995, var11.field5032, var11.field5078, var11.field5097, 65536);
                                        }
                                        if (var110 != null) {
                                            int var111 = var110.field2309;
                                            int var112 = var110.field2319;
                                            if (var11.field4987) {
                                                int var114 = (var111 + var11.field4967 - 1) / var111;
                                                int var115 = (var11.field4996 + var112 - 1) / var112;
                                                if (class255.field4184) {
                                                    class326.method2275(var15, var13, var11.field4967 + var15, var11.field4996 + var13);
                                                    boolean var116 = class319.method2213((byte) -94, var110.field2320);
                                                    boolean var117 = class319.method2213((byte) -113, var110.field2308);
                                                    class130 var118 = (class130) var110;
                                                    if (var116 && var117) {
                                                        if (var14 == 0) {
                                                            var118.method882(var15, var13, var114, var115);
                                                        } else {
                                                            var118.method873(var15, var13, 256 - (var14 & 0xFF), var114, var115);
                                                        }
                                                    } else if (var116) {
                                                        for (int var119 = 0; var119 < var115; var119++) {
                                                            if (var14 == 0) {
                                                                var118.method882(var15, var112 * var119 + var13, var114, 1);
                                                            } else {
                                                                var118.method873(var15, var112 * var119 + var13, -(var14 & 0xFF) + 256, var114, 1);
                                                            }
                                                        }
                                                    } else if (var117) {
                                                        for (int var122 = 0; var122 < var114; var122++) {
                                                            if (var14 == 0) {
                                                                var118.method882(var111 * var122 + var15, var13, 1, var115);
                                                            } else {
                                                                var118.method873(var111 * var122 + var15, var13, 256 - (var14 & 0xFF), 1, var115);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var120 = 0; var120 < var114; var120++) {
                                                            for (int var121 = 0; var121 < var115; var121++) {
                                                                if (var14 == 0) {
                                                                    var110.method876(var15 + (var111 * var120), var112 * var121 + var13);
                                                                } else {
                                                                    var110.method883(var111 * var120 + var15, var112 * var121 + var13, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class326.method2279(arg0, arg6, arg4, arg7);
                                                } else {
                                                    class34.method289(var15, var13, var15 + var11.field4967, var13 - -var11.field4996);
                                                    for (int var123 = 0; var123 < var114; var123++) {
                                                        for (int var124 = 0; var124 < var115; var124++) {
                                                            if (var11.field5113 != 0) {
                                                                var110.method1012(var112 / 2 + (var13 + (var112 * var124)), var11.field5113, 4096, var111 / 2 + var111 * var123 + var15, -1470985020);
                                                            } else if (var14 == 0) {
                                                                var110.method876(var111 * var123 + var15, var112 * var124 + var13);
                                                            } else {
                                                                var110.method883(var111 * var123 + var15, var112 * var124 + var13, 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class34.method287(arg0, arg6, arg4, arg7);
                                                }
                                            } else {
                                                int var113 = var11.field4967 * 4096 / var111;
                                                if (var11.field5113 != 0) {
                                                    var110.method1012(var11.field4996 / 2 + var13, var11.field5113, var113, var11.field4967 / 2 + var15, -1470985020);
                                                } else if (var14 != 0) {
                                                    var110.method881(var15, var13, var11.field4967, var11.field4996, 256 - (var14 & 0xFF));
                                                } else if (var11.field4967 == var111 && var11.field4996 == var112) {
                                                    var110.method876(var15, var13);
                                                } else {
                                                    var110.method878(var15, var13, var11.field4967, var11.field4996);
                                                }
                                            }
                                        } else if (class325.field5632) {
                                            class318.method2209(-40, var11);
                                        }
                                    } else {
                                        class148 var109 = var11.method2100((byte) -113, class250.method1716(var11, 69));
                                        if (var109 != null) {
                                            var109.method876(var15, var13);
                                        } else if (class325.field5632) {
                                            class318.method2209(118, var11);
                                        }
                                    }
                                } else if (var11.field4988 == 6) {
                                    boolean var90 = class250.method1716(var11, 110);
                                    class311 var91 = null;
                                    int var92;
                                    if (var90) {
                                        var92 = var11.field5001;
                                    } else {
                                        var92 = var11.field5117;
                                    }
                                    int var93 = 0;
                                    if (var11.field4995 != -1) {
                                        class217 var94 = class45.method341(var11.field4995, (byte) 76);
                                        if (var94 != null) {
                                            class217 var95 = var94.method1456(var11.field5078, 78);
                                            class249 var96 = var92 == -1 ? null : client.method1731(var92, (byte) -20);
                                            var91 = var95.method1460(100, var11.field5066, var11.field5073, var96, 1, var11.field5093);
                                            if (var91 == null) {
                                                class318.method2209(116, var11);
                                            } else {
                                                var93 = -var91.method679() / 2;
                                            }
                                        }
                                    } else if (var11.field5005 == 5) {
                                        if (var11.field5004 == -1) {
                                            var91 = class14.field232.method1403((class21[]) null, -1, (class249) null, (class249) null, 0, -1, 100, 0, true, -1, -1);
                                        } else {
                                            int var98 = var11.field5004 & 0x7FF;
                                            if (class327.field5668 == var98) {
                                                var98 = 2047;
                                            }
                                            class159 var99 = class268.field4427[var98];
                                            class249 var100 = var92 == -1 ? null : client.method1731(var92, (byte) -20);
                                            if (var99 != null && ((int) var99.field2495.method209(-128) << 11) == (var11.field5004 & 0xFFFFF800)) {
                                                var91 = var99.field2484.method1403((class21[]) null, -1, (class249) null, var100, 0, -1, -126, 0, true, var11.field5093, 0);
                                            }
                                        }
                                    } else if (var92 == -1) {
                                        var91 = var11.method2099(-1, (class249) null, -1, 126, 0, var90, class13.field221.field2484);
                                        if (var91 == null && class325.field5632) {
                                            class318.method2209(122, var11);
                                        }
                                    } else {
                                        class249 var97 = client.method1731(var92, (byte) -20);
                                        var91 = var11.method2099(var11.field5066, var97, var11.field5093, 127, var11.field5073, var90, class13.field221.field2484);
                                        if (var91 == null && class325.field5632) {
                                            class318.method2209(3, var11);
                                        }
                                    }
                                    if (var91 != null) {
                                        int var101;
                                        if (var11.field4985 > 0) {
                                            var101 = (var11.field4967 << 8) / var11.field4985;
                                        } else {
                                            var101 = 256;
                                        }
                                        int var102;
                                        if (var11.field5124 <= 0) {
                                            var102 = 256;
                                        } else {
                                            var102 = (var11.field4996 << 8) / var11.field5124;
                                        }
                                        int var103 = var15 + (var11.field4967 / 2) + (var11.field5065 * var101 >> 8);
                                        int var104 = (var11.field5035 * var102 >> 8) + var11.field4996 / 2 + var13;
                                        if (class255.field4184) {
                                            if (var11.field4980) {
                                                class255.method1795(var103, var104, var11.field4963, var11.field5104, var101, var102);
                                            } else {
                                                class255.method1761(var103, var104, var101, var102);
                                                class255.method1765((float) var11.field4968, (float) var11.field5104 * 1.5F);
                                            }
                                            class255.method1786();
                                            class255.method1771(true);
                                            class255.method1767(false);
                                            class315.method2185(class57.field923, false);
                                            if (class262.field4282) {
                                                class326.method2269();
                                                class255.method1781();
                                                class326.method2279(arg0, arg6, arg4, arg7);
                                                class262.field4282 = false;
                                            }
                                            if (var11.field5121) {
                                                class255.method1791();
                                            }
                                            int var105 = class200.field3104[var11.field4983] * var11.field4963 >> 16;
                                            int var106 = class200.field3115[var11.field4983] * var11.field4963 >> 16;
                                            if (var11.field5038) {
                                                var91.method1604(0, var11.field5120, var11.field5089, var11.field4983, var11.field5064, var11.field5070 + var105 + var93, var11.field5070 + var106, -1L);
                                            } else {
                                                var91.method1604(0, var11.field5120, 0, var11.field4983, 0, var105, var106, -1L);
                                            }
                                            if (var11.field5121) {
                                                class255.method1770();
                                            }
                                        } else {
                                            class200.method1349(var103, var104);
                                            int var107 = class200.field3104[var11.field4983] * var11.field4963 >> 16;
                                            int var108 = class200.field3115[var11.field4983] * var11.field4963 >> 16;
                                            if (!var11.field5038) {
                                                var91.method1604(0, var11.field5120, 0, var11.field4983, 0, var107, var108, -1L);
                                            } else if (var11.field4980) {
                                                ((class270) var91).method1920(0, var11.field5120, var11.field5089, var11.field4983, var11.field5064, var11.field5070 + var93 + var107, var11.field5070 + var108, var11.field4963);
                                            } else {
                                                var91.method1604(0, var11.field5120, var11.field5089, var11.field4983, var11.field5064, var107 + var93 + var11.field5070, var11.field5070 + var108, -1L);
                                            }
                                            class200.method1345();
                                        }
                                    }
                                } else {
                                    if (var11.field4988 == 7) {
                                        class175 var63 = var11.method2102(class268.field4428, 0);
                                        if (var63 == null) {
                                            if (class325.field5632) {
                                                class318.method2209(-115, var11);
                                            }
                                            continue;
                                        }
                                        int var64 = 0;
                                        for (int var65 = 0; var65 < var11.field5050; var65++) {
                                            for (int var66 = 0; var66 < var11.field4976; var66++) {
                                                if (var11.field5060[var64] > 0) {
                                                    class217 var67 = class45.method341(var11.field5060[var64] - 1, (byte) 104);
                                                    class26 var68;
                                                    if (var67.field3415 != 1 && var11.field5131[var64] == 1) {
                                                        var68 = class236.method1587(new class26[] { class1.field3, var67.field3422, class56.field910 }, (byte) -67);
                                                    } else {
                                                        var68 = class236.method1587(new class26[] { class1.field3, var67.field3422, class294.field4906, class260.method1834((byte) -100, var11.field5131[var64]) }, (byte) -73);
                                                    }
                                                    int var69 = (var11.field5095 + 115) * var66 + var15;
                                                    int var70 = (var11.field5101 + 12) * var65 + var13;
                                                    if (var11.field4997 == 0) {
                                                        var63.method1198(var68, var69, var70, var11.field5022, var11.field5019 ? 0 : -1);
                                                    } else if (var11.field4997 == 1) {
                                                        var63.method1216(var68, var69 + 57, var70, var11.field5022, var11.field5019 ? 0 : -1);
                                                    } else {
                                                        var63.method1205(var68, var69 + 115 - 1, var70, var11.field5022, var11.field5019 ? 0 : -1);
                                                    }
                                                }
                                                var64++;
                                            }
                                        }
                                    }
                                    if (var11.field4988 == 8 && class318.field5445 == var11 && class222.field3523 == class201.field3122) {
                                        int var71 = 0;
                                        int var72 = 0;
                                        class26 var73 = var11.field5037;
                                        class175 var74 = class136.field2083;
                                        class26 var75 = class233.method1570(var11, var73, 0);
                                        while (var75.method171(-58) > 0) {
                                            int var76 = var75.method182(class82.field1323, 62);
                                            class26 var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = class2.field18;
                                            } else {
                                                var77 = var75.method188(var76, 0, 0);
                                                var75 = var75.method187(var76 + 4, (byte) -74);
                                            }
                                            int var78 = var74.method1199(var77);
                                            var71 += var74.field2746 + 1;
                                            if (var72 < var78) {
                                                var72 = var78;
                                            }
                                        }
                                        int var79 = var13 + var11.field4996 + 5;
                                        var72 += 6;
                                        var71 += 7;
                                        if ((var79 + var71) > arg7) {
                                            var79 = arg7 - var71;
                                        }
                                        int var80 = var15 + var11.field4967 - var72 - 5;
                                        if (var80 < var15 + 5) {
                                            var80 = var15 + 5;
                                        }
                                        if ((var72 + var80) > arg4) {
                                            var80 = arg4 - var72;
                                        }
                                        if (class255.field4184) {
                                            class326.method2278(var80, var79, var72, var71, 16777120);
                                            class326.method2271(var80, var79, var72, var71, 0);
                                        } else {
                                            class34.method286(var80, var79, var72, var71, 16777120);
                                            class34.method274(var80, var79, var72, var71, 0);
                                        }
                                        class26 var81 = var11.field5037;
                                        int var82 = var79 + var74.field2746 + 2;
                                        class26 var83 = class233.method1570(var11, var81, 0);
                                        while (var83.method171(-102) > 0) {
                                            int var84 = var83.method182(class82.field1323, 86);
                                            class26 var85;
                                            if (var84 == -1) {
                                                var85 = var83;
                                                var83 = class2.field18;
                                            } else {
                                                var85 = var83.method188(var84, 0, 0);
                                                var83 = var83.method187(var84 + 4, (byte) -74);
                                            }
                                            var74.method1198(var85, var80 + 3, var82, 0, -1);
                                            var82 += var74.field2746 + 1;
                                        }
                                    }
                                    if (var11.field4988 == 9) {
                                        int var86;
                                        int var87;
                                        int var88;
                                        int var89;
                                        if (var11.field4966) {
                                            var86 = var15;
                                            var87 = var15 + var11.field4967;
                                            var88 = var13 + var11.field4996;
                                            var89 = var13;
                                        } else {
                                            var86 = var15;
                                            var88 = var13;
                                            var89 = var13 + var11.field4996;
                                            var87 = var11.field4967 + var15;
                                        }
                                        if (var11.field5056 == 1) {
                                            if (class255.field4184) {
                                                class326.method2277(var86, var88, var87, var89, var11.field5022);
                                            } else {
                                                class34.method291(var86, var88, var87, var89, var11.field5022);
                                            }
                                        } else if (class255.field4184) {
                                            class326.method2273(var86, var88, var87, var89, var11.field5022, var11.field5056);
                                        } else {
                                            class34.method285(var86, var88, var87, var89, var11.field5022, var11.field5056);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg8 <= 31) {
            field70 = (class266) null;
        }
        field58++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 1516)
    public static void method32(byte arg0) {
        field70 = null;
        if (arg0 < 84) {
            method27(true, -127);
        }
        field72 = null;
        field59 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lrg;JB)V", line = 1533)
    public final void method33(class96 arg0, long arg1, byte arg2) {
        field64++;
        if (this.field71 == 0) {
            class96 var5 = this.field69.method1693(-1);
            var5.method1006(-1024);
            var5.method722((byte) -107);
            if (this.field62 == var5) {
                class96 var6 = this.field69.method1693(-1);
                var6.method1006(-1024);
                var6.method722((byte) -107);
            }
        } else {
            this.field71--;
        }
        this.field67.method1826(1, arg0, arg1);
        int var7 = -76 % ((arg2 + 5) / 35);
        this.field69.method1695(arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 1563)
    public static final void method34(byte arg0) {
        field63++;
        if (class224.field3534 < 128) {
            class224.field3534 = 128;
        }
        if (class224.field3534 > 383) {
            class224.field3534 = 383;
        }
        class300.field5156 &= 0x7FF;
        if (arg0 >= -31) {
            field70 = (class266) null;
        }
        int var1 = class72.field1113 >> 7;
        int var2 = class212.field3277 >> 7;
        int var3 = class17.method118(class279.field4651, 1, class72.field1113, class212.field3277);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class279.field4651;
                    if (var7 < 3 && (class92.field1492[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class157.field2449[var7][var5][var6] & 0xFF) * 8 + var3 - class229.field3635[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class196.field3051 < var9) {
            class196.field3051 += (var9 - class196.field3051) / 24;
        } else if (var9 < class196.field3051) {
            class196.field3051 += (var9 - class196.field3051) / 80;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Lab;", line = 1636)
    public final class147 method35(int arg0) {
        field66++;
        if (arg0 != -1) {
            field59 = (class282) null;
        }
        return this.field67.method1825(-119);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)I", line = 1656)
    public static final int method36(int arg0, boolean arg1, int arg2) {
        field55++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (!arg1) {
            method24(true);
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V", line = 1719)
    public class5(int arg0) {
        int var2 = 1;
        this.field71 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field68 = arg0;
        this.field67 = new class259(var2);
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 1682)
    public final void method37(int arg0) {
        this.field69.method1699(17126);
        this.field67.method1820(-112);
        this.field62 = new class96();
        if (arg0 != 2) {
            this.method28(-36L, 52);
        }
        this.field71 = this.field68;
        field52++;
    }
}
