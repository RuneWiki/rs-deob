import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class395 extends class629 {
   @OriginalMember(
      owner = "client!ln",
      name = "D",
      descriptor = "I"
   )
   private int field5804 = 6;
   @OriginalMember(
      owner = "client!ln",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5812 = new String[]{method3055(method3054("\u0013\u0010~\u001c&")), method3055(method3054("\u0011\u000b<>")), method3055(method3054("\u0013\u0010~\u0017&")), method3055(method3054("\u0004P~|s")), method3055(method3054("\u0013\u0010~\u001e&")), method3055(method3054("\u0013\u0010~\u001f&")), method3055(method3054("\u001b\u0017\"7m\u000b\u0012?5g\u0011^")), method3055(method3054("RSnr")), method3055(method3054("\u0013\u0010~\u0018&"))};
   @OriginalMember(
      owner = "client!ln",
      name = "G",
      descriptor = "I"
   )
   public static int field5805 = 0;
   @OriginalMember(
      owner = "client!ln",
      name = "J",
      descriptor = "I"
   )
   public static int field5807 = 0;
   @OriginalMember(
      owner = "client!ln",
      name = "L",
      descriptor = "I"
   )
   public static int field5809 = 0;
   @OriginalMember(
      owner = "client!ln",
      name = "F",
      descriptor = "I"
   )
   public static int field5803;
   @OriginalMember(
      owner = "client!ln",
      name = "K",
      descriptor = "I"
   )
   public static int field5806;
   @OriginalMember(
      owner = "client!ln",
      name = "I",
      descriptor = "I"
   )
   public static int field5808;
   @OriginalMember(
      owner = "client!ln",
      name = "H",
      descriptor = "I"
   )
   public static int field5810;
   @OriginalMember(
      owner = "client!ln",
      name = "E",
      descriptor = "I"
   )
   public static int field5811;

   @OriginalMember(
      owner = "client!ln",
      name = "c",
      descriptor = "(II)I",
      line = 3
   )
   public static final int method3052(int arg0, int arg1) {
      try {
         int var2 = -5 / ((arg1 - 60) / 59);
         ++field5806;
         return 255 & arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5812[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(II)[[I",
      line = 16
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field5810;
         int[][] var4 = super.field9169.method785((byte)127, arg0);
         if (arg1 != 0) {
            this.method45(37, -83);
         }

         if (super.field9169.field1332) {
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
                              int[][] var5 = this.method4621(-105, 0, arg0);
                              int[][] var6 = this.method4621(-111, 1, arg0);
                              var7 = var4[0];
                              var8 = var4[1];
                              var9 = var4[2];
                              var10 = var5[0];
                              var11 = var5[1];
                              var12 = var5[2];
                              var13 = var6[0];
                              var14 = var6[1];
                              var15 = var6[2];
                              int var16 = this.field5804;
                              if (var16 != 1) {
                                 if (var16 == 2) {
                                    break label733;
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
                                       while(var19 < class66.field1214) {
                                          var7[var19] = var10[var19] * var13[var19] >> 12;
                                          var8[var19] = var11[var19] * var14[var19] >> 12;
                                          var9[var19] = var12[var19] * var15[var19] >> 12;
                                          ++var19;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return var4;
                                          }
                                          break label732;
                                       }

                                       ++var19;
                                    }
                                 }

                                 if (~var16 == -5) {
                                    break label732;
                                 }

                                 if (var16 == 5) {
                                    var24 = 0;
                                    if (var3) {
                                       var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                       var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                       var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                       ++var24;
                                    }

                                    while(true) {
                                       while(class66.field1214 > var24) {
                                          var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                          var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                          var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                          ++var24;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return var4;
                                          }
                                          break label731;
                                       }

                                       ++var24;
                                    }
                                 }

                                 if (~var16 == -7) {
                                    break label731;
                                 }

                                 if (var16 == 7) {
                                    var29 = 0;
                                    if (var3 || ~class66.field1214 < ~var29) {
                                       do {
                                          var30 = var11[var29];
                                          var31 = var10[var29];
                                          var32 = var12[var29];
                                          var7[var29] = ~var31 == -4097 ? 4096 : (var13[var29] << 12) / (4096 - var31);
                                          var8[var29] = var30 == 4096 ? 4096 : (var14[var29] << 12) / (-var30 + 4096);
                                          var9[var29] = ~var32 != -4097 ? (var15[var29] << 12) / (4096 - var32) : 4096;
                                          ++var29;
                                       } while(~class66.field1214 < ~var29);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label730;
                                 }

                                 if (var16 == 8) {
                                    break label730;
                                 }

                                 if (var16 == 9) {
                                    var37 = 0;
                                    if (var3 || ~var37 > ~class66.field1214) {
                                       do {
                                          var38 = var15[var37];
                                          var39 = var11[var37];
                                          var40 = var13[var37];
                                          var41 = var12[var37];
                                          var42 = var14[var37];
                                          var43 = var10[var37];
                                          var7[var37] = ~var40 >= ~var43 ? var40 : var43;
                                          var8[var37] = ~var42 >= ~var39 ? var42 : var39;
                                          var9[var37] = var38 <= var41 ? var38 : var41;
                                          ++var37;
                                       } while(~var37 > ~class66.field1214);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label729;
                                 }

                                 if (var16 == 10) {
                                    break label729;
                                 }

                                 if (~var16 == -12) {
                                    var51 = 0;
                                    if (var3 || ~class66.field1214 < ~var51) {
                                       do {
                                          var52 = var14[var51];
                                          var53 = var13[var51];
                                          var54 = var10[var51];
                                          var55 = var15[var51];
                                          var56 = var12[var51];
                                          var57 = var11[var51];
                                          var7[var51] = ~var54 >= ~var53 ? var53 - var54 : -var53 + var54;
                                          var8[var51] = ~var52 <= ~var57 ? var52 - var57 : -var52 + var57;
                                          var9[var51] = ~var55 <= ~var56 ? -var56 + var55 : -var55 + var56;
                                          ++var51;
                                       } while(~class66.field1214 < ~var51);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label728;
                                 }

                                 if (var16 != 12) {
                                    return var4;
                                 }

                                 if (!var3) {
                                    break label728;
                                 }
                              }

                              int var17 = 0;
                              if (var3) {
                                 var7[var17] = var10[var17] + var13[var17];
                                 var8[var17] = var11[var17] + var14[var17];
                                 var9[var17] = var12[var17] + var15[var17];
                                 ++var17;
                              }

                              while(true) {
                                 while(~var17 > ~class66.field1214) {
                                    var7[var17] = var10[var17] + var13[var17];
                                    var8[var17] = var11[var17] + var14[var17];
                                    var9[var17] = var12[var17] + var15[var17];
                                    ++var17;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break;
                                 }

                                 ++var17;
                              }
                           }

                           int var18 = 0;
                           if (var3) {
                              var7[var18] = var10[var18] + -var13[var18];
                              var8[var18] = var11[var18] - var14[var18];
                              var9[var18] = var12[var18] + -var15[var18];
                              ++var18;
                           }

                           label566:
                           while(true) {
                              while(var18 < class66.field1214) {
                                 var7[var18] = var10[var18] + -var13[var18];
                                 var8[var18] = var11[var18] - var14[var18];
                                 var9[var18] = var12[var18] + -var15[var18];
                                 ++var18;
                              }

                              if (!var3) {
                                 if (!var3) {
                                    return var4;
                                 }

                                 var19 = 0;
                                 if (var3) {
                                    var7[var19] = var10[var19] * var13[var19] >> 12;
                                    var8[var19] = var11[var19] * var14[var19] >> 12;
                                    var9[var19] = var12[var19] * var15[var19] >> 12;
                                    ++var19;
                                 }

                                 while(true) {
                                    while(var19 < class66.field1214) {
                                       var7[var19] = var10[var19] * var13[var19] >> 12;
                                       var8[var19] = var11[var19] * var14[var19] >> 12;
                                       var9[var19] = var12[var19] * var15[var19] >> 12;
                                       ++var19;
                                    }

                                    if (!var3) {
                                       if (!var3) {
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
                        if (var3) {
                           var21 = var13[var20];
                           var22 = var14[var20];
                           var23 = var15[var20];
                           var7[var20] = ~var21 != -1 ? (var10[var20] << 12) / var21 : 4096;
                           var8[var20] = var22 == 0 ? 4096 : (var11[var20] << 12) / var22;
                           var9[var20] = ~var23 == -1 ? 4096 : (var12[var20] << 12) / var23;
                           ++var20;
                        }

                        label597:
                        while(true) {
                           if (~var20 <= ~class66.field1214) {
                              if (!var3) {
                                 return var4;
                              }

                              var24 = 0;
                              if (var3) {
                                 var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                 var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                 var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                 ++var24;
                              }

                              while(true) {
                                 while(class66.field1214 > var24) {
                                    var7[var24] = 4096 - ((4096 - var10[var24]) * (-var13[var24] + 4096) >> 12);
                                    var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                    var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                    ++var24;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break label597;
                                 }

                                 ++var24;
                              }
                           }

                           var21 = var13[var20];
                           var22 = var14[var20];
                           var23 = var15[var20];
                           var7[var20] = ~var21 != -1 ? (var10[var20] << 12) / var21 : 4096;
                           var8[var20] = var22 == 0 ? 4096 : (var11[var20] << 12) / var22;
                           var9[var20] = ~var23 == -1 ? 4096 : (var12[var20] << 12) / var23;
                           ++var20;
                        }
                     }

                     int var25 = 0;
                     if (!var3 && ~class66.field1214 >= ~var25) {
                        if (!var3) {
                           return var4;
                        }

                        var29 = 0;
                        if (var3 || ~class66.field1214 < ~var29) {
                           do {
                              var30 = var11[var29];
                              var31 = var10[var29];
                              var32 = var12[var29];
                              var7[var29] = ~var31 == -4097 ? 4096 : (var13[var29] << 12) / (4096 - var31);
                              var8[var29] = var30 == 4096 ? 4096 : (var14[var29] << 12) / (-var30 + 4096);
                              var9[var29] = ~var32 != -4097 ? (var15[var29] << 12) / (4096 - var32) : 4096;
                              ++var29;
                           } while(~class66.field1214 < ~var29);
                        }

                        if (!var3) {
                           return var4;
                        }
                     } else {
                        while(true) {
                           int var26 = var14[var25];
                           int var27 = var13[var25];
                           int var28 = var15[var25];
                           var7[var25] = ~var27 <= -2049 ? 4096 - ((-var10[var25] + 4096) * (-var27 + 4096) >> 11) : var10[var25] * var27 >> 11;
                           var8[var25] = var26 >= 2048 ? 4096 - ((4096 - var11[var25]) * (-var26 + 4096) >> 11) : var11[var25] * var26 >> 11;
                           var9[var25] = ~var28 > -2049 ? var12[var25] * var28 >> 11 : -((4096 - var12[var25]) * (4096 - var28) >> 11) + 4096;
                           ++var25;
                           if (~class66.field1214 >= ~var25) {
                              if (!var3) {
                                 return var4;
                              }

                              var29 = 0;
                              if (var3 || ~class66.field1214 < ~var29) {
                                 do {
                                    var30 = var11[var29];
                                    var31 = var10[var29];
                                    var32 = var12[var29];
                                    var7[var29] = ~var31 == -4097 ? 4096 : (var13[var29] << 12) / (4096 - var31);
                                    var8[var29] = var30 == 4096 ? 4096 : (var14[var29] << 12) / (-var30 + 4096);
                                    var9[var29] = ~var32 != -4097 ? (var15[var29] << 12) / (4096 - var32) : 4096;
                                    ++var29;
                                 } while(~class66.field1214 < ~var29);
                              }

                              if (!var3) {
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
                  if (var3) {
                     var34 = var12[var33];
                     var35 = var10[var33];
                     var36 = var11[var33];
                     var7[var33] = var35 == 0 ? 0 : -((-var13[var33] + 4096 << 12) / var35) + 4096;
                     var8[var33] = var36 != 0 ? -((-var14[var33] + 4096 << 12) / var36) + 4096 : 0;
                     var9[var33] = ~var34 != -1 ? 4096 - (-var15[var33] + 4096 << 12) / var34 : 0;
                     ++var33;
                  }

                  while(true) {
                     if (var33 >= class66.field1214) {
                        if (!var3) {
                           return var4;
                        }

                        var37 = 0;
                        if (var3 || ~var37 > ~class66.field1214) {
                           do {
                              var38 = var15[var37];
                              var39 = var11[var37];
                              var40 = var13[var37];
                              var41 = var12[var37];
                              var42 = var14[var37];
                              var43 = var10[var37];
                              var7[var37] = ~var40 >= ~var43 ? var40 : var43;
                              var8[var37] = ~var42 >= ~var39 ? var42 : var39;
                              var9[var37] = var38 <= var41 ? var38 : var41;
                              ++var37;
                           } while(~var37 > ~class66.field1214);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var34 = var12[var33];
                     var35 = var10[var33];
                     var36 = var11[var33];
                     var7[var33] = var35 == 0 ? 0 : -((-var13[var33] + 4096 << 12) / var35) + 4096;
                     var8[var33] = var36 != 0 ? -((-var14[var33] + 4096 << 12) / var36) + 4096 : 0;
                     var9[var33] = ~var34 != -1 ? 4096 - (-var15[var33] + 4096 << 12) / var34 : 0;
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
               if (var3) {
                  var45 = var12[var44];
                  var46 = var10[var44];
                  var47 = var13[var44];
                  var48 = var11[var44];
                  var49 = var14[var44];
                  var50 = var15[var44];
                  var7[var44] = var46 <= var47 ? var47 : var46;
                  var8[var44] = var48 <= var49 ? var49 : var48;
                  var9[var44] = ~var50 <= ~var45 ? var50 : var45;
                  ++var44;
               }

               while(true) {
                  if (var44 >= class66.field1214) {
                     if (!var3) {
                        return var4;
                     }

                     var51 = 0;
                     if (var3 || ~class66.field1214 < ~var51) {
                        do {
                           var52 = var14[var51];
                           var53 = var13[var51];
                           var54 = var10[var51];
                           var55 = var15[var51];
                           var56 = var12[var51];
                           var57 = var11[var51];
                           var7[var51] = ~var54 >= ~var53 ? var53 - var54 : -var53 + var54;
                           var8[var51] = ~var52 <= ~var57 ? var52 - var57 : -var52 + var57;
                           var9[var51] = ~var55 <= ~var56 ? -var56 + var55 : -var55 + var56;
                           ++var51;
                        } while(~class66.field1214 < ~var51);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var45 = var12[var44];
                  var46 = var10[var44];
                  var47 = var13[var44];
                  var48 = var11[var44];
                  var49 = var14[var44];
                  var50 = var15[var44];
                  var7[var44] = var46 <= var47 ? var47 : var46;
                  var8[var44] = var48 <= var49 ? var49 : var48;
                  var9[var44] = ~var50 <= ~var45 ? var50 : var45;
                  ++var44;
               }
            }

            int var58 = 0;
            if (var3 || var58 < class66.field1214) {
               do {
                  int var59 = var10[var58];
                  int var60 = var11[var58];
                  int var61 = var12[var58];
                  int var62 = var14[var58];
                  int var63 = var13[var58];
                  int var64 = var15[var58];
                  var7[var58] = -(var59 * var63 >> 11) + var59 + var63;
                  var8[var58] = -(var60 * var62 >> 11) + var62 + var60;
                  var9[var58] = var61 - -var64 - (var61 * var64 >> 11);
                  ++var58;
               } while(var58 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var66) {
         throw class608.method4462(var66, field5812[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;",
      line = 331
   )
   public static final String method3053(int arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         ++field5808;
         int var3 = -3 / ((arg0 - -43) / 61);
         String var4 = null;
         int var5 = arg1.indexOf(field5812[7]);
         if (var5 >= 0) {
            var4 = arg1.substring(0, var5 + 4);
            arg1 = arg1.substring(var5 - -4);
         }

         if (arg1.startsWith(field5812[6])) {
            int var6 = arg1.indexOf(" ", field5812[6].length());
            if (~var6 <= -1) {
               int var7 = arg1.length();
               arg1 = arg1.substring(0, var6) + " ";
               int var8 = var6 + 1;
               if (var2 || ~var7 < ~var8) {
                  do {
                     arg1 = arg1 + "*";
                     ++var8;
                  } while(~var7 < ~var8);
               }
            }
         }

         return var4 == null ? arg1 : var4 + arg1;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5812[5] + arg0 + ',' + (arg1 != null ? field5812[3] : field5812[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "<init>",
      descriptor = "()V",
      line = 378
   )
   public class395() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(II)[I",
      line = 385
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 2048) {
            field5805 = -2;
         }

         ++field5811;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
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
                              var5 = this.method4622((byte)122, 0, arg0);
                              var6 = this.method4622((byte)124, 1, arg0);
                              int var7 = this.field5804;
                              if (~var7 != -2) {
                                 if (~var7 == -3) {
                                    break label528;
                                 }

                                 if (~var7 == -4) {
                                    var10 = 0;
                                    if (var3) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    while(true) {
                                       while(var10 < class66.field1214) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       if (!var3) {
                                          if (!var3) {
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
                                    if (var3) {
                                       var4[var13] = -((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12) + 4096;
                                       ++var13;
                                    }

                                    while(true) {
                                       while(var13 < class66.field1214) {
                                          var4[var13] = -((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12) + 4096;
                                          ++var13;
                                       }

                                       if (!var3) {
                                          if (!var3) {
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
                                    if (var3 || class66.field1214 > var16) {
                                       do {
                                          var17 = var5[var16];
                                          var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                          ++var16;
                                       } while(class66.field1214 > var16);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label525;
                                 }

                                 if (~var7 == -9) {
                                    break label525;
                                 }

                                 if (~var7 == -10) {
                                    var20 = 0;
                                    if (var3 || ~var20 > ~class66.field1214) {
                                       do {
                                          var21 = var5[var20];
                                          var22 = var6[var20];
                                          var4[var20] = var22 <= var21 ? var22 : var21;
                                          ++var20;
                                       } while(~var20 > ~class66.field1214);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label524;
                                 }

                                 if (~var7 == -11) {
                                    break label524;
                                 }

                                 if (var7 == 11) {
                                    var26 = 0;
                                    if (var3 || var26 < class66.field1214) {
                                       do {
                                          var27 = var5[var26];
                                          var28 = var6[var26];
                                          var4[var26] = ~var28 > ~var27 ? var27 - var28 : -var27 + var28;
                                          ++var26;
                                       } while(var26 < class66.field1214);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label523;
                                 }

                                 if (var7 != 12) {
                                    return var4;
                                 }

                                 if (!var3) {
                                    break label523;
                                 }
                              }

                              int var8 = 0;
                              if (var3) {
                                 var4[var8] = var5[var8] + var6[var8];
                                 ++var8;
                              }

                              while(true) {
                                 while(var8 < class66.field1214) {
                                    var4[var8] = var5[var8] + var6[var8];
                                    ++var8;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break;
                                 }

                                 ++var8;
                              }
                           }

                           int var9 = 0;
                           if (var3) {
                              var4[var9] = var5[var9] + -var6[var9];
                              ++var9;
                           }

                           label448:
                           while(true) {
                              while(~class66.field1214 < ~var9) {
                                 var4[var9] = var5[var9] + -var6[var9];
                                 ++var9;
                              }

                              if (!var3) {
                                 if (!var3) {
                                    return var4;
                                 }

                                 var10 = 0;
                                 if (var3) {
                                    var4[var10] = var5[var10] * var6[var10] >> 12;
                                    ++var10;
                                 }

                                 while(true) {
                                    while(var10 < class66.field1214) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    if (!var3) {
                                       if (!var3) {
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
                        if (var3) {
                           var12 = var6[var11];
                           var4[var11] = ~var12 != -1 ? (var5[var11] << 12) / var12 : 4096;
                           ++var11;
                        }

                        label463:
                        while(true) {
                           if (class66.field1214 <= var11) {
                              if (!var3) {
                                 return var4;
                              }

                              var13 = 0;
                              if (var3) {
                                 var4[var13] = -((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12) + 4096;
                                 ++var13;
                              }

                              while(true) {
                                 while(var13 < class66.field1214) {
                                    var4[var13] = -((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12) + 4096;
                                    ++var13;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return var4;
                                    }
                                    break label463;
                                 }

                                 ++var13;
                              }
                           }

                           var12 = var6[var11];
                           var4[var11] = ~var12 != -1 ? (var5[var11] << 12) / var12 : 4096;
                           ++var11;
                        }
                     }

                     int var14 = 0;
                     int var15;
                     if (var3) {
                        var15 = var6[var14];
                        var4[var14] = ~var15 <= -2049 ? -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096 : var5[var14] * var15 >> 11;
                        ++var14;
                     }

                     while(true) {
                        if (class66.field1214 <= var14) {
                           if (!var3) {
                              return var4;
                           }

                           var16 = 0;
                           if (var3 || class66.field1214 > var16) {
                              do {
                                 var17 = var5[var16];
                                 var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                 ++var16;
                              } while(class66.field1214 > var16);
                           }

                           if (!var3) {
                              return var4;
                           }
                           break;
                        }

                        var15 = var6[var14];
                        var4[var14] = ~var15 <= -2049 ? -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096 : var5[var14] * var15 >> 11;
                        ++var14;
                     }
                  }

                  int var18 = 0;
                  int var19;
                  if (var3) {
                     var19 = var5[var18];
                     var4[var18] = var19 == 0 ? 0 : -((-var6[var18] + 4096 << 12) / var19) + 4096;
                     ++var18;
                  }

                  while(true) {
                     if (~class66.field1214 >= ~var18) {
                        if (!var3) {
                           return var4;
                        }

                        var20 = 0;
                        if (var3 || ~var20 > ~class66.field1214) {
                           do {
                              var21 = var5[var20];
                              var22 = var6[var20];
                              var4[var20] = var22 <= var21 ? var22 : var21;
                              ++var20;
                           } while(~var20 > ~class66.field1214);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var19 = var5[var18];
                     var4[var18] = var19 == 0 ? 0 : -((-var6[var18] + 4096 << 12) / var19) + 4096;
                     ++var18;
                  }
               }

               int var23 = 0;
               int var24;
               int var25;
               if (var3) {
                  var24 = var6[var23];
                  var25 = var5[var23];
                  var4[var23] = var24 < var25 ? var25 : var24;
                  ++var23;
               }

               while(true) {
                  if (var23 >= class66.field1214) {
                     if (!var3) {
                        return var4;
                     }

                     var26 = 0;
                     if (var3 || var26 < class66.field1214) {
                        do {
                           var27 = var5[var26];
                           var28 = var6[var26];
                           var4[var26] = ~var28 > ~var27 ? var27 - var28 : -var27 + var28;
                           ++var26;
                        } while(var26 < class66.field1214);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var24 = var6[var23];
                  var25 = var5[var23];
                  var4[var23] = var24 < var25 ? var25 : var24;
                  ++var23;
               }
            }

            int var29 = 0;
            if (var3 || class66.field1214 > var29) {
               do {
                  int var30 = var6[var29];
                  int var31 = var5[var29];
                  var4[var29] = var31 - (-var30 - -(var30 * var31 >> 11));
                  ++var29;
               } while(class66.field1214 > var29);
            }
         }

         return var4;
      } catch (RuntimeException var33) {
         throw class608.method4462(var33, field5812[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 634
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label48: {
            label42: {
               ++field5803;
               if (~arg2 != -1) {
                  if (~arg2 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field5804 = arg0.method3564((byte)-113);
               if (!var4) {
                  break label48;
               }
            }

            super.field9166 = arg0.method3564((byte)-120) == 1;
         }

         if (arg1 != 0) {
            field5809 = -15;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5812[2] + (arg0 != null ? field5812[3] : field5812[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3054(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3055(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
