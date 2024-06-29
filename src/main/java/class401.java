import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class401 extends class753 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method1566(int arg0) throws IOException {
        return arg0 == 0 ? this.method4209(false) : null;
    }
}
