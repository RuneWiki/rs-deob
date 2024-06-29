import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class643 {

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field9206 = 328;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "Ldh;")
    public static class320 field9208 = new class320(114, -1);

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "[[Ltp;")
    public static class532[][] field9209;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIII)Z", line = 4)
    public static final boolean method3663(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1549) {
            method3664(79);
        }
        class477.field6791.method1030(arg1, arg0, arg3, class397.field5436);
        field9210++;
        int var4 = class397.field5436[2];
        if (var4 < 50) {
            return false;
        } else {
            class397.field5436[2] = var4;
            class397.field5436[1] = class397.field5436[1] * class135.field1524 / var4 + class10.field75;
            class397.field5436[0] = class324.field4138 + (class397.field5436[0] * class225.field2578 / var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 33)
    public static void method3664(int arg0) {
        field9208 = null;
        if (arg0 != 95) {
            field9208 = null;
        }
        field9209 = null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILjava/net/Socket;I)Lvn;", line = 46)
    public static final class311 method3665(int arg0, Socket arg1, int arg2) throws IOException {
        int var3 = -34 / ((-arg0 - 23) / 37);
        field9207++;
        return new class283(arg1, arg2);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZIIIII)V", line = 56)
    public static final void method3666(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class654.field9334.field9828.method1500(-128) != 0 && arg2 != 0 && class306.field3815 < 50 && arg0 != -1) {
            class313.field3888[class306.field3815++] = new class590((byte) 1, arg0, arg2, arg3, arg5, arg4, arg6, null);
        }
        field9204++;
        if (arg1) {
            field9208 = null;
        }
    }
}
