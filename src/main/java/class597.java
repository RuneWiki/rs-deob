import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class597 extends class544 {

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Z")
    public static boolean field8131 = false;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field8133 = 2;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field8134 = new String[5];

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field8132 = 104;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
    public static int[] field8135 = new int[2];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 9)
    public static void method3323(byte arg0) {
        field8134 = null;
        if (arg0 > -80) {
            field8130 = 14;
        }
        field8135 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lfn;")
    public abstract class149 method2418(int arg0);
}
