import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class321 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Z")
    public static boolean field4902 = false;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
    public static int[] field4904;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    public static int[] field4906;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[[I")
    public static int[][] field4905;

    static {
        new class309("Use", "Benutzen", "Utiliser", "Usar");
        field4904 = new int[2];
        field4906 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method2058(int arg0, int arg1, int arg2) {
        if (arg0 == 2048) {
            field4903++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 28)
    public static void method2059(int arg0) {
        field4906 = null;
        field4905 = null;
        if (arg0 != 1) {
            method2059(14);
        }
        field4904 = null;
    }
}
