import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class200 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lud;")
    private static class279 field3569 = class130.method1024("Loading )2 please wait)3", 255);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lud;")
    public static class279 field3575 = field3569;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Z")
    public static boolean field3571 = false;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field3579 = new int[32768];

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[S")
    public static short[] field3577 = new short[] { 59, 12, 20, 60, 51, 4, 57, 48 };

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public static int[] field3576 = new int[25];

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    public static int[] field3574;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
    public static int[] field3581;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 19)
    public static void method1486(int arg0) {
        field3574 = null;
        field3576 = null;
        field3581 = null;
        field3575 = null;
        field3569 = null;
        field3579 = null;
        field3577 = null;
        if (arg0 != 22657) {
            field3579 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;", line = 38)
    public static final Object method1487(boolean arg0, byte arg1, byte[] arg2) {
        field3580++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class42.field881) {
            try {
                class324 var3 = (class324) Class.forName("wm").getDeclaredConstructor().newInstance();
                var3.method1201(arg2, (byte) 75);
                return var3;
            } catch (Throwable var5) {
                class42.field881 = true;
            }
        }
        if (arg1 == 119) {
            return arg0 ? class153.method1210(arg2, (byte) -119) : arg2;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lud;I)V", line = 74)
    public static final void method1488(class279 arg0, int arg1) {
        field3570++;
        if (arg1 != 57) {
            return;
        }
        for (class43 var2 = (class43) class119.field2144.method2248(125); var2 != null; var2 = (class43) class119.field2144.method2240(1138)) {
            if (var2.field896.method1990((byte) 51, arg0)) {
                class85.field1609 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lok;I)V", line = 107)
    public static final void method1489(class149 arg0, int arg1) {
        field3582++;
        class69.field1364 = arg0;
        if (arg1 <= 82) {
            field3574 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZFIIIBI)[I", line = 142)
    public static final int[] method1490(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int[] var8 = new int[arg3];
        field3583++;
        class214 var9 = new class214();
        var9.field3767 = arg4;
        if (arg6 != -105) {
            method1488((class279) null, 118);
        }
        var9.field3757 = arg0;
        var9.field3770 = arg1;
        var9.field3771 = (int) (arg2 * 4096.0F);
        var9.field3768 = arg5;
        var9.field3761 = arg7;
        var9.method627(7);
        class163.method1281(true, 1, arg3);
        var9.method1571(0, -16421, var8);
        return var8;
    }
}
