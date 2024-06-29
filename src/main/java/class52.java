import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class52 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
    public static int[] field938 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field943 = -1;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lsd;")
    private static class166 field941 = class135.method935("Location", 0);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lsd;")
    public static class166 field939 = field941;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILvd;)Lsd;")
    public static final class166 method382(int arg0, class193 arg1) {
        field944++;
        if (class195.method1301(class140.method955(-42, arg1), -2) == 0) {
            return null;
        }
        int var2 = 122 / ((arg0 + 54) / 44);
        if (arg1.field3701 == null || arg1.field3701.method1150(false).method1143(true) == 0) {
            return class8.field163 ? class113.field2198 : null;
        } else {
            return arg1.field3701;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field938 = null;
        if (arg0 != -1) {
            field938 = null;
        }
        field939 = null;
        field941 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public static final void method384(int arg0, int arg1) {
        if (arg1 <= 105) {
            method384(-63, -101);
        }
        class46.field836 = arg0;
        field940++;
    }
}
