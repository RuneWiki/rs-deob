import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class17 extends class34 {

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    private int field302 = 1024;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    private int field303 = 1024;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    private int field301 = 819;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    private int field298 = 1024;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    private int field300 = 409;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    private int field299 = 1024;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    private int field311 = 0;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    private int field307 = 2048;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    private int field316 = 0;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "[Z")
    public static boolean[] field315 = new boolean[100];

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "Z")
    public static boolean field312 = true;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!k", name = "nb", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
    public static final void method121(boolean arg0) {
        class213.field3277 = 0;
        class165.field2426 = 0;
        ++field309;
        class76.method609(32310);
        class54.method414(32);
        class152.method1031(-68);
        if (!arg0) {
            method123(-57, 96, 57, 102, 28, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -34, (byte) -64, -67, -18);
        }
        for (int var1 = 0; ~class213.field3277 < ~var1; ++var1) {
            int var3 = class83.field1279[var1];
            if (~class120.field1794 != ~class243.field3762[var3].field486) {
                if (class243.field3762[var3].field1323.method1256((byte) -109)) {
                    class43.method353(class243.field3762[var3], -8213);
                }
                class243.field3762[var3].method665((class189) null, (byte) -95);
                class243.field3762[var3] = null;
            }
        }
        if (class45.field784 != class173.field2543.field887) {
            throw new RuntimeException("gnp1 pos:" + class173.field2543.field887 + " psize:" + class45.field784);
        } else {
            for (int var2 = 0; ~var2 > ~class207.field3093; ++var2) {
                if (class243.field3762[class285.field4379[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class207.field3093);
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method122(String arg0, byte arg1) {
        System.out.println("Error: " + class63.method517("\n", (byte) -125, "%0a", arg0));
        if (arg1 <= 52) {
            method122((String) null, (byte) -91);
        }
        ++field319;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        ++field317;
        int var2 = -61 % ((-2 - arg0) / 43);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class117.field1761 * 128) {
            arg0 = class117.field1761 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class137.field1992 * 128) {
            arg2 = class137.field1992 * 128 - 1;
        }
        class153.field2241 = class119.field1774[arg3];
        class69.field1140 = class119.field1776[arg3];
        class185.field2692 = class119.field1774[arg4];
        class44.field772 = class119.field1776[arg4];
        class251.field3892 = arg0;
        class127.field1863 = arg1;
        class135.field1979 = arg2;
        class197.field2977 = arg0 / 128;
        class3.field47 = arg2 / 128;
        class223.field3473 = class197.field2977 - class121.field1807;
        if (class223.field3473 < 0) {
            class223.field3473 = 0;
        }
        class223.field3466 = class3.field47 - class121.field1807;
        if (class223.field3466 < 0) {
            class223.field3466 = 0;
        }
        class106.field1562 = class197.field2977 + class121.field1807;
        if (class106.field1562 > class117.field1761) {
            class106.field1562 = class117.field1761;
        }
        class113.field1732 = class3.field47 + class121.field1807;
        if (class113.field1732 > class137.field1992) {
            class113.field1732 = class137.field1992;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class121.field1807 + class121.field1807 + 2; ++var16) {
            for (int var19 = 0; var19 < class121.field1807 + class121.field1807 + 2; ++var19) {
                int var20 = (var16 - class121.field1807 << 7) - (class251.field3892 & 127);
                int var21 = (var19 - class121.field1807 << 7) - (class135.field1979 & 127);
                int var22 = class197.field2977 - class121.field1807 + var16;
                int var23 = class3.field47 - class121.field1807 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class117.field1761 && var23 < class137.field1992) {
                    int var24;
                    if (class134.field1963 != null) {
                        var24 = class134.field1963[0][var22][var23] - class127.field1863 + 128;
                    } else {
                        var24 = class287.field4389[0][var22][var23] - class127.field1863 + 128;
                    }
                    int var25 = class287.field4389[3][var22][var23] - class127.field1863 - 1000;
                    class47.field798[var16][var19] = class13.method89(var20, var25, var24, var21, var15);
                } else {
                    class47.field798[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class121.field1807 + class121.field1807 + 1; ++var17) {
            for (int var18 = 0; var18 < class121.field1807 + class121.field1807 + 1; ++var18) {
                class71.field1168[var17][var18] = class47.field798[var17][var18] || class47.field798[var17 + 1][var18] || class47.field798[var17][var18 + 1] || class47.field798[var17 + 1][var18 + 1];
            }
        }
        class55.field932 = arg6;
        class6.field73 = arg7;
        class101.field1474 = arg8;
        class182.field2651 = arg9;
        class75.field1199 = arg10;
        class113.method814();
        if (class277.field4277 != null) {
            class22.method154(true);
            class188.method1244(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class22.method154(false);
        }
        class188.method1244(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 <= 75) {
            this.field311 = 6;
        }
        ++field306;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int[][] var8 = super.field610.method224(2652);
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class259.field3965 * this.field300 >> 12;
            int var15 = class226.field3527 * this.field307 >> 12;
            int var16 = class226.field3527 * this.field298 >> 12;
            int var17 = class259.field3965 * this.field301 >> 12;
            if (var17 <= 1) {
                return var8[arg1];
            } else {
                this.field304 = class226.field3527 / 8 * this.field302 >> 12;
                int var18 = class226.field3527 / var16 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field311);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var16 - -class18.method129(var20, 3, -var16 + var15);
                        int var23 = var5 - -var22;
                        int var24 = class18.method129(var20, -71, -var14 + var17) + var14;
                        if (var23 > class226.field3527) {
                            var22 = -var5 + class226.field3527;
                            var23 = class226.field3527;
                        }
                        int var30;
                        if (var10) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int var26 = var23 - -var4;
                            if (var26 < 0) {
                                var26 += class226.field3527;
                            }
                            int[] var27 = var19[var9];
                            int var28 = 0;
                            if (~class226.field3527 > ~var26) {
                                var26 -= class226.field3527;
                            }
                            while (true) {
                                int[] var29 = var19[var25];
                                if (~var29[0] >= ~var26 && ~var26 >= ~var29[1]) {
                                    var30 = var27[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 - -var4;
                                        if (~var31 > -1) {
                                            var31 += class226.field3527;
                                        }
                                        if (~class226.field3527 > ~var31) {
                                            var31 -= class226.field3527;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var19[(var9 + var32) % var11];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var19[(var9 - -var33) % var11];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var26) {
                                                    if (var37 != 0) {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = class226.field3527;
                                                    } else {
                                                        var39 = Math.min(var26, var36);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var26, var36);
                                                }
                                                this.method125(var20, -var38 + var39, var7 + var38, -var35 + var30, 1, var8, var35);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var25 >= var11) {
                                    var25 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class259.field3965 > ~(var24 + var30)) {
                            var24 = -var30 + class259.field3965;
                        } else {
                            var12 = false;
                        }
                        if (~class226.field3527 != ~var23) {
                            int[] var41 = var21[var13++];
                            var41[1] = var23;
                            var41[2] = var30 - -var24;
                            var41[0] = var5;
                            this.method125(var20, var22, var5 + var6, var24, 1, var8, var30);
                            var5 = var23;
                        } else {
                            this.method125(var20, var22, var5 + var6, var24, 1, var8, var30);
                            if (var12) {
                                return var3;
                            }
                            var12 = true;
                            var7 = var6;
                            var9 = 0;
                            var10 = false;
                            int[] var42 = var21[var13++];
                            var42[2] = var24 + var30;
                            var11 = var13;
                            int[][] var43 = var19;
                            var19 = var21;
                            var42[0] = var5;
                            var13 = 0;
                            var42[1] = var23;
                            var6 = class18.method129(var20, 114, class226.field3527);
                            var5 = 0;
                            var4 = var6 - var7;
                            int var44 = var4;
                            if (var4 < 0) {
                                var44 = class226.field3527 + var4;
                            }
                            if (var44 > class226.field3527) {
                                var44 -= class226.field3527;
                            }
                            while (true) {
                                int[] var45 = var19[var9];
                                if (var45[0] <= var44 && ~var45[1] <= ~var44) {
                                    var21 = var43;
                                    break;
                                }
                                ++var9;
                                if (var11 <= var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V")
    public static void method124(boolean arg0) {
        field315 = null;
        if (!arg0) {
            field310 = 95;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            this.field304 = 0;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field299 = arg2.method423(103);
                                        }
                                    } else {
                                        this.field303 = arg2.method423(66);
                                    }
                                } else {
                                    this.field316 = arg2.method407(255);
                                }
                            } else {
                                this.field302 = arg2.method423(119);
                            }
                        } else {
                            this.field301 = arg2.method423(-123);
                        }
                    } else {
                        this.field300 = arg2.method423(125);
                    }
                } else {
                    this.field307 = arg2.method423(102);
                }
            } else {
                this.field298 = arg2.method423(75);
            }
        } else {
            this.field311 = arg2.method407(255);
        }
        ++field320;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/util/Random;IIII[[II)V")
    private final void method125(Random arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        ++field318;
        int var8 = this.field299 > 0 ? -class18.method129(arg0, 4, this.field299) + 4096 : 4096;
        if (arg4 == 1) {
            int var9 = this.field304 * this.field303 >> 12;
            int var10 = this.field304 - (~var9 >= -1 ? 0 : class18.method129(arg0, arg4 + 20, var9));
            if (~arg2 <= ~class226.field3527) {
                arg2 -= class226.field3527;
            }
            if (~var10 >= -1) {
                if (arg2 - -arg1 <= class226.field3527) {
                    for (int var11 = 0; ~var11 > ~arg3; ++var11) {
                        class41.method342(arg5[arg6 - -var11], arg2, arg1, var8);
                    }
                } else {
                    int var12 = -arg2 + class226.field3527;
                    for (int var13 = 0; arg3 > var13; ++var13) {
                        int[] var14 = arg5[arg6 + var13];
                        class41.method342(var14, arg2, var12, var8);
                        class41.method342(var14, 0, -var12 + arg1, var8);
                    }
                }
            } else if (arg3 > 0 && ~arg1 < -1) {
                int var15 = arg1 / 2;
                int var16 = arg3 / 2;
                int var17 = var15 < var10 ? var15 : var10;
                int var18 = arg2 + var17;
                int var19 = ~var16 <= ~var10 ? var10 : var16;
                int var20 = arg1 - var17 * 2;
                for (int var21 = 0; ~arg3 < ~var21; ++var21) {
                    int[] var22 = arg5[arg6 + var21];
                    if (~var19 < ~var21) {
                        int var23 = var8 * var21 / var19;
                        if (~this.field316 == -1) {
                            for (int var24 = 0; var17 > var24; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class131.method904(arg2 + var24, class167.field2457)] = var22[class131.method904(class167.field2457, arg2 - (-arg1 + var24 - -1))] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~var17; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class131.method904(class167.field2457, arg2 - -var26)] = var22[class131.method904(class167.field2457, arg2 - -arg1 + -var26 + -1)] = ~var28 > ~var23 ? var28 : var23;
                            }
                        }
                        if (~class226.field3527 <= ~(var18 + var20)) {
                            class41.method342(var22, var18, var20, var23);
                        } else {
                            int var27 = class226.field3527 - var18;
                            class41.method342(var22, var18, var27, var23);
                            class41.method342(var22, 0, -var27 + var20, var23);
                        }
                    } else {
                        int var29 = -var21 - 1 + arg3;
                        if (~var29 > ~var19) {
                            int var30 = var8 * var29 / var19;
                            if (this.field316 != 0) {
                                for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class131.method904(class167.field2457, arg2 + var31)] = var22[class131.method904(arg2 - -arg1 + (-var31 - 1), class167.field2457)] = var30 <= var32 ? var30 : var32;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class131.method904(arg2 + var33, class167.field2457)] = var22[class131.method904(-var33 - 1 + arg1 + arg2, class167.field2457)] = var30 * var35 >> 12;
                                }
                            }
                            if (class226.field3527 >= var18 + var20) {
                                class41.method342(var22, var18, var20, var30);
                            } else {
                                int var34 = -var18 + class226.field3527;
                                class41.method342(var22, var18, var34, var30);
                                class41.method342(var22, 0, -var34 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var36 < var17; ++var36) {
                                var22[class131.method904(class167.field2457, arg2 + var36)] = var22[class131.method904(class167.field2457, arg2 - var36 + arg1 + -1)] = var8 * var36 / var17;
                            }
                            if (class226.field3527 < var18 + var20) {
                                int var37 = -var18 + class226.field3527;
                                class41.method342(var22, var18, var37, var8);
                                class41.method342(var22, 0, -var37 + var20, var8);
                            } else {
                                class41.method342(var22, var18, var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }
}
