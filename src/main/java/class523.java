import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class523 extends class698 {
   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "(I)Ljava/net/Socket;",
      line = 3
   )
   public final Socket method3850(int arg0) throws IOException {
      int var2 = 38 / ((-50 - arg0) / 45);
      return this.method5063(3);
   }
}
