import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class16 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Z")
    public static boolean field219 = false;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lce;")
    private static class126 field220 = class206.method1445(-7923, "Allocating memory");

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lce;")
    public static class126 field224 = class206.method1445(-7923, ")2");

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lce;")
    public static class126 field218 = field220;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lsi;")
    public static class237 field222 = new class237(8);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lce;")
    public static class126 field226 = class206.method1445(-7923, "settings=");

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lce;")
    public static class126 field228 = class206.method1445(-7923, " de votre liste noire)3");

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 4)
    public static final void method88(byte arg0) {
        class118.field1987 = null;
        class174.field3077 = null;
        client.field2075 = null;
        class152.field2770 = null;
        class182.field3173 = null;
        class200.field3414 = null;
        class74.field1195 = null;
        class70.field1152 = null;
        class279.field4645 = null;
        class19.field265 = null;
        field223++;
        class119.field2007 = null;
        class313.field5337 = null;
        class174.field3072 = null;
        class15.field211 = null;
        class219.field3676 = null;
        class18.field247 = null;
        class303.field5047 = null;
        class315.field5406 = null;
        class57.field884 = null;
        class209.field3582 = null;
        class107.field1694 = null;
        if (arg0 >= -46) {
            field227 = 66;
        }
        class209.field3592 = null;
        class103.field1643 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[II[[FBZZII[[FZ[ZILbi;III[[FZ[[I[[I)V", line = 38)
    public static final void method89(int arg0, int arg1, int[] arg2, int arg3, float[][] arg4, byte arg5, boolean arg6, boolean arg7, int arg8, int arg9, float[][] arg10, boolean arg11, boolean[] arg12, int arg13, class201 arg14, int arg15, int arg16, int arg17, float[][] arg18, boolean arg19, int[][] arg20, int[][] arg21) {
        field221++;
        int var22 = (arg19 ? 255 : 0) + (arg9 << 8);
        if (arg16 <= 96) {
            field219 = true;
        }
        int var23 = (arg0 << 8) + (arg6 ? 255 : 0);
        int var24 = (arg7 ? 255 : 0) + (arg17 << 8);
        int[] var25 = new int[arg2.length / 2];
        int var26 = (arg11 ? 255 : 0) + (arg13 << 8);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg2[var27 + var27];
            int var29 = arg2[var27 + var27 + 1];
            int[][] var30 = arg21 == null || arg12 == null || !arg12[var27] ? arg20 : arg21;
            var25[var27] = class190.method1360(arg4, arg3, -109, var23, var24, (float) arg15, arg21, var30, arg18, arg14, var29, var26, var22, arg10, arg5, var28, false, arg1);
        }
        arg14.method1420(arg8, arg3, arg1, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZLce;)V", line = 74)
    public static final void method90(int arg0, boolean arg1, class126 arg2) {
        class126 var3 = arg2.method838((byte) -96);
        field225++;
        int var4 = 0;
        short[] var5 = new short[16];
        int var6 = arg1 ? 32768 : 0;
        if (arg0 != 3574) {
            method88((byte) 59);
        }
        int var7 = (arg1 ? class254.field4269 : class63.field1070) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class220 var9 = class241.method1665(var8, (byte) -53);
            if (var9.field3706 && var9.method1511(0).method838((byte) -112).method875(var3, -96) != -1) {
                if (var4 >= 50) {
                    class73.field1176 = null;
                    class240.field4048 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var8;
            }
        }
        class73.field1175 = 0;
        class73.field1176 = var5;
        class240.field4048 = var4;
        class126[] var12 = new class126[class240.field4048];
        for (int var13 = 0; var13 < class240.field4048; var13++) {
            var12[var13] = class241.method1665(var5[var13], (byte) -53).method1511(0);
        }
        class266.method1797(class73.field1176, var12, true);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIIII)V", line = 152)
    public static final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field217++;
        int var11 = arg1 - arg8;
        if (class36.field521 > arg1) {
            var11++;
        }
        int var12 = arg3 - arg6;
        if (class143.field2602 > arg3) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg5 * var13 + arg4 >> 16;
            int var15 = arg4 + ((var13 + 1) * arg5) >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg8 + var13 >> 6;
                if (var17 >= 0 && (class64.field1079.length - 1) >= var17) {
                    int var18 = arg2 + var15;
                    int var19 = arg2 + var14;
                    int[][] var20 = class64.field1079[var17];
                    byte[][] var21 = class264.field4400[var17];
                    byte[][] var22 = class260.field4361[var17];
                    byte[][] var23 = class48.field748[var17];
                    byte[][] var24 = class273.field4599[var17];
                    byte[][] var25 = class1.field10[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg7 * var26 + arg10 >> 16;
                        int var28 = (var26 + 1) * arg7 + arg10 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg9 + var28;
                            int var31 = arg9 + var27;
                            int var32 = arg6 + var26 >> 6;
                            int var33 = var26 + arg6 & 0x3F;
                            int var34 = arg8 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var32 > var20.length - 1 || var20[var32] == null) {
                                if (class134.field2320.field3864 != -1) {
                                    var36 = class134.field2320.field3864;
                                } else if ((var26 + arg6 & 0x4) == (var13 + arg8 & 0x4)) {
                                    var36 = class300.field4972[class19.field262 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var20.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class276.method1844(var19, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var32][var35];
                            }
                            int var37 = var21[var32] == null ? 0 : class300.field4972[var21[var32][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var38 = var24[var32] == null ? 0 : class300.field4972[var24[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class276.method1844(var19, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var32] == null ? 0 : var22[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class276.method1844(var19, var31, var16, var29, var37);
                                    } else {
                                        class74.method539(var40 >> 2, var36, var16, -102, var39 & 0x3, true, var37, var19, var29, var31, class276.field4626);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var23[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class276.method1844(var19, var31, var16, var29, var38);
                                    }
                                    class74.method539(var42 >> 2, 0, var16, -79, var41 & 0x3, var37 == 0, var38, var19, var29, var31, class276.field4626);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var18 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var31;
                                    } else {
                                        var46 = var30 - 1;
                                    }
                                    if (var43 == 1) {
                                        class276.method1859(var19, var31, var29, var45);
                                    } else if (var43 == 2) {
                                        class276.method1850(var19, var31, var16, var45);
                                    } else if (var43 == 3) {
                                        class276.method1859(var44, var31, var29, var45);
                                    } else if (var43 == 4) {
                                        class276.method1850(var19, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class276.method1859(var19, var31, var29, 16777215);
                                        class276.method1850(var19, var31, var16, var45);
                                    } else if (var43 == 10) {
                                        class276.method1859(var44, var31, var29, 16777215);
                                        class276.method1850(var19, var31, var16, var45);
                                    } else if (var43 == 11) {
                                        class276.method1859(var44, var31, var29, 16777215);
                                        class276.method1850(var19, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class276.method1859(var19, var31, var29, 16777215);
                                        class276.method1850(var19, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class276.method1850(var19, var31, 1, var45);
                                    } else if (var43 == 18) {
                                        class276.method1850(var44, var31, 1, var45);
                                    } else if (var43 == 19) {
                                        class276.method1850(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class276.method1850(var19, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class276.method1850(var19 + var47, -var47 + var46, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class276.method1850(var19 + var48, var31 + var48, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg2 + var15;
                    int var50 = arg2 + var14;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52 = (arg7 * var51 + arg10 >> 16) + arg9;
                        int var53;
                        if (class134.field2320.field3864 != -1) {
                            var53 = class134.field2320.field3864;
                        } else if ((arg6 + var51 & 0x4) == (arg8 + var13 & 0x4)) {
                            var53 = class300.field4972[class19.field262 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var54 = ((var51 + 1) * arg7 + arg10 >> 16) + arg9;
                        int var55 = var54 - var52;
                        class276.method1844(var50, var52, var16, var55, var53);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = (var56 + 1) * arg5 + arg4 >> 16;
            int var58 = arg5 * var56 + arg4 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg2 + var58;
                var10000 = arg2 + var57;
                int var62 = arg8 + var56 >> 6;
                if (var62 >= 0 && var62 <= class13.field183.length - 1) {
                    short[][] var63 = class13.field183[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg7 * var64 + arg10 >> 16;
                        int var66 = (var64 + 1) * arg7 + arg10 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg9 + var66;
                            int var69 = arg6 + var64 >> 6;
                            int var70 = arg9 + var65;
                            if (var69 >= 0 && (var63.length - 1) >= var69) {
                                int var71 = ((var64 + arg6 & 0x3F) << 6) + (var56 + arg8 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = (var63[var69][var71] & 0xC72E) >> 14;
                                    int var73 = var63[var69][var71] & 0x3FFF;
                                    if (var73 != 0) {
                                        if (var72 == 0) {
                                            int var74 = class296.field4934[var73 - 1].field360 * var59 / 4;
                                            int var75 = class296.field4934[var73 - 1].field367 * var67 / 4;
                                            if (var74 != 0 && var75 != 0) {
                                                int var76 = class296.field4934[var73 - 1].field375 * var67 / 4;
                                                class296.field4934[var73 - 1].method12(var60, var70 - var76, var74, var75);
                                            }
                                        } else if (var72 == 1) {
                                            int var83 = class5.field34[var73 - 1].field360 * var59 / 4;
                                            int var84 = class5.field34[var73 - 1].field367 * var67 / 4;
                                            if (var83 != 0 && var84 != 0) {
                                                int var85 = class5.field34[var73 - 1].field375 * var67 / 4;
                                                class5.field34[var73 - 1].method12(var60, var70 - var85, var83, var84);
                                            }
                                        } else if (var72 == 2) {
                                            int var80 = class241.field4077[var73 - 1].field360 * var59 / 4;
                                            int var81 = class241.field4077[var73 - 1].field367 * var67 / 4;
                                            if (var80 != 0 && var81 != 0) {
                                                int var82 = class241.field4077[var73 - 1].field375 * var67 / 4;
                                                class241.field4077[var73 - 1].method12(var60, var70 - var82, var80, var81);
                                            }
                                        } else if (var72 == 3) {
                                            int var77 = class280.field4647[var73 - 1].field360 * var59 / 4;
                                            int var78 = class280.field4647[var73 - 1].field367 * var67 / 4;
                                            if (var77 != 0 && var78 != 0) {
                                                int var79 = class280.field4647[var73 - 1].field375 * var67 / 4;
                                                class280.field4647[var73 - 1].method12(var60, var70 - var79, var77, var78);
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
        if (arg0 != -1) {
            field220 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 627)
    public static void method92(int arg0) {
        field224 = null;
        field222 = null;
        field228 = null;
        field226 = null;
        if (arg0 != -2) {
            field219 = true;
        }
        field220 = null;
        field218 = null;
    }
}
