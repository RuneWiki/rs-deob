import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class436 extends class264 {

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
    public static boolean field6366 = false;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[I")
    public static int[] field6365 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "[I")
    public static int[] field6369 = new int[2];

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lon;")
    public static class37 field6368;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)I")
    public abstract int method2437(byte arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
    public static final void method2685(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class147.field1996; var5++) {
            Rectangle var6 = class267.field3958[var5];
            if (arg2 < (var6.x + var6.width) && (arg2 + arg3) > var6.x && arg0 < var6.y + var6.height && arg0 + arg4 > var6.y) {
                class67.field895[var5] = true;
            }
        }
        if (arg1 != 13435) {
            field6369 = null;
        }
        field6367++;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)J")
    public abstract long method2436(byte arg0);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)I")
    public abstract int method2440(int arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIZLct;B)V")
    public static final void method2686(int arg0, int arg1, int arg2, int arg3, boolean arg4, class104 arg5, byte arg6) {
        if (arg6 != -58) {
            field6369 = null;
        }
        class316.field4628 = arg2;
        class82.field1008 = 1;
        class169.field2214 = arg4;
        class67.field897 = arg0;
        field6370++;
        class71.field928 = arg1;
        class286.field4209 = arg5;
        class182.field2563 = arg3;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)I")
    public abstract int method2441(int arg0);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public static void method2687(int arg0) {
        field6365 = null;
        field6368 = null;
        if (arg0 == -4) {
            field6369 = null;
        }
    }
}
