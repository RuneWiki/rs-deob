import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lu;")
    public static class135 field2203 = class87.method676((byte) -128, "System)2Update in: ");

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lu;")
    public static class135 field2205 = class87.method676((byte) -77, " )2> @cya@");

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[Lpf;")
    public static class110[] field2208 = new class110[4];

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field2202 = new int[500];

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lu;")
    public static class135 field2210 = class87.method676((byte) -66, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lu;")
    public static class135 field2213 = class87.method676((byte) -45, " @whi@(X");

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Lu;")
    public static class135 field2217 = class87.method676((byte) -48, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lcc;")
    public static class18 field2200;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lae;")
    public static class6 field2206;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
    public static boolean field2199;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[BII)I")
    public static final int method755(int arg0, byte[] arg1, int arg2, int arg3) {
        field2211++;
        int var4 = -1;
        if (arg0 > -62) {
            method756(28);
        }
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class25.field597[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method756(int arg0) {
        field2214++;
        if (class41.field959 == 181) {
            int var1 = class23.field581.method480(0);
            int var2 = (var1 & 0x7) + class133.field3215;
            int var3 = (var1 >> 4 & 0x7) + class42.field969;
            int var4 = class23.field581.method491(2);
            int var5 = class23.field581.method483((byte) 24);
            int var6 = class23.field581.method491(2);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104 && class46.field1101 != var5) {
                class105 var7 = new class105();
                var7.field2530 = var4;
                var7.field2518 = var6;
                if (class48.field1142[class136.field3301][var3][var2] == null) {
                    class48.field1142[class136.field3301][var3][var2] = new class23();
                }
                class48.field1142[class136.field3301][var3][var2].method185(var7, -27557);
                class141.method1131(var2, 0, var3);
            }
        } else if (class41.field959 == 33) {
            int var8 = class23.field581.method483((byte) 24);
            int var9 = class23.field581.method484((byte) 124);
            int var10 = class42.field969 + (var9 >> 4 & 0x7);
            int var11 = (var9 & 0x7) + class133.field3215;
            int var12 = class23.field581.method469(-128);
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = class55.field1337[var13];
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class85.method659(var13, var10, 0, -1, class136.field3301, (byte) 127, var15, var14, var8, var11);
            }
        } else if (class41.field959 == 98) {
            int var16 = class23.field581.method480(0);
            int var17 = var16 >> 2;
            int var18 = class55.field1337[var17];
            int var19 = var16 & 0x3;
            int var20 = class23.field581.method480(0);
            int var21 = class42.field969 + (var20 >> 4 & 0x7);
            int var22 = (var20 & 0x7) + class133.field3215;
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                class85.method659(var17, var21, 0, -1, class136.field3301, (byte) 74, var18, var19, -1, var22);
            }
        } else if (class41.field959 == 92) {
            int var23 = class23.field581.method480(arg0 ^ 0xB594B64);
            int var24 = (var23 >> 4 & 0x7) + class42.field969;
            int var25 = (var23 & 0x7) + class133.field3215;
            int var26 = class23.field581.method483((byte) 24);
            int var27 = class23.field581.method480(0);
            int var28 = class23.field581.method483((byte) 24);
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                int var29 = var24 * 128 + 64;
                int var30 = var25 * 128 + 64;
                class63 var31 = new class63(var26, class136.field3301, var29, var30, class20.method148(var29, var30, class136.field3301, arg0 ^ 0xF4A6B49A) - var27, var28, class126.field2998);
                class132.field3178.method185(var31, -27557);
            }
        } else if (class41.field959 == 146) {
            int var32 = class23.field581.method480(0);
            int var33 = (var32 & 0x7) + class133.field3215;
            int var34 = (var32 >> 4 & 0x7) + class42.field969;
            int var35 = class23.field581.method483((byte) 24);
            int var36 = class23.field581.method483((byte) 24);
            int var37 = class23.field581.method483((byte) 24);
            if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104) {
                class23 var38 = class48.field1142[class136.field3301][var34][var33];
                if (var38 != null) {
                    for (class105 var39 = (class105) var38.method182((byte) 50); var39 != null; var39 = (class105) var38.method181((byte) 53)) {
                        if ((var35 & 0x7FFF) == var39.field2530 && var39.field2518 == var36) {
                            var39.field2518 = var37;
                            break;
                        }
                    }
                    class141.method1131(var33, 0, var34);
                }
            }
        } else if (class41.field959 == 64) {
            int var40 = class23.field581.method484((byte) 124);
            int var41 = (var40 >> 4 & 0x7) + class42.field969;
            int var42 = (var40 & 0x7) + class133.field3215;
            int var43 = class23.field581.method491(arg0 ^ 0xB594B66);
            int var44 = class23.field581.method483((byte) 24);
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class105 var45 = new class105();
                var45.field2518 = var43;
                var45.field2530 = var44;
                if (class48.field1142[class136.field3301][var41][var42] == null) {
                    class48.field1142[class136.field3301][var41][var42] = new class23();
                }
                class48.field1142[class136.field3301][var41][var42].method185(var45, -27557);
                class141.method1131(var42, 0, var41);
            }
        } else {
            if (class41.field959 == 162) {
                int var46 = class23.field581.method480(0);
                int var47 = (var46 >> 4 & 0x7) + class42.field969;
                int var48 = (var46 & 0x7) + class133.field3215;
                int var49 = class23.field581.method483((byte) 24);
                int var50 = class23.field581.method480(0);
                int var51 = class23.field581.method480(0);
                int var52 = var50 & 0x7;
                int var53 = var50 >> 4 & 0xF;
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    int var54 = var53 + 1;
                    if (class116.field2789.field192[0] >= var47 - var54 && class116.field2789.field192[0] <= var47 + var54 && class116.field2789.field162[0] >= var48 - var54 && var48 + var54 >= class116.field2789.field162[0] && class90.field2115 != 0 && var52 > 0 && class56.field1382 < 50) {
                        class77.field1806[class56.field1382] = var49;
                        class25.field603[class56.field1382] = var52;
                        class38.field880[class56.field1382] = var51;
                        class26.field632[class56.field1382] = null;
                        class1.field19[class56.field1382] = (var47 << 16) + (var48 << 8) + var53;
                        class56.field1382++;
                    }
                }
            }
            if (class41.field959 == 165) {
                int var55 = class23.field581.method456((byte) 114);
                int var56 = (var55 & 0x7) + class133.field3215;
                int var57 = (var55 >> 4 & 0x7) + class42.field969;
                int var58 = class23.field581.method488(-28134);
                int var59 = class23.field581.method484((byte) 123);
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = class55.field1337[var60];
                if (var57 >= 0 && var56 >= 0 && var57 < 103 && var56 < 103) {
                    int var63 = class68.field1682[class136.field3301][var57][var56];
                    int var64 = class68.field1682[class136.field3301][var57 + 1][var56];
                    int var65 = class68.field1682[class136.field3301][var57 + 1][var56 + 1];
                    int var66 = class68.field1682[class136.field3301][var57][var56 + 1];
                    if (var62 == 0) {
                        class3 var67 = class100.field2418.method997(class136.field3301, var57, var56);
                        if (var67 != null) {
                            int var68 = var67.field82 >> 14 & 0x7FFF;
                            if (var60 == 2) {
                                var67.field81 = new class35(var68, 2, var61 + 4, var63, var64, var65, var66, var58, false, var67.field81);
                                var67.field87 = new class35(var68, 2, var61 + 1 & 0x3, var63, var64, var65, var66, var58, false, var67.field87);
                            } else {
                                var67.field81 = new class35(var68, var60, var61, var63, var64, var65, var66, var58, false, var67.field81);
                            }
                        }
                    }
                    if (var62 == 1) {
                        class30 var69 = class100.field2418.method1021(class136.field3301, var57, var56);
                        if (var69 != null) {
                            var69.field734 = new class35(var69.field723 >> 14 & 0x7FFF, 4, 0, var63, var64, var65, var66, var58, false, var69.field734);
                        }
                    }
                    if (var62 == 2) {
                        class40 var70 = class100.field2418.method1032(class136.field3301, var57, var56);
                        if (var60 == 11) {
                            var60 = 10;
                        }
                        if (var70 != null) {
                            var70.field918 = new class35(var70.field945 >> 14 & 0x7FFF, var60, var61, var63, var64, var65, var66, var58, false, var70.field918);
                        }
                    }
                    if (var62 == 3) {
                        class151 var71 = class100.field2418.method994(class136.field3301, var57, var56);
                        if (var71 != null) {
                            var71.field3724 = new class35(var71.field3727 >> 14 & 0x7FFF, 22, var61, var63, var64, var65, var66, var58, false, var71.field3724);
                        }
                    }
                }
            } else {
                if (arg0 != 190401380) {
                    field2200 = null;
                }
                if (class41.field959 == 241) {
                    int var72 = class23.field581.method480(arg0 ^ 0xB594B64);
                    int var73 = class133.field3215 + (var72 & 0x7);
                    int var74 = (var72 >> 4 & 0x7) + class42.field969;
                    int var75 = class23.field581.method475(-49152) + var74;
                    int var76 = var73 + class23.field581.method475(arg0 - 190450532);
                    int var77 = class23.field581.method446((byte) -99);
                    int var78 = class23.field581.method483((byte) 24);
                    int var79 = class23.field581.method480(arg0 ^ 0xB594B64) * 4;
                    int var80 = class23.field581.method480(0) * 4;
                    int var81 = class23.field581.method483((byte) 24);
                    int var82 = class23.field581.method483((byte) 24);
                    int var83 = class23.field581.method480(arg0 ^ 0xB594B64);
                    int var84 = class23.field581.method480(0);
                    if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104 && var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var78 != 65535) {
                        int var85 = var73 * 128 + 64;
                        int var86 = var75 * 128 + 64;
                        int var87 = var76 * 128 + 64;
                        int var88 = var74 * 128 + 64;
                        class56 var89 = new class56(var78, class136.field3301, var88, var85, class20.method148(var88, var85, class136.field3301, -2) - var79, class126.field2998 + var81, class126.field2998 + var82, var83, var84, var77, var80);
                        var89.method428((byte) 122, var87, class126.field2998 + var81, -var80 + class20.method148(var86, var87, class136.field3301, -2), var86);
                        class5.field129.method185(var89, arg0 - 190428937);
                    }
                } else if (class41.field959 == 104) {
                    int var90 = class23.field581.method472((byte) -119);
                    int var91 = class23.field581.method469(arg0 - 190401508);
                    int var92 = (var91 >> 4 & 0x7) + class42.field969;
                    int var93 = class133.field3215 + (var91 & 0x7);
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                        class23 var94 = class48.field1142[class136.field3301][var92][var93];
                        if (var94 != null) {
                            for (class105 var95 = (class105) var94.method182((byte) 50); var95 != null; var95 = (class105) var94.method181((byte) 91)) {
                                if ((var90 & 0x7FFF) == var95.field2530) {
                                    var95.method302(4071);
                                    break;
                                }
                            }
                            if (var94.method182((byte) 50) == null) {
                                class48.field1142[class136.field3301][var92][var93] = null;
                            }
                            class141.method1131(var93, 0, var92);
                        }
                    }
                } else if (class41.field959 == 107) {
                    int var96 = class23.field581.method484((byte) 125);
                    int var97 = (var96 >> 4 & 0x7) + class42.field969;
                    int var98 = class133.field3215 + (var96 & 0x7);
                    byte var99 = class23.field581.method497((byte) -92);
                    int var100 = class23.field581.method469(-128);
                    int var101 = var100 >> 2;
                    int var102 = class55.field1337[var101];
                    byte var103 = class23.field581.method497((byte) -109);
                    int var104 = class23.field581.method472((byte) -80);
                    byte var105 = class23.field581.method475(arg0 ^ 0xF4A60B64);
                    int var106 = class23.field581.method472((byte) -30);
                    int var107 = class23.field581.method472((byte) -125);
                    int var108 = class23.field581.method483((byte) 24);
                    int var109 = var100 & 0x3;
                    byte var110 = class23.field581.method475(-49152);
                    class145 var111;
                    if (class46.field1101 == var106) {
                        var111 = class116.field2789;
                    } else {
                        var111 = class131.field3166[var106];
                    }
                    if (var111 != null) {
                        class119 var112 = class2.method9(false, var104);
                        int var113 = class68.field1682[class136.field3301][var97][var98];
                        int var114 = class68.field1682[class136.field3301][var97 + 1][var98 + 1];
                        int var115 = class68.field1682[class136.field3301][var97 + 1][var98];
                        int var116 = class68.field1682[class136.field3301][var97][var98 + 1];
                        class91 var117 = var112.method939(var101, var116, var114, arg0 ^ 0xB59783B, var113, var109, var115);
                        if (var117 != null) {
                            class85.method659(0, var97, var107 + 1, var108 + 1, class136.field3301, (byte) 123, var102, 0, -1, var98);
                            var111.field3515 = var117;
                            var111.field3522 = var107 + class126.field2998;
                            int var118 = var112.field2890;
                            int var119 = var112.field2860;
                            var111.field3521 = class126.field2998 + var108;
                            if (var105 > var103) {
                                byte var120 = var105;
                                var105 = var103;
                                var103 = var120;
                            }
                            if (var109 == 1 || var109 == 3) {
                                var118 = var112.field2860;
                                var119 = var112.field2890;
                            }
                            if (var110 > var99) {
                                byte var121 = var110;
                                var110 = var99;
                                var99 = var121;
                            }
                            var111.field3514 = var97 * 128 + var118 * 64;
                            var111.field3539 = var98 * 128 + var119 * 64;
                            var111.field3536 = class20.method148(var111.field3514, var111.field3539, class136.field3301, arg0 - 190401382);
                            var111.field3534 = var97 + var105;
                            var111.field3518 = var98 + var110;
                            var111.field3537 = var97 + var103;
                            var111.field3519 = var98 + var99;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static final void method757(int arg0) {
        field2209++;
        if (arg0 == -34 && class60.field1509 == 2) {
            class23.method187(-1375023600, class49.field1164 * 2, (class35.field826 - class126.field3010 << 7) + class41.field958, (-class76.field1795 + class55.field1310 << 7) + class103.field2494);
            if (class138.field3351 > -1 && class126.field2998 % 20 < 10) {
                class65.field1623[0].method76(class138.field3351 - 12, class65.field1614 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Ldf;")
    public static final class28 method758(int arg0, int arg1) {
        class28 var2 = (class28) class128.field3091.method239(9325, (long) arg1);
        if (arg0 != 15318) {
            method757(-37);
        }
        field2201++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field358.method324(0, arg1, 1);
        class28 var4 = new class28();
        if (var3 != null) {
            var4.method230((byte) 114, new class59(var3), arg1);
        }
        var4.method228((byte) 94);
        class128.field3091.method241(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method759(int arg0) {
        field2202 = null;
        field2210 = null;
        field2206 = null;
        field2217 = null;
        if (arg0 != 32767) {
            method757(-68);
        }
        field2203 = null;
        field2208 = null;
        field2213 = null;
        field2205 = null;
        field2200 = null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Z")
    public static final boolean method760(int arg0, int arg1) {
        field2212++;
        if (class116.field2767[arg1]) {
            return true;
        } else if (class108.field2598.method325(arg1, true)) {
            int var2 = class108.field2598.method335(arg1, (byte) -38);
            if (var2 == 0) {
                class116.field2767[arg1] = true;
                return true;
            }
            if (class105.field2528[arg1] == null) {
                class105.field2528[arg1] = new class146[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class105.field2528[arg1][var3] == null) {
                    byte[] var4 = class108.field2598.method324(0, var3, arg1);
                    if (var4 != null) {
                        class105.field2528[arg1][var3] = new class146();
                        class105.field2528[arg1][var3].field3595 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class105.field2528[arg1][var3].method1202(new class59(var4), 97);
                        } else {
                            class105.field2528[arg1][var3].method1200((byte) -106, new class59(var4));
                        }
                    }
                }
            }
            class116.field2767[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
