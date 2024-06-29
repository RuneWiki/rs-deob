import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class701 extends class132 {

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field9956 = 0;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Lvg;")
    public static class622 field9963 = new class622(28, 8);

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Lf;")
    public class256 field9957;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Lf;")
    private class256 field9958;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Lf;")
    private class256 field9960;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Lf;")
    private class256 field9964;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "Lf;")
    private class256 field9967;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Lf;")
    private class256 field9969;

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lmv;Lmv;Lpc;)V")
    public class701(class295 arg0, class295 arg1, class251 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public static void method3933(int arg0) {
        if (arg0 != 32520) {
            method3934((class94) null, (byte[][]) null, (byte) -121);
        }
        field9963 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZII)V")
    public final void method939(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 == 24626) {
            ++field9961;
            int var5 = arg3 + this.field9964.method50();
            int var6 = arg3 + super.field1909.field2337 + -this.field9958.method50();
            int var7 = this.field9969.method43() + arg2;
            int var8 = super.field1909.field2332 + (arg2 - this.field9960.method43());
            int var9 = -var5 + var6;
            int var10 = -var7 + var8;
            int var11 = var9 * this.method942(17686) / 10000;
            int[] var12 = new int[4];
            class332.field4821.method628(var12);
            class332.field4821.method652(var5, var7, var5 + var11, var8);
            this.method3713(var9, var7, var5, var10, arg0 + -66860698);
            class332.field4821.method652(var5 + var11, var7, var6, var8);
            this.field9967.method1528(var5, var7, var9, var10);
            class332.field4821.method652(var12[0], var12[1], var12[2], var12[3]);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lcea;[[BB)V")
    public static final void method3934(class94 arg0, byte[][] arg1, byte arg2) {
        ++field9968;
        for (int var3 = 0; var3 < arg0.field9722; ++var3) {
            class413.method2520(false);
            for (int var4 = 0; class72.field1144 >> 3 > var4; ++var4) {
                for (int var5 = 0; ~var5 > ~(class668.field9444 >> 3); ++var5) {
                    int var6 = class81.field1310[var3][var4][var5];
                    if (~var6 != 0) {
                        int var7 = 3 & var6 >> 24;
                        if (!arg0.field9738 || var7 == 0) {
                            int var8 = var6 >> 1 & 3;
                            int var9 = (var6 & 16766096) >> 14;
                            int var10 = (var6 & 16376) >> 3;
                            int var11 = (var9 / 8 << 8) - -(var10 / 8);
                            for (int var12 = 0; var12 < class505.field7147.length; ++var12) {
                                if (class505.field7147[var12] == var11 && arg1[var12] != null) {
                                    arg0.method587(var3, arg1[var12], var4 * 8, var5 * 8, class629.field9104, (7 & var9) * 8, (7 & var10) * 8, var7, var8, class332.field4821, 110);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 104) {
            field9956 = -24;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
    public final boolean method941(byte arg0) {
        ++field9970;
        if (!super.method941((byte) -38)) {
            return false;
        } else {
            class251 var2 = (class251) super.field1909;
            if (!super.field1923.method1818(var2.field3298, 4)) {
                return false;
            } else if (!super.field1923.method1818(var2.field3289, 4)) {
                return false;
            } else if (!super.field1923.method1818(var2.field3288, 4)) {
                return false;
            } else if (!super.field1923.method1818(var2.field3287, 4)) {
                return false;
            } else {
                if (arg0 > -15) {
                    this.field9969 = null;
                }
                if (!super.field1923.method1818(var2.field3291, 4)) {
                    return false;
                } else {
                    return super.field1923.method1818(var2.field3290, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIII)V")
    public final void method945(boolean arg0, int arg1, int arg2, int arg3) {
        ++field9959;
        if (arg2 < -25) {
            if (arg0) {
                int[] var5 = new int[4];
                class332.field4821.method628(var5);
                class332.field4821.method652(arg1, arg3, super.field1909.field2337 + arg1, arg3 - -super.field1909.field2332);
                int var6 = this.field9964.method50();
                int var7 = this.field9964.method43();
                int var8 = this.field9958.method50();
                int var9 = this.field9958.method43();
                this.field9964.method1534(arg1, (-var7 + super.field1909.field2332) / 2 + arg3);
                this.field9958.method1534(-var8 + arg1 - -super.field1909.field2337, arg3 - -((-var9 + super.field1909.field2332) / 2));
                class332.field4821.method652(arg1, arg3, super.field1909.field2337 + arg1, this.field9969.method43() + arg3);
                this.field9969.method1528(arg1 + var6, arg3, -var8 + super.field1909.field2337 + -var6, super.field1909.field2332);
                int var10 = this.field9960.method43();
                class332.field4821.method652(arg1, -var10 + arg3 - -super.field1909.field2332, super.field1909.field2337 + arg1, super.field1909.field2332 + arg3);
                this.field9960.method1528(arg1 + var6, super.field1909.field2332 + arg3 - var10, super.field1909.field2337 - (var6 - -var8), super.field1909.field2332);
                class332.field4821.method652(var5[0], var5[1], var5[2], var5[3]);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public final void method940(int arg0) {
        ++field9965;
        super.method940(arg0);
        class251 var2 = (class251) super.field1909;
        this.field9957 = class201.method1305(super.field1923, true, var2.field3298);
        this.field9967 = class201.method1305(super.field1923, true, var2.field3289);
        this.field9964 = class201.method1305(super.field1923, true, var2.field3288);
        this.field9958 = class201.method1305(super.field1923, true, var2.field3287);
        this.field9969 = class201.method1305(super.field1923, true, var2.field3291);
        this.field9960 = class201.method1305(super.field1923, true, var2.field3290);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public void method3713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -66836072) {
            ++field9966;
            this.field9957.method1528(arg2, arg1, arg0, arg3);
        }
    }
}
