import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class443 extends class247 {
   @OriginalMember(
      owner = "client!km",
      name = "n",
      descriptor = "I"
   )
   public int field6469;
   @OriginalMember(
      owner = "client!km",
      name = "m",
      descriptor = "I"
   )
   public int field6472;
   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6476 = new String[]{method3444(method3443("D<m\"N")), method3444(method3443("D<m\\\u000fA87^N")), method3444(method3443("D<m#N")), method3444(method3443("D<m!N"))};
   @OriginalMember(
      owner = "client!km",
      name = "j",
      descriptor = "Lfm;"
   )
   public static class164 field6473 = new class164(44, 8);
   @OriginalMember(
      owner = "client!km",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field6474 = true;
   @OriginalMember(
      owner = "client!km",
      name = "l",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field6475 = Calendar.getInstance(TimeZone.getTimeZone(method3444(method3443("h\u001c\u0017"))));
   @OriginalMember(
      owner = "client!km",
      name = "p",
      descriptor = "I"
   )
   public static int field6470;
   @OriginalMember(
      owner = "client!km",
      name = "k",
      descriptor = "I"
   )
   public static int field6471;

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(FIFFFIFF)F"
   )
   public static final float method3440(float arg0, int arg1, float arg2, float arg3, float arg4, int arg5, float arg6, float arg7) {
      boolean var8 = client.field10022;

      try {
         ++field6471;
         float var9 = 0.0F;
         float var10 = -arg2 + arg4;
         float var11 = arg6 - arg0;
         float var12 = -arg3 + arg7;
         if (arg1 != -812336759) {
            method3442(-36, -3, false);
         }

         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var10000;
         if (var8) {
            var10000 = var9 * var10 + arg2;
         } else if (!(var9 < 1.1F)) {
            var10000 = -1.0F;
            if (!var8) {
               return -1.0F;
            }
         } else {
            var10000 = var9 * var10 + arg2;
         }

         while(true) {
            float var16 = var10000;
            float var17 = var9 * var11 + arg0;
            float var18 = var9 * var12 + arg3;
            int var19 = (int)var16 >> 9;
            int var20 = (int)var18 >> 9;
            if (var19 > 0 && var20 > 0 && var19 < class234.field3626 && class209.field2989 > var20) {
               int var21 = class117.field1849.field6824;
               if (var21 < 3 && ~(2 & class644.field9070[1][var19][var20]) != -1) {
                  ++var21;
               }

               int var22 = class558.field7922[var21].method5401((int)var16, true, (int)var18);
               if (var17 > (float)var22) {
                  if (arg5 >= 2) {
                     return method3440(var14, -812336759, var13, var15, var16, arg5 + -1, var17, var18) * 0.1F + var9 + -0.1F;
                  }

                  return var9;
               }
            }

            var9 += 0.1F;
            var14 = var17;
            var15 = var18;
            var13 = var16;
            if (!(var9 < 1.1F)) {
               var10000 = -1.0F;
               if (!var8) {
                  return -1.0F;
               }
            } else {
               var10000 = var9 * var10 + arg2;
            }
         }
      } catch (RuntimeException var24) {
         throw class612.method4503(var24, field6476[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3441(byte arg0) {
      try {
         field6473 = null;
         if (arg0 >= -80) {
            method3442(-100, -57, true);
         }

         field6475 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6476[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method3442(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            field6473 = null;
         }

         ++field6470;
         return class445.method3451(arg0, -29018, arg1) | (arg1 & 458752) != 0 || class190.method1688(22296, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6476[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class443(int arg0, int arg1) {
      try {
         this.field6469 = arg0;
         this.field6472 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6476[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3443(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3444(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
