import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class420 extends class349 {

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    private int field5847 = 0;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    private int field5849 = 1024;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    private int field5854 = 2048;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    private int field5852 = 1024;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    private int field5850 = 409;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    private int field5848 = 819;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    private int field5851 = 0;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field5859 = 1024;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    private int field5846 = 1024;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lnn;")
    public static class446 field5861 = new class446(11, 2);

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Lnl;")
    public static class50 field5862 = new class50(4);

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Ljj;")
    public static class398 field5863 = new class398(74, 3);

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    private int field5853;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field5855;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[][] var4 = super.field5109.method3084(-95);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class39.field497 * this.field5852 >> 12;
            int var15 = class39.field497 * this.field5854 >> 12;
            int var16 = class442.field6080 * this.field5850 >> 12;
            int var17 = class442.field6080 * this.field5848 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field5853 = class39.field497 / 8 * this.field5859 >> 12;
            int var18 = class39.field497 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field5847);
            label122: while (true) {
                while (true) {
                    int var22 = class571.method3224((byte) -36, var15 - var14, var21) + var14;
                    int var23 = var16 + class571.method3224((byte) 127, -var16 + var17, var21);
                    int var24 = var8 + var22;
                    if (var24 > class39.field497) {
                        var22 = -var8 + class39.field497;
                        var24 = class39.field497;
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
                            var28 += class39.field497;
                        }
                        if (~class39.field497 > ~var28) {
                            var28 -= class39.field497;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && ~var28 >= ~var30[1]) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class39.field497;
                                    }
                                    if (~var31 < ~class39.field497) {
                                        var31 -= class39.field497;
                                    }
                                    for (int var32 = 1; var32 <= var27; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var27; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 >= var28) {
                                                if (~var36 == -1) {
                                                    var38 = Math.min(var28, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class39.field497;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var28, var37);
                                            }
                                            this.method2439(var4, var21, (byte) -110, var35, var39 - -var7, -var39 + var38, -var35 + var29);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            ++var25;
                            if (var25 >= var12) {
                                var25 = 0;
                            }
                        }
                    }
                    if (var23 + var29 <= class442.field6080) {
                        var10 = false;
                    } else {
                        var23 = -var29 + class442.field6080;
                    }
                    if (class39.field497 != var24) {
                        int[] var41 = var19[var13++];
                        var41[2] = var29 - -var23;
                        var41[0] = var8;
                        var41[1] = var24;
                        this.method2439(var4, var21, (byte) -93, var29, var6 + var8, var22, var23);
                        var8 = var24;
                    } else {
                        this.method2439(var4, var21, (byte) -123, var29, var8 - -var6, var22, var23);
                        if (var10) {
                            break label122;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[2] = var23 + var29;
                        var42[0] = var8;
                        var42[1] = var24;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var7 = var6;
                        var13 = 0;
                        var6 = class571.method3224((byte) 102, class39.field497, var21);
                        var8 = 0;
                        var5 = var6 - var7;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class39.field497 + var5;
                        }
                        var9 = 0;
                        if (~var44 < ~class39.field497) {
                            var44 -= class39.field497;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        int var46 = -112 % ((56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field5856;
        if (arg0 != 4095) {
            this.method13((byte) -48, 100);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field5846 = arg2.method922((byte) -113);
                                        }
                                    } else {
                                        this.field5849 = arg2.method922((byte) -117);
                                    }
                                } else {
                                    this.field5851 = arg2.method957((byte) -107);
                                }
                            } else {
                                this.field5859 = arg2.method922((byte) -120);
                            }
                        } else {
                            this.field5848 = arg2.method922((byte) -123);
                        }
                    } else {
                        this.field5850 = arg2.method922((byte) -122);
                    }
                } else {
                    this.field5854 = arg2.method922((byte) -113);
                }
            } else {
                this.field5852 = arg2.method922((byte) -128);
            }
        } else {
            this.field5847 = arg2.method957((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        ++field5857;
        if (arg0 > -51) {
            this.method2439((int[][]) null, (Random) null, (byte) 68, 19, -2, 94, 96);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIIII)V")
    public static final void method2438(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            ++field5860;
            if (~class398.field5676 >= ~arg3 && ~class298.field3995 <= ~arg3) {
                int var5 = class191.method1226(arg2, class609.field8313, class19.field169, 16);
                int var6 = class191.method1226(arg1, class609.field8313, class19.field169, 16);
                class324.method2084(var6, var5, arg4, (byte) 121, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([[ILjava/util/Random;BIIII)V")
    private final void method2439(int[][] arg0, Random arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5858;
        int var8 = this.field5846 > 0 ? 4096 + -class571.method3224((byte) -57, this.field5846, arg1) : 4096;
        if (arg2 > -27) {
            method2440((byte) -91);
        }
        int var9 = this.field5853 * this.field5849 >> 12;
        int var10 = this.field5853 - (~var9 >= -1 ? 0 : class571.method3224((byte) -31, var9, arg1));
        if (arg4 >= class39.field497) {
            arg4 -= class39.field497;
        }
        if (var10 <= 0) {
            if (class39.field497 < arg4 + arg5) {
                int var11 = -arg4 + class39.field497;
                for (int var12 = 0; arg6 > var12; ++var12) {
                    int[] var13 = arg0[arg3 + var12];
                    class657.method3634(var13, arg4, var11, var8);
                    class657.method3634(var13, 0, -var11 + arg5, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg6; ++var14) {
                    class657.method3634(arg0[arg3 + var14], arg4, arg5, var8);
                }
            }
        } else if (arg6 > 0 && arg5 > 0) {
            int var15 = arg5 / 2;
            int var16 = arg6 / 2;
            int var17 = ~var10 < ~var15 ? var15 : var10;
            int var18 = var10 > var16 ? var16 : var10;
            int var19 = arg4 + var17;
            int var20 = arg5 - var17 * 2;
            for (int var21 = 0; arg6 > var21; ++var21) {
                int[] var22 = arg0[arg3 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field5851 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class230.method1424(class144.field1839, arg4 + var24)] = var22[class230.method1424(-var24 + arg4 + -1 - -arg5, class144.field1839)] = var25 >= var23 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class230.method1424(arg4 + var26, class144.field1839)] = var22[class230.method1424(class144.field1839, arg4 - var26 + arg5 + -1)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class39.field497 > ~(var19 + var20)) {
                        int var27 = -var19 + class39.field497;
                        class657.method3634(var22, var19, var27, var23);
                        class657.method3634(var22, 0, -var27 + var20, var23);
                    } else {
                        class657.method3634(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg6 - (var21 - -1);
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field5851 == -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class230.method1424(arg4 - -var31, class144.field1839)] = var22[class230.method1424(class144.field1839, arg4 - -arg5 + -var31 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class230.method1424(class144.field1839, arg4 + var33)] = var22[class230.method1424(-var33 + -1 + arg4 + arg5, class144.field1839)] = var30 > var35 ? var35 : var30;
                            }
                        }
                        if (~class39.field497 <= ~(var19 + var20)) {
                            class657.method3634(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class39.field497;
                            class657.method3634(var22, var19, var34, var30);
                            class657.method3634(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class230.method1424(class144.field1839, arg4 + var36)] = var22[class230.method1424(class144.field1839, -var36 + arg5 + -1 + arg4)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) < ~class39.field497) {
                            int var37 = -var19 + class39.field497;
                            class657.method3634(var22, var19, var37, var8);
                            class657.method3634(var22, 0, -var37 + var20, var8);
                        } else {
                            class657.method3634(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class420() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
    public static void method2440(byte arg0) {
        field5862 = null;
        int var1 = -94 / ((arg0 - 59) / 62);
        field5861 = null;
        field5863 = null;
    }
}
