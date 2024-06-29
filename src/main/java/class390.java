import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class390 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[[I")
    public static int[][] field4916 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field4917 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method2096(int arg0) {
        field4917 = null;
        field4916 = null;
        if (arg0 < 39) {
            method2096(-81);
        }
    }
}
