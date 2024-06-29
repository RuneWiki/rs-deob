import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public abstract class class79 {

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "Lpja;")
    public static class43 field1110 = new class43(8);

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "[I")
    public static int[] field1112 = new int[2];

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Lju;")
    public static class137 field1111 = new class137(4, -1);

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "[I")
    public static int[] field1114;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "[[Lkh;")
    public static class17[][] field1113;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILria;)Lria;")
    public abstract class302 method665(int arg0, class302 arg1);

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V")
    public static void method666(boolean arg0) {
        field1114 = null;
        field1111 = null;
        field1113 = null;
        if (!arg0) {
            method666(false);
        }
        field1110 = null;
        field1112 = null;
    }
}
