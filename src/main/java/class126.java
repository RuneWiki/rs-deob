import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class126 extends class109 {

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Ldd;")
    public class35 field2742;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field2740 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Ldd;")
    private static class35 field2737 = class180.method1196((byte) -71, "Connection timed out)3");

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Ldd;")
    public static class35 field2741 = class180.method1196((byte) -106, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Ldd;")
    public static class35 field2744 = field2737;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[Lua;")
    public static class189[] field2745 = new class189[50];

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[[[I")
    public static int[][][] field2746;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static void method887(int arg0) {
        field2737 = null;
        if (arg0 == 50) {
            field2745 = null;
            field2744 = null;
            field2746 = null;
            field2741 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBII)V")
    public static final void method888(int arg0, byte arg1, int arg2, int arg3) {
        field2739++;
        class55 var4 = class19.method171((byte) 125, arg0, arg3);
        if (arg1 != -24) {
            method887(-94);
        }
        if (var4 != null && var4.field1297 != null) {
            class200 var5 = new class200();
            var5.field4010 = var4.field1297;
            var5.field3995 = var4;
            class1.method2(var5, (byte) -72);
        }
        class176.field3596 = arg0;
        class130.field2799 = true;
        class29.field592 = arg3;
        class123.field2700 = arg2;
        class137.method937(var4, (byte) -85);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class126() {
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ldd;)V")
    public class126(class35 arg0) {
        this.field2742 = arg0;
    }
}
