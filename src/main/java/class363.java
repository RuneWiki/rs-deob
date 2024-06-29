import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class363 {
   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5143 = method2821(method2820("Uuze-"));
   @OriginalMember(
      owner = "client!dj",
      name = "c",
      descriptor = "F"
   )
   public static float field5142 = 0.0F;
   @OriginalMember(
      owner = "client!dj",
      name = "b",
      descriptor = "I"
   )
   public static int field5140;
   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "I"
   )
   public static int field5141;

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2819(int arg0, int arg1) {
      try {
         ++field5140;
         if (arg1 != -5271) {
            field5141 = -48;
         }

         return arg0 == 0 || ~arg0 == -3;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5143 + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2820(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2821(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
