import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Lhn;")
    public static class509 field221 = new class509(25, -1);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field223 = 1407;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "F")
    public static float field222;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class169 var7 = (class169) class316.field4776.method1958(24); var7 != null; var7 = (class169) class316.field4776.method1961(-103)) {
            if (class475.field6854 >= var7.field2495) {
                var7.method526((byte) 88);
            } else {
                class82.method688(arg2, (var7.field2493 << 7) + 64, (var7.field2503 << 7) + 64, arg3, var7.field2500 * 2, var7.field2494, true, arg4 >> 1, arg5 >> 1);
                class185.field2805.method2030(class229.field3733[1] + arg1, var7.field2501, 0, 0, var7.field2499 | 0xFF000000, class229.field3733[0] + arg6);
            }
        }
        if (arg0 > -85) {
            field224 = 14;
        }
        field220++;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 38)
    public static final void method143(int arg0) {
        if (arg0 != 42) {
            method143(46);
        }
        field219++;
        if (class352.field5190.toLowerCase().indexOf("microsoft") != -1) {
            class446.field6544[186] = 57;
            class446.field6544[190] = 72;
            class446.field6544[219] = 42;
            class446.field6544[187] = 27;
            class446.field6544[189] = 26;
            class446.field6544[222] = 59;
            class446.field6544[223] = 28;
            class446.field6544[188] = 71;
            class446.field6544[192] = 58;
            class446.field6544[221] = 43;
            class446.field6544[191] = 73;
            class446.field6544[220] = 74;
            return;
        }
        class446.field6544[47] = 73;
        class446.field6544[93] = 43;
        class446.field6544[44] = 71;
        class446.field6544[92] = 74;
        if (class352.field5208 == null) {
            class446.field6544[192] = 58;
            class446.field6544[222] = 59;
        } else {
            class446.field6544[222] = 58;
            class446.field6544[520] = 59;
            class446.field6544[192] = 28;
        }
        class446.field6544[59] = 57;
        class446.field6544[91] = 42;
        class446.field6544[61] = 27;
        class446.field6544[45] = 26;
        class446.field6544[46] = 72;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 89)
    public static void method144(int arg0) {
        if (arg0 == 57) {
            field221 = null;
        }
    }
}
