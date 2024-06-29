import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class182 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2644 = "Close";

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Z")
    public static boolean field2649 = false;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2650 = "glow3:";

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2647 = null;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lpc;")
    public static class111 field2648;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[I")
    public static int[] field2651;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[Lsj;")
    public static class160[] field2646;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILvf;)Lvf;")
    public abstract class37 method1195(int arg0, class37 arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method1196(boolean arg0) {
        if (arg0) {
            method1196(false);
        }
        field2650 = null;
        field2647 = null;
        field2651 = null;
        field2644 = null;
        field2648 = null;
        field2646 = null;
    }
}
