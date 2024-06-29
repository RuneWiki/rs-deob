import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class355 extends class281 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1857(int arg0) throws IOException {
        return arg0 >= -123 ? null : this.method1859(4);
    }
}
