import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class450 extends class174 {
   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;"
   )
   public final Socket method485(byte arg0) throws IOException {
      return arg0 <= 98 ? null : this.method1605(false);
   }
}
