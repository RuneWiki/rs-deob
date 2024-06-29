import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class12 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field113 = "Use";

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lph;")
    public static class114 field111 = new class114(30);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field117 = -1;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field116 = -1;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
    public static int[] field120 = new int[1000];

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "F")
    public static float field115;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Z")
    public static boolean field118;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILtq;)Lsi;")
    public static final class320 method55(int arg0, class250 arg1) {
        field119++;
        return arg0 == -1 ? new class320(arg1.method1366((byte) -125), arg1.method1366((byte) 85), arg1.method1366((byte) -82), arg1.method1366((byte) -98), arg1.method1372(-2), arg1.method1350(31351)) : null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method56(byte arg0, String arg1) {
        field114++;
        if (arg1.equals("")) {
            return;
        }
        class281.field3857.method295(20579, 127);
        if (arg0 < 109) {
            method55(-62, (class250) null);
        }
        class249.field3360++;
        class281.field3857.method1386(-222840624, class75.method426(28555, arg1));
        class281.field3857.method1343(arg1, 22608);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method57(byte arg0) {
        if (arg0 < 118) {
            field111 = null;
        }
        field113 = null;
        field120 = null;
        field111 = null;
    }
}
