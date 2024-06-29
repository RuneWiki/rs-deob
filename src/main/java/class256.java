import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class256 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Lrg;")
    public static class342 field3937 = null;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
    public static boolean field3935 = false;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Ll;")
    public static class66 field3936 = new class66(4);

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "[[Z")
    public static boolean[][] field3939 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1892(int arg0) {
        class43.field699.method655(-1);
        if (arg0 <= -36) {
            class343.field5453.method655(-1);
            field3938++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 36)
    public static final void method1893(int arg0) {
        class99.field1491.method1628((byte) -9, arg0);
        field3940++;
        class99.field1491.method273(0, class113.method969(1));
        class37.field554++;
        class99.field1491.method304(false, class126.field2113);
        class99.field1491.method304(false, class362.field5740);
        class99.field1491.method273(0, class271.field4194);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 54)
    public static void method1894(int arg0) {
        if (arg0 != 19) {
            field3937 = (class342) null;
        }
        field3937 = null;
        field3936 = null;
        field3939 = (boolean[][]) null;
    }
}
