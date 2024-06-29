import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class340 extends class349 {

    @OriginalMember(owner = "client!mfa", name = "N", descriptor = "I")
    private int field4978 = 0;

    @OriginalMember(owner = "client!mfa", name = "K", descriptor = "I")
    private int field4975 = 0;

    @OriginalMember(owner = "client!mfa", name = "J", descriptor = "I")
    private int field4974 = 0;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
    private int field4969;

    @OriginalMember(owner = "client!mfa", name = "F", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!mfa", name = "G", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!mfa", name = "H", descriptor = "I")
    private int field4972;

    @OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
    private int field4973;

    @OriginalMember(owner = "client!mfa", name = "L", descriptor = "I")
    private int field4976;

    @OriginalMember(owner = "client!mfa", name = "M", descriptor = "I")
    private int field4977;

    @OriginalMember(owner = "client!mfa", name = "O", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!mfa", name = "D", descriptor = "Lcr;")
    public static class112 field4968;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)V", line = 3)
    private final void method2158(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 23451) {
            field4968 = null;
        }
        ++field4966;
        int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : -(arg1 * arg3 >> 12) + arg1 - -arg3;
        if (~var5 < -1) {
            int var6 = arg2 * 6;
            int var7 = arg1 - (-arg1 + var5);
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field4976 = var7;
                this.field4967 = var5;
                this.field4973 = var14;
                return;
            }
            if (var9 == 1) {
                this.field4976 = var7;
                this.field4967 = var15;
                this.field4973 = var5;
                return;
            }
            if (~var9 == -3) {
                this.field4973 = var5;
                this.field4976 = var14;
                this.field4967 = var7;
                return;
            }
            if (~var9 == -4) {
                this.field4967 = var7;
                this.field4976 = var5;
                this.field4973 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field4967 = var14;
                this.field4976 = var5;
                this.field4973 = var7;
                return;
            }
            if (~var9 == -6) {
                this.field4976 = var15;
                this.field4967 = var5;
                this.field4973 = var7;
                return;
            }
        } else {
            this.field4967 = this.field4973 = this.field4976 = arg1;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IB)[[I", line = 119)
    public final int[][] method9(int arg0, byte arg1) {
        ++field4970;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = 72 % ((-32 - arg1) / 47);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 65, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class39.field497; ++var12) {
                this.method2159(12288, var6[var12], var8[var12], var7[var12]);
                this.field4977 += this.field4974;
                this.field4969 += this.field4975;
                this.field4972 += this.field4978;
                while (~this.field4977 > -1) {
                    this.field4977 += 4096;
                }
                while (~this.field4977 < -4097) {
                    this.field4977 -= 4096;
                }
                if (this.field4972 < 0) {
                    this.field4972 = 0;
                }
                if (~this.field4972 < -4097) {
                    this.field4972 = 4096;
                }
                if (~this.field4969 > -1) {
                    this.field4969 = 0;
                }
                if (~this.field4969 < -4097) {
                    this.field4969 = 4096;
                }
                this.method2158(23451, this.field4969, this.field4977, this.field4972);
                var9[var12] = this.field4967;
                var10[var12] = this.field4973;
                var11[var12] = this.field4976;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(IIII)V", line = 190)
    private final void method2159(int arg0, int arg1, int arg2, int arg3) {
        ++field4971;
        int var5 = arg1 <= arg3 ? arg3 : arg1;
        int var6 = arg3 > arg1 ? arg1 : arg3;
        if (arg0 != 12288) {
            this.field4975 = -64;
        }
        int var7 = ~arg2 >= ~var5 ? var5 : arg2;
        int var8 = ~arg2 > ~var6 ? arg2 : var6;
        this.field4969 = (var8 - -var7) / 2;
        int var9 = var7 - var8;
        if (var9 > 0) {
            int var10 = (-arg1 + var7 << 12) / var9;
            int var11 = (-arg3 + var7 << 12) / var9;
            int var12 = (var7 - arg2 << 12) / var9;
            if (arg1 == var7) {
                this.field4977 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg3 != ~var7) {
                this.field4977 = arg1 == var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field4977 = arg2 == var8 ? 4096 - -var10 : -var12 + 12288;
            }
            this.field4977 /= 6;
        } else {
            this.field4977 = 0;
        }
        if (this.field4969 > 0 && ~this.field4969 > -4097) {
            this.field4972 = (var9 << 12) / (this.field4969 > 2048 ? 8192 - this.field4969 * 2 : this.field4969 * 2);
        } else {
            this.field4972 = 0;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V", line = 245)
    public class340() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILdga;)V", line = 254)
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field4979;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4975 = (arg2.method950(false) << 12) / 100;
                }
            } else {
                this.field4978 = (arg2.method950(false) << 12) / 100;
            }
        } else {
            this.field4974 = arg2.method924(arg0 ^ 4093);
        }
        if (arg0 != 4095) {
            this.field4977 = -73;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)V", line = 300)
    public static void method2160(int arg0) {
        field4968 = null;
        int var1 = -14 % ((arg0 - 49) / 60);
    }
}
