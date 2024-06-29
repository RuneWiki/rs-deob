import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class84 extends class273 {

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    private int field1630 = 819;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    private int field1628 = 0;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private int field1627 = 1024;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    private int field1636 = 1024;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    private int field1638 = 0;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    private int field1633 = 1024;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    private int field1640 = 409;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    private int field1639 = 1024;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    private int field1646 = 2048;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "J")
    public static long field1635 = 0L;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lwj;")
    public static class6 field1637 = null;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public static int field1634 = 0;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "Ljd;")
    public static class86 field1642 = class122.method868("T", true);

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "[I")
    public static int[] field1641;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1644;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[][] var4 = super.field4800.method1230(-18226);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class176.field3200 * this.field1627 >> 12;
            int var14 = class176.field3200 * this.field1646 >> 12;
            int var15 = class96.field1896 * this.field1640 >> 12;
            int var16 = 0;
            int var17 = class96.field1896 * this.field1630 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field1645 = class176.field3200 / 8 * this.field1639 >> 12;
                int var18 = class176.field3200 / var13 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1628);
                while (true) {
                    while (true) {
                        int var22 = var13 - -class30.method197(71, -var13 + var14, var21);
                        int var23 = class30.method197(112, var17 - var15, var21) + var15;
                        int var24 = var8 - -var22;
                        if (~var24 < ~class176.field3200) {
                            var22 = -var8 + class176.field3200;
                            var24 = class176.field3200;
                        }
                        int var27;
                        if (var11) {
                            var27 = 0;
                        } else {
                            int var25 = var10;
                            int[] var26 = var20[var10];
                            var27 = var26[2];
                            int var28 = 0;
                            int var29 = var6 + var24;
                            if (var29 < 0) {
                                var29 += class176.field3200;
                            }
                            if (~class176.field3200 > ~var29) {
                                var29 -= class176.field3200;
                            }
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var29 >= var30[0] && ~var30[1] <= ~var29) {
                                    if (~var10 != ~var25) {
                                        int var31 = var8 - -var6;
                                        if (var31 < 0) {
                                            var31 += class176.field3200;
                                        }
                                        if (var31 > class176.field3200) {
                                            var31 -= class176.field3200;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var10 + var32) % var12];
                                            var27 = Math.max(var27, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var10 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var27 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var29 > var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class176.field3200;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method581(var4, -var38 + var39, var35, -60, -var35 + var27, var7 + var38, var21);
                                            }
                                        }
                                    }
                                    var10 = var25;
                                    break;
                                }
                                ++var25;
                                if (var12 <= var25) {
                                    var25 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class96.field1896 > ~(var27 - -var23)) {
                            var23 = -var27 + class96.field1896;
                        } else {
                            var9 = false;
                        }
                        if (~class176.field3200 == ~var24) {
                            this.method581(var4, var22, var27, -106, var23, var5 + var8, var21);
                            if (var9) {
                                return arg0 != -7420 ? null : var3;
                            }
                            var7 = var5;
                            var10 = 0;
                            var9 = true;
                            var11 = false;
                            int[][] var41 = var20;
                            var20 = var19;
                            int[] var42 = var19[var16++];
                            var42[2] = var27 - -var23;
                            var42[1] = var24;
                            var12 = var16;
                            var19 = var41;
                            var42[0] = var8;
                            var16 = 0;
                            var5 = class30.method197(115, class176.field3200, var21);
                            var6 = var5 - var7;
                            int var43 = var6;
                            var8 = 0;
                            if (~var6 > -1) {
                                var43 = class176.field3200 + var6;
                            }
                            if (~class176.field3200 > ~var43) {
                                var43 -= class176.field3200;
                            }
                            while (true) {
                                int[] var44 = var20[var10];
                                if (var43 >= var44[0] && var43 <= var44[1]) {
                                    break;
                                }
                                ++var10;
                                if (~var10 <= ~var12) {
                                    var10 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var16++];
                            var45[2] = var23 + var27;
                            var45[0] = var8;
                            var45[1] = var24;
                            this.method581(var4, var22, var27, -122, var23, var5 + var8, var21);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return arg0 != -7420 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public static void method580(int arg0) {
        field1637 = null;
        field1641 = null;
        field1642 = null;
        if (arg0 != -3137) {
            field1642 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 == 4095) {
            ++field1632;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1631;
        if (arg2 < -16) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (arg0 != 7) {
                                            if (arg0 == 8) {
                                                this.field1636 = arg1.method1410(-106);
                                            }
                                        } else {
                                            this.field1633 = arg1.method1410(-91);
                                        }
                                    } else {
                                        this.field1638 = arg1.method1408((byte) -126);
                                    }
                                } else {
                                    this.field1639 = arg1.method1410(-125);
                                }
                            } else {
                                this.field1630 = arg1.method1410(-118);
                            }
                        } else {
                            this.field1640 = arg1.method1410(-52);
                        }
                    } else {
                        this.field1646 = arg1.method1410(-94);
                    }
                } else {
                    this.field1627 = arg1.method1410(-100);
                }
            } else {
                this.field1628 = arg1.method1408((byte) -51);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([[IIIIIILjava/util/Random;)V")
    private final void method581(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field1629;
        int var8 = this.field1636 <= 0 ? 4096 : 4096 - class30.method197(58, this.field1636, arg6);
        int var9 = this.field1645 * this.field1633 >> 12;
        if (arg3 <= -3) {
            int var10 = this.field1645 + -(~var9 < -1 ? class30.method197(86, var9, arg6) : 0);
            if (~class176.field3200 >= ~arg5) {
                arg5 -= class176.field3200;
            }
            if (~var10 < -1) {
                if (~arg4 < -1 && arg1 > 0) {
                    int var11 = arg1 / 2;
                    int var12 = arg4 / 2;
                    int var13 = ~var10 < ~var11 ? var11 : var10;
                    int var14 = arg5 - -var13;
                    int var15 = var10 <= var12 ? var10 : var12;
                    int var16 = -(var13 * 2) + arg1;
                    for (int var17 = 0; ~var17 > ~arg4; ++var17) {
                        int[] var18 = arg0[arg2 + var17];
                        if (var17 < var15) {
                            int var19 = var8 * var17 / var15;
                            if (this.field1638 != 0) {
                                for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class1.method5(class90.field1844, arg5 + var20)] = var18[class1.method5(class90.field1844, -var20 + arg5 - (-arg1 + 1))] = ~var19 < ~var21 ? var21 : var19;
                                }
                            } else {
                                for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class1.method5(arg5 + var22, class90.field1844)] = var18[class1.method5(class90.field1844, arg5 - -arg1 - (var22 - -1))] = var19 * var24 >> 12;
                                }
                            }
                            if (~(var14 + var16) >= ~class176.field3200) {
                                class250.method1688(var18, var14, var16, var19);
                            } else {
                                int var23 = class176.field3200 - var14;
                                class250.method1688(var18, var14, var23, var19);
                                class250.method1688(var18, 0, var16 - var23, var19);
                            }
                        } else {
                            int var25 = -var17 + arg4 + -1;
                            if (~var25 > ~var15) {
                                int var26 = var8 * var25 / var15;
                                if (~this.field1638 == -1) {
                                    for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class1.method5(arg5 + var27, class90.field1844)] = var18[class1.method5(class90.field1844, -var27 + arg5 - 1 + arg1)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class1.method5(arg5 + var29, class90.field1844)] = var18[class1.method5(arg1 + arg5 + -1 - var29, class90.field1844)] = ~var26 < ~var31 ? var31 : var26;
                                    }
                                }
                                if (~class176.field3200 <= ~(var14 + var16)) {
                                    class250.method1688(var18, var14, var16, var26);
                                } else {
                                    int var30 = -var14 + class176.field3200;
                                    class250.method1688(var18, var14, var30, var26);
                                    class250.method1688(var18, 0, -var30 + var16, var26);
                                }
                            } else {
                                for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                    var18[class1.method5(class90.field1844, arg5 + var32)] = var18[class1.method5(class90.field1844, arg1 + arg5 - (var32 + 1))] = var8 * var32 / var13;
                                }
                                if (~class176.field3200 > ~(var14 + var16)) {
                                    int var33 = -var14 + class176.field3200;
                                    class250.method1688(var18, var14, var33, var8);
                                    class250.method1688(var18, 0, -var33 + var16, var8);
                                } else {
                                    class250.method1688(var18, var14, var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (class176.field3200 >= arg1 + arg5) {
                for (int var34 = 0; var34 < arg4; ++var34) {
                    class250.method1688(arg0[arg2 - -var34], arg5, arg1, var8);
                }
            } else {
                int var35 = -arg5 + class176.field3200;
                for (int var36 = 0; ~arg4 < ~var36; ++var36) {
                    int[] var37 = arg0[arg2 + var36];
                    class250.method1688(var37, arg5, var35, var8);
                    class250.method1688(var37, 0, -var35 + arg1, var8);
                }
            }
        }
    }
}
