import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class105 {

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "[I")
    private int[] field1517 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "[I")
    private int[] field1521 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "Lob;")
    private class4 field1523;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "Z")
    public boolean field1519;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "Leq;")
    private class140 field1508;

    @OriginalMember(owner = "client!pw", name = "y", descriptor = "[[[B")
    private byte[][][] field1531;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "[[[B")
    private byte[][][] field1509;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "[[[B")
    private byte[][][] field1512;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "[[[B")
    private byte[][][] field1516;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "[[[B")
    public byte[][][] field1515;

    @OriginalMember(owner = "client!pw", name = "u", descriptor = "[[[I")
    public int[][][] field1527;

    @OriginalMember(owner = "client!pw", name = "v", descriptor = "Lbh;")
    public static class538 field1528 = new class538(30);

    @OriginalMember(owner = "client!pw", name = "C", descriptor = "Lqk;")
    public static class148 field1535 = new class148(91, -2);

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "Lkp;")
    public static class480 field1536 = null;

    @OriginalMember(owner = "client!pw", name = "F", descriptor = "Z")
    public static boolean field1538 = false;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!pw", name = "t", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!pw", name = "A", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!pw", name = "B", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!pw", name = "E", descriptor = "Lnn;")
    public static class361 field1537;

    @OriginalMember(owner = "client!pw", name = "x", descriptor = "[[[B")
    public byte[][][] field1530;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 < this.field1524; var6++) {
            this.method707(var6, arg0 - 88, arg1, arg2, arg3, arg4);
        }
        field1526++;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIII)V", line = 19)
    public final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 92 % ((arg1 - 29) / 33);
        field1522++;
        for (int var8 = arg2; var8 < arg2 + arg3; var8++) {
            for (int var11 = arg5; var11 < arg4 + arg5; var11++) {
                if (var11 >= 0 && var11 < this.field1520 && var8 >= 0 && this.field1514 > var8) {
                    this.field1527[arg0][var11][var8] = arg0 <= 0 ? 0 : this.field1527[arg0 - 1][var11][var8] - 960;
                }
            }
        }
        if (arg5 > 0 && this.field1520 > arg5) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field1514) {
                    this.field1527[arg0][arg5][var9] = this.field1527[arg0][arg5 - 1][var9];
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field1514) {
            for (int var10 = arg5 + 1; var10 < (arg5 + arg4); var10++) {
                if (var10 >= 0 && var10 < this.field1520) {
                    this.field1527[arg0][var10][arg2] = this.field1527[arg0][var10][arg2 - 1];
                }
            }
        }
        if (arg5 < 0 || arg2 < 0 || this.field1520 <= arg5 || arg2 >= this.field1514) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 <= 0 || this.field1527[arg0][arg5 - 1][arg2] == 0) {
                if (arg2 > 0 && this.field1527[arg0][arg5][arg2 - 1] != 0) {
                    this.field1527[arg0][arg5][arg2] = this.field1527[arg0][arg5][arg2 - 1];
                    return;
                }
                if (arg5 > 0 && arg2 > 0 && this.field1527[arg0][arg5 - 1][arg2 - 1] != 0) {
                    this.field1527[arg0][arg5][arg2] = this.field1527[arg0][arg5 - 1][arg2 - 1];
                    return;
                }
                return;
            }
            this.field1527[arg0][arg5][arg2] = this.field1527[arg0][arg5 - 1][arg2];
        } else if (arg5 <= 0 || this.field1527[arg0][arg5 - 1][arg2] == this.field1527[arg0 - 1][arg5 - 1][arg2]) {
            if (arg2 > 0 && this.field1527[arg0 - 1][arg5][arg2 - 1] != this.field1527[arg0][arg5][arg2 - 1]) {
                this.field1527[arg0][arg5][arg2] = this.field1527[arg0][arg5][arg2 - 1];
                return;
            }
            if (arg5 > 0 && arg2 > 0 && this.field1527[arg0][arg5 - 1][arg2 - 1] != this.field1527[arg0 - 1][arg5 - 1][arg2 - 1]) {
                this.field1527[arg0][arg5][arg2] = this.field1527[arg0][arg5 - 1][arg2 - 1];
                return;
            }
        } else {
            this.field1527[arg0][arg5][arg2] = this.field1527[arg0][arg5 - 1][arg2];
            return;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lha;Ls;Ls;B)V", line = 122)
    public final void method708(class545 arg0, class339 arg1, class339 arg2, byte arg3) {
        field1525++;
        int[][] var5 = new int[this.field1520][this.field1514];
        if (class330.field4241 == null || class330.field4241.length != this.field1514) {
            class604.field8630 = new int[this.field1514];
            class330.field4241 = new int[this.field1514];
            class49.field724 = new int[this.field1514];
            class524.field7351 = new int[this.field1514];
            class270.field3638 = new int[this.field1514];
        }
        int var6 = 0;
        if (arg3 < 89) {
            field1535 = null;
        }
        while (var6 < this.field1524) {
            for (int var8 = 0; var8 < this.field1514; var8++) {
                class330.field4241[var8] = 0;
                class49.field724[var8] = 0;
                class604.field8630[var8] = 0;
                class524.field7351[var8] = 0;
                class270.field3638[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1520; var9++) {
                for (int var10 = 0; var10 < this.field1514; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field1520) {
                        int var20 = this.field1512[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class759 var21 = this.field1523.method11(var20 - 1, 66);
                            class330.field4241[var10] += var21.field10549;
                            class49.field724[var10] += var21.field10553;
                            class604.field8630[var10] += var21.field10546;
                            class524.field7351[var10] += var21.field10552;
                            var10002 = class270.field3638[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1512[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class759 var24 = this.field1523.method11(var23 - 1, 64);
                            class330.field4241[var10] -= var24.field10549;
                            class49.field724[var10] -= var24.field10553;
                            class604.field8630[var10] -= var24.field10546;
                            class524.field7351[var10] -= var24.field10552;
                            var10002 = class270.field3638[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1514; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1514 > var17) {
                            var11 += class330.field4241[var17];
                            var14 += class524.field7351[var17];
                            var13 += class604.field8630[var17];
                            var15 += class270.field3638[var17];
                            var12 += class49.field724[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class604.field8630[var18];
                            var14 -= class524.field7351[var18];
                            var12 -= class49.field724[var18];
                            var15 -= class270.field3638[var18];
                            var11 -= class330.field4241[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class95.method653(var13 / var15, -122, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class611.field8698) {
                this.method713(var6 == 0 ? arg1 : null, var6, arg0, var6 == 0 ? arg2 : null, -11822, class52.field741[var6], var5);
            } else {
                this.method716(var6 == 0 ? arg1 : null, class52.field741[var6], var5, -1425, arg0, var6 == 0 ? arg2 : null, var6);
            }
            this.field1512[var6] = null;
            this.field1509[var6] = null;
            this.field1516[var6] = null;
            this.field1531[var6] = null;
            var6++;
        }
        if (!this.field1519) {
            if (class424.field5865 != 0) {
                class241.method1535();
            }
            if (class707.field9855) {
                class469.method2793();
            }
        }
        for (int var7 = 0; var7 < this.field1524; var7++) {
            class52.field741[var7].method514();
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILvj;III[Lnt;IIZI)V", line = 299)
    public final void method709(int arg0, class26 arg1, int arg2, int arg3, int arg4, class141[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field1532++;
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field1519) {
            class141 var12 = arg5[arg3];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class259.method1612(-29100, var13 & 0x7, var14 & 0x7, arg0) + arg7;
                    int var16 = arg9 + class576.method3433(var14 & 0x7, arg0, 0, var13 & 0x7);
                    if (var15 > 0 && this.field1520 - 1 > var15 && var16 > 0 && var16 < (this.field1514 - 1)) {
                        var12.method921(var16, 1, var15);
                    }
                }
            }
        }
        int var17 = (arg2 & 0x7) * 8;
        int var18 = (arg4 & 0xFFFFFFF8) << 3;
        if (arg8) {
            return;
        }
        int var19 = (arg2 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1524; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 == var22 && var11 <= var23 && (var11 + 8) >= var23 && var24 >= var17 && var17 + 8 >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg0 == 0) {
                                var25 = var23 + arg7 - var11;
                                var26 = -var17 - (-var24 - arg9);
                            } else if (arg0 == 1) {
                                var25 = arg7 + var24 - var17;
                                var26 = arg9 + 8 - (var23 - var11);
                            } else if (arg0 == 2) {
                                var26 = arg9 + var17 + 8 - var24;
                                var25 = arg7 + 8 - (-var11 + var23);
                            } else {
                                var26 = var23 + arg9 - var11;
                                var25 = arg7 - var24 - (-var17 - 8);
                            }
                            this.method715(var18 + var23, 0, true, (byte) 91, arg3, 0, var26, 0, arg1, var19 + var24, var25);
                        } else {
                            var25 = arg7 + class259.method1612(-29100, var23 & 0x7, var24 & 0x7, arg0);
                            var26 = arg9 + class576.method3433(var24 & 0x7, arg0, 0, var23 & 0x7);
                            this.method715(var18 + var23, arg0, false, (byte) 105, arg3, var21, var26, var20, arg1, var19 + var24, var25);
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
                                if (arg0 == 0) {
                                    var31 = arg9 + var30 - var17;
                                    var32 = arg7 + var29 - var11;
                                } else if (arg0 == 1) {
                                    var32 = var30 + arg7 - var17;
                                    var31 = arg9 + var11 + 8 - var29;
                                } else if (arg0 == 2) {
                                    var31 = arg9 + 8 - (var30 - var17);
                                    var32 = var11 + arg7 + 8 - var29;
                                } else {
                                    var32 = var17 + arg7 + 8 - var30;
                                    var31 = arg9 + var29 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field1520 && var31 >= 0 && this.field1514 > var31) {
                                    this.field1527[arg3][var32][var31] = this.field1527[arg3][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method715(0, 0, false, (byte) 106, 0, 0, -1, 0, arg1, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II[[BILha;II[[BLbd;I[ZI[[BLvt;)V", line = 500)
    private final void method710(int arg0, int arg1, byte[][] arg2, int arg3, class545 arg4, int arg5, int arg6, byte[][] arg7, class552 arg8, int arg9, boolean[] arg10, int arg11, byte[][] arg12, class759 arg13) {
        field1510++;
        boolean[] var15 = arg8 != null && arg8.field7815 ? class261.field3562[arg11] : class390.field5435[arg11];
        if (arg5 > 0) {
            if (arg0 > 0) {
                int var16 = arg2[arg0 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class552 var17 = this.field1508.method903((byte) -76, var16 - 1);
                    if (var17.field7803 != -1 && var17.field7815) {
                        byte var18 = arg7[arg0 - 1][arg5 - 1];
                        int var19 = arg12[arg0 - 1][arg5 - 1] * 2 + 4 & 0x7;
                        int var20 = class710.method3990(arg4, false, var17);
                        if (class218.field3093[var18][var19]) {
                            class519.field7245[0] = var17.field7803;
                            class490.field6594[0] = var20;
                            class405.field5620[0] = var17.field7814;
                            class33.field492[0] = var17.field7810;
                            class133.field1793[0] = var17.field7812;
                            class167.field2286[0] = 256;
                        }
                    }
                }
            }
            if ((arg9 - 1) > arg0) {
                int var21 = arg2[arg0 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class552 var22 = this.field1508.method903((byte) -80, var21 - 1);
                    if (var22.field7803 != -1 && var22.field7815) {
                        byte var23 = arg7[arg0 + 1][arg5 - 1];
                        int var24 = arg12[arg0 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class710.method3990(arg4, false, var22);
                        if (class218.field3093[var23][var24]) {
                            class519.field7245[2] = var22.field7803;
                            class490.field6594[2] = var25;
                            class405.field5620[2] = var22.field7814;
                            class33.field492[2] = var22.field7810;
                            class133.field1793[2] = var22.field7812;
                            class167.field2286[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg6 != 24219) {
            this.method708(null, null, null, (byte) -30);
        }
        if ((arg1 - 1) > arg5) {
            if (arg0 > 0) {
                int var26 = arg2[arg0 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class552 var27 = this.field1508.method903((byte) -93, var26 - 1);
                    if (var27.field7803 != -1 && var27.field7815) {
                        byte var28 = arg7[arg0 - 1][arg5 + 1];
                        int var29 = (arg12[arg0 - 1][arg5 + 1] * 2) + 2 & 0x7;
                        int var30 = class710.method3990(arg4, false, var27);
                        if (class218.field3093[var28][var29]) {
                            class519.field7245[6] = var27.field7803;
                            class490.field6594[6] = var30;
                            class405.field5620[6] = var27.field7814;
                            class33.field492[6] = var27.field7810;
                            class133.field1793[6] = var27.field7812;
                            class167.field2286[6] = 64;
                        }
                    }
                }
            }
            if (arg9 - 1 > arg0) {
                int var31 = arg2[arg0 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class552 var32 = this.field1508.method903((byte) 97, var31 - 1);
                    if (var32.field7803 != -1 && var32.field7815) {
                        byte var33 = arg7[arg0 + 1][arg5 + 1];
                        int var34 = -(-(arg12[arg0 + 1][arg5 + 1] * 2)) & 0x7;
                        int var35 = class710.method3990(arg4, false, var32);
                        if (class218.field3093[var33][var34]) {
                            class519.field7245[4] = var32.field7803;
                            class490.field6594[4] = var35;
                            class405.field5620[4] = var32.field7814;
                            class33.field492[4] = var32.field7810;
                            class133.field1793[4] = var32.field7812;
                            class167.field2286[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg2[arg0][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class552 var37 = this.field1508.method903((byte) -69, var36 - 1);
                if (var37.field7803 != -1) {
                    byte var38 = arg7[arg0][arg5 - 1];
                    byte var39 = arg12[arg0][arg5 - 1];
                    if (var37.field7815) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class710.method3990(arg4, false, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class218.field3093[var38][var41] && class133.field1793[var40] <= var37.field7812) {
                                class519.field7245[var40] = var37.field7803;
                                class490.field6594[var40] = var42;
                                class405.field5620[var40] = var37.field7814;
                                class33.field492[var40] = var37.field7810;
                                if (class133.field1793[var40] == var37.field7812) {
                                    class167.field2286[var40] = class747.method4153(class167.field2286[var40], 32);
                                } else {
                                    class167.field2286[var40] = 32;
                                }
                                class133.field1793[var40] = var37.field7812;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg3 & 0x3]) {
                            arg10[0] = class261.field3562[var38][class136.method878(var39 + 2, 3)];
                        }
                    } else if (!var15[arg3 & 0x3]) {
                        arg10[0] = class390.field5435[var38][class136.method878(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg1 - 1 > arg5) {
            int var44 = arg2[arg0][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class552 var45 = this.field1508.method903((byte) 83, var44 - 1);
                if (var45.field7803 != -1) {
                    byte var46 = arg7[arg0][arg5 + 1];
                    byte var47 = arg12[arg0][arg5 + 1];
                    if (var45.field7815) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class710.method3990(arg4, false, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class218.field3093[var46][var49] && class133.field1793[var48] <= var45.field7812) {
                                class519.field7245[var48] = var45.field7803;
                                class490.field6594[var48] = var50;
                                class405.field5620[var48] = var45.field7814;
                                class33.field492[var48] = var45.field7810;
                                if (class133.field1793[var48] == var45.field7812) {
                                    class167.field2286[var48] = class747.method4153(class167.field2286[var48], 16);
                                } else {
                                    class167.field2286[var48] = 16;
                                }
                                class133.field1793[var48] = var45.field7812;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg3 + 2 & 0x3]) {
                            arg10[2] = class261.field3562[var46][class136.method878(var47, 3)];
                        }
                    } else if (!var15[arg3 + 2 & 0x3]) {
                        arg10[2] = class390.field5435[var46][class136.method878(var47, 3)];
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var52 = arg2[arg0 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class552 var53 = this.field1508.method903((byte) 97, var52 - 1);
                if (var53.field7803 != -1) {
                    byte var54 = arg7[arg0 - 1][arg5];
                    byte var55 = arg12[arg0 - 1][arg5];
                    if (var53.field7815) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class710.method3990(arg4, false, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class218.field3093[var54][var57] && var53.field7812 >= class133.field1793[var56]) {
                                class519.field7245[var56] = var53.field7803;
                                class490.field6594[var56] = var58;
                                class405.field5620[var56] = var53.field7814;
                                class33.field492[var56] = var53.field7810;
                                if (class133.field1793[var56] == var53.field7812) {
                                    class167.field2286[var56] = class747.method4153(class167.field2286[var56], 8);
                                } else {
                                    class167.field2286[var56] = 8;
                                }
                                class133.field1793[var56] = var53.field7812;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg3 + 3 & 0x3]) {
                            arg10[3] = class261.field3562[var54][class136.method878(3, var55 + 1)];
                        }
                    } else if (!var15[arg3 + 3 & 0x3]) {
                        arg10[3] = class390.field5435[var54][class136.method878(var55 + 1, 3)];
                    }
                }
            }
        }
        if ((arg9 - 1) > arg0) {
            int var60 = arg2[arg0 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class552 var61 = this.field1508.method903((byte) 66, var60 - 1);
                if (var61.field7803 != -1) {
                    byte var62 = arg7[arg0 + 1][arg5];
                    byte var63 = arg12[arg0 + 1][arg5];
                    if (var61.field7815) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class710.method3990(arg4, false, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class218.field3093[var62][var65] && class133.field1793[var64] <= var61.field7812) {
                                class519.field7245[var64] = var61.field7803;
                                class490.field6594[var64] = var66;
                                class405.field5620[var64] = var61.field7814;
                                class33.field492[var64] = var61.field7810;
                                if (class133.field1793[var64] == var61.field7812) {
                                    class167.field2286[var64] = class747.method4153(class167.field2286[var64], 4);
                                } else {
                                    class167.field2286[var64] = 4;
                                }
                                class133.field1793[var64] = var61.field7812;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg3 + 1 & 0x3]) {
                            arg10[1] = class261.field3562[var62][class136.method878(var63 + 3, 3)];
                        }
                    } else if (!var15[arg3 + 1 & 0x3]) {
                        arg10[1] = class390.field5435[var62][class136.method878(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class710.method3990(arg4, false, arg8);
        if (!arg8.field7815) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg3 * 2) & 0x7;
            if (class218.field3093[arg11][var69] && arg8.field7812 >= class133.field1793[var70]) {
                class519.field7245[var70] = arg8.field7803;
                class490.field6594[var70] = var68;
                class405.field5620[var70] = arg8.field7814;
                class33.field492[var70] = arg8.field7810;
                if (class133.field1793[var70] == arg8.field7812) {
                    class167.field2286[var70] = class747.method4153(class167.field2286[var70], 2);
                } else {
                    class167.field2286[var70] = 2;
                }
                class133.field1793[var70] = arg8.field7812;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lha;[Lnt;I[[[I)V", line = 970)
    public final void method711(class545 arg0, class141[] arg1, int arg2, int[][][] arg3) {
        if (!this.field1519) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1520; var6++) {
                    for (int var7 = 0; var7 < this.field1514; var7++) {
                        if ((class429.field5916[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class429.field5916[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method916(var6, -2, var7);
                            }
                        }
                    }
                }
            }
        }
        field1511++;
        if (arg2 != 81) {
            return;
        }
        for (int var9 = 0; var9 < this.field1524; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1519) {
                if (class252.field3489) {
                    var11 |= 0x8;
                }
                if (class707.field9855) {
                    var10 |= 0x2;
                }
                if (class424.field5865 != 0) {
                    var10 |= 0x1;
                    if (class317.field4077 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class707.field9855) {
                var11 |= 0x7;
            }
            if (!class229.field3189) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field1527[var9] : arg3[var9];
            class281.method1680(var9, arg0.method2213(this.field1520, this.field1514, this.field1527[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B[[II)V", line = 1069)
    public final void method712(byte arg0, int[][] arg1, int arg2) {
        field1513++;
        int[][] var4 = this.field1527[arg2];
        for (int var5 = 0; var5 < this.field1520 + 1; var5++) {
            for (int var6 = 0; var6 < this.field1514 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
        if (arg0 != 78) {
            method717((byte) -107);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Ls;ILha;Ls;ILs;[[I)V", line = 1096)
    private final void method713(class339 arg0, int arg1, class545 arg2, class339 arg3, int arg4, class339 arg5, int[][] arg6) {
        field1507++;
        if (arg4 != -11822) {
            this.field1515 = null;
        }
        byte[][] var8 = this.field1516[arg1];
        byte[][] var9 = this.field1531[arg1];
        byte[][] var10 = this.field1512[arg1];
        byte[][] var11 = this.field1509[arg1];
        for (int var12 = 0; var12 < this.field1520; var12++) {
            int var13 = (this.field1520 - 1) <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field1514; var14++) {
                int var15 = var14 < (this.field1514 - 1) ? var14 + 1 : var14;
                if (class126.field1744 == -1 || client.method2687(arg1, var12, var14, class126.field1744, arg4 + 11718)) {
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
                        class552 var26 = var21 == 0 ? null : this.field1508.method903((byte) -98, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class759 var27 = var22 == 0 ? null : this.field1523.method11(var22 - 1, 78);
                        class552 var28 = var26;
                        if (var26 != null) {
                            if (var26.field7803 == -1 && var26.field7800 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field7815;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field1520 > var12 && this.field1514 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
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
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method1959(arg4 ^ 0xFFFFD1AE, var14, var12) - arg5.method1959(126, var15, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method1959(123, var14, var13) - arg5.method1959(124, var15, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class133.field1793[var39] = -1;
                            class167.field2286[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field7815 ? class261.field3562[var19] : class390.field5435[var19];
                        this.method710(var12, this.field1514, var11, var20, arg2, var14, 24219, var8, var26, this.field1520, var18, var19, var9, var27);
                        boolean var41 = var26 != null && var26.field7803 != var26.field7800;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class133.field1793[var42] >= 0 && class519.field7245[var42] != class490.field6594[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class754.method4184(var18[1], class136.method878(class167.field2286[2], class167.field2286[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class754.method4184(var18[3], class136.method878(class167.field2286[6], class167.field2286[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class754.method4184(var18[0], class136.method878(class167.field2286[2], class167.field2286[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class754.method4184(var18[2], class136.method878(class167.field2286[4], class167.field2286[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var45 = class464.field6350[var19];
                            var46 = var26 == null ? 0 : class455.field6258[var19];
                            var47 = class689.field9657[var19];
                            var48 = var27 == null ? 0 : class563.field7998[var19];
                            var49 = class599.field8598[var19];
                        } else if (var17) {
                            var46 = var26 == null ? 0 : class628.field8973[var19];
                            var49 = class741.field10328[var19];
                            var47 = class118.field1639[var19];
                            var45 = class387.field5413[var19];
                            var48 = var27 == null ? 0 : class664.field9363[var19];
                            var44 = class214.field3023[var19];
                        } else {
                            var45 = class492.field6803[var19];
                            var48 = var27 == null ? 0 : class144.field1995[var19];
                            var47 = class603.field8623[var19];
                            var46 = var26 == null ? 0 : class452.field6231[var19];
                            var49 = class682.field9588[var19];
                            var44 = class646.field9153[var19];
                        }
                        int var50 = var46 + var48;
                        if (var50 <= 0) {
                            class392.method2388(arg1, var12, var14);
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
                            int[] var60 = arg0 == null ? null : new int[var53];
                            int[] var61 = arg0 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field7810;
                                var62 = var26.field7803;
                                var63 = var26.field7814;
                                int var65 = class710.method3990(arg2, false, var26);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 1;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 1;
                                        class274.field3682[4] = var45[var51];
                                        class274.field3682[5] = var47[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 5;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 5;
                                        class274.field3682[4] = var45[var51];
                                        class274.field3682[5] = var47[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 3;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 3;
                                        class274.field3682[4] = var45[var51];
                                        var68 = 6;
                                        class274.field3682[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 7;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 7;
                                        class274.field3682[4] = var45[var51];
                                        class274.field3682[5] = var47[var51];
                                        var68 = 6;
                                    } else {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = var45[var51];
                                        var68 = 3;
                                        class274.field3682[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class274.field3682[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field1521[var70];
                                        int var73 = this.field1517[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = 512 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class218.field3093[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg0.method1960(var76, var77, arg4 + 11945) - arg5.method1960(var76, var77, 120);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class218.field3093[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg5.method1960(var78, var79, class450.method2703(arg4, -11871)) - arg0.method1960(var78, var79, 127);
                                            } else if (arg3 != null && !class286.field3772[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg3.method1960(var80, var81, 114) - arg5.method1960(var80, var81, class450.method2703(arg4, -11864));
                                            }
                                        }
                                        if (var70 < 8 && var26.field7812 < class133.field1793[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class490.field6594[var71];
                                            }
                                            var59[var52] = class33.field492[var71];
                                            var58[var52] = class405.field5620[var71];
                                            var57[var52] = class519.field7245[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field7814;
                                            var59[var52] = var26.field7810;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1519 && arg1 == 0) {
                                    class116.method769(var12, var14, var26.field7809, var26.field7813 * 8, var26.field7806);
                                }
                                if (var19 != 12 && var26.field7803 != -1 && var26.field7805) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class455.field6258[var19];
                            } else if (var17) {
                                var51 += class628.field8973[var19];
                            } else {
                                var51 += class452.field6231[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class759 var82 = this.field1523.method11(var22 - 1, 84);
                                class759 var83 = this.field1523.method11(var23 - 1, 70);
                                class759 var84 = this.field1523.method11(var24 - 1, arg4 + 11908);
                                class759 var85 = this.field1523.method11(var25 - 1, 76);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 1;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 1;
                                        class274.field3682[4] = var45[var51];
                                        var88 = 6;
                                        class274.field3682[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 5;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 5;
                                        class274.field3682[4] = var45[var51];
                                        var88 = 6;
                                        class274.field3682[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 3;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 3;
                                        class274.field3682[4] = var45[var51];
                                        var88 = 6;
                                        class274.field3682[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = 7;
                                        class274.field3682[2] = var47[var51];
                                        class274.field3682[3] = 7;
                                        class274.field3682[4] = var45[var51];
                                        var88 = 6;
                                        class274.field3682[5] = var47[var51];
                                    } else {
                                        class274.field3682[0] = var49[var51];
                                        class274.field3682[1] = var45[var51];
                                        class274.field3682[2] = var47[var51];
                                        var88 = 3;
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class274.field3682[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field1521[var90];
                                        int var93 = this.field1517[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = 512 - var92;
                                            var94 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var94 = 512 - var93;
                                            var95 = var92;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class218.field3093[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg0.method1960(var96, var97, 127) - arg5.method1960(var96, var97, 115);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class218.field3093[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg5.method1960(var98, var99, 119) - arg0.method1960(var98, var99, 127);
                                            } else if (arg3 != null && !class286.field3772[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg3.method1960(var100, var101, 123) - arg5.method1960(var100, var101, 117);
                                            }
                                        }
                                        if (var90 < 8 && class133.field1793[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class490.field6594[var91];
                                            }
                                            var59[var52] = class33.field492[var91];
                                            var58[var52] = class405.field5620[var91];
                                            var57[var52] = class519.field7245[var91];
                                        } else {
                                            if (var17 && class218.field3093[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var82.field10554;
                                                var59[var52] = var82.field10542;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var83.field10554;
                                                var59[var52] = var83.field10542;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var84.field10554;
                                                var59[var52] = var84.field10542;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var85.field10554;
                                                var59[var52] = var85.field10542;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 >= 256) {
                                                        var58[var52] = var84.field10554;
                                                        var59[var52] = var84.field10542;
                                                    } else {
                                                        var58[var52] = var85.field10554;
                                                        var59[var52] = var85.field10542;
                                                    }
                                                } else if (var95 >= 256) {
                                                    var58[var52] = var83.field10554;
                                                    var59[var52] = var83.field10542;
                                                } else {
                                                    var58[var52] = var82.field10554;
                                                    var59[var52] = var82.field10542;
                                                }
                                                int var102 = class561.method3359(arg6[var13][var14], var94 << 7 >> 9, 13202, arg6[var12][var14]);
                                                int var103 = class561.method3359(arg6[var13][var15], var94 << 7 >> 9, 13202, arg6[var12][var15]);
                                                var57[var52] = class561.method3359(var103, var95 << 7 >> 9, 13202, var102);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field10550) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method1959(arg4 ^ 0xFFFFD1AC, var14, var12);
                            int var105 = arg5.method1959(123, var14, var13);
                            int var106 = arg5.method1959(127, var15, var13);
                            int var107 = arg5.method1959(124, var15, var12);
                            boolean var108 = class753.method4175(-12388, var14, var12);
                            if (var108 && arg1 > 1 || !var108 && arg1 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field10545) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field7807) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1515[arg1][var12][var14] = (byte) class747.method4153(this.field1515[arg1][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field1519) {
                                var110 = class116.method767(var12, var14);
                                var111 = class375.method2259(var12, var14);
                                var112 = class419.method2538(var12, var14);
                            }
                            arg5.method508(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class392.method2388(arg1, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIB[Lnt;Lvj;II)V", line = 1964)
    public final void method714(int arg0, int arg1, byte arg2, class141[] arg3, class26 arg4, int arg5, int arg6) {
        int var8 = -90 / ((arg2 - 30) / 36);
        field1518++;
        if (!this.field1519) {
            for (int var9 = 0; var9 < 4; var9++) {
                class141 var10 = arg3[var9];
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        int var13 = arg1 + var11;
                        int var14 = arg0 + var12;
                        if (var13 >= 0 && this.field1520 > var13 && var14 >= 0 && this.field1514 > var14) {
                            var10.method921(var14, 1, var13);
                        }
                    }
                }
            }
        }
        int var15 = arg1 + arg6;
        int var16 = arg5 + arg0;
        for (int var17 = 0; var17 < this.field1524; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method715(var15 + var18, 0, false, (byte) 127, var17, 0, arg0 + var19, 0, arg4, var16 + var19, arg1 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIZBIIIILvj;II)V", line = 2041)
    private final void method715(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class26 arg8, int arg9, int arg10) {
        if (arg1 == 1) {
            arg5 = 1;
        } else if (arg1 == 2) {
            arg7 = 1;
            arg5 = 1;
        } else if (arg1 == 3) {
            arg7 = 1;
        }
        if (arg3 < 89) {
            this.field1531 = null;
        }
        field1533++;
        if (arg10 < 0 || arg10 >= this.field1520 || arg6 < 0 || arg6 >= this.field1514) {
            while (true) {
                int var14 = arg8.method194((byte) 119);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method194((byte) 119);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method194((byte) 119);
                }
            }
        }
        if (!this.field1519 && !arg2) {
            class429.field5916[arg4][arg10][arg6] = 0;
        }
        while (true) {
            int var12 = arg8.method194((byte) 119);
            if (var12 == 0) {
                if (this.field1519) {
                    this.field1527[0][arg10 + arg7][arg5 + arg6] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field1527[0][arg10 + arg7][arg5 + arg6] = -class627.method3661(arg0 + 932731, (byte) 114, arg9 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field1527[arg4][arg7 + arg10][arg5 + arg6] = this.field1527[arg4 - 1][arg7 + arg10][arg6 + arg5] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method194((byte) 119);
                if (this.field1519) {
                    this.field1527[0][arg7 + arg10][arg6 + arg5] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg4 != 0) {
                    this.field1527[arg4][arg10 + arg7][arg5 + arg6] = this.field1527[arg4 - 1][arg7 + arg10][arg5 + arg6] - (var13 * 8 << 2);
                    return;
                }
                this.field1527[0][arg7 + arg10][arg5 + arg6] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg8.method194((byte) 119);
                } else {
                    this.field1509[arg4][arg10][arg6] = arg8.method195(128);
                    this.field1516[arg4][arg10][arg6] = (byte) ((var12 - 2) / 4);
                    this.field1531[arg4][arg10][arg6] = (byte) class136.method878(var12 + arg1 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field1519 && !arg2) {
                    class429.field5916[arg4][arg10][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                this.field1512[arg4][arg10][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Ls;Ls;[[IILha;Ls;I)V", line = 2167)
    private final void method716(class339 arg0, class339 arg1, int[][] arg2, int arg3, class545 arg4, class339 arg5, int arg6) {
        for (int var8 = 0; var8 < this.field1520; var8++) {
            for (int var9 = 0; var9 < this.field1514; var9++) {
                if (class126.field1744 == -1 || client.method2687(arg6, var8, var9, class126.field1744, 85)) {
                    byte var10 = this.field1516[arg6][var8][var9];
                    byte var11 = this.field1531[arg6][var8][var9];
                    int var12 = this.field1509[arg6][var8][var9] & 0xFF;
                    int var13 = this.field1512[arg6][var8][var9] & 0xFF;
                    class552 var14 = var12 == 0 ? null : this.field1508.method903((byte) -110, var12 - 1);
                    class759 var15 = var13 == 0 ? null : this.field1523.method11(var13 - 1, 64);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class563.field7998[var10];
                        var17 = var14 == null ? 0 : class455.field6258[var10];
                    } else if (var14 != null) {
                        var17 = class455.field6258[var10];
                    } else if (var15 != null) {
                        var16 = class455.field6258[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20 = var14 == null ? -1 : var14.field7814;
                        int var21 = var15 == null ? -1 : var15.field10554;
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        int[] var25 = new int[var18];
                        boolean var26 = false;
                        boolean var27 = false;
                        if (var14 == null || var14.field7803 == -1 && var14.field7800 == -1 && var20 == -1) {
                            var27 = true;
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var28 = 0; var28 < var17; var28++) {
                                var24[var19] = var20;
                                var25[var19] = var14.field7810;
                                if (var14.field7803 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field7803;
                                }
                                if (var14.field7800 == -1) {
                                    var23[var19] = -1;
                                } else {
                                    var23[var19] = var14.field7800;
                                    var26 = true;
                                }
                                var19++;
                            }
                            if (!this.field1519 && arg6 == 0) {
                                class116.method769(var8, var9, var14.field7809, var14.field7813 * 8, var14.field7806);
                            }
                        }
                        if (!var26) {
                            var23 = null;
                        }
                        if (var15 == null) {
                            if (var27) {
                                continue;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var31 = 0; var31 < var16; var31++) {
                                var24[var19] = var21;
                                var25[var19] = var15.field10542;
                                var22[var19] = arg2[var8][var9];
                                if (var23 != null) {
                                    var23[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var32 = this.field1521.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg0 == null ? null : new int[var32];
                        int[] var36 = arg0 == null && arg5 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field1521[var37];
                            int var48 = this.field1517[var37];
                            if (var11 == 0) {
                                var33[var37] = var47;
                                var34[var37] = var48;
                            } else if (var11 == 1) {
                                var33[var37] = var48;
                                var34[var37] = 512 - var47;
                            } else if (var11 == 2) {
                                var33[var37] = 512 - var47;
                                var34[var37] = 512 - var48;
                            } else if (var11 == 3) {
                                var33[var37] = 512 - var48;
                                var34[var37] = var47;
                            }
                            if (var35 != null && class218.field3093[var10][var37]) {
                                int var51 = (var8 << 9) + var33[var37];
                                int var52 = (var9 << 9) + var34[var37];
                                var35[var37] = arg0.method1960(var51, var52, 119) - arg1.method1960(var51, var52, 120);
                            }
                            if (var36 != null) {
                                if (arg0 != null && !class218.field3093[var10][var37]) {
                                    int var53 = (var8 << 9) + var33[var37];
                                    int var54 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg1.method1960(var53, var54, 120) - arg0.method1960(var53, var54, class450.method2703(arg3, -1507));
                                } else if (arg5 != null && !class286.field3772[var10][var37]) {
                                    int var55 = (var8 << 9) + var33[var37];
                                    int var56 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg5.method1960(var55, var56, arg3 + 1543) - arg1.method1960(var55, var56, 123);
                                }
                            }
                        }
                        int var38 = arg1.method1959(125, var9, var8);
                        int var39 = arg1.method1959(126, var9, var8 + 1);
                        int var40 = arg1.method1959(arg3 ^ 0xFFFFFA12, var9 + 1, var8 + 1);
                        int var41 = arg1.method1959(125, var9 + 1, var8);
                        boolean var42 = class753.method4175(-12388, var9, var8);
                        if (var42 && arg6 > 1 || !var42 && arg6 > 0) {
                            boolean var43 = true;
                            if (var15 != null && !var15.field10545) {
                                var43 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var43 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field7807) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field1515[arg6][var8][var9] = (byte) class747.method4153(this.field1515[arg6][var8][var9], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field1519) {
                            var44 = class116.method767(var8, var9);
                            var45 = class375.method2259(var8, var9);
                            var46 = class419.method2538(var8, var9);
                        }
                        arg1.method518(var8, var9, var33, var35, var34, var36, class599.field8598[var10], class464.field6350[var10], class689.field9657[var10], var22, var23, var24, var25, var44, var45, var46, false);
                        class392.method2388(arg6, var8, var9);
                    }
                }
            }
        }
        if (arg3 == -1425) {
            field1529++;
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(IIIZLeq;Lob;)V", line = 2529)
    public class105(int arg0, int arg1, int arg2, boolean arg3, class140 arg4, class4 arg5) {
        this.field1523 = arg5;
        this.field1520 = arg1;
        this.field1514 = arg2;
        this.field1524 = arg0;
        this.field1519 = arg3;
        this.field1508 = arg4;
        this.field1531 = new byte[this.field1524][this.field1520][this.field1514];
        this.field1509 = new byte[this.field1524][this.field1520][this.field1514];
        this.field1512 = new byte[this.field1524][this.field1520][this.field1514];
        this.field1516 = new byte[this.field1524][this.field1520][this.field1514];
        this.field1515 = new byte[this.field1524][this.field1520 + 1][this.field1514 + 1];
        this.field1527 = new int[this.field1524][this.field1520 + 1][this.field1514 + 1];
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V", line = 2504)
    public static void method717(byte arg0) {
        if (arg0 != 121) {
            method717((byte) 23);
        }
        field1535 = null;
        field1536 = null;
        field1537 = null;
        field1528 = null;
    }
}
