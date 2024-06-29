import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class184 extends class185 {

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    private int field2786 = 2048;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field2781 = 0;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    private int field2783 = 2048;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field2782 = 8192;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    private int field2788 = 0;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    private int field2790 = 12288;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    private int field2789 = 4096;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public static int field2791 = 0;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "Lfj;")
    public static class258 field2796;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[Lvi;")
    public static class196[] field2779;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1142(int arg0, int arg1, boolean arg2) {
        ++field2792;
        int var4 = (-arg0 + arg1) * this.field2790 >> 12;
        if (arg2) {
            return true;
        } else {
            int var5 = class175.field2661[(var4 * 255 & 1045769) >> 12];
            int var6 = (var5 << 12) / this.field2790;
            int var7 = (var6 << 12) / this.field2782;
            int var8 = this.field2789 * var7 >> 12;
            return var8 > arg0 + arg1 && -var8 < arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        ++field2787;
        class82.method546(-13376);
        if (arg0 != -9) {
            this.method1142(24, 59, true);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field2784;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int var4 = class85.field1356[arg0] + -2048;
            for (int var5 = 0; ~class174.field2648 < ~var5; ++var5) {
                int var6 = class153.field2304[var5] - 2048;
                int var7 = this.field2783 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field2781 + var4;
                int var11 = this.field2786 + var4;
                int var12 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var13 = ~var11 > 2047 ? var11 + 4096 : var11;
                int var14 = var13 > 2048 ? var13 - 4096 : var13;
                int var15 = var6 - -this.field2788;
                int var16 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var17 = var15 < -2048 ? var15 + 4096 : var15;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method1142(var9, var16, false) && !this.method1144(var18, (byte) 97, var14) ? 0 : 4096;
            }
        }
        if (arg1 < 70) {
            field2785 = -68;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            method1143(85);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2782 = arg1.method1575(false);
                                }
                            } else {
                                this.field2789 = arg1.method1575(false);
                            }
                        } else {
                            this.field2790 = arg1.method1575(false);
                        }
                    } else {
                        this.field2786 = arg1.method1575(false);
                    }
                } else {
                    this.field2788 = arg1.method1575(false);
                }
            } else {
                this.field2781 = arg1.method1575(false);
            }
        } else {
            this.field2783 = arg1.method1575(false);
        }
        ++field2795;
    }

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2796 = null;
        if (arg0 != 24162252) {
            method1143(58);
        }
        field2779 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IBI)Z")
    private final boolean method1144(int arg0, byte arg1, int arg2) {
        ++field2778;
        if (arg1 != 97) {
            this.method1142(-112, -101, true);
        }
        int var4 = (arg0 + arg2) * this.field2790 >> 12;
        int var5 = class175.field2661[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2790;
        int var7 = (var6 << 12) / this.field2782;
        int var8 = this.field2789 * var7 >> 12;
        return var8 > -arg0 + arg2 && -var8 < arg2 - arg0;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
    public static final void method1145(byte arg0) {
        ++field2780;
        if (arg0 == -109) {
            class146.field2133.method1775(27147);
        }
    }
}
