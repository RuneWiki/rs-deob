import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class253 extends class36 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 5)
    public final Socket method323(int arg0) throws IOException {
        return arg0 == 4096 ? this.method322((byte) 127) : null;
    }
}
