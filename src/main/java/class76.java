import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class76 extends class231 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lck;")
    public static class119 field1184 = class298.method1987((byte) 103, "::clientdrop");

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lck;")
    private static class119 field1185 = class298.method1987((byte) 4, "Close");

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field1188 = 2;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lck;")
    public static class119 field1190 = field1185;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 4)
    public static void method543(boolean arg0) {
        field1185 = null;
        field1184 = null;
        field1190 = null;
        if (!arg0) {
            field1185 = (class119) null;
        }
    }
}
