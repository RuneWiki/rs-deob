import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class714 extends class667 {

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    private int field9969 = 1024;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    private int field9970 = 409;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    private int field9971 = 819;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    private int field9963 = 1024;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    private int field9972 = 1024;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    private int field9976 = 1024;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    private int field9977 = 2048;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    private int field9965 = 0;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    private int field9975 = 0;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "[F")
    public static float[] field9974 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    private int field9966;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field9972 = arg0.method253(arg1 + -13903);
                                        }
                                    } else {
                                        this.field9976 = arg0.method253(arg1 + -13903);
                                    }
                                } else {
                                    this.field9965 = arg0.method273(arg1 + 252);
                                }
                            } else {
                                this.field9969 = arg0.method253(-13900);
                            }
                        } else {
                            this.field9971 = arg0.method253(-13900);
                        }
                    } else {
                        this.field9970 = arg0.method253(-13900);
                    }
                } else {
                    this.field9977 = arg0.method253(-13900);
                }
            } else {
                this.field9963 = arg0.method253(arg1 + -13903);
            }
        } else {
            this.field9975 = arg0.method273(255);
        }
        ++field9968;
        if (arg1 != 3) {
            method3979((byte) 56);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lbba;Z)Z")
    public static final boolean method3977(class113 arg0, boolean arg1) {
        boolean var2 = class4.field56 == class138.field2153;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method476(115);
        if (arg0.field1814 >= 0 && arg0.field1820 >= 0 && arg0.field1818 < class613.field8871 && arg0.field1810 < class453.field6328) {
            short var6 = 0;
            for (int var7 = arg0.field1814; var7 <= arg0.field1818; ++var7) {
                for (int var11 = arg0.field1820; var11 <= arg0.field1810; ++var11) {
                    class416 var12 = class442.method2653(arg0.field649, var7, var11);
                    if (var12 != null) {
                        class217 var13 = class674.method3813(arg0, (byte) 14);
                        class217 var14 = var12.field5844;
                        if (var14 == null) {
                            var12.field5844 = var13;
                        } else {
                            while (var14.field3091 != null) {
                                var14 = var14.field3091;
                            }
                            var14.field3091 = var13;
                        }
                        if (var2 && (class478.field6819[var7][var11] & -16777216) != 0) {
                            var3 = class478.field6819[var7][var11];
                            var4 = class494.field7042[var7][var11];
                            var5 = class128.field1929[var7][var11];
                        }
                        if (!arg1 && var12.field5846 != null && var12.field5846.field8175 > var6) {
                            var6 = var12.field5846.field8175;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field1814; var8 <= arg0.field1818; ++var8) {
                    for (int var9 = arg0.field1820; var9 <= arg0.field1810; ++var9) {
                        if ((class478.field6819[var8][var9] & -16777216) == 0) {
                            class478.field6819[var8][var9] = var3;
                            class494.field7042[var8][var9] = var4;
                            class128.field1929[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class120.field1870[class586.field8252++] = arg0;
            } else {
                int var10 = class4.field56 == class138.field2153 ? 1 : 0;
                if (arg0.method395((byte) 84)) {
                    if (arg0.method399((byte) 38)) {
                        class319.field4524[var10][class444.field6176[var10]++] = arg0;
                    } else {
                        class307.field4351[var10][class189.field2729[var10]++] = arg0;
                        class70.field1267 = true;
                    }
                } else {
                    class598.field8718[var10][class579.field8176[var10]++] = arg0;
                }
            }
            if (arg1) {
                arg0.field651 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILjava/util/Random;[[IBII)V")
    private final void method3978(int arg0, int arg1, Random arg2, int[][] arg3, byte arg4, int arg5, int arg6) {
        ++field9973;
        int var8 = this.field9972 > 0 ? -class459.method2800(arg2, this.field9972, (byte) -44) + 4096 : 4096;
        if (arg4 != -99) {
            this.field9971 = 90;
        }
        int var9 = this.field9976 * this.field9966 >> 12;
        int var10 = this.field9966 - (~var9 >= -1 ? 0 : class459.method2800(arg2, var9, (byte) -85));
        if (~class77.field1455 >= ~arg5) {
            arg5 -= class77.field1455;
        }
        if (var10 <= 0) {
            if (~class77.field1455 <= ~(arg0 + arg5)) {
                for (int var11 = 0; var11 < arg1; ++var11) {
                    class622.method3592(arg3[arg6 + var11], arg5, arg0, var8);
                }
            } else {
                int var12 = -arg5 + class77.field1455;
                for (int var13 = 0; ~var13 > ~arg1; ++var13) {
                    int[] var14 = arg3[arg6 + var13];
                    class622.method3592(var14, arg5, var12, var8);
                    class622.method3592(var14, 0, arg0 - var12, var8);
                }
            }
        } else if (~arg1 < -1 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg1 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = var10 > var16 ? var16 : var10;
            int var19 = arg5 + var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; arg1 > var21; ++var21) {
                int[] var22 = arg3[arg6 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field9965 == 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class555.method3246(arg5 + var24, class439.field6131)] = var22[class555.method3246(class439.field6131, -var24 + arg5 - (-arg0 - -1))] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class555.method3246(arg5 + var26, class439.field6131)] = var22[class555.method3246(-var26 + arg0 + arg5 + -1, class439.field6131)] = ~var23 >= ~var28 ? var23 : var28;
                        }
                    }
                    if (~class77.field1455 > ~(var19 - -var20)) {
                        int var27 = -var19 + class77.field1455;
                        class622.method3592(var22, var19, var27, var23);
                        class622.method3592(var22, 0, -var27 + var20, var23);
                    } else {
                        class622.method3592(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg1 - 1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field9965 != 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class555.method3246(class439.field6131, arg5 - -var31)] = var22[class555.method3246(-var31 + arg5 - (-arg0 - -1), class439.field6131)] = ~var32 <= ~var30 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; ~var17 < ~var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class555.method3246(arg5 + var33, class439.field6131)] = var22[class555.method3246(class439.field6131, arg5 - (-arg0 + var33) + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (var19 + var20 > class77.field1455) {
                            int var34 = -var19 + class77.field1455;
                            class622.method3592(var22, var19, var34, var30);
                            class622.method3592(var22, 0, -var34 + var20, var30);
                        } else {
                            class622.method3592(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class555.method3246(class439.field6131, arg5 + var36)] = var22[class555.method3246(class439.field6131, arg5 + -1 - -arg0 + -var36)] = var8 * var36 / var17;
                        }
                        if (var19 - -var20 > class77.field1455) {
                            int var37 = -var19 + class77.field1455;
                            class622.method3592(var22, var19, var37, var8);
                            class622.method3592(var22, 0, var20 - var37, var8);
                        } else {
                            class622.method3592(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field9964;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[][] var4 = super.field9355.method1746((byte) 118);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class77.field1455 * this.field9963 >> 12;
            int var15 = class77.field1455 * this.field9977 >> 12;
            int var16 = class694.field9758 * this.field9970 >> 12;
            int var17 = class694.field9758 * this.field9971 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field9966 = class77.field1455 / 8 * this.field9969 >> 12;
            int var18 = class77.field1455 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field9975);
            label130: while (true) {
                while (true) {
                    int var22 = var14 + class459.method2800(var21, -var14 + var15, (byte) -79);
                    int var23 = class459.method2800(var21, var17 - var16, (byte) -46) + var16;
                    int var24 = var8 + var22;
                    if (class77.field1455 < var24) {
                        var24 = class77.field1455;
                        var22 = -var8 + class77.field1455;
                    }
                    int var30;
                    if (var11) {
                        var30 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var24 - -var5;
                        if (var28 < 0) {
                            var28 += class77.field1455;
                        }
                        if (~class77.field1455 > ~var28) {
                            var28 -= class77.field1455;
                        }
                        while (true) {
                            int[] var29 = var20[var25];
                            if (var28 >= var29[0] && var29[1] >= var28) {
                                var30 = var26[2];
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class77.field1455;
                                    }
                                    if (~var31 < ~class77.field1455) {
                                        var31 -= class77.field1455;
                                    }
                                    for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var30 = Math.max(var30, var40[2]);
                                    }
                                    for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var30 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var28) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            } else if (~var36 == -1) {
                                                var39 = Math.min(var28, var37);
                                                var38 = 0;
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class77.field1455;
                                            }
                                            this.method3978(-var38 + var39, -var35 + var30, var21, var4, (byte) -99, var7 + var38, var35);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var25;
                            if (~var25 <= ~var12) {
                                var25 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (var30 - -var23 > class694.field9758) {
                        var23 = -var30 + class694.field9758;
                    } else {
                        var10 = false;
                    }
                    if (~class77.field1455 == ~var24) {
                        this.method3978(var22, var23, var21, var4, (byte) -99, var8 - -var6, var30);
                        if (var10) {
                            break label130;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var30 - -var23;
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var7 = var6;
                        var13 = 0;
                        var6 = class459.method2800(var21, class77.field1455, (byte) -75);
                        var5 = var6 - var7;
                        var8 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class77.field1455 + var5;
                        }
                        if (~class77.field1455 > ~var43) {
                            var43 -= class77.field1455;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var43 >= var44[0] && var43 <= var44[1]) {
                                var11 = false;
                                break;
                            }
                            int var10000 = ~var12;
                            ++var9;
                            if (var10000 >= ~var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[0] = var8;
                        var45[2] = var23 + var30;
                        var45[1] = var24;
                        this.method3978(var22, var23, var21, var4, (byte) -99, var8 - -var6, var30);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 > -87) {
            this.method116((class35) null, -3, 30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
    public static void method3979(byte arg0) {
        if (arg0 != 43) {
            method3977((class113) null, true);
        }
        field9974 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class714() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        if (arg0) {
            this.field9969 = -88;
        }
        ++field9967;
    }
}
