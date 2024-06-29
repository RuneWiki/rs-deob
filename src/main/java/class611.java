import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class611 {
   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8544 = new String[]{method4449(method4448("\u001f'\r\u0012s")), method4449(method4448("\u001f'\r\u0011s"))};
   @OriginalMember(
      owner = "client!ht",
      name = "d",
      descriptor = "I"
   )
   public static int field8540 = -1;
   @OriginalMember(
      owner = "client!ht",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field8542 = new class378(126, 4);
   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "Leb;"
   )
   public static class657 field8543 = null;
   @OriginalMember(
      owner = "client!ht",
      name = "c",
      descriptor = "I"
   )
   public static int field8541;

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4446(int arg0) {
      try {
         field8542 = null;
         field8543 = null;
         if (arg0 != -1) {
            field8543 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8544[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(Z)Lria;"
   )
   public static final class301 method4447(boolean arg0) {
      try {
         ++field8541;
         class301 var1 = (class301)class542.field7394.method3119(65535);
         if (arg0) {
            return null;
         } else if (var1 != null) {
            --class605.field8476;
            return var1;
         } else {
            return new class301();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8544[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4448(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4449(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
