import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class347 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lida;")
    public static class238 field4621;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2026(boolean arg0) {
        if (arg0) {
            field4621 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBII)V", line = 16)
    public static final void method2027(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 3 / ((-arg2 - 10) / 58);
        if (arg4 >= class759.field10576 && class29.field238 >= arg4) {
            int var6 = class105.method716(false, class165.field2070, class122.field1604, arg1);
            int var7 = class105.method716(false, class165.field2070, class122.field1604, arg3);
            class505.method2816((byte) -125, arg0, var6, var7, arg4);
        }
        field4620++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2028(byte arg0) {
        field4622++;
        class497.field6761.method1563(77);
        class385.field5412.method1563(119);
        class144.field1866.method1563(47);
        if (arg0 > -20) {
            method2026(true);
        }
        class460.field6371.method1563(108);
    }
}
