import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class315 extends class17 {

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
    private int field4561 = 1024;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
    private int field4560 = 1024;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "I")
    private int field4564 = 819;

    @OriginalMember(owner = "client!pr", name = "W", descriptor = "I")
    private int field4574 = 1024;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
    private int field4570 = 1024;

    @OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
    private int field4573 = 2048;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    private int field4563 = 0;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    private int field4566 = 0;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "I")
    private int field4569 = 409;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4557 = new String[100];

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    private int field4559;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!pr", name = "U", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
    private final void method1894(int arg0, int arg1, int arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        ++field4571;
        int var8 = this.field4560 > 0 ? 4096 + -class119.method802(0, this.field4560, arg4) : 4096;
        int var9 = this.field4570 * this.field4559 >> 12;
        int var10 = this.field4559 - (~var9 < -1 ? class119.method802(0, var9, arg4) : 0);
        int var11 = -56 / ((arg6 - -58) / 35);
        if (arg2 >= class530.field7763) {
            arg2 -= class530.field7763;
        }
        if (var10 <= 0) {
            if (~class530.field7763 > ~(arg2 + arg5)) {
                int var12 = -arg2 + class530.field7763;
                for (int var13 = 0; ~arg1 < ~var13; ++var13) {
                    int[] var14 = arg3[arg0 + var13];
                    class182.method1137(var14, arg2, var12, var8);
                    class182.method1137(var14, 0, -var12 + arg5, var8);
                }
            } else {
                for (int var15 = 0; var15 < arg1; ++var15) {
                    class182.method1137(arg3[arg0 + var15], arg2, arg5, var8);
                }
            }
        } else if (arg1 > 0 && arg5 > 0) {
            int var16 = arg5 / 2;
            int var17 = arg1 / 2;
            int var18 = ~var16 <= ~var10 ? var10 : var16;
            int var19 = ~var17 <= ~var10 ? var10 : var17;
            int var20 = arg2 + var18;
            int var21 = -(var18 * 2) + arg5;
            for (int var22 = 0; var22 < arg1; ++var22) {
                int[] var23 = arg3[arg0 + var22];
                if (var22 < var19) {
                    int var24 = var8 * var22 / var19;
                    if (this.field4563 == 0) {
                        for (int var25 = 0; ~var25 > ~var18; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class239.method1507(class43.field499, arg2 + var25)] = var23[class239.method1507(class43.field499, arg5 + -1 + arg2 - var25)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var18 > var27; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class239.method1507(arg2 + var27, class43.field499)] = var23[class239.method1507(-var27 + arg5 + arg2 + -1, class43.field499)] = var29 >= var24 ? var24 : var29;
                        }
                    }
                    if (var20 + var21 > class530.field7763) {
                        int var28 = -var20 + class530.field7763;
                        class182.method1137(var23, var20, var28, var24);
                        class182.method1137(var23, 0, var21 - var28, var24);
                    } else {
                        class182.method1137(var23, var20, var21, var24);
                    }
                } else {
                    int var30 = -var22 + arg1 + -1;
                    if (~var30 > ~var19) {
                        int var31 = var8 * var30 / var19;
                        if (this.field4563 != 0) {
                            for (int var32 = 0; var18 > var32; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class239.method1507(arg2 + var32, class43.field499)] = var23[class239.method1507(class43.field499, -var32 + arg2 + arg5 + -1)] = ~var31 >= ~var33 ? var31 : var33;
                            }
                        } else {
                            for (int var34 = 0; var34 < var18; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class239.method1507(class43.field499, arg2 + var34)] = var23[class239.method1507(class43.field499, arg2 - var34 + arg5 + -1)] = var31 * var36 >> 12;
                            }
                        }
                        if (~(var20 + var21) < ~class530.field7763) {
                            int var35 = class530.field7763 - var20;
                            class182.method1137(var23, var20, var35, var31);
                            class182.method1137(var23, 0, -var35 + var21, var31);
                        } else {
                            class182.method1137(var23, var20, var21, var31);
                        }
                    } else {
                        for (int var37 = 0; var37 < var18; ++var37) {
                            var23[class239.method1507(arg2 + var37, class43.field499)] = var23[class239.method1507(class43.field499, arg2 - -arg5 + -1 + -var37)] = var8 * var37 / var18;
                        }
                        if (~class530.field7763 > ~(var20 + var21)) {
                            int var38 = -var20 + class530.field7763;
                            class182.method1137(var23, var20, var38, var8);
                            class182.method1137(var23, 0, var21 - var38, var8);
                        } else {
                            class182.method1137(var23, var20, var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(IB)V")
    public static final void method1895(int arg0, byte arg1) {
        ++field4565;
        if (class120.method807(-8810, arg0)) {
            class150[] var2 = class494.field6988[arg0];
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class150 var4 = var2[var3];
                if (var4 != null) {
                    var4.field2009 = 0;
                    var4.field2060 = 0;
                    var4.field2140 = 1;
                }
            }
            if (arg1 != 3) {
                field4557 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
    public static final void method1896(boolean arg0, int arg1) {
        if (arg0 && class245.field3547 != null) {
            class515.field7593 = class245.field3547.field4512;
        } else {
            class515.field7593 = -1;
        }
        ++field4567;
        class382.field5382 = null;
        class433.field6100 = 0;
        class378.field5357 = null;
        class245.field3547 = null;
        class245.method1556();
        class245.field3560.method2656(arg1);
        class97.field1278 = -1;
        class245.field3562 = null;
        class496.field7037 = null;
        class150.field2035 = null;
        class409.field5787 = -1;
        class179.field2572 = null;
        class377.field5337 = null;
        class127.field1710 = null;
        class68.field860 = null;
        class510.field7558 = null;
        class273.field4051 = null;
        class132.field1734 = null;
        class245.field3553.method1318((byte) 123);
        class245.field3550.method1860(false, arg1, 64);
        class245.field3553.method1317(128, 64, arg1 + -3);
        class245.field3552.method1905(-106, 64);
        class181.field2596.method2791(64, (byte) -80);
    }

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "(I)V")
    public static void method1897(int arg0) {
        if (arg0 != 0) {
            field4557 = null;
        }
        field4557 = null;
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field4558;
        if (arg0 != -9) {
            this.field4564 = -71;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field4562;
        if (arg1 < 53) {
            return null;
        } else {
            int[] var3 = super.field210.method2683(-17, arg0);
            if (super.field210.field6442) {
                int[][] var4 = super.field210.method2685((byte) 92);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class530.field7763 * this.field4561 >> 12;
                int var15 = class530.field7763 * this.field4573 >> 12;
                int var16 = class178.field2556 * this.field4569 >> 12;
                int var17 = class178.field2556 * this.field4564 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field4559 = class530.field7763 / 8 * this.field4574 >> 12;
                    int var18 = 1 - -(class530.field7763 / var14);
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field4566);
                    while (true) {
                        while (true) {
                            int var22 = class119.method802(0, -var14 + var15, var21) + var14;
                            int var23 = class119.method802(0, -var16 + var17, var21) + var16;
                            int var24 = var8 + var22;
                            if (var24 > class530.field7763) {
                                var24 = class530.field7763;
                                var22 = -var8 + class530.field7763;
                            }
                            int var29;
                            if (var11) {
                                var29 = 0;
                            } else {
                                int var25 = var9;
                                int[] var26 = var20[var9];
                                int var27 = 0;
                                int var28 = var24 - -var5;
                                if (var28 < 0) {
                                    var28 += class530.field7763;
                                }
                                if (var28 > class530.field7763) {
                                    var28 -= class530.field7763;
                                }
                                var29 = var26[2];
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (~var28 <= ~var30[0] && ~var28 >= ~var30[1]) {
                                        if (var9 != var25) {
                                            int var31 = var5 + var8;
                                            if (var31 < 0) {
                                                var31 += class530.field7763;
                                            }
                                            if (class530.field7763 < var31) {
                                                var31 -= class530.field7763;
                                            }
                                            for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                                int[] var40 = var20[(var9 - -var32) % var12];
                                                var29 = Math.max(var29, var40[2]);
                                            }
                                            for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var12];
                                                int var35 = var34[2];
                                                if (var29 != var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var28 <= var31) {
                                                        if (var36 != 0) {
                                                            var38 = Math.max(var31, var36);
                                                            var39 = class530.field7763;
                                                        } else {
                                                            var39 = Math.min(var28, var37);
                                                            var38 = 0;
                                                        }
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var28, var37);
                                                    }
                                                    this.method1894(var35, -var35 + var29, var7 + var38, var4, var21, -var38 + var39, 25);
                                                }
                                            }
                                        }
                                        var9 = var25;
                                        break;
                                    }
                                    ++var25;
                                    if (var12 <= var25) {
                                        var25 = 0;
                                    }
                                    ++var27;
                                }
                            }
                            if (class178.field2556 < var23 + var29) {
                                var23 = -var29 + class178.field2556;
                            } else {
                                var10 = false;
                            }
                            if (~class530.field7763 != ~var24) {
                                int[] var41 = var19[var13++];
                                var41[0] = var8;
                                var41[1] = var24;
                                var41[2] = var29 - -var23;
                                this.method1894(var29, var23, var8 - -var6, var4, var21, var22, -104);
                                var8 = var24;
                            } else {
                                this.method1894(var29, var23, var6 + var8, var4, var21, var22, -102);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var42 = var19[var13++];
                                var42[1] = var24;
                                var42[2] = var23 + var29;
                                var42[0] = var8;
                                int[][] var43 = var20;
                                var20 = var19;
                                var12 = var13;
                                var19 = var43;
                                var7 = var6;
                                var13 = 0;
                                var6 = class119.method802(0, class530.field7763, var21);
                                var5 = -var7 + var6;
                                var8 = 0;
                                int var44 = var5;
                                if (~var5 > -1) {
                                    var44 = class530.field7763 + var5;
                                }
                                var9 = 0;
                                if (var44 > class530.field7763) {
                                    var44 -= class530.field7763;
                                }
                                var11 = false;
                                while (true) {
                                    int[] var45 = var20[var9];
                                    if (~var45[0] >= ~var44 && ~var45[1] <= ~var44) {
                                        break;
                                    }
                                    ++var9;
                                    if (~var9 <= ~var12) {
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
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field4572;
        if (arg2 != 5159) {
            method1895(-6, (byte) 20);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field4560 = arg0.method2338(arg2 + -5159);
                                        }
                                    } else {
                                        this.field4570 = arg0.method2338(0);
                                    }
                                } else {
                                    this.field4563 = arg0.method2357((byte) 125);
                                }
                            } else {
                                this.field4574 = arg0.method2338(arg2 + -5159);
                            }
                        } else {
                            this.field4564 = arg0.method2338(0);
                        }
                    } else {
                        this.field4569 = arg0.method2338(0);
                    }
                } else {
                    this.field4573 = arg0.method2338(0);
                }
            } else {
                this.field4561 = arg0.method2338(0);
            }
        } else {
            this.field4566 = arg0.method2357((byte) 119);
        }
    }
}
