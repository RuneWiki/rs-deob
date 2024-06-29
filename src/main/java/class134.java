import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class134 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I", line = 11)
    public static int method993(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLvc;)V", line = 22)
    public static final void method997(boolean arg0, class89 arg1) {
        if (!arg0) {
            field1874 = 6;
        }
        field1875++;
        if (class128.field1746) {
            class467.method2782(arg1, -9347);
        } else {
            class208.method1421(arg1, 13504);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public abstract void method992(int arg0, int arg1);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method994(byte arg0, int arg1);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lba;")
    public abstract class71 method995(int arg0);

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)I")
    public abstract int method996(int arg0, int arg1);
}
