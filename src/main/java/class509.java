import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class509 extends RuntimeException {
   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field7412;
   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "Ljava/lang/Throwable;"
   )
   public Throwable field7410;
   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "Lqca;"
   )
   public static class127 field7411 = new class127(5, 1);

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3699(int arg0) {
      if (arg0 != 1) {
         method3699(31);
      }

      field7411 = null;
   }

   @OriginalMember(
      owner = "client!bi",
      name = "<init>",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V"
   )
   public class509(Throwable arg0, String arg1) {
      this.field7412 = arg1;
      this.field7410 = arg0;
   }
}
