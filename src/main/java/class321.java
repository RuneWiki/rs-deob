import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class321 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lqp;")
    public static class586 field4778 = new class586(18, 7);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "F")
    public static float field4777;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method2012(int arg0) {
        if (arg0 != -30788) {
            field4778 = null;
        }
        field4778 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
    public static final void method2013(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 18) {
            field4778 = null;
        }
        field4776++;
        class621 var4 = class442.method2691(arg2, 9, true);
        var4.method3592((byte) 127);
        var4.field9068 = arg1;
        var4.field9070 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2014(int arg0, int arg1, byte arg2) {
        field4779++;
        if (arg2 == -39) {
            return class474.method2888(arg0, (byte) 125, arg1) || class340.method2112(true, arg0, arg1);
        } else {
            return true;
        }
    }
}
