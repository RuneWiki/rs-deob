import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class542 extends class420 {
   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method3269(boolean arg0) {
      if (arg0) {
         this.method3269(true);
      }

      return System.nanoTime();
   }

   @OriginalMember(
      owner = "client!wha",
      name = "<init>",
      descriptor = "()V"
   )
   public class542() {
      System.nanoTime();
   }
}
