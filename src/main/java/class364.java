import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class364 extends RuntimeException {
   @OriginalMember(
      owner = "client!mea",
      name = "c",
      descriptor = "Ljava/lang/Throwable;"
   )
   public Throwable field5626;
   @OriginalMember(
      owner = "client!mea",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field5624;
   @OriginalMember(
      owner = "client!mea",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field5629 = false;
   @OriginalMember(
      owner = "client!mea",
      name = "d",
      descriptor = "Leh;"
   )
   public static class19 field5628 = new class19(4);
   @OriginalMember(
      owner = "client!mea",
      name = "b",
      descriptor = "I"
   )
   public static int field5625;
   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "J"
   )
   public static long field5627;
   @OriginalMember(
      owner = "client!mea",
      name = "f",
      descriptor = "Lrr;"
   )
   public static class678 field5630;

   @OriginalMember(
      owner = "client!mea",
      name = "<init>",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V"
   )
   public class364(Throwable arg0, String arg1) {
      this.field5626 = arg0;
      this.field5624 = arg1;
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2963(int arg0) {
      field5630 = null;
      field5628 = null;
      if (arg0 != -5740) {
         field5630 = null;
      }
   }
}
