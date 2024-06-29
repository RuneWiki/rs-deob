import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class703 {
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10125 = method5134(method5133("\u0002\u0003x%:"));
   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "Lhf;"
   )
   public static class198 field10122 = new class198("", 21);
   @OriginalMember(
      owner = "client!th",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field10124 = false;
   @OriginalMember(
      owner = "client!th",
      name = "b",
      descriptor = "I"
   )
   public static int field10123;

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5131(boolean arg0) {
      try {
         if (!arg0) {
            field10124 = true;
         }

         field10122 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10125 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5132(int arg0) {
      class26.field395 = arg0;

      for(int var1 = 0; var1 < class155.field2381; ++var1) {
         for(int var2 = 0; var2 < class25.field360; ++var2) {
            if (class324.field4826[arg0][var1][var2] == null) {
               class324.field4826[arg0][var1][var2] = new class312(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5133(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5134(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
