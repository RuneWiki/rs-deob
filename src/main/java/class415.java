import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class415 extends class32 {
   @OriginalMember(
      owner = "client!sg",
      name = "p",
      descriptor = "[I"
   )
   private int[] field6081;
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6085 = new String[]{method3173(method3172("fYr}+")), method3173(method3172("n\u0010r\u0010~")), method3173(method3172("{K0R")), method3173(method3172("fYr|+")), method3173(method3172("fYr\u007f+")), method3173(method3172("fYr\u0002j{W(\u0000+")), method3173(method3172("fYrz+"))};
   @OriginalMember(
      owner = "client!sg",
      name = "n",
      descriptor = "[Lhca;"
   )
   public static class513[] field6075 = new class513[14];
   @OriginalMember(
      owner = "client!sg",
      name = "j",
      descriptor = "Lpi;"
   )
   public static class521 field6076 = new class521(method3173(method3172("G}")), 1);
   @OriginalMember(
      owner = "client!sg",
      name = "o",
      descriptor = "Lgh;"
   )
   public static class572 field6083 = new class572(5, -2);
   @OriginalMember(
      owner = "client!sg",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field6084 = false;
   @OriginalMember(
      owner = "client!sg",
      name = "k",
      descriptor = "I"
   )
   public static int field6077;
   @OriginalMember(
      owner = "client!sg",
      name = "m",
      descriptor = "I"
   )
   public static int field6078;
   @OriginalMember(
      owner = "client!sg",
      name = "r",
      descriptor = "I"
   )
   public static int field6079;
   @OriginalMember(
      owner = "client!sg",
      name = "q",
      descriptor = "I"
   )
   public static int field6080;
   @OriginalMember(
      owner = "client!sg",
      name = "l",
      descriptor = "Lmh;"
   )
   public static class656 field6082;

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method3169(int arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         int var3 = -118 % ((23 - arg0) / 60);
         ++field6079;
         if (arg1 != null) {
            if (arg1.startsWith("*")) {
               arg1 = arg1.substring(1);
            }

            String var4 = class496.method3743(arg1, false);
            if (var4 != null) {
               int var5 = 0;
               if (var2 || var5 < class791.field11564) {
                  do {
                     String var6 = class306.field4428[var5];
                     if (var6.startsWith("*")) {
                        var6 = var6.substring(1);
                     }

                     String var7 = class496.method3743(var6, false);
                     if (var7 != null && var7.equals(var4)) {
                        --class791.field11564;
                        int var8 = var5;
                        if (var2) {
                           class306.field4428[var5] = class306.field4428[var5 + 1];
                           class546.field7902[var5] = class546.field7902[var5 + 1];
                           class497.field7272[var5] = class497.field7272[var5 + 1];
                           class29.field454[var5] = class29.field454[var5 - -1];
                           class455.field6640[var5] = class455.field6640[var5 + 1];
                           var8 = var5 + 1;
                        }

                        while(true) {
                           while(~class791.field11564 < ~var8) {
                              class306.field4428[var8] = class306.field4428[var8 + 1];
                              class546.field7902[var8] = class546.field7902[var8 + 1];
                              class497.field7272[var8] = class497.field7272[var8 + 1];
                              class29.field454[var8] = class29.field454[var8 - -1];
                              class455.field6640[var8] = class455.field6640[var8 + 1];
                              ++var8;
                           }

                           class447.field6528 = class660.field9612;
                           ++class383.field5662;
                           class542 var9 = class549.method4093((byte)-113, class613.field8900, class126.field2108);
                           var9.field7859.method3571(255, class70.method747(arg1, -9));
                           var9.field7859.method3546((byte)-109, arg1);
                           class740.method5332(var9, (byte)77);
                           if (!var2) {
                              return;
                           }

                           ++var8;
                        }
                     }

                     ++var5;
                  } while(var5 < class791.field11564);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6085[3] + arg0 + ',' + (arg1 != null ? field6085[1] : field6085[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method3170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field6080;
         class245.field3527[class614.field8921++] = new class743(arg5, arg6, arg0, arg8, arg8, arg0, arg1, arg7, arg7, arg1, arg4, arg4, arg3, arg3);
         if (arg2 <= 11) {
            field6084 = false;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field6085[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3171(byte arg0) {
      try {
         field6076 = null;
         field6075 = null;
         if (arg0 != -32) {
            method3169(-77, (String)null);
         }

         field6083 = null;
         field6082 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6085[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(FFI[FIIIIIFF)V"
   )
   public final void method235(float arg0, float arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10) {
      boolean var12 = client.field4564;

      try {
         ++field6078;
         int var13 = (int)((float)arg4 * arg10 - 1.0F);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg5 * arg0 - 1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg8 * arg9 - 1.0F);
         int var18 = var17 & 255;
         float var19 = (float)arg7 * arg9;
         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = var19 - (float)var20;
         float var23 = -var22 + 1.0F;
         int var24 = var21 & var18;
         int var25 = var20 & var18;
         float var26 = class343.method2647(var22, -101);
         int var27 = this.field6081[var25];
         if (arg6 != 6794) {
            this.field6081 = null;
         }

         int var28 = this.field6081[var24];
         int var29 = 0;
         if (var12 || ~var29 > ~arg5) {
            do {
               float var30 = (float)var29 * arg0;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = var30 - (float)var31;
               float var34 = 1.0F - var33;
               int var35 = var31 & var16;
               int var36 = var32 & var16;
               float var37 = class343.method2647(var33, -124);
               int var38 = this.field6081[var27 + var35];
               int var39 = this.field6081[var27 + var36];
               int var40 = this.field6081[var28 + var35];
               int var41 = this.field6081[var28 + var36];
               int var42 = 0;
               if (var12 || ~arg4 < ~var42) {
                  do {
                     float var43 = (float)var42 * arg10;
                     int var44 = (int)var43;
                     int var45 = var44 + 1;
                     float var46 = (float)(-var44) + var43;
                     float var47 = 1.0F - var46;
                     int var48 = var44 & var14;
                     int var49 = var45 & var14;
                     float var50 = class343.method2647(var46, arg6 + -6770);
                     arg3[arg2++] = arg1 * class141.method1333(class141.method1333(class141.method1333(class125.method1218(var46, 1482, var33, var22, class66.method706(this.field6081[var41 + var49], 7)), class125.method1218(var47, 1482, var33, var22, class66.method706(7, this.field6081[var41 + var48])), var50, class513.method3878(arg6, -24523)), class141.method1333(class125.method1218(var46, class513.method3878(arg6, 8000), var34, var22, class66.method706(7, this.field6081[var49 - -var40])), class125.method1218(var47, 1482, var34, var22, class66.method706(this.field6081[var40 + var48], 7)), var50, -17729), var37, arg6 + -24523), class141.method1333(class141.method1333(class125.method1218(var46, 1482, var33, var23, class66.method706(7, this.field6081[var39 + var49])), class125.method1218(var47, 1482, var33, var23, class66.method706(7, this.field6081[var39 + var48])), var50, -17729), class141.method1333(class125.method1218(var46, 1482, var34, var23, class66.method706(this.field6081[var38 + var49], 7)), class125.method1218(var47, 1482, var34, var23, class66.method706(7, this.field6081[var38 + var48])), var50, class513.method3878(arg6, -24523)), var37, arg6 + -24523), var26, -17729);
                     ++var42;
                  } while(~arg4 < ~var42);
               }

               ++var29;
            } while(~var29 > ~arg5);

         }
      } catch (RuntimeException var52) {
         throw class608.method4462(var52, field6085[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6085[1] : field6085[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class415(int arg0) {
      boolean var2 = client.field4564;
      super();
      this.field6081 = new int[512];

      try {
         Random var3 = new Random((long)arg0);
         int var4 = 0;
         if (var2) {
            this.field6081[var4] = this.field6081[var4 + 256] = var4;
            ++var4;
         }

         while(true) {
            while(~var4 > -257) {
               this.field6081[var4] = this.field6081[var4 + 256] = var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && var5 >= 256) {
                  return;
               } else {
                  do {
                     int var6 = var3.nextInt() & 255;
                     int var7 = this.field6081[var6];
                     this.field6081[var6] = this.field6081[var6 - -256] = this.field6081[var5];
                     this.field6081[var5] = this.field6081[var5 + 256] = var7;
                     ++var5;
                  } while(var5 < 256);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6085[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3173(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
