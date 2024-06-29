import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class281 extends class224 {

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    private int field4455 = 2048;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private int field4446 = 2048;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    private int field4445 = 8192;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    private int field4451 = 0;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    private int field4453 = 4096;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    private int field4460 = 12288;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    private int field4449 = 0;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "[I")
    public static int[] field4459 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "Z")
    public static boolean field4456;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(Z)V")
    public static void method1877(boolean arg0) {
        field4459 = null;
        if (!arg0) {
            field4456 = true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field4447;
            int[] var3 = super.field3625.method1862(arg0, (byte) 52);
            if (super.field3625.field4425) {
                int var4 = class251.field4018[arg0] + -2048;
                for (int var5 = 0; ~class78.field1108 < ~var5; ++var5) {
                    int var6 = class243.field3893[var5] + -2048;
                    int var7 = this.field4449 + var4;
                    int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                    int var9 = this.field4446 + var6;
                    int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                    int var11 = var10 > 2048 ? var10 - 4096 : var10;
                    int var12 = var8 <= 2048 ? var8 : var8 - 4096;
                    int var13 = var6 - -this.field4451;
                    int var14 = this.field4455 + var4;
                    int var15 = ~var13 > 2047 ? var13 + 4096 : var13;
                    int var16 = ~var14 <= 2047 ? var14 : var14 + 4096;
                    int var17 = ~var16 < -2049 ? var16 + -4096 : var16;
                    int var18 = ~var15 < -2049 ? var15 + -4096 : var15;
                    var3[var5] = !this.method1880(var12, var11, (byte) -127) && !this.method1879(var18, var17, -113) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4445 = arg0.method190(-3);
                                }
                            } else {
                                this.field4453 = arg0.method190(-3);
                            }
                        } else {
                            this.field4460 = arg0.method190(-3);
                        }
                    } else {
                        this.field4455 = arg0.method190(-3);
                    }
                } else {
                    this.field4451 = arg0.method190(-3);
                }
            } else {
                this.field4449 = arg0.method190(-3);
            }
        } else {
            this.field4446 = arg0.method190(-3);
        }
        ++field4448;
        if (arg2 > -46) {
            method1881(85, 84, (class123) null, true);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII[B)Z")
    public static final boolean method1878(byte arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        class25 var5 = new class25(arg3);
        int var6 = -1;
        int var7 = 85 / ((33 - arg0) / 62);
        label56: while (true) {
            int var8 = var5.method209(-2073973340);
            if (var8 == 0) {
                ++field4454;
                return var4;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var5.method192((byte) -20);
                    if (~var12 == -1) {
                        continue label56;
                    }
                    var9 += var12 + -1;
                    int var13 = 63 & var9;
                    int var14 = var5.method201(255) >> 2;
                    int var15 = var9 >> 6 & 63;
                    int var16 = arg1 + var15;
                    int var17 = arg2 + var13;
                    if (var16 > 0 && ~var17 < -1 && ~var16 > -104 && var17 < 103) {
                        class181 var18 = class25.method224(var6, 0);
                        if (var14 != 22 || class143.field2098 || ~var18.field2827 != -1 || ~var18.field2834 == -2 || var18.field2837) {
                            if (!var18.method1258(90)) {
                                var4 = false;
                                ++class269.field4294;
                            }
                            var10 = true;
                        }
                    }
                }
                int var11 = var5.method192((byte) -20);
                if (var11 == 0) {
                    break;
                }
                var5.method201(255);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)Z")
    private final boolean method1879(int arg0, int arg1, int arg2) {
        ++field4457;
        int var4 = (arg0 + arg1) * this.field4460 >> 12;
        int var5 = class216.field3527[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4460;
        int var7 = (var6 << 12) / this.field4445;
        int var8 = -16 % ((arg2 - -45) / 55);
        int var9 = this.field4453 * var7 >> 12;
        return ~(arg1 - arg0) > ~var9 && ~(-arg0 + arg1) < ~(-var9);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIB)Z")
    private final boolean method1880(int arg0, int arg1, byte arg2) {
        ++field4452;
        int var4 = (arg0 - arg1) * this.field4460 >> 12;
        int var5 = class216.field3527[(1047267 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field4460;
        int var7 = (var6 << 12) / this.field4445;
        if (arg2 > -98) {
            method1881(35, 42, (class123) null, false);
        }
        int var8 = this.field4453 * var7 >> 12;
        return ~var8 < ~(arg1 - -arg0) && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILdl;Z)[Lhc;")
    public static final class229[] method1881(int arg0, int arg1, class123 arg2, boolean arg3) {
        ++field4458;
        if (arg3) {
            field4456 = true;
        }
        return !class214.method1445((byte) 109, arg2, arg0, arg1) ? null : class186.method1290(255);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 > -4) {
            this.field4460 = -111;
        }
        ++field4450;
        class189.method1329(21822);
    }
}
