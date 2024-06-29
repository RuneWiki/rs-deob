import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class192 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lgg;")
    public static class63 field3896 = class116.method911(43, "null");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lgg;")
    public static class63 field3894 = class116.method911(43, "me");

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lgg;")
    public static class63 field3898 = class116.method911(43, "Wordpack geladen)3");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lgg;")
    public static class63 field3901 = class116.method911(43, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Ll;")
    public static class99 field3900 = new class99();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1263(int arg0) {
        if (arg0 != 1) {
            field3898 = null;
        }
        field3901 = null;
        field3898 = null;
        field3900 = null;
        field3894 = null;
        field3896 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1264(int arg0) {
        field3897++;
        if (class17.field419 == 0) {
            class69.method634(4, 104, 104, class81.field1948);
            for (int var1 = 0; var1 < 4; var1++) {
                class157.field3267[var1] = new class79(104, 104);
            }
            class101.field2369 = new class200(512, 512);
            class17.field419 = 20;
            class116.field2592 = 5;
            class153.field3207 = class166.field3413;
        } else if (class17.field419 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class25.field571[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class173.method1156(var2, 500, 800, 512, 334, 25, 3500);
            class153.field3207 = class27.field614;
            class116.field2592 = 10;
            class17.field419 = 30;
        } else if (class17.field419 == 30) {
            class155.field3247 = class22.method228(false, true, 0, -13677, true);
            class188.field3797 = class22.method228(false, true, 1, -13677, true);
            class177.field3636 = class22.method228(true, true, 2, -13677, false);
            class176.field3622 = class22.method228(false, true, 3, -13677, true);
            class108.field2446 = class22.method228(false, true, 4, -13677, true);
            class47.field1142 = class22.method228(true, true, 5, -13677, true);
            class10.field225 = class22.method228(true, false, 6, -13677, true);
            class18.field433 = class22.method228(false, true, 7, -13677, true);
            class110.field2479 = class22.method228(false, true, 8, -13677, true);
            class17.field401 = class22.method228(true, true, 9, -13677, false);
            class29.field681 = class22.method228(false, true, 10, -13677, true);
            class134.field2906 = class22.method228(false, true, 11, -13677, true);
            class111.field2503 = class22.method228(false, true, 12, -13677, true);
            class167.field3450 = class22.method228(true, true, 13, -13677, false);
            class144.field3082 = class22.method228(false, false, 14, -13677, true);
            class81.field1960 = class22.method228(false, true, 15, -13677, true);
            class17.field419 = 40;
            class116.field2592 = 20;
            class153.field3207 = class196.field3927;
        } else if (class17.field419 == 40) {
            byte var7 = 0;
            int var8 = var7 + class155.field3247.method886(false) * 4 / 100;
            int var9 = var8 + class188.field3797.method886(false) * 4 / 100;
            int var10 = var9 + class177.field3636.method886(false) * 2 / 100;
            int var11 = var10 + class176.field3622.method886(false) * 2 / 100;
            int var12 = var11 + class108.field2446.method886(false) * 6 / 100;
            int var13 = var12 + class47.field1142.method886(false) * 4 / 100;
            int var14 = var13 + class10.field225.method886(false) * 2 / 100;
            int var15 = var14 + class18.field433.method886(false) * 60 / 100;
            int var16 = var15 + class110.field2479.method886(false) * 2 / 100;
            int var17 = var16 + class17.field401.method886(false) * 2 / 100;
            int var18 = var17 + class29.field681.method886(false) * 2 / 100;
            int var19 = var18 + class134.field2906.method886(false) * 2 / 100;
            int var20 = var19 + class111.field2503.method886(false) * 2 / 100;
            int var21 = var20 + class167.field3450.method886(false) * 2 / 100;
            int var22 = var21 + class144.field3082.method886(false) * 2 / 100;
            int var23 = var22 + class81.field1960.method886(false) * 2 / 100;
            if (var23 == 100) {
                class153.field3207 = class139.field2978;
                class116.field2592 = 30;
                class17.field419 = 45;
            } else {
                if (var23 != 0) {
                    class153.field3207 = class89.method772((byte) 54, new class63[] { class14.field329, class175.method1162((byte) -126, var23), class134.field2905 });
                }
                class116.field2592 = 30;
            }
        } else if (class17.field419 == 45) {
            class9.method121(22050, 2, -95, !class198.field3964);
            class42 var24 = new class42();
            var24.method388((byte) -93, 128, 9);
            class183.field3711 = class24.method234(116, 22050, class79.field1924, 0, class49.field1193);
            class183.field3711.method504((byte) 95, var24);
            class203.method1347(0, class81.field1960, class108.field2446, class144.field3082, var24);
            class132.field2868 = class24.method234(121, 2048, class79.field1924, 1, class49.field1193);
            class124.field2737 = new class107();
            class132.field2868.method504((byte) 125, class124.field2737);
            class199.field3974 = new class141(22050, class124.field2762);
            class116.field2592 = 35;
            class153.field3207 = class90.field2113;
            class17.field419 = 50;
        } else if (class17.field419 == 50) {
            int var25 = 0;
            if (class183.field3712 == null) {
                class183.field3712 = class199.method1299(class151.field3175, class167.field3450, (byte) -83, class110.field2479, class132.field2876);
            } else {
                var25++;
            }
            if (class177.field3628 == null) {
                class177.field3628 = class183.field3712;
            } else {
                var25++;
            }
            if (class62.field1560 == null) {
                class62.field1560 = class199.method1299(class151.field3175, class167.field3450, (byte) -83, class110.field2479, class77.field1877);
            } else {
                var25++;
            }
            if (class29.field675 == null) {
                class29.field675 = class199.method1299(class151.field3175, class167.field3450, (byte) -83, class110.field2479, class17.field414);
            } else {
                var25++;
            }
            if (var25 < 4) {
                class153.field3207 = class89.method772((byte) 45, new class63[] { class55.field1455, class175.method1162((byte) -126, var25 * 100 / 4), class134.field2905 });
                class116.field2592 = 40;
            } else {
                class153.field3207 = class5.field148;
                class17.field419 = 60;
                class116.field2592 = 40;
            }
        } else if (class17.field419 == 60) {
            int var26 = class189.method1240(class110.field2479, class29.field681, -4);
            int var27 = class135.method984((byte) -101);
            if (var26 < var27) {
                class153.field3207 = class89.method772((byte) 94, new class63[] { class94.field2264, class175.method1162((byte) -126, var26 * 100 / var27), class134.field2905 });
                class116.field2592 = 50;
            } else {
                class116.field2592 = 50;
                class153.field3207 = class33.field804;
                class121.method931(5, 1);
                class17.field419 = 70;
            }
        } else if (class17.field419 != 70) {
            int var28 = 36 % ((70 - arg0) / 47);
            if (class17.field419 == 80) {
                int var29 = 0;
                if (class143.field3077 == null) {
                    class143.field3077 = class65.method614(class110.field2479, class71.field1780, class151.field3175, (byte) -125);
                } else {
                    var29++;
                }
                if (class56.field1476 == null) {
                    class56.field1476 = class65.method614(class110.field2479, class3.field77, class151.field3175, (byte) 44);
                } else {
                    var29++;
                }
                if (class111.field2502 == null) {
                    class111.field2502 = class37.method348(class110.field2479, 95, class151.field3175, class21.field501);
                } else {
                    var29++;
                }
                if (class8.field181 == null) {
                    class8.field181 = class57.method550(class88.field2075, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class124.field2749 == null) {
                    class124.field2749 = class57.method550(class81.field1951, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class3.field111 == null) {
                    class3.field111 = class57.method550(class106.field2417, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class39.field930 == null) {
                    class39.field930 = class57.method550(class19.field462, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class111.field2506 == null) {
                    class111.field2506 = class57.method550(class191.field3883, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class168.field3481 == null) {
                    class168.field3481 = class57.method550(class24.field551, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class47.field1161 == null) {
                    class47.field1161 = class57.method550(class127.field2797, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class138.field2969 == null) {
                    class138.field2969 = class57.method550(class113.field2543, class151.field3175, class110.field2479, 662);
                } else {
                    var29++;
                }
                if (class193.field3907 == null) {
                    class193.field3907 = class37.method348(class110.field2479, 120, class151.field3175, class170.field3492);
                } else {
                    var29++;
                }
                if (class85.field2025 == null) {
                    class85.field2025 = class37.method348(class110.field2479, 116, class151.field3175, class69.field1724);
                } else {
                    var29++;
                }
                if (var29 < 13) {
                    class153.field3207 = class89.method772((byte) 58, new class63[] { class96.field2273, class175.method1162((byte) -126, var29 * 100 / 13), class134.field2905 });
                    class116.field2592 = 70;
                } else {
                    class70.field1741 = class85.field2025;
                    class56.field1476.method1326();
                    class143.field3077.method1326();
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    int var33 = (int) (Math.random() * 21.0D) - 10;
                    for (int var34 = 0; var34 < class8.field181.length; var34++) {
                        class8.field181[var34].method1304(var30 + var32, var31 + var32, var32 + var33);
                    }
                    class111.field2502[0].method1084(var30 + var32, var31 - -var32, var32 + var33);
                    class17.field419 = 90;
                    class153.field3207 = class37.field866;
                    class116.field2592 = 70;
                }
            } else if (class17.field419 == 90) {
                if (class17.field401.method756(95)) {
                    class190 var35 = new class190(class17.field401, class110.field2479, 20, class198.field3964 ? 64 : 128);
                    class25.method255(var35);
                    class25.method242(0.7F);
                    class153.field3207 = class189.field3817;
                    class17.field419 = 110;
                    class116.field2592 = 90;
                } else {
                    class153.field3207 = class89.method772((byte) 39, new class63[] { class30.field762, class175.method1162((byte) -126, class17.field401.method888((byte) 116)), class134.field2905 });
                    class116.field2592 = 90;
                }
            } else if (class17.field419 == 110) {
                class114.field2548 = new class188();
                class79.field1924.method1045(class114.field2548, (byte) 125, 10);
                class17.field419 = 120;
                class153.field3207 = class74.field1820;
                class116.field2592 = 94;
            } else if (class17.field419 == 120) {
                if (class29.field681.method761(false, class151.field3175, class199.field3987)) {
                    class136 var36 = new class136(class29.field681.method743(class151.field3175, 0, class199.field3987));
                    class139.method1005(56, var36);
                    class153.field3207 = class118.field2634;
                    class116.field2592 = 96;
                    class17.field419 = 130;
                } else {
                    class153.field3207 = class89.method772((byte) 28, new class63[] { class1.field1, class26.field603 });
                    class116.field2592 = 96;
                }
            } else if (class17.field419 == 130) {
                if (!class176.field3622.method756(72)) {
                    class153.field3207 = class89.method772((byte) 111, new class63[] { class138.field2960, class175.method1162((byte) -126, class176.field3622.method888((byte) 116) * 4 / 5), class134.field2905 });
                    class116.field2592 = 100;
                } else if (!class111.field2503.method756(58)) {
                    class153.field3207 = class89.method772((byte) 70, new class63[] { class138.field2960, class175.method1162((byte) -126, class111.field2503.method888((byte) 116) / 6 + 80), class134.field2905 });
                    class116.field2592 = 100;
                } else if (class167.field3450.method756(109)) {
                    class153.field3207 = class22.field518;
                    class17.field419 = 140;
                    class116.field2592 = 100;
                } else {
                    class153.field3207 = class89.method772((byte) 79, new class63[] { class138.field2960, class175.method1162((byte) -126, class167.field3450.method888((byte) 116) / 20 + 96), class134.field2905 });
                    class116.field2592 = 100;
                }
            } else if (class17.field419 == 140) {
                class121.method931(10, 1);
            }
        } else if (class177.field3636.method756(54)) {
            class50.method486((byte) -24, class177.field3636);
            class189.method1246(74, class177.field3636);
            class127.method952((byte) -92, class18.field433, class177.field3636);
            class202.method1338(class18.field433, class177.field3636, class198.field3964, (byte) -46);
            class9.method125(class177.field3636, true, class18.field433);
            class24.method235(class18.field433, 2000, class51.field1259, class177.field3628, class177.field3636);
            class188.method1236(class155.field3247, class177.field3636, class188.field3797, 56);
            class129.method957(class177.field3636, class18.field433, 32526);
            class23.method229(class177.field3636, (byte) -83);
            class164.method1114(class177.field3636, 100);
            class60.method557(class110.field2479, class18.field433, (byte) -125, class167.field3450, class176.field3622);
            class68.method630(class177.field3636, 0);
            class46.method460(0, class177.field3636);
            class153.field3207 = class171.field3552;
            class116.field2592 = 60;
            class195.method1274((byte) 93);
            class17.field419 = 80;
        } else {
            class153.field3207 = class89.method772((byte) 56, new class63[] { class22.field527, class175.method1162((byte) -126, class177.field3636.method888((byte) 116)), class134.field2905 });
            class116.field2592 = 60;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static final void method1265(byte arg0) {
        int var1 = 73 % ((arg0 - 57) / 43);
        field3899++;
        try {
            if (class42.field971 == 1) {
                int var2 = class182.field3698.method406((byte) 107);
                if (var2 > 0 && class182.field3698.method399(28977)) {
                    int var3 = var2 - class117.field2618;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class182.field3698.method389(var3, 2);
                } else {
                    class182.field3698.method386(false);
                    class182.field3698.method374((byte) 120);
                    class22.field516 = null;
                    class108.field2433 = null;
                    if (class49.field1187 == null) {
                        class42.field971 = 0;
                    } else {
                        class42.field971 = 2;
                    }
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class182.field3698.method386(false);
            class22.field516 = null;
            class42.field971 = 0;
            class108.field2433 = null;
            class49.field1187 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public static final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class184.field3729 == 0 && !class181.field3680) {
            class78.method698((short) 19, arg3 - arg4, class150.field3165, -26415, arg1 - arg0, 0L, class151.field3175);
            class147.field3098++;
        }
        field3895++;
        long var5 = -1L;
        if (arg2 != 104) {
            field3894 = null;
        }
        for (int var7 = 0; var7 < class36.field847; var7++) {
            long var8 = class36.field838[var7];
            int var10 = (int) var8 >> 29 & 0x3;
            int var11 = (int) var8 & 0x7F;
            int var12 = (int) var8 >> 7 & 0x7F;
            int var13 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            if (var5 != var8) {
                var5 = var8;
                if (var10 == 2 && class131.method966(class112.field2528, var11, var12, var8)) {
                    class37 var14 = class167.method1133(true, var13);
                    if (var14.field897 != null) {
                        var14 = var14.method357(-18207);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class184.field3729 == 1) {
                        class78.method698((short) 5, var12, class28.field669, -26415, var11, var8, class89.method772((byte) 91, new class63[] { class62.field1554, class195.field3920, var14.field885 }));
                        client.field709++;
                    } else if (!class181.field3680) {
                        class63[] var15 = var14.field857;
                        if (class131.field2849) {
                            var15 = class116.method913(var15, arg2 ^ 0x325C);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 2;
                                    }
                                    if (var16 == 1) {
                                        var17 = 4;
                                    }
                                    class41.field959++;
                                    if (var16 == 2) {
                                        var17 = 32;
                                    }
                                    if (var16 == 3) {
                                        var17 = 24;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1007;
                                    }
                                    class78.method698(var17, var12, var15[var16], arg2 - 26519, var11, var8, class89.method772((byte) 98, new class63[] { class60.field1534, var14.field885 }));
                                }
                            }
                        }
                        class78.method698((short) 1006, var12, class88.field2065, -26415, var11, (long) var14.field911, class89.method772((byte) 101, new class63[] { class60.field1534, var14.field885 }));
                        class170.field3495++;
                    } else if ((class167.field3452 & 0x4) == 4) {
                        class78.method698((short) 36, var12, class106.field2420, -26415, var11, var8, class89.method772((byte) 83, new class63[] { class24.field547, class195.field3920, var14.field885 }));
                        class45.field1068++;
                    }
                }
                if (var10 == 1) {
                    class6 var18 = class55.field1458[var13];
                    if (var18.field150.field647 == 1 && (var18.field1141 & 0x7F) == 64 && (var18.field1144 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class29.field695; var19++) {
                            class6 var22 = class55.field1458[class142.field3045[var19]];
                            if (var22 != null && var18 != var22 && var22.field150.field647 == 1 && var18.field1141 == var22.field1141 && var18.field1144 == var22.field1144) {
                                class18.method190(var12, class142.field3045[var19], var11, var22.field150, false);
                            }
                        }
                        for (int var20 = 0; var20 < class34.field813; var20++) {
                            class62 var21 = class33.field806[class177.field3641[var20]];
                            if (var21 != null && var18.field1141 == var21.field1141 && var18.field1144 == var21.field1144) {
                                class195.method1275((byte) -52, var11, var21, class177.field3641[var20], var12);
                            }
                        }
                    }
                    class18.method190(var12, var13, var11, var18.field150, false);
                }
                if (var10 == 0) {
                    class62 var23 = class33.field806[var13];
                    if ((var23.field1141 & 0x7F) == 64 && (var23.field1144 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class29.field695; var24++) {
                            class6 var27 = class55.field1458[class142.field3045[var24]];
                            if (var27 != null && var27.field150.field647 == 1 && var23.field1141 == var27.field1141 && var23.field1144 == var27.field1144) {
                                class18.method190(var12, class142.field3045[var24], var11, var27.field150, false);
                            }
                        }
                        for (int var25 = 0; var25 < class34.field813; var25++) {
                            class62 var26 = class33.field806[class177.field3641[var25]];
                            if (var26 != null && var23 != var26 && var23.field1141 == var26.field1141 && var23.field1144 == var26.field1144) {
                                class195.method1275((byte) -52, var11, var26, class177.field3641[var25], var12);
                            }
                        }
                    }
                    class195.method1275((byte) -68, var11, var23, var13, var12);
                }
                if (var10 == 3) {
                    class148 var28 = class163.field3365[class112.field2528][var11][var12];
                    if (var28 != null) {
                        for (class113 var29 = (class113) var28.method1040(-116); var29 != null; var29 = (class113) var28.method1030(40)) {
                            class93 var30 = class59.method554(var29.field2544, 13319);
                            if (class184.field3729 == 1) {
                                class78.method698((short) 3, var12, class28.field669, -26415, var11, (long) var29.field2544, class89.method772((byte) 36, new class63[] { class62.field1554, class30.field744, var30.field2202 }));
                                class32.field775++;
                            } else if (!class181.field3680) {
                                class177.field3625++;
                                class63[] var31 = var30.field2222;
                                if (class131.field2849) {
                                    var31 = class116.method913(var31, 12852);
                                }
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        class104.field2394++;
                                        byte var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 34;
                                        }
                                        if (var32 == 1) {
                                            var33 = 45;
                                        }
                                        if (var32 == 2) {
                                            var33 = 57;
                                        }
                                        if (var32 == 3) {
                                            var33 = 15;
                                        }
                                        if (var32 == 4) {
                                            var33 = 50;
                                        }
                                        class78.method698(var33, var12, var31[var32], -26415, var11, (long) var29.field2544, class89.method772((byte) 68, new class63[] { class103.field2379, var30.field2202 }));
                                    } else if (var32 == 2) {
                                        class78.method698((short) 57, var12, class104.field2403, arg2 - 26519, var11, (long) var29.field2544, class89.method772((byte) 34, new class63[] { class103.field2379, var30.field2202 }));
                                        class5.field139++;
                                    }
                                }
                                class78.method698((short) 1005, var12, class88.field2065, -26415, var11, (long) var29.field2544, class89.method772((byte) 67, new class63[] { class103.field2379, var30.field2202 }));
                            } else if ((class167.field3452 & 0x1) == 1) {
                                class150.field3153++;
                                class78.method698((short) 51, var12, class106.field2420, arg2 ^ 0xFFFF98B9, var11, (long) var29.field2544, class89.method772((byte) 127, new class63[] { class24.field547, class30.field744, var30.field2202 }));
                            }
                        }
                    }
                }
            }
        }
    }
}
