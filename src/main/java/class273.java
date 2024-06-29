import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class273 extends class34 {

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
    private int field3700 = 0;

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
    private int field3703 = 0;

    @OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
    private int field3706 = 0;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
    public static int field3691 = -1;

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "Lsn;")
    public static class205 field3707 = new class205(2, 7);

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
    private int field3701;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lsv;II)V", line = 4)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field3694;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3703 = (arg0.method1894(-2018) << 12) / 100;
                }
            } else {
                this.field3706 = (arg0.method1894(-2018) << 12) / 100;
            }
        } else {
            this.field3700 = arg0.method1847(18);
        }
        if (arg1 <= 16) {
            method1599(108);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lpf;B)I", line = 52)
    public static final int method1598(class487 arg0, byte arg1) {
        ++field3693;
        if (arg1 <= 47) {
            method1599(100);
        }
        int var2 = arg0.field7013;
        class495 var3 = arg0.method108(true);
        if (arg0.field247) {
            var2 = arg0.field7008;
        } else if (arg0.field186 != var3.field7176 && ~arg0.field186 != ~var3.field7202 && ~arg0.field186 != ~var3.field7172 && arg0.field186 != var3.field7173) {
            if (arg0.field186 == var3.field7206 || arg0.field186 == var3.field7186 || arg0.field186 == var3.field7190 || ~arg0.field186 == ~var3.field7165) {
                var2 = arg0.field7010;
            }
        } else {
            var2 = arg0.field7047;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 80)
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)[[I", line = 84)
    public final int[][] method66(byte arg0, int arg1) {
        ++field3705;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            return null;
        } else {
            if (super.field536.field726) {
                int[][] var4 = this.method254(0, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class383.field5502 < ~var11; ++var11) {
                    this.method1601(var7[var11], -425542484, var5[var11], var6[var11]);
                    this.field3695 += this.field3700;
                    this.field3702 += this.field3703;
                    this.field3701 += this.field3706;
                    while (~this.field3695 > -1) {
                        this.field3695 += 4096;
                    }
                    while (~this.field3695 < -4097) {
                        this.field3695 -= 4096;
                    }
                    if (~this.field3701 > -1) {
                        this.field3701 = 0;
                    }
                    if (~this.field3701 < -4097) {
                        this.field3701 = 4096;
                    }
                    if (~this.field3702 > -1) {
                        this.field3702 = 0;
                    }
                    if (this.field3702 > 4096) {
                        this.field3702 = 4096;
                    }
                    this.method1600(648100492, this.field3695, this.field3701, this.field3702);
                    var8[var11] = this.field3696;
                    var9[var11] = this.field3690;
                    var10[var11] = this.field3704;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V", line = 164)
    public static void method1599(int arg0) {
        if (arg0 != 1891076492) {
            method1598((class487) null, (byte) 80);
        }
        field3707 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V", line = 187)
    private final void method1600(int arg0, int arg1, int arg2, int arg3) {
        ++field3697;
        int var5 = ~arg3 >= -2049 ? (arg2 + 4096) * arg3 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        if (var5 <= 0) {
            this.field3696 = this.field3690 = this.field3704 = arg3;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg3 + arg3 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field3696 = var5;
                                    this.field3704 = var15;
                                    this.field3690 = var7;
                                }
                            } else {
                                this.field3690 = var7;
                                this.field3704 = var5;
                                this.field3696 = var14;
                            }
                        } else {
                            this.field3704 = var5;
                            this.field3690 = var15;
                            this.field3696 = var7;
                        }
                    } else {
                        this.field3690 = var5;
                        this.field3704 = var14;
                        this.field3696 = var7;
                    }
                } else {
                    this.field3690 = var5;
                    this.field3696 = var15;
                    this.field3704 = var7;
                }
            } else {
                this.field3704 = var7;
                this.field3696 = var5;
                this.field3690 = var14;
            }
        }
        if (arg0 != 648100492) {
            this.method66((byte) 38, 124);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIII)V", line = 296)
    private final void method1601(int arg0, int arg1, int arg2, int arg3) {
        ++field3698;
        int var5 = arg2 > arg3 ? arg2 : arg3;
        int var6 = var5 >= arg0 ? var5 : arg0;
        int var7 = ~arg2 <= ~arg3 ? arg3 : arg2;
        int var8 = ~var7 < ~arg0 ? arg0 : var7;
        int var9 = -var8 + var6;
        this.field3702 = (var6 + var8) / 2;
        if (var9 > 0) {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (arg2 != var6) {
                if (~arg3 != ~var6) {
                    this.field3695 = ~arg2 == ~var8 ? var11 + 12288 : 20480 - var10;
                } else {
                    this.field3695 = ~arg0 != ~var8 ? 12288 - var12 : var10 + 4096;
                }
            } else {
                this.field3695 = ~arg3 != ~var8 ? -var11 + 4096 : 20480 - -var12;
            }
            this.field3695 /= 6;
        } else {
            this.field3695 = 0;
        }
        if (arg1 == -425542484) {
            if (~this.field3702 < -1 && this.field3702 < 4096) {
                this.field3701 = (var9 << 12) / (~this.field3702 < -2049 ? -(this.field3702 * 2) + 8192 : this.field3702 * 2);
            } else {
                this.field3701 = 0;
            }
        }
    }
}
