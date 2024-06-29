import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class288 {

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4597 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "S")
    public static short field4599 = 1;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4594 = "Created gameworld";

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "F")
    public static float field4590 = 128.0F;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field4602 = 0;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4598 = "scroll:";

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lkh;")
    public static class17 field4592;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[Lwb;")
    public static class171[] field4593;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILqe;ILu;Lie;)V", line = 23)
    public static final void method1962(int arg0, int arg1, int arg2, int arg3, class205 arg4, int arg5, class278 arg6, class97 arg7) {
        if (arg1 != 18913) {
            method1962(-40, 30, 17, -62, (class205) null, -62, (class278) null, (class97) null);
        }
        field4591++;
        class261 var8 = new class261();
        var8.field4230 = arg0 * 128;
        var8.field4219 = arg5;
        var8.field4228 = arg2 * 128;
        if (arg7 != null) {
            var8.field4221 = arg7.field1547;
            var8.field4238 = arg7.field1507;
            var8.field4235 = arg7.field1567;
            var8.field4232 = arg7;
            var8.field4239 = arg7.field1541 * 128;
            var8.field4224 = arg7.field1577;
            int var9 = arg7.field1549;
            int var10 = arg7.field1559;
            var8.field4223 = arg7.field1557;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg7.field1549;
                var9 = arg7.field1559;
            }
            var8.field4225 = (arg2 + var9) * 128;
            var8.field4220 = (arg0 + var10) * 128;
            if (arg7.field1579 != null) {
                var8.field4216 = true;
                var8.method1802(128);
            }
            if (var8.field4238 != null) {
                var8.field4237 = var8.field4221 + (int) ((double) (var8.field4224 - var8.field4221) * Math.random());
            }
            class262.field4251.method2303((byte) -124, var8);
        } else if (arg6 != null) {
            class12 var11 = arg6.field4413;
            var8.field4234 = arg6;
            if (var11.field179 != null) {
                var8.field4216 = true;
                var11 = var11.method122(54);
            }
            if (var11 != null) {
                var8.field4225 = (arg2 + var11.field202) * 128;
                var8.field4220 = (var11.field202 + arg0) * 128;
                var8.field4223 = class28.method257(arg1 ^ 0x1E60, arg6);
                var8.field4239 = var11.field173 * 128;
                var8.field4235 = var11.field185;
            }
            class184.field3119.method2303((byte) -124, var8);
        } else if (arg4 != null) {
            var8.field4231 = arg4;
            var8.field4220 = (arg0 + arg4.method987(3047)) * 128;
            var8.field4225 = (arg2 + arg4.method987(3047)) * 128;
            var8.field4223 = class143.method1157(14845, arg4);
            var8.field4235 = arg4.field3505;
            var8.field4239 = arg4.field3483 * 128;
            class305.field4831.method725(class142.method1151(arg4.field3491, arg1 - 19036), var8, 1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 118)
    public static void method1963(byte arg0) {
        field4592 = null;
        field4593 = null;
        field4594 = null;
        field4598 = null;
        field4597 = null;
        if (arg0 < 1) {
            method1963((byte) 115);
        }
    }
}
