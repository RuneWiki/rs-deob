import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class357 extends class200 {

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "Ljh;")
    public class109 field5432;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "[[I")
    public static int[][] field5434 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "Liv;")
    public static class64 field5433 = new class64(22, -1);

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "Lgr;")
    public static class296 field5435 = new class296(2, 7);

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "[[I")
    public static int[][] field5436 = new int[128][128];

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2254(boolean arg0) {
        field5433 = null;
        field5435 = null;
        if (!arg0) {
            method2254(false);
        }
        field5436 = null;
        field5434 = null;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljh;)V", line = 25)
    public class357(class109 arg0) {
        this.field5432 = arg0;
    }
}
