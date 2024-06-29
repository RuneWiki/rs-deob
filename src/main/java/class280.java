import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class280 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lcc;")
    public static class209 field4930 = null;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[[[Lsg;")
    public static class162[][][] field4931 = new class162[4][104][104];

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lcc;")
    public static class209 field4932 = class95.method669(124, "(U (X");

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lcc;")
    public static class209 field4933 = class95.method669(106, "");

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[B")
    public static byte[] field4929;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLsj;I)Z")
    public static final boolean method1891(boolean arg0, class49 arg1, int arg2) {
        field4928++;
        byte[] var3 = arg1.method355((byte) 43, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg0) {
            field4932 = null;
        }
        class273.method1861((byte) 56, var3);
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1892(int arg0) {
        if (arg0 != -16777216) {
            return;
        }
        field4929 = null;
        field4930 = null;
        field4932 = null;
        field4931 = null;
        field4933 = null;
    }
}
