import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class563 {
   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8021 = new String[]{method4197(method4196("\u0011\u0012$2")), method4197(method4196("\u0010\u0011f\u001fs")), method4197(method4196("\u0004Ifp&")), method4197(method4196("\u0010\u0011f\u001ds")), method4197(method4196("\u0010\u0011f\u001cs"))};
   @OriginalMember(
      owner = "client!ov",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field8012 = false;
   @OriginalMember(
      owner = "client!ov",
      name = "f",
      descriptor = "[F"
   )
   public static float[] field8016 = new float[4];
   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "I"
   )
   public static int field8013;
   @OriginalMember(
      owner = "client!ov",
      name = "e",
      descriptor = "I"
   )
   public static int field8014;
   @OriginalMember(
      owner = "client!ov",
      name = "d",
      descriptor = "I"
   )
   public static int field8015;
   @OriginalMember(
      owner = "client!ov",
      name = "i",
      descriptor = "I"
   )
   public static int field8017;
   @OriginalMember(
      owner = "client!ov",
      name = "h",
      descriptor = "Lsa;"
   )
   public static class39 field8019;
   @OriginalMember(
      owner = "client!ov",
      name = "c",
      descriptor = "Lwm;"
   )
   public static class440 field8018;
   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "[Lma;"
   )
   public static class148[] field8020;

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(FI[FIII[FIIBI)V"
   )
   public static final void method4193(float arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, byte arg9, int arg10) {
      boolean var11 = client.field10022;

      try {
         ++field8017;
         int var24 = arg10 - arg7;
         int var23 = arg8 - arg1;
         int var22 = arg3 - arg5;
         float var12 = arg2[2] * (float)var23 + arg2[1] * (float)var22 + arg2[0] * (float)var24;
         float var13 = arg2[5] * (float)var23 + arg2[3] * (float)var24 + arg2[4] * (float)var22;
         float var14 = arg2[8] * (float)var23 + arg2[6] * (float)var24 + arg2[7] * (float)var22;
         float var15 = (float)Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
         float var16 = 0.5F + (float)Math.atan2((double)var12, (double)var14) / 6.2831855F;
         float var17 = arg0 + (float)Math.asin((double)(var13 / var15)) / 3.1415927F + 0.5F;
         if (arg9 != 25) {
            field8018 = null;
         }

         label41: {
            if (arg4 != 1) {
               if (~arg4 != -3) {
                  if (arg4 != 3) {
                     break label41;
                  }

                  float var18 = var16;
                  var16 = var17;
                  var17 = -var18;
                  if (!var11) {
                     break label41;
                  }
               }

               var17 = -var17;
               var16 = -var16;
               if (!var11) {
                  break label41;
               }
            }

            float var19 = var16;
            var16 = -var17;
            var17 = var19;
         }

         arg6[0] = var16;
         arg6[1] = var17;
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field8021[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8021[2] : field8021[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8021[2] : field8021[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(B)Lrb;"
   )
   public static final class381 method4194(byte arg0) {
      try {
         ++field8013;
         class381 var1 = class243.method2120(4795);
         var1.field5568 = null;
         int var2 = 116 / ((arg0 - -9) / 62);
         var1.field5566 = 0;
         var1.field5570 = new class408(5000);
         return var1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8021[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4195(boolean arg0) {
      try {
         field8019 = null;
         field8018 = null;
         if (arg0) {
            method4194((byte)11);
         }

         field8020 = null;
         field8016 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8021[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4197(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
