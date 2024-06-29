import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class27 extends class262 {

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    private int field463 = 1;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    private int field473 = 1;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "[I")
    public static int[] field464 = new int[2];

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "Lok;")
    public static class146 field471 = class235.method1724(-12908, "M");

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "[Lok;")
    public static class146[] field472 = new class146[8];

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Lwe;")
    public static class47 field467 = new class47(new byte[5000]);

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "[J")
    public static long[] field477 = new long[32];

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field478 = 2;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field479 = 255;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Loh;")
    public static class15 field476;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lci;")
    public static class194 field475;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "[Lan;")
    public static class315[] field468;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 586)
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lwe;II)V", line = 25)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field463 = arg0.method368(-96);
        } else if (arg2 == 1) {
            this.field473 = arg0.method368(116);
        } else if (arg2 == 2) {
            this.field4365 = arg0.method368(64) == 1;
        }
        if (arg1 != 2048) {
            this.field473 = 55;
        }
        field465++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[[B[[F[[FIB[[B[Ls;[[I[[B[[F[[B)V", line = 61)
    public static final void method176(int arg0, byte[][] arg1, float[][] arg2, float[][] arg3, int arg4, byte arg5, byte[][] arg6, class266[] arg7, int[][] arg8, byte[][] arg9, float[][] arg10, byte[][] arg11) {
        if (arg5 >= -121) {
            field475 = (class194) null;
        }
        for (int var12 = 0; var12 < arg4; var12++) {
            class266 var13 = arg7[var12];
            if (var13.field4568 == arg0) {
                int var14 = 0;
                class61 var15 = new class61();
                int var16 = (var13.field4578 >> 7) - var13.field4565;
                if (var16 < 0) {
                    var14 -= var16;
                    var16 = 0;
                }
                int var17 = (var13.field4578 >> 7) + var13.field4565;
                int var18 = (var13.field4583 >> 7) - var13.field4565;
                if (var17 > 103) {
                    var17 = 103;
                }
                for (int var19 = var16; var19 <= var17; var19++) {
                    short var20 = var13.field4571[var14];
                    int var21 = (var20 >> 8) + var18;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg1[var23][var19] & 0xFF;
                        int var25 = arg6[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class9 var27 = class126.method865(-30465, var25 - 1);
                            if (var27.field180 == -1) {
                                continue;
                            }
                            if (arg11[var23][var19] != 0) {
                                int[] var28 = class18.field361[arg11[var23][var19]];
                                var15.field1051 += ((var28.length >> 1) - 2) * 3;
                                var15.field1037 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class9 var29 = class126.method865(-30465, var25 - 1);
                            if (var29.field180 == -1) {
                                byte var31 = arg11[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class213.field3517[var31];
                                    var15.field1051 += (var32.length >> 1) * 3 - 6;
                                    var15.field1037 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg11[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class311 var33 = class40.method285(arg0, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field5289 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field5289 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = (var23 - 1) >= var21;
                                    boolean var46 = var22 >= var23 + 1;
                                    if (!var45 && var17 >= (var19 + 1)) {
                                        short var47 = var13.field4571[var14 + 1];
                                        int var48 = (var47 >> 8) + var18;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var45 = var48 < var23 && var23 < var49;
                                    }
                                    if (!var46 && var19 - 1 >= var16) {
                                        short var50 = var13.field4571[var14 - 1];
                                        int var51 = (var50 >> 8) + var18;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var46 = var23 > var51 && var52 > var23;
                                    }
                                    if (var45 && var46) {
                                        var35 = class18.field361[0];
                                    } else if (var45) {
                                        var35 = class18.field361[1];
                                    } else if (var46) {
                                        var35 = class18.field361[1];
                                    }
                                } else {
                                    boolean var37 = var23 - 1 >= var21;
                                    boolean var38 = (var23 + 1) <= var22;
                                    if (!var37 && var19 - 1 >= var16) {
                                        short var39 = var13.field4571[var14 - 1];
                                        int var40 = (var39 >> 8) + var18;
                                        int var41 = var40 + (var39 & 0xFF);
                                        var37 = var40 < var23 && var23 < var41;
                                    }
                                    if (!var38 && (var19 + 1) <= var17) {
                                        short var42 = var13.field4571[var14 + 1];
                                        int var43 = var18 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var38 = var43 < var23 && var44 > var23;
                                    }
                                    if (var37 && var38) {
                                        var35 = class18.field361[0];
                                    } else if (var37) {
                                        var35 = class18.field361[1];
                                    } else if (var38) {
                                        var35 = class18.field361[1];
                                    }
                                }
                                if (var35 != null) {
                                    var15.field1051 += (var35.length >> 1) * 3 - 6;
                                    var15.field1037 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class18.field361[arg11[var23][var19]];
                            int[] var55 = class213.field3517[arg11[var23][var19]];
                            var15.field1051 += ((var54.length >> 1) - 2) * 3;
                            var15.field1051 += (var55.length >> 1) * 3 - 6;
                            var15.field1037 += var54.length >> 1;
                            var15.field1037 += var55.length >> 1;
                        } else {
                            int[] var53 = class18.field361[0];
                            var15.field1051 += (var53.length >> 1) * 3 - 6;
                            var15.field1037 += var53.length >> 1;
                        }
                    }
                    var14++;
                }
                var15.method472();
                int var56 = 0;
                if ((var13.field4578 >> 7) - var13.field4565 < 0) {
                    var56 -= (var13.field4578 >> 7) - var13.field4565;
                }
                for (int var57 = var16; var57 <= var17; var57++) {
                    short var58 = var13.field4571[var56];
                    int var59 = (var58 >> 8) + var18;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg9[var61][var57];
                        int var63 = arg1[var61][var57] & 0xFF;
                        int var64 = arg6[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class9 var68 = class126.method865(-30465, var64 - 1);
                            if (var68.field180 == -1) {
                                continue;
                            }
                            if (arg11[var61][var57] != 0) {
                                class225.method1660(arg10, var13, var57, arg9[var61][var57], var61, arg8, arg2, 1, class18.field361[arg11[var61][var57]], var15, arg3);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class9 var66 = class126.method865(-30465, var64 - 1);
                            if (var66.field180 == -1) {
                                class225.method1660(arg10, var13, var57, arg9[var61][var57], var61, arg8, arg2, 1, class213.field3517[arg11[var61][var57]], var15, arg3);
                                continue;
                            }
                            byte var67 = arg11[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class311 var69 = class40.method285(arg0, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field5289 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field5289 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var59 <= var61 - 1;
                                    boolean var82 = var60 >= var61 + 1;
                                    if (!var81 && var57 + 1 <= var17) {
                                        short var83 = var13.field4571[var56 + 1];
                                        int var84 = (var83 >> 8) + var18;
                                        int var85 = var84 + (var83 & 0xFF);
                                        var81 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var82 && var16 <= (var57 - 1)) {
                                        short var86 = var13.field4571[var56 - 1];
                                        int var87 = (var86 >> 8) + var18;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var71 = class18.field361[0];
                                    } else if (var81) {
                                        var71 = class18.field361[1];
                                        var62 = 1;
                                    } else if (var82) {
                                        var71 = class18.field361[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = var60 >= (var61 + 1);
                                    boolean var74 = var59 <= (var61 - 1);
                                    if (!var74 && (var57 - 1) >= var16) {
                                        short var75 = var13.field4571[var56 - 1];
                                        int var76 = (var75 >> 8) + var18;
                                        int var77 = var76 + (var75 & 0xFF);
                                        var74 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var73 && var17 >= var57 + 1) {
                                        short var78 = var13.field4571[var56 + 1];
                                        int var79 = (var78 >> 8) + var18;
                                        int var80 = var79 + (var78 & 0xFF);
                                        var73 = var79 < var61 && var80 > var61;
                                    }
                                    if (var74 && var73) {
                                        var71 = class18.field361[0];
                                    } else if (var74) {
                                        var71 = class18.field361[1];
                                        var62 = 0;
                                    } else if (var73) {
                                        var62 = 2;
                                        var71 = class18.field361[1];
                                    }
                                }
                                if (var71 != null) {
                                    class225.method1660(arg10, var13, var57, var62, var61, arg8, arg2, 1, var71, var15, arg3);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class225.method1660(arg10, var13, var57, arg9[var61][var57], var61, arg8, arg2, 1, class213.field3517[arg11[var61][var57]], var15, arg3);
                            class225.method1660(arg10, var13, var57, arg9[var61][var57], var61, arg8, arg2, 1, class18.field361[arg11[var61][var57]], var15, arg3);
                        } else {
                            class225.method1660(arg10, var13, var57, var62, var61, arg8, arg2, 1, class18.field361[0], var15, arg3);
                        }
                    }
                    var56++;
                }
                if (var15.field1045 > 0 && var15.field1038 > 0) {
                    var15.method470();
                    var13.field4570 = var15;
                }
            }
        }
        field470++;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)[[I", line = 591)
    public final int[][] method87(int arg0, int arg1) {
        field474++;
        if (arg0 != 7) {
            method176(-106, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), -80, (byte) -31, (byte[][]) ((byte[][]) null), (class266[]) null, (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null));
        }
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int var4 = this.field473 + this.field473 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field463 + this.field463 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field473; var9 <= arg1 + this.field473; var9++) {
                int[][] var10 = this.method1893(0, class259.field4297 & var9, -122);
                int var11 = 0;
                int[][] var12 = new int[3][class98.field1598];
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field463; var18 <= this.field463; var18++) {
                    int var19 = class218.field3595 & var18;
                    var13 += var16[var19];
                    var11 += var15[var19];
                    var14 += var17[var19];
                }
                int[] var20 = var12[0];
                int[] var21 = var12[2];
                int[] var22 = var12[1];
                int var23 = 0;
                while (var23 < class98.field1598) {
                    var20[var23] = var8 * var11 >> 16;
                    var22[var23] = var8 * var13 >> 16;
                    var21[var23] = var8 * var14 >> 16;
                    int var24 = var23 - this.field463 & class218.field3595;
                    var23++;
                    int var25 = var13 - var16[var24];
                    int var26 = var11 - var15[var24];
                    int var27 = var14 - var17[var24];
                    int var28 = class218.field3595 & this.field463 + var23;
                    var13 = var16[var28] + var25;
                    var11 = var15[var28] + var26;
                    var14 = var17[var28] + var27;
                }
                var7[var9 + this.field473 - arg1] = var12;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class98.field1598; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var7[var36];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                }
                var31[var32] = var5 * var33 >> 16;
                var29[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V", line = 733)
    public static void method177(int arg0) {
        field471 = null;
        field464 = null;
        field467 = null;
        field472 = null;
        field475 = null;
        if (arg0 != 0) {
            method178(117, 61, 54, -122, -101, 114, false, 25, -61, 127, 76, 17);
        }
        field476 = null;
        field477 = null;
        field468 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[I", line = 766)
    public final int[] method38(int arg0, byte arg1) {
        int[] var3 = this.field4350.method1532(arg0, (byte) 117);
        if (this.field4350.field3333) {
            int var4 = this.field473 + this.field473 + 1;
            int var5 = this.field463 + this.field463 + 1;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field473; var9 <= this.field473 + arg0; var9++) {
                int[] var10 = this.method1895(7, 0, class259.field4297 & var9);
                int[] var11 = new int[class98.field1598];
                int var12 = 0;
                for (int var13 = -this.field463; var13 <= this.field463; var13++) {
                    var12 += var10[var13 & class218.field3595];
                }
                int var14 = 0;
                while (var14 < class98.field1598) {
                    var11[var14] = var6 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field463 & class218.field3595];
                    var14++;
                    var12 = var10[this.field463 + var14 & class218.field3595] + var15;
                }
                var8[var9 - (arg0 - this.field473)] = var11;
            }
            for (int var16 = 0; var16 < class98.field1598; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var7 * var17 >> 16;
            }
        }
        field462++;
        if (arg1 >= -85) {
            this.field463 = 92;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIZIIIII)Z", line = 853)
    public static final boolean method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field469++;
        int var12 = 74 % ((88 - arg0) / 35);
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class318.field5395[var13][var14] = 0;
                class98.field1588[var13][var14] = 99999999;
            }
        }
        int var15 = arg9;
        byte var16 = 0;
        int var17 = arg8;
        class318.field5395[arg9][arg8] = 99;
        class98.field1588[arg9][arg8] = 0;
        int var18 = 0;
        class191.field3162[var16] = arg9;
        int var33 = var16 + 1;
        class300.field5077[var16] = arg8;
        boolean var19 = false;
        int[][] var20 = class251.field4202[class203.field3387].field2392;
        while (var33 != var18) {
            var17 = class300.field5077[var18];
            var15 = class191.field3162[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == var15 && arg5 == var17) {
                var19 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class251.field4202[class203.field3387].method1067(arg10, var15, 160, arg1, 1, arg5, arg7 - 1, var17)) {
                    var19 = true;
                    break;
                }
                if (arg7 < 10 && class251.field4202[class203.field3387].method1061(var17, arg5, 1, arg7 - 1, var15, arg1, arg10, (byte) 106)) {
                    var19 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg2 != 0 && class251.field4202[class203.field3387].method1072(arg1, 1, arg5, arg4, arg2, (byte) -68, var17, arg11, var15)) {
                var19 = true;
                break;
            }
            int var21 = class98.field1588[var15][var17] + 1;
            if (var15 > 0 && class318.field5395[var15 - 1][var17] == 0 && (var20[var15 - 1][var17] & 0x12C0108) == 0) {
                class191.field3162[var33] = var15 - 1;
                class300.field5077[var33] = var17;
                class318.field5395[var15 - 1][var17] = 2;
                class98.field1588[var15 - 1][var17] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var15 < 103 && class318.field5395[var15 + 1][var17] == 0 && (var20[var15 + 1][var17] & 0x12C0180) == 0) {
                class191.field3162[var33] = var15 + 1;
                class300.field5077[var33] = var17;
                class318.field5395[var15 + 1][var17] = 8;
                class98.field1588[var15 + 1][var17] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var17 > 0 && class318.field5395[var15][var17 - 1] == 0 && (var20[var15][var17 - 1] & 0x12C0102) == 0) {
                class191.field3162[var33] = var15;
                class300.field5077[var33] = var17 - 1;
                class318.field5395[var15][var17 - 1] = 1;
                var33 = var33 + 1 & 0xFFF;
                class98.field1588[var15][var17 - 1] = var21;
            }
            if (var17 < 103 && class318.field5395[var15][var17 + 1] == 0 && (var20[var15][var17 + 1] & 0x12C0120) == 0) {
                class191.field3162[var33] = var15;
                class300.field5077[var33] = var17 + 1;
                class318.field5395[var15][var17 + 1] = 4;
                var33 = var33 + 1 & 0xFFF;
                class98.field1588[var15][var17 + 1] = var21;
            }
            if (var15 > 0 && var17 > 0 && class318.field5395[var15 - 1][var17 - 1] == 0 && (var20[var15 - 1][var17 - 1] & 0x12C010E) == 0 && (var20[var15 - 1][var17] & 0x12C0108) == 0 && (var20[var15][var17 - 1] & 0x12C0102) == 0) {
                class191.field3162[var33] = var15 - 1;
                class300.field5077[var33] = var17 - 1;
                class318.field5395[var15 - 1][var17 - 1] = 3;
                var33 = var33 + 1 & 0xFFF;
                class98.field1588[var15 - 1][var17 - 1] = var21;
            }
            if (var15 < 103 && var17 > 0 && class318.field5395[var15 + 1][var17 - 1] == 0 && (var20[var15 + 1][var17 - 1] & 0x12C0183) == 0 && (var20[var15 + 1][var17] & 0x12C0180) == 0 && (var20[var15][var17 - 1] & 0x12C0102) == 0) {
                class191.field3162[var33] = var15 + 1;
                class300.field5077[var33] = var17 - 1;
                class318.field5395[var15 + 1][var17 - 1] = 9;
                class98.field1588[var15 + 1][var17 - 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var15 > 0 && var17 < 103 && class318.field5395[var15 - 1][var17 + 1] == 0 && (var20[var15 - 1][var17 + 1] & 0x12C0138) == 0 && (var20[var15 - 1][var17] & 0x12C0108) == 0 && (var20[var15][var17 + 1] & 0x12C0120) == 0) {
                class191.field3162[var33] = var15 - 1;
                class300.field5077[var33] = var17 + 1;
                class318.field5395[var15 - 1][var17 + 1] = 6;
                var33 = var33 + 1 & 0xFFF;
                class98.field1588[var15 - 1][var17 + 1] = var21;
            }
            if (var15 < 103 && var17 < 103 && class318.field5395[var15 + 1][var17 + 1] == 0 && (var20[var15 + 1][var17 + 1] & 0x12C01E0) == 0 && (var20[var15 + 1][var17] & 0x12C0180) == 0 && (var20[var15][var17 + 1] & 0x12C0120) == 0) {
                class191.field3162[var33] = var15 + 1;
                class300.field5077[var33] = var17 + 1;
                var33 = var33 + 1 & 0xFFF;
                class318.field5395[var15 + 1][var17 + 1] = 12;
                class98.field1588[var15 + 1][var17 + 1] = var21;
            }
        }
        class201.field3352 = 0;
        if (!var19) {
            if (!arg6) {
                return false;
            }
            int var22 = 1000;
            int var23 = 100;
            byte var24 = 10;
            for (int var25 = arg1 - var24; var25 <= arg1 + var24; var25++) {
                for (int var26 = arg5 - var24; var26 <= arg5 + var24; var26++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && class98.field1588[var25][var26] < 100) {
                        int var27 = 0;
                        if (var25 < arg1) {
                            var27 = arg1 - var25;
                        } else if (arg1 + arg11 - 1 < var25) {
                            var27 = var25 - arg1 - (arg11 - 1);
                        }
                        int var28 = 0;
                        if (arg5 > var26) {
                            var28 = arg5 - var26;
                        } else if (var26 > (arg2 + arg5 - 1)) {
                            var28 = var26 - (arg2 + arg5 - 1);
                        }
                        int var29 = var27 * var27 + var28 * var28;
                        if (var29 < var22 || var22 == var29 && class98.field1588[var25][var26] < var23) {
                            var15 = var25;
                            var17 = var26;
                            var23 = class98.field1588[var25][var26];
                            var22 = var29;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg9 == var15 && arg8 == var17) {
                return false;
            }
            class201.field3352 = 1;
        }
        byte var30 = 0;
        class191.field3162[var30] = var15;
        int var34 = var30 + 1;
        class300.field5077[var30] = var17;
        int var31;
        int var32 = var31 = class318.field5395[var15][var17];
        while (arg9 != var15 || arg8 != var17) {
            if (var31 != var32) {
                class191.field3162[var34] = var15;
                class300.field5077[var34++] = var17;
                var31 = var32;
            }
            if ((var32 & 0x2) != 0) {
                var15++;
            } else if ((var32 & 0x8) != 0) {
                var15--;
            }
            if ((var32 & 0x1) != 0) {
                var17++;
            } else if ((var32 & 0x4) != 0) {
                var17--;
            }
            var32 = class318.field5395[var15][var17];
        }
        if (var34 > 0) {
            class313.method2197(arg3, 0, var34);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
