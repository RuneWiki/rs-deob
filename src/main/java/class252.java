import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class252 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3974 = -1;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[S")
    public static short[] field3971 = new short[] { 14, 57, 25, 40, 44, 50, 19, 6 };

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3979 = "Attack";

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ll;")
    public static class133 field3976;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIILwb;Lwb;IIIIJ)V", line = 8)
    public static final void method1743(int arg0, int arg1, int arg2, int arg3, class253 arg4, class253 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class228 var12 = new class228();
        var12.field3631 = arg10;
        var12.field3621 = arg1 * 128 + 64;
        var12.field3634 = arg2 * 128 + 64;
        var12.field3630 = arg3;
        var12.field3623 = arg4;
        var12.field3628 = arg5;
        var12.field3624 = arg6;
        var12.field3632 = arg7;
        var12.field3633 = arg8;
        var12.field3622 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class256.field4013[var13][arg1][arg2] == null) {
                class256.field4013[var13][arg1][arg2] = new class142(var13, arg1, arg2);
            }
        }
        class256.field4013[arg0][arg1][arg2].field2194 = var12;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgi;", line = 38)
    public static final class274 method1744(Throwable arg0, String arg1) {
        field3978++;
        class274 var2;
        if (arg0 instanceof class274) {
            var2 = (class274) arg0;
            var2.field4236 = var2.field4236 + ' ' + arg1;
        } else {
            var2 = new class274(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 59)
    public static void method1745(byte arg0) {
        if (arg0 >= -119) {
            field3976 = (class133) null;
        }
        field3976 = null;
        field3979 = null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public abstract void method1210(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public abstract void method1204(int arg0, int arg1, int arg2);
}
