import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class57 extends class101 {

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "Z")
    public boolean field797 = false;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field793 = -1;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Ljw;")
    public static class581 field798 = new class581(56, -2);

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "Z")
    public static boolean field801 = false;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "Leo;")
    public static class314 field799 = new class314();

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "Ldha;")
    public static class84 field805 = new class84();

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public static void method407(boolean arg0) {
        if (!arg0) {
            field798 = null;
            field799 = null;
            field805 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
    public static final boolean method408(String arg0, int arg1, boolean arg2) {
        field796++;
        if (class730.field10124.field984) {
            class369.field5359 = new class80();
            class369.field5359.field1141 = arg0;
            class369.field5359.field1148 = arg1;
            if (class731.field10141 != class197.field2634) {
                class369.field5359.field1143 = class369.field5359.field1148 + 50000;
                class369.field5359.field1139 = class369.field5359.field1148 + 40000;
            }
            for (int var3 = 0; var3 < class791.field10877.length; var3++) {
                if (class791.field10877[var3].field7034 == arg1) {
                    class695.field9739 = class791.field10877[var3].field10838;
                }
            }
            return true;
        }
        String var4 = "";
        if (class731.field10141 != class197.field2634) {
            var4 = ":" + (arg1 + 7000);
        }
        String var5 = "";
        if (class251.field3720 != null) {
            var5 = "/p=" + class251.field3720;
        }
        if (arg2) {
            return true;
        }
        String var6 = "http://" + arg0 + var4 + "/l=" + class38.field589 + "/a=" + class444.field6231 + var5 + "/j" + (class299.field4335 ? "1" : "0") + ",o" + (class588.field7849 ? "1" : "0") + ",a2";
        try {
            class627.field8774.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method409(int arg0) {
        field802++;
        class712.field9959.method735(1, class712.field9959.field1305, 103);
        class712.field9959.method735(1, class712.field9959.field1320, 122);
        class712.field9959.method735(2, class712.field9959.field1291, 71);
        class712.field9959.method735(2, class712.field9959.field1313, 118);
        class712.field9959.method735(1, class712.field9959.field1287, 84);
        class712.field9959.method735(1, class712.field9959.field1301, 73);
        class712.field9959.method735(1, class712.field9959.field1276, 83);
        class712.field9959.method735(1, class712.field9959.field1281, 126);
        class712.field9959.method735(1, class712.field9959.field1318, 116);
        class712.field9959.method735(1, class712.field9959.field1307, arg0 + 85);
        class712.field9959.method735(1, class712.field9959.field1319, 113);
        class712.field9959.method735(1, class712.field9959.field1288, arg0 + 88);
        class712.field9959.method735(0, class712.field9959.field1322, 78);
        class712.field9959.method735(1, class712.field9959.field1316, 77);
        class712.field9959.method735(0, class712.field9959.field1300, 121);
        class712.field9959.method735(0, class712.field9959.field1271, 90);
        class712.field9959.method735(1, class712.field9959.field1274, 110);
        class712.field9959.method735(0, class712.field9959.field1297, 103);
        class712.field9959.method735(arg0, class712.field9959.field1312, 94);
        class196.method1348(false);
        class712.field9959.method735(1, class712.field9959.field1293, 91);
        class712.field9959.method735(3, class712.field9959.field1311, 94);
        class686.method3808(false);
        class596.method3322((byte) 127);
        class92.field1310 = true;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
    public class57(int arg0) {
        this.field793 = arg0;
    }
}
