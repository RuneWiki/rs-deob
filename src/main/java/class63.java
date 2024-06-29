import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class63 extends class439 {

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "Lko;")
    public class348 field1120 = new class348();

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1115 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public static void method563(int arg0) {
        if (arg0 <= 62) {
            method563(-46);
        }
        field1115 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
    public static final void method564(int arg0, int arg1, int arg2) {
        field1119++;
        class434 var3 = class483.method2888(arg1, arg2 ^ 0xFFFFFFA7, arg2);
        var3.method2632((byte) 81);
        var3.field6310 = arg0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
    public static final int method565(int arg0, int arg1) {
        if (arg0 != 255) {
            method564(-56, -128, -75);
        }
        field1116++;
        return arg1 & 0xFF;
    }
}
