import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class174 extends class304 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 3)
    public final Socket method1099(byte arg0) throws IOException {
        int var2 = 22 / ((55 - arg0) / 39);
        return this.method1785(8883);
    }
}
