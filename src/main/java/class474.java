import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class474 {
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7214 = method3686(method3685(">\u001bV06f"));
   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field7212 = new class498(81, -2);
   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "F"
   )
   public static float field7213;

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(Z)V",
      line = 5
   )
   public static void method3684(boolean arg0) {
      try {
         field7212 = null;
         if (arg0) {
            field7212 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7214 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3685(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3686(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
