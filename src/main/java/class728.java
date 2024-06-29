import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class728 extends class69 {

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field10064;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public int field10066;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[Loq;")
    public static class230[] field10067;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method4048(int arg0) {
        if (arg0 != 57) {
            method4048(4);
        }
        field10062++;
        if (class768.field10568.toLowerCase().indexOf("microsoft") != -1) {
            class510.field6927[188] = 71;
            class510.field6927[223] = 28;
            class510.field6927[190] = 72;
            class510.field6927[219] = 42;
            class510.field6927[186] = 57;
            class510.field6927[222] = 59;
            class510.field6927[221] = 43;
            class510.field6927[189] = 26;
            class510.field6927[192] = 58;
            class510.field6927[191] = 73;
            class510.field6927[220] = 74;
            class510.field6927[187] = 27;
            return;
        }
        class510.field6927[44] = 71;
        class510.field6927[59] = 57;
        class510.field6927[45] = 26;
        class510.field6927[91] = 42;
        class510.field6927[61] = 27;
        if (class768.field10555 == null) {
            class510.field6927[192] = 58;
            class510.field6927[222] = 59;
        } else {
            class510.field6927[192] = 28;
            class510.field6927[222] = 58;
            class510.field6927[520] = 59;
        }
        class510.field6927[92] = 74;
        class510.field6927[93] = 43;
        class510.field6927[46] = 72;
        class510.field6927[47] = 73;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
    public class728(int arg0, int arg1) {
        this.field10064 = arg0;
        this.field10066 = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method4049(int arg0) {
        if (arg0 != -28651) {
            method4048(77);
        }
        field10067 = null;
    }
}
