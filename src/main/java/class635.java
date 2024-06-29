import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class635 extends class735 {
   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(I)J",
      line = 4
   )
   public final long method4639(int arg0) {
      if (arg0 != -14239) {
         this.method4639(70);
      }

      return System.nanoTime();
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "()V",
      line = 12
   )
   public class635() {
      System.nanoTime();
   }
}
