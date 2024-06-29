import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class70 extends class117 {

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
    public static boolean field1147 = false;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lce;")
    public static class126 field1149 = class206.method1445(-7923, "scape main");

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lce;")
    public static class126 field1157 = class206.method1445(-7923, " weitere Optionen");

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lce;")
    public static class126 field1155 = class206.method1445(-7923, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lcc;")
    public static class313 field1148;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "[I")
    public static int[] field1150;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "[Lce;")
    public static class126[] field1156;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "[Ljk;")
    public static class273[] field1152;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIII)V", line = 17)
    public static final void method510(boolean arg0, int arg1, int arg2, int arg3) {
        class245 var4 = class139.method1022(11, (byte) -118, arg1);
        if (!arg0) {
            var4.method1683(0);
            var4.field4153 = arg3;
            field1153++;
            var4.field4154 = arg2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 42)
    public static void method511(byte arg0) {
        field1157 = null;
        field1149 = null;
        field1156 = null;
        field1150 = null;
        field1152 = null;
        field1155 = null;
        field1148 = null;
        if (arg0 >= -115) {
            field1152 = (class273[]) null;
        }
    }
}
