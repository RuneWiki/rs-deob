import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class621 extends class26 {

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public int field7862;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field7859 = 1401;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field7861 = -1;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field7858 = 0;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "D")
    public static double field7863;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Lgp;")
    public final class576 method3(byte arg0) {
        if (arg0 >= -15) {
            method3319(27, 57, 127, -108, null, null);
        }
        field7857++;
        return class406.field5386;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIILih;Lha;)V")
    public static final void method3319(int arg0, int arg1, int arg2, int arg3, class773 arg4, class570 arg5) {
        field7860++;
        class510 var6 = class702.field9289.method2694((byte) -3, arg4.field10510);
        if (var6.field6504 == -1) {
            return;
        }
        int var8;
        if (arg4.field10446) {
            int var7 = arg4.field10538 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class772 var9 = var6.method2820(arg5, var8, arg4.field10497, (byte) 64);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field10466;
        int var11 = arg4.field10484;
        if ((var8 & 0x1) == 1) {
            var10 = arg4.field10484;
            var11 = arg4.field10466;
        }
        int var12 = var9.method623();
        int var13 = var9.method628();
        if (var6.field6515) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field6514 == arg1) {
            var9.method4206(arg2, arg3 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method4199(arg2, arg3 + 4 - (var11 * 4), var12, var13, 0, var6.field6514 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lpf;Ldg;IIIIIIIIIIIIII)V")
    public class621(class759 arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field7862 = arg15;
    }
}
