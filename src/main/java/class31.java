import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class31 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "[[I")
    public static int[][] field411 = new int[6][];

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field412;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static void method182(int arg0) {
        if (arg0 < 91) {
            method182(-5);
        }
        field411 = null;
        field412 = null;
    }
}
