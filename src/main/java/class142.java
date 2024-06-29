import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class142 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lda;")
    public static class275 field2500 = class255.method1672(125, "Cache:");

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2502 = -1;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lma;")
    public static class105 field2501;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Ld;")
    public static class65 field2504;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZIJ)Lda;")
    public static final class275 method1021(int arg0, int arg1, boolean arg2, int arg3, long arg4) {
        field2503++;
        if (arg3 != 1868) {
            return null;
        }
        class275 var6 = class169.method1160(0, 123);
        if (arg4 < 0L) {
            var6.method1835(class201.field3434, 0);
            arg4 = -arg4;
        }
        class275 var7 = class219.field3719;
        class275 var8 = class276.field4819;
        if (arg0 == 1) {
            var8 = class219.field3719;
            var7 = class276.field4819;
        }
        if (arg0 == 2) {
            var7 = class276.field4819;
            var8 = class216.field3693;
        }
        class275 var9 = class169.method1160(0, 94);
        class275 var10 = class169.method1160(0, arg3 ^ 0x772);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1835(class250.method1644((int) (arg4 % 10L), (byte) -115), arg3 ^ 0x74C);
            arg4 /= 10L;
        }
        int var12 = 0;
        if (arg4 == 0L) {
            var9 = class161.field2823;
        }
        while (arg4 > 0L) {
            if (arg2 && var12 != 0 && var12 % 3 == 0) {
                var9.method1835(var8, 0);
            }
            var9.method1835(class250.method1644((int) (arg4 % 10L), (byte) -115), arg3 ^ 0x74C);
            arg4 /= 10L;
            var12++;
        }
        if (var10.method1838(3) > 0) {
            var10.method1835(var7, 0);
        }
        return class197.method1291(new class275[] { var6, var9.method1853(-25900), var10.method1853(-25900) }, -30025);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIILak;IJIIII)Z")
    public static final boolean method1022(int arg0, int arg1, int arg2, int arg3, class234 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class231.method1499(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILma;)[Lwb;")
    public static final class179[] method1023(int arg0, int arg1, int arg2, class105 arg3) {
        field2499++;
        if (arg0 == -17933) {
            return class210.method1353(arg1, arg3, arg2, (byte) -98) ? class49.method311(arg0 + 17830) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field2501 = null;
        field2504 = null;
        field2500 = null;
        if (arg0 != 0) {
            method1022(-92, -64, 25, -126, (class234) null, 44, 83L, 0, -73, -46, -7);
        }
    }
}
