import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class173 extends class307 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lwi;")
    public static class330 field2324 = new class330(10);

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lfg;")
    public static class84 field2328 = new class84(7, 0, 1, 1);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Ldq;")
    public static class500 field2329;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method1171(byte arg0) {
        class143.field1915 = true;
        if (arg0 == -32) {
            field2325++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
    public static final void method1172(long arg0, int arg1) {
        field2327++;
        class538.field7879.field2185 = 0;
        if (arg1 >= -14) {
            field2324 = null;
        }
        class538.field7879.method1072((byte) 102, class198.field2630.field6547);
        class538.field7879.method1054(arg0, -713416072);
        class538.field7879.method1072((byte) 102, class257.field3556);
        class342.field5272 = -3;
        class290.field4252 = 0;
        class351.field5430 = 1;
        class439.field6620 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method1173(byte arg0) {
        field2328 = null;
        field2329 = null;
        if (arg0 != -21) {
            field2328 = null;
        }
        field2324 = null;
    }
}
