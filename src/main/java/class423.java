import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class423 {

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[[I")
    public static int[][] field6440 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!wr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6438++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method2689(int arg0) {
        field6440 = null;
        if (arg0 != 6) {
            field6439 = 94;
        }
    }
}
