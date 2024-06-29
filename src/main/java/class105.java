import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class105 extends class360 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 3)
    public final Socket method912(byte arg0) throws IOException {
        return arg0 < 98 ? null : this.method2216((byte) 97);
    }
}
