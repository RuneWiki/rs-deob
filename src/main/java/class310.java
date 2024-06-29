import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class310 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lai;")
    public static class549 field4615;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BZ)[B", line = 5)
    public static final byte[] method1907(byte[] arg0, boolean arg1) {
        if (arg1) {
            method1907(null, true);
        }
        field4614++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class282.method1706(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 23)
    public static void method1908(int arg0) {
        field4615 = null;
        int var1 = -14 % ((arg0 - 2) / 41);
    }
}
