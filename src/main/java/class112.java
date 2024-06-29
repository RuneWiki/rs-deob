import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class112 extends class675 {
   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method978(int arg0) {
      if (arg0 != 10766) {
         this.method978(43);
      }

      return class792.method5708(arg0 ^ -19363) * 1000000L;
   }
}
