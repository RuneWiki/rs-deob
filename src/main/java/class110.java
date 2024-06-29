import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class110 extends class18 {

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "Lqe;")
    public static class179 field2052 = class206.method1380("Fehler bei der Verbindung zum Server)3", (byte) 42);

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Lqe;")
    public static class179 field2054 = class206.method1380("Verbindung konnte nicht hergestellt werden)3", (byte) 65);

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Lqe;")
    private static class179 field2053 = class206.method1380("glow1:", (byte) 73);

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field2059 = 0;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Lqe;")
    public static class179 field2057 = field2053;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Lqe;")
    public static class179 field2061 = class206.method1380(" <col=ffff00>", (byte) -127);

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lqe;")
    public static class179 field2051 = field2053;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Lfc;")
    public static class58 field2058;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
    public static void method715(boolean arg0) {
        field2057 = null;
        field2058 = null;
        field2052 = null;
        field2053 = null;
        field2061 = null;
        field2051 = null;
        field2054 = null;
        if (!arg0) {
            field2061 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLja;)V")
    public static final void method716(int arg0, boolean arg1, class98 arg2) {
        int var3 = arg2.field1831;
        field2062++;
        int var4 = (int) arg2.field1694;
        arg2.method592((byte) -128);
        if (arg1) {
            class171.method1084(var3, 32);
        }
        class84.method568(true, var3);
        if (arg0 != 1) {
            return;
        }
        class6 var5 = class87.method580(var4, arg0 ^ 0x6C);
        if (var5 != null) {
            class139.method880(var5, 116);
        }
        class182.field3358 = false;
        class113.field2118 = 0;
        class143.method900(class186.field3459, class183.field3378, (byte) -85, class49.field1051, class202.field3749);
        if (class159.field2899 != -1) {
            class193.method1296(class159.field2899, (byte) 54, 1);
        }
    }
}
