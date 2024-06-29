import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class277 extends class15 {

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Log;")
    public class346 field3841;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "Z")
    public static boolean field3840 = false;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Lsi;")
    public static class512 field3844 = new class512(4, 7);

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1755(int arg0, boolean arg1, int arg2) {
        field3843++;
        if (arg1) {
            return (arg0 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1756(byte[] arg0, int arg1) {
        field3845++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class361.method2281(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lbv;II[B)V")
    public class277(class282 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3841 = class215.method1466(6406, false, arg1, arg3, arg2, 6406, arg0, 23409);
        this.field3841.method2417(true, false, false);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method1757(byte arg0) {
        field3844 = null;
        if (arg0 != 90) {
            method1757((byte) -111);
        }
    }
}
