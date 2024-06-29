import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class408 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lvl;")
    public static class13 field5781 = new class13("LIVE", 0);

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Lgda;")
    public static class53 field5784 = new class53(38, 3);

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field5785 = 1407;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field5786 = 0;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Lgda;")
    public static class53 field5787 = new class53(33, 16);

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field5788 = -1;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field5776;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public int field5779;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
    public boolean field5782;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)I")
    public static final int method2523(int arg0, int arg1, int arg2) {
        field5783++;
        if (arg0 == -30231) {
            return arg1 == 1 || arg1 == 3 ? class280.field3986[arg2 & 0x3] : class451.field6389[arg2 & 0x3];
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static final void method2524(int arg0) {
        class298.field4204.method4023((byte) -124);
        field5777++;
        if (arg0 < 63) {
            field5784 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method2525(int arg0) {
        field5781 = null;
        field5784 = null;
        if (arg0 != -10869) {
            field5788 = 31;
        }
        field5787 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)V")
    public static final void method2526(int arg0, int arg1, int arg2) {
        field5775++;
        if (class724.field10102 == class633.field8733) {
            if (class174.method1113(-2, 0, 1, 1, 1, 0, arg1, false, arg2)) {
                return;
            }
            class174.method1113(-3, 0, 1, 1, 1, 0, arg1, false, arg2);
        } else if (class174.method1113(-3, 0, 1, 1, 1, 0, arg1, false, arg2)) {
            return;
        } else {
            class174.method1113(-2, 0, 1, 1, 1, 0, arg1, false, arg2);
        }
        if (arg0 != 0) {
            field5788 = -80;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V")
    public static final void method2527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5780++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        if (arg1 != 22195) {
            field5786 = -105;
        }
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg3 >= class143.field2050 && class461.field6495 >= arg3) {
            int var20 = class24.method150(arg2 + arg4, class71.field960, false, class549.field7665);
            int var21 = class24.method150(arg2 - arg4, class71.field960, false, class549.field7665);
            class643.method3557(var21, class445.field6320[arg3], (byte) 110, arg0, var20);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class143.field2050 && class461.field6495 >= var23) {
                int var25 = class24.method150(arg2 + var6, class71.field960, false, class549.field7665);
                int var26 = class24.method150(arg2 - var6, class71.field960, false, class549.field7665);
                if (class143.field2050 <= var23) {
                    class643.method3557(var26, class445.field6320[var23], (byte) 84, arg0, var25);
                }
                if (var24 <= class461.field6495) {
                    class643.method3557(var26, class445.field6320[var24], (byte) 114, arg0, var25);
                }
            }
        }
    }
}
