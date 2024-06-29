import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class458 extends class155 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 3)
    public final Socket method447(byte arg0) throws IOException {
        return arg0 == -77 ? this.method1304((byte) -125) : null;
    }
}
