import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class294 extends class599 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1861(int arg0) throws IOException {
        return arg0 == 16 ? this.method3490((byte) 123) : null;
    }
}
