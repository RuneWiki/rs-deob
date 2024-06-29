import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class370 extends class377 {

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    private int field4771 = 0;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private int field4773 = 2048;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    private int field4778 = 12288;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    private int field4780 = 4096;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    private int field4770 = 8192;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    private int field4777 = 0;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    private int field4779 = 2048;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lhd;")
    public static class694 field4774 = new class694(64);

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "[I")
    public static int[] field4784 = new int[13];

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "[Led;")
    public static class660[] field4785;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -7 % ((13 - arg1) / 55);
        ++field4772;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field4770 = arg2.method3031(-1);
                                }
                            } else {
                                this.field4780 = arg2.method3031(-1);
                            }
                        } else {
                            this.field4778 = arg2.method3031(-1);
                        }
                    } else {
                        this.field4773 = arg2.method3031(-1);
                    }
                } else {
                    this.field4777 = arg2.method3031(-1);
                }
            } else {
                this.field4771 = arg2.method3031(-1);
            }
        } else {
            this.field4779 = arg2.method3031(-1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class370() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
    public static void method2148(int arg0) {
        field4784 = null;
        field4785 = null;
        field4774 = null;
        if (arg0 != -23814) {
            field4774 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)Z")
    private final boolean method2149(byte arg0, int arg1, int arg2) {
        ++field4775;
        int var4 = (arg1 - -arg2) * this.field4778 >> 12;
        int var5 = class618.field8383[(1047150 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field4778;
        int var7 = (var6 << 12) / this.field4770;
        int var8 = this.field4780 * var7 >> 12;
        if (arg0 != -123) {
            return true;
        } else {
            return var8 > -arg2 + arg1 && ~(-var8) > ~(-arg2 + arg1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)Z")
    private final boolean method2150(int arg0, int arg1, int arg2) {
        ++field4781;
        int var4 = (-arg0 + arg1) * this.field4778 >> 12;
        int var5 = class618.field8383[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field4778;
        int var7 = (var6 << 12) / this.field4770;
        if (arg2 != 953241868) {
            return false;
        } else {
            int var8 = this.field4780 * var7 >> 12;
            return ~var8 < ~(arg0 + arg1) && ~(-var8) > ~(arg0 + arg1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        class430.method2367(-10177);
        if (arg0 <= 52) {
            this.field4779 = -13;
        }
        ++field4776;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field4769;
        int[] var3 = super.field4842.method2772(arg0, (byte) -111);
        int var4 = 121 % ((5 - arg1) / 53);
        if (super.field4842.field6354) {
            int var5 = class596.field8003[arg0] - 2048;
            for (int var6 = 0; ~var6 > ~class528.field6661; ++var6) {
                int var7 = class136.field1654[var6] + -2048;
                int var8 = var7 - -this.field4779;
                int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var5 - -this.field4771;
                int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var13 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var14 = this.field4777 + var7;
                int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                int var16 = ~var15 < -2049 ? var15 - 4096 : var15;
                int var17 = this.field4773 + var5;
                int var18 = var17 < -2048 ? var17 + 4096 : var17;
                int var19 = ~var18 >= -2049 ? var18 : var18 + -4096;
                var3[var6] = !this.method2150(var10, var13, 953241868) && !this.method2149((byte) -123, var19, var16) ? 0 : 4096;
            }
        }
        return var3;
    }
}
