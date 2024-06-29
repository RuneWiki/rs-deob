import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class615 extends class516 {
   @OriginalMember(
      owner = "client!id",
      name = "f",
      descriptor = "Lgu;"
   )
   public class610 field8584;
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8585 = new String[]{method4470(method4469("Y\u0001:y")), method4470(method4469("^\u0010x)9Y\u001d\"+x")), method4470(method4469("LZx;-")), method4470(method4469("^\u0010xTx"))};
   @OriginalMember(
      owner = "client!id",
      name = "g",
      descriptor = "I"
   )
   public static int field8583;

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(FIIIIFFI)[F"
   )
   public static final float[] method4468(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, int arg7) {
      try {
         ++field8583;
         float[] var8 = new float[9];
         float[] var9 = new float[9];
         float var10 = (float)Math.cos((double)((float)arg7 * 0.024543693F));
         float var11 = (float)Math.sin((double)((float)arg7 * 0.024543693F));
         var8[4] = 1.0F;
         var8[0] = var10;
         float var12 = -var10 + 1.0F;
         var8[1] = 0.0F;
         var8[3] = 0.0F;
         var8[7] = 0.0F;
         var8[2] = var11;
         var8[6] = -var11;
         var8[5] = 0.0F;
         var8[8] = var10;
         if (arg1 < 61) {
            return null;
         } else {
            label30: {
               float[] var13 = new float[9];
               float var14 = 1.0F;
               float var15 = 0.0F;
               float var16 = (float)arg3 / 32767.0F;
               float var17 = -((float)Math.sqrt((double)(-(var16 * var16) + 1.0F)));
               float var18 = -var16 + 1.0F;
               float var19 = (float)Math.sqrt((double)(arg2 * arg2 + arg4 * arg4));
               if (var19 == 0.0F && var16 == 0.0F) {
                  var9 = var8;
                  if (!client.field4273) {
                     break label30;
                  }
               }

               if (var19 != 0.0F) {
                  var15 = (float)arg2 / var19;
                  var14 = (float)(-arg4) / var19;
               }

               var13[8] = var15 * var15 * var18 + var16;
               var13[1] = var15 * var17;
               var13[4] = var16;
               var13[6] = var14 * var15 * var18;
               var13[2] = var14 * var15 * var18;
               var13[5] = var14 * var17;
               var13[7] = -var14 * var17;
               var13[0] = var14 * var14 * var18 + var16;
               var13[3] = -var15 * var17;
               var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
               var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
               var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
               var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
               var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
               var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
               var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
               var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
               var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
            }

            var9[0] *= arg6;
            var9[3] *= arg0;
            var9[1] *= arg6;
            var9[2] *= arg6;
            var9[4] *= arg0;
            var9[5] *= arg0;
            var9[8] *= arg5;
            var9[7] *= arg5;
            var9[6] *= arg5;
            return var9;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field8585[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "<init>",
      descriptor = "(Lce;II[B)V"
   )
   public class615(class327 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field8584 = arg0.method2475(true, arg2, arg3, class128.field1618, false, arg1);
         this.field8584.method36(10251, false, false);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8585[1] + (arg0 != null ? field8585[2] : field8585[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8585[2] : field8585[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "<init>",
      descriptor = "(Lce;II[I)V"
   )
   public class615(class327 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field8584 = arg0.method2484(arg3, false, arg1, arg2, (byte)2);
         this.field8584.method36(10251, false, false);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8585[1] + (arg0 != null ? field8585[2] : field8585[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8585[2] : field8585[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4470(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
