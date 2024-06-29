import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class680 {
   @OriginalMember(
      owner = "client!mj",
      name = "e",
      descriptor = "I"
   )
   public int field10216 = -1;
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10224 = new String[]{method4960(method4959("\u0015[\u001b|\u001d")), method4960(method4959("\u0015[\u001b\u007f\u001d"))};
   @OriginalMember(
      owner = "client!mj",
      name = "l",
      descriptor = "Lcs;"
   )
   public static class358 field10213 = new class358();
   @OriginalMember(
      owner = "client!mj",
      name = "c",
      descriptor = "[C"
   )
   public static char[] field10219 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @OriginalMember(
      owner = "client!mj",
      name = "j",
      descriptor = "I"
   )
   public static int field10212;
   @OriginalMember(
      owner = "client!mj",
      name = "k",
      descriptor = "I"
   )
   public static int field10221;
   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "I"
   )
   public static int field10222;
   @OriginalMember(
      owner = "client!mj",
      name = "i",
      descriptor = "I"
   )
   public static int field10223;
   @OriginalMember(
      owner = "client!mj",
      name = "g",
      descriptor = "Lbh;"
   )
   public class40 field10215;
   @OriginalMember(
      owner = "client!mj",
      name = "d",
      descriptor = "[I"
   )
   public int[] field10220;
   @OriginalMember(
      owner = "client!mj",
      name = "b",
      descriptor = "[J"
   )
   public long[] field10217;
   @OriginalMember(
      owner = "client!mj",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field10214;
   @OriginalMember(
      owner = "client!mj",
      name = "f",
      descriptor = "[[S"
   )
   public static short[][] field10218;

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(FFBFFFFI)F"
   )
   public static final float method4957(float arg0, float arg1, byte arg2, float arg3, float arg4, float arg5, float arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field10212;
         float var9 = 0.0F;
         float var10 = arg0 - arg5;
         float var11 = arg1 - arg6;
         float var12 = -arg4 + arg3;
         float var13 = 0.0F;
         if (arg2 > -125) {
            method4957(0.05733791F, 1.3630188F, (byte)18, -1.181975F, 0.22011791F, -0.39624262F, -0.17443338F, -70);
         }

         float var14 = 0.0F;
         float var15 = 0.0F;
         float var10000;
         if (var8 != 0) {
            var10000 = var9 * var10 + arg5;
         } else if (!(var9 < 1.1F)) {
            var10000 = -1.0F;
            if (var8 == 0) {
               return -1.0F;
            }
         } else {
            var10000 = var9 * var10 + arg5;
         }

         while(true) {
            float var16 = var10000;
            float var17 = var9 * var11 + arg6;
            float var18 = var9 * var12 + arg4;
            int var19 = (int)var16 >> 9;
            int var20 = (int)var18 >> 9;
            if (var19 > 0 && var20 > 0 && class323.field4603 > var19 && ~var20 > ~class178.field2197) {
               int var21 = class693.field10418.field9010;
               if (~var21 > -4 && (2 & class65.field797[1][var19][var20]) != 0) {
                  ++var21;
               }

               int var22 = class147.field1843[var21].method2236((byte)118, (int)var16, (int)var18);
               if ((float)var22 < var17) {
                  if (~arg7 > -3) {
                     return var9;
                  }

                  return var9 + -0.1F + 0.1F * method4957(var16, var17, (byte)-128, var18, var15, var13, var14, arg7 + -1);
               }
            }

            var13 = var16;
            var14 = var17;
            var9 += 0.1F;
            var15 = var18;
            if (!(var9 < 1.1F)) {
               var10000 = -1.0F;
               if (var8 == 0) {
                  return -1.0F;
               }
            } else {
               var10000 = var9 * var10 + arg5;
            }
         }
      } catch (RuntimeException var24) {
         throw class670.method4877(var24, field10224[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4958(byte arg0) {
      try {
         field10219 = null;
         field10213 = null;
         if (arg0 >= 88) {
            field10218 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10224[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4959(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4960(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
