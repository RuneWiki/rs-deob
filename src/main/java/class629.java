import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class class629 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Luw;")
    public static class208 field7986 = new class208(65, 6);

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Ltea;")
    public static class589 field7987;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)V", line = 4)
    public static final void method3364(int arg0, int arg1) {
        class238.field3238 = arg0;
        class774.field10556 = -1;
        field7988++;
        if (arg1 != -14181) {
            field7986 = null;
        }
        class774.field10556 = -1;
        class401.method2327(-1);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 23)
    public static void method3365(int arg0) {
        field7987 = null;
        if (arg0 != -1) {
            field7987 = null;
        }
        field7986 = null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)Loia;")
    public abstract class56 method3195(byte arg0);

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method3197(int arg0, byte arg1);

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(IB)I")
    public abstract int method3205(int arg0, byte arg1);

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(BI)V")
    public abstract void method3199(byte arg0, int arg1);
}
