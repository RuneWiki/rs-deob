import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class236 extends RuntimeException {
   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "Ljava/lang/Throwable;"
   )
   public Throwable field2993;
   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field2994;
   @OriginalMember(
      owner = "client!jda",
      name = "e",
      descriptor = "I"
   )
   public static int field2995 = -2;
   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "Lsda;"
   )
   public static class269 field2998 = new class269(38, 3);
   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "Ldaa;"
   )
   public static class12 field2997;
   @OriginalMember(
      owner = "client!jda",
      name = "f",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field2996;

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method1768(byte arg0) {
      field2996 = null;
      field2997 = null;
      if (arg0 != 54) {
         field2997 = null;
      }

      field2998 = null;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "<init>",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V",
      line = 30
   )
   public class236(Throwable arg0, String arg1) {
      this.field2993 = arg0;
      this.field2994 = arg1;
   }
}
