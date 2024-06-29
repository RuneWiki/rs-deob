import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class256 extends class230 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 5)
    public final Socket method1491(int arg0) throws IOException {
        return arg0 >= -109 ? null : this.method1492((byte) 82);
    }
}
