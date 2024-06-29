import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class737 {
   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10963 = method5419(method5418("h#\u0006\u001a\u0007"));
   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "Lpda;"
   )
   public static class395 field10961 = new class395(64);
   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field10962 = new int[200];

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5417(byte arg0) {
      try {
         if (arg0 != 113) {
            field10961 = null;
         }

         field10961 = null;
         field10962 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10963 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5418(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5419(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
