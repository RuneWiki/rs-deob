import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class212 extends class320 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1604(int arg0) throws IOException {
        int var2 = 110 % ((-arg0 - 20) / 59);
        return this.method2176(true);
    }
}
