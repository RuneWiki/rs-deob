import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class459 extends class249 {
   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method1122(int arg0) throws IOException {
      return arg0 != 6677 ? null : this.method1919((byte)48);
   }
}
