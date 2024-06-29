import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class393 extends class168 {

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public int field4992;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lhg;")
    public static class693 field4991 = new class693(44, 0);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "[I")
    public static int[] field4990;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZILnd;III)V")
    public static final void method2216(boolean arg0, int arg1, class547 arg2, int arg3, int arg4, int arg5) {
        class639.method3583((long) arg3, arg2, (byte) 24, arg1, arg0, arg5, arg4);
        field4989++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void method2217(int arg0) {
        field4990 = null;
        field4991 = null;
        if (arg0 > -37) {
            method2216(false, -123, null, 87, 71, 105);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class393() {
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V")
    public class393(int arg0) {
        this.field4992 = arg0;
    }
}
