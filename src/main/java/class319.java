import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class319 extends class18 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 3)
    public final Socket method153(byte arg0) throws IOException {
        return arg0 == -36 ? this.method152(25949) : null;
    }
}
