import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class302 {

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4877 = new String[] { method2603(method2602("F,3\u0005F\u0015\"3\u001cM")), method2603(method2602("Z.3[b\u001d")), method2603(method2602("]:4\u0013NT!")), method2603(method2602("Z.3[`\u001d")), method2603(method2602("Z.3[a\u001d")), method2603(method2602("Z.3[g\u001d")) };

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field4875 = 0;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public static int field4873 = 0;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field4871 = 999999;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "Ljk;")
    public static class662 field4874 = new class662();

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
    public static final void method2598(int arg0, int arg1) {
        try {
            field4876++;
            if (class315.field5127 != arg0) {
                if (arg0 == 14 || arg0 == 15) {
                    class717.method5206(48);
                }
                if (arg0 != 14 && class180.field2881 != null) {
                    class180.field2881.method2170(-122);
                    class180.field2881 = null;
                }
                if (arg0 == 3) {
                    class735.method5338(class36.field419 != class317.field5175, false);
                }
                if (arg0 == 7) {
                    class295.method2549(class586.field8498 != class317.field5175, 101);
                }
                if (arg0 == 5 || arg0 == 13) {
                    class162.method1519(0);
                } else if (arg0 == 6 || arg0 == 9) {
                    class717.method5206(112);
                }
                if (class245.method2109(class315.field5127, arg1 + 68)) {
                    class672.field9530.field717 = 2;
                    class618.field8924.field717 = 2;
                    class423.field6671.field717 = 2;
                    class42.field473.field717 = 2;
                    class659.field9417.field717 = 2;
                    class374.field6062.field717 = 2;
                    class719.field10519.field717 = 2;
                }
                if (class245.method2109(arg0, -103)) {
                    class644.field9230 = 1;
                    class140.field1957 = 0;
                    class709.field10270 = 0;
                    class229.field3560 = 1;
                    class33.field397 = 0;
                    class21.method137(8, true);
                    class672.field9530.field717 = 1;
                    class618.field8924.field717 = 1;
                    class423.field6671.field717 = 1;
                    class42.field473.field717 = 1;
                    class659.field9417.field717 = 1;
                    class374.field6062.field717 = 1;
                    class719.field10519.field717 = 1;
                }
                if (arg0 == 12 || arg0 == 3) {
                    class719.method5222(-115);
                }
                boolean var2 = arg0 == 2 || class663.method4811((byte) -8, arg0) || class592.method4342(false, arg0);
                boolean var3 = ~class315.field5127 == arg1 || class663.method4811((byte) -8, class315.field5127) || class592.method4342(false, class315.field5127);
                if (var2 != var3) {
                    if (var2) {
                        class588.field8526 = class10.field115;
                        if (class623.field8996.field6401.method4796(true) == 0) {
                            class525.method3924(2, -1);
                        } else {
                            class183.method1721(0, class747.field11028, class623.field8996.field6401.method4796(true), arg1 + 4, false, 2, class10.field115);
                            class201.method1831((byte) -119);
                        }
                        class173.field2772.method5620((byte) 48, false);
                    } else {
                        class525.method3924(2, arg1 + 2);
                        class173.field2772.method5620((byte) 48, true);
                    }
                }
                if (class245.method2109(arg0, -88) || arg0 == 14 || arg0 == 15) {
                    class662.field9437.method216();
                }
                class315.field5127 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4877[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)I")
    public static final int method2599(boolean arg0) {
        try {
            if (arg0) {
                return -24;
            }
            field4870++;
            if (class623.field8996.field6355.method4318(true) == 0) {
                for (int var1 = 0; var1 < class135.field1914; var1++) {
                    if (class680.field9699[var1].method2541(-29008) == 's' || class680.field9699[var1].method2541(-29008) == 'S') {
                        class623.field8996.method3244(22733, class623.field8996.field6355, 1);
                        class213.field3368 = true;
                        break;
                    }
                }
            }
            if (class678.field9610 == class492.field7416) {
                Runtime var2 = Runtime.getRuntime();
                int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
                long var4 = class712.method5167(-2334);
                if (class538.field7897 == 0L) {
                    class538.field7897 = var4;
                }
                if (var3 > 16384 && (var4 - class538.field7897) < 5000L) {
                    if ((var4 - class567.field8239) > 1000L) {
                        System.gc();
                        class567.field8239 = var4;
                    }
                    return 0;
                }
            }
            if (class678.field9616 == class492.field7416) {
                if (class223.field3498 == null) {
                    class223.field3498 = new class433(class173.field2772, class50.field606, class679.field9653, class599.field8685);
                }
                if (!class223.field3498.method3425(125)) {
                    return 0;
                }
                class89.method878(null, 0, true, true);
                class420.field6639 = !class667.method4840((byte) 111);
                class153.field2139 = class623.method4550(1, 1000000, class420.field6639 ? 34 : 32, false);
                class148.field2064 = class623.method4550(1, 1000000, 33, false);
                class242.field3745 = class623.method4550(1, 1000000, 13, false);
            }
            if (class678.field9623 == class492.field7416) {
                boolean var6 = class148.field2064.method581(116);
                int var7 = class233.field3615[33].method2669((byte) -119);
                int var8 = var7 + class233.field3615[class420.field6639 ? 34 : 32].method2669((byte) -86);
                int var9 = var8 + class233.field3615[13].method2669((byte) 27);
                int var10 = var9 + (var6 ? 100 : class148.field2064.method584(0));
                if (var10 != 400) {
                    return var10 / 4;
                }
                class460.field7085 = class153.field2139.method588((byte) 40);
                class106.field1531 = class148.field2064.method588((byte) 40);
                class179.method1703(class153.field2139, 24682);
                int var11 = class623.field8996.field6382.method2118(true);
                class625.field9004 = new class592(class305.field4924, class795.field11624, class148.field2064);
                int[] var12 = class625.field9004.method4344(var11, 0);
                if (var12.length == 0) {
                    var12 = class625.field9004.method4344(0, 0);
                }
                class270 var13 = new class270(class153.field2139, class242.field3745);
                if (var12.length > 0) {
                    class432.field6781 = new class749[var12.length];
                    for (int var14 = 0; var14 < class432.field6781.length; var14++) {
                        class432.field6781[var14] = new class275(class625.field9004.method4343(var12[var14], true), var13);
                    }
                }
            }
            if (class678.field9624 == class492.field7416) {
                class537.method4009(class242.field3745, class352.method2925((byte) -106), (byte) -128, class153.field2139);
            }
            if (class678.field9625 == class492.field7416) {
                int var15 = class452.method3511((byte) 107);
                int var16 = class431.method3411(7904);
                if (var15 < var16) {
                    return var15 * 100 / var16;
                }
            }
            if (class678.field9626 == class492.field7416) {
                if (class432.field6781 != null && class432.field6781.length > 0) {
                    if (class432.field6781[0].method2358(106) < 100) {
                        return 0;
                    }
                    if (class432.field6781.length > 1 && class625.field9004.method4346(1) && class432.field6781[1].method2358(75) < 100) {
                        return 0;
                    }
                }
                class51.method535(class662.field9437, 0);
                class663.method4814((byte) -102, class662.field9437);
                method2598(1, -3);
            }
            if (class678.field9627 == class492.field7416) {
                for (int var17 = 0; var17 < 4; var17++) {
                    class297.field4841[var17] = class747.method5432(class169.field2725, class126.field1823, -24907);
                }
            }
            if (class678.field9628 == class492.field7416) {
                class550.field8065 = class623.method4550(1, 1000000, 8, false);
                class404.field6396 = class623.method4550(1, 1000000, 0, false);
                class37.field423 = class623.method4550(1, 1000000, 1, false);
                class672.field9530 = class623.method4550(1, 1000000, 2, false);
                class424.field6685 = class623.method4550(1, 1000000, 3, false);
                class551.field8080 = class623.method4550(1, 1000000, 4, false);
                class686.field9915 = class623.method4550(1, 1000000, 5, true);
                class747.field11028 = class623.method4550(1, 1000000, 6, true);
                class480.field7311 = class623.method4550(1, 1000000, 7, false);
                class643.field9224 = class623.method4550(1, 1000000, 9, false);
                class432.field6787 = class623.method4550(1, 1000000, 10, false);
                class748.field11040 = class623.method4550(1, 1000000, 11, false);
                class546.field8029 = class623.method4550(1, 1000000, 12, false);
                class289.field4651 = class623.method4550(1, 1000000, 14, false);
                class345.field5607 = class623.method4550(1, 1000000, 15, false);
                class423.field6671 = class623.method4550(1, 1000000, 16, false);
                class618.field8924 = class623.method4550(1, 1000000, 17, false);
                class42.field473 = class623.method4550(1, 1000000, 18, false);
                class659.field9417 = class623.method4550(1, 1000000, 19, false);
                class374.field6062 = class623.method4550(1, 1000000, 20, false);
                class719.field10519 = class623.method4550(1, 1000000, 21, false);
                class58.field744 = class623.method4550(1, 1000000, 22, false);
                class40.field467 = class623.method4550(1, 1000000, 23, true);
                class793.field11598 = class623.method4550(1, 1000000, 24, false);
                class104.field1526 = class623.method4550(1, 1000000, 25, false);
                class200.field3160 = class623.method4550(1, 1000000, 26, true);
                class233.field3609 = class623.method4550(1, 1000000, 27, false);
                class362.field5846 = class623.method4550(1, 1000000, 28, true);
                class440.field6872 = class623.method4550(1, 1000000, 29, false);
                class453.field6996 = class623.method4550(1, 1000000, 30, true);
                class177.field2861 = class623.method4550(1, 1000000, 31, true);
                class599.field8684 = class623.method4550(2, 1000000, 36, true);
            }
            if (class678.field9629 == class492.field7416) {
                int var18 = 0;
                for (int var19 = 0; var19 < 37; var19++) {
                    if (class233.field3615[var19] != null) {
                        var18 += class233.field3615[var19].method2669((byte) 100) * class457.field7049[var19] / 100;
                    }
                }
                if (var18 != 100) {
                    if (class13.field154 < 0) {
                        class13.field154 = var18;
                    }
                    return (var18 - class13.field154) * 100 / (100 - class13.field154);
                }
                class275.method2359(0, class550.field8065);
                class537.method4009(class242.field3745, class352.method2925((byte) -118), (byte) -127, class550.field8065);
            }
            if (class678.field9630 == class492.field7416) {
                if (class10.field115 == -1) {
                    class10.field115 = class747.field11028.method585(-1, field4877[0]);
                }
                class585.method4301(22050);
                method2598(2, -3);
            }
            if (class678.field9631 == class492.field7416) {
                class32.method333(class453.field6996, !arg0, class393.field6256);
            }
            if (class678.field9632 == class492.field7416) {
                int var20 = class124.method1210((byte) -67);
                if (var20 < 100) {
                    return var20;
                }
                class645.method4669((byte) -125, class362.field5846.method587(1, !arg0));
                class253.method2145((byte) 106, class362.field5846.method587(3, true));
                class341.field5575 = new class663(class362.field5846);
            }
            if (class678.field9633 == class492.field7416) {
                if (class623.field8988 != -1 && !class480.field7311.method586(class623.field8988, -25034, 0)) {
                    return 99;
                }
                class259.field3910 = new class728(class200.field3160, class643.field9224, class550.field8065);
                class289.field4655 = new class13(class305.field4924, class795.field11624, class672.field9530);
                class78.field1216 = new class391(class305.field4924, class795.field11624, class672.field9530, class341.field5575);
                class100.field1465 = new class204(class305.field4924, class795.field11624, class672.field9530, class550.field8065);
                class793.field11596 = new class741(class305.field4924, class795.field11624, class618.field8924);
                class452.field6991 = new class87(class305.field4924, class795.field11624, class672.field9530);
                class295.field4813 = new class722(class305.field4924, class795.field11624, class672.field9530);
                class723.field10619 = new class89(class305.field4924, class795.field11624, class672.field9530, class550.field8065);
                class6.field55 = new class101(class305.field4924, class795.field11624, class672.field9530, class480.field7311);
                class374.field6073 = new class33(class305.field4924, class795.field11624, class672.field9530);
                class199.field3154 = new class791(class305.field4924, class795.field11624, class672.field9530);
                class370.field5999 = new class536(class305.field4924, class795.field11624, true, class423.field6671, class480.field7311);
                class362.field5915 = new class269(class305.field4924, class795.field11624, class672.field9530, class550.field8065);
                class179.field2874 = new class492(class305.field4924, class795.field11624, class672.field9530, class550.field8065);
                class395.field6267 = new class384(class305.field4924, class795.field11624, true, class42.field473, class480.field7311);
                class229.field3563 = new class51(class305.field4924, class795.field11624, true, class289.field4655, class659.field9417, class480.field7311);
                class161.field2548 = new class621(class305.field4924, class795.field11624, class672.field9530);
                class397.field6293 = new class238(class305.field4924, class795.field11624, class374.field6062, class404.field6396, class37.field423);
                class716.field10360 = new class587(class305.field4924, class795.field11624, class672.field9530);
                class653.field9349 = new class138(class305.field4924, class795.field11624, class672.field9530);
                class779.field11366 = new class206(class305.field4924, class795.field11624, class719.field10519, class480.field7311);
                class539.field7911 = new class149(class305.field4924, class795.field11624, class672.field9530);
                class354.field5706 = new class233(class305.field4924, class795.field11624, class672.field9530);
                class655.field9378 = new class490(class305.field4924, class795.field11624, class672.field9530);
                class581.field8375 = new class68(class305.field4924, class795.field11624, class58.field744);
                class531.field7801 = new class241(class305.field4924, class795.field11624, class672.field9530);
                class519.field7687 = new class396(class305.field4924, class795.field11624, class672.field9530);
                class46.field518 = new class363(class305.field4924, class795.field11624, class672.field9530);
                class51.method532(class550.field8065, false, class424.field6685, class480.field7311, class242.field3745);
                class643.method4654((byte) 29, class440.field6872);
                class488.field7369 = new class274(class795.field11624, class793.field11598, class104.field1526);
                class321.field5228 = new class665(class795.field11624, class793.field11598, class104.field1526, new class766());
                class407.method3278((byte) -86);
                class370.field5999.method3995(-106, ~class623.field8996.field6356.method4838(true) == -1);
                class398.field6315 = new class336();
                class181.method1710((byte) 27);
                class163.method1537((byte) 99, class233.field3609);
                class794.method5706(class259.field3910, true, class480.field7311);
                class355 var21 = new class355(class432.field6787.method591(true, "", field4877[2]));
                class333.method2813((byte) 23, var21);
                try {
                    jagmisc.init();
                } catch (Throwable var30) {
                }
                class748.field11042 = class588.method4320(121);
                class372.field6038 = new class747(true, class393.field6256);
            }
            if (class678.field9635 == class492.field7416) {
                int var22 = class578.method4232(class550.field8065, (byte) 92) + class148.method1347(true, -30953);
                int var23 = class217.method1934(-127) + class431.method3411(7904);
                if (var23 > var22) {
                    return var22 * 100 / var23;
                }
            }
            if (class678.field9636 == class492.field7416) {
                class770.method5556(class40.field467, class452.field6991, class295.field4813, class370.field5999, class362.field5915, class179.field2874, class398.field6315);
            }
            if (class678.field9637 == class492.field7416) {
                class335.field5467 = new boolean[class655.field9378.field7390];
                class380.field6121 = new int[class655.field9378.field7390];
                class723.field10611 = new String[class354.field5706.field3616];
                for (int var24 = 0; var24 < class655.field9378.field7390; var24++) {
                    if (class655.field9378.method3718(var24, -3292).field4859 == 0) {
                        class335.field5467[var24] = true;
                        class240.field3704++;
                    }
                    class380.field6121[var24] = -1;
                }
                class667.method4837(-2);
                class686.field9915.method610(true, (byte) 18, false);
                class747.field11028.method610(true, (byte) 32, true);
                class550.field8065.method610(true, (byte) 98, true);
                class242.field3745.method610(true, (byte) 18, true);
                class432.field6787.method610(true, (byte) 17, true);
                class672.field9530.field717 = 2;
                class652.field9339 = true;
                class618.field8924.field717 = 2;
                class423.field6671.field717 = 2;
                class42.field473.field717 = 2;
                class659.field9417.field717 = 2;
                class374.field6062.field717 = 2;
                class719.field10519.field717 = 2;
            }
            if (class678.field9638 == class492.field7416) {
                if (!class504.method3798(127, class36.field419)) {
                    return 0;
                }
                boolean var25 = true;
                for (int var26 = 0; var26 < class309.field5028[class36.field419].length; var26++) {
                    class683 var27 = class309.field5028[class36.field419][var26];
                    if (var27.field9782 == 5 && var27.field9737 != -1 && !class550.field8065.method586(var27.field9737, -25034, 0)) {
                        var25 = false;
                    }
                }
                if (!var25) {
                    return 0;
                }
            }
            if (class678.field9639 == class492.field7416) {
                class735.method5338(true, false);
            }
            if (class678.field9640 == class492.field7416) {
                class355.field5711.method4925(-24773);
                try {
                    class789.field11526.join();
                } catch (InterruptedException var29) {
                    return 0;
                }
                class355.field5711 = null;
                class432.field6781 = null;
                class625.field9004 = null;
                class153.field2139 = null;
                class789.field11526 = null;
                class148.field2064 = null;
                class476.method3642((byte) -128);
                class494.field7428 = class623.field8996.field6355.method4318(true) == 1;
                class623.field8996.method3244(22733, class623.field8996.field6355, 1);
                if (class494.field7428) {
                    class623.field8996.method3244(22733, class623.field8996.field6378, 0);
                } else if (class623.field8996.field6378.field8176 && class372.field6038.field11008 < 512 && class372.field6038.field11008 != 0) {
                    class623.field8996.method3244(22733, class623.field8996.field6378, 0);
                }
                class574.method4222((byte) 101);
                if (class494.field7428) {
                    class679.method4942(false, (byte) 84, 0);
                } else {
                    class679.method4942(false, (byte) 38, class623.field8996.field6378.method4132(true));
                }
                class453.method3520(class623.field8996.field6353.method2132(!arg0), (byte) 52, -1, -1, false);
                class51.method535(class662.field9437, 0);
                class663.method4814((byte) 61, class662.field9437);
                class738.method5355(class550.field8065, 0, class662.field9437);
                class81.method838(class513.field7596, 10);
            }
            return class278.method2385(-2334);
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field4877[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZIIBII)V")
    public static final void method2600(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        try {
            class6.field47 = arg6;
            class140.field1956 = arg2;
            field4872++;
            class351.field5678 = arg0;
            class30.field323 = arg5;
            class687.field9930 = arg3;
            if (arg1 && class140.field1956 >= 100) {
                class133.field1896 = class30.field323 * 512 + 256;
                class791.field11550 = class6.field47 * 512 + 256;
                class396.field6285 = class207.method1873(class791.field11550, -10, class673.field9554, class133.field1896) - class351.field5678;
            }
            class210.field3323 = -1;
            class344.field5593 = -1;
            if (arg4 != 72) {
                field4871 = 93;
            }
            class401.field6334 = 2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4877[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
    public static void method2601(int arg0) {
        try {
            int var1 = 127 % ((arg0 - 22) / 60);
            field4874 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4877[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2602(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2603(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
