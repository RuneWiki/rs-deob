import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class638 extends class675 {
   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "()V"
   )
   public class638() {
      System.nanoTime();
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method978(int arg0) {
      if (arg0 != 10766) {
         this.method978(-55);
      }

      return System.nanoTime();
   }
}
