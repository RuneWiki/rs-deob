import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class118 {

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    private int field502 = 0;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "Z")
    public static volatile boolean field498 = true;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field508 = 3353893;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "Lfc;")
    public static class39 field510 = class90.method774("<col=ffff00>*V", -102);

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lfc;")
    public static class39 field509 = class90.method774("ams", -125);

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Lfc;")
    public static class39 field501 = class90.method774("hitmarks", -111);

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field513 = new CRC32();

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILdc;I)V", line = 8)
    private final void method213(int arg0, int arg1, class25 arg2, int arg3) {
        if (~arg0 == arg1) {
            this.field502 = arg2.method310(true);
        }
        field512++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZI)Lfc;", line = 26)
    public static final class39 method214(int arg0, boolean arg1, int arg2) {
        if (arg2 == -19178) {
            field507++;
            return class101.method874(arg0, 10, arg1, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ldc;II)V", line = 37)
    public final void method215(class25 arg0, int arg1, int arg2) {
        field506++;
        if (arg2 != -3288) {
            this.field517 = -3;
        }
        while (true) {
            int var4 = arg0.method322((byte) -50);
            if (var4 == 0) {
                return;
            }
            this.method213(var4, -2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 58)
    public static final void method216(int arg0) {
        field505++;
        if (class43.field1172 == 180) {
            int var1 = class39.field1065.method322((byte) -50);
            int var2 = (var1 & 0x7) + class110.field2817;
            int var3 = (var1 >> 4 & 0x7) + class145.field3616;
            int var4 = class39.field1065.method293(arg0 ^ 0xFFFFFF88) + var3;
            int var5 = var2 + class39.field1065.method293(arg0 - 135);
            int var6 = class39.field1065.method318(-6);
            int var7 = class39.field1065.method301(-4853);
            int var8 = class39.field1065.method322((byte) -50) * 4;
            int var9 = class39.field1065.method322((byte) -50) * 4;
            int var10 = class39.field1065.method301(-4853);
            int var11 = class39.field1065.method301(arg0 - 4860);
            int var12 = class39.field1065.method322((byte) -50);
            int var13 = class39.field1065.method322((byte) -50);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var4 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var2 * 128 + 64;
                class128 var17 = new class128(var7, class24.field661, var15, var16, class153.method1225(128, var16, class24.field661, var15) - var8, class70.field1654 + var10, class70.field1654 + var11, var12, var13, var6, var9);
                int var18 = var5 * 128 + 64;
                var17.method1060(var18, class153.method1225(128, var18, class24.field661, var14) - var9, var14, class70.field1654 + var10, (byte) 104);
                class140.field3529.method19(var17, 7);
            }
        } else if (class43.field1172 == 113) {
            int var19 = class39.field1065.method327((byte) 67);
            int var20 = class39.field1065.method320(false);
            int var21 = class39.field1065.method321((byte) 121);
            int var22 = class110.field2817 + (var21 & 0x7);
            int var23 = (var21 >> 4 & 0x7) + class145.field3616;
            if (var23 >= 0 && var22 >= 0 && var23 < 104 && var22 < 104) {
                class75 var24 = new class75();
                var24.field1731 = var20;
                var24.field1724 = var19;
                if (class7.field208[class24.field661][var23][var22] == null) {
                    class7.field208[class24.field661][var23][var22] = new class2();
                }
                class7.field208[class24.field661][var23][var22].method19(var24, 7);
                class9.method134(var22, var23, arg0 ^ 0xFFFFFFE9);
            }
        } else if (class43.field1172 == 223) {
            int var25 = class39.field1065.method322((byte) -50);
            int var26 = (var25 & 0x7) + class110.field2817;
            int var27 = (var25 >> 4 & 0x7) + class145.field3616;
            int var28 = class39.field1065.method301(-4853);
            int var29 = class39.field1065.method301(-4853);
            int var30 = class39.field1065.method301(-4853);
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
                class2 var31 = class7.field208[class24.field661][var27][var26];
                if (var31 != null) {
                    for (class75 var32 = (class75) var31.method8(-1); var32 != null; var32 = (class75) var31.method9(1)) {
                        if ((var28 & 0x7FFF) == var32.field1731 && var32.field1724 == var29) {
                            var32.field1724 = var30;
                            break;
                        }
                    }
                    class9.method134(var26, var27, -56);
                }
            }
        } else if (class43.field1172 == 243) {
            int var33 = class39.field1065.method280(1630016912);
            int var34 = class145.field3616 + (var33 >> 4 & 0x7);
            int var35 = (var33 & 0x7) + class110.field2817;
            int var36 = class39.field1065.method301(arg0 ^ 0xFFFFED0C);
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                class2 var37 = class7.field208[class24.field661][var34][var35];
                if (var37 != null) {
                    for (class75 var38 = (class75) var37.method8(-1); var38 != null; var38 = (class75) var37.method9(arg0 - 6)) {
                        if ((var36 & 0x7FFF) == var38.field1731) {
                            var38.method1170(30);
                            break;
                        }
                    }
                    if (var37.method8(arg0 - 8) == null) {
                        class7.field208[class24.field661][var34][var35] = null;
                    }
                    class9.method134(var35, var34, -45);
                }
            }
        } else {
            if (class43.field1172 == 20) {
                int var39 = class39.field1065.method327((byte) 67);
                byte var40 = class39.field1065.method293(-114);
                int var41 = class39.field1065.method327((byte) 67);
                byte var42 = class39.field1065.method293(-123);
                byte var43 = class39.field1065.method284((byte) 28);
                int var44 = class39.field1065.method298(-15432);
                int var45 = class145.field3616 + (var44 >> 4 & 0x7);
                int var46 = (var44 & 0x7) + class110.field2817;
                int var47 = class39.field1065.method301(-4853);
                int var48 = class39.field1065.method292(-128);
                byte var49 = class39.field1065.method289((byte) 85);
                int var50 = class39.field1065.method298(-15432);
                int var51 = var50 & 0x3;
                class142 var52;
                if (class53.field1323 == var41) {
                    var52 = class94.field2197;
                } else {
                    var52 = class101.field2525[var41];
                }
                int var53 = var50 >> 2;
                int var54 = class74.field1710[var53];
                if (var52 != null) {
                    class35 var55 = class90.method776(var48, -119);
                    int var56 = class7.field219[class24.field661][var45 + 1][var46];
                    int var57 = class7.field219[class24.field661][var45 + 1][var46 + 1];
                    int var58 = class7.field219[class24.field661][var45][var46];
                    int var59 = class7.field219[class24.field661][var45][var46 + 1];
                    class23 var60 = var55.method405(var59, var53, var58, var51, var56, arg0 - 98, var57);
                    if (var60 != null) {
                        class53.method561(var46, 0, var39 + 1, var54, class24.field661, var45, -1, 125, 0, var47 + 1);
                        var52.field3584 = var60;
                        var52.field3579 = class70.field1654 + var39;
                        var52.field3565 = class70.field1654 + var47;
                        int var61 = var55.field912;
                        int var62 = var55.field930;
                        if (var51 == 1 || var51 == 3) {
                            var61 = var55.field930;
                            var62 = var55.field912;
                        }
                        var52.field3585 = var45 * 128 + var61 * 64;
                        var52.field3586 = var46 * 128 + var62 * 64;
                        if (var42 < var43) {
                            byte var63 = var43;
                            var43 = var42;
                            var42 = var63;
                        }
                        var52.field3573 = class153.method1225(arg0 ^ 0x87, var52.field3586, class24.field661, var52.field3585);
                        if (var49 > var40) {
                            byte var64 = var49;
                            var49 = var40;
                            var40 = var64;
                        }
                        var52.field3561 = var40 + var46;
                        var52.field3571 = var46 + var49;
                        var52.field3551 = var42 + var45;
                        var52.field3556 = var45 + var43;
                    }
                }
            }
            if (class43.field1172 == 122) {
                int var65 = class39.field1065.method322((byte) -50);
                int var66 = class110.field2817 + (var65 & 0x7);
                int var67 = (var65 >> 4 & 0x7) + class145.field3616;
                int var68 = class39.field1065.method301(-4853);
                int var69 = class39.field1065.method322((byte) -50);
                int var70 = class39.field1065.method301(-4853);
                if (var67 >= 0 && var66 >= 0 && var67 < 104 && var66 < 104) {
                    int var71 = var66 * 128 + 64;
                    int var72 = var67 * 128 + 64;
                    class14 var73 = new class14(var68, class24.field661, var72, var71, class153.method1225(128, var71, class24.field661, var72) - var69, var70, class70.field1654);
                    class115.field3022.method19(var73, 7);
                }
            } else if (class43.field1172 == 27) {
                int var74 = class39.field1065.method301(-4853);
                int var75 = class39.field1065.method280(1630016912);
                int var76 = var75 >> 2;
                int var77 = class74.field1710[var76];
                int var78 = var75 & 0x3;
                int var79 = class39.field1065.method280(1630016912);
                int var80 = (var79 & 0x7) + class110.field2817;
                int var81 = (var79 >> 4 & 0x7) + class145.field3616;
                if (var81 >= 0 && var80 >= 0 && var81 < 103 && var80 < 103) {
                    int var82 = class7.field219[class24.field661][var81][var80];
                    int var83 = class7.field219[class24.field661][var81 + 1][var80 + 1];
                    int var84 = class7.field219[class24.field661][var81 + 1][var80];
                    int var85 = class7.field219[class24.field661][var81][var80 + 1];
                    if (var77 == 0) {
                        class86 var86 = class139.field3503.method38(class24.field661, var81, var80);
                        if (var86 != null) {
                            int var87 = var86.field1954 >> 14 & 0x7FFF;
                            if (var76 == 2) {
                                var86.field1952 = new class112(var87, 2, var78 + 4, var82, var84, var83, var85, var74, false, var86.field1952);
                                var86.field1933 = new class112(var87, 2, var78 + 1 & 0x3, var82, var84, var83, var85, var74, false, var86.field1933);
                            } else {
                                var86.field1952 = new class112(var87, var76, var78, var82, var84, var83, var85, var74, false, var86.field1952);
                            }
                        }
                    }
                    if (var77 == 1) {
                        class12 var88 = class139.field3503.method77(class24.field661, var81, var80);
                        if (var88 != null) {
                            var88.field311 = new class112(var88.field309 >> 14 & 0x7FFF, 4, 0, var82, var84, var83, var85, var74, false, var88.field311);
                        }
                    }
                    if (var77 == 2) {
                        if (var76 == 11) {
                            var76 = 10;
                        }
                        class62 var89 = class139.field3503.method64(class24.field661, var81, var80);
                        if (var89 != null) {
                            var89.field1514 = new class112(var89.field1523 >> 14 & 0x7FFF, var76, var78, var82, var84, var83, var85, var74, false, var89.field1514);
                        }
                    }
                    if (var77 == 3) {
                        class54 var90 = class139.field3503.method79(class24.field661, var81, var80);
                        if (var90 != null) {
                            var90.field1365 = new class112(var90.field1346 >> 14 & 0x7FFF, 22, var78, var82, var84, var83, var85, var74, false, var90.field1365);
                        }
                    }
                }
            } else if (class43.field1172 == 202) {
                int var91 = class39.field1065.method322((byte) -50);
                int var92 = (var91 >> 4 & 0x7) + class145.field3616;
                int var93 = (var91 & 0x7) + class110.field2817;
                int var94 = class39.field1065.method292(arg0 ^ 0xFFFFFF87);
                int var95 = class39.field1065.method292(-128);
                int var96 = class39.field1065.method301(-4853);
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && class53.field1323 != var95) {
                    class75 var97 = new class75();
                    var97.field1731 = var94;
                    var97.field1724 = var96;
                    if (class7.field208[class24.field661][var92][var93] == null) {
                        class7.field208[class24.field661][var92][var93] = new class2();
                    }
                    class7.field208[class24.field661][var92][var93].method19(var97, 7);
                    class9.method134(var93, var92, -64);
                }
            } else if (class43.field1172 == 124) {
                int var98 = class39.field1065.method292(-128);
                int var99 = class39.field1065.method321((byte) 71);
                int var100 = (var99 >> 4 & 0x7) + class145.field3616;
                int var101 = class110.field2817 + (var99 & 0x7);
                int var102 = class39.field1065.method280(arg0 + 1630016905);
                int var103 = var102 >> 2;
                int var104 = class74.field1710[var103];
                int var105 = var102 & 0x3;
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class53.method561(var101, var105, 0, var104, class24.field661, var100, var98, 85, var103, -1);
                }
            } else if (class43.field1172 == 22) {
                int var106 = class39.field1065.method321((byte) 56);
                int var107 = (var106 & 0x7) + class110.field2817;
                int var108 = (var106 >> 4 & 0x7) + class145.field3616;
                int var109 = class39.field1065.method280(1630016912);
                int var110 = var109 & 0x3;
                int var111 = var109 >> 2;
                int var112 = class74.field1710[var111];
                if (var108 >= 0 && var107 >= 0 && var108 < 104 && var107 < 104) {
                    class53.method561(var107, var110, 0, var112, class24.field661, var108, -1, 108, var111, -1);
                }
            } else {
                if (class43.field1172 == 255) {
                    int var113 = class39.field1065.method322((byte) -50);
                    int var114 = (var113 >> 4 & 0x7) + class145.field3616;
                    int var115 = (var113 & 0x7) + class110.field2817;
                    int var116 = class39.field1065.method301(-4853);
                    int var117 = class39.field1065.method322((byte) -50);
                    int var118 = var117 & 0x7;
                    int var119 = var117 >> 4 & 0xF;
                    int var120 = class39.field1065.method322((byte) -50);
                    if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                        int var121 = var119 + 1;
                        if (class94.field2197.field2913[0] >= var114 - var121 && var114 + var121 >= class94.field2197.field2913[0] && var115 - var121 <= class94.field2197.field2926[0] && var115 + var121 >= class94.field2197.field2926[0] && class24.field669 != 0 && var118 > 0 && class145.field3615 < 50) {
                            class90.field2136[class145.field3615] = var116;
                            class145.field3629[class145.field3615] = var118;
                            class1.field11[class145.field3615] = var120;
                            class25.field735[class145.field3615] = null;
                            class50.field1264[class145.field3615] = (var114 << 16) + (var115 << 8) + var119;
                            class145.field3615++;
                        }
                    }
                }
                if (arg0 != 7) {
                    field509 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Loc;ZIIIII)V", line = 597)
    public static final void method217(class100 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class61.field1497 = arg0;
        class150.field3711 = arg2;
        class142.field3562 = arg3;
        class1.field2 = arg5;
        class139.field3513 = arg1;
        class75.field1723 = arg6;
        if (arg4 != -256) {
            field514 = 78;
        }
        class101.field2547 = 1;
        field516++;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 618)
    public static void method218(int arg0) {
        field513 = null;
        field509 = null;
        field501 = null;
        field510 = null;
        if (arg0 != -1714709436) {
            field508 = 40;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V", line = 642)
    private final void method219(boolean arg0, int arg1) {
        field515++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        if (var7 > var3) {
            var11 = var7;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field500 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (-var9 + var11) + 4.0D;
            }
        }
        if (var17 > 0.5D) {
            this.field499 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field499 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field499 < 1) {
            this.field499 = 1;
        }
        double var19 = var13 / 6.0D;
        if (this.field500 < 0) {
            this.field500 = 0;
        } else if (this.field500 > 255) {
            this.field500 = 255;
        }
        this.field511 = (int) (var15 * 256.0D);
        if (this.field511 < 0) {
            this.field511 = 0;
        } else if (this.field511 > 255) {
            this.field511 = 255;
        }
        if (arg0) {
            method220((byte) 4);
        }
        this.field517 = (int) ((double) this.field499 * var19);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V", line = 738)
    public static final void method220(byte arg0) {
        field503++;
        int var1 = class88.field2059 * 128 + 64;
        int var2 = class55.field1372 * 128 + 64;
        int var3 = class153.method1225(128, var1, class24.field661, var2) - class29.field832;
        if (class78.field1778 < var1) {
            class78.field1778 += (var1 - class78.field1778) * class6.field203 / 1000 + class86.field1923;
            if (class78.field1778 > var1) {
                class78.field1778 = var1;
            }
        }
        if (var2 > class87.field2022) {
            class87.field2022 += class86.field1923 + (var2 - class87.field2022) * class6.field203 / 1000;
            if (class87.field2022 > var2) {
                class87.field2022 = var2;
            }
        }
        if (var1 < class78.field1778) {
            class78.field1778 -= class86.field1923 + (class78.field1778 - var1) * class6.field203 / 1000;
            if (class78.field1778 < var1) {
                class78.field1778 = var1;
            }
        }
        if (var3 > class104.field2631) {
            class104.field2631 += (var3 - class104.field2631) * class6.field203 / 1000 + class86.field1923;
            if (var3 < class104.field2631) {
                class104.field2631 = var3;
            }
        }
        if (var2 < class87.field2022) {
            class87.field2022 -= class86.field1923 + (class87.field2022 - var2) * class6.field203 / 1000;
            if (class87.field2022 < var2) {
                class87.field2022 = var2;
            }
        }
        if (class104.field2631 > var3) {
            class104.field2631 -= class86.field1923 + (class104.field2631 - var3) * class6.field203 / 1000;
            if (var3 > class104.field2631) {
                class104.field2631 = var3;
            }
        }
        int var4 = class42.field1146 * 128 + 64;
        int var5 = class116.field3045 * 128 + 64;
        int var6 = class153.method1225(128, var4, class24.field661, var5) - class121.field3170;
        int var7 = var4 - class78.field1778;
        int var8 = var6 - class104.field2631;
        int var9 = var5 - class87.field2022;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var7) * -325.949D) & 0x7FF;
        if (var11 > class39.field1104) {
            class39.field1104 += (var11 - class39.field1104) * class75.field1726 / 1000 + class55.field1373;
            if (class39.field1104 > var11) {
                class39.field1104 = var11;
            }
        }
        int var13 = var12 - class121.field3160;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class121.field3160 += class75.field1726 * var13 / 1000 + class55.field1373;
            class121.field3160 &= 0x7FF;
        }
        if (var13 < 0) {
            class121.field3160 -= -var13 * class75.field1726 / 1000 + class55.field1373;
            class121.field3160 &= 0x7FF;
        }
        if (var11 < class39.field1104) {
            class39.field1104 -= class55.field1373 + (class39.field1104 - var11) * class75.field1726 / 1000;
            if (class39.field1104 < var11) {
                class39.field1104 = var11;
            }
        }
        int var14 = var12 - class121.field3160;
        if (arg0 != 110) {
            method214(-44, false, -110);
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class121.field3160 = var12;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 881)
    public static final int method221(int arg0, int arg1) {
        field496++;
        if (arg0 <= 66) {
            return -88;
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V", line = 933)
    public final void method222(int arg0) {
        field504++;
        this.method219(false, this.field502);
        int var2 = -75 / ((arg0 - 37) / 52);
    }
}
