import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class474 {

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "[I")
    public static int[] field6622 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "Lqv;")
    public static class447 field6625 = new class447();

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "Loga;")
    public class474 field6621;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "Ljb;")
    public class494 field6623;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Z")
    public static final boolean method2790(int arg0, int arg1) {
        if (arg0 != -12081) {
            return true;
        }
        field6624++;
        if (arg1 == 21 || arg1 == 10 || arg1 == 47 || arg1 == 22 || arg1 == 5) {
            return true;
        } else {
            return arg1 == 49 || arg1 == 1010;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public static void method2791(int arg0) {
        if (arg0 == 1010) {
            field6622 = null;
            field6625 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
    public final void method2792(byte arg0) {
        field6626++;
        if (arg0 == -106 && class22.field544 < 500) {
            this.field6623 = null;
            this.field6621 = class313.field4342;
            class313.field4342 = this;
            class22.field544++;
        }
    }
}
