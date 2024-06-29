import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class298 extends class77 {

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public int field4455 = 0;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field4453 = 0;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4456 = "Connection lost.";

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field4460 = 0;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "Z")
    public static boolean field4462 = false;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lsb;I)V", line = 7)
    public final void method2115(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1319(255);
            if (var3 == 0) {
                field4457++;
                if (arg1 != 0) {
                    this.field4455 = 22;
                }
                return;
            }
            this.method2116(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILsb;Z)V", line = 26)
    private final void method2116(int arg0, class190 arg1, boolean arg2) {
        field4461++;
        if (arg0 == 2) {
            this.field4455 = arg1.method1317((byte) 18);
        }
        if (arg2) {
            method2118(124);
        }
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(I)V", line = 44)
    public static final void method2117(int arg0) {
        field4454++;
        if (class321.field4835 == class19.field302) {
            return;
        }
        if (class211.method1528(8221, class321.field4835)) {
            class19.field302 = class321.field4835;
        }
        if (arg0 != 9814) {
            method2118(-85);
        }
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V", line = 65)
    public static void method2118(int arg0) {
        field4456 = null;
        if (arg0 != 24456) {
            field4460 = -94;
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V", line = 86)
    public static final void method2119(byte arg0) {
        if (arg0 == 1) {
            class57.field840.method462(arg0 ^ 0x19);
            field4452++;
        }
    }
}
