import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class610 extends class217 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method1386(byte arg0) throws IOException {
        return arg0 == 34 ? this.method1385(true) : null;
    }
}
