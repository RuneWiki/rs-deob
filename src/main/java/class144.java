import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class144 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field2284 = 0;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
    public static int[] field2286 = new int[32768];

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lng;")
    public static class245 field2285;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1007(int arg0) {
        field2285 = null;
        if (arg0 != 32768) {
            field2288 = 68;
        }
        field2286 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method1008(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class334.field5199 * arg1 >> 8;
        if (var4 != 0 && arg0 != -1) {
            class101.method686(0, false, arg0, class269.field4142, var4, 0);
            class58.field826 = true;
        }
        if (arg3 == -1448946488) {
            field2282++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZI)V", line = 52)
    public static final void method1009(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method1007(-117);
        }
        field2283++;
        class75 var4 = class204.method1371(11, 7, arg1);
        var4.method524((byte) 57);
        var4.field1124 = arg3;
        var4.field1122 = arg0;
    }
}
