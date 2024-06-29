import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class160 extends class18 {
   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2453 = method1515(method1514("I\\j%k\u0006"));
   @OriginalMember(
      owner = "client!gha",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field2447 = new int[16384];
   @OriginalMember(
      owner = "client!gha",
      name = "i",
      descriptor = "I"
   )
   public static int field2448 = -1;
   @OriginalMember(
      owner = "client!gha",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field2446 = new int[16384];
   @OriginalMember(
      owner = "client!gha",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field2449;
   @OriginalMember(
      owner = "client!gha",
      name = "m",
      descriptor = "Lhn;"
   )
   public static class357 field2451;
   @OriginalMember(
      owner = "client!gha",
      name = "l",
      descriptor = "I"
   )
   public static int field2450;
   @OriginalMember(
      owner = "client!gha",
      name = "h",
      descriptor = "I"
   )
   public static int field2452;

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1513(byte arg0) {
      try {
         field2449 = null;
         field2447 = null;
         if (arg0 < 81) {
            field2451 = null;
         }

         field2451 = null;
         field2446 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2453 + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field2447[var2] = (int)(Math.sin((double)var2 * var0) * 16384.0D);
         field2446[var2] = (int)(Math.cos((double)var2 * var0) * 16384.0D);
      }

      field2449 = new int[]{32, 39, 44, 47};
      field2451 = new class357(method1515(method1514("b}]N")), "", "", 0);
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1514(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1515(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
