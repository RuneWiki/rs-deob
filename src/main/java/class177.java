import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class177 {

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lmt;")
    public static class680 field2496 = new class680();

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Z")
    public static boolean field2497 = false;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field2499 = -1;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public int field2492;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lhe;IIIIIZLhe;II)V")
    public static final void method1199(class231 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class231 arg7, int arg8, int arg9) {
        field2493++;
        int var10 = arg0.method1436((byte) -109);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class532 var12 = (class532) class643.field8895.method2176(-126, (long) var10);
        if (var12 == null) {
            class92[] var13 = class92.method512(class390.field5228, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class146.field1963.method1139(var13[0], true);
            class643.field8895.method2174(var12, (long) var10, (byte) -18);
        }
        class452.method2540(0, arg7.method1435((byte) 76) * 256, arg7.field397, arg7.field385, arg3 >> 1, arg2, arg7.field398, arg8 >> 1, arg4, 512);
        int var14 = arg1 + class289.field3821[0] - 18;
        int var15 = arg5 + class289.field3821[1] - 54 - 16;
        int var16 = arg9 / 4 * 18 + var14;
        int var17 = arg9 % 4 * 18 + var15;
        var12.method2990(var16, var17);
        if (arg0 == arg7) {
            class146.field1963.method3126(var17 - 1, var16 - 1, 18, 1, 18, -256);
        }
        class501 var18 = class11.method66(-67);
        var18.field6887 = var17 + 16;
        var18.field6885 = var16;
        var18.field6890 = var16 + 16;
        var18.field6883 = arg0;
        var18.field6886 = var17;
        if (!arg6) {
            field2499 = -106;
        }
        class217.field2853.method1300(var18, -1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method1200(int arg0) {
        if (arg0 == 0) {
            field2496 = null;
        }
    }
}
