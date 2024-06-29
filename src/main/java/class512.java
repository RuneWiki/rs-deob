import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class512 implements class26 {
   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "I"
   )
   public int field7821;
   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7823 = new String[]{method3978(method3977("\u0016m7$\u0000")), method3978(method3977("\u0016m7ZA\u000e`mX\u0000")), method3978(method3977("\u0016m7'\u0000"))};
   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "S"
   )
   public static short field7822 = 320;
   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "I"
   )
   public static int field7819;
   @OriginalMember(
      owner = "client!vd",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field7820;

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3976(boolean arg0) {
      try {
         field7820 = null;
         if (!arg0) {
            method3976(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7823[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public final class783 method193(int arg0) {
      try {
         ++field7819;
         if (arg0 != -1) {
            this.field7821 = 104;
         }

         return class716.field10728;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7823[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class512(int arg0) {
      try {
         this.field7821 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7823[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3977(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3978(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
