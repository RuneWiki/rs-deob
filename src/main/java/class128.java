import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class128 extends class71 {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 5)
    public final Socket method688(byte arg0) throws IOException {
        return arg0 >= -62 ? null : this.method689((byte) 84);
    }
}
