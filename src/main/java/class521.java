import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class521 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lrn;")
    public static class633 field6623 = new class633(52, 8);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 13)
    public static void method2875(int arg0) {
        if (arg0 == 30784) {
            field6623 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[B)V")
    public abstract void method2437(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)[B")
    public abstract byte[] method2436(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)[B")
    public abstract byte[] method2438(int arg0, boolean arg1, int arg2);
}
