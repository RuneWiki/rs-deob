import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class188 extends class362 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1178(int arg0) throws IOException {
        return arg0 == -17396 ? this.method2297(512) : null;
    }
}
