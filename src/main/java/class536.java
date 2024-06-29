import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class536 extends class440 {

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 5)
    public final Socket method893(byte arg0) throws IOException {
        return arg0 == -68 ? this.method2740(-2001) : null;
    }
}
