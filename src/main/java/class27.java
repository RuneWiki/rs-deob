import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class27 {

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lkc;")
    public static class147 field335;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 17)
    public static void method234(int arg0) {
        if (arg0 > 23) {
            field335 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIIIIIIII)V", line = 32)
    public static final void method235(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field336++;
        class198 var10 = null;
        for (class198 var11 = (class198) class428.field6108.method2456(32101); var11 != null; var11 = (class198) class428.field6108.method2461(301)) {
            if (var11.field2988 == arg2 && var11.field2986 == arg6 && var11.field2974 == arg4 && var11.field2978 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (!arg0) {
            method235(true, 27, -122, 13, -119, -104, -69, 40, -17, 117);
        }
        if (var10 == null) {
            var10 = new class198();
            var10.field2988 = arg2;
            var10.field2986 = arg6;
            var10.field2978 = arg8;
            var10.field2974 = arg4;
            class141.method972(var10, 0);
            class428.field6108.method2453((byte) -115, var10);
        }
        var10.field2989 = arg3;
        var10.field2991 = arg5;
        var10.field2983 = arg9;
        var10.field2987 = arg7;
        var10.field2977 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBIIIIIII)V", line = 75)
    public static final void method236(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field346++;
        if (class161.method1094(arg1 ^ 0x77A412AC, arg7)) {
            if (class361.field5469[arg7] == null) {
                class381.method2327(arg8, arg6, -1, arg3, arg0, arg5, (byte) -109, arg2, class467.field6572[arg7], arg4);
            } else {
                class381.method2327(arg8, arg6, -1, arg3, arg0, arg5, (byte) -118, arg2, class361.field5469[arg7], arg4);
            }
            if (arg1 != 124) {
                field357 = -127;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class103.field1442[var9] = true;
            }
        } else {
            class103.field1442[arg8] = true;
        }
    }
}
