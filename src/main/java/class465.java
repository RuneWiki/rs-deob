import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class465 extends class757 {

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "[F")
    public static float[] field6359 = new float[4];

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "Lum;")
    public static class130 field6357;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILgfa;ILjk;IILcj;ILha;)V")
    public static final void method2775(int arg0, class753 arg1, int arg2, class185 arg3, int arg4, int arg5, class443 arg6, int arg7, class545 arg8) {
        ++field6360;
        int var9 = -(arg2 / 2) + arg0 + -5;
        int var10 = arg5 + 2;
        if (~arg3.field2718 != -1) {
            arg8.method3255(1 + (arg6.method2651() * arg4 + arg5 - var10), arg2 + 10, var9, arg3.field2718, (byte) 112, var10);
        }
        if (arg3.field2716 != 0) {
            arg8.method3263(var9, arg3.field2716, (byte) -116, arg6.method2651() * arg4 + arg5 - (var10 + -1), var10, arg2 + 10);
        }
        int var11 = arg3.field2691;
        if (arg1.field10457 && ~arg3.field2700 != 0) {
            var11 = arg3.field2700;
        }
        for (int var12 = 0; arg4 > var12; ++var12) {
            String var13 = class261.field3563[var12];
            if (~(arg4 - 1) < ~var12) {
                var13 = var13.substring(0, var13.length() + -4);
            }
            arg6.method2646(arg8, var13, arg0, arg5, var11, true);
            arg5 += arg6.method2651();
        }
        if (arg7 != 10) {
            field6357 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IF)V")
    public final void method2616(int arg0, float arg1) {
        super.field10523 = arg1;
        ++field6361;
        if (arg0 != 0) {
            field6357 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(B)V")
    public static void method2776(byte arg0) {
        if (arg0 != 42) {
            field6357 = null;
        }
        field6359 = null;
        field6357 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIIF)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBII)V")
    public final void method2618(int arg0, byte arg1, int arg2, int arg3) {
        super.field10528 = arg0;
        ++field6358;
        if (arg1 != -108) {
            field6359 = null;
        }
        super.field10515 = arg2;
        super.field10513 = arg3;
    }
}
