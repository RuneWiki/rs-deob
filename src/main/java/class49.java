import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!wa")
public class class49 extends class16 {
   @OriginalMember(
      owner = "loginapplet!wa",
      name = "h",
      descriptor = "Laa;"
   )
   public static class2 field360;

   @OriginalMember(
      owner = "loginapplet!wa",
      name = "b",
      descriptor = "(I)V",
      line = 30
   )
   public static void method239(int arg0) {
      try {
         if (arg0 == -9248) {
            field360 = null;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "wa.Q(" + arg0 + ')');
      }
   }
}
