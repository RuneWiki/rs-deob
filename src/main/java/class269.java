import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class269 {

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "[[I")
    public static int[][] field3829 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)[Lqj;")
    public static final class511[] method1692(byte arg0) {
        int var1 = -54 / ((arg0 - 59) / 54);
        field3831++;
        return new class511[] { class127.field2070, class86.field1285, class9.field120, class689.field9777, class235.field3482, class250.field3618, class658.field9279, class626.field8921, class457.field6572, class642.field9124, class293.field4085, class475.field6808, class63.field903, class387.field5672, class128.field2086 };
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(JB)V")
    public static final void method1693(long arg0, byte arg1) {
        field3830++;
        try {
            if (arg1 != -35) {
                field3829 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method1694(int arg0) {
        if (arg0 < -13) {
            field3829 = null;
        }
    }
}
