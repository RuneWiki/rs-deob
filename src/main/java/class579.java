import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class579 extends class326 {
   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;",
      line = 3
   )
   public final Socket method2527(byte arg0) throws IOException {
      return arg0 != 74 ? null : this.method2526(0);
   }
}
