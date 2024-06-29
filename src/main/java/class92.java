import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class92 {

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    private int field1426 = 0;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Ljf;")
    private class227 field1425;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Lsn;")
    private class187 field1429;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Lce;")
    public static class8 field1428;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Ljava/lang/Thread;")
    public static Thread field1427;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "[I")
    public static int[] field1421;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 10)
    public static void method628(byte arg0) {
        if (arg0 < -35) {
            field1428 = null;
            field1427 = null;
            field1421 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)Lsn;", line = 23)
    public final class187 method629(byte arg0) {
        field1420++;
        if (this.field1426 > 0 && this.field1425.field3644[this.field1426 - 1] != this.field1429) {
            class187 var2 = this.field1429;
            this.field1429 = var2.field2846;
            return var2;
        } else if (arg0 >= -124) {
            return (class187) null;
        } else {
            class187 var3;
            do {
                if (this.field1425.field3642 <= this.field1426) {
                    return null;
                }
                var3 = this.field1425.field3644[this.field1426++].field2846;
            } while (this.field1425.field3644[this.field1426 - 1] == var3);
            this.field1429 = var3.field2846;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIC)I", line = 57)
    public static final int method630(int arg0, int arg1, char arg2) {
        field1423++;
        int var3 = arg2 << 4;
        if (arg0 != -1) {
            return -126;
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([[F[[BIII[[F[Lwi;[[I[[B[[B[[F[[B)V", line = 81)
    public static final void method631(float[][] arg0, byte[][] arg1, int arg2, int arg3, int arg4, float[][] arg5, class310[] arg6, int[][] arg7, byte[][] arg8, byte[][] arg9, float[][] arg10, byte[][] arg11) {
        for (int var12 = arg2; var12 < arg3; var12++) {
            class310 var13 = arg6[var12];
            if (var13.field4915 == arg4) {
                class31 var14 = new class31();
                int var15 = (var13.field4925 >> 7) - var13.field4893;
                int var16 = (var13.field4913 >> 7) - var13.field4893;
                int var17 = (var13.field4913 >> 7) + var13.field4893;
                int var18 = 0;
                if (var16 < 0) {
                    var18 -= var16;
                    var16 = 0;
                }
                if (var17 > 103) {
                    var17 = 103;
                }
                for (int var19 = var16; var19 <= var17; var19++) {
                    short var20 = var13.field4902[var18];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg9[var23][var19] & 0xFF;
                        int var25 = arg11[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class319 var27 = class29.method223((byte) -28, var25 - 1);
                            if (var27.field5005 == -1) {
                                continue;
                            }
                            if (arg1[var23][var19] != 0) {
                                int[] var28 = class46.field653[arg1[var23][var19]];
                                var14.field379 += (var28.length >> 1) * 3 - 6;
                                var14.field386 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class319 var29 = class29.method223((byte) -28, var25 - 1);
                            if (var29.field5005 == -1) {
                                byte var54 = arg1[var23][var19];
                                if (var54 != 0) {
                                    int[] var55 = class303.field4691[var54];
                                    var14.field379 += ((var55.length >> 1) - 2) * 3;
                                    var14.field386 += var55.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg1[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class272 var31 = class298.method1964(arg4, var23, var19);
                        if (var31 != null) {
                            int var32 = (int) (var31.field4183 >> 14) & 0x3F;
                            if (var32 == 9) {
                                int[] var36 = null;
                                int var37 = (int) (var31.field4183 >> 20) & 0x3;
                                if ((var37 & 0x1) == 0) {
                                    boolean var46 = var22 >= (var23 + 1);
                                    boolean var47 = var21 <= (var23 - 1);
                                    if (!var47 && (var19 + 1) <= var17) {
                                        short var48 = var13.field4902[var18 + 1];
                                        int var49 = (var48 >> 8) + var15;
                                        int var50 = (var48 & 0xFF) + var49;
                                        var47 = var49 < var23 && var50 > var23;
                                    }
                                    if (!var46 && var16 <= (var19 - 1)) {
                                        short var51 = var13.field4902[var18 - 1];
                                        int var52 = (var51 >> 8) + var15;
                                        int var53 = (var51 & 0xFF) + var52;
                                        var46 = var23 > var52 && var23 < var53;
                                    }
                                    if (var47 && var46) {
                                        var36 = class46.field653[0];
                                    } else if (var47) {
                                        var36 = class46.field653[1];
                                    } else if (var46) {
                                        var36 = class46.field653[1];
                                    }
                                } else {
                                    boolean var38 = var23 - 1 >= var21;
                                    boolean var39 = var22 >= (var23 + 1);
                                    if (!var38 && (var19 - 1) >= var16) {
                                        short var40 = var13.field4902[var18 - 1];
                                        int var41 = (var40 >> 8) + var15;
                                        int var42 = var41 + (var40 & 0xFF);
                                        var38 = var41 < var23 && var42 > var23;
                                    }
                                    if (!var39 && var17 >= (var19 + 1)) {
                                        short var43 = var13.field4902[var18 + 1];
                                        int var44 = (var43 >> 8) + var15;
                                        int var45 = (var43 & 0xFF) + var44;
                                        var39 = var23 > var44 && var45 > var23;
                                    }
                                    if (var38 && var39) {
                                        var36 = class46.field653[0];
                                    } else if (var38) {
                                        var36 = class46.field653[1];
                                    } else if (var39) {
                                        var36 = class46.field653[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field379 += (var36.length >> 1) * 3 - 6;
                                    var14.field386 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var34 = class46.field653[arg1[var23][var19]];
                            int[] var35 = class303.field4691[arg1[var23][var19]];
                            var14.field379 += (var34.length >> 1) * 3 - 6;
                            var14.field379 += (var35.length >> 1) * 3 - 6;
                            var14.field386 += var34.length >> 1;
                            var14.field386 += var35.length >> 1;
                        } else {
                            int[] var33 = class46.field653[0];
                            var14.field379 += ((var33.length >> 1) - 2) * 3;
                            var14.field386 += var33.length >> 1;
                        }
                    }
                    var18++;
                }
                int var56 = 0;
                var14.method231();
                if ((var13.field4913 >> 7) - var13.field4893 < 0) {
                    var56 -= (var13.field4913 >> 7) - var13.field4893;
                }
                for (int var57 = var16; var57 <= var17; var57++) {
                    short var58 = var13.field4902[var56];
                    int var59 = var15 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg8[var61][var57];
                        int var63 = arg9[var61][var57] & 0xFF;
                        int var64 = arg11[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class319 var68 = class29.method223((byte) -28, var64 - 1);
                            if (var68.field5005 == -1) {
                                continue;
                            }
                            if (arg1[var61][var57] != 0) {
                                class36.method260(var61, class46.field653[arg1[var61][var57]], arg5, var57, arg7, var13, var14, arg0, 1, arg8[var61][var57], arg10);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class319 var66 = class29.method223((byte) -28, var64 - 1);
                            if (var66.field5005 == -1) {
                                class36.method260(var61, class303.field4691[arg1[var61][var57]], arg5, var57, arg7, var13, var14, arg0, 1, arg8[var61][var57], arg10);
                                continue;
                            }
                            byte var67 = arg1[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class272 var69 = class298.method1964(arg4, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4183 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4183 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = (var61 - 1) >= var59;
                                    boolean var74 = var61 + 1 <= var60;
                                    if (!var73 && var57 + 1 <= var17) {
                                        short var75 = var13.field4902[var56 + 1];
                                        int var76 = (var75 >> 8) + var15;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var76 < var61 && var61 < var77;
                                    }
                                    if (!var74 && var57 - 1 >= var16) {
                                        short var78 = var13.field4902[var56 - 1];
                                        int var79 = (var78 >> 8) + var15;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class46.field653[0];
                                    } else if (var73) {
                                        var71 = class46.field653[1];
                                        var62 = 1;
                                    } else if (var74) {
                                        var71 = class46.field653[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var81 = (var61 - 1) >= var59;
                                    if (!var81 && var16 <= (var57 - 1)) {
                                        short var82 = var13.field4902[var56 - 1];
                                        int var83 = (var82 >> 8) + var15;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var83 < var61 && var61 < var84;
                                    }
                                    boolean var85 = var60 >= (var61 + 1);
                                    if (!var85 && var17 >= var57 + 1) {
                                        short var86 = var13.field4902[var56 + 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var85 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var85) {
                                        var71 = class46.field653[0];
                                    } else if (var81) {
                                        var71 = class46.field653[1];
                                        var62 = 0;
                                    } else if (var85) {
                                        var71 = class46.field653[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class36.method260(var61, var71, arg5, var57, arg7, var13, var14, arg0, 1, var62, arg10);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class36.method260(var61, class303.field4691[arg1[var61][var57]], arg5, var57, arg7, var13, var14, arg0, 1, arg8[var61][var57], arg10);
                            class36.method260(var61, class46.field653[arg1[var61][var57]], arg5, var57, arg7, var13, var14, arg0, 1, arg8[var61][var57], arg10);
                        } else {
                            class36.method260(var61, class46.field653[0], arg5, var57, arg7, var13, var14, arg0, arg2 ^ 0x1, var62, arg10);
                        }
                    }
                    var56++;
                }
                if (var14.field389 > 0 && var14.field385 > 0) {
                    var14.method233();
                    var13.field4892 = var14;
                }
            }
        }
        field1424++;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljf;)V", line = 614)
    public class92(class227 arg0) {
        this.field1425 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLgn;)V", line = 626)
    public static final void method632(byte arg0, class303 arg1) {
        for (int var2 = 0; var2 < class305.field4776; var2++) {
            int var3 = arg1.method2003(125);
            int var4 = arg1.method1994(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class138.field2134[var3] != null) {
                class138.field2134[var3].field4228 = var4;
            }
        }
        if (arg0 <= 102) {
            field1427 = (Thread) null;
        }
        field1430++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)Lsn;", line = 653)
    public final class187 method633(boolean arg0) {
        if (!arg0) {
            field1421 = (int[]) null;
        }
        this.field1426 = 0;
        field1422++;
        return this.method629((byte) -126);
    }
}
