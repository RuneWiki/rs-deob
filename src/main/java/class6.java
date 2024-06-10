import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!bb")
public class class6 {
   @OriginalMember(
      owner = "loginapplet!bb",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class41 field56 = class8.method31(109, "box_left_stud");
   @OriginalMember(
      owner = "loginapplet!bb",
      name = "b",
      descriptor = "J"
   )
   public static volatile long field57 = 0L;
   @OriginalMember(
      owner = "loginapplet!bb",
      name = "c",
      descriptor = "J"
   )
   public static long field58 = 0L;

   @OriginalMember(
      owner = "loginapplet!bb",
      name = "a",
      descriptor = "(JI)V",
      line = 6
   )
   public static final void method24(long arg0, int arg1) {
      try {
         try {
            if (arg1 <= 81) {
               field57 = -87L;
            }

            Thread.sleep(arg0);
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var5) {
         throw class28.method139(var5, "bb.A(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!bb",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method25(int arg0) {
      try {
         if (arg0 == 14620) {
            field56 = null;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "bb.B(" + arg0 + ')');
      }
   }
}
