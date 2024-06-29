import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class512 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7511 = method3807(method3806("\u0007\u0010Bc["));
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "I"
   )
   public static int field7509;
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "I"
   )
   public static int field7510;

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(IZ)Lpa;",
      line = 7
   )
   public static final class388 method3805(int arg0, boolean arg1) {
      try {
         ++field7509;
         if (!arg1) {
            field7510 = 90;
         }

         return new class388(arg0, false);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7511 + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3806(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3807(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
