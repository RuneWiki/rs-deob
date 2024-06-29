import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public abstract class class339 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "Lhh;")
    public static class140 field4752;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "Ljava/lang/String;")
    public String field4751;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2162(boolean arg0) {
        field4752 = null;
        if (arg0) {
            method2162(true);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 15)
    public final Socket method2163(int arg0) throws IOException {
        field4750++;
        if (arg0 >= -113) {
            method2162(false);
        }
        return new Socket(this.field4751, this.field4753);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method303(byte arg0) throws IOException;
}
