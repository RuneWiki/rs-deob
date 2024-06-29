import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class653 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field9014;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lph;")
    public class671 field9012;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public int[] field9013;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lgda;")
    public static class61[] field9015;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method3695(int arg0) {
        field9015 = null;
        if (arg0 != 16631) {
            field9016 = 7;
        }
    }

    static {
        new BitSet(65536);
    }
}
