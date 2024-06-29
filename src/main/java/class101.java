import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class101 {

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "[I")
    private int[] field1663 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "[I")
    private int[] field1683 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "Ldp;")
    private class3 field1669;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "Z")
    public boolean field1661;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "Lkca;")
    private class74 field1675;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "[[[B")
    private byte[][][] field1664;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "[[[B")
    private byte[][][] field1654;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "[[[B")
    public byte[][][] field1668;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "[[[B")
    private byte[][][] field1660;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "[[[B")
    private byte[][][] field1665;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "[[[I")
    public int[][][] field1676;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "[Z")
    public static boolean[] field1652 = new boolean[8];

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "[[I")
    private static int[][] field1671 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "[S")
    public static short[] field1662 = new short[256];

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    public static int field1678 = -1;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "[[[B")
    public byte[][][] field1679;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I[[II)V", line = 5)
    public final void method970(int arg0, int[][] arg1, int arg2) {
        if (arg2 > -75) {
            field1681 = 11;
        }
        field1682++;
        int[][] var4 = this.field1676[arg0];
        for (int var5 = 0; var5 < this.field1657 + 1; var5++) {
            for (int var6 = 0; var6 < this.field1656 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIII)V", line = 42)
    public final void method971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 3) {
            this.method978(null, -84, 45, null, 84, -6, 127);
        }
        for (int var6 = 0; var6 < this.field1670; var6++) {
            this.method980(-9153, arg0, arg3, arg4, arg2, var6);
        }
        field1667++;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I[Lnc;Lie;IIIIIII)V", line = 63)
    public final void method972(int arg0, class23[] arg1, class6 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1653++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field1661) {
            class23 var13 = arg1[arg4];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class626.method3655(arg7, 72, var14 & 0x7, var15 & 0x7) + arg3;
                    int var17 = class219.method1630(arg7, -1, var14 & 0x7, var15 & 0x7) + arg0;
                    if (var16 > 0 && var16 < (this.field1657 - 1) && var17 > 0 && this.field1656 - 1 > var17) {
                        var13.method382(true, var17, var16);
                    }
                }
            }
        }
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg7 == 1) {
            var21 = 1;
        } else if (arg7 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg7 == 3) {
            var20 = 1;
        }
        if (arg8 != 12466) {
            field1662 = null;
        }
        for (int var22 = 0; var22 < this.field1670; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 == var22 && var11 <= var23 && var23 <= var11 + 8 && var12 <= var24 && (var12 + 8) >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg7 == 0) {
                                var25 = arg3 + var23 - var11;
                                var26 = var24 + arg0 - var12;
                            } else if (arg7 == 1) {
                                var26 = var11 + arg0 + 8 - var23;
                                var25 = var24 + arg3 - var12;
                            } else if (arg7 == 2) {
                                var26 = arg0 + var12 + 8 - var24;
                                var25 = arg3 + var11 + 8 - var23;
                            } else {
                                var26 = arg0 + var23 - var11;
                                var25 = arg3 - (-var12 - 8) - var24;
                            }
                            this.method975(var19 + var24, arg8 + -12458, 0, 0, var25, var18 + var23, arg4, arg2, 0, var26, true);
                        } else {
                            var25 = class626.method3655(arg7, arg8 - 12555, var23 & 0x7, var24 & 0x7) + arg3;
                            var26 = class219.method1630(arg7, -1, var23 & 0x7, var24 & 0x7) + arg0;
                            this.method975(var19 + var24, 8, var21, arg7, var25, var18 + var23, arg4, arg2, var20, var26, false);
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
                                if (arg7 == 0) {
                                    var31 = var29 + arg3 - var11;
                                    var32 = arg0 - (var12 - var30);
                                } else if (arg7 == 1) {
                                    var32 = var11 - (var29 - (arg0 + 8));
                                    var31 = arg3 + var30 - var12;
                                } else if (arg7 == 2) {
                                    var31 = arg3 + var11 + 8 - var29;
                                    var32 = arg0 + var12 + 8 - var30;
                                } else {
                                    var32 = var29 + arg0 - var11;
                                    var31 = arg3 + var12 + 8 - var30;
                                }
                                if (var31 >= 0 && var31 < this.field1657 && var32 >= 0 && this.field1656 > var32) {
                                    this.field1676[arg4][var31][var32] = this.field1676[arg4][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method975(0, arg8 - 12458, 0, 0, -1, 0, 0, arg2, 0, -1, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V", line = 268)
    public static void method973(byte arg0) {
        field1671 = null;
        field1662 = null;
        field1652 = null;
        if (arg0 != -36) {
            method973((byte) 29);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Li;Li;ILr;[[ILi;I)V", line = 280)
    private final void method974(class37 arg0, class37 arg1, int arg2, class167 arg3, int[][] arg4, class37 arg5, int arg6) {
        field1680++;
        if (arg6 != -30698) {
            this.field1669 = null;
        }
        for (int var8 = 0; var8 < this.field1657; var8++) {
            for (int var9 = 0; var9 < this.field1656; var9++) {
                if (class401.field6188 == -1 || class612.method3563(-121, var9, class401.field6188, arg2, var8)) {
                    byte var10 = this.field1654[arg2][var8][var9];
                    byte var11 = this.field1660[arg2][var8][var9];
                    int var12 = this.field1665[arg2][var8][var9] & 0xFF;
                    int var13 = this.field1664[arg2][var8][var9] & 0xFF;
                    class661 var14 = var12 == 0 ? null : this.field1675.method748(var12 - 1, (byte) 24);
                    class565 var15 = var13 == 0 ? null : this.field1669.method16(var13 - 1, (byte) 71);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class541.field7895[var10];
                        var17 = var14 == null ? 0 : class632.field8889[var10];
                    } else if (var14 != null) {
                        var17 = class632.field8889[var10];
                    } else if (var15 != null) {
                        var16 = class632.field8889[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class521.field7566) {
                            var20 = var14 == null ? -1 : var14.field9201;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 != null && (var14.field9206 != -1 || var14.field9210 != -1 || var20 != -1)) {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field9214;
                                if (var14.field9206 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field9206;
                                }
                                if (var14.field9210 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var25 = true;
                                    var22[var19] = var14.field9210;
                                }
                                var19++;
                            }
                            if (!this.field1661 && arg2 == 0) {
                                class326.method2194(var8, var9, var14.field9215, var14.field9219 * 8, var14.field9207);
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field8106;
                            if (class521.field7566) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var23[var19] = var28;
                                var24[var19] = var15.field8120;
                                var21[var19] = arg4[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1683.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var46 = this.field1683[var36];
                            int var47 = this.field1663[var36];
                            if (var11 == 0) {
                                var32[var36] = var46;
                                var33[var36] = var47;
                            } else if (var11 == 1) {
                                var32[var36] = var47;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var46;
                                var33[var36] = 512 - var47;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var47;
                                var33[var36] = var46;
                            }
                            if (var34 != null && class466.field6938[var10][var36]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var9 << 9) + var46;
                                var34[var36] = arg1.method477(-1, var51, var50) - arg0.method477(class357.method2397(arg6, 30697), var51, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class466.field6938[var10][var36]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var9 << 9) + var46;
                                    var35[var36] = arg0.method477(class357.method2397(arg6, 30697), var53, var52) - arg1.method477(-1, var53, var52);
                                } else if (arg5 != null && !class273.field4401[var10][var36]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var9 << 9) + var46;
                                    var35[var36] = arg5.method477(arg6 + 30697, var55, var54) - arg0.method477(-1, var55, var54);
                                }
                            }
                        }
                        int var37 = arg0.method479(var9, var8, 26);
                        int var38 = arg0.method479(var9, var8 + 1, -120);
                        int var39 = arg0.method479(var9 + 1, var8 + 1, -127);
                        int var40 = arg0.method479(var9 + 1, var8, -120);
                        boolean var41 = class437.method2774(true, var8, var9);
                        if (var41 && arg2 > 1 || !var41 && arg2 > 0) {
                            boolean var42 = true;
                            if (var15 != null && !var15.field8109) {
                                var42 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var42 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field9213) {
                                var42 = false;
                            }
                            if (var42 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1668[arg2][var8][var9] = (byte) class81.method769(this.field1668[arg2][var8][var9], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field1661) {
                            var43 = class389.method2526(var8, var9);
                            var44 = class379.method2497(var8, var9);
                            var45 = class441.method2786(var8, var9);
                        }
                        arg0.method473(var8, var9, var32, var34, var33, var35, class343.field5542[var10], class160.field2733[var10], class532.field7751[var10], var21, var22, var23, var24, var43, var44, var45, false);
                        class469.method2912(arg2, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIIILie;IIZ)V", line = 608)
    private final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class6 arg7, int arg8, int arg9, boolean arg10) {
        field1674++;
        if (arg3 == 1) {
            arg2 = 1;
        } else if (arg3 == 2) {
            arg2 = 1;
            arg8 = 1;
        } else if (arg3 == 3) {
            arg8 = 1;
        }
        if (arg1 != 8) {
            return;
        }
        if (arg4 < 0 || arg4 >= this.field1657 || arg9 < 0 || this.field1656 <= arg9) {
            while (true) {
                int var14 = arg7.method70(-9059);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method70(arg1 ^ 0xFFFFDC95);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method70(arg1 ^ 0xFFFFDC95);
                }
            }
        }
        if (!this.field1661 && !arg10) {
            class690.field9676[arg6][arg4][arg9] = 0;
        }
        while (true) {
            int var12 = arg7.method70(-9059);
            if (var12 == 0) {
                if (this.field1661) {
                    this.field1676[0][arg4 + arg8][arg9 + arg2] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field1676[0][arg4 + arg8][arg9 + arg2] = -class614.method3573(0, arg5 + 932731, arg0 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field1676[arg6][arg4 + arg8][arg2 + arg9] = this.field1676[arg6 - 1][arg4 + arg8][arg9 + arg2] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method70(-9059);
                if (this.field1661) {
                    this.field1676[0][arg4 + arg8][arg2 + arg9] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg6 == 0) {
                    this.field1676[0][arg4 + arg8][arg2 + arg9] = -var13 * 8 << 2;
                    return;
                }
                this.field1676[arg6][arg4 + arg8][arg2 + arg9] = this.field1676[arg6 - 1][arg4 + arg8][arg2 + arg9] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg10) {
                    arg7.method70(-9059);
                } else {
                    this.field1665[arg6][arg4][arg9] = arg7.method81(true);
                    this.field1654[arg6][arg4][arg9] = (byte) ((var12 - 2) / 4);
                    this.field1660[arg6][arg4][arg9] = (byte) class453.method2846(3, arg3 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field1661 && !arg10) {
                    class690.field9676[arg6][arg4][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg10) {
                this.field1664[arg6][arg4][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Li;Li;Lr;B)V", line = 741)
    public final void method976(class37 arg0, class37 arg1, class167 arg2, byte arg3) {
        field1673++;
        if (class357.field5692 == null || class357.field5692.length != this.field1656) {
            class175.field2882 = new int[this.field1656];
            class357.field5692 = new int[this.field1656];
            class2.field14 = new int[this.field1656];
            class271.field4379 = new int[this.field1656];
            class636.field8945 = new int[this.field1656];
        }
        int[][] var5 = new int[this.field1657][this.field1656];
        int var6 = 0;
        if (arg3 <= 63) {
            this.method970(-40, null, -119);
        }
        while (var6 < this.field1670) {
            for (int var8 = 0; var8 < this.field1656; var8++) {
                class357.field5692[var8] = 0;
                class2.field14[var8] = 0;
                class636.field8945[var8] = 0;
                class175.field2882[var8] = 0;
                class271.field4379[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1657; var9++) {
                for (int var10 = 0; var10 < this.field1656; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field1657) {
                        int var20 = this.field1664[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class565 var21 = this.field1669.method16(var20 - 1, (byte) 109);
                            class357.field5692[var10] += var21.field8113;
                            class2.field14[var10] += var21.field8116;
                            class636.field8945[var10] += var21.field8114;
                            class175.field2882[var10] += var21.field8111;
                            var10002 = class271.field4379[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1664[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class565 var24 = this.field1669.method16(var23 - 1, (byte) 74);
                            class357.field5692[var10] -= var24.field8113;
                            class2.field14[var10] -= var24.field8116;
                            class636.field8945[var10] -= var24.field8114;
                            class175.field2882[var10] -= var24.field8111;
                            var10002 = class271.field4379[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1656; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1656 > var17) {
                            var11 += class357.field5692[var17];
                            var14 += class175.field2882[var17];
                            var15 += class271.field4379[var17];
                            var12 += class2.field14[var17];
                            var13 += class636.field8945[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class636.field8945[var18];
                            var11 -= class357.field5692[var18];
                            var15 -= class271.field4379[var18];
                            var12 -= class2.field14[var18];
                            var14 -= class175.field2882[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class294.method2059((byte) 116, var11 * 256 / var14, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class397.field6158) {
                this.method981(class587.field8346[var6], var6, var5, arg2, var6 == 0 ? arg0 : null, var6 == 0 ? arg1 : null, (byte) 70);
            } else {
                this.method974(class587.field8346[var6], var6 == 0 ? arg1 : null, var6, arg2, var5, var6 == 0 ? arg0 : null, -30698);
            }
            this.field1664[var6] = null;
            this.field1665[var6] = null;
            this.field1654[var6] = null;
            this.field1660[var6] = null;
            var6++;
        }
        if (!this.field1661) {
            if (class677.field9528 != 0) {
                class531.method3215();
            }
            if (class312.field4913) {
                class567.method3356();
            }
        }
        for (int var7 = 0; var7 < this.field1670; var7++) {
            class587.field8346[var7].method483();
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "([Lnc;ILr;[[[I)V", line = 923)
    public final void method977(class23[] arg0, int arg1, class167 arg2, int[][][] arg3) {
        if (arg1 != 15422) {
            this.method979(null, (byte) 87, -33, null, null, -91, null, null, null, -86, 101, null, -108, -104);
        }
        field1655++;
        if (!this.field1661) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1657; var6++) {
                    for (int var7 = 0; var7 < this.field1656; var7++) {
                        if ((class690.field9676[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class690.field9676[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method389(var6, var7, -4906);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field1670; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1661) {
                if (class312.field4913) {
                    var10 |= 0x2;
                }
                if (class71.field894) {
                    var11 |= 0x8;
                }
                if (class677.field9528 != 0) {
                    if (var9 == 0 | class134.field2202) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class312.field4913) {
                var11 |= 0x7;
            }
            if (!class439.field6691) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field1676[var9] : arg3[var9];
            class516.method3123(var9, arg2.method275(this.field1657, this.field1656, this.field1676[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "([Lnc;IILie;III)V", line = 1023)
    public final void method978(class23[] arg0, int arg1, int arg2, class6 arg3, int arg4, int arg5, int arg6) {
        field1677++;
        if (!this.field1661) {
            for (int var8 = 0; var8 < 4; var8++) {
                class23 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && this.field1657 > var12 && var13 >= 0 && this.field1656 > var13) {
                            var9.method382(true, var13, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg4 + arg5;
        int var15 = arg1 + arg2;
        for (int var16 = arg6; var16 < this.field1670; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method975(var15 + var18, 8, 0, 0, arg5 + var17, var14 + var17, var16, arg3, 0, arg1 + var18, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIZLkca;Ldp;)V", line = 2555)
    public class101(int arg0, int arg1, int arg2, boolean arg3, class74 arg4, class3 arg5) {
        this.field1670 = arg0;
        this.field1669 = arg5;
        this.field1661 = arg3;
        this.field1656 = arg2;
        this.field1675 = arg4;
        this.field1657 = arg1;
        this.field1664 = new byte[this.field1670][this.field1657][this.field1656];
        this.field1654 = new byte[this.field1670][this.field1657][this.field1656];
        this.field1668 = new byte[this.field1670][this.field1657 + 1][this.field1656 + 1];
        this.field1660 = new byte[this.field1670][this.field1657][this.field1656];
        this.field1665 = new byte[this.field1670][this.field1657][this.field1656];
        this.field1676 = new int[this.field1670][this.field1657 + 1][this.field1656 + 1];
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lr;BILega;[[BI[[B[Z[[BIILlj;II)V", line = 1102)
    private final void method979(class167 arg0, byte arg1, int arg2, class661 arg3, byte[][] arg4, int arg5, byte[][] arg6, boolean[] arg7, byte[][] arg8, int arg9, int arg10, class565 arg11, int arg12, int arg13) {
        if (arg1 != -10) {
            this.field1670 = -27;
        }
        field1666++;
        boolean[] var15 = arg3 != null && arg3.field9217 ? class157.field2686[arg2] : class405.field6253[arg2];
        if (arg12 > 0) {
            if (arg9 > 0) {
                int var16 = arg6[arg9 - 1][arg12 - 1] & 0xFF;
                if (var16 > 0) {
                    class661 var17 = this.field1675.method748(var16 - 1, (byte) 24);
                    if (var17.field9206 != -1 && var17.field9217) {
                        byte var18 = arg4[arg9 - 1][arg12 - 1];
                        int var19 = arg8[arg9 - 1][arg12 - 1] * 2 + 4 & 0x7;
                        int var20 = class635.method3692(arg1 + 111, arg0, var17);
                        if (class466.field6938[var18][var19]) {
                            class162.field2745[0] = var17.field9206;
                            class706.field9985[0] = var20;
                            class131.field2148[0] = var17.field9201;
                            class160.field2730[0] = var17.field9214;
                            class584.field8308[0] = var17.field9211;
                            class610.field8679[0] = 256;
                        }
                    }
                }
            }
            if (arg5 - 1 > arg9) {
                int var21 = arg6[arg9 + 1][arg12 - 1] & 0xFF;
                if (var21 > 0) {
                    class661 var22 = this.field1675.method748(var21 - 1, (byte) 24);
                    if (var22.field9206 != -1 && var22.field9217) {
                        byte var23 = arg4[arg9 + 1][arg12 - 1];
                        int var24 = (arg8[arg9 + 1][arg12 - 1] * 2) + 6 & 0x7;
                        int var25 = class635.method3692(90, arg0, var22);
                        if (class466.field6938[var23][var24]) {
                            class162.field2745[2] = var22.field9206;
                            class706.field9985[2] = var25;
                            class131.field2148[2] = var22.field9201;
                            class160.field2730[2] = var22.field9214;
                            class584.field8308[2] = var22.field9211;
                            class610.field8679[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg10 - 1) > arg12) {
            if (arg9 > 0) {
                int var26 = arg6[arg9 - 1][arg12 + 1] & 0xFF;
                if (var26 > 0) {
                    class661 var27 = this.field1675.method748(var26 - 1, (byte) 24);
                    if (var27.field9206 != -1 && var27.field9217) {
                        byte var28 = arg4[arg9 - 1][arg12 + 1];
                        int var29 = (arg8[arg9 - 1][arg12 + 1] * 2) + 2 & 0x7;
                        int var30 = class635.method3692(arg1 ^ 0xFFFFFFA9, arg0, var27);
                        if (class466.field6938[var28][var29]) {
                            class162.field2745[6] = var27.field9206;
                            class706.field9985[6] = var30;
                            class131.field2148[6] = var27.field9201;
                            class160.field2730[6] = var27.field9214;
                            class584.field8308[6] = var27.field9211;
                            class610.field8679[6] = 64;
                        }
                    }
                }
            }
            if (arg9 < (arg5 - 1)) {
                int var31 = arg6[arg9 + 1][arg12 + 1] & 0xFF;
                if (var31 > 0) {
                    class661 var32 = this.field1675.method748(var31 - 1, (byte) 24);
                    if (var32.field9206 != -1 && var32.field9217) {
                        byte var33 = arg4[arg9 + 1][arg12 + 1];
                        int var34 = arg8[arg9 + 1][arg12 + 1] * 2 & 0x7;
                        int var35 = class635.method3692(98, arg0, var32);
                        if (class466.field6938[var33][var34]) {
                            class162.field2745[4] = var32.field9206;
                            class706.field9985[4] = var35;
                            class131.field2148[4] = var32.field9201;
                            class160.field2730[4] = var32.field9214;
                            class584.field8308[4] = var32.field9211;
                            class610.field8679[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg12 > 0) {
            int var36 = arg6[arg9][arg12 - 1] & 0xFF;
            if (var36 > 0) {
                class661 var37 = this.field1675.method748(var36 - 1, (byte) 24);
                if (var37.field9206 != -1) {
                    byte var38 = arg4[arg9][arg12 - 1];
                    byte var39 = arg8[arg9][arg12 - 1];
                    if (var37.field9217) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class635.method3692(arg1 ^ 0xFFFFFF96, arg0, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class466.field6938[var38][var41] && var37.field9211 >= class584.field8308[var40]) {
                                class162.field2745[var40] = var37.field9206;
                                class706.field9985[var40] = var42;
                                class131.field2148[var40] = var37.field9201;
                                class160.field2730[var40] = var37.field9214;
                                if (class584.field8308[var40] == var37.field9211) {
                                    class610.field8679[var40] = class81.method769(class610.field8679[var40], 32);
                                } else {
                                    class610.field8679[var40] = 32;
                                }
                                class584.field8308[var40] = var37.field9211;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg13 & 0x3]) {
                            arg7[0] = class157.field2686[var38][class453.method2846(3, var39 + 2)];
                        }
                    } else if (!var15[arg13 & 0x3]) {
                        arg7[0] = class405.field6253[var38][class453.method2846(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg12 < arg10 - 1) {
            int var44 = arg6[arg9][arg12 + 1] & 0xFF;
            if (var44 > 0) {
                class661 var45 = this.field1675.method748(var44 - 1, (byte) 24);
                if (var45.field9206 != -1) {
                    byte var46 = arg4[arg9][arg12 + 1];
                    byte var47 = arg8[arg9][arg12 + 1];
                    if (var45.field9217) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class635.method3692(arg1 + 114, arg0, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class466.field6938[var46][var49] && var45.field9211 >= class584.field8308[var48]) {
                                class162.field2745[var48] = var45.field9206;
                                class706.field9985[var48] = var50;
                                class131.field2148[var48] = var45.field9201;
                                class160.field2730[var48] = var45.field9214;
                                if (class584.field8308[var48] == var45.field9211) {
                                    class610.field8679[var48] = class81.method769(class610.field8679[var48], 16);
                                } else {
                                    class610.field8679[var48] = 16;
                                }
                                class584.field8308[var48] = var45.field9211;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg13 + 2 & 0x3]) {
                            arg7[2] = class157.field2686[var46][class453.method2846(var47, 3)];
                        }
                    } else if (!var15[arg13 + 2 & 0x3]) {
                        arg7[2] = class405.field6253[var46][class453.method2846(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var52 = arg6[arg9 - 1][arg12] & 0xFF;
            if (var52 > 0) {
                class661 var53 = this.field1675.method748(var52 - 1, (byte) 24);
                if (var53.field9206 != -1) {
                    byte var54 = arg4[arg9 - 1][arg12];
                    byte var55 = arg8[arg9 - 1][arg12];
                    if (var53.field9217) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class635.method3692(118, arg0, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class466.field6938[var54][var57] && var53.field9211 >= class584.field8308[var56]) {
                                class162.field2745[var56] = var53.field9206;
                                class706.field9985[var56] = var58;
                                class131.field2148[var56] = var53.field9201;
                                class160.field2730[var56] = var53.field9214;
                                if (class584.field8308[var56] == var53.field9211) {
                                    class610.field8679[var56] = class81.method769(class610.field8679[var56], 8);
                                } else {
                                    class610.field8679[var56] = 8;
                                }
                                class584.field8308[var56] = var53.field9211;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg13 + 3 & 0x3]) {
                            arg7[3] = class157.field2686[var54][class453.method2846(3, var55 + 1)];
                        }
                    } else if (!var15[arg13 + 3 & 0x3]) {
                        arg7[3] = class405.field6253[var54][class453.method2846(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg5 - 1 > arg9) {
            int var60 = arg6[arg9 + 1][arg12] & 0xFF;
            if (var60 > 0) {
                class661 var61 = this.field1675.method748(var60 - 1, (byte) 24);
                if (var61.field9206 != -1) {
                    byte var62 = arg4[arg9 + 1][arg12];
                    byte var63 = arg8[arg9 + 1][arg12];
                    if (var61.field9217) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class635.method3692(arg1 ^ 0xFFFFFFAC, arg0, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class466.field6938[var62][var65] && class584.field8308[var64] <= var61.field9211) {
                                class162.field2745[var64] = var61.field9206;
                                class706.field9985[var64] = var66;
                                class131.field2148[var64] = var61.field9201;
                                class160.field2730[var64] = var61.field9214;
                                if (class584.field8308[var64] == var61.field9211) {
                                    class610.field8679[var64] = class81.method769(class610.field8679[var64], 4);
                                } else {
                                    class610.field8679[var64] = 4;
                                }
                                class584.field8308[var64] = var61.field9211;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg13 + 1 & 0x3]) {
                            arg7[1] = class157.field2686[var62][class453.method2846(var63 + 3, 3)];
                        }
                    } else if (!var15[arg13 + 1 & 0x3]) {
                        arg7[1] = class405.field6253[var62][class453.method2846(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg3 == null) {
            return;
        }
        int var68 = class635.method3692(arg1 ^ 0xFFFFFF82, arg0, arg3);
        if (!arg3.field9217) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg13 * 2) & 0x7;
            if (class466.field6938[arg2][var69] && arg3.field9211 >= class584.field8308[var70]) {
                class162.field2745[var70] = arg3.field9206;
                class706.field9985[var70] = var68;
                class131.field2148[var70] = arg3.field9201;
                class160.field2730[var70] = arg3.field9214;
                if (class584.field8308[var70] == arg3.field9211) {
                    class610.field8679[var70] = class81.method769(class610.field8679[var70], 2);
                } else {
                    class610.field8679[var70] = 2;
                }
                class584.field8308[var70] = arg3.field9211;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIII)V", line = 1577)
    private final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1672++;
        int var7 = arg2;
        if (arg0 != -9153) {
            return;
        }
        while ((arg1 + arg2) > var7) {
            for (int var10 = arg3; var10 < (arg3 + arg4); var10++) {
                if (var10 >= 0 && this.field1657 > var10 && var7 >= 0 && this.field1656 > var7) {
                    this.field1676[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field1676[arg5 - 1][var10][var7] - 960;
                }
            }
            var7++;
        }
        if (arg3 > 0 && this.field1657 > arg3) {
            for (int var8 = arg2 + 1; var8 < (arg2 + arg1); var8++) {
                if (var8 >= 0 && var8 < this.field1656) {
                    this.field1676[arg5][arg3][var8] = this.field1676[arg5][arg3 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && this.field1656 > arg2) {
            for (int var9 = arg3 + 1; var9 < arg3 + arg4; var9++) {
                if (var9 >= 0 && this.field1657 > var9) {
                    this.field1676[arg5][var9][arg2] = this.field1676[arg5][var9][arg2 - 1];
                }
            }
        }
        if (arg3 < 0 || arg2 < 0 || arg3 >= this.field1657 || arg2 >= this.field1656) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 > 0 && this.field1676[arg5][arg3 - 1][arg2] != 0) {
                this.field1676[arg5][arg3][arg2] = this.field1676[arg5][arg3 - 1][arg2];
                return;
            }
            if (arg2 > 0 && this.field1676[arg5][arg3][arg2 - 1] != 0) {
                this.field1676[arg5][arg3][arg2] = this.field1676[arg5][arg3][arg2 - 1];
                return;
            }
            if (arg3 > 0 && arg2 > 0 && this.field1676[arg5][arg3 - 1][arg2 - 1] != 0) {
                this.field1676[arg5][arg3][arg2] = this.field1676[arg5][arg3 - 1][arg2 - 1];
                return;
            }
        } else if (arg3 <= 0 || this.field1676[arg5 - 1][arg3 - 1][arg2] == this.field1676[arg5][arg3 - 1][arg2]) {
            if (arg2 > 0 && this.field1676[arg5 - 1][arg3][arg2 - 1] != this.field1676[arg5][arg3][arg2 - 1]) {
                this.field1676[arg5][arg3][arg2] = this.field1676[arg5][arg3][arg2 - 1];
                return;
            }
            if (arg3 > 0 && arg2 > 0 && this.field1676[arg5][arg3 - 1][arg2 - 1] != this.field1676[arg5 - 1][arg3 - 1][arg2 - 1]) {
                this.field1676[arg5][arg3][arg2] = this.field1676[arg5][arg3 - 1][arg2 - 1];
                return;
            }
            return;
        } else {
            this.field1676[arg5][arg3][arg2] = this.field1676[arg5][arg3 - 1][arg2];
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Li;I[[ILr;Li;Li;B)V", line = 1682)
    private final void method981(class37 arg0, int arg1, int[][] arg2, class167 arg3, class37 arg4, class37 arg5, byte arg6) {
        field1658++;
        byte[][] var8 = this.field1654[arg1];
        byte[][] var9 = this.field1660[arg1];
        byte[][] var10 = this.field1664[arg1];
        byte[][] var11 = this.field1665[arg1];
        for (int var12 = 0; var12 < this.field1657; var12++) {
            int var13 = var12 >= (this.field1657 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field1656; var14++) {
                int var15 = var14 < this.field1656 - 1 ? var14 + 1 : var14;
                if (class401.field6188 == -1 || class612.method3563(-127, var14, class401.field6188, arg1, var12)) {
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
                        class661 var26 = var21 == 0 ? null : this.field1675.method748(var21 - 1, (byte) 24);
                        class565 var27 = var22 == 0 ? null : this.field1669.method16(var22 - 1, (byte) -98);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class661 var28 = var26;
                        if (var26 != null) {
                            if (var26.field9206 == -1 && var26.field9210 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field9217;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field1657 && this.field1656 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var35 = 0;
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
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
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method479(var14, var12, -89) - arg0.method479(var15, var13, arg6 - 170);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method479(var14, var13, arg6 ^ 0xFFFFFFE5) - arg0.method479(var15, var12, -122);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class584.field8308[var39] = -1;
                            class610.field8679[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field9217 ? class157.field2686[var19] : class405.field6253[var19];
                        this.method979(arg3, (byte) -10, var19, var26, var8, this.field1657, var11, var18, var9, var12, this.field1656, var27, var14, var20);
                        boolean var41 = var26 != null && var26.field9210 != var26.field9206;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class584.field8308[var42] >= 0 && class706.field9985[var42] != class162.field2745[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class155.method1287(var18[1], class453.method2846(class610.field8679[4], class610.field8679[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class155.method1287(var18[3], class453.method2846(class610.field8679[6], class610.field8679[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class155.method1287(var18[0], class453.method2846(class610.field8679[0], class610.field8679[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class155.method1287(var18[2], class453.method2846(class610.field8679[4], class610.field8679[6]) == 0);
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
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class632.field8889[var19];
                            var46 = var27 == null ? 0 : class541.field7895[var19];
                            var47 = class532.field7751[var19];
                            var48 = class160.field2733[var19];
                            var49 = class343.field5542[var19];
                        } else if (var17) {
                            var44 = class566.field8126[var19];
                            var45 = var26 == null ? 0 : class31.field458[var19];
                            var46 = var27 == null ? 0 : class71.field900[var19];
                            var47 = class53.field709[var19];
                            var48 = field1671[var19];
                            var49 = class523.field7608[var19];
                        } else {
                            var44 = class663.field9230[var19];
                            var47 = class35.field505[var19];
                            var45 = var26 == null ? 0 : class170.field2864[var19];
                            var49 = class423.field6440[var19];
                            var46 = var27 == null ? 0 : class194.field3215[var19];
                            var48 = class703.field9899[var19];
                        }
                        int var50 = var45 + var46;
                        if (var50 <= 0) {
                            class469.method2912(arg1, var12, var14);
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
                            int[] var60 = arg5 == null ? null : new int[var53];
                            int[] var61 = arg5 == null && arg4 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field9214;
                                var62 = var26.field9206;
                                var63 = var26.field9201;
                                int var65 = class635.method3692(104, arg3, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 1;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 1;
                                        class154.field2624[4] = var48[var51];
                                        var68 = 6;
                                        class154.field2624[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 5;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 5;
                                        class154.field2624[4] = var48[var51];
                                        var68 = 6;
                                        class154.field2624[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 3;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 3;
                                        class154.field2624[4] = var48[var51];
                                        class154.field2624[5] = var47[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 7;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 7;
                                        class154.field2624[4] = var48[var51];
                                        class154.field2624[5] = var47[var51];
                                        var68 = 6;
                                    } else {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = var48[var51];
                                        var68 = 3;
                                        class154.field2624[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class154.field2624[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field1683[var70];
                                        int var73 = this.field1663[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 512 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class466.field6938[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg5.method477(-1, var77, var76) - arg0.method477(-1, var77, var76);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class466.field6938[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg0.method477(-1, var79, var78) - arg5.method477(arg6 - 71, var79, var78);
                                            } else if (arg4 != null && !class273.field4401[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg4.method477(class357.method2397(arg6, -71), var81, var80) - arg0.method477(-1, var81, var80);
                                            }
                                        }
                                        if (var70 < 8 && var26.field9211 < class584.field8308[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class706.field9985[var71];
                                            }
                                            var59[var52] = class160.field2730[var71];
                                            var58[var52] = class131.field2148[var71];
                                            var57[var52] = class162.field2745[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field9201;
                                            var59[var52] = var26.field9214;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1661 && arg1 == 0) {
                                    class326.method2194(var12, var14, var26.field9215, var26.field9219 * 8, var26.field9207);
                                }
                                if (var19 != 12 && var26.field9206 != -1 && var26.field9209) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class632.field8889[var19];
                            } else if (var17) {
                                var51 += class31.field458[var19];
                            } else {
                                var51 += class170.field2864[var19];
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
                                class565 var82 = this.field1669.method16(var22 - 1, (byte) 85);
                                class565 var83 = this.field1669.method16(var23 - 1, (byte) 68);
                                class565 var84 = this.field1669.method16(var24 - 1, (byte) -110);
                                class565 var85 = this.field1669.method16(var25 - 1, (byte) -107);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 1;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 1;
                                        class154.field2624[4] = var48[var51];
                                        var88 = 6;
                                        class154.field2624[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 5;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 5;
                                        class154.field2624[4] = var48[var51];
                                        class154.field2624[5] = var47[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 3;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 3;
                                        class154.field2624[4] = var48[var51];
                                        class154.field2624[5] = var47[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = 7;
                                        class154.field2624[2] = var47[var51];
                                        class154.field2624[3] = 7;
                                        class154.field2624[4] = var48[var51];
                                        class154.field2624[5] = var47[var51];
                                        var88 = 6;
                                    } else {
                                        class154.field2624[0] = var49[var51];
                                        class154.field2624[1] = var48[var51];
                                        var88 = 3;
                                        class154.field2624[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class154.field2624[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field1683[var90];
                                        int var93 = this.field1663[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = 512 - var92;
                                            var94 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class466.field6938[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg5.method477(arg6 - 71, var97, var96) - arg0.method477(-1, var97, var96);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class466.field6938[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg0.method477(-1, var99, var98) - arg5.method477(-1, var99, var98);
                                            } else if (arg4 != null && !class273.field4401[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg4.method477(-1, var101, var100) - arg0.method477(-1, var101, var100);
                                            }
                                        }
                                        if (var90 < 8 && class584.field8308[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class706.field9985[var91];
                                            }
                                            var59[var52] = class160.field2730[var91];
                                            var58[var52] = class131.field2148[var91];
                                            var57[var52] = class162.field2745[var91];
                                        } else {
                                            if (var17 && class466.field6938[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var82.field8106;
                                                var59[var52] = var82.field8120;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var83.field8106;
                                                var59[var52] = var83.field8120;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var84.field8106;
                                                var59[var52] = var84.field8120;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var85.field8106;
                                                var59[var52] = var85.field8120;
                                            } else {
                                                if (var94 < 256) {
                                                    if (var95 < 256) {
                                                        var58[var52] = var82.field8106;
                                                        var59[var52] = var82.field8120;
                                                    } else {
                                                        var58[var52] = var83.field8106;
                                                        var59[var52] = var83.field8120;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var85.field8106;
                                                    var59[var52] = var85.field8120;
                                                } else {
                                                    var58[var52] = var84.field8106;
                                                    var59[var52] = var84.field8120;
                                                }
                                                int var102 = class332.method2265(var94 << 7 >> 9, arg2[var13][var14], arg2[var12][var14], true);
                                                int var103 = class332.method2265(var94 << 7 >> 9, arg2[var13][var15], arg2[var12][var15], true);
                                                var57[var52] = class332.method2265(var95 << 7 >> 9, var103, var102, true);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field8108) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg0.method479(var14, var12, 69);
                            int var105 = arg0.method479(var14, var13, 58);
                            int var106 = arg0.method479(var15, var13, -102);
                            int var107 = arg0.method479(var15, var12, -126);
                            boolean var108 = class437.method2774(true, var12, var14);
                            if (var108 && arg1 > 1 || !var108 && arg1 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field8109) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field9213) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1668[arg1][var12][var14] = (byte) class81.method769(this.field1668[arg1][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field1661) {
                                var110 = class389.method2526(var12, var14);
                                var111 = class379.method2497(var12, var14);
                                var112 = class441.method2786(var12, var14);
                            }
                            arg0.method484(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class469.method2912(arg1, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg6 != 70) {
            this.method979(null, (byte) -91, 83, null, null, -61, null, null, null, 48, 20, null, 33, 72);
        }
    }
}
