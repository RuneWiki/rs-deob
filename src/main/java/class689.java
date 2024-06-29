import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class689 extends class666 {

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
    private int field9724 = 0;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    private int field9721 = 12288;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
    private int field9720 = 8192;

    @OriginalMember(owner = "client!rw", name = "P", descriptor = "I")
    private int field9730 = 0;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "I")
    private int field9725 = 2048;

    @OriginalMember(owner = "client!rw", name = "S", descriptor = "I")
    private int field9733 = 4096;

    @OriginalMember(owner = "client!rw", name = "R", descriptor = "I")
    private int field9732 = 2048;

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
    public static int field9727 = 0;

    @OriginalMember(owner = "client!rw", name = "Q", descriptor = "I")
    public static int field9731 = 0;

    @OriginalMember(owner = "client!rw", name = "U", descriptor = "I")
    public static int field9735 = -1;

    @OriginalMember(owner = "client!rw", name = "T", descriptor = "Z")
    public static boolean field9734 = false;

    @OriginalMember(owner = "client!rw", name = "K", descriptor = "[C")
    public static char[] field9726 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!rw", name = "N", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!rw", name = "O", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!rw", name = "V", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!rw", name = "W", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!rw", name = "X", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "(III)Z", line = 4)
    private final boolean method3821(int arg0, int arg1, int arg2) {
        ++field9728;
        int var4 = (-arg2 + arg1) * this.field9721 >> 12;
        if (arg0 != 12386) {
            field9731 = -64;
        }
        int var5 = class277.field3512[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field9721;
        int var7 = (var6 << 12) / this.field9720;
        int var8 = this.field9733 * var7 >> 12;
        return ~var8 < ~(arg2 - -arg1) && ~(-var8) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lrt;I)V", line = 22)
    public static final void method3822(class208 arg0, int arg1) {
        ++field9737;
        if (arg1 != -11872) {
            field9735 = 40;
        }
        if (!class215.field2615) {
            arg0.method1519((byte) 121);
            --class145.field1625;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIB)Z", line = 42)
    private final boolean method3823(int arg0, int arg1, byte arg2) {
        ++field9723;
        int var4 = (arg0 + arg1) * this.field9721 >> 12;
        int var5 = class277.field3512[(1047093 & var4 * 255) >> 12];
        int var6 = 13 / ((33 - arg2) / 53);
        int var7 = (var5 << 12) / this.field9721;
        int var8 = (var7 << 12) / this.field9720;
        int var9 = this.field9733 * var8 >> 12;
        return ~(-arg0 + arg1) > ~var9 && ~(arg1 - arg0) < ~(-var9);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)V", line = 63)
    public static void method3824(boolean arg0) {
        if (!arg0) {
            method3824(false);
        }
        field9726 = null;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V", line = 76)
    public class689() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(IIB)V", line = 108)
    public static final void method3825(int arg0, int arg1, byte arg2) {
        ++field9729;
        if (arg2 != 5) {
            method3824(false);
        }
        if (class343.field4453 == class220.field2668) {
            if (!class671.method3764(1, 1, arg0, 0, 0, -2, arg1, false, (byte) -110)) {
                class671.method3764(1, 1, arg0, 0, 0, -3, arg1, false, (byte) -76);
            }
        } else if (!class671.method3764(1, 1, arg0, 0, 0, -3, arg1, false, (byte) -77)) {
            class671.method3764(1, 1, arg0, 0, 0, -2, arg1, false, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 144)
    public final void method118(int arg0) {
        if (arg0 != -9) {
            this.method121(19, (class452) null, false);
        }
        class636.method3561(true);
        ++field9736;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I", line = 156)
    public final int[] method122(int arg0, int arg1) {
        ++field9722;
        int[] var3 = super.field9466.method1811(arg1, 112);
        if (arg0 >= -21) {
            this.field9721 = 68;
        }
        if (super.field9466.field4172) {
            int var4 = class476.field6935[arg1] + -2048;
            for (int var5 = 0; var5 < class501.field7222; ++var5) {
                int var6 = class579.field8246[var5] + -2048;
                int var7 = this.field9732 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field9724 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                int var13 = this.field9730 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field9725 + var4;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = ~var17 < -2049 ? var17 - 4096 : var17;
                var3[var5] = !this.method3821(12386, var12, var9) && !this.method3823(var15, var18, (byte) -80) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILiaa;Z)V", line = 207)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field9733 = -53;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field9720 = arg1.method2574(-1758460248);
                                }
                            } else {
                                this.field9733 = arg1.method2574(-1758460248);
                            }
                        } else {
                            this.field9721 = arg1.method2574(-1758460248);
                        }
                    } else {
                        this.field9725 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field9730 = arg1.method2574(-1758460248);
                }
            } else {
                this.field9724 = arg1.method2574(-1758460248);
            }
        } else {
            this.field9732 = arg1.method2574(-1758460248);
        }
        ++field9738;
    }
}
