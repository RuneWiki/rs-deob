import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class321 extends class334 {

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "I")
    private int field4562 = 2048;

    @OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
    private int field4559 = 0;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
    private int field4561 = 12288;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "I")
    private int field4563 = 8192;

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "I")
    private int field4564 = 4096;

    @OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
    private int field4569 = 2048;

    @OriginalMember(owner = "client!uca", name = "R", descriptor = "I")
    private int field4571 = 0;

    @OriginalMember(owner = "client!uca", name = "F", descriptor = "[Ltm;")
    public static class618[] field4560 = new class618[128];

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!uca", name = "Q", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!uca", name = "S", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!uca", name = "T", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!uca", name = "N", descriptor = "Lha;")
    public static class475 field4568;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(III)Z")
    private final boolean method1943(int arg0, int arg1, int arg2) {
        ++field4567;
        if (arg0 < 77) {
            this.method27((byte) -78);
        }
        int var4 = (arg1 + arg2) * this.field4561 >> 12;
        int var5 = class615.field8725[(var4 * 255 & 1047243) >> 12];
        int var6 = (var5 << 12) / this.field4561;
        int var7 = (var6 << 12) / this.field4563;
        int var8 = this.field4564 * var7 >> 12;
        return ~var8 < ~(-arg2 + arg1) && -var8 < -arg2 + arg1;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        class177.method1292(0);
        ++field4572;
        if (arg0 > -27) {
            method1945(12);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (!arg1) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field4563 = arg2.method2565((byte) -101);
                                    }
                                } else {
                                    this.field4564 = arg2.method2565((byte) -121);
                                }
                            } else {
                                this.field4561 = arg2.method2565((byte) -105);
                            }
                        } else {
                            this.field4569 = arg2.method2565((byte) -104);
                        }
                    } else {
                        this.field4559 = arg2.method2565((byte) -110);
                    }
                } else {
                    this.field4571 = arg2.method2565((byte) -83);
                }
            } else {
                this.field4562 = arg2.method2565((byte) -125);
            }
            ++field4573;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZI)Z")
    private final boolean method1944(int arg0, boolean arg1, int arg2) {
        ++field4565;
        int var4 = (-arg0 + arg2) * this.field4561 >> 12;
        if (!arg1) {
            field4568 = null;
        }
        int var5 = class615.field8725[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4561;
        int var7 = (var6 << 12) / this.field4563;
        int var8 = this.field4564 * var7 >> 12;
        return var8 > arg0 - -arg2 && ~(-var8) > ~(arg0 - -arg2);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field4570;
        if (arg1 != -22563988) {
            this.field4561 = 41;
        }
        int[] var3 = super.field4743.method1027((byte) -128, arg0);
        if (super.field4743.field1993) {
            int var4 = class527.field7361[arg0] - 2048;
            for (int var5 = 0; ~class439.field6099 < ~var5; ++var5) {
                int var6 = class295.field4296[var5] + -2048;
                int var7 = this.field4562 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field4571 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field4559 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = ~var14 < -2049 ? var14 - 4096 : var14;
                int var16 = this.field4569 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method1944(var9, true, var12) && !this.method1943(arg1 + 22564082, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "(I)V")
    public static void method1945(int arg0) {
        field4568 = null;
        field4560 = null;
        if (arg0 != 2048) {
            method1946(-80, 25);
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
    public class321() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)I")
    public static final int method1946(int arg0, int arg1) {
        ++field4566;
        return arg0 != -32603 ? 42 : 127 & arg1;
    }
}
