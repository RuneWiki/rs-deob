import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class246 extends class264 {
   @OriginalMember(
      owner = "client!dia",
      name = "K",
      descriptor = "I"
   )
   private int field3393 = 204;
   @OriginalMember(
      owner = "client!dia",
      name = "F",
      descriptor = "I"
   )
   private int field3394 = 1;
   @OriginalMember(
      owner = "client!dia",
      name = "I",
      descriptor = "I"
   )
   private int field3397 = 1;
   @OriginalMember(
      owner = "client!dia",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3400 = new String[]{method1872(method1871("dow\u001d")), method1872(method1871("q45_h")), method1872(method1871("nsz_T\"")), method1872(method1871("nsz_Q\"")), method1872(method1871("nsz_V\"")), method1872(method1871("nsz_W\""))};
   @OriginalMember(
      owner = "client!dia",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field3392 = new int[13];
   @OriginalMember(
      owner = "client!dia",
      name = "M",
      descriptor = "Lgo;"
   )
   public static class656 field3399 = new class656();
   @OriginalMember(
      owner = "client!dia",
      name = "J",
      descriptor = "I"
   )
   public static int field3391;
   @OriginalMember(
      owner = "client!dia",
      name = "N",
      descriptor = "I"
   )
   public static int field3395;
   @OriginalMember(
      owner = "client!dia",
      name = "L",
      descriptor = "I"
   )
   public static int field3396;
   @OriginalMember(
      owner = "client!dia",
      name = "G",
      descriptor = "Lrga;"
   )
   public static class253 field3398;

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(IIIZIIII)V",
      line = 6
   )
   public static final void method1869(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg1 <= 62) {
            method1869(72, 88, -56, false, 35, 123, 18, 12);
         }

         ++field3395;
         if ((arg3 ? class300.field4107.field6428.method4286(-55) : class300.field4107.field6439.method4286(93)) != 0 && arg2 != 0 && ~class673.field9755 > -51 && ~arg0 != 0) {
            class534.field7614[class673.field9755++] = new class245((byte)(arg3 ? 3 : 2), arg0, arg2, arg6, arg5, arg7, arg4, (class731)null);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3400[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 24
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label46: {
            label45: {
               label44: {
                  if (arg0 != 0) {
                     if (arg0 == 1) {
                        break label44;
                     }

                     if (arg0 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field3394 = arg1.method1143(-15465);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field3397 = arg1.method1143(-15465);
               if (!var4) {
                  break label46;
               }
            }

            this.field3393 = arg1.method1211(-26166);
         }

         if (arg2 < 49) {
            this.field3393 = -64;
         }

         ++field3391;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3400[2] + arg0 + ',' + (arg1 != null ? field3400[1] : field3400[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "<init>",
      descriptor = "()V",
      line = 67
   )
   public class246() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "(B)V",
      line = 74
   )
   public static void method1870(byte arg0) {
      try {
         field3398 = null;
         if (arg0 < 92) {
            method1869(-126, -20, 67, true, 74, 87, -3, -67);
         }

         field3399 = null;
         field3392 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3400[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(II)[I",
      line = 96
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3396;
         int var4 = 18 % ((24 - arg1) / 44);
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = 0;
            if (var3 || ~var6 > ~class430.field6152) {
               do {
                  int var7 = class258.field3496[var6];
                  int var8 = class666.field9668[arg0];
                  int var9 = this.field3394 * var7 >> 12;
                  int var10 = this.field3397 * var8 >> 12;
                  int var11 = var7 % (4096 / this.field3394) * this.field3394;
                  int var12 = var8 % (4096 / this.field3397) * this.field3397;
                  if (this.field3393 > var12) {
                     var9 -= var10;
                     if (var3) {
                        var9 += 4;
                     }

                     while(~var9 > -1) {
                        var9 += 4;
                     }

                     if (var3) {
                        var9 -= 4;
                     }

                     while(~var9 < -4) {
                        var9 -= 4;
                     }

                     if (var9 != 1) {
                        var5[var6] = 0;
                        if (!var3) {
                           ++var6;
                           continue;
                        }
                     }

                     if (~this.field3393 < ~var11) {
                        var5[var6] = 0;
                        if (!var3) {
                           ++var6;
                           continue;
                        }
                     }
                  }

                  if (var11 >= this.field3393) {
                     var5[var6] = 4096;
                     ++var6;
                  } else {
                     int var13 = var9 - var10;
                     if (var3) {
                        var13 += 4;
                     }

                     while(~var13 > -1) {
                        var13 += 4;
                     }

                     if (var3) {
                        var13 -= 4;
                     }

                     while(var13 > 3) {
                        var13 -= 4;
                     }

                     if (~var13 < -1) {
                        var5[var6] = 0;
                        if (var3) {
                           var5[var6] = 4096;
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5[var6] = 4096;
                        ++var6;
                     }
                  }
               } while(~var6 > ~class430.field6152);
            }
         }

         return var5;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field3400[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1871(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1872(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
