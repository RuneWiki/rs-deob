import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class517 extends class434 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method2546(int arg0) throws IOException {
        return arg0 == 4 ? this.method2547(110) : null;
    }
}
