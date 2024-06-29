import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class752 {
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10682 = new String[]{method5407(method5406("sixZ_")), method5407(method5406("sixY_"))};
   @OriginalMember(
      owner = "client!ch",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field10676 = new float[2];
   @OriginalMember(
      owner = "client!ch",
      name = "h",
      descriptor = "I"
   )
   public static int field10674;
   @OriginalMember(
      owner = "client!ch",
      name = "g",
      descriptor = "I"
   )
   public int field10675;
   @OriginalMember(
      owner = "client!ch",
      name = "e",
      descriptor = "I"
   )
   public int field10677;
   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "I"
   )
   public int field10678;
   @OriginalMember(
      owner = "client!ch",
      name = "c",
      descriptor = "I"
   )
   public static int field10679;
   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "I"
   )
   public int field10680;
   @OriginalMember(
      owner = "client!ch",
      name = "f",
      descriptor = "Ldd;"
   )
   public static class212 field10681;

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(IIIFIIFF)[F"
   )
   public static final float[] method5404(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7) {
      try {
         float[] var9;
         label25: {
            ++field10674;
            float[] var8 = new float[9];
            var9 = new float[9];
            float var10 = (float)Math.cos((double)((float)arg0 * 0.024543693F));
            float var11 = (float)Math.sin((double)((float)arg0 * 0.024543693F));
            var8[6] = -var11;
            var8[7] = 0.0F;
            var8[1] = 0.0F;
            var8[arg2] = 1.0F;
            var8[0] = var10;
            var8[2] = var11;
            var8[8] = var10;
            var8[3] = 0.0F;
            var8[5] = 0.0F;
            float var12 = 1.0F - var10;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            float var15 = 0.0F;
            float var16 = (float)arg4 / 32767.0F;
            float var17 = 1.0F - var16;
            float var18 = -((float)Math.sqrt((double)(-(var16 * var16) + 1.0F)));
            float var19 = (float)Math.sqrt((double)(arg5 * arg5 - -(arg1 * arg1)));
            if (var19 == 0.0F && var16 == 0.0F) {
               var9 = var8;
               if (!client.field10022) {
                  break label25;
               }
            }

            if (var19 != 0.0F) {
               var14 = (float)(-arg1) / var19;
               var15 = (float)arg5 / var19;
            }

            var13[0] = var14 * var14 * var17 + var16;
            var13[2] = var14 * var15 * var17;
            var13[6] = var14 * var15 * var17;
            var13[3] = -var15 * var18;
            var13[7] = -var14 * var18;
            var13[1] = var15 * var18;
            var13[4] = var16;
            var13[8] = var15 * var15 * var17 + var16;
            var13[5] = var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
         }

         var9[2] *= arg7;
         var9[1] *= arg7;
         var9[7] *= arg3;
         var9[5] *= arg6;
         var9[8] *= arg3;
         var9[0] *= arg7;
         var9[3] *= arg6;
         var9[4] *= arg6;
         var9[6] *= arg3;
         return var9;
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field10682[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5405(int arg0) {
      try {
         field10681 = null;
         if (arg0 >= -117) {
            method5404(-81, -13, 4, 0.90125746F, 83, -62, 0.4112896F, 0.2925515F);
         }

         field10676 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10682[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5406(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5407(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
