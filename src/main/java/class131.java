import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class131 extends class181 {

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    private final int field2395;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    private final int field2409;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    private final int field2393;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    private final int field2400;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    private final int field2394;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    private final int field2397;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    private final int field2402;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    private final int field2398;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Loc;")
    public static class151 field2399 = class137.method873(2, "Null");

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Loc;")
    private static class151 field2413 = class137.method873(2, "Continue");

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Loc;")
    public static class151 field2406 = field2413;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Loc;")
    private static class151 field2412 = class137.method873(2, "flash3:");

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Loc;")
    public static class151 field2411 = class137.method873(2, "Fps:");

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Loc;")
    public static class151 field2401 = field2412;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Loc;")
    public static class151 field2414 = class137.method873(2, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Loc;")
    public static class151 field2407 = field2412;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[Lhh;")
    public static class84[] field2404;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method814(true, -7);
        }
        ++field2403;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V")
    public static final void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2405;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg4 <= 2) {
            field2415 = 12;
        }
        int var12 = var8 << 2;
        int var13 = arg5 << 1;
        int var14 = var9 - (var13 + -1) * var11;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = ((arg5 << 1) + -3) * var11;
        int var18 = (arg5 + -1) * var12;
        if (arg2 >= class233.field4281 && ~class154.field2793 <= ~arg2) {
            int var19 = class116.method704(class25.field524, arg0 + arg3, 27104, class79.field1526);
            int var20 = class116.method704(class25.field524, -arg3 + arg0, 27104, class79.field1526);
            class55.method380(arg1, 113, class43.field887[arg2], var19, var20);
        }
        int var21 = (var6 + 1) * var15;
        int var22 = (-var13 + 1) * var8 + var10;
        while (~var7 < -1) {
            if (~var22 > -1) {
                while (~var22 > -1) {
                    var14 += var21;
                    var22 += var16;
                    var16 += var15;
                    var21 += var15;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var14 += var21;
                var22 += var16;
                ++var6;
                var21 += var15;
                var16 += var15;
            }
            var14 += -var17;
            var22 += -var18;
            var18 -= var12;
            var17 -= var12;
            --var7;
            int var23 = arg2 + var7;
            int var24 = -var7 + arg2;
            if (~class233.field4281 >= ~var23 && ~var24 >= ~class154.field2793) {
                int var25 = class116.method704(class25.field524, arg0 + var6, 27104, class79.field1526);
                int var26 = class116.method704(class25.field524, arg0 - var6, 27104, class79.field1526);
                if (~var24 <= ~class233.field4281) {
                    class55.method380(arg1, 114, class43.field887[var24], var25, var26);
                }
                if (~class154.field2793 <= ~var23) {
                    class55.method380(arg1, 119, class43.field887[var23], var25, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lga;")
    public static final class67 method814(boolean arg0, int arg1) {
        if (!arg0) {
            field2412 = null;
        }
        class67 var2 = (class67) class56.field1136.method1318((byte) -118, (long) arg1);
        ++field2408;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class16.field389.method1208(class92.method583(127, arg1), (byte) 34, class175.method1118(-90, arg1));
            class67 var4 = new class67();
            var4.field1324 = arg1;
            if (var3 != null) {
                var4.method449(new class229(var3), (byte) -81);
            }
            var4.method444(15759);
            class56.field1136.method1324(var4, 18373, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(BII)V")
    public final void method48(byte arg0, int arg1, int arg2) {
        if (arg0 != 125) {
            method816((byte) -104);
        }
        int var4 = this.field2409 * arg1 >> 12;
        int var5 = this.field2402 * arg2 >> 12;
        int var6 = this.field2400 * arg2 >> 12;
        int var7 = this.field2398 * arg1 >> 12;
        ++field2410;
        int var8 = this.field2394 * arg2 >> 12;
        int var9 = this.field2395 * arg1 >> 12;
        int var10 = this.field2397 * arg1 >> 12;
        int var11 = this.field2393 * arg2 >> 12;
        class154.method1013(var7, var11, var8, var10, var9, true, var6, super.field3279, var5, var4);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)V")
    public final void method47(byte arg0, int arg1, int arg2) {
        ++field2392;
        if (arg0 != -101) {
            this.method47((byte) 116, -7, -32);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILw;I)V")
    public static final void method815(int arg0, class228 arg1, int arg2) {
        class59.method391(arg1.field4029, arg1.field3976, arg2, arg0 ^ 1892761298);
        if (arg0 != 1928491554) {
            field2415 = 119;
        }
        ++field2396;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2395 = arg7;
        this.field2409 = arg1;
        this.field2393 = arg6;
        this.field2400 = arg4;
        this.field2394 = arg2;
        this.field2397 = arg5;
        this.field2402 = arg0;
        this.field2398 = arg3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field2401 = null;
        field2413 = null;
        field2407 = null;
        field2406 = null;
        if (arg0 <= 95) {
            field2414 = null;
        }
        field2411 = null;
        field2404 = null;
        field2399 = null;
        field2414 = null;
        field2412 = null;
    }
}
