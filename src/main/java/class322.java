import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class class322 {
   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "I"
   )
   private int field4395 = 4;
   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "I"
   )
   private int field4393 = 4;
   @OriginalMember(
      owner = "client!vw",
      name = "i",
      descriptor = "[S"
   )
   private short[] field4397 = new short[512];
   @OriginalMember(
      owner = "client!vw",
      name = "e",
      descriptor = "I"
   )
   private int field4396 = 4;
   @OriginalMember(
      owner = "client!vw",
      name = "k",
      descriptor = "I"
   )
   private int field4401 = 0;
   @OriginalMember(
      owner = "client!vw",
      name = "l",
      descriptor = "I"
   )
   public int field4399 = 4;
   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4406 = new String[]{method2392(method2391("d[Lm>")), method2392(method2391("d[L\u0002\u007f|E\u0016\u0000>")), method2392(method2391("d[Lo>")), method2392(method2391("d[Lp>")), method2392(method2391("d[Lq>")), method2392(method2391("d[Ll>")), method2392(method2391("d[Ln>"))};
   @OriginalMember(
      owner = "client!vw",
      name = "d",
      descriptor = "I"
   )
   public static int field4394;
   @OriginalMember(
      owner = "client!vw",
      name = "f",
      descriptor = "I"
   )
   public static int field4398;
   @OriginalMember(
      owner = "client!vw",
      name = "c",
      descriptor = "I"
   )
   public static int field4400;
   @OriginalMember(
      owner = "client!vw",
      name = "j",
      descriptor = "I"
   )
   public static int field4402;
   @OriginalMember(
      owner = "client!vw",
      name = "h",
      descriptor = "I"
   )
   public static int field4403;
   @OriginalMember(
      owner = "client!vw",
      name = "g",
      descriptor = "I"
   )
   public static int field4404;
   @OriginalMember(
      owner = "client!vw",
      name = "m",
      descriptor = "[S"
   )
   private short[] field4405;

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 9
   )
   public static final void method2385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg1 == 255) {
            ++field4404;
            if (~arg3 != -9 && ~arg3 != -17) {
               class517 var19 = class663.field9659[arg0][arg2][arg4];
               if (var19 == null) {
                  var19 = new class517(arg0);
               }

               label38: {
                  if (~arg3 == -2) {
                     var19.field7470 = (short)arg6;
                     var19.field7473 = (short)arg5;
                     if (!client.field4360) {
                        break label38;
                     }
                  }

                  if (~arg3 == -3) {
                     var19.field7471 = (short)arg6;
                     var19.field7465 = (short)arg5;
                  }
               }

               if (class168.field2345) {
                  class137.method1080(-102);
               }
            } else if (arg3 != 8) {
               int var7 = (arg2 << class773.field11359) + class729.field10681;
               int var8 = -class729.field10681 + var7;
               int var9 = arg4 << class773.field11359;
               int var10 = class729.field10681 + var9;
               int var11 = class265.field3658[arg0].method2219(true, arg2 - -1, arg4);
               int var12 = class265.field3658[arg0].method2219(true, arg2, arg4 - -1);
               class484.field6923[class562.field8027++] = new class311(arg3, arg0, var7, var8, var8, var7, var11, var12, var12 - arg6, -arg6 + var11, var9, var10, var10, var9);
            } else {
               int var13 = arg2 << class773.field11359;
               int var14 = class729.field10681 + var13;
               int var15 = arg4 << class773.field11359;
               int var16 = class729.field10681 + var15;
               int var17 = class265.field3658[arg0].method2219(true, arg2, arg4);
               int var18 = class265.field3658[arg0].method2219(true, arg2 + 1, arg4 - -1);
               class484.field6923[class562.field8027++] = new class311(arg3, arg0, var13, var14, var14, var13, var17, var18, var18 - arg6, -arg6 + var17, var15, var16, var16, var15);
            }
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field4406[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(I)V",
      line = 80
   )
   private final void method2386(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IIBIIII)V",
      line = 103
   )
   public static final void method2387(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         if (arg2 != -72) {
            method2385(21, 116, -37, 126, -48, -71, 63);
         }

         class339[] var8 = class170.field2378;
         int var9 = 0;
         if (!var7 && var8.length <= var9) {
            ++field4394;
         } else {
            do {
               class339 var10 = var8[var9];
               if (var10 != null) {
                  if (var10.field4608 != 2 && !var7) {
                     ++var9;
                  } else {
                     class424.method3133(var10.field4610, arg0 >> 1, var10.field4611, 103, var10.field4614, arg6 >> 1, arg5, var10.field4615 * 2, arg3);
                     if (~class131.field1678[0] < 0 && ~(class96.field1234 % 20) > -11) {
                        class492 var11 = class672.field9736[var10.field4612];
                        int var12 = class131.field1678[0] + arg1 + -12;
                        int var13 = arg4 - (-class131.field1678[1] + 28);
                        var11.method3575(var12, var13);
                        class193.method1520(var13, -90, var13 - -var11.method957(), var12 + var11.method960(), var12);
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            } while(var8.length > var9);

            ++field4394;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field4406[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "<init>",
      descriptor = "(IIIII)V",
      line = 385
   )
   public class322(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field4401 = arg0;
         this.field4399 = arg1;
         this.field4396 = arg3;
         this.field4393 = arg2;
         this.field4395 = arg4;
         this.method2386(23293);
         this.method2388(0);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4406[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "c",
      descriptor = "(I)V",
      line = 145
   )
   private final void method2388(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field4400;
         Random var3 = new Random((long)this.field4401);
         int var4 = 0;
         if (var2) {
            this.field4397[var4] = (short)var4;
            ++var4;
         }

         while(true) {
            while(~var4 > -256) {
               this.field4397[var4] = (short)var4;
               ++var4;
            }

            int var5 = arg0;
            if (!var2) {
               if (!var2 && ~arg0 <= -256) {
                  return;
               } else {
                  do {
                     int var6 = 255 - var5;
                     int var7 = class258.method1968((byte)-54, var3, var6);
                     short var8 = this.field4397[var7];
                     this.field4397[var7] = this.field4397[var6];
                     this.field4397[var6] = this.field4397[var6 + 256] = var8;
                     ++var5;
                  } while(~var5 > -256);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4406[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IBII)V",
      line = 184
   )
   public final void method2389(int arg0, byte arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field4403;
         if (arg1 < -101) {
            int[] var6 = new int[arg3];
            int[] var7 = new int[arg2];
            int[] var8 = new int[arg0];
            int var9 = 0;
            if (var5) {
               var6[var9] = (var9 << 12) / arg3;
               ++var9;
            }

            while(true) {
               while(var9 < arg3) {
                  var6[var9] = (var9 << 12) / arg3;
                  ++var9;
               }

               int var10 = 0;
               if (!var5) {
                  if (var5) {
                     var7[var10] = (var10 << 12) / arg2;
                     ++var10;
                  }

                  while(true) {
                     while(arg2 > var10) {
                        var7[var10] = (var10 << 12) / arg2;
                        ++var10;
                     }

                     int var11 = 0;
                     if (!var5) {
                        if (var5) {
                           var8[var11] = (var11 << 12) / arg0;
                           ++var11;
                        }

                        while(true) {
                           while(arg0 > var11) {
                              var8[var11] = (var11 << 12) / arg0;
                              ++var11;
                           }

                           this.method19(0);
                           int var12 = 0;
                           if (!var5) {
                              if (!var5 && ~arg0 >= ~var12) {
                                 return;
                              }

                              do {
                                 int var13 = 0;
                                 if (var5 || ~arg2 < ~var13) {
                                    do {
                                       int var14 = 0;
                                       if (var5 || ~arg3 < ~var14) {
                                          do {
                                             class322 var10000;
                                             label125: {
                                                int var15 = 0;
                                                if (var5) {
                                                   var10000 = this;
                                                } else if (var15 >= this.field4399) {
                                                   var10000 = this;
                                                   if (!var5) {
                                                      break label125;
                                                   }
                                                } else {
                                                   var10000 = this;
                                                }

                                                while(true) {
                                                   int var16 = var10000.field4405[var15] << 12;
                                                   int var17 = this.field4395 * var16 >> 12;
                                                   int var18 = this.field4393 * var16 >> 12;
                                                   int var19 = var7[var13] * var16 >> 12;
                                                   int var20 = this.field4396 * var16 >> 12;
                                                   int var21 = var8[var12] * var16 >> 12;
                                                   int var22 = var6[var14] * var16 >> 12;
                                                   int var23 = this.field4393 * var22;
                                                   int var24 = this.field4395 * var21;
                                                   int var25 = this.field4396 * var19;
                                                   int var26 = var23 >> 12;
                                                   int var27 = var26 - -1;
                                                   int var28 = var25 >> 12;
                                                   int var29 = var26 & 255;
                                                   int var30 = var28 + 1;
                                                   int var31 = var28 & 255;
                                                   int var32 = var24 >> 12;
                                                   int var33 = var32 + 1;
                                                   int var34;
                                                   if (var17 > var33) {
                                                      var34 = var33 & 255;
                                                      if (var5) {
                                                         var34 = 0;
                                                      }
                                                   } else {
                                                      var34 = 0;
                                                   }

                                                   if (~var27 <= ~var18) {
                                                      var27 = 0;
                                                      if (var5) {
                                                         var27 &= 255;
                                                      }
                                                   } else {
                                                      var27 &= 255;
                                                   }

                                                   if (~var30 <= ~var20) {
                                                      var30 = 0;
                                                      if (var5) {
                                                         var30 &= 255;
                                                      }
                                                   } else {
                                                      var30 &= 255;
                                                   }

                                                   int var35 = var32 & 255;
                                                   int var36 = var24 & 4095;
                                                   int var37 = var25 & 4095;
                                                   int var38 = var23 & 4095;
                                                   short var39 = this.field4397[var34];
                                                   int var40 = var37 + -4096;
                                                   int var41 = class693.field10190[var37];
                                                   int var42 = class693.field10190[var38];
                                                   int var43 = var36 + -4096;
                                                   short var44 = this.field4397[var35];
                                                   int var45 = var38 + -4096;
                                                   int var46 = class693.field10190[var36];
                                                   short var47 = this.field4397[var30 + var39];
                                                   short var48 = this.field4397[var31 + var44];
                                                   short var49 = this.field4397[var31 - -var39];
                                                   short var50 = this.field4397[var30 + var44];
                                                   int var51 = class481.method3498(var36, (byte)124, var38, this.field4397[var29 + var48], var37);
                                                   int var52 = class481.method3498(var36, (byte)127, var45, this.field4397[var27 + var48], var37);
                                                   int var53 = var51 - -((-var51 + var52) * var42 >> 12);
                                                   int var54 = class481.method3498(var36, (byte)4, var38, this.field4397[var29 + var50], var40);
                                                   int var55 = class481.method3498(var36, (byte)124, var45, this.field4397[var27 + var50], var40);
                                                   int var56 = ((var55 - var54) * var42 >> 12) + var54;
                                                   int var57 = ((-var53 + var56) * var41 >> 12) + var53;
                                                   int var58 = class481.method3498(var43, (byte)-34, var38, this.field4397[var29 - -var49], var37);
                                                   int var59 = class481.method3498(var43, (byte)-54, var45, this.field4397[var27 + var49], var37);
                                                   int var60 = ((-var58 + var59) * var42 >> 12) + var58;
                                                   int var61 = class481.method3498(var43, (byte)127, var38, this.field4397[var29 + var47], var40);
                                                   int var62 = class481.method3498(var43, (byte)-49, var45, this.field4397[var27 - -var47], var40);
                                                   int var63 = ((var62 - var61) * var42 >> 12) + var61;
                                                   int var64 = ((-var60 + var63) * var41 >> 12) + var60;
                                                   this.method21(((-var57 + var64) * var46 >> 12) + var57, false, var15);
                                                   ++var15;
                                                   if (var15 >= this.field4399) {
                                                      var10000 = this;
                                                      if (!var5) {
                                                         break;
                                                      }
                                                   } else {
                                                      var10000 = this;
                                                   }
                                                }
                                             }

                                             var10000.method17(-118);
                                             ++var14;
                                          } while(~arg3 < ~var14);
                                       }

                                       ++var13;
                                    } while(~arg2 < ~var13);
                                 }

                                 ++var12;
                              } while(~arg0 < ~var12);

                              return;
                           }

                           ++var11;
                        }
                     }

                     ++var10;
                  }
               }

               ++var9;
            }
         }
      } catch (RuntimeException var66) {
         throw class237.method1823(var66, field4406[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IIB)V",
      line = 369
   )
   public static final void method2390(int arg0, int arg1, byte arg2) {
      try {
         ++field4398;
         class755 var3 = class317.method2325(0L, 101, 15);
         var3.method5479(1288);
         var3.field11184 = arg0;
         var3.field11181 = arg1;
         int var4 = 92 / ((50 - arg2) / 37);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4406[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IZI)V"
   )
   public abstract void method21(int arg0, boolean arg1, int arg2);

   @OriginalMember(
      owner = "client!vw",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method19(int arg0);

   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method17(int arg0);

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
