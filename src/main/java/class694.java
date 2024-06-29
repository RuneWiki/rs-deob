import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class694 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
    public static boolean field9612 = false;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lbu;")
    public static class21 field9613;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3876(int arg0) {
        if (arg0 < 0) {
            method3876(27);
        }
        field9613 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2301(int arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)I")
    public abstract int method2298(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
    public abstract void method2297(byte arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lega;")
    public abstract class740 method2296(byte arg0);
}
