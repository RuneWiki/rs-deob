import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class724 extends class547 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 5)
    public final Socket method4061(int arg0) throws IOException {
        return arg0 == 0 ? this.method4062(63) : null;
    }
}
