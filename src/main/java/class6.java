import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class6 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
    public String field65;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method16(int arg0) throws IOException {
        field61++;
        if (arg0 > -91) {
            method17(false, -104, 27, -38, -47, 45, 41, 33);
        }
        return new Socket(this.field65, this.field63);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method17(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg0 ? class485.field6252.field6928.method1340(false) : class485.field6252.field6946.method1340(false)) != 0 && arg3 != 0 && class303.field3823 < 50 && arg6 != -1) {
            class718.field9426[class303.field3823++] = new class327((byte) (arg0 ? 3 : 2), arg6, arg3, arg2, arg7, arg1, arg4, null);
        }
        field62++;
        if (arg5 >= -60) {
            field64 = 48;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method18(byte arg0) throws IOException;
}
