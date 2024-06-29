import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class516 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public int field7597 = -1;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7598 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Z")
    public static boolean field7601 = false;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
    public static int[] field7602 = new int[5];

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lvf;")
    public class106 field7600;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
    public int[] field7599;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field7604;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method3065(int arg0) {
        field7598 = null;
        field7602 = null;
        if (arg0 != 9179409) {
            method3066(48);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public static final void method3066(int arg0) {
        field7603++;
        if (class307.field4455 < 0) {
            class409.field5787 = -1;
            class307.field4455 = 0;
            class97.field1278 = -1;
        }
        if (class307.field4455 > class245.field3582) {
            class409.field5787 = -1;
            class307.field4455 = class245.field3582;
            class97.field1278 = -1;
        }
        if (arg0 <= 91) {
            field7602 = null;
        }
        if (class421.field5935 < 0) {
            class421.field5935 = 0;
            class409.field5787 = -1;
            class97.field1278 = -1;
        }
        if (class421.field5935 > class245.field3571) {
            class409.field5787 = -1;
            class421.field5935 = class245.field3571;
            class97.field1278 = -1;
        }
    }
}
