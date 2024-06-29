import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class488 {

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lvq;")
    private class295 field6791;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "Z")
    public boolean field6802;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lfl;")
    private class480 field6797;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "[[[B")
    private byte[][][] field6787;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "[[[B")
    private byte[][][] field6809;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[[[B")
    private byte[][][] field6788;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[[[I")
    public int[][][] field6798;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "[[[B")
    private byte[][][] field6794;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[[[B")
    public byte[][][] field6790;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "F")
    public static float field6815;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Lpe;")
    public static class398 field6789;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "[[[B")
    public byte[][][] field6795;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[[[I[Ldg;Lwm;)V")
    public final void method2837(byte arg0, int[][][] arg1, class261[] arg2, class364 arg3) {
        if (!this.field6802) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6799; var6++) {
                    for (int var7 = 0; var7 < this.field6812; var7++) {
                        if ((class1.field26[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class1.field26[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method1479(12533, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        field6807++;
        if (arg0 >= -51) {
            method2846((byte) -81);
        }
        for (int var9 = 0; var9 < this.field6813; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6802) {
                if (class4.field57) {
                    var11 |= 0x8;
                }
                if (class123.field1801) {
                    var10 |= 0x2;
                }
                if (class449.field6109 != 0) {
                    var10 |= 0x1;
                    if (class51.field681 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class123.field1801) {
                var11 |= 0x7;
            }
            int[][] var12 = arg1 == null || arg1.length <= var9 ? this.field6798[var9] : arg1[var9];
            class309.method1703(var9, arg3.method2089(this.field6799, this.field6812, this.field6798[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ltf;[[ILtf;Lwm;IILtf;)V")
    private final void method2838(class177 arg0, int[][] arg1, class177 arg2, class364 arg3, int arg4, int arg5, class177 arg6) {
        field6810++;
        for (int var8 = arg5; var8 < this.field6799; var8++) {
            for (int var9 = 0; var9 < this.field6812; var9++) {
                if (class279.field3716 == -1 || class383.method2350(var9, class279.field3716, arg4, 125, var8)) {
                    byte var10 = this.field6809[arg4][var8][var9];
                    byte var11 = this.field6787[arg4][var8][var9];
                    int var12 = this.field6794[arg4][var8][var9] & 0xFF;
                    int var13 = this.field6788[arg4][var8][var9] & 0xFF;
                    class91 var14 = var12 == 0 ? null : this.field6797.method2801(arg5 + 76, var12 + -1);
                    class410 var15 = var13 == 0 ? null : this.field6791.method1658(1, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class215.field2900[var10];
                        var16 = var15 == null ? 0 : class441.field5948[var10];
                    } else if (var14 != null) {
                        var17 = class215.field2900[var10];
                    } else if (var15 != null) {
                        var16 = class215.field2900[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1337 == -1 && var14.field1322 == -1 && var14.field1328 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method1999() ? var14.field1328 : var14.field1324;
                            if (class30.field405) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1329;
                                if (var14.field1337 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1337;
                                }
                                if (var14.field1322 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field1322;
                                }
                                var19++;
                            }
                            if (!this.field6802 && arg4 == 0) {
                                class317.method1736(var8, var9, var14.field1339, var14.field1334 * 8, var14.field1330);
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
                            int var28 = var15.field5627;
                            if (class30.field405) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field5619;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = class73.field1002.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg2 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = class73.field1002[var36];
                            int var46 = class385.field5326[var36];
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
                            if (var34 != null && class385.field5316[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method368(var49, var50) - arg6.method368(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class385.field5316[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method368(var51, var52) - arg0.method368(var51, var52);
                                } else if (arg2 != null && !class214.field2881[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method368(var53, var54) - arg6.method368(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method371(var8, var9);
                        int var38 = arg6.method371(var8 + 1, var9);
                        int var39 = arg6.method371(var8 + 1, var9 - -1);
                        int var40 = arg6.method371(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1320) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field6790[arg4][var8][var9] = (byte) class21.method133(this.field6790[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field6802) {
                            var42 = class102.method621(var8, var9);
                            var43 = class326.method1826(var8, var9);
                            var44 = class132.method808(var8, var9);
                        }
                        arg6.method382(var8, var9, var32, var34, var33, var35, class86.field1184[var10], class327.field4366[var10], class432.field5887[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class356.method2187(arg4, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I[Ldg;ILbt;III)V")
    public final void method2839(int arg0, class261[] arg1, int arg2, class32 arg3, int arg4, int arg5, int arg6) {
        field6801++;
        if (!this.field6802) {
            for (int var8 = 0; var8 < 4; var8++) {
                class261 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field6799 > var12 && var13 >= 0 && var13 < this.field6812) {
                            var9.method1470(77, var12, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg0 + arg6;
        int var15 = arg5 + arg4;
        for (int var16 = 0; var16 < this.field6813; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2841(arg4 + var18, var14 + var17, 0, false, arg0 + var17, var15 + var18, true, arg3, 0, var16, 0);
                }
            }
        }
        if (arg2 != 29586) {
            method2842(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLr;)Lvi;")
    public static final class347 method2840(int arg0, boolean arg1, class110 arg2) {
        field6796++;
        if (arg1) {
            byte[] var3 = arg2.method695(arg0, 82);
            return var3 == null ? null : new class347(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIZIIZLbt;III)V")
    private final void method2841(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, class32 arg7, int arg8, int arg9, int arg10) {
        field6800++;
        if (!arg6) {
            return;
        }
        if (arg10 == 1) {
            arg2 = 1;
        } else if (arg10 == 2) {
            arg2 = 1;
            arg8 = 1;
        } else if (arg10 == 3) {
            arg8 = 1;
        }
        if (arg4 < 0 || arg4 >= this.field6799 || arg0 < 0 || this.field6812 <= arg0) {
            while (true) {
                int var14 = arg7.method201((byte) -126);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method201((byte) -105);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method201((byte) -110);
                }
            }
        }
        if (!this.field6802 && !arg3) {
            class1.field26[arg9][arg4][arg0] = 0;
        }
        while (true) {
            int var12 = arg7.method201((byte) -123);
            if (var12 == 0) {
                if (this.field6802) {
                    this.field6798[0][arg4 + arg8][arg0 + arg2] = 0;
                    return;
                } else if (arg9 == 0) {
                    this.field6798[0][arg4 + arg8][arg0 + arg2] = -class445.method2612(arg1 + 932731, true, arg5 + 556238) * 8;
                    return;
                } else {
                    this.field6798[arg9][arg4 + arg8][arg0 + arg2] = this.field6798[arg9 - 1][arg4 + arg8][arg0 + arg2] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method201((byte) -115);
                if (this.field6802) {
                    this.field6798[0][arg4 + arg8][arg0 + arg2] = var13 * 8;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg9 == 0) {
                    this.field6798[0][arg4 + arg8][arg0 + arg2] = -var13 * 8;
                    return;
                }
                this.field6798[arg9][arg4 + arg8][arg0 + arg2] = this.field6798[arg9 - 1][arg4 + arg8][arg0 + arg2] - var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg7.method201((byte) -109);
                } else {
                    this.field6794[arg9][arg4][arg0] = arg7.method211(29861);
                    this.field6809[arg9][arg4][arg0] = (byte) ((var12 - 2) / 4);
                    this.field6787[arg9][arg4][arg0] = (byte) class99.method612(arg10 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field6802 && !arg3) {
                    class1.field26[arg9][arg4][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                this.field6788[arg9][arg4][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I")
    public static final int method2842(boolean arg0) {
        field6793++;
        if (arg0) {
            field6816 = -49;
        }
        return 6;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILbt;[Ldg;IIIIII)V")
    public final void method2843(int arg0, int arg1, class32 arg2, class261[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6792++;
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field6802) {
            class261 var12 = arg3[arg8];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class266.method1502(var13 & 0x7, -15286, arg6, var14 & 0x7) + arg0;
                    int var16 = arg5 + class148.method883(-1, var13 & 0x7, arg6, var14 & 0x7);
                    if (var15 > 0 && (this.field6799 - 1) > var15 && var16 > 0 && var16 < this.field6812 - 1) {
                        var12.method1470(arg9 + 36, var15, var16);
                    }
                }
            }
        }
        int var17 = (arg1 & arg9) * 8;
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        int var19 = (arg1 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg6 == 1) {
            var21 = 1;
        } else if (arg6 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg6 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field6813; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg7 != var22 || var23 < var11 || var11 + 8 < var23 || var24 < var17 || var24 > (var17 + 8)) {
                        this.method2841(-1, 0, 0, false, -1, 0, true, arg2, 0, 0, 0);
                    } else if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg6 == 0) {
                            var31 = arg5 + var24 - var17;
                            var32 = arg0 - (var11 - var23);
                        } else if (arg6 == 1) {
                            var31 = var11 + arg5 + 8 - var23;
                            var32 = var24 + arg0 - var17;
                        } else if (arg6 == 2) {
                            var32 = arg0 - var23 - (-var11 - 8);
                            var31 = var17 + (arg5 - -8) - var24;
                        } else {
                            var31 = var23 + arg5 - var11;
                            var32 = var17 + arg0 + 8 - var24;
                        }
                        this.method2841(var31, var18 + var23, 0, true, var32, var19 + var24, true, arg2, 0, arg8, 0);
                    } else {
                        int var25 = class266.method1502(var23 & 0x7, -15286, arg6, var24 & 0x7) + arg0;
                        int var26 = arg5 + class148.method883(-1, var23 & 0x7, arg6, var24 & 0x7);
                        this.method2841(var26, var18 + var23, var21, false, var25, var19 + var24, true, arg2, var20, arg8, arg6);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg6 == 0) {
                                var30 = var27 + arg0 - var11;
                                var29 = arg5 + var28 - var17;
                            } else if (arg6 == 1) {
                                var30 = var28 + arg0 - var17;
                                var29 = var11 + 8 - (var27 - arg5);
                            } else if (arg6 == 2) {
                                var29 = var17 + arg5 + 8 - var28;
                                var30 = var11 + arg0 + 8 - var27;
                            } else {
                                var29 = var27 + arg5 - var11;
                                var30 = var17 + arg0 + 8 - var28;
                            }
                            if (var30 >= 0 && this.field6799 > var30 && var29 >= 0 && var29 < this.field6812) {
                                this.field6798[arg8][var30][var29] = this.field6798[arg8][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIBII)V")
    public final void method2844(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        for (int var7 = arg1; var7 < (arg1 + arg0); var7++) {
            for (int var11 = arg2; var11 < (arg2 + arg4); var11++) {
                if (var11 >= 0 && this.field6799 > var11 && var7 >= 0 && var7 < this.field6812) {
                    this.field6798[arg5][var11][var7] = arg5 <= 0 ? 0 : this.field6798[arg5 - 1][var11][var7] - 240;
                }
            }
        }
        field6814++;
        if (arg2 > 0 && arg2 < this.field6799) {
            for (int var8 = arg1 + 1; var8 < (arg0 + arg1); var8++) {
                if (var8 >= 0 && var8 < this.field6812) {
                    this.field6798[arg5][arg2][var8] = this.field6798[arg5][arg2 - 1][var8];
                }
            }
        }
        int var9 = -31 % ((26 - arg3) / 39);
        if (arg1 > 0 && arg1 < this.field6812) {
            for (int var10 = arg2 + 1; var10 < (arg2 + arg4); var10++) {
                if (var10 >= 0 && this.field6799 > var10) {
                    this.field6798[arg5][var10][arg1] = this.field6798[arg5][var10][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= this.field6799 || arg1 >= this.field6812) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 > 0 && this.field6798[arg5][arg2 - 1][arg1] != 0) {
                this.field6798[arg5][arg2][arg1] = this.field6798[arg5][arg2 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field6798[arg5][arg2][arg1 - 1] != 0) {
                this.field6798[arg5][arg2][arg1] = this.field6798[arg5][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field6798[arg5][arg2 - 1][arg1 - 1] != 0) {
                this.field6798[arg5][arg2][arg1] = this.field6798[arg5][arg2 - 1][arg1 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field6798[arg5][arg2 - 1][arg1] == this.field6798[arg5 - 1][arg2 - 1][arg1]) {
            if (arg1 > 0 && this.field6798[arg5 - 1][arg2][arg1 - 1] != this.field6798[arg5][arg2][arg1 - 1]) {
                this.field6798[arg5][arg2][arg1] = this.field6798[arg5][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field6798[arg5 - 1][arg2 - 1][arg1 - 1] != this.field6798[arg5][arg2 - 1][arg1 - 1]) {
                this.field6798[arg5][arg2][arg1] = this.field6798[arg5][arg2 - 1][arg1 - 1];
                return;
            }
            return;
        } else {
            this.field6798[arg5][arg2][arg1] = this.field6798[arg5][arg2 - 1][arg1];
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ltf;ILwm;Ltf;)V")
    public final void method2845(class177 arg0, int arg1, class364 arg2, class177 arg3) {
        field6811++;
        int[][] var5 = new int[this.field6799][this.field6812];
        if (class453.field6145 == null || class453.field6145.length != this.field6812) {
            class385.field5323 = new int[this.field6812];
            class453.field6145 = new int[this.field6812];
            class302.field4031 = new int[this.field6812];
            class245.field3268 = new int[this.field6812];
            class177.field2404 = new int[this.field6812];
        }
        int var6 = 0;
        if (arg1 != 27043) {
            this.method2851(112, 23, (class364) null, (class177) null, (class177) null, (class177) null, (int[][]) null);
        }
        while (this.field6813 > var6) {
            for (int var8 = 0; var8 < this.field6812; var8++) {
                class453.field6145[var8] = 0;
                class245.field3268[var8] = 0;
                class302.field4031[var8] = 0;
                class385.field5323[var8] = 0;
                class177.field2404[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6799; var9++) {
                for (int var10 = 0; var10 < this.field6812; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field6799 > var19) {
                        int var20 = this.field6788[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class410 var21 = this.field6791.method1658(1, var20 - 1);
                            class453.field6145[var10] += var21.field5620;
                            class245.field3268[var10] += var21.field5621;
                            class302.field4031[var10] += var21.field5624;
                            class385.field5323[var10] += var21.field5613;
                            var10002 = class177.field2404[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6788[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class410 var24 = this.field6791.method1658(arg1 ^ 0x69A2, var23 - 1);
                            class453.field6145[var10] -= var24.field5620;
                            class245.field3268[var10] -= var24.field5621;
                            class302.field4031[var10] -= var24.field5624;
                            class385.field5323[var10] -= var24.field5613;
                            var10002 = class177.field2404[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6812; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field6812) {
                            var11 += class453.field6145[var17];
                            var14 += class385.field5323[var17];
                            var13 += class302.field4031[var17];
                            var15 += class177.field2404[var17];
                            var12 += class245.field3268[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class385.field5323[var18];
                            var13 -= class302.field4031[var18];
                            var12 -= class245.field3268[var18];
                            var15 -= class177.field2404[var18];
                            var11 -= class453.field6145[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class461.method2712(108, var11 * 256 / var14, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class59.field791) {
                this.method2851(-67, var6, arg2, var6 == 0 ? arg3 : null, var6 == 0 ? arg0 : null, class221.field2945[var6], var5);
            } else {
                this.method2838(var6 == 0 ? arg3 : null, var5, var6 == 0 ? arg0 : null, arg2, var6, arg1 - 27043, class221.field2945[var6]);
            }
            this.field6788[var6] = null;
            this.field6794[var6] = null;
            this.field6809[var6] = null;
            this.field6787[var6] = null;
            var6++;
        }
        if (!this.field6802) {
            if (class449.field6109 != 0) {
                class369.method2282();
            }
            if (class123.field1801) {
                class12.method69();
            }
        }
        for (int var7 = 0; var7 < this.field6813; var7++) {
            class221.field2945[var7].method366();
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method2846(byte arg0) {
        int var1 = -11 / ((18 - arg0) / 46);
        field6789 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ltq;Lmg;II[[B[ZILwm;III[[BI[[B)V")
    private final void method2847(class410 arg0, class91 arg1, int arg2, int arg3, byte[][] arg4, boolean[] arg5, int arg6, class364 arg7, int arg8, int arg9, int arg10, byte[][] arg11, int arg12, byte[][] arg13) {
        if (arg1 != null && arg0 != null || arg0 != null && arg6 == 12 || arg1 != null && arg6 == 0) {
            boolean[] var15 = arg1 != null && arg1.field1326 ? class78.field1055[arg6] : class47.field638[arg6];
            if (arg2 > 0) {
                if (arg12 > 0) {
                    int var16 = arg13[arg12 - 1][arg2 - 1] & 0xFF;
                    if (var16 > 0) {
                        class91 var17 = this.field6797.method2801(-85, var16 - 1);
                        if (var17.field1337 != -1 && var17.field1326) {
                            byte var18 = arg4[arg12 - 1][arg2 - 1];
                            int var19 = arg11[arg12 - 1][arg2 - 1] * 2 + 4 & 0x7;
                            int var20 = class107.method662(arg7, arg8 + 251, var17);
                            if (class385.field5316[var18][var19]) {
                                class257.field3419[0] = var17.field1337;
                                class405.field5566[0] = var20;
                                class220.field2940[0] = arg7.method1999() ? var17.field1328 : var17.field1324;
                                class212.field2854[0] = var17.field1329;
                                class150.field2116[0] = var17.field1340;
                                class136.field1984[0] = 256;
                            }
                        }
                    }
                }
                if (arg12 < arg9 - 1) {
                    int var21 = arg13[arg12 + 1][arg2 - 1] & 0xFF;
                    if (var21 > 0) {
                        class91 var22 = this.field6797.method2801(arg8 ^ 0x66, var21 - 1);
                        if (var22.field1337 != -1 && var22.field1326) {
                            byte var23 = arg4[arg12 + 1][arg2 - 1];
                            int var24 = arg11[arg12 + 1][arg2 - 1] * 2 + 6 & 0x7;
                            int var25 = class107.method662(arg7, arg8 + 251, var22);
                            if (class385.field5316[var23][var24]) {
                                class257.field3419[2] = var22.field1337;
                                class405.field5566[2] = var25;
                                class220.field2940[2] = arg7.method1999() ? var22.field1328 : var22.field1324;
                                class212.field2854[2] = var22.field1329;
                                class150.field2116[2] = var22.field1340;
                                class136.field1984[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg10 - 1 > arg2) {
                if (arg12 > 0) {
                    int var26 = arg13[arg12 - 1][arg2 + 1] & 0xFF;
                    if (var26 > 0) {
                        class91 var27 = this.field6797.method2801(-76, var26 - 1);
                        if (var27.field1337 != -1 && var27.field1326) {
                            byte var28 = arg4[arg12 - 1][arg2 + 1];
                            int var29 = arg11[arg12 - 1][arg2 + 1] * 2 + 2 & 0x7;
                            int var30 = class107.method662(arg7, 255, var27);
                            if (class385.field5316[var28][var29]) {
                                class257.field3419[6] = var27.field1337;
                                class405.field5566[6] = var30;
                                class220.field2940[6] = arg7.method1999() ? var27.field1328 : var27.field1324;
                                class212.field2854[6] = var27.field1329;
                                class150.field2116[6] = var27.field1340;
                                class136.field1984[6] = 64;
                            }
                        }
                    }
                }
                if (arg12 < (arg9 - 1)) {
                    int var31 = arg13[arg12 + 1][arg2 + 1] & 0xFF;
                    if (var31 > 0) {
                        class91 var32 = this.field6797.method2801(-77, var31 - 1);
                        if (var32.field1337 != -1 && var32.field1326) {
                            byte var33 = arg4[arg12 + 1][arg2 + 1];
                            int var34 = arg11[arg12 + 1][arg2 + 1] * 2 & 0x7;
                            int var35 = class107.method662(arg7, 255, var32);
                            if (class385.field5316[var33][var34]) {
                                class257.field3419[4] = var32.field1337;
                                class405.field5566[4] = var35;
                                class220.field2940[4] = arg7.method1999() ? var32.field1328 : var32.field1324;
                                class212.field2854[4] = var32.field1329;
                                class150.field2116[4] = var32.field1340;
                                class136.field1984[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg2 > 0) {
                int var36 = arg13[arg12][arg2 - 1] & 0xFF;
                if (var36 > 0) {
                    class91 var37 = this.field6797.method2801(-42, var36 - 1);
                    if (var37.field1337 != -1) {
                        byte var38 = arg4[arg12][arg2 - 1];
                        byte var39 = arg11[arg12][arg2 - 1];
                        if (var37.field1326) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class107.method662(arg7, 255, var37);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class385.field5316[var38][var41] && var37.field1340 >= class150.field2116[var40]) {
                                    class257.field3419[var40] = var37.field1337;
                                    class405.field5566[var40] = var42;
                                    class220.field2940[var40] = arg7.method1999() ? var37.field1328 : var37.field1324;
                                    class212.field2854[var40] = var37.field1329;
                                    if (class150.field2116[var40] == var37.field1340) {
                                        class136.field1984[var40] = class21.method133(class136.field1984[var40], 32);
                                    } else {
                                        class136.field1984[var40] = 32;
                                    }
                                    class150.field2116[var40] = var37.field1340;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg3 & 0x3]) {
                                arg5[0] = class78.field1055[var38][class99.method612(var39 + 2, 3)];
                            }
                        } else if (!var15[arg3 & 0x3]) {
                            arg5[0] = class47.field638[var38][class99.method612(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg2 < arg10 - 1) {
                int var44 = arg13[arg12][arg2 + 1] & 0xFF;
                if (var44 > 0) {
                    class91 var45 = this.field6797.method2801(123, var44 - 1);
                    if (var45.field1337 != -1) {
                        byte var46 = arg4[arg12][arg2 + 1];
                        byte var47 = arg11[arg12][arg2 + 1];
                        if (var45.field1326) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class107.method662(arg7, 255, var45);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class385.field5316[var46][var49] && var45.field1340 >= class150.field2116[var48]) {
                                    class257.field3419[var48] = var45.field1337;
                                    class405.field5566[var48] = var50;
                                    class220.field2940[var48] = arg7.method1999() ? var45.field1328 : var45.field1324;
                                    class212.field2854[var48] = var45.field1329;
                                    if (class150.field2116[var48] == var45.field1340) {
                                        class136.field1984[var48] = class21.method133(class136.field1984[var48], 16);
                                    } else {
                                        class136.field1984[var48] = 16;
                                    }
                                    class150.field2116[var48] = var45.field1340;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg3 + 2 & 0x3]) {
                                arg5[2] = class78.field1055[var46][class99.method612(3, var47)];
                            }
                        } else if (!var15[arg3 + 2 & 0x3]) {
                            arg5[2] = class47.field638[var46][class99.method612(3, var47)];
                        }
                    }
                }
            }
            if (arg12 > 0) {
                int var52 = arg13[arg12 - 1][arg2] & 0xFF;
                if (var52 > 0) {
                    class91 var53 = this.field6797.method2801(-102, var52 - 1);
                    if (var53.field1337 != -1) {
                        byte var54 = arg4[arg12 - 1][arg2];
                        byte var55 = arg11[arg12 - 1][arg2];
                        if (var53.field1326) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class107.method662(arg7, arg8 + 251, var53);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class385.field5316[var54][var57] && class150.field2116[var56] <= var53.field1340) {
                                    class257.field3419[var56] = var53.field1337;
                                    class405.field5566[var56] = var58;
                                    class220.field2940[var56] = arg7.method1999() ? var53.field1328 : var53.field1324;
                                    class212.field2854[var56] = var53.field1329;
                                    if (class150.field2116[var56] == var53.field1340) {
                                        class136.field1984[var56] = class21.method133(class136.field1984[var56], 8);
                                    } else {
                                        class136.field1984[var56] = 8;
                                    }
                                    class150.field2116[var56] = var53.field1340;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg3 + 3 & 0x3]) {
                                arg5[3] = class78.field1055[var54][class99.method612(var55 + 1, 3)];
                            }
                        } else if (!var15[arg3 + 3 & 0x3]) {
                            arg5[3] = class47.field638[var54][class99.method612(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg12 < arg9 - 1) {
                int var60 = arg13[arg12 + 1][arg2] & 0xFF;
                if (var60 > 0) {
                    class91 var61 = this.field6797.method2801(116, var60 - 1);
                    if (var61.field1337 != -1) {
                        byte var62 = arg4[arg12 + 1][arg2];
                        byte var63 = arg11[arg12 + 1][arg2];
                        if (var61.field1326) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class107.method662(arg7, 255, var61);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class385.field5316[var62][var65] && var61.field1340 >= class150.field2116[var64]) {
                                    class257.field3419[var64] = var61.field1337;
                                    class405.field5566[var64] = var66;
                                    class220.field2940[var64] = arg7.method1999() ? var61.field1328 : var61.field1324;
                                    class212.field2854[var64] = var61.field1329;
                                    if (class150.field2116[var64] == var61.field1340) {
                                        class136.field1984[var64] = class21.method133(class136.field1984[var64], 4);
                                    } else {
                                        class136.field1984[var64] = 4;
                                    }
                                    class150.field2116[var64] = var61.field1340;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg3 + 1 & 0x3]) {
                                arg5[1] = class78.field1055[var62][class99.method612(var63 + 3, 3)];
                            }
                        } else if (!var15[arg3 + 1 & 0x3]) {
                            arg5[1] = class47.field638[var62][class99.method612(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg8 != 4) {
            this.field6797 = null;
        }
        field6808++;
        if (arg1 == null) {
            return;
        }
        int var68 = class107.method662(arg7, arg8 + 251, arg1);
        if (!arg1.field1326) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg3 * 2 & 0x7;
            if (class385.field5316[arg6][var69] && arg1.field1340 >= class150.field2116[var70]) {
                class257.field3419[var70] = arg1.field1337;
                class405.field5566[var70] = var68;
                class220.field2940[var70] = arg7.method1999() ? arg1.field1328 : arg1.field1324;
                class212.field2854[var70] = arg1.field1329;
                if (class150.field2116[var70] == arg1.field1340) {
                    class136.field1984[var70] = class21.method133(class136.field1984[var70], 2);
                } else {
                    class136.field1984[var70] = 2;
                }
                class150.field2116[var70] = arg1.field1340;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILcf;)I")
    public static final int method2848(int arg0, class395 arg1) {
        if (arg0 != 16107) {
            field6815 = -0.7588315F;
        }
        field6804++;
        String var2 = class293.method1640((byte) 90, arg1);
        int[] var3 = null;
        if (class346.method2135(arg1.field5469, -14)) {
            var3 = class175.field2385.method1557((int) arg1.field5480, arg0 ^ 0x6B03).field5960;
        } else if (arg1.field5478 != -1) {
            var3 = class175.field2385.method1557(arg1.field5478, 21992).field5960;
        } else if (class215.method1218(arg1.field5469, -6)) {
            class121 var4 = class221.field2941[(int) arg1.field5480];
            if (var4 != null) {
                class429 var5 = var4.field1780;
                if (var5.field5824 != null) {
                    var5 = var5.method2531(class38.field562, 108);
                }
                if (var5 != null) {
                    var3 = var5.field5843;
                }
            }
        } else if (class294.method1649((byte) 125, arg1.field5469)) {
            Object var6 = null;
            class88 var7;
            if (arg1.field5469 == 1010) {
                var7 = class1.field23.method935((int) arg1.field5480, (byte) 114);
            } else {
                var7 = class1.field23.method935((int) (arg1.field5480 >>> 32 & 0x7FFFFFFFL), (byte) 43);
            }
            if (var7.field1269 != null) {
                var7 = var7.method574(68, class38.field562);
            }
            if (var7 != null) {
                var3 = var7.field1275;
            }
        }
        if (var3 != null) {
            var2 = var2 + class279.method1573((byte) -50, var3);
        }
        int var8 = class392.field5448.method2146(class467.field6465, true, var2);
        if (arg1.field5468) {
            var8 += class274.field3629.method775() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ[[I)V")
    public final void method2849(int arg0, boolean arg1, int[][] arg2) {
        if (!arg1) {
            return;
        }
        field6803++;
        int[][] var4 = this.field6798[arg0];
        for (int var5 = 0; var5 < this.field6799 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field6812 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIBI)V")
    public final void method2850(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var6 = 0; var6 < this.field6813; var6++) {
            this.method2844(arg2, arg0, arg1, (byte) 80, arg4, var6);
        }
        if (arg3 > -127) {
            method2848(-107, (class395) null);
        }
        field6805++;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIZLfl;Lvq;)V")
    public class488(int arg0, int arg1, int arg2, boolean arg3, class480 arg4, class295 arg5) {
        this.field6791 = arg5;
        this.field6802 = arg3;
        this.field6799 = arg1;
        this.field6812 = arg2;
        this.field6813 = arg0;
        this.field6797 = arg4;
        this.field6787 = new byte[this.field6813][this.field6799][this.field6812];
        this.field6809 = new byte[this.field6813][this.field6799][this.field6812];
        this.field6788 = new byte[this.field6813][this.field6799][this.field6812];
        this.field6798 = new int[this.field6813][this.field6799 + 1][this.field6812 + 1];
        this.field6794 = new byte[this.field6813][this.field6799][this.field6812];
        this.field6790 = new byte[this.field6813][this.field6799 + 1][this.field6812 + 1];
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILwm;Ltf;Ltf;Ltf;[[I)V")
    private final void method2851(int arg0, int arg1, class364 arg2, class177 arg3, class177 arg4, class177 arg5, int[][] arg6) {
        int var8 = 32 % ((4 - arg0) / 34);
        field6806++;
        byte[][] var9 = this.field6809[arg1];
        byte[][] var10 = this.field6787[arg1];
        byte[][] var11 = this.field6788[arg1];
        byte[][] var12 = this.field6794[arg1];
        for (int var13 = 0; var13 < this.field6799; var13++) {
            int var14 = var13 >= this.field6799 - 1 ? var13 : var13 + 1;
            for (int var15 = 0; var15 < this.field6812; var15++) {
                int var16 = var15 >= this.field6812 - 1 ? var15 : var15 + 1;
                if (class279.field3716 == -1 || class383.method2350(var15, class279.field3716, arg1, 115, var13)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var9[var13][var15];
                    int var21 = var10[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class91 var27 = var22 == 0 ? null : this.field6797.method2801(80, var22 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class410 var28 = var23 == 0 ? null : this.field6791.method1658(1, var23 - 1);
                        class91 var29 = var27;
                        if (var27 != null) {
                            if (var27.field1337 == -1 && var27.field1322 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field1326;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && this.field6799 > var13 && this.field6812 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var36 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var34 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var14][var15] == var23) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (var11[var13][var16] == var23) {
                                var37++;
                                var33++;
                            } else {
                                var33--;
                                var37--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var37++;
                                var35++;
                            } else {
                                var37--;
                                var35--;
                            }
                            int var38 = var35 - var33;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var36 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg5.method371(var13, var15) - arg5.method371(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg5.method371(var14, var15) - arg5.method371(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 < var39 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class150.field2116[var40] = -1;
                            class136.field1984[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field1326 ? class78.field1055[var20] : class47.field638[var20];
                        this.method2847(var28, var27, var15, var21, var9, var19, var20, arg2, 4, this.field6799, this.field6812, var10, var13, var12);
                        boolean var42 = var27 != null && var27.field1337 != var27.field1322;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class150.field2116[var43] >= 0 && class405.field5566[var43] != class257.field3419[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class277.method1562(var19[1], class99.method612(class136.field1984[2], class136.field1984[4]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class277.method1562(var19[3], class99.method612(class136.field1984[6], class136.field1984[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class277.method1562(var19[0], class99.method612(class136.field1984[2], class136.field1984[0]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class277.method1562(var19[2], class99.method612(class136.field1984[4], class136.field1984[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var19[0] = var19[3] = false;
                                var21 = 0;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[1] = false;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var19[2] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int[] var50;
                        if (var44) {
                            var46 = var27 == null ? 0 : class215.field2900[var20];
                            var47 = class432.field5887[var20];
                            var48 = var28 == null ? 0 : class441.field5948[var20];
                            var49 = class327.field4366[var20];
                            var50 = class86.field1184[var20];
                        } else if (var18) {
                            var47 = class12.field169[var20];
                            var48 = var28 == null ? 0 : class194.field2618[var20];
                            var49 = class176.field2399[var20];
                            var45 = class279.field3699[var20];
                            var50 = class190.field2587[var20];
                            var46 = var27 == null ? 0 : class432.field5886[var20];
                        } else {
                            var50 = class232.field3081[var20];
                            var45 = class14.field206[var20];
                            var48 = var28 == null ? 0 : class205.field2785[var20];
                            var46 = var27 == null ? 0 : class416.field5658[var20];
                            var47 = class100.field1451[var20];
                            var49 = class324.field4328[var20];
                        }
                        int var51 = var46 + var48;
                        if (var51 <= 0) {
                            class356.method2187(arg1, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = var42 ? new int[var54] : null;
                            int[] var56 = new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = arg3 == null ? null : new int[var54];
                            int[] var62 = arg3 == null && arg4 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var63 = var27.field1337;
                                var64 = arg2.method1999() ? var27.field1328 : var27.field1324;
                                var65 = var27.field1329;
                                int var66 = class107.method662(arg2, 255, var27);
                                for (int var67 = 0; var67 < var46; var67++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 1;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 1;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var99 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 5;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 5;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var99 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 3;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 3;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var99 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 7;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 7;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var99 = 6;
                                    } else {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = var49[var52];
                                        class12.field166[2] = var47[var52];
                                        var99 = 3;
                                    }
                                    var52++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class12.field166[var100];
                                        int var102 = var101 - (var21 * 2) & 0x7;
                                        int var103 = class73.field1002[var101];
                                        int var104 = class385.field5326[var101];
                                        int var105;
                                        int var106;
                                        if (var21 == 1) {
                                            var105 = 128 - var103;
                                            var106 = var104;
                                        } else if (var21 == 2) {
                                            var106 = 128 - var103;
                                            var105 = 128 - var104;
                                        } else if (var21 == 3) {
                                            var106 = 128 - var104;
                                            var105 = var103;
                                        } else {
                                            var105 = var104;
                                            var106 = var103;
                                        }
                                        var56[var53] = var106;
                                        var57[var53] = var105;
                                        if (var61 != null && class385.field5316[var20][var101]) {
                                            int var107 = (var13 << 7) + var106;
                                            int var108 = (var15 << 7) + var105;
                                            var61[var53] = arg3.method368(var107, var108) - arg5.method368(var107, var108);
                                        }
                                        if (var62 != null) {
                                            if (arg3 != null && !class385.field5316[var20][var101]) {
                                                int var109 = (var13 << 7) + var106;
                                                int var110 = (var15 << 7) + var105;
                                                var62[var53] = arg5.method368(var109, var110) - arg3.method368(var109, var110);
                                            } else if (arg4 != null && !class214.field2881[var20][var101]) {
                                                int var111 = (var13 << 7) + var106;
                                                int var112 = (var15 << 7) + var105;
                                                var62[var53] = arg4.method368(var111, var112) - arg5.method368(var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && var27.field1340 < class150.field2116[var102]) {
                                            if (var55 != null) {
                                                var55[var53] = class405.field5566[var102];
                                            }
                                            var60[var53] = class212.field2854[var102];
                                            var59[var53] = class220.field2940[var102];
                                            var58[var53] = class257.field3419[var102];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = arg2.method1999() ? var27.field1328 : var27.field1324;
                                            var60[var53] = var27.field1329;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                }
                                if (!this.field6802 && arg1 == 0) {
                                    class317.method1736(var13, var15, var27.field1339, var27.field1334 * 8, var27.field1330);
                                }
                                if (var20 != 12 && var27.field1337 != -1 && var27.field1332) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class215.field2900[var20];
                            } else if (var18) {
                                var52 += class432.field5886[var20];
                            } else {
                                var52 += class416.field5658[var20];
                            }
                            if (var28 != null) {
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                class410 var68 = this.field6791.method1658(1, var23 - 1);
                                class410 var69 = this.field6791.method1658(1, var24 - 1);
                                class410 var70 = this.field6791.method1658(1, var25 - 1);
                                class410 var71 = this.field6791.method1658(1, var26 - 1);
                                for (int var72 = 0; var72 < var48; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 1;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 1;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var74 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 5;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 5;
                                        class12.field166[4] = var49[var52];
                                        var74 = 6;
                                        class12.field166[5] = var47[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 3;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 3;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var74 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = 7;
                                        class12.field166[2] = var47[var52];
                                        class12.field166[3] = 7;
                                        class12.field166[4] = var49[var52];
                                        class12.field166[5] = var47[var52];
                                        var74 = 6;
                                    } else {
                                        class12.field166[0] = var50[var52];
                                        class12.field166[1] = var49[var52];
                                        class12.field166[2] = var47[var52];
                                        var74 = 3;
                                    }
                                    var52++;
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class12.field166[var75];
                                        int var77 = var76 - (var21 * 2) & 0x7;
                                        int var78 = class73.field1002[var76];
                                        int var79 = class385.field5326[var76];
                                        int var80;
                                        int var81;
                                        if (var21 == 1) {
                                            var80 = var79;
                                            var81 = 128 - var78;
                                        } else if (var21 == 2) {
                                            var81 = 128 - var79;
                                            var80 = 128 - var78;
                                        } else if (var21 == 3) {
                                            var81 = var78;
                                            var80 = 128 - var79;
                                        } else {
                                            var80 = var78;
                                            var81 = var79;
                                        }
                                        var56[var53] = var80;
                                        var57[var53] = var81;
                                        if (var61 != null && class385.field5316[var20][var76]) {
                                            int var82 = (var13 << 7) + var80;
                                            int var83 = (var15 << 7) + var81;
                                            var61[var53] = arg3.method368(var82, var83) - arg5.method368(var82, var83);
                                        }
                                        if (var62 != null) {
                                            if (arg3 != null && !class385.field5316[var20][var76]) {
                                                int var84 = (var13 << 7) + var80;
                                                int var85 = (var15 << 7) + var81;
                                                var62[var53] = arg5.method368(var84, var85) - arg3.method368(var84, var85);
                                            } else if (arg4 != null && !class214.field2881[var20][var76]) {
                                                int var86 = (var13 << 7) + var80;
                                                int var87 = (var15 << 7) + var81;
                                                var62[var53] = arg4.method368(var86, var87) - arg5.method368(var86, var87);
                                            }
                                        }
                                        if (var76 < 8 && class150.field2116[var77] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class405.field5566[var77];
                                            }
                                            var60[var53] = class212.field2854[var77];
                                            var59[var53] = class220.field2940[var77];
                                            var58[var53] = class257.field3419[var77];
                                        } else {
                                            if (var18 && class385.field5316[var20][var76]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var80 == 0 && var81 == 0) {
                                                var58[var53] = arg6[var13][var15];
                                                var59[var53] = var68.field5627;
                                                var60[var53] = var68.field5619;
                                            } else if (var80 == 0 && var81 == 128) {
                                                var58[var53] = arg6[var13][var16];
                                                var59[var53] = var69.field5627;
                                                var60[var53] = var69.field5619;
                                            } else if (var80 == 128 && var81 == 128) {
                                                var58[var53] = arg6[var14][var16];
                                                var59[var53] = var70.field5627;
                                                var60[var53] = var70.field5619;
                                            } else if (var80 == 128 && var81 == 0) {
                                                var58[var53] = arg6[var14][var15];
                                                var59[var53] = var71.field5627;
                                                var60[var53] = var71.field5619;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var81 < 64) {
                                                        var59[var53] = var68.field5627;
                                                        var60[var53] = var68.field5619;
                                                    } else {
                                                        var59[var53] = var69.field5627;
                                                        var60[var53] = var69.field5619;
                                                    }
                                                } else if (var81 >= 64) {
                                                    var59[var53] = var70.field5627;
                                                    var60[var53] = var70.field5619;
                                                } else {
                                                    var59[var53] = var71.field5627;
                                                    var60[var53] = var71.field5619;
                                                }
                                                int var88 = class19.method121(64, var80 << 7 >> 7, arg6[var14][var15], arg6[var13][var15]);
                                                int var89 = class19.method121(64, var80 << 7 >> 7, arg6[var14][var16], arg6[var13][var16]);
                                                var58[var53] = class19.method121(64, var81 << 7 >> 7, var89, var88);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                }
                                if (var20 != 0 && var28.field5623) {
                                    var17 = true;
                                }
                            }
                            int var90 = arg5.method371(var13, var15);
                            int var91 = arg5.method371(var14, var15);
                            int var92 = arg5.method371(var14, var16);
                            int var93 = arg5.method371(var13, var16);
                            if (arg1 > 0) {
                                boolean var94 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var94 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field1320) {
                                    var94 = false;
                                }
                                if (var94 && var90 == var91 && var90 == var92 && var90 == var93) {
                                    this.field6790[arg1][var13][var15] = (byte) class21.method133(this.field6790[arg1][var13][var15], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field6802) {
                                var95 = class102.method621(var13, var15);
                                var96 = class326.method1826(var13, var15);
                                var97 = class132.method808(var13, var15);
                            }
                            arg5.method381(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var95, var96, var97, var17);
                            class356.method2187(arg1, var13, var15);
                        }
                    }
                }
            }
        }
    }

    static {
        new class206(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field6816 = 0;
    }
}
