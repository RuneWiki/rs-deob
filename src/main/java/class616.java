import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class616 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljk;")
    public static class585 field8847 = new class585(32, 3);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "F")
    public static float field8850;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lrg;")
    public static class594 field8848;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[[Z")
    public static boolean[][] field8849;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3529(int arg0) {
        field8848 = null;
        field8847 = null;
        field8849 = null;
        int var1 = 127 % ((arg0 - 6) / 57);
    }
}
