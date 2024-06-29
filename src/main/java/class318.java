import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class318 extends class266 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1710(int arg0) throws IOException {
        return arg0 == 41 ? this.method1709(41) : null;
    }
}
