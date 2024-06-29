import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class232 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4239 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Ldc;")
    public static class37 field4237 = class185.method1233((byte) 86, "<col=ff0000>");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ldc;")
    public static class37 field4235 = class185.method1233((byte) 86, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ldc;")
    public static class37 field4240 = class185.method1233((byte) 86, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class127 var8 = new class127();
        var8.field2370 = arg2 / 128;
        var8.field2343 = arg3 / 128;
        var8.field2352 = arg4 / 128;
        var8.field2365 = arg5 / 128;
        var8.field2377 = arg1;
        var8.field2376 = arg2;
        var8.field2358 = arg3;
        var8.field2373 = arg4;
        var8.field2359 = arg5;
        var8.field2356 = arg6;
        var8.field2351 = arg7;
        class88.field1540[arg0][class88.field1544[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            field4235 = null;
        }
        field4238++;
        int var6 = class196.method1308(72, class198.field3697, arg0, class199.field3712);
        int var7 = class196.method1308(92, class198.field3697, arg3, class199.field3712);
        int var8 = class196.method1308(69, class29.field536, arg1, class82.field1458);
        int var9 = class196.method1308(107, class29.field536, arg5, class82.field1458);
        for (int var10 = var6; var10 <= var7; var10++) {
            class29.method242(var9, (byte) -30, arg2, class11.field156[var10], var8);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    public static final int method1499(int arg0, int arg1) {
        field4241++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 != 8) {
            return 5;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        field4235 = null;
        field4237 = null;
        field4240 = null;
        if (arg0 >= -126) {
            field4237 = null;
        }
    }
}
