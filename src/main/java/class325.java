import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class325 {

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[I")
    private int[] field4222 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    private int[] field4217 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lmd;")
    private class245 field4236;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lh;")
    private class214 field4225;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
    public boolean field4215;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[[[I")
    public int[][][] field4226;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[[[B")
    private byte[][][] field4212;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[[[B")
    private byte[][][] field4223;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[[[B")
    private byte[][][] field4220;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[[[B")
    private byte[][][] field4219;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[[[B")
    public byte[][][] field4218;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
    public static int[] field4229 = new int[1];

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lra;")
    public static class361 field4234 = new class361(11, 6);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[I")
    public static int[] field4240;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "[[[B")
    public byte[][][] field4228;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[[[I")
    public static int[][][] field4211;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLd;Ld;Loa;)V", line = 5)
    public final void method1874(byte arg0, class88 arg1, class88 arg2, class43 arg3) {
        field4242++;
        if (class399.field5092 == null || class399.field5092.length != this.field4224) {
            class202.field2636 = new int[this.field4224];
            class399.field5092 = new int[this.field4224];
            class630.field8790 = new int[this.field4224];
            field4240 = new int[this.field4224];
            class21.field233 = new int[this.field4224];
        }
        int[][] var5 = new int[this.field4232][this.field4224];
        for (int var6 = 0; var6 < this.field4216; var6++) {
            for (int var8 = 0; var8 < this.field4224; var8++) {
                class399.field5092[var8] = 0;
                class630.field8790[var8] = 0;
                class21.field233[var8] = 0;
                field4240[var8] = 0;
                class202.field2636[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field4232; var9++) {
                for (int var10 = 0; var10 < this.field4224; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field4232 > var19) {
                        int var20 = this.field4212[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class280 var21 = this.field4225.method1370(var20 - 1, 128);
                            class399.field5092[var10] += var21.field3660;
                            class630.field8790[var10] += var21.field3668;
                            class21.field233[var10] += var21.field3657;
                            field4240[var10] += var21.field3656;
                            var10002 = class202.field2636[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field4212[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class280 var24 = this.field4225.method1370(var23 - 1, 128);
                            class399.field5092[var10] -= var24.field3660;
                            class630.field8790[var10] -= var24.field3668;
                            class21.field233[var10] -= var24.field3657;
                            field4240[var10] -= var24.field3656;
                            var10002 = class202.field2636[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field4224; var16++) {
                        int var17 = var16 + 5;
                        if (this.field4224 > var17) {
                            var14 += field4240[var17];
                            var15 += class202.field2636[var17];
                            var12 += class630.field8790[var17];
                            var13 += class21.field233[var17];
                            var11 += class399.field5092[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class21.field233[var18];
                            var14 -= field4240[var18];
                            var15 -= class202.field2636[var18];
                            var12 -= class630.field8790[var18];
                            var11 -= class399.field5092[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class311.method1809(var13 / var15, false, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class162.field2019) {
                this.method1880(-86, class392.field4997[var6], var6, var6 == 0 ? arg2 : null, arg3, var5, var6 == 0 ? arg1 : null);
            } else {
                this.method1883(var6 == 0 ? arg1 : null, arg3, 16, var6, class392.field4997[var6], var6 == 0 ? arg2 : null, var5);
            }
            this.field4212[var6] = null;
            this.field4219[var6] = null;
            this.field4223[var6] = null;
            this.field4220[var6] = null;
        }
        if (!this.field4215) {
            if (class475.field6182 != 0) {
                class475.method2625();
            }
            if (class13.field149) {
                class556.method2981();
            }
        }
        if (arg0 <= 101) {
            this.method1875(-48, -23, 21, -88, false);
        }
        for (int var7 = 0; var7 < this.field4216; var7++) {
            class392.field4997[var7].method663();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIZ)V", line = 183)
    public final void method1875(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4213++;
        if (!arg4) {
            for (int var6 = 0; var6 < this.field4216; var6++) {
                this.method1881(var6, (byte) 14, arg0, arg1, arg2, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII[Lwca;Lfd;)V", line = 200)
    public final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, class36[] arg5, class418 arg6) {
        if (!this.field4215) {
            for (int var8 = 0; var8 < 4; var8++) {
                class36 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && var12 < this.field4232 && var13 >= 0 && this.field4224 > var13) {
                            var9.method294((byte) 67, var13, var12);
                        }
                    }
                }
            }
        }
        field4231++;
        int var14 = arg1 + arg3;
        if (arg2 != 1) {
            this.field4236 = null;
        }
        int var15 = arg4 + arg0;
        for (int var16 = 0; var16 < this.field4216; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1885(arg0 + var18, false, 0, -74, var16, var15 + var18, arg6, 0, arg3 + var17, var14 - -var17, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 278)
    public static final void method1877(byte arg0) {
        class408.field5286.method201(class249.field3369, class37.field536, class196.field2561);
        field4233++;
        if (arg0 != 61) {
            field4211 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 294)
    public static void method1878(int arg0) {
        if (arg0 != -1) {
            method1877((byte) -57);
        }
        field4211 = null;
        field4234 = null;
        field4229 = null;
        field4240 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V", line = 311)
    public static final void method1879(int arg0, int arg1) {
        field4241++;
        class367 var2 = class573.method3057(arg1, arg0, 2);
        var2.method2113(arg1 + 41);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILd;ILd;Loa;[[ILd;)V", line = 321)
    private final void method1880(int arg0, class88 arg1, int arg2, class88 arg3, class43 arg4, int[][] arg5, class88 arg6) {
        int var8 = 79 / ((arg0 - 25) / 61);
        field4235++;
        byte[][] var9 = this.field4223[arg2];
        byte[][] var10 = this.field4220[arg2];
        byte[][] var11 = this.field4212[arg2];
        byte[][] var12 = this.field4219[arg2];
        for (int var13 = 0; var13 < this.field4232; var13++) {
            int var14 = var13 < this.field4232 - 1 ? var13 + 1 : var13;
            for (int var15 = 0; var15 < this.field4224; var15++) {
                int var16 = this.field4224 - 1 <= var15 ? var15 : var15 + 1;
                if (class145.field1894 == -1 || class133.method969(arg2, class145.field1894, 88, var15, var13)) {
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
                        class612 var27 = var22 == 0 ? null : this.field4236.method1533(false, var22 - 1);
                        class280 var28 = var23 == 0 ? null : this.field4225.method1370(var23 - 1, 128);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class612 var29 = var27;
                        if (var27 != null) {
                            if (var27.field8275 == -1 && var27.field8262 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field8276;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && this.field4232 > var13 && var15 < this.field4224) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            int var34 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var35 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            byte var36 = 0;
                            int var37 = var36 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var33++;
                                var34++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var11[var14][var15] == var23) {
                                var35++;
                                var33++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var11[var13][var16] == var23) {
                                var37++;
                                var35++;
                            } else {
                                var35--;
                                var37--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var34++;
                                var37++;
                            } else {
                                var37--;
                                var34--;
                            }
                            int var38 = var34 - var35;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var33 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg1.method668(var13, var15) - arg1.method668(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg1.method668(var14, var15) - arg1.method668(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class398.field5071[var40] = -1;
                            class574.field7485[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field8276 ? class545.field7076[var20] : class57.field765[var20];
                        this.method1882(var12, var15, this.field4224, var28, var21, arg4, var9, var19, this.field4232, var20, 2, var13, var10, var27);
                        boolean var42 = var27 != null && var27.field8275 != var27.field8262;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class398.field5071[var43] >= 0 && class380.field4888[var43] != class176.field2198[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class432.method2475(var19[1], class597.method3238(class574.field7485[4], class574.field7485[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class432.method2475(var19[3], class597.method3238(class574.field7485[6], class574.field7485[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class432.method2475(var19[0], class597.method3238(class574.field7485[0], class574.field7485[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class432.method2475(var19[2], class597.method3238(class574.field7485[4], class574.field7485[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[1] = false;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var21 = 2;
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 1;
                                var19[2] = var19[3] = false;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        int var50;
                        if (var44) {
                            var46 = class280.field3669[var20];
                            var47 = var28 == null ? 0 : class626.field8755[var20];
                            var48 = class158.field1982[var20];
                            var49 = class196.field2557[var20];
                            var50 = var27 == null ? 0 : class663.field9214[var20];
                        } else if (var18) {
                            var47 = var28 == null ? 0 : class460.field6035[var20];
                            var46 = class489.field6494[var20];
                            var50 = var27 == null ? 0 : class456.field5979[var20];
                            var45 = class445.field5730[var20];
                            var48 = class125.field1614[var20];
                            var49 = class69.field929[var20];
                        } else {
                            var47 = var28 == null ? 0 : class708.field9874[var20];
                            var45 = class361.field4672[var20];
                            var49 = class315.field4081[var20];
                            var48 = class109.field1409[var20];
                            var50 = var27 == null ? 0 : class398.field5069[var20];
                            var46 = class562.field7340[var20];
                        }
                        int var51 = var47 + var50;
                        if (var51 <= 0) {
                            class35.method277(arg2, var13, var15);
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
                            int[] var61 = arg6 == null ? null : new int[var54];
                            int[] var62 = arg6 == null && arg3 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var63 = var27.field8275;
                                var64 = arg4.method340() ? var27.field8270 : var27.field8268;
                                var65 = var27.field8273;
                                int var66 = class254.method1607((byte) 6, arg4, var27);
                                for (int var67 = 0; var67 < var50; var67++) {
                                    boolean var68 = false;
                                    byte var69;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 1;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 1;
                                        class653.field9080[4] = var49[var52];
                                        var69 = 6;
                                        class653.field9080[5] = var46[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 5;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 5;
                                        class653.field9080[4] = var49[var52];
                                        class653.field9080[5] = var46[var52];
                                        var69 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 3;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 3;
                                        class653.field9080[4] = var49[var52];
                                        class653.field9080[5] = var46[var52];
                                        var69 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 7;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 7;
                                        class653.field9080[4] = var49[var52];
                                        var69 = 6;
                                        class653.field9080[5] = var46[var52];
                                    } else {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = var49[var52];
                                        var69 = 3;
                                        class653.field9080[2] = var46[var52];
                                    }
                                    var52++;
                                    for (int var70 = 0; var70 < var69; var70++) {
                                        int var71 = class653.field9080[var70];
                                        int var72 = var71 - (var21 * 2) & 0x7;
                                        int var73 = this.field4222[var71];
                                        int var74 = this.field4217[var71];
                                        int var75;
                                        int var76;
                                        if (var21 == 1) {
                                            var75 = var74;
                                            var76 = 512 - var73;
                                        } else if (var21 == 2) {
                                            var76 = 512 - var74;
                                            var75 = 512 - var73;
                                        } else if (var21 == 3) {
                                            var76 = var73;
                                            var75 = 512 - var74;
                                        } else {
                                            var75 = var73;
                                            var76 = var74;
                                        }
                                        var56[var53] = var75;
                                        var57[var53] = var76;
                                        if (var61 != null && class388.field4978[var20][var71]) {
                                            int var77 = (var13 << 9) + var75;
                                            int var78 = (var15 << 9) + var76;
                                            var61[var53] = arg6.method669(var77, var78) - arg1.method669(var77, var78);
                                        }
                                        if (var62 != null) {
                                            if (arg6 != null && !class388.field4978[var20][var71]) {
                                                int var79 = (var13 << 9) + var75;
                                                int var80 = (var15 << 9) + var76;
                                                var62[var53] = arg1.method669(var79, var80) - arg6.method669(var79, var80);
                                            } else if (arg3 != null && !class465.field6067[var20][var71]) {
                                                int var81 = (var13 << 9) + var75;
                                                int var82 = (var15 << 9) + var76;
                                                var62[var53] = arg3.method669(var81, var82) - arg1.method669(var81, var82);
                                            }
                                        }
                                        if (var71 < 8 && class398.field5071[var72] > var27.field8274) {
                                            if (var55 != null) {
                                                var55[var53] = class176.field2198[var72];
                                            }
                                            var60[var53] = class44.field624[var72];
                                            var59[var53] = class507.field6659[var72];
                                            var58[var53] = class380.field4888[var72];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = arg4.method340() ? var27.field8270 : var27.field8268;
                                            var60[var53] = var27.field8273;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                }
                                if (!this.field4215 && arg2 == 0) {
                                    class522.method2805(var13, var15, var27.field8259, var27.field8261 * 8, var27.field8271);
                                }
                                if (var20 != 12 && var27.field8275 != -1 && var27.field8264) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class663.field9214[var20];
                            } else if (var18) {
                                var52 += class456.field5979[var20];
                            } else {
                                var52 += class398.field5069[var20];
                            }
                            if (var28 != null) {
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class280 var83 = this.field4225.method1370(var23 - 1, 128);
                                class280 var84 = this.field4225.method1370(var24 - 1, 128);
                                class280 var85 = this.field4225.method1370(var25 - 1, 128);
                                class280 var86 = this.field4225.method1370(var26 - 1, 128);
                                for (int var87 = 0; var87 < var47; var87++) {
                                    boolean var88 = false;
                                    byte var89;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 1;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 1;
                                        class653.field9080[4] = var49[var52];
                                        var89 = 6;
                                        class653.field9080[5] = var46[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 5;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 5;
                                        class653.field9080[4] = var49[var52];
                                        var89 = 6;
                                        class653.field9080[5] = var46[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 3;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 3;
                                        class653.field9080[4] = var49[var52];
                                        class653.field9080[5] = var46[var52];
                                        var89 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = 7;
                                        class653.field9080[2] = var46[var52];
                                        class653.field9080[3] = 7;
                                        class653.field9080[4] = var49[var52];
                                        var89 = 6;
                                        class653.field9080[5] = var46[var52];
                                    } else {
                                        class653.field9080[0] = var48[var52];
                                        class653.field9080[1] = var49[var52];
                                        var89 = 3;
                                        class653.field9080[2] = var46[var52];
                                    }
                                    var52++;
                                    for (int var90 = 0; var90 < var89; var90++) {
                                        int var91 = class653.field9080[var90];
                                        int var92 = var91 - (var21 * 2) & 0x7;
                                        int var93 = this.field4222[var91];
                                        int var94 = this.field4217[var91];
                                        int var95;
                                        int var96;
                                        if (var21 == 1) {
                                            var95 = 512 - var93;
                                            var96 = var94;
                                        } else if (var21 == 2) {
                                            var95 = 512 - var94;
                                            var96 = 512 - var93;
                                        } else if (var21 == 3) {
                                            var95 = var93;
                                            var96 = 512 - var94;
                                        } else {
                                            var96 = var93;
                                            var95 = var94;
                                        }
                                        var56[var53] = var96;
                                        var57[var53] = var95;
                                        if (var61 != null && class388.field4978[var20][var91]) {
                                            int var97 = (var13 << 9) + var96;
                                            int var98 = (var15 << 9) + var95;
                                            var61[var53] = arg6.method669(var97, var98) - arg1.method669(var97, var98);
                                        }
                                        if (var62 != null) {
                                            if (arg6 != null && !class388.field4978[var20][var91]) {
                                                int var99 = (var13 << 9) + var96;
                                                int var100 = (var15 << 9) + var95;
                                                var62[var53] = arg1.method669(var99, var100) - arg6.method669(var99, var100);
                                            } else if (arg3 != null && !class465.field6067[var20][var91]) {
                                                int var101 = (var13 << 9) + var96;
                                                int var102 = (var15 << 9) + var95;
                                                var62[var53] = arg3.method669(var101, var102) - arg1.method669(var101, var102);
                                            }
                                        }
                                        if (var91 < 8 && class398.field5071[var92] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class176.field2198[var92];
                                            }
                                            var60[var53] = class44.field624[var92];
                                            var59[var53] = class507.field6659[var92];
                                            var58[var53] = class380.field4888[var92];
                                        } else {
                                            if (var18 && class388.field4978[var20][var91]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var96 == 0 && var95 == 0) {
                                                var58[var53] = arg5[var13][var15];
                                                var59[var53] = var83.field3661;
                                                var60[var53] = var83.field3663;
                                            } else if (var96 == 0 && var95 == 512) {
                                                var58[var53] = arg5[var13][var16];
                                                var59[var53] = var84.field3661;
                                                var60[var53] = var84.field3663;
                                            } else if (var96 == 512 && var95 == 512) {
                                                var58[var53] = arg5[var14][var16];
                                                var59[var53] = var85.field3661;
                                                var60[var53] = var85.field3663;
                                            } else if (var96 == 512 && var95 == 0) {
                                                var58[var53] = arg5[var14][var15];
                                                var59[var53] = var86.field3661;
                                                var60[var53] = var86.field3663;
                                            } else {
                                                if (var96 < 256) {
                                                    if (var95 >= 256) {
                                                        var59[var53] = var84.field3661;
                                                        var60[var53] = var84.field3663;
                                                    } else {
                                                        var59[var53] = var83.field3661;
                                                        var60[var53] = var83.field3663;
                                                    }
                                                } else if (var95 < 256) {
                                                    var59[var53] = var86.field3661;
                                                    var60[var53] = var86.field3663;
                                                } else {
                                                    var59[var53] = var85.field3661;
                                                    var60[var53] = var85.field3663;
                                                }
                                                int var103 = class270.method1654(arg5[var14][var15], (byte) 101, arg5[var13][var15], var96 << 7 >> 9);
                                                int var104 = class270.method1654(arg5[var14][var16], (byte) 117, arg5[var13][var16], var96 << 7 >> 9);
                                                var58[var53] = class270.method1654(var104, (byte) 101, var103, var95 << 7 >> 9);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                }
                                if (var20 != 0 && var28.field3658) {
                                    var17 = true;
                                }
                            }
                            int var105 = arg1.method668(var13, var15);
                            int var106 = arg1.method668(var14, var15);
                            int var107 = arg1.method668(var14, var16);
                            int var108 = arg1.method668(var13, var16);
                            if (arg2 > 0) {
                                boolean var109 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var109 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field8269) {
                                    var109 = false;
                                }
                                if (var109 && var105 == var106 && var105 == var107 && var105 == var108) {
                                    this.field4218[arg2][var13][var15] = (byte) class131.method954(this.field4218[arg2][var13][var15], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field4215) {
                                var110 = class601.method3270(var13, var15);
                                var111 = class579.method3180(var13, var15);
                                var112 = class557.method2986(var13, var15);
                            }
                            arg1.method658(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var110, var111, var112, var17);
                            class35.method277(arg2, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIIII)V", line = 1190)
    private final void method1881(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg5; var7 < arg4 + arg5; var7++) {
            for (int var11 = arg2; var11 < arg2 + arg3; var11++) {
                if (var11 >= 0 && this.field4232 > var11 && var7 >= 0 && var7 < this.field4224) {
                    this.field4226[arg0][var11][var7] = arg0 <= 0 ? 0 : this.field4226[arg0 - 1][var11][var7] - 960;
                }
            }
        }
        field4237++;
        if (arg2 > 0 && arg2 < this.field4232) {
            for (int var8 = arg5 + 1; var8 < arg4 + arg5; var8++) {
                if (var8 >= 0 && var8 < this.field4224) {
                    this.field4226[arg0][arg2][var8] = this.field4226[arg0][arg2 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && this.field4224 > arg5) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field4232) {
                    this.field4226[arg0][var9][arg5] = this.field4226[arg0][var9][arg5 - 1];
                }
            }
        }
        int var10 = 35 / ((arg1 + 63) / 58);
        if (arg2 < 0 || arg5 < 0 || this.field4232 <= arg2 || arg5 >= this.field4224) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 > 0 && this.field4226[arg0][arg2 - 1][arg5] != 0) {
                this.field4226[arg0][arg2][arg5] = this.field4226[arg0][arg2 - 1][arg5];
                return;
            }
            if (arg5 > 0 && this.field4226[arg0][arg2][arg5 - 1] != 0) {
                this.field4226[arg0][arg2][arg5] = this.field4226[arg0][arg2][arg5 - 1];
                return;
            }
            if (arg2 > 0 && arg5 > 0 && this.field4226[arg0][arg2 - 1][arg5 - 1] != 0) {
                this.field4226[arg0][arg2][arg5] = this.field4226[arg0][arg2 - 1][arg5 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field4226[arg0][arg2 - 1][arg5] == this.field4226[arg0 - 1][arg2 - 1][arg5]) {
            if (arg5 <= 0 || this.field4226[arg0][arg2][arg5 - 1] == this.field4226[arg0 - 1][arg2][arg5 - 1]) {
                if (arg2 > 0 && arg5 > 0 && this.field4226[arg0][arg2 - 1][arg5 - 1] != this.field4226[arg0 - 1][arg2 - 1][arg5 - 1]) {
                    this.field4226[arg0][arg2][arg5] = this.field4226[arg0][arg2 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field4226[arg0][arg2][arg5] = this.field4226[arg0][arg2][arg5 - 1];
        } else {
            this.field4226[arg0][arg2][arg5] = this.field4226[arg0][arg2 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([[BIILih;ILoa;[[B[ZIIII[[BLgr;)V", line = 1291)
    private final void method1882(byte[][] arg0, int arg1, int arg2, class280 arg3, int arg4, class43 arg5, byte[][] arg6, boolean[] arg7, int arg8, int arg9, int arg10, int arg11, byte[][] arg12, class612 arg13) {
        field4239++;
        boolean[] var15 = arg13 != null && arg13.field8276 ? class545.field7076[arg9] : class57.field765[arg9];
        if (arg1 > 0) {
            if (arg11 > 0) {
                int var16 = arg0[arg11 - 1][arg1 - 1] & 0xFF;
                if (var16 > 0) {
                    class612 var17 = this.field4236.method1533(false, var16 - 1);
                    if (var17.field8275 != -1 && var17.field8276) {
                        byte var18 = arg6[arg11 - 1][arg1 - 1];
                        int var19 = arg12[arg11 - 1][arg1 - 1] * 2 + 4 & 0x7;
                        int var20 = class254.method1607((byte) 6, arg5, var17);
                        if (class388.field4978[var18][var19]) {
                            class380.field4888[0] = var17.field8275;
                            class176.field2198[0] = var20;
                            class507.field6659[0] = arg5.method340() ? var17.field8270 : var17.field8268;
                            class44.field624[0] = var17.field8273;
                            class398.field5071[0] = var17.field8274;
                            class574.field7485[0] = 256;
                        }
                    }
                }
            }
            if ((arg8 - 1) > arg11) {
                int var21 = arg0[arg11 + 1][arg1 - 1] & 0xFF;
                if (var21 > 0) {
                    class612 var22 = this.field4236.method1533(false, var21 - 1);
                    if (var22.field8275 != -1 && var22.field8276) {
                        byte var23 = arg6[arg11 + 1][arg1 - 1];
                        int var24 = (arg12[arg11 + 1][arg1 - 1] * 2) + 6 & 0x7;
                        int var25 = class254.method1607((byte) 6, arg5, var22);
                        if (class388.field4978[var23][var24]) {
                            class380.field4888[2] = var22.field8275;
                            class176.field2198[2] = var25;
                            class507.field6659[2] = arg5.method340() ? var22.field8270 : var22.field8268;
                            class44.field624[2] = var22.field8273;
                            class398.field5071[2] = var22.field8274;
                            class574.field7485[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg1 < (arg2 - 1)) {
            if (arg11 > 0) {
                int var26 = arg0[arg11 - 1][arg1 + 1] & 0xFF;
                if (var26 > 0) {
                    class612 var27 = this.field4236.method1533(false, var26 - 1);
                    if (var27.field8275 != -1 && var27.field8276) {
                        byte var28 = arg6[arg11 - 1][arg1 + 1];
                        int var29 = arg12[arg11 - 1][arg1 + 1] * 2 + 2 & 0x7;
                        int var30 = class254.method1607((byte) 6, arg5, var27);
                        if (class388.field4978[var28][var29]) {
                            class380.field4888[6] = var27.field8275;
                            class176.field2198[6] = var30;
                            class507.field6659[6] = arg5.method340() ? var27.field8270 : var27.field8268;
                            class44.field624[6] = var27.field8273;
                            class398.field5071[6] = var27.field8274;
                            class574.field7485[6] = 64;
                        }
                    }
                }
            }
            if (arg11 < (arg8 - 1)) {
                int var31 = arg0[arg11 + 1][arg1 + 1] & 0xFF;
                if (var31 > 0) {
                    class612 var32 = this.field4236.method1533(false, var31 - 1);
                    if (var32.field8275 != -1 && var32.field8276) {
                        byte var33 = arg6[arg11 + 1][arg1 + 1];
                        int var34 = arg12[arg11 + 1][arg1 + 1] * 2 & 0x7;
                        int var35 = class254.method1607((byte) 6, arg5, var32);
                        if (class388.field4978[var33][var34]) {
                            class380.field4888[4] = var32.field8275;
                            class176.field2198[4] = var35;
                            class507.field6659[4] = arg5.method340() ? var32.field8270 : var32.field8268;
                            class44.field624[4] = var32.field8273;
                            class398.field5071[4] = var32.field8274;
                            class574.field7485[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg1 > 0) {
            int var36 = arg0[arg11][arg1 - 1] & 0xFF;
            if (var36 > 0) {
                class612 var37 = this.field4236.method1533(false, var36 - 1);
                if (var37.field8275 != -1) {
                    byte var38 = arg6[arg11][arg1 - 1];
                    byte var39 = arg12[arg11][arg1 - 1];
                    if (var37.field8276) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class254.method1607((byte) 6, arg5, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class388.field4978[var38][var41] && class398.field5071[var40] <= var37.field8274) {
                                class380.field4888[var40] = var37.field8275;
                                class176.field2198[var40] = var42;
                                class507.field6659[var40] = arg5.method340() ? var37.field8270 : var37.field8268;
                                class44.field624[var40] = var37.field8273;
                                if (class398.field5071[var40] == var37.field8274) {
                                    class574.field7485[var40] = class131.method954(class574.field7485[var40], 32);
                                } else {
                                    class574.field7485[var40] = 32;
                                }
                                class398.field5071[var40] = var37.field8274;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg7[0] = class545.field7076[var38][class597.method3238(var39 + 2, 3)];
                        }
                    } else if (!var15[arg4 & 0x3]) {
                        arg7[0] = class57.field765[var38][class597.method3238(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg2 - 1 > arg1) {
            int var44 = arg0[arg11][arg1 + 1] & 0xFF;
            if (var44 > 0) {
                class612 var45 = this.field4236.method1533(false, var44 - 1);
                if (var45.field8275 != -1) {
                    byte var46 = arg6[arg11][arg1 + 1];
                    byte var47 = arg12[arg11][arg1 + 1];
                    if (var45.field8276) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class254.method1607((byte) 6, arg5, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class388.field4978[var46][var49] && var45.field8274 >= class398.field5071[var48]) {
                                class380.field4888[var48] = var45.field8275;
                                class176.field2198[var48] = var50;
                                class507.field6659[var48] = arg5.method340() ? var45.field8270 : var45.field8268;
                                class44.field624[var48] = var45.field8273;
                                if (class398.field5071[var48] == var45.field8274) {
                                    class574.field7485[var48] = class131.method954(class574.field7485[var48], 16);
                                } else {
                                    class574.field7485[var48] = 16;
                                }
                                class398.field5071[var48] = var45.field8274;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg7[2] = class545.field7076[var46][class597.method3238(3, var47)];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg7[2] = class57.field765[var46][class597.method3238(3, var47)];
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var52 = arg0[arg11 - 1][arg1] & 0xFF;
            if (var52 > 0) {
                class612 var53 = this.field4236.method1533(false, var52 - 1);
                if (var53.field8275 != -1) {
                    byte var54 = arg6[arg11 - 1][arg1];
                    byte var55 = arg12[arg11 - 1][arg1];
                    if (var53.field8276) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class254.method1607((byte) 6, arg5, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class388.field4978[var54][var57] && var53.field8274 >= class398.field5071[var56]) {
                                class380.field4888[var56] = var53.field8275;
                                class176.field2198[var56] = var58;
                                class507.field6659[var56] = arg5.method340() ? var53.field8270 : var53.field8268;
                                class44.field624[var56] = var53.field8273;
                                if (class398.field5071[var56] == var53.field8274) {
                                    class574.field7485[var56] = class131.method954(class574.field7485[var56], 8);
                                } else {
                                    class574.field7485[var56] = 8;
                                }
                                class398.field5071[var56] = var53.field8274;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg7[3] = class545.field7076[var54][class597.method3238(3, var55 + 1)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg7[3] = class57.field765[var54][class597.method3238(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg11 < (arg8 - 1)) {
            int var60 = arg0[arg11 + 1][arg1] & 0xFF;
            if (var60 > 0) {
                class612 var61 = this.field4236.method1533(false, var60 - 1);
                if (var61.field8275 != -1) {
                    byte var62 = arg6[arg11 + 1][arg1];
                    byte var63 = arg12[arg11 + 1][arg1];
                    if (var61.field8276) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class254.method1607((byte) 6, arg5, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class388.field4978[var62][var65] && var61.field8274 >= class398.field5071[var64]) {
                                class380.field4888[var64] = var61.field8275;
                                class176.field2198[var64] = var66;
                                class507.field6659[var64] = arg5.method340() ? var61.field8270 : var61.field8268;
                                class44.field624[var64] = var61.field8273;
                                if (class398.field5071[var64] == var61.field8274) {
                                    class574.field7485[var64] = class131.method954(class574.field7485[var64], 4);
                                } else {
                                    class574.field7485[var64] = 4;
                                }
                                class398.field5071[var64] = var61.field8274;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg7[1] = class545.field7076[var62][class597.method3238(var63 + 3, 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg7[1] = class57.field765[var62][class597.method3238(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg13 != null) {
            int var68 = class254.method1607((byte) 6, arg5, arg13);
            if (arg13.field8276) {
                for (int var69 = 0; var69 < 8; var69++) {
                    int var70 = var69 - (arg4 * 2) & 0x7;
                    if (class388.field4978[arg9][var69] && class398.field5071[var70] <= arg13.field8274) {
                        class380.field4888[var70] = arg13.field8275;
                        class176.field2198[var70] = var68;
                        class507.field6659[var70] = arg5.method340() ? arg13.field8270 : arg13.field8268;
                        class44.field624[var70] = arg13.field8273;
                        if (class398.field5071[var70] == arg13.field8274) {
                            class574.field7485[var70] = class131.method954(class574.field7485[var70], 2);
                        } else {
                            class574.field7485[var70] = 2;
                        }
                        class398.field5071[var70] = arg13.field8274;
                    }
                }
            }
        }
        if (arg10 != 2) {
            method1877((byte) 16);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ld;Loa;IILd;Ld;[[I)V", line = 1758)
    private final void method1883(class88 arg0, class43 arg1, int arg2, int arg3, class88 arg4, class88 arg5, int[][] arg6) {
        field4221++;
        for (int var8 = 0; var8 < this.field4232; var8++) {
            for (int var9 = 0; var9 < this.field4224; var9++) {
                if (class145.field1894 == -1 || class133.method969(arg3, class145.field1894, arg2 ^ 0x75, var9, var8)) {
                    byte var10 = this.field4223[arg3][var8][var9];
                    byte var11 = this.field4220[arg3][var8][var9];
                    int var12 = this.field4219[arg3][var8][var9] & 0xFF;
                    int var13 = this.field4212[arg3][var8][var9] & 0xFF;
                    class612 var14 = var12 == 0 ? null : this.field4236.method1533(false, var12 - 1);
                    class280 var15 = var13 == 0 ? null : this.field4225.method1370(var13 - 1, 128);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class626.field8755[var10];
                        var17 = var14 == null ? 0 : class663.field9214[var10];
                    } else if (var14 != null) {
                        var17 = class663.field9214[var10];
                    } else if (var15 != null) {
                        var16 = class663.field9214[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field8275 == -1 && var14.field8262 == -1 && var14.field8270 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg1.method340() ? var14.field8270 : var14.field8268;
                            if (class379.field4849) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field8273;
                                if (var14.field8275 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field8275;
                                }
                                if (var14.field8262 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field8262;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field4215 && arg3 == 0) {
                                class522.method2805(var8, var9, var14.field8259, var14.field8261 * 8, var14.field8271);
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
                            int var29 = var15.field3661;
                            if (class379.field4849) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field3663;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field4222.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field4222[var36];
                            int var46 = this.field4217[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class388.field4978[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg0.method669(var49, var50) - arg4.method669(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class388.field4978[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg4.method669(var51, var52) - arg0.method669(var51, var52);
                                } else if (arg5 != null && !class465.field6067[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg5.method669(var53, var54) - arg4.method669(var53, var54);
                                }
                            }
                        }
                        int var37 = arg4.method668(var8, var9);
                        int var38 = arg4.method668(var8 + 1, var9);
                        int var39 = arg4.method668(var8 + 1, var9 - -1);
                        int var40 = arg4.method668(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field8269) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field4218[arg3][var8][var9] = (byte) class131.method954(this.field4218[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field4215) {
                            var42 = class601.method3270(var8, var9);
                            var43 = class579.method3180(var8, var9);
                            var44 = class557.method2986(var8, var9);
                        }
                        arg4.method661(var8, var9, var32, var34, var33, var35, class158.field1982[var10], class196.field2557[var10], class280.field3669[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class35.method277(arg3, var8, var9);
                    }
                }
            }
        }
        if (arg2 != 16) {
            this.field4217 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[[I[Lwca;Loa;)V", line = 2076)
    public final void method1884(int arg0, int[][][] arg1, class36[] arg2, class43 arg3) {
        if (!this.field4215) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4232; var6++) {
                    for (int var7 = 0; var7 < this.field4224; var7++) {
                        if ((class159.field1994[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class159.field1994[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method296(var7, var6, 110);
                            }
                        }
                    }
                }
            }
        }
        field4238++;
        if (arg0 > -94) {
            return;
        }
        for (int var9 = 0; var9 < this.field4216; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field4215) {
                if (class581.field7913) {
                    var11 |= 0x8;
                }
                if (class13.field149) {
                    var10 |= 0x2;
                }
                if (class475.field6182 != 0) {
                    if (class87.field1157 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class13.field149) {
                var11 |= 0x7;
            }
            if (!class528.field6868) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || var9 >= arg1.length ? this.field4226[var9] : arg1[var9];
            class303.method1776(var9, arg3.method413(this.field4232, this.field4224, this.field4226[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZIIIILfd;IIII)V", line = 2178)
    private final void method1885(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class418 arg6, int arg7, int arg8, int arg9, int arg10) {
        field4230++;
        if (arg7 == 1) {
            arg2 = 1;
        } else if (arg7 == 2) {
            arg10 = 1;
            arg2 = 1;
        } else if (arg7 == 3) {
            arg10 = 1;
        }
        if (arg3 > -69) {
            this.method1884(55, null, null, null);
        }
        if (arg8 < 0 || this.field4232 <= arg8 || arg0 < 0 || arg0 >= this.field4224) {
            while (true) {
                int var14 = arg6.method2396(103);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method2396(126);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method2396(-104);
                }
            }
        }
        if (!this.field4215 && !arg1) {
            class159.field1994[arg4][arg8][arg0] = 0;
        }
        while (true) {
            int var12 = arg6.method2396(84);
            if (var12 == 0) {
                if (this.field4215) {
                    this.field4226[0][arg8 + arg10][arg0 + arg2] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field4226[0][arg8 + arg10][arg0 + arg2] = -class323.method1869(arg5 + 556238, (byte) 113, arg9 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field4226[arg4][arg8 + arg10][arg0 + arg2] = this.field4226[arg4 - 1][arg8 + arg10][arg0 + arg2] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method2396(47);
                if (!this.field4215) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg4 == 0) {
                        this.field4226[0][arg8 + arg10][arg0 + arg2] = -var13 * 8 << 2;
                        return;
                    }
                    this.field4226[arg4][arg8 + arg10][arg0 + arg2] = this.field4226[arg4 - 1][arg8 + arg10][arg0 + arg2] - (var13 * 8 << 2);
                    return;
                }
                this.field4226[0][arg8 + arg10][arg0 + arg2] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg1) {
                    arg6.method2396(112);
                } else {
                    this.field4219[arg4][arg8][arg0] = arg6.method2387((byte) 111);
                    this.field4223[arg4][arg8][arg0] = (byte) ((var12 - 2) / 4);
                    this.field4220[arg4][arg8][arg0] = (byte) class597.method3238(3, arg7 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field4215 && !arg1) {
                    class159.field1994[arg4][arg8][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg1) {
                this.field4212[arg4][arg8][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[IZ)V", line = 2303)
    public final void method1886(int arg0, int[][] arg1, boolean arg2) {
        field4214++;
        int[][] var4 = this.field4226[arg0];
        if (arg2) {
            return;
        }
        for (int var5 = 0; var5 < (this.field4232 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field4224 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLfd;II[Lwca;IIII)V", line = 2336)
    public final void method1887(int arg0, byte arg1, class418 arg2, int arg3, int arg4, class36[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field4227++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!this.field4215) {
            class36 var13 = arg5[arg0];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class185.method1235(arg7, 1, var14 & 0x7, var15 & 0x7) + arg4;
                    int var17 = class380.method2172(7, arg7, var15 & 0x7, var14 & 0x7) + arg8;
                    if (var16 > 0 && (this.field4232 - 1) > var16 && var17 > 0 && this.field4224 - 1 > var17) {
                        var13.method294((byte) -68, var17, var16);
                    }
                }
            }
        }
        int var18 = arg9 & 0x1FFFFFF8 << 3;
        int var19 = (arg3 & 0xFFFFFFF8) << 3;
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
        for (int var22 = 0; var22 < this.field4216; var22++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg6 == var22 && var24 >= var11 && var24 <= (var11 + 8) && var12 <= var25 && var12 + 8 >= var25) {
                        int var26;
                        int var27;
                        if ((var11 + 8) == var24 || var12 + 8 == var25) {
                            if (arg7 == 0) {
                                var27 = arg8 + var25 - var12;
                                var26 = var24 + arg4 - var11;
                            } else if (arg7 == 1) {
                                var26 = arg4 - (var12 - var25);
                                var27 = var11 + arg8 + 8 - var24;
                            } else if (arg7 == 2) {
                                var26 = arg4 + var11 + 8 - var24;
                                var27 = arg8 + 8 - (-var12 + var25);
                            } else {
                                var27 = arg8 + var24 - var11;
                                var26 = arg4 + 8 - (-var12 + var25);
                            }
                            this.method1885(var27, true, 0, -91, arg0, var19 + var25, arg2, 0, var26, var18 + var24, 0);
                        } else {
                            var26 = class185.method1235(arg7, 1, var24 & 0x7, var25 & 0x7) + arg4;
                            var27 = class380.method2172(7, arg7, var25 & 0x7, var24 & 0x7) + arg8;
                            this.method1885(var27, false, var21, -110, arg0, var19 + var25, arg2, arg7, var26, var18 + var24, var20);
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
                                    var30 = var24 == 63 ? 64 : var24;
                                    var31 = var25 == 63 ? 64 : var25;
                                } else if (var29 == 1) {
                                    var30 = 64;
                                } else if (var29 == 2) {
                                    var31 = 64;
                                }
                                int var32;
                                int var33;
                                if (arg7 == 0) {
                                    var32 = arg4 + var30 - var11;
                                    var33 = arg8 + var31 - var12;
                                } else if (arg7 == 1) {
                                    var32 = arg4 + var31 - var12;
                                    var33 = var11 - (var30 - (arg8 + 8));
                                } else if (arg7 == 2) {
                                    var32 = arg4 + 8 - (var30 - var11);
                                    var33 = arg8 + var12 + 8 - var31;
                                } else {
                                    var33 = arg8 + var30 - var11;
                                    var32 = arg4 + 8 - (-var12 + var31);
                                }
                                if (var32 >= 0 && var32 < this.field4232 && var33 >= 0 && this.field4224 > var33) {
                                    this.field4226[arg0][var32][var33] = this.field4226[arg0][var20 + var26][var27 + var21];
                                }
                            }
                        }
                    } else {
                        this.method1885(-1, false, 0, -115, 0, 0, arg2, 0, -1, 0, 0);
                    }
                }
            }
        }
        int var23 = -69 / ((arg1 + 69) / 44);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIZLmd;Lh;)V", line = 2550)
    public class325(int arg0, int arg1, int arg2, boolean arg3, class245 arg4, class214 arg5) {
        this.field4236 = arg4;
        this.field4225 = arg5;
        this.field4215 = arg3;
        this.field4224 = arg2;
        this.field4232 = arg1;
        this.field4216 = arg0;
        this.field4226 = new int[this.field4216][this.field4232 + 1][this.field4224 + 1];
        this.field4212 = new byte[this.field4216][this.field4232][this.field4224];
        this.field4223 = new byte[this.field4216][this.field4232][this.field4224];
        this.field4220 = new byte[this.field4216][this.field4232][this.field4224];
        this.field4219 = new byte[this.field4216][this.field4232][this.field4224];
        this.field4218 = new byte[this.field4216][this.field4232 + 1][this.field4224 + 1];
    }
}
