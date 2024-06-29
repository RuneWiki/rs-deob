import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class237 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[[I")
    public static int[][] field3477 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    public static int[] field3478 = new int[1];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method1539(byte arg0) {
        field3478 = null;
        if (arg0 == -23) {
            field3477 = null;
        }
    }
}
