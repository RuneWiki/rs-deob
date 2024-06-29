import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class104 extends class408 {

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method765(int arg0) throws IOException {
        return arg0 == 512 ? this.method2469((byte) 80) : null;
    }
}
