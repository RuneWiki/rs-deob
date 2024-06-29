import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class450 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[I")
    public static int[] field6373 = new int[2048];

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lec;")
    public static class40 field6371 = new class40("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "F")
    public static float field6374;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public static void method2636(byte arg0) {
        if (arg0 != 19) {
            field6373 = null;
        }
        field6371 = null;
        field6373 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2637(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6372++;
        if (arg4 != -73) {
            method2636((byte) -105);
        }
        if (arg1 >= class75.field912 && class453.field6396 >= arg5 && arg3 >= class357.field5123 && class328.field4729 >= arg2) {
            if (arg0 == 1) {
                class115.method567(arg2, arg1, arg6, false, arg3, arg5);
            } else {
                class239.method1314(arg5, arg2, arg6, arg1, arg0, arg3, -27997);
            }
        } else if (arg0 == 1) {
            class468.method2742(205, arg2, arg1, arg5, arg6, arg3);
        } else {
            class471.method2784(arg1, arg0, arg2, 123, arg3, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIIIBII)V")
    public static final void method2638(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class308.field4527 = arg1;
        class315.field4612 = arg3;
        class305.field4509 = arg0;
        class371.field5318 = arg6;
        class398.field5664 = arg2;
        class86.field1054 = arg5;
        if (arg4 <= 64) {
            method2638(45, -39, -115, 59, (byte) -24, -20, 80);
        }
        field6370++;
    }
}
