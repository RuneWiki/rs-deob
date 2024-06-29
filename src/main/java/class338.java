import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class338 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lud;")
    public static class27 field4245 = new class27(6, 0, 4, 2);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4246 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lkg;")
    public static class179 field4247 = new class179(56, 4);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field4248 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1946(byte arg0, String arg1) {
        field4244++;
        if (class313.field3994 == null) {
            return;
        }
        if (arg0 != 77) {
            field4247 = null;
        }
        class282.method1669(class73.field939, false);
        class225.field2873++;
        class40.field511.method2729(class463.method2733(arg0 ^ 0xFFFFFFC5, arg1), false);
        class40.field511.method2769(arg1, true);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1947(int arg0, byte arg1, int arg2) {
        field4243++;
        if (arg1 <= 29) {
            method1947(46, (byte) 85, 94);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1948(int arg0) {
        field4245 = null;
        field4246 = null;
        field4248 = null;
        if (arg0 != 56) {
            method1947(15, (byte) 84, -92);
        }
        field4247 = null;
    }
}
