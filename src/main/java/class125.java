import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class125 {

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "[I")
    private int[] field2255 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
    private int[] field2250 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
    public boolean field2265;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "Llf;")
    private class217 field2277;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "Lsfa;")
    private class648 field2275;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "[[[B")
    public byte[][][] field2266;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "[[[B")
    private byte[][][] field2270;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "[[[B")
    private byte[][][] field2269;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "[[[B")
    private byte[][][] field2272;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "[[[B")
    private byte[][][] field2251;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "[[[I")
    public int[][][] field2264;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "[[I")
    public static int[][] field2257;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "[[[B")
    public byte[][][] field2273;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lr;Li;Li;Li;[[III)V")
    private final void method1070(class167 arg0, class37 arg1, class37 arg2, class37 arg3, int[][] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < this.field2262; var8++) {
            for (int var9 = 0; var9 < this.field2274; var9++) {
                if (class181.field2929 == -1 || class575.method3300(class181.field2929, arg6, var9, (byte) -16, var8)) {
                    byte var10 = this.field2269[arg6][var8][var9];
                    byte var11 = this.field2251[arg6][var8][var9];
                    int var12 = this.field2270[arg6][var8][var9] & 0xFF;
                    int var13 = this.field2272[arg6][var8][var9] & 0xFF;
                    class92 var14 = var12 == 0 ? null : this.field2275.method3697((byte) -125, var12 - 1);
                    class232 var15 = var13 == 0 ? null : this.field2277.method1510(false, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class366.field5435[var10];
                        var17 = var14 == null ? 0 : class409.field5918[var10];
                    } else if (var14 != null) {
                        var17 = class409.field5918[var10];
                    } else if (var15 != null) {
                        var16 = class409.field5918[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class571.field8300) {
                            var20 = var14 == null ? -1 : var14.field1681;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 != null && (var14.field1686 != -1 || var14.field1678 != -1 || var20 != -1)) {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field1676;
                                if (var14.field1686 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field1686;
                                }
                                if (var14.field1678 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field1678;
                                    var25 = true;
                                }
                                var19++;
                            }
                            if (!this.field2265 && arg6 == 0) {
                                class477.method2903(var8, var9, var14.field1677, var14.field1671 * 8, var14.field1684);
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
                            int var28 = var15.field3471;
                            if (class571.field8300) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var23[var19] = var28;
                                var24[var19] = var15.field3476;
                                var21[var19] = arg4[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field2255.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var46 = this.field2255[var36];
                            int var47 = this.field2250[var36];
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
                            if (var34 != null && class269.field4007[var10][var36]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var9 << 9) + var46;
                                var34[var36] = arg3.method552(1, var50, var51) - arg2.method552(1, var50, var51);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class269.field4007[var10][var36]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var9 << 9) + var46;
                                    var35[var36] = arg2.method552(1, var52, var53) - arg3.method552(1, var52, var53);
                                } else if (arg1 != null && !class568.field8274[var10][var36]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var9 << 9) + var46;
                                    var35[var36] = arg1.method552(1, var54, var55) - arg2.method552(1, var54, var55);
                                }
                            }
                        }
                        int var37 = arg2.method551(var8, var9, (byte) -126);
                        int var38 = arg2.method551(var8 + 1, var9, (byte) -112);
                        int var39 = arg2.method551(var8 + 1, var9 + 1, (byte) -111);
                        int var40 = arg2.method551(var8, var9 + 1, (byte) -110);
                        boolean var41 = class89.method868(5125, var8, var9);
                        if (var41 && arg6 > 1 || !var41 && arg6 > 0) {
                            boolean var42 = true;
                            if (var15 != null && !var15.field3474) {
                                var42 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var42 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field1670) {
                                var42 = false;
                            }
                            if (var42 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field2266[arg6][var8][var9] = (byte) class2.method189(this.field2266[arg6][var8][var9], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field2265) {
                            var43 = class70.method778(var8, var9);
                            var44 = class42.method566(var8, var9);
                            var45 = class78.method823(var8, var9);
                        }
                        arg2.method543(var8, var9, var32, var34, var33, var35, class526.field7418[var10], class382.field5642[var10], class293.field4405[var10], var21, var22, var23, var24, var43, var44, var45, false);
                        class406.method2471(arg6, var8, var9);
                    }
                }
            }
        }
        if (arg5 != 6596) {
            this.field2266 = null;
        }
        field2252++;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lfh;ILqh;IIIIIII)V")
    public final void method1071(class605[] arg0, int arg1, class61 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2261++;
        int var11 = (arg7 & 0x7) * 8;
        if (!this.field2265) {
            class605 var12 = arg0[arg8];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class140.method1139(var13 & 0x7, arg4, var14 & 0x7, true) + arg9;
                    int var16 = arg1 + class689.method3863(var13 & 0x7, (byte) 54, var14 & 0x7, arg4);
                    if (var15 > 0 && var15 < (this.field2262 - 1) && var16 > 0 && this.field2274 - 1 > var16) {
                        var12.method3485(-128, var15, var16);
                    }
                }
            }
        }
        int var17 = (arg5 & 0x7) * 8;
        int var18 = arg7 & 0x1FFFFFF8 << 3;
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg4 == 1) {
            var21 = 1;
        } else if (arg4 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg4 == 3) {
            var20 = 1;
        }
        int var22 = -7 % ((arg6 + 48) / 42);
        for (int var23 = 0; var23 < this.field2258; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg3 == var23 && var11 <= var24 && var24 <= var11 + 8 && var25 >= var17 && var17 + 8 >= var25) {
                        int var26;
                        int var27;
                        if (var11 + 8 == var24 || (var17 + 8) == var25) {
                            if (arg4 == 0) {
                                var26 = -var11 - (-var24 - arg9);
                                var27 = arg1 - (var17 - var25);
                            } else if (arg4 == 1) {
                                var27 = arg1 + var11 + 8 - var24;
                                var26 = var25 + arg9 - var17;
                            } else if (arg4 == 2) {
                                var27 = arg1 + 8 - (-var17 + var25);
                                var26 = arg9 + var11 + 8 - var24;
                            } else {
                                var26 = var17 + arg9 + 8 - var25;
                                var27 = -var11 - (-var24 - arg1);
                            }
                            this.method1080(var19 + var25, arg2, 0, var26, 0, true, 0, arg8, var18 + var24, var27, 0);
                        } else {
                            var26 = arg9 + class140.method1139(var24 & 0x7, arg4, var25 & 0x7, true);
                            var27 = arg1 + class689.method3863(var24 & 0x7, (byte) 58, var25 & 0x7, arg4);
                            this.method1080(var19 + var25, arg2, 0, var26, var20, false, var21, arg8, var18 + var24, var27, arg4);
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
                                    var31 = var25 == 63 ? 64 : var25;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var29 == 1) {
                                    var30 = 64;
                                } else if (var29 == 2) {
                                    var31 = 64;
                                }
                                int var32;
                                int var33;
                                if (arg4 == 0) {
                                    var33 = arg9 - (var11 - var30);
                                    var32 = -var17 - (-var31 - arg1);
                                } else if (arg4 == 1) {
                                    var32 = var11 + arg1 + 8 - var30;
                                    var33 = arg9 + var31 - var17;
                                } else if (arg4 == 2) {
                                    var33 = arg9 + var11 + 8 - var30;
                                    var32 = arg1 + 8 - (-var17 + var31);
                                } else {
                                    var33 = var17 + arg9 + 8 - var31;
                                    var32 = var30 + arg1 - var11;
                                }
                                if (var33 >= 0 && this.field2262 > var33 && var32 >= 0 && this.field2274 > var32) {
                                    this.field2264[arg8][var33][var32] = this.field2264[arg8][var20 + var26][var27 + var21];
                                }
                            }
                        }
                    } else {
                        this.method1080(0, arg2, 0, -1, 0, false, 0, 0, 0, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Li;Li;Lr;I)V")
    public final void method1072(class37 arg0, class37 arg1, class167 arg2, int arg3) {
        field2256++;
        int[][] var5 = new int[this.field2262][this.field2274];
        if (class5.field470 == null || class5.field470.length != this.field2274) {
            class5.field470 = new int[this.field2274];
            class544.field7588 = new int[this.field2274];
            class557.field7892 = new int[this.field2274];
            class167.field2770 = new int[this.field2274];
            class537.field7511 = new int[this.field2274];
        }
        for (int var6 = 0; var6 < this.field2258; var6++) {
            for (int var8 = 0; var8 < this.field2274; var8++) {
                class5.field470[var8] = 0;
                class557.field7892[var8] = 0;
                class167.field2770[var8] = 0;
                class537.field7511[var8] = 0;
                class544.field7588[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field2262; var9++) {
                for (int var10 = 0; var10 < this.field2274; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field2262 > var19) {
                        int var20 = this.field2272[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class232 var21 = this.field2277.method1510(false, var20 - 1);
                            class5.field470[var10] += var21.field3484;
                            class557.field7892[var10] += var21.field3472;
                            class167.field2770[var10] += var21.field3470;
                            class537.field7511[var10] += var21.field3477;
                            var10002 = class544.field7588[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field2272[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class232 var24 = this.field2277.method1510(false, var23 - 1);
                            class5.field470[var10] -= var24.field3484;
                            class557.field7892[var10] -= var24.field3472;
                            class167.field2770[var10] -= var24.field3470;
                            class537.field7511[var10] -= var24.field3477;
                            var10002 = class544.field7588[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field2274; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field2274) {
                            var11 += class5.field470[var17];
                            var14 += class537.field7511[var17];
                            var15 += class544.field7588[var17];
                            var12 += class557.field7892[var17];
                            var13 += class167.field2770[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class167.field2770[var18];
                            var12 -= class557.field7892[var18];
                            var15 -= class544.field7588[var18];
                            var14 -= class537.field7511[var18];
                            var11 -= class5.field470[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class610.method3507((byte) 62, var11 * 256 / var14, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class314.field4645) {
                this.method1076(arg2, var6 == 0 ? arg0 : null, -9177, class485.field6947[var6], var5, var6 == 0 ? arg1 : null, var6);
            } else {
                this.method1070(arg2, var6 == 0 ? arg0 : null, class485.field6947[var6], var6 == 0 ? arg1 : null, var5, 6596, var6);
            }
            this.field2272[var6] = null;
            this.field2270[var6] = null;
            this.field2269[var6] = null;
            this.field2251[var6] = null;
        }
        if (!this.field2265) {
            if (class108.field1863 != 0) {
                class481.method2918();
            }
            if (class460.field6567) {
                class557.method3171();
            }
        }
        int var7 = 0;
        if (arg3 != 4523) {
            this.method1076(null, null, 29, null, null, null, 9);
        }
        while (this.field2258 > var7) {
            class485.field6947[var7].method547();
            var7++;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILqh;II[Lfh;II)V")
    public final void method1073(int arg0, class61 arg1, int arg2, int arg3, class605[] arg4, int arg5, int arg6) {
        int var8 = -76 / ((25 - arg0) / 52);
        field2259++;
        if (!this.field2265) {
            for (int var9 = 0; var9 < 4; var9++) {
                class605 var10 = arg4[var9];
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        int var13 = arg2 + var11;
                        int var14 = arg6 + var12;
                        if (var13 >= 0 && this.field2262 > var13 && var14 >= 0 && this.field2274 > var14) {
                            var10.method3485(-124, var13, var14);
                        }
                    }
                }
            }
        }
        int var15 = arg2 + arg3;
        int var16 = arg5 + arg6;
        for (int var17 = 0; var17 < this.field2258; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method1080(var16 + var19, arg1, 0, arg2 + var18, 0, false, 0, var17, var15 + var18, var19 - -arg6, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[[II)V")
    public final void method1074(int arg0, int[][] arg1, int arg2) {
        field2271++;
        int[][] var4 = this.field2264[arg0];
        for (int var5 = 0; var5 < this.field2262 + 1; var5++) {
            for (int var7 = 0; var7 < (this.field2274 + 1); var7++) {
                var4[var5][var7] += arg1[var5][var7];
            }
        }
        int var6 = 51 / ((23 - arg2) / 41);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
    public final void method1075(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2260++;
        for (int var6 = 0; var6 < this.field2258; var6++) {
            this.method1079(arg0, arg3, 0, arg2, var6, arg4);
        }
        if (arg1 > -55) {
            this.method1077(null, null, -102, null, 9, null, null, -21, null, null, -34, -50, 46, 37);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lr;Li;ILi;[[ILi;I)V")
    private final void method1076(class167 arg0, class37 arg1, int arg2, class37 arg3, int[][] arg4, class37 arg5, int arg6) {
        field2254++;
        byte[][] var8 = this.field2269[arg6];
        byte[][] var9 = this.field2251[arg6];
        byte[][] var10 = this.field2272[arg6];
        byte[][] var11 = this.field2270[arg6];
        for (int var12 = 0; var12 < this.field2262; var12++) {
            int var13 = (this.field2262 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field2274; var14++) {
                int var15 = var14 >= (this.field2274 - 1) ? var14 : var14 + 1;
                if (class181.field2929 == -1 || class575.method3300(class181.field2929, arg6, var14, (byte) -16, var12)) {
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
                        class92 var26 = var21 == 0 ? null : this.field2275.method3697((byte) -125, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class232 var27 = var22 == 0 ? null : this.field2277.method1510(false, var22 - 1);
                        class92 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1686 == -1 && var26.field1678 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1682;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field2262 && this.field2274 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            int var37 = var32 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method551(var12, var14, (byte) -103) - arg3.method551(var13, var15, (byte) -95);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method551(var13, var14, (byte) -114) - arg3.method551(var12, var15, (byte) -105);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class246.field3707[var39] = -1;
                            class144.field2510[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1682 ? class247.field3714[var19] : class217.field3306[var19];
                        this.method1077(var11, var27, this.field2262, var8, var20, var18, var9, var19, var26, arg0, var12, this.field2274, arg2 ^ 0x23D8, var14);
                        boolean var41 = var26 != null && var26.field1686 != var26.field1678;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class246.field3707[var42] >= 0 && class91.field1665[var42] != class300.field4467[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class649.method3705(var18[1], class481.method2919(class144.field2510[2], class144.field2510[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class649.method3705(var18[3], class481.method2919(class144.field2510[6], class144.field2510[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class649.method3705(var18[0], class481.method2919(class144.field2510[0], class144.field2510[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class649.method3705(var18[2], class481.method2919(class144.field2510[6], class144.field2510[4]) == 0);
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
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
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
                            var47 = var27 == null ? 0 : class366.field5435[var19];
                            var46 = class293.field4405[var19];
                            var45 = class526.field7418[var19];
                            var49 = var26 == null ? 0 : class409.field5918[var19];
                            var48 = class382.field5642[var19];
                        } else if (var17) {
                            var47 = var27 == null ? 0 : class86.field1623[var19];
                            var48 = class422.field6107[var19];
                            var44 = class693.field9764[var19];
                            var46 = class184.field2963[var19];
                            var45 = class338.field5047[var19];
                            var49 = var26 == null ? 0 : class699.field9851[var19];
                        } else {
                            var45 = class368.field5457[var19];
                            var46 = class156.field2668[var19];
                            var47 = var27 == null ? 0 : class492.field7035[var19];
                            var48 = class46.field1133[var19];
                            var49 = var26 == null ? 0 : class150.field2569[var19];
                            var44 = class455.field6495[var19];
                        }
                        int var50 = var47 + var49;
                        if (var50 <= 0) {
                            class406.method2471(arg6, var12, var14);
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
                            int[] var61 = arg5 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field1681;
                                var64 = var26.field1676;
                                var62 = var26.field1686;
                                int var65 = class388.method2390(arg0, (byte) -1, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 1;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 1;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var99 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 5;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 5;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var99 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 3;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 3;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var99 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 7;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 7;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var99 = 6;
                                    } else {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = var48[var51];
                                        class3.field430[2] = var46[var51];
                                        var99 = 3;
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class3.field430[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field2255[var101];
                                        int var104 = this.field2250[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var105 = 512 - var103;
                                            var106 = var104;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var104;
                                            var106 = 512 - var103;
                                        } else if (var20 == 3) {
                                            var106 = 512 - var104;
                                            var105 = var103;
                                        } else {
                                            var105 = var104;
                                            var106 = var103;
                                        }
                                        var55[var52] = var106;
                                        var56[var52] = var105;
                                        if (var60 != null && class269.field4007[var19][var101]) {
                                            int var107 = (var12 << 9) + var106;
                                            int var108 = (var14 << 9) + var105;
                                            var60[var52] = arg5.method552(1, var107, var108) - arg3.method552(1, var107, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class269.field4007[var19][var101]) {
                                                int var109 = (var12 << 9) + var106;
                                                int var110 = (var14 << 9) + var105;
                                                var61[var52] = arg3.method552(1, var109, var110) - arg5.method552(1, var109, var110);
                                            } else if (arg1 != null && !class568.field8274[var19][var101]) {
                                                int var111 = (var12 << 9) + var106;
                                                int var112 = (var14 << 9) + var105;
                                                var61[var52] = arg1.method552(1, var111, var112) - arg3.method552(1, var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && var26.field1680 < class246.field3707[var102]) {
                                            if (var54 != null) {
                                                var54[var52] = class300.field4467[var102];
                                            }
                                            var59[var52] = class129.field2331[var102];
                                            var58[var52] = class305.field4525[var102];
                                            var57[var52] = class91.field1665[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field1681;
                                            var59[var52] = var26.field1676;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field2265 && arg6 == 0) {
                                    class477.method2903(var12, var14, var26.field1677, var26.field1671 * 8, var26.field1684);
                                }
                                if (var19 != 12 && var26.field1686 != -1 && var26.field1675) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class409.field5918[var19];
                            } else if (var17) {
                                var51 += class699.field9851[var19];
                            } else {
                                var51 += class150.field2569[var19];
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
                                class232 var67 = this.field2277.method1510(false, var22 - 1);
                                class232 var68 = this.field2277.method1510(false, var23 - 1);
                                class232 var69 = this.field2277.method1510(false, var24 - 1);
                                class232 var70 = this.field2277.method1510(false, var25 - 1);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 1;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 1;
                                        class3.field430[4] = var48[var51];
                                        var73 = 6;
                                        class3.field430[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 5;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 5;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 3;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 3;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = 7;
                                        class3.field430[2] = var46[var51];
                                        class3.field430[3] = 7;
                                        class3.field430[4] = var48[var51];
                                        class3.field430[5] = var46[var51];
                                        var73 = 6;
                                    } else {
                                        class3.field430[0] = var45[var51];
                                        class3.field430[1] = var48[var51];
                                        class3.field430[2] = var46[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class3.field430[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field2255[var75];
                                        int var78 = this.field2250[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = 512 - var77;
                                            var79 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 512 - var77;
                                            var80 = 512 - var78;
                                        } else if (var20 == 3) {
                                            var80 = var77;
                                            var79 = 512 - var78;
                                        } else {
                                            var80 = var78;
                                            var79 = var77;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class269.field4007[var19][var75]) {
                                            int var81 = (var12 << 9) + var79;
                                            int var82 = (var14 << 9) + var80;
                                            var60[var52] = arg5.method552(1, var81, var82) - arg3.method552(1, var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class269.field4007[var19][var75]) {
                                                int var83 = (var12 << 9) + var79;
                                                int var84 = (var14 << 9) + var80;
                                                var61[var52] = arg3.method552(arg2 + 9178, var83, var84) - arg5.method552(class691.method3871(arg2, -9178), var83, var84);
                                            } else if (arg1 != null && !class568.field8274[var19][var75]) {
                                                int var85 = (var12 << 9) + var79;
                                                int var86 = (var14 << 9) + var80;
                                                var61[var52] = arg1.method552(1, var85, var86) - arg3.method552(1, var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class246.field3707[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class300.field4467[var76];
                                            }
                                            var59[var52] = class129.field2331[var76];
                                            var58[var52] = class305.field4525[var76];
                                            var57[var52] = class91.field1665[var76];
                                        } else {
                                            if (var17 && class269.field4007[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var67.field3471;
                                                var59[var52] = var67.field3476;
                                            } else if (var79 == 0 && var80 == 512) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var68.field3471;
                                                var59[var52] = var68.field3476;
                                            } else if (var79 == 512 && var80 == 512) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var69.field3471;
                                                var59[var52] = var69.field3476;
                                            } else if (var79 == 512 && var80 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var70.field3471;
                                                var59[var52] = var70.field3476;
                                            } else {
                                                if (var79 >= 256) {
                                                    if (var80 < 256) {
                                                        var58[var52] = var70.field3471;
                                                        var59[var52] = var70.field3476;
                                                    } else {
                                                        var58[var52] = var69.field3471;
                                                        var59[var52] = var69.field3476;
                                                    }
                                                } else if (var80 < 256) {
                                                    var58[var52] = var67.field3471;
                                                    var59[var52] = var67.field3476;
                                                } else {
                                                    var58[var52] = var68.field3471;
                                                    var59[var52] = var68.field3476;
                                                }
                                                int var87 = class195.method1401(var79 << 7 >> 9, arg4[var13][var14], -94, arg4[var12][var14]);
                                                int var88 = class195.method1401(var79 << 7 >> 9, arg4[var13][var15], -116, arg4[var12][var15]);
                                                var57[var52] = class195.method1401(var80 << 7 >> 9, var88, arg2 + 9051, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field3475) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method551(var12, var14, (byte) -128);
                            int var90 = arg3.method551(var13, var14, (byte) -123);
                            int var91 = arg3.method551(var13, var15, (byte) -128);
                            int var92 = arg3.method551(var12, var15, (byte) -115);
                            boolean var93 = class89.method868(5125, var12, var14);
                            if (var93 && arg6 > 1 || !var93 && arg6 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field3474) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field1670) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field2266[arg6][var12][var14] = (byte) class2.method189(this.field2266[arg6][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field2265) {
                                var95 = class70.method778(var12, var14);
                                var96 = class42.method566(var12, var14);
                                var97 = class78.method823(var12, var14);
                            }
                            arg3.method542(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class406.method2471(arg6, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg2 != -9177) {
            this.method1073(90, null, -84, 125, null, 64, 73);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([[BLkf;I[[BI[Z[[BILer;Lr;IIII)V")
    private final void method1077(byte[][] arg0, class232 arg1, int arg2, byte[][] arg3, int arg4, boolean[] arg5, byte[][] arg6, int arg7, class92 arg8, class167 arg9, int arg10, int arg11, int arg12, int arg13) {
        field2276++;
        boolean[] var15 = arg8 != null && arg8.field1682 ? class247.field3714[arg7] : class217.field3306[arg7];
        if (arg13 > 0) {
            if (arg10 > 0) {
                int var16 = arg0[arg10 - 1][arg13 - 1] & 0xFF;
                if (var16 > 0) {
                    class92 var17 = this.field2275.method3697((byte) -125, var16 - 1);
                    if (var17.field1686 != -1 && var17.field1682) {
                        byte var18 = arg3[arg10 - 1][arg13 - 1];
                        int var19 = (arg6[arg10 - 1][arg13 - 1] * 2) + 4 & 0x7;
                        int var20 = class388.method2390(arg9, (byte) -1, var17);
                        if (class269.field4007[var18][var19]) {
                            class91.field1665[0] = var17.field1686;
                            class300.field4467[0] = var20;
                            class305.field4525[0] = var17.field1681;
                            class129.field2331[0] = var17.field1676;
                            class246.field3707[0] = var17.field1680;
                            class144.field2510[0] = 256;
                        }
                    }
                }
            }
            if ((arg2 - 1) > arg10) {
                int var21 = arg0[arg10 + 1][arg13 - 1] & 0xFF;
                if (var21 > 0) {
                    class92 var22 = this.field2275.method3697((byte) -125, var21 - 1);
                    if (var22.field1686 != -1 && var22.field1682) {
                        byte var23 = arg3[arg10 + 1][arg13 - 1];
                        int var24 = (arg6[arg10 + 1][arg13 - 1] * 2) + 6 & 0x7;
                        int var25 = class388.method2390(arg9, (byte) -1, var22);
                        if (class269.field4007[var23][var24]) {
                            class91.field1665[2] = var22.field1686;
                            class300.field4467[2] = var25;
                            class305.field4525[2] = var22.field1681;
                            class129.field2331[2] = var22.field1676;
                            class246.field3707[2] = var22.field1680;
                            class144.field2510[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg11 - 1) > arg13) {
            if (arg10 > 0) {
                int var26 = arg0[arg10 - 1][arg13 + 1] & 0xFF;
                if (var26 > 0) {
                    class92 var27 = this.field2275.method3697((byte) -125, var26 - 1);
                    if (var27.field1686 != -1 && var27.field1682) {
                        byte var28 = arg3[arg10 - 1][arg13 + 1];
                        int var29 = (arg6[arg10 - 1][arg13 + 1] * 2) + 2 & 0x7;
                        int var30 = class388.method2390(arg9, (byte) -1, var27);
                        if (class269.field4007[var28][var29]) {
                            class91.field1665[6] = var27.field1686;
                            class300.field4467[6] = var30;
                            class305.field4525[6] = var27.field1681;
                            class129.field2331[6] = var27.field1676;
                            class246.field3707[6] = var27.field1680;
                            class144.field2510[6] = 64;
                        }
                    }
                }
            }
            if ((arg2 - 1) > arg10) {
                int var31 = arg0[arg10 + 1][arg13 + 1] & 0xFF;
                if (var31 > 0) {
                    class92 var32 = this.field2275.method3697((byte) -125, var31 - 1);
                    if (var32.field1686 != -1 && var32.field1682) {
                        byte var33 = arg3[arg10 + 1][arg13 + 1];
                        int var34 = arg6[arg10 + 1][arg13 + 1] * 2 & 0x7;
                        int var35 = class388.method2390(arg9, (byte) -1, var32);
                        if (class269.field4007[var33][var34]) {
                            class91.field1665[4] = var32.field1686;
                            class300.field4467[4] = var35;
                            class305.field4525[4] = var32.field1681;
                            class129.field2331[4] = var32.field1676;
                            class246.field3707[4] = var32.field1680;
                            class144.field2510[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var36 = arg0[arg10][arg13 - 1] & 0xFF;
            if (var36 > 0) {
                class92 var37 = this.field2275.method3697((byte) -125, var36 - 1);
                if (var37.field1686 != -1) {
                    byte var38 = arg3[arg10][arg13 - 1];
                    byte var39 = arg6[arg10][arg13 - 1];
                    if (var37.field1682) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class388.method2390(arg9, (byte) -1, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class269.field4007[var38][var41] && class246.field3707[var40] <= var37.field1680) {
                                class91.field1665[var40] = var37.field1686;
                                class300.field4467[var40] = var42;
                                class305.field4525[var40] = var37.field1681;
                                class129.field2331[var40] = var37.field1676;
                                if (class246.field3707[var40] == var37.field1680) {
                                    class144.field2510[var40] = class2.method189(class144.field2510[var40], 32);
                                } else {
                                    class144.field2510[var40] = 32;
                                }
                                class246.field3707[var40] = var37.field1680;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg5[0] = class247.field3714[var38][class481.method2919(3, var39 + 2)];
                        }
                    } else if (!var15[arg4 & 0x3]) {
                        arg5[0] = class217.field3306[var38][class481.method2919(var39 + 2, 3)];
                    }
                }
            }
        }
        if ((arg11 - 1) > arg13) {
            int var44 = arg0[arg10][arg13 + 1] & 0xFF;
            if (var44 > 0) {
                class92 var45 = this.field2275.method3697((byte) -125, var44 - 1);
                if (var45.field1686 != -1) {
                    byte var46 = arg3[arg10][arg13 + 1];
                    byte var47 = arg6[arg10][arg13 + 1];
                    if (var45.field1682) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class388.method2390(arg9, (byte) -1, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class269.field4007[var46][var49] && class246.field3707[var48] <= var45.field1680) {
                                class91.field1665[var48] = var45.field1686;
                                class300.field4467[var48] = var50;
                                class305.field4525[var48] = var45.field1681;
                                class129.field2331[var48] = var45.field1676;
                                if (class246.field3707[var48] == var45.field1680) {
                                    class144.field2510[var48] = class2.method189(class144.field2510[var48], 16);
                                } else {
                                    class144.field2510[var48] = 16;
                                }
                                class246.field3707[var48] = var45.field1680;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg5[2] = class247.field3714[var46][class481.method2919(var47, 3)];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg5[2] = class217.field3306[var46][class481.method2919(3, -(-var47))];
                    }
                }
            }
        }
        if (arg10 > 0) {
            int var52 = arg0[arg10 - 1][arg13] & 0xFF;
            if (var52 > 0) {
                class92 var53 = this.field2275.method3697((byte) -125, var52 - 1);
                if (var53.field1686 != -1) {
                    byte var54 = arg3[arg10 - 1][arg13];
                    byte var55 = arg6[arg10 - 1][arg13];
                    if (var53.field1682) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class388.method2390(arg9, (byte) -1, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class269.field4007[var54][var57] && var53.field1680 >= class246.field3707[var56]) {
                                class91.field1665[var56] = var53.field1686;
                                class300.field4467[var56] = var58;
                                class305.field4525[var56] = var53.field1681;
                                class129.field2331[var56] = var53.field1676;
                                if (class246.field3707[var56] == var53.field1680) {
                                    class144.field2510[var56] = class2.method189(class144.field2510[var56], 8);
                                } else {
                                    class144.field2510[var56] = 8;
                                }
                                class246.field3707[var56] = var53.field1680;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg5[3] = class247.field3714[var54][class481.method2919(3, var55 + 1)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg5[3] = class217.field3306[var54][class481.method2919(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg10 < (arg2 + arg12)) {
            int var60 = arg0[arg10 + 1][arg13] & 0xFF;
            if (var60 > 0) {
                class92 var61 = this.field2275.method3697((byte) -125, var60 - 1);
                if (var61.field1686 != -1) {
                    byte var62 = arg3[arg10 + 1][arg13];
                    byte var63 = arg6[arg10 + 1][arg13];
                    if (var61.field1682) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class388.method2390(arg9, (byte) -1, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class269.field4007[var62][var65] && var61.field1680 >= class246.field3707[var64]) {
                                class91.field1665[var64] = var61.field1686;
                                class300.field4467[var64] = var66;
                                class305.field4525[var64] = var61.field1681;
                                class129.field2331[var64] = var61.field1676;
                                if (class246.field3707[var64] == var61.field1680) {
                                    class144.field2510[var64] = class2.method189(class144.field2510[var64], 4);
                                } else {
                                    class144.field2510[var64] = 4;
                                }
                                class246.field3707[var64] = var61.field1680;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg5[1] = class247.field3714[var62][class481.method2919(var63 + 3, 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg5[1] = class217.field3306[var62][class481.method2919(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class388.method2390(arg9, (byte) -1, arg8);
        if (!arg8.field1682) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg4 * 2 & 0x7;
            if (class269.field4007[arg7][var69] && arg8.field1680 >= class246.field3707[var70]) {
                class91.field1665[var70] = arg8.field1686;
                class300.field4467[var70] = var68;
                class305.field4525[var70] = arg8.field1681;
                class129.field2331[var70] = arg8.field1676;
                if (class246.field3707[var70] == arg8.field1680) {
                    class144.field2510[var70] = class2.method189(class144.field2510[var70], 2);
                } else {
                    class144.field2510[var70] = 2;
                }
                class246.field3707[var70] = arg8.field1680;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method1078(byte arg0) {
        field2257 = null;
        if (arg0 >= -37) {
            field2257 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIII)V")
    private final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2253++;
        if (arg2 != 0) {
            return;
        }
        for (int var7 = arg1; var7 < (arg0 + arg1); var7++) {
            for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && this.field2262 > var10 && var7 >= 0 && var7 < this.field2274) {
                    this.field2264[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field2264[arg4 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field2262) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg0); var8++) {
                if (var8 >= 0 && var8 < this.field2274) {
                    this.field2264[arg4][arg3][var8] = this.field2264[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field2274) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && this.field2262 > var9) {
                    this.field2264[arg4][var9][arg1] = this.field2264[arg4][var9][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || arg3 >= this.field2262 || this.field2274 <= arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 > 0 && this.field2264[arg4][arg3 - 1][arg1] != 0) {
                this.field2264[arg4][arg3][arg1] = this.field2264[arg4][arg3 - 1][arg1];
                return;
            }
            if (arg1 <= 0 || this.field2264[arg4][arg3][arg1 - 1] == 0) {
                if (arg3 > 0 && arg1 > 0 && this.field2264[arg4][arg3 - 1][arg1 - 1] != 0) {
                    this.field2264[arg4][arg3][arg1] = this.field2264[arg4][arg3 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field2264[arg4][arg3][arg1] = this.field2264[arg4][arg3][arg1 - 1];
        } else if (arg3 <= 0 || this.field2264[arg4 - 1][arg3 - 1][arg1] == this.field2264[arg4][arg3 - 1][arg1]) {
            if (arg1 > 0 && this.field2264[arg4 - 1][arg3][arg1 - 1] != this.field2264[arg4][arg3][arg1 - 1]) {
                this.field2264[arg4][arg3][arg1] = this.field2264[arg4][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && this.field2264[arg4 - 1][arg3 - 1][arg1 - 1] != this.field2264[arg4][arg3 - 1][arg1 - 1]) {
                this.field2264[arg4][arg3][arg1] = this.field2264[arg4][arg3 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field2264[arg4][arg3][arg1] = this.field2264[arg4][arg3 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILqh;IIIZIIIII)V")
    private final void method1080(int arg0, class61 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg10 == 1) {
            arg6 = 1;
        } else if (arg10 == 2) {
            arg6 = 1;
            arg4 = 1;
        } else if (arg10 == 3) {
            arg4 = 1;
        }
        field2268++;
        if (arg3 < arg2 || arg3 >= this.field2262 || arg9 < 0 || arg9 >= this.field2274) {
            while (true) {
                int var14 = arg1.method732(-559537960);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg1.method732(-559537960);
                    return;
                }
                if (var14 <= 49) {
                    arg1.method732(-559537960);
                }
            }
        }
        if (!this.field2265 && !arg5) {
            class517.field7301[arg7][arg3][arg9] = 0;
        }
        while (true) {
            int var12 = arg1.method732(arg2 - 559537960);
            if (var12 == 0) {
                if (this.field2265) {
                    this.field2264[0][arg3 + arg4][arg6 + arg9] = 0;
                    return;
                } else if (arg7 == 0) {
                    this.field2264[0][arg3 + arg4][arg9 + arg6] = -class601.method3432(arg8 + 932731, class691.method3871(arg2, -125), arg0 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field2264[arg7][arg3 + arg4][arg9 + arg6] = this.field2264[arg7 - 1][arg3 + arg4][arg6 + arg9] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg1.method732(-559537960);
                if (!this.field2265) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg7 != 0) {
                        this.field2264[arg7][arg3 + arg4][arg9 + arg6] = this.field2264[arg7 - 1][arg3 + arg4][arg6 + arg9] - (var13 * 8 << 2);
                        return;
                    }
                    this.field2264[0][arg3 + arg4][arg6 + arg9] = -var13 * 8 << 2;
                    return;
                }
                this.field2264[0][arg3 + arg4][arg9 + arg6] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg5) {
                    arg1.method732(arg2 ^ 0xDEA620D8);
                } else {
                    this.field2270[arg7][arg3][arg9] = arg1.method710((byte) 43);
                    this.field2269[arg7][arg3][arg9] = (byte) ((var12 - 2) / 4);
                    this.field2251[arg7][arg3][arg9] = (byte) class481.method2919(3, var12 + arg10 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field2265 && !arg5) {
                    class517.field7301[arg7][arg3][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg5) {
                this.field2272[arg7][arg3][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lfh;I[[[ILr;)V")
    public final void method1081(class605[] arg0, int arg1, int[][][] arg2, class167 arg3) {
        if (!this.field2265) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field2262; var6++) {
                    for (int var7 = 0; var7 < this.field2274; var7++) {
                        if ((class517.field7301[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class517.field7301[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method3483(2097152, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        field2267++;
        int var9 = -36 / ((arg1 + 20) / 53);
        for (int var10 = 0; var10 < this.field2258; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field2265) {
                if (class620.field8976) {
                    var12 |= 0x8;
                }
                if (class460.field6567) {
                    var11 |= 0x2;
                }
                if (class108.field1863 != 0) {
                    var11 |= 0x1;
                    if (var10 == 0 | class318.field4689) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class460.field6567) {
                var12 |= 0x7;
            }
            if (!class44.field1099) {
                var12 |= 0x20;
            }
            int[][] var13 = arg2 == null || var10 >= arg2.length ? this.field2264[var10] : arg2[var10];
            class263.method1722(var10, arg3.method113(this.field2262, this.field2274, this.field2264[var10], var13, 512, var11, var12));
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIZLsfa;Llf;)V")
    public class125(int arg0, int arg1, int arg2, boolean arg3, class648 arg4, class217 arg5) {
        this.field2258 = arg0;
        this.field2265 = arg3;
        this.field2274 = arg2;
        this.field2277 = arg5;
        this.field2275 = arg4;
        this.field2262 = arg1;
        this.field2266 = new byte[this.field2258][this.field2262 + 1][this.field2274 + 1];
        this.field2270 = new byte[this.field2258][this.field2262][this.field2274];
        this.field2269 = new byte[this.field2258][this.field2262][this.field2274];
        this.field2272 = new byte[this.field2258][this.field2262][this.field2274];
        this.field2251 = new byte[this.field2258][this.field2262][this.field2274];
        this.field2264 = new int[this.field2258][this.field2262 + 1][this.field2274 + 1];
    }
}
