import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class367 extends class436 {

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    private int field5139 = 4096;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    private int field5144 = 2048;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    private int field5142 = 2048;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    private int field5140 = 12288;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    private int field5148 = 0;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    private int field5136 = 8192;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    private int field5150 = 0;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "Lbh;")
    public static class24 field5147 = new class24(5000);

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "Ljava/lang/String;")
    public static String field5151 = "Take";

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "Lqj;")
    public static class296 field5152;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
    public static final void method2354(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -4278) {
            method2356(-66);
        }
        ++field5143;
        if (~arg0 < ~arg4) {
            for (int var5 = arg4; arg0 > var5; ++var5) {
                class84.field1286[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; ++var6) {
                class84.field1286[var6][arg3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)Z")
    private final boolean method2355(int arg0, int arg1, int arg2) {
        ++field5141;
        int var4 = (-arg0 + arg2) * this.field5140 >> 12;
        int var5 = class288.field3991[(1045532 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5140;
        if (arg1 >= -51) {
            field5147 = null;
        }
        int var7 = (var6 << 12) / this.field5136;
        int var8 = this.field5139 * var7 >> 12;
        return arg0 - -arg2 < var8 && ~(arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field5138;
        int[] var3 = super.field6258.method2688((byte) -56, arg0);
        if (arg1 != 18338) {
            this.field5148 = 87;
        }
        if (super.field6258.field6138) {
            int var4 = class32.field499[arg0] + -2048;
            for (int var5 = 0; var5 < class43.field653; ++var5) {
                int var6 = class249.field3455[var5] + -2048;
                int var7 = this.field5142 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field5150 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 - -4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field5148;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field5144 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method2355(var9, -117, var12) && !this.method2357(var18, var15, 2047) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class367() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 == -14) {
            class105.method721(false);
            ++field5137;
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public static void method2356(int arg0) {
        field5151 = null;
        field5152 = null;
        if (arg0 == -2049) {
            field5147 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field5136 = arg2.method2403((byte) 64);
                                }
                            } else {
                                this.field5139 = arg2.method2403((byte) 73);
                            }
                        } else {
                            this.field5140 = arg2.method2403((byte) 82);
                        }
                    } else {
                        this.field5144 = arg2.method2403((byte) 116);
                    }
                } else {
                    this.field5148 = arg2.method2403((byte) 67);
                }
            } else {
                this.field5150 = arg2.method2403((byte) 44);
            }
        } else {
            this.field5142 = arg2.method2403((byte) 90);
        }
        if (arg0 != 34) {
            this.method44(51);
        }
        ++field5145;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(III)Z")
    private final boolean method2357(int arg0, int arg1, int arg2) {
        ++field5149;
        int var4 = (arg0 - -arg1) * this.field5140 >> 12;
        int var5 = class288.field3991[(1044807 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5140;
        if (arg2 != 2047) {
            this.method44(48);
        }
        int var7 = (var6 << 12) / this.field5136;
        int var8 = this.field5139 * var7 >> 12;
        return ~(-arg1 + arg0) > ~var8 && -var8 < arg0 - arg1;
    }
}
