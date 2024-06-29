import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class282 extends class4 {

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    private int field3688 = 0;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    private int field3687 = 0;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    private int field3696 = 0;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field3694 = new String[100];

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field3697 = 64;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    private int field3683;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    private int field3689;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field3694 = null;
        if (arg0 != -1) {
            field3697 = -116;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V")
    private final void method1758(int arg0, int arg1, int arg2, int arg3) {
        ++field3692;
        int var5 = arg1 > 2048 ? arg1 - ((arg0 * arg1 >> 12) + -arg0) : (arg0 + 4096) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg1 + arg1;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field3689 = var15;
                                    this.field3685 = var5;
                                    this.field3690 = var7;
                                }
                            } else {
                                this.field3689 = var5;
                                this.field3690 = var7;
                                this.field3685 = var14;
                            }
                        } else {
                            this.field3685 = var7;
                            this.field3690 = var15;
                            this.field3689 = var5;
                        }
                    } else {
                        this.field3685 = var7;
                        this.field3689 = var14;
                        this.field3690 = var5;
                    }
                } else {
                    this.field3689 = var7;
                    this.field3685 = var15;
                    this.field3690 = var5;
                }
            } else {
                this.field3689 = var7;
                this.field3685 = var5;
                this.field3690 = var14;
            }
        } else {
            this.field3685 = this.field3690 = this.field3689 = arg1;
        }
        if (arg3 < 44) {
            this.method1758(-23, -120, 83, 72);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 > -89) {
            this.field3688 = 80;
        }
        ++field3686;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3687 = (arg1.method3051((byte) 105) << 12) / 100;
                }
            } else {
                this.field3696 = (arg1.method3051((byte) 105) << 12) / 100;
            }
        } else {
            this.field3688 = arg1.method3087(true);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V")
    public static final void method1759(long arg0, byte arg1) {
        class272.field3457.field7707 = 0;
        ++field3684;
        class272.field3457.method3060(class17.field191.field3141, -25098);
        class272.field3457.method3049(false, arg0);
        class272.field3457.method3060(class245.field3103, -25098);
        class245.field3098 = 1;
        if (arg1 >= -93) {
            method1759(95L, (byte) -114);
        }
        class192.field2503 = -3;
        class552.field7731 = 0;
        class250.field3136 = 0;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BIII)V")
    private final void method1760(byte arg0, int arg1, int arg2, int arg3) {
        ++field3699;
        int var5 = arg1 < arg3 ? arg3 : arg1;
        int var6 = ~arg3 > ~arg1 ? arg3 : arg1;
        if (arg0 < -121) {
            int var7 = var5 < arg2 ? arg2 : var5;
            int var8 = ~var6 < ~arg2 ? arg2 : var6;
            this.field3698 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (~var9 >= -1) {
                this.field3683 = 0;
            } else {
                int var10 = (-arg3 + var7 << 12) / var9;
                int var11 = (-arg1 + var7 << 12) / var9;
                int var12 = (var7 - arg2 << 12) / var9;
                if (~arg3 != ~var7) {
                    if (~arg1 != ~var7) {
                        this.field3683 = arg3 == var8 ? 12288 - -var11 : -var10 + 20480;
                    } else {
                        this.field3683 = ~arg2 != ~var8 ? -var12 + 12288 : var10 + 4096;
                    }
                } else {
                    this.field3683 = ~arg1 == ~var8 ? var12 + 20480 : -var11 + 4096;
                }
                this.field3683 /= 6;
            }
            if (this.field3698 > 0 && this.field3698 < 4096) {
                this.field3691 = (var9 << 12) / (~this.field3698 < -2049 ? -(this.field3698 * 2) + 8192 : this.field3698 * 2);
            } else {
                this.field3691 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field3695;
        if (arg1 >= -83) {
            return null;
        } else {
            int[][] var3 = super.field38.method3021((byte) 89, arg0);
            if (super.field38.field7618) {
                int[][] var4 = this.method22(arg0, (byte) -86, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class132.field1627 < ~var11; ++var11) {
                    this.method1760((byte) -124, var6[var11], var7[var11], var5[var11]);
                    this.field3691 += this.field3696;
                    this.field3698 += this.field3687;
                    for (this.field3683 += this.field3688; this.field3683 < 0; this.field3683 += 4096) {
                    }
                    if (~this.field3691 > -1) {
                        this.field3691 = 0;
                    }
                    while (~this.field3683 < -4097) {
                        this.field3683 -= 4096;
                    }
                    if (~this.field3691 < -4097) {
                        this.field3691 = 4096;
                    }
                    if (this.field3698 < 0) {
                        this.field3698 = 0;
                    }
                    if (~this.field3698 < -4097) {
                        this.field3698 = 4096;
                    }
                    this.method1758(this.field3691, this.field3698, this.field3683, 56);
                    var8[var11] = this.field3685;
                    var9[var11] = this.field3690;
                    var10[var11] = this.field3689;
                }
            }
            return var3;
        }
    }
}
