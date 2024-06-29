import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class274 {

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lhu;")
    public static class76 field3632 = new class76(64);

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "[I")
    public static int[] field3634 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "B")
    public static byte field3628;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Ljd;")
    public static class139 field3629;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Ltb;")
    public class251 field3627;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lbh;")
    public static class27 field3630;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[I")
    public int[] field3625;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 5)
    public static void method1542(byte arg0) {
        field3634 = null;
        if (arg0 == 116) {
            field3632 = null;
            field3629 = null;
            field3630 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V", line = 18)
    public static final void method1543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3633++;
        if (class425.field5751 <= arg0 && class136.field1985 >= arg2 && arg6 >= class221.field2942 && arg1 <= class205.field2784) {
            if (arg4 == 1) {
                class484.method2814(arg0, -47, arg2, arg6, arg1, arg5);
            } else {
                class132.method807(arg4, arg0, arg1, arg5, arg2, arg6, (byte) -104);
            }
        } else if (arg4 == 1) {
            class304.method1696(0, arg2, arg6, arg5, arg1, arg0);
        } else {
            class481.method2808(arg1, arg4, arg6, arg2, 10, arg0, arg5);
        }
        if (arg3 != 186) {
            method1543(105, 53, 116, 113, -56, -9, -76);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 67)
    public static final void method1544(int arg0) {
        if (arg0 != 5486) {
            return;
        }
        field3631++;
        if (class241.field3213.toLowerCase().indexOf("microsoft") != -1) {
            class263.field3501[191] = 73;
            class263.field3501[221] = 43;
            class263.field3501[222] = 59;
            class263.field3501[188] = 71;
            class263.field3501[186] = 57;
            class263.field3501[219] = 42;
            class263.field3501[189] = 26;
            class263.field3501[223] = 28;
            class263.field3501[190] = 72;
            class263.field3501[187] = 27;
            class263.field3501[192] = 58;
            class263.field3501[220] = 74;
            return;
        }
        class263.field3501[59] = 57;
        class263.field3501[45] = 26;
        class263.field3501[47] = 73;
        class263.field3501[93] = 43;
        class263.field3501[46] = 72;
        class263.field3501[44] = 71;
        class263.field3501[91] = 42;
        if (class241.field3224 == null) {
            class263.field3501[192] = 58;
            class263.field3501[222] = 59;
        } else {
            class263.field3501[520] = 59;
            class263.field3501[222] = 58;
            class263.field3501[192] = 28;
        }
        class263.field3501[92] = 74;
        class263.field3501[61] = 27;
    }
}
