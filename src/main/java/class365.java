import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class365 extends class646 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method2274(byte arg0) throws IOException {
        return arg0 == -40 ? this.method3671((byte) -93) : null;
    }
}
