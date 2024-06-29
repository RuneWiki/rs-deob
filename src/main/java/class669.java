import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class669 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field9394 = 0;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Lou;")
    public static class562 field9395 = new class562();

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI[B)[B")
    public static final byte[] method3778(boolean arg0, int arg1, byte[] arg2) {
        field9396++;
        if (arg0) {
            byte[] var3 = new byte[arg1];
            class359.method2053(arg2, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method3779(int arg0) {
        if (arg0 >= -109) {
            field9395 = null;
        }
        field9395 = null;
    }
}
