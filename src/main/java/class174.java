import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class174 extends class4 {

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lae;")
    public class170 field2733;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "[I")
    public static int[] field2731 = new int[2000];

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lqh;B)Z")
    public static final boolean method1187(class201 arg0, byte arg1) {
        field2732++;
        if (arg1 >= -109) {
            field2731 = null;
        }
        return arg0.method1353(-70, class189.field3059);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lae;)V")
    public class174(class170 arg0) {
        this.field2733 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1188(int arg0) {
        if (arg0 != 2000) {
            field2731 = null;
        }
        field2731 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public static final void method1189(int arg0, int arg1, int arg2) {
        field2734++;
        class259 var3 = class213.method1464((byte) -117, arg1, 1);
        if (arg0 == 11361) {
            var3.method1766(0);
            var3.field4128 = arg2;
        }
    }
}
