import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class571 extends class288 {

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method1879(int arg0) throws IOException {
        return arg0 > -100 ? null : this.method1876((byte) 87);
    }
}
