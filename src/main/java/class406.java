import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class406 {

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "[I")
    private int[] field5727 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "[I")
    private int[] field5740 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "Lab;")
    private class696 field5722;

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "Z")
    public boolean field5741;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    public int field5732;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "Lpca;")
    private class744 field5739;

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    public int field5736;

    @OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
    public int field5742;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "[[[B")
    private byte[][][] field5733;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "[[[B")
    public byte[][][] field5724;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "[[[B")
    private byte[][][] field5729;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "[[[I")
    public int[][][] field5717;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "[[[B")
    private byte[][][] field5730;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "[[[B")
    private byte[][][] field5720;

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "[I")
    public static int[] field5738 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "[I")
    public static int[] field5737 = new int[2];

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!kda", name = "B", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!kda", name = "C", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "[[[B")
    public byte[][][] field5731;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIII)V")
    public final void method2441(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5725++;
        for (int var6 = 0; var6 < this.field5736; var6++) {
            this.method2451(arg0, var6, arg1, arg2, arg4, arg3);
        }
        if (!arg0) {
            this.field5739 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)[B")
    public static final byte[] method2442(int arg0, int arg1) {
        field5728++;
        int var2 = 75 / ((arg0 + 35) / 40);
        class745 var3 = (class745) class474.field6747.method220((long) arg1, 0);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class425.method2530(-56, var8, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class745(var4);
            class474.field6747.method221(var3, false, (long) arg1);
        }
        return var3.field10370;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZILrv;III[Lmja;)V")
    public final void method2443(boolean arg0, int arg1, class120 arg2, int arg3, int arg4, int arg5, class438[] arg6) {
        field5734++;
        if (!this.field5741) {
            for (int var8 = 0; var8 < 4; var8++) {
                class438 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg5 + var11;
                        if (var12 >= 0 && var12 < this.field5732 && var13 >= 0 && this.field5742 > var13) {
                            var9.method2656(var13, var12, true);
                        }
                    }
                }
            }
        }
        int var14 = arg3 + arg4;
        if (arg0) {
            this.method2441(true, 63, -1, 67, 28);
        }
        int var15 = arg1 + arg5;
        for (int var16 = 0; var16 < this.field5736; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2450(false, arg5 + var18, 0, 0, arg3 + var17, 0, var16, 78, arg2, var15 + var18, var14 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ls;Lha;Ls;Ls;II[[I)V")
    private final void method2444(class292 arg0, class66 arg1, class292 arg2, class292 arg3, int arg4, int arg5, int[][] arg6) {
        field5723++;
        byte[][] var8 = this.field5733[arg5];
        byte[][] var9 = this.field5730[arg5];
        if (arg4 != 16050) {
            this.method2443(true, -77, null, -37, -50, 9, null);
        }
        byte[][] var10 = this.field5720[arg5];
        byte[][] var11 = this.field5729[arg5];
        for (int var12 = 0; var12 < this.field5732; var12++) {
            int var13 = (this.field5732 - 1) <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field5742; var14++) {
                int var15 = (this.field5742 - 1) <= var14 ? var14 : var14 + 1;
                if (class332.field4960 == -1 || class177.method1343(arg5, var12, var14, (byte) 72, class332.field4960)) {
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
                        class164 var26 = var21 == 0 ? null : this.field5722.method3922((byte) -88, var21 - 1);
                        class493 var27 = var22 == 0 ? null : this.field5739.method4152(arg4 - 16132, var22 + -1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class164 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2407 == -1 && var26.field2399 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2396;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field5732 && this.field5742 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var35--;
                                var33--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method1976(var12, arg4 - 16051, var14) - arg3.method1976(var13, -1, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method1976(var13, -1, var14) - arg3.method1976(var12, -1, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class75.field1008[var39] = -1;
                            class705.field9932[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2396 ? class217.field3116[var19] : class223.field3202[var19];
                        this.method2449(this.field5742, var9, var8, this.field5732, var11, var26, var18, var19, var14, arg1, false, var27, var12, var20);
                        boolean var41 = var26 != null && var26.field2407 != var26.field2399;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class75.field1008[var42] >= 0 && class745.field10373[var42] != class117.field1460[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class710.method4022(var18[1], class111.method773(class705.field9932[4], class705.field9932[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class710.method4022(var18[3], class111.method773(class705.field9932[6], class705.field9932[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class710.method4022(var18[0], class111.method773(class705.field9932[2], class705.field9932[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class710.method4022(var18[2], class111.method773(class705.field9932[6], class705.field9932[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = class264.field3725[var19];
                            var46 = class361.field5242[var19];
                            var47 = var26 == null ? 0 : class174.field2463[var19];
                            var48 = class719.field10110[var19];
                            var49 = var27 == null ? 0 : class397.field5651[var19];
                        } else if (var17) {
                            var45 = class104.field1296[var19];
                            var49 = var27 == null ? 0 : class113.field1418[var19];
                            var44 = class533.field7532[var19];
                            var48 = class220.field3135[var19];
                            var46 = class681.field9678[var19];
                            var47 = var26 == null ? 0 : class762.field10497[var19];
                        } else {
                            var46 = class651.field9166[var19];
                            var48 = class164.field2415[var19];
                            var49 = var27 == null ? 0 : class345.field5079[var19];
                            var45 = class509.field7259[var19];
                            var47 = var26 == null ? 0 : class452.field6506[var19];
                            var44 = class784.field10781[var19];
                        }
                        int var50 = var47 + var49;
                        if (var50 <= 0) {
                            class373.method2321(arg5, var12, var14);
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
                            int[] var61 = arg0 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2407;
                                var63 = var26.field2406;
                                var64 = var26.field2400;
                                int var65 = class356.method2246(-6, var26, arg1);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 1;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 1;
                                        class341.field5058[4] = var45[var51];
                                        var99 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 5;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 5;
                                        class341.field5058[4] = var45[var51];
                                        class341.field5058[5] = var48[var51];
                                        var99 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 3;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 3;
                                        class341.field5058[4] = var45[var51];
                                        var99 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 7;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 7;
                                        class341.field5058[4] = var45[var51];
                                        var99 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = var45[var51];
                                        var99 = 3;
                                        class341.field5058[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class341.field5058[var100];
                                        int var102 = var101 - var20 * 2 & 0x7;
                                        int var103 = this.field5740[var101];
                                        int var104 = this.field5727[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var105 = 512 - var103;
                                            var106 = var104;
                                        } else if (var20 == 2) {
                                            var106 = 512 - var103;
                                            var105 = 512 - var104;
                                        } else if (var20 == 3) {
                                            var106 = 512 - var104;
                                            var105 = var103;
                                        } else {
                                            var106 = var103;
                                            var105 = var104;
                                        }
                                        var55[var52] = var106;
                                        var56[var52] = var105;
                                        if (var60 != null && class517.field7394[var19][var101]) {
                                            int var107 = (var12 << 9) + var106;
                                            int var108 = (var14 << 9) + var105;
                                            var60[var52] = arg0.method1977((byte) -36, var107, var108) - arg3.method1977((byte) 119, var107, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class517.field7394[var19][var101]) {
                                                int var109 = (var12 << 9) + var106;
                                                int var110 = (var14 << 9) + var105;
                                                var61[var52] = arg3.method1977((byte) -85, var109, var110) - arg0.method1977((byte) -32, var109, var110);
                                            } else if (arg2 != null && !class674.field9617[var19][var101]) {
                                                int var111 = (var12 << 9) + var106;
                                                int var112 = (var14 << 9) + var105;
                                                var61[var52] = arg2.method1977((byte) -51, var111, var112) - arg3.method1977((byte) -50, var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && class75.field1008[var102] > var26.field2395) {
                                            if (var54 != null) {
                                                var54[var52] = class745.field10373[var102];
                                            }
                                            var59[var52] = class217.field3117[var102];
                                            var58[var52] = class239.field3451[var102];
                                            var57[var52] = class117.field1460[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field2406;
                                            var59[var52] = var26.field2400;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field5741 && arg5 == 0) {
                                    class262.method1726(var12, var14, var26.field2413, var26.field2405 * 8, var26.field2402);
                                }
                                if (var19 != 12 && var26.field2407 != -1 && var26.field2393) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class174.field2463[var19];
                            } else if (var17) {
                                var51 += class762.field10497[var19];
                            } else {
                                var51 += class452.field6506[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class493 var67 = this.field5739.method4152(-111, var22 - 1);
                                class493 var68 = this.field5739.method4152(arg4 ^ 0xFFFFC11C, var23 - 1);
                                class493 var69 = this.field5739.method4152(-117, var24 - 1);
                                class493 var70 = this.field5739.method4152(-116, var25 - 1);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 1;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 1;
                                        class341.field5058[4] = var45[var51];
                                        var73 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 5;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 5;
                                        class341.field5058[4] = var45[var51];
                                        var73 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 3;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 3;
                                        class341.field5058[4] = var45[var51];
                                        var73 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = 7;
                                        class341.field5058[2] = var48[var51];
                                        class341.field5058[3] = 7;
                                        class341.field5058[4] = var45[var51];
                                        var73 = 6;
                                        class341.field5058[5] = var48[var51];
                                    } else {
                                        class341.field5058[0] = var46[var51];
                                        class341.field5058[1] = var45[var51];
                                        var73 = 3;
                                        class341.field5058[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class341.field5058[var74];
                                        int var76 = var75 - var20 * 2 & 0x7;
                                        int var77 = this.field5740[var75];
                                        int var78 = this.field5727[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = var78;
                                            var79 = 512 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 512 - var77;
                                            var79 = 512 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 512 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class517.field7394[var19][var75]) {
                                            int var81 = (var12 << 9) + var80;
                                            int var82 = (var14 << 9) + var79;
                                            var60[var52] = arg0.method1977((byte) -20, var81, var82) - arg3.method1977((byte) -73, var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class517.field7394[var19][var75]) {
                                                int var83 = (var12 << 9) + var80;
                                                int var84 = (var14 << 9) + var79;
                                                var61[var52] = arg3.method1977((byte) -36, var83, var84) - arg0.method1977((byte) -57, var83, var84);
                                            } else if (arg2 != null && !class674.field9617[var19][var75]) {
                                                int var85 = (var12 << 9) + var80;
                                                int var86 = (var14 << 9) + var79;
                                                var61[var52] = arg2.method1977((byte) -49, var85, var86) - arg3.method1977((byte) -9, var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class75.field1008[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class745.field10373[var76];
                                            }
                                            var59[var52] = class217.field3117[var76];
                                            var58[var52] = class239.field3451[var76];
                                            var57[var52] = class117.field1460[var76];
                                        } else {
                                            if (var17 && class517.field7394[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field7003;
                                                var59[var52] = var67.field7007;
                                            } else if (var80 == 0 && var79 == 512) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field7003;
                                                var59[var52] = var68.field7007;
                                            } else if (var80 == 512 && var79 == 512) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field7003;
                                                var59[var52] = var69.field7007;
                                            } else if (var80 == 512 && var79 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field7003;
                                                var59[var52] = var70.field7007;
                                            } else {
                                                if (var80 < 256) {
                                                    if (var79 < 256) {
                                                        var58[var52] = var67.field7003;
                                                        var59[var52] = var67.field7007;
                                                    } else {
                                                        var58[var52] = var68.field7003;
                                                        var59[var52] = var68.field7007;
                                                    }
                                                } else if (var79 < 256) {
                                                    var58[var52] = var70.field7003;
                                                    var59[var52] = var70.field7007;
                                                } else {
                                                    var58[var52] = var69.field7003;
                                                    var59[var52] = var69.field7007;
                                                }
                                                int var87 = class306.method2014(16209, arg6[var12][var14], arg6[var13][var14], var80 << 7 >> 9);
                                                int var88 = class306.method2014(16209, arg6[var12][var15], arg6[var13][var15], var80 << 7 >> 9);
                                                var57[var52] = class306.method2014(16209, var87, var88, var79 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field6995) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method1976(var12, -1, var14);
                            int var90 = arg3.method1976(var13, -1, var14);
                            int var91 = arg3.method1976(var13, -1, var15);
                            int var92 = arg3.method1976(var12, -1, var15);
                            boolean var93 = class627.method3593(var12, (byte) 58, var14);
                            if (var93 && arg5 > 1 || !var93 && arg5 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field7006) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field2392) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field5724[arg5][var12][var14] = (byte) class281.method1904(this.field5724[arg5][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field5741) {
                                var95 = class554.method3224(var12, var14);
                                var96 = class541.method3122(var12, var14);
                                var97 = class71.method563(var12, var14);
                            }
                            arg3.method1241(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class373.method2321(arg5, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILrv;I[Lmja;IIII)V")
    public final void method2445(int arg0, int arg1, int arg2, class120 arg3, int arg4, class438[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field5744++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (arg1 > -15) {
            this.method2454(null, null, null, null, null, 24, (byte) -106);
        }
        if (!this.field5741) {
            class438 var13 = arg5[arg4];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class321.method2082(var14 & 0x7, true, var15 & 0x7, arg0) + arg2;
                    int var17 = arg7 + class482.method2825(var15 & 0x7, (byte) 100, arg0, var14 & 0x7);
                    if (var16 > 0 && var16 < (this.field5732 - 1) && var17 > 0 && this.field5742 - 1 > var17) {
                        var13.method2656(var17, var16, true);
                    }
                }
            }
        }
        int var18 = arg9 & 0x1FFFFFF8 << 3;
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field5736; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 == var22 && var11 <= var23 && var23 <= (var11 + 8) && var12 <= var24 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg0 == 0) {
                                var25 = var23 + arg2 - var11;
                                var26 = var24 + arg7 - var12;
                            } else if (arg0 == 1) {
                                var25 = arg2 - (var12 - var24);
                                var26 = arg7 + var11 + 8 - var23;
                            } else if (arg0 == 2) {
                                var25 = var11 + arg2 + 8 - var23;
                                var26 = var12 + arg7 + 8 - var24;
                            } else {
                                var26 = var23 + arg7 - var11;
                                var25 = var12 + arg2 + 8 - var24;
                            }
                            this.method2450(true, var26, 0, 0, var25, 0, arg4, 80, arg3, var19 + var24, var18 + var23);
                        } else {
                            var25 = class321.method2082(var23 & 0x7, true, var24 & 0x7, arg0) + arg2;
                            var26 = arg7 + class482.method2825(var24 & 0x7, (byte) 100, arg0, var23 & 0x7);
                            this.method2450(false, var26, arg0, var21, var25, var20, arg4, 122, arg3, var19 + var24, var18 - -var23);
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
                                if (arg0 == 0) {
                                    var32 = arg2 + var29 - var11;
                                    var31 = -var12 - (-var30 - arg7);
                                } else if (arg0 == 1) {
                                    var31 = arg7 + var11 + 8 - var29;
                                    var32 = arg2 - (var12 - var30);
                                } else if (arg0 == 2) {
                                    var31 = var12 - (var30 - arg7 - 8);
                                    var32 = var11 + arg2 + 8 - var29;
                                } else {
                                    var32 = arg2 + 8 - (-var12 + var30);
                                    var31 = arg7 + var29 - var11;
                                }
                                if (var32 >= 0 && this.field5732 > var32 && var31 >= 0 && var31 < this.field5742) {
                                    this.field5717[arg4][var32][var31] = this.field5717[arg4][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2450(false, -1, 0, 0, -1, 0, 0, 113, arg3, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([Lmja;Lha;[[[IB)V")
    public final void method2446(class438[] arg0, class66 arg1, int[][][] arg2, byte arg3) {
        if (arg3 > -38) {
            this.method2449(75, null, null, -84, null, null, null, -114, -34, null, false, null, -26, 5);
        }
        field5745++;
        if (!this.field5741) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field5732; var6++) {
                    for (int var7 = 0; var7 < this.field5742; var7++) {
                        if ((class617.field8700[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class617.field8700[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method2650(var7, var6, -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field5736; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field5741) {
                if (class661.field9288) {
                    var10 |= 0x2;
                }
                if (class644.field9061) {
                    var11 |= 0x8;
                }
                if (class489.field6915 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class217.field3115) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class661.field9288) {
                var11 |= 0x7;
            }
            if (!class124.field1614) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || arg2.length <= var9 ? this.field5717[var9] : arg2[var9];
            class486.method2838(var9, arg1.method477(this.field5732, this.field5742, this.field5717[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB[[I)V")
    public final void method2447(int arg0, byte arg1, int[][] arg2) {
        field5718++;
        int[][] var4 = this.field5717[arg0];
        for (int var5 = 0; var5 < this.field5732 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field5742 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg1 >= -91) {
            this.method2454(null, null, null, null, null, 19, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method2448(int arg0) {
        if (arg0 != -10315) {
            method2452(90, (byte) -128, 40);
        }
        field5738 = null;
        field5737 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I[[B[[BI[[BLg;[ZIILha;ZLso;II)V")
    private final void method2449(int arg0, byte[][] arg1, byte[][] arg2, int arg3, byte[][] arg4, class164 arg5, boolean[] arg6, int arg7, int arg8, class66 arg9, boolean arg10, class493 arg11, int arg12, int arg13) {
        if (arg10) {
            this.method2441(false, 33, -88, -120, -49);
        }
        field5735++;
        boolean[] var15 = arg5 != null && arg5.field2396 ? class217.field3116[arg7] : class223.field3202[arg7];
        if (arg8 > 0) {
            if (arg12 > 0) {
                int var16 = arg4[arg12 - 1][arg8 - 1] & 0xFF;
                if (var16 > 0) {
                    class164 var17 = this.field5722.method3922((byte) -74, var16 - 1);
                    if (var17.field2407 != -1 && var17.field2396) {
                        byte var18 = arg2[arg12 - 1][arg8 - 1];
                        int var19 = arg1[arg12 - 1][arg8 - 1] * 2 + 4 & 0x7;
                        int var20 = class356.method2246(-6, var17, arg9);
                        if (class517.field7394[var18][var19]) {
                            class117.field1460[0] = var17.field2407;
                            class745.field10373[0] = var20;
                            class239.field3451[0] = var17.field2406;
                            class217.field3117[0] = var17.field2400;
                            class75.field1008[0] = var17.field2395;
                            class705.field9932[0] = 256;
                        }
                    }
                }
            }
            if ((arg3 - 1) > arg12) {
                int var21 = arg4[arg12 + 1][arg8 - 1] & 0xFF;
                if (var21 > 0) {
                    class164 var22 = this.field5722.method3922((byte) -10, var21 - 1);
                    if (var22.field2407 != -1 && var22.field2396) {
                        byte var23 = arg2[arg12 + 1][arg8 - 1];
                        int var24 = arg1[arg12 + 1][arg8 - 1] * 2 + 6 & 0x7;
                        int var25 = class356.method2246(-6, var22, arg9);
                        if (class517.field7394[var23][var24]) {
                            class117.field1460[2] = var22.field2407;
                            class745.field10373[2] = var25;
                            class239.field3451[2] = var22.field2406;
                            class217.field3117[2] = var22.field2400;
                            class75.field1008[2] = var22.field2395;
                            class705.field9932[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg0 - 1 > arg8) {
            if (arg12 > 0) {
                int var26 = arg4[arg12 - 1][arg8 + 1] & 0xFF;
                if (var26 > 0) {
                    class164 var27 = this.field5722.method3922((byte) -119, var26 - 1);
                    if (var27.field2407 != -1 && var27.field2396) {
                        byte var28 = arg2[arg12 - 1][arg8 + 1];
                        int var29 = (arg1[arg12 - 1][arg8 + 1] * 2) + 2 & 0x7;
                        int var30 = class356.method2246(-6, var27, arg9);
                        if (class517.field7394[var28][var29]) {
                            class117.field1460[6] = var27.field2407;
                            class745.field10373[6] = var30;
                            class239.field3451[6] = var27.field2406;
                            class217.field3117[6] = var27.field2400;
                            class75.field1008[6] = var27.field2395;
                            class705.field9932[6] = 64;
                        }
                    }
                }
            }
            if (arg12 < arg3 - 1) {
                int var31 = arg4[arg12 + 1][arg8 + 1] & 0xFF;
                if (var31 > 0) {
                    class164 var32 = this.field5722.method3922((byte) -59, var31 - 1);
                    if (var32.field2407 != -1 && var32.field2396) {
                        byte var33 = arg2[arg12 + 1][arg8 + 1];
                        int var34 = -(-(arg1[arg12 + 1][arg8 + 1] * 2)) & 0x7;
                        int var35 = class356.method2246(-6, var32, arg9);
                        if (class517.field7394[var33][var34]) {
                            class117.field1460[4] = var32.field2407;
                            class745.field10373[4] = var35;
                            class239.field3451[4] = var32.field2406;
                            class217.field3117[4] = var32.field2400;
                            class75.field1008[4] = var32.field2395;
                            class705.field9932[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg8 > 0) {
            int var36 = arg4[arg12][arg8 - 1] & 0xFF;
            if (var36 > 0) {
                class164 var37 = this.field5722.method3922((byte) -16, var36 - 1);
                if (var37.field2407 != -1) {
                    byte var38 = arg2[arg12][arg8 - 1];
                    byte var39 = arg1[arg12][arg8 - 1];
                    if (var37.field2396) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class356.method2246(-6, var37, arg9);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class517.field7394[var38][var41] && class75.field1008[var40] <= var37.field2395) {
                                class117.field1460[var40] = var37.field2407;
                                class745.field10373[var40] = var42;
                                class239.field3451[var40] = var37.field2406;
                                class217.field3117[var40] = var37.field2400;
                                if (class75.field1008[var40] == var37.field2395) {
                                    class705.field9932[var40] = class281.method1904(class705.field9932[var40], 32);
                                } else {
                                    class705.field9932[var40] = 32;
                                }
                                class75.field1008[var40] = var37.field2395;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg13 & 0x3]) {
                            arg6[0] = class217.field3116[var38][class111.method773(var39 + 2, 3)];
                        }
                    } else if (!var15[arg13 & 0x3]) {
                        arg6[0] = class223.field3202[var38][class111.method773(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg8 < (arg0 - 1)) {
            int var44 = arg4[arg12][arg8 + 1] & 0xFF;
            if (var44 > 0) {
                class164 var45 = this.field5722.method3922((byte) -90, var44 - 1);
                if (var45.field2407 != -1) {
                    byte var46 = arg2[arg12][arg8 + 1];
                    byte var47 = arg1[arg12][arg8 + 1];
                    if (var45.field2396) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class356.method2246(-6, var45, arg9);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class517.field7394[var46][var49] && class75.field1008[var48] <= var45.field2395) {
                                class117.field1460[var48] = var45.field2407;
                                class745.field10373[var48] = var50;
                                class239.field3451[var48] = var45.field2406;
                                class217.field3117[var48] = var45.field2400;
                                if (class75.field1008[var48] == var45.field2395) {
                                    class705.field9932[var48] = class281.method1904(class705.field9932[var48], 16);
                                } else {
                                    class705.field9932[var48] = 16;
                                }
                                class75.field1008[var48] = var45.field2395;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg13 + 2 & 0x3]) {
                            arg6[2] = class217.field3116[var46][class111.method773(var47, 3)];
                        }
                    } else if (!var15[arg13 + 2 & 0x3]) {
                        arg6[2] = class223.field3202[var46][class111.method773(var47, 3)];
                    }
                }
            }
        }
        if (arg12 > 0) {
            int var52 = arg4[arg12 - 1][arg8] & 0xFF;
            if (var52 > 0) {
                class164 var53 = this.field5722.method3922((byte) -42, var52 - 1);
                if (var53.field2407 != -1) {
                    byte var54 = arg2[arg12 - 1][arg8];
                    byte var55 = arg1[arg12 - 1][arg8];
                    if (var53.field2396) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class356.method2246(-6, var53, arg9);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class517.field7394[var54][var57] && class75.field1008[var56] <= var53.field2395) {
                                class117.field1460[var56] = var53.field2407;
                                class745.field10373[var56] = var58;
                                class239.field3451[var56] = var53.field2406;
                                class217.field3117[var56] = var53.field2400;
                                if (class75.field1008[var56] == var53.field2395) {
                                    class705.field9932[var56] = class281.method1904(class705.field9932[var56], 8);
                                } else {
                                    class705.field9932[var56] = 8;
                                }
                                class75.field1008[var56] = var53.field2395;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg13 + 3 & 0x3]) {
                            arg6[3] = class217.field3116[var54][class111.method773(var55 + 1, 3)];
                        }
                    } else if (!var15[arg13 + 3 & 0x3]) {
                        arg6[3] = class223.field3202[var54][class111.method773(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg12 < (arg3 - 1)) {
            int var60 = arg4[arg12 + 1][arg8] & 0xFF;
            if (var60 > 0) {
                class164 var61 = this.field5722.method3922((byte) -120, var60 - 1);
                if (var61.field2407 != -1) {
                    byte var62 = arg2[arg12 + 1][arg8];
                    byte var63 = arg1[arg12 + 1][arg8];
                    if (var61.field2396) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class356.method2246(-6, var61, arg9);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class517.field7394[var62][var65] && class75.field1008[var64] <= var61.field2395) {
                                class117.field1460[var64] = var61.field2407;
                                class745.field10373[var64] = var66;
                                class239.field3451[var64] = var61.field2406;
                                class217.field3117[var64] = var61.field2400;
                                if (class75.field1008[var64] == var61.field2395) {
                                    class705.field9932[var64] = class281.method1904(class705.field9932[var64], 4);
                                } else {
                                    class705.field9932[var64] = 4;
                                }
                                class75.field1008[var64] = var61.field2395;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg13 + 1 & 0x3]) {
                            arg6[1] = class217.field3116[var62][class111.method773(3, var63 + 3)];
                        }
                    } else if (!var15[arg13 + 1 & 0x3]) {
                        arg6[1] = class223.field3202[var62][class111.method773(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg5 == null) {
            return;
        }
        int var68 = class356.method2246(-6, arg5, arg9);
        if (!arg5.field2396) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg13 * 2 & 0x7;
            if (class517.field7394[arg7][var69] && arg5.field2395 >= class75.field1008[var70]) {
                class117.field1460[var70] = arg5.field2407;
                class745.field10373[var70] = var68;
                class239.field3451[var70] = arg5.field2406;
                class217.field3117[var70] = arg5.field2400;
                if (class75.field1008[var70] == arg5.field2395) {
                    class705.field9932[var70] = class281.method1904(class705.field9932[var70], 2);
                } else {
                    class705.field9932[var70] = 2;
                }
                class75.field1008[var70] = arg5.field2395;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIIIIIILrv;II)V")
    private final void method2450(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class120 arg8, int arg9, int arg10) {
        field5726++;
        if (arg2 == 1) {
            arg3 = 1;
        } else if (arg2 == 2) {
            arg3 = 1;
            arg5 = 1;
        } else if (arg2 == 3) {
            arg5 = 1;
        }
        if (arg7 < 74) {
            field5746 = 19;
        }
        if (arg4 < 0 || this.field5732 <= arg4 || arg1 < 0 || arg1 >= this.field5742) {
            while (true) {
                int var14 = arg8.method842(2384);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method842(2384);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method842(2384);
                }
            }
        }
        if (!this.field5741 && !arg0) {
            class617.field8700[arg6][arg4][arg1] = 0;
        }
        while (true) {
            int var12 = arg8.method842(2384);
            if (var12 == 0) {
                if (this.field5741) {
                    this.field5717[0][arg4 + arg5][arg1 + arg3] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field5717[0][arg4 + arg5][arg1 + arg3] = -class140.method976(60, arg9 + 556238, arg10 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field5717[arg6][arg4 + arg5][arg1 + arg3] = this.field5717[arg6 - 1][arg4 + arg5][arg1 + arg3] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method842(2384);
                if (!this.field5741) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 == 0) {
                        this.field5717[0][arg4 + arg5][arg1 + arg3] = -var13 * 8 << 2;
                        return;
                    }
                    this.field5717[arg6][arg4 + arg5][arg1 + arg3] = this.field5717[arg6 - 1][arg4 + arg5][arg1 + arg3] - (var13 * 8 << 2);
                    return;
                }
                this.field5717[0][arg4 + arg5][arg1 + arg3] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg0) {
                    arg8.method842(2384);
                } else {
                    this.field5729[arg6][arg4][arg1] = arg8.method877(-252);
                    this.field5733[arg6][arg4][arg1] = (byte) ((var12 - 2) / 4);
                    this.field5730[arg6][arg4][arg1] = (byte) class111.method773(3, var12 + arg2 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field5741 && !arg0) {
                    class617.field8700[arg6][arg4][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg0) {
                this.field5720[arg6][arg4][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIIII)V")
    public final void method2451(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2;
        if (!arg0) {
            return;
        }
        while (var7 < (arg2 + arg3)) {
            for (int var10 = arg4; var10 < (arg4 + arg5); var10++) {
                if (var10 >= 0 && var10 < this.field5732 && var7 >= 0 && var7 < this.field5742) {
                    this.field5717[arg1][var10][var7] = arg1 <= 0 ? 0 : this.field5717[arg1 - 1][var10][var7] - 960;
                }
            }
            var7++;
        }
        field5743++;
        if (arg4 > 0 && this.field5732 > arg4) {
            for (int var8 = arg2 + 1; var8 < arg2 + arg3; var8++) {
                if (var8 >= 0 && this.field5742 > var8) {
                    this.field5717[arg1][arg4][var8] = this.field5717[arg1][arg4 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field5742) {
            for (int var9 = arg4 + 1; var9 < arg4 + arg5; var9++) {
                if (var9 >= 0 && var9 < this.field5732) {
                    this.field5717[arg1][var9][arg2] = this.field5717[arg1][var9][arg2 - 1];
                }
            }
        }
        if (arg4 < 0 || arg2 < 0 || this.field5732 <= arg4 || arg2 >= this.field5742) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 > 0 && this.field5717[arg1][arg4 - 1][arg2] != 0) {
                this.field5717[arg1][arg4][arg2] = this.field5717[arg1][arg4 - 1][arg2];
                return;
            }
            if (arg2 > 0 && this.field5717[arg1][arg4][arg2 - 1] != 0) {
                this.field5717[arg1][arg4][arg2] = this.field5717[arg1][arg4][arg2 - 1];
                return;
            }
            if (arg4 > 0 && arg2 > 0 && this.field5717[arg1][arg4 - 1][arg2 - 1] != 0) {
                this.field5717[arg1][arg4][arg2] = this.field5717[arg1][arg4 - 1][arg2 - 1];
                return;
            }
        } else if (arg4 <= 0 || this.field5717[arg1][arg4 - 1][arg2] == this.field5717[arg1 - 1][arg4 - 1][arg2]) {
            if (arg2 > 0 && this.field5717[arg1 - 1][arg4][arg2 - 1] != this.field5717[arg1][arg4][arg2 - 1]) {
                this.field5717[arg1][arg4][arg2] = this.field5717[arg1][arg4][arg2 - 1];
                return;
            }
            if (arg4 > 0 && arg2 > 0 && this.field5717[arg1 - 1][arg4 - 1][arg2 - 1] != this.field5717[arg1][arg4 - 1][arg2 - 1]) {
                this.field5717[arg1][arg4][arg2] = this.field5717[arg1][arg4 - 1][arg2 - 1];
                return;
            }
            return;
        } else {
            this.field5717[arg1][arg4][arg2] = this.field5717[arg1][arg4 - 1][arg2];
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)V")
    public static final void method2452(int arg0, byte arg1, int arg2) {
        class333.field4974 = arg0;
        field5716++;
        int var3 = -101 % ((-arg1 - 67) / 33);
        class377.field5425 = arg2;
        if (class463.field6612 == 0) {
            class745.field10372 = class151.field1984 * 2 + class377.field5425;
            class212.field3070 = class394.field5585 * 2 + class333.field4974;
        } else if (class463.field6612 == 1) {
            class606.field8522 = class377.field5425 / class692.field9768 + class457.field6550 + 2;
            class526.field7491 = class333.field4974 / class637.field8968 + class410.field5795 + 2;
            class745.field10372 = class692.field9768 * class606.field8522;
            class212.field3070 = class637.field8968 * class526.field7491;
            class151.field1984 = class745.field10372 - class377.field5425 >> 1;
            class394.field5585 = class212.field3070 - class333.field4974 >> 1;
        } else if (class463.field6612 == 2) {
            class745.field10372 = class377.field5425;
            class212.field3070 = class333.field4974;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ls;Ls;Lha;I)V")
    public final void method2453(class292 arg0, class292 arg1, class66 arg2, int arg3) {
        field5719++;
        int[][] var5 = new int[this.field5732][this.field5742];
        if (class676.field9629 == null || class676.field9629.length != this.field5742) {
            class676.field9629 = new int[this.field5742];
            class410.field5785 = new int[this.field5742];
            class783.field10776 = new int[this.field5742];
            class411.field5797 = new int[this.field5742];
            class191.field2851 = new int[this.field5742];
        }
        if (arg3 <= 116) {
            this.method2453(null, null, null, 114);
        }
        for (int var6 = 0; var6 < this.field5736; var6++) {
            for (int var8 = 0; var8 < this.field5742; var8++) {
                class676.field9629[var8] = 0;
                class783.field10776[var8] = 0;
                class191.field2851[var8] = 0;
                class410.field5785[var8] = 0;
                class411.field5797[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field5732; var9++) {
                for (int var10 = 0; var10 < this.field5742; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field5732) {
                        int var20 = this.field5720[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class493 var21 = this.field5739.method4152(-87, var20 - 1);
                            class676.field9629[var10] += var21.field6993;
                            class783.field10776[var10] += var21.field7010;
                            class191.field2851[var10] += var21.field7000;
                            class410.field5785[var10] += var21.field7005;
                            var10002 = class411.field5797[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field5720[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class493 var24 = this.field5739.method4152(-123, var23 - 1);
                            class676.field9629[var10] -= var24.field6993;
                            class783.field10776[var10] -= var24.field7010;
                            class191.field2851[var10] -= var24.field7000;
                            class410.field5785[var10] -= var24.field7005;
                            var10002 = class411.field5797[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field5742; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field5742) {
                            var12 += class783.field10776[var17];
                            var15 += class411.field5797[var17];
                            var13 += class191.field2851[var17];
                            var14 += class410.field5785[var17];
                            var11 += class676.field9629[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class410.field5785[var18];
                            var11 -= class676.field9629[var18];
                            var12 -= class783.field10776[var18];
                            var15 -= class411.field5797[var18];
                            var13 -= class191.field2851[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class502.method2931(var11 * 256 / var14, true, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class599.field8440) {
                this.method2444(var6 == 0 ? arg0 : null, arg2, var6 == 0 ? arg1 : null, class622.field8777[var6], 16050, var6, var5);
            } else {
                this.method2454(var6 == 0 ? arg0 : null, arg2, class622.field8777[var6], var6 == 0 ? arg1 : null, var5, var6, (byte) 116);
            }
            this.field5720[var6] = null;
            this.field5729[var6] = null;
            this.field5733[var6] = null;
            this.field5730[var6] = null;
        }
        if (!this.field5741) {
            if (class489.field6915 != 0) {
                class145.method997();
            }
            if (class661.field9288) {
                class611.method3521();
            }
        }
        for (int var7 = 0; var7 < this.field5736; var7++) {
            class622.field8777[var7].method1238();
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ls;Lha;Ls;Ls;[[IIB)V")
    private final void method2454(class292 arg0, class66 arg1, class292 arg2, class292 arg3, int[][] arg4, int arg5, byte arg6) {
        for (int var8 = 0; var8 < this.field5732; var8++) {
            for (int var9 = 0; var9 < this.field5742; var9++) {
                if (class332.field4960 == -1 || class177.method1343(arg5, var8, var9, (byte) 72, class332.field4960)) {
                    byte var10 = this.field5733[arg5][var8][var9];
                    byte var11 = this.field5730[arg5][var8][var9];
                    int var12 = this.field5729[arg5][var8][var9] & 0xFF;
                    int var13 = this.field5720[arg5][var8][var9] & 0xFF;
                    class164 var14 = var12 == 0 ? null : this.field5722.method3922((byte) -20, var12 - 1);
                    class493 var15 = var13 == 0 ? null : this.field5739.method4152(-104, var13 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class164 var16 = var14;
                    if (var14 != null && var14.field2407 == -1 && var14.field2399 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class397.field5651[var10];
                        int var18 = class174.field2463[var10];
                        int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field2406;
                        int var23 = var15 == null ? -1 : var15.field7003;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field2399 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class361.field5242[var10][var21];
                                var25[var20] = class264.field3725[var10][var21];
                                var26[var20] = class719.field10110[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field2400;
                                var27[var20] = var14.field2407;
                                if (var30 != null) {
                                    var30[var20] = var14.field2399;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field5741 && arg5 == 0) {
                                class262.method1726(var8, var9, var14.field2413, var14.field2405 * 8, var14.field2402);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class361.field5242[var10][var21];
                                var25[var20] = class264.field3725[var10][var21];
                                var26[var20] = class719.field10110[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field7007;
                                var27[var20] = arg4[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field5740.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg0 == null ? null : new int[var33];
                        int[] var37 = arg0 == null && arg3 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field5740[var38];
                            int var49 = this.field5727[var38];
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
                            if (var36 != null && class517.field7394[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg0.method1977((byte) -18, var52, var53) - arg2.method1977((byte) -26, var52, var53);
                            }
                            if (var37 != null) {
                                if (arg0 != null && !class517.field7394[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg2.method1977((byte) -66, var54, var55) - arg0.method1977((byte) -22, var54, var55);
                                } else if (arg3 != null && !class674.field9617[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg3.method1977((byte) -27, var56, var57) - arg2.method1977((byte) -50, var56, var57);
                                }
                            }
                        }
                        int var39 = arg2.method1976(var8, -1, var9);
                        int var40 = arg2.method1976(var8 + 1, -1, var9);
                        int var41 = arg2.method1976(var8 + 1, -1, var9 + 1);
                        int var42 = arg2.method1976(var8, -1, var9 + 1);
                        boolean var43 = class627.method3593(var8, (byte) -98, var9);
                        if (var43 && arg5 > 1 || !var43 && arg5 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field7006) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field2392) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field5724[arg5][var8][var9] = (byte) class281.method1904(this.field5724[arg5][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field5741) {
                            var45 = class554.method3224(var8, var9);
                            var46 = class541.method3122(var8, var9);
                            var47 = class71.method563(var8, var9);
                        }
                        arg2.method1239(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class373.method2321(arg5, var8, var9);
                    }
                }
            }
        }
        if (arg6 <= 112) {
            this.field5731 = null;
        }
        field5721++;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(IIIZLab;Lpca;)V")
    public class406(int arg0, int arg1, int arg2, boolean arg3, class696 arg4, class744 arg5) {
        this.field5722 = arg4;
        this.field5741 = arg3;
        this.field5732 = arg1;
        this.field5739 = arg5;
        this.field5736 = arg0;
        this.field5742 = arg2;
        this.field5733 = new byte[this.field5736][this.field5732][this.field5742];
        this.field5724 = new byte[this.field5736][this.field5732 + 1][this.field5742 + 1];
        this.field5729 = new byte[this.field5736][this.field5732][this.field5742];
        this.field5717 = new int[this.field5736][this.field5732 + 1][this.field5742 + 1];
        this.field5730 = new byte[this.field5736][this.field5732][this.field5742];
        this.field5720 = new byte[this.field5736][this.field5732][this.field5742];
    }
}
