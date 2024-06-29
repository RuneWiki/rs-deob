import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class99 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lkc;")
    public static class67 field2223 = class19.method144("Update)2Liste geladen)3", 117);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lkc;")
    public static class67 field2224 = class19.method144("@gr3@", 118);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lkc;")
    public static class67 field2228 = class19.method144("::errortest", 121);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2226 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lgd;")
    public static class44 field2220 = new class44(64);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lkc;")
    private static class67 field2231 = class19.method144("white:", 82);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lkc;")
    public static class67 field2229 = field2231;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lkc;")
    public static class67 field2232 = class19.method144("backright2", 126);

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lgd;")
    public static class44 field2230 = new class44(20);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILed;)Z", line = 7)
    public static final boolean method760(int arg0, class33 arg1) {
        field2222++;
        if (class140.field3383) {
            if (class83.method649((byte) -102, arg1) != 0) {
                return false;
            }
            if (arg1.field729 == 0) {
                return false;
            }
        }
        if (arg0 != 18547) {
            method762(35, -112, 7, -89, -23, true, -116);
        }
        return arg1.field743;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 34)
    public static void method761(byte arg0) {
        field2228 = null;
        field2229 = null;
        if (arg0 < 74) {
            return;
        }
        field2231 = null;
        field2232 = null;
        field2230 = null;
        field2224 = null;
        field2220 = null;
        field2223 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIZI)Z", line = 53)
    public static final boolean method762(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2227++;
        if (arg5) {
            return false;
        } else if (class42.method365(97, arg6)) {
            return class14.method120(class54.field1305[arg6], 0, 0, arg3, -1, arg1, arg0, arg2, 0, arg4);
        } else {
            return false;
        }
    }
}
