import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class284 extends class75 {

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "Lpr;")
    public static class407 field3599 = new class407(10, -1);

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "Lgl;")
    public static class547 field3603 = new class547(14, 7);

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "J")
    public static long field3604 = 0L;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Lxa;")
    public static class458 field3601;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIBI)V", line = 13)
    public static final void method1615(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class58.field602 <= arg1 && arg1 <= class501.field7217) {
            int var5 = class512.method2932((byte) -46, arg4, class163.field1942, class326.field4246);
            int var6 = class512.method2932((byte) -46, arg0, class163.field1942, class326.field4246);
            class399.method2184(arg2, var5, arg1, var6, true);
        }
        field3602++;
        if (arg3 > -127) {
            method1615(62, 93, 64, (byte) -54, -62);
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 32)
    public static void method1616(int arg0) {
        field3599 = null;
        field3601 = null;
        field3603 = null;
        if (arg0 != 10) {
            method1615(-5, 78, 67, (byte) -34, -105);
        }
    }
}
