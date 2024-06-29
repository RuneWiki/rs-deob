import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class359 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[I")
    public static int[] field4756 = new int[1];

    @OriginalMember(owner = "client!du", name = "a", descriptor = "[I")
    public static int[] field4755 = null;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method2063(int arg0) {
        int var1 = -54 / ((arg0 + 61) / 37);
        field4755 = null;
        field4756 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLjava/lang/String;III)V")
    public static final void method2064(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
        field4757++;
        if (arg3 == -1) {
            class201.method1110(arg0, arg4, arg1, 2, null, false, arg2);
        }
    }
}
