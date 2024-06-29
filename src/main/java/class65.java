import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class65 extends class60 {

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field1186 = 1;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lub;")
    public static class227 field1187 = class257.method1749("b12_full", 17263);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lub;")
    public static class227 field1191 = null;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "B")
    public byte field1192;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lub;")
    public class227 field1189;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lub;")
    public class227 field1190;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Z")
    public static boolean field1194;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method411(int arg0) {
        class176.field2935.method664((byte) 62, 92);
        class242.field4201++;
        for (class182 var1 = (class182) class58.field1070.method1299((byte) 110); var1 != null; var1 = (class182) class58.field1070.method1295((byte) 31)) {
            if (var1.field3115 == 0) {
                class81.method470(true, -1, var1);
            }
        }
        if (arg0 != 22525) {
            field1187 = null;
        }
        field1188++;
        if (class125.field2249 != null) {
            class198.method1268(102, class125.field2249);
            class125.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method412(byte arg0) {
        field1191 = null;
        if (arg0 >= -87) {
            field1194 = true;
        }
        field1187 = null;
    }
}
