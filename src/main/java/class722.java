import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class722 extends class339 {

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 5)
    public final Socket method303(byte arg0) throws IOException {
        return arg0 < 99 ? null : this.method2163(-127);
    }
}
