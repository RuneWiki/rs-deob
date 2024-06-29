import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class227 extends class606 {
   @OriginalMember(
      owner = "client!fe",
      name = "F",
      descriptor = "I"
   )
   private int field3532 = 4096;
   @OriginalMember(
      owner = "client!fe",
      name = "N",
      descriptor = "I"
   )
   private int field3530 = 409;
   @OriginalMember(
      owner = "client!fe",
      name = "E",
      descriptor = "[I"
   )
   private int[] field3529 = new int[3];
   @OriginalMember(
      owner = "client!fe",
      name = "D",
      descriptor = "I"
   )
   private int field3536 = 4096;
   @OriginalMember(
      owner = "client!fe",
      name = "L",
      descriptor = "I"
   )
   private int field3537 = 4096;
   @OriginalMember(
      owner = "client!fe",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3539 = new String[]{method2025(method2024("nd*\u0010e")), method2025(method2024("fth>")), method2025(method2024("nd*\u0013e")), method2025(method2024("s/*|0")), method2025(method2024("nd*\u0017e")), method2025(method2024("nd*\u001be")), method2025(method2024("nd*\u0011e")), method2025(method2024("nd*\u0015e"))};
   @OriginalMember(
      owner = "client!fe",
      name = "I",
      descriptor = "Lhha;"
   )
   public static class724 field3534 = new class724(104, 7);
   @OriginalMember(
      owner = "client!fe",
      name = "M",
      descriptor = "I"
   )
   public static int field3528;
   @OriginalMember(
      owner = "client!fe",
      name = "J",
      descriptor = "I"
   )
   public static int field3531;
   @OriginalMember(
      owner = "client!fe",
      name = "H",
      descriptor = "I"
   )
   public static int field3533;
   @OriginalMember(
      owner = "client!fe",
      name = "G",
      descriptor = "I"
   )
   public static int field3535;
   @OriginalMember(
      owner = "client!fe",
      name = "K",
      descriptor = "I"
   )
   public static int field3538;
   @OriginalMember(
      owner = "client!fe",
      name = "O",
      descriptor = "Lua;"
   )
   public static class569 field3527;

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IIB[FI[I[I[FIIIII)V"
   )
   public static final void method2020(int arg0, int arg1, byte arg2, float[] arg3, int arg4, int[] arg5, int[] arg6, float[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      boolean var13 = client.field10022;

      try {
         ++field3531;
         int var14 = arg11 * arg12 + arg10;
         int var15 = arg1 * arg9 + arg0;
         int var16 = -arg8 + arg11;
         if (arg2 >= -6) {
            field3527 = null;
         }

         int var17 = -arg8 + arg9;
         if (arg5 != null) {
            if (arg7 != null) {
               int var20 = 0;
               if (var13 || arg4 > var20) {
                  do {
                     int var21 = arg8 + var14;
                     if (var13) {
                        arg6[var15] = arg5[var14];
                        arg3[var15++] = arg7[var14++];
                     }

                     while(true) {
                        if (~var21 >= ~var14) {
                           var15 += var17;
                           var14 += var16;
                           if (!var13) {
                              ++var20;
                              break;
                           }
                        } else {
                           arg6[var15] = arg5[var14];
                        }

                        arg3[var15++] = arg7[var14++];
                     }
                  } while(arg4 > var20);

               }
            } else {
               int var18 = 0;
               if (var13 || ~var18 > ~arg4) {
                  do {
                     int var19 = arg8 + var14;
                     if (var13 || var19 > var14) {
                        do {
                           arg6[var15++] = arg5[var14++];
                        } while(var19 > var14);
                     }

                     var14 += var16;
                     var15 += var17;
                     ++var18;
                  } while(~var18 > ~arg4);

               }
            }
         } else {
            int var22 = 0;
            if (var13 || arg4 > var22) {
               do {
                  int var23 = arg8 + var14;
                  if (var13 || var14 < var23) {
                     do {
                        arg3[var15++] = arg7[var14++];
                     } while(var14 < var23);
                  }

                  var15 += var17;
                  var14 += var16;
                  ++var22;
               } while(arg4 > var22);

            }
         }
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field3539[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3539[3] : field3539[1]) + ',' + arg4 + ',' + (arg5 != null ? field3539[3] : field3539[1]) + ',' + (arg6 != null ? field3539[3] : field3539[1]) + ',' + (arg7 != null ? field3539[3] : field3539[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method2021(byte arg0) {
      try {
         if (arg0 != 45) {
            field3527 = null;
         }

         field3534 = null;
         field3527 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3539[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(ZLbt;Z)V"
   )
   public static final void method2022(boolean arg0, class395 arg1, boolean arg2) {
      boolean var3 = client.field10022;

      try {
         ++field3528;
         class299 var4 = arg1.method3068(-82);
         if (~arg1.field5860 == -1) {
            class775.field11308 = 0;
            class72.field1168 = -1;
            arg1.field5855 = 0;
         } else {
            if (arg1.field5831.method2201((byte)108) && !arg1.field5831.method2199(-1)) {
               class33 var5 = arg1.field5831.method2196((byte)23);
               if (~arg1.field5856 < -1 && var5.field476 == 0) {
                  class775.field11308 = 0;
                  class72.field1168 = -1;
                  ++arg1.field5855;
                  return;
               }

               if (~arg1.field5856 >= -1 && var5.field480 == 0) {
                  ++arg1.field5855;
                  class775.field11308 = 0;
                  class72.field1168 = -1;
                  return;
               }
            }

            int var6 = 0;
            class130 var7;
            class33 var8;
            if (var3) {
               if (~arg1.field5844[var6].field2248 != 0 && arg1.field5844[var6].field2247.method2199(-1)) {
                  var7 = class183.field2689.method3226(arg1.field5844[var6].field2248, -31219);
                  if (var7.field2106 && ~var7.field2101 != 0) {
                     var8 = class216.field3085.method4252(var7.field2101, -1);
                     if (~arg1.field5856 < -1 && ~var8.field476 == -1) {
                        class72.field1168 = -1;
                        class775.field11308 = 0;
                        ++arg1.field5855;
                        return;
                     }

                     if (arg1.field5856 <= 0 && ~var8.field480 == -1) {
                        class72.field1168 = -1;
                        class775.field11308 = 0;
                        ++arg1.field5855;
                        return;
                     }
                  }
               }

               ++var6;
            }

            while(true) {
               int var10000;
               int var10001;
               if (arg1.field5844.length <= var6) {
                  int var9 = arg1.field6832;
                  int var10 = arg1.field6833;
                  int var11 = arg1.field5861[arg1.field5860 + -1] * 512 - -(256 * arg1.method1507(-85));
                  int var12 = arg1.field5865[arg1.field5860 + -1] * 512 - -(arg1.method1507(-82) * 256);
                  var10000 = ~var11;
                  var10001 = ~var9;
                  if (!var3) {
                     label414: {
                        if (var10000 >= var10001) {
                           if (var11 < var9) {
                              if (~var12 >= ~var10) {
                                 if (~var12 <= ~var10) {
                                    arg1.method3071(4096, 16384);
                                    if (!var3) {
                                       break label414;
                                    }
                                 }

                                 arg1.method3071(2048, 16384);
                                 if (!var3) {
                                    break label414;
                                 }
                              }

                              arg1.method3071(6144, 16384);
                              if (!var3) {
                                 break label414;
                              }
                           }

                           if (var12 <= var10) {
                              if (~var10 >= ~var12) {
                                 break label414;
                              }

                              arg1.method3071(0, 16384);
                              if (!var3) {
                                 break label414;
                              }
                           }

                           arg1.method3071(8192, 16384);
                           if (!var3) {
                              break label414;
                           }
                        }

                        if (var12 <= var10) {
                           if (var10 > var12) {
                              arg1.method3071(14336, 16384);
                              if (!var3) {
                                 break label414;
                              }
                           }

                           arg1.method3071(12288, 16384);
                           if (!var3) {
                              break label414;
                           }
                        }

                        arg1.method3071(10240, 16384);
                     }

                     byte var13 = arg1.field5859[arg1.field5860 + -1];
                     if (!arg2 && (~(-var9 + var11) < -1025 || ~(-var9 + var11) > 1023 || -var10 + var12 > 1024 || ~(-var10 + var12) > 1023)) {
                        arg1.field6833 = var12;
                        arg1.field6832 = var11;
                        arg1.method3075(false, arg1.field5845, -1);
                        --arg1.field5860;
                        class775.field11308 = 0;
                        class72.field1168 = -1;
                        if (arg1.field5856 > 0) {
                           --arg1.field5856;
                        }

                        return;
                     }

                     int var14 = 16;
                     boolean var15 = true;
                     if (arg1 instanceof class799) {
                        var15 = ((class799)arg1).field11618.field4537;
                     }

                     label417: {
                        if (var15) {
                           int var16 = -arg1.field5834.field5353 + arg1.field5845;
                           if (~var16 != -1 && ~arg1.field5798 == 0 && arg1.field5839 != 0) {
                              var14 = 8;
                           }

                           if (!arg2 && ~arg1.field5860 < -3) {
                              var14 = 24;
                           }

                           if (arg2 || arg1.field5860 <= 3) {
                              break label417;
                           }

                           var14 = 32;
                           if (!var3) {
                              break label417;
                           }
                        }

                        if (!arg2 && ~arg1.field5860 < -2) {
                           var14 = 24;
                        }

                        if (!arg2 && arg1.field5860 > 2) {
                           var14 = 32;
                        }
                     }

                     if (arg1.field5855 > 0 && arg1.field5860 > 1) {
                        --arg1.field5855;
                        var14 = 32;
                     }

                     label310: {
                        if (~var13 != -3) {
                           if (var13 != 0) {
                              break label310;
                           }

                           var14 >>= 1;
                           if (!var3) {
                              break label310;
                           }
                        }

                        var14 <<= 1;
                     }

                     if (~var4.field4459 != 0) {
                        label419: {
                           int var17 = var14 << 9;
                           if (arg1.field5860 != 1) {
                              if (~var17 >= ~arg1.field5858) {
                                 if (~arg1.field5858 >= -1) {
                                    break label419;
                                 }

                                 arg1.field5858 -= var4.field4459;
                                 if (~arg1.field5858 <= -1) {
                                    break label419;
                                 }

                                 arg1.field5858 = 0;
                                 if (!var3) {
                                    break label419;
                                 }
                              }

                              arg1.field5858 += var4.field4459;
                              if (~arg1.field5858 >= ~var17) {
                                 break label419;
                              }

                              arg1.field5858 = var17;
                              if (!var3) {
                                 break label419;
                              }
                           }

                           int var18 = arg1.field5858 * arg1.field5858;
                           int var19 = (arg1.field6832 <= var11 ? var11 - arg1.field6832 : -var11 + arg1.field6832) << 9;
                           int var20 = (~arg1.field6833 < ~var12 ? arg1.field6833 - var12 : -arg1.field6833 + var12) << 9;
                           int var21 = ~var20 <= ~var19 ? var20 : var19;
                           int var22 = var21 * 2 * var4.field4459;
                           if (var18 <= var22) {
                              if (var18 / 2 > var21) {
                                 arg1.field5858 -= var4.field4459;
                                 if (~arg1.field5858 <= -1) {
                                    break label419;
                                 }

                                 arg1.field5858 = 0;
                                 if (!var3) {
                                    break label419;
                                 }
                              }

                              if (~var17 >= ~arg1.field5858) {
                                 break label419;
                              }

                              arg1.field5858 += var4.field4459;
                              if (arg1.field5858 <= var17) {
                                 break label419;
                              }

                              arg1.field5858 = var17;
                              if (!var3) {
                                 break label419;
                              }
                           }

                           arg1.field5858 /= 2;
                        }

                        var14 = arg1.field5858 >> 9;
                        if (var14 < 1) {
                           var14 = 1;
                        }
                     }

                     if (arg0) {
                        field3534 = null;
                     }

                     label423: {
                        class775.field11308 = 0;
                        if (var9 == var11 && ~var10 == ~var12) {
                           class72.field1168 = -1;
                           if (!var3) {
                              break label423;
                           }
                        }

                        label267: {
                           if (var9 < var11) {
                              arg1.field6832 += var14;
                              class775.field11308 |= 4;
                              if (var11 >= arg1.field6832) {
                                 break label267;
                              }

                              arg1.field6832 = var11;
                              if (!var3) {
                                 break label267;
                              }
                           }

                           if (var9 > var11) {
                              arg1.field6832 -= var14;
                              class775.field11308 |= 8;
                              if (var11 > arg1.field6832) {
                                 arg1.field6832 = var11;
                              }
                           }
                        }

                        label260: {
                           if (var14 >= 32) {
                              class72.field1168 = 2;
                              if (!var3) {
                                 break label260;
                              }
                           }

                           class72.field1168 = var13;
                        }

                        if (~var12 >= ~var10) {
                           if (~var10 >= ~var12) {
                              break label423;
                           }

                           arg1.field6833 -= var14;
                           class775.field11308 |= 2;
                           if (var12 <= arg1.field6833) {
                              break label423;
                           }

                           arg1.field6833 = var12;
                           if (!var3) {
                              break label423;
                           }
                        }

                        arg1.field6833 += var14;
                        class775.field11308 |= 1;
                        if (~var12 > ~arg1.field6833) {
                           arg1.field6833 = var12;
                        }
                     }

                     if (~arg1.field6832 == ~var11 && ~arg1.field6833 == ~var12) {
                        --arg1.field5860;
                        if (~arg1.field5856 < -1) {
                           --arg1.field5856;
                           return;
                        }
                     }

                     return;
                  }
               } else {
                  var10000 = arg1.field5844[var6].field2248;
                  var10001 = -1;
               }

               if ((var10000 ^ var10001) != 0 && arg1.field5844[var6].field2247.method2199(-1)) {
                  var7 = class183.field2689.method3226(arg1.field5844[var6].field2248, -31219);
                  if (var7.field2106 && ~var7.field2101 != 0) {
                     var8 = class216.field3085.method4252(var7.field2101, -1);
                     if (~arg1.field5856 < -1 && ~var8.field476 == -1) {
                        class72.field1168 = -1;
                        class775.field11308 = 0;
                        ++arg1.field5855;
                        return;
                     }

                     if (arg1.field5856 <= 0 && ~var8.field480 == -1) {
                        class72.field1168 = -1;
                        class775.field11308 = 0;
                        ++arg1.field5855;
                        return;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var24) {
         throw class612.method4503(var24, field3539[7] + arg0 + ',' + (arg1 != null ? field3539[3] : field3539[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "()V"
   )
   public class227() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        if (arg1 != 0) {
                           if (arg1 == 1) {
                              break label60;
                           }

                           if (arg1 == 2) {
                              break label61;
                           }

                           if (arg1 == 3) {
                              break label62;
                           }

                           if (~arg1 != -5) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field3530 = arg0.method685(-2);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field3532 = arg0.method685(-2);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field3537 = arg0.method685(-2);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field3536 = arg0.method685(-2);
               if (!var4) {
                  break label64;
               }
            }

            int var6 = arg0.method691((byte)-126);
            this.field3529[0] = class697.method5101(267386880, var6 << 4);
            this.field3529[1] = class697.method5101(4080, var6 >> 4);
            this.field3529[2] = class697.method5101(255, var6) >> 12;
         }

         if (arg2 >= -6) {
            field3527 = null;
         }

         ++field3535;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3539[2] + (arg0 != null ? field3539[3] : field3539[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "([ILeca;II)Lpa;"
   )
   public static final class552 method2023(int[] arg0, class590 arg1, int arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field3538;
         int[] var5 = null;
         int[] var6 = null;
         if (arg2 != 255) {
            method2021((byte)-19);
         }

         int[] var7 = null;
         float[][] var8 = null;
         if (arg1.field8348 != null) {
            int var9 = arg1.field8345;
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            int[] var13 = new int[var9];
            int[] var14 = new int[var9];
            int[] var15 = new int[var9];
            int var16 = 0;
            if (var4) {
               var10[var16] = Integer.MAX_VALUE;
               var11[var16] = -2147483647;
               var12[var16] = Integer.MAX_VALUE;
               var13[var16] = -2147483647;
               var14[var16] = Integer.MAX_VALUE;
               var15[var16] = -2147483647;
               ++var16;
            }

            while(true) {
               while(~var16 > ~var9) {
                  var10[var16] = Integer.MAX_VALUE;
                  var11[var16] = -2147483647;
                  var12[var16] = Integer.MAX_VALUE;
                  var13[var16] = -2147483647;
                  var14[var16] = Integer.MAX_VALUE;
                  var15[var16] = -2147483647;
                  ++var16;
               }

               int[] var10000 = new int[var9];
               if (!var4) {
                  int var18;
                  label162: {
                     var7 = var10000;
                     var6 = new int[var9];
                     var5 = new int[var9];
                     var8 = new float[var9][];
                     int var17 = 0;
                     if (var4) {
                        var18 = arg0[var17];
                     } else if (arg3 <= var17) {
                        var18 = 0;
                        if (!var4) {
                           break label162;
                        }
                     } else {
                        var18 = arg0[var17];
                     }

                     while(true) {
                        if (~arg1.field8348[var18] == 0) {
                           ++var17;
                        } else {
                           int var19 = 255 & arg1.field8348[var18];
                           int var20 = 0;
                           if (!var4 && ~var20 <= -4) {
                              ++var17;
                           } else {
                              while(true) {
                                 short var21;
                                 if (var20 != 0) {
                                    if (~var20 != -2) {
                                       var21 = arg1.field8323[var18];
                                       if (var4) {
                                          var21 = arg1.field8341[var18];
                                          if (var4) {
                                             var21 = arg1.field8342[var18];
                                          }
                                       }
                                    } else {
                                       var21 = arg1.field8341[var18];
                                       if (var4) {
                                          var21 = arg1.field8342[var18];
                                       }
                                    }
                                 } else {
                                    var21 = arg1.field8342[var18];
                                 }

                                 int var22 = arg1.field8344[var21];
                                 int var23 = arg1.field8311[var21];
                                 int var24 = arg1.field8332[var21];
                                 if (~var22 > ~var10[var19]) {
                                    var10[var19] = var22;
                                 }

                                 if (var11[var19] < var22) {
                                    var11[var19] = var22;
                                 }

                                 if (var12[var19] > var23) {
                                    var12[var19] = var23;
                                 }

                                 if (var23 > var13[var19]) {
                                    var13[var19] = var23;
                                 }

                                 if (~var24 > ~var14[var19]) {
                                    var14[var19] = var24;
                                 }

                                 if (~var15[var19] > ~var24) {
                                    var15[var19] = var24;
                                 }

                                 ++var20;
                                 if (~var20 <= -4) {
                                    ++var17;
                                    break;
                                 }
                              }
                           }
                        }

                        if (arg3 <= var17) {
                           var18 = 0;
                           if (!var4) {
                              break;
                           }
                        } else {
                           var18 = arg0[var17];
                        }
                     }
                  }

                  if (var4 || ~var18 > ~var9) {
                     do {
                        byte var25 = arg1.field8337[var18];
                        if (~var25 >= -1) {
                           ++var18;
                        } else {
                           float var27;
                           float var28;
                           float var29;
                           label196: {
                              var5[var18] = (var10[var18] + var11[var18]) / 2;
                              var6[var18] = (var12[var18] + var13[var18]) / 2;
                              var7[var18] = (var14[var18] + var15[var18]) / 2;
                              if (var25 == 1) {
                                 int var26 = arg1.field8322[var18];
                                 var27 = 64.0F / (float)arg1.field8330[var18];
                                 if (~var26 == -1) {
                                    var28 = 1.0F;
                                    var29 = 1.0F;
                                    if (!var4) {
                                       break label196;
                                    }
                                 }

                                 if (var26 <= 0) {
                                    var28 = 1.0F;
                                    var29 = (float)(-var26) / 1024.0F;
                                    if (!var4) {
                                       break label196;
                                    }
                                 }

                                 var28 = (float)var26 / 1024.0F;
                                 var29 = 1.0F;
                                 if (!var4) {
                                    break label196;
                                 }
                              }

                              if (var25 != 2) {
                                 var27 = (float)arg1.field8330[var18] / 1024.0F;
                                 var28 = (float)arg1.field8338[var18] / 1024.0F;
                                 var29 = (float)arg1.field8322[var18] / 1024.0F;
                                 if (!var4) {
                                    break label196;
                                 }
                              }

                              var27 = 64.0F / (float)arg1.field8330[var18];
                              var28 = 64.0F / (float)arg1.field8338[var18];
                              var29 = 64.0F / (float)arg1.field8322[var18];
                           }

                           var8[var18] = class752.method5404(class697.method5101(255, arg1.field8314[var18]), arg1.field8340[var18], 4, var28, arg1.field8308[var18], arg1.field8331[var18], var27, var29);
                           ++var18;
                        }
                     } while(~var18 > ~var9);
                  }
                  break;
               }

               var10000[var16] = -2147483647;
               ++var16;
            }
         }

         return new class552(var5, var6, var7, var8);
      } catch (RuntimeException var31) {
         throw class612.method4503(var31, field3539[5] + (arg0 != null ? field3539[3] : field3539[1]) + ',' + (arg1 != null ? field3539[3] : field3539[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field3533;
         int[][] var4 = super.field8649.method5536(arg0 ^ 23627, arg1);
         if (super.field8649.field11043) {
            label108: {
               int[][] var5 = this.method4467(0, arg1, (byte)50);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               int var13;
               int var14;
               if (var3) {
                  var13 = var6[var12];
                  var14 = -this.field3529[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }
               } else {
                  if (~var12 <= ~class563.field8014) {
                     break label108;
                  }

                  var13 = var6[var12];
                  var14 = -this.field3529[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }
               }

               while(true) {
                  label105: {
                     int var15;
                     int var16;
                     if (this.field3530 < var14) {
                        var9[var12] = var13;
                        var10[var12] = var7[var12];
                        var11[var12] = var8[var12];
                        if (!var3) {
                           ++var12;
                           break label105;
                        }

                        var15 = var7[var12];
                        var16 = -this.field3529[1] + var15;
                        if (~var16 > -1) {
                           var16 = -var16;
                        }
                     } else {
                        var15 = var7[var12];
                        var16 = -this.field3529[1] + var15;
                        if (~var16 > -1) {
                           var16 = -var16;
                        }
                     }

                     int var17;
                     int var18;
                     if (~this.field3530 > ~var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                        if (var3) {
                           var17 = var8[var12];
                           var18 = -this.field3529[2] + var17;
                           if (var18 < 0) {
                              var18 = -var18;
                           }

                           if (~var18 < ~this.field3530) {
                              var9[var12] = var13;
                              var10[var12] = var15;
                              var11[var12] = var17;
                              if (var3) {
                                 var9[var12] = this.field3536 * var13 >> 12;
                                 var10[var12] = this.field3537 * var15 >> 12;
                                 var11[var12] = this.field3532 * var17 >> 12;
                                 ++var12;
                              } else {
                                 ++var12;
                              }
                           } else {
                              var9[var12] = this.field3536 * var13 >> 12;
                              var10[var12] = this.field3537 * var15 >> 12;
                              var11[var12] = this.field3532 * var17 >> 12;
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        var17 = var8[var12];
                        var18 = -this.field3529[2] + var17;
                        if (var18 < 0) {
                           var18 = -var18;
                        }

                        if (~var18 < ~this.field3530) {
                           var9[var12] = var13;
                           var10[var12] = var15;
                           var11[var12] = var17;
                           if (var3) {
                              var9[var12] = this.field3536 * var13 >> 12;
                              var10[var12] = this.field3537 * var15 >> 12;
                              var11[var12] = this.field3532 * var17 >> 12;
                              ++var12;
                           } else {
                              ++var12;
                           }
                        } else {
                           var9[var12] = this.field3536 * var13 >> 12;
                           var10[var12] = this.field3537 * var15 >> 12;
                           var11[var12] = this.field3532 * var17 >> 12;
                           ++var12;
                        }
                     }
                  }

                  if (~var12 <= ~class563.field8014) {
                     break;
                  }

                  var13 = var6[var12];
                  var14 = -this.field3529[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }
               }
            }
         }

         if (arg0 != 373) {
            this.field3532 = -55;
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field3539[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2024(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2025(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
