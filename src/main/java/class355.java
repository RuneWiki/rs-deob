import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class355 extends class500 {
   @OriginalMember(
      owner = "client!jo",
      name = "s",
      descriptor = "S"
   )
   public short field5062;
   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5070 = new String[]{method2793(method2792("J\u0000_xS")), method2793(method2792("J\u0000_zS")), method2793(method2792("J\u0000_\u007fS")), method2793(method2792("J\u0000_\u0007\u0012N\u0006\u0005\u0005S")), method2793(method2792("J\u0000_yS"))};
   @OriginalMember(
      owner = "client!jo",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field5061 = new int[1];
   @OriginalMember(
      owner = "client!jo",
      name = "m",
      descriptor = "Lnw;"
   )
   public static class616 field5065 = new class616(27, 8);
   @OriginalMember(
      owner = "client!jo",
      name = "n",
      descriptor = "Lbga;"
   )
   public static class378 field5067 = new class378(80, 6);
   @OriginalMember(
      owner = "client!jo",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field5068 = false;
   @OriginalMember(
      owner = "client!jo",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field5069 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!jo",
      name = "j",
      descriptor = "I"
   )
   public static int field5063;
   @OriginalMember(
      owner = "client!jo",
      name = "p",
      descriptor = "I"
   )
   public static int field5064;
   @OriginalMember(
      owner = "client!jo",
      name = "o",
      descriptor = "I"
   )
   public static int field5066;
   @OriginalMember(
      owner = "client!jo",
      name = "q",
      descriptor = "Lqh;"
   )
   public static class74 field5060;

   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2788(int arg0) {
      try {
         field5069 = null;
         field5067 = null;
         int var1 = 12 / ((arg0 - 24) / 50);
         field5065 = null;
         field5061 = null;
         field5060 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5070[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method2789(int arg0, int arg1, int arg2, int arg3) {
      try {
         class338.field4846.method147(arg3, arg1, arg2, class543.field7414);
         ++field5063;
         int var4 = class543.field7414[2];
         if (var4 < 50) {
            return false;
         } else {
            class543.field7414[0] = class543.field7414[0] * class348.field4997 / var4 + class390.field5451;
            class543.field7414[arg0] = class254.field3235 - -(class543.field7414[1] * class213.field2655 / var4);
            class543.field7414[2] = var4;
            return true;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5070[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(I)Leq;"
   )
   public static final class223 method2790(int arg0) {
      try {
         ++field5064;
         if (arg0 != 13111) {
            field5069 = null;
         }

         return class265.method2032(115, class445.field6162) ? class605.field8473 : class605.field8474;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5070[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "<init>",
      descriptor = "()V"
   )
   public class355() {
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(FFBFFFFI)F"
   )
   public static final float method2791(float arg0, float arg1, byte arg2, float arg3, float arg4, float arg5, float arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         ++field5066;
         float var9 = 0.0F;
         float var10 = -arg6 + arg4;
         float var11 = arg1 - arg0;
         float var12 = -arg5 + arg3;
         int var13 = 46 / ((-56 - arg2) / 56);
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var10000;
         if (var8) {
            var10000 = var9 * var10 + arg6;
         } else if (!(var9 < 1.1F)) {
            var10000 = -1.0F;
            if (!var8) {
               return -1.0F;
            }
         } else {
            var10000 = var9 * var10 + arg6;
         }

         while(true) {
            float var17 = var10000;
            float var18 = var9 * var11 + arg0;
            float var19 = var9 * var12 + arg5;
            int var20 = (int)var17 >> 9;
            int var21 = (int)var19 >> 9;
            if (var20 > 0 && ~var21 < -1 && ~var20 > ~class507.field7030 && class215.field2667 > var21) {
               int var22 = class278.field3709.field1001;
               if (~var22 > -4 && ~(class100.field1295[1][var20][var21] & 2) != -1) {
                  ++var22;
               }

               int var23 = class144.field1906[var22].method2220(123, (int)var17, (int)var19);
               if (var18 > (float)var23) {
                  if (arg7 >= 2) {
                     return 0.1F * method2791(var15, var18, (byte)102, var19, var17, var16, var14, arg7 + -1) + (var9 - 0.1F);
                  }

                  return var9;
               }
            }

            var9 += 0.1F;
            var15 = var18;
            var14 = var17;
            var16 = var19;
            if (!(var9 < 1.1F)) {
               var10000 = -1.0F;
               if (!var8) {
                  return -1.0F;
               }
            } else {
               var10000 = var9 * var10 + arg6;
            }
         }
      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field5070[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "<init>",
      descriptor = "(S)V"
   )
   public class355(short arg0) {
      try {
         this.field5062 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5070[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2792(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2793(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
