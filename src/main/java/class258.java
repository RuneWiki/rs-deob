import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class258 {

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Z")
    public boolean field4561 = false;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lsf;")
    private static class108 field4555 = class140.method973(255, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lsf;")
    public static class108 field4558 = field4555;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4562 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public int field4563;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "J")
    public long field4560;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lma;")
    public class290 field4557;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIILma;IJ)Z", line = 18)
    public static final boolean method1835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class290 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class121.method850(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1836(int arg0) {
        class272.field4753.method639(arg0 ^ 0xFFFFFF07);
        field4554++;
        if (arg0 != 128) {
            field4558 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 60)
    public static void method1837(boolean arg0) {
        field4558 = null;
        field4555 = null;
        if (arg0) {
            field4562 = 15;
        }
    }
}
