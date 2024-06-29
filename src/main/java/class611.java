import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class611 extends class294 {
   @OriginalMember(
      owner = "client!hga",
      name = "m",
      descriptor = "S"
   )
   public short field8894;
   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8897 = new String[]{method4508(method4507("8}x/\u007fx")), method4508(method4507("8}x/\u00029tpu\u0000x"))};
   @OriginalMember(
      owner = "client!hga",
      name = "o",
      descriptor = "Luk;"
   )
   public static class498 field8895 = new class498(101, 6);
   @OriginalMember(
      owner = "client!hga",
      name = "n",
      descriptor = "J"
   )
   public static long field8896;

   @OriginalMember(
      owner = "client!hga",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method4506(int arg0) {
      try {
         if (arg0 != 3398) {
            field8896 = 73L;
         }

         field8895 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8897[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "<init>",
      descriptor = "()V",
      line = 15
   )
   public class611() {
   }

   @OriginalMember(
      owner = "client!hga",
      name = "<init>",
      descriptor = "(S)V",
      line = 21
   )
   public class611(short arg0) {
      try {
         this.field8894 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8897[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
