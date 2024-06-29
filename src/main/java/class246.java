import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class246 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Liv;")
    public static class82 field3380 = new class82(0, 2);

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 9)
    public static void method1495(byte arg0) {
        if (arg0 >= -29) {
            method1495((byte) -14);
        }
        field3380 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)Z", line = 21)
    public static final boolean method1496(byte arg0, int arg1, int arg2) {
        field3377++;
        if (arg0 <= 126) {
            field3381 = 51;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)I", line = 32)
    public static final int method1497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        int var8 = -67 % ((arg3 - 45) / 60);
        if ((arg4 & 0x1) == 1) {
            int var9 = arg1;
            arg1 = arg6;
            arg6 = var9;
        }
        field3379++;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 1 - (arg1 - 7) - arg2;
        } else if (var7 == 2) {
            return 7 - (arg0 + arg6 - 1);
        } else {
            return arg2;
        }
    }
}
