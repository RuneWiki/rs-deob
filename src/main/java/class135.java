import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class135 extends class414 {

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public int field2401 = -1;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field2398 = 1339;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
    public static boolean field2400 = false;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "J")
    public static long field2392;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "Lom;")
    public static class344 field2394;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "Ljava/lang/String;")
    public String field2396;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/lang/String;")
    public String field2399;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIZI)V")
    public static final void method1112(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (int var5 = 0; ~class152.field2587 < ~var5; ++var5) {
            Rectangle var6 = class293.field4404[var5];
            if (~(var6.x + var6.width) < ~arg1 && ~(arg1 + arg4) < ~var6.x && var6.y + var6.height > arg2 && var6.y < arg0 + arg2) {
                class480.field6901[var5] = true;
            }
        }
        if (!arg3) {
            field2394 = null;
        }
        ++field2393;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
    public static void method1113(byte arg0) {
        if (arg0 <= -27) {
            field2394 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)Ljr;")
    public final class96 method1114(int arg0) {
        if (arg0 != -22049) {
            this.method1114(8);
        }
        ++field2397;
        return class339.field5054[super.field6006];
    }
}
