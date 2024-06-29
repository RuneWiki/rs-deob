import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class740 extends class329 {
   @OriginalMember(
      owner = "client!lga",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10987 = new String[]{method5399(method5398("\u001a~@\bV71")), method5399(method5398("\r7\u000f\bh")), method5399(method5398("\u001a~@\bW71")), method5399(method5398("\u0018lMJ"))};
   @OriginalMember(
      owner = "client!lga",
      name = "Q",
      descriptor = "Lii;"
   )
   public static class579 field10984 = new class579(1);
   @OriginalMember(
      owner = "client!lga",
      name = "R",
      descriptor = "I"
   )
   public static int field10985;
   @OriginalMember(
      owner = "client!lga",
      name = "P",
      descriptor = "Lki;"
   )
   public static class736 field10986;

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(I)V",
      line = 5
   )
   public static void method5396(int arg0) {
      try {
         field10984 = null;
         if (arg0 > 74) {
            field10986 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10987[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(III[F[FFIIIFIB)V",
      line = 18
   )
   public static final void method5397(int arg0, int arg1, int arg2, float[] arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, float arg9, int arg10, byte arg11) {
      int var12 = client.field4530;

      try {
         ++field10985;
         int var23 = arg6 - arg10;
         int var22 = arg1 - arg2;
         int var24 = arg7 - arg8;
         if (arg11 <= 16) {
            field10984 = null;
         }

         float var13 = arg4[2] * (float)var23 + arg4[0] * (float)var22 + arg4[1] * (float)var24;
         float var14 = arg4[5] * (float)var23 + arg4[3] * (float)var22 + arg4[4] * (float)var24;
         float var15 = arg4[8] * (float)var23 + arg4[7] * (float)var24 + arg4[6] * (float)var22;
         float var16 = 0.5F + (float)Math.atan2((double)var13, (double)var15) / 6.2831855F;
         if (arg5 != 1.0F) {
            var16 = arg5 * var16;
         }

         float var17;
         label52: {
            var17 = var14 + 0.5F + arg9;
            if (arg0 == 1) {
               float var18 = var16;
               var16 = -var17;
               var17 = var18;
               if (var12 == 0) {
                  break label52;
               }
            }

            if (arg0 != 2) {
               if (~arg0 != -4) {
                  break label52;
               }

               float var19 = var16;
               var16 = var17;
               var17 = -var19;
               if (var12 == 0) {
                  break label52;
               }
            }

            var16 = -var16;
            var17 = -var17;
         }

         arg3[0] = var16;
         arg3[1] = var17;
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field10987[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10987[1] : field10987[3]) + ',' + (arg4 != null ? field10987[1] : field10987[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5398(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5399(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
