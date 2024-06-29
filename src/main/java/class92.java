import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class92 extends class28 {

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Lqe;")
    public static class179 field1742 = class206.method1380("title_mute", (byte) -127);

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "[I")
    public static int[] field1739 = new int[50];

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "[I")
    public static int[] field1740 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lqe;")
    private static class179 field1746 = class206.method1380("Allocated memory", (byte) -128);

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Lqe;")
    public static class179 field1747 = field1746;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lrb;")
    public class186 field1743;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[Lae;IIIII)V")
    public static final void method602(int arg0, int arg1, int arg2, class6[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1744++;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class6 var10 = arg3[var9];
            if (var10 != null && (!var10.field108 || var10.field128 == 0 || var10.field171 || class159.method1026(var10, -1493540320) != 0 || class123.field2280 == var10 || var10.field220 == 1338) && var10.field131 == arg4 && (!var10.field108 || !class32.method204(var10, -68))) {
                int var11 = var10.field166 + arg5;
                int var12 = var10.field83 + arg6;
                if (class86.field1647 == var10) {
                    class11.field294 = var11;
                    class141.field2583 = var12;
                    class54.field1187 = true;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field128 == 2) {
                    var13 = arg1;
                    var14 = arg2;
                    var15 = arg7;
                    var16 = arg8;
                } else {
                    var14 = var11 <= arg2 ? arg2 : var11;
                    var15 = arg7 < var12 ? var12 : arg7;
                    int var17 = var10.field169 + var11;
                    int var18 = var10.field73 + var12;
                    if (var10.field128 == 9) {
                        var18++;
                        var17++;
                    }
                    var16 = arg8 > var18 ? var18 : arg8;
                    var13 = var17 >= arg1 ? arg1 : var17;
                }
                if (!var10.field108 || var14 < var13 && var16 > var15) {
                    if (var10.field128 == 0) {
                        if (!var10.field108 && class32.method204(var10, -107) && class155.field2790 != var10) {
                            continue;
                        }
                        if (var10.field125 && var14 <= class4.field61 && class139.field2559 >= var15 && class4.field61 < var13 && class139.field2559 < var16) {
                            for (class19 var19 = (class19) class193.field3590.method242(16711680); var19 != null; var19 = (class19) class193.field3590.method237(10)) {
                                if (var19.field498) {
                                    var19.method592((byte) -128);
                                }
                            }
                            for (class19 var20 = (class19) class54.field1183.method242(arg0 ^ 0xFF0064); var20 != null; var20 = (class19) class54.field1183.method237(10)) {
                                if (var20.field498) {
                                    var20.method592((byte) -128);
                                }
                            }
                            class168.field3035 = false;
                            if (class233.field4304 == 0) {
                                class86.field1647 = null;
                                class123.field2280 = null;
                            }
                        }
                    }
                    if (var10.field108) {
                        boolean var21;
                        if (var14 <= class4.field61 && class139.field2559 >= var15 && class4.field61 < var13 && var16 > class139.field2559) {
                            var21 = true;
                        } else {
                            var21 = false;
                        }
                        boolean var22 = false;
                        if (class40.field868 == 1 && var21) {
                            var22 = true;
                        }
                        boolean var23 = false;
                        if (class70.field1405 == 1 && var14 <= class68.field1361 && var15 <= class175.field3141 && var13 > class68.field1361 && var16 > class175.field3141) {
                            var23 = true;
                        }
                        if (var23) {
                            class46.method304(var10, class175.field3141 - var12, -var11 + class68.field1361, -1446);
                        }
                        if (class86.field1647 != null && class86.field1647 != var10 && var21 && class5.method31(class159.method1026(var10, -1493540320), (byte) -81)) {
                            class23.field560 = var10;
                        }
                        if (class123.field2280 == var10) {
                            class18.field476 = var11;
                            class84.field1628 = true;
                            class196.field3640 = var12;
                        }
                        if (var10.field171 || var10.field220 != 0) {
                            if (var21 && class30.field660 != 0 && var10.field180 != null) {
                                class19 var24 = new class19();
                                var24.field498 = true;
                                var24.field489 = class30.field660;
                                var24.field499 = var10;
                                var24.field491 = var10.field180;
                                class193.field3590.method235(arg0 - 228, var24);
                            }
                            if (class86.field1647 != null || class143.field2599 != null || class182.field3358 || var10.field220 != 1400 && class168.field3035) {
                                var22 = false;
                                var21 = false;
                                var23 = false;
                            }
                            if (var10.field220 == 1337) {
                                class139.method880(var10, 115);
                                continue;
                            }
                            if (var10.field220 == 1338) {
                                if (var23) {
                                    class43.method282(class68.field1361 - var11, -var12 + class175.field3141, var10, -274283001);
                                }
                                continue;
                            }
                            if (var10.field220 == 1400) {
                                class48.field1036 = var10;
                                if (var23) {
                                    if (class84.field1618[82] && class178.field3233 > 0) {
                                        int var25 = class176.field3209 + (int) ((double) (class68.field1361 - var10.field169 / 2 - var11) * 2.0D / class150.field2698) + class164.field2972;
                                        int var26 = class202.field3736 + class66.field1350 - (int) ((double) (class175.field3141 - var12 - var10.field73 / 2) * 2.0D / class150.field2698) - class71.field1421;
                                        class179 var27 = class78.method502((byte) -127, new class179[] { class127.field2326, class148.method949((byte) -14, var25 >> 6), class55.field1205, class148.method949((byte) -14, var26 >> 6), class55.field1205, class148.method949((byte) -14, var25 & 0x3F), class55.field1205, class148.method949((byte) -14, var26 & 0x3F) });
                                        var27.method1130((byte) -103);
                                        class219.method1428((byte) 38, var27);
                                        class212.method1403(42);
                                        continue;
                                    }
                                    class168.field3035 = true;
                                    class197.field3659 = class71.field1421;
                                    class230.field4251 = class164.field2972;
                                    class233.field4307 = class139.field2559;
                                    class150.field2701 = class4.field61;
                                    continue;
                                }
                                if (var22 && class168.field3035) {
                                    class115.method744(class230.field4251 + (int) ((double) (class150.field2701 - class4.field61) * 2.0D / class55.field1218), -1);
                                    class180.method1178(false, (int) ((double) (class233.field4307 - class139.field2559) * 2.0D / class55.field1218) + class197.field3659);
                                    continue;
                                }
                                class168.field3035 = false;
                                continue;
                            }
                            if (var10.field220 == 1401) {
                                if (var22) {
                                    class14.method100(var10.field169, var10.field73, 124, class4.field61 - var11, -var12 + class139.field2559);
                                }
                                continue;
                            }
                            if (!var10.field69 && var23) {
                                var10.field69 = true;
                                if (var10.field215 != null) {
                                    class19 var28 = new class19();
                                    var28.field499 = var10;
                                    var28.field489 = class175.field3141 - var12;
                                    var28.field496 = class68.field1361 - var11;
                                    var28.field491 = var10.field215;
                                    var28.field498 = true;
                                    class193.field3590.method235(-100, var28);
                                }
                            }
                            if (var10.field69 && var22 && var10.field217 != null) {
                                class19 var29 = new class19();
                                var29.field496 = class4.field61 - var11;
                                var29.field498 = true;
                                var29.field499 = var10;
                                var29.field491 = var10.field217;
                                var29.field489 = class139.field2559 - var12;
                                class193.field3590.method235(-106, var29);
                            }
                            if (var10.field69 && !var22) {
                                var10.field69 = false;
                                if (var10.field79 != null) {
                                    class19 var30 = new class19();
                                    var30.field489 = class139.field2559 - var12;
                                    var30.field491 = var10.field79;
                                    var30.field496 = class4.field61 - var11;
                                    var30.field499 = var10;
                                    var30.field498 = true;
                                    class54.field1183.method235(-90, var30);
                                }
                            }
                            if (var22 && var10.field183 != null) {
                                class19 var31 = new class19();
                                var31.field491 = var10.field183;
                                var31.field489 = class139.field2559 - var12;
                                var31.field498 = true;
                                var31.field499 = var10;
                                var31.field496 = class4.field61 - var11;
                                class193.field3590.method235(-99, var31);
                            }
                            if (!var10.field116 && var21) {
                                var10.field116 = true;
                                if (var10.field118 != null) {
                                    class19 var32 = new class19();
                                    var32.field498 = true;
                                    var32.field491 = var10.field118;
                                    var32.field496 = class4.field61 - var11;
                                    var32.field499 = var10;
                                    var32.field489 = class139.field2559 - var12;
                                    class193.field3590.method235(-123, var32);
                                }
                            }
                            if (var10.field116 && var21 && var10.field91 != null) {
                                class19 var33 = new class19();
                                var33.field496 = class4.field61 - var11;
                                var33.field489 = class139.field2559 - var12;
                                var33.field498 = true;
                                var33.field499 = var10;
                                var33.field491 = var10.field91;
                                class193.field3590.method235(-58, var33);
                            }
                            if (var10.field116 && !var21) {
                                var10.field116 = false;
                                if (var10.field202 != null) {
                                    class19 var34 = new class19();
                                    var34.field496 = class4.field61 - var11;
                                    var34.field499 = var10;
                                    var34.field489 = class139.field2559 - var12;
                                    var34.field498 = true;
                                    var34.field491 = var10.field202;
                                    class54.field1183.method235(-67, var34);
                                }
                            }
                            if (var10.field106 != null) {
                                class19 var35 = new class19();
                                var35.field499 = var10;
                                var35.field491 = var10.field106;
                                class174.field3119.method235(arg0 ^ 0xFFFFFFE5, var35);
                            }
                            if (var10.field122 != null && var10.field134 < class49.field1053) {
                                if (var10.field121 == null || class49.field1053 - var10.field134 > 32) {
                                    class19 var40 = new class19();
                                    var40.field491 = var10.field122;
                                    var40.field499 = var10;
                                    class193.field3590.method235(-71, var40);
                                } else {
                                    label431: for (int var36 = var10.field134; var36 < class49.field1053; var36++) {
                                        int var37 = class116.field2192[var36 & 0x1F];
                                        for (int var38 = 0; var38 < var10.field121.length; var38++) {
                                            if (var10.field121[var38] == var37) {
                                                class19 var39 = new class19();
                                                var39.field499 = var10;
                                                var39.field491 = var10.field122;
                                                class193.field3590.method235(-67, var39);
                                                break label431;
                                            }
                                        }
                                    }
                                }
                                var10.field134 = class49.field1053;
                            }
                            if (var10.field144 != null && class220.field4070 > var10.field123) {
                                if (var10.field140 == null || class220.field4070 - var10.field123 > 32) {
                                    class19 var45 = new class19();
                                    var45.field491 = var10.field144;
                                    var45.field499 = var10;
                                    class193.field3590.method235(-120, var45);
                                } else {
                                    label407: for (int var41 = var10.field123; var41 < class220.field4070; var41++) {
                                        int var42 = class141.field2578[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var10.field140.length; var43++) {
                                            if (var10.field140[var43] == var42) {
                                                class19 var44 = new class19();
                                                var44.field499 = var10;
                                                var44.field491 = var10.field144;
                                                class193.field3590.method235(-114, var44);
                                                break label407;
                                            }
                                        }
                                    }
                                }
                                var10.field123 = class220.field4070;
                            }
                            if (var10.field209 != null && var10.field182 < class234.field4317) {
                                if (var10.field150 == null || class234.field4317 - var10.field182 > 32) {
                                    class19 var50 = new class19();
                                    var50.field491 = var10.field209;
                                    var50.field499 = var10;
                                    class193.field3590.method235(-112, var50);
                                } else {
                                    label383: for (int var46 = var10.field182; var46 < class234.field4317; var46++) {
                                        int var47 = class111.field2079[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var10.field150.length; var48++) {
                                            if (var10.field150[var48] == var47) {
                                                class19 var49 = new class19();
                                                var49.field491 = var10.field209;
                                                var49.field499 = var10;
                                                class193.field3590.method235(-101, var49);
                                                break label383;
                                            }
                                        }
                                    }
                                }
                                var10.field182 = class234.field4317;
                            }
                            if (class190.field3539 > var10.field223 && var10.field93 != null) {
                                class19 var51 = new class19();
                                var51.field491 = var10.field93;
                                var51.field499 = var10;
                                class193.field3590.method235(-112, var51);
                            }
                            if (var10.field223 < class43.field936 && var10.field196 != null) {
                                class19 var52 = new class19();
                                var52.field491 = var10.field196;
                                var52.field499 = var10;
                                class193.field3590.method235(arg0 ^ 0xFFFFFFD7, var52);
                            }
                            if (var10.field223 < class240.field4419 && var10.field104 != null) {
                                class19 var53 = new class19();
                                var53.field499 = var10;
                                var53.field491 = var10.field104;
                                class193.field3590.method235(-80, var53);
                            }
                            if (var10.field223 < class147.field2665 && var10.field190 != null) {
                                class19 var54 = new class19();
                                var54.field491 = var10.field190;
                                var54.field499 = var10;
                                class193.field3590.method235(-68, var54);
                            }
                            if (var10.field223 < class225.field4172 && var10.field210 != null) {
                                class19 var55 = new class19();
                                var55.field491 = var10.field210;
                                var55.field499 = var10;
                                class193.field3590.method235(-111, var55);
                            }
                            var10.field223 = class32.field693;
                            if (var10.field203 != null) {
                                for (int var56 = 0; var56 < class55.field1219; var56++) {
                                    class19 var57 = new class19();
                                    var57.field499 = var10;
                                    var57.field497 = class34.field775[var56];
                                    var57.field495 = class174.field3126[var56];
                                    var57.field491 = var10.field203;
                                    class193.field3590.method235(-98, var57);
                                }
                            }
                        }
                    }
                    if (!var10.field108 && class86.field1647 == null && class143.field2599 == null && !class182.field3358) {
                        if ((var10.field168 >= 0 || var10.field133 != 0) && var14 <= class4.field61 && var15 <= class139.field2559 && class4.field61 < var13 && class139.field2559 < var16) {
                            if (var10.field168 >= 0) {
                                class155.field2790 = arg3[var10.field168];
                            } else {
                                class155.field2790 = var10;
                            }
                        }
                        if (var10.field128 == 8 && var14 <= class4.field61 && var15 <= class139.field2559 && var13 > class4.field61 && class139.field2559 < var16) {
                            class132.field2397 = var10;
                        }
                        if (var10.field73 < var10.field97) {
                            class174.method1100(var10.field73, var10, class139.field2559, var10.field169 + var11, var10.field97, -91, var12, class4.field61);
                        }
                    }
                    if (var10.field128 == 0) {
                        method602(arg0, var13, var14, arg3, var10.field173, var11 - var10.field70, -var10.field119 + var12, var15, var16);
                        if (var10.field206 != null) {
                            method602(100, var13, var14, var10.field206, var10.field173, var11 - var10.field70, -var10.field119 + var12, var15, var16);
                        }
                        class98 var58 = (class98) class36.field797.method909(arg0 ^ 0xFFFFFF9B, (long) var10.field173);
                        if (var58 != null) {
                            class64.method418(var12, var13, var15, var58.field1831, var14, var16, true, var11);
                        }
                    }
                }
            }
        }
        if (arg0 != 100) {
            method603(-36, -12, -79, -116, true);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIZ)V")
    public static final void method603(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1741++;
        class177 var5 = (class177) class155.field2777.method909(-1, (long) arg3);
        if (var5 == null) {
            var5 = new class177();
            class155.field2777.method914((long) arg3, var5, true);
        }
        if (!arg4) {
            method604(-117);
        }
        if (arg1 >= var5.field3221.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field3221.length; var8++) {
                var6[var8] = var5.field3221[var8];
                var7[var8] = var5.field3219[var8];
            }
            for (int var9 = var5.field3221.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3221 = var6;
            var5.field3219 = var7;
        }
        var5.field3221[arg1] = arg0;
        var5.field3219[arg1] = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method604(int arg0) {
        field1740 = null;
        field1747 = null;
        field1742 = null;
        if (arg0 != 50) {
            method602(-34, -78, -40, null, 70, 25, -76, -59, -111);
        }
        field1739 = null;
        field1746 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
    public static final void method605(byte arg0) {
        field1745++;
        for (int var1 = 0; var1 < class220.field4072; var1++) {
            int var10002 = field1739[var1]--;
            if (field1739[var1] >= -10) {
                class200 var3 = class99.field1847[var1];
                if (var3 == null) {
                    var3 = class200.method1331(class157.field2850, class148.field2669[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    field1739[var1] += var3.method1328();
                    class99.field1847[var1] = var3;
                }
                if (field1739[var1] < 0) {
                    int var10;
                    if (class227.field4199[var1] == 0) {
                        var10 = class151.field2714;
                    } else {
                        int var4 = (class227.field4199[var1] & 0xFF) * 128;
                        int var5 = class227.field4199[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class61.field1298.field3159;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class227.field4199[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class61.field1298.field3198;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            field1739[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class102.field1963 / var4;
                    }
                    if (var10 > 0) {
                        class24 var11 = var3.method1329().method162(class15.field373);
                        class83 var12 = class83.method537(var11, 100, var10);
                        var12.method552(class161.field2914[var1] - 1);
                        class38.field824.method1195(var12);
                    }
                    field1739[var1] = -100;
                }
            } else {
                class220.field4072--;
                for (int var2 = var1; var2 < class220.field4072; var2++) {
                    class148.field2669[var2] = class148.field2669[var2 + 1];
                    class99.field1847[var2] = class99.field1847[var2 + 1];
                    class161.field2914[var2] = class161.field2914[var2 + 1];
                    field1739[var2] = field1739[var2 + 1];
                    class227.field4199[var2] = class227.field4199[var2 + 1];
                }
                var1--;
            }
        }
        if (class144.field2618 && !class197.method1319(-6773)) {
            if (class130.field2364 != 0 && class136.field2520 != -1) {
                class3.method19(4095, class136.field2520, false, class179.field3251, 0, class130.field2364);
            }
            class144.field2618 = false;
        } else if (class130.field2364 != 0 && class136.field2520 != -1 && !class197.method1319(-6773)) {
            class81.field1564.method70((byte) -62, 201);
            class13.field323++;
            class81.field1564.method1229((byte) -113, class136.field2520);
            class136.field2520 = -1;
        }
        if (arg0 != -69) {
            field1747 = null;
        }
    }
}
