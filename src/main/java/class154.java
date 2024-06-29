import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class154 {

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "[[B")
    public static byte[][] field2549 = new byte[250][];

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1158(int arg0) {
        if (arg0 == 5983) {
            field2549 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2551++;
        if (class56.method437((byte) 61, arg3)) {
            class47.method371(arg2, arg0, arg1, arg4, class265.field3806[arg3], 0);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)I")
    public static final int method1160(int arg0) {
        int var1 = -73 % ((arg0 + 57) / 33);
        field2552++;
        if (class35.field490 == null) {
            return class23.field316 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V")
    public static final void method1161(int arg0, int arg1, int arg2) {
        field2550++;
        if (arg0 != -26076) {
            method1161(51, 53, -67);
        }
        class449 var3 = class611.method3463(arg1, (byte) -121, 13);
        var3.method2615((byte) -98);
        var3.field6472 = arg2;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)Z")
    public static final boolean method1162(byte arg0) {
        if (arg0 != 47) {
            method1158(-25);
        }
        field2548++;
        return class568.field8311 == 0 ? class43.field585.method1803((byte) 124) : true;
    }
}
