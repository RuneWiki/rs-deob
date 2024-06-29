import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class179 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2697 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lqf;", line = 11)
    public static final class341 method1271(int arg0, int arg1) {
        int var2 = -33 % ((-arg0 - 52) / 57);
        field2699++;
        return class47.field774 && arg1 >= class323.field5043 && class327.field5090 >= arg1 ? class237.field3780[arg1 - class323.field5043] : null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 25)
    public static void method1272(int arg0) {
        field2697 = null;
        if (arg0 != 1) {
            field2700 = 121;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 38)
    public static final int method1273(int arg0, String arg1) {
        field2702++;
        int var2 = 78 % ((-arg0 - 24) / 32);
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ll;Z)V", line = 48)
    public static final void method1274(class133 arg0, boolean arg1) {
        class53.field900 = arg0.method970("titlebg", (byte) -10);
        if (arg1) {
            method1271(-101, 52);
        }
        class189.field2846 = arg0.method970("logo", (byte) -10);
        field2698++;
    }
}
