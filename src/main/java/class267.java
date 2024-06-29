import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class267 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "J")
    public long field4408 = 0L;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[Lna;")
    public static class26[] field4406 = new class26[200];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "D")
    public static double field4410 = -1.0D;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lna;")
    public static class26 field4411 = class69.method505("(Udns", (byte) -118);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lve;")
    public static class266 field4420;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lbd;")
    public static class306 field4418;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lth;")
    public class86 field4409;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lth;")
    public class86 field4412;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 19)
    public static void method1901(byte arg0) {
        if (arg0 != -87) {
            field4406 = (class26[]) null;
        }
        field4420 = null;
        field4411 = null;
        field4406 = null;
        field4418 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lve;ZIIZI)V", line = 42)
    public static final void method1902(class266 arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4417++;
        class225.field3570 = arg0;
        class306.field5280 = 1;
        class264.field4314 = arg5;
        class108.field1701 = arg3;
        class261.field4269 = arg2;
        class224.field3536 = arg4;
        if (arg1) {
            field4414 = 125;
        }
        class300.field5172 = 10000;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLpb;ILkm;IILe;)V", line = 61)
    public static final void method1903(int arg0, boolean arg1, class78 arg2, int arg3, class324 arg4, int arg5, int arg6, class159 arg7) {
        field4413++;
        if (arg1) {
            field4407 = 94;
        }
        class224 var8 = new class224();
        var8.field3532 = arg0 * 128;
        var8.field3553 = arg5 * 128;
        var8.field3539 = arg6;
        if (arg2 != null) {
            var8.field3561 = arg2.field1241;
            var8.field3555 = arg2.field1177 * 128;
            var8.field3552 = arg2.field1210;
            var8.field3546 = arg2;
            var8.field3559 = arg2.field1207;
            var8.field3535 = arg2.field1215;
            int var9 = arg2.field1171;
            int var10 = arg2.field1178;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg2.field1178;
                var10 = arg2.field1171;
            }
            var8.field3531 = (arg0 + var10) * 128;
            var8.field3547 = (arg5 + var9) * 128;
            if (arg2.field1222 != null) {
                var8.field3556 = true;
                var8.method1493(1);
            }
            if (var8.field3561 != null) {
                var8.field3541 = var8.field3535 + ((int) (Math.random() * (double) (var8.field3552 - var8.field3535)));
            }
            class147.field2306.method257(!arg1, var8);
        } else if (arg4 != null) {
            var8.field3550 = arg4;
            class187 var11 = arg4.field5565;
            if (var11.field2953 != null) {
                var8.field3556 = true;
                var11 = var11.method1273((byte) -112);
            }
            if (var11 != null) {
                var8.field3531 = (var11.field2894 + arg0) * 128;
                var8.field3547 = (arg5 + var11.field2894) * 128;
                var8.field3559 = class83.method649(arg4, -1);
                var8.field3555 = var11.field2952 * 128;
            }
            class285.field4793.method257(true, var8);
        } else if (arg7 != null) {
            var8.field3554 = arg7;
            var8.field3547 = (arg7.method1078((byte) 114) + arg5) * 128;
            var8.field3531 = (arg7.method1078((byte) 114) + arg0) * 128;
            var8.field3559 = class138.method922(0, arg7);
            var8.field3555 = arg7.field2498 * 128;
            class94.field1538.method1826(1, var8, arg7.field2495.method209(-112));
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILve;Lve;I)Ldd;", line = 155)
    public static final class248 method1904(int arg0, int arg1, class266 arg2, class266 arg3, int arg4) {
        field4423++;
        if (class196.method1317(arg3, arg1, arg0, arg4 ^ 0x78B4)) {
            if (arg4 != -1) {
                method1901((byte) -124);
            }
            return class283.method1995(arg2.method1889(arg0, (byte) -122, arg1), 25208);
        } else {
            return null;
        }
    }
}
