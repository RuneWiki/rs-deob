import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class94 extends class76 {
   @OriginalMember(
      owner = "client!iia",
      name = "c",
      descriptor = "(I)J",
      line = 4
   )
   public final long method740(int arg0) {
      return arg0 < 12 ? -94L : System.nanoTime();
   }

   @OriginalMember(
      owner = "client!iia",
      name = "<init>",
      descriptor = "()V",
      line = 12
   )
   public class94() {
      System.nanoTime();
   }
}
