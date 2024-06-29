import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class198 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1551(int arg0, int arg1, int arg2) {
        field3241++;
        return arg0 == -13118 ? class182.method1482(arg1, arg2, (byte) -4) & class51.method580(-1, arg2, arg1) : false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lri;[ILri;B)V", line = 18)
    public static final void method1552(class97 arg0, int[] arg1, class97 arg2, byte arg3) {
        int var4 = 114 % ((arg3 + 4) / 55);
        if (arg1 != null) {
            class345.field5562 = arg1;
        }
        field3242++;
        class290.field4593 = arg2;
        class499.field7328 = arg0;
    }
}
