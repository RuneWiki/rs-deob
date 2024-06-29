import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class445 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lvr;")
    public static class92 field6347 = new class92(15, 0, 1, 0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Led;")
    public static class507 field6350;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[[B")
    public static byte[][] field6348;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 15)
    public static void method2627(int arg0) {
        field6348 = null;
        if (arg0 != 1) {
            method2628(75, -94, false, null, 100, -6);
        }
        field6350 = null;
        field6347 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLci;II)V", line = 28)
    public static final void method2628(int arg0, int arg1, boolean arg2, class320 arg3, int arg4, int arg5) {
        field6349++;
        class479.field6987 = arg3;
        class18.field201 = arg1;
        class92.field1478 = 1;
        class19.field211 = arg4;
        class414.field5863 = arg0;
        class133.field2069 = arg2;
        class431.field6188 = arg5;
    }
}
