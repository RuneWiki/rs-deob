import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class608 {
   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "Lcja;"
   )
   private static class46 field8925 = new class46();

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "([BI[BII)I",
      line = 4
   )
   public static final int method4430(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      class46 var5 = field8925;
      synchronized(field8925) {
         field8925.field509 = arg2;
         field8925.field534 = arg4;
         field8925.field505 = arg0;
         field8925.field506 = 0;
         field8925.field519 = arg1;
         field8925.field531 = 0;
         field8925.field536 = 0;
         field8925.field525 = 0;
         field8925.field518 = 0;
         method4437(field8925);
         int var6 = arg1 - field8925.field519;
         field8925.field509 = null;
         field8925.field505 = null;
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "([I[I[I[BIII)V",
      line = 38
   )
   private static final void method4431(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
      owner = "client!pf",
      name = "c",
      descriptor = "(Lcja;)V",
      line = 107
   )
   private static final void method4432(class46 arg0) {
      byte var1 = arg0.field527;
      int var2 = arg0.field522;
      int var3 = arg0.field524;
      int var4 = arg0.field526;
      int[] var5 = class88.field1077;
      int var6 = arg0.field515;
      byte[] var7 = arg0.field505;
      int var8 = arg0.field506;
      int var9 = arg0.field519;
      int var10 = var9;
      int var11 = arg0.field517 + 1;

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

      int var14 = arg0.field518;
      arg0.field518 += var10 - var9;
      arg0.field527 = var1;
      arg0.field522 = var2;
      arg0.field524 = var3;
      arg0.field526 = var4;
      class88.field1077 = var5;
      arg0.field515 = var6;
      arg0.field505 = var7;
      arg0.field506 = var8;
      arg0.field519 = var9;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "(Lcja;)B",
      line = 260
   )
   private static final byte method4433(class46 arg0) {
      return (byte)method4435(8, arg0);
   }

   @OriginalMember(
      owner = "client!pf",
      name = "e",
      descriptor = "(Lcja;)B",
      line = 274
   )
   private static final byte method4434(class46 arg0) {
      return (byte)method4435(1, arg0);
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(ILcja;)I",
      line = 279
   )
   private static final int method4435(int arg0, class46 arg1) {
      while(arg1.field531 < arg0) {
         arg1.field536 = arg1.field536 << 8 | arg1.field509[arg1.field534] & 255;
         arg1.field531 += 8;
         ++arg1.field534;
         ++arg1.field525;
      }

      int var2 = arg1.field536 >> arg1.field531 - arg0 & (1 << arg0) - 1;
      arg1.field531 -= arg0;
      return var2;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "()V",
      line = 302
   )
   public static void method4436() {
      field8925 = null;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(Lcja;)V",
      line = 314
   )
   private static final void method4437(class46 arg0) {
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
      arg0.field535 = 1;
      if (class88.field1077 == null) {
         class88.field1077 = new int[arg0.field535 * 100000];
      }

      boolean var23 = true;

      while(true) {
         while(var23) {
            byte var24 = method4433(arg0);
            if (var24 == 23) {
               return;
            }

            byte var25 = method4433(arg0);
            byte var26 = method4433(arg0);
            byte var27 = method4433(arg0);
            byte var28 = method4433(arg0);
            byte var29 = method4433(arg0);
            byte var30 = method4433(arg0);
            byte var31 = method4433(arg0);
            byte var32 = method4433(arg0);
            byte var33 = method4433(arg0);
            byte var34 = method4434(arg0);
            arg0.field528 = 0;
            byte var35 = method4433(arg0);
            arg0.field528 = arg0.field528 << 8 | var35 & 255;
            byte var36 = method4433(arg0);
            arg0.field528 = arg0.field528 << 8 | var36 & 255;
            byte var37 = method4433(arg0);
            arg0.field528 = arg0.field528 << 8 | var37 & 255;

            for(int var38 = 0; var38 < 16; ++var38) {
               byte var101 = method4434(arg0);
               if (var101 == 1) {
                  arg0.field539[var38] = true;
               } else {
                  arg0.field539[var38] = false;
               }
            }

            for(int var39 = 0; var39 < 256; ++var39) {
               arg0.field512[var39] = false;
            }

            for(int var40 = 0; var40 < 16; ++var40) {
               if (arg0.field539[var40]) {
                  for(int var99 = 0; var99 < 16; ++var99) {
                     byte var100 = method4434(arg0);
                     if (var100 == 1) {
                        arg0.field512[var40 * 16 + var99] = true;
                     }
                  }
               }
            }

            method4438(arg0);
            int var41 = arg0.field530 + 2;
            int var42 = method4435(3, arg0);
            int var43 = method4435(15, arg0);

            for(int var44 = 0; var44 < var43; ++var44) {
               int var97 = 0;

               while(true) {
                  byte var98 = method4434(arg0);
                  if (var98 == 0) {
                     arg0.field537[var44] = (byte)var97;
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
               byte var95 = arg0.field537[var47];
               byte var96 = var45[var95];

               while(var95 > 0) {
                  var45[var95] = var45[var95 - 1];
                  --var95;
               }

               var45[0] = var96;
               arg0.field523[var47] = var96;
            }

            for(int var48 = 0; var48 < var42; ++var48) {
               int var91 = method4435(5, arg0);

               for(int var92 = 0; var92 < var41; ++var92) {
                  while(true) {
                     byte var93 = method4434(arg0);
                     if (var93 == 0) {
                        arg0.field510[var48][var92] = (byte)var91;
                        break;
                     }

                     byte var94 = method4434(arg0);
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
                  if (arg0.field510[var49][var90] > var89) {
                     var89 = arg0.field510[var49][var90];
                  }

                  if (arg0.field510[var49][var90] < var88) {
                     var88 = arg0.field510[var49][var90];
                  }
               }

               method4431(arg0.field513[var49], arg0.field521[var49], arg0.field511[var49], arg0.field510[var49], var88, var89, var41);
               arg0.field520[var49] = var88;
            }

            int var50 = arg0.field530 + 1;
            int var51 = -1;
            byte var52 = 0;

            for(int var53 = 0; var53 <= 255; ++var53) {
               arg0.field507[var53] = 0;
            }

            int var54 = 4095;

            for(int var55 = 15; var55 >= 0; --var55) {
               for(int var87 = 15; var87 >= 0; --var87) {
                  arg0.field533[var54] = (byte)(var55 * 16 + var87);
                  --var54;
               }

               arg0.field516[var55] = var54 + 1;
            }

            int var56 = 0;
            if (var52 == 0) {
               ++var51;
               var52 = 50;
               byte var57 = arg0.field523[var51];
               var19 = arg0.field520[var57];
               var20 = arg0.field513[var57];
               var22 = arg0.field511[var57];
               var21 = arg0.field521[var57];
            }

            int var102 = var52 - 1;
            int var58 = var19;

            int var59;
            byte var60;
            for(var59 = method4435(var19, arg0); var59 > var20[var58]; var59 = var59 << 1 | var60) {
               ++var58;
               var60 = method4434(arg0);
            }

            int var61 = var22[var59 - var21[var58]];

            while(true) {
               while(var50 != var61) {
                  if (var61 != 0 && var61 != 1) {
                     int var62 = var61 - 1;
                     byte var64;
                     if (var62 < 16) {
                        int var63 = arg0.field516[0];
                        var64 = arg0.field533[var62 + var63];

                        while(var62 > 3) {
                           int var65 = var62 + var63;
                           arg0.field533[var65] = arg0.field533[var65 - 1];
                           arg0.field533[var65 - 1] = arg0.field533[var65 - 2];
                           arg0.field533[var65 - 2] = arg0.field533[var65 - 3];
                           arg0.field533[var65 - 3] = arg0.field533[var65 - 4];
                           var62 -= 4;
                        }

                        while(var62 > 0) {
                           arg0.field533[var62 + var63] = arg0.field533[var62 + var63 - 1];
                           --var62;
                        }

                        arg0.field533[var63] = var64;
                     } else {
                        int var66 = var62 / 16;
                        int var67 = var62 % 16;
                        int var68 = arg0.field516[var66] + var67;
                        var64 = arg0.field533[var68];

                        while(var68 > arg0.field516[var66]) {
                           arg0.field533[var68] = arg0.field533[var68 - 1];
                           --var68;
                        }

                        int var10002 = arg0.field516[var66]++;

                        while(var66 > 0) {
                           var10002 = arg0.field516[var66]--;
                           arg0.field533[arg0.field516[var66]] = arg0.field533[arg0.field516[var66 - 1] + 16 - 1];
                           --var66;
                        }

                        var10002 = arg0.field516[0]--;
                        arg0.field533[arg0.field516[0]] = var64;
                        if (arg0.field516[0] == 0) {
                           int var69 = 4095;

                           for(int var70 = 15; var70 >= 0; --var70) {
                              for(int var71 = 15; var71 >= 0; --var71) {
                                 arg0.field533[var69] = arg0.field533[arg0.field516[var70] + var71];
                                 --var69;
                              }

                              arg0.field516[var70] = var69 + 1;
                           }
                        }
                     }

                     ++arg0.field507[arg0.field540[var64 & 255] & 255];
                     class88.field1077[var56] = arg0.field540[var64 & 255] & 255;
                     ++var56;
                     if (var102 == 0) {
                        ++var51;
                        var102 = 50;
                        byte var72 = arg0.field523[var51];
                        var19 = arg0.field520[var72];
                        var20 = arg0.field513[var72];
                        var22 = arg0.field511[var72];
                        var21 = arg0.field521[var72];
                     }

                     --var102;
                     int var73 = var19;

                     int var74;
                     byte var75;
                     for(var74 = method4435(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var75) {
                        ++var73;
                        var75 = method4434(arg0);
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
                           byte var78 = arg0.field523[var51];
                           var19 = arg0.field520[var78];
                           var20 = arg0.field513[var78];
                           var22 = arg0.field511[var78];
                           var21 = arg0.field521[var78];
                        }

                        --var102;
                        int var79 = var19;

                        int var80;
                        byte var81;
                        for(var80 = method4435(var19, arg0); var80 > var20[var79]; var80 = var80 << 1 | var81) {
                           ++var79;
                           var81 = method4434(arg0);
                        }

                        var61 = var22[var80 - var21[var79]];
                     } while(var61 == 0 || var61 == 1);

                     ++var76;
                     byte var82 = arg0.field540[arg0.field533[arg0.field516[0]] & 255];
                     arg0.field507[var82 & 255] += var76;

                     while(var76 > 0) {
                        class88.field1077[var56] = var82 & 255;
                        ++var56;
                        --var76;
                     }
                  }
               }

               arg0.field522 = 0;
               arg0.field527 = 0;
               arg0.field508[0] = 0;

               for(int var83 = 1; var83 <= 256; ++var83) {
                  arg0.field508[var83] = arg0.field507[var83 - 1];
               }

               for(int var84 = 1; var84 <= 256; ++var84) {
                  arg0.field508[var84] += arg0.field508[var84 - 1];
               }

               for(int var85 = 0; var85 < var56; ++var85) {
                  byte var86 = (byte)(class88.field1077[var85] & 255);
                  class88.field1077[arg0.field508[var86 & 255]] |= var85 << 8;
                  ++arg0.field508[var86 & 255];
               }

               arg0.field515 = class88.field1077[arg0.field528] >> 8;
               arg0.field524 = 0;
               arg0.field515 = class88.field1077[arg0.field515];
               arg0.field526 = (byte)(arg0.field515 & 255);
               arg0.field515 >>= 8;
               ++arg0.field524;
               arg0.field517 = var56;
               method4432(arg0);
               if (arg0.field517 + 1 == arg0.field524 && arg0.field522 == 0) {
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

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Lcja;)V",
      line = 817
   )
   private static final void method4438(class46 arg0) {
      arg0.field530 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (arg0.field512[var1]) {
            arg0.field540[arg0.field530] = (byte)var1;
            ++arg0.field530;
         }
      }

   }
}
