import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class208 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "J")
    public long field3568;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lli;")
    public class208 field3563;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lli;")
    public class208 field3566;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[[Z")
    public static boolean[][] field3565;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 11)
    public static void method1498(int arg0) {
        field3565 = (boolean[][]) null;
        int var1 = -97 % ((-arg0 - 27) / 60);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([[BI[[BI[[B[[FI[[F[[B[[F[Laj;[[I)V", line = 27)
    public static final void method1499(byte[][] arg0, int arg1, byte[][] arg2, int arg3, byte[][] arg4, float[][] arg5, int arg6, float[][] arg7, byte[][] arg8, float[][] arg9, class1[] arg10, int[][] arg11) {
        field3561++;
        int var12 = 0;
        if (arg1 >= -119) {
            field3569 = 23;
        }
        while (arg6 > var12) {
            class1 var13 = arg10[var12];
            if (var13.field11 == arg3) {
                class8 var14 = new class8();
                int var15 = 0;
                int var16 = (var13.field1 >> 7) - var13.field14;
                int var17 = (var13.field16 >> 7) - var13.field14;
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field16 >> 7) + var13.field14;
                if (var18 > 103) {
                    var18 = 103;
                }
                int var19 = var17;
                while (true) {
                    if (var19 > var18) {
                        var14.method43();
                        int var56 = 0;
                        if ((var13.field16 >> 7) - var13.field14 < 0) {
                            var56 -= (var13.field16 >> 7) - var13.field14;
                        }
                        for (int var57 = var17; var57 <= var18; var57++) {
                            short var58 = var13.field24[var56];
                            int var59 = (var58 >> 8) + var16;
                            int var60 = (var58 & 0xFF) + var59 - 1;
                            if (var60 > 103) {
                                var60 = 103;
                            }
                            if (var59 < 0) {
                                var59 = 0;
                            }
                            for (int var61 = var59; var61 <= var60; var61++) {
                                byte var62 = arg0[var61][var57];
                                int var63 = arg4[var61][var57] & 0xFF;
                                boolean var64 = false;
                                int var65 = arg2[var61][var57] & 0xFF;
                                if (var63 == 0) {
                                    if (var65 == 0) {
                                        continue;
                                    }
                                    class289 var68 = class167.method1216(var65 - 1, (byte) -124);
                                    if (var68.field4969 == -1) {
                                        continue;
                                    }
                                    if (arg8[var61][var57] != 0) {
                                        class211.method1512(var61, arg11, arg0[var61][var57], arg5, class112.field1900[arg8[var61][var57]], 1, var14, var57, var13, arg9, arg7);
                                        continue;
                                    }
                                } else if (var65 == 0) {
                                    var62 = 0;
                                } else {
                                    class289 var66 = class167.method1216(var65 - 1, (byte) 3);
                                    if (var66.field4969 == -1) {
                                        class211.method1512(var61, arg11, arg0[var61][var57], arg5, class231.field3822[arg8[var61][var57]], 1, var14, var57, var13, arg9, arg7);
                                        continue;
                                    }
                                    byte var67 = arg8[var61][var57];
                                    if (var67 != 0) {
                                        var64 = true;
                                    }
                                }
                                class250 var69 = class292.method2066(arg3, var61, var57);
                                if (var69 != null) {
                                    int var70 = (int) (var69.field4206 >> 14) & 0x3F;
                                    if (var70 == 9) {
                                        int[] var71 = null;
                                        int var72 = (int) (var69.field4206 >> 20) & 0x3;
                                        if ((var72 & 0x1) == 0) {
                                            boolean var81 = var61 - 1 >= var59;
                                            if (!var81 && (var57 + 1) <= var18) {
                                                short var82 = var13.field24[var56 + 1];
                                                int var83 = var16 + (var82 >> 8);
                                                int var84 = var83 + (var82 & 0xFF);
                                                var81 = var61 > var83 && var84 > var61;
                                            }
                                            boolean var85 = var60 >= (var61 + 1);
                                            if (!var85 && (var57 - 1) >= var17) {
                                                short var86 = var13.field24[var56 - 1];
                                                int var87 = (var86 >> 8) + var16;
                                                int var88 = (var86 & 0xFF) + var87;
                                                var85 = var61 > var87 && var88 > var61;
                                            }
                                            if (var81 && var85) {
                                                var71 = class112.field1900[0];
                                            } else if (var81) {
                                                var62 = 1;
                                                var71 = class112.field1900[1];
                                            } else if (var85) {
                                                var71 = class112.field1900[1];
                                                var62 = 3;
                                            }
                                        } else {
                                            boolean var73 = var59 <= (var61 - 1);
                                            if (!var73 && var17 <= var57 - 1) {
                                                short var74 = var13.field24[var56 - 1];
                                                int var75 = (var74 >> 8) + var16;
                                                int var76 = (var74 & 0xFF) + var75;
                                                var73 = var61 > var75 && var61 < var76;
                                            }
                                            boolean var77 = var61 + 1 <= var60;
                                            if (!var77 && (var57 + 1) <= var18) {
                                                short var78 = var13.field24[var56 + 1];
                                                int var79 = (var78 >> 8) + var16;
                                                int var80 = (var78 & 0xFF) + var79;
                                                var77 = var61 > var79 && var80 > var61;
                                            }
                                            if (var73 && var77) {
                                                var71 = class112.field1900[0];
                                            } else if (var73) {
                                                var71 = class112.field1900[1];
                                                var62 = 0;
                                            } else if (var77) {
                                                var62 = 2;
                                                var71 = class112.field1900[1];
                                            }
                                        }
                                        if (var71 != null) {
                                            class211.method1512(var61, arg11, var62, arg5, var71, 1, var14, var57, var13, arg9, arg7);
                                        }
                                        continue;
                                    }
                                }
                                if (var64) {
                                    class211.method1512(var61, arg11, arg0[var61][var57], arg5, class231.field3822[arg8[var61][var57]], 1, var14, var57, var13, arg9, arg7);
                                    class211.method1512(var61, arg11, arg0[var61][var57], arg5, class112.field1900[arg8[var61][var57]], 1, var14, var57, var13, arg9, arg7);
                                } else {
                                    class211.method1512(var61, arg11, var62, arg5, class112.field1900[0], 1, var14, var57, var13, arg9, arg7);
                                }
                            }
                            var56++;
                        }
                        if (var14.field112 > 0 && var14.field125 > 0) {
                            var14.method45();
                            var13.field10 = var14;
                        }
                        break;
                    }
                    short var20 = var13.field24[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        boolean var24 = false;
                        int var25 = arg2[var23][var19] & 0xFF;
                        int var26 = arg4[var23][var19] & 0xFF;
                        if (var26 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class289 var31 = class167.method1216(var25 - 1, (byte) -78);
                            if (var31.field4969 == -1) {
                                continue;
                            }
                            if (arg8[var23][var19] != 0) {
                                int[] var32 = class112.field1900[arg8[var23][var19]];
                                var14.field119 += (var32.length >> 1) * 3 - 6;
                                var14.field123 += var32.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class289 var27 = class167.method1216(var25 - 1, (byte) 120);
                            if (var27.field4969 == -1) {
                                byte var29 = arg8[var23][var19];
                                if (var29 != 0) {
                                    int[] var30 = class231.field3822[var29];
                                    var14.field119 += (var30.length >> 1) * 3 - 6;
                                    var14.field123 += var30.length >> 1;
                                }
                                continue;
                            }
                            byte var28 = arg8[var23][var19];
                            if (var28 != 0) {
                                var24 = true;
                            }
                        }
                        class250 var33 = class292.method2066(arg3, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field4206 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field4206 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var37 = (var23 + 1) <= var22;
                                    boolean var38 = var23 - 1 >= var21;
                                    if (!var38 && var19 + 1 <= var18) {
                                        short var39 = var13.field24[var15 + 1];
                                        int var40 = (var39 >> 8) + var16;
                                        int var41 = (var39 & 0xFF) + var40;
                                        var38 = var40 < var23 && var23 < var41;
                                    }
                                    if (!var37 && var19 - 1 >= var17) {
                                        short var42 = var13.field24[var15 - 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var37 = var23 > var43 && var44 > var23;
                                    }
                                    if (var38 && var37) {
                                        var36 = class112.field1900[0];
                                    } else if (var38) {
                                        var36 = class112.field1900[1];
                                    } else if (var37) {
                                        var36 = class112.field1900[1];
                                    }
                                } else {
                                    boolean var45 = var21 <= (var23 - 1);
                                    if (!var45 && (var19 - 1) >= var17) {
                                        short var46 = var13.field24[var15 - 1];
                                        int var47 = (var46 >> 8) + var16;
                                        int var48 = (var46 & 0xFF) + var47;
                                        var45 = var23 > var47 && var23 < var48;
                                    }
                                    boolean var49 = var22 >= (var23 + 1);
                                    if (!var49 && var18 >= (var19 + 1)) {
                                        short var50 = var13.field24[var15 + 1];
                                        int var51 = (var50 >> 8) + var16;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var49 = var51 < var23 && var52 > var23;
                                    }
                                    if (var45 && var49) {
                                        var36 = class112.field1900[0];
                                    } else if (var45) {
                                        var36 = class112.field1900[1];
                                    } else if (var49) {
                                        var36 = class112.field1900[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field119 += ((var36.length >> 1) - 2) * 3;
                                    var14.field123 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var24) {
                            int[] var53 = class112.field1900[arg8[var23][var19]];
                            int[] var54 = class231.field3822[arg8[var23][var19]];
                            var14.field119 += (var53.length >> 1) * 3 - 6;
                            var14.field119 += ((var54.length >> 1) - 2) * 3;
                            var14.field123 += var53.length >> 1;
                            var14.field123 += var54.length >> 1;
                        } else {
                            int[] var55 = class112.field1900[0];
                            var14.field119 += (var55.length >> 1) * 3 - 6;
                            var14.field123 += var55.length >> 1;
                        }
                    }
                    var15++;
                    var19++;
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 563)
    public static final void method1500(int arg0) {
        field3562++;
        class92.field1579.method554(arg0 ^ arg0);
        class121.field2014.method554(0);
        class68.field1015.method554(arg0 ^ 0xA8596C68);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Z", line = 573)
    public final boolean method1501(byte arg0) {
        field3560++;
        if (this.field3566 == null) {
            return false;
        } else if (arg0 <= 85) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V", line = 589)
    public final void method1502(byte arg0) {
        field3567++;
        if (this.field3566 == null) {
            return;
        }
        if (arg0 != -82) {
            this.method1501((byte) 116);
        }
        this.field3566.field3563 = this.field3563;
        this.field3563.field3566 = this.field3566;
        this.field3566 = null;
        this.field3563 = null;
    }
}
