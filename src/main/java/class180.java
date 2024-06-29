import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class180 extends class87 {

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    private int field2700 = 409;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    private int field2698 = 0;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    private int field2707 = 1024;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    private int field2697 = 2048;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    private int field2710 = 0;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    private int field2708 = 1024;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    private int field2701 = 1024;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    private int field2694 = 1024;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    private int field2716 = 819;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "[I")
    public static int[] field2699 = new int[14];

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "Z")
    public static boolean field2709 = true;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "Z")
    public static volatile boolean field2715 = true;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "F")
    public static float field2705 = 128.0F;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method1272(boolean arg0) {
        if (!arg0) {
            method1276((class53) null, (byte) -110);
        }
        field2699 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)Lce;")
    public static final class124 method1273(int arg0, byte arg1) {
        ++field2712;
        class124 var2 = (class124) class283.field4558.method1418((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class112.field1863.method1868(arg0, 0, 1);
            if (arg1 != -27) {
                field2709 = true;
            }
            class124 var4 = new class124();
            if (var3 != null) {
                var4.method957(-1, new class53(var3));
            }
            var4.method959(arg1 ^ -23494);
            class283.field4558.method1421((long) arg0, var4, (byte) 76);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        int[] var3 = super.field1378.method319(arg0, arg1);
        ++field2702;
        if (super.field1378.field733) {
            int var4 = 0;
            int[][] var5 = super.field1378.method318(false);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = class206.field3032 * this.field2697 >> 12;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class206.field3032 * this.field2701 >> 12;
            int var15 = 0;
            int var16 = class123.field2045 * this.field2700 >> 12;
            int var17 = class123.field2045 * this.field2716 >> 12;
            if (var17 <= 1) {
                return var5[arg0];
            }
            this.field2696 = class206.field3032 / 8 * this.field2707 >> 12;
            int var18 = class206.field3032 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field2698);
            int[][] var21 = new int[var18][3];
            label129: while (true) {
                while (true) {
                    int var22 = class275.method1912(-var14 + var11, -96, var20) + var14;
                    int var23 = var16 + class275.method1912(var17 - var16, -89, var20);
                    int var24 = var6 + var22;
                    if (var24 > class206.field3032) {
                        var22 = class206.field3032 - var6;
                        var24 = class206.field3032;
                    }
                    int var26;
                    if (var10) {
                        var26 = 0;
                    } else {
                        int[] var25 = var21[var8];
                        var26 = var25[2];
                        int var27 = var4 + var24;
                        if (~var27 > -1) {
                            var27 += class206.field3032;
                        }
                        int var28 = 0;
                        if (var27 > class206.field3032) {
                            var27 -= class206.field3032;
                        }
                        int var29 = var8;
                        while (true) {
                            int[] var30 = var21[var29];
                            if (var27 >= var30[0] && var27 <= var30[1]) {
                                if (var8 != var29) {
                                    int var31 = var6 - -var4;
                                    if (var31 < 0) {
                                        var31 += class206.field3032;
                                    }
                                    if (var31 > class206.field3032) {
                                        var31 -= class206.field3032;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var21[(var8 + var32) % var15];
                                        var26 = Math.max(var26, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var21[(var8 - -var33) % var15];
                                        int var35 = var34[2];
                                        if (var26 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var27 > var31) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var27, var37);
                                            } else if (~var36 != -1) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class206.field3032;
                                            } else {
                                                var39 = Math.min(var27, var37);
                                                var38 = 0;
                                            }
                                            this.method1275(var35, -var35 + var26, true, var5, -var38 + var39, var20, var38 - -var7);
                                        }
                                    }
                                }
                                var8 = var29;
                                break;
                            }
                            ++var29;
                            if (~var29 <= ~var15) {
                                var29 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~class123.field2045 > ~(var23 + var26)) {
                        var23 = -var26 + class123.field2045;
                    } else {
                        var12 = false;
                    }
                    if (class206.field3032 == var24) {
                        this.method1275(var26, var23, true, var5, var22, var20, var6 + var9);
                        if (var12) {
                            break label129;
                        }
                        var7 = var9;
                        var8 = 0;
                        int[][] var41 = var21;
                        var12 = true;
                        int[] var42 = var19[var13++];
                        var21 = var19;
                        var10 = false;
                        var42[1] = var24;
                        var15 = var13;
                        var13 = 0;
                        var42[0] = var6;
                        var6 = 0;
                        var19 = var41;
                        var42[2] = var26 - -var23;
                        var9 = class275.method1912(class206.field3032, -95, var20);
                        var4 = -var7 + var9;
                        int var43 = var4;
                        if (var4 < 0) {
                            var43 = class206.field3032 + var4;
                        }
                        if (~var43 < ~class206.field3032) {
                            var43 -= class206.field3032;
                        }
                        while (true) {
                            int[] var44 = var21[var8];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            int var10000 = ~var15;
                            ++var8;
                            if (var10000 >= ~var8) {
                                var8 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var23 + var26;
                        var45[0] = var6;
                        this.method1275(var26, var23, true, var5, var22, var20, var6 - -var9);
                        var6 = var24;
                    }
                }
            }
        }
        if (arg1) {
            method1274(43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public static final void method1274(int arg0) {
        ++field2693;
        if (arg0 != -3) {
            field2699 = null;
        }
        class17.field175.method1420((byte) -82);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ[[IILjava/util/Random;I)V")
    private final void method1275(int arg0, int arg1, boolean arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        ++field2695;
        if (!arg2) {
            method1274(7);
        }
        int var8 = this.field2708 <= 0 ? 4096 : -class275.method1912(this.field2708, -94, arg5) + 4096;
        int var9 = this.field2696 * this.field2694 >> 12;
        int var10 = this.field2696 - (~var9 >= -1 ? 0 : class275.method1912(var9, -114, arg5));
        if (arg6 >= class206.field3032) {
            arg6 -= class206.field3032;
        }
        if (var10 <= 0) {
            if (arg4 + arg6 <= class206.field3032) {
                for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                    class117.method875(arg3[arg0 - -var11], arg6, arg4, var8);
                }
            } else {
                int var12 = -arg6 + class206.field3032;
                for (int var13 = 0; ~var13 > ~arg1; ++var13) {
                    int[] var14 = arg3[arg0 - -var13];
                    class117.method875(var14, arg6, var12, var8);
                    class117.method875(var14, 0, -var12 + arg4, var8);
                }
            }
        } else if (~arg1 < -1 && ~arg4 < -1) {
            int var15 = arg4 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var10 < ~var16 ? var16 : var10;
            int var18 = var10 <= var15 ? var10 : var15;
            int var19 = arg6 + var18;
            int var20 = -(var18 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg1; ++var21) {
                int[] var22 = arg3[arg0 + var21];
                if (var17 > var21) {
                    int var23 = var8 * var21 / var17;
                    if (this.field2710 != 0) {
                        for (int var24 = 0; ~var24 > ~var18; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class301.method2056(class181.field2722, arg6 + var24)] = var22[class301.method2056(class181.field2722, arg6 - -arg4 + (-var24 - 1))] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var18; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class301.method2056(class181.field2722, arg6 + var26)] = var22[class301.method2056(arg4 + arg6 + -var26 - 1, class181.field2722)] = var23 * var28 >> 12;
                        }
                    }
                    if (var19 + var20 <= class206.field3032) {
                        class117.method875(var22, var19, var20, var23);
                    } else {
                        int var27 = class206.field3032 - var19;
                        class117.method875(var22, var19, var27, var23);
                        class117.method875(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + arg1 + -1;
                    if (~var29 > ~var17) {
                        int var30 = var8 * var29 / var17;
                        if (this.field2710 != 0) {
                            for (int var31 = 0; var31 < var18; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class301.method2056(class181.field2722, arg6 + var31)] = var22[class301.method2056(arg4 + arg6 + -var31 - 1, class181.field2722)] = var30 <= var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var18 > var33; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class301.method2056(arg6 + var33, class181.field2722)] = var22[class301.method2056(-var33 + -1 + arg4 + arg6, class181.field2722)] = var30 * var35 >> 12;
                            }
                        }
                        if (var19 + var20 > class206.field3032) {
                            int var34 = -var19 + class206.field3032;
                            class117.method875(var22, var19, var34, var30);
                            class117.method875(var22, 0, -var34 + var20, var30);
                        } else {
                            class117.method875(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var18 > var36; ++var36) {
                            var22[class301.method2056(arg6 + var36, class181.field2722)] = var22[class301.method2056(class181.field2722, arg6 - -arg4 + -var36 + -1)] = var8 * var36 / var18;
                        }
                        if (~class206.field3032 > ~(var19 - -var20)) {
                            int var37 = -var19 + class206.field3032;
                            class117.method875(var22, var19, var37, var8);
                            class117.method875(var22, 0, var20 - var37, var8);
                        } else {
                            class117.method875(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            this.method40((class53) null, 13, -79);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field2708 = arg0.method331(-20);
                                        }
                                    } else {
                                        this.field2694 = arg0.method331(-23);
                                    }
                                } else {
                                    this.field2710 = arg0.method366(-16505);
                                }
                            } else {
                                this.field2707 = arg0.method331(arg2 + -25693);
                            }
                        } else {
                            this.field2716 = arg0.method331(-32);
                        }
                    } else {
                        this.field2700 = arg0.method331(-113);
                    }
                } else {
                    this.field2697 = arg0.method331(-61);
                }
            } else {
                this.field2701 = arg0.method331(-95);
            }
        } else {
            this.field2698 = arg0.method366(arg2 ^ -9302);
        }
        ++field2706;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lhc;B)V")
    public static final void method1276(class53 arg0, byte arg1) {
        ++field2704;
        int var2 = arg0.method368(-129);
        class63.field952 = new class277[var2];
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class63.field952[var3] = new class277();
            class63.field952[var3].field4482 = arg0.method368(-129);
            class63.field952[var3].field4481 = arg0.method386((byte) 68);
        }
        class51.field702 = arg0.method368(-129);
        class12.field142 = arg0.method368(-129);
        class224.field3291 = arg0.method368(-129);
        class248.field3738 = new class229[class12.field142 - class51.field702 - -1];
        int var4 = 0;
        if (arg1 < 103) {
            method1272(true);
        }
        while (~var4 > ~class224.field3291) {
            int var5 = arg0.method368(-129);
            class229 var6 = class248.field3738[var5] = new class229();
            var6.field1693 = arg0.method366(-16505);
            var6.field1687 = arg0.method340(-97);
            var6.field3365 = var5 - -class51.field702;
            var6.field3367 = arg0.method386((byte) 68);
            var6.field3369 = arg0.method386((byte) 68);
            ++var4;
        }
        class172.field2629 = arg0.method340(-114);
        class243.field3576 = true;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 != 0) {
            this.field2710 = -36;
        }
        ++field2703;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lhc;I)Llj;")
    public static final class253 method1277(class53 arg0, int arg1) {
        ++field2711;
        if (arg1 != 0) {
            field2705 = 1.18893F;
        }
        return new class253(arg0.method337(113), arg0.method337(85), arg0.method337(127), arg0.method337(125), arg0.method337(123), arg0.method337(87), arg0.method337(102), arg0.method337(arg1 + 79), arg0.method362(-4), arg0.method366(-16505));
    }
}
