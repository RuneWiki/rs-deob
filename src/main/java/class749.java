import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class749 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[I")
    public static int[] field10470 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "F")
    public static float field10471 = 0.0F;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public int field10473;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
    public String field10472;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method4170(int arg0) {
        if (arg0 != 0) {
            field10470 = null;
        }
        field10470 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method677(int arg0) throws IOException;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Ljava/net/Socket;")
    public final Socket method4171(boolean arg0) throws IOException {
        field10469++;
        if (!arg0) {
            this.field10473 = -5;
        }
        return new Socket(this.field10472, this.field10473);
    }
}
