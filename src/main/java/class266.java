import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class266 extends class202 {

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    private int field4280 = 0;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    private int field4279 = 0;

    @OriginalMember(owner = "client!no", name = "R", descriptor = "I")
    private int field4288 = 8192;

    @OriginalMember(owner = "client!no", name = "U", descriptor = "I")
    private int field4291 = 12288;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "I")
    private int field4287 = 2048;

    @OriginalMember(owner = "client!no", name = "W", descriptor = "I")
    private int field4293 = 4096;

    @OriginalMember(owner = "client!no", name = "V", descriptor = "I")
    private int field4292 = 2048;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field4281 = new String[100];

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!no", name = "S", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!no", name = "T", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!no", name = "X", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!no", name = "Y", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(III)Z")
    private final boolean method1812(int arg0, int arg1, int arg2) {
        ++field4290;
        int var4 = (arg1 + arg2) * this.field4291 >> 12;
        int var5 = class237.field3882[(1048268 & var4 * 255) >> 12];
        if (arg0 > -104) {
            this.method1812(-91, 58, -102);
        }
        int var6 = (var5 << 12) / this.field4291;
        int var7 = (var6 << 12) / this.field4288;
        int var8 = this.field4293 * var7 >> 12;
        return ~var8 < ~(-arg2 + arg1) && -var8 < arg1 - arg2;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1813(byte arg0, String arg1) {
        ++field4294;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var2 > var5; ++var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
        }
        if (arg0 <= 110) {
            method1816((byte) 97);
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI[Lgi;)V")
    public static final void method1814(byte arg0, int arg1, class437[] arg2) {
        ++field4289;
        if (arg0 == -121) {
            for (int var3 = 0; ~arg2.length < ~var3; ++var3) {
                class437 var4 = arg2[var3];
                if (var4 != null && ~var4.field6599 == ~arg1 && !client.method512(var4)) {
                    if (~var4.field6729 == -1) {
                        method1814((byte) -121, var4.field6751, arg2);
                        if (var4.field6675 != null) {
                            method1814((byte) -121, var4.field6751, var4.field6675);
                        }
                        class301 var5 = (class301) class423.field6414.method1122((byte) 59, (long) var4.field6751);
                        if (var5 != null) {
                            class345.method2281(var5.field4721, -98);
                        }
                    }
                    if (var4.field6729 == 6 && var4.field6605 != -1) {
                        class363 var6 = class388.field5915.method1703(var4.field6605, -12536);
                        if (var6 != null) {
                            var4.field6610 += class376.field5786;
                            while (var4.field6610 > var6.field5599[var4.field6621]) {
                                var4.field6610 -= var6.field5599[var4.field6621];
                                ++var4.field6621;
                                if (var6.field5623.length <= var4.field6621) {
                                    var4.field6621 -= var6.field5617;
                                    if (var4.field6621 < 0 || ~var4.field6621 <= ~var6.field5623.length) {
                                        var4.field6621 = 0;
                                    }
                                }
                                var4.field6659 = var4.field6621 - -1;
                                if (~var4.field6659 <= ~var6.field5623.length) {
                                    var4.field6659 -= var6.field5617;
                                    if (var4.field6659 < 0 || ~var4.field6659 <= ~var6.field5623.length) {
                                        var4.field6659 = -1;
                                    }
                                }
                                class479.method2962(-96, var4);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        int var2 = -64 % ((80 - arg0) / 46);
        class62.method461(82);
        ++field4284;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lza;IIILqg;Lho;)Z")
    public static final boolean method1815(class497 arg0, int arg1, int arg2, int arg3, class210 arg4, class224 arg5) {
        ++field4282;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field3253 != null) {
            var7 = (arg4.field3234 + arg5.field3758 + -class194.field2901) * (-class194.field2903 + class194.field2889) / (class194.field2882 - class194.field2901) + class194.field2903;
            var8 = -((arg5.field3763 - class194.field2895 + arg4.field3243) * (-class194.field2897 + class194.field2888) / (-class194.field2895 + class194.field2890)) + class194.field2888;
            var9 = -((class194.field2888 - class194.field2897) * (-class194.field2895 + arg5.field3763 + arg4.field3261) / (class194.field2890 - class194.field2895)) + class194.field2888;
            var6 = (arg5.field3758 - class194.field2901 + arg4.field3244) * (-class194.field2903 + class194.field2889) / (-class194.field2901 + class194.field2882) + class194.field2903;
        }
        class139 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg4.field3254 != 0) {
            if (arg5.field3762 && ~arg4.field3271 != 0) {
                var10 = arg4.method1485(true, (byte) 91, arg0);
            } else {
                var10 = arg4.method1485(false, (byte) 65, arg0);
            }
            if (var10 != null) {
                var11 = arg5.field3765 + -(var10.method623() - -1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg5.field3765 - -(1 + var10.method623() >> 1);
                if (~var7 > ~var12) {
                    var7 = var12;
                }
                var13 = arg5.field3761 - (1 + var10.method618() >> 1);
                if (~var13 > ~var8) {
                    var8 = var13;
                }
                var14 = arg5.field3761 + (var10.method618() + 1 >> 1);
                if (~var14 < ~var9) {
                    var9 = var14;
                }
            }
        }
        class29 var15 = null;
        int var16 = 0;
        int var17 = 11 / ((arg3 - 8) / 59);
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg4.field3249 != null) {
            var15 = class36.method221(arg4.field3263, -21279);
            if (var15 != null) {
                var16 = class240.field3905.method2260(arg4.field3249, 215, (class139[]) null, class159.field2171, (int[]) null);
                int var24 = arg5.field3761;
                if (var10 == null) {
                    var18 = var24 - var15.method195() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method618() >> 1) - -(var15.method189() * var16));
                }
                for (int var25 = 0; ~var16 < ~var25; ++var25) {
                    String var26 = class159.field2171[var25];
                    if (~var25 > ~(var16 + -1)) {
                        var26 = var26.substring(0, -4 + var26.length());
                    }
                    int var27 = var15.method191(var26);
                    if (~var19 > ~var27) {
                        var19 = var27;
                    }
                }
                var20 = arg5.field3765 - var19 / 2 + arg1;
                if (~var20 > ~var6) {
                    var6 = var20;
                }
                var21 = var19 / 2 + arg5.field3765 + arg1;
                var22 = arg2 + var18;
                if (~var21 < ~var7) {
                    var7 = var21;
                }
                if (var8 > var22) {
                    var8 = var22;
                }
                var23 = var18 - -(var15.method189() * var16) + arg2;
                if (~var23 < ~var9) {
                    var9 = var23;
                }
            }
        }
        if (var7 >= class194.field2903 && var6 <= class194.field2889 && class194.field2897 <= var9 && ~var8 >= ~class194.field2888) {
            if (arg4.field3253 != null) {
                int[] var28 = new int[arg4.field3253.length];
                for (int var29 = 0; var28.length / 2 > var29; ++var29) {
                    int var31 = arg4.field3253[var29 * 2] - -arg5.field3758;
                    int var32 = arg4.field3253[var29 * 2 - -1] + arg5.field3763;
                    var28[var29 * 2] = class194.field2903 - -((class194.field2889 - class194.field2903) * (-class194.field2901 + var31) / (-class194.field2901 + class194.field2882));
                    var28[var29 * 2 - -1] = -((class194.field2888 - class194.field2897) * (-class194.field2895 + var32) / (class194.field2890 - class194.field2895)) + class194.field2888;
                }
                class288.method1942(arg0, var28, arg4.field3230);
                for (int var30 = 0; ~(var28.length / 2 + -1) < ~var30; ++var30) {
                    arg0.method3045(var28[var30 * 2], (byte) 70, var28[var30 * 2 + 1], var28[var30 * 2 + 2], var28[var30 * 2 + 3], arg4.field3236);
                }
                arg0.method3045(var28[var28.length + -2], (byte) 78, var28[var28.length + -1], var28[0], var28[1], arg4.field3236);
            }
            if (var10 != null) {
                if (class52.field707 > 0 && (~class501.field7516 != 0 && class501.field7516 == arg5.field3759 || ~class136.field1877 != 0 && ~class136.field1877 == ~arg4.field3272)) {
                    int var33;
                    if (class388.field5920 <= 50) {
                        var33 = class388.field5920 * 2;
                    } else {
                        var33 = -(class388.field5920 * 2) + 200;
                    }
                    int var34 = 16776960 | var33 << 24;
                    arg0.method3037(var10.method626() / 2 + 7, var34, arg5.field3761, arg5.field3765, -101);
                    arg0.method3037(5 + var10.method626() / 2, var34, arg5.field3761, arg5.field3765, -81);
                    arg0.method3037(var10.method626() / 2 + 3, var34, arg5.field3761, arg5.field3765, -123);
                    arg0.method3037(1 + var10.method626() / 2, var34, arg5.field3761, arg5.field3765, -61);
                    arg0.method3037(var10.method626() / 2, var34, arg5.field3761, arg5.field3765, -80);
                }
                var10.method852(arg5.field3765 + -(var10.method623() >> 1), arg5.field3761 + -(var10.method618() >> 1));
            }
            if (arg4.field3249 != null && var15 != null) {
                class537.method3182(var15, var18, var16, arg0, arg4, var19, arg5, (byte) 49);
            }
            if (~arg4.field3254 != 0 || arg4.field3249 != null) {
                class39 var35 = new class39(arg5);
                var35.field392 = var11;
                var35.field387 = var22;
                var35.field384 = var14;
                var35.field395 = var21;
                var35.field391 = var12;
                var35.field396 = var13;
                var35.field397 = var20;
                var35.field389 = var23;
                class541.field7908.method2124(var35, (byte) 117);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V")
    public static void method1816(byte arg0) {
        field4281 = null;
        if (arg0 > -39) {
            method1813((byte) -23, (String) null);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZII)Z")
    private final boolean method1817(boolean arg0, int arg1, int arg2) {
        ++field4283;
        int var4 = (-arg2 + arg1) * this.field4291 >> 12;
        if (!arg0) {
            this.field4287 = 23;
        }
        int var5 = class237.field3882[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4291;
        int var7 = (var6 << 12) / this.field4288;
        int var8 = this.field4293 * var7 >> 12;
        return var8 > arg1 + arg2 && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(III)Z")
    public static final boolean method1818(int arg0, int arg1, int arg2) {
        ++field4286;
        return arg2 > -111 ? false : class60.method451(arg1, arg0, (byte) 73) & class202.method1373(arg1, -21682, arg0);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class266() {
        super(0, true);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field4285;
        if (!arg1) {
            method1814((byte) 88, 104, (class437[]) null);
        }
        int[] var3 = super.field3064.method2452((byte) 54, arg0);
        if (super.field3064.field5837) {
            int var4 = class521.field7716[arg0] - 2048;
            for (int var5 = 0; var5 < class276.field4375; ++var5) {
                int var6 = class476.field7271[var5] + -2048;
                int var7 = this.field4287 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field4280 + var4;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field4279 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field4292 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method1817(true, var12, var9) && !this.method1812(-107, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 24 % ((arg1 - -46) / 50);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4288 = arg0.method1455(-3387);
                                }
                            } else {
                                this.field4293 = arg0.method1455(-3387);
                            }
                        } else {
                            this.field4291 = arg0.method1455(-3387);
                        }
                    } else {
                        this.field4292 = arg0.method1455(-3387);
                    }
                } else {
                    this.field4279 = arg0.method1455(-3387);
                }
            } else {
                this.field4280 = arg0.method1455(-3387);
            }
        } else {
            this.field4287 = arg0.method1455(-3387);
        }
        ++field4295;
    }
}
