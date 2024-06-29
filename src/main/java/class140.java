import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class140 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
    public static boolean field2406 = false;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lpj;")
    private static class237 field2408 = class33.method353("wave2:", 94);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lpj;")
    public static class237 field2404 = field2408;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lpj;")
    public static class237 field2409 = field2408;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method964(boolean arg0) {
        if (arg0) {
            field2408 = null;
            field2409 = null;
            field2404 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method965(int arg0) {
        field2410++;
        class206.field3510.method934((byte) 62);
        class112.field1955.method934((byte) 62);
        class174.field3043.method934((byte) 62);
        if (arg0 != -2064) {
            method965(74);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIJZ)Lpj;")
    public static final class237 method966(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field2405++;
        class237 var6 = class240.method1666(0, true);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method1612((byte) -113, class204.field3491);
        }
        class237 var7 = class39.field895;
        class237 var8 = class205.field3500;
        if (arg0 == 1) {
            var7 = class205.field3500;
            var8 = class39.field895;
        }
        if (arg0 == 2) {
            var8 = class245.field4290;
            var7 = class205.field3500;
        }
        class237 var9 = class240.method1666(0, true);
        class237 var10 = class240.method1666(0, true);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1612((byte) -95, class14.method130((int) (arg3 % 10L), (byte) 117));
            arg3 /= 10L;
        }
        if (arg3 == 0L) {
            var9 = class124.field2182;
        }
        int var12 = arg2;
        while (arg3 > 0L) {
            if (arg4 && var12 != 0 && var12 % 3 == 0) {
                var9.method1612((byte) -107, var8);
            }
            var9.method1612((byte) -95, class14.method130((int) (arg3 % 10L), (byte) 117));
            arg3 /= 10L;
            var12++;
        }
        if (var10.method1588(false) > 0) {
            var10.method1612((byte) -107, var7);
        }
        return class238.method1626(new class237[] { var6, var9.method1591(arg2), var10.method1591(0) }, -73);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method967(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg2 > arg1) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class122 var9 = class146.field2610[var7];
            class146.field2610[var7] = class146.field2610[arg2];
            class146.field2610[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (class231.method1531(var9, arg6, arg0, arg5, arg4, class146.field2610[var10], (byte) 113) <= 0) {
                    class122 var11 = class146.field2610[var10];
                    class146.field2610[var10] = class146.field2610[var8];
                    class146.field2610[var8++] = var11;
                }
            }
            class146.field2610[arg2] = class146.field2610[var8];
            class146.field2610[var8] = var9;
            method967(arg0, arg1, var8 - 1, 13474, arg4, arg5, arg6);
            method967(arg0, var8 + 1, arg2, 13474, arg4, arg5, arg6);
        }
        if (arg3 != 13474) {
            field2409 = null;
        }
        field2407++;
    }
}
