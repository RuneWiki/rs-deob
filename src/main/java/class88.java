import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 extends class51 {

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    public int field2226 = 0;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lic;")
    private static class59 field2212 = class59.method433(0, "glow2:");

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    public static int field2220 = 0;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Lic;")
    public static class59 field2211 = field2212;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "Lic;")
    public static class59 field2217 = class59.method433(0, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!me", name = "X", descriptor = "Lic;")
    public static class59 field2215 = field2212;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "Lic;")
    public static class59 field2225 = class59.method433(0, "sch-Utteln:");

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "Lic;")
    private static class59 field2219 = class59.method433(0, "Please contact customer support)3");

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "Lic;")
    public static class59 field2224 = class59.method433(0, "<col=ffffff>");

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "Lic;")
    public static class59 field2216 = field2219;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "Lt;")
    public static class132 field2223;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "Lub;")
    public static class141 field2222;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLwd;I)V")
    private final void method725(byte arg0, class157 arg1, int arg2) {
        if (arg2 == 5) {
            this.field2226 = arg1.method1161((byte) 60);
        }
        int var4 = -26 % ((arg0 - 70) / 43);
        field2218++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILwd;)V")
    public final void method726(int arg0, class157 arg1) {
        if (arg0 != 0) {
            this.method726(51, null);
        }
        while (true) {
            int var3 = arg1.method1194(false);
            if (var3 == 0) {
                field2221++;
                return;
            }
            this.method725((byte) -21, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static void method727(byte arg0) {
        field2222 = null;
        field2216 = null;
        if (arg0 < 18) {
            field2216 = null;
        }
        field2219 = null;
        field2225 = null;
        field2223 = null;
        field2212 = null;
        field2211 = null;
        field2215 = null;
        field2224 = null;
        field2217 = null;
    }
}
