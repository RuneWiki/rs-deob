import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class220 extends class326 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method31(byte arg0) throws IOException {
        return arg0 >= -98 ? null : this.method2061((byte) -67);
    }
}
