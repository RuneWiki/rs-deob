import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class589 extends class322 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method874(int arg0) throws IOException {
        return arg0 == 15447 ? this.method1925(arg0 ^ 0xFFFFB598) : null;
    }
}
