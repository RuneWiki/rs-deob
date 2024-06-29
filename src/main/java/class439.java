import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class439 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Lmf;")
    public static class388 field6038 = new class388();

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Lcea;")
    public static class201 field6039 = new class201(7500);

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lxa;")
    public static class468 field6040;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2494(boolean arg0) {
        field6039 = null;
        if (!arg0) {
            field6038 = null;
        }
        field6038 = null;
        field6040 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[B")
    public abstract byte[] method180(int arg0, int arg1);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Lsv;")
    public abstract class617 method176(int arg0);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V")
    public abstract void method174(int arg0, byte arg1);

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)I")
    public abstract int method172(int arg0, byte arg1);
}
