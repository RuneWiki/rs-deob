import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[Lnb;")
    public volatile class92[] field501 = new class92[2];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
    public volatile boolean field489 = false;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Z")
    public volatile boolean field502 = false;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lsc;")
    private static class128 field493 = class129.method1017(false, " from your ignore list first)3");

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lsc;")
    private static class128 field490 = class129.method1017(false, "Create a free account");

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Z")
    public static boolean field504 = false;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lsc;")
    public static class128 field506 = field493;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lsc;")
    public static class128 field508 = field490;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lsc;")
    public static class128 field499 = class129.method1017(false, "::noclip");

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lsc;")
    public static class128 field491 = class129.method1017(false, "<col=ffff00>");

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lsc;")
    private static class128 field492 = class129.method1017(false, "This computers address has been blocked");

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lsc;")
    public static class128 field500 = field492;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lbb;")
    public class10 field494;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lbb;")
    public static class10 field503;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lsf;")
    public static class131 field498;

    @OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
    public final void run() {
        field509++;
        this.field502 = true;
        try {
            while (!this.field489) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class92 var2 = this.field501[var1];
                    if (var2 != null) {
                        var2.method715((byte) 105);
                    }
                }
                class18.method164(false, 10L);
                class116.method894(-13960, null, this.field494);
            }
        } catch (Exception var9) {
            class116.method895(-1, var9, null);
        } finally {
            Object var6 = null;
            this.field502 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method218(int arg0) {
        field500 = null;
        field499 = null;
        field492 = null;
        field508 = null;
        if (arg0 != 0) {
            method225((byte) -14, -2L);
        }
        field498 = null;
        field493 = null;
        field491 = null;
        field506 = null;
        field503 = null;
        field490 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method219(int arg0) {
        field510++;
        int var1 = -84 % ((arg0 + 20) / 35);
        if (class73.field1631 == 72) {
            int var2 = class158.field3626.method668(-24845);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class82.field1836[var3];
            int var6 = class158.field3626.method650(65536);
            int var7 = class158.field3626.method668(-24845);
            int var8 = (var7 & 0x7) + class86.field1911;
            int var9 = (var7 >> 4 & 0x7) + class156.field3588;
            if (var9 >= 0 && var8 >= 0 && var9 < 104 && var8 < 104) {
                class40.method292(class29.field553, var3, -1, var5, 34, var9, 0, var8, var4, var6);
            }
        } else if (class73.field1631 == 149) {
            int var10 = class158.field3626.method639(-125);
            int var11 = class158.field3626.method668(-24845);
            int var12 = (var11 & 0x7) + class86.field1911;
            int var13 = (var11 >> 4 & 0x7) + class156.field3588;
            if (var13 >= 0 && var12 >= 0 && var13 < 104 && var12 < 104) {
                class121 var14 = class124.field2796[class29.field553][var13][var12];
                if (var14 != null) {
                    for (class1 var15 = (class1) var14.method920((byte) -68); var15 != null; var15 = (class1) var14.method932(-6)) {
                        if ((var10 & 0x7FFF) == var15.field4) {
                            var15.method172(-2658);
                            break;
                        }
                    }
                    if (var14.method920((byte) -123) == null) {
                        class124.field2796[class29.field553][var13][var12] = null;
                    }
                    class55.method424(var13, var12, (byte) 125);
                }
            }
        } else {
            if (class73.field1631 == 248) {
                int var16 = class158.field3626.method646(-15447);
                int var17 = class156.field3588 + (var16 >> 4 & 0x7);
                int var18 = class86.field1911 + (var16 & 0x7);
                int var19 = class158.field3626.method632((byte) -80);
                int var20 = class158.field3626.method646(-15447);
                int var21 = var20 >> 4 & 0xF;
                int var22 = var20 & 0x7;
                int var23 = class158.field3626.method646(-15447);
                if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                    int var24 = var21 + 1;
                    if (class151.field3473.field962[0] >= var17 - var24 && class151.field3473.field962[0] <= var17 + var24 && var18 - var24 <= class151.field3473.field989[0] && var18 + var24 >= class151.field3473.field989[0] && class143.field3348 != 0 && var22 > 0 && class55.field1232 < 50) {
                        class144.field3362[class55.field1232] = var19;
                        class60.field1301[class55.field1232] = var22;
                        class64.field1401[class55.field1232] = var23;
                        class93.field2132[class55.field1232] = null;
                        class110.field2490[class55.field1232] = (var17 << 16) + (var18 << 8) + var21;
                        class55.field1232++;
                    }
                }
            }
            if (class73.field1631 == 237) {
                int var25 = class158.field3626.method650(65536);
                int var26 = class158.field3626.method639(-115);
                int var27 = class158.field3626.method646(-15447);
                int var28 = (var27 & 0x7) + class86.field1911;
                int var29 = (var27 >> 4 & 0x7) + class156.field3588;
                int var30 = class158.field3626.method678(0);
                if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104 && class33.field628 != var26) {
                    class1 var31 = new class1();
                    var31.field4 = var25;
                    var31.field9 = var30;
                    if (class124.field2796[class29.field553][var29][var28] == null) {
                        class124.field2796[class29.field553][var29][var28] = new class121();
                    }
                    class124.field2796[class29.field553][var29][var28].method926(5569, var31);
                    class55.method424(var29, var28, (byte) 124);
                }
            } else if (class73.field1631 == 106) {
                int var32 = class158.field3626.method632((byte) -80);
                int var33 = class158.field3626.method659(-75);
                int var34 = (var33 >> 4 & 0x7) + class156.field3588;
                int var35 = class86.field1911 + (var33 & 0x7);
                int var36 = class158.field3626.method632((byte) -80);
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    class1 var37 = new class1();
                    var37.field9 = var36;
                    var37.field4 = var32;
                    if (class124.field2796[class29.field553][var34][var35] == null) {
                        class124.field2796[class29.field553][var34][var35] = new class121();
                    }
                    class124.field2796[class29.field553][var34][var35].method926(5569, var37);
                    class55.method424(var34, var35, (byte) 125);
                }
            } else if (class73.field1631 == 118) {
                int var38 = class158.field3626.method650(65536);
                int var39 = class158.field3626.method659(63);
                int var40 = (var39 >> 4 & 0x7) + class156.field3588;
                int var41 = (var39 & 0x7) + class86.field1911;
                int var42 = class158.field3626.method668(-24845);
                int var43 = var42 >> 2;
                int var44 = var42 & 0x3;
                int var45 = class82.field1836[var43];
                if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                    if (var45 == 0) {
                        class36 var46 = class154.field3553.method121(class29.field553, var40, var41);
                        if (var46 != null) {
                            int var47 = var46.field682 >> 14 & 0x7FFF;
                            if (var43 == 2) {
                                var46.field689 = new class40(var47, 2, var44 + 4, class29.field553, var40, var41, var38, false, var46.field689);
                                var46.field705 = new class40(var47, 2, var44 + 1 & 0x3, class29.field553, var40, var41, var38, false, var46.field705);
                            } else {
                                var46.field689 = new class40(var47, var43, var44, class29.field553, var40, var41, var38, false, var46.field689);
                            }
                        }
                    }
                    if (var45 == 1) {
                        class75 var48 = class154.field3553.method139(class29.field553, var40, var41);
                        if (var48 != null) {
                            int var49 = var48.field1665 >> 14 & 0x7FFF;
                            if (var43 == 4 || var43 == 5) {
                                var48.field1659 = new class40(var49, 4, var44, class29.field553, var40, var41, var38, false, var48.field1659);
                            } else if (var43 == 6) {
                                var48.field1659 = new class40(var49, 4, var44 + 4, class29.field553, var40, var41, var38, false, var48.field1659);
                            } else if (var43 == 7) {
                                var48.field1659 = new class40(var49, 4, (var44 + 2 & 0x3) + 4, class29.field553, var40, var41, var38, false, var48.field1659);
                            } else if (var43 == 8) {
                                var48.field1659 = new class40(var49, 4, var44 + 4, class29.field553, var40, var41, var38, false, var48.field1659);
                                var48.field1664 = new class40(var49, 4, (var44 + 2 & 0x3) + 4, class29.field553, var40, var41, var38, false, var48.field1664);
                            }
                        }
                    }
                    if (var45 == 2) {
                        if (var43 == 11) {
                            var43 = 10;
                        }
                        class141 var50 = class154.field3553.method136(class29.field553, var40, var41);
                        if (var50 != null) {
                            var50.field3307 = new class40(var50.field3311 >> 14 & 0x7FFF, var43, var44, class29.field553, var40, var41, var38, false, var50.field3307);
                        }
                    }
                    if (var45 == 3) {
                        class157 var51 = class154.field3553.method107(class29.field553, var40, var41);
                        if (var51 != null) {
                            var51.field3611 = new class40(var51.field3603 >> 14 & 0x7FFF, 22, var44, class29.field553, var40, var41, var38, false, var51.field3611);
                        }
                    }
                }
            } else if (class73.field1631 == 140) {
                int var52 = class158.field3626.method668(-24845);
                int var53 = var52 >> 2;
                int var54 = var52 & 0x3;
                int var55 = class82.field1836[var53];
                int var56 = class158.field3626.method668(-24845);
                int var57 = (var56 & 0x7) + class86.field1911;
                int var58 = (var56 >> 4 & 0x7) + class156.field3588;
                if (var58 >= 0 && var57 >= 0 && var58 < 104 && var57 < 104) {
                    class40.method292(class29.field553, var53, -1, var55, 34, var58, 0, var57, var54, -1);
                }
            } else {
                if (class73.field1631 == 164) {
                    int var59 = class158.field3626.method632((byte) -80);
                    int var60 = class158.field3626.method678(0);
                    byte var61 = class158.field3626.method638(-124);
                    int var62 = class158.field3626.method659(63);
                    int var63 = (var62 & 0x7) + class86.field1911;
                    int var64 = (var62 >> 4 & 0x7) + class156.field3588;
                    int var65 = class158.field3626.method659(103);
                    int var66 = var65 >> 2;
                    int var67 = var65 & 0x3;
                    int var68 = class82.field1836[var66];
                    byte var69 = class158.field3626.method657((byte) -11);
                    byte var70 = class158.field3626.method638(-74);
                    int var71 = class158.field3626.method650(65536);
                    int var72 = class158.field3626.method632((byte) -80);
                    byte var73 = class158.field3626.method657((byte) -11);
                    class53 var74;
                    if (class33.field628 == var72) {
                        var74 = class151.field3473;
                    } else {
                        var74 = class106.field2421[var72];
                    }
                    if (var74 != null) {
                        class94 var75 = class147.method1185(-2, var71);
                        int var76;
                        int var77;
                        if (var67 == 1 || var67 == 3) {
                            var77 = var75.field2195;
                            var76 = var75.field2166;
                        } else {
                            var76 = var75.field2195;
                            var77 = var75.field2166;
                        }
                        int var78 = (var77 >> 1) + var64;
                        int var79 = (var77 + 1 >> 1) + var64;
                        int var80 = (var76 >> 1) + var63;
                        int var81 = (var76 + 1 >> 1) + var63;
                        int[][] var82 = class55.field1229[class29.field553];
                        int var83 = (var64 << 7) + (var77 << 6);
                        int var84 = var82[var78][var80] + var82[var79][var81] + var82[var79][var80] + var82[var78][var81] >> 2;
                        int var85 = (var63 << 7) + (var76 << 6);
                        class78 var86 = var75.method740(var84, var82, (byte) 23, var85, var83, var66, var67);
                        if (var86 != null) {
                            class40.method292(class29.field553, 0, var60 + 1, var68, 34, var64, var59 + 1, var63, 0, -1);
                            var74.field1047 = class29.field554 + var59;
                            if (var69 < var70) {
                                byte var87 = var70;
                                var70 = var69;
                                var69 = var87;
                            }
                            var74.field1072 = var64 * 128 + var77 * 64;
                            var74.field1074 = class29.field554 + var60;
                            var74.field1054 = var64 + var70;
                            var74.field1061 = var86;
                            var74.field1039 = var64 + var69;
                            var74.field1046 = var63 * 128 + var76 * 64;
                            var74.field1049 = var84;
                            if (var61 < var73) {
                                byte var88 = var73;
                                var73 = var61;
                                var61 = var88;
                            }
                            var74.field1057 = var63 + var61;
                            var74.field1042 = var63 + var73;
                        }
                    }
                }
                if (class73.field1631 == 50) {
                    int var89 = class158.field3626.method646(-15447);
                    int var90 = (var89 >> 4 & 0x7) + class156.field3588;
                    int var91 = (var89 & 0x7) + class86.field1911;
                    int var92 = class158.field3626.method667(-1) + var90;
                    int var93 = var91 + class158.field3626.method667(-1);
                    int var94 = class158.field3626.method637(false);
                    int var95 = class158.field3626.method632((byte) -80);
                    int var96 = class158.field3626.method646(-15447) * 4;
                    int var97 = class158.field3626.method646(-15447) * 4;
                    int var98 = class158.field3626.method632((byte) -80);
                    int var99 = class158.field3626.method632((byte) -80);
                    int var100 = class158.field3626.method646(-15447);
                    int var101 = class158.field3626.method646(-15447);
                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var95 != 65535) {
                        int var102 = var93 * 128 + 64;
                        int var103 = var92 * 128 + 64;
                        int var104 = var90 * 128 + 64;
                        int var105 = var91 * 128 + 64;
                        class30 var106 = new class30(var95, class29.field553, var104, var105, class97.method755(var105, class29.field553, var104, 256) - var96, var98 - -class29.field554, class29.field554 + var99, var100, var101, var94, var97);
                        var106.method242(var102, var103, class97.method755(var102, class29.field553, var103, 256) - var97, class29.field554 + var98, true);
                        class43.field804.method926(5569, var106);
                    }
                } else if (class73.field1631 == 83) {
                    int var107 = class158.field3626.method646(-15447);
                    int var108 = class156.field3588 + (var107 >> 4 & 0x7);
                    int var109 = (var107 & 0x7) + class86.field1911;
                    int var110 = class158.field3626.method632((byte) -80);
                    int var111 = class158.field3626.method646(-15447);
                    int var112 = class158.field3626.method632((byte) -80);
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        int var113 = var109 * 128 + 64;
                        int var114 = var108 * 128 + 64;
                        class7 var115 = new class7(var110, class29.field553, var114, var113, class97.method755(var113, class29.field553, var114, 256) - var111, var112, class29.field554);
                        class135.field3183.method926(5569, var115);
                    }
                } else if (class73.field1631 == 144) {
                    int var116 = class158.field3626.method646(-15447);
                    int var117 = (var116 >> 4 & 0x7) + class156.field3588;
                    int var118 = (var116 & 0x7) + class86.field1911;
                    int var119 = class158.field3626.method632((byte) -80);
                    int var120 = class158.field3626.method632((byte) -80);
                    int var121 = class158.field3626.method632((byte) -80);
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                        class121 var122 = class124.field2796[class29.field553][var117][var118];
                        if (var122 != null) {
                            for (class1 var123 = (class1) var122.method920((byte) 94); var123 != null; var123 = (class1) var122.method932(-6)) {
                                if ((var119 & 0x7FFF) == var123.field4 && var123.field9 == var120) {
                                    var123.field9 = var121;
                                    break;
                                }
                            }
                            class55.method424(var117, var118, (byte) 125);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public static final void method220(int arg0, int arg1) {
        field495++;
        int var2 = -23 % ((19 - arg1) / 56);
        class159 var3 = (class159) class46.field858.method969((long) arg0, -119);
        if (var3 != null) {
            var3.method172(-2658);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
    public static final void method221(int arg0, boolean arg1) {
        field488++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class82.field1840[arg0];
        int var3 = class121.field2760[arg0];
        int var4 = class67.field1518[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = class41.field764[arg0];
        if (var3 == 1003) {
            class89.field2035++;
            class70.field1580 = 0;
            class127.field2871 = 2;
            class156.field3587 = class43.field806;
            class19.field356 = class9.field133;
            class152.field3502.method507(-109, 29);
            class152.field3502.method673((byte) 76, var5);
        }
        if (var3 == 40) {
            class53 var6 = class106.field2421[var5];
            if (var6 != null) {
                class35.field663++;
                class43.method306(var6.field962[0], 0, 0, 1, 2, var6.field989[0], 1, (byte) 117, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class156.field3587 = class43.field806;
                class19.field356 = class9.field133;
                class127.field2871 = 2;
                class70.field1580 = 0;
                class152.field3502.method507(-87, 55);
                class152.field3502.method656(var5, (byte) 33);
            }
        }
        if (var3 == 1006) {
            class156.field3587 = class43.field806;
            class127.field2871 = 2;
            class70.field1580 = 0;
            class19.field356 = class9.field133;
            class51 var7 = class92.field2104[var5];
            if (var7 != null) {
                class60 var8 = var7.field1028;
                if (var8.field1270 != null) {
                    var8 = var8.method452(-74);
                }
                if (var8 != null) {
                    class152.field3502.method507(-124, 44);
                    class152.field3502.method656(var8.field1311, (byte) 33);
                    class93.field2131++;
                }
            }
        }
        if (var3 == 24) {
            boolean var9 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) -96, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            if (!var9) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) -97, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class127.field2871 = 2;
            class70.field1580 = 0;
            class156.field3587 = class43.field806;
            class19.field356 = class9.field133;
            class118.field2669++;
            class152.field3502.method507(118, 34);
            class152.field3502.method673((byte) 38, class5.field62);
            class152.field3502.method673((byte) 43, class51.field1035);
            class152.field3502.method631(var5, (byte) 108);
            class152.field3502.method673((byte) 71, class62.field1325 + var2);
            class152.field3502.method673((byte) 122, class66.field1482 + var4);
            class152.field3502.method652(class60.field1292, 10114);
        }
        if (var3 == 51) {
            class53 var11 = class106.field2421[var5];
            if (var11 != null) {
                class111.field2492++;
                class43.method306(var11.field962[0], 0, 0, 1, 2, var11.field989[0], 1, (byte) -1, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class70.field1580 = 0;
                class19.field356 = class9.field133;
                class127.field2871 = 2;
                class156.field3587 = class43.field806;
                class152.field3502.method507(108, 208);
                class152.field3502.method631(var5, (byte) 116);
            }
        }
        if (var3 == 1001) {
            class156.field3587 = class43.field806;
            class19.field356 = class9.field133;
            class127.field2871 = 2;
            class46.field851++;
            class70.field1580 = 0;
            class152.field3502.method507(-100, 35);
            class152.field3502.method660(var5 >> 14 & 0x7FFF, -18562);
        }
        if (var3 == 5) {
            class106.method792((byte) 96, var5, var4, var2);
            class90.field2050++;
            class152.field3502.method507(-125, 236);
            class152.field3502.method631(class62.field1325 + var2, (byte) 122);
            class152.field3502.method673((byte) 76, var4 + class66.field1482);
            class152.field3502.method656(var5 >> 14 & 0x7FFF, (byte) 33);
        }
        if (var3 == 22) {
            class152.field3502.method507(93, 231);
            class152.field3502.method631(var5, (byte) 95);
            class84.field1868++;
            class152.field3502.method673((byte) 35, var2);
            class152.field3502.method649(-47, var4);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -66);
            class108.field2454 = var2;
        }
        if (var3 == 12) {
            class51 var12 = class92.field2104[var5];
            if (var12 != null) {
                class84.field1879++;
                class43.method306(var12.field962[0], 0, 0, 1, 2, var12.field989[0], 1, (byte) 125, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class127.field2871 = 2;
                class19.field356 = class9.field133;
                class70.field1580 = 0;
                class156.field3587 = class43.field806;
                class152.field3502.method507(66, 72);
                class152.field3502.method656(var5, (byte) 33);
            }
        }
        if (var3 == 38) {
            class116.field2607++;
            class106.method792((byte) -123, var5, var4, var2);
            class152.field3502.method507(-126, 199);
            class152.field3502.method673((byte) 110, class66.field1482 + var4);
            class152.field3502.method631(var5 >> 14 & 0x7FFF, (byte) 111);
            class152.field3502.method631(class62.field1325 + var2, (byte) 116);
        }
        if (var3 == 1005) {
            class106.method792((byte) 121, var5, var4, var2);
            class152.field3502.method507(-103, 6);
            class152.field3502.method631(class66.field1482 + var4, (byte) 105);
            class151.field3486++;
            class152.field3502.method660(class62.field1325 + var2, -18562);
            class152.field3502.method673((byte) -87, var5 >> 14 & 0x7FFF);
        }
        if (var3 == 43) {
            class51 var13 = class92.field2104[var5];
            if (var13 != null) {
                class105.field2375++;
                class43.method306(var13.field962[0], 0, 0, 1, 2, var13.field989[0], 1, (byte) -87, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class19.field356 = class9.field133;
                class156.field3587 = class43.field806;
                class70.field1580 = 0;
                class127.field2871 = 2;
                class152.field3502.method507(101, 33);
                class152.field3502.method656(var5, (byte) 33);
            }
        }
        if (var3 == 2 && class106.method792((byte) -126, var5, var4, var2)) {
            class152.field3502.method507(64, 96);
            class20.field370++;
            class152.field3502.method673((byte) -122, class66.field1482 + var4);
            class152.field3502.method631(class62.field1325 + var2, (byte) 118);
            class152.field3502.method660(var5 >> 14 & 0x7FFF, -18562);
            class152.field3502.method631(class5.field62, (byte) 123);
            class152.field3502.method673((byte) -119, class51.field1035);
            class152.field3502.method676(class60.field1292, 1791988248);
        }
        if (var3 == 11) {
            class152.field3502.method507(62, 193);
            class73.field1642++;
            class152.field3502.method656(var2, (byte) 33);
            class152.field3502.method652(var4, 10114);
            class152.field3502.method673((byte) -102, var5);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -110);
            class108.field2454 = var2;
        }
        if (var3 == 36) {
            class53 var14 = class106.field2421[var5];
            if (var14 != null) {
                class159.field3640++;
                class43.method306(var14.field962[0], 0, 0, 1, 2, var14.field989[0], 1, (byte) -64, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class156.field3587 = class43.field806;
                class127.field2871 = 2;
                class70.field1580 = 0;
                class19.field356 = class9.field133;
                class152.field3502.method507(74, 120);
                class152.field3502.method660(var5, -18562);
            }
        }
        if (var3 == 32) {
            class53 var15 = class106.field2421[var5];
            if (var15 != null) {
                class43.method306(var15.field962[0], 0, 0, 1, 2, var15.field989[0], 1, (byte) 113, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class150.field3453++;
                class19.field356 = class9.field133;
                class156.field3587 = class43.field806;
                class70.field1580 = 0;
                class127.field2871 = 2;
                class152.field3502.method507(52, 115);
                class152.field3502.method660(var5, -18562);
            }
        }
        if (arg1) {
            return;
        }
        if (var3 == 25) {
            class51 var16 = class92.field2104[var5];
            if (var16 != null) {
                class43.method306(var16.field962[0], 0, 0, 1, 2, var16.field989[0], 1, (byte) 123, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class158.field3629++;
                class127.field2871 = 2;
                class156.field3587 = class43.field806;
                class70.field1580 = 0;
                class19.field356 = class9.field133;
                class152.field3502.method507(-97, 13);
                class152.field3502.method673((byte) -127, class51.field1035);
                class152.field3502.method628(class60.field1292, arg1);
                class152.field3502.method656(var5, (byte) 33);
                class152.field3502.method656(class5.field62, (byte) 33);
            }
        }
        if (var3 == 1002) {
            class54 var17 = class46.method338(var4, 48);
            if (var17 == null || var17.field1203[var2] < 100000) {
                class89.field2035++;
                class152.field3502.method507(-100, 29);
                class152.field3502.method673((byte) -92, var5);
            } else {
                class126.method958(0, 1, class18.field323, class51.method395(new class128[] { class111.method857(var17.field1203[var2], (byte) 101), class116.field2617, class27.method230((byte) -44, var5).field1378 }, false));
            }
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -76);
            class108.field2454 = var2;
        }
        if (var3 == 4) {
            class82.field1835++;
            class152.field3502.method507(120, 79);
            class152.field3502.method649(-12, var4);
            class54 var18 = class46.method338(var4, 67);
            if (var18.field1208 != null && var18.field1208[0][0] == 5) {
                int var19 = var18.field1208[0][1];
                class126.field2849[var19] = 1 - class126.field2849[var19];
                class71.method542(-15128, var19);
            }
        }
        if (var3 == 31) {
            class148.field3416++;
            class152.field3502.method507(-124, 185);
            class152.field3502.method673((byte) 112, var5);
            class152.field3502.method673((byte) 26, var2);
            class152.field3502.method676(var4, 1791988248);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, 60);
            class108.field2454 = var2;
        }
        if (var3 == 7) {
            class106.method792((byte) -118, var5, var4, var2);
            class152.field3502.method507(48, 90);
            class152.field3502.method660(class62.field1325 + var2, -18562);
            client.field444++;
            class152.field3502.method660(class66.field1482 + var4, -18562);
            class152.field3502.method656(var5 >> 14 & 0x7FFF, (byte) 33);
        }
        if (var3 == 42) {
            class72.field1618++;
            class152.field3502.method507(71, 127);
            class152.field3502.method656(class31.field615, (byte) 33);
            class152.field3502.method652(var4, 10114);
            class152.field3502.method628(class113.field2549, arg1);
            class152.field3502.method656(var2, (byte) 33);
        }
        if (var3 == 48 && class110.field2473 == null) {
            class35.method257(var4, var2, 23971);
            class110.field2473 = class152.method1210(var4, false, var2);
            class89.method696(class110.field2473, 1);
        }
        if (var3 == 13 || var3 == 1004) {
            class105.method786(class105.field2394[arg0], var5, var2, -1, var4);
        }
        if (var3 == 1) {
            class54 var20 = class152.method1210(var4, false, var2);
            if (var20 != null) {
                class69.method521(97);
                class89.method698((byte) -51, var2, var4, class7.method34(class77.method561(77, var20), 21637));
                class105.field2392 = 0;
                class110.field2486 = class33.method245(0, var20);
                if (class110.field2486 == null) {
                    class110.field2486 = class27.field513;
                }
                if (!var20.field1146) {
                    class35.field656 = class51.method395(new class128[] { class104.field2360, var20.field1099, class159.field3650 }, false);
                    return;
                }
                class35.field656 = class51.method395(new class128[] { var20.field1145, class159.field3650 }, false);
            }
            return;
        }
        if (var3 == 39) {
            class104.method779(0);
        }
        if (var3 == 44) {
            class128.field2924++;
            class152.field3502.method507(-107, 71);
            class152.field3502.method676(var4, 1791988248);
            class152.field3502.method673((byte) -125, var5);
            class152.field3502.method673((byte) 123, var2);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -104);
            class108.field2454 = var2;
        }
        if (var3 == 29) {
            class152.field3502.method507(-120, 176);
            class70.field1578++;
            class152.field3502.method628(var4, arg1);
            class152.field3502.method631(var5, (byte) 100);
            class152.field3502.method656(var2, (byte) 33);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, 98);
            class108.field2454 = var2;
        }
        if (var3 == 18) {
            class143.field3340++;
            boolean var21 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) 106, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            if (!var21) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) -100, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class156.field3587 = class43.field806;
            class70.field1580 = 0;
            class19.field356 = class9.field133;
            class127.field2871 = 2;
            class152.field3502.method507(92, 121);
            class152.field3502.method656(class31.field615, (byte) 33);
            class152.field3502.method631(class62.field1325 + var2, (byte) 117);
            class152.field3502.method628(class113.field2549, false);
            class152.field3502.method673((byte) -104, var4 + class66.field1482);
            class152.field3502.method631(var5, (byte) 113);
        }
        if (var3 == 50) {
            class29.field550++;
            boolean var23 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) -3, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            if (!var23) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) -80, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class127.field2871 = 2;
            class19.field356 = class9.field133;
            class156.field3587 = class43.field806;
            class70.field1580 = 0;
            class152.field3502.method507(101, 41);
            class152.field3502.method660(var4 + class66.field1482, -18562);
            class152.field3502.method631(var5, (byte) 110);
            class152.field3502.method631(class62.field1325 + var2, (byte) 113);
        }
        if (var3 == 47) {
            class53 var25 = class106.field2421[var5];
            if (var25 != null) {
                class43.method306(var25.field962[0], 0, 0, 1, 2, var25.field989[0], 1, (byte) -50, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class70.field1580 = 0;
                class127.field2871 = 2;
                class19.field356 = class9.field133;
                class12.field202++;
                class156.field3587 = class43.field806;
                class152.field3502.method507(88, 211);
                class152.field3502.method656(class51.field1035, (byte) 33);
                class152.field3502.method656(var5, (byte) 33);
                class152.field3502.method652(class60.field1292, 10114);
                class152.field3502.method660(class5.field62, -18562);
            }
        }
        if (var3 == 37) {
            boolean var26 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) 107, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            class144.field3364++;
            if (!var26) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) 118, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class127.field2871 = 2;
            class156.field3587 = class43.field806;
            class70.field1580 = 0;
            class19.field356 = class9.field133;
            class152.field3502.method507(-91, 84);
            class152.field3502.method673((byte) -83, class66.field1482 + var4);
            class152.field3502.method660(var5, -18562);
            class152.field3502.method660(var2 + class62.field1325, -18562);
        }
        if (var3 == 58) {
            class51 var28 = class92.field2104[var5];
            if (var28 != null) {
                class146.field3384++;
                class43.method306(var28.field962[0], 0, 0, 1, 2, var28.field989[0], 1, (byte) 120, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class70.field1580 = 0;
                class19.field356 = class9.field133;
                class156.field3587 = class43.field806;
                class127.field2871 = 2;
                class152.field3502.method507(49, 98);
                class152.field3502.method660(var5, -18562);
            }
        }
        if (var3 == 33) {
            class92.field2098++;
            class152.field3502.method507(-102, 9);
            class152.field3502.method660(class5.field62, -18562);
            class152.field3502.method649(-87, class60.field1292);
            class152.field3502.method631(var5, (byte) 103);
            class152.field3502.method660(class51.field1035, -18562);
            class152.field3502.method673((byte) -87, var2);
            class152.field3502.method628(var4, arg1);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -67);
            class108.field2454 = var2;
        }
        if (var3 == 49) {
            class106.method792((byte) 68, var5, var4, var2);
            class152.field3502.method507(-91, 8);
            class128.field2946++;
            class152.field3502.method656(var2 + class62.field1325, (byte) 33);
            class152.field3502.method631(var5 >> 14 & 0x7FFF, (byte) 115);
            class152.field3502.method656(class66.field1482 + var4, (byte) 33);
        }
        if (var3 == 23) {
            boolean var29 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) 116, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            class112.field2535++;
            if (!var29) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) -57, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class70.field1580 = 0;
            class156.field3587 = class43.field806;
            class19.field356 = class9.field133;
            class127.field2871 = 2;
            class152.field3502.method507(84, 171);
            class152.field3502.method673((byte) 113, var5);
            class152.field3502.method631(class66.field1482 + var4, (byte) 120);
            class152.field3502.method660(class62.field1325 + var2, -18562);
        }
        if (var3 == 30) {
            class134.field3152++;
            class152.field3502.method507(-110, 82);
            class152.field3502.method631(var2, (byte) 93);
            class152.field3502.method660(var5, -18562);
            class152.field3502.method628(var4, false);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -89);
            class108.field2454 = var2;
        }
        if (var3 == 15) {
            class53 var31 = class106.field2421[var5];
            if (var31 != null) {
                class105.field2395++;
                class43.method306(var31.field962[0], 0, 0, 1, 2, var31.field989[0], 1, (byte) 112, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class127.field2871 = 2;
                class156.field3587 = class43.field806;
                class19.field356 = class9.field133;
                class70.field1580 = 0;
                class152.field3502.method507(64, 170);
                class152.field3502.method656(var5, (byte) 33);
            }
        }
        if (var3 == 21 && class106.method792((byte) -128, var5, var4, var2)) {
            class19.field341++;
            class152.field3502.method507(-95, 23);
            class152.field3502.method631(class62.field1325 + var2, (byte) 121);
            class152.field3502.method656(class31.field615, (byte) 33);
            class152.field3502.method631(var5 >> 14 & 0x7FFF, (byte) 122);
            class152.field3502.method649(-73, class113.field2549);
            class152.field3502.method660(class66.field1482 + var4, -18562);
        }
        if (var3 == 10) {
            class53 var32 = class106.field2421[var5];
            if (var32 != null) {
                class104.field2365++;
                class43.method306(var32.field962[0], 0, 0, 1, 2, var32.field989[0], 1, (byte) 120, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class127.field2871 = 2;
                class19.field356 = class9.field133;
                class70.field1580 = 0;
                class156.field3587 = class43.field806;
                class152.field3502.method507(-93, 106);
                class152.field3502.method631(var5, (byte) 103);
            }
        }
        if (var3 == 46) {
            class154.field3553.method108(class29.field553, var2, var4);
        }
        if (var3 == 45) {
            class51 var33 = class92.field2104[var5];
            if (var33 != null) {
                class43.method306(var33.field962[0], 0, 0, 1, 2, var33.field989[0], 1, (byte) 108, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class19.field356 = class9.field133;
                class119.field2684++;
                class127.field2871 = 2;
                class70.field1580 = 0;
                class156.field3587 = class43.field806;
                class152.field3502.method507(111, 31);
                class152.field3502.method631(var5, (byte) 108);
                class152.field3502.method673((byte) 27, class31.field615);
                class152.field3502.method628(class113.field2549, false);
            }
        }
        if (var3 == 16) {
            class152.field3502.method507(104, 201);
            class152.field3502.method652(var4, 10114);
            class93.field2120++;
            class152.field3502.method656(var5, (byte) 33);
            class152.field3502.method631(var2, (byte) 99);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, 103);
            class108.field2454 = var2;
        }
        if (var3 == 34) {
            class53 var34 = class106.field2421[var5];
            if (var34 != null) {
                class41.field765++;
                class43.method306(var34.field962[0], 0, 0, 1, 2, var34.field989[0], 1, (byte) -117, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class127.field2871 = 2;
                class19.field356 = class9.field133;
                class70.field1580 = 0;
                class156.field3587 = class43.field806;
                class152.field3502.method507(112, 64);
                class152.field3502.method631(var5, (byte) 90);
            }
        }
        if (var3 == 6) {
            class152.field3502.method507(-113, 79);
            class82.field1835++;
            class152.field3502.method649(-59, var4);
            class54 var35 = class46.method338(var4, -71);
            if (var35.field1208 != null && var35.field1208[0][0] == 5) {
                int var36 = var35.field1208[0][1];
                if (class126.field2849[var36] != var35.field1152[0]) {
                    class126.field2849[var36] = var35.field1152[0];
                    class71.method542(-15128, var36);
                }
            }
        }
        if (var3 == 41) {
            class12.field207++;
            class152.field3502.method507(123, 202);
            class152.field3502.method660(var2, -18562);
            class152.field3502.method649(-87, class113.field2549);
            class152.field3502.method631(class31.field615, (byte) 120);
            class152.field3502.method631(var5, (byte) 100);
            class152.field3502.method649(-101, var4);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, 49);
            class108.field2454 = var2;
        }
        if (var3 == 28) {
            class152.field3502.method507(-92, 248);
            class152.field3502.method649(-108, var4);
            class152.field3502.method673((byte) -118, var2);
            class152.field3502.method631(var5, (byte) 100);
            class157.field3601 = 0;
            class152.field3497++;
            class36.field699 = class46.method338(var4, -68);
            class108.field2454 = var2;
        }
        if (var3 == 57) {
            class44.field821++;
            class152.field3502.method507(-83, 145);
            class152.field3502.method631(var5, (byte) 95);
            class152.field3502.method631(var2, (byte) 101);
            class152.field3502.method649(-35, var4);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, 98);
            class108.field2454 = var2;
        }
        if (var3 == 19) {
            class51 var37 = class92.field2104[var5];
            if (var37 != null) {
                class93.field2138++;
                class43.method306(var37.field962[0], 0, 0, 1, 2, var37.field989[0], 1, (byte) 108, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class70.field1580 = 0;
                class19.field356 = class9.field133;
                class127.field2871 = 2;
                class156.field3587 = class43.field806;
                class152.field3502.method507(125, 30);
                class152.field3502.method673((byte) -93, var5);
            }
        }
        if (var3 == 17) {
            class60.field1310++;
            class152.field3502.method507(124, 169);
            class152.field3502.method673((byte) -83, var2);
            class152.field3502.method660(var5, -18562);
            class152.field3502.method676(var4, 1791988248);
            class157.field3601 = 0;
            class36.field699 = class46.method338(var4, -111);
            class108.field2454 = var2;
        }
        if (var3 == 9) {
            class69.method521(124);
            class54 var38 = class46.method338(var4, 69);
            class60.field1292 = var4;
            class5.field62 = var2;
            class51.field1035 = var5;
            class105.field2392 = 1;
            class89.method696(var38, 1);
            class53.field1067 = class51.method395(new class128[] { class87.field1986, class27.method230((byte) -44, var5).field1378, class159.field3650 }, false);
            if (class53.field1067 == null) {
                class53.field1067 = class66.field1483;
            }
            return;
        }
        if (var3 == 14) {
            class150.field3458++;
            boolean var39 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) -3, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            if (!var39) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) 105, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class156.field3587 = class43.field806;
            class127.field2871 = 2;
            class70.field1580 = 0;
            class19.field356 = class9.field133;
            class152.field3502.method507(-126, 197);
            class152.field3502.method660(class66.field1482 + var4, -18562);
            class152.field3502.method631(var2 + class62.field1325, (byte) 103);
            class152.field3502.method631(var5, (byte) 120);
        }
        if (var3 == 3) {
            class54 var41 = class46.method338(var4, 103);
            boolean var42 = true;
            if (var41.field1078 > 0) {
                var42 = class14.method146((byte) 126, var41);
            }
            if (var42) {
                class82.field1835++;
                class152.field3502.method507(-83, 79);
                class152.field3502.method649(-60, var4);
            }
        }
        if (var3 == 8) {
            class53 var43 = class106.field2421[var5];
            if (var43 != null) {
                class43.method306(var43.field962[0], 0, 0, 1, 2, var43.field989[0], 1, (byte) 125, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class92.field2092++;
                class70.field1580 = 0;
                class156.field3587 = class43.field806;
                class19.field356 = class9.field133;
                class127.field2871 = 2;
                class152.field3502.method507(-100, 154);
                class152.field3502.method660(var5, -18562);
            }
        }
        if (var3 == 20) {
            class53 var44 = class106.field2421[var5];
            if (var44 != null) {
                class43.method306(var44.field962[0], 0, 0, 1, 2, var44.field989[0], 1, (byte) 121, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class112.field2529++;
                class156.field3587 = class43.field806;
                class127.field2871 = 2;
                class19.field356 = class9.field133;
                class70.field1580 = 0;
                class152.field3502.method507(-103, 62);
                class152.field3502.method660(var5, -18562);
                class152.field3502.method660(class31.field615, -18562);
                class152.field3502.method649(-87, class113.field2549);
            }
        }
        if (var3 == 26) {
            class44.field818++;
            boolean var45 = class43.method306(var2, 0, 0, 0, 2, var4, 0, (byte) -76, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            if (!var45) {
                class43.method306(var2, 0, 0, 1, 2, var4, 1, (byte) 113, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
            }
            class156.field3587 = class43.field806;
            class127.field2871 = 2;
            class70.field1580 = 0;
            class19.field356 = class9.field133;
            class152.field3502.method507(-127, 213);
            class152.field3502.method656(class62.field1325 + var2, (byte) 33);
            class152.field3502.method673((byte) -115, var5);
            class152.field3502.method631(var4 + class66.field1482, (byte) 93);
        }
        if (var3 == 35) {
            class51 var47 = class92.field2104[var5];
            if (var47 != null) {
                class43.method306(var47.field962[0], 0, 0, 1, 2, var47.field989[0], 1, (byte) -20, false, class151.field3473.field989[0], class151.field3473.field962[0], 0);
                class70.field1580 = 0;
                class146.field3389++;
                class19.field356 = class9.field133;
                class127.field2871 = 2;
                class156.field3587 = class43.field806;
                class152.field3502.method507(-104, 224);
                class152.field3502.method673((byte) 117, var5);
            }
        }
        if (class105.field2392 != 0) {
            class105.field2392 = 0;
            class89.method696(class46.method338(class60.field1292, 77), 1);
        }
        if (class65.field1459) {
            class69.method521(91);
        }
        if (class36.field699 != null && class157.field3601 == 0) {
            class89.method696(class36.field699, 1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
    public static final void method222(boolean arg0, boolean arg1) {
        if (!arg0) {
            method222(false, false);
        }
        field496++;
        class41.field766 = arg1;
        if (!class41.field766) {
            int var2 = class158.field3626.method639(-107);
            int var3 = class158.field3626.method650(65536);
            int var4 = (class128.field2942 - class158.field3626.field1924) / 16;
            class36.field702 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class36.field702[var5][var14] = class158.field3626.method666(1183700424);
                }
            }
            int var6 = class158.field3626.method678(0);
            int var7 = class158.field3626.method650(65536);
            boolean var8 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var7 / 8 == 48) {
                var8 = true;
            }
            if (var3 / 8 == 48 && var7 / 8 == 148) {
                var8 = true;
            }
            int var9 = class158.field3626.method659(-61);
            class12.field203 = new byte[var4][];
            class65.field1446 = new int[var4];
            class79.field1753 = new int[var4];
            class110.field2488 = new byte[var4][];
            class18.field335 = new int[var4];
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class65.field1446[var10] = var13;
                        class79.field1753[var10] = class1.field1.method1036(class51.method395(new class128[] { class140.field3268, class111.method857(var11, (byte) 91), class124.field2804, class111.method857(var12, (byte) -22) }, !arg0), (byte) -103);
                        class18.field335[var10] = class1.field1.method1036(class51.method395(new class128[] { class106.field2423, class111.method857(var11, (byte) -5), class124.field2804, class111.method857(var12, (byte) -47) }, false), (byte) -103);
                        var10++;
                    }
                }
            }
            class54.method417(var3, var2, var6, var9, var7, -123);
            return;
        }
        int var15 = class158.field3626.method650(65536);
        int var16 = class158.field3626.method639(-116);
        int var17 = class158.field3626.method632((byte) -80);
        int var18 = class158.field3626.method678(0);
        int var19 = class158.field3626.method658(255);
        class158.field3626.method508(104);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class158.field3626.method512(1, (byte) -78);
                    if (var37 == 1) {
                        class103.field2353[var20][var35][var36] = class158.field3626.method512(26, (byte) -78);
                    } else {
                        class103.field2353[var20][var35][var36] = -1;
                    }
                }
            }
        }
        class158.field3626.method511(false);
        int var21 = (class128.field2942 - class158.field3626.field1924) / 16;
        class36.field702 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class36.field702[var22][var34] = class158.field3626.method645((byte) 120);
            }
        }
        class79.field1753 = new int[var21];
        class110.field2488 = new byte[var21][];
        class18.field335 = new int[var21];
        class12.field203 = new byte[var21][];
        class65.field1446 = new int[var21];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class103.field2353[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class65.field1446[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class65.field1446[var23] = var30;
                            class79.field1753[var23] = class1.field1.method1036(class51.method395(new class128[] { class140.field3268, class111.method857(var32, (byte) 119), class124.field2804, class111.method857(var33, (byte) 126) }, false), (byte) -103);
                            class18.field335[var23] = class1.field1.method1036(class51.method395(new class128[] { class106.field2423, class111.method857(var32, (byte) -34), class124.field2804, class111.method857(var33, (byte) 120) }, false), (byte) -103);
                            var23++;
                        }
                    }
                }
            }
        }
        class54.method417(var15, var18, var17, var19, var16, -114);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    public static final void method223(int arg0, int arg1) {
        field497++;
        int[] var2 = class156.field3581.field127;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class110.field2485[arg0][var21][var5] & 0x18) == 0) {
                    class154.field3553.method104(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class110.field2485[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class154.field3553.method104(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + arg1 << 8) + (int) (Math.random() * 20.0D) + 228;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class156.field3581.method60();
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class110.field2485[arg0][var19][var8] & 0x18) == 0) {
                    class43.method308(arg0, arg1 ^ 0xFFFFFEE7, var8, var6, var7, var19);
                }
                if (arg0 < 3 && (class110.field2485[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class43.method308(arg0 + 1, -509, var8, var6, var7, var19);
                }
            }
        }
        class34.field644 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class154.field3553.method143(class29.field553, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class147.method1185(-2, var12).field2210;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class104.field2359[class29.field553].field457;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class100.field2319[class34.field644] = class125.field2821[var13];
                        class34.field640[class34.field644] = var14;
                        class141.field3312[class34.field644] = var15;
                        class34.field644++;
                    }
                }
            }
        }
        class5.field51.method938(0);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)I")
    public static int method224(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BJ)V")
    public static final void method225(byte arg0, long arg1) {
        field507++;
        if (arg1 == 0L) {
            return;
        }
        if (class35.field675 >= 100 && class18.field337 != 1 || class35.field675 >= 200) {
            class126.method958(0, 1, class18.field323, class112.field2515);
            return;
        }
        class128 var3 = class129.method1018(arg1, 82).method987(48);
        for (int var4 = 0; var4 < class35.field675; var4++) {
            if (class54.field1106[var4] == arg1) {
                class126.method958(0, 1, class18.field323, class51.method395(new class128[] { var3, class20.field369 }, false));
                return;
            }
        }
        if (arg0 <= 40) {
            method218(-3);
        }
        for (int var5 = 0; var5 < class151.field3476; var5++) {
            if (class51.field1033[var5] == arg1) {
                class126.method958(0, 1, class18.field323, class51.method395(new class128[] { class123.field2790, var3, field506 }, false));
                return;
            }
        }
        if (var3.method991(-1, class151.field3473.field1050)) {
            class126.method958(0, 1, class18.field323, class41.field757);
            return;
        }
        class111.field2502[class35.field675] = var3;
        class54.field1106[class35.field675] = arg1;
        class12.field200[class35.field675] = 0;
        class117.field2652++;
        class11.field188[class35.field675] = 0;
        class75.field1648 = class135.field3186;
        class35.field675++;
        class152.field3502.method507(-96, 207);
        class152.field3502.method651(-1070186000, arg1);
    }
}
