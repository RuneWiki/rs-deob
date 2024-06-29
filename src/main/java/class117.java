import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class117 extends class90 {
   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method858(int arg0) throws IOException {
      return arg0 <= 100 ? null : this.method856(false);
   }
}
