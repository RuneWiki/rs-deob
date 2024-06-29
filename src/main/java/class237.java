import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class237 extends class105 {

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field3881;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Z")
    public static boolean field3880 = true;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Lqu;")
    public static class219 field3884 = new class219(77, 7);

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Lqu;")
    public static class219 field3885 = new class219(1, -1);

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Lmn;")
    public static class162 field3886;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[I")
    public static int[] field3882;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method226(int arg0) {
        if (arg0 != 1) {
            this.method226(119);
        }
        field3879++;
        return this.field3881;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ldd;Ljava/lang/Object;I)V")
    public class237(class480 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3881 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V")
    public static void method1668(boolean arg0) {
        if (!arg0) {
            field3886 = null;
            field3885 = null;
            field3884 = null;
            field3882 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)Z")
    public final boolean method227(int arg0) {
        if (arg0 < 101) {
            this.field3881 = null;
        }
        field3883++;
        return false;
    }
}
