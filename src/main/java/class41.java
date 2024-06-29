import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class41 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field681 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lkb;")
    public static class93 field684 = class76.method390(": ", 0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lkb;")
    private static class93 field679 = class76.method390("Please try again)3", 0);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lkb;")
    public static class93 field680 = class76.method390(")4l", 0);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lkb;")
    public static class93 field686 = field679;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljg;")
    public static class89 field683;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field685;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method222(int arg0, int arg1) {
        if (arg1 <= 37) {
            method223((byte) 1);
        }
        field682++;
        if (arg0 == 100 && class60.field953 > 0) {
            byte[] var2 = class104.field1914[--class60.field953];
            class104.field1914[class60.field953] = null;
            return var2;
        } else if (arg0 == 5000 && class91.field1677 > 0) {
            byte[] var3 = class64.field1018[--class91.field1677];
            class64.field1018[class91.field1677] = null;
            return var3;
        } else if (arg0 == 30000 && class206.field4029 > 0) {
            byte[] var4 = class50.field795[--class206.field4029];
            class50.field795[class206.field4029] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field685 = null;
        field683 = null;
        if (arg0 == -28) {
            field684 = null;
            field680 = null;
            field679 = null;
            field686 = null;
        }
    }
}
