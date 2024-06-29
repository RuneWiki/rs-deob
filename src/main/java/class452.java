import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class452 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
    private int[] field6985 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "[I")
    private int[] field6997 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lrb;")
    private class178 field6993;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lsm;")
    private class70 field6987;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Z")
    public boolean field6992;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public int field7004;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public int field7000;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public int field6995;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[[[B")
    public byte[][][] field6989;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[[[B")
    private byte[][][] field7008;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[[[B")
    private byte[][][] field7001;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[[[B")
    private byte[][][] field6994;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[[[I")
    public int[][][] field6988;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "[[[B")
    private byte[][][] field7007;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Lbi;")
    public static class104 field7011;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[Z")
    public static boolean[] field7017;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Lmn;")
    public static class162 field7016;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "[[I")
    public static int[][] field7015;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[[[B")
    public byte[][][] field7003;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lza;[[ILya;IILya;Lya;)V")
    private final void method2839(class497 arg0, int[][] arg1, class223 arg2, int arg3, int arg4, class223 arg5, class223 arg6) {
        field7010++;
        for (int var8 = arg4; var8 < this.field7000; var8++) {
            for (int var9 = 0; var9 < this.field7004; var9++) {
                if (class419.field6350 == -1 || class402.method2585((byte) 125, arg3, class419.field6350, var9, var8)) {
                    byte var10 = this.field7001[arg3][var8][var9];
                    byte var11 = this.field6994[arg3][var8][var9];
                    int var12 = this.field7007[arg3][var8][var9] & 0xFF;
                    int var13 = this.field7008[arg3][var8][var9] & 0xFF;
                    class186 var14 = var12 == 0 ? null : this.field6987.method518((byte) 121, var12 - 1);
                    class436 var15 = var13 == 0 ? null : this.field6993.method1133(-121, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class39.field393[var10];
                        var16 = var15 == null ? 0 : class322.field5024[var10];
                    } else if (var14 != null) {
                        var17 = class39.field393[var10];
                    } else if (var15 != null) {
                        var16 = class39.field393[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field2693 == -1 && var14.field2703 == -1 && var14.field2708 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg0.method1267() ? var14.field2708 : var14.field2712;
                            if (class68.field1039) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field2691;
                                if (var14.field2693 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field2693;
                                }
                                if (var14.field2703 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2703;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field6992 && arg3 == 0) {
                                class201.method1372(var8, var9, var14.field2706, var14.field2695 * 8, var14.field2715);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field6580;
                            if (class68.field1039) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field6583;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field6985.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg6 == null ? null : new int[var31];
                        int[] var35 = arg6 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field6985[var36];
                            int var46 = this.field6997[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class36.field374[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg6.method692(var49, var50) - arg2.method692(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg6 != null && !class36.field374[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method692(var51, var52) - arg6.method692(var51, var52);
                                } else if (arg5 != null && !class24.field269[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method692(var53, var54) - arg2.method692(var53, var54);
                                }
                            }
                        }
                        int var37 = arg2.method688(var8, var9);
                        int var38 = arg2.method688(var8 + 1, var9);
                        int var39 = arg2.method688(var8 + 1, var9 + 1);
                        int var40 = arg2.method688(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field2700) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field6989[arg3][var8][var9] = (byte) class410.method2621(this.field6989[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field6992) {
                            var42 = class153.method935(var8, var9);
                            var43 = class334.method2220(var8, var9);
                            var44 = class154.method939(var8, var9);
                        }
                        arg2.method686(var8, var9, var32, var34, var33, var35, class529.field7777[var10], class183.field2647[var10], class302.field4738[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class84.method589(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIILhw;IIZI)V")
    private final void method2840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class208 arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field6983++;
        int var12 = -22 % ((-arg3 - 82) / 42);
        if (arg1 == 1) {
            arg2 = 1;
        } else if (arg1 == 2) {
            arg10 = 1;
            arg2 = 1;
        } else if (arg1 == 3) {
            arg10 = 1;
        }
        if (arg7 < 0 || this.field7000 <= arg7 || arg5 < 0 || arg5 >= this.field7004) {
            while (true) {
                int var15 = arg6.method1445(103);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg6.method1445(-90);
                    return;
                }
                if (var15 <= 49) {
                    arg6.method1445(111);
                }
            }
        }
        if (!this.field6992 && !arg9) {
            class416.field6309[arg0][arg7][arg5] = 0;
        }
        while (true) {
            int var13 = arg6.method1445(-78);
            if (var13 == 0) {
                if (this.field6992) {
                    this.field6988[0][arg7 + arg10][arg2 + arg5] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field6988[0][arg7 + arg10][arg5 + arg2] = -class384.method2472(arg4 + 932731, 556238 - -arg8, -125) * 8 << 0;
                    return;
                } else {
                    this.field6988[arg0][arg7 + arg10][arg2 + arg5] = this.field6988[arg0 - 1][arg7 + arg10][arg2 + arg5] - 240;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg6.method1445(-127);
                if (!this.field6992) {
                    if (var14 == 1) {
                        var14 = 0;
                    }
                    if (arg0 != 0) {
                        this.field6988[arg0][arg7 + arg10][arg2 + arg5] = this.field6988[arg0 - 1][arg7 + arg10][arg2 + arg5] - (var14 * 8 << 0);
                        return;
                    }
                    this.field6988[0][arg7 + arg10][arg2 + arg5] = -var14 * 8 << 0;
                    return;
                }
                this.field6988[0][arg7 + arg10][arg2 + arg5] = var14 * 8 << 0;
                return;
            }
            if (var13 <= 49) {
                if (arg9) {
                    arg6.method1445(-94);
                } else {
                    this.field7007[arg0][arg7][arg5] = arg6.method1427(false);
                    this.field7001[arg0][arg7][arg5] = (byte) ((var13 - 2) / 4);
                    this.field6994[arg0][arg7][arg5] = (byte) class272.method1842(3, var13 + arg1 - 2);
                }
            } else if (var13 <= 81) {
                if (!this.field6992 && !arg9) {
                    class416.field6309[arg0][arg7][arg5] = (byte) (var13 - 49);
                }
            } else if (!arg9) {
                this.field7008[arg0][arg7][arg5] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
    public final void method2841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6996++;
        for (int var6 = 0; var6 < this.field6995; var6++) {
            this.method2843(arg3, arg4, arg1, var6, -9024, arg2);
        }
        int var7 = 64 / ((arg0 + 7) / 38);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([[III)V")
    public final void method2842(int[][] arg0, int arg1, int arg2) {
        if (arg1 < 121) {
            return;
        }
        field7006++;
        int[][] var4 = this.field6988[arg2];
        for (int var5 = 0; var5 < (this.field7000 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field7004 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
    private final void method2843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6986++;
        if (arg4 != -9024) {
            field7014 = -96;
        }
        for (int var7 = arg2; var7 < arg0 + arg2; var7++) {
            for (int var10 = arg5; var10 < (arg1 + arg5); var10++) {
                if (var10 >= 0 && var10 < this.field7000 && var7 >= 0 && this.field7004 > var7) {
                    this.field6988[arg3][var10][var7] = arg3 <= 0 ? 0 : this.field6988[arg3 - 1][var10][var7] - 240;
                }
            }
        }
        if (arg5 > 0 && arg5 < this.field7000) {
            for (int var8 = arg2 + 1; var8 < arg2 + arg0; var8++) {
                if (var8 >= 0 && this.field7004 > var8) {
                    this.field6988[arg3][arg5][var8] = this.field6988[arg3][arg5 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field7004) {
            for (int var9 = arg5 + 1; var9 < (arg1 + arg5); var9++) {
                if (var9 >= 0 && this.field7000 > var9) {
                    this.field6988[arg3][var9][arg2] = this.field6988[arg3][var9][arg2 - 1];
                }
            }
        }
        if (arg5 < 0 || arg2 < 0 || this.field7000 <= arg5 || this.field7004 <= arg2) {
            return;
        }
        if (arg3 != 0) {
            if (arg5 > 0 && this.field6988[arg3][arg5 - 1][arg2] != this.field6988[arg3 - 1][arg5 - 1][arg2]) {
                this.field6988[arg3][arg5][arg2] = this.field6988[arg3][arg5 - 1][arg2];
                return;
            }
            if (arg2 > 0 && this.field6988[arg3 - 1][arg5][arg2 - 1] != this.field6988[arg3][arg5][arg2 - 1]) {
                this.field6988[arg3][arg5][arg2] = this.field6988[arg3][arg5][arg2 - 1];
                return;
            }
            if (arg5 > 0 && arg2 > 0 && this.field6988[arg3][arg5 - 1][arg2 - 1] != this.field6988[arg3 - 1][arg5 - 1][arg2 - 1]) {
                this.field6988[arg3][arg5][arg2] = this.field6988[arg3][arg5 - 1][arg2 - 1];
                return;
            }
            return;
        }
        if (arg5 > 0 && this.field6988[arg3][arg5 - 1][arg2] != 0) {
            this.field6988[arg3][arg5][arg2] = this.field6988[arg3][arg5 - 1][arg2];
            return;
        }
        if (arg2 > 0 && this.field6988[arg3][arg5][arg2 - 1] != 0) {
            this.field6988[arg3][arg5][arg2] = this.field6988[arg3][arg5][arg2 - 1];
            return;
        }
        if (arg5 > 0 && arg2 > 0 && this.field6988[arg3][arg5 - 1][arg2 - 1] != 0) {
            this.field6988[arg3][arg5][arg2] = this.field6988[arg3][arg5 - 1][arg2 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[Lsj;ILhw;III)V")
    public final void method2844(int arg0, int arg1, int arg2, int arg3, class284[] arg4, int arg5, class208 arg6, int arg7, int arg8, int arg9) {
        field7002++;
        int var11 = (arg9 & 0x7) * 8;
        if (!this.field6992) {
            class284 var12 = arg4[arg5];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg8 + class73.method536(arg2, var13 & 0x7, (byte) 13, var14 & 0x7);
                    int var16 = class165.method1040(arg2, (byte) 120, var13 & 0x7, var14 & 0x7) + arg0;
                    if (var15 > 0 && (this.field7000 - 1) > var15 && var16 > 0 && var16 < (this.field7004 - 1)) {
                        var12.method1916(var15, var16, true);
                    }
                }
            }
        }
        int var17 = (arg1 & 0x7) * 8;
        int var18 = 76 / ((arg7 - 21) / 47);
        int var19 = (arg9 & 0xFFFFFFF8) << 3;
        int var20 = (arg1 & 0xFFFFFFF8) << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg2 == 1) {
            var22 = 1;
        } else if (arg2 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg2 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < this.field6995; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg3 == var23 && var24 >= var11 && var11 + 8 >= var24 && var25 >= var17 && var17 + 8 >= var25) {
                        int var26;
                        int var27;
                        if ((var11 + 8) == var24 || var17 + 8 == var25) {
                            if (arg2 == 0) {
                                var26 = var24 + arg8 - var11;
                                var27 = var25 + arg0 - var17;
                            } else if (arg2 == 1) {
                                var26 = arg8 + var25 - var17;
                                var27 = var11 + arg0 + 8 - var24;
                            } else if (arg2 == 2) {
                                var26 = var11 + arg8 + 8 - var24;
                                var27 = var17 + arg0 + 8 - var25;
                            } else {
                                var27 = arg0 - (var11 - var24);
                                var26 = arg8 + var17 + 8 - var25;
                            }
                            this.method2840(arg5, 0, 0, 65, var19 + var24, var27, arg6, var26, var20 + var25, true, 0);
                        } else {
                            var26 = arg8 + class73.method536(arg2, var24 & 0x7, (byte) 49, var25 & 0x7);
                            var27 = class165.method1040(arg2, (byte) 120, var24 & 0x7, var25 & 0x7) + arg0;
                            this.method2840(arg5, arg2, var22, 52, var19 + var24, var27, arg6, var26, var20 + var25, false, var21);
                        }
                        if (var24 == 63 || var25 == 63) {
                            byte var28 = 1;
                            if (var24 == 63 && var25 == 63) {
                                var28 = 3;
                            }
                            for (int var29 = 0; var29 < var28; var29++) {
                                int var30 = var24;
                                int var31 = var25;
                                if (var29 == 0) {
                                    var31 = var25 == 63 ? 64 : var25;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var29 == 1) {
                                    var30 = 64;
                                } else if (var29 == 2) {
                                    var31 = 64;
                                }
                                int var32;
                                int var33;
                                if (arg2 == 0) {
                                    var33 = var31 - (var17 - arg0);
                                    var32 = var30 + arg8 - var11;
                                } else if (arg2 == 1) {
                                    var32 = arg8 + var31 - var17;
                                    var33 = var11 - (var30 - (arg0 + 8));
                                } else if (arg2 == 2) {
                                    var32 = arg8 + 8 - (-var11 + var30);
                                    var33 = arg0 + var17 + 8 - var31;
                                } else {
                                    var32 = arg8 + var17 + 8 - var31;
                                    var33 = var30 - (var11 - arg0);
                                }
                                if (var32 >= 0 && this.field7000 > var32 && var33 >= 0 && this.field7004 > var33) {
                                    this.field6988[arg5][var32][var33] = this.field6988[arg5][var26 + var21][var22 + var27];
                                }
                            }
                        }
                    } else {
                        this.method2840(0, 0, 0, -1, 0, -1, arg6, -1, 0, false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lya;Lya;ZLza;)V")
    public final void method2845(class223 arg0, class223 arg1, boolean arg2, class497 arg3) {
        field6984++;
        if (class378.field5800 == null || class378.field5800.length != this.field7004) {
            class541.field7907 = new int[this.field7004];
            class170.field2487 = new int[this.field7004];
            class96.field1399 = new int[this.field7004];
            class339.field5293 = new int[this.field7004];
            class378.field5800 = new int[this.field7004];
        }
        int[][] var5 = new int[this.field7000][this.field7004];
        for (int var6 = 0; var6 < this.field6995; var6++) {
            for (int var8 = 0; var8 < this.field7004; var8++) {
                class378.field5800[var8] = 0;
                class339.field5293[var8] = 0;
                class96.field1399[var8] = 0;
                class170.field2487[var8] = 0;
                class541.field7907[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7000; var9++) {
                for (int var10 = 0; var10 < this.field7004; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field7000 > var19) {
                        int var20 = this.field7008[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class436 var21 = this.field6993.method1133(-72, var20 - 1);
                            class378.field5800[var10] += var21.field6578;
                            class339.field5293[var10] += var21.field6576;
                            class96.field1399[var10] += var21.field6572;
                            class170.field2487[var10] += var21.field6575;
                            var10002 = class541.field7907[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7008[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class436 var24 = this.field6993.method1133(-123, var23 - 1);
                            class378.field5800[var10] -= var24.field6578;
                            class339.field5293[var10] -= var24.field6576;
                            class96.field1399[var10] -= var24.field6572;
                            class170.field2487[var10] -= var24.field6575;
                            var10002 = class541.field7907[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7004; var16++) {
                        int var17 = var16 + 5;
                        if (this.field7004 > var17) {
                            var15 += class541.field7907[var17];
                            var14 += class170.field2487[var17];
                            var12 += class339.field5293[var17];
                            var13 += class96.field1399[var17];
                            var11 += class378.field5800[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class339.field5293[var18];
                            var15 -= class541.field7907[var18];
                            var13 -= class96.field1399[var18];
                            var11 -= class378.field5800[var18];
                            var14 -= class170.field2487[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class165.method1037(var12 / var15, var11 * 256 / var14, var13 / var15, true);
                        }
                    }
                }
            }
            if (class293.field4628) {
                this.method2850(var5, var6 == 0 ? arg1 : null, class53.field732[var6], var6, var6 == 0 ? arg0 : null, arg3, 1);
            } else {
                this.method2839(arg3, var5, class53.field732[var6], var6, 0, var6 == 0 ? arg0 : null, var6 == 0 ? arg1 : null);
            }
            this.field7008[var6] = null;
            this.field7007[var6] = null;
            this.field7001[var6] = null;
            this.field6994[var6] = null;
        }
        if (!this.field6992) {
            if (class440.field6823 != 0) {
                class403.method2590();
            }
            if (class215.field3653) {
                class147.method895();
            }
        }
        if (arg2) {
            this.field7001 = null;
        }
        for (int var7 = 0; var7 < this.field6995; var7++) {
            class53.field732[var7].method700();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method2846(int arg0) {
        field6999++;
        class433.field6540 = new class437[class152.field2017.method1023(127)][];
        int var1 = -20 % ((arg0 - 34) / 33);
        class462.field7111 = new class437[class152.field2017.method1023(126)][];
        class239.field3897 = new boolean[class152.field2017.method1023(127)];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lza;B[Lsj;[[[I)V")
    public final void method2847(class497 arg0, byte arg1, class284[] arg2, int[][][] arg3) {
        field7009++;
        if (!this.field6992) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7000; var6++) {
                    for (int var7 = 0; var7 < this.field7004; var7++) {
                        if ((class416.field6309[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class416.field6309[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method1923(var6, (byte) 105, var7);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -85) {
            this.method2844(-4, -86, -86, -115, null, -79, null, -57, -78, -19);
        }
        for (int var9 = 0; var9 < this.field6995; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6992) {
                if (class264.field4275) {
                    var11 |= 0x8;
                }
                if (class215.field3653) {
                    var10 |= 0x2;
                }
                if (class440.field6823 != 0) {
                    var10 |= 0x1;
                    if (class65.field1014 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class215.field3653) {
                var11 |= 0x7;
            }
            if (!class72.field1080) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field6988[var9] : arg3[var9];
            class529.method3146(var9, arg0.method1236(this.field7000, this.field7004, this.field6988[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method2848(byte arg0) {
        field7017 = null;
        field7016 = null;
        field7011 = null;
        int var1 = -68 / ((-arg0 - 72) / 43);
        field7015 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lsj;Lhw;IIIII)V")
    public final void method2849(class284[] arg0, class208 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field6992) {
            for (int var8 = 0; var8 < 4; var8++) {
                class284 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field7000 && var13 >= 0 && this.field7004 > var13) {
                            var9.method1916(var12, var13, true);
                        }
                    }
                }
            }
        }
        field6991++;
        int var14 = arg3 + arg5;
        int var15 = arg4 + arg6;
        for (int var16 = arg2; var16 < this.field6995; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2840(var16, 0, 0, 0, var14 + var17, arg6 + var18, arg1, arg5 + var17, var15 + var18, false, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([[ILya;Lya;ILya;Lza;I)V")
    private final void method2850(int[][] arg0, class223 arg1, class223 arg2, int arg3, class223 arg4, class497 arg5, int arg6) {
        field7005++;
        byte[][] var8 = this.field7001[arg3];
        byte[][] var9 = this.field6994[arg3];
        byte[][] var10 = this.field7008[arg3];
        byte[][] var11 = this.field7007[arg3];
        if (arg6 != 1) {
            this.method2845(null, null, true, null);
        }
        for (int var12 = 0; var12 < this.field7000; var12++) {
            int var13 = var12 < this.field7000 - 1 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field7004; var14++) {
                int var15 = this.field7004 - 1 > var14 ? var14 + 1 : var14;
                if (class419.field6350 == -1 || class402.method2585((byte) 115, arg3, class419.field6350, var14, var12)) {
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
                        class186 var26 = var21 == 0 ? null : this.field6987.method518((byte) 79, var21 - 1);
                        class436 var27 = var22 == 0 ? null : this.field6993.method1133(-74, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class186 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2693 == -1 && var26.field2703 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2692;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field7000 > var12 && this.field7004 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var35--;
                                var32--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var36--;
                                var32--;
                            }
                            int var37 = var32 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method688(var12, var14) - arg2.method688(var13, var15);
                                var38 = arg2.method688(var13, var14) - arg2.method688(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class387.field5905[var39] = -1;
                            class342.field5337[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2692 ? class406.field6125[var19] : class262.field4242[var19];
                        this.method2851(var11, var14, var9, this.field7000, var19, var8, var20, var26, var12, arg5, var18, var27, (byte) 10, this.field7004);
                        boolean var41 = var26 != null && var26.field2703 != var26.field2693;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class387.field5905[var42] >= 0 && class536.field7849[var42] != class349.field5406[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class472.method2943(var18[1], class272.method1842(class342.field5337[2], class342.field5337[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class472.method2943(var18[3], class272.method1842(class342.field5337[6], class342.field5337[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class472.method2943(var18[0], class272.method1842(class342.field5337[2], class342.field5337[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class472.method2943(var18[2], class272.method1842(class342.field5337[4], class342.field5337[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var27 == null ? 0 : class322.field5024[var19];
                            var46 = class529.field7777[var19];
                            var47 = var26 == null ? 0 : class39.field393[var19];
                            var48 = class302.field4738[var19];
                            var49 = class183.field2647[var19];
                        } else if (var17) {
                            var45 = var27 == null ? 0 : class372.field5714[var19];
                            var47 = var26 == null ? 0 : class8.field90[var19];
                            var46 = class19.field200[var19];
                            var48 = class81.field1201[var19];
                            var44 = class51.field696[var19];
                            var49 = class514.field7628[var19];
                        } else {
                            var45 = var27 == null ? 0 : class539.field7883[var19];
                            var49 = class504.field7553[var19];
                            var44 = class269.field4305[var19];
                            var48 = class84.field1231[var19];
                            var46 = class5.field54[var19];
                            var47 = var26 == null ? 0 : class220.field3721[var19];
                        }
                        int var50 = var47 + var45;
                        if (var50 <= 0) {
                            class84.method589(arg3, var12, var14);
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
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg4 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2693;
                                var63 = arg5.method1267() ? var26.field2708 : var26.field2712;
                                var64 = var26.field2691;
                                int var65 = class146.method885(-128, arg5, var26);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 1;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 1;
                                        client.field1056[4] = var49[var51];
                                        client.field1056[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 5;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 5;
                                        client.field1056[4] = var49[var51];
                                        var68 = 6;
                                        client.field1056[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 3;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 3;
                                        client.field1056[4] = var49[var51];
                                        client.field1056[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 7;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 7;
                                        client.field1056[4] = var49[var51];
                                        var68 = 6;
                                        client.field1056[5] = var48[var51];
                                    } else {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = var49[var51];
                                        client.field1056[2] = var48[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = client.field1056[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field6985[var70];
                                        int var73 = this.field6997[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 128 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 128 - var72;
                                            var75 = 128 - var73;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 128 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class36.field374[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg1.method692(var76, var77) - arg2.method692(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class36.field374[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg2.method692(var78, var79) - arg1.method692(var78, var79);
                                            } else if (arg4 != null && !class24.field269[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg4.method692(var80, var81) - arg2.method692(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class387.field5905[var71] > var26.field2697) {
                                            if (var54 != null) {
                                                var54[var52] = class349.field5406[var71];
                                            }
                                            var59[var52] = class350.field5456[var71];
                                            var58[var52] = class144.field1942[var71];
                                            var57[var52] = class536.field7849[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg5.method1267() ? var26.field2708 : var26.field2712;
                                            var59[var52] = var26.field2691;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field6992 && arg3 == 0) {
                                    class201.method1372(var12, var14, var26.field2706, var26.field2695 * 8, var26.field2715);
                                }
                                if (var19 != 12 && var26.field2693 != -1 && var26.field2698) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class39.field393[var19];
                            } else if (var17) {
                                var51 += class8.field90[var19];
                            } else {
                                var51 += class220.field3721[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class436 var82 = this.field6993.method1133(-76, var22 - 1);
                                class436 var83 = this.field6993.method1133(-85, var23 - 1);
                                class436 var84 = this.field6993.method1133(arg6 ^ 0xFFFFFFB6, var24 - 1);
                                class436 var85 = this.field6993.method1133(-80, var25 - 1);
                                for (int var86 = 0; var86 < var45; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 1;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 1;
                                        client.field1056[4] = var49[var51];
                                        client.field1056[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 5;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 5;
                                        client.field1056[4] = var49[var51];
                                        var88 = 6;
                                        client.field1056[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 3;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 3;
                                        client.field1056[4] = var49[var51];
                                        client.field1056[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = 7;
                                        client.field1056[2] = var48[var51];
                                        client.field1056[3] = 7;
                                        client.field1056[4] = var49[var51];
                                        client.field1056[5] = var48[var51];
                                        var88 = 6;
                                    } else {
                                        client.field1056[0] = var46[var51];
                                        client.field1056[1] = var49[var51];
                                        var88 = 3;
                                        client.field1056[2] = var48[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = client.field1056[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field6985[var90];
                                        int var93 = this.field6997[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var92;
                                            var95 = 128 - var93;
                                        } else if (var20 == 3) {
                                            var94 = 128 - var93;
                                            var95 = var92;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class36.field374[var19][var90]) {
                                            int var96 = (var12 << 7) + var94;
                                            int var97 = (var14 << 7) + var95;
                                            var60[var52] = arg1.method692(var96, var97) - arg2.method692(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class36.field374[var19][var90]) {
                                                int var98 = (var12 << 7) + var94;
                                                int var99 = (var14 << 7) + var95;
                                                var61[var52] = arg2.method692(var98, var99) - arg1.method692(var98, var99);
                                            } else if (arg4 != null && !class24.field269[var19][var90]) {
                                                int var100 = (var12 << 7) + var94;
                                                int var101 = (var14 << 7) + var95;
                                                var61[var52] = arg4.method692(var100, var101) - arg2.method692(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class387.field5905[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class349.field5406[var91];
                                            }
                                            var59[var52] = class350.field5456[var91];
                                            var58[var52] = class144.field1942[var91];
                                            var57[var52] = class536.field7849[var91];
                                        } else {
                                            if (var17 && class36.field374[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var82.field6580;
                                                var59[var52] = var82.field6583;
                                            } else if (var94 == 0 && var95 == 128) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var83.field6580;
                                                var59[var52] = var83.field6583;
                                            } else if (var94 == 128 && var95 == 128) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var84.field6580;
                                                var59[var52] = var84.field6583;
                                            } else if (var94 == 128 && var95 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var85.field6580;
                                                var59[var52] = var85.field6583;
                                            } else {
                                                if (var94 >= 64) {
                                                    if (var95 < 64) {
                                                        var58[var52] = var85.field6580;
                                                        var59[var52] = var85.field6583;
                                                    } else {
                                                        var58[var52] = var84.field6580;
                                                        var59[var52] = var84.field6583;
                                                    }
                                                } else if (var95 < 64) {
                                                    var58[var52] = var82.field6580;
                                                    var59[var52] = var82.field6583;
                                                } else {
                                                    var58[var52] = var83.field6580;
                                                    var59[var52] = var83.field6583;
                                                }
                                                int var102 = class528.method3142(var94 << 7 >> 7, arg0[var13][var14], 64512, arg0[var12][var14]);
                                                int var103 = class528.method3142(var94 << 7 >> 7, arg0[var13][var15], 64512, arg0[var12][var15]);
                                                var57[var52] = class528.method3142(var95 << 7 >> 7, var103, 64512, var102);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field6581) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg2.method688(var12, var14);
                            int var105 = arg2.method688(var13, var14);
                            int var106 = arg2.method688(var13, var15);
                            int var107 = arg2.method688(var12, var15);
                            if (arg3 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field2700) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field6989[arg3][var12][var14] = (byte) class410.method2621(this.field6989[arg3][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field6992) {
                                var109 = class153.method935(var12, var14);
                                var110 = class334.method2220(var12, var14);
                                var111 = class154.method939(var12, var14);
                            }
                            arg2.method687(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class84.method589(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([[BI[[BII[[BILmd;ILza;[ZLlk;BI)V")
    private final void method2851(byte[][] arg0, int arg1, byte[][] arg2, int arg3, int arg4, byte[][] arg5, int arg6, class186 arg7, int arg8, class497 arg9, boolean[] arg10, class436 arg11, byte arg12, int arg13) {
        field6990++;
        boolean[] var15 = arg7 != null && arg7.field2692 ? class406.field6125[arg4] : class262.field4242[arg4];
        if (arg1 > 0) {
            if (arg8 > 0) {
                int var16 = arg0[arg8 - 1][arg1 - 1] & 0xFF;
                if (var16 > 0) {
                    class186 var17 = this.field6987.method518((byte) 124, var16 - 1);
                    if (var17.field2693 != -1 && var17.field2692) {
                        byte var18 = arg5[arg8 - 1][arg1 - 1];
                        int var19 = arg2[arg8 - 1][arg1 - 1] * 2 + 4 & 0x7;
                        int var20 = class146.method885(-125, arg9, var17);
                        if (class36.field374[var18][var19]) {
                            class536.field7849[0] = var17.field2693;
                            class349.field5406[0] = var20;
                            class144.field1942[0] = arg9.method1267() ? var17.field2708 : var17.field2712;
                            class350.field5456[0] = var17.field2691;
                            class387.field5905[0] = var17.field2697;
                            class342.field5337[0] = 256;
                        }
                    }
                }
            }
            if (arg3 - 1 > arg8) {
                int var21 = arg0[arg8 + 1][arg1 - 1] & 0xFF;
                if (var21 > 0) {
                    class186 var22 = this.field6987.method518((byte) 113, var21 - 1);
                    if (var22.field2693 != -1 && var22.field2692) {
                        byte var23 = arg5[arg8 + 1][arg1 - 1];
                        int var24 = arg2[arg8 + 1][arg1 - 1] * 2 + 6 & 0x7;
                        int var25 = class146.method885(arg12 - 128, arg9, var22);
                        if (class36.field374[var23][var24]) {
                            class536.field7849[2] = var22.field2693;
                            class349.field5406[2] = var25;
                            class144.field1942[2] = arg9.method1267() ? var22.field2708 : var22.field2712;
                            class350.field5456[2] = var22.field2691;
                            class387.field5905[2] = var22.field2697;
                            class342.field5337[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg13 - 1) > arg1) {
            if (arg8 > 0) {
                int var26 = arg0[arg8 - 1][arg1 + 1] & 0xFF;
                if (var26 > 0) {
                    class186 var27 = this.field6987.method518((byte) 111, var26 - 1);
                    if (var27.field2693 != -1 && var27.field2692) {
                        byte var28 = arg5[arg8 - 1][arg1 + 1];
                        int var29 = (arg2[arg8 - 1][arg1 + 1] * 2) + 2 & 0x7;
                        int var30 = class146.method885(-117, arg9, var27);
                        if (class36.field374[var28][var29]) {
                            class536.field7849[6] = var27.field2693;
                            class349.field5406[6] = var30;
                            class144.field1942[6] = arg9.method1267() ? var27.field2708 : var27.field2712;
                            class350.field5456[6] = var27.field2691;
                            class387.field5905[6] = var27.field2697;
                            class342.field5337[6] = 64;
                        }
                    }
                }
            }
            if (arg8 < (arg3 - 1)) {
                int var31 = arg0[arg8 + 1][arg1 + 1] & 0xFF;
                if (var31 > 0) {
                    class186 var32 = this.field6987.method518((byte) 94, var31 - 1);
                    if (var32.field2693 != -1 && var32.field2692) {
                        byte var33 = arg5[arg8 + 1][arg1 + 1];
                        int var34 = -(-(arg2[arg8 + 1][arg1 + 1] * 2)) & 0x7;
                        int var35 = class146.method885(arg12 ^ 0xFFFFFF8C, arg9, var32);
                        if (class36.field374[var33][var34]) {
                            class536.field7849[4] = var32.field2693;
                            class349.field5406[4] = var35;
                            class144.field1942[4] = arg9.method1267() ? var32.field2708 : var32.field2712;
                            class350.field5456[4] = var32.field2691;
                            class387.field5905[4] = var32.field2697;
                            class342.field5337[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg12 != 10) {
            this.method2847(null, (byte) 109, null, null);
        }
        if (arg1 > 0) {
            int var36 = arg0[arg8][arg1 - 1] & 0xFF;
            if (var36 > 0) {
                class186 var37 = this.field6987.method518((byte) 69, var36 - 1);
                if (var37.field2693 != -1) {
                    byte var38 = arg5[arg8][arg1 - 1];
                    byte var39 = arg2[arg8][arg1 - 1];
                    if (var37.field2692) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class146.method885(-128, arg9, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class36.field374[var38][var41] && class387.field5905[var40] <= var37.field2697) {
                                class536.field7849[var40] = var37.field2693;
                                class349.field5406[var40] = var42;
                                class144.field1942[var40] = arg9.method1267() ? var37.field2708 : var37.field2712;
                                class350.field5456[var40] = var37.field2691;
                                if (class387.field5905[var40] == var37.field2697) {
                                    class342.field5337[var40] = class410.method2621(class342.field5337[var40], 32);
                                } else {
                                    class342.field5337[var40] = 32;
                                }
                                class387.field5905[var40] = var37.field2697;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg6 & 0x3]) {
                            arg10[0] = class406.field6125[var38][class272.method1842(3, var39 + 2)];
                        }
                    } else if (!var15[arg6 & 0x3]) {
                        arg10[0] = class262.field4242[var38][class272.method1842(var39 + 2, 3)];
                    }
                }
            }
        }
        if ((arg13 - 1) > arg1) {
            int var44 = arg0[arg8][arg1 + 1] & 0xFF;
            if (var44 > 0) {
                class186 var45 = this.field6987.method518((byte) 72, var44 - 1);
                if (var45.field2693 != -1) {
                    byte var46 = arg5[arg8][arg1 + 1];
                    byte var47 = arg2[arg8][arg1 + 1];
                    if (var45.field2692) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class146.method885(-123, arg9, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class36.field374[var46][var49] && class387.field5905[var48] <= var45.field2697) {
                                class536.field7849[var48] = var45.field2693;
                                class349.field5406[var48] = var50;
                                class144.field1942[var48] = arg9.method1267() ? var45.field2708 : var45.field2712;
                                class350.field5456[var48] = var45.field2691;
                                if (class387.field5905[var48] == var45.field2697) {
                                    class342.field5337[var48] = class410.method2621(class342.field5337[var48], 16);
                                } else {
                                    class342.field5337[var48] = 16;
                                }
                                class387.field5905[var48] = var45.field2697;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg6 + 2 & 0x3]) {
                            arg10[2] = class406.field6125[var46][class272.method1842(-(-var47), 3)];
                        }
                    } else if (!var15[arg6 + 2 & 0x3]) {
                        arg10[2] = class262.field4242[var46][class272.method1842(3, -(-var47))];
                    }
                }
            }
        }
        if (arg8 > 0) {
            int var52 = arg0[arg8 - 1][arg1] & 0xFF;
            if (var52 > 0) {
                class186 var53 = this.field6987.method518((byte) 82, var52 - 1);
                if (var53.field2693 != -1) {
                    byte var54 = arg5[arg8 - 1][arg1];
                    byte var55 = arg2[arg8 - 1][arg1];
                    if (var53.field2692) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class146.method885(arg12 ^ 0xFFFFFF80, arg9, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class36.field374[var54][var57] && class387.field5905[var56] <= var53.field2697) {
                                class536.field7849[var56] = var53.field2693;
                                class349.field5406[var56] = var58;
                                class144.field1942[var56] = arg9.method1267() ? var53.field2708 : var53.field2712;
                                class350.field5456[var56] = var53.field2691;
                                if (class387.field5905[var56] == var53.field2697) {
                                    class342.field5337[var56] = class410.method2621(class342.field5337[var56], 8);
                                } else {
                                    class342.field5337[var56] = 8;
                                }
                                class387.field5905[var56] = var53.field2697;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg6 + 3 & 0x3]) {
                            arg10[3] = class406.field6125[var54][class272.method1842(3, var55 + 1)];
                        }
                    } else if (!var15[arg6 + 3 & 0x3]) {
                        arg10[3] = class262.field4242[var54][class272.method1842(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg8 < (arg3 - 1)) {
            int var60 = arg0[arg8 + 1][arg1] & 0xFF;
            if (var60 > 0) {
                class186 var61 = this.field6987.method518((byte) 87, var60 - 1);
                if (var61.field2693 != -1) {
                    byte var62 = arg5[arg8 + 1][arg1];
                    byte var63 = arg2[arg8 + 1][arg1];
                    if (var61.field2692) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class146.method885(arg12 ^ 0xFFFFFF9E, arg9, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class36.field374[var62][var65] && var61.field2697 >= class387.field5905[var64]) {
                                class536.field7849[var64] = var61.field2693;
                                class349.field5406[var64] = var66;
                                class144.field1942[var64] = arg9.method1267() ? var61.field2708 : var61.field2712;
                                class350.field5456[var64] = var61.field2691;
                                if (class387.field5905[var64] == var61.field2697) {
                                    class342.field5337[var64] = class410.method2621(class342.field5337[var64], 4);
                                } else {
                                    class342.field5337[var64] = 4;
                                }
                                class387.field5905[var64] = var61.field2697;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg6 + 1 & 0x3]) {
                            arg10[1] = class406.field6125[var62][class272.method1842(3, var63 + 3)];
                        }
                    } else if (!var15[arg6 + 1 & 0x3]) {
                        arg10[1] = class262.field4242[var62][class272.method1842(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg7 == null) {
            return;
        }
        int var68 = class146.method885(arg12 - 136, arg9, arg7);
        if (!arg7.field2692) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg6 * 2 & 0x7;
            if (class36.field374[arg4][var69] && arg7.field2697 >= class387.field5905[var70]) {
                class536.field7849[var70] = arg7.field2693;
                class349.field5406[var70] = var68;
                class144.field1942[var70] = arg9.method1267() ? arg7.field2708 : arg7.field2712;
                class350.field5456[var70] = arg7.field2691;
                if (class387.field5905[var70] == arg7.field2697) {
                    class342.field5337[var70] = class410.method2621(class342.field5337[var70], 2);
                } else {
                    class342.field5337[var70] = 2;
                }
                class387.field5905[var70] = arg7.field2697;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIIZLsm;Lrb;)V")
    public class452(int arg0, int arg1, int arg2, boolean arg3, class70 arg4, class178 arg5) {
        this.field6993 = arg5;
        this.field6987 = arg4;
        this.field6992 = arg3;
        this.field7004 = arg2;
        this.field7000 = arg1;
        this.field6995 = arg0;
        this.field6989 = new byte[this.field6995][this.field7000 + 1][this.field7004 + 1];
        this.field7008 = new byte[this.field6995][this.field7000][this.field7004];
        this.field7001 = new byte[this.field6995][this.field7000][this.field7004];
        this.field6994 = new byte[this.field6995][this.field7000][this.field7004];
        this.field6988 = new int[this.field6995][this.field7000 + 1][this.field7004 + 1];
        this.field7007 = new byte[this.field6995][this.field7000][this.field7004];
    }

    static {
        new class213("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field7011 = new class104(106, -1);
        field7013 = -1;
        field7014 = 1;
        field7017 = new boolean[8];
    }
}
