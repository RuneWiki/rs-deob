import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class135 {
   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2193 = new String[]{method1379(method1378("\u0018Sk+x")), method1379(method1378("\r\b)i")), method1379(method1378("\u000f\u0018kF-")), method1379(method1378("\u000f\u0018kD-")), method1379(method1378("\u000f\u0018kG-"))};
   @OriginalMember(
      owner = "client!le",
      name = "c",
      descriptor = "I"
   )
   public static int field2189;
   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "I"
   )
   public static int field2190;
   @OriginalMember(
      owner = "client!le",
      name = "d",
      descriptor = "I"
   )
   public static int field2191;
   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "Lha;"
   )
   public static class17 field2188;
   @OriginalMember(
      owner = "client!le",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2192;

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method1375(int arg0, char arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2190;
         if (arg0 <= 40) {
            field2192 = null;
         }

         if (arg1 > 0 && ~arg1 > -129 || ~arg1 <= -161 && ~arg1 >= -256) {
            return true;
         } else {
            if (~arg1 != -1) {
               char[] var3 = class574.field8113;
               int var4 = 0;
               if (var2 || ~var3.length < ~var4) {
                  do {
                     char var5 = var3[var4];
                     if (arg1 == var5) {
                        return true;
                     }

                     ++var4;
                  } while(~var3.length < ~var4);
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2193[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(ILqaa;)Lqaa;"
   )
   public static final class119 method1376(int arg0, class119 arg1) {
      try {
         ++field2189;
         if (arg0 <= 69) {
            method1376(18, (class119)null);
         }

         class119 var2 = arg1 != null ? new class119(arg1) : new class119();
         var2.method1152(-63, 128, 9);
         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2193[2] + arg0 + ',' + (arg1 != null ? field2193[0] : field2193[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1377(int arg0) {
      try {
         field2192 = null;
         if (arg0 != -8461) {
            method1377(-110);
         }

         field2188 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2193[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1378(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1379(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
