import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class127 extends class89 {

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field2321 = 7759444;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Lqe;")
    public static class179 field2324 = class206.method1380("titlebox", (byte) -128);

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lqe;")
    public static class179 field2326 = class206.method1380("::tele 0)1", (byte) -126);

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lqe;")
    private static class179 field2329 = class206.method1380("Please wait 1 minute and try again)3", (byte) -14);

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lqe;")
    public static class179 field2320 = field2329;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Lqe;")
    public static class179 field2327 = field2329;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lb;")
    public class12 field2325;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lpc;")
    public static class166 field2318;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Lee;")
    public class49 field2319;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "[B")
    public byte[] field2317;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)I")
    public static final int method819(byte arg0) {
        field2330++;
        if (arg0 <= 6) {
            field2318 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method820(boolean arg0) {
        field2324 = null;
        if (arg0) {
            method821(null, true);
        }
        field2327 = null;
        field2326 = null;
        field2318 = null;
        field2329 = null;
        field2320 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method821(Component arg0, boolean arg1) {
        arg0.removeMouseListener(class232.field4266);
        field2323++;
        if (!arg1) {
            arg0.removeMouseMotionListener(class232.field4266);
            arg0.removeFocusListener(class232.field4266);
            class6.field85 = 0;
        }
    }
}
