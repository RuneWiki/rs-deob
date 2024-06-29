import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class468 extends class308 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method2610(byte arg0) throws IOException {
        int var2 = 108 % ((arg0 + 40) / 55);
        return this.method2613(-21675);
    }
}
