import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class369 extends class390 {

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field5195;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLqa;)V", line = 5)
    public static final void method2371(boolean arg0, class134 arg1) {
        if (!arg0) {
            method2374(true);
        }
        field5196++;
        class194 var2 = (class194) class188.field2593.method886((long) arg1.field5294, 25651);
        if (var2 == null) {
            return;
        }
        if (var2.field2659 != null) {
            class164.field2266.method2788(var2.field2659);
            var2.field2659 = null;
        }
        var2.method2467((byte) -64);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILoi;)V", line = 31)
    public static final void method2372(int arg0, class45 arg1) {
        class47.field660 = arg1;
        field5194++;
        if (arg0 != 128) {
            field5199 = -2;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILqa;ILkm;ILgm;I)V", line = 51)
    public static final void method2373(int arg0, int arg1, class134 arg2, int arg3, class198 arg4, int arg5, class64 arg6, int arg7) {
        if (arg0 != 1) {
            field5199 = -111;
        }
        field5198++;
        class194 var8 = new class194();
        var8.field2661 = arg5 * 128;
        var8.field2670 = arg1 * 128;
        var8.field2671 = arg7;
        if (arg6 != null) {
            var8.field2656 = arg6;
            int var9 = arg6.field872;
            int var10 = arg6.field950;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg6.field950;
                var10 = arg6.field872;
            }
            var8.field2657 = arg6.field913;
            var8.field2664 = arg6.field929;
            var8.field2655 = arg6.field921;
            var8.field2668 = arg6.field933;
            var8.field2673 = (arg1 + var10) * 128;
            var8.field2666 = arg6.field928;
            var8.field2652 = (arg5 + var9) * 128;
            var8.field2653 = arg6.field930 * 128;
            if (arg6.field908 != null) {
                var8.field2676 = true;
                var8.method1254((byte) 124);
            }
            if (var8.field2657 != null) {
                var8.field2665 = var8.field2668 + ((int) ((double) (var8.field2655 - var8.field2668) * Math.random()));
            }
            class375.field5353.method643(var8, -23);
        } else if (arg4 != null) {
            var8.field2660 = arg4;
            class327 var11 = arg4.field2737;
            if (var11.field4475 != null) {
                var8.field2676 = true;
                var11 = var11.method2108(true);
            }
            if (var11 != null) {
                var8.field2673 = (arg1 + var11.field4488) * 128;
                var8.field2652 = (arg5 + var11.field4488) * 128;
                var8.field2664 = class75.method557(arg4, arg0 + 8);
                var8.field2653 = var11.field4518 * 128;
                var8.field2666 = var11.field4521;
            }
            class447.field6276.method643(var8, -54);
        } else if (arg2 != null) {
            var8.field2651 = arg2;
            var8.field2652 = (arg5 + arg2.method942(false)) * 128;
            var8.field2673 = (arg2.method942(false) + arg1) * 128;
            var8.field2664 = class144.method988(arg2, 81);
            var8.field2666 = arg2.field1933;
            var8.field2653 = arg2.field1924 * 128;
            class188.field2593.method883((byte) -54, (long) arg2.field5294, var8);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 142)
    public static final void method2374(boolean arg0) {
        class328.field4540.method900(0);
        field5200++;
        if (!arg0) {
            field5199 = -103;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V", line = 154)
    public class369(int arg0, int arg1) {
        this.field5197 = arg0;
        this.field5195 = arg1;
    }
}
