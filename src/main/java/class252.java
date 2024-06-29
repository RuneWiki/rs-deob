import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class252 {
   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3810 = method2132(method2131("p?-q2"));
   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field3806 = new float[16384];
   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field3807 = new float[16384];
   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field3809 = false;
   @OriginalMember(
      owner = "client!tk",
      name = "d",
      descriptor = "Lmc;"
   )
   public static class14 field3808;

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2130(int arg0) {
      try {
         field3808 = null;
         field3807 = null;
         field3806 = null;
         if (arg0 != -16385) {
            field3807 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3810 + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field3807[var2] = (float)Math.sin((double)var2 * var0);
         field3806[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
