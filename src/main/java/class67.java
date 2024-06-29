import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class67 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "[I")
    private int[] field1115 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "[I")
    private int[] field1125 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "Lns;")
    private class341 field1126;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "Lcca;")
    private class206 field1123;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "Z")
    public boolean field1124;

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "[[[B")
    private byte[][][] field1122;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "[[[B")
    private byte[][][] field1134;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "[[[I")
    public int[][][] field1128;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "[[[B")
    private byte[][][] field1137;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "[[[B")
    private byte[][][] field1121;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "[[[B")
    public byte[][][] field1131;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field1116 = 0;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "[[[B")
    public byte[][][] field1144;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZIILdaa;BIIIII)V")
    private final void method549(int arg0, boolean arg1, int arg2, int arg3, class11 arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1130++;
        if (arg6 == 1) {
            arg3 = 1;
        } else if (arg6 == 2) {
            arg3 = 1;
            arg7 = 1;
        } else if (arg6 == 3) {
            arg7 = 1;
        }
        int var12 = -11 / ((arg5 + 23) / 41);
        if (arg0 < 0 || this.field1117 <= arg0 || arg10 < 0 || this.field1119 <= arg10) {
            while (true) {
                int var15 = arg4.method110((byte) 78);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg4.method110((byte) 72);
                    return;
                }
                if (var15 <= 49) {
                    arg4.method110((byte) 122);
                }
            }
        }
        if (!this.field1124 && !arg1) {
            class80.field1299[arg9][arg0][arg10] = 0;
        }
        while (true) {
            int var13 = arg4.method110((byte) 47);
            if (var13 == 0) {
                if (this.field1124) {
                    this.field1128[0][arg0 + arg7][arg10 + arg3] = 0;
                    return;
                } else if (arg9 == 0) {
                    this.field1128[0][arg0 + arg7][arg3 + arg10] = -class304.method1926(arg8 + 556238, 1, arg2 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field1128[arg9][arg0 + arg7][arg3 + arg10] = this.field1128[arg9 - 1][arg0 + arg7][arg3 + arg10] - 240;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg4.method110((byte) 84);
                if (!this.field1124) {
                    if (var14 == 1) {
                        var14 = 0;
                    }
                    if (arg9 != 0) {
                        this.field1128[arg9][arg0 + arg7][arg3 + arg10] = this.field1128[arg9 - 1][arg0 + arg7][arg3 + arg10] - (var14 * 8 << 0);
                        return;
                    }
                    this.field1128[0][arg0 + arg7][arg3 + arg10] = -var14 * 8 << 0;
                    return;
                }
                this.field1128[0][arg0 + arg7][arg3 + arg10] = var14 * 8 << 0;
                return;
            }
            if (var13 <= 49) {
                if (arg1) {
                    arg4.method110((byte) 112);
                } else {
                    this.field1134[arg9][arg0][arg10] = arg4.method67(65280);
                    this.field1122[arg9][arg0][arg10] = (byte) ((var13 - 2) / 4);
                    this.field1137[arg9][arg0][arg10] = (byte) class589.method3454(3, arg6 + var13 - 2);
                }
            } else if (var13 <= 81) {
                if (!this.field1124 && !arg1) {
                    class80.field1299[arg9][arg0][arg10] = (byte) (var13 - 49);
                }
            } else if (!arg1) {
                this.field1121[arg9][arg0][arg10] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILdaa;I[Lld;IZ)V")
    public final void method550(int arg0, int arg1, class11 arg2, int arg3, class145[] arg4, int arg5, boolean arg6) {
        if (!this.field1124) {
            for (int var8 = 0; var8 < 4; var8++) {
                class145 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field1117 && var13 >= 0 && this.field1119 > var13) {
                            var9.method970(var12, -27766, var13);
                        }
                    }
                }
            }
        }
        field1141++;
        int var14 = arg1 + arg5;
        int var15 = arg0 + arg3;
        for (int var16 = 0; var16 < this.field1142; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method549(arg1 + var17, false, var14 + var17, 0, arg2, (byte) 108, 0, 0, var15 + var18, var16, arg3 + var18);
                }
            }
        }
        if (arg6) {
            this.method550(120, 107, null, -92, null, -60, false);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILqa;Lom;ZI[[BII[[BLgo;[Z[[BI)V")
    private final void method551(int arg0, int arg1, class207 arg2, class312 arg3, boolean arg4, int arg5, byte[][] arg6, int arg7, int arg8, byte[][] arg9, class537 arg10, boolean[] arg11, byte[][] arg12, int arg13) {
        field1132++;
        boolean[] var15 = arg3 != null && arg3.field4198 ? class152.field2306[arg13] : class48.field938[arg13];
        if (arg0 > 0) {
            if (arg5 > 0) {
                int var16 = arg9[arg5 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class312 var17 = this.field1126.method2066(124, var16 - 1);
                    if (var17.field4200 != -1 && var17.field4198) {
                        byte var18 = arg6[arg5 - 1][arg0 - 1];
                        int var19 = arg12[arg5 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class61.method534(false, var17, arg2);
                        if (class427.field6057[var18][var19]) {
                            class224.field3215[0] = var17.field4200;
                            class483.field6817[0] = var20;
                            class367.field4998[0] = arg2.method1340() ? var17.field4204 : var17.field4213;
                            class29.field482[0] = var17.field4191;
                            class552.field7613[0] = var17.field4189;
                            class353.field4777[0] = 256;
                        }
                    }
                }
            }
            if (arg7 - 1 > arg5) {
                int var21 = arg9[arg5 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class312 var22 = this.field1126.method2066(82, var21 - 1);
                    if (var22.field4200 != -1 && var22.field4198) {
                        byte var23 = arg6[arg5 + 1][arg0 - 1];
                        int var24 = arg12[arg5 + 1][arg0 - 1] * 2 + 6 & 0x7;
                        int var25 = class61.method534(false, var22, arg2);
                        if (class427.field6057[var23][var24]) {
                            class224.field3215[2] = var22.field4200;
                            class483.field6817[2] = var25;
                            class367.field4998[2] = arg2.method1340() ? var22.field4204 : var22.field4213;
                            class29.field482[2] = var22.field4191;
                            class552.field7613[2] = var22.field4189;
                            class353.field4777[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg4) {
            this.method556(-51, 68, (byte) -57, -47, -62, null, 97, null, -4, 107);
        }
        if ((arg1 - 1) > arg0) {
            if (arg5 > 0) {
                int var26 = arg9[arg5 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class312 var27 = this.field1126.method2066(118, var26 - 1);
                    if (var27.field4200 != -1 && var27.field4198) {
                        byte var28 = arg6[arg5 - 1][arg0 + 1];
                        int var29 = arg12[arg5 - 1][arg0 + 1] * 2 + 2 & 0x7;
                        int var30 = class61.method534(false, var27, arg2);
                        if (class427.field6057[var28][var29]) {
                            class224.field3215[6] = var27.field4200;
                            class483.field6817[6] = var30;
                            class367.field4998[6] = arg2.method1340() ? var27.field4204 : var27.field4213;
                            class29.field482[6] = var27.field4191;
                            class552.field7613[6] = var27.field4189;
                            class353.field4777[6] = 64;
                        }
                    }
                }
            }
            if (arg7 - 1 > arg5) {
                int var31 = arg9[arg5 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class312 var32 = this.field1126.method2066(-90, var31 - 1);
                    if (var32.field4200 != -1 && var32.field4198) {
                        byte var33 = arg6[arg5 + 1][arg0 + 1];
                        int var34 = arg12[arg5 + 1][arg0 + 1] * 2 & 0x7;
                        int var35 = class61.method534(false, var32, arg2);
                        if (class427.field6057[var33][var34]) {
                            class224.field3215[4] = var32.field4200;
                            class483.field6817[4] = var35;
                            class367.field4998[4] = arg2.method1340() ? var32.field4204 : var32.field4213;
                            class29.field482[4] = var32.field4191;
                            class552.field7613[4] = var32.field4189;
                            class353.field4777[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg9[arg5][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class312 var37 = this.field1126.method2066(105, var36 - 1);
                if (var37.field4200 != -1) {
                    byte var38 = arg6[arg5][arg0 - 1];
                    byte var39 = arg12[arg5][arg0 - 1];
                    if (var37.field4198) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class61.method534(false, var37, arg2);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class427.field6057[var38][var41] && class552.field7613[var40] <= var37.field4189) {
                                class224.field3215[var40] = var37.field4200;
                                class483.field6817[var40] = var42;
                                class367.field4998[var40] = arg2.method1340() ? var37.field4204 : var37.field4213;
                                class29.field482[var40] = var37.field4191;
                                if (class552.field7613[var40] == var37.field4189) {
                                    class353.field4777[var40] = class73.method578(class353.field4777[var40], 32);
                                } else {
                                    class353.field4777[var40] = 32;
                                }
                                class552.field7613[var40] = var37.field4189;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg8 & 0x3]) {
                            arg11[0] = class152.field2306[var38][class589.method3454(var39 + 2, 3)];
                        }
                    } else if (!var15[arg8 & 0x3]) {
                        arg11[0] = class48.field938[var38][class589.method3454(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg0 < arg1 - 1) {
            int var44 = arg9[arg5][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class312 var45 = this.field1126.method2066(-114, var44 - 1);
                if (var45.field4200 != -1) {
                    byte var46 = arg6[arg5][arg0 + 1];
                    byte var47 = arg12[arg5][arg0 + 1];
                    if (var45.field4198) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class61.method534(arg4, var45, arg2);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class427.field6057[var46][var49] && class552.field7613[var48] <= var45.field4189) {
                                class224.field3215[var48] = var45.field4200;
                                class483.field6817[var48] = var50;
                                class367.field4998[var48] = arg2.method1340() ? var45.field4204 : var45.field4213;
                                class29.field482[var48] = var45.field4191;
                                if (class552.field7613[var48] == var45.field4189) {
                                    class353.field4777[var48] = class73.method578(class353.field4777[var48], 16);
                                } else {
                                    class353.field4777[var48] = 16;
                                }
                                class552.field7613[var48] = var45.field4189;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg8 + 2 & 0x3]) {
                            arg11[2] = class152.field2306[var46][class589.method3454(var47, 3)];
                        }
                    } else if (!var15[arg8 + 2 & 0x3]) {
                        arg11[2] = class48.field938[var46][class589.method3454(3, var47)];
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var52 = arg9[arg5 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class312 var53 = this.field1126.method2066(-61, var52 - 1);
                if (var53.field4200 != -1) {
                    byte var54 = arg6[arg5 - 1][arg0];
                    byte var55 = arg12[arg5 - 1][arg0];
                    if (var53.field4198) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class61.method534(arg4, var53, arg2);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class427.field6057[var54][var57] && class552.field7613[var56] <= var53.field4189) {
                                class224.field3215[var56] = var53.field4200;
                                class483.field6817[var56] = var58;
                                class367.field4998[var56] = arg2.method1340() ? var53.field4204 : var53.field4213;
                                class29.field482[var56] = var53.field4191;
                                if (class552.field7613[var56] == var53.field4189) {
                                    class353.field4777[var56] = class73.method578(class353.field4777[var56], 8);
                                } else {
                                    class353.field4777[var56] = 8;
                                }
                                class552.field7613[var56] = var53.field4189;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg8 + 3 & 0x3]) {
                            arg11[3] = class152.field2306[var54][class589.method3454(var55 + 1, 3)];
                        }
                    } else if (!var15[arg8 + 3 & 0x3]) {
                        arg11[3] = class48.field938[var54][class589.method3454(var55 + 1, 3)];
                    }
                }
            }
        }
        if ((arg7 - 1) > arg5) {
            int var60 = arg9[arg5 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class312 var61 = this.field1126.method2066(125, var60 - 1);
                if (var61.field4200 != -1) {
                    byte var62 = arg6[arg5 + 1][arg0];
                    byte var63 = arg12[arg5 + 1][arg0];
                    if (var61.field4198) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class61.method534(false, var61, arg2);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class427.field6057[var62][var65] && class552.field7613[var64] <= var61.field4189) {
                                class224.field3215[var64] = var61.field4200;
                                class483.field6817[var64] = var66;
                                class367.field4998[var64] = arg2.method1340() ? var61.field4204 : var61.field4213;
                                class29.field482[var64] = var61.field4191;
                                if (class552.field7613[var64] == var61.field4189) {
                                    class353.field4777[var64] = class73.method578(class353.field4777[var64], 4);
                                } else {
                                    class353.field4777[var64] = 4;
                                }
                                class552.field7613[var64] = var61.field4189;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg8 + 1 & 0x3]) {
                            arg11[1] = class152.field2306[var62][class589.method3454(3, var63 + 3)];
                        }
                    } else if (!var15[arg8 + 1 & 0x3]) {
                        arg11[1] = class48.field938[var62][class589.method3454(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg3 == null) {
            return;
        }
        int var68 = class61.method534(false, arg3, arg2);
        if (!arg3.field4198) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg8 * 2) & 0x7;
            if (class427.field6057[arg13][var69] && arg3.field4189 >= class552.field7613[var70]) {
                class224.field3215[var70] = arg3.field4200;
                class483.field6817[var70] = var68;
                class367.field4998[var70] = arg2.method1340() ? arg3.field4204 : arg3.field4213;
                class29.field482[var70] = arg3.field4191;
                if (class552.field7613[var70] == arg3.field4189) {
                    class353.field4777[var70] = class73.method578(class353.field4777[var70], 2);
                } else {
                    class353.field4777[var70] = 2;
                }
                class552.field7613[var70] = arg3.field4189;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V")
    public static final void method552(int arg0, int arg1, int arg2) {
        field1146++;
        class314 var3 = class483.method2819(5, arg0, arg2 + 21304);
        var3.method1959(19793);
        var3.field4227 = arg1;
        if (arg2 != -1) {
            method552(53, -119, 17);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lsa;Lqa;ILsa;)V")
    public final void method553(class174 arg0, class207 arg1, int arg2, class174 arg3) {
        field1140++;
        int[][] var5 = new int[this.field1117][this.field1119];
        if (class77.field1245 == null || class77.field1245.length != this.field1119) {
            class222.field3172 = new int[this.field1119];
            class215.field3072 = new int[this.field1119];
            class77.field1245 = new int[this.field1119];
            class218.field3125 = new int[this.field1119];
            class221.field3162 = new int[this.field1119];
        }
        for (int var6 = 0; var6 < this.field1142; var6++) {
            for (int var8 = 0; var8 < this.field1119; var8++) {
                class77.field1245[var8] = 0;
                class218.field3125[var8] = 0;
                class215.field3072[var8] = 0;
                class222.field3172[var8] = 0;
                class221.field3162[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1117; var9++) {
                for (int var10 = 0; var10 < this.field1119; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field1117) {
                        int var20 = this.field1121[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class537 var21 = this.field1123.method1253((byte) -89, var20 - 1);
                            class77.field1245[var10] += var21.field7508;
                            class218.field3125[var10] += var21.field7506;
                            class215.field3072[var10] += var21.field7512;
                            class222.field3172[var10] += var21.field7513;
                            var10002 = class221.field3162[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1121[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class537 var24 = this.field1123.method1253((byte) -89, var23 - 1);
                            class77.field1245[var10] -= var24.field7508;
                            class218.field3125[var10] -= var24.field7506;
                            class215.field3072[var10] -= var24.field7512;
                            class222.field3172[var10] -= var24.field7513;
                            var10002 = class221.field3162[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1119; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1119 > var17) {
                            var14 += class222.field3172[var17];
                            var12 += class218.field3125[var17];
                            var11 += class77.field1245[var17];
                            var13 += class215.field3072[var17];
                            var15 += class221.field3162[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class221.field3162[var18];
                            var14 -= class222.field3172[var18];
                            var13 -= class215.field3072[var18];
                            var11 -= class77.field1245[var18];
                            var12 -= class218.field3125[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class640.method3701(var13 / var15, -31, var11 * 256 / var14, var12 / var15);
                        }
                    }
                }
            }
            if (class118.field1936) {
                this.method560(arg1, var6, var6 == 0 ? arg3 : null, var5, var6 == 0 ? arg0 : null, 0, class590.field8430[var6]);
            } else {
                this.method558(var6 == 0 ? arg3 : null, class590.field8430[var6], arg1, var6, var5, var6 == 0 ? arg0 : null, -61);
            }
            this.field1121[var6] = null;
            this.field1134[var6] = null;
            this.field1122[var6] = null;
            this.field1137[var6] = null;
        }
        if (!this.field1124) {
            if (class187.field2625 != 0) {
                class486.method2828();
            }
            if (class343.field4626) {
                class304.method1928();
            }
        }
        if (arg2 == -1) {
            for (int var7 = 0; var7 < this.field1142; var7++) {
                class590.field8430[var7].method1098();
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([FIFIIBIIII)V")
    public static final void method554(float[] arg0, int arg1, float arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg1 - arg9;
        field1129++;
        int var11 = arg4 - arg6;
        int var12 = arg7 - arg8;
        float var13 = arg0[2] * (float) var11 + arg0[0] * (float) var10 + arg0[1] * (float) var12;
        float var14 = arg0[5] * (float) var11 + arg0[4] * (float) var12 + arg0[3] * (float) var10;
        float var15 = arg0[8] * (float) var11 + arg0[6] * (float) var10 + arg0[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg2 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg3 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg3 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg3 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class328.field4397 = var17;
        if (arg5 <= 86) {
            method554(null, 87, -0.3157504F, 40, -68, (byte) -84, 78, 80, -22, 59);
        }
        class137.field2152 = var18;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([[IBI)V")
    public final void method555(int[][] arg0, byte arg1, int arg2) {
        field1145++;
        int[][] var4 = this.field1128[arg2];
        for (int var5 = 0; var5 < this.field1117 + 1; var5++) {
            for (int var6 = 0; var6 < this.field1119 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
        if (arg1 != 56) {
            this.field1122 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIBIILdaa;I[Lld;II)V")
    public final void method556(int arg0, int arg1, byte arg2, int arg3, int arg4, class11 arg5, int arg6, class145[] arg7, int arg8, int arg9) {
        field1143++;
        if (arg2 < 90) {
            this.field1142 = 50;
        }
        int var11 = (arg9 & 0x7) * 8;
        if (!this.field1124) {
            class145 var12 = arg7[arg0];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class62.method536(var13 & 0x7, 126, arg6, var14 & 0x7) + arg1;
                    int var16 = class29.method312(arg6, var14 & 0x7, -124, var13 & 0x7) + arg8;
                    if (var15 > 0 && var15 < (this.field1117 - 1) && var16 > 0 && var16 < this.field1119 - 1) {
                        var12.method970(var15, -27766, var16);
                    }
                }
            }
        }
        int var17 = (arg3 & 0x7) * 8;
        int var18 = arg9 & 0x1FFFFFF8 << 3;
        int var19 = arg3 & 0x1FFFFFF8 << 3;
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
        for (int var22 = 0; var22 < this.field1142; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var23 >= var11 && var11 + 8 >= var23 && var17 <= var24 && var24 <= var17 + 8) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var17 + 8 == var24) {
                            if (arg6 == 0) {
                                var26 = var24 + arg8 - var17;
                                var25 = var23 + arg1 - var11;
                            } else if (arg6 == 1) {
                                var26 = arg8 + 8 - (var23 - var11);
                                var25 = var24 - (var17 - arg1);
                            } else if (arg6 == 2) {
                                var26 = var17 + arg8 + 8 - var24;
                                var25 = var11 + arg1 + 8 - var23;
                            } else {
                                var26 = arg8 + var23 - var11;
                                var25 = var17 + arg1 + 8 - var24;
                            }
                            this.method549(var25, true, var18 + var23, 0, arg5, (byte) -82, 0, 0, var19 + var24, arg0, var26);
                        } else {
                            var25 = arg1 + class62.method536(var23 & 0x7, 25, arg6, var24 & 0x7);
                            var26 = arg8 + class29.method312(arg6, var24 & 0x7, -128, var23 & 0x7);
                            this.method549(var25, false, var18 + var23, var21, arg5, (byte) -102, arg6, var20, var19 + var24, arg0, var26);
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
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg6 == 0) {
                                    var31 = -var17 - (-var30 - arg8);
                                    var32 = arg1 + var29 - var11;
                                } else if (arg6 == 1) {
                                    var31 = var11 + arg8 + 8 - var29;
                                    var32 = var30 - (var17 - arg1);
                                } else if (arg6 == 2) {
                                    var32 = arg1 + 8 - (-var11 + var29);
                                    var31 = var17 + arg8 - (var30 - 8);
                                } else {
                                    var31 = var29 + arg8 - var11;
                                    var32 = var17 + arg1 + 8 - var30;
                                }
                                if (var32 >= 0 && this.field1117 > var32 && var31 >= 0 && this.field1119 > var31) {
                                    this.field1128[arg0][var32][var31] = this.field1128[arg0][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method549(-1, false, 0, 0, arg5, (byte) 77, 0, 0, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
    public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= 56) {
            for (int var6 = 0; var6 < this.field1142; var6++) {
                this.method559((byte) -60, arg2, var6, arg0, arg4, arg3);
            }
            field1136++;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lsa;Lsa;Lqa;I[[ILsa;I)V")
    private final void method558(class174 arg0, class174 arg1, class207 arg2, int arg3, int[][] arg4, class174 arg5, int arg6) {
        field1127++;
        if (arg6 >= -7) {
            this.method551(118, 57, null, null, false, 46, null, -58, -120, null, null, null, null, -120);
        }
        for (int var8 = 0; var8 < this.field1117; var8++) {
            for (int var9 = 0; var9 < this.field1119; var9++) {
                if (class157.field2322 == -1 || class454.method2667(var8, true, class157.field2322, var9, arg3)) {
                    byte var10 = this.field1122[arg3][var8][var9];
                    byte var11 = this.field1137[arg3][var8][var9];
                    int var12 = this.field1134[arg3][var8][var9] & 0xFF;
                    int var13 = this.field1121[arg3][var8][var9] & 0xFF;
                    class312 var14 = var12 == 0 ? null : this.field1126.method2066(104, var12 - 1);
                    class537 var15 = var13 == 0 ? null : this.field1123.method1253((byte) -89, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class183.field2587[var10];
                        var17 = var14 == null ? 0 : class608.field8765[var10];
                    } else if (var14 != null) {
                        var17 = class608.field8765[var10];
                    } else if (var15 != null) {
                        var16 = class608.field8765[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4200 == -1 && var14.field4206 == -1 && var14.field4204 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg2.method1340() ? var14.field4204 : var14.field4213;
                            if (class641.field9320) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4191;
                                if (var14.field4200 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4200;
                                }
                                if (var14.field4206 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field4206;
                                }
                                var19++;
                            }
                            if (!this.field1124 && arg3 == 0) {
                                class614.method3587(var8, var9, var14.field4202, var14.field4208 * 8, var14.field4201);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field7510;
                            if (class641.field9320) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field7509;
                                var20[var19] = arg4[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1115.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1115[var36];
                            int var46 = this.field1125[var36];
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
                            if (var34 != null && class427.field6057[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method1105(var49, var50) - arg1.method1105(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class427.field6057[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method1105(var51, var52) - arg0.method1105(var51, var52);
                                } else if (arg5 != null && !class515.field7242[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method1105(var53, var54) - arg1.method1105(var53, var54);
                                }
                            }
                        }
                        int var37 = arg1.method1104(var8, var9);
                        int var38 = arg1.method1104(var8 + 1, var9);
                        int var39 = arg1.method1104(var8 + 1, var9 - -1);
                        int var40 = arg1.method1104(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4194) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1131[arg3][var8][var9] = (byte) class73.method578(this.field1131[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field1124) {
                            var42 = class503.method2915(var8, var9);
                            var43 = class590.method3458(var8, var9);
                            var44 = class270.method1756(var8, var9);
                        }
                        arg1.method1109(var8, var9, var32, var34, var33, var35, class393.field5545[var10], class98.field1504[var10], class110.field1703[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class500.method2900(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BIIIII)V")
    private final void method559(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1120++;
        if (arg0 > -29) {
            this.field1117 = 93;
        }
        for (int var7 = arg5; var7 < (arg3 + arg5); var7++) {
            for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field1117 && var7 >= 0 && var7 < this.field1119) {
                    this.field1128[arg2][var10][var7] = arg2 > 0 ? this.field1128[arg2 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg1 > 0 && this.field1117 > arg1) {
            for (int var8 = arg5 + 1; var8 < (arg5 + arg3); var8++) {
                if (var8 >= 0 && var8 < this.field1119) {
                    this.field1128[arg2][arg1][var8] = this.field1128[arg2][arg1 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && this.field1119 > arg5) {
            for (int var9 = arg1 + 1; var9 < (arg1 + arg4); var9++) {
                if (var9 >= 0 && var9 < this.field1117) {
                    this.field1128[arg2][var9][arg5] = this.field1128[arg2][var9][arg5 - 1];
                }
            }
        }
        if (arg1 < 0 || arg5 < 0 || arg1 >= this.field1117 || this.field1119 <= arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 > 0 && this.field1128[arg2][arg1 - 1][arg5] != 0) {
                this.field1128[arg2][arg1][arg5] = this.field1128[arg2][arg1 - 1][arg5];
                return;
            }
            if (arg5 > 0 && this.field1128[arg2][arg1][arg5 - 1] != 0) {
                this.field1128[arg2][arg1][arg5] = this.field1128[arg2][arg1][arg5 - 1];
                return;
            }
            if (arg1 > 0 && arg5 > 0 && this.field1128[arg2][arg1 - 1][arg5 - 1] != 0) {
                this.field1128[arg2][arg1][arg5] = this.field1128[arg2][arg1 - 1][arg5 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && this.field1128[arg2 - 1][arg1 - 1][arg5] != this.field1128[arg2][arg1 - 1][arg5]) {
            this.field1128[arg2][arg1][arg5] = this.field1128[arg2][arg1 - 1][arg5];
            return;
        }
        if (arg5 > 0 && this.field1128[arg2][arg1][arg5 - 1] != this.field1128[arg2 - 1][arg1][arg5 - 1]) {
            this.field1128[arg2][arg1][arg5] = this.field1128[arg2][arg1][arg5 - 1];
            return;
        }
        if (arg1 > 0 && arg5 > 0 && this.field1128[arg2][arg1 - 1][arg5 - 1] != this.field1128[arg2 - 1][arg1 - 1][arg5 - 1]) {
            this.field1128[arg2][arg1][arg5] = this.field1128[arg2][arg1 - 1][arg5 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lqa;ILsa;[[ILsa;ILsa;)V")
    private final void method560(class207 arg0, int arg1, class174 arg2, int[][] arg3, class174 arg4, int arg5, class174 arg6) {
        field1133++;
        byte[][] var8 = this.field1122[arg1];
        byte[][] var9 = this.field1137[arg1];
        byte[][] var10 = this.field1121[arg1];
        byte[][] var11 = this.field1134[arg1];
        for (int var12 = arg5; var12 < this.field1117; var12++) {
            int var13 = var12 < this.field1117 - 1 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field1119; var14++) {
                int var15 = var14 >= (this.field1119 - 1) ? var14 : var14 + 1;
                if (class157.field2322 == -1 || class454.method2667(var12, true, class157.field2322, var14, arg1)) {
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
                        class312 var26 = var21 == 0 ? null : this.field1126.method2066(6, var21 - 1);
                        class537 var27 = var22 == 0 ? null : this.field1123.method1253((byte) -89, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class312 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4200 == -1 && var26.field4206 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4198;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field1117 && this.field1119 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method1104(var12, var14) - arg6.method1104(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg6.method1104(var13, var14) - arg6.method1104(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class552.field7613[var39] = -1;
                            class353.field4777[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4198 ? class152.field2306[var19] : class48.field938[var19];
                        this.method551(var14, this.field1119, arg0, var26, false, var12, var8, this.field1117, var20, var11, var27, var18, var9, var19);
                        boolean var41 = var26 != null && var26.field4206 != var26.field4200;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class552.field7613[var42] >= 0 && class483.field6817[var42] != class224.field3215[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class487.method2830(var18[1], class589.method3454(class353.field4777[4], class353.field4777[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class487.method2830(var18[3], class589.method3454(class353.field4777[0], class353.field4777[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class487.method2830(var18[0], class589.method3454(class353.field4777[2], class353.field4777[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class487.method2830(var18[2], class589.method3454(class353.field4777[4], class353.field4777[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var45 = var26 == null ? 0 : class608.field8765[var19];
                            var46 = class110.field1703[var19];
                            var47 = var27 == null ? 0 : class183.field2587[var19];
                            var48 = class393.field5545[var19];
                            var49 = class98.field1504[var19];
                        } else if (var17) {
                            var47 = var27 == null ? 0 : class452.field6392[var19];
                            var48 = class390.field5525[var19];
                            var49 = class118.field1945[var19];
                            var44 = class168.field2436[var19];
                            var45 = var26 == null ? 0 : class62.field1084[var19];
                            var46 = class549.field7593[var19];
                        } else {
                            var48 = class297.field4076[var19];
                            var49 = class589.field8419[var19];
                            var46 = class283.field3911[var19];
                            var47 = var27 == null ? 0 : class212.field2997[var19];
                            var45 = var26 == null ? 0 : class443.field6306[var19];
                            var44 = class483.field6816[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class500.method2900(arg1, var12, var14);
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
                            int[] var60 = arg2 == null ? null : new int[var53];
                            int[] var61 = arg2 == null && arg4 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4200;
                                var63 = arg0.method1340() ? var26.field4204 : var26.field4213;
                                var64 = var26.field4191;
                                int var65 = class61.method534(false, var26, arg0);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 1;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 1;
                                        class65.field1112[4] = var49[var51];
                                        var68 = 6;
                                        class65.field1112[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 5;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 5;
                                        class65.field1112[4] = var49[var51];
                                        class65.field1112[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 3;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 3;
                                        class65.field1112[4] = var49[var51];
                                        var68 = 6;
                                        class65.field1112[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 7;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 7;
                                        class65.field1112[4] = var49[var51];
                                        class65.field1112[5] = var46[var51];
                                        var68 = 6;
                                    } else {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = var49[var51];
                                        var68 = 3;
                                        class65.field1112[2] = var46[var51];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class65.field1112[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field1115[var70];
                                        int var73 = this.field1125[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 128 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 128 - var72;
                                            var75 = 128 - var73;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 128 - var73;
                                        } else {
                                            var75 = var73;
                                            var74 = var72;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class427.field6057[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg2.method1105(var76, var77) - arg6.method1105(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class427.field6057[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg6.method1105(var78, var79) - arg2.method1105(var78, var79);
                                            } else if (arg4 != null && !class515.field7242[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg4.method1105(var80, var81) - arg6.method1105(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class552.field7613[var71] > var26.field4189) {
                                            if (var54 != null) {
                                                var54[var52] = class483.field6817[var71];
                                            }
                                            var59[var52] = class29.field482[var71];
                                            var58[var52] = class367.field4998[var71];
                                            var57[var52] = class224.field3215[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg0.method1340() ? var26.field4204 : var26.field4213;
                                            var59[var52] = var26.field4191;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field1124 && arg1 == 0) {
                                    class614.method3587(var12, var14, var26.field4202, var26.field4208 * 8, var26.field4201);
                                }
                                if (var19 != 12 && var26.field4200 != -1 && var26.field4192) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class608.field8765[var19];
                            } else if (var17) {
                                var51 += class62.field1084[var19];
                            } else {
                                var51 += class443.field6306[var19];
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
                                class537 var82 = this.field1123.method1253((byte) -89, var22 - 1);
                                class537 var83 = this.field1123.method1253((byte) -89, var23 - 1);
                                class537 var84 = this.field1123.method1253((byte) -89, var24 - 1);
                                class537 var85 = this.field1123.method1253((byte) -89, var25 - 1);
                                for (int var86 = 0; var86 < var47; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 1;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 1;
                                        class65.field1112[4] = var49[var51];
                                        class65.field1112[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 5;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 5;
                                        class65.field1112[4] = var49[var51];
                                        var88 = 6;
                                        class65.field1112[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 3;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 3;
                                        class65.field1112[4] = var49[var51];
                                        var88 = 6;
                                        class65.field1112[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = 7;
                                        class65.field1112[2] = var46[var51];
                                        class65.field1112[3] = 7;
                                        class65.field1112[4] = var49[var51];
                                        class65.field1112[5] = var46[var51];
                                        var88 = 6;
                                    } else {
                                        class65.field1112[0] = var48[var51];
                                        class65.field1112[1] = var49[var51];
                                        class65.field1112[2] = var46[var51];
                                        var88 = 3;
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class65.field1112[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field1115[var90];
                                        int var93 = this.field1125[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 128 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var95 = 128 - var92;
                                            var94 = 128 - var93;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 128 - var93;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class427.field6057[var19][var90]) {
                                            int var96 = (var12 << 7) + var95;
                                            int var97 = (var14 << 7) + var94;
                                            var60[var52] = arg2.method1105(var96, var97) - arg6.method1105(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class427.field6057[var19][var90]) {
                                                int var98 = (var12 << 7) + var95;
                                                int var99 = (var14 << 7) + var94;
                                                var61[var52] = arg6.method1105(var98, var99) - arg2.method1105(var98, var99);
                                            } else if (arg4 != null && !class515.field7242[var19][var90]) {
                                                int var100 = (var12 << 7) + var95;
                                                int var101 = (var14 << 7) + var94;
                                                var61[var52] = arg4.method1105(var100, var101) - arg6.method1105(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class552.field7613[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class483.field6817[var91];
                                            }
                                            var59[var52] = class29.field482[var91];
                                            var58[var52] = class367.field4998[var91];
                                            var57[var52] = class224.field3215[var91];
                                        } else {
                                            if (var17 && class427.field6057[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg3[var12][var14];
                                                var58[var52] = var82.field7510;
                                                var59[var52] = var82.field7509;
                                            } else if (var95 == 0 && var94 == 128) {
                                                var57[var52] = arg3[var12][var15];
                                                var58[var52] = var83.field7510;
                                                var59[var52] = var83.field7509;
                                            } else if (var95 == 128 && var94 == 128) {
                                                var57[var52] = arg3[var13][var15];
                                                var58[var52] = var84.field7510;
                                                var59[var52] = var84.field7509;
                                            } else if (var95 == 128 && var94 == 0) {
                                                var57[var52] = arg3[var13][var14];
                                                var58[var52] = var85.field7510;
                                                var59[var52] = var85.field7509;
                                            } else {
                                                if (var95 < 64) {
                                                    if (var94 >= 64) {
                                                        var58[var52] = var83.field7510;
                                                        var59[var52] = var83.field7509;
                                                    } else {
                                                        var58[var52] = var82.field7510;
                                                        var59[var52] = var82.field7509;
                                                    }
                                                } else if (var94 >= 64) {
                                                    var58[var52] = var84.field7510;
                                                    var59[var52] = var84.field7509;
                                                } else {
                                                    var58[var52] = var85.field7510;
                                                    var59[var52] = var85.field7509;
                                                }
                                                int var102 = class147.method975(var95 << 7 >> 7, arg3[var13][var14], 64512, arg3[var12][var14]);
                                                int var103 = class147.method975(var95 << 7 >> 7, arg3[var13][var15], 64512, arg3[var12][var15]);
                                                var57[var52] = class147.method975(var94 << 7 >> 7, var103, 64512, var102);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field7518) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg6.method1104(var12, var14);
                            int var105 = arg6.method1104(var13, var14);
                            int var106 = arg6.method1104(var13, var15);
                            int var107 = arg6.method1104(var12, var15);
                            if (arg1 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field4194) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1131[arg1][var12][var14] = (byte) class73.method578(this.field1131[arg1][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field1124) {
                                var109 = class503.method2915(var12, var14);
                                var110 = class590.method3458(var12, var14);
                                var111 = class270.method1756(var12, var14);
                            }
                            arg6.method1108(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class500.method2900(arg1, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static final void method561(byte arg0) {
        class210.field2958 = 0;
        int var1 = 5 / ((arg0 - 26) / 49);
        field1118++;
        class448.field6352.method465(true);
        class483.field6820 = false;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lqa;Z[Lld;[[[I)V")
    public final void method562(class207 arg0, boolean arg1, class145[] arg2, int[][][] arg3) {
        field1135++;
        if (!arg1) {
            this.method562(null, false, null, null);
        }
        if (!this.field1124) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1117; var6++) {
                    for (int var7 = 0; var7 < this.field1119; var7++) {
                        if ((class80.field1299[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class80.field1299[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method959(var6, 2097152, var7);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field1142; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1124) {
                if (class167.field2398) {
                    var11 |= 0x8;
                }
                if (class343.field4626) {
                    var10 |= 0x2;
                }
                if (class187.field2625 != 0) {
                    var10 |= 0x1;
                    if (class132.field2112 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class343.field4626) {
                var11 |= 0x7;
            }
            if (!class573.field7904) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field1128[var9] : arg3[var9];
            class99.method708(var9, arg0.method1270(this.field1117, this.field1119, this.field1128[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(IIIZLns;Lcca;)V")
    public class67(int arg0, int arg1, int arg2, boolean arg3, class341 arg4, class206 arg5) {
        this.field1126 = arg4;
        this.field1123 = arg5;
        this.field1124 = arg3;
        this.field1142 = arg0;
        this.field1119 = arg2;
        this.field1117 = arg1;
        this.field1122 = new byte[this.field1142][this.field1117][this.field1119];
        this.field1134 = new byte[this.field1142][this.field1117][this.field1119];
        this.field1128 = new int[this.field1142][this.field1117 + 1][this.field1119 + 1];
        this.field1137 = new byte[this.field1142][this.field1117][this.field1119];
        this.field1121 = new byte[this.field1142][this.field1117][this.field1119];
        this.field1131 = new byte[this.field1142][this.field1117 + 1][this.field1119 + 1];
    }
}
