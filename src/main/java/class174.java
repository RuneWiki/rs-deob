import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class174 extends class551 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method1022(byte arg0) throws IOException {
        return arg0 < 119 ? null : this.method3108((byte) -18);
    }
}
