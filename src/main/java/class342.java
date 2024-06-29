import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class342 extends class353 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1909(int arg0) throws IOException {
        return arg0 > -116 ? null : this.method1936(false);
    }
}
