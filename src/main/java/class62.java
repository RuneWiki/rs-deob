import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class62 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lsg;")
    private static class169 field1140 = class165.method1060("Unable to connect)3", 1536);

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lsg;")
    public static class169 field1142 = field1140;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lsg;")
    private static class169 field1145 = class165.method1060("flash2:", 1536);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lsg;")
    public static class169 field1141 = field1145;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lsg;")
    public static class169 field1146 = field1145;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lsg;")
    public static class169 field1148 = field1140;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lqd;")
    public static class148 field1143;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lbg;")
    public static class18 field1149;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lje;")
    public static class86 field1150;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[Lgd;")
    public static class59[] field1144;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lqf;")
    public static final class150 method385(byte arg0, int arg1) {
        if (arg0 != 41) {
            method386(-59);
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field1147++;
        if (class142.field2647[var2] == null || class142.field2647[var2][var3] == null) {
            boolean var4 = class44.method280(var2, true);
            if (!var4) {
                return null;
            }
        }
        return class142.field2647[var2][var3];
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method386(int arg0) {
        field1150 = null;
        if (arg0 != 552) {
            field1140 = null;
        }
        field1149 = null;
        field1142 = null;
        field1146 = null;
        field1141 = null;
        field1145 = null;
        field1140 = null;
        field1148 = null;
        field1143 = null;
        field1144 = null;
    }
}
