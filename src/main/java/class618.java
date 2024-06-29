import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class618 extends class353 {

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "F")
    private float field8958 = 0.0F;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Lgb;")
    private class465 field8965;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "[I")
    public static int[] field8964 = new int[4096];

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Lcq;")
    public static class273 field8956 = new class273(9, 0, 4, 1);

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "J")
    public static long field8953;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILqda;I)V", line = 6)
    public final void method484(int arg0, class689 arg1, int arg2) {
        super.field5242.method3011(-127, arg1);
        ++field8960;
        if (arg0 != 8056) {
            field8953 = 57L;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)Z", line = 18)
    public final boolean method493(byte arg0) {
        if (arg0 >= -20) {
            this.method485(-59, false);
        }
        ++field8963;
        return this.field8965.method2693(true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lcea;B[[B)V", line = 29)
    public static final void method3561(class94 arg0, byte arg1, byte[][] arg2) {
        ++field8955;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~arg0.field9722 < ~var4; ++var4) {
            class413.method2520(false);
            for (int var5 = 0; class72.field1144 >> 3 > var5; ++var5) {
                for (int var6 = 0; ~var6 > ~(class668.field9444 >> 3); ++var6) {
                    int var7 = class81.field1310[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = var7 >> 24 & 3;
                        if (!arg0.field9738 || ~var8 == -1) {
                            int var9 = 3 & var7 >> 1;
                            int var10 = 1023 & var7 >> 14;
                            int var11 = (16383 & var7) >> 3;
                            int var12 = (var10 / 8 << 8) - -(var11 / 8);
                            for (int var13 = 0; ~class505.field7147.length < ~var13; ++var13) {
                                if (class505.field7147[var13] == var12 && arg2[var13] != null) {
                                    class540 var14 = new class540(arg2[var13]);
                                    arg0.method3861(var9, var8, var14, var5 * 8, var10, var4, -1, var6 * 8, var11, class629.field9104);
                                    arg0.method594(var4, ~var3[0] != 0 ? null : var3, var14, var6 * 8, class332.field4821, var9, var11, var5 * 8, -26720, var10, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= 16) {
            if (~var3[0] != 0) {
                class383.field5750 = class251.field3294.method375(var3[2], -1946, var3[0], var3[3], var3[1], class274.field3588);
                class500.field7077 = var3[4];
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 112)
    public final void method2196(int arg0) {
        int var2 = -98 / ((arg0 - 57) / 61);
        ++field8957;
        if (~super.field5242.method3000((byte) 93) == -1) {
            class300 var3 = super.field5242.method3067(-11030);
            super.field5242.method3050(1, 0);
            class300 var4 = super.field5242.method3032(-30);
            var4.method887(var3);
            var4.method1885(0.125F, 0.125F, 1, 1.0F);
            var4.method1870(this.field8958, 0, 0.0F, 0.0F);
            super.field5242.method3045(-123, class677.field9586);
            super.field5242.method3050(0, 0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZI)V", line = 138)
    public final void method486(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field8956 = null;
        }
        super.field5242.method3050(1, 0);
        ++field8954;
        if ((128 & arg0) != 0) {
            super.field5242.method3011(-127, (class689) null);
        } else if (~(arg2 & 1) == -2) {
            if (this.field8965.field6706) {
                this.field8958 = (float) (super.field5242.field7753 % 4000) / 4000.0F;
                super.field5242.method3011(-128, this.field8965.field6707);
            } else {
                int var4 = super.field5242.field7753 % 4000 * 16 / 4000;
                super.field5242.method3011(-128, this.field8965.field6705[var4]);
            }
        } else if (!this.field8965.field6706) {
            super.field5242.method3011(-128, this.field8965.field6705[0]);
        } else {
            super.field5242.method3011(-128, this.field8965.field6707);
        }
        super.field5242.method3050(0, 0);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 182)
    public final void method490(int arg0) {
        super.field5242.method3050(1, 0);
        ++field8961;
        super.field5242.method3013(class492.field6998, arg0 ^ -2144900447, class492.field6998);
        super.field5242.method3025(class283.field3777, -1, 0);
        super.field5242.method3019(0, 0, class283.field3777);
        super.field5242.method804(true, 1);
        super.field5242.method3011(-128, (class689) null);
        if (arg0 != -2144900407) {
            field8964 = null;
        }
        super.field5242.method3050(0, 0);
        super.field5242.method3019(0, 0, class283.field3777);
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V", line = 200)
    public static void method3562(int arg0) {
        if (arg0 != 2152) {
            field8956 = null;
        }
        field8956 = null;
        field8964 = null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IZ)V", line = 212)
    public final void method485(int arg0, boolean arg1) {
        ++field8962;
        super.field5242.method3013(class492.field6998, 77, class519.field7276);
        if (arg0 <= 1) {
            this.field8958 = -1.6134559F;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V", line = 223)
    public final void method491(int arg0, boolean arg1) {
        ++field8959;
        super.field5242.method3050(1, 0);
        super.field5242.method3013(class65.field1041, 56, class519.field7276);
        super.field5242.method768(true, false, class283.field3777, 0, 3);
        super.field5242.method3019(0, 0, class11.field273);
        super.field5242.method804(true, 0);
        super.field5242.method3050(0, 0);
        if (arg0 >= -121) {
            field8953 = 116L;
        }
        super.field5242.method3028(-16777216, false);
        super.field5242.method3019(0, 0, class475.field6812);
        this.method2196(-58);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lum;Lgb;)V", line = 253)
    public class618(class528 arg0, class465 arg1) {
        super(arg0);
        this.field8965 = arg1;
    }
}
