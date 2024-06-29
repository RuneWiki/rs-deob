import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class138 extends class7 {

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    private int field2651 = 0;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    private int field2653 = 0;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "I")
    private int field2658 = 0;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "Lob;")
    private static class141 field2654 = class175.method1195(40, "Welcome to RuneScape");

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "Lob;")
    public static class141 field2660 = field2654;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "Z")
    public static boolean field2648 = false;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    public static volatile int field2656 = 0;

    @OriginalMember(owner = "client!ni", name = "jb", descriptor = "Lob;")
    private static class141 field2665 = class175.method1195(40, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "Lob;")
    public static class141 field2657 = class175.method1195(40, ":chalreq:");

    @OriginalMember(owner = "client!ni", name = "lb", descriptor = "Lob;")
    public static class141 field2667 = class175.method1195(40, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "Lob;")
    public static class141 field2652 = field2665;

    @OriginalMember(owner = "client!ni", name = "mb", descriptor = "Lob;")
    public static class141 field2668 = class175.method1195(40, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    private int field2649;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    private int field2655;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ni", name = "nb", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "client!ni", name = "ob", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
    private final void method886(int arg0, int arg1, int arg2, int arg3) {
        ++field2670;
        if (arg1 != -1) {
            this.method31(-88, 67, (class146) null);
        }
        int var5 = ~arg2 >= -2049 ? (arg3 + 4096) * arg2 >> 12 : arg2 + arg3 + -(arg2 * arg3 >> 12);
        if (var5 <= 0) {
            this.field2669 = this.field2649 = this.field2659 = arg2;
        } else {
            int var6 = arg2 - -arg2 + -var5;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg0 * 6;
            int var9 = var8 >> 12;
            int var10 = var8 - (var9 << 12);
            int var12 = var7 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field2669 = var5;
                                    this.field2649 = var6;
                                    this.field2659 = var15;
                                }
                            } else {
                                this.field2659 = var5;
                                this.field2669 = var14;
                                this.field2649 = var6;
                            }
                        } else {
                            this.field2669 = var6;
                            this.field2649 = var15;
                            this.field2659 = var5;
                        }
                    } else {
                        this.field2669 = var6;
                        this.field2649 = var5;
                        this.field2659 = var14;
                    }
                } else {
                    this.field2669 = var15;
                    this.field2649 = var5;
                    this.field2659 = var6;
                }
            } else {
                this.field2649 = var14;
                this.field2669 = var5;
                this.field2659 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field2666;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2658 = (arg2.method1000(1064893128) << 12) / 100;
                }
            } else {
                this.field2651 = (arg2.method1000(1064893128) << 12) / 100;
            }
        } else {
            this.field2653 = arg2.method992((byte) -67);
        }
        int var5 = -17 % ((66 - arg1) / 57);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIII)V")
    private final void method887(int arg0, int arg1, int arg2, int arg3) {
        ++field2663;
        int var5 = ~arg2 < ~arg3 ? arg2 : arg3;
        int var6 = ~arg1 >= ~var5 ? var5 : arg1;
        int var7 = ~arg3 >= ~arg2 ? arg3 : arg2;
        int var8 = ~arg1 > ~var7 ? arg1 : var7;
        this.field2655 = (var8 - -var6) / arg0;
        int var9 = -var8 + var6;
        if (~this.field2655 < -1 && ~this.field2655 > -4097) {
            this.field2662 = (var9 << 12) / (~this.field2655 >= -2049 ? this.field2655 * 2 : -(this.field2655 * 2) + 8192);
        } else {
            this.field2662 = 0;
        }
        if (~var9 >= -1) {
            this.field2647 = 0;
        } else {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (~arg2 != ~var6) {
                if (arg3 != var6) {
                    this.field2647 = ~arg2 != ~var8 ? -var10 + 20480 : var12 + 12288;
                } else {
                    this.field2647 = arg1 == var8 ? var10 + 4096 : -var11 + 12288;
                }
            } else {
                this.field2647 = arg3 == var8 ? var11 + 20480 : -var12 + 4096;
            }
            this.field2647 /= 6;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(III)Lah;")
    public static final class9 method888(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2933; ++var4) {
                class9 var5 = var3.field2935[var4];
                if ((var5.field141 >> 29 & 3L) == 2L && var5.field156 == arg1 && var5.field143 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2668 = null;
        field2654 = null;
        field2667 = null;
        field2665 = null;
        field2652 = null;
        if (arg0 != 0) {
            field2650 = 24;
        }
        field2657 = null;
        field2660 = null;
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "(I)V")
    public static final void method890(int arg0) {
        for (int var1 = -1; class184.field3587 > var1; ++var1) {
            int var6;
            if (~var1 != 0) {
                var6 = class188.field3647[var1];
            } else {
                var6 = 2047;
            }
            class38 var7 = class116.field2231[var6];
            if (var7 != null && ~var7.field3886 < -1) {
                --var7.field3886;
                if (~var7.field3886 == -1) {
                    var7.field3866 = null;
                }
            }
        }
        int var2 = 0;
        int var3 = 15 / ((-76 - arg0) / 33);
        while (~class195.field3738 < ~var2) {
            int var4 = class203.field3888[var2];
            class131 var5 = class10.field172[var4];
            if (var5 != null && var5.field3886 > 0) {
                --var5.field3886;
                if (var5.field3886 == 0) {
                    var5.field3866 = null;
                }
            }
            ++var2;
        }
        ++field2664;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int[][] var3 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var4 = this.method42(arg0, -12, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class117.field2272; ++var11) {
                this.method887(2, var7[var11], var5[var11], var6[var11]);
                this.field2662 += this.field2651;
                if (~this.field2662 > -1) {
                    this.field2662 = 0;
                }
                this.field2647 += this.field2653;
                this.field2655 += this.field2658;
                if (~this.field2662 < -4097) {
                    this.field2662 = 4096;
                }
                while (~this.field2647 > -1) {
                    this.field2647 += 4096;
                }
                while (~this.field2647 < -4097) {
                    this.field2647 -= 4096;
                }
                if (~this.field2655 > -1) {
                    this.field2655 = 0;
                }
                if (this.field2655 > 4096) {
                    this.field2655 = 4096;
                }
                this.method886(this.field2647, -1, this.field2655, this.field2662);
                var8[var11] = this.field2669;
                var10[var11] = this.field2649;
                var9[var11] = this.field2659;
            }
        }
        int var12 = 57 / ((-42 - arg1) / 41);
        ++field2661;
        return var3;
    }
}
