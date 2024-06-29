import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class99 {

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lqk;")
    private class65 field1362 = new class65();

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lik;")
    private class17 field1346;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Z")
    public static boolean field1354 = true;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "[I")
    public static int[] field1360;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 5)
    public final Object method716(long arg0, boolean arg1) {
        field1359++;
        class33 var4 = (class33) this.field1346.method111(31, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method190((byte) 80);
        if (var5 == null) {
            var4.method1274((byte) -26);
            var4.method206(-1);
            this.field1347++;
            return null;
        }
        if (var4.method184(118)) {
            class250 var6 = new class250(var5);
            this.field1346.method120(var4.field2522, var6, -22851);
            this.field1362.method443(!arg1, var6);
            var6.field414 = 0L;
            var4.method1274((byte) -26);
            var4.method206(-1);
        } else {
            this.field1362.method443(true, var4);
            var4.field414 = 0L;
        }
        if (arg1) {
            this.method720(-86, -44);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 52)
    public final void method717(byte arg0) {
        this.field1362.method446(122);
        field1361++;
        this.field1346.method118((byte) -57);
        if (arg0 >= 31) {
            this.field1347 = this.field1348;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 65)
    public static final int method718(int arg0) {
        field1349++;
        if (arg0 >= -26) {
            method718(83);
        }
        return class327.field4938.method723(16384);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V", line = 87)
    public final void method719(int arg0, long arg1) {
        if (arg0 >= -50) {
            method725((byte) 3);
        }
        field1351++;
        class33 var4 = (class33) this.field1346.method111(52, arg1);
        if (var4 != null) {
            var4.method1274((byte) -26);
            var4.method206(-1);
            this.field1347++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 107)
    public final void method720(int arg0, int arg1) {
        if (class238.field3378 != null) {
            for (class33 var3 = (class33) this.field1362.method442(-123); var3 != null; var3 = (class33) this.field1362.method444((byte) 125)) {
                if (var3.method184(arg1 - 995)) {
                    if (var3.method190((byte) 80) == null) {
                        var3.method1274((byte) -26);
                        var3.method206(arg1 ^ 0xFFFFFBBF);
                        this.field1347++;
                    }
                } else if ((++var3.field414) > ((long) arg0)) {
                    class33 var4 = class238.field3378.method683(var3, 120);
                    this.field1346.method120(var3.field2522, var4, arg1 ^ 0xFFFFA2FD);
                    class241.method1647(0, var3, var4);
                    var3.method1274((byte) -26);
                    var3.method206(-1);
                }
            }
        }
        if (arg1 != 1088) {
            this.method720(-65, 63);
        }
        field1345++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 156)
    public final void method721(long arg0, Object arg1, int arg2) {
        this.method719(-79, arg0);
        field1353++;
        if (this.field1347 == arg2) {
            class33 var5 = (class33) this.field1362.method445((byte) 120);
            var5.method1274((byte) -26);
            var5.method206(-1);
        } else {
            this.field1347--;
        }
        class250 var6 = new class250(arg1);
        this.field1346.method120(arg0, var6, -22851);
        this.field1362.method443(true, var6);
        var6.field414 = 0L;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lkm;BLmk;Lkm;)V", line = 185)
    public static final void method722(class133 arg0, byte arg1, class95 arg2, class133 arg3) {
        class98.field1332 = arg0;
        class10.field88 = arg3;
        if (arg1 > -91) {
            return;
        }
        class315.field4748 = arg2;
        field1363++;
        if (class98.field1332 != null) {
            class72.field997 = class98.field1332.method970(-125, 1);
        }
        if (class10.field88 != null) {
            class289.field4313 = class10.field88.method970(-87, 1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I", line = 206)
    private final int method723(int arg0) {
        field1355++;
        int var2 = 0;
        class33 var3 = (class33) this.field1362.method442(-122);
        if (arg0 != 16384) {
            return -81;
        }
        while (var3 != null) {
            if (!var3.method184(79)) {
                var2++;
            }
            var3 = (class33) this.field1362.method444((byte) 36);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 232)
    public final void method724(int arg0) {
        for (class33 var2 = (class33) this.field1362.method442(-70); var2 != null; var2 = (class33) this.field1362.method444((byte) -84)) {
            if (var2.method184(126)) {
                var2.method1274((byte) -26);
                var2.method206(-1);
                this.field1347++;
            }
        }
        if (arg0 == 0) {
            field1357++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I", line = 263)
    public static final int method725(byte arg0) {
        field1350++;
        int var1 = -76 / ((arg0 + 41) / 42);
        return ((class224.field3233 == 0 ? 0 : 1) << 22) + ((class45.field553 == 0 ? 0 : 1) << 20) + ((class131.field1793 ? 1 : 0) << 15) + ((class342.field5117 ? 1 : 0) << 10) + ((class218.field3118 ? 1 : 0) << 6) + ((class183.field2517 ? 1 : 0) << 5) + ((class70.field953 ? 1 : 0) << 4) + (class297.field4401 & 0x7) + ((class292.field4355 ? 1 : 0) << 3) + ((field1354 ? 1 : 0) << 7) + ((class119.field1610 ? 1 : 0) << 8) + ((class185.field2558 ? 1 : 0) << 9) - (-(class216.field3091 & 0x3 << 11) + -((class314.field4736 ? 1 : 0) << 13) + -((class287.field4256 ? 1 : 0) << 16) + -(class96.field1297 << 17) - (((class72.field1000 ? 1 : 0) << 19) - -((class83.field1199 == 0 ? 0 : 1) << 21)) + -(class265.method1803() << 23));
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)V", line = 273)
    public static final void method726(long arg0, byte arg1) {
        field1352++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class44.field535 < 100 || class199.field2835) || class44.field535 >= 200) {
            class93.method695((byte) 124, 0, class103.field1413, "");
            return;
        }
        String var3 = class256.method1746(arg0, 0);
        for (int var4 = 0; var4 < class44.field535; var4++) {
            if (class89.field1254[var4] == arg0) {
                class93.method695((byte) 126, 0, var3 + class243.field3476, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class64.field826; var5++) {
            if (class143.field1966[var5] == arg0) {
                class93.method695((byte) -53, 0, class193.field2654 + var3 + class196.field2742, "");
                return;
            }
        }
        if (var3.equals(class173.field2356.field3439)) {
            class93.method695((byte) 124, 0, class290.field4327, "");
            return;
        }
        class124.field1675++;
        class207.field2986[class44.field535] = var3;
        class89.field1254[class44.field535] = arg0;
        class344.field5271[class44.field535] = 0;
        class290.field4325[class44.field535] = "";
        class21.field275[class44.field535] = 0;
        class30.field370[class44.field535] = false;
        int var6 = 126 / ((-arg1 - 56) / 36);
        class201.field2856 = class185.field2549;
        class44.field535++;
        class90.field1264.method2238(158, (byte) -128);
        class90.field1264.method2202(arg0, -105);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lpi;Z)V", line = 339)
    public static final void method727(class202 arg0, boolean arg1) {
        class248.field3573.method1339((byte) 70, arg0);
        while (true) {
            class202 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class202[][] var7;
            class202 var78;
            do {
                class202 var77;
                do {
                    class202 var76;
                    do {
                        class202 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class202) class248.field3573.method1350((byte) -126);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2892);
                                            var3 = var2.field2876;
                                            var4 = var2.field2881;
                                            var5 = var2.field2884;
                                            var6 = var2.field2891;
                                            var7 = class142.field1940[var5];
                                            float var8 = 0.0F;
                                            if (class67.field908) {
                                                if (class333.field5020 == class143.field1967) {
                                                    int var9 = class336.field5066[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class33.field399 != var10) {
                                                        class33.field399 = var10;
                                                        class111.method808((byte) 89, var10);
                                                        class139.method1005(class6.method34(-18072));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class36.field419 != var11) {
                                                        class36.field419 = var11;
                                                        class4.method20(false, var11);
                                                    }
                                                    int var12 = class269.field3994[0][var3 + 1][var4] + class269.field3994[0][var3][var4] + class269.field3994[0][var3][var4 + 1] + class269.field3994[0][var3 + 1][var4 + 1] >> 2;
                                                    class123.method884(-var12, 3, -33);
                                                    var8 = 201.5F;
                                                    class67.method488(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class67.method488(var8);
                                                }
                                            }
                                            if (!var2.field2870) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class202 var13 = class142.field1940[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field2892) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class175.field2383 && var3 > class110.field1484) {
                                                    class202 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field2892 && (var14.field2870 || (var2.field2871 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class175.field2383 && var3 < class316.field4758 - 1) {
                                                    class202 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field2892 && (var15.field2870 || (var2.field2871 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class25.field315 && var4 > class161.field2213) {
                                                    class202 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field2892 && (var16.field2870 || (var2.field2871 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class25.field315 && var4 < class230.field3254 - 1) {
                                                    class202 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field2892 && (var17.field2870 || (var2.field2871 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2870 = false;
                                            if (var2.field2888 != null) {
                                                class202 var18 = var2.field2888;
                                                if (class67.field908) {
                                                    class67.method488(201.5F - (float) (var18.field2891 + 1) * 50.0F);
                                                }
                                                if (var18.field2886 == null) {
                                                    if (var18.field2872 != null) {
                                                        if (class343.method2363(0, var3, var4)) {
                                                            class166.method1184(var18.field2872, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, true);
                                                        } else {
                                                            class166.method1184(var18.field2872, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class343.method2363(0, var3, var4)) {
                                                    class7.method38(var18.field2886, 0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, true);
                                                } else {
                                                    class7.method38(var18.field2886, 0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, false);
                                                }
                                                class7 var19 = var18.field2873;
                                                if (var19 != null) {
                                                    if (class67.field908) {
                                                        if ((var19.field56 & var2.field2877) == 0) {
                                                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                        } else {
                                                            class147.method1068(var19.field56, class234.field3310, class173.field2353, class113.field1539, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field57.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var19.field62 - class234.field3310, var19.field68 - class173.field2353, var19.field60 - class113.field1539, var19.field69, var5, (class265) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field2875; var20++) {
                                                    class280 var21 = var18.field2896[var20];
                                                    if (var21 != null) {
                                                        if (class67.field908) {
                                                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                        }
                                                        var21.field4199.method108(var21.field4213, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var21.field4212 - class234.field3310, var21.field4206 - class173.field2353, var21.field4214 - class113.field1539, var21.field4203, var5, (class265) null);
                                                    }
                                                }
                                                if (class67.field908) {
                                                    class67.method488(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2886 == null) {
                                                if (var2.field2872 != null) {
                                                    if (class343.method2363(var6, var3, var4)) {
                                                        class166.method1184(var2.field2872, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class166.method1184(var2.field2872, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, false);
                                                    }
                                                }
                                            } else if (class343.method2363(var6, var3, var4)) {
                                                class7.method38(var2.field2886, var6, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2886.field2057 != 12345678 || class312.field4720 && var5 <= class344.field5335) {
                                                    class7.method38(var2.field2886, var6, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class306 var23 = var2.field2869;
                                                if (var23 != null && (var23.field4580 & 0x80000000L) != 0L) {
                                                    if (class67.field908 && var23.field4582) {
                                                        class67.method488(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class67.field908) {
                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                    }
                                                    var23.field4586.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var23.field4581 - class234.field3310, var23.field4583 - class173.field2353, var23.field4588 - class113.field1539, var23.field4580, var5, (class265) null);
                                                    if (class67.field908 && var23.field4582) {
                                                        class67.method488(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class7 var26 = var2.field2873;
                                            class269 var27 = var2.field2879;
                                            if (var26 != null || var27 != null) {
                                                if (class175.field2383 == var3) {
                                                    var24++;
                                                } else if (class175.field2383 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class25.field315 == var4) {
                                                    var24 += 3;
                                                } else if (class25.field315 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class307.field4594[var24];
                                                var2.field2877 = class196.field2743[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field56 & class295.field4374[var24]) == 0) {
                                                    var2.field2882 = 0;
                                                } else if (var26.field56 == 16) {
                                                    var2.field2882 = 3;
                                                    var2.field2894 = class111.field1507[var24];
                                                    var2.field2868 = 3 - var2.field2894;
                                                } else if (var26.field56 == 32) {
                                                    var2.field2882 = 6;
                                                    var2.field2894 = class293.field4358[var24];
                                                    var2.field2868 = 6 - var2.field2894;
                                                } else if (var26.field56 == 64) {
                                                    var2.field2882 = 12;
                                                    var2.field2894 = class242.field3461[var24];
                                                    var2.field2868 = 12 - var2.field2894;
                                                } else {
                                                    var2.field2882 = 9;
                                                    var2.field2894 = class119.field1620[var24];
                                                    var2.field2868 = 9 - var2.field2894;
                                                }
                                                if ((var26.field56 & var25) != 0 && !class330.method2306(var6, var3, var4, var26.field56)) {
                                                    if (class67.field908) {
                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                    }
                                                    var26.field57.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var26.field62 - class234.field3310, var26.field68 - class173.field2353, var26.field60 - class113.field1539, var26.field69, var5, (class265) null);
                                                }
                                                if ((var26.field71 & var25) != 0 && !class330.method2306(var6, var3, var4, var26.field71)) {
                                                    if (class67.field908) {
                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                    }
                                                    var26.field55.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var26.field62 - class234.field3310, var26.field68 - class173.field2353, var26.field60 - class113.field1539, var26.field69, var5, (class265) null);
                                                }
                                            }
                                            if (var27 != null && !class333.method2315(var6, var3, var4, var27.field3987.method105())) {
                                                if (class67.field908) {
                                                    class67.method488(var8 - 0.5F);
                                                }
                                                if ((var27.field3979 & var25) != 0) {
                                                    if (class67.field908) {
                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                    }
                                                    var27.field3987.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var27.field3986 + var27.field3985 - class234.field3310, var27.field3989 - class173.field2353, var27.field3980 + var27.field3991 - class113.field1539, var27.field3992, var5, (class265) null);
                                                } else if (var27.field3979 == 256) {
                                                    int var28 = var27.field3986 - class234.field3310;
                                                    int var29 = var27.field3989 - class173.field2353;
                                                    int var30 = var27.field3980 - class113.field1539;
                                                    int var31 = var27.field3996;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class67.field908) {
                                                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                        }
                                                        var27.field3987.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var27.field3985 + var28, var29, var27.field3991 + var30, var27.field3992, var5, (class265) null);
                                                    } else if (var27.field3995 != null) {
                                                        if (class67.field908) {
                                                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                        }
                                                        var27.field3995.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var28, var29, var30, var27.field3992, var5, (class265) null);
                                                    }
                                                }
                                                if (class67.field908) {
                                                    class67.method488(var8);
                                                }
                                            }
                                            if (var22) {
                                                class306 var34 = var2.field2869;
                                                if (var34 != null && (var34.field4580 & 0x80000000L) == 0L) {
                                                    if (class67.field908 && var34.field4582) {
                                                        class67.method488(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class67.field908) {
                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                    }
                                                    var34.field4586.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var34.field4581 - class234.field3310, var34.field4583 - class173.field2353, var34.field4588 - class113.field1539, var34.field4580, var5, (class265) null);
                                                    if (class67.field908 && var34.field4582) {
                                                        class67.method488(var8);
                                                    }
                                                }
                                                class186 var35 = var2.field2887;
                                                if (var35 != null && var35.field2562 == 0) {
                                                    if (class67.field908) {
                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                    }
                                                    if (var35.field2568 != null) {
                                                        var35.field2568.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var35.field2563 - class234.field3310, var35.field2561 - class173.field2353, var35.field2573 - class113.field1539, var35.field2567, var5, (class265) null);
                                                    }
                                                    if (var35.field2570 != null) {
                                                        var35.field2570.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var35.field2563 - class234.field3310, var35.field2561 - class173.field2353, var35.field2573 - class113.field1539, var35.field2567, var5, (class265) null);
                                                    }
                                                    if (var35.field2575 != null) {
                                                        var35.field2575.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var35.field2563 - class234.field3310, var35.field2561 - class173.field2353, var35.field2573 - class113.field1539, var35.field2567, var5, (class265) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2871;
                                            if (var36 != 0) {
                                                if (var3 < class175.field2383 && (var36 & 0x4) != 0) {
                                                    class202 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field2892) {
                                                        class248.field3573.method1339((byte) -111, var37);
                                                    }
                                                }
                                                if (var4 < class25.field315 && (var36 & 0x2) != 0) {
                                                    class202 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field2892) {
                                                        class248.field3573.method1339((byte) -117, var38);
                                                    }
                                                }
                                                if (var3 > class175.field2383 && (var36 & 0x1) != 0) {
                                                    class202 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field2892) {
                                                        class248.field3573.method1339((byte) -124, var39);
                                                    }
                                                }
                                                if (var4 > class25.field315 && (var36 & 0x8) != 0) {
                                                    class202 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field2892) {
                                                        class248.field3573.method1339((byte) 23, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2882 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2875; var42++) {
                                                if (class24.field300 != var2.field2896[var42].field4207 && (var2.field2878[var42] & var2.field2882) == var2.field2894) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class7 var43 = var2.field2873;
                                                if (!class330.method2306(var6, var3, var4, var43.field56)) {
                                                    if (class67.field908) {
                                                        label882: {
                                                            if ((var43.field69 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field62 - class234.field3310;
                                                                int var45 = var43.field60 - class113.field1539;
                                                                int var46 = (int) (var43.field69 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < field1356 - 1) {
                                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class245.field3524 - 1 && var4 < field1356 - 1) {
                                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class245.field3524 - 1 && var4 > 0) {
                                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field57.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var43.field62 - class234.field3310, var43.field68 - class173.field2353, var43.field60 - class113.field1539, var43.field69, var5, (class265) null);
                                                }
                                                var2.field2882 = 0;
                                            }
                                        }
                                        if (!var2.field2893) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2875;
                                            var2.field2893 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class280 var50 = var2.field2896[var49];
                                                if (class24.field300 != var50.field4207) {
                                                    for (int var51 = var50.field4204; var51 <= var50.field4205; var51++) {
                                                        for (int var52 = var50.field4200; var52 <= var50.field4198; var52++) {
                                                            class202 var53 = var7[var51][var52];
                                                            if (var53.field2870) {
                                                                var2.field2893 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field2882 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4204) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4205) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4200) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4198) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field2882) == var2.field2868) {
                                                                    var2.field2893 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class136.field1875[var48++] = var50;
                                                    int var55 = class175.field2383 - var50.field4204;
                                                    int var56 = var50.field4205 - class175.field2383;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class25.field315 - var50.field4200;
                                                    int var58 = var50.field4198 - class25.field315;
                                                    if (var58 > var57) {
                                                        var50.field4201 = var55 + var58;
                                                    } else {
                                                        var50.field4201 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class280 var62 = class136.field1875[var61];
                                                    if (class24.field300 != var62.field4207) {
                                                        if (var62.field4201 > var59) {
                                                            var59 = var62.field4201;
                                                            var60 = var61;
                                                        } else if (var62.field4201 == var59) {
                                                            int var63 = var62.field4212 - class234.field3310;
                                                            int var64 = var62.field4214 - class113.field1539;
                                                            int var65 = class136.field1875[var60].field4212 - class234.field3310;
                                                            int var66 = class136.field1875[var60].field4214 - class113.field1539;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class280 var67 = class136.field1875[var60];
                                                var67.field4207 = class24.field300;
                                                if (!class8.method41(var6, var67.field4204, var67.field4205, var67.field4200, var67.field4198, var67.field4199.method105())) {
                                                    if (class67.field908) {
                                                        if ((var67.field4203 & 0xFC000L) == 147456L) {
                                                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                                                            int var68 = var67.field4212 - class234.field3310;
                                                            int var69 = var67.field4214 - class113.field1539;
                                                            int var70 = (int) (var67.field4203 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class147.method1055(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class147.method1055(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class147.method1055(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class147.method1055(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class147.method1067(class234.field3310, class173.field2353, class113.field1539, var5, var67.field4204, var67.field4200, var67.field4205, var67.field4198);
                                                        }
                                                    }
                                                    var67.field4199.method108(var67.field4213, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var67.field4212 - class234.field3310, var67.field4206 - class173.field2353, var67.field4214 - class113.field1539, var67.field4203, var5, (class265) null);
                                                }
                                                for (int var71 = var67.field4204; var71 <= var67.field4205; var71++) {
                                                    for (int var72 = var67.field4200; var72 <= var67.field4198; var72++) {
                                                        class202 var73 = var7[var71][var72];
                                                        if (var73.field2882 != 0) {
                                                            class248.field3573.method1339((byte) -116, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field2892) {
                                                            class248.field3573.method1339((byte) -108, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2893) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field2893 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2892);
                            } while (var2.field2882 != 0);
                            if (var3 > class175.field2383 || var3 <= class110.field1484) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field2892);
                        if (var3 < class175.field2383 || var3 >= class316.field4758 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field2892);
                    if (var4 > class25.field315 || var4 <= class161.field2213) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field2892);
                if (var4 < class25.field315 || var4 >= class230.field3254 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field2892);
            var2.field2892 = false;
            class161.field2219--;
            class186 var79 = var2.field2887;
            if (var79 != null && var79.field2562 != 0) {
                if (class67.field908) {
                    class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                }
                if (var79.field2568 != null) {
                    var79.field2568.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var79.field2563 - class234.field3310, var79.field2561 - class173.field2353 - var79.field2562, var79.field2573 - class113.field1539, var79.field2567, var5, (class265) null);
                }
                if (var79.field2570 != null) {
                    var79.field2570.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var79.field2563 - class234.field3310, var79.field2561 - class173.field2353 - var79.field2562, var79.field2573 - class113.field1539, var79.field2567, var5, (class265) null);
                }
                if (var79.field2575 != null) {
                    var79.field2575.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var79.field2563 - class234.field3310, var79.field2561 - class173.field2353 - var79.field2562, var79.field2573 - class113.field1539, var79.field2567, var5, (class265) null);
                }
            }
            if (var2.field2877 != 0) {
                class269 var80 = var2.field2879;
                if (var80 != null && !class333.method2315(var6, var3, var4, var80.field3987.method105())) {
                    if ((var80.field3979 & var2.field2877) != 0) {
                        if (class67.field908) {
                            class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                        }
                        var80.field3987.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var80.field3986 + var80.field3985 - class234.field3310, var80.field3989 - class173.field2353, var80.field3980 + var80.field3991 - class113.field1539, var80.field3992, var5, (class265) null);
                    } else if (var80.field3979 == 256) {
                        int var81 = var80.field3986 - class234.field3310;
                        int var82 = var80.field3989 - class173.field2353;
                        int var83 = var80.field3980 - class113.field1539;
                        int var84 = var80.field3996;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class67.field908) {
                                class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                            }
                            var80.field3987.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var80.field3985 + var81, var82, var80.field3991 + var83, var80.field3992, var5, (class265) null);
                        } else if (var80.field3995 != null) {
                            if (class67.field908) {
                                class147.method1058(class234.field3310, class173.field2353, class113.field1539, var5, var3, var4);
                            }
                            var80.field3995.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var81, var82, var83, var80.field3992, var5, (class265) null);
                        }
                    }
                }
                class7 var87 = var2.field2873;
                if (var87 != null) {
                    if ((var87.field71 & var2.field2877) != 0 && !class330.method2306(var6, var3, var4, var87.field71)) {
                        if (class67.field908) {
                            class147.method1068(var87.field71, class234.field3310, class173.field2353, class113.field1539, var6, var3, var4);
                        }
                        var87.field55.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var87.field62 - class234.field3310, var87.field68 - class173.field2353, var87.field60 - class113.field1539, var87.field69, var5, (class265) null);
                    }
                    if ((var87.field56 & var2.field2877) != 0 && !class330.method2306(var6, var3, var4, var87.field56)) {
                        if (class67.field908) {
                            class147.method1068(var87.field56, class234.field3310, class173.field2353, class113.field1539, var6, var3, var4);
                        }
                        var87.field57.method108(0, class115.field1554, class193.field2658, class340.field5104, class251.field3596, var87.field62 - class234.field3310, var87.field68 - class173.field2353, var87.field60 - class113.field1539, var87.field69, var5, (class265) null);
                    }
                }
            }
            if (var5 < class313.field4724 - 1) {
                class202 var88 = class142.field1940[var5 + 1][var3][var4];
                if (var88 != null && var88.field2892) {
                    class248.field3573.method1339((byte) -127, var88);
                }
            }
            if (var3 < class175.field2383) {
                class202 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field2892) {
                    class248.field3573.method1339((byte) -108, var89);
                }
            }
            if (var4 < class25.field315) {
                class202 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field2892) {
                    class248.field3573.method1339((byte) -128, var90);
                }
            }
            if (var3 > class175.field2383) {
                class202 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field2892) {
                    class248.field3573.method1339((byte) -112, var91);
                }
            }
            if (var4 > class25.field315) {
                class202 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field2892) {
                    class248.field3573.method1339((byte) 3, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V", line = 1327)
    public static void method728(int arg0) {
        if (arg0 <= -69) {
            field1360 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 1342)
    public class99(int arg0) {
        this.field1348 = arg0;
        this.field1347 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1346 = new class17(var2);
    }
}
