import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class169 extends class235 {

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field2988 = -1;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[Lqh;")
    public static class24[] field2992;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static void method1203(byte arg0) {
        field2992 = null;
        if (arg0 <= 79) {
            method1203((byte) 103);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V")
    public class169(int arg0, int arg1) {
        this.field2989 = arg0;
        this.field2993 = arg1;
    }
}
