import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class220 {
   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "Ljn;"
   )
   private static class255 field3325 = new class255();

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ljn;)B",
      line = 4
   )
   private static final byte method1900(class255 arg0) {
      return (byte)method1906(8, arg0);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "()V",
      line = 8
   )
   public static void method1901() {
      field3325 = null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([I[I[I[BIII)V",
      line = 17
   )
   private static final void method1902(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
      int var7 = 0;

      for(int var8 = arg4; var8 <= arg5; ++var8) {
         for(int var17 = 0; var17 < arg6; ++var17) {
            if (arg3[var17] == var8) {
               arg2[var7] = var17;
               ++var7;
            }
         }
      }

      for(int var9 = 0; var9 < 23; ++var9) {
         arg1[var9] = 0;
      }

      for(int var10 = 0; var10 < arg6; ++var10) {
         ++arg1[arg3[var10] + 1];
      }

      for(int var11 = 1; var11 < 23; ++var11) {
         arg1[var11] += arg1[var11 - 1];
      }

      for(int var12 = 0; var12 < 23; ++var12) {
         arg0[var12] = 0;
      }

      int var13 = 0;

      for(int var14 = arg4; var14 <= arg5; ++var14) {
         int var16 = arg1[var14 + 1] - arg1[var14] + var13;
         arg0[var14] = var16 - 1;
         var13 = var16 << 1;
      }

      for(int var15 = arg4 + 1; var15 <= arg5; ++var15) {
         arg1[var15] = (arg0[var15 - 1] + 1 << 1) - arg1[var15];
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(Ljn;)V",
      line = 86
   )
   private static final void method1903(class255 arg0) {
      byte var1 = arg0.field3830;
      int var2 = arg0.field3825;
      int var3 = arg0.field3838;
      int var4 = arg0.field3844;
      int[] var5 = class206.field3133;
      int var6 = arg0.field3843;
      byte[] var7 = arg0.field3859;
      int var8 = arg0.field3851;
      int var9 = arg0.field3834;
      int var10 = var9;
      int var11 = arg0.field3837 + 1;

      label56:
      while(true) {
         if (var2 > 0) {
            while(true) {
               if (var9 == 0) {
                  break label56;
               }

               if (var2 == 1) {
                  if (var9 == 0) {
                     var2 = 1;
                     break label56;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         while(var3 != var11) {
            var1 = (byte)var4;
            int var12 = var5[var6];
            byte var13 = (byte)var12;
            var6 = var12 >> 8;
            ++var3;
            if (var4 != var13) {
               var4 = var13;
               if (var9 == 0) {
                  var2 = 1;
                  break label56;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            } else {
               if (var3 != var11) {
                  var2 = 2;
                  int var15 = var5[var6];
                  byte var16 = (byte)var15;
                  var6 = var15 >> 8;
                  ++var3;
                  if (var3 != var11) {
                     if (var4 != var16) {
                        var4 = var16;
                     } else {
                        var2 = 3;
                        int var17 = var5[var6];
                        byte var18 = (byte)var17;
                        var6 = var17 >> 8;
                        ++var3;
                        if (var3 != var11) {
                           if (var4 != var18) {
                              var4 = var18;
                           } else {
                              int var19 = var5[var6];
                              byte var20 = (byte)var19;
                              int var21 = var19 >> 8;
                              ++var3;
                              var2 = (var20 & 255) + 4;
                              int var22 = var5[var21];
                              var4 = (byte)var22;
                              var6 = var22 >> 8;
                              ++var3;
                           }
                        }
                     }
                  }
                  continue label56;
               }

               if (var9 == 0) {
                  var2 = 1;
                  break label56;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            }
         }

         var2 = 0;
         break;
      }

      int var14 = arg0.field3847;
      arg0.field3847 += var10 - var9;
      arg0.field3830 = var1;
      arg0.field3825 = var2;
      arg0.field3838 = var3;
      arg0.field3844 = var4;
      class206.field3133 = var5;
      arg0.field3843 = var6;
      arg0.field3859 = var7;
      arg0.field3851 = var8;
      arg0.field3834 = var9;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(Ljn;)V",
      line = 244
   )
   private static final void method1904(class255 arg0) {
      arg0.field3836 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (arg0.field3827[var1]) {
            arg0.field3854[arg0.field3836] = (byte)var1;
            ++arg0.field3836;
         }
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "e",
      descriptor = "(Ljn;)B",
      line = 260
   )
   private static final byte method1905(class255 arg0) {
      return (byte)method1906(1, arg0);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILjn;)I",
      line = 272
   )
   private static final int method1906(int arg0, class255 arg1) {
      while(arg1.field3832 < arg0) {
         arg1.field3858 = arg1.field3858 << 8 | arg1.field3848[arg1.field3833] & 255;
         arg1.field3832 += 8;
         ++arg1.field3833;
         ++arg1.field3839;
      }

      int var2 = arg1.field3858 >> arg1.field3832 - arg0 & (1 << arg0) - 1;
      arg1.field3832 -= arg0;
      return var2;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([BI[BII)I",
      line = 301
   )
   public static final int method1907(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      class255 var5 = field3325;
      synchronized(field3325) {
         field3325.field3848 = arg2;
         field3325.field3833 = arg4;
         field3325.field3859 = arg0;
         field3325.field3851 = 0;
         field3325.field3834 = arg1;
         field3325.field3832 = 0;
         field3325.field3858 = 0;
         field3325.field3839 = 0;
         field3325.field3847 = 0;
         method1908(field3325);
         int var6 = arg1 - field3325.field3834;
         field3325.field3848 = null;
         field3325.field3859 = null;
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "(Ljn;)V",
      line = 331
   )
   private static final void method1908(class255 arg0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = 0;
      int[] var20 = null;
      int[] var21 = null;
      int[] var22 = null;
      arg0.field3826 = 1;
      if (class206.field3133 == null) {
         class206.field3133 = new int[arg0.field3826 * 100000];
      }

      boolean var23 = true;

      while(true) {
         while(var23) {
            byte var24 = method1900(arg0);
            if (var24 == 23) {
               return;
            }

            byte var25 = method1900(arg0);
            byte var26 = method1900(arg0);
            byte var27 = method1900(arg0);
            byte var28 = method1900(arg0);
            byte var29 = method1900(arg0);
            byte var30 = method1900(arg0);
            byte var31 = method1900(arg0);
            byte var32 = method1900(arg0);
            byte var33 = method1900(arg0);
            byte var34 = method1905(arg0);
            arg0.field3849 = 0;
            byte var35 = method1900(arg0);
            arg0.field3849 = arg0.field3849 << 8 | var35 & 255;
            byte var36 = method1900(arg0);
            arg0.field3849 = arg0.field3849 << 8 | var36 & 255;
            byte var37 = method1900(arg0);
            arg0.field3849 = arg0.field3849 << 8 | var37 & 255;

            for(int var38 = 0; var38 < 16; ++var38) {
               byte var101 = method1905(arg0);
               if (var101 == 1) {
                  arg0.field3828[var38] = true;
               } else {
                  arg0.field3828[var38] = false;
               }
            }

            for(int var39 = 0; var39 < 256; ++var39) {
               arg0.field3827[var39] = false;
            }

            for(int var40 = 0; var40 < 16; ++var40) {
               if (arg0.field3828[var40]) {
                  for(int var99 = 0; var99 < 16; ++var99) {
                     byte var100 = method1905(arg0);
                     if (var100 == 1) {
                        arg0.field3827[var40 * 16 + var99] = true;
                     }
                  }
               }
            }

            method1904(arg0);
            int var41 = arg0.field3836 + 2;
            int var42 = method1906(3, arg0);
            int var43 = method1906(15, arg0);

            for(int var44 = 0; var44 < var43; ++var44) {
               int var97 = 0;

               while(true) {
                  byte var98 = method1905(arg0);
                  if (var98 == 0) {
                     arg0.field3852[var44] = (byte)var97;
                     break;
                  }

                  ++var97;
               }
            }

            byte[] var45 = new byte[6];
            byte var46 = 0;

            while(var46 < var42) {
               var45[var46] = var46++;
            }

            for(int var47 = 0; var47 < var43; ++var47) {
               byte var95 = arg0.field3852[var47];
               byte var96 = var45[var95];

               while(var95 > 0) {
                  var45[var95] = var45[var95 - 1];
                  --var95;
               }

               var45[0] = var96;
               arg0.field3842[var47] = var96;
            }

            for(int var48 = 0; var48 < var42; ++var48) {
               int var91 = method1906(5, arg0);

               for(int var92 = 0; var92 < var41; ++var92) {
                  while(true) {
                     byte var93 = method1905(arg0);
                     if (var93 == 0) {
                        arg0.field3850[var48][var92] = (byte)var91;
                        break;
                     }

                     byte var94 = method1905(arg0);
                     if (var94 == 0) {
                        ++var91;
                     } else {
                        --var91;
                     }
                  }
               }
            }

            for(int var49 = 0; var49 < var42; ++var49) {
               byte var88 = 32;
               byte var89 = 0;

               for(int var90 = 0; var90 < var41; ++var90) {
                  if (arg0.field3850[var49][var90] > var89) {
                     var89 = arg0.field3850[var49][var90];
                  }

                  if (arg0.field3850[var49][var90] < var88) {
                     var88 = arg0.field3850[var49][var90];
                  }
               }

               method1902(arg0.field3857[var49], arg0.field3829[var49], arg0.field3841[var49], arg0.field3850[var49], var88, var89, var41);
               arg0.field3831[var49] = var88;
            }

            int var50 = arg0.field3836 + 1;
            int var51 = -1;
            byte var52 = 0;

            for(int var53 = 0; var53 <= 255; ++var53) {
               arg0.field3835[var53] = 0;
            }

            int var54 = 4095;

            for(int var55 = 15; var55 >= 0; --var55) {
               for(int var87 = 15; var87 >= 0; --var87) {
                  arg0.field3845[var54] = (byte)(var55 * 16 + var87);
                  --var54;
               }

               arg0.field3840[var55] = var54 + 1;
            }

            int var56 = 0;
            if (var52 == 0) {
               ++var51;
               var52 = 50;
               byte var57 = arg0.field3842[var51];
               var19 = arg0.field3831[var57];
               var20 = arg0.field3857[var57];
               var22 = arg0.field3841[var57];
               var21 = arg0.field3829[var57];
            }

            int var102 = var52 - 1;
            int var58 = var19;

            int var59;
            byte var60;
            for(var59 = method1906(var19, arg0); var59 > var20[var58]; var59 = var59 << 1 | var60) {
               ++var58;
               var60 = method1905(arg0);
            }

            int var61 = var22[var59 - var21[var58]];

            while(true) {
               while(var50 != var61) {
                  if (var61 != 0 && var61 != 1) {
                     int var62 = var61 - 1;
                     byte var64;
                     if (var62 < 16) {
                        int var63 = arg0.field3840[0];
                        var64 = arg0.field3845[var62 + var63];

                        while(var62 > 3) {
                           int var65 = var62 + var63;
                           arg0.field3845[var65] = arg0.field3845[var65 - 1];
                           arg0.field3845[var65 - 1] = arg0.field3845[var65 - 2];
                           arg0.field3845[var65 - 2] = arg0.field3845[var65 - 3];
                           arg0.field3845[var65 - 3] = arg0.field3845[var65 - 4];
                           var62 -= 4;
                        }

                        while(var62 > 0) {
                           arg0.field3845[var62 + var63] = arg0.field3845[var62 + var63 - 1];
                           --var62;
                        }

                        arg0.field3845[var63] = var64;
                     } else {
                        int var66 = var62 / 16;
                        int var67 = var62 % 16;
                        int var68 = arg0.field3840[var66] + var67;
                        var64 = arg0.field3845[var68];

                        while(var68 > arg0.field3840[var66]) {
                           arg0.field3845[var68] = arg0.field3845[var68 - 1];
                           --var68;
                        }

                        int var10002 = arg0.field3840[var66]++;

                        while(var66 > 0) {
                           var10002 = arg0.field3840[var66]--;
                           arg0.field3845[arg0.field3840[var66]] = arg0.field3845[arg0.field3840[var66 - 1] + 16 - 1];
                           --var66;
                        }

                        var10002 = arg0.field3840[0]--;
                        arg0.field3845[arg0.field3840[0]] = var64;
                        if (arg0.field3840[0] == 0) {
                           int var69 = 4095;

                           for(int var70 = 15; var70 >= 0; --var70) {
                              for(int var71 = 15; var71 >= 0; --var71) {
                                 arg0.field3845[var69] = arg0.field3845[arg0.field3840[var70] + var71];
                                 --var69;
                              }

                              arg0.field3840[var70] = var69 + 1;
                           }
                        }
                     }

                     ++arg0.field3835[arg0.field3854[var64 & 255] & 255];
                     class206.field3133[var56] = arg0.field3854[var64 & 255] & 255;
                     ++var56;
                     if (var102 == 0) {
                        ++var51;
                        var102 = 50;
                        byte var72 = arg0.field3842[var51];
                        var19 = arg0.field3831[var72];
                        var20 = arg0.field3857[var72];
                        var22 = arg0.field3841[var72];
                        var21 = arg0.field3829[var72];
                     }

                     --var102;
                     int var73 = var19;

                     int var74;
                     byte var75;
                     for(var74 = method1906(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var75) {
                        ++var73;
                        var75 = method1905(arg0);
                     }

                     var61 = var22[var74 - var21[var73]];
                  } else {
                     int var76 = -1;
                     int var77 = 1;

                     do {
                        if (var61 == 0) {
                           var76 += var77;
                        } else if (var61 == 1) {
                           var76 += var77 * 2;
                        }

                        var77 *= 2;
                        if (var102 == 0) {
                           ++var51;
                           var102 = 50;
                           byte var78 = arg0.field3842[var51];
                           var19 = arg0.field3831[var78];
                           var20 = arg0.field3857[var78];
                           var22 = arg0.field3841[var78];
                           var21 = arg0.field3829[var78];
                        }

                        --var102;
                        int var79 = var19;

                        int var80;
                        byte var81;
                        for(var80 = method1906(var19, arg0); var80 > var20[var79]; var80 = var80 << 1 | var81) {
                           ++var79;
                           var81 = method1905(arg0);
                        }

                        var61 = var22[var80 - var21[var79]];
                     } while(var61 == 0 || var61 == 1);

                     ++var76;
                     byte var82 = arg0.field3854[arg0.field3845[arg0.field3840[0]] & 255];
                     arg0.field3835[var82 & 255] += var76;

                     while(var76 > 0) {
                        class206.field3133[var56] = var82 & 255;
                        ++var56;
                        --var76;
                     }
                  }
               }

               arg0.field3825 = 0;
               arg0.field3830 = 0;
               arg0.field3846[0] = 0;

               for(int var83 = 1; var83 <= 256; ++var83) {
                  arg0.field3846[var83] = arg0.field3835[var83 - 1];
               }

               for(int var84 = 1; var84 <= 256; ++var84) {
                  arg0.field3846[var84] += arg0.field3846[var84 - 1];
               }

               for(int var85 = 0; var85 < var56; ++var85) {
                  byte var86 = (byte)(class206.field3133[var85] & 255);
                  class206.field3133[arg0.field3846[var86 & 255]] |= var85 << 8;
                  ++arg0.field3846[var86 & 255];
               }

               arg0.field3843 = class206.field3133[arg0.field3849] >> 8;
               arg0.field3838 = 0;
               arg0.field3843 = class206.field3133[arg0.field3843];
               arg0.field3844 = (byte)(arg0.field3843 & 255);
               arg0.field3843 >>= 8;
               ++arg0.field3838;
               arg0.field3837 = var56;
               method1903(arg0);
               if (arg0.field3837 + 1 == arg0.field3838 && arg0.field3825 == 0) {
                  var23 = true;
                  break;
               }

               var23 = false;
               break;
            }
         }

         return;
      }
   }
}
