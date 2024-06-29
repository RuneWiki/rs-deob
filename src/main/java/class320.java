import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class320 extends class172 {

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "J")
    public static volatile long field4931 = 0L;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "[I")
    public static int[] field4935 = new int[] { 0, -2, 0, 0, 0, 0, 6, 0, -1, -1, 0, 0, 0, 3, 28, 8, 0, 4, 0, 0, -1, 5, 0, 0, 0, -1, 0, 0, 8, 0, 11, 8, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, -1, 0, 0, 10, 0, 2, 0, 3, 6, 7, 14, 0, 0, 0, 1, 2, 0, 0, 0, 3, 0, 0, 6, 7, 0, 17, 0, -1, 8, 0, 12, 0, 0, 6, 1, 0, 8, 3, 8, 4, 0, 0, -2, 0, 6, 0, 6, 0, 2, 10, 0, 0, 6, 0, 0, -1, 0, 4, 0, 0, 0, -1, 0, 0, 5, 8, -2, 0, -1, 0, -1, 15, -1, 0, -1, 0, 0, 1, 0, 4, 8, 0, 0, 0, 12, -2, 0, 0, 3, 0, 10, 0, 7, 0, -2, 2, 0, 0, 0, 3, 0, 0, 0, 2, 15, 12, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 9, 0, 6, 0, 0, 14, 0, 8, 0, 0, 0, 6, 6, 0, 2, 0, 0, 0, 0, 0, 8, 0, 0, 0, 5, 2, 0, 0, 0, -1, 0, 0, 7, 0, 0, 0, 20, 0, -2, 0, 0, 1, -2, -2, 0, 0, 0, 3, 0, -2, 12, 0, 6, 0, 3, 0, -1, 3, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 6, -2 };

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[C")
    public static char[] field4939 = new char[128];

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "J")
    public long field4932;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lia;")
    public class320 field4928;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lia;")
    public class320 field4934;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[[I")
    public static int[][] field4938;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 8)
    public static void method2257(int arg0) {
        field4939 = null;
        if (arg0 >= -31) {
            field4939 = (char[]) null;
        }
        field4935 = null;
        field4938 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILf;Lnc;ILsd;III)V", line = 24)
    public static final void method2258(int arg0, int arg1, class212 arg2, class171 arg3, int arg4, class244 arg5, int arg6, int arg7, int arg8) {
        field4929++;
        class160 var9 = new class160();
        var9.field2540 = arg1;
        var9.field2556 = arg6 * arg8;
        var9.field2564 = arg4 * 128;
        if (arg2 != null) {
            var9.field2567 = arg2.field3266;
            var9.field2552 = arg2.field3257;
            var9.field2547 = arg2.field3304;
            var9.field2559 = arg2.field3316 * 128;
            int var11 = arg2.field3306;
            var9.field2561 = arg2;
            int var12 = arg2.field3250;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg2.field3250;
                var12 = arg2.field3306;
            }
            var9.field2562 = arg2.field3270;
            var9.field2544 = arg2.field3318;
            var9.field2555 = (arg8 + var11) * 128;
            var9.field2560 = (arg4 + var12) * 128;
            if (arg2.field3289 != null) {
                var9.field2542 = true;
                var9.method1292(-126);
            }
            if (var9.field2544 != null) {
                var9.field2545 = var9.field2567 + (int) ((double) (var9.field2562 - var9.field2567) * Math.random());
            }
            class188.field2954.method2245(var9, 102);
        } else if (arg5 != null) {
            var9.field2549 = arg5;
            class130 var10 = arg5.field3802;
            if (var10.field2149 != null) {
                var9.field2542 = true;
                var10 = var10.method1120((byte) -127);
            }
            if (var10 != null) {
                var9.field2560 = (var10.field2192 + arg4) * 128;
                var9.field2555 = (arg8 + var10.field2192) * 128;
                var9.field2547 = class106.method918(arg5, true);
                var9.field2552 = var10.field2212;
                var9.field2559 = var10.field2178 * 128;
            }
            class210.field3232.method2245(var9, 90);
        } else if (arg3 != null) {
            var9.field2541 = arg3;
            var9.field2555 = (arg3.method808(120) + arg8) * 128;
            var9.field2560 = (arg4 + arg3.method808(124)) * 128;
            var9.field2547 = class50.method482(arg3, true);
            var9.field2552 = arg3.field2716;
            var9.field2559 = arg3.field2718 * 128;
            class328.field5044.method375(var9, (long) arg0, -116);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Lrg;", line = 111)
    public static final class342 method2259(int arg0, int arg1, int arg2) {
        class342 var3 = class355.method2497(0, arg1);
        field4937++;
        if (~arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field5312 == null || var3.field5312.length <= arg0) {
            return null;
        } else {
            return var3.field5312[arg0];
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[[[BIBII)V", line = 126)
    public static final void method2260(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class105.field1577++;
        class193.field3045 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class233.field3627; var12 < class335.field5119; var12++) {
            class329[][] var13 = class170.field2689[var12];
            for (int var14 = class79.field1147; var14 < class120.field1857; var14++) {
                for (int var15 = class185.field2896; var15 < class33.field512; var15++) {
                    class329 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class353.field5632[var14 + class131.field2216 - class4.field46][var15 + class131.field2216 - class192.field3033] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field5076 = true;
                            var16.field5079 = true;
                            if (var16.field5063 > 0) {
                                var16.field5054 = true;
                            } else {
                                var16.field5054 = false;
                            }
                            class193.field3045++;
                        } else {
                            var16.field5076 = false;
                            var16.field5079 = false;
                            var16.field5055 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field5064 != null) {
                                    class202 var17 = var16.field5064;
                                    var17.field3121.method32(0, var12, var17.field3126, var17.field3117, var17.field3128);
                                    if (var17.field3116 != null) {
                                        var17.field3116.method32(0, var12, var17.field3126, var17.field3117, var17.field3128);
                                    }
                                }
                                if (var16.field5065 != null) {
                                    class280 var18 = var16.field5065;
                                    var18.field4319.method32(var18.field4326, var12, var18.field4327, var18.field4320, var18.field4329);
                                    if (var18.field4317 != null) {
                                        var18.field4317.method32(var18.field4326, var12, var18.field4327, var18.field4320, var18.field4329);
                                    }
                                }
                                if (var16.field5062 != null) {
                                    class44 var19 = var16.field5062;
                                    var19.field714.method32(0, var12, var19.field705, var19.field709, var19.field708);
                                }
                                if (var16.field5070 != null) {
                                    for (int var20 = 0; var20 < var16.field5063; var20++) {
                                        class297 var21 = var16.field5070[var20];
                                        var21.field4605.method32(var21.field4600, var12, var21.field4615, var21.field4609, var21.field4604);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class93.field1425 == class277.field4290;
        if (class240.field3737) {
            GL var23 = class240.field3771;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class340.method2393();
                class211.method1562(-1, 3, -54);
                class144.field2355 = true;
                class272.method1991();
                class286.field4434 = -1;
                class187.field2940 = -1;
                for (int var24 = 0; var24 < class37.field557[0].length; var24++) {
                    class125 var25 = class37.field557[0][var24];
                    float var26 = 251.5F - (var25.field2076 ? 1.0F : 0.5F);
                    if (class286.field4434 != var25.field2073) {
                        class286.field4434 = var25.field2073;
                        class74.method693(var25.field2073, false);
                        class103.method891(class109.method951(-1));
                    }
                    var25.method1084(class170.field2689, var26, false);
                }
                class272.method1992();
            } else {
                int var27 = class233.field3627;
                while (true) {
                    if (var27 >= class335.field5119) {
                        class299.method2154(class4.field46, class192.field3033, class170.field2689);
                        break;
                    }
                    for (int var28 = 0; var28 < class37.field557[var27].length; var28++) {
                        class125 var29 = class37.field557[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2076 ? 1.0F : 0.5F);
                        if (var29.field2086 != -1 && class231.method1730(-109, class107.field1619.method755(false, var29.field2086)) && class164.field2603) {
                            class74.method693(var29.field2073, false);
                        }
                        var29.method1084(class170.field2689, var30, false);
                    }
                    if (var27 == 0 && class19.field311 > 0) {
                        class240.method1784(101.5F);
                        class127.method1104(class4.field46, class192.field3033, class131.field2216, arg1, class353.field5632, class277.field4290[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class233.field3627; var31 < class335.field5119; var31++) {
            class329[][] var32 = class170.field2689[var31];
            for (int var33 = -class131.field2216; var33 <= 0; var33++) {
                int var34 = class4.field46 + var33;
                int var35 = class4.field46 - var33;
                if (var34 >= class79.field1147 || var35 < class120.field1857) {
                    for (int var36 = -class131.field2216; var36 <= 0; var36++) {
                        int var37 = class192.field3033 + var36;
                        int var38 = class192.field3033 - var36;
                        if (var34 >= class79.field1147) {
                            if (var37 >= class185.field2896) {
                                class329 var39 = var32[var34][var37];
                                if (var39 != null && var39.field5076) {
                                    class356.method2499(var39, true);
                                }
                            }
                            if (var38 < class33.field512) {
                                class329 var40 = var32[var34][var38];
                                if (var40 != null && var40.field5076) {
                                    class356.method2499(var40, true);
                                }
                            }
                        }
                        if (var35 < class120.field1857) {
                            if (var37 >= class185.field2896) {
                                class329 var41 = var32[var35][var37];
                                if (var41 != null && var41.field5076) {
                                    class356.method2499(var41, true);
                                }
                            }
                            if (var38 < class33.field512) {
                                class329 var42 = var32[var35][var38];
                                if (var42 != null && var42.field5076) {
                                    class356.method2499(var42, true);
                                }
                            }
                        }
                        if (class193.field3045 == 0) {
                            if (!var22) {
                                class197.field3081 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class233.field3627; var43 < class335.field5119; var43++) {
            class329[][] var44 = class170.field2689[var43];
            for (int var45 = -class131.field2216; var45 <= 0; var45++) {
                int var46 = class4.field46 + var45;
                int var47 = class4.field46 - var45;
                if (var46 >= class79.field1147 || var47 < class120.field1857) {
                    for (int var48 = -class131.field2216; var48 <= 0; var48++) {
                        int var49 = class192.field3033 + var48;
                        int var50 = class192.field3033 - var48;
                        if (var46 >= class79.field1147) {
                            if (var49 >= class185.field2896) {
                                class329 var51 = var44[var46][var49];
                                if (var51 != null && var51.field5076) {
                                    class356.method2499(var51, false);
                                }
                            }
                            if (var50 < class33.field512) {
                                class329 var52 = var44[var46][var50];
                                if (var52 != null && var52.field5076) {
                                    class356.method2499(var52, false);
                                }
                            }
                        }
                        if (var47 < class120.field1857) {
                            if (var49 >= class185.field2896) {
                                class329 var53 = var44[var47][var49];
                                if (var53 != null && var53.field5076) {
                                    class356.method2499(var53, false);
                                }
                            }
                            if (var50 < class33.field512) {
                                class329 var54 = var44[var47][var50];
                                if (var54 != null && var54.field5076) {
                                    class356.method2499(var54, false);
                                }
                            }
                        }
                        if (class193.field3045 == 0) {
                            if (!var22) {
                                class197.field3081 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class197.field3081 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z", line = 504)
    public final boolean method2261(byte arg0) {
        field4930++;
        if (this.field4928 == null) {
            return false;
        } else {
            if (arg0 != -46) {
                method2263(-122);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 521)
    public final void method2262(byte arg0) {
        field4940++;
        if (this.field4928 == null) {
            return;
        }
        this.field4928.field4934 = this.field4934;
        if (arg0 != -102) {
            this.method2262((byte) -53);
        }
        this.field4934.field4928 = this.field4928;
        this.field4928 = null;
        this.field4934 = null;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 543)
    public static final void method2263(int arg0) {
        field4936++;
        class226.field3534 = 0;
        class205.field3161 = 0;
        class93.field1404 = 0;
        class110.field1688 = 0;
        class25.field421 = 0;
        class111.field1702 = 0;
        class113.field1747 = 0;
        class271.field4189 = 0;
        class122.field1957 = 0;
        class31.field482 = 0;
        class172.field2741 = 0;
        class36.field541 = 0;
        class91.field1304 = 0;
        class86.field1238 = 0;
        class239.field3713 = 0;
        class13.field158 = 0;
        class331.field5088 = 0;
        class29.field473 = 0;
        class261.field3998 = 0;
        class25.field406 = 0;
        class258.field3963 = 0;
        class155.field2500 = 0;
        class221.field3431 = 0;
        class350.field5569 = 0;
        class217.field3399 = 0;
        class113.field1734 = 0;
        class344.field5455 = 0;
        class23.field359 = 0;
        class186.field2906 = 0;
        class326.field4999 = 0;
        class300.field4649 = 0;
        class209.field3220 = 0;
        class263.field4049 = 0;
        class306.field4751 = 0;
        class337.field5174 = 0;
        class279.field4300 = 0;
        class114.field1748 = 0;
        class153.field2478 = 0;
        class307.field4756 = 0;
        class223.field3472 = 0;
        class239.field3697 = 0;
        class130.field2190 = 0;
        class345.field5483 = 0;
        class121.field1941 = 0;
        class360.field5712 = 0;
        class25.field422 = 0;
        class239.field3707 = 0;
        class290.field4523 = 0;
        class25.field434 = 0;
        class326.field5002 = 0;
        class139.field2299 = 0;
        class340.field5233 = 0;
        class258.field3952 = 0;
        class150.field2453 = 0;
        class276.field4269 = 0;
        class148.field2417 = 0;
        class113.field1730 = 0;
        class296.field4594 = 0;
        class10.field142 = 0;
        class286.field4438 = 0;
        class18.field265 = 0;
        class43.field680 = 0;
        class344.field5457 = 0;
        class258.field3949 = 0;
        class18.field302 = 0;
        class290.field4528 = 0;
        class34.field521 = 0;
        class294.field4562 = 0;
        class91.field1347 = 0;
        class13.field219 = 0;
        class215.field3370 = 0;
        class236.field3670 = 0;
        class4.field50 = 0;
        class83.field1201 = 0;
        class102.field1537 = 0;
        class286.field4439 = 0;
        class13.field206 = 0;
        class74.field1105 = 0;
        class203.field3144 = 0;
        class18.field288 = 0;
        class148.field2408 = 0;
        class279.field4308 = 0;
        class317.field4881 = 0;
        class120.field1863 = 0;
        class18.field296 = 0;
        class79.field1161 = 0;
        class113.field1740 = 0;
        class157.field2515 = 0;
        class171.field2701 = 0;
        class186.field2908 = 0;
        class217.field3387 = 0;
        class231.field3606 = 0;
        class278.field4295 = 0;
        class202.field3115 = 0;
        class25.field452 = 0;
        class36.field539 = 0;
        class262.field4015 = 0;
        class228.field3565 = 0;
        class318.field4900 = 0;
        class123.field1976 = 0;
        class177.field2793 = 0;
        class224.field3512 = 0;
        class296.field4592 = 0;
        class244.field3795 = 0;
        class13.field210 = 0;
        class168.field2675 = 0;
        class353.field5637 = 0;
        class85.field1221 = 0;
        class212.field3267 = 0;
        class355.field5658 = 0;
        class223.field3464 = 0;
        class3.field18 = 0;
        class121.field1903 = 0;
        class25.field441 = 0;
        class300.field4655 = 0;
        class13.field220 = 0;
        class172.field2742 = 0;
        class139.field2314 = 0;
        class166.field2631 = 0;
        class33.field500 = 0;
        class18.field281 = 0;
        class274.field4250 = 0;
        class109.field1655 = 0;
        class43.field681 = 0;
        class263.field4082 = 0;
        class175.field2768 = 0;
        class153.field2479 = 0;
        class223.field3463 = 0;
        class268.field4141 = 0;
        class233.field3631 = 0;
        class334.field5107 = 0;
        class91.field1316 = 0;
        class248.field3850 = 0;
        class149.field2445 = 0;
        class129.field2138 = 0;
        class86.field1224 = 0;
        class224.field3494 = 0;
        class68.field1038 = 0;
        class13.field201 = 0;
        class288.field4493 = 0;
        class238.field3681 = 0;
        class281.field4348 = 0;
        class111.field1704 = 0;
        class25.field437 = 0;
        class140.field2324 = 0;
        class327.field5036 = 0;
        class317.field4885 = 0;
        class314.field4856 = 0;
        class350.field5560 = 0;
        class66.field1008 = 0;
        class151.field2461 = 0;
        class283.field4371 = 0;
        class81.field1183 = 0;
        class234.field3651 = 0;
        class363.field5744 = 0;
        class224.field3502 = 0;
        class360.field5707 = 0;
        class244.field3804 = 0;
        class235.field3666 = 0;
        class224.field3483 = 0;
        class256.field3940 = 0;
        class296.field4586 = 0;
        class15.field244 = 0;
        class244.field3794 = 0;
        class326.field5009 = 0;
        class266.field4121 = 0;
        class295.field4579 = 0;
        class91.field1360 = 0;
        class362.field5738 = 0;
        class293.field4553 = 0;
        class279.field4297 = 0;
        class58.field911 = 0;
        class185.field2894 = 0;
        class223.field3477 = 0;
        class261.field4007 = 0;
        class203.field3143 = 0;
        class118.field1811 = 0;
        class87.field1249 = 0;
        class324.field4988 = 0;
        class207.field3189 = 0;
        class22.field341 = 0;
        class190.field2978 = 0;
        class362.field5730 = 0;
        class222.field3460 = 0;
        class288.field4480 = 0;
        class256.field3938 = 0;
        class50.field785 = 0;
        class45.field720 = 0;
        class202.field3109 = 0;
        class148.field2397 = 0;
        class233.field3630 = 0;
        class223.field3473 = 0;
        class310.field4807 = 0;
        class48.field747 = 0;
        class337.field5165 = 0;
        class252.field3870 = 0;
        class316.field4874 = 0;
        class268.field4133 = 0;
        class360.field5706 = 0;
        class342.field5418 = 0;
        class59.field923 = 0;
        class212.field3305 = 0;
        class350.field5575 = 0;
        class165.field2622 = 0;
        class18.field277 = 0;
        class148.field2407 = 0;
        class227.field3541 = 0;
        class252.field3890 = 0;
        class188.field2949 = 0;
        class203.field3139 = 0;
        class149.field2442 = 0;
        class18.field283 = 0;
        class13.field195 = 0;
        class51.field791 = 0;
        class154.field2499 = 0;
        class209.field3217 = 0;
        class222.field3445 = 0;
        class255.field3932 = 0;
        class292.field4544 = 0;
        class42.field674 = 0;
        class104.field1553 = 0;
        class203.field3145 = 0;
        class350.field5577 = 0;
        class238.field3686 = 0;
        class101.field1521 = 0;
        class158.field2523 = 0;
        class90.field1273 = 0;
        class76.field1121 = 0;
        class174.field2765 = 0;
        class18.field262 = 0;
        class277.field4287 = 0;
        class173.field2756 = 0;
        class18.field304 = 0;
        class176.field2773 = 0;
        class64.field984 = 0;
        class53.field802 = 0;
        class113.field1725 = 0;
        class105.field1585 = 0;
        class317.field4879 = 0;
        class20.field332 = 0;
        class100.field1514 = 0;
        class343.field5450 = 0;
        class310.field4779 = 0;
        class41.field655 = 0;
        class224.field3497 = 0;
        class25.field408 = 0;
        class353.field5634 = 0;
        class25.field412 = 0;
        class89.field1263 = 0;
        class217.field3385 = 0;
        class160.field2566 = 0;
        class82.field1189 = 0;
        class347.field5513 = 0;
        class324.field4986 = 0;
        class108.field1623 = 0;
        class350.field5551 = 0;
        class172.field2739 = 0;
        class222.field3448 = 0;
        class116.field1786 = 0;
        class217.field3396 = 0;
        class282.field4364 = 0;
        class262.field4016 = 0;
        class227.field3548 = 0;
        class290.field4511 = 0;
        class33.field505 = 0;
        class25.field443 = 0;
        class335.field5124 = 0;
        class25.field399 = 0;
        class356.field5660 = 0;
        class362.field5729 = 0;
        class13.field164 = 0;
        class255.field3929 = 0;
        class186.field2926 = 0;
        class36.field536 = 0;
        class20.field322 = 0;
        class33.field509 = 0;
        class25.field383 = 0;
        class146.field2385 = 0;
        class224.field3482 = 0;
        class284.field4392 = 0;
        class25.field442 = 0;
        class116.field1779 = 0;
        class74.field1103 = 0;
        class244.field3806 = 0;
        class264.field4104 = 0;
        class249.field3858 = 0;
        class319.field4926 = 0;
        class109.field1642 = 0;
        class18.field278 = 0;
        class342.field5298 = 0;
        class74.field1092 = 0;
        class19.field313 = 0;
        class46.field723 = 0;
        class342.field5320 = 0;
        class25.field417 = 0;
        class181.field2849 = 0;
        class258.field3962 = 0;
        class109.field1633 = 0;
        class25.field393 = 0;
        class319.field4927 = 0;
        class332.field5094 = 0;
        class139.field2302 = 0;
        class338.field5207 = 0;
        class345.field5500 = 0;
        class171.field2711 = 0;
        class185.field2902 = 0;
        class25.field392 = 0;
        class349.field5546 = 0;
        class191.field2992 = 0;
        class29.field469 = 0;
        class210.field3228 = 0;
        class49.field757 = 0;
        class4.field53 = 0;
        class346.field5503 = 0;
        class168.field2674 = 0;
        class348.field5529 = 0;
        class72.field1074 = 0;
        class62.field960 = 0;
        class294.field4574 = 0;
        class105.field1579 = 0;
        class18.field300 = 0;
        class232.field3615 = 0;
        class106.field1595 = 0;
        class286.field4440 = 0;
        class344.field5472 = 0;
        class327.field5032 = 0;
        class133.field2234 = 0;
        class268.field4142 = 0;
        class205.field3160 = 0;
        class119.field1818 = 0;
        class362.field5735 = 0;
        class134.field2240 = 0;
        class260.field3979 = 0;
        class139.field2297 = 0;
        class18.field284 = 0;
        class221.field3441 = 0;
        class277.field4289 = 0;
        class93.field1403 = 0;
        class41.field653 = 0;
        class4.field54 = 0;
        class31.field488 = 0;
        class207.field3194 = 0;
        class319.field4917 = 0;
        class261.field4011 = 0;
        class123.field1967 = 0;
        class173.field2757 = 0;
        class350.field5581 = 0;
        class23.field356 = 0;
        class363.field5743 = 0;
        class239.field3700 = 0;
        class300.field4657 = 0;
        class178.field2808 = 0;
        class340.field5228 = 0;
        class119.field1828 = 0;
        class25.field385 = 0;
        class268.field4139 = 0;
        class239.field3703 = 0;
        class148.field2399 = 0;
        class188.field2945 = 0;
        class86.field1232 = 0;
        class290.field4519 = 0;
        class337.field5148 = 0;
        class120.field1867 = 0;
        class18.field308 = 0;
        class42.field672 = 0;
        class37.field550 = 0;
        class343.field5446 = 0;
        class143.field2348 = 0;
        class140.field2323 = 0;
        class332.field5097 = 0;
        class139.field2320 = 0;
        class294.field4564 = 0;
        class244.field3800 = 0;
        class9.field126 = 0;
        class244.field3798 = 0;
        class14.field238 = 0;
        class346.field5501 = 0;
        class279.field4298 = 0;
        class224.field3478 = 0;
        class310.field4789 = 0;
        class324.field4984 = 0;
        class194.field3053 = 0;
        class116.field1784 = 0;
        class344.field5459 = 0;
        class6.field90 = 0;
        class249.field3862 = 0;
        class167.field2668 = 0;
        class338.field5190 = 0;
        class79.field1143 = 0;
        class72.field1085 = 0;
        class255.field3921 = 0;
        class260.field3978 = 0;
        client.field1854 = 0;
        class171.field2702 = 0;
        class228.field3560 = 0;
        class356.field5659 = 0;
        class128.field2133 = 0;
        class67.field1027 = 0;
        class253.field3907 = 0;
        class165.field2618 = 0;
        class41.field651 = 0;
        class224.field3508 = 0;
        class86.field1239 = 0;
        class268.field4143 = 0;
        class37.field555 = 0;
        class281.field4341 = 0;
        class133.field2230 = 0;
        class247.field3838 = 0;
        class18.field287 = 0;
        class58.field909 = 0;
        class294.field4568 = 0;
        class214.field3357 = 0;
        class108.field1621 = 0;
        class270.field4165 = 0;
        class342.field5267 = 0;
        class197.field3086 = 0;
        class236.field3672 = 0;
        class262.field4013 = 0;
        class13.field218 = 0;
        class144.field2357 = 0;
        class99.field1489 = 0;
        class25.field429 = 0;
        class224.field3484 = 0;
        class317.field4877 = 0;
        class348.field5525 = 0;
        class18.field298 = 0;
        class326.field4997 = 0;
        class327.field5033 = 0;
        class233.field3640 = 0;
        class178.field2805 = 0;
        class260.field3976 = 0;
        class344.field5478 = 0;
        class350.field5555 = 0;
        class254.field3911 = 0;
        class178.field2801 = 0;
        class91.field1339 = 0;
        class209.field3216 = 0;
        class119.field1830 = 0;
        class119.field1836 = 0;
        class57.field902 = 0;
        class18.field294 = 0;
        class185.field2899 = 0;
        class46.field729 = 0;
        class227.field3537 = 0;
        class327.field5029 = 0;
        class254.field3910 = 0;
        class104.field1556 = 0;
        class13.field196 = 0;
        class114.field1756 = 0;
        class119.field1821 = 0;
        class362.field5737 = 0;
        class331.field5085 = 0;
        class86.field1244 = 0;
        class339.field5214 = 0;
        class57.field894 = 0;
        class149.field2439 = 0;
        class193.field3040 = 0;
        class57.field899 = 0;
        class25.field402 = 0;
        class282.field4360 = 0;
        class89.field1268 = 0;
        class300.field4651 = 0;
        class301.field4674 = 0;
        class171.field2728 = 0;
        class252.field3868 = 0;
        class201.field3106 = 0;
        class192.field3014 = 0;
        class104.field1561 = 0;
        class146.field2390 = 0;
        class128.field2121 = 0;
        class37.field562 = 0;
        class37.field552 = 0;
        class167.field2667 = 0;
        class105.field1590 = 0;
        class317.field4878 = 0;
        class86.field1242 = 0;
        class13.field216 = 0;
        class31.field487 = 0;
        class199.field3092 = 0;
        class63.field962 = 0;
        class228.field3573 = 0;
        class326.field5022 = 0;
        class46.field733 = 0;
        class288.field4490 = 0;
        class329.field5050 = 0;
        class75.field1107 = 0;
        class138.field2286 = 0;
        class313.field4849 = 0;
        class173.field2750 = 0;
        class190.field2984 = 0;
        class13.field160 = 0;
        class104.field1555 = 0;
        class45.field717 = 0;
        class185.field2900 = 0;
        class20.field333 = 0;
        class317.field4896 = 0;
        class165.field2620 = 0;
        class126.field2104 = 0;
        class350.field5578 = 0;
        class120.field1875 = 0;
        class288.field4472 = 0;
        class13.field211 = 0;
        class221.field3435 = 0;
        class32.field497 = 0;
        class301.field4668 = 0;
        class252.field3880 = 0;
        class25.field401 = 0;
        class304.field4734 = 0;
        class217.field3386 = 0;
        class148.field2398 = 0;
        class278.field4296 = 0;
        class91.field1374 = 0;
        class243.field3784 = 0;
        class276.field4276 = 0;
        class119.field1829 = 0;
        class98.field1476 = 0;
        class104.field1563 = 0;
        class13.field165 = 0;
        class129.field2145 = 0;
        class157.field2509 = 0;
        class25.field420 = 0;
        class18.field306 = 0;
        class66.field1003 = 0;
        class112.field1710 = 0;
        class222.field3456 = 0;
        class252.field3875 = 0;
        class51.field796 = 0;
        class163.field2589 = 0;
        class49.field766 = 0;
        class130.field2181 = 0;
        class74.field1102 = 0;
        class50.field780 = 0;
        class129.field2142 = 0;
        class41.field658 = 0;
        class57.field897 = 0;
        class48.field753 = 0;
        class231.field3604 = 0;
        class290.field4518 = 0;
        class18.field268 = 0;
        class119.field1819 = 0;
        class290.field4526 = 0;
        client.field1849 = 0;
        class138.field2288 = 0;
        class184.field2892 = 0;
        class194.field3046 = 0;
        class101.field1530 = 0;
        class221.field3432 = 0;
        class191.field3004 = 0;
        class337.field5151 = 0;
        class18.field263 = 0;
        class295.field4581 = 0;
        class313.field4850 = 0;
        class139.field2308 = 0;
        class34.field519 = 0;
        class114.field1750 = 0;
        class362.field5723 = 0;
        class37.field548 = 0;
        class301.field4682 = 0;
        class190.field2986 = 0;
        class334.field5113 = 0;
        class93.field1419 = 0;
        class222.field3451 = 0;
        class33.field498 = 0;
        class101.field1527 = 0;
        class288.field4465 = 0;
        class181.field2826 = 0;
        field4930 = 0;
        class228.field3570 = 0;
        class339.field5219 = 0;
        class339.field5210 = 0;
        class129.field2146 = 0;
        class259.field3974 = 0;
        class113.field1737 = 0;
        class223.field3468 = 0;
        client.field1841 = 0;
        class91.field1335 = 0;
        class233.field3636 = 0;
        class214.field3345 = 0;
        class151.field2466 = 0;
        class342.field5401 = 0;
        class48.field746 = 0;
        class346.field5502 = 0;
        class63.field965 = 0;
        class25.field387 = 0;
        class43.field695 = 0;
        class244.field3799 = 0;
        class223.field3474 = 0;
        class227.field3535 = 0;
        class25.field426 = 0;
        class18.field274 = 0;
        class139.field2313 = 0;
        class25.field388 = 0;
        class3.field14 = 0;
        class252.field3892 = 0;
        class279.field4311 = 0;
        class246.field3829 = 0;
        class296.field4593 = 0;
        class78.field1132 = 0;
        class114.field1758 = 0;
        class360.field5703 = 0;
        class228.field3566 = 0;
        class10.field139 = 0;
        class227.field3539 = 0;
        class214.field3353 = 0;
        class187.field2937 = 0;
        class165.field2625 = 0;
        class81.field1180 = 0;
        class74.field1094 = 0;
        class224.field3499 = 0;
        class44.field712 = 0;
        client.field1843 = 0;
        class321.field4944 = 0;
        class192.field3015 = 0;
        class165.field2619 = 0;
        class110.field1687 = 0;
        class25.field418 = 0;
        class3.field36 = 0;
        class187.field2938 = 0;
        class247.field3841 = 0;
        class143.field2349 = 0;
        class335.field5121 = 0;
        class194.field3049 = 0;
        class263.field4067 = 0;
        client.field1840 = 0;
        class13.field157 = 0;
        class283.field4370 = 0;
        class31.field481 = 0;
        class25.field439 = 0;
        class13.field187 = 0;
        class148.field2413 = 0;
        class175.field2767 = 0;
        class181.field2843 = 0;
        class58.field907 = 0;
        class321.field4945 = 0;
        class149.field2441 = 0;
        class207.field3198 = 0;
        class359.field5700 = 0;
        class66.field1007 = 0;
        class49.field770 = 0;
        class329.field5052 = 0;
        class139.field2303 = 0;
        class209.field3218 = 0;
        class18.field273 = 0;
        class263.field4088 = 0;
        class105.field1581 = 0;
        class31.field493 = 0;
        class208.field3203 = 0;
        class222.field3443 = 0;
        class177.field2791 = 0;
        class191.field3001 = 0;
        class224.field3488 = 0;
        class197.field3079 = 0;
        class344.field5466 = 0;
        class53.field805 = 0;
        class245.field3812 = 0;
        class294.field4565 = 0;
        class337.field5160 = 0;
        class195.field3067 = 0;
        class171.field2727 = 0;
        class194.field3048 = 0;
        class311.field4816 = 0;
        class210.field3233 = 0;
        class153.field2486 = 0;
        class282.field4365 = 0;
        class151.field2464 = 0;
        class307.field4752 = 0;
        class305.field4748 = 0;
        class343.field5452 = 0;
        class294.field4563 = 0;
        class326.field5015 = 0;
        class210.field3239 = 0;
        class15.field246 = 0;
        class164.field2605 = 0;
        class122.field1961 = 0;
        class170.field2682 = 0;
        class347.field5514 = 0;
        class49.field763 = 0;
        class119.field1816 = 0;
        class63.field961 = 0;
        class295.field4580 = 0;
        class6.field65 = 0;
        class250.field3863 = 0;
        class263.field4059 = 0;
        class25.field449 = 0;
        class337.field5154 = 0;
        class350.field5572 = 0;
        class177.field2786 = 0;
        class61.field945 = 0;
        class13.field192 = 0;
        class66.field993 = 0;
        class238.field3690 = 0;
        class168.field2670 = 0;
        class332.field5093 = 0;
        class181.field2850 = 0;
        class335.field5128 = 0;
        class172.field2736 = 0;
        class63.field968 = 0;
        class75.field1111 = 0;
        class51.field795 = 0;
        class295.field4582 = 0;
        class311.field4830 = 0;
        class353.field5633 = 0;
        class245.field3823 = 0;
        class201.field3104 = 0;
        class233.field3632 = 0;
        class118.field1815 = 0;
        class18.field264 = 0;
        class13.field171 = 0;
        class293.field4560 = 0;
        class314.field4860 = 0;
        class316.field4873 = 0;
        class191.field3000 = 0;
        class181.field2832 = 0;
        class4.field52 = 0;
        class286.field4443 = 0;
        class104.field1564 = 0;
        class86.field1240 = 0;
        class130.field2173 = 0;
        class288.field4459 = 0;
        class150.field2452 = 0;
        class296.field4588 = 0;
        class55.field810 = 0;
        class290.field4531 = 0;
        class281.field4340 = 0;
        class163.field2590 = 0;
        class236.field3675 = 0;
        class188.field2948 = 0;
        class25.field447 = 0;
        class171.field2700 = 0;
        class350.field5574 = 0;
        class212.field3324 = 0;
        class193.field3036 = 0;
        class64.field982 = 0;
        class208.field3211 = 0;
        class59.field918 = 0;
        class111.field1696 = 0;
        class231.field3607 = 0;
        class100.field1512 = 0;
        class81.field1182 = 0;
        class188.field2944 = 0;
        class25.field410 = 0;
        class18.field309 = 0;
        class119.field1820 = 0;
        class49.field759 = 0;
        class260.field3977 = 0;
        class197.field3074 = 0;
        class293.field4551 = 0;
        class79.field1154 = 0;
        class293.field4547 = 0;
        class350.field5567 = 0;
        class48.field741 = 0;
        class221.field3433 = 0;
        class131.field2220 = 0;
        class101.field1523 = 0;
        class66.field1010 = 0;
        class352.field5631 = 0;
        class143.field2354 = 0;
        class66.field1020 = 0;
        class160.field2543 = 0;
        class81.field1168 = 0;
        class293.field4557 = 0;
        class311.field4827 = 0;
        class158.field2532 = 0;
        class104.field1559 = 0;
        class326.field5006 = 0;
        class113.field1739 = 0;
        class363.field5746 = 0;
        class43.field682 = 0;
        class91.field1284 = 0;
        class263.field4039 = 0;
        class79.field1155 = 0;
        class324.field4981 = 0;
        class75.field1112 = 0;
        class327.field5026 = 0;
        class165.field2614 = 0;
        class67.field1031 = 0;
        class18.field303 = 0;
        class224.field3481 = 0;
        class3.field27 = 0;
        client.field1853 = 0;
        class304.field4732 = 0;
        class79.field1141 = 0;
        class34.field526 = 0;
        class238.field3684 = 0;
        class317.field4882 = 0;
        class166.field2636 = 0;
        class81.field1178 = 0;
        class85.field1213 = 0;
        class166.field2630 = 0;
        class197.field3084 = 0;
        class167.field2660 = 0;
        class283.field4367 = 0;
        class128.field2129 = 0;
        class228.field3572 = 0;
        class217.field3402 = 0;
        class112.field1721 = 0;
        class171.field2710 = 0;
        class93.field1413 = 0;
        class13.field194 = 0;
        class25.field416 = 0;
        class245.field3814 = 0;
        class25.field444 = 0;
        class339.field5224 = 0;
        class246.field3834 = 0;
        class342.field5389 = 0;
        class226.field3525 = 0;
        class59.field919 = 0;
        class199.field3097 = 0;
        class226.field3528 = 0;
        class131.field2217 = 0;
        class177.field2784 = 0;
        class314.field4851 = 0;
        class244.field3805 = 0;
        class191.field3011 = 0;
        class25.field405 = 0;
        class224.field3489 = 0;
        class284.field4414 = 0;
        class178.field2813 = 0;
        class258.field3956 = 0;
        class49.field765 = 0;
        class62.field958 = 0;
        class159.field2534 = 0;
        class94.field1438 = 0;
        class86.field1226 = 0;
        class25.field389 = 0;
        class338.field5191 = 0;
        class350.field5565 = 0;
        class217.field3394 = 0;
        class223.field3469 = 0;
        class350.field5579 = 0;
        class276.field4262 = 0;
        class78.field1125 = 0;
        class359.field5698 = 0;
        class310.field4801 = 0;
        class350.field5556 = 0;
        class231.field3601 = 0;
        class243.field3782 = 0;
        class191.field2993 = 0;
        class244.field3789 = 0;
        class148.field2420 = 0;
        class224.field3485 = 0;
        class86.field1231 = 0;
        class61.field942 = 0;
        class25.field390 = 0;
        class186.field2929 = 0;
        class195.field3070 = 0;
        class224.field3498 = 0;
        class263.field4093 = 0;
        class345.field5496 = 0;
        class233.field3633 = 0;
        class94.field1442 = 0;
        class42.field678 = 0;
        class352.field5619 = 0;
        class345.field5497 = 0;
        class116.field1772 = 0;
        class116.field1777 = 0;
        class18.field307 = 0;
        class174.field2763 = 0;
        class105.field1586 = 0;
        class252.field3876 = 0;
        class211.field3244 = 0;
        class122.field1949 = 0;
        class350.field5585 = 0;
        class91.field1353 = 0;
        class263.field4040 = 0;
        class78.field1133 = 0;
        class89.field1269 = 0;
        class305.field4742 = 0;
        class67.field1025 = 0;
        class176.field2776 = 0;
        class20.field334 = 0;
        class252.field3886 = 0;
        class167.field2649 = 0;
        class202.field3119 = 0;
        class290.field4508 = 0;
        class85.field1208 = 0;
        client.field1845 = 0;
        class282.field4362 = 0;
        class326.field5020 = 0;
        class271.field4195 = 0;
        client.field1838 = 0;
        class206.field3177 = 0;
        class224.field3506 = 0;
        class25.field394 = 0;
        class247.field3839 = 0;
        class252.field3877 = 0;
        class171.field2704 = 0;
        class3.field29 = 0;
        class37.field566 = 0;
        class130.field2211 = 0;
        class249.field3861 = 0;
        class281.field4342 = 0;
        class331.field5089 = 0;
        class148.field2410 = 0;
        class102.field1535 = 0;
        class191.field2996 = 0;
        class347.field5510 = 0;
        class350.field5576 = 0;
        class113.field1743 = 0;
        class197.field3080 = 0;
        class207.field3183 = 0;
        class194.field3061 = 0;
        class246.field3824 = 0;
        class163.field2601 = 0;
        class244.field3801 = 0;
        class4.field44 = 0;
        class62.field949 = 0;
        class297.field4607 = 0;
        class83.field1196 = 0;
        class301.field4675 = 0;
        class143.field2352 = 0;
        class347.field5518 = 0;
        class261.field4004 = 0;
        class135.field2258 = 0;
        class228.field3558 = 0;
        class177.field2788 = 0;
        class310.field4799 = 0;
        class304.field4728 = 0;
        class290.field4506 = 0;
        class55.field812 = 0;
        class296.field4585 = 0;
        class207.field3182 = 0;
        class102.field1536 = 0;
        class139.field2310 = 0;
        class234.field3643 = 0;
        class72.field1077 = 0;
        class212.field3327 = 0;
        class83.field1204 = 0;
        class18.field271 = 0;
        class48.field750 = 0;
        class210.field3238 = 0;
        class338.field5203 = 0;
        class122.field1960 = 0;
        class44.field710 = 0;
        class171.field2717 = 0;
        class314.field4859 = 0;
        class114.field1762 = 0;
        class342.field5439 = 0;
        class303.field4720 = 0;
        class230.field3599 = 0;
        class212.field3319 = 0;
        class317.field4887 = 0;
        class319.field4922 = 0;
        class85.field1222 = 0;
        class204.field3156 = 0;
        class290.field4525 = 0;
        class342.field5356 = 0;
        class162.field2572 = 0;
        class258.field3947 = 0;
        class338.field5189 = 0;
        class292.field4538 = 0;
        class316.field4872 = 0;
        class3.field23 = 0;
        class300.field4658 = 0;
        class129.field2147 = 0;
        class34.field524 = 0;
        class22.field338 = 0;
        class264.field4108 = 0;
        class308.field4764 = 0;
        class338.field5200 = 0;
        class288.field4478 = 0;
        class321.field4953 = 0;
        class13.field184 = 0;
        class57.field900 = 0;
        class184.field2885 = 0;
        class212.field3291 = 0;
        class48.field744 = 0;
        class286.field4441 = 0;
        class356.field5661 = 0;
        class10.field138 = 0;
        class61.field937 = 0;
        class55.field816 = 0;
        class215.field3365 = 0;
        class234.field3650 = 0;
        class102.field1538 = 0;
        class344.field5468 = 0;
        class104.field1565 = 0;
        class85.field1210 = 0;
        class172.field2738 = 0;
        class79.field1151 = 0;
        class48.field742 = 0;
        class63.field970 = 0;
        class283.field4369 = 0;
        class55.field813 = 0;
        class82.field1192 = 0;
        class191.field2994 = 0;
        class253.field3906 = 0;
        class192.field3034 = 0;
        class140.field2329 = 0;
        class78.field1128 = 0;
        class317.field4895 = 0;
        class233.field3629 = 0;
        class13.field175 = 0;
        class157.field2516 = 0;
        class130.field2154 = 0;
        class274.field4249 = 0;
        class25.field423 = 0;
        class74.field1106 = 0;
        class64.field987 = 0;
        class79.field1156 = 0;
        class252.field3874 = 0;
        class91.field1342 = 0;
        class314.field4852 = 0;
        class270.field4145 = 0;
        class18.field286 = 0;
        class176.field2781 = 0;
        class14.field237 = 0;
        class154.field2495 = 0;
        class59.field921 = 0;
        class15.field239 = 0;
        class61.field944 = 0;
        class106.field1597 = 0;
        class339.field5217 = 0;
        class317.field4891 = 0;
        class109.field1632 = 0;
        class85.field1218 = 0;
        class264.field4110 = 0;
        class178.field2800 = 0;
        class212.field3297 = 0;
        class317.field4888 = 0;
        class263.field4053 = 0;
        class224.field3480 = 0;
        class82.field1191 = 0;
        class342.field5335 = 0;
        class98.field1471 = 0;
        class288.field4471 = 0;
        class18.field310 = 0;
        class224.field3492 = 0;
        class181.field2828 = 0;
        class55.field808 = 0;
        class165.field2623 = 0;
        class93.field1410 = 0;
        class239.field3710 = 0;
        class311.field4810 = 0;
        class25.field427 = 0;
        class342.field5360 = 0;
        class187.field2936 = 0;
        class227.field3550 = 0;
        class222.field3444 = 0;
        class25.field407 = 0;
        class293.field4548 = 0;
        class326.field5014 = 0;
        class119.field1831 = 0;
        class321.field4942 = 0;
        class18.field266 = 0;
        class223.field3476 = 0;
        class33.field513 = 0;
        class178.field2811 = 0;
        class194.field3064 = 0;
        class118.field1814 = 0;
        class33.field514 = 0;
        class178.field2814 = 0;
        class148.field2404 = 0;
        class287.field4451 = 0;
        class121.field1887 = 0;
        class25.field404 = 0;
        class249.field3855 = 0;
        class172.field2743 = 0;
        class100.field1506 = 0;
        class197.field3077 = 0;
        client.field1855 = 0;
        class126.field2107 = 0;
        class350.field5573 = 0;
        client.field1847 = 0;
        class18.field282 = 0;
        class25.field403 = 0;
        class350.field5584 = 0;
        class326.field5011 = 0;
        class102.field1534 = 0;
        class37.field551 = 0;
        class177.field2787 = 0;
        class342.field5261 = 0;
        class23.field355 = 0;
        class212.field3301 = 0;
        class163.field2586 = 0;
        class42.field675 = 0;
        class13.field205 = 0;
        class25.field435 = 0;
        class119.field1827 = 0;
        class138.field2292 = 0;
        class87.field1250 = 0;
        class105.field1578 = 0;
        class284.field4388 = 0;
        class308.field4767 = 0;
        class360.field5708 = 0;
        class78.field1127 = 0;
        class3.field39 = 0;
        class91.field1344 = 0;
        class13.field163 = 0;
        class64.field983 = 0;
        class280.field4316 = 0;
        class207.field3185 = 0;
        class204.field3159 = 0;
        class74.field1095 = 0;
        class91.field1357 = 0;
        class239.field3704 = 0;
        class91.field1389 = 0;
        class91.field1305 = 0;
        class264.field4102 = 0;
        class212.field3337 = 0;
        class154.field2494 = 0;
        class193.field3038 = 0;
        class217.field3391 = 0;
        class318.field4901 = 0;
        class155.field2505 = 0;
        client.field1850 = 0;
        class160.field2550 = 0;
        class13.field167 = 0;
        class67.field1032 = 0;
        class253.field3909 = 0;
        class57.field883 = 0;
        class345.field5489 = 0;
        class238.field3683 = 0;
        class337.field5161 = 0;
        class334.field5109 = 0;
        class74.field1098 = 0;
        class43.field692 = 0;
        class303.field4721 = 0;
        class18.field267 = 0;
        class350.field5580 = 0;
        class18.field272 = 0;
        class295.field4584 = 0;
        class66.field991 = 0;
        class226.field3529 = 0;
        class292.field4541 = 0;
        class121.field1882 = 0;
        class339.field5225 = 0;
        class355.field5650 = 0;
        class167.field2652 = 0;
        class326.field5000 = 0;
        class158.field2527 = 0;
        class46.field728 = 0;
        class13.field208 = 0;
        class148.field2403 = 0;
        class188.field2953 = 0;
        class338.field5208 = 0;
        class138.field2281 = 0;
        class227.field3538 = 0;
        class130.field2169 = 0;
        class6.field79 = 0;
        class126.field2102 = 0;
        class81.field1167 = 0;
        class190.field2982 = 0;
        class293.field4554 = 0;
        class113.field1732 = 0;
        class190.field2989 = 0;
        class87.field1248 = 0;
        class317.field4883 = 0;
        class25.field391 = 0;
        class224.field3500 = 0;
        class348.field5524 = 0;
        class134.field2241 = 0;
        class18.field285 = 0;
        class25.field409 = 0;
        class207.field3179 = 0;
        class91.field1368 = 0;
        client.field1839 = 0;
        class158.field2530 = 0;
        class37.field549 = 0;
        class37.field563 = 0;
        class14.field236 = 0;
        class249.field3852 = 0;
        class217.field3397 = 0;
        class113.field1741 = 0;
        class10.field135 = 0;
        class303.field4719 = 0;
        class326.field5019 = 0;
        class246.field3830 = 0;
        class344.field5462 = 0;
        class247.field3843 = 0;
        class281.field4347 = 0;
        class236.field3673 = 0;
        class270.field4164 = 0;
        class335.field5127 = 0;
        class25.field414 = 0;
        class150.field2454 = 0;
        class252.field3872 = 0;
        class271.field4192 = 0;
        class199.field3099 = 0;
        class194.field3055 = 0;
        class318.field4899 = 0;
        class191.field2998 = 0;
        class25.field440 = 0;
        class140.field2327 = 0;
        class178.field2817 = 0;
        class25.field419 = 0;
        class337.field5178 = 0;
        class203.field3140 = 0;
        class244.field3792 = 0;
        class301.field4667 = 0;
        class94.field1436 = 0;
        class212.field3261 = 0;
        class38.field580 = 0;
        class222.field3457 = 0;
        class338.field5193 = 0;
        class288.field4485 = 0;
        class223.field3466 = 0;
        class202.field3118 = 0;
        class211.field3245 = 0;
        class276.field4268 = 0;
        class120.field1862 = 0;
        class245.field3815 = 0;
        class212.field3280 = 0;
        class328.field5045 = 0;
        class283.field4379 = 0;
        class205.field3163 = 0;
        class123.field1977 = 0;
        class191.field3013 = 0;
        class207.field3202 = 0;
        class227.field3552 = 0;
        class332.field5092 = 0;
        class202.field3112 = 0;
        class113.field1727 = 0;
        class170.field2691 = 0;
        class360.field5719 = 0;
        class148.field2421 = 0;
        class149.field2438 = 0;
        class91.field1361 = 0;
        class243.field3785 = 0;
        class286.field4436 = 0;
        class317.field4890 = 0;
        class290.field4503 = 0;
        class13.field185 = 0;
        class25.field445 = 0;
        class15.field245 = 0;
        class57.field901 = 0;
        class228.field3555 = 0;
        class207.field3187 = 0;
        class292.field4539 = 0;
        class25.field432 = 0;
        class98.field1470 = 0;
        class239.field3708 = 0;
        class150.field2451 = 0;
        class94.field1437 = 0;
        class93.field1431 = 0;
        class33.field507 = 0;
        class297.field4599 = 0;
        class20.field329 = 0;
        class212.field3332 = 0;
        class177.field2783 = 0;
        class81.field1166 = 0;
        class58.field908 = 0;
        class342.field5379 = 0;
        class261.field3997 = 0;
        class244.field3810 = 0;
        class355.field5651 = 0;
        class193.field3044 = 0;
        class338.field5201 = 0;
        class227.field3545 = 0;
        class188.field2946 = 0;
        class201.field3105 = 0;
        class113.field1746 = 0;
        class171.field2709 = 0;
        class208.field3209 = 0;
        class228.field3554 = 0;
        class158.field2524 = 0;
        class300.field4656 = 0;
        class235.field3661 = 0;
        class143.field2353 = 0;
        class13.field221 = 0;
        class305.field4740 = 0;
        class255.field3924 = 0;
        class37.field554 = 0;
        class138.field2283 = 0;
        class171.field2715 = 0;
        class221.field3442 = 0;
        class268.field4138 = 0;
        class64.field976 = 0;
        class83.field1202 = 0;
        class13.field181 = 0;
        class350.field5562 = 0;
        class314.field4863 = 0;
        class50.field779 = 0;
        class326.field5012 = 0;
        class34.field529 = 0;
        class171.field2697 = 0;
        class311.field4811 = 0;
        class48.field749 = 0;
        class83.field1205 = 0;
        client.field1844 = 0;
        class345.field5488 = 0;
        class254.field3917 = 0;
        class63.field964 = 0;
        class310.field4804 = 0;
        class326.field5018 = 0;
        class308.field4765 = 0;
        class211.field3247 = 0;
        class162.field2571 = 0;
        class270.field4151 = 0;
        class245.field3820 = 0;
        class244.field3793 = 0;
        class116.field1780 = 0;
        class188.field2960 = 0;
        class162.field2580 = 0;
        class130.field2198 = 0;
        class249.field3856 = 0;
        class121.field1937 = 0;
        class146.field2389 = 0;
        class165.field2617 = 0;
        class139.field2312 = 0;
        class283.field4377 = 0;
        class171.field2699 = 0;
        class108.field1624 = 0;
        class112.field1713 = 0;
        class86.field1229 = 0;
        class334.field5117 = 0;
        class71.field1066 = 0;
        class339.field5223 = 0;
        class3.field20 = 0;
        class355.field5653 = 0;
        class186.field2907 = 0;
        class318.field4905 = 0;
        class167.field2655 = 0;
        class89.field1265 = 0;
        class252.field3889 = 0;
        class130.field2168 = 0;
        class33.field508 = 0;
        class298.field4622 = 0;
        class349.field5536 = 0;
        class270.field4160 = 0;
        class230.field3597 = 0;
        class29.field470 = 0;
        class167.field2658 = 0;
        client.field1851 = 0;
        client.field1842 = 0;
        class114.field1763 = 0;
        class62.field956 = 0;
        class266.field4122 = 0;
        class94.field1443 = 0;
        class25.field411 = 0;
        class32.field494 = 0;
        class140.field2331 = 0;
        class202.field3123 = 0;
        class324.field4987 = 0;
        class64.field980 = 0;
        class347.field5511 = 0;
        class345.field5480 = 0;
        class202.field3129 = 0;
        class25.field425 = 0;
        class49.field768 = 0;
        class296.field4591 = 0;
        class238.field3687 = 0;
        class176.field2774 = 0;
        class81.field1172 = 0;
        class287.field4455 = 0;
        class23.field362 = 0;
        class86.field1223 = 0;
        class228.field3559 = 0;
        class263.field4081 = 0;
        class135.field2260 = 0;
        class25.field433 = 0;
        class14.field234 = 0;
        client.field1852 = 0;
        class18.field301 = 0;
        class212.field3333 = 0;
        class166.field2639 = 0;
        class86.field1243 = 0;
        class66.field992 = 0;
        class110.field1682 = 0;
        class158.field2526 = 0;
        class358.field5693 = 0;
        class126.field2110 = 0;
        field4933 = 0;
        class263.field4064 = 0;
        class334.field5116 = 0;
        class166.field2635 = 0;
        class184.field2886 = 0;
        class227.field3549 = 0;
        class342.field5395 = 0;
        class79.field1159 = 0;
        class25.field386 = 0;
        class350.field5566 = 0;
        class280.field4321 = 0;
        class111.field1698 = 0;
        class67.field1022 = 0;
        class326.field5001 = 0;
        class71.field1062 = 0;
        class207.field3200 = 0;
        class190.field2988 = 0;
        class62.field951 = 0;
        class184.field2887 = 0;
        class350.field5553 = 0;
        class188.field2951 = 0;
        class259.field3970 = 0;
        class99.field1494 = 0;
        class224.field3510 = 0;
        class199.field3100 = 0;
        class150.field2457 = 0;
        class244.field3790 = 0;
        class13.field156 = 0;
        class290.field4505 = 0;
        class10.field140 = 0;
        class245.field3811 = 0;
        class168.field2672 = 0;
        class43.field691 = 0;
        class25.field430 = 0;
        class263.field4056 = 0;
        class188.field2957 = 0;
        class167.field2662 = 0;
        class287.field4449 = 0;
        class162.field2578 = 0;
        class250.field3864 = 0;
        class350.field5568 = 0;
        class228.field3569 = 0;
        class283.field4372 = 0;
        class197.field3075 = 0;
        class4.field49 = 0;
        class25.field446 = 0;
        class114.field1755 = 0;
        class176.field2779 = 0;
        class186.field2904 = 0;
        class59.field916 = 0;
        class350.field5558 = 0;
        class67.field1021 = 0;
        class263.field4072 = 0;
        class249.field3853 = 0;
        class194.field3063 = 0;
        class72.field1073 = 0;
        class197.field3078 = 0;
        class165.field2615 = 0;
        class258.field3964 = 0;
        class113.field1735 = 0;
        class138.field2285 = 0;
        class157.field2513 = 0;
        class46.field735 = 0;
        class274.field4255 = 0;
        class344.field5474 = 0;
        class300.field4648 = 0;
        class66.field998 = 0;
        class55.field817 = 0;
        class13.field179 = 0;
        class212.field3264 = 0;
        class66.field1015 = 0;
        class113.field1736 = 0;
        class25.field438 = 0;
        class34.field517 = 0;
        class224.field3504 = 0;
        class276.field4271 = 0;
        class344.field5471 = 0;
        class114.field1752 = 0;
        class255.field3920 = 0;
        class67.field1024 = 0;
        class260.field3986 = 0;
        class207.field3199 = 0;
        class151.field2469 = 0;
        class350.field5564 = 0;
        class261.field4010 = 0;
        class62.field953 = 0;
        class227.field3543 = 0;
        class340.field5227 = 0;
        class51.field792 = 0;
        class197.field3085 = 0;
        class25.field415 = 0;
        class266.field4120 = 0;
        class9.field122 = 0;
        class192.field3021 = 0;
        class13.field168 = 0;
        class239.field3698 = 0;
        class42.field661 = 0;
        class224.field3495 = 0;
        class178.field2803 = 0;
        class342.field5274 = 0;
        class13.field199 = 0;
        class223.field3475 = 0;
        class310.field4796 = 0;
        class217.field3400 = 0;
        class260.field3994 = 0;
        class25.field400 = 0;
        class188.field2947 = 0;
        class282.field4357 = 0;
        class91.field1298 = 0;
        class192.field3035 = 0;
        class109.field1659 = 0;
        class304.field4731 = 0;
        class167.field2664 = 0;
        class85.field1219 = 0;
        class86.field1236 = 0;
        class318.field4906 = 0;
        class194.field3058 = 0;
        class212.field3309 = 0;
        class140.field2328 = 0;
        class290.field4524 = 0;
        class3.field16 = 0;
        field4940 = 0;
        class162.field2581 = 0;
        class352.field5628 = 0;
        class13.field222 = 0;
        class94.field1433 = 0;
        class350.field5554 = 0;
        class91.field1292 = 0;
        class86.field1234 = 0;
        class167.field2646 = 0;
        class228.field3556 = 0;
        class321.field4950 = 0;
        class292.field4543 = 0;
        class150.field2456 = 0;
        class143.field2351 = 0;
        class233.field3635 = 0;
        class327.field5035 = 0;
        class148.field2401 = 0;
        class3.field40 = 0;
        class290.field4527 = 0;
        field4937 = 0;
        class113.field1731 = 0;
        class25.field398 = 0;
        class188.field2941 = 0;
        class276.field4270 = 0;
        class212.field3284 = 0;
        class13.field209 = 0;
        class252.field3873 = 0;
        class76.field1116 = 0;
        class350.field5548 = 0;
        class239.field3705 = 0;
        class278.field4294 = 0;
        class223.field3470 = 0;
        class255.field3931 = 0;
        class290.field4515 = 0;
        class42.field673 = 0;
        class193.field3037 = 0;
        class239.field3706 = 0;
        class185.field2901 = 0;
        class20.field328 = 0;
        class105.field1576 = 0;
        class109.field1654 = 0;
        class224.field3490 = 0;
        class166.field2632 = 0;
        class282.field4363 = 0;
        field4936 = 0;
        class118.field1812 = 0;
        class245.field3816 = 0;
        class258.field3959 = 0;
        class260.field3992 = 0;
        class254.field3918 = 0;
        class350.field5586 = 0;
        class59.field917 = 0;
        class290.field4514 = 0;
        class66.field999 = 0;
        class42.field662 = 0;
        class268.field4135 = 0;
        client.field1846 = 0;
        class20.field319 = 0;
        class130.field2208 = 0;
        class13.field203 = 0;
        class3.field25 = 0;
        class349.field5538 = 0;
        class247.field3847 = 0;
        class160.field2539 = 0;
        class252.field3869 = 0;
        class214.field3355 = 0;
        class282.field4358 = 0;
        class29.field474 = 0;
        class263.field4057 = 0;
        class208.field3206 = 0;
        class120.field1868 = 0;
        class355.field5649 = 0;
        class101.field1524 = 0;
        class309.field4770 = 0;
        class235.field3652 = 0;
        class43.field684 = 0;
        class138.field2294 = 0;
        class49.field754 = 0;
        class350.field5552 = 0;
        class33.field503 = 0;
        class303.field4726 = 0;
        class94.field1435 = 0;
        class277.field4284 = 0;
        class235.field3660 = 0;
        class135.field2256 = 0;
        class260.field3988 = 0;
        class176.field2775 = 0;
        class258.field3955 = 0;
        class227.field3547 = 0;
        class130.field2191 = 0;
        class146.field2387 = 0;
        class13.field207 = 0;
        class67.field1023 = 0;
        class268.field4131 = 0;
        class215.field3362 = 0;
        class199.field3101 = 0;
        class318.field4909 = 0;
        class342.field5336 = 0;
        class4.field48 = 0;
        class9.field123 = 0;
        class85.field1214 = 0;
        class262.field4019 = 0;
        field4929 = 0;
        class18.field276 = 0;
        class128.field2125 = 0;
        class32.field496 = 0;
        class288.field4484 = 0;
        class135.field2249 = 0;
        class104.field1572 = 0;
        class300.field4646 = 0;
        class321.field4954 = 0;
        class72.field1080 = 0;
        class202.field3114 = 0;
        class352.field5620 = 0;
        class149.field2446 = 0;
        class239.field3709 = 0;
        class290.field4530 = 0;
        class228.field3564 = 0;
        class66.field1018 = 0;
        class259.field3967 = 0;
        class234.field3646 = 0;
        class163.field2585 = 0;
        class266.field4119 = 0;
        class51.field790 = 0;
        class188.field2956 = 0;
        class99.field1488 = 0;
        class355.field5657 = 0;
        class66.field1009 = 0;
        class235.field3668 = 0;
        class104.field1566 = 0;
        class89.field1272 = 0;
        class74.field1093 = 0;
        class131.field2224 = 0;
        class13.field174 = 0;
        class72.field1069 = 0;
        class122.field1946 = 0;
        class89.field1264 = 0;
        class113.field1728 = 0;
        class290.field4522 = 0;
        class210.field3229 = 0;
        class344.field5463 = 0;
        class222.field3461 = 0;
        class9.field128 = 0;
        class93.field1412 = 0;
        class115.field1764 = 0;
        class195.field3068 = 0;
        class263.field4070 = 0;
        class104.field1557 = 0;
        class81.field1174 = 0;
        class37.field568 = 0;
        class110.field1691 = 0;
        class119.field1823 = 0;
        class296.field4590 = arg0;
        class232.field3616 = 0;
        class294.field4569 = 0;
        class106.field1594 = 0;
        class247.field3846 = 0;
        class350.field5570 = 0;
        class226.field3526 = 0;
        class249.field3854 = 0;
        class139.field2305 = 0;
        class217.field3392 = 0;
        class154.field2493 = 0;
        class352.field5624 = 0;
        class25.field384 = 0;
        class50.field786 = 0;
        class153.field2484 = 0;
        class228.field3553 = 0;
        class149.field2440 = 0;
        class6.field88 = 0;
        class98.field1473 = 0;
        class170.field2681 = 0;
        class308.field4762 = 0;
        class165.field2613 = 0;
        class184.field2890 = 0;
        class66.field1005 = 0;
        class192.field3029 = 0;
        class233.field3642 = 0;
        class160.field2554 = 0;
        class181.field2842 = 0;
        class139.field2322 = 0;
        class342.field5302 = 0;
        class334.field5118 = 0;
        class358.field5697 = 0;
        class164.field2607 = 0;
        class190.field2981 = 0;
        class214.field3347 = 0;
        class104.field1568 = 0;
        class109.field1644 = 0;
        class223.field3462 = 0;
        class194.field3054 = 0;
        class217.field3393 = 0;
        class49.field762 = 0;
        class45.field718 = 0;
        class347.field5512 = 0;
        class283.field4374 = 0;
        class244.field3807 = 0;
        class290.field4510 = 0;
        class360.field5709 = 0;
        class290.field4529 = 0;
        class344.field5475 = 0;
        class91.field1391 = 0;
        class271.field4185 = 0;
        class108.field1628 = 0;
        class212.field3311 = 0;
        class128.field2132 = 0;
        class171.field2721 = 0;
        class130.field2185 = 0;
        class252.field3878 = 0;
        class222.field3459 = 0;
        class317.field4892 = 0;
        class25.field424 = 0;
        class18.field269 = 0;
        class329.field5059 = 0;
        class194.field3056 = 0;
        class113.field1729 = 0;
        class3.field21 = 0;
        class25.field436 = 0;
        class244.field3796 = 0;
        class263.field4085 = 0;
        class36.field542 = 0;
        class350.field5550 = 0;
        class360.field5711 = 0;
        class190.field2983 = 0;
        class51.field797 = 0;
        class203.field3138 = 0;
        class230.field3600 = 0;
        class264.field4098 = 0;
        class271.field4186 = 0;
        class217.field3401 = 0;
        class13.field204 = 0;
        class154.field2491 = 0;
        class37.field559 = 0;
        class37.field556 = 0;
        class151.field2470 = 0;
        class277.field4278 = 0;
        class263.field4074 = 0;
        class207.field3186 = 0;
        class337.field5153 = 0;
        class340.field5230 = 0;
        class209.field3225 = 0;
        class149.field2436 = 0;
        class33.field511 = 0;
        class188.field2959 = 0;
        class34.field523 = 0;
        class139.field2307 = 0;
        class81.field1179 = 0;
        class342.field5438 = 0;
        class165.field2612 = 0;
        class260.field3981 = 0;
        class285.field4419 = 0;
        class83.field1198 = 0;
        class212.field3302 = 0;
        class71.field1064 = 0;
        class231.field3603 = 0;
        class263.field4038 = 0;
        class44.field707 = 0;
        class288.field4467 = 0;
        class122.field1956 = 0;
        class285.field4426 = 0;
        class345.field5485 = 0;
        class192.field3022 = 0;
        class68.field1039 = 0;
        class350.field5583 = 0;
        class86.field1235 = 0;
        class264.field4105 = 0;
        class243.field3788 = 0;
        class349.field5537 = 0;
        class288.field4466 = 0;
        class71.field1065 = 0;
        class233.field3634 = 0;
        class279.field4314 = 0;
        class228.field3574 = 0;
        class177.field2792 = 0;
        class101.field1525 = 0;
        class161.field2568 = 0;
        class13.field155 = 0;
        class358.field5695 = 0;
        class126.field2103 = 0;
        class67.field1033 = 0;
        class164.field2609 = 0;
        class119.field1817 = 0;
        class305.field4744 = 0;
        class171.field2726 = 0;
        class43.field696 = 0;
        class64.field977 = 0;
        class305.field4746 = 0;
        class326.field5021 = 0;
        class148.field2406 = 0;
        class271.field4183 = 0;
        class22.field342 = 0;
        class300.field4644 = 0;
        class153.field2487 = 0;
        class317.field4886 = 0;
        class209.field3222 = 0;
        class317.field4894 = 0;
        class334.field5115 = 0;
        class327.field5024 = 0;
        class25.field395 = 0;
        class171.field2724 = 0;
        class170.field2688 = 0;
        class48.field748 = 0;
        class81.field1181 = 0;
        class228.field3562 = 0;
        class25.field428 = 0;
        class43.field683 = 0;
        class43.field685 = 0;
        class139.field2306 = 0;
        class43.field686 = 0;
        class212.field3303 = 0;
        class45.field715 = 0;
        class283.field4376 = 0;
        class153.field2483 = 0;
        class112.field1712 = 0;
        class362.field5736 = 0;
        class217.field3384 = 0;
        class135.field2253 = 0;
        class146.field2388 = 0;
        class226.field3527 = 0;
        class25.field450 = 0;
        class235.field3663 = 0;
        class347.field5508 = 0;
        class123.field1974 = 0;
        class266.field4125 = 0;
        class157.field2511 = 0;
        class343.field5448 = 0;
        class110.field1674.method2463(-117);
        class64.field985 = true;
        class236.field3678 = 0L;
        class105.field1583.field4758 = 0;
        class29.field467 = true;
        class14.field232 = 0;
        class162.method1295(-92);
        class174.field2764 = 0;
        class203.field3150 = -1;
        class186.field2932 = 0;
        class99.field1491.field397 = 0;
        class123.field1966 = -1;
        class353.field5642 = -1;
        class244.field3803.field397 = 0;
        class279.field4302 = -1;
        class206.field3175 = 0;
        for (int var1 = 0; var1 < class301.field4677.length; var1++) {
            class301.field4677[var1] = null;
        }
        class66.field1006 = 0;
        class6.field89 = false;
        class249.method1861(0, 21916);
        for (int var2 = 0; var2 < 100; var2++) {
            class234.field3648[var2] = null;
        }
        class210.field3237 = false;
        class181.field2851 = 0;
        class236.field3676 = (int) (Math.random() * 30.0D) - 20;
        class106.field1592 = (int) (Math.random() * 80.0D) - 40;
        class313.field4846 = (float) ((int) (Math.random() * 20.0D) - 10 & 0x7FF);
        class78.field1136 = 0;
        class290.field4513 = (int) (Math.random() * 120.0D) - 60;
        class46.field739 = (int) (Math.random() * 100.0D) - 50;
        class202.field3127 = (int) (Math.random() * 110.0D) - 55;
        class203.field3148 = 0;
        class46.method461(-22943);
        class66.field995 = 0;
        class6.field80 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class177.field2795[var3] = null;
            class22.field337[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class110.field1683[var4] = null;
        }
        class173.field2746 = class177.field2795[2047] = new class171();
        class72.field1075.method2233(-39);
        class356.field5668.method2233(-46);
        if (class349.field5540 != null) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        class349.field5540[var5][var6][var7] = null;
                    }
                }
            }
        }
        class363.field5747 = new class317();
        class303.field4722 = 0;
        class131.field2215 = 0;
        class223.method1677(-10890);
        class235.method1755(2);
        class29.field476 = 0;
        class287.field4450 = 0;
        class100.field1513 = 0;
        class162.field2579 = 0;
        class187.field2934 = 0;
        class98.field1482 = 0;
        class300.field4650 = 0;
        class236.field3671 = 0;
        class279.field4305 = 0;
        class249.field3860 = 0;
        for (int var8 = 0; var8 < class10.field134.length; var8++) {
            class10.field134[var8] = -1;
        }
        if (class164.field2604 != -1) {
            class48.method466(class164.field2604, -1);
        }
        for (class36 var9 = (class36) class135.field2251.method371(-19139); var9 != null; var9 = (class36) class135.field2251.method378((byte) -81)) {
            class81.method732(22, true, var9);
        }
        class164.field2604 = -1;
        class135.field2251 = new class37(8);
        class247.method1857((byte) 126);
        class66.field1006 = 0;
        class356.field5672 = null;
        class6.field89 = false;
        class37.field560.method1542(-1, new int[] { 0, 0, 0, 0, 0 }, (int[]) null, false, -1, (byte) -117);
        for (int var10 = 0; var10 < 8; var10++) {
            class67.field1029[var10] = null;
            class25.field431[var10] = false;
            class23.field364[var10] = -1;
        }
        class177.method1379(-114);
        class165.field2611 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class227.field3540[var11] = true;
        }
        class13.field191 = null;
        class167.field2647 = 0;
        class301.field4672 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class230.field3598[var12] = new class266();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class176.field2778[var13] = 0;
            class100.field1497[var13] = 0;
            class260.field3982[var13] = 0;
        }
        if (class240.field3737) {
            class168.method1334(true);
        }
        class204.field3157 = class209.field3219;
        class296.field4597 = 0;
        class78.field1138 = true;
        class3.field28 = class363.field5752 = class339.field5212 = class48.field751 = new short[256];
        class134.field2244 = false;
        class317.method2239(4);
        class149.field2444 = false;
        class256.method1893(arg0 ^ 0x13);
    }
}
