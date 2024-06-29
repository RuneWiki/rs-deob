import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class301 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4541 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[[I")
    public static int[][] field4543 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "F")
    public static float field4540;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[[[I")
    public static int[][][] field4539;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method2032(int arg0) {
        field4543 = null;
        field4539 = null;
        int var1 = 74 / ((arg0 + 81) / 34);
    }
}
