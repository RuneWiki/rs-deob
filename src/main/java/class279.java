import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class279 extends class74 {

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 5)
    public final Socket method588(int arg0) throws IOException {
        return arg0 <= 28 ? null : this.method585(0);
    }
}
