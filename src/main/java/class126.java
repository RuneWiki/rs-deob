import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class126 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lie;")
    public static class2 field2123 = new class2();

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[I")
    public static int[] field2128;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method964(int arg0) {
        field2128 = null;
        if (arg0 <= -40) {
            field2123 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static final void method965(boolean arg0) {
        class166.method1189(74, false);
        if (!arg0) {
            field2127 = 114;
        }
        System.gc();
        field2124++;
        class79.method586(-1, 25);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBII)V")
    public static final void method966(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 34) {
            field2129 = -94;
        }
        if ((arg0 - arg3) >= class264.field4230 && arg0 + arg3 <= class273.field4418 && class73.field1156 <= (arg1 - arg3) && arg1 + arg3 <= class59.field859) {
            class99.method781(arg3, -25158, arg4, arg0, arg1);
        } else {
            class249.method1718(false, arg4, arg3, arg1, arg0);
        }
        field2121++;
    }
}
