import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class174 extends class16 {

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field2784 = 0;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field2785 = new String[1000];

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2783 = "glow3:";

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 4)
    public static void method1193(int arg0) {
        field2785 = null;
        if (arg0 > -44) {
            method1193(41);
        }
        field2783 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZI)[I", line = 21)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field2785 = (String[]) null;
        }
        field2786++;
        return class27.field396;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 39)
    public class174() {
        super(0, true);
    }
}
