import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class599 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lda;")
    public class400 field8593 = null;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Loq;")
    public class742 field8594 = null;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lqk;")
    public static class148 field8596 = new class148(58, 4);

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field8597 = -1;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[[I")
    public static int[][] field8598 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field8600 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lmr;")
    public static class613 field8599;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 3)
    public static void method3532(int arg0) {
        if (arg0 == 4) {
            field8599 = null;
            field8598 = null;
            field8596 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lda;)V", line = 52)
    public class599(class400 arg0) {
        this.field8593 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lda;Loq;)V", line = 59)
    public class599(class400 arg0, class742 arg1) {
        this.field8594 = arg1;
        this.field8593 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z", line = 30)
    public static final boolean method3533(int arg0, int arg1) {
        field8595++;
        if (arg1 == 0) {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } else {
            return false;
        }
    }
}
