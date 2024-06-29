import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class219 extends class430 {

    @OriginalMember(owner = "client!go", name = "j", descriptor = "S")
    public short field3265;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
    public static int[] field3262 = new int[4];

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field3266 = -1;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Leg;")
    public static final class317 method1543(int arg0) {
        field3264++;
        if (arg0 != 29190) {
            method1545(false, -24, 87, null, -63, -103);
        }
        return class36.field325;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field3262 = null;
        if (arg0 != 19169) {
            method1543(-39);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIILla;II)V")
    public static final void method1545(boolean arg0, int arg1, int arg2, class423 arg3, int arg4, int arg5) {
        field3263++;
        class545.method3280((byte) -88, arg3, arg2, arg4, (long) arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class219() {
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(S)V")
    public class219(short arg0) {
        this.field3265 = arg0;
    }
}
