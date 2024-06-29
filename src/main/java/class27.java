import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class27 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Loh;")
    public static class258 field322 = class153.method1046("<br>(X", 127);

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lvj;")
    public static class96 field323 = new class96(64);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[[[Llf;")
    public static class228[][][] field329;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 4)
    public static void method205(int arg0) {
        field323 = null;
        field322 = null;
        if (arg0 == 1) {
            field329 = (class228[][][]) null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Loh;Loh;II)V", line = 18)
    public static final void method206(class258 arg0, class258 arg1, int arg2, int arg3) {
        class188.field3324 = arg3;
        field325++;
        class235.field4110 = arg0;
        class235.field4103 = arg1;
        if (class235.field4103.method1821(-1, class235.field4104) || class235.field4110.method1821(-1, class235.field4104)) {
            class265.field4608 = 3;
        } else if (class253.field4358 == -1) {
            class265.field4608 = -3;
            class190.field3367 = 1;
            class137.field2349 = 0;
            class235 var4 = new class235(128);
            var4.method1598(10, 27052);
            var4.method1605((int) (Math.random() * 99999.0D), (byte) 95);
            var4.method1605(518, (byte) 52);
            var4.method1603(class235.field4103.method1769(16), -1649350304);
            var4.method1577(true, (int) (Math.random() * 9.9999999E7D));
            var4.method1590(class235.field4110, (byte) -88);
            var4.method1577(true, (int) (Math.random() * 9.9999999E7D));
            var4.method1566(26220, class301.field5143, class162.field2727);
            class159.field2710.field4051 = arg2;
            class159.field2710.method1598(160, 27052);
            class159.field2710.method1598(var4.field4051, 27052);
            class159.field2710.method1565(var4.field4051, var4.field4066, 0, 112);
        } else {
            class277.method1942((byte) 118);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZILqe;)V", line = 62)
    public static final void method207(boolean arg0, int arg1, class35 arg2) {
        if (class257.field4390 || arg0) {
            int var3 = class42.field577;
            int var4 = var3 * 956 / 503;
            class134.field2316.method316((class218.field3773 - var4) / 2, 0, var4, var3);
            class56.field879.method378(class218.field3773 / 2 - (class56.field879.field1950 / 2), 18);
        }
        field328++;
        arg2.method260(class205.field3543, class218.field3773 / 2, class42.field577 / 2 - 26, 16777215, -1);
        if (arg1 != 0) {
            return;
        }
        int var5 = class42.field577 / 2 - 18;
        if (class257.field4390) {
            class296.method2084(class218.field3773 / 2 - 152, var5, 304, 34, 9179409);
            class296.method2084(class218.field3773 / 2 - 151, var5 - -1, 302, 32, 0);
            class296.method2096(class218.field3773 / 2 - 150, var5 - -2, class7.field92 * 3, 30, 9179409);
            class296.method2096(class218.field3773 / 2 + class7.field92 * 3 - 150, var5 + 2, 300 - (class7.field92 * 3), 30, 0);
        } else {
            class211.method1404(class218.field3773 / 2 - 152, var5, 304, 34, 9179409);
            class211.method1404(class218.field3773 / 2 - 151, var5 + 1, 302, 32, 0);
            class211.method1398(class218.field3773 / 2 - 150, var5 + 2, class7.field92 * 3, 30, 9179409);
            class211.method1398(class7.field92 * 3 + class218.field3773 / 2 - 150, var5 + 2, 300 - (class7.field92 * 3), 30, 0);
        }
        arg2.method260(class120.field2119, class218.field3773 / 2, class42.field577 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 102)
    public static final int method208(int arg0, int arg1) {
        field320++;
        double var2 = (double) (arg0 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFBB) >> 8) / 256.0D;
        double var6 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var8 = var6;
        double var10 = 0.0D;
        double var12 = 0.0D;
        if (arg1 != -3) {
            method210(-56, 19);
        }
        double var14 = var6;
        if (var6 > var4) {
            var14 = var4;
        }
        if (var14 > var2) {
            var14 = var2;
        }
        if (var4 > var6) {
            var8 = var4;
        }
        if (var2 > var8) {
            var8 = var2;
        }
        double var16 = (var8 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var12 = (var8 - var14) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var8 - var14) / (2.0D - var8 - var14);
            }
            if (var6 == var8) {
                var10 = (var4 - var2) / (var8 - var14);
            } else if (var4 == var8) {
                var10 = (var2 - var6) / (var8 - var14) + 2.0D;
            } else if (var2 == var8) {
                var10 = (var6 - var4) / (var8 - var14) + 4.0D;
            }
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var12 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var22 >> 5 << 7) + (var21 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILoh;)V", line = 210)
    public static final void method209(int arg0, int arg1, class258 arg2) {
        field326++;
        boolean var3 = false;
        class258 var4 = arg2.method1797(arg0 + 47).method1786((byte) 107);
        for (int var5 = 0; var5 < class14.field177; var5++) {
            class231 var6 = class38.field527[class140.field2390[var5]];
            if (var6 != null && var6.field4007 != null && var6.field4007.method1778(arg0 ^ 0x2E94, var4)) {
                class208.method1373(0, class152.field2606.field959[0], false, 1, 2, 0, var6.field975[0], (byte) -75, var6.field959[0], 1, 0, class152.field2606.field975[0]);
                var3 = true;
                if (arg1 == 1) {
                    class159.field2710.method885(172, -95);
                    class159.field2710.method1619(8316, class140.field2390[var5]);
                    class87.field1473++;
                } else if (arg1 == 4) {
                    class159.field2710.method885(41, -111);
                    class159.field2710.method1592(false, class140.field2390[var5]);
                    class6.field81++;
                } else if (arg1 == 5) {
                    class146.field2471++;
                    class159.field2710.method885(247, -90);
                    class159.field2710.method1612(class140.field2390[var5], (byte) -126);
                } else if (arg1 == 6) {
                    class159.field2710.method885(232, -71);
                    class15.field192++;
                    class159.field2710.method1612(class140.field2390[var5], (byte) -127);
                } else if (arg1 == 7) {
                    class191.field3385++;
                    class159.field2710.method885(1, -70);
                    class159.field2710.method1592(false, class140.field2390[var5]);
                }
                break;
            }
        }
        if (arg0 != -1) {
            method205(-36);
        }
        if (!var3) {
            class140.method965(false, 0, class100.method755(-6, new class258[] { class149.field2530, var4 }), class235.field4104);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)Lck;", line = 283)
    public static final class98 method210(int arg0, int arg1) {
        field327++;
        int var2 = -4 % ((arg0 + 46) / 43);
        return class153.field2633 && class123.field2179 <= arg1 && arg1 <= class291.field5004 ? class109.field1928[arg1 - class123.field2179] : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIIII)V", line = 303)
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field319++;
        int var11 = arg6 - arg1;
        if (arg6 < class57.field907) {
            var11++;
        }
        int var12 = arg3 - arg0;
        if (arg10 != -32639) {
            method209(38, -86, (class258) null);
        }
        if (class225.field3870 > arg3) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg5 * var13 + arg4 >> 16;
            int var15 = arg4 + ((var13 + 1) * arg5) >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg1 + var13 >> 6;
                if (var17 >= 0 && var17 <= class202.field3502.length - 1) {
                    byte[][] var18 = class167.field2836[var17];
                    int var19 = arg9 + var14;
                    int[][] var20 = class202.field3502[var17];
                    byte[][] var21 = class64.field1122[var17];
                    int var22 = arg9 + var15;
                    byte[][] var23 = class19.field224[var17];
                    byte[][] var24 = class56.field885[var17];
                    byte[][] var25 = class115.field2053[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg7 * var26 + arg2 >> 16;
                        int var28 = arg2 + ((var26 + 1) * arg7) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg8 + var28;
                            int var31 = arg0 + var26 >> 6;
                            int var32 = arg8 + var27;
                            int var33 = arg1 + var13 & 0x3F;
                            int var34 = arg0 + var26 & 0x3F;
                            int var35 = (var34 << 6) + var33;
                            int var36;
                            if (var31 < 0 || (var20.length - 1) < var31 || var20[var31] == null) {
                                if (class154.field2640.field2240 != -1) {
                                    var36 = class154.field2640.field2240;
                                } else if ((arg0 + var26 & 0x4) == (arg1 + var13 & 0x4)) {
                                    var36 = class37.field494[class140.field2389 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var31 > (var20.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class211.method1398(var19, var32, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var31][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var23[var31] == null ? 0 : class37.field494[var23[var31][var35] & 0xFF];
                            int var38 = var21[var31] == null ? 0 : class37.field494[var21[var31][var35] & 0xFF];
                            if (var38 == 0 && var37 == 0) {
                                class211.method1398(var19, var32, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var39 = var18[var31] == null ? 0 : var18[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class211.method1398(var19, var32, var16, var29, var38);
                                    } else {
                                        class242.method1647(var16, var32, class211.field3640, (byte) -8, var19, var29, var36, true, var39 & 0x3, var40 >> 2, var38);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var24[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class211.method1398(var19, var32, var16, var29, var37);
                                    }
                                    class242.method1647(var16, var32, class211.field3640, (byte) -8, var19, var29, 0, var38 == 0, var41 & 0x3, var42 >> 2, var37);
                                }
                            }
                            if (var25[var31] != null) {
                                int var43 = var25[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var22 - 1;
                                    }
                                    int var45 = 13421772;
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var32;
                                    } else {
                                        var46 = var30 - 1;
                                    }
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var45 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class211.method1399(var19, var32, var29, var45);
                                    } else if (var43 == 2) {
                                        class211.method1410(var19, var32, var16, var45);
                                    } else if (var43 == 3) {
                                        class211.method1399(var44, var32, var29, var45);
                                    } else if (var43 == 4) {
                                        class211.method1410(var19, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class211.method1399(var19, var32, var29, 16777215);
                                        class211.method1410(var19, var32, var16, var45);
                                    } else if (var43 == 10) {
                                        class211.method1399(var44, var32, var29, 16777215);
                                        class211.method1410(var19, var32, var16, var45);
                                    } else if (var43 == 11) {
                                        class211.method1399(var44, var32, var29, 16777215);
                                        class211.method1410(var19, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class211.method1399(var19, var32, var29, 16777215);
                                        class211.method1410(var19, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class211.method1410(var19, var32, 1, var45);
                                    } else if (var43 == 18) {
                                        class211.method1410(var44, var32, 1, var45);
                                    } else if (var43 == 19) {
                                        class211.method1410(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class211.method1410(var19, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class211.method1410(var19 + var47, var46 - var47, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class211.method1410(var19 + var48, var32 + var48, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var15;
                    int var50 = arg9 + var14;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52 = (arg7 * var51 + arg2 >> 16) + arg8;
                        int var53;
                        if (class154.field2640.field2240 != -1) {
                            var53 = class154.field2640.field2240;
                        } else if ((arg0 + var51 & 0x4) == (arg1 + var13 & 0x4)) {
                            var53 = class37.field494[class140.field2389 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var54 = ((var51 + 1) * arg7 + arg2 >> 16) + arg8;
                        int var55 = var54 - var52;
                        class211.method1398(var50, var52, var16, var55, var53);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = arg5 * var56 + arg4 >> 16;
            int var58 = arg4 + ((var56 + 1) * arg5) >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg9 + var57;
                var10000 = arg9 + var58;
                int var62 = var56 + arg1 >> 6;
                if (var62 >= 0 && (class243.field4223.length - 1) >= var62) {
                    short[][] var63 = class243.field4223[var62];
                    for (int var64 = -2; var64 < (var12 + 2); var64++) {
                        int var65 = arg2 + (arg7 * var64) >> 16;
                        int var66 = arg2 + ((var64 + 1) * arg7) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg0 + var64 >> 6;
                            var10000 = arg8 + var66;
                            int var70 = arg8 + var65;
                            if (var68 >= 0 && var68 <= (var63.length - 1)) {
                                int var71 = ((arg0 + var64 & 0x3F) << 6) + (var56 + arg1 & 0x3F);
                                if (var63[var68] != null) {
                                    int var72 = var63[var68][var71] & 0x3FFF;
                                    int var73 = var63[var68][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class85.field1440[var72 - 1].field1944 * var59 / 4;
                                            int var75 = class85.field1440[var72 - 1].field1948 * var67 / 4;
                                            int var76 = class85.field1440[var72 - 1].field1955 * var67 / 4;
                                            class85.field1440[var72 - 1].method935(var60, var70 - var75, var74, var76);
                                        } else if (var73 == 1) {
                                            int var77 = class246.field4269[var72 - 1].field1944 * var59 / 4;
                                            int var78 = class246.field4269[var72 - 1].field1955 * var67 / 4;
                                            int var79 = class246.field4269[var72 - 1].field1948 * var67 / 4;
                                            class246.field4269[var72 - 1].method935(var60, var70 - var79, var77, var78);
                                        } else if (var73 == 2) {
                                            int var80 = class122.field2163[var72 - 1].field1944 * var59 / 4;
                                            int var81 = class122.field2163[var72 - 1].field1955 * var67 / 4;
                                            int var82 = class122.field2163[var72 - 1].field1948 * var67 / 4;
                                            class122.field2163[var72 - 1].method935(var60, var70 - var82, var80, var81);
                                        } else if (var73 == 3) {
                                            int var83 = class56.field876[var72 - 1].field1944 * var59 / 4;
                                            int var84 = class56.field876[var72 - 1].field1955 * var67 / 4;
                                            int var85 = class56.field876[var72 - 1].field1948 * var67 / 4;
                                            class56.field876[var72 - 1].method935(var60, var70 - var85, var83, var84);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 724)
    public static final void method212(int arg0) {
        field324++;
        int var1 = class115.field2052;
        int var2 = class63.field1098;
        int var3 = class276.field4762 - class218.field3773 - var1;
        int var4 = class314.field5326 - class42.field577 - var2;
        if (arg0 < 38) {
            method207(true, 29, (class35) null);
        }
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class71.field1253 != null) {
                var5 = class71.field1253;
            } else if (class284.field4882 == null) {
                var5 = class297.field5086.field5061;
            } else {
                var5 = class284.field4882;
            }
            int var6 = 0;
            int var7 = 0;
            if (class284.field4882 == var5) {
                Insets var8 = class284.field4882.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class314.field5326);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class276.field4762, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class276.field4762 + var6 - var3, var7, var3, class314.field5326);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class314.field5326 + var7 - var4, class276.field4762, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIBII)V", line = 791)
    public static final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field321++;
        int var8 = 97 / ((arg5 - 47) / 57);
        int var9 = 0;
        int var10 = arg7 - arg4;
        int var11 = 0;
        int var12 = arg0;
        int var13 = arg0 * arg0;
        int var14 = arg7 * arg7;
        int var15 = arg0 - arg4;
        int var16 = var10 * var10;
        int var17 = var13 << 1;
        int var18 = var15 * var15;
        int var19 = var18 << 1;
        int var20 = var14 << 1;
        int var21 = arg0 << 1;
        int var22 = var15 << 1;
        int var23 = var16 << 1;
        int var24 = (1 - var21) * var14 + var17;
        int var25 = var13 - (var21 - 1) * var20;
        int var26 = (1 - var22) * var16 + var19;
        int var27 = var18 - ((var22 - 1) * var23);
        int var28 = var14 << 2;
        int var29 = var13 << 2;
        int var30 = var18 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = (var22 - 3) * var23;
        int var36 = var29;
        int var37 = (arg0 - 1) * var28;
        int var38 = var30;
        int var39 = (var15 - 1) * var31;
        if (class241.field4189 <= arg1 && class94.field1654 >= arg1) {
            int[] var40 = class154.field2638[arg1];
            int var41 = class203.method1347(class75.field1314, arg3 - arg7, 1, class206.field3562);
            int var42 = class203.method1347(class75.field1314, arg3 + arg7, 1, class206.field3562);
            int var43 = class203.method1347(class75.field1314, arg3 - var10, 1, class206.field3562);
            int var44 = class203.method1347(class75.field1314, arg3 + var10, 1, class206.field3562);
            class19.method126(7, arg2, var40, var41, var43);
            class19.method126(7, arg6, var40, var43, var44);
            class19.method126(7, arg2, var40, var44, var42);
        }
        while (var12 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var9++;
                    var25 += var36;
                    var24 += var32;
                    var36 += var29;
                    var32 += var29;
                }
            }
            if (var25 < 0) {
                var24 += var32;
                var25 += var36;
                var36 += var29;
                var9++;
                var32 += var29;
            }
            var24 += -var37;
            var37 -= var28;
            var25 += -var34;
            var34 -= var28;
            boolean var45 = var15 >= var12;
            var12--;
            if (var45) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var11++;
                        var27 += var38;
                        var26 += var33;
                        var33 += var30;
                        var38 += var30;
                    }
                }
                if (var27 < 0) {
                    var26 += var33;
                    var33 += var30;
                    var27 += var38;
                    var38 += var30;
                    var11++;
                }
                var26 += -var39;
                var27 += -var35;
                var35 -= var31;
                var39 -= var31;
            }
            int var46 = arg1 - var12;
            int var47 = arg1 + var12;
            if (class241.field4189 <= var47 && var46 <= class94.field1654) {
                int var48 = class203.method1347(class75.field1314, arg3 + var9, 1, class206.field3562);
                int var49 = class203.method1347(class75.field1314, arg3 - var9, 1, class206.field3562);
                if (var45) {
                    int var50 = class203.method1347(class75.field1314, arg3 + var11, 1, class206.field3562);
                    int var51 = class203.method1347(class75.field1314, arg3 - var11, 1, class206.field3562);
                    if (class241.field4189 <= var46) {
                        int[] var52 = class154.field2638[var46];
                        class19.method126(7, arg2, var52, var49, var51);
                        class19.method126(7, arg6, var52, var51, var50);
                        class19.method126(7, arg2, var52, var50, var48);
                    }
                    if (var47 <= class94.field1654) {
                        int[] var53 = class154.field2638[var47];
                        class19.method126(7, arg2, var53, var49, var51);
                        class19.method126(7, arg6, var53, var51, var50);
                        class19.method126(7, arg2, var53, var50, var48);
                    }
                } else {
                    if (var46 >= class241.field4189) {
                        class19.method126(7, arg2, class154.field2638[var46], var49, var48);
                    }
                    if (var47 <= class94.field1654) {
                        class19.method126(7, arg2, class154.field2638[var47], var49, var48);
                    }
                }
            }
        }
    }
}
