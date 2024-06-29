import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class101 extends class512 {

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    private int field1669 = 409;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    private int field1670 = 0;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    private int field1666 = 1024;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    private int field1667 = 1024;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    private int field1678 = 0;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    private int field1674 = 2048;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    private int field1682 = 819;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    private int field1677 = 1024;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    private int field1684 = 1024;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field1668 = 64;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "[Z")
    public static boolean[] field1681 = new boolean[8];

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "Lbu;")
    public static class407 field1683 = new class407(16);

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[I")
    public static int[] field1671;

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 98)
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V", line = 10)
    public static final void method696(byte arg0, boolean arg1) {
        ++field1673;
        class529.method3131(122);
        if (class279.method1834(arg0 + 84, class32.field515)) {
            if (arg0 != -16) {
                field1681 = null;
            }
            ++class151.field2424;
            if (~class151.field2424 <= -51 || arg1) {
                class151.field2424 = 0;
                if (!class318.field5000 && class463.field6886 != null) {
                    ++class93.field1528;
                    class265.method1775(-2, class507.field7377);
                    try {
                        class463.field6886.method2795(0, class261.field4357.field301, (byte) 14, class261.field4357.field302);
                        class261.field4357.field301 = 0;
                    } catch (IOException var2) {
                        class318.field5000 = true;
                    }
                }
                class529.method3131(arg0 + -20);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V", line = 49)
    public static void method697(int arg0) {
        if (arg0 <= -55) {
            field1671 = null;
            field1683 = null;
            field1681 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V", line = 61)
    public static final void method698(boolean arg0, int arg1) {
        class265.method1775(-2, class300.field4819);
        ++class411.field6210;
        ++field1686;
        int var2 = 103 / ((42 - arg1) / 42);
        for (class52 var3 = (class52) class259.field4346.method2518(27); var3 != null; var3 = (class52) class259.field4346.method2524(0)) {
            if (!var3.method1818(false)) {
                var3 = (class52) class259.field4346.method2518(-127);
                if (var3 == null) {
                    break;
                }
            }
            if (~var3.field843 == -1) {
                class507.method2985(var3, 32407, arg0, true);
            }
        }
        if (class402.field6122 != null) {
            class396.method2476(class402.field6122, 1);
            class402.field6122 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[I", line = 101)
    public final int[] method75(int arg0, byte arg1) {
        ++field1676;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[][] var4 = super.field7494.method233(-7777);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class402.field6113 * this.field1684 >> 12;
            int var15 = class402.field6113 * this.field1674 >> 12;
            int var16 = class227.field3953 * this.field1669 >> 12;
            int var17 = class227.field3953 * this.field1682 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field1675 = class402.field6113 / 8 * this.field1677 >> 12;
            int var18 = class402.field6113 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1678);
            label125: while (true) {
                while (true) {
                    int var22 = class235.method1620(var21, -var14 + var15, false) + var14;
                    int var23 = class235.method1620(var21, var17 - var16, false) + var16;
                    int var24 = var8 + var22;
                    if (~class402.field6113 > ~var24) {
                        var22 = -var8 + class402.field6113;
                        var24 = class402.field6113;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class402.field6113;
                        }
                        if (~class402.field6113 > ~var28) {
                            var28 -= class402.field6113;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && ~var28 >= ~var30[1]) {
                                if (~var9 != ~var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class402.field6113;
                                    }
                                    if (class402.field6113 < var31) {
                                        var31 -= class402.field6113;
                                    }
                                    for (int var32 = 1; var27 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var28) {
                                                if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class402.field6113;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method699(var39 - var38, var38 - -var7, 84, var21, -var35 + var29, var35, var4);
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
                    if (~(var23 + var29) >= ~class227.field3953) {
                        var10 = false;
                    } else {
                        var23 = -var29 + class227.field3953;
                    }
                    if (~class402.field6113 == ~var24) {
                        this.method699(var22, var8 - -var6, 92, var21, var23, var29, var4);
                        if (var10) {
                            break label125;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[2] = var23 + var29;
                        var41[0] = var8;
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var7 = var6;
                        var13 = 0;
                        var6 = class235.method1620(var21, class402.field6113, false);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class402.field6113 + var5;
                        }
                        var9 = 0;
                        if (class402.field6113 < var43) {
                            var43 -= class402.field6113;
                        }
                        var11 = false;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && var44[1] >= var43) {
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var23 + var29;
                        var45[0] = var8;
                        this.method699(var22, var6 + var8, 110, var21, var23, var29, var4);
                        var8 = var24;
                    }
                }
            }
        }
        int var46 = -7 % ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZILia;)V", line = 350)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (~arg1 == -9) {
                                            this.field1666 = arg2.method132(107);
                                        }
                                    } else {
                                        this.field1667 = arg2.method132(39);
                                    }
                                } else {
                                    this.field1670 = arg2.method126((byte) -102);
                                }
                            } else {
                                this.field1677 = arg2.method132(38);
                            }
                        } else {
                            this.field1682 = arg2.method132(65);
                        }
                    } else {
                        this.field1669 = arg2.method132(117);
                    }
                } else {
                    this.field1674 = arg2.method132(68);
                }
            } else {
                this.field1684 = arg2.method132(99);
            }
        } else {
            this.field1678 = arg2.method126((byte) -115);
        }
        if (!arg0) {
            this.method71(true, 112, (class23) null);
        }
        ++field1679;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 457)
    public final void method74(int arg0) {
        if (arg0 != 12388) {
            this.method74(1);
        }
        ++field1672;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V", line = 481)
    private final void method699(int arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int[][] arg6) {
        ++field1685;
        if (arg2 > 36) {
            int var8 = ~this.field1666 < -1 ? -class235.method1620(arg3, this.field1666, false) + 4096 : 4096;
            int var9 = this.field1675 * this.field1667 >> 12;
            int var10 = this.field1675 - (var9 > 0 ? class235.method1620(arg3, var9, false) : 0);
            if (~class402.field6113 >= ~arg1) {
                arg1 -= class402.field6113;
            }
            if (var10 > 0) {
                if (arg4 > 0 && ~arg0 < -1) {
                    int var11 = arg0 / 2;
                    int var12 = arg4 / 2;
                    int var13 = ~var11 <= ~var10 ? var10 : var11;
                    int var14 = var12 < var10 ? var12 : var10;
                    int var15 = arg1 + var13;
                    int var16 = arg0 - var13 * 2;
                    for (int var17 = 0; arg4 > var17; ++var17) {
                        int[] var18 = arg6[arg5 + var17];
                        if (var14 > var17) {
                            int var19 = var8 * var17 / var14;
                            if (this.field1670 == 0) {
                                for (int var20 = 0; var13 > var20; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class344.method2224(class269.field4478, arg1 + var20)] = var18[class344.method2224(arg0 - var20 + arg1 + -1, class269.field4478)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class344.method2224(class269.field4478, arg1 - -var22)] = var18[class344.method2224(class269.field4478, arg1 - -arg0 + -var22 + -1)] = var24 < var19 ? var24 : var19;
                                }
                            }
                            if (var15 - -var16 > class402.field6113) {
                                int var23 = -var15 + class402.field6113;
                                class85.method607(var18, var15, var23, var19);
                                class85.method607(var18, 0, -var23 + var16, var19);
                            } else {
                                class85.method607(var18, var15, var16, var19);
                            }
                        } else {
                            int var25 = -var17 + arg4 + -1;
                            if (var25 < var14) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field1670 != -1) {
                                    for (int var27 = 0; var13 > var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class344.method2224(arg1 + var27, class269.field4478)] = var18[class344.method2224(arg0 + arg1 + -var27 + -1, class269.field4478)] = ~var28 > ~var26 ? var28 : var26;
                                    }
                                } else {
                                    for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class344.method2224(arg1 - -var29, class269.field4478)] = var18[class344.method2224(class269.field4478, -var29 + arg1 - -arg0 - 1)] = var26 * var31 >> 12;
                                    }
                                }
                                if (var15 - -var16 <= class402.field6113) {
                                    class85.method607(var18, var15, var16, var26);
                                } else {
                                    int var30 = class402.field6113 - var15;
                                    class85.method607(var18, var15, var30, var26);
                                    class85.method607(var18, 0, -var30 + var16, var26);
                                }
                            } else {
                                for (int var32 = 0; var13 > var32; ++var32) {
                                    var18[class344.method2224(class269.field4478, arg1 - -var32)] = var18[class344.method2224(-var32 + arg1 - (-arg0 - -1), class269.field4478)] = var8 * var32 / var13;
                                }
                                if (class402.field6113 >= var15 + var16) {
                                    class85.method607(var18, var15, var16, var8);
                                } else {
                                    int var33 = -var15 + class402.field6113;
                                    class85.method607(var18, var15, var33, var8);
                                    class85.method607(var18, 0, -var33 + var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (~class402.field6113 <= ~(arg0 + arg1)) {
                for (int var34 = 0; var34 < arg4; ++var34) {
                    class85.method607(arg6[arg5 + var34], arg1, arg0, var8);
                }
            } else {
                int var35 = -arg1 + class402.field6113;
                for (int var36 = 0; arg4 > var36; ++var36) {
                    int[] var37 = arg6[arg5 + var36];
                    class85.method607(var37, arg1, var35, var8);
                    class85.method607(var37, 0, -var35 + arg0, var8);
                }
            }
        }
    }
}
