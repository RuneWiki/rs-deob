import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class169 extends class113 {

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public int field3376 = 1000;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Lcd;")
    public static class23 field3372 = class54.method414("(U0a )2 via: ", -1);

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "[I")
    public static int[] field3379 = new int[2000];

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Lcd;")
    public static class23 field3373 = class54.method414("<col=ff9040>", -1);

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "Lcd;")
    public static class23 field3378 = class54.method414("Zu viele Anmelde)2Versuche von Ihrer Adresse", -1);

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "[I")
    public static int[] field3375;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "[Loe;")
    public static class130[] field3377;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)I")
    public static final int method1036(int arg0, int arg1, int arg2, int arg3) {
        field3374++;
        if (arg3 >= -18) {
            field3378 = null;
        }
        if ((class53.field1253[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class53.field1253[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)Lbh;")
    public class18 method31(int arg0) {
        if (arg0 > -101) {
            field3379 = null;
        }
        field3369++;
        return null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field3378 = null;
        field3379 = null;
        field3377 = null;
        field3373 = null;
        field3375 = null;
        if (arg0 != -115) {
            method1036(-18, -56, -85, -57);
        }
        field3372 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIIII)V")
    public void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3380++;
        class18 var10 = this.method31(-116);
        if (var10 != null) {
            this.field3376 = var10.field3376;
            var10.method355(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
