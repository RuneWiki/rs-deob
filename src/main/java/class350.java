import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class350 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[B")
    public static byte[] field5417 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 5)
    public static void method2287(byte arg0) {
        field5417 = null;
        if (arg0 != -79) {
            field5417 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I", line = 22)
    public static final int method2289(int arg0) {
        field5416++;
        return arg0 == 23313 ? class40.field505 : 126;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLp;)Lp;")
    public abstract class119 method2288(byte arg0, class119 arg1);
}
