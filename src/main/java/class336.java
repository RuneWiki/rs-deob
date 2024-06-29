import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class336 extends class313 {

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1870(int arg0) throws IOException {
        return arg0 == -23280 ? this.method1869(arg0 + 23280) : null;
    }
}
