import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class620 extends class70 {
   @OriginalMember(
      owner = "client!jm",
      name = "U",
      descriptor = "I"
   )
   private int field9018 = 6;
   @OriginalMember(
      owner = "client!jm",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9030 = new String[]{method4563(method4562("n\u0004J\u000fz")), method4563(method4562("j\u001c\b)")), method4563(method4562("\u007fGJk/")), method4563(method4562("n\u0004J\u0004z")), method4563(method4562("n\u0004J\u0006z")), method4563(method4562("n\u0004J\rz")), method4563(method4562("n\u0004J\u0001z"))};
   @OriginalMember(
      owner = "client!jm",
      name = "S",
      descriptor = "[I"
   )
   public static int[] field9020 = new int[]{32, 39, 44, 47};
   @OriginalMember(
      owner = "client!jm",
      name = "I",
      descriptor = "Luk;"
   )
   public static class498 field9019 = new class498(43, 2);
   @OriginalMember(
      owner = "client!jm",
      name = "N",
      descriptor = "I"
   )
   public static int field9022 = 50;
   @OriginalMember(
      owner = "client!jm",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field9023 = new int[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field9024 = new int[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "V",
      descriptor = "[I"
   )
   public static int[] field9025 = new int[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field9026 = new int[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field9027 = new int[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field9029 = new int[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9028 = new String[field9022];
   @OriginalMember(
      owner = "client!jm",
      name = "G",
      descriptor = "I"
   )
   public static int field9013;
   @OriginalMember(
      owner = "client!jm",
      name = "R",
      descriptor = "I"
   )
   public static int field9014;
   @OriginalMember(
      owner = "client!jm",
      name = "T",
      descriptor = "I"
   )
   public static int field9015;
   @OriginalMember(
      owner = "client!jm",
      name = "P",
      descriptor = "I"
   )
   public static int field9016;
   @OriginalMember(
      owner = "client!jm",
      name = "O",
      descriptor = "I"
   )
   public static int field9017;
   @OriginalMember(
      owner = "client!jm",
      name = "Q",
      descriptor = "I"
   )
   public static int field9021;

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(BI)[I",
      line = 4
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9015;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
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
                              var5 = this.method545(0, arg1, (byte)-64);
                              var6 = this.method545(1, arg1, (byte)-82);
                              int var7 = this.field9018;
                              if (var7 != 1) {
                                 if (~var7 == -3) {
                                    break label528;
                                 }

                                 if (var7 == 3) {
                                    var10 = 0;
                                    if (var3) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    while(true) {
                                       while(var10 < class678.field10127) {
                                          var4[var10] = var5[var10] * var6[var10] >> 12;
                                          ++var10;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return arg0 != 87 ? null : var4;
                                          }
                                          break label527;
                                       }

                                       ++var10;
                                    }
                                 }

                                 if (~var7 == -5) {
                                    break label527;
                                 }

                                 if (~var7 == -6) {
                                    var13 = 0;
                                    if (var3) {
                                       var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
                                       ++var13;
                                    }

                                    while(true) {
                                       while(class678.field10127 > var13) {
                                          var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
                                          ++var13;
                                       }

                                       if (!var3) {
                                          if (!var3) {
                                             return arg0 != 87 ? null : var4;
                                          }
                                          break label526;
                                       }

                                       ++var13;
                                    }
                                 }

                                 if (~var7 == -7) {
                                    break label526;
                                 }

                                 if (~var7 == -8) {
                                    var16 = 0;
                                    if (var3 || var16 < class678.field10127) {
                                       do {
                                          var17 = var5[var16];
                                          var4[var16] = var17 != 4096 ? (var6[var16] << 12) / (-var17 + 4096) : 4096;
                                          ++var16;
                                       } while(var16 < class678.field10127);
                                    }

                                    if (!var3) {
                                       return arg0 != 87 ? null : var4;
                                    }
                                    break label525;
                                 }

                                 if (~var7 == -9) {
                                    break label525;
                                 }

                                 if (~var7 == -10) {
                                    var20 = 0;
                                    if (var3 || var20 < class678.field10127) {
                                       do {
                                          var21 = var6[var20];
                                          var22 = var5[var20];
                                          var4[var20] = ~var22 > ~var21 ? var22 : var21;
                                          ++var20;
                                       } while(var20 < class678.field10127);
                                    }

                                    if (!var3) {
                                       return arg0 != 87 ? null : var4;
                                    }
                                    break label524;
                                 }

                                 if (~var7 == -11) {
                                    break label524;
                                 }

                                 if (~var7 == -12) {
                                    var26 = 0;
                                    if (var3 || var26 < class678.field10127) {
                                       do {
                                          var27 = var5[var26];
                                          var28 = var6[var26];
                                          var4[var26] = var27 <= var28 ? -var27 + var28 : -var28 + var27;
                                          ++var26;
                                       } while(var26 < class678.field10127);
                                    }

                                    if (!var3) {
                                       return arg0 != 87 ? null : var4;
                                    }
                                    break label523;
                                 }

                                 if (~var7 != -13) {
                                    return arg0 != 87 ? null : var4;
                                 }

                                 if (!var3) {
                                    break label523;
                                 }
                              }

                              int var8 = 0;
                              if (var3) {
                                 var4[var8] = var5[var8] - -var6[var8];
                                 ++var8;
                              }

                              while(true) {
                                 while(var8 < class678.field10127) {
                                    var4[var8] = var5[var8] - -var6[var8];
                                    ++var8;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return arg0 != 87 ? null : var4;
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

                           label449:
                           while(true) {
                              while(var9 < class678.field10127) {
                                 var4[var9] = var5[var9] + -var6[var9];
                                 ++var9;
                              }

                              if (!var3) {
                                 if (!var3) {
                                    return arg0 != 87 ? null : var4;
                                 }

                                 var10 = 0;
                                 if (var3) {
                                    var4[var10] = var5[var10] * var6[var10] >> 12;
                                    ++var10;
                                 }

                                 while(true) {
                                    while(var10 < class678.field10127) {
                                       var4[var10] = var5[var10] * var6[var10] >> 12;
                                       ++var10;
                                    }

                                    if (!var3) {
                                       if (!var3) {
                                          return arg0 != 87 ? null : var4;
                                       }
                                       break label449;
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
                           var4[var11] = var12 == 0 ? 4096 : (var5[var11] << 12) / var12;
                           ++var11;
                        }

                        label464:
                        while(true) {
                           if (class678.field10127 <= var11) {
                              if (!var3) {
                                 return arg0 != 87 ? null : var4;
                              }

                              var13 = 0;
                              if (var3) {
                                 var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
                                 ++var13;
                              }

                              while(true) {
                                 while(class678.field10127 > var13) {
                                    var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
                                    ++var13;
                                 }

                                 if (!var3) {
                                    if (!var3) {
                                       return arg0 != 87 ? null : var4;
                                    }
                                    break label464;
                                 }

                                 ++var13;
                              }
                           }

                           var12 = var6[var11];
                           var4[var11] = var12 == 0 ? 4096 : (var5[var11] << 12) / var12;
                           ++var11;
                        }
                     }

                     int var14 = 0;
                     int var15;
                     if (var3) {
                        var15 = var6[var14];
                        var4[var14] = var15 < 2048 ? var5[var14] * var15 >> 11 : -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096;
                        ++var14;
                     }

                     while(true) {
                        if (class678.field10127 <= var14) {
                           if (!var3) {
                              return arg0 != 87 ? null : var4;
                           }

                           var16 = 0;
                           if (var3 || var16 < class678.field10127) {
                              do {
                                 var17 = var5[var16];
                                 var4[var16] = var17 != 4096 ? (var6[var16] << 12) / (-var17 + 4096) : 4096;
                                 ++var16;
                              } while(var16 < class678.field10127);
                           }

                           if (!var3) {
                              return arg0 != 87 ? null : var4;
                           }
                           break;
                        }

                        var15 = var6[var14];
                        var4[var14] = var15 < 2048 ? var5[var14] * var15 >> 11 : -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096;
                        ++var14;
                     }
                  }

                  int var18 = 0;
                  int var19;
                  if (var3) {
                     var19 = var5[var18];
                     var4[var18] = var19 == 0 ? 0 : 4096 - (-var6[var18] + 4096 << 12) / var19;
                     ++var18;
                  }

                  while(true) {
                     if (~class678.field10127 >= ~var18) {
                        if (!var3) {
                           return arg0 != 87 ? null : var4;
                        }

                        var20 = 0;
                        if (var3 || var20 < class678.field10127) {
                           do {
                              var21 = var6[var20];
                              var22 = var5[var20];
                              var4[var20] = ~var22 > ~var21 ? var22 : var21;
                              ++var20;
                           } while(var20 < class678.field10127);
                        }

                        if (!var3) {
                           return arg0 != 87 ? null : var4;
                        }
                        break;
                     }

                     var19 = var5[var18];
                     var4[var18] = var19 == 0 ? 0 : 4096 - (-var6[var18] + 4096 << 12) / var19;
                     ++var18;
                  }
               }

               int var23 = 0;
               int var24;
               int var25;
               if (var3) {
                  var24 = var6[var23];
                  var25 = var5[var23];
                  var4[var23] = ~var25 >= ~var24 ? var24 : var25;
                  ++var23;
               }

               while(true) {
                  if (~class678.field10127 >= ~var23) {
                     if (!var3) {
                        return arg0 != 87 ? null : var4;
                     }

                     var26 = 0;
                     if (var3 || var26 < class678.field10127) {
                        do {
                           var27 = var5[var26];
                           var28 = var6[var26];
                           var4[var26] = var27 <= var28 ? -var27 + var28 : -var28 + var27;
                           ++var26;
                        } while(var26 < class678.field10127);
                     }

                     if (!var3) {
                        return arg0 != 87 ? null : var4;
                     }
                     break;
                  }

                  var24 = var6[var23];
                  var25 = var5[var23];
                  var4[var23] = ~var25 >= ~var24 ? var24 : var25;
                  ++var23;
               }
            }

            int var29 = 0;
            if (var3 || ~class678.field10127 < ~var29) {
               do {
                  int var30 = var5[var29];
                  int var31 = var6[var29];
                  var4[var29] = var30 + var31 + -(var30 * var31 >> 11);
                  ++var29;
               } while(~class678.field10127 < ~var29);
            }
         }

         return arg0 != 87 ? null : var4;
      } catch (RuntimeException var33) {
         throw class482.method3757(var33, field9030[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(IIIIII[B)Z",
      line = 249
   )
   public static final boolean method4559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
      boolean var7 = client.field1786;

      try {
         int var9;
         label68: {
            ++field9016;
            int var8 = arg1 % arg5;
            if (var8 != 0) {
               var9 = -var8 + arg5;
               if (!var7) {
                  break label68;
               }
            }

            var9 = 0;
         }

         int var10 = -((arg3 - -arg5 + -1) / arg5);
         int var11 = -((arg5 + -1 + arg1) / arg5);
         int var12 = var10;
         if (arg4 != 4096) {
            return true;
         } else {
            while(true) {
               int var10000;
               if (var12 >= 0) {
                  var10000 = 0;
                  if (!var7) {
                     return false;
                  }
               } else {
                  var10000 = var11;
               }

               int var13 = var10000;
               if (var7) {
                  if (arg6[arg0] == 0) {
                     return true;
                  }

                  arg0 += arg5;
                  ++var13;
               }

               while(true) {
                  byte var16;
                  if (~var13 <= -1) {
                     arg0 -= var9;
                     var16 = arg6[arg0 + -1];
                     if (!var7) {
                        if (var16 == 0) {
                           return true;
                        }

                        arg0 += arg2;
                        ++var12;
                        break;
                     }
                  } else {
                     var16 = arg6[arg0];
                  }

                  if (var16 == 0) {
                     return true;
                  }

                  arg0 += arg5;
                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9030[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9030[2] : field9030[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "b",
      descriptor = "(B)V",
      line = 297
   )
   public static void method4560(byte arg0) {
      try {
         field9027 = null;
         if (arg0 == -28) {
            field9019 = null;
            field9028 = null;
            field9025 = null;
            field9020 = null;
            field9023 = null;
            field9026 = null;
            field9029 = null;
            field9024 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9030[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(II)[[I",
      line = 315
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9013;
         int[][] var4 = super.field918.method3276((byte)108, arg1);
         if (arg0 != 32) {
            return null;
         } else {
            if (super.field918.field6361) {
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
                                 int[][] var5 = this.method539(true, arg1, 0);
                                 int[][] var6 = this.method539(true, arg1, 1);
                                 var7 = var4[0];
                                 var8 = var4[1];
                                 var9 = var4[2];
                                 var10 = var5[0];
                                 var11 = var5[1];
                                 var12 = var5[2];
                                 var13 = var6[0];
                                 var14 = var6[1];
                                 var15 = var6[2];
                                 int var16 = this.field9018;
                                 if (var16 != 1) {
                                    if (~var16 == -3) {
                                       break label733;
                                    }

                                    if (var16 == 3) {
                                       var19 = 0;
                                       if (var3) {
                                          var7[var19] = var10[var19] * var13[var19] >> 12;
                                          var8[var19] = var11[var19] * var14[var19] >> 12;
                                          var9[var19] = var12[var19] * var15[var19] >> 12;
                                          ++var19;
                                       }

                                       while(true) {
                                          while(var19 < class678.field10127) {
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

                                    if (var16 == 4) {
                                       break label732;
                                    }

                                    if (~var16 == -6) {
                                       var24 = 0;
                                       if (var3) {
                                          var7[var24] = 4096 - ((4096 - var10[var24]) * (4096 - var13[var24]) >> 12);
                                          var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                          var9[var24] = 4096 - ((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12);
                                          ++var24;
                                       }

                                       while(true) {
                                          while(~class678.field10127 < ~var24) {
                                             var7[var24] = 4096 - ((4096 - var10[var24]) * (4096 - var13[var24]) >> 12);
                                             var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                             var9[var24] = 4096 - ((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12);
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

                                    if (var16 == 6) {
                                       break label731;
                                    }

                                    if (var16 == 7) {
                                       var29 = 0;
                                       if (var3 || ~var29 > ~class678.field10127) {
                                          do {
                                             var30 = var10[var29];
                                             var31 = var11[var29];
                                             var32 = var12[var29];
                                             var7[var29] = ~var30 != -4097 ? (var13[var29] << 12) / (-var30 + 4096) : 4096;
                                             var8[var29] = ~var31 == -4097 ? 4096 : (var14[var29] << 12) / (-var31 + 4096);
                                             var9[var29] = var32 == 4096 ? 4096 : (var15[var29] << 12) / (-var32 + 4096);
                                             ++var29;
                                          } while(~var29 > ~class678.field10127);
                                       }

                                       if (!var3) {
                                          return var4;
                                       }
                                       break label730;
                                    }

                                    if (~var16 == -9) {
                                       break label730;
                                    }

                                    if (var16 == 9) {
                                       var37 = 0;
                                       if (var3 || ~var37 > ~class678.field10127) {
                                          do {
                                             var38 = var15[var37];
                                             var39 = var14[var37];
                                             var40 = var13[var37];
                                             var41 = var12[var37];
                                             var42 = var10[var37];
                                             var43 = var11[var37];
                                             var7[var37] = var40 > var42 ? var42 : var40;
                                             var8[var37] = var39 > var43 ? var43 : var39;
                                             var9[var37] = ~var41 <= ~var38 ? var38 : var41;
                                             ++var37;
                                          } while(~var37 > ~class678.field10127);
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
                                       if (var3 || class678.field10127 > var51) {
                                          do {
                                             var52 = var15[var51];
                                             var53 = var12[var51];
                                             var54 = var14[var51];
                                             var55 = var11[var51];
                                             var56 = var10[var51];
                                             var57 = var13[var51];
                                             var7[var51] = ~var57 > ~var56 ? -var57 + var56 : -var56 + var57;
                                             var8[var51] = var55 > var54 ? -var54 + var55 : -var55 + var54;
                                             var9[var51] = ~var53 >= ~var52 ? -var53 + var52 : -var52 + var53;
                                             ++var51;
                                          } while(class678.field10127 > var51);
                                       }

                                       if (!var3) {
                                          return var4;
                                       }
                                       break label728;
                                    }

                                    if (~var16 != -13) {
                                       return var4;
                                    }

                                    if (!var3) {
                                       break label728;
                                    }
                                 }

                                 int var17 = 0;
                                 if (var3) {
                                    var7[var17] = var10[var17] + var13[var17];
                                    var8[var17] = var11[var17] - -var14[var17];
                                    var9[var17] = var12[var17] + var15[var17];
                                    ++var17;
                                 }

                                 while(true) {
                                    while(~var17 > ~class678.field10127) {
                                       var7[var17] = var10[var17] + var13[var17];
                                       var8[var17] = var11[var17] - -var14[var17];
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
                                 var8[var18] = var11[var18] + -var14[var18];
                                 var9[var18] = var12[var18] + -var15[var18];
                                 ++var18;
                              }

                              label566:
                              while(true) {
                                 while(var18 < class678.field10127) {
                                    var7[var18] = var10[var18] + -var13[var18];
                                    var8[var18] = var11[var18] + -var14[var18];
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
                                       while(var19 < class678.field10127) {
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
                              var21 = var15[var20];
                              var22 = var13[var20];
                              var23 = var14[var20];
                              var7[var20] = ~var22 != -1 ? (var10[var20] << 12) / var22 : 4096;
                              var8[var20] = ~var23 != -1 ? (var11[var20] << 12) / var23 : 4096;
                              var9[var20] = var21 != 0 ? (var12[var20] << 12) / var21 : 4096;
                              ++var20;
                           }

                           label597:
                           while(true) {
                              if (~var20 <= ~class678.field10127) {
                                 if (!var3) {
                                    return var4;
                                 }

                                 var24 = 0;
                                 if (var3) {
                                    var7[var24] = 4096 - ((4096 - var10[var24]) * (4096 - var13[var24]) >> 12);
                                    var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                    var9[var24] = 4096 - ((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12);
                                    ++var24;
                                 }

                                 while(true) {
                                    while(~class678.field10127 < ~var24) {
                                       var7[var24] = 4096 - ((4096 - var10[var24]) * (4096 - var13[var24]) >> 12);
                                       var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                       var9[var24] = 4096 - ((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12);
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

                              var21 = var15[var20];
                              var22 = var13[var20];
                              var23 = var14[var20];
                              var7[var20] = ~var22 != -1 ? (var10[var20] << 12) / var22 : 4096;
                              var8[var20] = ~var23 != -1 ? (var11[var20] << 12) / var23 : 4096;
                              var9[var20] = var21 != 0 ? (var12[var20] << 12) / var21 : 4096;
                              ++var20;
                           }
                        }

                        int var25 = 0;
                        if (!var3 && var25 >= class678.field10127) {
                           if (!var3) {
                              return var4;
                           }

                           var29 = 0;
                           if (var3 || ~var29 > ~class678.field10127) {
                              do {
                                 var30 = var10[var29];
                                 var31 = var11[var29];
                                 var32 = var12[var29];
                                 var7[var29] = ~var30 != -4097 ? (var13[var29] << 12) / (-var30 + 4096) : 4096;
                                 var8[var29] = ~var31 == -4097 ? 4096 : (var14[var29] << 12) / (-var31 + 4096);
                                 var9[var29] = var32 == 4096 ? 4096 : (var15[var29] << 12) / (-var32 + 4096);
                                 ++var29;
                              } while(~var29 > ~class678.field10127);
                           }

                           if (!var3) {
                              return var4;
                           }
                        } else {
                           while(true) {
                              int var26 = var14[var25];
                              int var27 = var13[var25];
                              int var28 = var15[var25];
                              var7[var25] = var27 >= 2048 ? -((-var10[var25] + 4096) * (-var27 + 4096) >> 11) + 4096 : var10[var25] * var27 >> 11;
                              var8[var25] = ~var26 > -2049 ? var11[var25] * var26 >> 11 : -((-var11[var25] + 4096) * (-var26 + 4096) >> 11) + 4096;
                              var9[var25] = ~var28 > -2049 ? var12[var25] * var28 >> 11 : -((-var12[var25] + 4096) * (-var28 + 4096) >> 11) + 4096;
                              ++var25;
                              if (var25 >= class678.field10127) {
                                 if (!var3) {
                                    return var4;
                                 }

                                 var29 = 0;
                                 if (var3 || ~var29 > ~class678.field10127) {
                                    do {
                                       var30 = var10[var29];
                                       var31 = var11[var29];
                                       var32 = var12[var29];
                                       var7[var29] = ~var30 != -4097 ? (var13[var29] << 12) / (-var30 + 4096) : 4096;
                                       var8[var29] = ~var31 == -4097 ? 4096 : (var14[var29] << 12) / (-var31 + 4096);
                                       var9[var29] = var32 == 4096 ? 4096 : (var15[var29] << 12) / (-var32 + 4096);
                                       ++var29;
                                    } while(~var29 > ~class678.field10127);
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
                        var34 = var11[var33];
                        var35 = var12[var33];
                        var36 = var10[var33];
                        var7[var33] = ~var36 == -1 ? 0 : -((4096 - var13[var33] << 12) / var36) + 4096;
                        var8[var33] = var34 == 0 ? 0 : 4096 - (-var14[var33] + 4096 << 12) / var34;
                        var9[var33] = ~var35 == -1 ? 0 : -((-var15[var33] + 4096 << 12) / var35) + 4096;
                        ++var33;
                     }

                     while(true) {
                        if (class678.field10127 <= var33) {
                           if (!var3) {
                              return var4;
                           }

                           var37 = 0;
                           if (var3 || ~var37 > ~class678.field10127) {
                              do {
                                 var38 = var15[var37];
                                 var39 = var14[var37];
                                 var40 = var13[var37];
                                 var41 = var12[var37];
                                 var42 = var10[var37];
                                 var43 = var11[var37];
                                 var7[var37] = var40 > var42 ? var42 : var40;
                                 var8[var37] = var39 > var43 ? var43 : var39;
                                 var9[var37] = ~var41 <= ~var38 ? var38 : var41;
                                 ++var37;
                              } while(~var37 > ~class678.field10127);
                           }

                           if (!var3) {
                              return var4;
                           }
                           break;
                        }

                        var34 = var11[var33];
                        var35 = var12[var33];
                        var36 = var10[var33];
                        var7[var33] = ~var36 == -1 ? 0 : -((4096 - var13[var33] << 12) / var36) + 4096;
                        var8[var33] = var34 == 0 ? 0 : 4096 - (-var14[var33] + 4096 << 12) / var34;
                        var9[var33] = ~var35 == -1 ? 0 : -((-var15[var33] + 4096 << 12) / var35) + 4096;
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
                     var45 = var14[var44];
                     var46 = var13[var44];
                     var47 = var11[var44];
                     var48 = var10[var44];
                     var49 = var15[var44];
                     var50 = var12[var44];
                     var7[var44] = var46 < var48 ? var48 : var46;
                     var8[var44] = var45 >= var47 ? var45 : var47;
                     var9[var44] = var49 < var50 ? var50 : var49;
                     ++var44;
                  }

                  while(true) {
                     if (class678.field10127 <= var44) {
                        if (!var3) {
                           return var4;
                        }

                        var51 = 0;
                        if (var3 || class678.field10127 > var51) {
                           do {
                              var52 = var15[var51];
                              var53 = var12[var51];
                              var54 = var14[var51];
                              var55 = var11[var51];
                              var56 = var10[var51];
                              var57 = var13[var51];
                              var7[var51] = ~var57 > ~var56 ? -var57 + var56 : -var56 + var57;
                              var8[var51] = var55 > var54 ? -var54 + var55 : -var55 + var54;
                              var9[var51] = ~var53 >= ~var52 ? -var53 + var52 : -var52 + var53;
                              ++var51;
                           } while(class678.field10127 > var51);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var45 = var14[var44];
                     var46 = var13[var44];
                     var47 = var11[var44];
                     var48 = var10[var44];
                     var49 = var15[var44];
                     var50 = var12[var44];
                     var7[var44] = var46 < var48 ? var48 : var46;
                     var8[var44] = var45 >= var47 ? var45 : var47;
                     var9[var44] = var49 < var50 ? var50 : var49;
                     ++var44;
                  }
               }

               int var58 = 0;
               if (var3 || ~class678.field10127 < ~var58) {
                  do {
                     int var59 = var10[var58];
                     int var60 = var15[var58];
                     int var61 = var13[var58];
                     int var62 = var11[var58];
                     int var63 = var14[var58];
                     int var64 = var12[var58];
                     var7[var58] = var59 + var61 + -(var59 * var61 >> 11);
                     var8[var58] = var62 + var63 + -(var62 * var63 >> 11);
                     var9[var58] = -(var60 * var64 >> 11) + var64 + var60;
                     ++var58;
                  } while(~class678.field10127 < ~var58);
               }
            }

            return var4;
         }
      } catch (RuntimeException var66) {
         throw class482.method3757(var66, field9030[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "<init>",
      descriptor = "()V",
      line = 674
   )
   public class620() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(IILica;)V",
      line = 640
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field9014;
         if (arg0 != -1) {
            field9025 = null;
         }

         if (~arg1 != -1) {
            if (~arg1 != -2) {
               return;
            }

            if (!client.field1786) {
               super.field933 = arg2.method2855(-31007) == 1;
               return;
            }
         }

         this.field9018 = arg2.method2855(-31007);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9030[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9030[2] : field9030[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
      line = 677
   )
   public static final String method4561(int arg0, String arg1, String arg2, String arg3) {
      boolean var4 = client.field1786;
      ++field9017;
      if (arg0 != 2957) {
         return null;
      } else {
         int var5 = arg3.indexOf(arg2);
         if (var4) {
            arg3 = arg3.substring(0, var5) + arg1 + arg3.substring(arg2.length() + var5);
            var5 = arg3.indexOf(arg2, arg1.length() + var5);
         }

         while(true) {
            while(~var5 != 0) {
               arg3 = arg3.substring(0, var5) + arg1 + arg3.substring(arg2.length() + var5);
               var5 = arg3.indexOf(arg2, arg1.length() + var5);
            }

            if (!var4) {
               return arg3;
            }

            var5 = arg3.indexOf(arg2, arg1.length() + var5);
         }
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4562(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4563(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
