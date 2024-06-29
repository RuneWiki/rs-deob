import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class283 extends class264 {
   @OriginalMember(
      owner = "client!kv",
      name = "I",
      descriptor = "I"
   )
   private int field3917 = 6;
   @OriginalMember(
      owner = "client!kv",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3923 = new String[]{method2147(method2146("\u007fr1\u001e)")), method2147(method2146("zqs3")), method2147(method2146("o*1q|")), method2147(method2146("\u007fr1\u0018)")), method2147(method2146("\u007fr1\u001d)"))};
   @OriginalMember(
      owner = "client!kv",
      name = "H",
      descriptor = "I"
   )
   public static int field3921 = -1;
   @OriginalMember(
      owner = "client!kv",
      name = "F",
      descriptor = "I"
   )
   public static int field3918;
   @OriginalMember(
      owner = "client!kv",
      name = "G",
      descriptor = "I"
   )
   public static int field3919;
   @OriginalMember(
      owner = "client!kv",
      name = "J",
      descriptor = "I"
   )
   public static int field3920;
   @OriginalMember(
      owner = "client!kv",
      name = "K",
      descriptor = "J"
   )
   public static long field3922;

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IB)[[I",
      line = 3
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3919;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828) {
            label750: {
               int[] var7;
               int[] var8;
               int[] var9;
               int[] var10;
               int[] var11;
               int[] var12;
               int[] var13;
               int[] var14;
               int[] var15;
               label751: {
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  int var57;
                  label752: {
                     int var37;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     label753: {
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        label754: {
                           int var24;
                           label755: {
                              int var19;
                              label756: {
                                 int[][] var5 = this.method2015(0, (byte)76, arg0);
                                 int[][] var6 = this.method2015(1, (byte)76, arg0);
                                 var7 = var4[0];
                                 var8 = var4[1];
                                 var9 = var4[2];
                                 var10 = var5[0];
                                 var11 = var5[1];
                                 var12 = var5[2];
                                 var13 = var6[0];
                                 var14 = var6[1];
                                 var15 = var6[2];
                                 int var16 = this.field3917;
                                 if (~var16 != -2) {
                                    if (~var16 == -3) {
                                       break label756;
                                    }

                                    if (~var16 == -4) {
                                       var19 = 0;
                                       if (var3) {
                                          var7[var19] = var10[var19] * var13[var19] >> 12;
                                          var8[var19] = var11[var19] * var14[var19] >> 12;
                                          var9[var19] = var12[var19] * var15[var19] >> 12;
                                          ++var19;
                                       }

                                       while(true) {
                                          while(class430.field6152 > var19) {
                                             var7[var19] = var10[var19] * var13[var19] >> 12;
                                             var8[var19] = var11[var19] * var14[var19] >> 12;
                                             var9[var19] = var12[var19] * var15[var19] >> 12;
                                             ++var19;
                                          }

                                          if (!var3) {
                                             if (!var3) {
                                                break label750;
                                             }
                                             break label755;
                                          }

                                          ++var19;
                                       }
                                    }

                                    if (var16 == 4) {
                                       break label755;
                                    }

                                    if (var16 == 5) {
                                       var24 = 0;
                                       if (var3) {
                                          var7[var24] = -((4096 - var13[var24]) * (-var10[var24] + 4096) >> 12) + 4096;
                                          var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                          var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
                                          ++var24;
                                       }

                                       while(true) {
                                          while(~class430.field6152 < ~var24) {
                                             var7[var24] = -((4096 - var13[var24]) * (-var10[var24] + 4096) >> 12) + 4096;
                                             var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                             var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
                                             ++var24;
                                          }

                                          if (!var3) {
                                             if (!var3) {
                                                break label750;
                                             }
                                             break label754;
                                          }

                                          ++var24;
                                       }
                                    }

                                    if (~var16 == -7) {
                                       break label754;
                                    }

                                    if (var16 == 7) {
                                       var29 = 0;
                                       if (var3 || class430.field6152 > var29) {
                                          do {
                                             var30 = var12[var29];
                                             var31 = var10[var29];
                                             var32 = var11[var29];
                                             var7[var29] = var31 != 4096 ? (var13[var29] << 12) / (-var31 + 4096) : 4096;
                                             var8[var29] = var32 == 4096 ? 4096 : (var14[var29] << 12) / (4096 - var32);
                                             var9[var29] = var30 != 4096 ? (var15[var29] << 12) / (-var30 + 4096) : 4096;
                                             ++var29;
                                          } while(class430.field6152 > var29);
                                       }

                                       if (!var3) {
                                          break label750;
                                       }
                                       break label753;
                                    }

                                    if (~var16 == -9) {
                                       break label753;
                                    }

                                    if (var16 == 9) {
                                       var37 = 0;
                                       if (var3 || class430.field6152 > var37) {
                                          do {
                                             var38 = var12[var37];
                                             var39 = var10[var37];
                                             var40 = var15[var37];
                                             var41 = var11[var37];
                                             var42 = var14[var37];
                                             var43 = var13[var37];
                                             var7[var37] = var39 < var43 ? var39 : var43;
                                             var8[var37] = ~var42 >= ~var41 ? var42 : var41;
                                             var9[var37] = var40 <= var38 ? var40 : var38;
                                             ++var37;
                                          } while(class430.field6152 > var37);
                                       }

                                       if (!var3) {
                                          break label750;
                                       }
                                       break label752;
                                    }

                                    if (var16 == 10) {
                                       break label752;
                                    }

                                    if (~var16 == -12) {
                                       var51 = 0;
                                       if (var3 || class430.field6152 > var51) {
                                          do {
                                             var52 = var15[var51];
                                             var53 = var11[var51];
                                             var54 = var14[var51];
                                             var55 = var13[var51];
                                             var56 = var10[var51];
                                             var57 = var12[var51];
                                             var7[var51] = var55 < var56 ? -var55 + var56 : -var56 + var55;
                                             var8[var51] = ~var53 < ~var54 ? -var54 + var53 : var54 - var53;
                                             var9[var51] = var57 <= var52 ? -var57 + var52 : -var52 + var57;
                                             ++var51;
                                          } while(class430.field6152 > var51);
                                       }

                                       if (!var3) {
                                          break label750;
                                       }
                                       break label751;
                                    }

                                    if (~var16 != -13) {
                                       break label750;
                                    }

                                    if (!var3) {
                                       break label751;
                                    }
                                 }

                                 int var17 = 0;
                                 if (var3) {
                                    var7[var17] = var10[var17] - -var13[var17];
                                    var8[var17] = var11[var17] + var14[var17];
                                    var9[var17] = var12[var17] - -var15[var17];
                                    ++var17;
                                 }

                                 while(true) {
                                    while(class430.field6152 > var17) {
                                       var7[var17] = var10[var17] - -var13[var17];
                                       var8[var17] = var11[var17] + var14[var17];
                                       var9[var17] = var12[var17] - -var15[var17];
                                       ++var17;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          break label750;
                                       }
                                       break;
                                    }

                                    ++var17;
                                 }
                              }

                              int var18 = 0;
                              if (var3) {
                                 var7[var18] = var10[var18] + -var13[var18];
                                 var8[var18] = var11[var18] + -var14[var18];
                                 var9[var18] = var12[var18] - var15[var18];
                                 ++var18;
                              }

                              label567:
                              while(true) {
                                 while(var18 < class430.field6152) {
                                    var7[var18] = var10[var18] + -var13[var18];
                                    var8[var18] = var11[var18] + -var14[var18];
                                    var9[var18] = var12[var18] - var15[var18];
                                    ++var18;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       break label750;
                                    }

                                    var19 = 0;
                                    if (var3) {
                                       var7[var19] = var10[var19] * var13[var19] >> 12;
                                       var8[var19] = var11[var19] * var14[var19] >> 12;
                                       var9[var19] = var12[var19] * var15[var19] >> 12;
                                       ++var19;
                                    }

                                    while(true) {
                                       while(class430.field6152 > var19) {
                                          var7[var19] = var10[var19] * var13[var19] >> 12;
                                          var8[var19] = var11[var19] * var14[var19] >> 12;
                                          var9[var19] = var12[var19] * var15[var19] >> 12;
                                          ++var19;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             break label750;
                                          }
                                          break label567;
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
                           if (var3) {
                              var21 = var14[var20];
                              var22 = var15[var20];
                              var23 = var13[var20];
                              var7[var20] = var23 != 0 ? (var10[var20] << 12) / var23 : 4096;
                              var8[var20] = var21 != 0 ? (var11[var20] << 12) / var21 : 4096;
                              var9[var20] = ~var22 == -1 ? 4096 : (var12[var20] << 12) / var22;
                              ++var20;
                           }

                           label598:
                           while(true) {
                              if (~class430.field6152 >= ~var20) {
                                 if (!var3) {
                                    break label750;
                                 }

                                 var24 = 0;
                                 if (var3) {
                                    var7[var24] = -((4096 - var13[var24]) * (-var10[var24] + 4096) >> 12) + 4096;
                                    var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                    var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
                                    ++var24;
                                 }

                                 while(true) {
                                    while(~class430.field6152 < ~var24) {
                                       var7[var24] = -((4096 - var13[var24]) * (-var10[var24] + 4096) >> 12) + 4096;
                                       var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                       var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
                                       ++var24;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          break label750;
                                       }
                                       break label598;
                                    }

                                    ++var24;
                                 }
                              }

                              var21 = var14[var20];
                              var22 = var15[var20];
                              var23 = var13[var20];
                              var7[var20] = var23 != 0 ? (var10[var20] << 12) / var23 : 4096;
                              var8[var20] = var21 != 0 ? (var11[var20] << 12) / var21 : 4096;
                              var9[var20] = ~var22 == -1 ? 4096 : (var12[var20] << 12) / var22;
                              ++var20;
                           }
                        }

                        int var25 = 0;
                        if (!var3 && ~var25 <= ~class430.field6152) {
                           if (!var3) {
                              break label750;
                           }

                           var29 = 0;
                           if (var3 || class430.field6152 > var29) {
                              do {
                                 var30 = var12[var29];
                                 var31 = var10[var29];
                                 var32 = var11[var29];
                                 var7[var29] = var31 != 4096 ? (var13[var29] << 12) / (-var31 + 4096) : 4096;
                                 var8[var29] = var32 == 4096 ? 4096 : (var14[var29] << 12) / (4096 - var32);
                                 var9[var29] = var30 != 4096 ? (var15[var29] << 12) / (-var30 + 4096) : 4096;
                                 ++var29;
                              } while(class430.field6152 > var29);
                           }

                           if (!var3) {
                              break label750;
                           }
                        } else {
                           while(true) {
                              int var26 = var14[var25];
                              int var27 = var15[var25];
                              int var28 = var13[var25];
                              var7[var25] = ~var28 > -2049 ? var10[var25] * var28 >> 11 : -((-var10[var25] + 4096) * (-var28 + 4096) >> 11) + 4096;
                              var8[var25] = ~var26 > -2049 ? var11[var25] * var26 >> 11 : -((-var11[var25] + 4096) * (-var26 + 4096) >> 11) + 4096;
                              var9[var25] = var27 >= 2048 ? -((4096 - var12[var25]) * (-var27 + 4096) >> 11) + 4096 : var12[var25] * var27 >> 11;
                              ++var25;
                              if (~var25 <= ~class430.field6152) {
                                 if (!var3) {
                                    break label750;
                                 }

                                 var29 = 0;
                                 if (var3 || class430.field6152 > var29) {
                                    do {
                                       var30 = var12[var29];
                                       var31 = var10[var29];
                                       var32 = var11[var29];
                                       var7[var29] = var31 != 4096 ? (var13[var29] << 12) / (-var31 + 4096) : 4096;
                                       var8[var29] = var32 == 4096 ? 4096 : (var14[var29] << 12) / (4096 - var32);
                                       var9[var29] = var30 != 4096 ? (var15[var29] << 12) / (-var30 + 4096) : 4096;
                                       ++var29;
                                    } while(class430.field6152 > var29);
                                 }

                                 if (!var3) {
                                    break label750;
                                 }
                                 break;
                              }
                           }
                        }
                     }

                     int var33 = 0;
                     if (!var3 && class430.field6152 <= var33) {
                        if (!var3) {
                           break label750;
                        }

                        var37 = 0;
                        if (var3 || class430.field6152 > var37) {
                           do {
                              var38 = var12[var37];
                              var39 = var10[var37];
                              var40 = var15[var37];
                              var41 = var11[var37];
                              var42 = var14[var37];
                              var43 = var13[var37];
                              var7[var37] = var39 < var43 ? var39 : var43;
                              var8[var37] = ~var42 >= ~var41 ? var42 : var41;
                              var9[var37] = var40 <= var38 ? var40 : var38;
                              ++var37;
                           } while(class430.field6152 > var37);
                        }

                        if (!var3) {
                           break label750;
                        }
                     } else {
                        while(true) {
                           int var34 = var12[var33];
                           int var35 = var10[var33];
                           int var36 = var11[var33];
                           var7[var33] = var35 != 0 ? 4096 - (-var13[var33] + 4096 << 12) / var35 : 0;
                           var8[var33] = ~var36 == -1 ? 0 : 4096 - (-var14[var33] + 4096 << 12) / var36;
                           var9[var33] = var34 != 0 ? -((-var15[var33] + 4096 << 12) / var34) + 4096 : 0;
                           ++var33;
                           if (class430.field6152 <= var33) {
                              if (!var3) {
                                 break label750;
                              }

                              var37 = 0;
                              if (var3 || class430.field6152 > var37) {
                                 do {
                                    var38 = var12[var37];
                                    var39 = var10[var37];
                                    var40 = var15[var37];
                                    var41 = var11[var37];
                                    var42 = var14[var37];
                                    var43 = var13[var37];
                                    var7[var37] = var39 < var43 ? var39 : var43;
                                    var8[var37] = ~var42 >= ~var41 ? var42 : var41;
                                    var9[var37] = var40 <= var38 ? var40 : var38;
                                    ++var37;
                                 } while(class430.field6152 > var37);
                              }

                              if (!var3) {
                                 break label750;
                              }
                              break;
                           }
                        }
                     }
                  }

                  int var44 = 0;
                  int var45;
                  int var46;
                  int var47;
                  int var48;
                  int var49;
                  int var50;
                  if (var3) {
                     var45 = var14[var44];
                     var46 = var12[var44];
                     var47 = var13[var44];
                     var48 = var10[var44];
                     var49 = var11[var44];
                     var50 = var15[var44];
                     var7[var44] = var47 < var48 ? var48 : var47;
                     var8[var44] = var49 <= var45 ? var45 : var49;
                     var9[var44] = ~var46 < ~var50 ? var46 : var50;
                     ++var44;
                  }

                  while(true) {
                     if (~var44 <= ~class430.field6152) {
                        if (!var3) {
                           break label750;
                        }

                        var51 = 0;
                        if (var3 || class430.field6152 > var51) {
                           do {
                              var52 = var15[var51];
                              var53 = var11[var51];
                              var54 = var14[var51];
                              var55 = var13[var51];
                              var56 = var10[var51];
                              var57 = var12[var51];
                              var7[var51] = var55 < var56 ? -var55 + var56 : -var56 + var55;
                              var8[var51] = ~var53 < ~var54 ? -var54 + var53 : var54 - var53;
                              var9[var51] = var57 <= var52 ? -var57 + var52 : -var52 + var57;
                              ++var51;
                           } while(class430.field6152 > var51);
                        }

                        if (!var3) {
                           break label750;
                        }
                        break;
                     }

                     var45 = var14[var44];
                     var46 = var12[var44];
                     var47 = var13[var44];
                     var48 = var10[var44];
                     var49 = var11[var44];
                     var50 = var15[var44];
                     var7[var44] = var47 < var48 ? var48 : var47;
                     var8[var44] = var49 <= var45 ? var45 : var49;
                     var9[var44] = ~var46 < ~var50 ? var46 : var50;
                     ++var44;
                  }
               }

               int var58 = 0;
               if (var3 || ~class430.field6152 < ~var58) {
                  do {
                     int var59 = var10[var58];
                     int var60 = var12[var58];
                     int var61 = var15[var58];
                     int var62 = var13[var58];
                     int var63 = var14[var58];
                     int var64 = var11[var58];
                     var7[var58] = -(var59 * var62 >> 11) + var62 + var59;
                     var8[var58] = -(var63 * var64 >> 11) + var64 + var63;
                     var9[var58] = var60 - (var60 * var61 >> 11) + var61;
                     ++var58;
                  } while(~class430.field6152 < ~var58);
               }
            }
         }

         if (arg1 > -117) {
            field3921 = -80;
         }

         return var4;
      } catch (RuntimeException var66) {
         throw class237.method1823(var66, field3923[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(II)[I",
      line = 319
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3918;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            label517: {
               int[] var5;
               int[] var6;
               label518: {
                  int var26;
                  int var27;
                  int var28;
                  label519: {
                     int var20;
                     int var21;
                     int var22;
                     label520: {
                        int var16;
                        int var17;
                        label521: {
                           int var13;
                           label522: {
                              int var10;
                              label523: {
                                 var5 = this.method2019(0, -27804, arg0);
                                 var6 = this.method2019(1, -27804, arg0);
                                 int var7 = this.field3917;
                                 if (~var7 != -2) {
                                    if (var7 == 2) {
                                       break label523;
                                    }

                                    if (var7 == 3) {
                                       var10 = 0;
                                       if (var3) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       while(true) {
                                          while(class430.field6152 > var10) {
                                             var4[var10] = var5[var10] * var6[var10] >> 12;
                                             ++var10;
                                          }

                                          if (!var3) {
                                             if (!var3) {
                                                break label517;
                                             }
                                             break label522;
                                          }

                                          ++var10;
                                       }
                                    }

                                    if (~var7 == -5) {
                                       break label522;
                                    }

                                    if (~var7 == -6) {
                                       var13 = 0;
                                       if (var3) {
                                          var4[var13] = 4096 - ((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12);
                                          ++var13;
                                       }

                                       while(true) {
                                          while(class430.field6152 > var13) {
                                             var4[var13] = 4096 - ((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12);
                                             ++var13;
                                          }

                                          if (!var3) {
                                             if (!var3) {
                                                break label517;
                                             }
                                             break label521;
                                          }

                                          ++var13;
                                       }
                                    }

                                    if (~var7 == -7) {
                                       break label521;
                                    }

                                    if (~var7 == -8) {
                                       var16 = 0;
                                       if (var3 || ~class430.field6152 < ~var16) {
                                          do {
                                             var17 = var5[var16];
                                             var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                             ++var16;
                                          } while(~class430.field6152 < ~var16);
                                       }

                                       if (!var3) {
                                          break label517;
                                       }
                                       break label520;
                                    }

                                    if (~var7 == -9) {
                                       break label520;
                                    }

                                    if (~var7 == -10) {
                                       var20 = 0;
                                       if (var3 || ~class430.field6152 < ~var20) {
                                          do {
                                             var21 = var5[var20];
                                             var22 = var6[var20];
                                             var4[var20] = var22 > var21 ? var21 : var22;
                                             ++var20;
                                          } while(~class430.field6152 < ~var20);
                                       }

                                       if (!var3) {
                                          break label517;
                                       }
                                       break label519;
                                    }

                                    if (var7 == 10) {
                                       break label519;
                                    }

                                    if (var7 == 11) {
                                       var26 = 0;
                                       if (var3 || ~var26 > ~class430.field6152) {
                                          do {
                                             var27 = var6[var26];
                                             var28 = var5[var26];
                                             var4[var26] = var28 <= var27 ? -var28 + var27 : -var27 + var28;
                                             ++var26;
                                          } while(~var26 > ~class430.field6152);
                                       }

                                       if (!var3) {
                                          break label517;
                                       }
                                       break label518;
                                    }

                                    if (~var7 != -13) {
                                       break label517;
                                    }

                                    if (!var3) {
                                       break label518;
                                    }
                                 }

                                 int var8 = 0;
                                 if (var3) {
                                    var4[var8] = var5[var8] + var6[var8];
                                    ++var8;
                                 }

                                 while(true) {
                                    while(class430.field6152 > var8) {
                                       var4[var8] = var5[var8] + var6[var8];
                                       ++var8;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          break label517;
                                       }
                                       break;
                                    }

                                    ++var8;
                                 }
                              }

                              int var9 = 0;
                              if (var3) {
                                 var4[var9] = var5[var9] - var6[var9];
                                 ++var9;
                              }

                              label445:
                              while(true) {
                                 while(~var9 > ~class430.field6152) {
                                    var4[var9] = var5[var9] - var6[var9];
                                    ++var9;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       break label517;
                                    }

                                    var10 = 0;
                                    if (var3) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    while(true) {
                                       while(class430.field6152 > var10) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             break label517;
                                          }
                                          break label445;
                                       }

                                       ++var10;
                                    }
                                 }

                                 ++var9;
                              }
                           }

                           int var11 = 0;
                           int var12;
                           if (var3) {
                              var12 = var6[var11];
                              var4[var11] = var12 != 0 ? (var5[var11] << 12) / var12 : 4096;
                              ++var11;
                           }

                           label460:
                           while(true) {
                              if (var11 >= class430.field6152) {
                                 if (!var3) {
                                    break label517;
                                 }

                                 var13 = 0;
                                 if (var3) {
                                    var4[var13] = 4096 - ((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12);
                                    ++var13;
                                 }

                                 while(true) {
                                    while(class430.field6152 > var13) {
                                       var4[var13] = 4096 - ((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12);
                                       ++var13;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          break label517;
                                       }
                                       break label460;
                                    }

                                    ++var13;
                                 }
                              }

                              var12 = var6[var11];
                              var4[var11] = var12 != 0 ? (var5[var11] << 12) / var12 : 4096;
                              ++var11;
                           }
                        }

                        int var14 = 0;
                        int var15;
                        if (var3) {
                           var15 = var6[var14];
                           var4[var14] = var15 < 2048 ? var5[var14] * var15 >> 11 : -((4096 - var15) * (-var5[var14] + 4096) >> 11) + 4096;
                           ++var14;
                        }

                        while(true) {
                           if (class430.field6152 <= var14) {
                              if (!var3) {
                                 break label517;
                              }

                              var16 = 0;
                              if (var3 || ~class430.field6152 < ~var16) {
                                 do {
                                    var17 = var5[var16];
                                    var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                    ++var16;
                                 } while(~class430.field6152 < ~var16);
                              }

                              if (!var3) {
                                 break label517;
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
                     if (var3) {
                        var19 = var5[var18];
                        var4[var18] = var19 != 0 ? -((4096 - var6[var18] << 12) / var19) + 4096 : 0;
                        ++var18;
                     }

                     while(true) {
                        if (~class430.field6152 >= ~var18) {
                           if (!var3) {
                              break label517;
                           }

                           var20 = 0;
                           if (var3 || ~class430.field6152 < ~var20) {
                              do {
                                 var21 = var5[var20];
                                 var22 = var6[var20];
                                 var4[var20] = var22 > var21 ? var21 : var22;
                                 ++var20;
                              } while(~class430.field6152 < ~var20);
                           }

                           if (!var3) {
                              break label517;
                           }
                           break;
                        }

                        var19 = var5[var18];
                        var4[var18] = var19 != 0 ? -((4096 - var6[var18] << 12) / var19) + 4096 : 0;
                        ++var18;
                     }
                  }

                  int var23 = 0;
                  int var24;
                  int var25;
                  if (var3) {
                     var24 = var6[var23];
                     var25 = var5[var23];
                     var4[var23] = ~var25 < ~var24 ? var25 : var24;
                     ++var23;
                  }

                  while(true) {
                     if (class430.field6152 <= var23) {
                        if (!var3) {
                           break label517;
                        }

                        var26 = 0;
                        if (var3 || ~var26 > ~class430.field6152) {
                           do {
                              var27 = var6[var26];
                              var28 = var5[var26];
                              var4[var26] = var28 <= var27 ? -var28 + var27 : -var27 + var28;
                              ++var26;
                           } while(~var26 > ~class430.field6152);
                        }

                        if (!var3) {
                           break label517;
                        }
                        break;
                     }

                     var24 = var6[var23];
                     var25 = var5[var23];
                     var4[var23] = ~var25 < ~var24 ? var25 : var24;
                     ++var23;
                  }
               }

               int var29 = 0;
               if (var3 || ~var29 > ~class430.field6152) {
                  do {
                     int var30 = var6[var29];
                     int var31 = var5[var29];
                     var4[var29] = var30 + var31 + -(var30 * var31 >> 11);
                     ++var29;
                  } while(~var29 > ~class430.field6152);
               }
            }
         }

         int var32 = -26 % ((24 - arg1) / 44);
         return var4;
      } catch (RuntimeException var34) {
         throw class237.method1823(var34, field3923[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 566
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label48: {
            label42: {
               ++field3920;
               if (arg0 != 0) {
                  if (~arg0 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field3917 = arg1.method1143(-15465);
               if (!var4) {
                  break label48;
               }
            }

            super.field3637 = ~arg1.method1143(-15465) == -2;
         }

         if (arg2 < 49) {
            this.field3917 = 92;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3923[0] + arg0 + ',' + (arg1 != null ? field3923[2] : field3923[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "()V",
      line = 609
   )
   public class283() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2146(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2147(char[] arg0) {
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
            var10005 = 4;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
