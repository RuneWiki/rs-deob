import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class155 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lsg;")
    public static class30 field2944 = class167.method1221((byte) 33, "gleiten:");

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lsg;")
    public static class30 field2947 = class167.method1221((byte) 33, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[[Z")
    public static boolean[][] field2948;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lmc;B)Z")
    public static final boolean method1160(class151 arg0, byte arg1) {
        field2945++;
        if (arg0.method1112(class116.field2288, (byte) 72)) {
            return true;
        } else {
            if (arg1 <= 4) {
                method1160((class151) null, (byte) 17);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public static final void method1161(int arg0, int arg1) {
        if (arg0 != -23945) {
            field2944 = null;
        }
        class243.field4349.method1642(arg1, 63);
        class163.field3033.method1642(arg1, arg0 ^ 0xFFFFA24A);
        field2943++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method1162(boolean arg0) {
        field2948 = null;
        if (!arg0) {
            method1162(true);
        }
        field2947 = null;
        field2944 = null;
    }
}
