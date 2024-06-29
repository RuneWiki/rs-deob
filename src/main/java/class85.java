import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class85 {

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
    private int[] field1017 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "[I")
    private int[] field1020 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "Z")
    public boolean field1035;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "Lcq;")
    private class107 field1030;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Llp;")
    private class202 field1018;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "[[[B")
    private byte[][][] field1041;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "[[[B")
    private byte[][][] field1013;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "[[[B")
    private byte[][][] field1014;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "[[[B")
    public byte[][][] field1036;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "[[[I")
    public int[][][] field1034;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "[[[B")
    private byte[][][] field1022;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lmo;")
    public static class361 field1021 = new class361("WTWIP", 3);

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "Lwv;")
    public static class423 field1028 = null;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "[Z")
    public static boolean[] field1029 = new boolean[100];

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "Lga;")
    public static class332 field1045;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "[[[B")
    public byte[][][] field1044;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
    public static final int method455(int arg0, int arg1) {
        field1023++;
        int var2 = -43 % ((arg1 + 1) / 35);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIIIIIBILio;II)V")
    private final void method456(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class157 arg8, int arg9, int arg10) {
        if (arg1 == 1) {
            arg10 = 1;
        } else if (arg1 == 2) {
            arg4 = 1;
            arg10 = 1;
        } else if (arg1 == 3) {
            arg4 = 1;
        }
        field1015++;
        if (arg6 != -48) {
            this.field1014 = null;
        }
        if (arg9 < 0 || this.field1025 <= arg9 || arg5 < 0 || arg5 >= this.field1039) {
            while (true) {
                int var14 = arg8.method930(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method930(255);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method930(255);
                }
            }
        }
        if (!this.field1035 && !arg0) {
            class31.field440[arg7][arg9][arg5] = 0;
        }
        while (true) {
            int var12 = arg8.method930(255);
            if (var12 == 0) {
                if (this.field1035) {
                    this.field1034[0][arg4 + arg9][arg5 + arg10] = 0;
                    return;
                } else if (arg7 == 0) {
                    this.field1034[0][arg4 + arg9][arg5 + arg10] = -class581.method3211(arg2 + 556238, arg3 + 932731, true) * 8 << 2;
                    return;
                } else {
                    this.field1034[arg7][arg4 + arg9][arg5 + arg10] = this.field1034[arg7 - 1][arg4 + arg9][arg5 + arg10] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method930(255);
                if (this.field1035) {
                    this.field1034[0][arg9 + arg4][arg5 + arg10] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg7 != 0) {
                    this.field1034[arg7][arg4 + arg9][arg5 + arg10] = this.field1034[arg7 - 1][arg4 + arg9][arg5 + arg10] - (var13 * 8 << 2);
                    return;
                }
                this.field1034[0][arg4 + arg9][arg5 + arg10] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg0) {
                    arg8.method930(arg6 ^ 0xFFFFFF2F);
                } else {
                    this.field1022[arg7][arg9][arg5] = arg8.method969(3);
                    this.field1041[arg7][arg9][arg5] = (byte) ((var12 - 2) / 4);
                    this.field1014[arg7][arg9][arg5] = (byte) class15.method97(3, var12 + arg1 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field1035 && !arg0) {
                    class31.field440[arg7][arg9][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg0) {
                this.field1013[arg7][arg9][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILi;I[[ILi;Lr;Li;)V")
    private final void method457(int arg0, class270 arg1, int arg2, int[][] arg3, class270 arg4, class562 arg5, class270 arg6) {
        field1026++;
        byte[][] var8 = this.field1041[arg0];
        byte[][] var9 = this.field1014[arg0];
        byte[][] var10 = this.field1013[arg0];
        byte[][] var11 = this.field1022[arg0];
        if (arg2 < 23) {
            return;
        }
        for (int var12 = 0; var12 < this.field1025; var12++) {
            int var13 = this.field1025 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field1039; var14++) {
                int var15 = var14 >= (this.field1039 - 1) ? var14 : var14 + 1;
                if (class643.field8886 == -1 || class452.method2541(class643.field8886, var14, arg0, var12, 0)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class425 var26 = var21 == 0 ? null : this.field1018.method1290(4, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class263 var27 = var22 == 0 ? null : this.field1030.method587(var22 - 1, 1);
                        class425 var28 = var26;
                        if (var26 != null) {
                            if (var26.field5723 == -1 && var26.field5729 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field5736;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field1025 && this.field1039 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method1611(var12, true, var14) - arg6.method1611(var13, true, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg6.method1611(var13, true, var14) - arg6.method1611(var12, true, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class695.field9806[var39] = -1;
                            class285.field3763[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field5736 ? class270.field3529[var19] : class389.field5222[var19];
                        this.method460(var8, this.field1025, this.field1039, var12, var20, arg5, var14, var18, var26, var27, false, var9, var19, var11);
                        boolean var41 = var26 != null && var26.field5729 != var26.field5723;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class695.field9806[var42] >= 0 && class617.field8558[var42] != class569.field7758[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class489.method2805(var18[1], class15.method97(class285.field3763[4], class285.field3763[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class489.method2805(var18[3], class15.method97(class285.field3763[0], class285.field3763[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class489.method2805(var18[0], class15.method97(class285.field3763[2], class285.field3763[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class489.method2805(var18[2], class15.method97(class285.field3763[6], class285.field3763[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = class310.field4195[var19];
                            var46 = var26 == null ? 0 : class534.field7337[var19];
                            var47 = class582.field7960[var19];
                            var48 = var27 == null ? 0 : class180.field2532[var19];
                            var49 = class171.field2434[var19];
                        } else if (var17) {
                            var48 = var27 == null ? 0 : class339.field4559[var19];
                            var49 = class115.field1476[var19];
                            var44 = class523.field7234[var19];
                            var46 = var26 == null ? 0 : class73.field874[var19];
                            var45 = class152.field2088[var19];
                            var47 = class368.field4840[var19];
                        } else {
                            var44 = class218.field2858[var19];
                            var49 = class677.field9629[var19];
                            var48 = var27 == null ? 0 : class585.field8081[var19];
                            var45 = class664.field9450[var19];
                            var46 = var26 == null ? 0 : class231.field3003[var19];
                            var47 = class411.field5400[var19];
                        }
                        int var50 = var46 + var48;
                        if (var50 <= 0) {
                            class361.method2113(arg0, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field5739;
                                var62 = var26.field5723;
                                var64 = var26.field5737;
                                int var65 = class228.method1415(var26, 63, arg5);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 1;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 1;
                                        class231.field3082[4] = var49[var51];
                                        class231.field3082[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 5;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 5;
                                        class231.field3082[4] = var49[var51];
                                        class231.field3082[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 3;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 3;
                                        class231.field3082[4] = var49[var51];
                                        class231.field3082[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 7;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 7;
                                        class231.field3082[4] = var49[var51];
                                        class231.field3082[5] = var45[var51];
                                        var68 = 6;
                                    } else {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = var49[var51];
                                        class231.field3082[2] = var45[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class231.field3082[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field1017[var70];
                                        int var73 = this.field1020[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 512 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var73;
                                            var74 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var74 = 512 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class480.field6675[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg4.method1609(var76, var77, 6) - arg6.method1609(var76, var77, 62);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class480.field6675[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg6.method1609(var78, var79, -127) - arg4.method1609(var78, var79, 121);
                                            } else if (arg1 != null && !class567.field7727[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg1.method1609(var80, var81, 41) - arg6.method1609(var80, var81, -123);
                                            }
                                        }
                                        if (var70 < 8 && var26.field5743 < class695.field9806[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class569.field7758[var71];
                                            }
                                            var59[var52] = class569.field7752[var71];
                                            var58[var52] = class215.field2824[var71];
                                            var57[var52] = class617.field8558[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field5739;
                                            var59[var52] = var26.field5737;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1035 && arg0 == 0) {
                                    class226.method1411(var12, var14, var26.field5741, var26.field5733 * 8, var26.field5727);
                                }
                                if (var19 != 12 && var26.field5723 != -1 && var26.field5732) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class534.field7337[var19];
                            } else if (var17) {
                                var51 += class73.field874[var19];
                            } else {
                                var51 += class231.field3003[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class263 var82 = this.field1030.method587(var22 - 1, 1);
                                class263 var83 = this.field1030.method587(var23 - 1, 1);
                                class263 var84 = this.field1030.method587(var24 - 1, 1);
                                class263 var85 = this.field1030.method587(var25 - 1, 1);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 1;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 1;
                                        class231.field3082[4] = var49[var51];
                                        var88 = 6;
                                        class231.field3082[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 5;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 5;
                                        class231.field3082[4] = var49[var51];
                                        class231.field3082[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 3;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 3;
                                        class231.field3082[4] = var49[var51];
                                        class231.field3082[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = 7;
                                        class231.field3082[2] = var45[var51];
                                        class231.field3082[3] = 7;
                                        class231.field3082[4] = var49[var51];
                                        var88 = 6;
                                        class231.field3082[5] = var45[var51];
                                    } else {
                                        class231.field3082[0] = var47[var51];
                                        class231.field3082[1] = var49[var51];
                                        var88 = 3;
                                        class231.field3082[2] = var45[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class231.field3082[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field1017[var90];
                                        int var93 = this.field1020[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 512 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var95 = 512 - var93;
                                            var94 = var92;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class480.field6675[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg4.method1609(var96, var97, 101) - arg6.method1609(var96, var97, -126);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class480.field6675[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg6.method1609(var98, var99, -126) - arg4.method1609(var98, var99, -124);
                                            } else if (arg1 != null && !class567.field7727[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg1.method1609(var100, var101, 101) - arg6.method1609(var100, var101, -127);
                                            }
                                        }
                                        if (var90 < 8 && class695.field9806[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class569.field7758[var91];
                                            }
                                            var59[var52] = class569.field7752[var91];
                                            var58[var52] = class215.field2824[var91];
                                            var57[var52] = class617.field8558[var91];
                                        } else {
                                            if (var17 && class480.field6675[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg3[var12][var14];
                                                var58[var52] = var82.field3431;
                                                var59[var52] = var82.field3433;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg3[var12][var15];
                                                var58[var52] = var83.field3431;
                                                var59[var52] = var83.field3433;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg3[var13][var15];
                                                var58[var52] = var84.field3431;
                                                var59[var52] = var84.field3433;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg3[var13][var14];
                                                var58[var52] = var85.field3431;
                                                var59[var52] = var85.field3433;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var94 >= 256) {
                                                        var58[var52] = var83.field3431;
                                                        var59[var52] = var83.field3433;
                                                    } else {
                                                        var58[var52] = var82.field3431;
                                                        var59[var52] = var82.field3433;
                                                    }
                                                } else if (var94 < 256) {
                                                    var58[var52] = var85.field3431;
                                                    var59[var52] = var85.field3433;
                                                } else {
                                                    var58[var52] = var84.field3431;
                                                    var59[var52] = var84.field3433;
                                                }
                                                int var102 = class694.method3915(arg3[var12][var14], (byte) 122, var95 << 7 >> 9, arg3[var13][var14]);
                                                int var103 = class694.method3915(arg3[var12][var15], (byte) 127, var95 << 7 >> 9, arg3[var13][var15]);
                                                var57[var52] = class694.method3915(var102, (byte) 124, var94 << 7 >> 9, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field3432) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg6.method1611(var12, true, var14);
                            int var105 = arg6.method1611(var13, true, var14);
                            int var106 = arg6.method1611(var13, true, var15);
                            int var107 = arg6.method1611(var12, true, var15);
                            if (arg0 > 0) {
                                boolean var108 = true;
                                if (var27 != null && !var27.field3424) {
                                    var108 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field5744) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1036[arg0][var12][var14] = (byte) class665.method3789(this.field1036[arg0][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field1035) {
                                var109 = class230.method1423(var12, var14);
                                var110 = class56.method330(var12, var14);
                                var111 = class257.method1553(var12, var14);
                            }
                            arg6.method1353(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class361.method2113(arg0, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILio;IIII[Lev;)V")
    public final void method458(int arg0, class157 arg1, int arg2, int arg3, int arg4, int arg5, class593[] arg6) {
        field1043++;
        if (!this.field1035) {
            for (int var8 = 0; var8 < 4; var8++) {
                class593 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && var12 < this.field1025 && var13 >= 0 && var13 < this.field1039) {
                            var9.method3293(var13, -88, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg3 + arg5;
        int var15 = arg0 + arg2;
        int var16 = 87 / ((-arg4 - 79) / 43);
        for (int var17 = 0; var17 < this.field1038; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method456(false, 0, var15 + var19, var14 - -var18, 0, var19 + arg2, (byte) -48, var17, arg1, arg3 + var18, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1029 = null;
        field1021 = null;
        field1045 = null;
        if (arg0 == 24371) {
            field1028 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([[BIIIILr;I[ZLsv;Lje;Z[[BI[[B)V")
    private final void method460(byte[][] arg0, int arg1, int arg2, int arg3, int arg4, class562 arg5, int arg6, boolean[] arg7, class425 arg8, class263 arg9, boolean arg10, byte[][] arg11, int arg12, byte[][] arg13) {
        field1031++;
        boolean[] var15 = arg8 != null && arg8.field5736 ? class270.field3529[arg12] : class389.field5222[arg12];
        if (arg6 > 0) {
            if (arg3 > 0) {
                int var16 = arg13[arg3 - 1][arg6 - 1] & 0xFF;
                if (var16 > 0) {
                    class425 var17 = this.field1018.method1290(4, var16 - 1);
                    if (var17.field5723 != -1 && var17.field5736) {
                        byte var18 = arg0[arg3 - 1][arg6 - 1];
                        int var19 = arg11[arg3 - 1][arg6 - 1] * 2 + 4 & 0x7;
                        int var20 = class228.method1415(var17, -98, arg5);
                        if (class480.field6675[var18][var19]) {
                            class617.field8558[0] = var17.field5723;
                            class569.field7758[0] = var20;
                            class215.field2824[0] = var17.field5739;
                            class569.field7752[0] = var17.field5737;
                            class695.field9806[0] = var17.field5743;
                            class285.field3763[0] = 256;
                        }
                    }
                }
            }
            if (arg3 < arg1 - 1) {
                int var21 = arg13[arg3 + 1][arg6 - 1] & 0xFF;
                if (var21 > 0) {
                    class425 var22 = this.field1018.method1290(4, var21 - 1);
                    if (var22.field5723 != -1 && var22.field5736) {
                        byte var23 = arg0[arg3 + 1][arg6 - 1];
                        int var24 = (arg11[arg3 + 1][arg6 - 1] * 2) + 6 & 0x7;
                        int var25 = class228.method1415(var22, -111, arg5);
                        if (class480.field6675[var23][var24]) {
                            class617.field8558[2] = var22.field5723;
                            class569.field7758[2] = var25;
                            class215.field2824[2] = var22.field5739;
                            class569.field7752[2] = var22.field5737;
                            class695.field9806[2] = var22.field5743;
                            class285.field3763[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg10) {
            this.method457(89, null, -118, null, null, null, null);
        }
        if (arg6 < arg2 - 1) {
            if (arg3 > 0) {
                int var26 = arg13[arg3 - 1][arg6 + 1] & 0xFF;
                if (var26 > 0) {
                    class425 var27 = this.field1018.method1290(4, var26 - 1);
                    if (var27.field5723 != -1 && var27.field5736) {
                        byte var28 = arg0[arg3 - 1][arg6 + 1];
                        int var29 = arg11[arg3 - 1][arg6 + 1] * 2 + 2 & 0x7;
                        int var30 = class228.method1415(var27, 15, arg5);
                        if (class480.field6675[var28][var29]) {
                            class617.field8558[6] = var27.field5723;
                            class569.field7758[6] = var30;
                            class215.field2824[6] = var27.field5739;
                            class569.field7752[6] = var27.field5737;
                            class695.field9806[6] = var27.field5743;
                            class285.field3763[6] = 64;
                        }
                    }
                }
            }
            if (arg3 < (arg1 - 1)) {
                int var31 = arg13[arg3 + 1][arg6 + 1] & 0xFF;
                if (var31 > 0) {
                    class425 var32 = this.field1018.method1290(4, var31 - 1);
                    if (var32.field5723 != -1 && var32.field5736) {
                        byte var33 = arg0[arg3 + 1][arg6 + 1];
                        int var34 = arg11[arg3 + 1][arg6 + 1] * 2 & 0x7;
                        int var35 = class228.method1415(var32, 83, arg5);
                        if (class480.field6675[var33][var34]) {
                            class617.field8558[4] = var32.field5723;
                            class569.field7758[4] = var35;
                            class215.field2824[4] = var32.field5739;
                            class569.field7752[4] = var32.field5737;
                            class695.field9806[4] = var32.field5743;
                            class285.field3763[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg6 > 0) {
            int var36 = arg13[arg3][arg6 - 1] & 0xFF;
            if (var36 > 0) {
                class425 var37 = this.field1018.method1290(4, var36 - 1);
                if (var37.field5723 != -1) {
                    byte var38 = arg0[arg3][arg6 - 1];
                    byte var39 = arg11[arg3][arg6 - 1];
                    if (var37.field5736) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class228.method1415(var37, 25, arg5);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class480.field6675[var38][var41] && var37.field5743 >= class695.field9806[var40]) {
                                class617.field8558[var40] = var37.field5723;
                                class569.field7758[var40] = var42;
                                class215.field2824[var40] = var37.field5739;
                                class569.field7752[var40] = var37.field5737;
                                if (class695.field9806[var40] == var37.field5743) {
                                    class285.field3763[var40] = class665.method3789(class285.field3763[var40], 32);
                                } else {
                                    class285.field3763[var40] = 32;
                                }
                                class695.field9806[var40] = var37.field5743;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg7[0] = class270.field3529[var38][class15.method97(var39 + 2, 3)];
                        }
                    } else if (!var15[arg4 & 0x3]) {
                        arg7[0] = class389.field5222[var38][class15.method97(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg2 - 1) > arg6) {
            int var44 = arg13[arg3][arg6 + 1] & 0xFF;
            if (var44 > 0) {
                class425 var45 = this.field1018.method1290(4, var44 - 1);
                if (var45.field5723 != -1) {
                    byte var46 = arg0[arg3][arg6 + 1];
                    byte var47 = arg11[arg3][arg6 + 1];
                    if (var45.field5736) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class228.method1415(var45, -111, arg5);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class480.field6675[var46][var49] && var45.field5743 >= class695.field9806[var48]) {
                                class617.field8558[var48] = var45.field5723;
                                class569.field7758[var48] = var50;
                                class215.field2824[var48] = var45.field5739;
                                class569.field7752[var48] = var45.field5737;
                                if (class695.field9806[var48] == var45.field5743) {
                                    class285.field3763[var48] = class665.method3789(class285.field3763[var48], 16);
                                } else {
                                    class285.field3763[var48] = 16;
                                }
                                class695.field9806[var48] = var45.field5743;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg7[2] = class270.field3529[var46][class15.method97(var47, 3)];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg7[2] = class389.field5222[var46][class15.method97(var47, 3)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg13[arg3 - 1][arg6] & 0xFF;
            if (var52 > 0) {
                class425 var53 = this.field1018.method1290(4, var52 - 1);
                if (var53.field5723 != -1) {
                    byte var54 = arg0[arg3 - 1][arg6];
                    byte var55 = arg11[arg3 - 1][arg6];
                    if (var53.field5736) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class228.method1415(var53, -98, arg5);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class480.field6675[var54][var57] && class695.field9806[var56] <= var53.field5743) {
                                class617.field8558[var56] = var53.field5723;
                                class569.field7758[var56] = var58;
                                class215.field2824[var56] = var53.field5739;
                                class569.field7752[var56] = var53.field5737;
                                if (class695.field9806[var56] == var53.field5743) {
                                    class285.field3763[var56] = class665.method3789(class285.field3763[var56], 8);
                                } else {
                                    class285.field3763[var56] = 8;
                                }
                                class695.field9806[var56] = var53.field5743;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg7[3] = class270.field3529[var54][class15.method97(3, var55 + 1)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg7[3] = class389.field5222[var54][class15.method97(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg3 < (arg1 - 1)) {
            int var60 = arg13[arg3 + 1][arg6] & 0xFF;
            if (var60 > 0) {
                class425 var61 = this.field1018.method1290(4, var60 - 1);
                if (var61.field5723 != -1) {
                    byte var62 = arg0[arg3 + 1][arg6];
                    byte var63 = arg11[arg3 + 1][arg6];
                    if (var61.field5736) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class228.method1415(var61, 119, arg5);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class480.field6675[var62][var65] && class695.field9806[var64] <= var61.field5743) {
                                class617.field8558[var64] = var61.field5723;
                                class569.field7758[var64] = var66;
                                class215.field2824[var64] = var61.field5739;
                                class569.field7752[var64] = var61.field5737;
                                if (class695.field9806[var64] == var61.field5743) {
                                    class285.field3763[var64] = class665.method3789(class285.field3763[var64], 4);
                                } else {
                                    class285.field3763[var64] = 4;
                                }
                                class695.field9806[var64] = var61.field5743;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg7[1] = class270.field3529[var62][class15.method97(var63 + 3, 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg7[1] = class389.field5222[var62][class15.method97(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class228.method1415(arg8, 35, arg5);
        if (!arg8.field5736) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg4 * 2) & 0x7;
            if (class480.field6675[arg12][var69] && arg8.field5743 >= class695.field9806[var70]) {
                class617.field8558[var70] = arg8.field5723;
                class569.field7758[var70] = var68;
                class215.field2824[var70] = arg8.field5739;
                class569.field7752[var70] = arg8.field5737;
                if (class695.field9806[var70] == arg8.field5743) {
                    class285.field3763[var70] = class665.method3789(class285.field3763[var70], 2);
                } else {
                    class285.field3763[var70] = 2;
                }
                class695.field9806[var70] = arg8.field5743;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILr;Li;Li;)V")
    public final void method461(int arg0, class562 arg1, class270 arg2, class270 arg3) {
        field1040++;
        int[][] var5 = new int[this.field1025][this.field1039];
        if (arg0 != -64) {
            this.method467(null, null, -96, null, 35, null, null);
        }
        if (class240.field3179 == null || class240.field3179.length != this.field1039) {
            class124.field1728 = new int[this.field1039];
            class8.field67 = new int[this.field1039];
            class35.field491 = new int[this.field1039];
            class86.field1055 = new int[this.field1039];
            class240.field3179 = new int[this.field1039];
        }
        for (int var6 = 0; var6 < this.field1038; var6++) {
            for (int var8 = 0; var8 < this.field1039; var8++) {
                class240.field3179[var8] = 0;
                class35.field491[var8] = 0;
                class8.field67[var8] = 0;
                class124.field1728[var8] = 0;
                class86.field1055[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1025; var9++) {
                for (int var10 = 0; var10 < this.field1039; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field1025) {
                        int var20 = this.field1013[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class263 var21 = this.field1030.method587(var20 - 1, 1);
                            class240.field3179[var10] += var21.field3428;
                            class35.field491[var10] += var21.field3423;
                            class8.field67[var10] += var21.field3435;
                            class124.field1728[var10] += var21.field3426;
                            var10002 = class86.field1055[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1013[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class263 var24 = this.field1030.method587(var23 - 1, 1);
                            class240.field3179[var10] -= var24.field3428;
                            class35.field491[var10] -= var24.field3423;
                            class8.field67[var10] -= var24.field3435;
                            class124.field1728[var10] -= var24.field3426;
                            var10002 = class86.field1055[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1039; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1039 > var17) {
                            var13 += class8.field67[var17];
                            var14 += class124.field1728[var17];
                            var15 += class86.field1055[var17];
                            var11 += class240.field3179[var17];
                            var12 += class35.field491[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class240.field3179[var18];
                            var13 -= class8.field67[var18];
                            var15 -= class86.field1055[var18];
                            var14 -= class124.field1728[var18];
                            var12 -= class35.field491[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class606.method3371(var13 / var15, var12 / var15, var11 * 256 / var14, (byte) -77);
                        }
                    }
                }
            }
            if (class629.field8712) {
                this.method457(var6, var6 == 0 ? arg2 : null, 60, var5, var6 == 0 ? arg3 : null, arg1, class246.field3214[var6]);
            } else {
                this.method467(var5, var6 == 0 ? arg2 : null, arg0 + 68, class246.field3214[var6], var6, arg1, var6 == 0 ? arg3 : null);
            }
            this.field1013[var6] = null;
            this.field1022[var6] = null;
            this.field1041[var6] = null;
            this.field1014[var6] = null;
        }
        if (!this.field1035) {
            if (class190.field2639 != 0) {
                class186.method1232();
            }
            if (class34.field489) {
                class534.method2999();
            }
        }
        for (int var7 = 0; var7 < this.field1038; var7++) {
            class246.field3214[var7].method1349();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)V")
    public static final void method462(int arg0, int arg1, int arg2, int arg3) {
        field1042++;
        int var4 = class602.field8408.field4323 * arg3 >> 8;
        if (arg1 != 15629) {
            field1029 = null;
        }
        if (arg2 == -1 && !class33.field460) {
            class166.method1017((byte) -38);
        } else if (arg2 != -1 && (class275.field3659 != arg2 || !class487.method2799((byte) 115)) && var4 != 0 && !class33.field460) {
            class527.method2978(arg2, false, 0, class654.field9309, -71, arg0, var4);
        }
        class275.field3659 = arg2;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lio;I[Lev;IIIIIBI)V")
    public final void method463(class157 arg0, int arg1, class593[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field1024++;
        if (arg8 <= 74) {
            this.method460(null, 79, -41, 34, 121, null, 126, null, null, null, false, null, -12, null);
        }
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field1035) {
            class593 var12 = arg2[arg7];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class267.method1594(var13 & 0x7, arg9, var14 & 0x7, -15763) + arg1;
                    int var16 = arg5 + class579.method3196(var14 & 0x7, var13 & 0x7, 11336, arg9);
                    if (var15 > 0 && var15 < (this.field1025 - 1) && var16 > 0 && var16 < (this.field1039 - 1)) {
                        var12.method3293(var16, -94, var15);
                    }
                }
            }
        }
        int var17 = (arg6 & 0x7) * 8;
        int var18 = (arg4 & 0xFFFFFFF8) << 3;
        int var19 = arg6 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg9 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1038; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 == var22 && var23 >= var11 && var11 + 8 >= var23 && var17 <= var24 && (var17 + 8) >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg9 == 0) {
                                var26 = var24 + arg5 - var17;
                                var25 = -var11 - (-var23 - arg1);
                            } else if (arg9 == 1) {
                                var25 = var24 + arg1 - var17;
                                var26 = arg5 + var11 + 8 - var23;
                            } else if (arg9 == 2) {
                                var25 = arg1 + 8 - (var23 - var11);
                                var26 = arg5 + var17 + 8 - var24;
                            } else {
                                var26 = arg5 + var23 - var11;
                                var25 = var17 + arg1 + 8 - var24;
                            }
                            this.method456(true, 0, var19 + var24, var18 + var23, 0, var26, (byte) -48, arg7, arg0, var25, 0);
                        } else {
                            var25 = class267.method1594(var23 & 0x7, arg9, var24 & 0x7, -15763) + arg1;
                            var26 = arg5 + class579.method3196(var24 & 0x7, var23 & 0x7, 11336, arg9);
                            this.method456(false, arg9, var19 + var24, var18 - -var23, var20, var26, (byte) -48, arg7, arg0, var25, var21);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg9 == 0) {
                                    var31 = -var17 - (-var30 - arg5);
                                    var32 = var29 + arg1 - var11;
                                } else if (arg9 == 1) {
                                    var32 = var30 + arg1 - var17;
                                    var31 = var11 - (var29 - arg5 - 8);
                                } else if (arg9 == 2) {
                                    var31 = arg5 + var17 + 8 - var30;
                                    var32 = var11 + arg1 + 8 - var29;
                                } else {
                                    var31 = arg5 - (var11 - var29);
                                    var32 = arg1 - (var30 - var17 - 8);
                                }
                                if (var32 >= 0 && var32 < this.field1025 && var31 >= 0 && var31 < this.field1039) {
                                    this.field1034[arg7][var32][var31] = this.field1034[arg7][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method456(false, 0, 0, 0, 0, -1, (byte) -48, 0, arg0, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([[[ILr;[Lev;B)V")
    public final void method464(int[][][] arg0, class562 arg1, class593[] arg2, byte arg3) {
        if (!this.field1035) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1025; var6++) {
                    for (int var7 = 0; var7 < this.field1039; var7++) {
                        if ((class31.field440[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class31.field440[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method3292(var7, var6, -24749);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != 109) {
            this.method467(null, null, 40, null, -5, null, null);
        }
        field1033++;
        for (int var9 = 0; var9 < this.field1038; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1035) {
                if (class34.field489) {
                    var10 |= 0x2;
                }
                if (class586.field8102) {
                    var11 |= 0x8;
                }
                if (class190.field2639 != 0) {
                    if (class27.field401 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class34.field489) {
                var11 |= 0x7;
            }
            if (!class375.field4971) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field1034[var9] : arg0[var9];
            class390.method2253(var9, arg1.method1037(this.field1025, this.field1039, this.field1034[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIB)V")
    private final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        for (int var7 = arg0; var7 < arg0 + arg1; var7++) {
            for (int var10 = arg4; var10 < (arg2 + arg4); var10++) {
                if (var10 >= 0 && var10 < this.field1025 && var7 >= 0 && var7 < this.field1039) {
                    this.field1034[arg3][var10][var7] = arg3 <= 0 ? 0 : this.field1034[arg3 - 1][var10][var7] - 960;
                }
            }
        }
        field1037++;
        if (arg4 > 0 && arg4 < this.field1025) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && this.field1039 > var8) {
                    this.field1034[arg3][arg4][var8] = this.field1034[arg3][arg4 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && this.field1039 > arg0) {
            for (int var9 = arg4 + 1; var9 < arg2 + arg4; var9++) {
                if (var9 >= 0 && this.field1025 > var9) {
                    this.field1034[arg3][var9][arg0] = this.field1034[arg3][var9][arg0 - 1];
                }
            }
        }
        if (arg5 < 1) {
            method462(-105, -86, 107, -71);
        }
        if (arg4 < 0 || arg0 < 0 || arg4 >= this.field1025 || arg0 >= this.field1039) {
            return;
        }
        if (arg3 != 0) {
            if (arg4 > 0 && this.field1034[arg3 - 1][arg4 - 1][arg0] != this.field1034[arg3][arg4 - 1][arg0]) {
                this.field1034[arg3][arg4][arg0] = this.field1034[arg3][arg4 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field1034[arg3 - 1][arg4][arg0 - 1] != this.field1034[arg3][arg4][arg0 - 1]) {
                this.field1034[arg3][arg4][arg0] = this.field1034[arg3][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && this.field1034[arg3 - 1][arg4 - 1][arg0 - 1] != this.field1034[arg3][arg4 - 1][arg0 - 1]) {
                this.field1034[arg3][arg4][arg0] = this.field1034[arg3][arg4 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg4 > 0 && this.field1034[arg3][arg4 - 1][arg0] != 0) {
            this.field1034[arg3][arg4][arg0] = this.field1034[arg3][arg4 - 1][arg0];
            return;
        }
        if (arg0 > 0 && this.field1034[arg3][arg4][arg0 - 1] != 0) {
            this.field1034[arg3][arg4][arg0] = this.field1034[arg3][arg4][arg0 - 1];
            return;
        }
        if (arg4 > 0 && arg0 > 0 && this.field1034[arg3][arg4 - 1][arg0 - 1] != 0) {
            this.field1034[arg3][arg4][arg0] = this.field1034[arg3][arg4 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[BILqi;)Lqaa;")
    public static final class133 method466(int arg0, byte[] arg1, int arg2, class510 arg3) {
        field1016++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramRawARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class225.field2930, 0);
        if (class225.field2930[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
        if (arg0 != 2251) {
            method455(127, -97);
        }
        OpenGL.glBindProgramARB(arg2, 0);
        return new class133(arg3, arg2, var4);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([[ILi;ILi;ILr;Li;)V")
    private final void method467(int[][] arg0, class270 arg1, int arg2, class270 arg3, int arg4, class562 arg5, class270 arg6) {
        for (int var8 = 0; var8 < this.field1025; var8++) {
            for (int var9 = 0; var9 < this.field1039; var9++) {
                if (class643.field8886 == -1 || class452.method2541(class643.field8886, var9, arg4, var8, 0)) {
                    byte var10 = this.field1041[arg4][var8][var9];
                    byte var11 = this.field1014[arg4][var8][var9];
                    int var12 = this.field1022[arg4][var8][var9] & 0xFF;
                    int var13 = this.field1013[arg4][var8][var9] & 0xFF;
                    class425 var14 = var12 == 0 ? null : this.field1018.method1290(4, var12 - 1);
                    class263 var15 = var13 == 0 ? null : this.field1030.method587(var13 - 1, arg2 ^ 0x5);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class534.field7337[var10];
                        var16 = var15 == null ? 0 : class180.field2532[var10];
                    } else if (var14 != null) {
                        var17 = class534.field7337[var10];
                    } else if (var15 != null) {
                        var16 = class534.field7337[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class653.field9302) {
                            var20 = var14 == null ? -1 : var14.field5739;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 == null || var14.field5723 == -1 && var14.field5729 == -1 && var20 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field5737;
                                if (var14.field5723 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field5723;
                                }
                                if (var14.field5729 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field5729;
                                    var25 = true;
                                }
                                var19++;
                            }
                            if (!this.field1035 && arg4 == 0) {
                                class226.method1411(var8, var9, var14.field5741, var14.field5733 * 8, var14.field5727);
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field3431;
                            if (class653.field9302) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var23[var19] = var29;
                                var24[var19] = var15.field3433;
                                var21[var19] = arg0[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1017.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg6 == null ? null : new int[var31];
                        int[] var35 = arg6 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1017[var36];
                            int var46 = this.field1020[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class480.field6675[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg6.method1609(var49, var50, arg2 - 131) - arg3.method1609(var49, var50, class50.method268(arg2, 29));
                            }
                            if (var35 != null) {
                                if (arg6 != null && !class480.field6675[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg3.method1609(var51, var52, arg2 - 132) - arg6.method1609(var51, var52, -127);
                                } else if (arg1 != null && !class567.field7727[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg1.method1609(var53, var54, 78) - arg3.method1609(var53, var54, 65);
                                }
                            }
                        }
                        int var37 = arg3.method1611(var8, true, var9);
                        int var38 = arg3.method1611(var8 + 1, true, var9);
                        int var39 = arg3.method1611(var8 + 1, true, var9 + 1);
                        int var40 = arg3.method1611(var8, true, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var15 != null && !var15.field3424) {
                                var41 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field5744) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1036[arg4][var8][var9] = (byte) class665.method3789(this.field1036[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field1035) {
                            var42 = class230.method1423(var8, var9);
                            var43 = class56.method330(var8, var9);
                            var44 = class257.method1553(var8, var9);
                        }
                        arg3.method1350(var8, var9, var32, var34, var33, var35, class582.field7960[var10], class171.field2434[var10], class310.field4195[var10], var21, var22, var23, var24, var42, var43, var44, false);
                        class361.method2113(arg4, var8, var9);
                    }
                }
            }
        }
        if (arg2 != 4) {
            field1028 = null;
        }
        field1019++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[[I)V")
    public final void method468(int arg0, int arg1, int[][] arg2) {
        field1027++;
        int[][] var4 = this.field1034[arg1];
        for (int var5 = arg0; var5 < (this.field1025 + 1); var5++) {
            for (int var6 = 0; var6 < this.field1039 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBIII)V")
    public final void method469(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1032++;
        for (int var6 = 0; var6 < this.field1038; var6++) {
            this.method465(arg4, arg2, arg3, var6, arg0, (byte) 3);
        }
        if (arg1 != -77) {
            this.method469(89, (byte) -123, -43, 93, -44);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIZLlp;Lcq;)V")
    public class85(int arg0, int arg1, int arg2, boolean arg3, class202 arg4, class107 arg5) {
        this.field1038 = arg0;
        this.field1025 = arg1;
        this.field1035 = arg3;
        this.field1039 = arg2;
        this.field1030 = arg5;
        this.field1018 = arg4;
        this.field1041 = new byte[this.field1038][this.field1025][this.field1039];
        this.field1013 = new byte[this.field1038][this.field1025][this.field1039];
        this.field1014 = new byte[this.field1038][this.field1025][this.field1039];
        this.field1036 = new byte[this.field1038][this.field1025 + 1][this.field1039 + 1];
        this.field1034 = new int[this.field1038][this.field1025 + 1][this.field1039 + 1];
        this.field1022 = new byte[this.field1038][this.field1025][this.field1039];
    }
}
