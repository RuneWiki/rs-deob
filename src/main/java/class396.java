import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class396 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public int[] field5945;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    public int[] field5946;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5942 = 2;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
    public static boolean field5947 = false;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5948 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lqj;")
    public static class238 field5944;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Loq;IIII)V")
    public static final void method2590(class120 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class433.method2751(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class308.field4403) {
            class433.method2751(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class433.method2751(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class413.field6175) {
            class433.method2751(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class413.field6175) {
            class433.method2751(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class308.field4403 && arg4 <= class413.field6175) {
            class433.method2751(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class433.method2751(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class308.field4403 && arg4 > 0) {
            class433.method2751(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method2591(byte arg0) {
        if (arg0 == 113) {
            field5944 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class396(int arg0) {
        this.field5943 = arg0;
        this.field5945 = new int[this.field5943];
        this.field5946 = new int[this.field5943];
    }
}
