import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class240 {

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "Leh;")
    public static class246 field155 = new class246(32, 8);

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "Leh;")
    public static class246 field157 = new class246(11, 7);

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "Ltn;")
    public static class60 field159 = new class60(31, -1);

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "Leh;")
    public static class246 field160 = new class246(85, 3);

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "F")
    public static float field161;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "[[Z")
    public static boolean[][] field156;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V", line = 8)
    public static void method67(int arg0) {
        field160 = null;
        field156 = null;
        field157 = null;
        field159 = null;
        field155 = null;
        if (arg0 != 85) {
            field161 = -0.0042403997F;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLza;)V", line = 22)
    public static final void method68(boolean arg0, class290 arg1) {
        field152++;
        if (class328.field4784) {
            class45.method257((byte) -128, arg1);
        } else {
            class250.method1630(arg1, 0);
        }
        if (!arg0) {
            field158 = -65;
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)[Lnh;", line = 38)
    public static final class536[] method69(int arg0) {
        if (arg0 != 11) {
            field159 = null;
        }
        field153++;
        return new class536[] { class257.field3825, class513.field7582, class305.field4449, class369.field5267, class500.field7085, class162.field2397 };
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)Ljava/lang/String;", line = 53)
    public static final String method70(int arg0) {
        field154++;
        String var1 = "www";
        if (class513.field7582 == class293.field4292) {
            var1 = "www-wtrc";
        } else if (class305.field4449 == class293.field4292) {
            var1 = "www-wtqa";
        } else if (class369.field5267 == class293.field4292) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class284.field4166 != null) {
            var2 = "/p=" + class284.field4166;
        }
        return arg0 == -20097 ? "http://" + var1 + "." + class246.field3594.field2968 + ".com/l=" + class149.field1979 + "/a=" + class496.field7034 + var2 + "/" : null;
    }
}
