import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class252 extends class504 {

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lqw;")
    public static class71 field3466 = new class71(1, 6);

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1532(int arg0, byte arg1, int arg2) {
        field3469++;
        if (class620.method3399((byte) 75, arg0, arg2)) {
            if (arg1 > -51) {
                field3466 = null;
            }
            return class280.method1744(-8401, arg0, arg2) | (arg2 & 0xB000) != 0 | class281.method1748(11983, arg0, arg2) ? true : (class492.method2747((byte) -107, arg0, arg2) | class414.method2373(arg2, true, arg0)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field3466 = null;
        if (arg0 != 27) {
            method1533(-126);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static final void method1534(boolean arg0) {
        field3465++;
        if (!arg0) {
            field3466 = null;
        }
        if (class519.field6928.toLowerCase().indexOf("microsoft") != -1) {
            class465.field6270[187] = 27;
            class465.field6270[221] = 43;
            class465.field6270[188] = 71;
            class465.field6270[219] = 42;
            class465.field6270[220] = 74;
            class465.field6270[192] = 58;
            class465.field6270[191] = 73;
            class465.field6270[190] = 72;
            class465.field6270[222] = 59;
            class465.field6270[189] = 26;
            class465.field6270[186] = 57;
            class465.field6270[223] = 28;
            return;
        }
        class465.field6270[44] = 71;
        class465.field6270[46] = 72;
        class465.field6270[91] = 42;
        class465.field6270[61] = 27;
        class465.field6270[47] = 73;
        class465.field6270[92] = 74;
        class465.field6270[59] = 57;
        class465.field6270[93] = 43;
        class465.field6270[45] = 26;
        if (class519.field6919 == null) {
            class465.field6270[192] = 58;
            class465.field6270[222] = 59;
        } else {
            class465.field6270[192] = 28;
            class465.field6270[222] = 58;
            class465.field6270[520] = 59;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V")
    public class252(int arg0, int arg1) {
        this.field3467 = arg0;
        this.field3468 = arg1;
    }
}
