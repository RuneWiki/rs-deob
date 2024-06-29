import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public class class219 extends class294 {
   @OriginalMember(
      owner = "client!lka",
      name = "u",
      descriptor = "Lc;"
   )
   private class652 field3305;
   @OriginalMember(
      owner = "client!lka",
      name = "F",
      descriptor = "Llja;"
   )
   private class404 field3299;
   @OriginalMember(
      owner = "client!lka",
      name = "n",
      descriptor = "Lg;"
   )
   private class361 field3314;
   @OriginalMember(
      owner = "client!lka",
      name = "I",
      descriptor = "I"
   )
   private int field3312;
   @OriginalMember(
      owner = "client!lka",
      name = "v",
      descriptor = "I"
   )
   private int field3306;
   @OriginalMember(
      owner = "client!lka",
      name = "A",
      descriptor = "I"
   )
   private int field3301;
   @OriginalMember(
      owner = "client!lka",
      name = "x",
      descriptor = "I"
   )
   private int field3310;
   @OriginalMember(
      owner = "client!lka",
      name = "D",
      descriptor = "[[F"
   )
   private float[][] field3317;
   @OriginalMember(
      owner = "client!lka",
      name = "y",
      descriptor = "[[F"
   )
   private float[][] field3323;
   @OriginalMember(
      owner = "client!lka",
      name = "p",
      descriptor = "[[F"
   )
   private float[][] field3303;
   @OriginalMember(
      owner = "client!lka",
      name = "G",
      descriptor = "I"
   )
   private int field3315;
   @OriginalMember(
      owner = "client!lka",
      name = "q",
      descriptor = "Lli;"
   )
   private class112 field3300;
   @OriginalMember(
      owner = "client!lka",
      name = "t",
      descriptor = "Lle;"
   )
   private class172 field3302;
   @OriginalMember(
      owner = "client!lka",
      name = "E",
      descriptor = "Lgs;"
   )
   private class436 field3318;
   @OriginalMember(
      owner = "client!lka",
      name = "B",
      descriptor = "Lgs;"
   )
   private class436 field3304;
   @OriginalMember(
      owner = "client!lka",
      name = "m",
      descriptor = "Lica;"
   )
   private class354 field3313;
   @OriginalMember(
      owner = "client!lka",
      name = "L",
      descriptor = "Lfc;"
   )
   private class37 field3308;
   @OriginalMember(
      owner = "client!lka",
      name = "s",
      descriptor = "Let;"
   )
   private class389 field3311;
   @OriginalMember(
      owner = "client!lka",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3324 = new String[]{method1899(method1898("[0T%")), method1899(method1898("Nk\u0016g=")), method1899(method1898("Y.Yg|\\+Q=~\u001d")), method1899(method1898("Y.Yg\u0001\u001d")), method1899(method1898("Y.Yg\u0005\u001d")), method1899(method1898("Y.Yg\u0003\u001d")), method1899(method1898("Y.Yg\u0004\u001d")), method1899(method1898("Y.Yg\u0002\u001d"))};
   @OriginalMember(
      owner = "client!lka",
      name = "J",
      descriptor = "Lnaa;"
   )
   public static class113 field3320 = new class113(9, 2);
   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field3321 = new int[8];
   @OriginalMember(
      owner = "client!lka",
      name = "w",
      descriptor = "I"
   )
   public static int field3298;
   @OriginalMember(
      owner = "client!lka",
      name = "H",
      descriptor = "I"
   )
   public static int field3307;
   @OriginalMember(
      owner = "client!lka",
      name = "r",
      descriptor = "I"
   )
   private int field3309;
   @OriginalMember(
      owner = "client!lka",
      name = "C",
      descriptor = "I"
   )
   public static int field3316;
   @OriginalMember(
      owner = "client!lka",
      name = "K",
      descriptor = "I"
   )
   public static int field3319;
   @OriginalMember(
      owner = "client!lka",
      name = "o",
      descriptor = "Lrr;"
   )
   public static class678 field3322;

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(IS)V",
      line = 13
   )
   private final void method1893(int arg0, short arg1) {
      try {
         label20: {
            if (!this.field3305.field9695) {
               this.field3313.method2841(-3, arg1);
               if (!client.field1786) {
                  break label20;
               }
            }

            this.field3313.method2873(arg1, (byte)110);
         }

         if (arg0 != 16187) {
            this.method1896(-51, 104, -41, 4, (boolean[][])null);
         }

         ++field3298;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3324[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(I)[Lfl;",
      line = 30
   )
   public static final class321[] method1894(int arg0) {
      try {
         ++field3307;
         return arg0 != -12323 ? null : new class321[]{class389.field6120, class389.field6121, class389.field6122, class389.field6123, class389.field6124, class389.field6125, class389.field6126, class389.field6127, class389.field6128, class389.field6129, class389.field6130, class389.field6131, class389.field6132};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3324[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(B)V",
      line = 45
   )
   public static void method1895(byte arg0) {
      try {
         field3320 = null;
         field3322 = null;
         if (arg0 != -13) {
            field3320 = null;
         }

         field3321 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3324[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(IIII[[Z)V",
      line = 61
   )
   public final void method1896(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
      boolean var6 = client.field1786;

      try {
         ++field3316;
         if (this.field3302 != null) {
            if (arg1 + arg3 >= this.field3312) {
               if (this.field3306 >= -arg3 + arg1) {
                  if (~(arg0 - -arg3) <= ~this.field3301) {
                     if (~(arg0 - arg3) >= ~this.field3310) {
                        if (arg2 == 255) {
                           int var7 = this.field3301;
                           if (var6 || this.field3310 >= var7) {
                              do {
                                 int var8 = this.field3312;
                                 if (var6 || this.field3306 >= var8) {
                                    do {
                                       int var9 = var8 - arg1;
                                       int var10 = -arg0 + var7;
                                       if (-arg3 < var9 && var9 < arg3 && ~(-arg3) > ~var10 && arg3 > var10 && arg4[arg3 + var9][arg3 + var10]) {
                                          this.field3305.method4756((int)(this.field3299.method3252((byte)-95) * 255.0F) << 24, arg2 + -228);
                                          this.field3305.method4768(-677, (class436)null, this.field3318, this.field3304, (class436)null);
                                          this.field3305.method4760(this.field3315, this.field3302, 4, 0, -125);
                                          return;
                                       }

                                       ++var8;
                                    } while(this.field3306 >= var8);
                                 }

                                 ++var7;
                              } while(this.field3310 >= var7);

                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field3324[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3324[1] : field3324[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 123
   )
   private final void method1897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field3319;
         long var9 = -1L;
         int var11 = (arg3 << this.field3314.field4375) + arg0;
         int var12 = (arg1 << this.field3314.field4375) + arg5;
         int var13 = this.field3314.method2312(var11, var12, arg2 + -7813);
         if (~(arg0 & 127) == -1 || ~(127 & arg5) == -1) {
            var9 = (65535L & (long)var12) << 16 | 65535L & (long)var11;
            class294 var14 = this.field3311.method3141(var9, true);
            if (var14 != null) {
               this.method1893(16187, ((class611)var14).field8894);
               return;
            }
         }

         short var15 = (short)(this.field3309++);
         if (var9 != -1L) {
            this.field3311.method3143(62, new class611(var15), var9);
         }

         float var16;
         float var17;
         float var18;
         label112: {
            if (arg0 != 0 || ~arg5 != -1) {
               if (~this.field3314.field4377 != ~arg0 || arg5 != 0) {
                  if (this.field3314.field4377 == arg0 && this.field3314.field4377 == arg5) {
                     var16 = this.field3303[arg6 - -1][arg4 - -1];
                     var17 = this.field3317[arg6 - -1][arg4 + 1];
                     var18 = this.field3323[arg6 + 1][arg4 + 1];
                     if (!var8) {
                        break label112;
                     }
                  }

                  if (~arg0 != -1 || this.field3314.field4377 != arg5) {
                     float var19 = (float)arg0 / (float)this.field3314.field4377;
                     float var20 = (float)arg5 / (float)this.field3314.field4377;
                     float var21 = this.field3303[arg6][arg4];
                     float var22 = this.field3323[arg6][arg4];
                     float var23 = this.field3317[arg6][arg4];
                     float var24 = this.field3303[arg6 - -1][arg4];
                     float var25 = this.field3323[arg6 + 1][arg4];
                     float var26 = this.field3317[arg6 - -1][arg4];
                     float var27 = (this.field3323[arg6 - -1][arg4 + 1] + -var25) * var19 + var25;
                     float var28 = (this.field3303[arg6][arg4 - -1] - var21) * var19 + var21;
                     float var29 = (this.field3303[arg6 - -1][arg4 + 1] - var24) * var19 + var24;
                     float var30 = (this.field3317[arg6][arg4 + 1] + -var23) * var19 + var23;
                     float var31 = (this.field3323[arg6][arg4 - -1] - var22) * var19 + var22;
                     float var32 = (this.field3317[arg6 - -1][arg4 + 1] - var26) * var19 + var26;
                     var16 = (var29 - var28) * var20 + var28;
                     var18 = (-var31 + var27) * var20 + var31;
                     var17 = (var32 - var30) * var20 + var30;
                     if (!var8) {
                        break label112;
                     }
                  }

                  var17 = this.field3317[arg6][arg4 + 1];
                  var16 = this.field3303[arg6][arg4 + 1];
                  var18 = this.field3323[arg6][arg4 + 1];
                  if (!var8) {
                     break label112;
                  }
               }

               var18 = this.field3323[arg6 + 1][arg4];
               var16 = this.field3303[arg6 + 1][arg4];
               var17 = this.field3317[arg6 + 1][arg4];
               if (!var8) {
                  break label112;
               }
            }

            var18 = this.field3323[arg6][arg4];
            var17 = this.field3317[arg6][arg4];
            var16 = this.field3303[arg6][arg4];
         }

         float var33 = (float)(this.field3299.method3246((byte)-127) + -var11);
         float var34 = (float)(-var13 + this.field3299.method3253(0));
         float var35 = (float)(this.field3299.method3247((byte)-127) + -var12);
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var33 * var37;
         float var39 = var34 * var37;
         float var40 = var35 * var37;
         float var41 = var36 / (float)this.field3299.method3249((byte)36);
         float var42 = -(var41 * var41) + 1.0F;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var17 * var40 + var16 * var38 + var18 * var39;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var42 * var43 * 2.0F;
         if (var44 > 1.0F) {
            var44 = 1.0F;
         }

         int var45 = this.field3299.method3251(arg2 ^ arg2);
         int var46 = (int)((float)((16752682 & var45) >> 16) * var44);
         if (~var46 < -256) {
            var46 = 255;
         }

         int var47 = (int)((float)((var45 & 65398) >> 8) * var44);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48 = (int)((float)(var45 & 255) * var44);
         if (~var48 < -256) {
            var48 = 255;
         }

         label61: {
            if (this.field3305.field9695) {
               this.field3308.method265(arg2 + 21563, (float)var11);
               this.field3308.method265(29481, (float)var13);
               this.field3308.method265(29481, (float)var12);
               if (!var8) {
                  break label61;
               }
            }

            this.field3308.method266(115976568, (float)var11);
            this.field3308.method266(115976568, (float)var13);
            this.field3308.method266(115976568, (float)var12);
         }

         this.field3308.method2864(-26110, var46);
         this.field3308.method2864(-26110, var47);
         this.field3308.method2864(-26110, var48);
         this.field3308.method2864(-26110, 255);
         this.method1893(arg2 ^ 8661, var15);
      } catch (RuntimeException var50) {
         throw class482.method3757(var50, field3324[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "<init>",
      descriptor = "(Lc;Lg;Llja;[I)V",
      line = 294
   )
   public class219(class652 param1, class361 param2, class404 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1898(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1899(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
