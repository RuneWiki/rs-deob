import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class624 extends class347 {
   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9090 = method4508(method4507("D9\u000bjC"));
   @OriginalMember(
      owner = "client!ai",
      name = "i",
      descriptor = "[F"
   )
   public static float[] field9088 = new float[16384];
   @OriginalMember(
      owner = "client!ai",
      name = "j",
      descriptor = "[F"
   )
   public static float[] field9089 = new float[16384];
   @OriginalMember(
      owner = "client!ai",
      name = "l",
      descriptor = "I"
   )
   public int field9086;
   @OriginalMember(
      owner = "client!ai",
      name = "k",
      descriptor = "I"
   )
   public int field9087;

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4506(byte arg0) {
      try {
         field9089 = null;
         field9088 = null;
         int var1 = 49 / ((-65 - arg0) / 46);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9090 + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field9088[var2] = (float)Math.sin((double)var2 * var0);
         field9089[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ai",
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
            var10005 = 37;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
