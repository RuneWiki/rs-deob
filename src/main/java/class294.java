import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class294 extends class415 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method330(byte arg0) throws IOException {
        return arg0 == -112 ? this.method2339(true) : null;
    }
}
