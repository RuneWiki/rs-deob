import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class221 extends class541 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1550(int arg0) throws IOException {
        return arg0 > -32 ? null : this.method3253((byte) -73);
    }
}
