import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class244 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
    public static int[] field4251 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field4245 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4248 = -1;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Z")
    public static boolean field4253 = false;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1664(int arg0) {
        field4251 = null;
        if (arg0 != -17432) {
            field4251 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static final void method1665(int arg0) {
        field4250++;
        if (class133.field2330 != null) {
            class133.field2330.method594(-120);
        }
        if (class219.field3664 != null) {
            class219.field3664.method594(-115);
        }
        if (arg0 != 0) {
            field4251 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static final void method1666(int arg0) {
        field4252++;
        if (arg0 != 0) {
            field4247 = -21;
        }
        class74.field1387.method762((byte) 117);
        class78.field1444.method762((byte) 117);
        class187.field3100.method762((byte) 117);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBI)V")
    public static final void method1667(int arg0, int arg1, byte arg2, int arg3) {
        field4246++;
        if (arg2 != -126) {
            field4253 = true;
        }
        if (class196.field3249 == 0 || arg1 == 0 || class6.field72 >= 50 || arg3 == -1) {
            return;
        }
        class53.field965[class6.field72] = arg3;
        class10.field283[class6.field72] = arg1;
        class178.field2981[class6.field72] = arg0;
        class187.field3077[class6.field72] = null;
        class96.field1806[class6.field72] = 0;
        class6.field72++;
    }
}
