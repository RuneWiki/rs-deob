import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class411 extends class673 {
   @OriginalMember(
      owner = "client!dda",
      name = "m",
      descriptor = "Lqh;"
   )
   public class81 field5654;
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5659 = new String[]{method3228(method3227("p\u001fvs{<")), method3228(method3227("p\u001fvs|<")), method3228(method3227("p\u001fvsz<")), method3228(method3227("p\u001fvsy<")), method3228(method3227("p\u001fvs\u0004}\u0015~)\u0006<")), method3228(method3227("oU9sE")), method3228(method3227("z\u000e{1"))};
   @OriginalMember(
      owner = "client!dda",
      name = "o",
      descriptor = "[J"
   )
   public static long[] field5655 = new long[100];
   @OriginalMember(
      owner = "client!dda",
      name = "l",
      descriptor = "I"
   )
   public static int field5656;
   @OriginalMember(
      owner = "client!dda",
      name = "p",
      descriptor = "I"
   )
   public static int field5657;
   @OriginalMember(
      owner = "client!dda",
      name = "n",
      descriptor = "I"
   )
   public static int field5658;

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(Lqh;)V"
   )
   public class411(class81 arg0) {
      try {
         this.field5654 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5659[4] + (arg0 != null ? field5659[5] : field5659[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IIZZIII)V"
   )
   public static final void method3223(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         if (~arg0 < ~arg4) {
            int var8 = (arg4 - -arg0) / 2;
            int var9 = arg4;
            class111 var10 = class426.field5795[var8];
            class426.field5795[var8] = class426.field5795[arg0];
            class426.field5795[arg0] = var10;
            int var11 = arg4;
            class111 var12;
            if (var7) {
               if (class128.method1094(-1, arg5, arg3, class426.field5795[arg4], arg2, arg1, var10) <= 0) {
                  var12 = class426.field5795[arg4];
                  class426.field5795[arg4] = class426.field5795[arg4];
                  var9 = arg4 + 1;
                  class426.field5795[arg4] = var12;
               }

               var11 = arg4 + 1;
            }

            while(true) {
               int var10000;
               int var10001;
               boolean var10002;
               if (~var11 <= ~arg0) {
                  class426.field5795[arg0] = class426.field5795[var9];
                  class426.field5795[var9] = var10;
                  method3223(var9 + -1, arg1, arg2, arg3, arg4, arg5, -1);
                  var10000 = arg0;
                  var10001 = arg1;
                  var10002 = arg2;
                  if (!var7) {
                     method3223(arg0, arg1, arg2, arg3, var9 + 1, arg5, -1);
                     break;
                  }
               } else {
                  var10000 = -1;
                  var10001 = arg5;
                  var10002 = arg3;
               }

               if (class128.method1094(var10000, var10001, var10002, class426.field5795[var11], arg2, arg1, var10) <= 0) {
                  var12 = class426.field5795[var11];
                  class426.field5795[var11] = class426.field5795[var9];
                  class426.field5795[var9++] = var12;
               }

               ++var11;
            }
         }

         if (arg6 != -1) {
            field5655 = null;
         }

         ++field5657;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field5659[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3224(int arg0) {
      try {
         if (arg0 != 0) {
            method3226(0.21917816F, 0.4673138F, 26, -1.7375818F, 0.59720975F, -1.0622839F, true, 0.14248855F);
         }

         field5655 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5659[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3225(byte arg0, int arg1) {
      try {
         if (arg0 != 0) {
            field5655 = null;
         }

         ++field5656;
         return arg1 == 3 || ~arg1 == -5;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5659[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(FFIFFFZF)F"
   )
   public static final float method3226(float arg0, float arg1, int arg2, float arg3, float arg4, float arg5, boolean arg6, float arg7) {
      boolean var8 = client.field1481;

      try {
         ++field5658;
         if (!arg6) {
            method3225((byte)0, 96);
         }

         float var9 = 0.0F;
         float var10 = -arg7 + arg5;
         float var11 = arg4 - arg3;
         float var12 = arg1 - arg0;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var10000;
         if (var8) {
            var10000 = var9 * var10 + arg7;
         } else if (!(var9 < 1.1F)) {
            var10000 = -1.0F;
            if (!var8) {
               return -1.0F;
            }
         } else {
            var10000 = var9 * var10 + arg7;
         }

         while(true) {
            float var16 = var10000;
            float var17 = var9 * var11 + arg3;
            float var18 = var9 * var12 + arg0;
            int var19 = (int)var16 >> 9;
            int var20 = (int)var18 >> 9;
            if (var19 > 0 && var20 > 0 && ~var19 > ~class273.field3491 && var20 < class211.field2689) {
               int var21 = class204.field2593.field10457;
               if (~var21 > -4 && ~(2 & class245.field3092[1][var19][var20]) != -1) {
                  ++var21;
               }

               int var22 = class373.field5223[var21].method3288((int)var16, (byte)121, (int)var18);
               if ((float)var22 < var17) {
                  if (arg2 < 2) {
                     return var9;
                  }

                  return var9 + -0.1F + 0.1F * method3226(var15, var18, arg2 + -1, var14, var17, var16, true, var13);
               }
            }

            var9 += 0.1F;
            var14 = var17;
            var13 = var16;
            var15 = var18;
            if (!(var9 < 1.1F)) {
               var10000 = -1.0F;
               if (!var8) {
                  return -1.0F;
               }
            } else {
               var10000 = var9 * var10 + arg7;
            }
         }
      } catch (RuntimeException var24) {
         throw class93.method866(var24, field5659[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3227(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3228(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
