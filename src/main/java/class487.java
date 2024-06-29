import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class487 {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Z")
    public static boolean field7156 = false;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Lho;")
    public static class103 field7155 = new class103(32, 3);

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "[I")
    public static int[] field7158 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "[[Z")
    public static boolean[][] field7157;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 12)
    public static void method2956(int arg0) {
        if (arg0 != -1440) {
            field7156 = false;
        }
        field7158 = null;
        field7157 = null;
        field7155 = null;
    }
}
