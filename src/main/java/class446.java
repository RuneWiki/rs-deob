import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class446 {
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6037 = new String[]{method3418(method3417("A\u0014\u0019\u001c'\u0018")), method3418(method3417("A\u0014\u0019\u001c&\u0018")), method3418(method3417("A\u0014\u0019\u001c%\u0018"))};
   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field6035 = new class418(72, -1);
   @OriginalMember(
      owner = "client!qja",
      name = "d",
      descriptor = "I"
   )
   public static int field6033;
   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "I"
   )
   public static int field6034;
   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field6036;

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(BFFF)I"
   )
   public static final int method3414(byte arg0, float arg1, float arg2, float arg3) {
      try {
         ++field6034;
         if (arg0 != -78) {
            method3414((byte)108, -0.15835927F, -0.12016423F, -1.7359536F);
         }

         float var4 = arg3 < 0.0F ? -arg3 : arg3;
         float var5 = arg1 < 0.0F ? -arg1 : arg1;
         float var6 = !(arg2 < 0.0F) ? arg2 : -arg2;
         if (var4 < var5 && var6 < var5) {
            return !(arg1 > 0.0F) ? 1 : 0;
         } else if (var4 < var6 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
         } else {
            return arg3 > 0.0F ? 4 : 5;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6037[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(IIJ)Ljava/lang/String;"
   )
   public static final String method3415(int arg0, int arg1, long arg2) {
      try {
         ++field6033;
         class30.method243(-44, arg2);
         int var4 = class585.field8631.get(5);
         int var5 = class585.field8631.get(2) + 1;
         if (arg1 != 10) {
            method3416(false);
         }

         int var6 = class585.field8631.get(1);
         return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6037[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3416(boolean arg0) {
      try {
         field6035 = null;
         if (arg0) {
            field6035 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6037[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3417(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3418(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
