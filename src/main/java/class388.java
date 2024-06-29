import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public abstract class class388 {

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "[I")
    public static int[] field5818 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lmq;")
    public static class592 field5817 = new class592();

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public int field5819;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "Ljava/lang/String;")
    public String field5820;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 10)
    public static void method2425(int arg0) {
        field5817 = null;
        if (arg0 != 16) {
            field5818 = null;
        }
        field5818 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 21)
    public final Socket method2426(int arg0) throws IOException {
        if (arg0 == 29265) {
            field5816++;
            return new Socket(this.field5820, this.field5819);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I", line = 38)
    public static final int method2427(int arg0, int arg1) {
        return class500.field7266 == null ? 0 : class500.field7266[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method2296(int arg0) throws IOException;
}
