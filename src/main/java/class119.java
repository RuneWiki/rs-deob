import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class32 {

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[B")
    public static byte[] field2761 = new byte[520];

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Ljava/lang/Object;")
    public static Object field2764 = new Object();

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "Lv;")
    public static class146 field2768 = class159.method1226((byte) -37, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lv;")
    private static class146 field2769 = class159.method1226((byte) -37, "Ok");

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lv;")
    public static class146 field2770 = field2769;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Z")
    public static boolean field2767 = false;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Lv;")
    public static class146 field2771 = class159.method1226((byte) -37, "hitmarks");

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lra;")
    public class119 field2760;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lra;")
    public class119 field2765;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[Lie;")
    public static class61[] field2766;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method907(boolean arg0) {
        field2771 = null;
        field2764 = null;
        field2766 = null;
        field2768 = null;
        field2770 = null;
        if (!arg0) {
            field2769 = null;
            field2761 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILla;Z)V")
    public static final void method908(int arg0, int arg1, int arg2, int arg3, class77 arg4, boolean arg5) {
        class33.field693 = arg4;
        class77.field1870 = arg0;
        class25.field410 = arg5;
        field2762++;
        class58.field1300 = arg1;
        class120.field2778 = arg3;
        class132.field3010 = arg2;
        class67.field1526 = 10000;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public final void method909(byte arg0) {
        if (arg0 > -99) {
            this.method909((byte) -38);
        }
        field2763++;
        if (this.field2760 != null) {
            this.field2760.field2765 = this.field2765;
            this.field2765.field2760 = this.field2760;
            this.field2760 = null;
            this.field2765 = null;
        }
    }
}
