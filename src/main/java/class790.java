import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class790 extends class334 {

    @OriginalMember(owner = "client!tea", name = "K", descriptor = "I")
    private int field10800 = 1024;

    @OriginalMember(owner = "client!tea", name = "G", descriptor = "I")
    private int field10797 = 1024;

    @OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
    private int field10798 = 0;

    @OriginalMember(owner = "client!tea", name = "Q", descriptor = "I")
    private int field10806 = 204;

    @OriginalMember(owner = "client!tea", name = "V", descriptor = "I")
    private int field10811 = 409;

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "I")
    private int field10795 = 4;

    @OriginalMember(owner = "client!tea", name = "bb", descriptor = "I")
    private int field10817 = 81;

    @OriginalMember(owner = "client!tea", name = "W", descriptor = "I")
    private int field10812 = 8;

    @OriginalMember(owner = "client!tea", name = "M", descriptor = "Lsv;")
    public static class570 field10802 = new class570(60, 3);

    @OriginalMember(owner = "client!tea", name = "U", descriptor = "Lsv;")
    public static class570 field10810 = new class570(26, 15);

    @OriginalMember(owner = "client!tea", name = "cb", descriptor = "[I")
    public static int[] field10818 = new int[8];

    @OriginalMember(owner = "client!tea", name = "L", descriptor = "I")
    private int field10801;

    @OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
    public static int field10803;

    @OriginalMember(owner = "client!tea", name = "O", descriptor = "I")
    private int field10804;

    @OriginalMember(owner = "client!tea", name = "P", descriptor = "I")
    public static int field10805;

    @OriginalMember(owner = "client!tea", name = "R", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!tea", name = "S", descriptor = "I")
    public static int field10808;

    @OriginalMember(owner = "client!tea", name = "T", descriptor = "I")
    public static int field10809;

    @OriginalMember(owner = "client!tea", name = "X", descriptor = "I")
    public static int field10813;

    @OriginalMember(owner = "client!tea", name = "Z", descriptor = "I")
    public static int field10815;

    @OriginalMember(owner = "client!tea", name = "ab", descriptor = "I")
    private int field10816;

    @OriginalMember(owner = "client!tea", name = "Y", descriptor = "[I")
    private int[] field10814;

    @OriginalMember(owner = "client!tea", name = "F", descriptor = "[[I")
    private int[][] field10796;

    @OriginalMember(owner = "client!tea", name = "I", descriptor = "[[I")
    private int[][] field10799;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field10808;
        if (arg1) {
            this.method29(94, true, (class431) null);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field10800 = arg2.method2565((byte) -96);
                                    }
                                } else {
                                    this.field10817 = arg2.method2565((byte) -104);
                                }
                            } else {
                                this.field10798 = arg2.method2565((byte) -92);
                            }
                        } else {
                            this.field10797 = arg2.method2565((byte) -107);
                        }
                    } else {
                        this.field10806 = arg2.method2565((byte) -89);
                    }
                } else {
                    this.field10811 = arg2.method2565((byte) -107);
                }
            } else {
                this.field10812 = arg2.method2557(14929);
            }
        } else {
            this.field10795 = arg2.method2557(14929);
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V")
    public static void method4317(byte arg0) {
        field10802 = null;
        field10818 = null;
        field10810 = null;
        if (arg0 != 63) {
            field10810 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field10805;
        if (arg1 != -22563988) {
            this.field10797 = 72;
        }
        int[] var3 = super.field4743.method1027((byte) -95, arg0);
        if (super.field4743.field1993) {
            int var4 = 0;
            int var5;
            for (var5 = class527.field7361[arg0] + this.field10798; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field10812 > var4 && var5 >= this.field10814[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field10814[var4];
            int var9 = this.field10814[var4 - 1];
            if (var9 - -this.field10804 < var5 && -this.field10804 + var8 > var5) {
                for (int var10 = 0; ~var10 > ~class439.field6099; ++var10) {
                    int var11 = !var7 ? -this.field10797 : this.field10797;
                    int var12 = 0;
                    int var13;
                    for (var13 = class295.field4296[var10] - -(this.field10801 * var11 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field10795 < ~var12 && this.field10796[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field10796[var6][var12];
                    int var16 = this.field10796[var6][var14];
                    if (~var13 < ~(this.field10804 + var16) && -this.field10804 + var15 > var13) {
                        var3[var10] = this.field10799[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class171.method1264(var3, 0, class439.field6099, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(B)V")
    private final void method4318(byte arg0) {
        ++field10807;
        Random var2 = new Random((long) this.field10812);
        this.field10816 = 4096 / this.field10812;
        this.field10801 = 4096 / this.field10795;
        int var3 = 5 % ((arg0 - -39) / 38);
        this.field10804 = this.field10817 / 2;
        int var4 = this.field10801 / 2;
        this.field10799 = new int[this.field10812][this.field10795];
        this.field10814 = new int[this.field10812 + 1];
        this.field10796 = new int[this.field10812][this.field10795 - -1];
        int var5 = this.field10816 / 2;
        this.field10814[0] = 0;
        for (int var6 = 0; var6 < this.field10812; ++var6) {
            if (var6 > 0) {
                int var7 = this.field10816;
                int var8 = (class728.method4047(119, 4096, var2) - 2048) * this.field10806 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field10814[var6] = this.field10814[var6 + -1] + var9;
            }
            this.field10796[var6][0] = 0;
            for (int var10 = 0; this.field10795 > var10; ++var10) {
                if (var10 > 0) {
                    int var11 = this.field10801;
                    int var12 = (class728.method4047(116, 4096, var2) + -2048) * this.field10811 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field10796[var6][var10] = this.field10796[var6][var10 + -1] + var13;
                }
                this.field10799[var6][var10] = this.field10800 <= 0 ? 4096 : -class728.method4047(124, this.field10800, var2) + 4096;
            }
            this.field10796[var6][this.field10795] = 4096;
        }
        this.field10814[this.field10812] = 4096;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        this.method4318((byte) 39);
        if (arg0 < -27) {
            ++field10815;
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "()V")
    public class790() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZI)V")
    public static final void method4319(int arg0, boolean arg1, int arg2) {
        ++field10809;
        class371 var3 = class490.method2867((byte) -39, 13, (long) arg2);
        var3.method2212(-110);
        if (arg1) {
            field10803 = 66;
        }
        var3.field5233 = arg0;
    }
}
