import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class489 extends class388 {

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method2296(int arg0) throws IOException {
        return arg0 == 32 ? this.method2426(29265) : null;
    }
}
