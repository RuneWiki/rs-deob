import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class217 extends class351 {

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1408(int arg0) throws IOException {
        return arg0 == 0 ? this.method2083((byte) -120) : null;
    }
}
