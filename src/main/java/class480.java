import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class480 extends class278 {

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    private int field7010 = 0;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
    private int field7017 = 0;

    @OriginalMember(owner = "client!ar", name = "V", descriptor = "I")
    private int field7021 = 0;

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "Llg;")
    public static class284 field7018 = new class284(4, 5);

    @OriginalMember(owner = "client!ar", name = "Y", descriptor = "Ljm;")
    public static class485 field7024 = new class485(78, 16);

    @OriginalMember(owner = "client!ar", name = "Z", descriptor = "I")
    public static int field7025 = 0;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    private int field7011;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    private int field7012;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "I")
    private int field7015;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
    private int field7019;

    @OriginalMember(owner = "client!ar", name = "U", descriptor = "I")
    private int field7020;

    @OriginalMember(owner = "client!ar", name = "W", descriptor = "I")
    private int field7022;

    @OriginalMember(owner = "client!ar", name = "X", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V", line = 4)
    public static final void method2820(int arg0) {
        ++field7014;
        class506.method2978(class437.field6374.field4275, (byte) -75);
        int var1 = (class215.field3059 >> 3) + (class132.field1901 >> 10);
        class400.field5571 = class75.field1089.field464 = 0;
        int var2 = (class79.field1134 >> 3) + (class310.field4240 >> 10);
        class75.field1089.method1161(8, 8, 16383);
        byte var3 = 18;
        class292.field3916 = new int[var3];
        class499.field7346 = new byte[var3][];
        class477.field6982 = new int[var3];
        class13.field159 = new int[var3];
        class101.field1378 = new int[var3];
        class20.field215 = new byte[var3][];
        class207.field2938 = new byte[var3][];
        class414.field6080 = new int[var3];
        class514.field7546 = new int[var3][4];
        class245.field3417 = new byte[var3][];
        class234.field3249 = new int[var3];
        class274.field3721 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class442.field6435 >> 4)) / 8; var5 <= ((class442.field6435 >> 4) + var1) / 8; ++var5) {
            for (int var7 = (-(class232.field3217 >> 4) + var2) / 8; var7 <= ((class232.field3217 >> 4) + var2) / 8; ++var7) {
                int var8 = (var5 << 8) + var7;
                class101.field1378[var4] = var8;
                class477.field6982[var4] = class241.field3334.method1396("m" + var5 + "_" + var7, (byte) 71);
                class234.field3249[var4] = class241.field3334.method1396("l" + var5 + "_" + var7, (byte) 71);
                class13.field159[var4] = class241.field3334.method1396("n" + var5 + "_" + var7, (byte) 71);
                class414.field6080[var4] = class241.field3334.method1396("um" + var5 + "_" + var7, (byte) 71);
                class292.field3916[var4] = class241.field3334.method1396("ul" + var5 + "_" + var7, (byte) 71);
                if (~class13.field159[var4] == 0) {
                    class477.field6982[var4] = -1;
                    class234.field3249[var4] = -1;
                    class414.field6080[var4] = -1;
                    class292.field3916[var4] = -1;
                }
                ++var4;
            }
        }
        if (arg0 != -1) {
            method2821(64);
        }
        for (int var6 = var4; ~class13.field159.length < ~var6; ++var6) {
            class13.field159[var6] = -1;
            class477.field6982[var6] = -1;
            class234.field3249[var6] = -1;
            class414.field6080[var6] = -1;
            class292.field3916[var6] = -1;
        }
        class487.method2866(true, false, 28, var1, var2);
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V", line = 84)
    public static void method2821(int arg0) {
        if (arg0 != 543795146) {
            method2820(72);
        }
        field7024 = null;
        field7018 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V", line = 99)
    public class480() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIZ)V", line = 104)
    private final void method2822(int arg0, int arg1, int arg2, boolean arg3) {
        ++field7009;
        int var5 = ~arg2 < ~arg1 ? arg2 : arg1;
        int var6 = var5 < arg0 ? arg0 : var5;
        int var7 = ~arg2 <= ~arg1 ? arg1 : arg2;
        if (!arg3) {
            this.method2822(-17, -33, 17, true);
        }
        int var8 = ~var7 >= ~arg0 ? var7 : arg0;
        int var9 = var6 - var8;
        this.field7022 = (var6 + var8) / 2;
        if (this.field7022 > 0 && this.field7022 < 4096) {
            this.field7020 = (var9 << 12) / (~this.field7022 < -2049 ? -(this.field7022 * 2) + 8192 : this.field7022 * 2);
        } else {
            this.field7020 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (arg2 != var6) {
                if (arg1 != var6) {
                    this.field7019 = arg2 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field7019 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field7019 = ~arg1 == ~var8 ? 20480 - -var12 : -var11 + 4096;
            }
            this.field7019 /= 6;
        } else {
            this.field7019 = 0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIBI)V", line = 162)
    private final void method2823(int arg0, int arg1, byte arg2, int arg3) {
        ++field7016;
        if (arg2 != 48) {
            this.method2823(16, -52, (byte) 25, 37);
        }
        int var5 = arg0 > 2048 ? arg0 + arg3 + -(arg0 * arg3 >> 12) : (arg3 + 4096) * arg0 >> 12;
        if (~var5 < -1) {
            int var6 = arg1 * 6;
            int var7 = arg0 + arg0 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field7012 = var5;
                this.field7015 = var14;
                this.field7011 = var7;
                return;
            }
            if (~var9 == -2) {
                this.field7015 = var5;
                this.field7012 = var15;
                this.field7011 = var7;
                return;
            }
            if (~var9 == -3) {
                this.field7015 = var5;
                this.field7012 = var7;
                this.field7011 = var14;
                return;
            }
            if (var9 == 3) {
                this.field7012 = var7;
                this.field7015 = var15;
                this.field7011 = var5;
                return;
            }
            if (~var9 == -5) {
                this.field7011 = var5;
                this.field7015 = var7;
                this.field7012 = var14;
                return;
            }
            if (var9 == 5) {
                this.field7011 = var15;
                this.field7012 = var5;
                this.field7015 = var7;
                return;
            }
        } else {
            this.field7012 = this.field7015 = this.field7011 = arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)[[I", line = 272)
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 <= 75) {
            return null;
        } else {
            ++field7023;
            int[][] var3 = super.field3757.method1450(arg1, -1);
            if (super.field3757.field3420) {
                int[][] var4 = this.method1568(5426, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class507.field7456 < ~var11; ++var11) {
                    this.method2822(var7[var11], var6[var11], var5[var11], true);
                    this.field7020 += this.field7021;
                    this.field7022 += this.field7017;
                    for (this.field7019 += this.field7010; this.field7019 < 0; this.field7019 += 4096) {
                    }
                    if (this.field7020 < 0) {
                        this.field7020 = 0;
                    }
                    while (~this.field7019 < -4097) {
                        this.field7019 -= 4096;
                    }
                    if (~this.field7022 > -1) {
                        this.field7022 = 0;
                    }
                    if (this.field7020 > 4096) {
                        this.field7020 = 4096;
                    }
                    if (~this.field7022 < -4097) {
                        this.field7022 = 4096;
                    }
                    this.method2823(this.field7022, this.field7019, (byte) 48, this.field7020);
                    var8[var11] = this.field7012;
                    var9[var11] = this.field7015;
                    var10[var11] = this.field7011;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Llh;II)V", line = 350)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.method210((class365) null, -21, 85);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field7017 = (arg0.method2081((byte) 111) << 12) / 100;
                }
            } else {
                this.field7021 = (arg0.method2081((byte) -90) << 12) / 100;
            }
        } else {
            this.field7010 = arg0.method2069(-125);
        }
        ++field7013;
    }
}
