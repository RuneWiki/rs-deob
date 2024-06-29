import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class508 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lgca;")
    public static class227 field6960 = new class227();

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    public static int[] field6963 = new int[14];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lsea;")
    public static class648 field6961;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[[[J")
    public static long[][][] field6965;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method2902(int arg0) {
        if (arg0 > 58) {
            field6961 = null;
            field6960 = null;
            field6963 = null;
            field6965 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZIBI)I")
    public static final int method2903(boolean arg0, int arg1, byte arg2, int arg3) {
        field6959++;
        class373 var4 = class687.method3877(arg3, arg0, 102);
        if (var4 == null) {
            return 0;
        } else {
            if (arg2 < 97) {
                method2902(-30);
            }
            return arg1 >= 0 && arg1 < var4.field5020.length ? var4.field5020[arg1] : 0;
        }
    }
}
