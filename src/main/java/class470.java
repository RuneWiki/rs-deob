import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class470 extends class667 {

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    private int field6765 = 8192;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    private int field6768 = 2048;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    private int field6772 = 4096;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    private int field6767 = 2048;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    private int field6771 = 0;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    private int field6769 = 0;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    private int field6770 = 12288;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)Z")
    private final boolean method2851(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method2851(false, -19, 45);
        }
        ++field6764;
        int var4 = (arg1 + arg2) * this.field6770 >> 12;
        int var5 = class265.field3861[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field6770;
        int var7 = (var6 << 12) / this.field6765;
        int var8 = this.field6772 * var7 >> 12;
        return ~var8 < ~(-arg2 + arg1) && -var8 < -arg2 + arg1;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)Z")
    private final boolean method2852(int arg0, int arg1, int arg2) {
        ++field6773;
        int var4 = (-arg1 + arg0) * this.field6770 >> 12;
        int var5 = class265.field3861[(var4 * 255 & arg2) >> 12];
        int var6 = (var5 << 12) / this.field6770;
        int var7 = (var6 << 12) / this.field6765;
        int var8 = this.field6772 * var7 >> 12;
        return ~var8 < ~(arg1 - -arg0) && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        ++field6775;
        class458.method2798(true);
        if (arg0) {
            this.method116((class35) null, 6, -31);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIILjava/lang/Class;)Lbba;")
    public static final class113 method2853(int arg0, int arg1, int arg2, Class arg3) {
        class416 var4 = class390.field5454[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class217 var5 = var4.field5844; var5 != null; var5 = var5.field3091) {
                class113 var6 = var5.field3090;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field1814 == arg1 && var6.field1820 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class470() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field6766;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = class385.field5384[arg1] + -2048;
            for (int var5 = 0; class77.field1455 > var5; ++var5) {
                int var6 = class20.field261[var5] + -2048;
                int var7 = this.field6767 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = var4 - -this.field6769;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field6771 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field6768 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method2852(var12, var9, 1045850) && !this.method2851(false, var18, var15) ? 0 : 4096;
            }
        }
        if (arg0 >= -87) {
            this.field6767 = -51;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILdm;Ldm;)V")
    public static final void method2854(int arg0, class50 arg1, class50 arg2) {
        ++field6774;
        ++class28.field396;
        class135 var3 = class273.method1801(class459.field6629, class231.field3284, 2);
        var3.field2109.method233(arg1.field792, arg0 ^ 1438986666);
        var3.field2109.method223(1493807496, arg2.field807);
        var3.field2109.method223(1493807496, arg1.field861);
        var3.field2109.method238((byte) -71, arg2.field792);
        var3.field2109.method285(-128, arg1.field807);
        var3.field2109.method226((byte) 63, arg2.field861);
        if (arg0 == -1439001556) {
            class539.method3178(var3, -18925);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field6765 = arg0.method253(-13900);
                                }
                            } else {
                                this.field6772 = arg0.method253(-13900);
                            }
                        } else {
                            this.field6770 = arg0.method253(arg1 ^ -13897);
                        }
                    } else {
                        this.field6768 = arg0.method253(-13900);
                    }
                } else {
                    this.field6771 = arg0.method253(arg1 ^ -13897);
                }
            } else {
                this.field6769 = arg0.method253(-13900);
            }
        } else {
            this.field6767 = arg0.method253(-13900);
        }
        if (arg1 != 3) {
            this.method116((class35) null, -128, 89);
        }
        ++field6776;
    }
}
