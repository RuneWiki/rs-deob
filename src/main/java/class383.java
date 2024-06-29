import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class383 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
    public static int[] field5692 = new int[100];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lml;")
    public static class263 field5691;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1860(int arg0);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z[B)V")
    public abstract void method1859(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method2422(int arg0) {
        field5691 = null;
        if (arg0 != 100) {
            field5691 = null;
        }
        field5692 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)[B")
    public abstract byte[] method1858(int arg0, int arg1, byte arg2);
}
