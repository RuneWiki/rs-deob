import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ldc;")
    public static class37 field1260 = class185.method1233((byte) 86, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[Lg;")
    public static class66[] field1262 = new class66[32768];

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Ldc;")
    public static class37 field1265 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    public static short[] field1268 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Ldc;")
    private static class37 field1261 = class185.method1233((byte) 86, "Attack");

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ldc;")
    public static class37 field1266 = field1261;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1264 = Calendar.getInstance();

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Ldc;")
    private static class37 field1270 = class185.method1233((byte) 86, "red:");

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Ldc;")
    public static class37 field1272 = field1270;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Ldc;")
    public static class37 field1271 = field1270;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[Lmf;")
    public static class136[] field1263;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIILia;Lia;IIJ)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, class88 arg4, class88 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class184 var10 = new class184();
        var10.field3409 = arg8;
        var10.field3393 = arg1 * 128 + 64;
        var10.field3401 = arg2 * 128 + 64;
        var10.field3405 = arg3;
        var10.field3399 = arg4;
        var10.field3404 = arg5;
        var10.field3397 = arg6;
        var10.field3408 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class180.field3354[var11][arg1][arg2] == null) {
                class180.field3354[var11][arg1][arg2] = new class18(var11, arg1, arg2);
            }
        }
        class180.field3354[arg0][arg1][arg2].field292 = var10;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method510(byte arg0) {
        field1264 = null;
        field1270 = null;
        field1262 = null;
        field1260 = null;
        field1271 = null;
        field1266 = null;
        field1272 = null;
        field1265 = null;
        field1263 = null;
        field1268 = null;
        if (arg0 <= -122) {
            field1261 = null;
        }
    }
}
