import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class131 {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "J")
    public static long field1888 = 0L;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lwe;")
    public static class82 field1886 = null;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1887 = -1;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1890 = "Please remove ";

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1895 = " has logged in.";

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lca;IIIZ)V")
    public void method708(class131 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1891++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public abstract int method227();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BZ)V")
    public static final void method861(byte arg0, boolean arg1) {
        int var2 = -62 % ((arg0 - 38) / 58);
        field1893++;
        class269.field3936 = arg1;
        class221.field3132 = !class176.method1141(1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method862(int arg0, int arg1) {
        if (arg0 <= -100) {
            class260.field3785.method62(-27, arg1);
            field1894++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
    public abstract void method229(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method863(int arg0) {
        if (arg0 <= 85) {
            method863(-76);
        }
        field1895 = null;
        field1886 = null;
        field1890 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Lca;")
    public class131 method715(int arg0, int arg1, int arg2) {
        field1896++;
        return this;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z")
    public boolean method711() {
        field1892++;
        return false;
    }
}
