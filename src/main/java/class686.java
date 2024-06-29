import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class686 {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Z")
    public static boolean field9684 = false;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "[I")
    public static int[] field9685 = new int[6];

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Loh;")
    public static class404 field9686;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILwp;B)V")
    public static final void method3882(int arg0, class179 arg1, byte arg2) {
        if (arg2 != -44) {
            return;
        }
        class442.field6415 = false;
        field9687++;
        class165.field1846 = 0;
        class518.method3042(arg1, arg2 ^ 0xFFFFFFA9);
        class512.method3022(arg1, -79);
        if (class442.field6415) {
            System.out.println("---endgpp---");
        }
        if (arg1.field2903 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field2903 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method3883(int arg0) {
        if (arg0 == -9580) {
            field9686 = null;
            field9685 = null;
        }
    }
}
