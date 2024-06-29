import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class243 extends class424 {

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lhc;")
    public static class368 field3439;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            field3439 = null;
        }
        if (~arg2 == -1) {
            super.field5893 = ~arg0.method2306((byte) 119) == -2;
        }
        ++field3435;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
    private final void method1580(int arg0, int arg1, int arg2) {
        ++field3438;
        int var4 = class332.field4478[arg0];
        int var5 = class409.field5711[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (arg2 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class339.field4596 = arg1;
            class342.field4618 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class342.field4618 = arg1;
            class339.field4596 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class339.field4596 = arg0;
            class342.field4618 = -arg1 + class303.field4135;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class339.field4596 = -arg1 + class423.field5866;
            class342.field4618 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class339.field4596 = -arg1 + class423.field5866;
            class342.field4618 = class303.field4135 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class339.field4596 = class423.field5866 - arg0;
            class342.field4618 = class303.field4135 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class339.field4596 = class423.field5866 - arg0;
            class342.field4618 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class342.field4618 = class303.field4135 - arg0;
            class339.field4596 = arg1;
        }
        class339.field4596 &= class174.field2484;
        class342.field4618 &= class65.field898;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
    public static final void method1581(int arg0, int arg1, byte arg2) {
        ++field3430;
        class26 var3 = class217.method1445(true, arg0, 12);
        var3.method158(arg2 ^ -28269);
        if (arg2 == -79) {
            var3.field341 = arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        if (arg0 >= -112) {
            method1586(false);
        }
        field3439 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field3437;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class303.field4135 > var7; ++var7) {
                this.method1580(var7, arg0, -2048);
                int[][] var8 = this.method2624(true, 0, class339.field4596);
                var4[var7] = var8[0][class342.field4618];
                var5[var7] = var8[1][class342.field4618];
                var6[var7] = var8[2][class342.field4618];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public static final void method1583(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > 79) {
            if (~class80.field1119 >= ~arg0 && ~arg0 >= ~class430.field6003) {
                int var5 = class294.method1789(arg3, (byte) -5, class42.field543, class143.field2090);
                int var6 = class294.method1789(arg1, (byte) -5, class42.field543, class143.field2090);
                class149.method1111(arg4, -1147, var6, arg0, var5);
            }
            ++field3434;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIB)V")
    public static final void method1584(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3432;
        if (arg4 != 66) {
            field3439 = null;
        }
        class26 var5 = class217.method1445(true, arg2, 4);
        var5.method158(28194);
        var5.field341 = arg1;
        var5.field336 = arg3;
        var5.field339 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field3433;
        int[] var3 = super.field5892.method783(arg0, (byte) -67);
        if (arg1 != -10) {
            this.method43(-67, (byte) -28);
        }
        if (super.field5892.field1427) {
            for (int var4 = 0; ~class303.field4135 < ~var4; ++var4) {
                this.method1580(var4, arg0, arg1 ^ 2038);
                int[] var5 = this.method2621(0, arg1 + -111, class339.field4596);
                var3[var4] = var5[class342.field4618];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    public static final void method1585(int arg0) {
        class343.field4628.method2530((byte) -104);
        ++field3431;
        if (arg0 <= 17) {
            field3439 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
    public static final void method1586(boolean arg0) {
        class343.field4628.method2522((byte) 45);
        if (!arg0) {
            ++field3436;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(III)Ljk;")
    public static final class403 method1587(int arg0, int arg1, int arg2) {
        class63 var3 = class341.field4617[arg0][arg1][arg2];
        return var3 == null ? null : var3.field867;
    }

    static {
        new class368(" days.", " Tage.", " jours.", " dias.");
        field3439 = new class368("slide:", "gleiten:", "glissement:", "deslizamento:");
    }
}
