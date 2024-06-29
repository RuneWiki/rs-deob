import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class81 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[[I")
    public static int[][] field1577 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1579 = "Select";

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    public static int[] field1580 = new int[2];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lbm;")
    public static class307 field1578;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 19)
    public static void method585(int arg0) {
        if (arg0 == 934) {
            field1578 = null;
            field1577 = (int[][]) null;
            field1579 = null;
            field1580 = null;
        }
    }
}
