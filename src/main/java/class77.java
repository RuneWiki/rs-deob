import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class77 extends class76 {
   @OriginalMember(
      owner = "client!pv",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method740(int arg0) {
      if (arg0 < 12) {
         this.method740(41);
      }

      return 1000000L * class188.method1462(true);
   }
}
