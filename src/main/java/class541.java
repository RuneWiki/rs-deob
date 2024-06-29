import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class541 extends class529 {

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field7616 = 0;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    private int field7627 = 0;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    private int field7622 = 0;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field7619 = 0;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
    public static boolean field7612 = false;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Lus;")
    public static class328 field7626 = new class328(53, -1);

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    private int field7609;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    private int field7611;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field7615;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field7618;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    private int field7628;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Ldf;")
    public static class348 field7620;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "Lkha;")
    public static class687 field7613;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field7625;
        if (arg1 <= 45) {
            this.method3080(14, -95, 77, (byte) -57);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field7627 = (arg2.method1133(8) << 12) / 100;
                }
            } else {
                this.field7616 = (arg2.method1133(8) << 12) / 100;
            }
        } else {
            this.field7622 = arg2.method1137((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIZIILufa;)Z")
    public static final boolean method3077(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class152 arg6) {
        ++field7621;
        if (class182.field2387 && class379.field5297) {
            if (~class540.field7599 > -101) {
                return false;
            } else if (~arg2 == ~arg4 && ~arg0 == ~arg1) {
                if (!class432.method2572(arg5, arg2, 1, arg1)) {
                    return false;
                } else if (class485.method2830(99, arg6)) {
                    ++class15.field208;
                    return true;
                } else {
                    return false;
                }
            } else {
                if (!arg3) {
                    method3077(-57, 14, -13, true, 47, 19, (class152) null);
                }
                for (int var7 = arg2; ~arg4 <= ~var7; ++var7) {
                    for (int var8 = arg1; ~var8 >= ~arg0; ++var8) {
                        if (~class468.field6737[arg5][var7][var8] == ~(-class587.field8208)) {
                            return false;
                        }
                    }
                }
                if (!class485.method2830(119, arg6)) {
                    return false;
                } else {
                    ++class15.field208;
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)V")
    public static void method3078(byte arg0) {
        field7626 = null;
        field7613 = null;
        int var1 = 37 / ((-66 - arg0) / 48);
        field7620 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3079(int arg0, long arg1) {
        ++field7617;
        if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = arg0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class77.field1025[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIB)V")
    private final void method3080(int arg0, int arg1, int arg2, byte arg3) {
        ++field7623;
        int var5 = ~arg2 > ~arg1 ? arg1 : arg2;
        int var6 = var5 >= arg0 ? var5 : arg0;
        int var7 = ~arg2 >= ~arg1 ? arg2 : arg1;
        int var8 = ~arg0 > ~var7 ? arg0 : var7;
        if (arg3 <= 47) {
            method3077(105, 118, 65, false, -71, -126, (class152) null);
        }
        int var9 = -var8 + var6;
        this.field7618 = (var8 - -var6) / 2;
        if (var9 <= 0) {
            this.field7615 = 0;
        } else {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (arg1 != var6) {
                if (arg2 != var6) {
                    this.field7615 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field7615 = arg0 == var8 ? 4096 - -var10 : 12288 - var12;
                }
            } else {
                this.field7615 = ~arg2 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field7615 /= 6;
        }
        if (this.field7618 > 0 && this.field7618 < 4096) {
            this.field7609 = (var9 << 12) / (this.field7618 > 2048 ? -(this.field7618 * 2) + 8192 : this.field7618 * 2);
        } else {
            this.field7609 = 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        ++field7624;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int[][] var4 = this.method3026(0, arg0, arg1 + 18462);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class304.field3909; ++var11) {
                this.method3080(var7[var11], var5[var11], var6[var11], (byte) 121);
                this.field7618 += this.field7627;
                this.field7609 += this.field7616;
                for (this.field7615 += this.field7622; ~this.field7615 > -1; this.field7615 += 4096) {
                }
                while (this.field7615 > 4096) {
                    this.field7615 -= 4096;
                }
                if (this.field7609 < 0) {
                    this.field7609 = 0;
                }
                if (~this.field7618 > -1) {
                    this.field7618 = 0;
                }
                if (~this.field7609 < -4097) {
                    this.field7609 = 4096;
                }
                if (~this.field7618 < -4097) {
                    this.field7618 = 4096;
                }
                this.method3082(this.field7615, this.field7618, false, this.field7609);
                var8[var11] = this.field7610;
                var9[var11] = this.field7611;
                var10[var11] = this.field7628;
            }
        }
        if (arg1 != 2) {
            this.method190(-118, (byte) -111, (class179) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class541() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static final void method3081(int arg0) {
        class508.field7188.method1217(118);
        ++field7614;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class601.field8358[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class650.field8934[var2] = 0L;
        }
        if (arg0 <= -41) {
            class331.field4198 = 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZI)V")
    private final void method3082(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7629;
        if (arg2) {
            this.method190(-67, (byte) -30, (class179) null);
        }
        int var5 = arg1 > 2048 ? arg1 - ((arg1 * arg3 >> 12) + -arg3) : (arg3 + 4096) * arg1 >> 12;
        if (var5 > 0) {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg1 + arg1;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 == -1) {
                this.field7628 = var7;
                this.field7611 = var14;
                this.field7610 = var5;
                return;
            }
            if (~var9 == -2) {
                this.field7628 = var7;
                this.field7610 = var15;
                this.field7611 = var5;
                return;
            }
            if (var9 == 2) {
                this.field7610 = var7;
                this.field7628 = var14;
                this.field7611 = var5;
                return;
            }
            if (~var9 == -4) {
                this.field7628 = var5;
                this.field7610 = var7;
                this.field7611 = var15;
                return;
            }
            if (var9 == 4) {
                this.field7628 = var5;
                this.field7611 = var7;
                this.field7610 = var14;
                return;
            }
            if (var9 == 5) {
                this.field7628 = var15;
                this.field7611 = var7;
                this.field7610 = var5;
                return;
            }
        } else {
            this.field7610 = this.field7611 = this.field7628 = arg1;
        }
    }
}
