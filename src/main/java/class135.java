import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class135 extends class346 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method943(int arg0) throws IOException {
        return arg0 == -3 ? this.method2012((byte) 106) : null;
    }
}
