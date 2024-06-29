import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class41 {

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "Lbj;")
    public static class162 field573;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "Lwm;")
    public static class399 field575;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lph;")
    public static class459 field576;

    static {
        new class309("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field573 = new class162(14, 3);
        field575 = new class399(20);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V", line = 6)
    public static void method252(byte arg0) {
        field576 = null;
        field573 = null;
        if (arg0 < -6) {
            field575 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 21)
    public static final void method253(int arg0) {
        field572++;
        if (class522.field7582 == class490.field7190) {
            return;
        }
        try {
            class227.method1509(class418.field6296, "tbrefresh", 29436);
            if (arg0 != 12) {
                method252((byte) 126);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V", line = 51)
    public static final void method254(int arg0, int arg1, int arg2) {
        if (arg0 != -21619) {
            field577 = 126;
        }
        field574++;
        class18 var3 = class140.method1047(12, arg1, false);
        var3.method122(true);
        var3.field283 = arg2;
    }
}
