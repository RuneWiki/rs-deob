import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class202 extends class196 {

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    private int field3371 = 409;

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "I")
    private int field3381 = 4;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    private int field3373 = 8;

    @OriginalMember(owner = "client!hi", name = "kb", descriptor = "I")
    private int field3386 = 1024;

    @OriginalMember(owner = "client!hi", name = "mb", descriptor = "I")
    private int field3388 = 204;

    @OriginalMember(owner = "client!hi", name = "pb", descriptor = "I")
    private int field3391 = 0;

    @OriginalMember(owner = "client!hi", name = "ob", descriptor = "I")
    private int field3390 = 81;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    private int field3372 = 1024;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "Ldf;")
    private static class51 field3369 = class46.method233("Started 3d library", 100);

    @OriginalMember(owner = "client!hi", name = "gb", descriptor = "Ldf;")
    public static class51 field3382 = class46.method233("(U3", 100);

    @OriginalMember(owner = "client!hi", name = "lb", descriptor = "Ldf;")
    private static class51 field3387 = class46.method233("Discard", 100);

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "Ldf;")
    public static class51 field3380 = field3387;

    @OriginalMember(owner = "client!hi", name = "qb", descriptor = "[Lp;")
    public static class262[] field3392 = new class262[27];

    @OriginalMember(owner = "client!hi", name = "rb", descriptor = "Ldf;")
    public static class51 field3393 = field3369;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "Lhc;")
    public static class212 field3366 = new class212(4096);

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    private int field3368;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!hi", name = "jb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!hi", name = "nb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!hi", name = "sb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!hi", name = "ib", descriptor = "[I")
    private int[] field3384;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "[[I")
    private int[][] field3367;

    @OriginalMember(owner = "client!hi", name = "hb", descriptor = "[[I")
    private int[][] field3383;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "[[[B")
    public static byte[][][] field3379;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3374;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (arg1 != 10565) {
            field3379 = null;
        }
        if (super.field3274.field3741) {
            int var4 = 0;
            int var5;
            for (var5 = class161.field2639[arg0] - -this.field3391; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field3373 > var4 && ~var5 <= ~this.field3384[var4]) {
                ++var4;
            }
            int var6 = this.field3384[var4 + -1];
            boolean var7 = (var4 & 1) == 0;
            int var8 = var4 + -1;
            int var9 = this.field3384[var4];
            if (this.field3377 + var6 < var5 && ~var5 > ~(-this.field3377 + var9)) {
                for (int var10 = 0; class49.field767 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field3386 : -this.field3386;
                    int var13;
                    for (var13 = (this.field3368 * var12 >> 12) + class211.field3510[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field3381 && var13 >= this.field3367[var8][var11]) {
                        ++var11;
                    }
                    int var14 = this.field3367[var8][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field3367[var8][var15];
                    if (~var13 < ~(this.field3377 + var16) && -this.field3377 + var14 > var13) {
                        var3[var10] = this.field3383[var8][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class256.method1743(var3, 0, class49.field767, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field3385;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field3372 = arg1.method876(false);
                                    }
                                } else {
                                    this.field3390 = arg1.method876(false);
                                }
                            } else {
                                this.field3391 = arg1.method876(false);
                            }
                        } else {
                            this.field3386 = arg1.method876(false);
                        }
                    } else {
                        this.field3388 = arg1.method876(false);
                    }
                } else {
                    this.field3371 = arg1.method876(false);
                }
            } else {
                this.field3373 = arg1.method897(115);
            }
        } else {
            this.field3381 = arg1.method897(105);
        }
        if (arg2 != 82) {
            this.field3368 = -27;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIIIIIIIIII)Z")
    public static final boolean method1403(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3370;
        if (arg2 != 2) {
            return true;
        } else if (~class44.field706.field4345 != -3) {
            return class44.field706.field4345 > 2 ? class107.method770(arg8, arg10, 4095, arg6, arg4, arg3, arg5, arg9, arg1, arg11, arg0, class44.field706.field4345, arg7) : class259.method1762(arg4, arg0, arg2 ^ 3, arg6, arg5, arg10, arg7, arg11, arg1, arg9, arg3, arg8);
        } else {
            return class156.method1111(arg6, arg10, arg0, arg4, arg11, arg9, arg7, arg8, arg3, arg5, 16362, arg1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)V")
    public static void method1404(byte arg0) {
        field3393 = null;
        field3379 = null;
        field3366 = null;
        field3387 = null;
        if (arg0 > 80) {
            field3392 = null;
            field3380 = null;
            field3369 = null;
            field3382 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
    public static final void method1405(int arg0, int arg1, int arg2, int arg3) {
        class37.field574 = new class97[arg0][arg1][arg2];
        class101.field1682 = new int[arg0][arg1 + 1][arg2 + 1];
        class87.method664(false);
        class48.field758 = arg1;
        class192.field3229 = arg2;
        class72.field1151 = new int[arg0][arg1 + 1][arg2 + 1];
        class174.method1221();
        class198.field3299 = arg3;
        class255.field4453 = new boolean[class198.field3299 + class198.field3299 + 1][class198.field3299 + class198.field3299 + 1];
        class222.field3886 = new boolean[class198.field3299 + class198.field3299 + 2][class198.field3299 + class198.field3299 + 2];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljj;IIIIIIIZ)V")
    public static final void method1406(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class124.field2105;
        int var11;
        int var12 = var11 = (arg7 << 7) - class123.field2083;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class172.field2820[arg1][arg6][arg7] - class69.field1108;
        int var18 = class172.field2820[arg1][arg6 + 1][arg7] - class69.field1108;
        int var19 = class172.field2820[arg1][arg6 + 1][arg7 + 1] - class69.field1108;
        int var20 = class172.field2820[arg1][arg6][arg7 + 1] - class69.field1108;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class73.field1163;
                        int var46 = (var24 << 9) / var25 + class73.field1154;
                        int var47 = (var27 << 9) / var31 + class73.field1163;
                        int var48 = (var30 << 9) / var31 + class73.field1154;
                        int var49 = (var33 << 9) / var37 + class73.field1163;
                        int var50 = (var36 << 9) / var37 + class73.field1154;
                        int var51 = (var39 << 9) / var43 + class73.field1163;
                        int var52 = (var42 << 9) / var43 + class73.field1154;
                        class73.field1153 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class82.field1389 && class190.method1360(class73.field1163 + class22.field316, class8.field85 + class73.field1154, var50, var52, var48, var49, var51, var47)) {
                                class247.field4320 = arg6;
                                class116.field1962 = arg7;
                            }
                            if (!arg8) {
                                class73.field1157 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class73.field1162 || var51 > class73.field1162 || var47 > class73.field1162) {
                                    class73.field1157 = true;
                                }
                                if (arg0.field1644 == -1) {
                                    if (arg0.field1633 != 12345678) {
                                        class73.method511(var50, var52, var48, var49, var51, var47, arg0.field1633, arg0.field1637, arg0.field1640);
                                    }
                                } else if (class190.field3182) {
                                    if (arg0.field1638) {
                                        class73.method510(var50, var52, var48, var49, var51, var47, arg0.field1633, arg0.field1637, arg0.field1640, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1644);
                                    } else {
                                        class73.method510(var50, var52, var48, var49, var51, var47, arg0.field1633, arg0.field1637, arg0.field1640, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1644);
                                    }
                                } else {
                                    int var53 = class73.field1166.method460(-1765, arg0.field1644);
                                    class73.method511(var50, var52, var48, var49, var51, var47, class17.method89(var53, arg0.field1633), class17.method89(var53, arg0.field1637), class17.method89(var53, arg0.field1640));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class82.field1389 && class190.method1360(class73.field1163 + class22.field316, class8.field85 + class73.field1154, var46, var48, var52, var45, var47, var51)) {
                                class247.field4320 = arg6;
                                class116.field1962 = arg7;
                            }
                            if (!arg8) {
                                class73.field1157 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class73.field1162 || var47 > class73.field1162 || var51 > class73.field1162) {
                                    class73.field1157 = true;
                                }
                                if (arg0.field1644 == -1) {
                                    if (arg0.field1643 != 12345678) {
                                        class73.method511(var46, var48, var52, var45, var47, var51, arg0.field1643, arg0.field1640, arg0.field1637);
                                        return;
                                    }
                                } else {
                                    if (class190.field3182) {
                                        class73.method510(var46, var48, var52, var45, var47, var51, arg0.field1643, arg0.field1640, arg0.field1637, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1644);
                                        return;
                                    }
                                    int var54 = class73.field1166.method460(-1765, arg0.field1644);
                                    class73.method511(var46, var48, var52, var45, var47, var51, class17.method89(var54, arg0.field1643), class17.method89(var54, arg0.field1640), class17.method89(var54, arg0.field1637));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lu;ZILu;I)Lug;")
    public static final class187 method1407(class111 arg0, boolean arg1, int arg2, class111 arg3, int arg4) {
        ++field3389;
        if (!arg1) {
            return null;
        } else {
            return !class69.method480(arg2, 57, arg4, arg0) ? null : class236.method1638(8, arg3.method828(arg2, (byte) 111, arg4));
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        this.method1408((byte) -97);
        int var2 = -103 / ((arg0 - 43) / 41);
        ++field3375;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V")
    private final void method1408(byte arg0) {
        ++field3378;
        Random var2 = new Random((long) this.field3373);
        this.field3368 = 4096 / this.field3381;
        this.field3384 = new int[this.field3373 + 1];
        int var3 = this.field3368 / 2;
        this.field3383 = new int[this.field3373][this.field3381];
        this.field3376 = 4096 / this.field3373;
        this.field3367 = new int[this.field3373][this.field3381 + 1];
        int var4 = this.field3376 / 2;
        this.field3377 = this.field3390 / 2;
        this.field3384[0] = 0;
        if (arg0 != -97) {
            method1406((class98) null, -60, -94, -125, -59, 77, -91, 57, true);
        }
        for (int var5 = 0; var5 < this.field3373; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3376;
                int var7 = (class193.method1373(-1634280864, 4096, var2) - 2048) * this.field3388 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3384[var5] = this.field3384[var5 - 1] - -var8;
            }
            this.field3367[var5][0] = 0;
            for (int var9 = 0; this.field3381 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3368;
                    int var11 = (-2048 + class193.method1373(arg0 ^ 1634280959, 4096, var2)) * this.field3371 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3367[var5][var9] = this.field3367[var5][var9 + -1] + var12;
                }
                this.field3383[var5][var9] = ~this.field3372 >= -1 ? 4096 : -class193.method1373(-1634280864, this.field3372, var2) + 4096;
            }
            this.field3367[var5][this.field3381] = 4096;
        }
        this.field3384[this.field3373] = 4096;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIILkb;IJIIII)Z")
    public static final boolean method1409(int arg0, int arg1, int arg2, int arg3, class49 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class195.method1382(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
