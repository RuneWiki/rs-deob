import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class63 {

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "[I")
    private int[] field884 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[I")
    private int[] field885 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Z")
    public boolean field870;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lvu;")
    private class195 field871;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lbt;")
    private class114 field868;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[[[B")
    public byte[][][] field867;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[[[B")
    private byte[][][] field888;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[[[B")
    private byte[][][] field865;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "[[[B")
    private byte[][][] field887;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[[[B")
    private byte[][][] field877;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[[[I")
    public int[][][] field881;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[[[B")
    public byte[][][] field886;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lqa;BLsa;Lsa;)V", line = 8)
    public final void method492(class167 arg0, byte arg1, class542 arg2, class542 arg3) {
        field873++;
        if (class359.field5104 == null || class359.field5104.length != this.field880) {
            class399.field5940 = new int[this.field880];
            class173.field2512 = new int[this.field880];
            class371.field5363 = new int[this.field880];
            class359.field5104 = new int[this.field880];
            class173.field2513 = new int[this.field880];
        }
        int[][] var5 = new int[this.field872][this.field880];
        for (int var6 = 0; var6 < this.field882; var6++) {
            for (int var8 = 0; var8 < this.field880; var8++) {
                class359.field5104[var8] = 0;
                class173.field2513[var8] = 0;
                class399.field5940[var8] = 0;
                class371.field5363[var8] = 0;
                class173.field2512[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field872; var9++) {
                for (int var10 = 0; var10 < this.field880; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field872 > var19) {
                        int var20 = this.field888[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class156 var21 = this.field868.method940(-42, var20 - 1);
                            class359.field5104[var10] += var21.field2354;
                            class173.field2513[var10] += var21.field2347;
                            class399.field5940[var10] += var21.field2349;
                            class371.field5363[var10] += var21.field2346;
                            var10002 = class173.field2512[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field888[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class156 var24 = this.field868.method940(-59, var23 - 1);
                            class359.field5104[var10] -= var24.field2354;
                            class173.field2513[var10] -= var24.field2347;
                            class399.field5940[var10] -= var24.field2349;
                            class371.field5363[var10] -= var24.field2346;
                            var10002 = class173.field2512[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field880; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field880) {
                            var13 += class399.field5940[var17];
                            var14 += class371.field5363[var17];
                            var12 += class173.field2513[var17];
                            var11 += class359.field5104[var17];
                            var15 += class173.field2512[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class173.field2513[var18];
                            var13 -= class399.field5940[var18];
                            var14 -= class371.field5363[var18];
                            var15 -= class173.field2512[var18];
                            var11 -= class359.field5104[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class571.method3263(23061, var13 / var15, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class609.field8657) {
                this.method495(var5, class88.field1594[var6], var6 == 0 ? arg3 : null, arg0, var6 == 0 ? arg2 : null, var6, 91);
            } else {
                this.method500(var5, 98, class88.field1594[var6], var6 == 0 ? arg2 : null, var6 == 0 ? arg3 : null, arg0, var6);
            }
            this.field888[var6] = null;
            this.field865[var6] = null;
            this.field877[var6] = null;
            this.field887[var6] = null;
        }
        if (arg1 >= -90) {
            method501(null, null, -72);
        }
        if (!this.field870) {
            if (class216.field3265 != 0) {
                class417.method2516();
            }
            if (class128.field2092) {
                class280.method1796();
            }
        }
        for (int var7 = 0; var7 < this.field882; var7++) {
            class88.field1594[var7].method701();
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V", line = 187)
    private final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5;
        if (arg2 != 1) {
            this.method497(11, -90, -53, 14, (byte) 90);
        }
        while (var7 < arg4 + arg5) {
            for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
                if (var10 >= 0 && var10 < this.field872 && var7 >= 0 && var7 < this.field880) {
                    this.field881[arg0][var10][var7] = arg0 > 0 ? this.field881[arg0 - 1][var10][var7] - 240 : 0;
                }
            }
            var7++;
        }
        field869++;
        if (arg3 > 0 && arg3 < this.field872) {
            for (int var8 = arg5 + 1; var8 < (arg4 + arg5); var8++) {
                if (var8 >= 0 && var8 < this.field880) {
                    this.field881[arg0][arg3][var8] = this.field881[arg0][arg3 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && this.field880 > arg5) {
            for (int var9 = arg3 + 1; var9 < arg1 + arg3; var9++) {
                if (var9 >= 0 && this.field872 > var9) {
                    this.field881[arg0][var9][arg5] = this.field881[arg0][var9][arg5 - 1];
                }
            }
        }
        if (arg3 < 0 || arg5 < 0 || arg3 >= this.field872 || arg5 >= this.field880) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 <= 0 || this.field881[arg0][arg3 - 1][arg5] == 0) {
                if (arg5 > 0 && this.field881[arg0][arg3][arg5 - 1] != 0) {
                    this.field881[arg0][arg3][arg5] = this.field881[arg0][arg3][arg5 - 1];
                    return;
                }
                if (arg3 > 0 && arg5 > 0 && this.field881[arg0][arg3 - 1][arg5 - 1] != 0) {
                    this.field881[arg0][arg3][arg5] = this.field881[arg0][arg3 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field881[arg0][arg3][arg5] = this.field881[arg0][arg3 - 1][arg5];
        } else if (arg3 <= 0 || this.field881[arg0 - 1][arg3 - 1][arg5] == this.field881[arg0][arg3 - 1][arg5]) {
            if (arg5 > 0 && this.field881[arg0 - 1][arg3][arg5 - 1] != this.field881[arg0][arg3][arg5 - 1]) {
                this.field881[arg0][arg3][arg5] = this.field881[arg0][arg3][arg5 - 1];
                return;
            }
            if (arg3 > 0 && arg5 > 0 && this.field881[arg0 - 1][arg3 - 1][arg5 - 1] != this.field881[arg0][arg3 - 1][arg5 - 1]) {
                this.field881[arg0][arg3][arg5] = this.field881[arg0][arg3 - 1][arg5 - 1];
                return;
            }
        } else {
            this.field881[arg0][arg3][arg5] = this.field881[arg0][arg3 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lco;IBIIIZIIII)V", line = 285)
    private final void method494(class268 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field861++;
        if (arg8 == 1) {
            arg5 = 1;
        } else if (arg8 == 2) {
            arg10 = 1;
            arg5 = 1;
        } else if (arg8 == 3) {
            arg10 = 1;
        }
        if (arg2 < 84) {
            this.method496(-38, null, -127, -59, -121, 0, null, null, null, null, -84, -46, null, null);
        }
        if (arg7 < 0 || this.field872 <= arg7 || arg4 < 0 || arg4 >= this.field880) {
            while (true) {
                int var14 = arg0.method1738(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg0.method1738(255);
                    return;
                }
                if (var14 <= 49) {
                    arg0.method1738(255);
                }
            }
        }
        if (!this.field870 && !arg6) {
            class104.field1755[arg9][arg7][arg4] = 0;
        }
        while (true) {
            int var12 = arg0.method1738(255);
            if (var12 == 0) {
                if (this.field870) {
                    this.field881[0][arg7 + arg10][arg4 + arg5] = 0;
                    return;
                } else if (arg9 == 0) {
                    this.field881[0][arg7 + arg10][arg4 + arg5] = -class575.method3291(arg3 + 932731, 556238 - -arg1, (byte) -65) * 8 << 0;
                    return;
                } else {
                    this.field881[arg9][arg7 + arg10][arg4 + arg5] = this.field881[arg9 - 1][arg7 + arg10][arg4 + arg5] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg0.method1738(255);
                if (this.field870) {
                    this.field881[0][arg7 + arg10][arg4 + arg5] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg9 != 0) {
                    this.field881[arg9][arg7 + arg10][arg4 + arg5] = this.field881[arg9 - 1][arg7 + arg10][arg4 + arg5] - (var13 * 8 << 0);
                    return;
                }
                this.field881[0][arg7 + arg10][arg4 + arg5] = -var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg0.method1738(255);
                } else {
                    this.field865[arg9][arg7][arg4] = arg0.method1714(-31536);
                    this.field877[arg9][arg7][arg4] = (byte) ((var12 - 2) / 4);
                    this.field887[arg9][arg7][arg4] = (byte) class424.method2540(3, var12 + arg8 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field870 && !arg6) {
                    class104.field1755[arg9][arg7][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                this.field888[arg9][arg7][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[ILsa;Lsa;Lqa;Lsa;II)V", line = 414)
    private final void method495(int[][] arg0, class542 arg1, class542 arg2, class167 arg3, class542 arg4, int arg5, int arg6) {
        field864++;
        byte[][] var8 = this.field877[arg5];
        byte[][] var9 = this.field887[arg5];
        byte[][] var10 = this.field888[arg5];
        byte[][] var11 = this.field865[arg5];
        for (int var12 = 0; var12 < this.field872; var12++) {
            int var13 = this.field872 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field880; var14++) {
                int var15 = var14 < this.field880 - 1 ? var14 + 1 : var14;
                if (class581.field8287 == -1 || class85.method774(var14, var12, (byte) 51, class581.field8287, arg5)) {
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
                        class278 var26 = var21 == 0 ? null : this.field871.method1286(-85, var21 - 1);
                        class156 var27 = var22 == 0 ? null : this.field868.method940(-43, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class278 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4060 == -1 && var26.field4058 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4062;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field872 > var12 && var14 < this.field880) {
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
                                var34--;
                                var35--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
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
                                var37 = arg1.method694(var12, var14) - arg1.method694(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg1.method694(var13, var14) - arg1.method694(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class205.field2894[var39] = -1;
                            class5.field48[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4062 ? class17.field265[var19] : class629.field8849[var19];
                        this.method496(this.field872, var18, var12, -1, this.field880, var20, var26, var8, var27, var11, var14, var19, arg3, var9);
                        boolean var41 = var26 != null && var26.field4060 != var26.field4058;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class205.field2894[var42] >= 0 && class580.field8275[var42] != class194.field2794[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class335.method2062(var18[1], class424.method2540(class5.field48[4], class5.field48[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class335.method2062(var18[3], class424.method2540(class5.field48[6], class5.field48[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class335.method2062(var18[0], class424.method2540(class5.field48[2], class5.field48[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class335.method2062(var18[2], class424.method2540(class5.field48[6], class5.field48[4]) == 0);
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
                            var47 = var27 == null ? 0 : class639.field9280[var19];
                            var45 = var26 == null ? 0 : class597.field8498[var19];
                            var49 = class187.field2702[var19];
                            var46 = class207.field2933[var19];
                            var48 = class237.field3477[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class166.field2429[var19];
                            var46 = class13.field141[var19];
                            var44 = class441.field6442[var19];
                            var47 = var27 == null ? 0 : class629.field8850[var19];
                            var48 = class172.field2498[var19];
                            var49 = class533.field7453[var19];
                        } else {
                            var47 = var27 == null ? 0 : class499.field6988[var19];
                            var49 = class322.field4662[var19];
                            var46 = class175.field2579[var19];
                            var44 = class589.field8374[var19];
                            var48 = class355.field5076[var19];
                            var45 = var26 == null ? 0 : class523.field7266[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class636.method3673(arg5, var12, var14);
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
                            int[] var61 = arg4 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4060;
                                var63 = arg3.method407() ? var26.field4064 : var26.field4063;
                                var64 = var26.field4061;
                                int var65 = class584.method3342(arg3, 6, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 1;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 1;
                                        class416.field6124[4] = var48[var51];
                                        class416.field6124[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 5;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 5;
                                        class416.field6124[4] = var48[var51];
                                        var98 = 6;
                                        class416.field6124[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 3;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 3;
                                        class416.field6124[4] = var48[var51];
                                        class416.field6124[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 7;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 7;
                                        class416.field6124[4] = var48[var51];
                                        class416.field6124[5] = var49[var51];
                                        var98 = 6;
                                    } else {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = var48[var51];
                                        class416.field6124[2] = var49[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class416.field6124[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field884[var100];
                                        int var103 = this.field885[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var102;
                                            var104 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var104 = var102;
                                            var105 = 128 - var103;
                                        } else {
                                            var104 = var103;
                                            var105 = var102;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class201.field2843[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg4.method695(var106, var107) - arg1.method695(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class201.field2843[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg1.method695(var108, var109) - arg4.method695(var108, var109);
                                            } else if (arg2 != null && !class54.field774[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg2.method695(var110, var111) - arg1.method695(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class205.field2894[var101] > var26.field4056) {
                                            if (var54 != null) {
                                                var54[var52] = class194.field2794[var101];
                                            }
                                            var59[var52] = class226.field3383[var101];
                                            var58[var52] = class193.field2781[var101];
                                            var57[var52] = class580.field8275[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg3.method407() ? var26.field4064 : var26.field4063;
                                            var59[var52] = var26.field4061;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field870 && arg5 == 0) {
                                    class26.method243(var12, var14, var26.field4070, var26.field4053 * 8, var26.field4059);
                                }
                                if (var19 != 12 && var26.field4060 != -1 && var26.field4055) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class597.field8498[var19];
                            } else if (var17) {
                                var51 += class166.field2429[var19];
                            } else {
                                var51 += class523.field7266[var19];
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
                                class156 var67 = this.field868.method940(-63, var22 - 1);
                                class156 var68 = this.field868.method940(-53, var23 - 1);
                                class156 var69 = this.field868.method940(-70, var24 - 1);
                                class156 var70 = this.field868.method940(-128, var25 - 1);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 1;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 1;
                                        class416.field6124[4] = var48[var51];
                                        class416.field6124[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 5;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 5;
                                        class416.field6124[4] = var48[var51];
                                        var73 = 6;
                                        class416.field6124[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 3;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 3;
                                        class416.field6124[4] = var48[var51];
                                        class416.field6124[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = 7;
                                        class416.field6124[2] = var49[var51];
                                        class416.field6124[3] = 7;
                                        class416.field6124[4] = var48[var51];
                                        class416.field6124[5] = var49[var51];
                                        var73 = 6;
                                    } else {
                                        class416.field6124[0] = var46[var51];
                                        class416.field6124[1] = var48[var51];
                                        class416.field6124[2] = var49[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class416.field6124[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field884[var75];
                                        int var78 = this.field885[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = var78;
                                            var79 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var77;
                                            var79 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class201.field2843[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg4.method695(var81, var82) - arg1.method695(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class201.field2843[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg1.method695(var83, var84) - arg4.method695(var83, var84);
                                            } else if (arg2 != null && !class54.field774[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg2.method695(var85, var86) - arg1.method695(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class205.field2894[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class194.field2794[var76];
                                            }
                                            var59[var52] = class226.field3383[var76];
                                            var58[var52] = class193.field2781[var76];
                                            var57[var52] = class580.field8275[var76];
                                        } else {
                                            if (var17 && class201.field2843[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var67.field2341;
                                                var59[var52] = var67.field2350;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var68.field2341;
                                                var59[var52] = var68.field2350;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var69.field2341;
                                                var59[var52] = var69.field2350;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var70.field2341;
                                                var59[var52] = var70.field2350;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 < 64) {
                                                        var58[var52] = var67.field2341;
                                                        var59[var52] = var67.field2350;
                                                    } else {
                                                        var58[var52] = var68.field2341;
                                                        var59[var52] = var68.field2350;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var69.field2341;
                                                    var59[var52] = var69.field2350;
                                                } else {
                                                    var58[var52] = var70.field2341;
                                                    var59[var52] = var70.field2350;
                                                }
                                                int var87 = class34.method307(var80 << 7 >> 7, arg0[var12][var14], false, arg0[var13][var14]);
                                                int var88 = class34.method307(var80 << 7 >> 7, arg0[var12][var15], false, arg0[var13][var15]);
                                                var57[var52] = class34.method307(var79 << 7 >> 7, var87, false, var88);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field2344) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg1.method694(var12, var14);
                            int var90 = arg1.method694(var13, var14);
                            int var91 = arg1.method694(var13, var15);
                            int var92 = arg1.method694(var12, var15);
                            if (arg5 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field4066) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field867[arg5][var12][var14] = (byte) class188.method1258(this.field867[arg5][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field870) {
                                var94 = class531.method2989(var12, var14);
                                var95 = class217.method1463(var12, var14);
                                var96 = class367.method2215(var12, var14);
                            }
                            arg1.method698(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class636.method3673(arg5, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg6 < 78) {
            this.method494(null, 0, (byte) 69, 42, -51, -47, true, -5, 99, 41, 1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[ZIIIILsb;[[BLaf;[[BIILqa;[[B)V", line = 1280)
    private final void method496(int arg0, boolean[] arg1, int arg2, int arg3, int arg4, int arg5, class278 arg6, byte[][] arg7, class156 arg8, byte[][] arg9, int arg10, int arg11, class167 arg12, byte[][] arg13) {
        field862++;
        boolean[] var15 = arg6 != null && arg6.field4062 ? class17.field265[arg11] : class629.field8849[arg11];
        if (arg10 > 0) {
            if (arg2 > 0) {
                int var16 = arg9[arg2 - 1][arg10 - 1] & 0xFF;
                if (var16 > 0) {
                    class278 var17 = this.field871.method1286(-101, var16 - 1);
                    if (var17.field4060 != -1 && var17.field4062) {
                        byte var18 = arg7[arg2 - 1][arg10 - 1];
                        int var19 = arg13[arg2 - 1][arg10 - 1] * 2 + 4 & 0x7;
                        int var20 = class584.method3342(arg12, 6, var17);
                        if (class201.field2843[var18][var19]) {
                            class580.field8275[0] = var17.field4060;
                            class194.field2794[0] = var20;
                            class193.field2781[0] = arg12.method407() ? var17.field4064 : var17.field4063;
                            class226.field3383[0] = var17.field4061;
                            class205.field2894[0] = var17.field4056;
                            class5.field48[0] = 256;
                        }
                    }
                }
            }
            if ((arg0 - 1) > arg2) {
                int var21 = arg9[arg2 + 1][arg10 - 1] & 0xFF;
                if (var21 > 0) {
                    class278 var22 = this.field871.method1286(-98, var21 - 1);
                    if (var22.field4060 != -1 && var22.field4062) {
                        byte var23 = arg7[arg2 + 1][arg10 - 1];
                        int var24 = (arg13[arg2 + 1][arg10 - 1] * 2) + 6 & 0x7;
                        int var25 = class584.method3342(arg12, 6, var22);
                        if (class201.field2843[var23][var24]) {
                            class580.field8275[2] = var22.field4060;
                            class194.field2794[2] = var25;
                            class193.field2781[2] = arg12.method407() ? var22.field4064 : var22.field4063;
                            class226.field3383[2] = var22.field4061;
                            class205.field2894[2] = var22.field4056;
                            class5.field48[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg10 < arg4 - 1) {
            if (arg2 > 0) {
                int var26 = arg9[arg2 - 1][arg10 + 1] & 0xFF;
                if (var26 > 0) {
                    class278 var27 = this.field871.method1286(-128, var26 - 1);
                    if (var27.field4060 != -1 && var27.field4062) {
                        byte var28 = arg7[arg2 - 1][arg10 + 1];
                        int var29 = arg13[arg2 - 1][arg10 + 1] * 2 + 2 & 0x7;
                        int var30 = class584.method3342(arg12, arg3 + 7, var27);
                        if (class201.field2843[var28][var29]) {
                            class580.field8275[6] = var27.field4060;
                            class194.field2794[6] = var30;
                            class193.field2781[6] = arg12.method407() ? var27.field4064 : var27.field4063;
                            class226.field3383[6] = var27.field4061;
                            class205.field2894[6] = var27.field4056;
                            class5.field48[6] = 64;
                        }
                    }
                }
            }
            if (arg2 < arg0 - 1) {
                int var31 = arg9[arg2 + 1][arg10 + 1] & 0xFF;
                if (var31 > 0) {
                    class278 var32 = this.field871.method1286(-114, var31 - 1);
                    if (var32.field4060 != -1 && var32.field4062) {
                        byte var33 = arg7[arg2 + 1][arg10 + 1];
                        int var34 = -(-(arg13[arg2 + 1][arg10 + 1] * 2)) & 0x7;
                        int var35 = class584.method3342(arg12, 6, var32);
                        if (class201.field2843[var33][var34]) {
                            class580.field8275[4] = var32.field4060;
                            class194.field2794[4] = var35;
                            class193.field2781[4] = arg12.method407() ? var32.field4064 : var32.field4063;
                            class226.field3383[4] = var32.field4061;
                            class205.field2894[4] = var32.field4056;
                            class5.field48[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg10 > 0) {
            int var36 = arg9[arg2][arg10 - 1] & 0xFF;
            if (var36 > 0) {
                class278 var37 = this.field871.method1286(-94, var36 - 1);
                if (var37.field4060 != -1) {
                    byte var38 = arg7[arg2][arg10 - 1];
                    byte var39 = arg13[arg2][arg10 - 1];
                    if (var37.field4062) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class584.method3342(arg12, 6, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class201.field2843[var38][var41] && var37.field4056 >= class205.field2894[var40]) {
                                class580.field8275[var40] = var37.field4060;
                                class194.field2794[var40] = var42;
                                class193.field2781[var40] = arg12.method407() ? var37.field4064 : var37.field4063;
                                class226.field3383[var40] = var37.field4061;
                                if (class205.field2894[var40] == var37.field4056) {
                                    class5.field48[var40] = class188.method1258(class5.field48[var40], 32);
                                } else {
                                    class5.field48[var40] = 32;
                                }
                                class205.field2894[var40] = var37.field4056;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg5 & 0x3]) {
                            arg1[0] = class17.field265[var38][class424.method2540(3, var39 + 2)];
                        }
                    } else if (!var15[arg5 & 0x3]) {
                        arg1[0] = class629.field8849[var38][class424.method2540(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg4 - 1) > arg10) {
            int var44 = arg9[arg2][arg10 + 1] & 0xFF;
            if (var44 > 0) {
                class278 var45 = this.field871.method1286(-100, var44 - 1);
                if (var45.field4060 != -1) {
                    byte var46 = arg7[arg2][arg10 + 1];
                    byte var47 = arg13[arg2][arg10 + 1];
                    if (var45.field4062) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class584.method3342(arg12, arg3 ^ 0xFFFFFFF9, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class201.field2843[var46][var49] && var45.field4056 >= class205.field2894[var48]) {
                                class580.field8275[var48] = var45.field4060;
                                class194.field2794[var48] = var50;
                                class193.field2781[var48] = arg12.method407() ? var45.field4064 : var45.field4063;
                                class226.field3383[var48] = var45.field4061;
                                if (class205.field2894[var48] == var45.field4056) {
                                    class5.field48[var48] = class188.method1258(class5.field48[var48], 16);
                                } else {
                                    class5.field48[var48] = 16;
                                }
                                class205.field2894[var48] = var45.field4056;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg5 + 2 & 0x3]) {
                            arg1[2] = class17.field265[var46][class424.method2540(3, -(-var47))];
                        }
                    } else if (!var15[arg5 + 2 & 0x3]) {
                        arg1[2] = class629.field8849[var46][class424.method2540(3, var47)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var52 = arg9[arg2 - 1][arg10] & 0xFF;
            if (var52 > 0) {
                class278 var53 = this.field871.method1286(-91, var52 - 1);
                if (var53.field4060 != -1) {
                    byte var54 = arg7[arg2 - 1][arg10];
                    byte var55 = arg13[arg2 - 1][arg10];
                    if (var53.field4062) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class584.method3342(arg12, 6, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class201.field2843[var54][var57] && class205.field2894[var56] <= var53.field4056) {
                                class580.field8275[var56] = var53.field4060;
                                class194.field2794[var56] = var58;
                                class193.field2781[var56] = arg12.method407() ? var53.field4064 : var53.field4063;
                                class226.field3383[var56] = var53.field4061;
                                if (class205.field2894[var56] == var53.field4056) {
                                    class5.field48[var56] = class188.method1258(class5.field48[var56], 8);
                                } else {
                                    class5.field48[var56] = 8;
                                }
                                class205.field2894[var56] = var53.field4056;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg5 + 3 & 0x3]) {
                            arg1[3] = class17.field265[var54][class424.method2540(var55 + 1, 3)];
                        }
                    } else if (!var15[arg5 + 3 & 0x3]) {
                        arg1[3] = class629.field8849[var54][class424.method2540(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg0 + arg3 > arg2) {
            int var60 = arg9[arg2 + 1][arg10] & 0xFF;
            if (var60 > 0) {
                class278 var61 = this.field871.method1286(-88, var60 - 1);
                if (var61.field4060 != -1) {
                    byte var62 = arg7[arg2 + 1][arg10];
                    byte var63 = arg13[arg2 + 1][arg10];
                    if (var61.field4062) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class584.method3342(arg12, 6, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class201.field2843[var62][var65] && var61.field4056 >= class205.field2894[var64]) {
                                class580.field8275[var64] = var61.field4060;
                                class194.field2794[var64] = var66;
                                class193.field2781[var64] = arg12.method407() ? var61.field4064 : var61.field4063;
                                class226.field3383[var64] = var61.field4061;
                                if (class205.field2894[var64] == var61.field4056) {
                                    class5.field48[var64] = class188.method1258(class5.field48[var64], 4);
                                } else {
                                    class5.field48[var64] = 4;
                                }
                                class205.field2894[var64] = var61.field4056;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg5 + 1 & 0x3]) {
                            arg1[1] = class17.field265[var62][class424.method2540(3, var63 + 3)];
                        }
                    } else if (!var15[arg5 + 1 & 0x3]) {
                        arg1[1] = class629.field8849[var62][class424.method2540(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg6 == null) {
            return;
        }
        int var68 = class584.method3342(arg12, 6, arg6);
        if (!arg6.field4062) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg5 * 2) & 0x7;
            if (class201.field2843[arg11][var69] && class205.field2894[var70] <= arg6.field4056) {
                class580.field8275[var70] = arg6.field4060;
                class194.field2794[var70] = var68;
                class193.field2781[var70] = arg12.method407() ? arg6.field4064 : arg6.field4063;
                class226.field3383[var70] = arg6.field4061;
                if (class205.field2894[var70] == arg6.field4056) {
                    class5.field48[var70] = class188.method1258(class5.field48[var70], 2);
                } else {
                    class5.field48[var70] = 2;
                }
                class205.field2894[var70] = arg6.field4056;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIB)V", line = 1748)
    public final void method497(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        for (int var6 = 0; var6 < this.field882; var6++) {
            this.method493(var6, arg3, 1, arg0, arg2, arg1);
        }
        field875++;
        if (arg4 != -12) {
            this.method500(null, -119, null, null, null, null, -7);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 1768)
    public static final void method498(int arg0, int arg1) {
        if (arg0 != 1) {
            return;
        }
        field876++;
        if (class376.field5531 == 0) {
            class193.field2780.method180(-94, arg1);
        } else {
            class617.field8732 = arg1;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lqa;I[Laea;[[[I)V", line = 1786)
    public final void method499(class167 arg0, int arg1, class39[] arg2, int[][][] arg3) {
        field883++;
        if (!this.field870) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field872; var6++) {
                    for (int var7 = 0; var7 < this.field880; var7++) {
                        if ((class104.field1755[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class104.field1755[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method340((byte) 58, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = arg1; var9 < this.field882; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field870) {
                if (class128.field2092) {
                    var10 |= 0x2;
                }
                if (class308.field4438) {
                    var11 |= 0x8;
                }
                if (class216.field3265 != 0) {
                    var10 |= 0x1;
                    if (class170.field2491 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class128.field2092) {
                var11 |= 0x7;
            }
            if (!class43.field590) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field881[var9] : arg3[var9];
            class635.method3669(var9, arg0.method405(this.field872, this.field880, this.field881[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[IILsa;Lsa;Lsa;Lqa;I)V", line = 1886)
    private final void method500(int[][] arg0, int arg1, class542 arg2, class542 arg3, class542 arg4, class167 arg5, int arg6) {
        for (int var8 = 0; var8 < this.field872; var8++) {
            for (int var9 = 0; var9 < this.field880; var9++) {
                if (class581.field8287 == -1 || class85.method774(var9, var8, (byte) 51, class581.field8287, arg6)) {
                    byte var10 = this.field877[arg6][var8][var9];
                    byte var11 = this.field887[arg6][var8][var9];
                    int var12 = this.field865[arg6][var8][var9] & 0xFF;
                    int var13 = this.field888[arg6][var8][var9] & 0xFF;
                    class278 var14 = var12 == 0 ? null : this.field871.method1286(-100, var12 - 1);
                    class156 var15 = var13 == 0 ? null : this.field868.method940(-53, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class597.field8498[var10];
                        var16 = var15 == null ? 0 : class639.field9280[var10];
                    } else if (var14 != null) {
                        var17 = class597.field8498[var10];
                    } else if (var15 != null) {
                        var16 = class597.field8498[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4060 == -1 && var14.field4058 == -1 && var14.field4064 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg5.method407() ? var14.field4064 : var14.field4063;
                            if (class484.field6854) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4061;
                                if (var14.field4060 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4060;
                                }
                                if (var14.field4058 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field4058;
                                }
                                var19++;
                            }
                            if (!this.field870 && arg6 == 0) {
                                class26.method243(var8, var9, var14.field4070, var14.field4053 * 8, var14.field4059);
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
                            int var28 = var15.field2341;
                            if (class484.field6854) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field2350;
                                var20[var19] = arg0[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field884.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field884[var36];
                            int var46 = this.field885[var36];
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
                            if (var34 != null && class201.field2843[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg3.method695(var49, var50) - arg2.method695(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class201.field2843[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method695(var51, var52) - arg3.method695(var51, var52);
                                } else if (arg4 != null && !class54.field774[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method695(var53, var54) - arg2.method695(var53, var54);
                                }
                            }
                        }
                        int var37 = arg2.method694(var8, var9);
                        int var38 = arg2.method694(var8 + 1, var9);
                        int var39 = arg2.method694(var8 + 1, var9 + 1);
                        int var40 = arg2.method694(var8, var9 + 1);
                        if (arg6 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4066) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field867[arg6][var8][var9] = (byte) class188.method1258(this.field867[arg6][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field870) {
                            var42 = class531.method2989(var8, var9);
                            var43 = class217.method1463(var8, var9);
                            var44 = class367.method2215(var8, var9);
                        }
                        arg2.method686(var8, var9, var32, var34, var33, var35, class207.field2933[var10], class237.field3477[var10], class187.field2702[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class636.method3673(arg6, var8, var9);
                    }
                }
            }
        }
        if (arg1 <= 64) {
            this.method503(89, (byte) -28, 59, 78, 31, -97, null, null, 12, -73);
        }
        field878++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([I[JI)V", line = 2203)
    public static final void method501(int[] arg0, long[] arg1, int arg2) {
        int var3 = 56 % ((arg2 + 50) / 47);
        class316.method1948(0, arg1.length - 1, arg0, arg1, 23109);
        field863++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[Laea;IIILco;)V", line = 2213)
    public final void method502(int arg0, int arg1, class39[] arg2, int arg3, int arg4, int arg5, class268 arg6) {
        field874++;
        if (!this.field870) {
            for (int var8 = 0; var8 < 4; var8++) {
                class39 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && this.field872 > var12 && var13 >= 0 && this.field880 > var13) {
                            var9.method335(128, var12, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg5 + arg0;
        int var15 = arg1 + arg3;
        for (int var16 = arg4; var16 < this.field882; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method494(arg6, var15 + var18, (byte) 113, var14 + var17, var18 - -arg3, 0, false, var17 + arg0, 0, var16, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBIIIILco;[Laea;II)V", line = 2288)
    public final void method503(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class268 arg6, class39[] arg7, int arg8, int arg9) {
        field866++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field870) {
            class39 var13 = arg7[arg8];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg2 + class466.method2714(var14 & 0x7, var15 & 0x7, -23183, arg3);
                    int var17 = class335.method2063(-27960, var14 & 0x7, var15 & 0x7, arg3) + arg4;
                    if (var16 > 0 && var16 < this.field872 - 1 && var17 > 0 && this.field880 - 1 > var17) {
                        var13.method335(arg1 ^ 0xFFFFFF7B, var16, var17);
                    }
                }
            }
        }
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        if (arg1 != -5) {
            this.field872 = 21;
        }
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
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
        for (int var22 = 0; var22 < this.field882; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg0 == var22 && var11 <= var23 && var23 <= (var11 + 8) && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || var12 + 8 == var24) {
                            if (arg3 == 0) {
                                var26 = arg4 + var24 - var12;
                                var25 = arg2 + var23 - var11;
                            } else if (arg3 == 1) {
                                var25 = arg2 + var24 - var12;
                                var26 = arg4 + var11 + 8 - var23;
                            } else if (arg3 == 2) {
                                var26 = var12 + arg4 + 8 - var24;
                                var25 = arg2 + var11 + 8 - var23;
                            } else {
                                var25 = var12 + arg2 + 8 - var24;
                                var26 = arg4 + var23 - var11;
                            }
                            this.method494(arg6, var19 + var24, (byte) 109, var18 + var23, var26, 0, true, var25, 0, arg8, 0);
                        } else {
                            var25 = class466.method2714(var23 & 0x7, var24 & 0x7, arg1 - 23178, arg3) + arg2;
                            var26 = arg4 + class335.method2063(-27960, var23 & 0x7, var24 & 0x7, arg3);
                            this.method494(arg6, var19 + var24, (byte) 122, var18 + var23, var26, var21, false, var25, arg3, arg8, var20);
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
                                if (arg3 == 0) {
                                    var31 = var30 + arg4 - var12;
                                    var32 = var29 + arg2 - var11;
                                } else if (arg3 == 1) {
                                    var31 = var11 + arg4 + 8 - var29;
                                    var32 = var30 + arg2 - var12;
                                } else if (arg3 == 2) {
                                    var31 = arg4 + var12 + 8 - var30;
                                    var32 = -var29 - (-var11 - (arg2 + 8));
                                } else {
                                    var31 = arg4 + var29 - var11;
                                    var32 = arg2 - (-var12 - 8) - var30;
                                }
                                if (var32 >= 0 && var32 < this.field872 && var31 >= 0 && var31 < this.field880) {
                                    this.field881[arg8][var32][var31] = this.field881[arg8][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method494(arg6, 0, (byte) 102, 0, -1, 0, false, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIZLvu;Lbt;)V", line = 2524)
    public class63(int arg0, int arg1, int arg2, boolean arg3, class195 arg4, class114 arg5) {
        this.field882 = arg0;
        this.field870 = arg3;
        this.field871 = arg4;
        this.field868 = arg5;
        this.field872 = arg1;
        this.field880 = arg2;
        this.field867 = new byte[this.field882][this.field872 + 1][this.field880 + 1];
        this.field888 = new byte[this.field882][this.field872][this.field880];
        this.field865 = new byte[this.field882][this.field872][this.field880];
        this.field887 = new byte[this.field882][this.field872][this.field880];
        this.field877 = new byte[this.field882][this.field872][this.field880];
        this.field881 = new int[this.field882][this.field872 + 1][this.field880 + 1];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[IZI)V", line = 2492)
    public final void method504(int[][] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method495(null, null, null, null, null, 90, 56);
        }
        field879++;
        int[][] var4 = this.field881[arg2];
        for (int var5 = 0; var5 < (this.field872 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field880 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }
}
