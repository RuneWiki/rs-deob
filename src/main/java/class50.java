import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class class50 {

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Ljm;")
    public static class485 field684 = new class485(27, 3);

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "[F")
    public static float[] field685 = new float[4];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static void method312(byte arg0) {
        field685 = null;
        if (arg0 != -99) {
            method313(-102, null, -4, -46, -32, -118, -31, -44);
        }
        field684 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public static final void method313(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field683++;
        class201 var8 = new class201();
        var8.field2869 = arg4;
        var8.field2864 = class393.field5484 + arg6;
        var8.field2871 = arg1;
        var8.field2865 = arg7;
        var8.field2868 = arg3;
        if (arg2 == 4) {
            var8.field2870 = arg0;
            var8.field2867 = arg5;
            class384.field5402.method2310(var8, -21801);
        }
    }
}
