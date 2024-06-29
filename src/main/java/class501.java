import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class501 extends class723 {
   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(Z)Ljava/net/Socket;"
   )
   public final Socket method3794(boolean arg0) throws IOException {
      return !arg0 ? null : this.method5243(14);
   }
}
