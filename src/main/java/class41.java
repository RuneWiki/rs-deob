import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class41 extends class371 {

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
    private int field447 = 0;

    @OriginalMember(owner = "client!oo", name = "W", descriptor = "I")
    private int field458 = 12288;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    private int field452 = 8192;

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
    private int field454 = 4096;

    @OriginalMember(owner = "client!oo", name = "eb", descriptor = "I")
    private int field466 = 2048;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!oo", name = "cb", descriptor = "I")
    private int field464 = 2048;

    @OriginalMember(owner = "client!oo", name = "V", descriptor = "[Z")
    public static boolean[] field457 = new boolean[5];

    @OriginalMember(owner = "client!oo", name = "db", descriptor = "Lmh;")
    public static class145 field465 = new class145("", 11);

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!oo", name = "T", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!oo", name = "U", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!oo", name = "X", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!oo", name = "Y", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!oo", name = "Z", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!oo", name = "ab", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!oo", name = "bb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 316)
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(BI)[I", line = 15)
    public final int[] method79(byte arg0, int arg1) {
        ++field463;
        int[] var3 = super.field5378.method1451(-119, arg1);
        if (super.field5378.field3254) {
            int var4 = class614.field9004[arg1] + -2048;
            for (int var5 = 0; var5 < field455; ++var5) {
                int var6 = class287.field4215[var5] + -2048;
                int var7 = this.field464 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field453 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field447;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 - 4096;
                int var16 = this.field466 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 - 4096 : var17;
                var3[var5] = !this.method213(-8393, var12, var9) && !this.method214(var18, (byte) -114, var15) ? 0 : 4096;
            }
        }
        return arg0 > -80 ? null : var3;
    }

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "(I)I", line = 67)
    public static final int method208(int arg0) {
        ++field450;
        if (class139.field1826) {
            return 6;
        } else if (class281.field4172 == null) {
            return 0;
        } else {
            int var1 = class281.field4172.field8163;
            if (class425.method2516(true, var1)) {
                return 1;
            } else if (class647.method3732(var1, (byte) -80)) {
                return 2;
            } else if (class340.method2113((byte) -82, var1)) {
                return 3;
            } else {
                if (arg0 != -9235) {
                    method208(89);
                }
                return class555.method3242(var1, (byte) 125) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "(I)V", line = 102)
    public static final void method209(int arg0) {
        ++field456;
        if (~class277.field4064 == -2 || ~class277.field4064 == -4 || ~class453.field6622 != ~class277.field4064 && (class277.field4064 == 0 || class453.field6622 == 0)) {
            class567.field8409 = 0;
            class350.field5086 = 0;
            class627.field9185.method1332(-22538);
        }
        if (arg0 != 255) {
            field457 = null;
        }
        class453.field6622 = class277.field4064;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZC)Z", line = 122)
    public static final boolean method210(boolean arg0, char arg1) {
        if (!arg0) {
            method210(true, (char) 65440);
        }
        ++field462;
        return arg1 >= 'A' && ~arg1 >= -91 || ~arg1 <= -98 && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[I[III)V", line = 134)
    public static final void method211(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 < 63) {
            field457 = null;
        }
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; ~var10 > ~arg0; ++var10) {
                if (~arg1[var10] > ~(var7 - -(var10 & var9))) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method211(var6 - 1, arg1, arg2, 73, arg4);
            method211(arg0, arg1, arg2, 74, var6 + 1);
        }
        ++field451;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 197)
    public final void method212(int arg0) {
        class568.method3315(false);
        ++field461;
        if (arg0 != -19103) {
            this.field447 = -14;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBLps;)V", line = 210)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field452 = arg2.method2620(125);
                                }
                            } else {
                                this.field454 = arg2.method2620(107);
                            }
                        } else {
                            this.field458 = arg2.method2620(60);
                        }
                    } else {
                        this.field466 = arg2.method2620(118);
                    }
                } else {
                    this.field447 = arg2.method2620(76);
                }
            } else {
                this.field453 = arg2.method2620(122);
            }
        } else {
            this.field464 = arg2.method2620(44);
        }
        int var5 = -127 / ((-15 - arg1) / 39);
        ++field449;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(III)Z", line = 294)
    private final boolean method213(int arg0, int arg1, int arg2) {
        ++field459;
        if (arg0 != -8393) {
            this.field454 = -16;
        }
        int var4 = (-arg2 + arg1) * this.field458 >> 12;
        int var5 = class289.field4252[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field458;
        int var7 = (var6 << 12) / this.field452;
        int var8 = this.field454 * var7 >> 12;
        return ~var8 < ~(arg2 - -arg1) && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(IBI)Z", line = 321)
    private final boolean method214(int arg0, byte arg1, int arg2) {
        ++field448;
        int var4 = (arg0 + arg2) * this.field458 >> 12;
        int var5 = class289.field4252[(1048369 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field458;
        int var7 = (var6 << 12) / this.field452;
        int var8 = this.field454 * var7 >> 12;
        if (arg1 >= -35) {
            this.field464 = -18;
        }
        return ~var8 < ~(-arg2 + arg0) && ~(-arg2 + arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)I", line = 339)
    public static final int method215(int arg0, int arg1) {
        ++field460;
        return arg1 != 427362568 ? 101 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "(I)V", line = 360)
    public static void method216(int arg0) {
        field465 = null;
        if (arg0 != -11340) {
            field455 = 12;
        }
        field457 = null;
    }
}
