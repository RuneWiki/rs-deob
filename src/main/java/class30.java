import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!n")
public class class30 {
   @OriginalMember(
      owner = "loginapplet!n",
      name = "a",
      descriptor = "Lb;"
   )
   private static class4 field202 = new class4();

   @OriginalMember(
      owner = "loginapplet!n",
      name = "a",
      descriptor = "([I[I[I[BIII)V",
      line = 8
   )
   private static final void method142(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
      int var7 = 0;

      int var8;
      for(var8 = arg4; var8 <= arg5; ++var8) {
         for(int var9 = 0; var9 < arg6; ++var9) {
            if (arg3[var9] == var8) {
               arg2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         arg1[var8] = 0;
      }

      for(var8 = 0; var8 < arg6; ++var8) {
         ++arg1[arg3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         arg1[var8] += arg1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         arg0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = arg4; var8 <= arg5; ++var8) {
         var10 += arg1[var8 + 1] - arg1[var8];
         arg0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = arg4 + 1; var8 <= arg5; ++var8) {
         arg1[var8] = (arg0[var8 - 1] + 1 << 1) - arg1[var8];
      }

   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "a",
      descriptor = "(Lb;)V",
      line = 78
   )
   private static final void method143(class4 arg0) {
      byte var2 = arg0.field32;
      int var3 = arg0.field53;
      int var4 = arg0.field40;
      int var5 = arg0.field34;
      int[] var6 = class13.field109;
      int var7 = arg0.field28;
      byte[] var8 = arg0.field47;
      int var9 = arg0.field41;
      int var10 = arg0.field37;
      int var11 = var10;
      int var12 = arg0.field39 + 1;

      label67:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label67;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label67;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         boolean var14 = true;

         byte var1;
         while(var14) {
            var14 = false;
            if (var4 == var12) {
               var3 = 0;
               break label67;
            }

            var2 = (byte)var5;
            var7 = var6[var7];
            var1 = (byte)(var7 & 255);
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label67;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            } else if (var4 == var12) {
               if (var10 == 0) {
                  var3 = 1;
                  break label67;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            }
         }

         var3 = 2;
         var7 = var6[var7];
         var1 = (byte)(var7 & 255);
         var7 >>= 8;
         ++var4;
         if (var4 != var12) {
            if (var1 != var5) {
               var5 = var1;
            } else {
               var3 = 3;
               var7 = var6[var7];
               var1 = (byte)(var7 & 255);
               var7 >>= 8;
               ++var4;
               if (var4 != var12) {
                  if (var1 != var5) {
                     var5 = var1;
                  } else {
                     var7 = var6[var7];
                     var1 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                     var3 = (var1 & 255) + 4;
                     var7 = var6[var7];
                     var5 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                  }
               }
            }
         }
      }

      int var13 = arg0.field21;
      arg0.field21 += var11 - var10;
      if (arg0.field21 < var13) {
      }

      arg0.field32 = var2;
      arg0.field53 = var3;
      arg0.field40 = var4;
      arg0.field34 = var5;
      class13.field109 = var6;
      arg0.field28 = var7;
      arg0.field47 = var8;
      arg0.field41 = var9;
      arg0.field37 = var10;
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "a",
      descriptor = "()V",
      line = 238
   )
   public static void method144() {
      field202 = null;
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "b",
      descriptor = "(Lb;)V",
      line = 253
   )
   private static final void method145(class4 arg0) {
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
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      arg0.field36 = 1;
      if (class13.field109 == null) {
         class13.field109 = new int[arg0.field36 * 100000];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method147(arg0);
            if (var1 == 23) {
               return;
            }

            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method147(arg0);
            var1 = method148(arg0);
            if (var1 != 0) {
            }

            arg0.field51 = 0;
            var1 = method147(arg0);
            arg0.field51 = arg0.field51 << 8 | var1 & 255;
            var1 = method147(arg0);
            arg0.field51 = arg0.field51 << 8 | var1 & 255;
            var1 = method147(arg0);
            arg0.field51 = arg0.field51 << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = method148(arg0);
               if (var1 == 1) {
                  arg0.field22[var35] = true;
               } else {
                  arg0.field22[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               arg0.field35[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (arg0.field22[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = method148(arg0);
                     if (var1 == 1) {
                        arg0.field35[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method150(arg0);
            int var38 = arg0.field38 + 2;
            int var39 = method149(3, arg0);
            int var40 = method149(15, arg0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = method148(arg0);
                  if (var1 == 0) {
                     arg0.field50[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];
            byte var29 = 0;

            while(var29 < var39) {
               var27[var29] = var29++;
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var29 = arg0.field50[var35];
               byte var28 = var27[var29];

               while(var29 > 0) {
                  var27[var29] = var27[var29 - 1];
                  --var29;
               }

               var27[0] = var28;
               arg0.field25[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = method149(5, arg0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = method148(arg0);
                     if (var1 == 0) {
                        arg0.field46[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = method148(arg0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (arg0.field46[var37][var35] > var3) {
                     var3 = arg0.field46[var37][var35];
                  }

                  if (arg0.field46[var37][var35] < var2) {
                     var2 = arg0.field46[var37][var35];
                  }
               }

               method142(arg0.field45[var37], arg0.field29[var37], arg0.field18[var37], arg0.field46[var37], var2, var3, var38);
               arg0.field48[var37] = var2;
            }

            int var41 = arg0.field38 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               arg0.field43[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  arg0.field23[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               arg0.field30[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = arg0.field25[var42];
               var22 = arg0.field48[var53];
               var23 = arg0.field45[var53];
               var25 = arg0.field18[var53];
               var24 = arg0.field29[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = method149(var22, arg0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = method148(arg0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               while(var45 != var41) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = arg0.field30[0];
                        var1 = arg0.field23[var30 + var33];

                        while(var33 > 3) {
                           int var34 = var30 + var33;
                           arg0.field23[var34] = arg0.field23[var34 - 1];
                           arg0.field23[var34 - 1] = arg0.field23[var34 - 2];
                           arg0.field23[var34 - 2] = arg0.field23[var34 - 3];
                           arg0.field23[var34 - 3] = arg0.field23[var34 - 4];
                           var33 -= 4;
                        }

                        while(var33 > 0) {
                           arg0.field23[var30 + var33] = arg0.field23[var30 + var33 - 1];
                           --var33;
                        }

                        arg0.field23[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = arg0.field30[var31] + var32;
                        var1 = arg0.field23[var30];

                        while(var30 > arg0.field30[var31]) {
                           arg0.field23[var30] = arg0.field23[var30 - 1];
                           --var30;
                        }

                        int var10002 = arg0.field30[var31]++;

                        while(var31 > 0) {
                           var10002 = arg0.field30[var31]--;
                           arg0.field23[arg0.field30[var31]] = arg0.field23[arg0.field30[var31 - 1] + 16 - 1];
                           --var31;
                        }

                        var10002 = arg0.field30[0]--;
                        arg0.field23[arg0.field30[0]] = var1;
                        if (arg0.field30[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 arg0.field23[var56] = arg0.field23[arg0.field30[var54] + var55];
                                 --var56;
                              }

                              arg0.field30[var54] = var56 + 1;
                           }
                        }
                     }

                     ++arg0.field43[arg0.field26[var1 & 255] & 255];
                     class13.field109[var46] = arg0.field26[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = arg0.field25[var42];
                        var22 = arg0.field48[var53];
                        var23 = arg0.field45[var53];
                        var25 = arg0.field18[var53];
                        var24 = arg0.field29[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = method149(var22, arg0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = method148(arg0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if (var45 == 0) {
                           var47 += 1 * var48;
                        } else if (var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = arg0.field25[var42];
                           var22 = arg0.field48[var53];
                           var23 = arg0.field45[var53];
                           var25 = arg0.field18[var53];
                           var24 = arg0.field29[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = method149(var22, arg0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = method148(arg0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = arg0.field26[arg0.field23[arg0.field30[0]] & 255];
                     arg0.field43[var1 & 255] += var47;

                     while(var47 > 0) {
                        class13.field109[var46] = var1 & 255;
                        ++var46;
                        --var47;
                     }
                  }
               }

               arg0.field53 = 0;
               arg0.field32 = 0;
               arg0.field19[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  arg0.field19[var35] = arg0.field43[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  arg0.field19[var35] += arg0.field19[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(class13.field109[var35] & 255);
                  class13.field109[arg0.field19[var1 & 255]] |= var35 << 8;
                  ++arg0.field19[var1 & 255];
               }

               arg0.field28 = class13.field109[arg0.field51] >> 8;
               arg0.field40 = 0;
               arg0.field28 = class13.field109[arg0.field28];
               arg0.field34 = (byte)(arg0.field28 & 255);
               arg0.field28 >>= 8;
               ++arg0.field40;
               arg0.field39 = var46;
               method143(arg0);
               if (arg0.field40 == arg0.field39 + 1 && arg0.field53 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "a",
      descriptor = "([BI[BII)I",
      line = 756
   )
   public static final int method146(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      class4 var5 = field202;
      synchronized(field202) {
         field202.field31 = arg2;
         field202.field16 = arg4;
         field202.field47 = arg0;
         field202.field41 = 0;
         field202.field37 = arg1;
         field202.field42 = 0;
         field202.field20 = 0;
         field202.field49 = 0;
         field202.field21 = 0;
         method145(field202);
         int var8 = arg1 - field202.field37;
         field202.field31 = null;
         field202.field47 = null;
         return var8;
      }
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "c",
      descriptor = "(Lb;)B",
      line = 786
   )
   private static final byte method147(class4 arg0) {
      return (byte)method149(8, arg0);
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "d",
      descriptor = "(Lb;)B",
      line = 793
   )
   private static final byte method148(class4 arg0) {
      return (byte)method149(1, arg0);
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "a",
      descriptor = "(ILb;)I",
      line = 800
   )
   private static final int method149(int arg0, class4 arg1) {
      while(arg1.field42 < arg0) {
         arg1.field20 = arg1.field20 << 8 | arg1.field31[arg1.field16] & 255;
         arg1.field42 += 8;
         ++arg1.field16;
         ++arg1.field49;
         if (arg1.field49 == 0) {
         }
      }

      int var3 = arg1.field20 >> arg1.field42 - arg0 & (1 << arg0) - 1;
      arg1.field42 -= arg0;
      return var3;
   }

   @OriginalMember(
      owner = "loginapplet!n",
      name = "e",
      descriptor = "(Lb;)V",
      line = 828
   )
   private static final void method150(class4 arg0) {
      arg0.field38 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (arg0.field35[var1]) {
            arg0.field26[arg0.field38] = (byte)var1;
            ++arg0.field38;
         }
      }

   }
}
