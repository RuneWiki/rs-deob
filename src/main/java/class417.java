import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class417 {

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[Z")
    public static boolean[] field5443 = new boolean[100];

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Z")
    public static boolean field5444 = false;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "F")
    public static float field5442;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public static void method2493(boolean arg0) {
        field5443 = null;
        if (arg0) {
            method2493(false);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method2494(byte arg0, String arg1, boolean arg2) {
        class296.method1729(-1, arg2, -1, false, arg1);
        field5441++;
        if (arg0 > -53) {
            field5444 = true;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static final void method2495(int arg0) {
        field5445++;
        if (arg0 != -28624) {
            field5444 = true;
        }
        class443.method2609();
    }
}
