import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class492 {

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field6940 = 2;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "[I")
    public static int[] field6938;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6941;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2929(int arg0) {
        field6942++;
        if (class430.field6135 != null) {
            class430.field6135 = null;
            if (arg0 == 1) {
                class721.method4050(class426.field5986, class505.field7238, -17012, class373.field5236, class326.field4512);
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V", line = 22)
    public static final void method2930(int arg0, int arg1, int arg2) {
        field6937++;
        if (class263.field3799 == null) {
            return;
        }
        int var3 = class224.field3008;
        int var4 = class296.field4168;
        class44.method296(arg0, arg2, (byte) 89);
        if (class221.field2883 == arg1) {
            class643.field8815 = null;
            class643.field8815 = class263.field3799.method467(class263.field3799.method415(class414.field5838, class712.field9900), class263.field3799.method473(class414.field5838, class712.field9900));
        } else if (class221.field2883 == 1 && (class448.field6358 == null || class224.field3008 != var3 || class296.field4168 != var4)) {
            class448.field6358 = new class339[class296.field4168 * class224.field3008];
            for (int var5 = 0; var5 < class448.field6358.length; var5++) {
                class448.field6358[var5] = class263.field3799.method467(class263.field3799.method415(class338.field4700, class47.field555), class263.field3799.method473(class338.field4700, class47.field555));
            }
            class681.field9340 = 1;
            class518.field7371 = new int[class296.field4168 * class224.field3008];
        }
        class230.field3098 = true;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 75)
    public static void method2931(byte arg0) {
        if (arg0 != 5) {
            field6941 = null;
        }
        field6941 = null;
        field6938 = null;
    }
}
