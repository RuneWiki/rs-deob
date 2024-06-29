import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class736 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
    public static boolean field10137 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[[I")
    public static int[][] field10135 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Liha;", line = 3)
    public static final class704 method4082(Throwable arg0, String arg1) {
        field10136++;
        class704 var2;
        if ((arg0 instanceof class704)) {
            var2 = (class704) arg0;
            var2.field9797 = var2.field9797 + ' ' + arg1;
        } else {
            var2 = new class704(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V", line = 20)
    public static final void method4083(boolean arg0, int arg1) {
        field10138++;
        class17 var2 = class245.method1634(1, (long) arg1, 11);
        var2.method69(13);
        if (arg0) {
            field10137 = true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 33)
    public static void method4084(int arg0) {
        if (arg0 != 4) {
            method4084(-22);
        }
        field10135 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Law;I)Law;")
    public abstract class564 method704(class564 arg0, int arg1);
}
