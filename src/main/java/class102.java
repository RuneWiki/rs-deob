import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class102 extends class769 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 5)
    public final Socket method758(int arg0) throws IOException {
        int var2 = -19 % ((arg0 + 36) / 49);
        return this.method4257(false);
    }
}
