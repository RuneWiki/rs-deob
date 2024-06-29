import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class585 extends class192 {

    @OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
    private int field7934 = 4096;

    @OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
    private int field7929 = 0;

    @OriginalMember(owner = "client!jca", name = "U", descriptor = "I")
    private int field7938 = 2000;

    @OriginalMember(owner = "client!jca", name = "N", descriptor = "I")
    private int field7931 = 16;

    @OriginalMember(owner = "client!jca", name = "P", descriptor = "I")
    private int field7933 = 0;

    @OriginalMember(owner = "client!jca", name = "R", descriptor = "Lnj;")
    public static class415 field7935 = new class415(69, 7);

    @OriginalMember(owner = "client!jca", name = "V", descriptor = "I")
    public static int field7939 = 0;

    @OriginalMember(owner = "client!jca", name = "W", descriptor = "J")
    public static long field7940 = 0L;

    @OriginalMember(owner = "client!jca", name = "I", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!jca", name = "J", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!jca", name = "O", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!jca", name = "S", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!jca", name = "T", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field7936;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            field7939 = -39;
        }
        if (super.field2448.field7266) {
            int var4 = this.field7934 >> 1;
            int[][] var5 = super.field2448.method2974(30455);
            Random var6 = new Random((long) this.field7933);
            for (int var7 = 0; this.field7938 > var7; ++var7) {
                int var8 = this.field7934 <= 0 ? this.field7929 : this.field7929 - (-class562.method3002((byte) -14, var6, this.field7934) - -var4);
                int var9 = (var8 & 4083) >> 4;
                int var10 = class562.method3002((byte) -14, var6, class561.field7319);
                int var11 = class562.method3002((byte) -14, var6, class505.field6643);
                int var12 = (class337.field4354[var9] * this.field7931 >> 12) + var10;
                int var13 = var11 - -(class5.field34[var9] * this.field7931 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class562.method3002((byte) -14, var6, 4096) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = var26 - (-1024 - (-var10 + var28) * var25);
                        int var30 = class337.field4356 & var28;
                        int var31 = class95.field1247 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
    public class585() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field7934 = arg1.method2393(arg2 + -18567);
                        }
                    } else {
                        this.field7929 = arg1.method2393(-30727);
                    }
                } else {
                    this.field7931 = arg1.method2396(11);
                }
            } else {
                this.field7938 = arg1.method2393(arg2 + -18567);
            }
        } else {
            this.field7933 = arg1.method2396(arg2 + 12143);
        }
        if (arg2 != -12160) {
            this.field7933 = -63;
        }
        ++field7927;
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        ++field7928;
        if (arg0 != 63) {
            this.field7934 = 63;
        }
        class265.method1641((byte) -26);
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
    public static void method3194(int arg0) {
        field7935 = null;
        if (arg0 != -1) {
            field7940 = 6L;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([I[Ljava/lang/Object;Z)V")
    public static final void method3195(int[] arg0, Object[] arg1, boolean arg2) {
        if (!arg2) {
            field7937 = -102;
        }
        class79.method629(0, arg1, arg0.length - 1, 24, arg0);
        ++field7932;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILjba;ZILjba;)I")
    public static final int method3196(int arg0, class138 arg1, boolean arg2, int arg3, class138 arg4) {
        ++field7930;
        if (~arg0 == -2) {
            int var5 = arg4.field154;
            int var6 = arg1.field154;
            if (!arg2) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (arg0 == 2) {
            return class322.method1863(arg4.method1040((byte) 84).field9396, arg1.method1040((byte) 95).field9396, class144.field1890, 10);
        } else {
            int var7 = -3 % ((arg3 - 3) / 46);
            if (arg0 == 3) {
                if (arg4.field1809.equals("-")) {
                    if (arg1.field1809.equals("-")) {
                        return 0;
                    } else {
                        return !arg2 ? 1 : -1;
                    }
                } else if (arg1.field1809.equals("-")) {
                    return !arg2 ? -1 : 1;
                } else {
                    return class322.method1863(arg4.field1809, arg1.field1809, class144.field1890, 10);
                }
            } else if (~arg0 == -5) {
                if (!arg4.method79(88)) {
                    return arg1.method79(40) ? -1 : 0;
                } else {
                    return arg1.method79(80) ? 0 : 1;
                }
            } else if (~arg0 == -6) {
                if (arg4.method81(-108)) {
                    return !arg1.method81(-76) ? 1 : 0;
                } else {
                    return arg1.method81(-57) ? -1 : 0;
                }
            } else if (arg0 == 6) {
                if (arg4.method80(false)) {
                    return arg1.method80(false) ? 0 : 1;
                } else {
                    return !arg1.method80(false) ? 0 : -1;
                }
            } else if (arg0 == 7) {
                if (!arg4.method86(false)) {
                    return !arg1.method86(false) ? 0 : -1;
                } else {
                    return arg1.method86(false) ? 0 : 1;
                }
            } else if (arg0 == 8) {
                int var8 = arg4.field1808;
                int var9 = arg1.field1808;
                if (!arg2) {
                    if (~var9 == 0) {
                        var9 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                } else {
                    if (var9 == 1000) {
                        var9 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                }
                return -var9 + var8;
            } else {
                return -arg1.field1811 + arg4.field1811;
            }
        }
    }
}
