import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class77 extends class749 {

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method677(int arg0) throws IOException {
        return arg0 == 19877 ? this.method4171(true) : null;
    }
}
