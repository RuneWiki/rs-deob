import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class182 extends class302 {
   @OriginalMember(
      owner = "client!cda",
      name = "O",
      descriptor = "I"
   )
   private int field2257 = 6;
   @OriginalMember(
      owner = "client!cda",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2261 = new String[]{method1432(method1431("PZ?L=\u001b")), method1432(method1431("PZ?L9\u001b")), method1432(method1431("]K2\u000e")), method1432(method1431("H\u0010pL\u0007")), method1432(method1431("PZ?L<\u001b")), method1432(method1431("PZ?L8\u001b")), method1432(method1431("PZ?L;\u001b")), method1432(method1431("PZ?L?\u001b"))};
   @OriginalMember(
      owner = "client!cda",
      name = "M",
      descriptor = "I"
   )
   public static int field2259 = 0;
   @OriginalMember(
      owner = "client!cda",
      name = "J",
      descriptor = "Lsda;"
   )
   public static class269 field2253 = new class269(22, -1);
   @OriginalMember(
      owner = "client!cda",
      name = "K",
      descriptor = "I"
   )
   public static int field2252;
   @OriginalMember(
      owner = "client!cda",
      name = "I",
      descriptor = "I"
   )
   public static int field2254;
   @OriginalMember(
      owner = "client!cda",
      name = "L",
      descriptor = "I"
   )
   public static int field2255;
   @OriginalMember(
      owner = "client!cda",
      name = "H",
      descriptor = "I"
   )
   public static int field2256;
   @OriginalMember(
      owner = "client!cda",
      name = "N",
      descriptor = "I"
   )
   public static int field2258;
   @OriginalMember(
      owner = "client!cda",
      name = "P",
      descriptor = "J"
   )
   public static long field2260;

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(II)[I",
      line = 3
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field2252;
         if (arg1 > -37) {
            return null;
         } else {
            int[] var4 = super.field4298.method3175(arg0, (byte)-127);
            if (super.field4298.field6356) {
               int[] var5;
               int[] var6;
               label523: {
                  int var26;
                  int var27;
                  int var28;
                  label524: {
                     int var20;
                     int var21;
                     int var22;
                     label525: {
                        int var16;
                        int var17;
                        label526: {
                           int var13;
                           label527: {
                              int var10;
                              label528: {
                                 var5 = this.method2299(arg0, false, 0);
                                 var6 = this.method2299(arg0, false, 1);
                                 int var7 = this.field2257;
                                 if (var7 != 1) {
                                    if (var7 == 2) {
                                       break label528;
                                    }

                                    if (var7 == 3) {
                                       var10 = 0;
                                       if (var3 != 0) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       while(true) {
                                          while(~class344.field5238 < ~var10) {
                                             var4[var10] = var5[var10] * var6[var10] >> 12;
                                             ++var10;
                                          }

                                          if (var3 == 0) {
                                             if (var3 == 0) {
                                                return var4;
                                             }
                                             break label527;
                                          }

                                          ++var10;
                                       }
                                    }

                                    if (~var7 == -5) {
                                       break label527;
                                    }

                                    if (var7 == 5) {
                                       var13 = 0;
                                       if (var3 != 0) {
                                          var4[var13] = -((4096 - var5[var13]) * (-var6[var13] + 4096) >> 12) + 4096;
                                          ++var13;
                                       }

                                       while(true) {
                                          while(~class344.field5238 < ~var13) {
                                             var4[var13] = -((4096 - var5[var13]) * (-var6[var13] + 4096) >> 12) + 4096;
                                             ++var13;
                                          }

                                          if (var3 == 0) {
                                             if (var3 == 0) {
                                                return var4;
                                             }
                                             break label526;
                                          }

                                          ++var13;
                                       }
                                    }

                                    if (var7 == 6) {
                                       break label526;
                                    }

                                    if (var7 == 7) {
                                       var16 = 0;
                                       if (var3 != 0 || class344.field5238 > var16) {
                                          do {
                                             var17 = var5[var16];
                                             var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (4096 - var17);
                                             ++var16;
                                          } while(class344.field5238 > var16);
                                       }

                                       if (var3 == 0) {
                                          return var4;
                                       }
                                       break label525;
                                    }

                                    if (~var7 == -9) {
                                       break label525;
                                    }

                                    if (~var7 == -10) {
                                       var20 = 0;
                                       if (var3 != 0 || var20 < class344.field5238) {
                                          do {
                                             var21 = var6[var20];
                                             var22 = var5[var20];
                                             var4[var20] = var21 <= var22 ? var21 : var22;
                                             ++var20;
                                          } while(var20 < class344.field5238);
                                       }

                                       if (var3 == 0) {
                                          return var4;
                                       }
                                       break label524;
                                    }

                                    if (~var7 == -11) {
                                       break label524;
                                    }

                                    if (var7 == 11) {
                                       var26 = 0;
                                       if (var3 != 0 || ~class344.field5238 < ~var26) {
                                          do {
                                             var27 = var6[var26];
                                             var28 = var5[var26];
                                             var4[var26] = ~var28 < ~var27 ? -var27 + var28 : -var28 + var27;
                                             ++var26;
                                          } while(~class344.field5238 < ~var26);
                                       }

                                       if (var3 == 0) {
                                          return var4;
                                       }
                                       break label523;
                                    }

                                    if (var7 != 12) {
                                       return var4;
                                    }

                                    if (var3 == 0) {
                                       break label523;
                                    }
                                 }

                                 int var8 = 0;
                                 if (var3 != 0) {
                                    var4[var8] = var5[var8] + var6[var8];
                                    ++var8;
                                 }

                                 while(true) {
                                    while(~var8 > ~class344.field5238) {
                                       var4[var8] = var5[var8] + var6[var8];
                                       ++var8;
                                    }

                                    if (var3 == 0) {
                                       if (var3 == 0) {
                                          return var4;
                                       }
                                       break;
                                    }

                                    ++var8;
                                 }
                              }

                              int var9 = 0;
                              if (var3 != 0) {
                                 var4[var9] = var5[var9] - var6[var9];
                                 ++var9;
                              }

                              label448:
                              while(true) {
                                 while(~var9 > ~class344.field5238) {
                                    var4[var9] = var5[var9] - var6[var9];
                                    ++var9;
                                 }

                                 if (var3 == 0) {
                                    if (var3 == 0) {
                                       return var4;
                                    }

                                    var10 = 0;
                                    if (var3 != 0) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    while(true) {
                                       while(~class344.field5238 < ~var10) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       if (var3 == 0) {
                                          if (var3 == 0) {
                                             return var4;
                                          }
                                          break label448;
                                       }

                                       ++var10;
                                    }
                                 }

                                 ++var9;
                              }
                           }

                           int var11 = 0;
                           int var12;
                           if (var3 != 0) {
                              var12 = var6[var11];
                              var4[var11] = ~var12 == -1 ? 4096 : (var5[var11] << 12) / var12;
                              ++var11;
                           }

                           label463:
                           while(true) {
                              if (var11 >= class344.field5238) {
                                 if (var3 == 0) {
                                    return var4;
                                 }

                                 var13 = 0;
                                 if (var3 != 0) {
                                    var4[var13] = -((4096 - var5[var13]) * (-var6[var13] + 4096) >> 12) + 4096;
                                    ++var13;
                                 }

                                 while(true) {
                                    while(~class344.field5238 < ~var13) {
                                       var4[var13] = -((4096 - var5[var13]) * (-var6[var13] + 4096) >> 12) + 4096;
                                       ++var13;
                                    }

                                    if (var3 == 0) {
                                       if (var3 == 0) {
                                          return var4;
                                       }
                                       break label463;
                                    }

                                    ++var13;
                                 }
                              }

                              var12 = var6[var11];
                              var4[var11] = ~var12 == -1 ? 4096 : (var5[var11] << 12) / var12;
                              ++var11;
                           }
                        }

                        int var14 = 0;
                        int var15;
                        if (var3 != 0) {
                           var15 = var6[var14];
                           var4[var14] = var15 < 2048 ? var5[var14] * var15 >> 11 : -((4096 - var15) * (-var5[var14] + 4096) >> 11) + 4096;
                           ++var14;
                        }

                        while(true) {
                           if (class344.field5238 <= var14) {
                              if (var3 == 0) {
                                 return var4;
                              }

                              var16 = 0;
                              if (var3 != 0 || class344.field5238 > var16) {
                                 do {
                                    var17 = var5[var16];
                                    var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (4096 - var17);
                                    ++var16;
                                 } while(class344.field5238 > var16);
                              }

                              if (var3 == 0) {
                                 return var4;
                              }
                              break;
                           }

                           var15 = var6[var14];
                           var4[var14] = var15 < 2048 ? var5[var14] * var15 >> 11 : -((4096 - var15) * (-var5[var14] + 4096) >> 11) + 4096;
                           ++var14;
                        }
                     }

                     int var18 = 0;
                     int var19;
                     if (var3 != 0) {
                        var19 = var5[var18];
                        var4[var18] = ~var19 != -1 ? -((-var6[var18] + 4096 << 12) / var19) + 4096 : 0;
                        ++var18;
                     }

                     while(true) {
                        if (~var18 <= ~class344.field5238) {
                           if (var3 == 0) {
                              return var4;
                           }

                           var20 = 0;
                           if (var3 != 0 || var20 < class344.field5238) {
                              do {
                                 var21 = var6[var20];
                                 var22 = var5[var20];
                                 var4[var20] = var21 <= var22 ? var21 : var22;
                                 ++var20;
                              } while(var20 < class344.field5238);
                           }

                           if (var3 == 0) {
                              return var4;
                           }
                           break;
                        }

                        var19 = var5[var18];
                        var4[var18] = ~var19 != -1 ? -((-var6[var18] + 4096 << 12) / var19) + 4096 : 0;
                        ++var18;
                     }
                  }

                  int var23 = 0;
                  int var24;
                  int var25;
                  if (var3 != 0) {
                     var24 = var5[var23];
                     var25 = var6[var23];
                     var4[var23] = ~var24 < ~var25 ? var24 : var25;
                     ++var23;
                  }

                  while(true) {
                     if (class344.field5238 <= var23) {
                        if (var3 == 0) {
                           return var4;
                        }

                        var26 = 0;
                        if (var3 != 0 || ~class344.field5238 < ~var26) {
                           do {
                              var27 = var6[var26];
                              var28 = var5[var26];
                              var4[var26] = ~var28 < ~var27 ? -var27 + var28 : -var28 + var27;
                              ++var26;
                           } while(~class344.field5238 < ~var26);
                        }

                        if (var3 == 0) {
                           return var4;
                        }
                        break;
                     }

                     var24 = var5[var23];
                     var25 = var6[var23];
                     var4[var23] = ~var24 < ~var25 ? var24 : var25;
                     ++var23;
                  }
               }

               int var29 = 0;
               if (var3 != 0 || ~var29 > ~class344.field5238) {
                  do {
                     int var30 = var6[var29];
                     int var31 = var5[var29];
                     var4[var29] = var30 + var31 + -(var30 * var31 >> 11);
                     ++var29;
                  } while(~var29 > ~class344.field5238);
               }
            }

            return var4;
         }
      } catch (RuntimeException var33) {
         throw class670.method4877(var33, field2261[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(IIIIIB)I",
      line = 250
   )
   public static final int method1428(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      try {
         ++field2254;
         if (class377.field5711 == null) {
            return 0;
         } else if (arg5 > -72) {
            return -58;
         } else {
            if (~arg3 > -4) {
               int var6 = arg0 >> 9;
               int var7 = arg4 >> 9;
               if (arg2 < 0 || ~arg1 > -1 || arg2 > class323.field4603 + -1 || ~(class178.field2197 + -1) > ~arg1) {
                  return 0;
               }

               if (~var6 > -2 || var7 < 1 || ~var6 < ~(class323.field4603 + -1) || class178.field2197 + -1 < var7) {
                  return 0;
               }

               boolean var8 = ~(class65.field797[1][arg0 >> 9][arg4 >> 9] & 2) != -1;
               if ((arg0 & 511) == 0) {
                  boolean var9 = ~(class65.field797[1][var6 - 1][arg4 >> 9] & 2) != -1;
                  boolean var10 = ~(2 & class65.field797[1][var6][arg4 >> 9]) != -1;
                  if (var9 == !var10) {
                     var8 = ~(2 & class65.field797[1][arg2][arg1]) != -1;
                  }
               }

               if (~(511 & arg4) == -1) {
                  boolean var11 = ~(class65.field797[1][arg0 >> 9][var7 - 1] & 2) != -1;
                  boolean var12 = (class65.field797[1][arg0 >> 9][var7] & 2) != 0;
                  if (var11 != var12) {
                     var8 = ~(class65.field797[1][arg2][arg1] & 2) != -1;
                  }
               }

               if (var8) {
                  ++arg3;
               }
            }

            return class377.field5711[arg3].method2236((byte)100, arg0, arg4);
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field2261[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(BI)[[I",
      line = 309
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != -90) {
            field2253 = null;
         }

         ++field2255;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            int[] var7;
            int[] var8;
            int[] var9;
            int[] var10;
            int[] var11;
            int[] var12;
            int[] var13;
            int[] var14;
            int[] var15;
            label728: {
               int var51;
               int var52;
               int var53;
               int var54;
               int var55;
               int var56;
               int var57;
               label729: {
                  int var37;
                  int var38;
                  int var39;
                  int var40;
                  int var41;
                  int var42;
                  int var43;
                  label730: {
                     int var29;
                     int var30;
                     int var31;
                     int var32;
                     label731: {
                        int var24;
                        label732: {
                           int var19;
                           label733: {
                              int[][] var5 = this.method2297(0, arg1, 0);
                              int[][] var6 = this.method2297(1, arg1, 0);
                              var7 = var4[0];
                              var8 = var4[1];
                              var9 = var4[2];
                              var10 = var5[0];
                              var11 = var5[1];
                              var12 = var5[2];
                              var13 = var6[0];
                              var14 = var6[1];
                              var15 = var6[2];
                              int var16 = this.field2257;
                              if (~var16 != -2) {
                                 if (var16 == 2) {
                                    break label733;
                                 }

                                 if (var16 == 3) {
                                    var19 = 0;
                                    if (var3 != 0) {
                                       var7[var19] = var10[var19] * var13[var19] >> 12;
                                       var8[var19] = var11[var19] * var14[var19] >> 12;
                                       var9[var19] = var12[var19] * var15[var19] >> 12;
                                       ++var19;
                                    }

                                    while(true) {
                                       while(~var19 > ~class344.field5238) {
                                          var7[var19] = var10[var19] * var13[var19] >> 12;
                                          var8[var19] = var11[var19] * var14[var19] >> 12;
                                          var9[var19] = var12[var19] * var15[var19] >> 12;
                                          ++var19;
                                       }

                                       if (var3 == 0) {
                                          if (var3 == 0) {
                                             return var4;
                                          }
                                          break label732;
                                       }

                                       ++var19;
                                    }
                                 }

                                 if (var16 == 4) {
                                    break label732;
                                 }

                                 if (~var16 == -6) {
                                    var24 = 0;
                                    if (var3 != 0) {
                                       var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                       var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                       var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                       ++var24;
                                    }

                                    while(true) {
                                       while(class344.field5238 > var24) {
                                          var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                          var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                          var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                          ++var24;
                                       }

                                       if (var3 == 0) {
                                          if (var3 == 0) {
                                             return var4;
                                          }
                                          break label731;
                                       }

                                       ++var24;
                                    }
                                 }

                                 if (var16 == 6) {
                                    break label731;
                                 }

                                 if (~var16 == -8) {
                                    var29 = 0;
                                    if (var3 != 0 || ~class344.field5238 < ~var29) {
                                       do {
                                          var30 = var12[var29];
                                          var31 = var10[var29];
                                          var32 = var11[var29];
                                          var7[var29] = ~var31 == -4097 ? 4096 : (var13[var29] << 12) / (-var31 + 4096);
                                          var8[var29] = var32 == 4096 ? 4096 : (var14[var29] << 12) / (4096 - var32);
                                          var9[var29] = var30 == 4096 ? 4096 : (var15[var29] << 12) / (-var30 + 4096);
                                          ++var29;
                                       } while(~class344.field5238 < ~var29);
                                    }

                                    if (var3 == 0) {
                                       return var4;
                                    }
                                    break label730;
                                 }

                                 if (~var16 == -9) {
                                    break label730;
                                 }

                                 if (var16 == 9) {
                                    var37 = 0;
                                    if (var3 != 0 || class344.field5238 > var37) {
                                       do {
                                          var38 = var14[var37];
                                          var39 = var10[var37];
                                          var40 = var13[var37];
                                          var41 = var15[var37];
                                          var42 = var11[var37];
                                          var43 = var12[var37];
                                          var7[var37] = var40 > var39 ? var39 : var40;
                                          var8[var37] = ~var38 < ~var42 ? var42 : var38;
                                          var9[var37] = ~var41 < ~var43 ? var43 : var41;
                                          ++var37;
                                       } while(class344.field5238 > var37);
                                    }

                                    if (var3 == 0) {
                                       return var4;
                                    }
                                    break label729;
                                 }

                                 if (var16 == 10) {
                                    break label729;
                                 }

                                 if (~var16 == -12) {
                                    var51 = 0;
                                    if (var3 != 0 || ~var51 > ~class344.field5238) {
                                       do {
                                          var52 = var12[var51];
                                          var53 = var11[var51];
                                          var54 = var13[var51];
                                          var55 = var10[var51];
                                          var56 = var15[var51];
                                          var57 = var14[var51];
                                          var7[var51] = ~var54 > ~var55 ? -var54 + var55 : -var55 + var54;
                                          var8[var51] = var53 > var57 ? -var57 + var53 : -var53 + var57;
                                          var9[var51] = ~var52 < ~var56 ? -var56 + var52 : -var52 + var56;
                                          ++var51;
                                       } while(~var51 > ~class344.field5238);
                                    }

                                    if (var3 == 0) {
                                       return var4;
                                    }
                                    break label728;
                                 }

                                 if (~var16 != -13) {
                                    return var4;
                                 }

                                 if (var3 == 0) {
                                    break label728;
                                 }
                              }

                              int var17 = 0;
                              if (var3 != 0) {
                                 var7[var17] = var10[var17] + var13[var17];
                                 var8[var17] = var11[var17] + var14[var17];
                                 var9[var17] = var12[var17] + var15[var17];
                                 ++var17;
                              }

                              while(true) {
                                 while(~class344.field5238 < ~var17) {
                                    var7[var17] = var10[var17] + var13[var17];
                                    var8[var17] = var11[var17] + var14[var17];
                                    var9[var17] = var12[var17] + var15[var17];
                                    ++var17;
                                 }

                                 if (var3 == 0) {
                                    if (var3 == 0) {
                                       return var4;
                                    }
                                    break;
                                 }

                                 ++var17;
                              }
                           }

                           int var18 = 0;
                           if (var3 != 0) {
                              var7[var18] = var10[var18] + -var13[var18];
                              var8[var18] = var11[var18] + -var14[var18];
                              var9[var18] = var12[var18] + -var15[var18];
                              ++var18;
                           }

                           label566:
                           while(true) {
                              while(~class344.field5238 < ~var18) {
                                 var7[var18] = var10[var18] + -var13[var18];
                                 var8[var18] = var11[var18] + -var14[var18];
                                 var9[var18] = var12[var18] + -var15[var18];
                                 ++var18;
                              }

                              if (var3 == 0) {
                                 if (var3 == 0) {
                                    return var4;
                                 }

                                 var19 = 0;
                                 if (var3 != 0) {
                                    var7[var19] = var10[var19] * var13[var19] >> 12;
                                    var8[var19] = var11[var19] * var14[var19] >> 12;
                                    var9[var19] = var12[var19] * var15[var19] >> 12;
                                    ++var19;
                                 }

                                 while(true) {
                                    while(~var19 > ~class344.field5238) {
                                       var7[var19] = var10[var19] * var13[var19] >> 12;
                                       var8[var19] = var11[var19] * var14[var19] >> 12;
                                       var9[var19] = var12[var19] * var15[var19] >> 12;
                                       ++var19;
                                    }

                                    if (var3 == 0) {
                                       if (var3 == 0) {
                                          return var4;
                                       }
                                       break label566;
                                    }

                                    ++var19;
                                 }
                              }

                              ++var18;
                           }
                        }

                        int var20 = 0;
                        int var21;
                        int var22;
                        int var23;
                        if (var3 != 0) {
                           var21 = var14[var20];
                           var22 = var13[var20];
                           var23 = var15[var20];
                           var7[var20] = var22 == 0 ? 4096 : (var10[var20] << 12) / var22;
                           var8[var20] = var21 == 0 ? 4096 : (var11[var20] << 12) / var21;
                           var9[var20] = var23 == 0 ? 4096 : (var12[var20] << 12) / var23;
                           ++var20;
                        }

                        label597:
                        while(true) {
                           if (class344.field5238 <= var20) {
                              if (var3 == 0) {
                                 return var4;
                              }

                              var24 = 0;
                              if (var3 != 0) {
                                 var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                 var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                 var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                 ++var24;
                              }

                              while(true) {
                                 while(class344.field5238 > var24) {
                                    var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                    var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                    var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                    ++var24;
                                 }

                                 if (var3 == 0) {
                                    if (var3 == 0) {
                                       return var4;
                                    }
                                    break label597;
                                 }

                                 ++var24;
                              }
                           }

                           var21 = var14[var20];
                           var22 = var13[var20];
                           var23 = var15[var20];
                           var7[var20] = var22 == 0 ? 4096 : (var10[var20] << 12) / var22;
                           var8[var20] = var21 == 0 ? 4096 : (var11[var20] << 12) / var21;
                           var9[var20] = var23 == 0 ? 4096 : (var12[var20] << 12) / var23;
                           ++var20;
                        }
                     }

                     int var25 = 0;
                     if (var3 == 0 && ~class344.field5238 >= ~var25) {
                        if (var3 == 0) {
                           return var4;
                        }

                        var29 = 0;
                        if (var3 != 0 || ~class344.field5238 < ~var29) {
                           do {
                              var30 = var12[var29];
                              var31 = var10[var29];
                              var32 = var11[var29];
                              var7[var29] = ~var31 == -4097 ? 4096 : (var13[var29] << 12) / (-var31 + 4096);
                              var8[var29] = var32 == 4096 ? 4096 : (var14[var29] << 12) / (4096 - var32);
                              var9[var29] = var30 == 4096 ? 4096 : (var15[var29] << 12) / (-var30 + 4096);
                              ++var29;
                           } while(~class344.field5238 < ~var29);
                        }

                        if (var3 == 0) {
                           return var4;
                        }
                     } else {
                        while(true) {
                           int var26 = var15[var25];
                           int var27 = var14[var25];
                           int var28 = var13[var25];
                           var7[var25] = var28 < 2048 ? var10[var25] * var28 >> 11 : -((4096 - var28) * (-var10[var25] + 4096) >> 11) + 4096;
                           var8[var25] = ~var27 <= -2049 ? -((4096 - var11[var25]) * (-var27 + 4096) >> 11) + 4096 : var11[var25] * var27 >> 11;
                           var9[var25] = var26 < 2048 ? var12[var25] * var26 >> 11 : -((-var12[var25] + 4096) * (-var26 + 4096) >> 11) + 4096;
                           ++var25;
                           if (~class344.field5238 >= ~var25) {
                              if (var3 == 0) {
                                 return var4;
                              }

                              var29 = 0;
                              if (var3 != 0 || ~class344.field5238 < ~var29) {
                                 do {
                                    var30 = var12[var29];
                                    var31 = var10[var29];
                                    var32 = var11[var29];
                                    var7[var29] = ~var31 == -4097 ? 4096 : (var13[var29] << 12) / (-var31 + 4096);
                                    var8[var29] = var32 == 4096 ? 4096 : (var14[var29] << 12) / (4096 - var32);
                                    var9[var29] = var30 == 4096 ? 4096 : (var15[var29] << 12) / (-var30 + 4096);
                                    ++var29;
                                 } while(~class344.field5238 < ~var29);
                              }

                              if (var3 == 0) {
                                 return var4;
                              }
                              break;
                           }
                        }
                     }
                  }

                  int var33 = 0;
                  int var34;
                  int var35;
                  int var36;
                  if (var3 != 0) {
                     var34 = var11[var33];
                     var35 = var10[var33];
                     var36 = var12[var33];
                     var7[var33] = ~var35 == -1 ? 0 : -((-var13[var33] + 4096 << 12) / var35) + 4096;
                     var8[var33] = var34 != 0 ? 4096 - (4096 - var14[var33] << 12) / var34 : 0;
                     var9[var33] = var36 != 0 ? -((-var15[var33] + 4096 << 12) / var36) + 4096 : 0;
                     ++var33;
                  }

                  while(true) {
                     if (~class344.field5238 >= ~var33) {
                        if (var3 == 0) {
                           return var4;
                        }

                        var37 = 0;
                        if (var3 != 0 || class344.field5238 > var37) {
                           do {
                              var38 = var14[var37];
                              var39 = var10[var37];
                              var40 = var13[var37];
                              var41 = var15[var37];
                              var42 = var11[var37];
                              var43 = var12[var37];
                              var7[var37] = var40 > var39 ? var39 : var40;
                              var8[var37] = ~var38 < ~var42 ? var42 : var38;
                              var9[var37] = ~var41 < ~var43 ? var43 : var41;
                              ++var37;
                           } while(class344.field5238 > var37);
                        }

                        if (var3 == 0) {
                           return var4;
                        }
                        break;
                     }

                     var34 = var11[var33];
                     var35 = var10[var33];
                     var36 = var12[var33];
                     var7[var33] = ~var35 == -1 ? 0 : -((-var13[var33] + 4096 << 12) / var35) + 4096;
                     var8[var33] = var34 != 0 ? 4096 - (4096 - var14[var33] << 12) / var34 : 0;
                     var9[var33] = var36 != 0 ? -((-var15[var33] + 4096 << 12) / var36) + 4096 : 0;
                     ++var33;
                  }
               }

               int var44 = 0;
               int var45;
               int var46;
               int var47;
               int var48;
               int var49;
               int var50;
               if (var3 != 0) {
                  var45 = var14[var44];
                  var46 = var12[var44];
                  var47 = var10[var44];
                  var48 = var15[var44];
                  var49 = var11[var44];
                  var50 = var13[var44];
                  var7[var44] = var47 <= var50 ? var50 : var47;
                  var8[var44] = ~var45 > ~var49 ? var49 : var45;
                  var9[var44] = var48 >= var46 ? var48 : var46;
                  ++var44;
               }

               while(true) {
                  if (~class344.field5238 >= ~var44) {
                     if (var3 == 0) {
                        return var4;
                     }

                     var51 = 0;
                     if (var3 != 0 || ~var51 > ~class344.field5238) {
                        do {
                           var52 = var12[var51];
                           var53 = var11[var51];
                           var54 = var13[var51];
                           var55 = var10[var51];
                           var56 = var15[var51];
                           var57 = var14[var51];
                           var7[var51] = ~var54 > ~var55 ? -var54 + var55 : -var55 + var54;
                           var8[var51] = var53 > var57 ? -var57 + var53 : -var53 + var57;
                           var9[var51] = ~var52 < ~var56 ? -var56 + var52 : -var52 + var56;
                           ++var51;
                        } while(~var51 > ~class344.field5238);
                     }

                     if (var3 == 0) {
                        return var4;
                     }
                     break;
                  }

                  var45 = var14[var44];
                  var46 = var12[var44];
                  var47 = var10[var44];
                  var48 = var15[var44];
                  var49 = var11[var44];
                  var50 = var13[var44];
                  var7[var44] = var47 <= var50 ? var50 : var47;
                  var8[var44] = ~var45 > ~var49 ? var49 : var45;
                  var9[var44] = var48 >= var46 ? var48 : var46;
                  ++var44;
               }
            }

            int var58 = 0;
            if (var3 != 0 || ~var58 > ~class344.field5238) {
               do {
                  int var59 = var11[var58];
                  int var60 = var14[var58];
                  int var61 = var12[var58];
                  int var62 = var13[var58];
                  int var63 = var10[var58];
                  int var64 = var15[var58];
                  var7[var58] = var63 - (var62 * var63 >> 11) + var62;
                  var8[var58] = var59 + var60 + -(var59 * var60 >> 11);
                  var9[var58] = -(var61 * var64 >> 11) + var64 + var61;
                  ++var58;
               } while(~var58 > ~class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var66) {
         throw class670.method4877(var66, field2261[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "f",
      descriptor = "(I)V",
      line = 630
   )
   public static void method1429(int arg0) {
      try {
         field2253 = null;
         if (arg0 != 4096) {
            field2260 = -99L;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2261[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(ZC)C",
      line = 641
   )
   public static final char method1430(boolean arg0, char arg1) {
      try {
         if (!arg0) {
            field2260 = 44L;
         }

         ++field2256;
         if (~arg1 == -199) {
            return 'E';
         } else if (arg1 == 230) {
            return 'e';
         } else if (arg1 == 223) {
            return 's';
         } else if (~arg1 == -339) {
            return 'E';
         } else {
            return (char)(arg1 == 339 ? 'e' : '\u0000');
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2261[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 670
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         if (arg1 == 0) {
            label48: {
               label41: {
                  if (~arg0 != -1) {
                     if (~arg0 != -2) {
                        break label48;
                     }

                     if (var4 == 0) {
                        break label41;
                     }
                  }

                  this.field2257 = arg2.method1104(arg1 ^ 255);
                  if (var4 == 0) {
                     break label48;
                  }
               }

               super.field4313 = arg2.method1104(255) == 1;
            }

            ++field2258;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2261[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2261[3] : field2261[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "<init>",
      descriptor = "()V",
      line = 711
   )
   public class182() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1431(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1432(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
