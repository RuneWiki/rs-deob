import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class108 extends class607 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method757(int arg0) throws IOException {
        return arg0 == 25 ? this.method3376(arg0) : null;
    }
}
