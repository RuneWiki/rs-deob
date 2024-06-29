import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class61 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lcc;")
    public static class209 field1219 = class95.method669(119, "(R");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lcc;")
    public static class209 field1221 = class95.method669(108, "huffman");

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Ls;")
    public static class238 field1216;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lqf;")
    public static class244 field1217;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        field1216 = null;
        field1217 = null;
        field1221 = null;
        field1219 = null;
        if (arg0 != 0) {
            method460(-14);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
    public static final void method459(byte arg0, int arg1) {
        field1223++;
        class131.field2503.method662(32768, arg1);
        if (arg0 == -116) {
            class235.field4224.method662(32768, arg1);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method460(int arg0) {
        field1218++;
        class221.method1556((long) class163.field2968);
        if (class149.field2727 != -1) {
            class223.method1575(class149.field2727, -1);
        }
        for (int var1 = arg0; var1 < class266.field4771; var1++) {
            if (class129.field2476[var1]) {
                class31.field562[var1] = true;
            }
            class47.field917[var1] = class129.field2476[var1];
            class129.field2476[var1] = false;
        }
        class190.field3443 = -1;
        class62.field1231 = -1;
        class165.field2987 = class163.field2968;
        class246.field4466 = null;
        if (class149.field2727 != -1) {
            class266.field4771 = 0;
            class246.method1717(false, 0, class50.field981, -1, class149.field2727, 0, class25.field442, 0, 0);
        }
        class4.method18();
        class122.field2402 = 0;
    }
}
