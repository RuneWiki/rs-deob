import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class269 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lbg;")
    public static class310 field4066 = new class310(25, -1);

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4068 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method1634(int arg0, boolean arg1) {
        field4067++;
        if (!arg1) {
            class64 var2 = class230.method1387(arg0, (byte) 40, 9);
            var2.method446(-20033);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([[II)V", line = 19)
    public static final void method1635(int[][] arg0, int arg1) {
        int var2 = 40 % ((arg1 - 57) / 41);
        class69.field1212 = arg0;
        field4065++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 36)
    public static void method1636(int arg0) {
        if (arg0 <= 68) {
            field4068 = -104;
        }
        field4066 = null;
    }
}
