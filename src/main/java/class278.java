import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class278 extends class364 {

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method1662(int arg0) throws IOException {
        int var2 = 116 % ((arg0 + 43) / 42);
        return this.method2125((byte) -123);
    }
}
