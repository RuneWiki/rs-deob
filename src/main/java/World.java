import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CHEOPWNH")
public class World {

    @OriginalMember(owner = "client!CHEOPWNH", name = "b", descriptor = "B")
    private byte field102 = 0;

    @OriginalMember(owner = "client!CHEOPWNH", name = "c", descriptor = "Z")
    private boolean field103 = true;

    @OriginalMember(owner = "client!CHEOPWNH", name = "s", descriptor = "B")
    private byte field119 = 0;

    @OriginalMember(owner = "client!CHEOPWNH", name = "t", descriptor = "Z")
    private boolean field120 = true;

    @OriginalMember(owner = "client!CHEOPWNH", name = "w", descriptor = "I")
    private int field123 = 20411;

    @OriginalMember(owner = "client!CHEOPWNH", name = "C", descriptor = "I")
    private int field129 = 69;

    @OriginalMember(owner = "client!CHEOPWNH", name = "n", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!CHEOPWNH", name = "o", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!CHEOPWNH", name = "l", descriptor = "[[[I")
    private int[][][] field112;

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "[[[B")
    private byte[][][] field101;

    @OriginalMember(owner = "client!CHEOPWNH", name = "v", descriptor = "[[[B")
    private byte[][][] field122;

    @OriginalMember(owner = "client!CHEOPWNH", name = "r", descriptor = "[[[B")
    private byte[][][] field118;

    @OriginalMember(owner = "client!CHEOPWNH", name = "p", descriptor = "[[[B")
    private byte[][][] field116;

    @OriginalMember(owner = "client!CHEOPWNH", name = "e", descriptor = "[[[B")
    private byte[][][] field105;

    @OriginalMember(owner = "client!CHEOPWNH", name = "E", descriptor = "[[[I")
    private int[][][] field131;

    @OriginalMember(owner = "client!CHEOPWNH", name = "A", descriptor = "[[[B")
    private byte[][][] field127;

    @OriginalMember(owner = "client!CHEOPWNH", name = "B", descriptor = "[[I")
    private int[][] field128;

    @OriginalMember(owner = "client!CHEOPWNH", name = "g", descriptor = "[I")
    private int[] field107;

    @OriginalMember(owner = "client!CHEOPWNH", name = "h", descriptor = "[I")
    private int[] field108;

    @OriginalMember(owner = "client!CHEOPWNH", name = "i", descriptor = "[I")
    private int[] field109;

    @OriginalMember(owner = "client!CHEOPWNH", name = "j", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "client!CHEOPWNH", name = "k", descriptor = "[I")
    private int[] field111;

    @OriginalMember(owner = "client!CHEOPWNH", name = "d", descriptor = "I")
    private static int field104 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!CHEOPWNH", name = "f", descriptor = "[I")
    private static final int[] field106 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!CHEOPWNH", name = "m", descriptor = "I")
    public static int field113 = 99;

    @OriginalMember(owner = "client!CHEOPWNH", name = "q", descriptor = "B")
    private static byte field117 = -80;

    @OriginalMember(owner = "client!CHEOPWNH", name = "u", descriptor = "[I")
    private static final int[] field121 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!CHEOPWNH", name = "x", descriptor = "[I")
    private static final int[] field124 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!CHEOPWNH", name = "z", descriptor = "I")
    private static int field126 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!CHEOPWNH", name = "D", descriptor = "[I")
    private static final int[] field130 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!CHEOPWNH", name = "F", descriptor = "Z")
    public static boolean field132 = true;

    @OriginalMember(owner = "client!CHEOPWNH", name = "y", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(III)I")
    private static final int method11(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method26(var3, var5);
        int var8 = method26(var3 + 1, var5);
        int var9 = method26(var3, var5 + 1);
        int var10 = method26(var3 + 1, var5 + 1);
        int var11 = method24(var7, var8, var4, arg2);
        int var12 = method24(var9, var10, var4, arg2);
        return method24(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IIIB)I")
    public int method12(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field119 != arg3) {
            return 2;
        }
        boolean var5 = false;
        if ((this.field101[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field101[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IIIILXRENONSA;IIIILKJCMXHNO;[[[I)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, CollisionMap arg4, int arg5, int arg6, int arg7, int arg8, World3D arg9, int[][][] arg10) {
        int var11 = arg10[arg1][arg6][arg3];
        int var12 = arg10[arg1][arg6 + 1][arg3];
        int var13 = arg10[arg1][arg6 + 1][arg3 + 1];
        int var14 = arg10[arg1][arg6][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method561(arg0);
        if (arg7 != 0) {
            return;
        }
        int var17 = (arg0 << 14) + (arg3 << 7) + arg6 + 1073741824;
        if (!var16.field1613) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg2);
        if (arg2 == 22) {
            Entity var19;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var19 = var16.method569(22, arg5, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(var16.field1657, var13, var14, var12, 22, (byte) 3, arg0, true, var11, arg5);
            }
            arg9.method280(arg6, arg3, 669, var18, var17, var15, arg8, var19);
            if (var16.field1664 && var16.field1613) {
                arg4.method535(8, arg3, arg6);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            Entity var39;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var39 = var16.method569(10, arg5, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(var16.field1657, var13, var14, var12, 10, (byte) 3, arg0, true, var11, arg5);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var16.field1629;
                    var42 = var16.field1655;
                } else {
                    var41 = var16.field1655;
                    var42 = var16.field1629;
                }
                arg9.method284(arg8, var41, arg3, var39, var18, var40, arg6, -896, var42, var15, var17);
            }
            if (var16.field1664) {
                arg4.method534(arg3, arg5, var16.field1629, var16.field1655, var16.field1663, arg6, (byte) 52);
            }
        } else if (arg2 >= 12) {
            Entity var20;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var20 = var16.method569(arg2, arg5, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(var16.field1657, var13, var14, var12, arg2, (byte) 3, arg0, true, var11, arg5);
            }
            arg9.method284(arg8, 1, arg3, var20, var18, 0, arg6, -896, 1, var15, var17);
            if (var16.field1664) {
                arg4.method534(arg3, arg5, var16.field1629, var16.field1655, var16.field1663, arg6, (byte) 52);
            }
        } else if (arg2 == 0) {
            Entity var21;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var21 = var16.method569(0, arg5, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(var16.field1657, var13, var14, var12, 0, (byte) 3, arg0, true, var11, arg5);
            }
            arg9.method282(var15, 49878, 0, field121[arg5], null, arg6, var17, var18, arg3, var21, arg8);
            if (var16.field1664) {
                arg4.method533(arg5, 37679, var16.field1663, arg2, arg6, arg3);
            }
        } else if (arg2 == 1) {
            Entity var22;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var22 = var16.method569(1, arg5, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(var16.field1657, var13, var14, var12, 1, (byte) 3, arg0, true, var11, arg5);
            }
            arg9.method282(var15, 49878, 0, field130[arg5], null, arg6, var17, var18, arg3, var22, arg8);
            if (var16.field1664) {
                arg4.method533(arg5, 37679, var16.field1663, arg2, arg6, arg3);
            }
        } else if (arg2 == 2) {
            int var23 = arg5 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var24 = var16.method569(2, arg5 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method569(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(var16.field1657, var13, var14, var12, 2, (byte) 3, arg0, true, var11, arg5 + 4);
                var25 = new LocEntity(var16.field1657, var13, var14, var12, 2, (byte) 3, arg0, true, var11, var23);
            }
            arg9.method282(var15, 49878, field121[var23], field121[arg5], var25, arg6, var17, var18, arg3, var24, arg8);
            if (var16.field1664) {
                arg4.method533(arg5, 37679, var16.field1663, arg2, arg6, arg3);
            }
        } else if (arg2 == 3) {
            Entity var26;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var26 = var16.method569(3, arg5, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(var16.field1657, var13, var14, var12, 3, (byte) 3, arg0, true, var11, arg5);
            }
            arg9.method282(var15, 49878, 0, field130[arg5], null, arg6, var17, var18, arg3, var26, arg8);
            if (var16.field1664) {
                arg4.method533(arg5, 37679, var16.field1663, arg2, arg6, arg3);
            }
        } else if (arg2 == 9) {
            Entity var27;
            if (var16.field1657 == -1 && var16.field1659 == null) {
                var27 = var16.method569(arg2, arg5, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(var16.field1657, var13, var14, var12, arg2, (byte) 3, arg0, true, var11, arg5);
            }
            arg9.method284(arg8, 1, arg3, var27, var18, 0, arg6, -896, 1, var15, var17);
            if (var16.field1664) {
                arg4.method534(arg3, arg5, var16.field1629, var16.field1655, var16.field1663, arg6, (byte) 52);
            }
        } else {
            if (var16.field1623) {
                if (arg5 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg5 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg5 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg2 == 4) {
                Entity var32;
                if (var16.field1657 == -1 && var16.field1659 == null) {
                    var32 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(var16.field1657, var13, var14, var12, 4, (byte) 3, arg0, true, var11, 0);
                }
                arg9.method283(arg8, field121[arg5], arg5 * 512, var17, var18, arg6, 0, arg3, 0, var15, var32, -930);
            } else if (arg2 == 5) {
                int var33 = 16;
                int var34 = arg9.method300(arg8, arg6, arg3);
                if (var34 > 0) {
                    var33 = LocType.method561(var34 >> 14 & 0x7FFF).field1656;
                }
                Entity var35;
                if (var16.field1657 == -1 && var16.field1659 == null) {
                    var35 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(var16.field1657, var13, var14, var12, 4, (byte) 3, arg0, true, var11, 0);
                }
                arg9.method283(arg8, field121[arg5], arg5 * 512, var17, var18, arg6, field106[arg5] * var33, arg3, field124[arg5] * var33, var15, var35, -930);
            } else if (arg2 == 6) {
                Entity var36;
                if (var16.field1657 == -1 && var16.field1659 == null) {
                    var36 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(var16.field1657, var13, var14, var12, 4, (byte) 3, arg0, true, var11, 0);
                }
                arg9.method283(arg8, 256, arg5, var17, var18, arg6, 0, arg3, 0, var15, var36, -930);
            } else if (arg2 == 7) {
                Entity var37;
                if (var16.field1657 == -1 && var16.field1659 == null) {
                    var37 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(var16.field1657, var13, var14, var12, 4, (byte) 3, arg0, true, var11, 0);
                }
                arg9.method283(arg8, 512, arg5, var17, var18, arg6, 0, arg3, 0, var15, var37, -930);
            } else if (arg2 == 8) {
                Entity var38;
                if (var16.field1657 == -1 && var16.field1659 == null) {
                    var38 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(var16.field1657, var13, var14, var12, 4, (byte) 3, arg0, true, var11, 0);
                }
                arg9.method283(arg8, 768, arg5, var17, var18, arg6, 0, arg3, 0, var15, var38, -930);
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3) {
        if (this.field123 != arg0) {
            return;
        }
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field112[arg1][arg3 + var5][arg2 + var8] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field112[arg1][arg3][arg2 + var6] = this.field112[arg1][arg3 - 1][arg2 + var6];
            }
        }
        if (arg2 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field112[arg1][arg3 + var7][arg2] = this.field112[arg1][arg3 + var7][arg2 - 1];
            }
        }
        if (arg3 > 0 && this.field112[arg1][arg3 - 1][arg2] != 0) {
            this.field112[arg1][arg3][arg2] = this.field112[arg1][arg3 - 1][arg2];
        } else if (arg2 > 0 && this.field112[arg1][arg3][arg2 - 1] != 0) {
            this.field112[arg1][arg3][arg2] = this.field112[arg1][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && this.field112[arg1][arg3 - 1][arg2 - 1] != 0) {
            this.field112[arg1][arg3][arg2] = this.field112[arg1][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "([LXRENONSA;ILKJCMXHNO;)V")
    public final void method15(CollisionMap[] arg0, int arg1, World3D arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field101[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field101[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method535(8, var111, var110);
                        }
                    }
                }
            }
        }
        field104 += (int) (Math.random() * 5.0D) - 2;
        if (field104 < -8) {
            field104 = -8;
        }
        if (field104 > 8) {
            field104 = 8;
        }
        field126 += (int) (Math.random() * 5.0D) - 2;
        if (field126 < -16) {
            field126 = -16;
        }
        if (field126 > 16) {
            field126 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field127[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field115 - 1; var56++) {
                for (int var101 = 1; var101 < this.field114 - 1; var101++) {
                    int var102 = this.field112[var5][var101 + 1][var56] - this.field112[var5][var101 - 1][var56];
                    int var103 = this.field112[var5][var101][var56 + 1] - this.field112[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field128[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field115; var57++) {
                this.field107[var57] = 0;
                this.field108[var57] = 0;
                this.field109[var57] = 0;
                this.field110[var57] = 0;
                this.field111[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field114 + 5; var58++) {
                for (int var61 = 0; var61 < this.field115; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field114) {
                        int var96 = this.field122[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field796[var96 - 1];
                            this.field107[var61] += var97.field805;
                            this.field108[var61] += var97.field803;
                            this.field109[var61] += var97.field804;
                            this.field110[var61] += var97.field806;
                            var10002 = this.field111[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field114) {
                        int var99 = this.field122[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field796[var99 - 1];
                            this.field107[var61] -= var100.field805;
                            this.field108[var61] -= var100.field803;
                            this.field109[var61] -= var100.field804;
                            this.field110[var61] -= var100.field806;
                            var10002 = this.field111[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field114 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field115 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field115) {
                            var62 += this.field107[var68];
                            var63 += this.field108[var68];
                            var64 += this.field109[var68];
                            var65 += this.field110[var68];
                            var66 += this.field111[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field115) {
                            var62 -= this.field107[var69];
                            var63 -= this.field108[var69];
                            var64 -= this.field109[var69];
                            var65 -= this.field110[var69];
                            var66 -= this.field111[var69];
                        }
                        if (var67 >= 1 && var67 < this.field115 - 1 && (!field132 || (this.field101[0][var58][var67] & 0x2) != 0 || (this.field101[var5][var58][var67] & 0x10) == 0 && this.method12(var67, var5, var58, (byte) 0) == field125)) {
                            if (var5 < field113) {
                                field113 = var5;
                            }
                            int var70 = this.field122[var5][var58][var67] & 0xFF;
                            int var71 = this.field118[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field112[var5][var58][var67];
                                int var73 = this.field112[var5][var58 + 1][var67];
                                int var74 = this.field112[var5][var58 + 1][var67 + 1];
                                int var75 = this.field112[var5][var58][var67 + 1];
                                int var76 = this.field128[var58][var67];
                                int var77 = this.field128[var58 + 1][var67];
                                int var78 = this.field128[var58 + 1][var67 + 1];
                                int var79 = this.field128[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method25(var82, var83, var84);
                                    int var85 = field104 + var82 & 0xFF;
                                    int var86 = field126 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method25(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field116[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field796[var71 - 1].field801) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field131[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Draw3D.field1610[method19(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method279(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method19(var80, var76), method19(var80, var77), method19(var80, var78), method19(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field116[var5][var58][var67] + 1;
                                    byte var90 = this.field105[var5][var58][var67];
                                    FloType var91 = FloType.field796[var71 - 1];
                                    int var92 = var91.field799;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Draw3D.method550(var92, 0);
                                        var94 = -1;
                                    } else if (var91.field798 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = Draw3D.field1610[this.method30(var91.field807, 96)];
                                    } else {
                                        var94 = this.method25(var91.field802, var91.field803, var91.field804);
                                        var93 = Draw3D.field1610[this.method30(var91.field807, 96)];
                                    }
                                    arg2.method279(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method19(var80, var76), method19(var80, var77), method19(var80, var78), method19(var80, var79), this.method30(var94, var76), this.method30(var94, var77), this.method30(var94, var78), this.method30(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field115 - 1; var59++) {
                for (int var60 = 1; var60 < this.field114 - 1; var60++) {
                    arg2.method278(var5, var60, var59, this.method12(var59, var5, var60, (byte) 0));
                }
            }
        }
        arg2.method305((byte) 2, -10, -50, -50);
        for (int var6 = 0; var6 < this.field114; var6++) {
            for (int var47 = 0; var47 < this.field115; var47++) {
                if ((this.field101[1][var6][var47] & 0x2) == 2) {
                    arg2.method276(true, var6, var47);
                }
            }
        }
        if (arg1 <= 0) {
            this.field123 = 313;
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field115; var12++) {
                    for (int var13 = 0; var13 <= this.field114; var13++) {
                        if ((this.field131[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field131[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field115 && (this.field131[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field131[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field131[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field112[var17][var13][var14] - var21;
                                int var23 = this.field112[var16][var13][var14];
                                World3D.method277(-8967, var13 * 128, var23, var13 * 128, var15 * 128 + 128, var10, var14 * 128, var22, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field131[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field131[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field131[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field114 && (this.field131[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field131[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field131[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field112[var29][var26][var12] - var33;
                                int var35 = this.field112[var28][var26][var12];
                                World3D.method277(-8967, var26 * 128, var35, var27 * 128 + 128, var12 * 128, var10, var12 * 128, var34, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field131[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field131[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field131[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field115 && (this.field131[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field131[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field114) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field131[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field112[var11][var38][var40];
                                World3D.method277(-8967, var38 * 128, var44, var39 * 128 + 128, var41 * 128 + 128, var10, var40 * 128, var44, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field131[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IIZ[BIII[LXRENONSA;II)V")
    public final void method16(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, int arg5, int arg6, CollisionMap[] arg7, int arg8, int arg9) {
        if (arg2) {
            this.field129 = 476;
        }
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg6 + var11 > 0 && arg6 + var11 < 103 && arg8 + var16 > 0 && arg8 + var16 < 103) {
                    arg7[arg4].field1585[arg6 + var11][arg8 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        Packet var12 = new Packet(true, arg3);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg9 && var14 < arg9 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
                        this.method31(0, (byte) -61, 0, var12, arg0, arg6 + WorldRegion.method461((byte) 7, arg0, var14 & 0x7, var15 & 0x7), arg4, arg8 + WorldRegion.method462(var15 & 0x7, var14 & 0x7, arg0, (byte) 5));
                    } else {
                        this.method31(0, (byte) -61, 0, var12, 0, -1, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(LZPGPWCCV;LMFMVIYHT;B)V")
    public static final void method17(OnDemand arg0, Packet arg1, byte arg2) {
        if (arg2 != -3) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg1.gsmarts();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method561(var3);
            var5.method563(arg0, -747);
            while (true) {
                int var6 = arg1.gsmarts();
                if (var6 == 0) {
                    break;
                }
                arg1.g1();
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IBI)Z")
    public static final boolean method18(int arg0, byte arg1, int arg2) {
        LocType var3 = LocType.method561(arg2);
        if (field117 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method570(26261, arg0);
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(II)I")
    private static final int method19(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(I[LXRENONSA;LKJCMXHNO;Z[BIIIIII)V")
    public final void method20(int arg0, CollisionMap[] arg1, World3D arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        Packet var12 = new Packet(true, arg4);
        if (arg3) {
            return;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.gsmarts();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.gsmarts();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.g1();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg10 == var19 && var18 >= arg7 && var18 < arg7 + 8 && var17 >= arg9 && var17 < arg9 + 8) {
                    LocType var23 = LocType.method561(var13);
                    int var24 = arg8 + WorldRegion.method463(arg6, var23.field1629, var22, var18 & 0x7, (byte) -117, var23.field1655, var17 & 0x7);
                    int var25 = arg5 + WorldRegion.method464(var23.field1655, arg6, 671, var18 & 0x7, var17 & 0x7, var23.field1629, var22);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg0;
                        if ((this.field101[1][var24][var25] & 0x2) == 2) {
                            var26 = arg0 - 1;
                        }
                        CollisionMap var27 = null;
                        if (var26 >= 0) {
                            var27 = arg1[var26];
                        }
                        this.method21(arg2, var27, var25, arg0, var24, this.field102, arg6 + var22 & 0x3, var21, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(LKJCMXHNO;LXRENONSA;IIIBIII)V")
    private final void method21(World3D arg0, CollisionMap arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (field132 && (this.field101[0][arg4][arg2] & 0x2) == 0) {
            if ((this.field101[arg3][arg4][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method12(arg2, arg3, arg4, (byte) 0) != field125) {
                return;
            }
        }
        if (arg3 < field113) {
            field113 = arg3;
        }
        int var10 = this.field112[arg3][arg4][arg2];
        int var11 = this.field112[arg3][arg4 + 1][arg2];
        int var12 = this.field112[arg3][arg4 + 1][arg2 + 1];
        int var13 = this.field112[arg3][arg4][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method561(arg8);
        int var16 = (arg8 << 14) + (arg2 << 7) + arg4 + 1073741824;
        if (arg5 != 0) {
            this.field120 = !this.field120;
        }
        if (!var15.field1613) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg6 << 6) + arg7);
        if (arg7 == 22) {
            if (!field132 || var15.field1613 || var15.field1619) {
                Entity var18;
                if (var15.field1657 == -1 && var15.field1659 == null) {
                    var18 = var15.method569(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(var15.field1657, var12, var13, var11, 22, (byte) 3, arg8, true, var10, arg6);
                }
                arg0.method280(arg4, arg2, 669, var17, var16, var14, arg3, var18);
                if (var15.field1664 && var15.field1613 && arg1 != null) {
                    arg1.method535(8, arg2, arg4);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            Entity var38;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var38 = var15.method569(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(var15.field1657, var12, var13, var11, 10, (byte) 3, arg8, true, var10, arg6);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg7 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var15.field1629;
                    var41 = var15.field1655;
                } else {
                    var40 = var15.field1655;
                    var41 = var15.field1629;
                }
                if (arg0.method284(arg3, var40, arg2, var38, var17, var39, arg4, -896, var41, var14, var16) && var15.field1661) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.method569(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1218 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field127[arg3][arg4 + var43][arg2 + var44]) {
                                    this.field127[arg3][arg4 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1664 && arg1 != null) {
                arg1.method534(arg2, arg6, var15.field1629, var15.field1655, var15.field1663, arg4, (byte) 52);
            }
        } else if (arg7 >= 12) {
            Entity var19;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var19 = var15.method569(arg7, arg6, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(var15.field1657, var12, var13, var11, arg7, (byte) 3, arg8, true, var10, arg6);
            }
            arg0.method284(arg3, 1, arg2, var19, var17, 0, arg4, -896, 1, var14, var16);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
                this.field131[arg3][arg4][arg2] |= 0x924;
            }
            if (var15.field1664 && arg1 != null) {
                arg1.method534(arg2, arg6, var15.field1629, var15.field1655, var15.field1663, arg4, (byte) 52);
            }
        } else if (arg7 == 0) {
            Entity var20;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var20 = var15.method569(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(var15.field1657, var12, var13, var11, 0, (byte) 3, arg8, true, var10, arg6);
            }
            arg0.method282(var14, 49878, 0, field121[arg6], null, arg4, var16, var17, arg2, var20, arg3);
            if (arg6 == 0) {
                if (var15.field1661) {
                    this.field127[arg3][arg4][arg2] = 50;
                    this.field127[arg3][arg4][arg2 + 1] = 50;
                }
                if (var15.field1651) {
                    this.field131[arg3][arg4][arg2] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var15.field1661) {
                    this.field127[arg3][arg4][arg2 + 1] = 50;
                    this.field127[arg3][arg4 + 1][arg2 + 1] = 50;
                }
                if (var15.field1651) {
                    this.field131[arg3][arg4][arg2 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var15.field1661) {
                    this.field127[arg3][arg4 + 1][arg2] = 50;
                    this.field127[arg3][arg4 + 1][arg2 + 1] = 50;
                }
                if (var15.field1651) {
                    this.field131[arg3][arg4 + 1][arg2] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var15.field1661) {
                    this.field127[arg3][arg4][arg2] = 50;
                    this.field127[arg3][arg4 + 1][arg2] = 50;
                }
                if (var15.field1651) {
                    this.field131[arg3][arg4][arg2] |= 0x492;
                }
            }
            if (var15.field1664 && arg1 != null) {
                arg1.method533(arg6, 37679, var15.field1663, arg7, arg4, arg2);
            }
            if (var15.field1656 != 16) {
                arg0.method290(arg2, var15.field1656, arg3, arg4, 0);
            }
        } else if (arg7 == 1) {
            Entity var21;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var21 = var15.method569(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(var15.field1657, var12, var13, var11, 1, (byte) 3, arg8, true, var10, arg6);
            }
            arg0.method282(var14, 49878, 0, field130[arg6], null, arg4, var16, var17, arg2, var21, arg3);
            if (var15.field1661) {
                if (arg6 == 0) {
                    this.field127[arg3][arg4][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field127[arg3][arg4 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field127[arg3][arg4 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    this.field127[arg3][arg4][arg2] = 50;
                }
            }
            if (var15.field1664 && arg1 != null) {
                arg1.method533(arg6, 37679, var15.field1663, arg7, arg4, arg2);
            }
        } else if (arg7 == 2) {
            int var22 = arg6 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var23 = var15.method569(2, arg6 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method569(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(var15.field1657, var12, var13, var11, 2, (byte) 3, arg8, true, var10, arg6 + 4);
                var24 = new LocEntity(var15.field1657, var12, var13, var11, 2, (byte) 3, arg8, true, var10, var22);
            }
            arg0.method282(var14, 49878, field121[var22], field121[arg6], var24, arg4, var16, var17, arg2, var23, arg3);
            if (var15.field1651) {
                if (arg6 == 0) {
                    this.field131[arg3][arg4][arg2] |= 0x249;
                    this.field131[arg3][arg4][arg2 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field131[arg3][arg4][arg2 + 1] |= 0x492;
                    this.field131[arg3][arg4 + 1][arg2] |= 0x249;
                } else if (arg6 == 2) {
                    this.field131[arg3][arg4 + 1][arg2] |= 0x249;
                    this.field131[arg3][arg4][arg2] |= 0x492;
                } else if (arg6 == 3) {
                    this.field131[arg3][arg4][arg2] |= 0x492;
                    this.field131[arg3][arg4][arg2] |= 0x249;
                }
            }
            if (var15.field1664 && arg1 != null) {
                arg1.method533(arg6, 37679, var15.field1663, arg7, arg4, arg2);
            }
            if (var15.field1656 != 16) {
                arg0.method290(arg2, var15.field1656, arg3, arg4, 0);
            }
        } else if (arg7 == 3) {
            Entity var25;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var25 = var15.method569(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(var15.field1657, var12, var13, var11, 3, (byte) 3, arg8, true, var10, arg6);
            }
            arg0.method282(var14, 49878, 0, field130[arg6], null, arg4, var16, var17, arg2, var25, arg3);
            if (var15.field1661) {
                if (arg6 == 0) {
                    this.field127[arg3][arg4][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field127[arg3][arg4 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field127[arg3][arg4 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    this.field127[arg3][arg4][arg2] = 50;
                }
            }
            if (var15.field1664 && arg1 != null) {
                arg1.method533(arg6, 37679, var15.field1663, arg7, arg4, arg2);
            }
        } else if (arg7 == 9) {
            Entity var26;
            if (var15.field1657 == -1 && var15.field1659 == null) {
                var26 = var15.method569(arg7, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(var15.field1657, var12, var13, var11, arg7, (byte) 3, arg8, true, var10, arg6);
            }
            arg0.method284(arg3, 1, arg2, var26, var17, 0, arg4, -896, 1, var14, var16);
            if (var15.field1664 && arg1 != null) {
                arg1.method534(arg2, arg6, var15.field1629, var15.field1655, var15.field1663, arg4, (byte) 52);
            }
        } else {
            if (var15.field1623) {
                if (arg6 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg6 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg6 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg7 == 4) {
                Entity var31;
                if (var15.field1657 == -1 && var15.field1659 == null) {
                    var31 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(var15.field1657, var12, var13, var11, 4, (byte) 3, arg8, true, var10, 0);
                }
                arg0.method283(arg3, field121[arg6], arg6 * 512, var16, var17, arg4, 0, arg2, 0, var14, var31, -930);
            } else if (arg7 == 5) {
                int var32 = 16;
                int var33 = arg0.method300(arg3, arg4, arg2);
                if (var33 > 0) {
                    var32 = LocType.method561(var33 >> 14 & 0x7FFF).field1656;
                }
                Entity var34;
                if (var15.field1657 == -1 && var15.field1659 == null) {
                    var34 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(var15.field1657, var12, var13, var11, 4, (byte) 3, arg8, true, var10, 0);
                }
                arg0.method283(arg3, field121[arg6], arg6 * 512, var16, var17, arg4, field106[arg6] * var32, arg2, field124[arg6] * var32, var14, var34, -930);
            } else if (arg7 == 6) {
                Entity var35;
                if (var15.field1657 == -1 && var15.field1659 == null) {
                    var35 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(var15.field1657, var12, var13, var11, 4, (byte) 3, arg8, true, var10, 0);
                }
                arg0.method283(arg3, 256, arg6, var16, var17, arg4, 0, arg2, 0, var14, var35, -930);
            } else if (arg7 == 7) {
                Entity var36;
                if (var15.field1657 == -1 && var15.field1659 == null) {
                    var36 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(var15.field1657, var12, var13, var11, 4, (byte) 3, arg8, true, var10, 0);
                }
                arg0.method283(arg3, 512, arg6, var16, var17, arg4, 0, arg2, 0, var14, var36, -930);
            } else if (arg7 == 8) {
                Entity var37;
                if (var15.field1657 == -1 && var15.field1659 == null) {
                    var37 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(var15.field1657, var12, var13, var11, 4, (byte) 3, arg8, true, var10, 0);
                }
                arg0.method283(arg3, 768, arg6, var16, var17, arg4, 0, arg2, 0, var14, var37, -930);
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IZII[BI[LXRENONSA;)V")
    public final void method22(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, CollisionMap[] arg6) {
        if (arg1) {
            this.field129 = -379;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 + var13 > 0 && arg3 + var13 < 103 && arg0 + var14 > 0 && arg0 + var14 < 103) {
                        arg6[var8].field1585[arg3 + var13][arg0 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        Packet var9 = new Packet(true, arg4);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method31(arg5, (byte) -61, arg2, var9, 0, arg3 + var11, var10, arg0 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "<init>", descriptor = "([[[II[[[BII)V")
    public World(int[][][] arg0, int arg1, byte[][][] arg2, int arg3, int arg4) {
        field113 = 99;
        this.field114 = arg4;
        this.field115 = arg3;
        this.field112 = arg0;
        this.field101 = arg2;
        this.field122 = new byte[4][this.field114][this.field115];
        this.field118 = new byte[4][this.field114][this.field115];
        this.field116 = new byte[4][this.field114][this.field115];
        this.field105 = new byte[4][this.field114][this.field115];
        this.field131 = new int[4][this.field114 + 1][this.field115 + 1];
        this.field127 = new byte[4][this.field114 + 1][this.field115 + 1];
        this.field128 = new int[this.field114 + 1][this.field115 + 1];
        this.field107 = new int[this.field115];
        this.field108 = new int[this.field115];
        this.field109 = new int[this.field115];
        this.field110 = new int[this.field115];
        this.field111 = new int[this.field115];
        if (arg1 != 14290) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "b", descriptor = "(II)I")
    private static final int method23(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "b", descriptor = "(IIII)I")
    private static final int method24(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Draw3D.field1599[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "b", descriptor = "(III)I")
    private final int method25(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "c", descriptor = "(II)I")
    private static final int method26(int arg0, int arg1) {
        int var2 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
        int var3 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
        int var4 = method23(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(I[LXRENONSA;IILKJCMXHNO;[B)V")
    public final void method27(int arg0, CollisionMap[] arg1, int arg2, int arg3, World3D arg4, byte[] arg5) {
        if (arg3 >= 0) {
            return;
        }
        Packet var7 = new Packet(true, arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.gsmarts();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.gsmarts();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.g1();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field101[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method21(arg4, var21, var19, var14, var18, this.field102, var17, var16, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IIIII)V")
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= 0) {
            return;
        }
        for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field114 && var6 >= 0 && var6 < this.field115) {
                    this.field127[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field112[0][var7][var6] = this.field112[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field114 - 1) {
                        this.field112[0][var7][var6] = this.field112[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field112[0][var7][var6] = this.field112[0][var7][var6 - 1];
                    }
                    if (arg1 + arg2 == var6 && var6 < this.field115 - 1) {
                        this.field112[0][var7][var6] = this.field112[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method29(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(true, arg2);
        if (arg3 != 24515) {
            throw new NullPointerException();
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.gsmarts();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.gsmarts();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.g1() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method561(var6);
                        if (var14 != 22 || !field132 || var17.field1613 || var17.field1619) {
                            var4 &= var17.method566(-321);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.gsmarts();
                if (var10 == 0) {
                    break;
                }
                var5.g1();
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "d", descriptor = "(II)I")
    private final int method30(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "a", descriptor = "(IBILMFMVIYHT;IIII)V")
    private final void method31(int arg0, byte arg1, int arg2, Packet arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -61) {
            this.field103 = !this.field103;
        }
        if (arg5 < 0 || arg5 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg3.g1();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg3.g1();
                    return;
                }
                if (var11 <= 49) {
                    arg3.g1();
                }
            }
        }
        this.field101[arg6][arg5][arg7] = 0;
        while (true) {
            int var9 = arg3.g1();
            if (var9 == 0) {
                if (arg6 == 0) {
                    this.field112[0][arg5][arg7] = -method32(arg5 + arg0 + 932731, arg7 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field112[arg6][arg5][arg7] = this.field112[arg6 - 1][arg5][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg3.g1();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg6 == 0) {
                    this.field112[0][arg5][arg7] = -var10 * 8;
                    return;
                }
                this.field112[arg6][arg5][arg7] = this.field112[arg6 - 1][arg5][arg7] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field118[arg6][arg5][arg7] = arg3.g1b();
                this.field116[arg6][arg5][arg7] = (byte) ((var9 - 2) / 4);
                this.field105[arg6][arg5][arg7] = (byte) (var9 + arg4 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field101[arg6][arg5][arg7] = (byte) (var9 - 49);
            } else {
                this.field122[arg6][arg5][arg7] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!CHEOPWNH", name = "e", descriptor = "(II)I")
    private static final int method32(int arg0, int arg1) {
        int var2 = method11(arg0 + 45365, arg1 + 91923, 4) + (method11(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method11(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }
}
