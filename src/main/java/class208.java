import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public abstract class class208 extends class313 {

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field2500 = 0;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "Lcea;")
    public static class180 field2499 = new class180("K", "T", "K", "K");

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "[[I")
    public static int[][] field2502 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2503 = null;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "Llc;")
    public static class552 field2501 = new class552("LIVE", 0);

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V", line = 5)
    public static void method1200(int arg0) {
        field2503 = null;
        field2501 = null;
        if (arg0 != 0) {
            method1200(5);
        }
        field2502 = null;
        field2499 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)Lkh;")
    public abstract class15 method1201(byte arg0);
}
