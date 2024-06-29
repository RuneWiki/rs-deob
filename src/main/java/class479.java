import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class479 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field6714 = -1;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field6716 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lwf;")
    public static class79 field6713 = new class79(3, -1);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field6719 = -1;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Z")
    public static boolean field6717 = false;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lb;")
    public static class201 field6718;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lb;")
    public static class201 field6720;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method2798(byte arg0) {
        field6720 = null;
        field6718 = null;
        int var1 = 59 / ((-arg0 - 14) / 53);
        field6713 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(CI)Z")
    public static final boolean method2799(char arg0, int arg1) {
        field6715++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg1 == -340) {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        } else {
            return true;
        }
    }
}
