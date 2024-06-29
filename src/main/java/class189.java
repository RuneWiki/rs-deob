import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class189 extends class210 {

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    private int field2640 = 4096;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field2644 = 4096;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    private int field2646 = 4096;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2636 = "";

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "[I")
    public static int[] field2649 = new int[250];

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "Lvq;")
    public static class24 field2642 = new class24(87, 4);

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "Leb;")
    public static class395 field2650 = new class395();

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "[I")
    public static int[] field2652 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "Lgj;")
    public static class385 field2637;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "[[B")
    public static byte[][] field2648;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2634;
        class33.method315(arg1, arg8, arg7, (byte) 55, arg3, arg6, arg2, arg4, arg0, arg5);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method1290(int arg0, byte arg1, String arg2) {
        ++field2638;
        class125 var3 = class56.method428(arg0, 2, -3636);
        var3.method846(26848);
        var3.field1655 = arg2;
        if (arg1 <= 7) {
            method1292(-79, 79, 107, -3, -108, false, 92);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class151.method1038(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class167.field2206;
                int var7 = arg3 << class167.field2206;
                return class154.method1054(var6 + 1, class215.field3069[arg0].method1429(arg1, arg3) + arg5, var7 + 1) && class154.method1054(class100.field1271 + var6 - 1, class215.field3069[arg0].method1429(arg1 + 1, arg3) + arg5, var7 + 1) && class154.method1054(class100.field1271 + var6 - 1, class215.field3069[arg0].method1429(arg1 + 1, arg3 + 1) + arg5, class100.field1271 + var7 - 1) && class154.method1054(var6 + 1, class215.field3069[arg0].method1429(arg1, arg3 + 1) + arg5, class100.field1271 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class392.field5706[arg0][var8][var14] == -class159.field2128) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class167.field2206) + 1;
            int var10 = (arg3 << class167.field2206) + 2;
            int var11 = class215.field3069[arg0].method1429(arg1, arg3) + arg5;
            if (!class154.method1054(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class167.field2206) - 1;
                if (!class154.method1054(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class167.field2206) - 1;
                    if (!class154.method1054(var9, var11, var13)) {
                        return false;
                    } else if (!class154.method1054(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class189() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field2641;
        int[][] var3 = super.field2967.method1572(127, arg0);
        if (arg1 <= 94) {
            method1290(-94, (byte) 121, (String) null);
        }
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class202.field2852; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field2644 * var12 >> 12;
                    var9[var11] = this.field2640 * var13 >> 12;
                    var10[var11] = this.field2646 * var14 >> 12;
                } else {
                    var8[var11] = this.field2644;
                    var9[var11] = this.field2640;
                    var10[var11] = this.field2646;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field2639;
        if (arg1 == -11941) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field2646 = arg2.method1767(arg1 + 1930505517);
                    }
                } else {
                    this.field2640 = arg2.method1767(1930493576);
                }
            } else {
                this.field2644 = arg2.method1767(1930493576);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class129.method864(-70, arg1);
        ++field2645;
        if (arg5) {
            method1289(70, -21, 37, -51, -48, -40, 46, 8, 5);
        }
        int var7 = 0;
        int var8 = -arg0 + arg1;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class248.field3659 <= arg2 && arg2 <= class146.field1978) {
            int[] var14 = class323.field4774[arg2];
            int var15 = class382.method2423(arg3 - arg1, class63.field838, 64, class9.field128);
            int var16 = class382.method2423(arg1 + arg3, class63.field838, 114, class9.field128);
            int var17 = class382.method2423(-var8 + arg3, class63.field838, 75, class9.field128);
            int var18 = class382.method2423(arg3 + var8, class63.field838, 109, class9.field128);
            class381.method2419((byte) 96, arg4, var15, var14, var17);
            class381.method2419((byte) 24, arg6, var17, var14, var18);
            class381.method2419((byte) 23, arg4, var18, var14, var16);
        }
        int var19 = -1;
        while (~var7 > ~var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && ~var11 <= -2) {
                --var11;
                class11.field143[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg2;
                int var21 = arg2 + var9;
                if (~var21 <= ~class248.field3659 && ~var20 >= ~class146.field1978) {
                    if (var9 >= var8) {
                        int var22 = class382.method2423(arg3 - -var7, class63.field838, 49, class9.field128);
                        int var23 = class382.method2423(-var7 + arg3, class63.field838, 67, class9.field128);
                        if (~var21 >= ~class146.field1978) {
                            class381.method2419((byte) 55, arg4, var23, class323.field4774[var21], var22);
                        }
                        if (~var20 <= ~class248.field3659) {
                            class381.method2419((byte) 11, arg4, var23, class323.field4774[var20], var22);
                        }
                    } else {
                        int var24 = class11.field143[var9];
                        int var25 = class382.method2423(arg3 + var7, class63.field838, 58, class9.field128);
                        int var26 = class382.method2423(arg3 - var7, class63.field838, 59, class9.field128);
                        int var27 = class382.method2423(arg3 + var24, class63.field838, 93, class9.field128);
                        int var28 = class382.method2423(-var24 + arg3, class63.field838, 40, class9.field128);
                        if (class146.field1978 >= var21) {
                            int[] var29 = class323.field4774[var21];
                            class381.method2419((byte) 69, arg4, var26, var29, var28);
                            class381.method2419((byte) 24, arg6, var28, var29, var27);
                            class381.method2419((byte) 117, arg4, var27, var29, var25);
                        }
                        if (var20 >= class248.field3659) {
                            int[] var30 = class323.field4774[var20];
                            class381.method2419((byte) 28, arg4, var26, var30, var28);
                            class381.method2419((byte) 83, arg6, var28, var30, var27);
                            class381.method2419((byte) 94, arg4, var27, var30, var25);
                        }
                    }
                }
            }
            int var31 = -var7 + arg2;
            int var32 = arg2 + var7;
            if (var32 >= class248.field3659 && class146.field1978 >= var31) {
                int var33 = arg3 + var9;
                int var34 = -var9 + arg3;
                if (var33 >= class9.field128 && var34 <= class63.field838) {
                    int var35 = class382.method2423(var33, class63.field838, 117, class9.field128);
                    int var36 = class382.method2423(var34, class63.field838, 95, class9.field128);
                    if (~var7 <= ~var8) {
                        if (var32 <= class146.field1978) {
                            class381.method2419((byte) 125, arg4, var36, class323.field4774[var32], var35);
                        }
                        if (class248.field3659 <= var31) {
                            class381.method2419((byte) 102, arg4, var36, class323.field4774[var31], var35);
                        }
                    } else {
                        int var37 = ~var11 <= ~var7 ? var11 : class11.field143[var7];
                        int var38 = class382.method2423(arg3 + var37, class63.field838, 54, class9.field128);
                        int var39 = class382.method2423(arg3 - var37, class63.field838, 49, class9.field128);
                        if (var32 <= class146.field1978) {
                            int[] var40 = class323.field4774[var32];
                            class381.method2419((byte) 103, arg4, var36, var40, var39);
                            class381.method2419((byte) 30, arg6, var39, var40, var38);
                            class381.method2419((byte) 105, arg4, var38, var40, var35);
                        }
                        if (~class248.field3659 >= ~var31) {
                            int[] var41 = class323.field4774[var31];
                            class381.method2419((byte) 5, arg4, var36, var41, var39);
                            class381.method2419((byte) 76, arg6, var39, var41, var38);
                            class381.method2419((byte) 70, arg4, var38, var41, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field2649 = null;
        field2650 = null;
        field2642 = null;
        if (arg0 != 20051) {
            method1291(25, -123, 109, 86, -11, -10);
        }
        field2648 = null;
        field2636 = null;
        field2652 = null;
        field2637 = null;
    }
}
