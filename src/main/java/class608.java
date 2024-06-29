import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class608 {
   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8733 = method4464(method4463("*|\b(y"));
   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "[F"
   )
   public static float[] field8728 = new float[4];
   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "I"
   )
   public static int field8731 = 0;
   @OriginalMember(
      owner = "client!pm",
      name = "d",
      descriptor = "Lqh;"
   )
   public static class74 field8730 = new class74();
   @OriginalMember(
      owner = "client!pm",
      name = "c",
      descriptor = "I"
   )
   public static int field8729;
   @OriginalMember(
      owner = "client!pm",
      name = "e",
      descriptor = "[[[B"
   )
   public static byte[][][] field8732;

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4461(byte arg0) {
      try {
         field8730 = null;
         if (arg0 < 23) {
            field8728 = null;
         }

         field8732 = null;
         field8728 = null;
      } catch (RuntimeException var2) {
         throw method4462(var2, field8733 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqn;",
      line = 19
   )
   public static final class70 method4462(Throwable arg0, String arg1) {
      ++field8729;
      class70 var2;
      if (!(arg0 instanceof class70)) {
         var2 = new class70(arg0, arg1);
      } else {
         var2 = (class70)arg0;
         var2.field1249 = var2.field1249 + ' ' + arg1;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4463(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4464(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
