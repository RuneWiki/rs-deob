import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class405 extends class98 {

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    private int field5846 = 2048;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    private int field5849 = 12288;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    private int field5845 = 8192;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    private int field5853 = 0;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    private int field5842 = 4096;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    private int field5840 = 0;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    private int field5837 = 2048;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field5843 = 0;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "Ltq;")
    public static class376 field5847;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "[Lgj;")
    public static class381[] field5851;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2588(boolean arg0) {
        field5847 = null;
        if (arg0) {
            field5847 = null;
        }
        field5851 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)Lbg;", line = 16)
    public static final class271 method2589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 32412) {
            method2589(-24, -6, -85, 14, 67);
        }
        ++field5850;
        class280[] var5 = null;
        class380 var6 = class29.method196(arg3, -71);
        if (var6.field5350 != null) {
            var5 = new class280[var6.field5350.length];
            for (int var7 = 0; ~var7 > ~var5.length; ++var7) {
                class225 var8 = class109.method693(-24896, var6.field5350[var7]);
                var5[var7] = new class280(var8.field3149, var8.field3145, var8.field3148, var8.field3146, var8.field3162, var8.field3158, var8.field3150, var8.field3156);
            }
        }
        return new class271(var6.field5342, var5, var6.field5343, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lqr;I)V", line = 48)
    public static final void method2590(class40 arg0, int arg1) {
        ++field5848;
        class435 var2 = (class435) class11.field150.method1888((long) arg0.field5620, (byte) -30);
        if (var2 != null) {
            if (var2.field6263 != null) {
                class399.field5694.method1137(var2.field6263);
                var2.field6263 = null;
            }
            var2.method2594((byte) -22);
        }
        if (arg1 != -3) {
            method2590((class40) null, -20);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I", line = 77)
    public final int[] method83(int arg0, int arg1) {
        ++field5839;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            method2589(-24, -5, 49, -98, -14);
        }
        if (super.field1177.field1610) {
            int var4 = class163.field2285[arg1] - 2048;
            for (int var5 = 0; class268.field3811 > var5; ++var5) {
                int var6 = class189.field2722[var5] + -2048;
                int var7 = var6 - -this.field5846;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field5853 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var13 = this.field5840 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field5837 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method2591(var12, (byte) -89, var9) && !this.method2592(var18, var15, (byte) 125) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILdg;I)V", line = 128)
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            this.method2591(118, (byte) 61, -69);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field5845 = arg1.method1617((byte) 48);
                                }
                            } else {
                                this.field5842 = arg1.method1617((byte) 48);
                            }
                        } else {
                            this.field5849 = arg1.method1617((byte) 48);
                        }
                    } else {
                        this.field5837 = arg1.method1617((byte) 48);
                    }
                } else {
                    this.field5840 = arg1.method1617((byte) 48);
                }
            } else {
                this.field5853 = arg1.method1617((byte) 48);
            }
        } else {
            this.field5846 = arg1.method1617((byte) 48);
        }
        ++field5838;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(IBI)Z", line = 206)
    private final boolean method2591(int arg0, byte arg1, int arg2) {
        ++field5841;
        int var4 = (-arg2 + arg0) * this.field5849 >> 12;
        int var5 = class247.field3531[(var4 * 255 & 1044516) >> 12];
        int var6 = (var5 << 12) / this.field5849;
        int var7 = -91 % ((arg1 - 18) / 58);
        int var8 = (var6 << 12) / this.field5845;
        int var9 = this.field5842 * var8 >> 12;
        return arg0 + arg2 < var9 && ~(arg0 + arg2) < ~(-var9);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 251)
    public class405() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 240)
    public final void method188(int arg0) {
        ++field5852;
        class55.method315((byte) 42);
        if (arg0 != 1) {
            this.field5837 = 43;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)Z", line = 257)
    private final boolean method2592(int arg0, int arg1, byte arg2) {
        ++field5844;
        int var4 = (arg0 - -arg1) * this.field5849 >> 12;
        int var5 = class247.field3531[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field5849;
        int var7 = (var6 << 12) / this.field5845;
        if (arg2 < 56) {
            return false;
        } else {
            int var8 = this.field5842 * var7 >> 12;
            return ~(-arg1 + arg0) > ~var8 && -arg1 + arg0 > -var8;
        }
    }
}
