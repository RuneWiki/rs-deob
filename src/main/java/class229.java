import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class229 extends class84 {

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    private int field3683 = 0;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    private int field3680 = 0;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    private int field3697 = 0;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Z")
    public static boolean field3678 = false;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field3691 = 0;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Lcc;")
    public static class216 field3685 = new class216(16);

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "[Ljava/lang/String;")
    public static String[] field3700 = new String[100];

    @OriginalMember(owner = "client!re", name = "nb", descriptor = "S")
    public static short field3702 = 32767;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "F")
    public static float field3689;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    private int field3679;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    private int field3684;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    private int field3692;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "Llc;")
    public static class86 field3696;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "(I)V")
    public static void method1632(int arg0) {
        field3685 = null;
        if (arg0 != -345149396) {
            method1633(-62, -105);
        }
        field3696 = null;
        field3700 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public static final int method1633(int arg0, int arg1) {
        if (arg0 < 29) {
            return -109;
        } else {
            ++field3693;
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 + -61440;
            int var4 = 40960 - -(arg1 * var3 >> 12);
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1211.method193((byte) 111, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -24, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class20.field221; ++var11) {
                this.method1634(var6[var11], (byte) -101, var10[var11], var5[var11]);
                this.field3682 += this.field3697;
                this.field3692 += this.field3683;
                if (~this.field3692 > -1) {
                    this.field3692 = 0;
                }
                if (~this.field3682 > -1) {
                    this.field3682 = 0;
                }
                if (~this.field3682 < -4097) {
                    this.field3682 = 4096;
                }
                if (~this.field3692 < -4097) {
                    this.field3692 = 4096;
                }
                for (this.field3684 += this.field3680; this.field3684 < 0; this.field3684 += 4096) {
                }
                while (this.field3684 > 4096) {
                    this.field3684 -= 4096;
                }
                this.method1635(4096, this.field3682, this.field3692, this.field3684);
                var8[var11] = this.field3686;
                var9[var11] = this.field3677;
                var7[var11] = this.field3679;
            }
        }
        if (arg1 != -18) {
            return null;
        } else {
            ++field3688;
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBII)V")
    private final void method1634(int arg0, byte arg1, int arg2, int arg3) {
        ++field3690;
        int var5 = ~arg3 < ~arg0 ? arg3 : arg0;
        int var6 = ~var5 <= ~arg2 ? var5 : arg2;
        int var7 = ~arg0 < ~arg3 ? arg3 : arg0;
        int var8 = var7 <= arg2 ? var7 : arg2;
        if (arg1 <= -89) {
            int var9 = -var8 + var6;
            this.field3682 = (var6 + var8) / 2;
            if (~this.field3682 < -1 && this.field3682 < 4096) {
                this.field3692 = (var9 << 12) / (~this.field3682 >= -2049 ? this.field3682 * 2 : 8192 - this.field3682 * 2);
            } else {
                this.field3692 = 0;
            }
            if (~var9 < -1) {
                int var10 = (-arg3 + var6 << 12) / var9;
                int var11 = (-arg0 + var6 << 12) / var9;
                int var12 = (var6 - arg2 << 12) / var9;
                if (~arg3 == ~var6) {
                    this.field3684 = arg0 != var8 ? -var11 + 4096 : var12 + 20480;
                } else if (~arg0 != ~var6) {
                    this.field3684 = arg3 == var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field3684 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
                }
                this.field3684 /= 6;
            } else {
                this.field3684 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
    private final void method1635(int arg0, int arg1, int arg2, int arg3) {
        ++field3699;
        int var5 = arg1 > 2048 ? arg1 + arg2 + -(arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
        if (arg0 != 4096) {
            method1632(115);
        }
        if (~var5 < -1) {
            int var6 = arg3 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var9 = (var5 - var7 << 12) / var5;
            int var10 = var6 >> 12;
            int var11 = -(var10 << 12) + var6;
            int var12 = var5 * var9 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 + var13;
            if (~var10 == -1) {
                this.field3686 = var5;
                this.field3679 = var7;
                this.field3677 = var15;
                return;
            }
            if (~var10 == -2) {
                this.field3677 = var5;
                this.field3686 = var14;
                this.field3679 = var7;
                return;
            }
            if (~var10 == -3) {
                this.field3679 = var15;
                this.field3677 = var5;
                this.field3686 = var7;
                return;
            }
            if (var10 == 3) {
                this.field3686 = var7;
                this.field3679 = var5;
                this.field3677 = var14;
                return;
            }
            if (var10 == 4) {
                this.field3679 = var5;
                this.field3677 = var7;
                this.field3686 = var15;
                return;
            }
            if (~var10 == -6) {
                this.field3686 = var5;
                this.field3679 = var14;
                this.field3677 = var7;
                return;
            }
        } else {
            this.field3686 = this.field3677 = this.field3679 = arg1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3697 = (arg0.method1092((byte) -62) << 12) / 100;
                }
            } else {
                this.field3683 = (arg0.method1092((byte) -62) << 12) / 100;
            }
        } else {
            this.field3680 = arg0.method1090(12107);
        }
        if (arg1 >= 87) {
            ++field3698;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLlc;)V")
    public static final void method1636(byte arg0, class86 arg1) {
        ++field3694;
        int var2 = 70 / ((arg0 - -3) / 45);
        class69.field1023 = arg1.method619(-1, "runes");
    }
}
