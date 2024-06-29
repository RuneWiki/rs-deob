import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class516 extends OutputStream {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!ii", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field7359++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I", line = 16)
    public static final int method2938(int arg0, int arg1) {
        field7358++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + arg1;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
