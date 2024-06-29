import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class52 {

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "[I")
    private int[] field590 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "[I")
    private int[] field602 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "Lum;")
    private class366 field584;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Z")
    public boolean field598;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "Lua;")
    private class474 field592;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "[[[B")
    private byte[][][] field603;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "[[[B")
    public byte[][][] field591;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "[[[B")
    private byte[][][] field605;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[[[B")
    private byte[][][] field585;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "[[[I")
    public int[][][] field608;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "[[[B")
    private byte[][][] field594;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Ljc;")
    public static class305 field583 = new class305("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field611 = new String[200];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "Lvc;")
    public static class209 field606;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "[[[B")
    public byte[][][] field596;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIII)V", line = 3)
    private final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg4; var7 < arg4 + arg1; var7++) {
            for (int var10 = arg2; var10 < (arg2 + arg3); var10++) {
                if (var10 >= 0 && var10 < this.field607 && var7 >= 0 && var7 < this.field609) {
                    this.field608[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field608[arg5 - 1][var10][var7] - 240;
                }
            }
        }
        field587++;
        if (arg2 > 0 && arg2 < this.field607) {
            for (int var8 = arg4 + 1; var8 < (arg1 + arg4); var8++) {
                if (var8 >= 0 && this.field609 > var8) {
                    this.field608[arg5][arg2][var8] = this.field608[arg5][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && this.field609 > arg4) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg3); var9++) {
                if (var9 >= 0 && var9 < this.field607) {
                    this.field608[arg5][var9][arg4] = this.field608[arg5][var9][arg4 - 1];
                }
            }
        }
        if (arg0 < ~arg2 || arg4 < 0 || this.field607 <= arg2 || arg4 >= this.field609) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 > 0 && this.field608[arg5][arg2 - 1][arg4] != 0) {
                this.field608[arg5][arg2][arg4] = this.field608[arg5][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field608[arg5][arg2][arg4 - 1] != 0) {
                this.field608[arg5][arg2][arg4] = this.field608[arg5][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && this.field608[arg5][arg2 - 1][arg4 - 1] != 0) {
                this.field608[arg5][arg2][arg4] = this.field608[arg5][arg2 - 1][arg4 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field608[arg5 - 1][arg2 - 1][arg4] == this.field608[arg5][arg2 - 1][arg4]) {
            if (arg4 > 0 && this.field608[arg5][arg2][arg4 - 1] != this.field608[arg5 - 1][arg2][arg4 - 1]) {
                this.field608[arg5][arg2][arg4] = this.field608[arg5][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && this.field608[arg5 - 1][arg2 - 1][arg4 - 1] != this.field608[arg5][arg2 - 1][arg4 - 1]) {
                this.field608[arg5][arg2][arg4] = this.field608[arg5][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            this.field608[arg5][arg2][arg4] = this.field608[arg5][arg2 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II[[I)V", line = 99)
    public final void method305(int arg0, int arg1, int[][] arg2) {
        field599++;
        if (arg1 != 1) {
            this.field608 = null;
        }
        int[][] var4 = this.field608[arg0];
        for (int var5 = 0; var5 < this.field607 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field609 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIIZLug;II)V", line = 129)
    private final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class396 arg8, int arg9, int arg10) {
        field597++;
        if (arg0 != -1) {
            this.method305(18, 19, null);
        }
        if (arg6 == 1) {
            arg4 = 1;
        } else if (arg6 == 2) {
            arg3 = 1;
            arg4 = 1;
        } else if (arg6 == 3) {
            arg3 = 1;
        }
        if (arg9 < 0 || this.field607 <= arg9 || arg10 < 0 || arg10 >= this.field609) {
            while (true) {
                int var14 = arg8.method2388((byte) -122);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method2388((byte) -127);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method2388((byte) -120);
                }
            }
        }
        if (!this.field598 && !arg7) {
            class252.field3358[arg5][arg9][arg10] = 0;
        }
        while (true) {
            int var12 = arg8.method2388((byte) -115);
            if (var12 == 0) {
                if (this.field598) {
                    this.field608[0][arg3 + arg9][arg4 + arg10] = 0;
                    return;
                } else if (arg5 == 0) {
                    this.field608[0][arg9 + arg3][arg10 + arg4] = -class428.method2634(arg1 + 932731, arg2 + 556238, -58) * 8 << 0;
                    return;
                } else {
                    this.field608[arg5][arg9 + arg3][arg4 + arg10] = this.field608[arg5 - 1][arg3 + arg9][arg4 + arg10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method2388((byte) -118);
                if (!this.field598) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg5 == 0) {
                        this.field608[0][arg9 + arg3][arg10 + arg4] = -var13 * 8 << 0;
                        return;
                    }
                    this.field608[arg5][arg9 + arg3][arg10 + arg4] = this.field608[arg5 - 1][arg9 + arg3][arg10 + arg4] - (var13 * 8 << 0);
                    return;
                }
                this.field608[0][arg9 + arg3][arg4 + arg10] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg8.method2388((byte) -116);
                } else {
                    this.field585[arg5][arg9][arg10] = arg8.method2418(-115);
                    this.field603[arg5][arg9][arg10] = (byte) ((var12 - 2) / 4);
                    this.field594[arg5][arg9][arg10] = (byte) class95.method534(3, arg6 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field598 && !arg7) {
                    class252.field3358[arg5][arg9][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                this.field605[arg5][arg9][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILug;I[Las;IIB)V", line = 257)
    public final void method307(int arg0, class396 arg1, int arg2, class106[] arg3, int arg4, int arg5, byte arg6) {
        field593++;
        if (!this.field598) {
            for (int var8 = 0; var8 < 4; var8++) {
                class106 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && this.field607 > var12 && var13 >= 0 && var13 < this.field609) {
                            var9.method641((byte) -87, var12, var13);
                        }
                    }
                }
            }
        }
        if (arg6 < 104) {
            this.method306(-111, 53, -52, -44, -85, -60, -100, false, null, 124, -87);
        }
        int var14 = arg0 + arg4;
        int var15 = arg5 + arg2;
        for (int var16 = 0; var16 < this.field601; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method306(-1, var14 + var17, var15 + var18, 0, 0, var16, 0, false, arg1, arg0 + var17, var18 - -arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I", line = 336)
    public static final int method308(byte arg0) {
        if (arg0 != -76) {
            method317((byte) 32);
        }
        field610++;
        return 2;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lza;BLya;I[[ILya;Lya;)V", line = 349)
    private final void method309(class287 arg0, byte arg1, class38 arg2, int arg3, int[][] arg4, class38 arg5, class38 arg6) {
        field588++;
        if (arg1 < 124) {
            method315(-110);
        }
        byte[][] var8 = this.field603[arg3];
        byte[][] var9 = this.field594[arg3];
        byte[][] var10 = this.field605[arg3];
        byte[][] var11 = this.field585[arg3];
        for (int var12 = 0; var12 < this.field607; var12++) {
            int var13 = var12 >= (this.field607 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field609; var14++) {
                int var15 = this.field609 - 1 <= var14 ? var14 : var14 + 1;
                if (class443.field6456 == -1 || class90.method497(var12, var14, 0, arg3, class443.field6456)) {
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
                        class200 var26 = var21 == 0 ? null : this.field592.method2895(46, var21 - 1);
                        class451 var27 = var22 == 0 ? null : this.field584.method2180(var22 - 1, (byte) -112);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class200 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2671 == -1 && var26.field2676 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2668;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field607 && this.field609 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method217(var12, var14) - arg5.method217(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method217(var13, var14) - arg5.method217(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class32.field330[var39] = -1;
                            class488.field7159[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2668 ? class257.field3425[var19] : class189.field2450[var19];
                        this.method312(arg0, this.field607, var19, var27, var14, var8, var9, this.field609, var20, var18, (byte) 25, var11, var26, var12);
                        boolean var41 = var26 != null && var26.field2676 != var26.field2671;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class32.field330[var42] >= 0 && class475.field7037[var42] != class349.field4643[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class89.method495(var18[1], class95.method534(class488.field7159[4], class488.field7159[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class89.method495(var18[3], class95.method534(class488.field7159[6], class488.field7159[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class89.method495(var18[0], class95.method534(class488.field7159[2], class488.field7159[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class89.method495(var18[2], class95.method534(class488.field7159[6], class488.field7159[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var45 = class496.field7236[var19];
                            var46 = var26 == null ? 0 : class373.field5066[var19];
                            var47 = class530.field7767[var19];
                            var48 = var27 == null ? 0 : class213.field2921[var19];
                            var49 = class163.field2120[var19];
                        } else if (var17) {
                            var47 = class470.field6977[var19];
                            var46 = var26 == null ? 0 : class126.field1632[var19];
                            var44 = class391.field5655[var19];
                            var45 = class67.field772[var19];
                            var48 = var27 == null ? 0 : class490.field7166[var19];
                            var49 = class53.field616[var19];
                        } else {
                            var47 = class215.field2940[var19];
                            var48 = var27 == null ? 0 : class136.field1819[var19];
                            var45 = class126.field1633[var19];
                            var49 = class168.field2179[var19];
                            var44 = class195.field2503[var19];
                            var46 = var26 == null ? 0 : class487.field7158[var19];
                        }
                        int var50 = var46 + var48;
                        if (var50 <= 0) {
                            class469.method2862(arg3, var12, var14);
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
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2671;
                                var63 = arg0.method1144() ? var26.field2672 : var26.field2681;
                                var64 = var26.field2674;
                                int var65 = class134.method808(arg0, var26, 52);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 1;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 1;
                                        class148.field1946[4] = var47[var51];
                                        var98 = 6;
                                        class148.field1946[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 5;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 5;
                                        class148.field1946[4] = var47[var51];
                                        var98 = 6;
                                        class148.field1946[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 3;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 3;
                                        class148.field1946[4] = var47[var51];
                                        var98 = 6;
                                        class148.field1946[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 7;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 7;
                                        class148.field1946[4] = var47[var51];
                                        var98 = 6;
                                        class148.field1946[5] = var49[var51];
                                    } else {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = var47[var51];
                                        class148.field1946[2] = var49[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class148.field1946[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field590[var100];
                                        int var103 = this.field602[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var102;
                                            var105 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var105 = var103;
                                            var104 = var102;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class230.field3097[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg6.method216(var106, var107) - arg5.method216(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class230.field3097[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg5.method216(var108, var109) - arg6.method216(var108, var109);
                                            } else if (arg2 != null && !class61.field706[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg2.method216(var110, var111) - arg5.method216(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field2679 < class32.field330[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class349.field4643[var101];
                                            }
                                            var59[var52] = class505.field7339[var101];
                                            var58[var52] = class185.field2409[var101];
                                            var57[var52] = class475.field7037[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg0.method1144() ? var26.field2672 : var26.field2681;
                                            var59[var52] = var26.field2674;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field598 && arg3 == 0) {
                                    class431.method2648(var12, var14, var26.field2663, var26.field2675 * 8, var26.field2673);
                                }
                                if (var19 != 12 && var26.field2671 != -1 && var26.field2680) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class373.field5066[var19];
                            } else if (var17) {
                                var51 += class126.field1632[var19];
                            } else {
                                var51 += class487.field7158[var19];
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
                                class451 var67 = this.field584.method2180(var22 - 1, (byte) 114);
                                class451 var68 = this.field584.method2180(var23 - 1, (byte) -112);
                                class451 var69 = this.field584.method2180(var24 - 1, (byte) 85);
                                class451 var70 = this.field584.method2180(var25 - 1, (byte) -121);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 1;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 1;
                                        class148.field1946[4] = var47[var51];
                                        class148.field1946[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 5;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 5;
                                        class148.field1946[4] = var47[var51];
                                        var73 = 6;
                                        class148.field1946[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 3;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 3;
                                        class148.field1946[4] = var47[var51];
                                        var73 = 6;
                                        class148.field1946[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = 7;
                                        class148.field1946[2] = var49[var51];
                                        class148.field1946[3] = 7;
                                        class148.field1946[4] = var47[var51];
                                        class148.field1946[5] = var49[var51];
                                        var73 = 6;
                                    } else {
                                        class148.field1946[0] = var45[var51];
                                        class148.field1946[1] = var47[var51];
                                        class148.field1946[2] = var49[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class148.field1946[var74];
                                        int var76 = var75 - var20 * 2 & 0x7;
                                        int var77 = this.field590[var75];
                                        int var78 = this.field602[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var78;
                                            var79 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var80 = var77;
                                            var79 = 128 - var78;
                                        } else {
                                            var80 = var78;
                                            var79 = var77;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class230.field3097[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg6.method216(var81, var82) - arg5.method216(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class230.field3097[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg5.method216(var83, var84) - arg6.method216(var83, var84);
                                            } else if (arg2 != null && !class61.field706[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg2.method216(var85, var86) - arg5.method216(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class32.field330[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class349.field4643[var76];
                                            }
                                            var59[var52] = class505.field7339[var76];
                                            var58[var52] = class185.field2409[var76];
                                            var57[var52] = class475.field7037[var76];
                                        } else {
                                            if (var17 && class230.field3097[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var67.field6720;
                                                var59[var52] = var67.field6717;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var68.field6720;
                                                var59[var52] = var68.field6717;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var69.field6720;
                                                var59[var52] = var69.field6717;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var70.field6720;
                                                var59[var52] = var70.field6717;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 < 64) {
                                                        var58[var52] = var70.field6720;
                                                        var59[var52] = var70.field6717;
                                                    } else {
                                                        var58[var52] = var69.field6720;
                                                        var59[var52] = var69.field6717;
                                                    }
                                                } else if (var80 >= 64) {
                                                    var58[var52] = var68.field6720;
                                                    var59[var52] = var68.field6717;
                                                } else {
                                                    var58[var52] = var67.field6720;
                                                    var59[var52] = var67.field6717;
                                                }
                                                int var87 = class73.method428(64, var79 << 7 >> 7, arg4[var12][var14], arg4[var13][var14]);
                                                int var88 = class73.method428(127, var79 << 7 >> 7, arg4[var12][var15], arg4[var13][var15]);
                                                var57[var52] = class73.method428(126, var80 << 7 >> 7, var87, var88);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field6709) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg5.method217(var12, var14);
                            int var90 = arg5.method217(var13, var14);
                            int var91 = arg5.method217(var13, var15);
                            int var92 = arg5.method217(var12, var15);
                            if (arg3 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field2677) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field591[arg3][var12][var14] = (byte) class219.method1381(this.field591[arg3][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field598) {
                                var94 = class246.method1524(var12, var14);
                                var95 = class361.method2131(var12, var14);
                                var96 = class531.method3156(var12, var14);
                            }
                            arg5.method207(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class469.method2862(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[[ILza;Lya;Lya;ILya;)V", line = 1220)
    private final void method310(int arg0, int[][] arg1, class287 arg2, class38 arg3, class38 arg4, int arg5, class38 arg6) {
        field586++;
        int var8 = 0;
        if (arg5 >= -92) {
            this.field601 = -29;
        }
        while (this.field607 > var8) {
            for (int var9 = 0; var9 < this.field609; var9++) {
                if (class443.field6456 == -1 || class90.method497(var8, var9, 0, arg0, class443.field6456)) {
                    byte var10 = this.field603[arg0][var8][var9];
                    byte var11 = this.field594[arg0][var8][var9];
                    int var12 = this.field585[arg0][var8][var9] & 0xFF;
                    int var13 = this.field605[arg0][var8][var9] & 0xFF;
                    class200 var14 = var12 == 0 ? null : this.field592.method2895(36, var12 - 1);
                    class451 var15 = var13 == 0 ? null : this.field584.method2180(var13 - 1, (byte) 122);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class213.field2921[var10];
                        var17 = var14 == null ? 0 : class373.field5066[var10];
                    } else if (var14 != null) {
                        var17 = class373.field5066[var10];
                    } else if (var15 != null) {
                        var16 = class373.field5066[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field2671 == -1 && var14.field2676 == -1 && var14.field2672 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg2.method1144() ? var14.field2672 : var14.field2681;
                            if (class35.field357) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field2674;
                                if (var14.field2671 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field2671;
                                }
                                if (var14.field2676 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field2676;
                                }
                                var19++;
                            }
                            if (!this.field598 && arg0 == 0) {
                                class431.method2648(var8, var9, var14.field2663, var14.field2675 * 8, var14.field2673);
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
                            int var28 = var15.field6720;
                            if (class35.field357) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field6717;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field590.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field590[var36];
                            int var46 = this.field602[var36];
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
                            if (var34 != null && class230.field3097[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg3.method216(var49, var50) - arg6.method216(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class230.field3097[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method216(var51, var52) - arg3.method216(var51, var52);
                                } else if (arg4 != null && !class61.field706[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method216(var53, var54) - arg6.method216(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method217(var8, var9);
                        int var38 = arg6.method217(var8 + 1, var9);
                        int var39 = arg6.method217(var8 + 1, var9 + 1);
                        int var40 = arg6.method217(var8, var9 + 1);
                        if (arg0 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field2677) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field591[arg0][var8][var9] = (byte) class219.method1381(this.field591[arg0][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field598) {
                            var42 = class246.method1524(var8, var9);
                            var43 = class361.method2131(var8, var9);
                            var44 = class531.method3156(var8, var9);
                        }
                        arg6.method222(var8, var9, var32, var34, var33, var35, class496.field7236[var10], class530.field7767[var10], class163.field2120[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class469.method2862(arg0, var8, var9);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lza;[[[I[Las;Z)V", line = 1534)
    public final void method311(class287 arg0, int[][][] arg1, class106[] arg2, boolean arg3) {
        field589++;
        if (!this.field598) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field607; var6++) {
                    for (int var7 = 0; var7 < this.field609; var7++) {
                        if ((class252.field3358[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class252.field3358[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method642(false, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        if (arg3) {
            this.field584 = null;
        }
        for (int var9 = 0; var9 < this.field601; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field598) {
                if (class179.field2321) {
                    var10 |= 0x2;
                }
                if (class325.field4333) {
                    var11 |= 0x8;
                }
                if (class151.field1971 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class456.field6809) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class179.field2321) {
                var11 |= 0x7;
            }
            if (!class510.field7433) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || var9 >= arg1.length ? this.field608[var9] : arg1[var9];
            class349.method2056(var9, arg0.method1214(this.field607, this.field609, this.field608[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IIIZLua;Lum;)V", line = 2504)
    public class52(int arg0, int arg1, int arg2, boolean arg3, class474 arg4, class366 arg5) {
        this.field584 = arg5;
        this.field607 = arg1;
        this.field601 = arg0;
        this.field609 = arg2;
        this.field598 = arg3;
        this.field592 = arg4;
        this.field603 = new byte[this.field601][this.field607][this.field609];
        this.field591 = new byte[this.field601][this.field607 + 1][this.field609 + 1];
        this.field605 = new byte[this.field601][this.field607][this.field609];
        this.field585 = new byte[this.field601][this.field607][this.field609];
        this.field608 = new int[this.field601][this.field607 + 1][this.field609 + 1];
        this.field594 = new byte[this.field601][this.field607][this.field609];
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lza;IILgj;I[[B[[BII[ZB[[BLvt;I)V", line = 1636)
    private final void method312(class287 arg0, int arg1, int arg2, class451 arg3, int arg4, byte[][] arg5, byte[][] arg6, int arg7, int arg8, boolean[] arg9, byte arg10, byte[][] arg11, class200 arg12, int arg13) {
        field595++;
        boolean[] var15 = arg12 != null && arg12.field2668 ? class257.field3425[arg2] : class189.field2450[arg2];
        int var16 = 25 % ((-arg10 - 39) / 59);
        if (arg4 > 0) {
            if (arg13 > 0) {
                int var17 = arg11[arg13 - 1][arg4 - 1] & 0xFF;
                if (var17 > 0) {
                    class200 var18 = this.field592.method2895(79, var17 - 1);
                    if (var18.field2671 != -1 && var18.field2668) {
                        byte var19 = arg5[arg13 - 1][arg4 - 1];
                        int var20 = (arg6[arg13 - 1][arg4 - 1] * 2) + 4 & 0x7;
                        int var21 = class134.method808(arg0, var18, 71);
                        if (class230.field3097[var19][var20]) {
                            class475.field7037[0] = var18.field2671;
                            class349.field4643[0] = var21;
                            class185.field2409[0] = arg0.method1144() ? var18.field2672 : var18.field2681;
                            class505.field7339[0] = var18.field2674;
                            class32.field330[0] = var18.field2679;
                            class488.field7159[0] = 256;
                        }
                    }
                }
            }
            if (arg13 < arg1 - 1) {
                int var22 = arg11[arg13 + 1][arg4 - 1] & 0xFF;
                if (var22 > 0) {
                    class200 var23 = this.field592.method2895(61, var22 - 1);
                    if (var23.field2671 != -1 && var23.field2668) {
                        byte var24 = arg5[arg13 + 1][arg4 - 1];
                        int var25 = (arg6[arg13 + 1][arg4 - 1] * 2) + 6 & 0x7;
                        int var26 = class134.method808(arg0, var23, 106);
                        if (class230.field3097[var24][var25]) {
                            class475.field7037[2] = var23.field2671;
                            class349.field4643[2] = var26;
                            class185.field2409[2] = arg0.method1144() ? var23.field2672 : var23.field2681;
                            class505.field7339[2] = var23.field2674;
                            class32.field330[2] = var23.field2679;
                            class488.field7159[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg4 < (arg7 - 1)) {
            if (arg13 > 0) {
                int var27 = arg11[arg13 - 1][arg4 + 1] & 0xFF;
                if (var27 > 0) {
                    class200 var28 = this.field592.method2895(115, var27 - 1);
                    if (var28.field2671 != -1 && var28.field2668) {
                        byte var29 = arg5[arg13 - 1][arg4 + 1];
                        int var30 = arg6[arg13 - 1][arg4 + 1] * 2 + 2 & 0x7;
                        int var31 = class134.method808(arg0, var28, 59);
                        if (class230.field3097[var29][var30]) {
                            class475.field7037[6] = var28.field2671;
                            class349.field4643[6] = var31;
                            class185.field2409[6] = arg0.method1144() ? var28.field2672 : var28.field2681;
                            class505.field7339[6] = var28.field2674;
                            class32.field330[6] = var28.field2679;
                            class488.field7159[6] = 64;
                        }
                    }
                }
            }
            if ((arg1 - 1) > arg13) {
                int var32 = arg11[arg13 + 1][arg4 + 1] & 0xFF;
                if (var32 > 0) {
                    class200 var33 = this.field592.method2895(39, var32 - 1);
                    if (var33.field2671 != -1 && var33.field2668) {
                        byte var34 = arg5[arg13 + 1][arg4 + 1];
                        int var35 = arg6[arg13 + 1][arg4 + 1] * 2 & 0x7;
                        int var36 = class134.method808(arg0, var33, 106);
                        if (class230.field3097[var34][var35]) {
                            class475.field7037[4] = var33.field2671;
                            class349.field4643[4] = var36;
                            class185.field2409[4] = arg0.method1144() ? var33.field2672 : var33.field2681;
                            class505.field7339[4] = var33.field2674;
                            class32.field330[4] = var33.field2679;
                            class488.field7159[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg4 > 0) {
            int var37 = arg11[arg13][arg4 - 1] & 0xFF;
            if (var37 > 0) {
                class200 var38 = this.field592.method2895(120, var37 - 1);
                if (var38.field2671 != -1) {
                    byte var39 = arg5[arg13][arg4 - 1];
                    byte var40 = arg6[arg13][arg4 - 1];
                    if (var38.field2668) {
                        int var41 = 2;
                        int var42 = var40 * 2 + 4;
                        int var43 = class134.method808(arg0, var38, 64);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var41 &= 0x7;
                            var42 &= 0x7;
                            if (class230.field3097[var39][var42] && var38.field2679 >= class32.field330[var41]) {
                                class475.field7037[var41] = var38.field2671;
                                class349.field4643[var41] = var43;
                                class185.field2409[var41] = arg0.method1144() ? var38.field2672 : var38.field2681;
                                class505.field7339[var41] = var38.field2674;
                                if (class32.field330[var41] == var38.field2679) {
                                    class488.field7159[var41] = class219.method1381(class488.field7159[var41], 32);
                                } else {
                                    class488.field7159[var41] = 32;
                                }
                                class32.field330[var41] = var38.field2679;
                            }
                            var42++;
                            var41--;
                        }
                        if (!var15[arg8 & 0x3]) {
                            arg9[0] = class257.field3425[var39][class95.method534(var40 + 2, 3)];
                        }
                    } else if (!var15[arg8 & 0x3]) {
                        arg9[0] = class189.field2450[var39][class95.method534(var40 + 2, 3)];
                    }
                }
            }
        }
        if (arg4 < (arg7 - 1)) {
            int var45 = arg11[arg13][arg4 + 1] & 0xFF;
            if (var45 > 0) {
                class200 var46 = this.field592.method2895(68, var45 - 1);
                if (var46.field2671 != -1) {
                    byte var47 = arg5[arg13][arg4 + 1];
                    byte var48 = arg6[arg13][arg4 + 1];
                    if (var46.field2668) {
                        int var49 = 4;
                        int var50 = var48 * 2 + 2;
                        int var51 = class134.method808(arg0, var46, 124);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class230.field3097[var47][var50] && class32.field330[var49] <= var46.field2679) {
                                class475.field7037[var49] = var46.field2671;
                                class349.field4643[var49] = var51;
                                class185.field2409[var49] = arg0.method1144() ? var46.field2672 : var46.field2681;
                                class505.field7339[var49] = var46.field2674;
                                if (class32.field330[var49] == var46.field2679) {
                                    class488.field7159[var49] = class219.method1381(class488.field7159[var49], 16);
                                } else {
                                    class488.field7159[var49] = 16;
                                }
                                class32.field330[var49] = var46.field2679;
                            }
                            var50--;
                            var49++;
                        }
                        if (!var15[arg8 + 2 & 0x3]) {
                            arg9[2] = class257.field3425[var47][class95.method534(var48, 3)];
                        }
                    } else if (!var15[arg8 + 2 & 0x3]) {
                        arg9[2] = class189.field2450[var47][class95.method534(3, var48)];
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var53 = arg11[arg13 - 1][arg4] & 0xFF;
            if (var53 > 0) {
                class200 var54 = this.field592.method2895(116, var53 - 1);
                if (var54.field2671 != -1) {
                    byte var55 = arg5[arg13 - 1][arg4];
                    byte var56 = arg6[arg13 - 1][arg4];
                    if (var54.field2668) {
                        int var57 = 6;
                        int var58 = var56 * 2 + 4;
                        int var59 = class134.method808(arg0, var54, 70);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var57 &= 0x7;
                            var58 &= 0x7;
                            if (class230.field3097[var55][var58] && class32.field330[var57] <= var54.field2679) {
                                class475.field7037[var57] = var54.field2671;
                                class349.field4643[var57] = var59;
                                class185.field2409[var57] = arg0.method1144() ? var54.field2672 : var54.field2681;
                                class505.field7339[var57] = var54.field2674;
                                if (class32.field330[var57] == var54.field2679) {
                                    class488.field7159[var57] = class219.method1381(class488.field7159[var57], 8);
                                } else {
                                    class488.field7159[var57] = 8;
                                }
                                class32.field330[var57] = var54.field2679;
                            }
                            var58--;
                            var57++;
                        }
                        if (!var15[arg8 + 3 & 0x3]) {
                            arg9[3] = class257.field3425[var55][class95.method534(var56 + 1, 3)];
                        }
                    } else if (!var15[arg8 + 3 & 0x3]) {
                        arg9[3] = class189.field2450[var55][class95.method534(var56 + 1, 3)];
                    }
                }
            }
        }
        if (arg13 < (arg1 - 1)) {
            int var61 = arg11[arg13 + 1][arg4] & 0xFF;
            if (var61 > 0) {
                class200 var62 = this.field592.method2895(66, var61 - 1);
                if (var62.field2671 != -1) {
                    byte var63 = arg5[arg13 + 1][arg4];
                    byte var64 = arg6[arg13 + 1][arg4];
                    if (var62.field2668) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class134.method808(arg0, var62, 39);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var66 &= 0x7;
                            var65 &= 0x7;
                            if (class230.field3097[var63][var66] && class32.field330[var65] <= var62.field2679) {
                                class475.field7037[var65] = var62.field2671;
                                class349.field4643[var65] = var67;
                                class185.field2409[var65] = arg0.method1144() ? var62.field2672 : var62.field2681;
                                class505.field7339[var65] = var62.field2674;
                                if (class32.field330[var65] == var62.field2679) {
                                    class488.field7159[var65] = class219.method1381(class488.field7159[var65], 4);
                                } else {
                                    class488.field7159[var65] = 4;
                                }
                                class32.field330[var65] = var62.field2679;
                            }
                            var65--;
                            var66++;
                        }
                        if (!var15[arg8 + 1 & 0x3]) {
                            arg9[1] = class257.field3425[var63][class95.method534(3, var64 + 3)];
                        }
                    } else if (!var15[arg8 + 1 & 0x3]) {
                        arg9[1] = class189.field2450[var63][class95.method534(var64 + 3, 3)];
                    }
                }
            }
        }
        if (arg12 == null) {
            return;
        }
        int var69 = class134.method808(arg0, arg12, 97);
        if (!arg12.field2668) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - (arg8 * 2) & 0x7;
            if (class230.field3097[arg2][var70] && arg12.field2679 >= class32.field330[var71]) {
                class475.field7037[var71] = arg12.field2671;
                class349.field4643[var71] = var69;
                class185.field2409[var71] = arg0.method1144() ? arg12.field2672 : arg12.field2681;
                class505.field7339[var71] = arg12.field2674;
                if (class32.field330[var71] == arg12.field2679) {
                    class488.field7159[var71] = class219.method1381(class488.field7159[var71], 2);
                } else {
                    class488.field7159[var71] = 2;
                }
                class32.field330[var71] = arg12.field2679;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIBIILug;II[Las;I)V", line = 2110)
    public final void method313(int arg0, int arg1, byte arg2, int arg3, int arg4, class396 arg5, int arg6, int arg7, class106[] arg8, int arg9) {
        field604++;
        int var11 = (arg1 & 0x7) * 8;
        if (!this.field598) {
            class106 var12 = arg8[arg6];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class116.method698(var14 & 0x7, arg3, (byte) -70, var13 & 0x7) + arg9;
                    int var16 = class127.method773(arg3, 7, var14 & 0x7, var13 & 0x7) + arg7;
                    if (var15 > 0 && (this.field607 - 1) > var15 && var16 > 0 && (this.field609 - 1) > var16) {
                        var12.method641((byte) -87, var15, var16);
                    }
                }
            }
        }
        int var17 = (arg4 & 0x7) * 8;
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        if (arg2 <= 101) {
            this.method310(39, null, null, null, null, -104, null);
        }
        int var19 = (arg4 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field601; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg0 != var22 || var11 > var23 || var23 > (var11 + 8) || var24 < var17 || (var17 + 8) < var24) {
                        this.method306(-1, 0, 0, 0, 0, 0, 0, false, arg5, -1, -1);
                    } else if (var11 + 8 == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg3 == 0) {
                            var31 = arg7 - (var17 - var24);
                            var32 = -var11 - (-var23 - arg9);
                        } else if (arg3 == 1) {
                            var31 = var11 - (var23 - arg7 - 8);
                            var32 = -var17 - (-var24 - arg9);
                        } else if (arg3 == 2) {
                            var32 = var11 + arg9 + 8 - var23;
                            var31 = var17 + arg7 + 8 - var24;
                        } else {
                            var31 = var23 + arg7 - var11;
                            var32 = arg9 + 8 - (-var17 + var24);
                        }
                        this.method306(-1, var18 + var23, var19 + var24, 0, 0, arg6, 0, true, arg5, var32, var31);
                    } else {
                        int var25 = class116.method698(var24 & 0x7, arg3, (byte) -70, var23 & 0x7) + arg9;
                        int var26 = arg7 + class127.method773(arg3, 7, var24 & 0x7, var23 & 0x7);
                        this.method306(-1, var18 + var23, var19 + var24, var20, var21, arg6, arg3, false, arg5, var25, var26);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg3 == 0) {
                                var30 = var28 + arg7 - var17;
                                var29 = -var11 - (-var27 - arg9);
                            } else if (arg3 == 1) {
                                var30 = var11 + arg7 + 8 - var27;
                                var29 = var28 + arg9 - var17;
                            } else if (arg3 == 2) {
                                var29 = var11 + arg9 + 8 - var27;
                                var30 = var17 + arg7 + 8 - var28;
                            } else {
                                var29 = 8 - var28 - (-var17 - arg9);
                                var30 = arg7 - (var11 - var27);
                            }
                            if (var29 >= 0 && var29 < this.field607 && var30 >= 0 && var30 < this.field609) {
                                this.field608[arg6][var29][var30] = this.field608[arg6][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V", line = 2291)
    public final void method314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 0;
        int var7 = -15 % ((arg0 - 24) / 52);
        while (var6 < this.field601) {
            this.method304(-1, arg1, arg3, arg2, arg4, var6);
            var6++;
        }
        field582++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 2311)
    public static void method315(int arg0) {
        field583 = null;
        if (arg0 != -1512707417) {
            method308((byte) -97);
        }
        field606 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLya;Lya;Lza;)V", line = 2323)
    public final void method316(byte arg0, class38 arg1, class38 arg2, class287 arg3) {
        field600++;
        if (class149.field1962 == null || class149.field1962.length != this.field609) {
            class212.field2872 = new int[this.field609];
            class149.field1962 = new int[this.field609];
            class132.field1746 = new int[this.field609];
            class291.field3845 = new int[this.field609];
            class132.field1749 = new int[this.field609];
        }
        int[][] var5 = new int[this.field607][this.field609];
        for (int var6 = 0; var6 < this.field601; var6++) {
            for (int var9 = 0; var9 < this.field609; var9++) {
                class149.field1962[var9] = 0;
                class132.field1749[var9] = 0;
                class291.field3845[var9] = 0;
                class212.field2872[var9] = 0;
                class132.field1746[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field607; var10++) {
                for (int var11 = 0; var11 < this.field609; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (this.field607 > var20) {
                        int var21 = this.field605[var6][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class451 var22 = this.field584.method2180(var21 - 1, (byte) -101);
                            class149.field1962[var11] += var22.field6711;
                            class132.field1749[var11] += var22.field6713;
                            class291.field3845[var11] += var22.field6719;
                            class212.field2872[var11] += var22.field6712;
                            var10002 = class132.field1746[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field605[var6][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class451 var25 = this.field584.method2180(var24 - 1, (byte) 20);
                            class149.field1962[var11] -= var25.field6711;
                            class132.field1749[var11] -= var25.field6713;
                            class291.field3845[var11] -= var25.field6719;
                            class212.field2872[var11] -= var25.field6712;
                            var10002 = class132.field1746[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field609; var17++) {
                        int var18 = var17 + 5;
                        if (this.field609 > var18) {
                            var13 += class132.field1749[var18];
                            var12 += class149.field1962[var18];
                            var16 += class132.field1746[var18];
                            var14 += class291.field3845[var18];
                            var15 += class212.field2872[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var15 -= class212.field2872[var19];
                            var14 -= class291.field3845[var19];
                            var12 -= class149.field1962[var19];
                            var13 -= class132.field1749[var19];
                            var16 -= class132.field1746[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class377.method2284(var13 / var16, -25669, var14 / var16, var12 * 256 / var15);
                        }
                    }
                }
            }
            if (class534.field7853) {
                this.method309(arg3, (byte) 126, var6 == 0 ? arg1 : null, var6, var5, class152.field1993[var6], var6 == 0 ? arg2 : null);
            } else {
                this.method310(var6, var5, arg3, var6 == 0 ? arg2 : null, var6 == 0 ? arg1 : null, -100, class152.field1993[var6]);
            }
            this.field605[var6] = null;
            this.field585[var6] = null;
            this.field603[var6] = null;
            this.field594[var6] = null;
        }
        if (!this.field598) {
            if (class151.field1971 != 0) {
                class433.method2666();
            }
            if (class179.field2321) {
                class260.method1597();
            }
        }
        int var7 = -57 / ((45 - arg0) / 40);
        for (int var8 = 0; var8 < this.field601; var8++) {
            class152.field1993[var8].method206();
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V", line = 2524)
    public static final void method317(byte arg0) {
        class509 var1 = class374.field5067;
        synchronized (class374.field5067) {
            if (arg0 != -73) {
                method315(-82);
            }
            class374.field5067.method3034((byte) 90);
        }
        field612++;
    }
}
