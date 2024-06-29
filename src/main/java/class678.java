import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class678 extends class601 {

    @OriginalMember(owner = "client!wca", name = "P", descriptor = "I")
    private int field9472 = 0;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    private int field9464 = 0;

    @OriginalMember(owner = "client!wca", name = "I", descriptor = "I")
    private int field9465 = 0;

    @OriginalMember(owner = "client!wca", name = "M", descriptor = "I")
    public static int field9469 = 0;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    private int field9460;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
    private int field9461;

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
    private int field9466;

    @OriginalMember(owner = "client!wca", name = "K", descriptor = "I")
    private int field9467;

    @OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
    private int field9470;

    @OriginalMember(owner = "client!wca", name = "O", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!wca", name = "Q", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!wca", name = "R", descriptor = "I")
    private int field9474;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIBI)V", line = 4)
    private final void method3836(int arg0, int arg1, byte arg2, int arg3) {
        ++field9471;
        int var5 = arg0 <= arg1 ? arg1 : arg0;
        int var6 = ~arg1 >= ~arg0 ? arg1 : arg0;
        int var7 = ~var5 > ~arg3 ? arg3 : var5;
        int var8 = ~var6 < ~arg3 ? arg3 : var6;
        this.field9467 = (var8 - -var7) / 2;
        int var9 = -var8 + var7;
        if (arg2 >= -84) {
            this.method3837(-67, -28, (byte) 40, -81);
        }
        if (~var9 >= -1) {
            this.field9470 = 0;
        } else {
            int var10 = (-arg0 + var7 << 12) / var9;
            int var11 = (var7 - arg1 << 12) / var9;
            int var12 = (-arg3 + var7 << 12) / var9;
            if (~arg0 == ~var7) {
                this.field9470 = arg1 != var8 ? -var11 + 4096 : var12 + 20480;
            } else if (~arg1 == ~var7) {
                this.field9470 = ~arg3 != ~var8 ? 12288 - var12 : 4096 - -var10;
            } else {
                this.field9470 = arg0 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field9470 /= 6;
        }
        if (~this.field9467 < -1 && this.field9467 < 4096) {
            this.field9466 = (var9 << 12) / (this.field9467 <= 2048 ? this.field9467 * 2 : -(this.field9467 * 2) + 8192);
        } else {
            this.field9466 = 0;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(IIBI)V", line = 59)
    private final void method3837(int arg0, int arg1, byte arg2, int arg3) {
        ++field9473;
        int var5 = ~arg0 < -2049 ? arg0 + arg1 + -(arg0 * arg1 >> 12) : (4096 - -arg1) * arg0 >> 12;
        if (var5 <= 0) {
            this.field9474 = this.field9461 = this.field9460 = arg0;
        } else {
            int var6 = arg3 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field9460 = var15;
                                    this.field9474 = var5;
                                    this.field9461 = var7;
                                }
                            } else {
                                this.field9460 = var5;
                                this.field9474 = var14;
                                this.field9461 = var7;
                            }
                        } else {
                            this.field9460 = var5;
                            this.field9461 = var15;
                            this.field9474 = var7;
                        }
                    } else {
                        this.field9460 = var14;
                        this.field9474 = var7;
                        this.field9461 = var5;
                    }
                } else {
                    this.field9460 = var7;
                    this.field9474 = var15;
                    this.field9461 = var5;
                }
            } else {
                this.field9474 = var5;
                this.field9460 = var7;
                this.field9461 = var14;
            }
        }
        if (arg2 != -88) {
            this.method6((class677) null, (byte) -39, -92);
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V", line = 167)
    public class678() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lee;BI)V", line = 170)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field9465 = (arg0.method3811(122) << 12) / 100;
                }
            } else {
                this.field9464 = (arg0.method3811(86) << 12) / 100;
            }
        } else {
            this.field9472 = arg0.method3771((byte) -10);
        }
        if (arg1 == -61) {
            ++field9463;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(IZ)[[I", line = 222)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field9468;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (!arg1) {
            this.method3837(-7, 90, (byte) -34, 36);
        }
        if (super.field7890.field9769) {
            int[][] var4 = this.method3268(arg0, 0, 65535);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class171.field2624; ++var11) {
                this.method3836(var5[var11], var6[var11], (byte) -115, var7[var11]);
                this.field9470 += this.field9472;
                this.field9466 += this.field9464;
                this.field9467 += this.field9465;
                while (this.field9470 < 0) {
                    this.field9470 += 4096;
                }
                while (this.field9470 > 4096) {
                    this.field9470 -= 4096;
                }
                if (~this.field9466 > -1) {
                    this.field9466 = 0;
                }
                if (~this.field9466 < -4097) {
                    this.field9466 = 4096;
                }
                if (this.field9467 < 0) {
                    this.field9467 = 0;
                }
                if (~this.field9467 < -4097) {
                    this.field9467 = 4096;
                }
                this.method3837(this.field9467, this.field9466, (byte) -88, this.field9470);
                var8[var11] = this.field9474;
                var9[var11] = this.field9461;
                var10[var11] = this.field9460;
            }
        }
        return var3;
    }
}
