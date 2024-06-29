import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class434 extends class173 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method995(int arg0) throws IOException {
        return arg0 == -2 ? this.method998((byte) -53) : null;
    }
}
