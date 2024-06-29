import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class176 extends class270 {

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    private int field2617 = 0;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "I")
    private int field2620 = 0;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "I")
    private int field2615 = 0;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "I")
    public static int field2616 = -1;

    @OriginalMember(owner = "client!as", name = "W", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!as", name = "ab", descriptor = "Z")
    public static boolean field2633 = false;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!as", name = "L", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!as", name = "O", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!as", name = "Q", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!as", name = "R", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!as", name = "S", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!as", name = "T", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!as", name = "U", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!as", name = "V", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!as", name = "X", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!as", name = "Y", descriptor = "I")
    private int field2631;

    @OriginalMember(owner = "client!as", name = "Z", descriptor = "I")
    private int field2632;

    @OriginalMember(owner = "client!as", name = "P", descriptor = "Ldp;")
    public static class174 field2622;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(B)V")
    public static void method1361(byte arg0) {
        if (arg0 >= -28) {
            field2633 = true;
        }
        field2622 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.field2614 = -45;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2617 = (arg1.method291(0) << 12) / 100;
                }
            } else {
                this.field2615 = (arg1.method291(0) << 12) / 100;
            }
        } else {
            this.field2620 = arg1.method321((byte) 109);
        }
        ++field2623;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field2630;
        if (!arg0) {
            this.method1365(54, 110, -34, -49);
        }
        int[][] var3 = super.field4046.method244(arg1, 124);
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class161.field2445; ++var11) {
                this.method1362(8435, var5[var11], var6[var11], var7[var11]);
                this.field2618 += this.field2617;
                this.field2613 += this.field2620;
                this.field2632 += this.field2615;
                while (this.field2613 < 0) {
                    this.field2613 += 4096;
                }
                if (~this.field2632 > -1) {
                    this.field2632 = 0;
                }
                while (this.field2613 > 4096) {
                    this.field2613 -= 4096;
                }
                if (this.field2618 < 0) {
                    this.field2618 = 0;
                }
                if (~this.field2632 < -4097) {
                    this.field2632 = 4096;
                }
                if (~this.field2618 < -4097) {
                    this.field2618 = 4096;
                }
                this.method1365(1, this.field2632, this.field2613, this.field2618);
                var8[var11] = this.field2626;
                var9[var11] = this.field2631;
                var10[var11] = this.field2614;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V")
    private final void method1362(int arg0, int arg1, int arg2, int arg3) {
        ++field2627;
        int var5 = arg2 < arg1 ? arg1 : arg2;
        int var6 = ~var5 <= ~arg3 ? var5 : arg3;
        int var7 = ~arg2 >= ~arg1 ? arg2 : arg1;
        int var8 = ~var7 < ~arg3 ? arg3 : var7;
        this.field2618 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (~var9 >= -1) {
            this.field2613 = 0;
        } else {
            int var10 = (var6 - arg1 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (~arg1 == ~var6) {
                this.field2613 = arg2 != var8 ? 4096 - var11 : var12 + 20480;
            } else if (~arg2 != ~var6) {
                this.field2613 = arg1 != var8 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field2613 = ~arg3 != ~var8 ? -var12 + 12288 : 4096 - -var10;
            }
            this.field2613 /= 6;
        }
        if (arg0 != 8435) {
            method1363(105, (byte) -16);
        }
        if (this.field2618 > 0 && ~this.field2618 > -4097) {
            this.field2632 = (var9 << 12) / (~this.field2618 >= -2049 ? this.field2618 * 2 : -(this.field2618 * 2) + 8192);
        } else {
            this.field2632 = 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I")
    public static final int method1363(int arg0, byte arg1) {
        if (arg1 >= -119) {
            method1363(117, (byte) -87);
        }
        ++field2621;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1364(char arg0, boolean arg1) {
        ++field2628;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (!arg1) {
                field2616 = 91;
            }
            if (~arg0 != -1) {
                char[] var2 = class115.field1830;
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(IIII)V")
    private final void method1365(int arg0, int arg1, int arg2, int arg3) {
        ++field2625;
        if (arg0 == 1) {
            int var5 = ~arg3 >= -2049 ? (arg1 + 4096) * arg3 >> 12 : arg3 - -arg1 - (arg1 * arg3 >> 12);
            if (var5 > 0) {
                int var6 = arg2 * 6;
                int var7 = arg3 + arg3 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 - -var13;
                int var15 = -var13 + var5;
                if (~var9 == -1) {
                    this.field2614 = var7;
                    this.field2631 = var14;
                    this.field2626 = var5;
                    return;
                }
                if (var9 == 1) {
                    this.field2631 = var5;
                    this.field2626 = var15;
                    this.field2614 = var7;
                    return;
                }
                if (~var9 == -3) {
                    this.field2631 = var5;
                    this.field2614 = var14;
                    this.field2626 = var7;
                    return;
                }
                if (~var9 == -4) {
                    this.field2631 = var15;
                    this.field2626 = var7;
                    this.field2614 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field2626 = var14;
                    this.field2631 = var7;
                    this.field2614 = var5;
                    return;
                }
                if (~var9 == -6) {
                    this.field2626 = var5;
                    this.field2631 = var7;
                    this.field2614 = var15;
                    return;
                }
            } else {
                this.field2626 = this.field2631 = this.field2614 = arg3;
            }
        }
    }
}
