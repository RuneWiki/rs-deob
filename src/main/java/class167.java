import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class167 extends class347 {
   @OriginalMember(
      owner = "client!kt",
      name = "l",
      descriptor = "Lum;"
   )
   public class550 field2084 = new class550();
   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2089 = new String[]{method1353(method1352("&\u0007VQL")), method1353(method1352("&\u0007VRL")), method1353(method1352("&\u0007VSL"))};
   @OriginalMember(
      owner = "client!kt",
      name = "k",
      descriptor = "[F"
   )
   public static float[] field2085 = new float[4];
   @OriginalMember(
      owner = "client!kt",
      name = "j",
      descriptor = "Lcj;"
   )
   public static class721 field2088 = new class721(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!kt",
      name = "i",
      descriptor = "I"
   )
   public static int field2086;
   @OriginalMember(
      owner = "client!kt",
      name = "m",
      descriptor = "I"
   )
   public static int field2087;

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 15
   )
   public static final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field2087;
         int var9 = arg5 - -arg7;
         int var10 = -arg7 + arg4;
         int var11 = arg5;
         if (var8 != 0) {
            class47.method372(arg3, class292.field4077[arg5], arg1, (byte)95, arg2);
            var11 = arg5 + 1;
         }

         while(true) {
            int var10000;
            if (~var9 >= ~var11) {
               var10000 = arg6;
               if (var8 == 0) {
                  if (arg6 != 1) {
                     field2085 = null;
                  }

                  int var12 = arg4;
                  if (var8 != 0) {
                     class47.method372(arg3, class292.field4077[arg4], arg1, (byte)126, arg2);
                     var12 = arg4 - 1;
                  }

                  while(true) {
                     while(~var12 < ~var10) {
                        class47.method372(arg3, class292.field4077[var12], arg1, (byte)126, arg2);
                        --var12;
                     }

                     int var13 = arg2 + arg7;
                     int var14 = -arg7 + arg3;
                     int var15 = var9;
                     if (var8 == 0) {
                        if (var8 == 0 && ~var10 > ~var9) {
                           return;
                        }

                        do {
                           int[] var16 = class292.field4077[var15];
                           class47.method372(var13, var16, arg1, (byte)124, arg2);
                           class47.method372(var14, var16, arg0, (byte)113, var13);
                           class47.method372(arg3, var16, arg1, (byte)112, var14);
                           ++var15;
                        } while(~var10 <= ~var15);

                        return;
                     }

                     --var12;
                  }
               }
            } else {
               var10000 = arg3;
            }

            class47.method372(var10000, class292.field4077[var11], arg1, (byte)95, arg2);
            ++var11;
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field2089[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(B)V",
      line = 62
   )
   public static void method1350(byte arg0) {
      try {
         field2088 = null;
         field2085 = null;
         if (arg0 <= 18) {
            field2085 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2089[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(IFIIFIIF)[F",
      line = 77
   )
   public static final float[] method1351(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7) {
      try {
         ++field2086;
         float[] var8 = new float[9];
         float[] var9 = new float[9];
         float var10 = (float)Math.cos((double)((float)arg6 * 0.024543693F));
         float var11 = (float)Math.sin((double)((float)arg6 * 0.024543693F));
         if (arg5 != 15628) {
            field2085 = null;
         }

         label30: {
            var8[5] = 0.0F;
            var8[1] = 0.0F;
            var8[2] = var11;
            float var12 = 1.0F - var10;
            var8[3] = 0.0F;
            var8[6] = -var11;
            var8[7] = 0.0F;
            var8[0] = var10;
            var8[8] = var10;
            var8[4] = 1.0F;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            float var15 = 0.0F;
            float var16 = (float)arg0 / 32767.0F;
            float var17 = -((float)Math.sqrt((double)(-(var16 * var16) + 1.0F)));
            float var18 = -var16 + 1.0F;
            float var19 = (float)Math.sqrt((double)(arg2 * arg2 + arg3 * arg3));
            if (var19 == 0.0F && var16 == 0.0F) {
               var9 = var8;
               if (client.field4530 == 0) {
                  break label30;
               }
            }

            if (var19 != 0.0F) {
               var15 = (float)arg2 / var19;
               var14 = (float)(-arg3) / var19;
            }

            var13[0] = var14 * var14 * var18 + var16;
            var13[3] = -var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[6] = var14 * var15 * var18;
            var13[5] = var14 * var17;
            var13[1] = var15 * var17;
            var13[7] = -var14 * var17;
            var13[4] = var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
         }

         var9[6] *= arg4;
         var9[0] *= arg1;
         var9[1] *= arg1;
         var9[8] *= arg4;
         var9[4] *= arg7;
         var9[5] *= arg7;
         var9[2] *= arg1;
         var9[3] *= arg7;
         var9[7] *= arg4;
         return var9;
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field2089[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
