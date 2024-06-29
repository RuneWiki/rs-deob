import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class116 extends class176 {

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private int field1902 = 0;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    private int field1913 = 0;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Z")
    public boolean field1911 = false;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    private int field1918 = -32768;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    private int field1906;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Lqg;")
    private class129 field1900;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field1899 = 2;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Ltl;")
    private static class59 field1907 = class85.method639("Loaded input handler", 9588);

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Ltl;")
    private static class59 field1904 = class85.method639("M", 9588);

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "Ltl;")
    public static class59 field1908 = field1907;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Ltl;")
    public static class59 field1914 = field1904;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
    public static int[] field1915 = new int[2000];

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Ltl;")
    public static class59 field1920 = field1904;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[B[[BI[[BII[[I[[F[[F[[B[Luf;[[F)V", line = 19)
    public static final void method869(byte[][] arg0, byte[][] arg1, int arg2, byte[][] arg3, int arg4, int arg5, int[][] arg6, float[][] arg7, float[][] arg8, byte[][] arg9, class211[] arg10, float[][] arg11) {
        for (int var12 = 0; var12 < arg5; var12++) {
            class211 var13 = arg10[var12];
            if (var13.field3447 == arg2) {
                class136 var14 = new class136();
                int var15 = (var13.field3443 >> 7) - var13.field3433;
                int var16 = 0;
                int var17 = (var13.field3441 >> 7) - var13.field3433;
                int var18 = (var13.field3441 >> 7) + var13.field3433;
                if (var18 > 103) {
                    var18 = 103;
                }
                if (var17 < 0) {
                    var16 -= var17;
                    var17 = 0;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field3459[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg0[var23][var19] & 0xFF;
                        int var25 = arg9[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class34 var31 = class289.method2008(var25 - 1, 4);
                            if (var31.field500 == -1) {
                                continue;
                            }
                            if (arg1[var23][var19] != 0) {
                                int[] var32 = class94.field1450[arg1[var23][var19]];
                                var14.field2246 += ((var32.length >> 1) - 2) * 3;
                                var14.field2247 += var32.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class34 var27 = class289.method2008(var25 - 1, 4);
                            if (var27.field500 == -1) {
                                byte var28 = arg1[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class223.field3625[var28];
                                    var14.field2246 += ((var29.length >> 1) - 2) * 3;
                                    var14.field2247 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg1[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class165 var33 = class284.method1987(arg2, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field2673 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field2673 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = var23 - 1 >= var21;
                                    boolean var46 = var23 + 1 <= var22;
                                    if (!var45 && var19 + 1 <= var18) {
                                        short var47 = var13.field3459[var16 + 1];
                                        int var48 = (var47 >> 8) + var15;
                                        int var49 = var48 + (var47 & 0xFF);
                                        var45 = var23 > var48 && var23 < var49;
                                    }
                                    if (!var46 && var17 <= (var19 - 1)) {
                                        short var50 = var13.field3459[var16 - 1];
                                        int var51 = (var50 >> 8) + var15;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var46 = var23 > var51 && var23 < var52;
                                    }
                                    if (var45 && var46) {
                                        var35 = class94.field1450[0];
                                    } else if (var45) {
                                        var35 = class94.field1450[1];
                                    } else if (var46) {
                                        var35 = class94.field1450[1];
                                    }
                                } else {
                                    boolean var37 = var22 >= (var23 + 1);
                                    boolean var38 = var21 <= var23 - 1;
                                    if (!var38 && var19 - 1 >= var17) {
                                        short var39 = var13.field3459[var16 - 1];
                                        int var40 = (var39 >> 8) + var15;
                                        int var41 = (var39 & 0xFF) + var40;
                                        var38 = var23 > var40 && var23 < var41;
                                    }
                                    if (!var37 && (var19 + 1) <= var18) {
                                        short var42 = var13.field3459[var16 + 1];
                                        int var43 = (var42 >> 8) + var15;
                                        int var44 = var43 + (var42 & 0xFF);
                                        var37 = var23 > var43 && var23 < var44;
                                    }
                                    if (var38 && var37) {
                                        var35 = class94.field1450[0];
                                    } else if (var38) {
                                        var35 = class94.field1450[1];
                                    } else if (var37) {
                                        var35 = class94.field1450[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field2246 += (var35.length >> 1) * 3 - 6;
                                    var14.field2247 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class94.field1450[arg1[var23][var19]];
                            int[] var55 = class223.field3625[arg1[var23][var19]];
                            var14.field2246 += (var54.length >> 1) * 3 - 6;
                            var14.field2246 += (var55.length >> 1) * 3 - 6;
                            var14.field2247 += var54.length >> 1;
                            var14.field2247 += var55.length >> 1;
                        } else {
                            int[] var53 = class94.field1450[0];
                            var14.field2246 += (var53.length >> 1) * 3 - 6;
                            var14.field2247 += var53.length >> 1;
                        }
                    }
                    var16++;
                }
                var14.method992();
                int var56 = 0;
                if (((var13.field3441 >> 7) - var13.field3433) < 0) {
                    var56 -= (var13.field3441 >> 7) - var13.field3433;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field3459[var56];
                    int var59 = var15 + (var58 >> 8);
                    int var60 = var59 + (var58 & 0xFF) - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg0[var61][var57] & 0xFF;
                        byte var63 = arg3[var61][var57];
                        int var64 = arg9[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var62 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class34 var66 = class289.method2008(var64 - 1, 4);
                            if (var66.field500 == -1) {
                                continue;
                            }
                            if (arg1[var61][var57] != 0) {
                                class150.method1081(arg7, arg3[var61][var57], arg6, class94.field1450[arg1[var61][var57]], 1, var13, arg11, var57, var14, arg8, var61);
                                continue;
                            }
                        } else if (var64 == 0) {
                            var63 = 0;
                        } else {
                            class34 var67 = class289.method2008(var64 - 1, 4);
                            if (var67.field500 == -1) {
                                class150.method1081(arg7, arg3[var61][var57], arg6, class223.field3625[arg1[var61][var57]], 1, var13, arg11, var57, var14, arg8, var61);
                                continue;
                            }
                            byte var68 = arg1[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class165 var69 = class284.method1987(arg2, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field2673 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field2673 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var73 = var59 <= (var61 - 1);
                                    if (!var73 && (var57 + 1) <= var18) {
                                        short var74 = var13.field3459[var56 + 1];
                                        int var75 = (var74 >> 8) + var15;
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var61 > var75 && var76 > var61;
                                    }
                                    boolean var77 = var60 >= (var61 + 1);
                                    if (!var77 && (var57 - 1) >= var17) {
                                        short var78 = var13.field3459[var56 - 1];
                                        int var79 = (var78 >> 8) + var15;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var79 < var61 && var80 > var61;
                                    }
                                    if (var73 && var77) {
                                        var72 = class94.field1450[0];
                                    } else if (var73) {
                                        var63 = 1;
                                        var72 = class94.field1450[1];
                                    } else if (var77) {
                                        var63 = 3;
                                        var72 = class94.field1450[1];
                                    }
                                } else {
                                    boolean var81 = var59 <= (var61 - 1);
                                    if (!var81 && var17 <= var57 - 1) {
                                        short var82 = var13.field3459[var56 - 1];
                                        int var83 = (var82 >> 8) + var15;
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var83 < var61 && var84 > var61;
                                    }
                                    boolean var85 = var61 + 1 <= var60;
                                    if (!var85 && var18 >= var57 + 1) {
                                        short var86 = var13.field3459[var56 + 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var85 = var61 > var87 && var61 < var88;
                                    }
                                    if (var81 && var85) {
                                        var72 = class94.field1450[0];
                                    } else if (var81) {
                                        var72 = class94.field1450[1];
                                        var63 = 0;
                                    } else if (var85) {
                                        var63 = 2;
                                        var72 = class94.field1450[1];
                                    }
                                }
                                if (var72 != null) {
                                    class150.method1081(arg7, var63, arg6, var72, 1, var13, arg11, var57, var14, arg8, var61);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class150.method1081(arg7, arg3[var61][var57], arg6, class223.field3625[arg1[var61][var57]], 1, var13, arg11, var57, var14, arg8, var61);
                            class150.method1081(arg7, arg3[var61][var57], arg6, class94.field1450[arg1[var61][var57]], 1, var13, arg11, var57, var14, arg8, var61);
                        } else {
                            class150.method1081(arg7, var63, arg6, class94.field1450[0], 1, var13, arg11, var57, var14, arg8, var61);
                        }
                    }
                    var56++;
                }
                if (var14.field2245 > 0 && var14.field2241 > 0) {
                    var14.method995();
                    var13.field3457 = var14;
                }
            }
        }
        if (arg4 != 1) {
            method872((class170) null, 68);
        }
        field1917++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIII)V", line = 699)
    public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1919 = arg1;
        this.field1906 = arg0;
        this.field1896 = arg3;
        this.field1903 = arg2;
        this.field1910 = arg4;
        this.field1905 = arg5 + arg6;
        int var8 = class221.method1533(this.field1906, (byte) -44).field5250;
        if (var8 == -1) {
            this.field1911 = true;
        } else {
            this.field1911 = false;
            this.field1900 = class265.method1834((byte) -39, var8);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIJ)V", line = 569)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1912++;
        class57 var11 = this.method873(255);
        if (var11 != null) {
            var11.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1918 = var11.method152();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 587)
    public static void method870(int arg0) {
        field1907 = null;
        field1908 = null;
        if (arg0 != -1) {
            method869((byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), 126, (byte[][]) ((byte[][]) null), -71, -60, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (class211[]) null, (float[][]) ((float[][]) null));
        }
        field1915 = null;
        field1914 = null;
        field1920 = null;
        field1904 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V", line = 605)
    public final void method871(int arg0, int arg1) {
        field1894++;
        if (this.field1911) {
            return;
        }
        int var3 = -15 % ((-arg1) / 39);
        this.field1913 += arg0;
        while (this.field1900.field2132[this.field1902] < this.field1913) {
            this.field1913 -= this.field1900.field2132[this.field1902];
            this.field1902++;
            if (this.field1902 >= this.field1900.field2118.length) {
                this.field1911 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ls;I)Lta;", line = 650)
    public static final class262 method872(class170 arg0, int arg1) {
        if (arg1 > -1) {
            method870(-115);
        }
        field1916++;
        return new class262(arg0.method1210(-107), arg0.method1210(-127), arg0.method1210(-122), arg0.method1210(-98), arg0.method1210(-127), arg0.method1210(-85), arg0.method1210(-96), arg0.method1210(-122), arg0.method1208((byte) -117), arg0.method1221(71));
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Lca;", line = 669)
    private final class57 method873(int arg0) {
        field1909++;
        class310 var2 = class221.method1533(this.field1906, (byte) -44);
        class57 var3;
        if (this.field1911) {
            var3 = var2.method2141(0, -1);
        } else {
            var3 = var2.method2141(0, this.field1902);
        }
        if (var3 == null) {
            return null;
        } else if (arg0 == 255) {
            return var3;
        } else {
            return (class57) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()I", line = 723)
    public final int method152() {
        field1897++;
        return this.field1918;
    }
}
