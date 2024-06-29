import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class250 implements class493 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lwp;")
    public static class452 field3132 = null;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lsea;")
    public static class319 field3133 = new class319();

    @OriginalMember(owner = "client!an", name = "c", descriptor = "F")
    public static float field3134;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method1474(byte arg0) {
        field3133 = null;
        field3132 = null;
        if (arg0 != -84) {
            method1474((byte) -101);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lwd;[IZJ)Ljava/lang/String;")
    public final String method1475(class357 arg0, int[] arg1, boolean arg2, long arg3) {
        field3135++;
        if (class470.field6745 == arg0) {
            class553 var6 = class442.field6236.method2963(arg1[0], 124);
            return var6.method3140(true, (int) arg3);
        } else if (class430.field6099 == arg0 || class61.field628 == arg0) {
            class487 var7 = class19.field153.method272((int) arg3, -11824);
            return var7.field7027;
        } else if (arg2) {
            return null;
        } else if (class243.field3001 == arg0 || class407.field5436 == arg0 || class299.field3723 == arg0) {
            return class442.field6236.method2963(arg1[0], 117).method3140(!arg2, (int) arg3);
        } else {
            return null;
        }
    }
}
