import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 extends class354 {

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    private int field1582 = 1024;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    private int field1583 = 409;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    private int field1579 = 2048;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    private int field1586 = 1024;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    private int field1591 = 819;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    private int field1590 = 1024;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    private int field1592 = 0;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    private int field1585 = 1024;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    private int field1589 = 0;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "Lko;")
    public static class348 field1595 = new class348();

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "Lao;")
    public static class188 field1596 = new class188(89, 8);

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    public static int field1598 = -1;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "[[B")
    public static byte[][] field1597;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public final void method771(boolean arg0) {
        if (!arg0) {
            ++field1584;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IFFFI)F")
    public static final float method772(int arg0, float arg1, float arg2, float arg3, int arg4) {
        if (arg4 != 10200) {
            return 0.7069599F;
        } else {
            ++field1581;
            float[] var5 = class474.field6984[arg0];
            return var5[2] * arg2 + var5[0] * arg3 + var5[1] * arg1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field1590 = arg1.method1868(0);
                                        }
                                    } else {
                                        this.field1582 = arg1.method1868(0);
                                    }
                                } else {
                                    this.field1592 = arg1.method1918((byte) 106);
                                }
                            } else {
                                this.field1586 = arg1.method1868(0);
                            }
                        } else {
                            this.field1591 = arg1.method1868(0);
                        }
                    } else {
                        this.field1583 = arg1.method1868(arg0 ^ 15180);
                    }
                } else {
                    this.field1579 = arg1.method1868(arg0 + -15180);
                }
            } else {
                this.field1585 = arg1.method1868(arg0 ^ 15180);
            }
        } else {
            this.field1589 = arg1.method1918((byte) -80);
        }
        if (arg0 != 15180) {
            this.method773((int[][]) null, (Random) null, 30, 26, 38, -62, 71);
        }
        ++field1587;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field1594;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int[][] var4 = super.field5357.method863(-12364);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class404.field5952 * this.field1585 >> 12;
            int var15 = class404.field5952 * this.field1579 >> 12;
            int var16 = class337.field5146 * this.field1583 >> 12;
            int var17 = class337.field5146 * this.field1591 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field1593 = class404.field5952 / 8 * this.field1586 >> 12;
            int var18 = class404.field5952 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1589);
            label128: while (true) {
                while (true) {
                    int var22 = class104.method790((byte) 90, -var14 + var15, var21) + var14;
                    int var23 = class104.method790((byte) 90, var17 - var16, var21) + var16;
                    int var24 = var8 + var22;
                    if (class404.field5952 < var24) {
                        var24 = class404.field5952;
                        var22 = -var8 + class404.field5952;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (~var28 > -1) {
                            var28 += class404.field5952;
                        }
                        if (~class404.field5952 > ~var28) {
                            var28 -= class404.field5952;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var30[0] <= var28 && var28 <= var30[1]) {
                                if (~var9 != ~var25) {
                                    int var31 = var8 - -var5;
                                    if (~var31 > -1) {
                                        var31 += class404.field5952;
                                    }
                                    if (~var31 < ~class404.field5952) {
                                        var31 -= class404.field5952;
                                    }
                                    for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var27; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var29 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var28) {
                                                if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class404.field5952;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method773(var4, var21, -var38 + var39, var7 + var38, arg1 + 94, -var35 + var29, var35);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class337.field5146 > ~(var23 + var29)) {
                        var23 = -var29 + class337.field5146;
                    } else {
                        var10 = false;
                    }
                    if (~class404.field5952 == ~var24) {
                        this.method773(var4, var21, var22, var6 + var8, -1, var23, var29);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var29;
                        var41[1] = var24;
                        var41[0] = var8;
                        int[][] var42 = var20;
                        var20 = var19;
                        var19 = var42;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class104.method790((byte) 90, class404.field5952, var21);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class404.field5952 + var5;
                        }
                        var9 = 0;
                        if (class404.field5952 < var43) {
                            var43 -= class404.field5952;
                        }
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (~var9 <= ~var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var23 + var29;
                        var45[0] = var8;
                        this.method773(var4, var21, var22, var6 + var8, -1, var23, var29);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 != -95) {
            method772(118, -0.12222859F, 0.5254496F, -1.3506573F, -83);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([[ILjava/util/Random;IIIII)V")
    private final void method773(int[][] arg0, Random arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1580;
        int var8 = this.field1590 <= 0 ? 4096 : 4096 + -class104.method790((byte) 90, this.field1590, arg1);
        int var9 = this.field1593 * this.field1582 >> 12;
        int var10 = this.field1593 - (arg4 <= ~var9 ? 0 : class104.method790((byte) 90, var9, arg1));
        if (arg3 >= class404.field5952) {
            arg3 -= class404.field5952;
        }
        if (var10 > 0) {
            if (~arg5 < -1 && ~arg2 < -1) {
                int var11 = arg2 / 2;
                int var12 = arg5 / 2;
                int var13 = var11 >= var10 ? var10 : var11;
                int var14 = var12 < var10 ? var12 : var10;
                int var15 = arg3 + var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; arg5 > var17; ++var17) {
                    int[] var18 = arg0[arg6 + var17];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field1592 != 0) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class388.method2441(arg3 + var20, class168.field2527)] = var18[class388.method2441(class168.field2527, -var20 + arg3 - -arg2 + -1)] = ~var21 <= ~var19 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class388.method2441(class168.field2527, arg3 + var22)] = var18[class388.method2441(class168.field2527, -var22 + -1 + arg3 + arg2)] = var19 * var24 >> 12;
                            }
                        }
                        if (class404.field5952 < var15 + var16) {
                            int var23 = -var15 + class404.field5952;
                            class486.method2900(var18, var15, var23, var19);
                            class486.method2900(var18, 0, -var23 + var16, var19);
                        } else {
                            class486.method2900(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg5 + -1 + -var17;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field1592 != -1) {
                                for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class388.method2441(arg3 + var27, class168.field2527)] = var18[class388.method2441(-var27 + arg2 + -1 + arg3, class168.field2527)] = var28 >= var26 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class388.method2441(class168.field2527, arg3 + var29)] = var18[class388.method2441(arg3 - var29 + -1 + arg2, class168.field2527)] = var26 * var31 >> 12;
                                }
                            }
                            if (var15 - -var16 > class404.field5952) {
                                int var30 = class404.field5952 - var15;
                                class486.method2900(var18, var15, var30, var26);
                                class486.method2900(var18, 0, -var30 + var16, var26);
                            } else {
                                class486.method2900(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var32 < var13; ++var32) {
                                var18[class388.method2441(arg3 + var32, class168.field2527)] = var18[class388.method2441(-var32 + arg2 + -1 + arg3, class168.field2527)] = var8 * var32 / var13;
                            }
                            if (class404.field5952 < var15 + var16) {
                                int var33 = -var15 + class404.field5952;
                                class486.method2900(var18, var15, var33, var8);
                                class486.method2900(var18, 0, -var33 + var16, var8);
                            } else {
                                class486.method2900(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg2 + arg3 <= class404.field5952) {
            for (int var34 = 0; arg5 > var34; ++var34) {
                class486.method2900(arg0[arg6 - -var34], arg3, arg2, var8);
            }
        } else {
            int var35 = -arg3 + class404.field5952;
            for (int var36 = 0; var36 < arg5; ++var36) {
                int[] var37 = arg0[arg6 + var36];
                class486.method2900(var37, arg3, var35, var8);
                class486.method2900(var37, 0, -var35 + arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public static void method774(int arg0) {
        if (arg0 == -26401) {
            field1596 = null;
            field1597 = null;
            field1595 = null;
        }
    }
}
