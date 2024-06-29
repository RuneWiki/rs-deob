import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class218 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lwd;")
    public static class232 field4045 = new class232(32);

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lvd;")
    public static class222 field4049 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lwd;")
    public static class232 field4048 = new class232(4096);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field4052 = -1;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
    public static int[] field4050;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
    public static int[] field4051;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lvd;")
    public static final class222 method1386(int arg0, int arg1) {
        class222 var2 = new class222();
        var2.field4121 = 0;
        var2.field4163 = new byte[arg1];
        if (arg0 != 192) {
            field4051 = null;
        }
        field4044++;
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static final void method1387(byte arg0) {
        if (arg0 > -58) {
            field4051 = null;
        }
        field4047++;
        if (class33.field729.toLowerCase().indexOf("microsoft") != -1) {
            class228.field4278[187] = 27;
            class228.field4278[220] = 74;
            class228.field4278[189] = 26;
            class228.field4278[221] = 43;
            class228.field4278[190] = 72;
            class228.field4278[188] = 71;
            class228.field4278[186] = 57;
            class228.field4278[191] = 73;
            class228.field4278[222] = 59;
            class228.field4278[192] = 58;
            class228.field4278[223] = 28;
            class228.field4278[219] = 42;
            return;
        }
        class228.field4278[92] = 74;
        class228.field4278[44] = 71;
        class228.field4278[45] = 26;
        if (class33.field718 == null) {
            class228.field4278[222] = 59;
            class228.field4278[192] = 58;
        } else {
            class228.field4278[222] = 58;
            class228.field4278[192] = 28;
            class228.field4278[520] = 59;
        }
        class228.field4278[59] = 57;
        class228.field4278[61] = 27;
        class228.field4278[46] = 72;
        class228.field4278[91] = 42;
        class228.field4278[93] = 43;
        class228.field4278[47] = 73;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public abstract void method433(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1388(int arg0) {
        field4051 = null;
        if (arg0 != 73) {
            field4049 = null;
        }
        field4050 = null;
        field4049 = null;
        field4048 = null;
        field4045 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public abstract void method432(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
    public class218(int arg0, int arg1, int arg2) {
        this.field4043 = arg0;
        this.field4046 = arg2;
        this.field4042 = arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
    public abstract void method434(byte arg0, int arg1, int arg2);
}
