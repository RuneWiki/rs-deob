import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class312 extends class6 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 5)
    public final Socket method18(byte arg0) throws IOException {
        return arg0 == 3 ? this.method16(-113) : null;
    }
}
