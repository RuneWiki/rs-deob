import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class362 extends class334 {
   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;",
      line = 3
   )
   public final Socket method1877(int arg0) throws IOException {
      return arg0 < 82 ? null : this.method2729((byte)52);
   }
}
