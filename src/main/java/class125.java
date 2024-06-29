import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class125 {

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lqe;")
    public static class465 field1913 = new class465(76, 2);

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lqe;")
    public static class465 field1914 = new class465(83, 3);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "[[I")
    public static int[][] field1916;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static final void method981(int arg0) {
        field1912++;
        class264.method1780(3);
        if (arg0 >= -106) {
            method982(-128);
        }
        class565.method3297(105);
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    public static void method982(int arg0) {
        field1913 = null;
        int var1 = 77 / ((arg0 - 40) / 56);
        field1914 = null;
        field1916 = null;
    }
}
