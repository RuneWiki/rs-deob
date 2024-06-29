import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class159 extends class244 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1136(int arg0) throws IOException {
        int var2 = 93 / ((19 - arg0) / 58);
        return this.method1495(1);
    }
}
