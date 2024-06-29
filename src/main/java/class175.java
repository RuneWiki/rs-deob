import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class175 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Z")
    public static boolean field2736 = false;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[Z")
    public static boolean[] field2738 = new boolean[200];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lec;")
    public static class25 field2733 = new class25(30);

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
    public static int[] field2739 = new int[500];

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Z")
    public static boolean field2740 = true;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2742 = "Loaded defaults";

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lkk;")
    public static class254 field2741;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public static final void method1177(int arg0, int arg1) {
        if (arg0 != 0) {
            field2736 = true;
        }
        field2735++;
        class120 var2 = (class120) class42.field550.method872((byte) -94, (long) arg1);
        if (var2 != null) {
            var2.method900(93);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1178(int arg0) {
        field2742 = null;
        if (arg0 != -14377) {
            method1177(-28, -94);
        }
        field2733 = null;
        field2739 = null;
        field2741 = null;
        field2738 = null;
    }
}
