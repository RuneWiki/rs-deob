import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class75 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field947 = 0;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field951 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static final void method478(boolean arg0) {
        field950++;
        class330.method2188((byte) 126, class86.field1073);
        class50.method318(class86.field1073, true);
        if (class265.field4264 != null) {
            class265.field4264.method1001(21207, class86.field1073);
        }
        class97.field1359.method1576(0);
        class86.field1073.setBackground(Color.black);
        class37.field471 = -1;
        class94.method555(-60, class86.field1073);
        class435.method2682(class86.field1073, (byte) 50);
        if (arg0) {
            method479((byte) 5);
        }
        if (class265.field4264 != null) {
            class265.field4264.method1004(class86.field1073, true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static void method479(byte arg0) {
        int var1 = 59 / ((-arg0 - 27) / 54);
        field951 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLmo;Lmo;)I")
    public static final int method480(byte arg0, class447 arg1, class447 arg2) {
        field948++;
        int var3 = 0;
        if (arg2.method2762(1, class225.field3743)) {
            var3++;
        }
        if (arg2.method2762(1, class187.field3082)) {
            var3++;
        }
        if (arg2.method2762(1, class349.field5409)) {
            var3++;
        }
        if (arg1.method2762(1, class225.field3743)) {
            var3++;
        }
        if (arg1.method2762(1, class187.field3082)) {
            var3++;
        }
        if (arg0 < 125) {
            method478(true);
        }
        if (arg1.method2762(1, class349.field5409)) {
            var3++;
        }
        return var3;
    }
}
