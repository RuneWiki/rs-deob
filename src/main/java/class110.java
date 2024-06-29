import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class110 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lig;")
    public static class93 field2060 = new class93(64);

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lvd;")
    public static class222 field2063 = class212.method1357("Sichtbare Karte vorbereitet)3", 10731);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lvd;")
    private static class222 field2062 = class212.method1357("Please reload this page)3", 10731);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lvd;")
    public static class222 field2065 = class212.method1357("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 10731);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lvd;")
    public static class222 field2061 = field2062;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lvd;")
    public static class222 field2066 = class212.method1357("scrollbar", 10731);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lvd;IILvd;ILvd;)V")
    public static final void method715(class222 arg0, int arg1, int arg2, class222 arg3, int arg4, class222 arg5) {
        field2058++;
        for (int var6 = 99; var6 > 0; var6--) {
            class78.field1501[var6] = class78.field1501[var6 - 1];
            class214.field3966[var6] = class214.field3966[var6 - 1];
            class122.field2326[var6] = class122.field2326[var6 - 1];
            class91.field1710[var6] = class91.field1710[var6 - 1];
            class196.field3574[var6] = class196.field3574[var6 - 1];
        }
        class78.field1501[0] = arg1;
        class214.field3966[0] = arg5;
        class69.field1299 = class28.field616;
        class196.field3574[0] = arg2;
        class122.field2326[0] = arg3;
        if (arg4 <= 15) {
            field2062 = null;
        }
        class10.field177++;
        class91.field1710[0] = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method716(int arg0) {
        if (arg0 != -24197) {
            return;
        }
        field2066 = null;
        field2062 = null;
        field2065 = null;
        field2063 = null;
        field2060 = null;
        field2061 = null;
    }
}
