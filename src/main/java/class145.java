import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class145 {

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[I")
    private int[] field1735 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    private int[] field1733 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Lpe;")
    private class658 field1737;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lsl;")
    private class92 field1731;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Z")
    public boolean field1740;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "[[[B")
    private byte[][][] field1749;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[[[B")
    public byte[][][] field1724;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[[[B")
    private byte[][][] field1732;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[[[B")
    private byte[][][] field1727;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "[[[I")
    public int[][][] field1742;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[[[B")
    private byte[][][] field1739;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1722 = new String[100];

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1725 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "[[[B")
    public byte[][][] field1747;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII[Lrl;IIILtn;I)V")
    public final void method893(int arg0, int arg1, int arg2, int arg3, class685[] arg4, int arg5, int arg6, int arg7, class179 arg8, int arg9) {
        field1745++;
        int var11 = (arg0 & 0x7) * 8;
        int var12 = (arg7 & 0x7) * 8;
        if (!this.field1740) {
            class685 var13 = arg4[arg6];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg9 + class576.method3226(arg2, var15 & 0x7, var14 & 0x7, (byte) 35);
                    int var17 = class665.method3602(var14 & 0x7, arg2, var15 & 0x7, 3) + arg3;
                    if (var16 > 0 && this.field1741 - 1 > var16 && var17 > 0 && (this.field1734 - 1) > var17) {
                        var13.method3803(var16, var17, true);
                    }
                }
            }
        }
        int var18 = (arg0 & 0xFFFFFFF8) << 3;
        if (arg5 != 22270) {
            this.method901(59, null, -118);
        }
        int var19 = (arg7 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1743; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var23 >= var11 && var23 <= (var11 + 8) && var12 <= var24 && var24 <= var12 + 8) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg2 == 0) {
                                var25 = var23 - (var11 - arg9);
                                var26 = var24 + arg3 - var12;
                            } else if (arg2 == 1) {
                                var25 = arg9 - (var12 - var24);
                                var26 = -var23 - (-var11 - arg3 - 8);
                            } else if (arg2 == 2) {
                                var26 = arg3 + var12 + 8 - var24;
                                var25 = var11 + arg9 + 8 - var23;
                            } else {
                                var26 = var23 + arg3 - var11;
                                var25 = arg9 + var12 - (var24 - 8);
                            }
                            this.method894(arg6, 0, var19 + var24, -115, true, 0, arg8, var25, var26, var18 + var23, 0);
                        } else {
                            var25 = class576.method3226(arg2, var24 & 0x7, var23 & 0x7, (byte) 35) + arg9;
                            var26 = class665.method3602(var23 & 0x7, arg2, var24 & 0x7, arg5 ^ 0x56FD) + arg3;
                            this.method894(arg6, var21, var19 + var24, arg5 ^ 0xFFFFA97D, false, arg2, arg8, var25, var26, var18 + var23, var20);
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
                                if (arg2 == 0) {
                                    var31 = -var12 - (-var30 - arg3);
                                    var32 = var29 + arg9 - var11;
                                } else if (arg2 == 1) {
                                    var31 = arg3 - (-var11 - 8) - var29;
                                    var32 = arg9 + var30 - var12;
                                } else if (arg2 == 2) {
                                    var32 = var11 + arg9 - (var29 - 8);
                                    var31 = var12 + arg3 + 8 - var30;
                                } else {
                                    var32 = var12 + 8 - (var30 - arg9);
                                    var31 = arg3 - (var11 - var29);
                                }
                                if (var32 >= 0 && var32 < this.field1741 && var31 >= 0 && var31 < this.field1734) {
                                    this.field1742[arg6][var32][var31] = this.field1742[arg6][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method894(0, 0, 0, -107, false, 0, arg8, -1, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIZILtn;IIII)V")
    private final void method894(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class179 arg6, int arg7, int arg8, int arg9, int arg10) {
        field1723++;
        if (arg5 == 1) {
            arg1 = 1;
        } else if (arg5 == 2) {
            arg10 = 1;
            arg1 = 1;
        } else if (arg5 == 3) {
            arg10 = 1;
        }
        if (arg3 > -102) {
            this.field1732 = null;
        }
        if (arg7 < 0 || this.field1741 <= arg7 || arg8 < 0 || arg8 >= this.field1734) {
            while (true) {
                int var14 = arg6.method1094(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method1094(255);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method1094(255);
                }
            }
        }
        if (!this.field1740 && !arg4) {
            class215.field2728[arg0][arg7][arg8] = 0;
        }
        while (true) {
            int var12 = arg6.method1094(255);
            if (var12 == 0) {
                if (this.field1740) {
                    this.field1742[0][arg7 + arg10][arg1 + arg8] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field1742[0][arg7 + arg10][arg8 + arg1] = -class470.method2766(arg9 + 932731, (byte) 48, arg2 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field1742[arg0][arg7 + arg10][arg8 + arg1] = this.field1742[arg0 - 1][arg7 + arg10][arg1 + arg8] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method1094(255);
                if (this.field1740) {
                    this.field1742[0][arg7 + arg10][arg1 + arg8] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg0 == 0) {
                    this.field1742[0][arg7 + arg10][arg8 + arg1] = -var13 * 8 << 2;
                    return;
                }
                this.field1742[arg0][arg7 + arg10][arg8 + arg1] = this.field1742[arg0 - 1][arg7 + arg10][arg1 + arg8] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg4) {
                    arg6.method1094(255);
                } else {
                    this.field1739[arg0][arg7][arg8] = arg6.method1133(8);
                    this.field1732[arg0][arg7][arg8] = (byte) ((var12 - 2) / 4);
                    this.field1749[arg0][arg7][arg8] = (byte) class272.method1629(var12 + arg5 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field1740 && !arg4) {
                    class215.field2728[arg0][arg7][arg8] = (byte) (var12 - 49);
                }
            } else if (!arg4) {
                this.field1727[arg0][arg7][arg8] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V")
    public final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1736++;
        for (int var7 = arg1; var7 < (arg1 + arg0); var7++) {
            for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && var10 < this.field1741 && var7 >= 0 && this.field1734 > var7) {
                    this.field1742[arg4][var10][var7] = arg4 > 0 ? this.field1742[arg4 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (arg2 != 25200) {
            this.method900(null, -17, null, null, (byte) -39, null, null);
        }
        if (arg3 > 0 && arg3 < this.field1741) {
            for (int var8 = arg1 + 1; var8 < (arg0 + arg1); var8++) {
                if (var8 >= 0 && var8 < this.field1734) {
                    this.field1742[arg4][arg3][var8] = this.field1742[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field1734) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < this.field1741) {
                    this.field1742[arg4][var9][arg1] = this.field1742[arg4][var9][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || this.field1741 <= arg3 || this.field1734 <= arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 > 0 && this.field1742[arg4][arg3 - 1][arg1] != 0) {
                this.field1742[arg4][arg3][arg1] = this.field1742[arg4][arg3 - 1][arg1];
                return;
            }
            if (arg1 <= 0 || this.field1742[arg4][arg3][arg1 - 1] == 0) {
                if (arg3 > 0 && arg1 > 0 && this.field1742[arg4][arg3 - 1][arg1 - 1] != 0) {
                    this.field1742[arg4][arg3][arg1] = this.field1742[arg4][arg3 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field1742[arg4][arg3][arg1] = this.field1742[arg4][arg3][arg1 - 1];
        } else if (arg3 <= 0 || this.field1742[arg4][arg3 - 1][arg1] == this.field1742[arg4 - 1][arg3 - 1][arg1]) {
            if (arg1 > 0 && this.field1742[arg4 - 1][arg3][arg1 - 1] != this.field1742[arg4][arg3][arg1 - 1]) {
                this.field1742[arg4][arg3][arg1] = this.field1742[arg4][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && this.field1742[arg4][arg3 - 1][arg1 - 1] != this.field1742[arg4 - 1][arg3 - 1][arg1 - 1]) {
                this.field1742[arg4][arg3][arg1] = this.field1742[arg4][arg3 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field1742[arg4][arg3][arg1] = this.field1742[arg4][arg3 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIIII)V")
    public final void method896(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 47) {
            this.field1739 = null;
        }
        field1726++;
        for (int var6 = 0; var6 < this.field1743; var6++) {
            this.method895(arg1, arg4, arg0 + 25153, arg3, var6, arg2);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
    public static final int method897(int arg0) {
        if (arg0 == -64) {
            field1720++;
            return class728.field10189;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILha;Ls;Ls;Ls;[[I)V")
    private final void method898(int arg0, int arg1, class454 arg2, class402 arg3, class402 arg4, class402 arg5, int[][] arg6) {
        field1748++;
        for (int var8 = 0; var8 < this.field1741; var8++) {
            for (int var9 = 0; var9 < this.field1734; var9++) {
                if (class625.field8713 == -1 || class613.method3363(-17342, var8, class625.field8713, arg1, var9)) {
                    byte var10 = this.field1732[arg1][var8][var9];
                    byte var11 = this.field1749[arg1][var8][var9];
                    int var12 = this.field1739[arg1][var8][var9] & 0xFF;
                    int var13 = this.field1727[arg1][var8][var9] & 0xFF;
                    class424 var14 = var12 == 0 ? null : this.field1737.method3570(4, var12 - 1);
                    class15 var15 = var13 == 0 ? null : this.field1731.method634(0, var13 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class424 var16 = var14;
                    if (var14 != null && var14.field6043 == -1 && var14.field6036 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class437.field6134[var10];
                        int var18 = class524.field7409[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field6047;
                        int var23 = var15 == null ? -1 : var15.field214;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field6036 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class464.field6717[var10][var21];
                                var25[var20] = class593.field8252[var10][var21];
                                var26[var20] = class384.field5346[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field6030;
                                var27[var20] = var14.field6043;
                                if (var30 != null) {
                                    var30[var20] = var14.field6036;
                                }
                                var20++;
                                var21++;
                            }
                            if (!this.field1740 && arg1 == 0) {
                                class273.method1639(var8, var9, var14.field6029, var14.field6033 * 8, var14.field6034);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class464.field6717[var10][var21];
                                var25[var20] = class593.field8252[var10][var21];
                                var26[var20] = class384.field5346[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field221;
                                var27[var20] = arg6[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field1735.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg5 == null ? null : new int[var33];
                        int[] var37 = arg5 == null && arg4 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field1735[var38];
                            int var49 = this.field1733[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class273.field3457[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg5.method2382((byte) 19, var53, var52) - arg3.method2382((byte) 19, var53, var52);
                            }
                            if (var37 != null) {
                                if (arg5 != null && !class273.field3457[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg3.method2382((byte) 19, var55, var54) - arg5.method2382((byte) 19, var55, var54);
                                } else if (arg4 != null && !class187.field2455[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg4.method2382((byte) 19, var57, var56) - arg3.method2382((byte) 19, var57, var56);
                                }
                            }
                        }
                        int var39 = arg3.method2381(-119, var8, var9);
                        int var40 = arg3.method2381(-127, var8 + 1, var9);
                        int var41 = arg3.method2381(arg0 + 12041, var8 + 1, var9 + 1);
                        int var42 = arg3.method2381(-117, var8, var9 + 1);
                        boolean var43 = class739.method4140((byte) 74, var9, var8);
                        if (var43 && arg1 > 1 || !var43 && arg1 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field210) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field6035) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field1724[arg1][var8][var9] = (byte) class216.method1308(this.field1724[arg1][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field1740) {
                            var45 = class653.method3525(var8, var9);
                            var46 = class165.method1017(var8, var9);
                            var47 = class367.method2256(var8, var9);
                        }
                        arg3.method552(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class464.method2746(arg1, var8, var9);
                    }
                }
            }
        }
        if (arg0 != -12157) {
            this.method893(58, -82, 64, -71, null, -123, -80, 37, null, 85);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method899(byte arg0) {
        if (arg0 >= -41) {
            field1722 = null;
        }
        field1722 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([[IILs;Lha;BLs;Ls;)V")
    private final void method900(int[][] arg0, int arg1, class402 arg2, class454 arg3, byte arg4, class402 arg5, class402 arg6) {
        field1730++;
        byte[][] var8 = this.field1732[arg1];
        byte[][] var9 = this.field1749[arg1];
        byte[][] var10 = this.field1727[arg1];
        byte[][] var11 = this.field1739[arg1];
        if (arg4 != 101) {
            return;
        }
        for (int var12 = 0; var12 < this.field1741; var12++) {
            int var13 = (this.field1741 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field1734; var14++) {
                int var15 = (this.field1734 - 1) > var14 ? var14 + 1 : var14;
                if (class625.field8713 == -1 || class613.method3363(arg4 - 17443, var12, class625.field8713, arg1, var14)) {
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
                        class424 var26 = var21 == 0 ? null : this.field1737.method3570(4, var21 - 1);
                        class15 var27 = var22 == 0 ? null : this.field1731.method634(0, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class424 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6043 == -1 && var26.field6036 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6039;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field1741 && var14 < this.field1734) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method2381(arg4 ^ 0xFFFFFFEE, var12, var14) - arg5.method2381(arg4 - 199, var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method2381(-92, var13, var14) - arg5.method2381(-95, var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class29.field474[var39] = -1;
                            class51.field761[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6039 ? class505.field7114[var19] : class519.field7310[var19];
                        this.method905(var20, var27, var11, this.field1734, var9, var14, arg3, var26, var18, 18390, var8, this.field1741, var19, var12);
                        boolean var41 = var26 != null && var26.field6043 != var26.field6036;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class29.field474[var42] >= 0 && class454.field6365[var42] != class2.field11[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class423.method2519(var18[1], class272.method1629(class51.field761[2], class51.field761[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class423.method2519(var18[3], class272.method1629(class51.field761[6], class51.field761[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class423.method2519(var18[0], class272.method1629(class51.field761[2], class51.field761[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class423.method2519(var18[2], class272.method1629(class51.field761[6], class51.field761[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = class593.field8252[var19];
                            var46 = var26 == null ? 0 : class524.field7409[var19];
                            var47 = class464.field6717[var19];
                            var48 = class384.field5346[var19];
                            var49 = var27 == null ? 0 : class437.field6134[var19];
                        } else if (var17) {
                            var48 = class309.field3953[var19];
                            var46 = var26 == null ? 0 : class131.field1566[var19];
                            var49 = var27 == null ? 0 : class424.field6045[var19];
                            var44 = class350.field4545[var19];
                            var47 = class331.field4206[var19];
                            var45 = class680.field9228[var19];
                        } else {
                            var46 = var26 == null ? 0 : class575.field8023[var19];
                            var45 = class453.field6358[var19];
                            var48 = class252.field3192[var19];
                            var47 = class378.field5296[var19];
                            var44 = class737.field10325[var19];
                            var49 = var27 == null ? 0 : class586.field8193[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class464.method2746(arg1, var12, var14);
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
                            int[] var61 = arg2 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field6043;
                                var63 = var26.field6047;
                                var64 = var26.field6030;
                                int var65 = class485.method2828(arg3, (byte) 9, var26);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 1;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 1;
                                        class13.field181[4] = var45[var51];
                                        var99 = 6;
                                        class13.field181[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 5;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 5;
                                        class13.field181[4] = var45[var51];
                                        var99 = 6;
                                        class13.field181[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 3;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 3;
                                        class13.field181[4] = var45[var51];
                                        class13.field181[5] = var48[var51];
                                        var99 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 7;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 7;
                                        class13.field181[4] = var45[var51];
                                        var99 = 6;
                                        class13.field181[5] = var48[var51];
                                    } else {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = var45[var51];
                                        var99 = 3;
                                        class13.field181[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class13.field181[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field1735[var101];
                                        int var104 = this.field1733[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var106 = 512 - var103;
                                            var105 = var104;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var103;
                                            var106 = 512 - var104;
                                        } else if (var20 == 3) {
                                            var105 = 512 - var104;
                                            var106 = var103;
                                        } else {
                                            var106 = var104;
                                            var105 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var106;
                                        if (var60 != null && class273.field3457[var19][var101]) {
                                            int var107 = (var12 << 9) + var105;
                                            int var108 = (var14 << 9) + var106;
                                            var60[var52] = arg2.method2382((byte) 19, var108, var107) - arg5.method2382((byte) 19, var108, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class273.field3457[var19][var101]) {
                                                int var109 = (var12 << 9) + var105;
                                                int var110 = (var14 << 9) + var106;
                                                var61[var52] = arg5.method2382((byte) 19, var110, var109) - arg2.method2382((byte) 19, var110, var109);
                                            } else if (arg6 != null && !class187.field2455[var19][var101]) {
                                                int var111 = (var12 << 9) + var105;
                                                int var112 = (var14 << 9) + var106;
                                                var61[var52] = arg6.method2382((byte) 19, var112, var111) - arg5.method2382((byte) 19, var112, var111);
                                            }
                                        }
                                        if (var101 < 8 && class29.field474[var102] > var26.field6031) {
                                            if (var54 != null) {
                                                var54[var52] = class2.field11[var102];
                                            }
                                            var59[var52] = class674.field9174[var102];
                                            var58[var52] = class100.field1232[var102];
                                            var57[var52] = class454.field6365[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field6047;
                                            var59[var52] = var26.field6030;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1740 && arg1 == 0) {
                                    class273.method1639(var12, var14, var26.field6029, var26.field6033 * 8, var26.field6034);
                                }
                                if (var19 != 12 && var26.field6043 != -1 && var26.field6040) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class524.field7409[var19];
                            } else if (var17) {
                                var51 += class131.field1566[var19];
                            } else {
                                var51 += class575.field8023[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class15 var67 = this.field1731.method634(arg4 - 101, var22 + -1);
                                class15 var68 = this.field1731.method634(0, var23 - 1);
                                class15 var69 = this.field1731.method634(0, var24 - 1);
                                class15 var70 = this.field1731.method634(0, var25 - 1);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 1;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 1;
                                        class13.field181[4] = var45[var51];
                                        class13.field181[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 5;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 5;
                                        class13.field181[4] = var45[var51];
                                        var73 = 6;
                                        class13.field181[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 3;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 3;
                                        class13.field181[4] = var45[var51];
                                        var73 = 6;
                                        class13.field181[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = 7;
                                        class13.field181[2] = var48[var51];
                                        class13.field181[3] = 7;
                                        class13.field181[4] = var45[var51];
                                        var73 = 6;
                                        class13.field181[5] = var48[var51];
                                    } else {
                                        class13.field181[0] = var47[var51];
                                        class13.field181[1] = var45[var51];
                                        var73 = 3;
                                        class13.field181[2] = var48[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class13.field181[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field1735[var75];
                                        int var78 = this.field1733[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 512 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 512 - var78;
                                            var80 = 512 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 512 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class273.field3457[var19][var75]) {
                                            int var81 = (var12 << 9) + var80;
                                            int var82 = (var14 << 9) + var79;
                                            var60[var52] = arg2.method2382((byte) 19, var82, var81) - arg5.method2382((byte) 19, var82, var81);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class273.field3457[var19][var75]) {
                                                int var83 = (var12 << 9) + var80;
                                                int var84 = (var14 << 9) + var79;
                                                var61[var52] = arg5.method2382((byte) 19, var84, var83) - arg2.method2382((byte) 19, var84, var83);
                                            } else if (arg6 != null && !class187.field2455[var19][var75]) {
                                                int var85 = (var12 << 9) + var80;
                                                int var86 = (var14 << 9) + var79;
                                                var61[var52] = arg6.method2382((byte) 19, var86, var85) - arg5.method2382((byte) 19, var86, var85);
                                            }
                                        }
                                        if (var75 < 8 && class29.field474[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class2.field11[var76];
                                            }
                                            var59[var52] = class674.field9174[var76];
                                            var58[var52] = class100.field1232[var76];
                                            var57[var52] = class454.field6365[var76];
                                        } else {
                                            if (var17 && class273.field3457[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var67.field214;
                                                var59[var52] = var67.field221;
                                            } else if (var80 == 0 && var79 == 512) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var68.field214;
                                                var59[var52] = var68.field221;
                                            } else if (var80 == 512 && var79 == 512) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var69.field214;
                                                var59[var52] = var69.field221;
                                            } else if (var80 == 512 && var79 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var70.field214;
                                                var59[var52] = var70.field221;
                                            } else {
                                                if (var80 >= 256) {
                                                    if (var79 < 256) {
                                                        var58[var52] = var70.field214;
                                                        var59[var52] = var70.field221;
                                                    } else {
                                                        var58[var52] = var69.field214;
                                                        var59[var52] = var69.field221;
                                                    }
                                                } else if (var79 < 256) {
                                                    var58[var52] = var67.field214;
                                                    var59[var52] = var67.field221;
                                                } else {
                                                    var58[var52] = var68.field214;
                                                    var59[var52] = var68.field221;
                                                }
                                                int var87 = class304.method1788(arg0[var12][var14], (byte) -127, arg0[var13][var14], var80 << 7 >> 9);
                                                int var88 = class304.method1788(arg0[var12][var15], (byte) -127, arg0[var13][var15], var80 << 7 >> 9);
                                                var57[var52] = class304.method1788(var87, (byte) -127, var88, var79 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field216) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg5.method2381(arg4 - 208, var12, var14);
                            int var90 = arg5.method2381(arg4 - 202, var13, var14);
                            int var91 = arg5.method2381(-101, var13, var15);
                            int var92 = arg5.method2381(arg4 - 195, var12, var15);
                            boolean var93 = class739.method4140((byte) 69, var14, var12);
                            if (var93 && arg1 > 1 || !var93 && arg1 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field210) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field6035) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field1724[arg1][var12][var14] = (byte) class216.method1308(this.field1724[arg1][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field1740) {
                                var95 = class653.method3525(var12, var14);
                                var96 = class165.method1017(var12, var14);
                                var97 = class367.method2256(var12, var14);
                            }
                            arg5.method545(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class464.method2746(arg1, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[[II)V")
    public final void method901(int arg0, int[][] arg1, int arg2) {
        field1729++;
        int[][] var4 = this.field1742[arg2];
        if (arg0 != 1) {
            field1725 = -57;
        }
        for (int var5 = 0; var5 < (this.field1741 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field1734 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([[[ILha;B[Lrl;)V")
    public final void method902(int[][][] arg0, class454 arg1, byte arg2, class685[] arg3) {
        field1746++;
        if (arg2 != 15) {
            method897(-122);
        }
        if (!this.field1740) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1741; var6++) {
                    for (int var7 = 0; var7 < this.field1734; var7++) {
                        if ((class215.field2728[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class215.field2728[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method3804(var7, arg2 ^ 0xFFFFFF98, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field1743; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1740) {
                if (class627.field8743) {
                    var10 |= 0x2;
                }
                if (class512.field7222) {
                    var11 |= 0x8;
                }
                if (class131.field1567 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class561.field7842) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class627.field8743) {
                var11 |= 0x7;
            }
            if (!class681.field9286) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field1742[var9] : arg0[var9];
            class10.method46(var9, arg1.method101(this.field1741, this.field1734, this.field1742[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lha;Ls;Ls;I)V")
    public final void method903(class454 arg0, class402 arg1, class402 arg2, int arg3) {
        field1738++;
        int[][] var5 = new int[this.field1741][this.field1734];
        if (class494.field6998 == null || class494.field6998.length != this.field1734) {
            class494.field6998 = new int[this.field1734];
            class601.field8352 = new int[this.field1734];
            class111.field1372 = new int[this.field1734];
            class132.field1571 = new int[this.field1734];
            class447.field6292 = new int[this.field1734];
        }
        for (int var6 = 0; var6 < this.field1743; var6++) {
            for (int var9 = 0; var9 < this.field1734; var9++) {
                class494.field6998[var9] = 0;
                class111.field1372[var9] = 0;
                class447.field6292[var9] = 0;
                class132.field1571[var9] = 0;
                class601.field8352[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field1741; var10++) {
                for (int var11 = 0; var11 < this.field1734; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (var20 < this.field1741) {
                        int var21 = this.field1727[var6][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class15 var22 = this.field1731.method634(0, var21 - 1);
                            class494.field6998[var11] += var22.field207;
                            class111.field1372[var11] += var22.field213;
                            class447.field6292[var11] += var22.field204;
                            class132.field1571[var11] += var22.field203;
                            var10002 = class601.field8352[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field1727[var6][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class15 var25 = this.field1731.method634(0, var24 - 1);
                            class494.field6998[var11] -= var25.field207;
                            class111.field1372[var11] -= var25.field213;
                            class447.field6292[var11] -= var25.field204;
                            class132.field1571[var11] -= var25.field203;
                            var10002 = class601.field8352[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field1734; var17++) {
                        int var18 = var17 + 5;
                        if (this.field1734 > var18) {
                            var15 += class132.field1571[var18];
                            var12 += class494.field6998[var18];
                            var13 += class111.field1372[var18];
                            var16 += class601.field8352[var18];
                            var14 += class447.field6292[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var14 -= class447.field6292[var19];
                            var16 -= class601.field8352[var19];
                            var15 -= class132.field1571[var19];
                            var13 -= class111.field1372[var19];
                            var12 -= class494.field6998[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class714.method3962(var12 * 256 / var15, 2, var14 / var16, var13 / var16);
                        }
                    }
                }
            }
            if (class742.field10376) {
                this.method900(var5, var6, var6 == 0 ? arg2 : null, arg0, (byte) 101, class517.field7282[var6], var6 == 0 ? arg1 : null);
            } else {
                this.method898(-12157, var6, arg0, class517.field7282[var6], var6 == 0 ? arg1 : null, var6 == 0 ? arg2 : null, var5);
            }
            this.field1727[var6] = null;
            this.field1739[var6] = null;
            this.field1732[var6] = null;
            this.field1749[var6] = null;
        }
        if (!this.field1740) {
            if (class131.field1567 != 0) {
                class728.method4032();
            }
            if (class627.field8743) {
                class411.method2428();
            }
        }
        int var7 = 81 % ((-arg3 - 30) / 41);
        for (int var8 = 0; var8 < this.field1743; var8++) {
            class517.field7282[var8].method547();
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lrl;IIIILtn;Z)V")
    public final void method904(class685[] arg0, int arg1, int arg2, int arg3, int arg4, class179 arg5, boolean arg6) {
        field1728++;
        if (!this.field1740) {
            for (int var8 = 0; var8 < 4; var8++) {
                class685 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && var12 < this.field1741 && var13 >= 0 && var13 < this.field1734) {
                            var9.method3803(var12, var13, true);
                        }
                    }
                }
            }
        }
        int var14 = arg3 + arg4;
        int var15 = arg1 + arg2;
        int var16 = 0;
        if (!arg6) {
            return;
        }
        while (var16 < this.field1743) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method894(var16, 0, var15 + var18, -128, false, 0, arg5, arg4 + var17, arg1 + var18, var14 + var17, 0);
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIZLpe;Lsl;)V")
    public class145(int arg0, int arg1, int arg2, boolean arg3, class658 arg4, class92 arg5) {
        this.field1743 = arg0;
        this.field1737 = arg4;
        this.field1731 = arg5;
        this.field1741 = arg1;
        this.field1734 = arg2;
        this.field1740 = arg3;
        this.field1749 = new byte[this.field1743][this.field1741][this.field1734];
        this.field1724 = new byte[this.field1743][this.field1741 + 1][this.field1734 + 1];
        this.field1732 = new byte[this.field1743][this.field1741][this.field1734];
        this.field1727 = new byte[this.field1743][this.field1741][this.field1734];
        this.field1742 = new int[this.field1743][this.field1741 + 1][this.field1734 + 1];
        this.field1739 = new byte[this.field1743][this.field1741][this.field1734];
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILds;[[BI[[BILha;Lwm;[ZI[[BIII)V")
    private final void method905(int arg0, class15 arg1, byte[][] arg2, int arg3, byte[][] arg4, int arg5, class454 arg6, class424 arg7, boolean[] arg8, int arg9, byte[][] arg10, int arg11, int arg12, int arg13) {
        field1744++;
        boolean[] var15 = arg7 != null && arg7.field6039 ? class505.field7114[arg12] : class519.field7310[arg12];
        if (arg5 > 0) {
            if (arg13 > 0) {
                int var16 = arg2[arg13 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class424 var17 = this.field1737.method3570(4, var16 - 1);
                    if (var17.field6043 != -1 && var17.field6039) {
                        byte var18 = arg10[arg13 - 1][arg5 - 1];
                        int var19 = (arg4[arg13 - 1][arg5 - 1] * 2) + 4 & 0x7;
                        int var20 = class485.method2828(arg6, (byte) 9, var17);
                        if (class273.field3457[var18][var19]) {
                            class454.field6365[0] = var17.field6043;
                            class2.field11[0] = var20;
                            class100.field1232[0] = var17.field6047;
                            class674.field9174[0] = var17.field6030;
                            class29.field474[0] = var17.field6031;
                            class51.field761[0] = 256;
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg13) {
                int var21 = arg2[arg13 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class424 var22 = this.field1737.method3570(4, var21 - 1);
                    if (var22.field6043 != -1 && var22.field6039) {
                        byte var23 = arg10[arg13 + 1][arg5 - 1];
                        int var24 = arg4[arg13 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class485.method2828(arg6, (byte) 9, var22);
                        if (class273.field3457[var23][var24]) {
                            class454.field6365[2] = var22.field6043;
                            class2.field11[2] = var25;
                            class100.field1232[2] = var22.field6047;
                            class674.field9174[2] = var22.field6030;
                            class29.field474[2] = var22.field6031;
                            class51.field761[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg5 < (arg3 - 1)) {
            if (arg13 > 0) {
                int var26 = arg2[arg13 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class424 var27 = this.field1737.method3570(4, var26 - 1);
                    if (var27.field6043 != -1 && var27.field6039) {
                        byte var28 = arg10[arg13 - 1][arg5 + 1];
                        int var29 = arg4[arg13 - 1][arg5 + 1] * 2 + 2 & 0x7;
                        int var30 = class485.method2828(arg6, (byte) 9, var27);
                        if (class273.field3457[var28][var29]) {
                            class454.field6365[6] = var27.field6043;
                            class2.field11[6] = var30;
                            class100.field1232[6] = var27.field6047;
                            class674.field9174[6] = var27.field6030;
                            class29.field474[6] = var27.field6031;
                            class51.field761[6] = 64;
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg13) {
                int var31 = arg2[arg13 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class424 var32 = this.field1737.method3570(4, var31 - 1);
                    if (var32.field6043 != -1 && var32.field6039) {
                        byte var33 = arg10[arg13 + 1][arg5 + 1];
                        int var34 = arg4[arg13 + 1][arg5 + 1] * 2 & 0x7;
                        int var35 = class485.method2828(arg6, (byte) 9, var32);
                        if (class273.field3457[var33][var34]) {
                            class454.field6365[4] = var32.field6043;
                            class2.field11[4] = var35;
                            class100.field1232[4] = var32.field6047;
                            class674.field9174[4] = var32.field6030;
                            class29.field474[4] = var32.field6031;
                            class51.field761[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg2[arg13][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class424 var37 = this.field1737.method3570(arg9 - 18386, var36 + -1);
                if (var37.field6043 != -1) {
                    byte var38 = arg10[arg13][arg5 - 1];
                    byte var39 = arg4[arg13][arg5 - 1];
                    if (var37.field6039) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class485.method2828(arg6, (byte) 9, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class273.field3457[var38][var41] && class29.field474[var40] <= var37.field6031) {
                                class454.field6365[var40] = var37.field6043;
                                class2.field11[var40] = var42;
                                class100.field1232[var40] = var37.field6047;
                                class674.field9174[var40] = var37.field6030;
                                if (class29.field474[var40] == var37.field6031) {
                                    class51.field761[var40] = class216.method1308(class51.field761[var40], 32);
                                } else {
                                    class51.field761[var40] = 32;
                                }
                                class29.field474[var40] = var37.field6031;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg0 & 0x3]) {
                            arg8[0] = class505.field7114[var38][class272.method1629(var39 + 2, 3)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg8[0] = class519.field7310[var38][class272.method1629(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg3 - 1 > arg5) {
            int var44 = arg2[arg13][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class424 var45 = this.field1737.method3570(4, var44 - 1);
                if (var45.field6043 != -1) {
                    byte var46 = arg10[arg13][arg5 + 1];
                    byte var47 = arg4[arg13][arg5 + 1];
                    if (var45.field6039) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class485.method2828(arg6, (byte) 9, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class273.field3457[var46][var49] && var45.field6031 >= class29.field474[var48]) {
                                class454.field6365[var48] = var45.field6043;
                                class2.field11[var48] = var50;
                                class100.field1232[var48] = var45.field6047;
                                class674.field9174[var48] = var45.field6030;
                                if (class29.field474[var48] == var45.field6031) {
                                    class51.field761[var48] = class216.method1308(class51.field761[var48], 16);
                                } else {
                                    class51.field761[var48] = 16;
                                }
                                class29.field474[var48] = var45.field6031;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg8[2] = class505.field7114[var46][class272.method1629(var47, 3)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg8[2] = class519.field7310[var46][class272.method1629(3, var47)];
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var52 = arg2[arg13 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class424 var53 = this.field1737.method3570(4, var52 - 1);
                if (var53.field6043 != -1) {
                    byte var54 = arg10[arg13 - 1][arg5];
                    byte var55 = arg4[arg13 - 1][arg5];
                    if (var53.field6039) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class485.method2828(arg6, (byte) 9, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class273.field3457[var54][var57] && class29.field474[var56] <= var53.field6031) {
                                class454.field6365[var56] = var53.field6043;
                                class2.field11[var56] = var58;
                                class100.field1232[var56] = var53.field6047;
                                class674.field9174[var56] = var53.field6030;
                                if (class29.field474[var56] == var53.field6031) {
                                    class51.field761[var56] = class216.method1308(class51.field761[var56], 8);
                                } else {
                                    class51.field761[var56] = 8;
                                }
                                class29.field474[var56] = var53.field6031;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg8[3] = class505.field7114[var54][class272.method1629(var55 + 1, 3)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg8[3] = class519.field7310[var54][class272.method1629(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg9 != 18390) {
            return;
        }
        if (arg11 - 1 > arg13) {
            int var60 = arg2[arg13 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class424 var61 = this.field1737.method3570(arg9 - 18386, var60 + -1);
                if (var61.field6043 != -1) {
                    byte var62 = arg10[arg13 + 1][arg5];
                    byte var63 = arg4[arg13 + 1][arg5];
                    if (var61.field6039) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class485.method2828(arg6, (byte) 9, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class273.field3457[var62][var65] && var61.field6031 >= class29.field474[var64]) {
                                class454.field6365[var64] = var61.field6043;
                                class2.field11[var64] = var66;
                                class100.field1232[var64] = var61.field6047;
                                class674.field9174[var64] = var61.field6030;
                                if (class29.field474[var64] == var61.field6031) {
                                    class51.field761[var64] = class216.method1308(class51.field761[var64], 4);
                                } else {
                                    class51.field761[var64] = 4;
                                }
                                class29.field474[var64] = var61.field6031;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg8[1] = class505.field7114[var62][class272.method1629(var63 + 3, 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg8[1] = class519.field7310[var62][class272.method1629(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg7 == null) {
            return;
        }
        int var68 = class485.method2828(arg6, (byte) 9, arg7);
        if (!arg7.field6039) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg0 * 2) & 0x7;
            if (class273.field3457[arg12][var69] && class29.field474[var70] <= arg7.field6031) {
                class454.field6365[var70] = arg7.field6043;
                class2.field11[var70] = var68;
                class100.field1232[var70] = arg7.field6047;
                class674.field9174[var70] = arg7.field6030;
                if (class29.field474[var70] == arg7.field6031) {
                    class51.field761[var70] = class216.method1308(class51.field761[var70], 2);
                } else {
                    class51.field761[var70] = 2;
                }
                class29.field474[var70] = arg7.field6031;
            }
        }
        return;
    }
}
