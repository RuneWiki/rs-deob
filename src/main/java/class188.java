import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class188 {

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lph;")
    public static class229 field3056 = class266.method1858("cookiehost", 0);

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Lph;")
    private static class229 field3057 = class266.method1858("Loaded update list", 0);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Lph;")
    public static class229 field3054 = field3057;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field3059 = 0;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1316(int arg0) {
        field3058++;
        if (class315.field5363 || class112.field1900 == 2) {
            return;
        }
        try {
            if (arg0 != -3) {
                method1317((class66) null, 90, (class66) null);
            }
            class7.field92.method1627((byte) 127, class157.field2561);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lsi;ILsi;)V", line = 60)
    public static final void method1317(class66 arg0, int arg1, class66 arg2) {
        field3060++;
        class325.field5552 = class100.method766(arg2, class107.field1818, arg0, 0, 0);
        if (class99.field1675) {
            class256.field4272 = class4.method20(0, arg0, arg2, class107.field1818, arg1 ^ 0x5AD1);
        } else {
            class256.field4272 = (class81) class325.field5552;
        }
        class237.field3905 = class100.method766(arg2, class17.field242, arg0, 0, arg1 ^ arg1);
        class213.field3517 = class100.method766(arg2, class5.field62, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 79)
    public static void method1318(byte arg0) {
        field3056 = null;
        field3057 = null;
        field3054 = null;
        int var1 = -58 / ((arg0 + 74) / 33);
    }
}
