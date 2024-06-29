import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class235 {

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
    private int[] field3525 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    private int[] field3519 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lip;")
    private class326 field3532;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lio;")
    private class118 field3526;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Z")
    public boolean field3522;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "[[[B")
    public byte[][][] field3535;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[[[B")
    private byte[][][] field3521;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[[[I")
    public int[][][] field3527;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[[[B")
    private byte[][][] field3523;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[[[B")
    private byte[][][] field3540;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "[[[B")
    private byte[][][] field3544;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lpu;")
    public static class179 field3541 = new class179(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "[[I")
    private static int[][] field3546 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field3548 = -1;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[[[B")
    public byte[][][] field3520;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
    private final void method1589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3529++;
        for (int var7 = arg3; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg0; var10 < arg0 + arg5; var10++) {
                if (var10 >= 0 && this.field3542 > var10 && var7 >= 0 && this.field3528 > var7) {
                    this.field3527[arg1][var10][var7] = arg1 > 0 ? this.field3527[arg1 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field3542) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && var8 < this.field3528) {
                    this.field3527[arg1][arg0][var8] = this.field3527[arg1][arg0 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && this.field3528 > arg3) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg5; var9++) {
                if (var9 >= 0 && this.field3542 > var9) {
                    this.field3527[arg1][var9][arg3] = this.field3527[arg1][var9][arg3 - 1];
                }
            }
        }
        if (arg0 >= 0 && arg3 >= 0 && this.field3542 > arg0 && arg3 < this.field3528) {
            if (arg1 == 0) {
                if (arg0 > 0 && this.field3527[arg1][arg0 - 1][arg3] != 0) {
                    this.field3527[arg1][arg0][arg3] = this.field3527[arg1][arg0 - 1][arg3];
                } else if (arg3 > 0 && this.field3527[arg1][arg0][arg3 - 1] != 0) {
                    this.field3527[arg1][arg0][arg3] = this.field3527[arg1][arg0][arg3 - 1];
                } else if (arg0 > 0 && arg3 > 0 && this.field3527[arg1][arg0 - 1][arg3 - 1] != 0) {
                    this.field3527[arg1][arg0][arg3] = this.field3527[arg1][arg0 - 1][arg3 - 1];
                }
            } else if (arg0 > 0 && this.field3527[arg1 - 1][arg0 - 1][arg3] != this.field3527[arg1][arg0 - 1][arg3]) {
                this.field3527[arg1][arg0][arg3] = this.field3527[arg1][arg0 - 1][arg3];
            } else if (arg3 > 0 && this.field3527[arg1][arg0][arg3 - 1] != this.field3527[arg1 - 1][arg0][arg3 - 1]) {
                this.field3527[arg1][arg0][arg3] = this.field3527[arg1][arg0][arg3 - 1];
            } else if (arg0 > 0 && arg3 > 0 && this.field3527[arg1][arg0 - 1][arg3 - 1] != this.field3527[arg1 - 1][arg0 - 1][arg3 - 1]) {
                this.field3527[arg1][arg0][arg3] = this.field3527[arg1][arg0 - 1][arg3 - 1];
            }
        }
        if (arg2 != 1) {
            this.method1592(20, -88, 120, 119, -49, 8, -76, null, false, -123, 73);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI[[I)V")
    public final void method1590(byte arg0, int arg1, int[][] arg2) {
        field3534++;
        int[][] var4 = this.field3527[arg1];
        for (int var5 = 0; var5 < this.field3542 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field3528 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg0 != -74) {
            field3546 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1591(int arg0) {
        int var1 = -8 % ((1 - arg0) / 54);
        field3546 = null;
        field3541 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIILfh;ZII)V")
    private final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class194 arg7, boolean arg8, int arg9, int arg10) {
        if (arg6 == 1) {
            arg5 = 1;
        } else if (arg6 == 2) {
            arg5 = 1;
            arg0 = 1;
        } else if (arg6 == 3) {
            arg0 = 1;
        }
        field3533++;
        if (~arg3 > arg2 || this.field3542 <= arg3 || arg4 < 0 || this.field3528 <= arg4) {
            while (true) {
                int var14 = arg7.method1337((byte) 83);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method1337((byte) -119);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method1337((byte) 97);
                }
            }
        }
        if (!this.field3522 && !arg8) {
            class229.field3460[arg10][arg3][arg4] = 0;
        }
        while (true) {
            int var12 = arg7.method1337((byte) -110);
            if (var12 == 0) {
                if (this.field3522) {
                    this.field3527[0][arg0 + arg3][arg4 + arg5] = 0;
                    return;
                } else if (arg10 == 0) {
                    this.field3527[0][arg0 + arg3][arg4 + arg5] = -class240.method1612(13523, arg9 + 932731, arg1 + 556238) * 8 << 0;
                    return;
                } else {
                    this.field3527[arg10][arg0 + arg3][arg4 + arg5] = this.field3527[arg10 - 1][arg0 + arg3][arg4 + arg5] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method1337((byte) -114);
                if (this.field3522) {
                    this.field3527[0][arg0 + arg3][arg4 + arg5] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg10 != 0) {
                    this.field3527[arg10][arg0 + arg3][arg4 + arg5] = this.field3527[arg10 - 1][arg0 + arg3][arg4 + arg5] - (var13 * 8 << 0);
                    return;
                }
                this.field3527[0][arg3 + arg0][arg4 + arg5] = -var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg8) {
                    arg7.method1337((byte) -113);
                } else {
                    this.field3540[arg10][arg3][arg4] = arg7.method1398(112);
                    this.field3523[arg10][arg3][arg4] = (byte) ((var12 - 2) / 4);
                    this.field3544[arg10][arg3][arg4] = (byte) class307.method2028(var12 + arg6 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field3522 && !arg8) {
                    class229.field3460[arg10][arg3][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg8) {
                this.field3521[arg10][arg3][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lya;BLya;Lza;)V")
    public final void method1593(class11 arg0, byte arg1, class11 arg2, class299 arg3) {
        field3539++;
        int[][] var5 = new int[this.field3542][this.field3528];
        if (class228.field3449 == null || class228.field3449.length != this.field3528) {
            class370.field5511 = new int[this.field3528];
            class407.field6028 = new int[this.field3528];
            class228.field3449 = new int[this.field3528];
            class86.field1394 = new int[this.field3528];
            class100.field1533 = new int[this.field3528];
        }
        for (int var6 = 0; var6 < this.field3545; var6++) {
            for (int var8 = 0; var8 < this.field3528; var8++) {
                class228.field3449[var8] = 0;
                class86.field1394[var8] = 0;
                class100.field1533[var8] = 0;
                class407.field6028[var8] = 0;
                class370.field5511[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3542; var9++) {
                for (int var10 = 0; var10 < this.field3528; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field3542 > var19) {
                        int var20 = this.field3521[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class70 var21 = this.field3526.method886((byte) 66, var20 - 1);
                            class228.field3449[var10] += var21.field1112;
                            class86.field1394[var10] += var21.field1114;
                            class100.field1533[var10] += var21.field1123;
                            class407.field6028[var10] += var21.field1126;
                            var10002 = class370.field5511[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3521[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class70 var24 = this.field3526.method886((byte) 14, var23 - 1);
                            class228.field3449[var10] -= var24.field1112;
                            class86.field1394[var10] -= var24.field1114;
                            class100.field1533[var10] -= var24.field1123;
                            class407.field6028[var10] -= var24.field1126;
                            var10002 = class370.field5511[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3528; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3528) {
                            var13 += class100.field1533[var17];
                            var11 += class228.field3449[var17];
                            var15 += class370.field5511[var17];
                            var14 += class407.field6028[var17];
                            var12 += class86.field1394[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class370.field5511[var18];
                            var11 -= class228.field3449[var18];
                            var14 -= class407.field6028[var18];
                            var13 -= class100.field1533[var18];
                            var12 -= class86.field1394[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class541.method3178(100, var13 / var15, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class330.field4978) {
                this.method1594(0, var6 == 0 ? arg2 : null, arg3, var6 == 0 ? arg0 : null, class407.field6024[var6], var6, var5);
            } else {
                this.method1596(var6 == 0 ? arg0 : null, class407.field6024[var6], -6012, var6, var6 == 0 ? arg2 : null, arg3, var5);
            }
            this.field3521[var6] = null;
            this.field3540[var6] = null;
            this.field3523[var6] = null;
            this.field3544[var6] = null;
        }
        if (!this.field3522) {
            if (class456.field6779 != 0) {
                class446.method2749();
            }
            if (class18.field205) {
                class541.method3177();
            }
        }
        if (arg1 < 92) {
            this.method1599((byte) -85, null, null, null);
        }
        for (int var7 = 0; var7 < this.field3545; var7++) {
            class407.field6024[var7].method64();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILya;Lza;Lya;Lya;I[[I)V")
    private final void method1594(int arg0, class11 arg1, class299 arg2, class11 arg3, class11 arg4, int arg5, int[][] arg6) {
        field3543++;
        byte[][] var8 = this.field3523[arg5];
        byte[][] var9 = this.field3544[arg5];
        byte[][] var10 = this.field3521[arg5];
        byte[][] var11 = this.field3540[arg5];
        for (int var12 = arg0; var12 < this.field3542; var12++) {
            int var13 = var12 >= (this.field3542 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3528; var14++) {
                int var15 = var14 >= this.field3528 - 1 ? var14 : var14 + 1;
                if (class498.field7257 == -1 || class379.method2415(-3, arg5, var12, var14, class498.field7257)) {
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
                        class410 var26 = var21 == 0 ? null : this.field3532.method2142(var21 - 1, (byte) -98);
                        class70 var27 = var22 == 0 ? null : this.field3526.method886((byte) 14, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class410 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6060 == -1 && var26.field6062 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6046;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3542 > var12 && this.field3528 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method56(var12, var14) - arg4.method56(var13, var15);
                                var38 = arg4.method56(var13, var14) - arg4.method56(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class58.field892[var39] = -1;
                            class451.field6713[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6046 ? class134.field2002[var19] : class136.field2072[var19];
                        this.method1598((byte) 87, this.field3528, arg2, var12, this.field3542, var8, var26, var20, var9, var11, var27, var18, var19, var14);
                        boolean var41 = var26 != null && var26.field6062 != var26.field6060;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class58.field892[var42] >= 0 && class4.field56[var42] != class379.field5586[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class15.method89(var18[1], class307.method2028(class451.field6713[2], class451.field6713[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class15.method89(var18[3], class307.method2028(class451.field6713[0], class451.field6713[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class15.method89(var18[0], class307.method2028(class451.field6713[2], class451.field6713[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class15.method89(var18[2], class307.method2028(class451.field6713[6], class451.field6713[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var46 = class106.field1623[var19];
                            var48 = field3546[var19];
                            var49 = class213.field3247[var19];
                            var47 = var27 == null ? 0 : class73.field1250[var19];
                            var45 = var26 == null ? 0 : class54.field831[var19];
                        } else if (var17) {
                            var46 = class407.field6029[var19];
                            var45 = var26 == null ? 0 : class12.field141[var19];
                            var44 = class26.field298[var19];
                            var48 = class234.field3517[var19];
                            var47 = var27 == null ? 0 : client.field7527[var19];
                            var49 = class341.field5094[var19];
                        } else {
                            var45 = var26 == null ? 0 : class279.field4354[var19];
                            var46 = class64.field1023[var19];
                            var47 = var27 == null ? 0 : class414.field6096[var19];
                            var48 = class240.field3608[var19];
                            var49 = class175.field2696[var19];
                            var44 = class163.field2467[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class89.method776(arg5, var12, var14);
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
                            int[] var60 = arg3 == null ? null : new int[var53];
                            int[] var61 = arg3 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field6060;
                                var63 = arg2.method522() ? var26.field6055 : var26.field6048;
                                var64 = var26.field6059;
                                int var65 = class385.method2452(arg2, arg0 + 49, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 1;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 1;
                                        class38.field623[4] = var46[var51];
                                        class38.field623[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 5;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 5;
                                        class38.field623[4] = var46[var51];
                                        class38.field623[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 3;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 3;
                                        class38.field623[4] = var46[var51];
                                        var98 = 6;
                                        class38.field623[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 7;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 7;
                                        class38.field623[4] = var46[var51];
                                        var98 = 6;
                                        class38.field623[5] = var49[var51];
                                    } else {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = var46[var51];
                                        class38.field623[2] = var49[var51];
                                        var98 = 3;
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class38.field623[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field3525[var100];
                                        int var103 = this.field3519[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var105 = 128 - var102;
                                            var104 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var103;
                                            var104 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var104 = 128 - var103;
                                            var105 = var102;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class396.field5852[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg3.method68(var106, var107) - arg4.method68(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg3 != null && !class396.field5852[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg4.method68(var108, var109) - arg3.method68(var108, var109);
                                            } else if (arg1 != null && !class348.field5197[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg1.method68(var110, var111) - arg4.method68(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field6054 < class58.field892[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class379.field5586[var101];
                                            }
                                            var59[var52] = class8.field101[var101];
                                            var58[var52] = class80.field1310[var101];
                                            var57[var52] = class4.field56[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method522() ? var26.field6055 : var26.field6048;
                                            var59[var52] = var26.field6059;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field3522 && arg5 == 0) {
                                    class320.method2117(var12, var14, var26.field6056, var26.field6051 * 8, var26.field6057);
                                }
                                if (var19 != 12 && var26.field6060 != -1 && var26.field6065) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class54.field831[var19];
                            } else if (var17) {
                                var51 += class12.field141[var19];
                            } else {
                                var51 += class279.field4354[var19];
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
                                class70 var67 = this.field3526.method886((byte) 123, var22 - 1);
                                class70 var68 = this.field3526.method886((byte) 107, var23 - 1);
                                class70 var69 = this.field3526.method886((byte) 77, var24 - 1);
                                class70 var70 = this.field3526.method886((byte) 47, var25 - 1);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 1;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 1;
                                        class38.field623[4] = var46[var51];
                                        var73 = 6;
                                        class38.field623[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 5;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 5;
                                        class38.field623[4] = var46[var51];
                                        var73 = 6;
                                        class38.field623[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 3;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 3;
                                        class38.field623[4] = var46[var51];
                                        var73 = 6;
                                        class38.field623[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = 7;
                                        class38.field623[2] = var49[var51];
                                        class38.field623[3] = 7;
                                        class38.field623[4] = var46[var51];
                                        var73 = 6;
                                        class38.field623[5] = var49[var51];
                                    } else {
                                        class38.field623[0] = var48[var51];
                                        class38.field623[1] = var46[var51];
                                        class38.field623[2] = var49[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class38.field623[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field3525[var75];
                                        int var78 = this.field3519[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var77;
                                            var80 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = 128 - var78;
                                            var80 = var77;
                                        } else {
                                            var80 = var78;
                                            var79 = var77;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class396.field5852[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg3.method68(var81, var82) - arg4.method68(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg3 != null && !class396.field5852[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg4.method68(var83, var84) - arg3.method68(var83, var84);
                                            } else if (arg1 != null && !class348.field5197[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg1.method68(var85, var86) - arg4.method68(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class58.field892[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class379.field5586[var76];
                                            }
                                            var59[var52] = class8.field101[var76];
                                            var58[var52] = class80.field1310[var76];
                                            var57[var52] = class4.field56[var76];
                                        } else {
                                            if (var17 && class396.field5852[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field1117;
                                                var59[var52] = var67.field1122;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field1117;
                                                var59[var52] = var68.field1122;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field1117;
                                                var59[var52] = var69.field1122;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field1117;
                                                var59[var52] = var70.field1122;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 < 64) {
                                                        var58[var52] = var70.field1117;
                                                        var59[var52] = var70.field1122;
                                                    } else {
                                                        var58[var52] = var69.field1117;
                                                        var59[var52] = var69.field1122;
                                                    }
                                                } else if (var80 >= 64) {
                                                    var58[var52] = var68.field1117;
                                                    var59[var52] = var68.field1122;
                                                } else {
                                                    var58[var52] = var67.field1117;
                                                    var59[var52] = var67.field1122;
                                                }
                                                int var87 = class238.method1609(false, arg6[var13][var14], arg6[var12][var14], var79 << 7 >> 7);
                                                int var88 = class238.method1609(false, arg6[var13][var15], arg6[var12][var15], var79 << 7 >> 7);
                                                var57[var52] = class238.method1609(false, var88, var87, var80 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field1115) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg4.method56(var12, var14);
                            int var90 = arg4.method56(var13, var14);
                            int var91 = arg4.method56(var13, var15);
                            int var92 = arg4.method56(var12, var15);
                            if (arg5 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field6052) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field3535[arg5][var12][var14] = (byte) class19.method118(this.field3535[arg5][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field3522) {
                                var94 = class193.method1334(var12, var14);
                                var95 = class509.method3029(var12, var14);
                                var96 = class184.method1281(var12, var14);
                            }
                            arg4.method59(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class89.method776(arg5, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field3545; var6++) {
            this.method1589(arg2, var6, 1, arg0, arg3, arg1);
        }
        if (arg4 <= 68) {
            this.field3519 = null;
        }
        field3524++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lya;Lya;IILya;Lza;[[I)V")
    private final void method1596(class11 arg0, class11 arg1, int arg2, int arg3, class11 arg4, class299 arg5, int[][] arg6) {
        field3538++;
        if (arg2 != -6012) {
            return;
        }
        for (int var8 = 0; var8 < this.field3542; var8++) {
            for (int var9 = 0; var9 < this.field3528; var9++) {
                if (class498.field7257 == -1 || class379.method2415(-3, arg3, var8, var9, class498.field7257)) {
                    byte var10 = this.field3523[arg3][var8][var9];
                    byte var11 = this.field3544[arg3][var8][var9];
                    int var12 = this.field3540[arg3][var8][var9] & 0xFF;
                    int var13 = this.field3521[arg3][var8][var9] & 0xFF;
                    class410 var14 = var12 == 0 ? null : this.field3532.method2142(var12 - 1, (byte) -107);
                    class70 var15 = var13 == 0 ? null : this.field3526.method886((byte) 58, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class54.field831[var10];
                        var16 = var15 == null ? 0 : class73.field1250[var10];
                    } else if (var14 != null) {
                        var17 = class54.field831[var10];
                    } else if (var15 != null) {
                        var16 = class54.field831[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field6060 == -1 && var14.field6062 == -1 && var14.field6055 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg5.method522() ? var14.field6055 : var14.field6048;
                            if (class64.field1015) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field6059;
                                if (var14.field6060 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field6060;
                                }
                                if (var14.field6062 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field6062;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field3522 && arg3 == 0) {
                                class320.method2117(var8, var9, var14.field6056, var14.field6051 * 8, var14.field6057);
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
                            int var28 = var15.field1117;
                            if (class64.field1015) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field1122;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field3525.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field3525[var36];
                            int var46 = this.field3519[var36];
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
                            if (var34 != null && class396.field5852[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method68(var49, var50) - arg1.method68(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class396.field5852[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method68(var51, var52) - arg0.method68(var51, var52);
                                } else if (arg4 != null && !class348.field5197[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method68(var53, var54) - arg1.method68(var53, var54);
                                }
                            }
                        }
                        int var37 = arg1.method56(var8, var9);
                        int var38 = arg1.method56(var8 + 1, var9);
                        int var39 = arg1.method56(var8 + 1, var9 + 1);
                        int var40 = arg1.method56(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field6052) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field3535[arg3][var8][var9] = (byte) class19.method118(this.field3535[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field3522) {
                            var42 = class193.method1334(var8, var9);
                            var43 = class509.method3029(var8, var9);
                            var44 = class184.method1281(var8, var9);
                        }
                        arg1.method63(var8, var9, var32, var34, var33, var35, field3546[var10], class106.field1623[var10], class213.field3247[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class89.method776(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[Luh;IILfh;I)V")
    public final void method1597(int arg0, int arg1, class407[] arg2, int arg3, int arg4, class194 arg5, int arg6) {
        if (!this.field3522) {
            for (int var8 = 0; var8 < 4; var8++) {
                class407 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field3542 > var12 && var13 >= 0 && var13 < this.field3528) {
                            var9.method2556(var13, var12, -2097153);
                        }
                    }
                }
            }
        }
        field3537++;
        int var14 = arg0 + arg3;
        int var15 = arg1 + arg4;
        int var16 = 0;
        int var17 = 82 / ((-arg6 - 40) / 56);
        while (var16 < this.field3545) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method1592(0, var15 + var19, -1, arg0 + var18, var19 + arg4, 0, 0, arg5, false, var14 + var18, var16);
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BILza;II[[BLjt;I[[B[[BLgj;[ZII)V")
    private final void method1598(byte arg0, int arg1, class299 arg2, int arg3, int arg4, byte[][] arg5, class410 arg6, int arg7, byte[][] arg8, byte[][] arg9, class70 arg10, boolean[] arg11, int arg12, int arg13) {
        if (arg0 < 52) {
            this.method1598((byte) 114, -99, null, 93, -34, null, null, 17, null, null, null, null, -125, 6);
        }
        field3530++;
        boolean[] var15 = arg6 != null && arg6.field6046 ? class134.field2002[arg12] : class136.field2072[arg12];
        if (arg13 > 0) {
            if (arg3 > 0) {
                int var16 = arg9[arg3 - 1][arg13 - 1] & 0xFF;
                if (var16 > 0) {
                    class410 var17 = this.field3532.method2142(var16 - 1, (byte) -119);
                    if (var17.field6060 != -1 && var17.field6046) {
                        byte var18 = arg5[arg3 - 1][arg13 - 1];
                        int var19 = arg8[arg3 - 1][arg13 - 1] * 2 + 4 & 0x7;
                        int var20 = class385.method2452(arg2, -91, var17);
                        if (class396.field5852[var18][var19]) {
                            class4.field56[0] = var17.field6060;
                            class379.field5586[0] = var20;
                            class80.field1310[0] = arg2.method522() ? var17.field6055 : var17.field6048;
                            class8.field101[0] = var17.field6059;
                            class58.field892[0] = var17.field6054;
                            class451.field6713[0] = 256;
                        }
                    }
                }
            }
            if (arg4 - 1 > arg3) {
                int var21 = arg9[arg3 + 1][arg13 - 1] & 0xFF;
                if (var21 > 0) {
                    class410 var22 = this.field3532.method2142(var21 - 1, (byte) -123);
                    if (var22.field6060 != -1 && var22.field6046) {
                        byte var23 = arg5[arg3 + 1][arg13 - 1];
                        int var24 = arg8[arg3 + 1][arg13 - 1] * 2 + 6 & 0x7;
                        int var25 = class385.method2452(arg2, -111, var22);
                        if (class396.field5852[var23][var24]) {
                            class4.field56[2] = var22.field6060;
                            class379.field5586[2] = var25;
                            class80.field1310[2] = arg2.method522() ? var22.field6055 : var22.field6048;
                            class8.field101[2] = var22.field6059;
                            class58.field892[2] = var22.field6054;
                            class451.field6713[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg13 < arg1 - 1) {
            if (arg3 > 0) {
                int var26 = arg9[arg3 - 1][arg13 + 1] & 0xFF;
                if (var26 > 0) {
                    class410 var27 = this.field3532.method2142(var26 - 1, (byte) -99);
                    if (var27.field6060 != -1 && var27.field6046) {
                        byte var28 = arg5[arg3 - 1][arg13 + 1];
                        int var29 = arg8[arg3 - 1][arg13 + 1] * 2 + 2 & 0x7;
                        int var30 = class385.method2452(arg2, 99, var27);
                        if (class396.field5852[var28][var29]) {
                            class4.field56[6] = var27.field6060;
                            class379.field5586[6] = var30;
                            class80.field1310[6] = arg2.method522() ? var27.field6055 : var27.field6048;
                            class8.field101[6] = var27.field6059;
                            class58.field892[6] = var27.field6054;
                            class451.field6713[6] = 64;
                        }
                    }
                }
            }
            if (arg3 < (arg4 - 1)) {
                int var31 = arg9[arg3 + 1][arg13 + 1] & 0xFF;
                if (var31 > 0) {
                    class410 var32 = this.field3532.method2142(var31 - 1, (byte) -122);
                    if (var32.field6060 != -1 && var32.field6046) {
                        byte var33 = arg5[arg3 + 1][arg13 + 1];
                        int var34 = arg8[arg3 + 1][arg13 + 1] * 2 & 0x7;
                        int var35 = class385.method2452(arg2, -115, var32);
                        if (class396.field5852[var33][var34]) {
                            class4.field56[4] = var32.field6060;
                            class379.field5586[4] = var35;
                            class80.field1310[4] = arg2.method522() ? var32.field6055 : var32.field6048;
                            class8.field101[4] = var32.field6059;
                            class58.field892[4] = var32.field6054;
                            class451.field6713[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var36 = arg9[arg3][arg13 - 1] & 0xFF;
            if (var36 > 0) {
                class410 var37 = this.field3532.method2142(var36 - 1, (byte) -104);
                if (var37.field6060 != -1) {
                    byte var38 = arg5[arg3][arg13 - 1];
                    byte var39 = arg8[arg3][arg13 - 1];
                    if (var37.field6046) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class385.method2452(arg2, -109, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class396.field5852[var38][var41] && var37.field6054 >= class58.field892[var40]) {
                                class4.field56[var40] = var37.field6060;
                                class379.field5586[var40] = var42;
                                class80.field1310[var40] = arg2.method522() ? var37.field6055 : var37.field6048;
                                class8.field101[var40] = var37.field6059;
                                if (class58.field892[var40] == var37.field6054) {
                                    class451.field6713[var40] = class19.method118(class451.field6713[var40], 32);
                                } else {
                                    class451.field6713[var40] = 32;
                                }
                                class58.field892[var40] = var37.field6054;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg7 & 0x3]) {
                            arg11[0] = class134.field2002[var38][class307.method2028(var39 + 2, 3)];
                        }
                    } else if (!var15[arg7 & 0x3]) {
                        arg11[0] = class136.field2072[var38][class307.method2028(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg1 - 1) > arg13) {
            int var44 = arg9[arg3][arg13 + 1] & 0xFF;
            if (var44 > 0) {
                class410 var45 = this.field3532.method2142(var44 - 1, (byte) -109);
                if (var45.field6060 != -1) {
                    byte var46 = arg5[arg3][arg13 + 1];
                    byte var47 = arg8[arg3][arg13 + 1];
                    if (var45.field6046) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class385.method2452(arg2, 46, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class396.field5852[var46][var49] && class58.field892[var48] <= var45.field6054) {
                                class4.field56[var48] = var45.field6060;
                                class379.field5586[var48] = var50;
                                class80.field1310[var48] = arg2.method522() ? var45.field6055 : var45.field6048;
                                class8.field101[var48] = var45.field6059;
                                if (class58.field892[var48] == var45.field6054) {
                                    class451.field6713[var48] = class19.method118(class451.field6713[var48], 16);
                                } else {
                                    class451.field6713[var48] = 16;
                                }
                                class58.field892[var48] = var45.field6054;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg7 + 2 & 0x3]) {
                            arg11[2] = class134.field2002[var46][class307.method2028(var47, 3)];
                        }
                    } else if (!var15[arg7 + 2 & 0x3]) {
                        arg11[2] = class136.field2072[var46][class307.method2028(3, -(-var47))];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg9[arg3 - 1][arg13] & 0xFF;
            if (var52 > 0) {
                class410 var53 = this.field3532.method2142(var52 - 1, (byte) -125);
                if (var53.field6060 != -1) {
                    byte var54 = arg5[arg3 - 1][arg13];
                    byte var55 = arg8[arg3 - 1][arg13];
                    if (var53.field6046) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class385.method2452(arg2, -104, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class396.field5852[var54][var57] && var53.field6054 >= class58.field892[var56]) {
                                class4.field56[var56] = var53.field6060;
                                class379.field5586[var56] = var58;
                                class80.field1310[var56] = arg2.method522() ? var53.field6055 : var53.field6048;
                                class8.field101[var56] = var53.field6059;
                                if (class58.field892[var56] == var53.field6054) {
                                    class451.field6713[var56] = class19.method118(class451.field6713[var56], 8);
                                } else {
                                    class451.field6713[var56] = 8;
                                }
                                class58.field892[var56] = var53.field6054;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg7 + 3 & 0x3]) {
                            arg11[3] = class134.field2002[var54][class307.method2028(3, var55 + 1)];
                        }
                    } else if (!var15[arg7 + 3 & 0x3]) {
                        arg11[3] = class136.field2072[var54][class307.method2028(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg3 < (arg4 - 1)) {
            int var60 = arg9[arg3 + 1][arg13] & 0xFF;
            if (var60 > 0) {
                class410 var61 = this.field3532.method2142(var60 - 1, (byte) -126);
                if (var61.field6060 != -1) {
                    byte var62 = arg5[arg3 + 1][arg13];
                    byte var63 = arg8[arg3 + 1][arg13];
                    if (var61.field6046) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class385.method2452(arg2, -89, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class396.field5852[var62][var65] && class58.field892[var64] <= var61.field6054) {
                                class4.field56[var64] = var61.field6060;
                                class379.field5586[var64] = var66;
                                class80.field1310[var64] = arg2.method522() ? var61.field6055 : var61.field6048;
                                class8.field101[var64] = var61.field6059;
                                if (class58.field892[var64] == var61.field6054) {
                                    class451.field6713[var64] = class19.method118(class451.field6713[var64], 4);
                                } else {
                                    class451.field6713[var64] = 4;
                                }
                                class58.field892[var64] = var61.field6054;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg7 + 1 & 0x3]) {
                            arg11[1] = class134.field2002[var62][class307.method2028(var63 + 3, 3)];
                        }
                    } else if (!var15[arg7 + 1 & 0x3]) {
                        arg11[1] = class136.field2072[var62][class307.method2028(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg6 == null) {
            return;
        }
        int var68 = class385.method2452(arg2, -101, arg6);
        if (!arg6.field6046) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg7 * 2) & 0x7;
            if (class396.field5852[arg12][var69] && class58.field892[var70] <= arg6.field6054) {
                class4.field56[var70] = arg6.field6060;
                class379.field5586[var70] = var68;
                class80.field1310[var70] = arg2.method522() ? arg6.field6055 : arg6.field6048;
                class8.field101[var70] = arg6.field6059;
                if (class58.field892[var70] == arg6.field6054) {
                    class451.field6713[var70] = class19.method118(class451.field6713[var70], 2);
                } else {
                    class451.field6713[var70] = 2;
                }
                class58.field892[var70] = arg6.field6054;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLza;[Luh;[[[I)V")
    public final void method1599(byte arg0, class299 arg1, class407[] arg2, int[][][] arg3) {
        field3547++;
        if (!this.field3522) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3542; var6++) {
                    for (int var7 = 0; var7 < this.field3528; var7++) {
                        if ((class229.field3460[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class229.field3460[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2566(-62, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        int var9 = 27 / ((-arg0 - 58) / 36);
        for (int var10 = 0; var10 < this.field3545; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field3522) {
                if (class261.field4170) {
                    var12 |= 0x8;
                }
                if (class18.field205) {
                    var11 |= 0x2;
                }
                if (class456.field6779 != 0) {
                    var11 |= 0x1;
                    if (class164.field2480 | var10 == 0) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class18.field205) {
                var12 |= 0x7;
            }
            if (!class97.field1523) {
                var12 |= 0x20;
            }
            int[][] var13 = arg3 == null || var10 >= arg3.length ? this.field3527[var10] : arg3[var10];
            class193.method1332(var10, arg1.method540(this.field3542, this.field3528, this.field3527[var10], var13, 128, var11, var12));
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII[Luh;Lfh;III)V")
    public final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, class407[] arg5, class194 arg6, int arg7, int arg8, int arg9) {
        field3531++;
        int var11 = (arg7 & 0x7) * 8;
        int var12 = (arg0 & 0x7) * 8;
        if (!this.field3522) {
            class407 var13 = arg5[arg9];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg4 + class398.method2509((byte) 124, var15 & 0x7, arg8, var14 & 0x7);
                    int var17 = arg3 + class336.method2187(63, arg8, var14 & 0x7, var15 & 0x7);
                    if (var16 > 0 && (this.field3542 - 1) > var16 && var17 > 0 && var17 < this.field3528 - 1) {
                        var13.method2556(var17, var16, -2097153);
                    }
                }
            }
        }
        int var18 = (arg7 & 0xFFFFFFF8) << 3;
        int var19 = arg0 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        if (arg2 != 14729) {
            return;
        }
        for (int var22 = 0; var22 < this.field3545; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var23 >= var11 && var23 <= (var11 + 8) && var24 >= var12 && (var12 + 8) >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg8 == 0) {
                                var25 = arg4 + var23 - var11;
                                var26 = var24 + arg3 - var12;
                            } else if (arg8 == 1) {
                                var26 = var11 + arg3 + 8 - var23;
                                var25 = var24 + arg4 - var12;
                            } else if (arg8 == 2) {
                                var26 = arg3 + 8 - (-var12 + var24);
                                var25 = var11 + arg4 + 8 - var23;
                            } else {
                                var26 = var23 + arg3 - var11;
                                var25 = var12 + arg4 + 8 - var24;
                            }
                            this.method1592(0, var19 + var24, arg2 ^ 0xFFFFC676, var25, var26, 0, 0, arg6, true, var18 + var23, arg9);
                        } else {
                            var25 = class398.method2509((byte) 120, var24 & 0x7, arg8, var23 & 0x7) + arg4;
                            var26 = class336.method2187(55, arg8, var23 & 0x7, var24 & 0x7) + arg3;
                            this.method1592(var20, var19 + var24, -1, var25, var26, var21, arg8, arg6, false, var18 + var23, arg9);
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
                                if (arg8 == 0) {
                                    var31 = var29 + arg4 - var11;
                                    var32 = arg3 + var30 - var12;
                                } else if (arg8 == 1) {
                                    var32 = -var29 - (-var11 - arg3 - 8);
                                    var31 = arg4 + var30 - var12;
                                } else if (arg8 == 2) {
                                    var31 = arg4 + var11 + 8 - var29;
                                    var32 = arg3 + var12 + 8 - var30;
                                } else {
                                    var32 = arg3 + var29 - var11;
                                    var31 = var12 + arg4 + 8 - var30;
                                }
                                if (var31 >= 0 && var31 < this.field3542 && var32 >= 0 && this.field3528 > var32) {
                                    this.field3527[arg9][var31][var32] = this.field3527[arg9][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1592(0, 0, arg2 - 14730, -1, -1, 0, 0, arg6, false, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1601(String arg0, int arg1) {
        if (arg1 != 20979) {
            field3546 = null;
        }
        field3536++;
        return class354.method2258(10, true, 55, arg0);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIZLip;Lio;)V")
    public class235(int arg0, int arg1, int arg2, boolean arg3, class326 arg4, class118 arg5) {
        this.field3545 = arg0;
        this.field3532 = arg4;
        this.field3542 = arg1;
        this.field3528 = arg2;
        this.field3526 = arg5;
        this.field3522 = arg3;
        this.field3535 = new byte[this.field3545][this.field3542 + 1][this.field3528 + 1];
        this.field3521 = new byte[this.field3545][this.field3542][this.field3528];
        this.field3527 = new int[this.field3545][this.field3542 + 1][this.field3528 + 1];
        this.field3523 = new byte[this.field3545][this.field3542][this.field3528];
        this.field3540 = new byte[this.field3545][this.field3542][this.field3528];
        this.field3544 = new byte[this.field3545][this.field3542][this.field3528];
    }
}
