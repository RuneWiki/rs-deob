import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class108 extends class732 {

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method788(int arg0) throws IOException {
        return arg0 <= 74 ? null : this.method4098(0);
    }
}
