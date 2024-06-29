import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class127 extends class124 {

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public int field3040 = 0;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lrd;")
    private static class117 field3031 = class95.method812(" million", (byte) 8);

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lrd;")
    public static class117 field3030 = class95.method812("::clientdrop", (byte) 8);

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lrd;")
    public static class117 field3028 = class95.method812("Lade Wordpack )2 ", (byte) 8);

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "Lrd;")
    public static class117 field3024 = field3031;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "[I")
    public static int[] field3033 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lrd;")
    public static class117 field3035 = class95.method812("Stufe)2", (byte) 8);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Laa;")
    public static class2 field3025 = new class2(512);

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "Lrd;")
    private static class117 field3041 = class95.method812("Enter object name", (byte) 8);

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "[I")
    public static int[] field3042 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "Lrd;")
    public static class117 field3043 = field3041;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "[I")
    public static int[] field3044;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    public static final void method1006(int arg0) {
        class45.field1270.method766(5);
        if (arg0 <= 34) {
            method1013(62);
        }
        field3034++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbf;I)V")
    public final void method1007(class14 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method153(true);
            if (var3 == 0) {
                field3027++;
                if (arg1 != -1) {
                    field3042 = null;
                    return;
                }
                return;
            }
            this.method1011(arg1 - 5, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lrd;Lge;BLrd;)Lra;")
    public static final class114 method1008(class117 arg0, class47 arg1, byte arg2, class117 arg3) {
        field3039++;
        int var4 = arg1.method509(arg0, 0);
        if (arg2 > -13) {
            return null;
        } else {
            int var5 = arg1.method523(var4, arg3, -1);
            return class24.method259((byte) 118, var4, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)V")
    public static final void method1009(int arg0, byte arg1, int arg2) {
        if (class16.field383 != 0 && arg0 != -1) {
            class53.method584(class136.field3273, arg0, 0, 10000, false, class16.field383);
            class71.field1984 = true;
        }
        if (arg1 != -108) {
            field3033 = null;
        }
        field3038++;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
    public static final void method1010(int arg0) {
        if (class86.field2247 > 0) {
            class86.field2247--;
        }
        field3029++;
        if (class35.field1025 > 1) {
            class35.field1025--;
        }
        if (class85.field2227) {
            class85.field2227 = false;
            class100.method850(111);
            return;
        }
        for (int var1 = 0; var1 < 100 && class109.method901((byte) 119); var1++) {
        }
        if (class52.field1464 != 30 && class52.field1464 != 35) {
            return;
        }
        if (class99.field2464 && class52.field1464 == 30) {
            client.field624 = 0;
            class53.field1515 = 0;
            while (class144.method1148(-29057)) {
            }
            for (int var2 = 0; var2 < class49.field1435.length; var2++) {
                class49.field1435[var2] = false;
            }
        }
        if (arg0 > -90) {
            field3028 = null;
        }
        class21.method234(169, -6, class25.field754);
        Object var3 = class2.field42.field2129;
        synchronized (class2.field42.field2129) {
            if (!class111.field2782) {
                class2.field42.field2140 = 0;
            } else if (client.field624 != 0 || class2.field42.field2140 >= 40) {
                class25.field754.method739(false, 178);
                int var4 = 0;
                class25.field754.method162(0, -23339);
                int var5 = class25.field754.field314;
                for (int var6 = 0; class2.field42.field2140 > var6 && class25.field754.field314 - var5 < 240; var6++) {
                    int var7 = class2.field42.field2139[var6];
                    var4++;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = class2.field42.field2141[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    int var9 = var8 * 765 + var7;
                    if (class2.field42.field2141[var6] == -1 && class2.field42.field2139[var6] == -1) {
                        var9 = 524287;
                        var7 = -1;
                        var8 = -1;
                    }
                    if (class84.field2196 != var7 || class35.field1046 != var8) {
                        int var10 = var7 - class84.field2196;
                        class84.field2196 = var7;
                        int var11 = var8 - class35.field1046;
                        class35.field1046 = var8;
                        if (class15.field355 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class25.field754.method164(19877, (class15.field355 << 12) + (var10 << 6) + var11);
                            class15.field355 = 0;
                        } else if (class15.field355 < 8) {
                            class25.field754.method151((byte) 14, (class15.field355 << 19) + var9 + 8388608);
                            class15.field355 = 0;
                        } else {
                            class25.field754.method124((class15.field355 << 19) + var9 - 1073741824, 0);
                            class15.field355 = 0;
                        }
                    } else if (class15.field355 < 2047) {
                        class15.field355++;
                    }
                }
                class73.field2042++;
                class25.field754.method148((byte) -101, class25.field754.field314 - var5);
                if (var4 >= class2.field42.field2140) {
                    class2.field42.field2140 = 0;
                } else {
                    class2.field42.field2140 -= var4;
                    for (int var12 = 0; var12 < class2.field42.field2140; var12++) {
                        class2.field42.field2139[var12] = class2.field42.field2139[var4 + var12];
                        class2.field42.field2141[var12] = class2.field42.field2141[var4 + var12];
                    }
                }
            }
        }
        if (client.field624 != 0) {
            class104.field2591++;
            long var13 = (class141.field3349 - class46.field1296) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class46.field1296 = class141.field3349;
            int var15 = class66.field1873;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var17 = class68.field1909;
            if (client.field624 == 2) {
                var16 = 1;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 502) {
                var17 = 502;
            }
            int var18 = var17 * 765 + var15;
            int var19 = (int) var13;
            class25.field754.method739(false, 27);
            class25.field754.method154(false, (var19 << 20) + (var16 << 19) + var18);
        }
        if (class49.field1435[96] || class49.field1435[97] || class49.field1435[98] || class49.field1435[99]) {
            class52.field1454 = true;
        }
        if (class97.field2436 > 0) {
            class97.field2436--;
        }
        if (class52.field1454 && class97.field2436 <= 0) {
            class97.field2436 = 20;
            class52.field1454 = false;
            class60.field1689++;
            class25.field754.method739(false, 226);
            class25.field754.method130(-128, class132.field3172);
            class25.field754.method130(91, class74.field2060);
        }
        if (class96.field2414 && !class100.field2471) {
            class144.field3465++;
            class100.field2471 = true;
            class25.field754.method739(false, 240);
            class25.field754.method162(1, -23339);
        }
        if (!class96.field2414 && class100.field2471) {
            class100.field2471 = false;
            class144.field3465++;
            class25.field754.method739(false, 240);
            class25.field754.method162(0, -23339);
        }
        class142.method1130(-76);
        if (class52.field1464 != 30 && class52.field1464 != 35) {
            return;
        }
        class26.method278(false);
        class58.method605(false);
        class119.field2922++;
        if (class119.field2922 > 750) {
            class100.method850(81);
            return;
        }
        class92.method798(512);
        class23.method255(0);
        class25.method269(true);
        if (class135.field3228 != 0) {
            class38.field1097 += 20;
            if (class38.field1097 >= 400) {
                class135.field3228 = 0;
            }
        }
        if (class135.field3231 != 0) {
            class128.field3091++;
            if (class128.field3091 >= 15) {
                if (class135.field3231 == 3) {
                    class18.field458 = true;
                }
                if (class135.field3231 == 2) {
                    class13.field262 = true;
                }
                class135.field3231 = 0;
            }
        }
        class77.field2094++;
        if (class42.field1207 != 0) {
            client.field608++;
            if (class92.field2323 + 5 < class121.field2961 || class92.field2323 - 5 > class121.field2961 || class46.field1305 + 5 < class66.field1878 || class66.field1878 < class46.field1305 - 5) {
                class7.field161 = true;
            }
            if (class53.field1515 == 0) {
                if (class42.field1207 == 3) {
                    class18.field458 = true;
                }
                if (class42.field1207 == 2) {
                    class13.field262 = true;
                }
                class42.field1207 = 0;
                if (class7.field161 && client.field608 >= 5) {
                    class57.field1578 = -1;
                    class135.method1101((byte) -108);
                    if (class57.field1578 == class26.field770 && class40.field1160 != class134.field3220) {
                        class46.field1301++;
                        class144 var20 = class15.method172(class26.field770, -13778);
                        byte var21 = 0;
                        if (class2.field53 == 1 && var20.field3467 == 206) {
                            var21 = 1;
                        }
                        if (var20.field3449[class134.field3220] <= 0) {
                            var21 = 0;
                        }
                        if (method1012(class97.method827((byte) -71, var20), (byte) 118)) {
                            int var24 = class40.field1160;
                            int var25 = class134.field3220;
                            var20.field3449[var25] = var20.field3449[var24];
                            var20.field3464[var25] = var20.field3464[var24];
                            var20.field3449[var24] = -1;
                            var20.field3464[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class134.field3220;
                            int var23 = class40.field1160;
                            while (var22 != var23) {
                                if (var22 < var23) {
                                    var20.method1147((byte) 127, var23, var23 - 1);
                                    var23--;
                                } else if (var22 > var23) {
                                    var20.method1147((byte) 113, var23, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method1147((byte) -55, class40.field1160, class134.field3220);
                        }
                        class25.field754.method739(false, 239);
                        class25.field754.method149(class26.field770, -20912);
                        class25.field754.method162(var21, -23339);
                        class25.field754.method130(88, class134.field3220);
                        class25.field754.method130(65, class40.field1160);
                    }
                } else if ((class43.field1229 == 1 || class60.method610(class21.field604 - 1, false)) && class21.field604 > 2) {
                    class13.method109((byte) 107);
                } else if (class21.field604 > 0) {
                    class41.method471(class21.field604 - 1, (byte) 50);
                }
                class128.field3091 = 10;
                client.field624 = 0;
            }
        }
        byte var26 = 34;
        if (class17.field428 == -1) {
            if (class121.field2977 != -1) {
                class14.method118(var26, -5, class121.field2977, 4, 516, 338, 4);
            } else if (class35.field1038 != -1) {
                class14.method118(var26, -5, class35.field1038, 4, 516, 338, 4);
            }
            if (class27.field805 != -1) {
                class14.method118(var26, -5, class27.field805, 553, 743, 466, 205);
            } else if (class134.field3210[class101.field2518] != -1) {
                class14.method118(var26, -5, class134.field3210[class101.field2518], 553, 743, 466, 205);
            }
            if (class56.field1553 != -1) {
                class14.method118(var26, -5, class56.field1553, 17, 496, 453, 357);
            } else if (class94.field2352 != -1) {
                class14.method118(var26, -5, class94.field2352, 17, 496, 453, 357);
            }
        } else {
            class14.method118(var26, -5, class17.field428, 0, 765, 503, 0);
            if (class100.field2495 != -1) {
                class14.method118(var26, -5, class100.field2495, 0, 765, 503, 0);
            }
        }
        if (class17.field428 == -1) {
            if (class121.field2977 != -1) {
                class14.method118(~var26, -5, class121.field2977, 4, 516, 338, 4);
            } else if (class35.field1038 != -1) {
                class14.method118(~var26, -5, class35.field1038, 4, 516, 338, 4);
            }
            if (class27.field805 != -1) {
                class14.method118(~var26, -5, class27.field805, 553, 743, 466, 205);
            } else if (class134.field3210[class101.field2518] != -1) {
                class14.method118(~var26, -5, class134.field3210[class101.field2518], 553, 743, 466, 205);
            }
            if (class56.field1553 != -1) {
                class14.method118(~var26, -5, class56.field1553, 17, 496, 453, 357);
            } else if (class94.field2352 != -1) {
                class14.method118(~var26, -5, class94.field2352, 17, 496, 453, 357);
            }
        } else {
            class14.method118(~var26, -5, class17.field428, 0, 765, 503, 0);
            if (class100.field2495 != -1) {
                class14.method118(~var26, -5, class100.field2495, 0, 765, 503, 0);
            }
        }
        class26.method273(11500);
        if (class30.field914 != -1) {
            int var27 = class30.field914;
            int var28 = class30.field896;
            boolean var29 = class136.method1103(0, var27, 0, true, var28, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (var29) {
                class99.field2458 = class66.field1873;
                class90.field2311 = class68.field1909;
                class38.field1097 = 0;
                class135.field3228 = 1;
            }
            class30.field914 = -1;
        }
        if (client.field624 == 1 && class2.field46 != null) {
            client.field624 = 0;
            class2.field46 = null;
            class18.field458 = true;
        }
        class73.method693((byte) 119);
        if (class17.field428 == -1) {
            class33.method384(-115);
            class5.method42((byte) 98);
            class95.method811((byte) 0);
        }
        if (class33.field991 == -1 && class124.field2993 == -1 && class96.field2420 == -1) {
            if (class99.field2461 > 0) {
                class99.field2461--;
            }
        } else if (class49.field1420 > class99.field2461) {
            class99.field2461++;
            if (class99.field2461 == class49.field1420) {
                if (class124.field2993 != -1) {
                    class13.field262 = true;
                }
                if (class33.field991 != -1) {
                    class18.field458 = true;
                }
            }
        }
        if (class53.field1515 == 1 || client.field624 == 1) {
            class14.field336++;
        }
        class137.method1115(2);
        if (class20.field492) {
            class21.method235((byte) 101);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class96.field2399[var30]++;
        }
        class32.method369(-21);
        int var31 = class61.method618((byte) -74);
        int var32 = class90.method791((byte) -86);
        if (var31 > 4500 && var32 > 4500) {
            class86.field2247 = 250;
            class144.method1138(4000, 5);
            class99.field2457++;
            class25.field754.method739(false, 140);
        }
        class63.field1803++;
        class124.field3001++;
        class41.field1182++;
        if (class41.field1182 > 500) {
            class41.field1182 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x2) == 2) {
                class59.field1667 += class44.field1256;
            }
            if ((var33 & 0x1) == 1) {
                class121.field2966 += class108.field2688;
            }
            if ((var33 & 0x4) == 4) {
                class138.field3322 += class5.field111;
            }
        }
        if (class121.field2966 < -50) {
            class108.field2688 = 2;
        }
        if (class59.field1667 < -55) {
            class44.field1256 = 2;
        }
        if (class59.field1667 > 55) {
            class44.field1256 = -2;
        }
        if (class124.field3001 > 500) {
            class124.field3001 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class14.field277 += class61.field1703;
            }
            if ((var34 & 0x1) == 1) {
                class99.field2459 += class144.field3538;
            }
        }
        if (class99.field2459 < -60) {
            class144.field3538 = 2;
        }
        if (class14.field277 < -20) {
            class61.field1703 = 1;
        }
        if (class14.field277 > 10) {
            class61.field1703 = -1;
        }
        if (class138.field3322 < -40) {
            class5.field111 = 1;
        }
        if (class138.field3322 > 40) {
            class5.field111 = -1;
        }
        if (class121.field2966 > 50) {
            class108.field2688 = -2;
        }
        if (class99.field2459 > 60) {
            class144.field3538 = -2;
        }
        if (class63.field1803 > 50) {
            class25.field754.method739(false, 147);
            class37.field1073++;
        }
        try {
            if (class119.field2923 != null && class25.field754.field314 > 0) {
                class119.field2923.method754(0, (byte) 93, class25.field754.field314, class25.field754.field326);
                class25.field754.field314 = 0;
                class63.field1803 = 0;
            }
        } catch (IOException var35) {
            class100.method850(117);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILbf;)V")
    private final void method1011(int arg0, int arg1, class14 arg2) {
        field3032++;
        if (~arg1 == arg0) {
            this.field3040 = arg2.method138((byte) 113);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)Z")
    public static final boolean method1012(int arg0, byte arg1) {
        if (arg1 <= 87) {
            return false;
        } else {
            field3037++;
            return (arg0 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field3031 = null;
        field3028 = null;
        field3042 = null;
        if (arg0 != 765) {
            field3043 = null;
        }
        field3025 = null;
        field3035 = null;
        field3043 = null;
        field3033 = null;
        field3030 = null;
        field3024 = null;
        field3044 = null;
        field3041 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII[Lhc;[BBI)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class52[] arg6, byte[] arg7, byte arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                    arg6[arg1].field1455[arg5 + var10][arg2 + var15] = class66.method660(arg6[arg1].field1455[arg5 + var10][arg2 + var15], -16777217);
                }
            }
        }
        field3036++;
        class14 var11 = new class14(arg7);
        if (arg8 > -124) {
            return;
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 == var12 && arg4 <= var13 && arg4 + 8 > var13 && arg3 <= var14 && arg3 + 8 > var14) {
                        class37.method453(arg5 + class64.method648(arg9, var13 & 0x7, var14 & 0x7, (byte) -65), arg2 - -class65.method654(var13 & 0x7, -5005, var14 & 0x7, arg9), arg1, 0, var11, 0, arg9, (byte) 44);
                    } else {
                        class37.method453(-1, -1, 0, 0, var11, 0, 0, (byte) 44);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)Lie;")
    public static final class61 method1015(int arg0, boolean arg1) {
        field3026++;
        class61 var2 = (class61) class58.field1628.method774((long) arg0, 329);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field2417.method526((byte) 120, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class61 var4 = new class61();
        class14 var5 = new class14(var3);
        var5.field314 = var5.field326.length - 12;
        int var6 = var5.method121((byte) -85);
        var4.field1720 = var5.method138((byte) 93);
        var4.field1717 = var5.method138((byte) 116);
        var4.field1713 = var5.method138((byte) 79);
        var4.field1707 = var5.method138((byte) 99);
        if (arg1) {
            field3043 = null;
        }
        var4.field1721 = new int[var6];
        var5.field314 = 0;
        int var7 = 0;
        var4.field1699 = new int[var6];
        var4.field1709 = new class117[var6];
        while (var5.field326.length - 12 > var5.field314) {
            int var8 = var5.method138((byte) 104);
            if (var8 == 3) {
                var4.field1709[var7] = var5.method171((byte) 110);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field1721[var7] = var5.method153(true);
            } else {
                var4.field1721[var7] = var5.method121((byte) -78);
            }
            var4.field1699[var7++] = var8;
        }
        class58.field1628.method773((long) arg0, (byte) -17, var4);
        return var4;
    }
}
