import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class88 extends class270 {

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "Ljava/lang/String;")
    public String field936;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "[I")
    public static int[] field935 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "Lkfa;")
    public static class549 field934 = new class549(74, 3);

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V", line = 18)
    public static void method549(byte arg0) {
        field934 = null;
        field935 = null;
        if (arg0 < 39) {
            method549((byte) -39);
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V", line = 31)
    public class88() {
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 33)
    public class88(String arg0, int arg1) {
        this.field936 = arg0;
    }
}
