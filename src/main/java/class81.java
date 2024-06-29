import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class81 extends class240 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method458(int arg0) throws IOException {
        return arg0 == 21974 ? this.method1484((byte) 62) : null;
    }
}
