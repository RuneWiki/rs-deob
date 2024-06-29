import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class547 extends class606 {
   @OriginalMember(
      owner = "client!ok",
      name = "I",
      descriptor = "I"
   )
   private int field7786 = 6;
   @OriginalMember(
      owner = "client!ok",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7790 = new String[]{method4100(method4099("[>$\f^")), method4100(method4099("[>$\u000b^")), method4100(method4099("[>$\r^")), method4100(method4099("Z f\"")), method4100(method4099("O{$`\u000b")), method4100(method4099("[>$\u000f^")), method4100(method4099("[>$\u0006^")), method4100(method4099("[>$\t^"))};
   @OriginalMember(
      owner = "client!ok",
      name = "F",
      descriptor = "I"
   )
   public static int field7783;
   @OriginalMember(
      owner = "client!ok",
      name = "H",
      descriptor = "I"
   )
   public static int field7784;
   @OriginalMember(
      owner = "client!ok",
      name = "K",
      descriptor = "I"
   )
   public static int field7785;
   @OriginalMember(
      owner = "client!ok",
      name = "E",
      descriptor = "I"
   )
   public static int field7787;
   @OriginalMember(
      owner = "client!ok",
      name = "G",
      descriptor = "I"
   )
   public static int field7788;
   @OriginalMember(
      owner = "client!ok",
      name = "J",
      descriptor = "I"
   )
   public static int field7789;

   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 373) {
            this.field7786 = -42;
         }

         ++field7789;
         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (super.field8649.field11043) {
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
                              int[][] var5 = this.method4467(0, arg1, (byte)120);
                              int[][] var6 = this.method4467(1, arg1, (byte)107);
                              var7 = var4[0];
                              var8 = var4[1];
                              var9 = var4[2];
                              var10 = var5[0];
                              var11 = var5[1];
                              var12 = var5[2];
                              var13 = var6[0];
                              var14 = var6[1];
                              var15 = var6[2];
                              int var16 = this.field7786;
                              if (var16 != 1) {
                                 if (var16 == 2) {
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
                                       while(class563.field8014 > var19) {
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

                                 if (~var16 == -6) {
                                    var24 = 0;
                                    if (var3) {
                                       var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                       var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                       var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
                                       ++var24;
                                    }

                                    while(true) {
                                       while(~var24 > ~class563.field8014) {
                                          var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                          var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                          var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
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

                                 if (~var16 == -8) {
                                    var29 = 0;
                                    if (var3 || class563.field8014 > var29) {
                                       do {
                                          var30 = var10[var29];
                                          var31 = var11[var29];
                                          var32 = var12[var29];
                                          var7[var29] = ~var30 != -4097 ? (var13[var29] << 12) / (-var30 + 4096) : 4096;
                                          var8[var29] = ~var31 == -4097 ? 4096 : (var14[var29] << 12) / (4096 - var31);
                                          var9[var29] = ~var32 == -4097 ? 4096 : (var15[var29] << 12) / (4096 - var32);
                                          ++var29;
                                       } while(class563.field8014 > var29);
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
                                    if (var3 || ~var37 > ~class563.field8014) {
                                       do {
                                          var38 = var12[var37];
                                          var39 = var14[var37];
                                          var40 = var13[var37];
                                          var41 = var11[var37];
                                          var42 = var15[var37];
                                          var43 = var10[var37];
                                          var7[var37] = ~var43 <= ~var40 ? var40 : var43;
                                          var8[var37] = ~var39 >= ~var41 ? var39 : var41;
                                          var9[var37] = ~var42 < ~var38 ? var38 : var42;
                                          ++var37;
                                       } while(~var37 > ~class563.field8014);
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
                                    if (var3 || ~class563.field8014 < ~var51) {
                                       do {
                                          var52 = var14[var51];
                                          var53 = var13[var51];
                                          var54 = var12[var51];
                                          var55 = var15[var51];
                                          var56 = var11[var51];
                                          var57 = var10[var51];
                                          var7[var51] = ~var57 < ~var53 ? -var53 + var57 : var53 - var57;
                                          var8[var51] = ~var56 < ~var52 ? -var52 + var56 : -var56 + var52;
                                          var9[var51] = ~var55 <= ~var54 ? var55 - var54 : -var55 + var54;
                                          ++var51;
                                       } while(~class563.field8014 < ~var51);
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
                                 var8[var17] = var11[var17] + var14[var17];
                                 var9[var17] = var12[var17] + var15[var17];
                                 ++var17;
                              }

                              while(true) {
                                 while(~var17 > ~class563.field8014) {
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
                              var7[var18] = var10[var18] - var13[var18];
                              var8[var18] = var11[var18] + -var14[var18];
                              var9[var18] = var12[var18] + -var15[var18];
                              ++var18;
                           }

                           label566:
                           while(true) {
                              while(class563.field8014 > var18) {
                                 var7[var18] = var10[var18] - var13[var18];
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
                                    while(class563.field8014 > var19) {
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
                           var21 = var14[var20];
                           var22 = var13[var20];
                           var23 = var15[var20];
                           var7[var20] = var22 != 0 ? (var10[var20] << 12) / var22 : 4096;
                           var8[var20] = ~var21 != -1 ? (var11[var20] << 12) / var21 : 4096;
                           var9[var20] = var23 == 0 ? 4096 : (var12[var20] << 12) / var23;
                           ++var20;
                        }

                        label597:
                        while(true) {
                           if (~var20 <= ~class563.field8014) {
                              if (!var3) {
                                 return var4;
                              }

                              var24 = 0;
                              if (var3) {
                                 var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                 var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                 var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
                                 ++var24;
                              }

                              while(true) {
                                 while(~var24 > ~class563.field8014) {
                                    var7[var24] = -((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12) + 4096;
                                    var8[var24] = -((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12) + 4096;
                                    var9[var24] = -((4096 - var12[var24]) * (-var15[var24] + 4096) >> 12) + 4096;
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

                           var21 = var14[var20];
                           var22 = var13[var20];
                           var23 = var15[var20];
                           var7[var20] = var22 != 0 ? (var10[var20] << 12) / var22 : 4096;
                           var8[var20] = ~var21 != -1 ? (var11[var20] << 12) / var21 : 4096;
                           var9[var20] = var23 == 0 ? 4096 : (var12[var20] << 12) / var23;
                           ++var20;
                        }
                     }

                     int var25 = 0;
                     if (!var3 && ~class563.field8014 >= ~var25) {
                        if (!var3) {
                           return var4;
                        }

                        var29 = 0;
                        if (var3 || class563.field8014 > var29) {
                           do {
                              var30 = var10[var29];
                              var31 = var11[var29];
                              var32 = var12[var29];
                              var7[var29] = ~var30 != -4097 ? (var13[var29] << 12) / (-var30 + 4096) : 4096;
                              var8[var29] = ~var31 == -4097 ? 4096 : (var14[var29] << 12) / (4096 - var31);
                              var9[var29] = ~var32 == -4097 ? 4096 : (var15[var29] << 12) / (4096 - var32);
                              ++var29;
                           } while(class563.field8014 > var29);
                        }

                        if (!var3) {
                           return var4;
                        }
                     } else {
                        while(true) {
                           int var26 = var13[var25];
                           int var27 = var15[var25];
                           int var28 = var14[var25];
                           var7[var25] = ~var26 <= -2049 ? -((4096 - var10[var25]) * (-var26 + 4096) >> 11) + 4096 : var10[var25] * var26 >> 11;
                           var8[var25] = var28 >= 2048 ? -((-var11[var25] + 4096) * (-var28 + 4096) >> 11) + 4096 : var11[var25] * var28 >> 11;
                           var9[var25] = var27 >= 2048 ? 4096 - ((-var12[var25] + 4096) * (-var27 + 4096) >> 11) : var12[var25] * var27 >> 11;
                           ++var25;
                           if (~class563.field8014 >= ~var25) {
                              if (!var3) {
                                 return var4;
                              }

                              var29 = 0;
                              if (var3 || class563.field8014 > var29) {
                                 do {
                                    var30 = var10[var29];
                                    var31 = var11[var29];
                                    var32 = var12[var29];
                                    var7[var29] = ~var30 != -4097 ? (var13[var29] << 12) / (-var30 + 4096) : 4096;
                                    var8[var29] = ~var31 == -4097 ? 4096 : (var14[var29] << 12) / (4096 - var31);
                                    var9[var29] = ~var32 == -4097 ? 4096 : (var15[var29] << 12) / (4096 - var32);
                                    ++var29;
                                 } while(class563.field8014 > var29);
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
                     var34 = var10[var33];
                     var35 = var12[var33];
                     var36 = var11[var33];
                     var7[var33] = ~var34 != -1 ? 4096 - (4096 - var13[var33] << 12) / var34 : 0;
                     var8[var33] = var36 != 0 ? 4096 - (-var14[var33] + 4096 << 12) / var36 : 0;
                     var9[var33] = ~var35 == -1 ? 0 : -((-var15[var33] + 4096 << 12) / var35) + 4096;
                     ++var33;
                  }

                  while(true) {
                     if (~class563.field8014 >= ~var33) {
                        if (!var3) {
                           return var4;
                        }

                        var37 = 0;
                        if (var3 || ~var37 > ~class563.field8014) {
                           do {
                              var38 = var12[var37];
                              var39 = var14[var37];
                              var40 = var13[var37];
                              var41 = var11[var37];
                              var42 = var15[var37];
                              var43 = var10[var37];
                              var7[var37] = ~var43 <= ~var40 ? var40 : var43;
                              var8[var37] = ~var39 >= ~var41 ? var39 : var41;
                              var9[var37] = ~var42 < ~var38 ? var38 : var42;
                              ++var37;
                           } while(~var37 > ~class563.field8014);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var34 = var10[var33];
                     var35 = var12[var33];
                     var36 = var11[var33];
                     var7[var33] = ~var34 != -1 ? 4096 - (4096 - var13[var33] << 12) / var34 : 0;
                     var8[var33] = var36 != 0 ? 4096 - (-var14[var33] + 4096 << 12) / var36 : 0;
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
                  var45 = var11[var44];
                  var46 = var12[var44];
                  var47 = var10[var44];
                  var48 = var14[var44];
                  var49 = var15[var44];
                  var50 = var13[var44];
                  var7[var44] = var50 < var47 ? var47 : var50;
                  var8[var44] = var45 <= var48 ? var48 : var45;
                  var9[var44] = var49 >= var46 ? var49 : var46;
                  ++var44;
               }

               while(true) {
                  if (~var44 <= ~class563.field8014) {
                     if (!var3) {
                        return var4;
                     }

                     var51 = 0;
                     if (var3 || ~class563.field8014 < ~var51) {
                        do {
                           var52 = var14[var51];
                           var53 = var13[var51];
                           var54 = var12[var51];
                           var55 = var15[var51];
                           var56 = var11[var51];
                           var57 = var10[var51];
                           var7[var51] = ~var57 < ~var53 ? -var53 + var57 : var53 - var57;
                           var8[var51] = ~var56 < ~var52 ? -var52 + var56 : -var56 + var52;
                           var9[var51] = ~var55 <= ~var54 ? var55 - var54 : -var55 + var54;
                           ++var51;
                        } while(~class563.field8014 < ~var51);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var45 = var11[var44];
                  var46 = var12[var44];
                  var47 = var10[var44];
                  var48 = var14[var44];
                  var49 = var15[var44];
                  var50 = var13[var44];
                  var7[var44] = var50 < var47 ? var47 : var50;
                  var8[var44] = var45 <= var48 ? var48 : var45;
                  var9[var44] = var49 >= var46 ? var49 : var46;
                  ++var44;
               }
            }

            int var58 = 0;
            if (var3 || var58 < class563.field8014) {
               do {
                  int var59 = var13[var58];
                  int var60 = var15[var58];
                  int var61 = var14[var58];
                  int var62 = var10[var58];
                  int var63 = var11[var58];
                  int var64 = var12[var58];
                  var7[var58] = var62 - ((var59 * var62 >> 11) + -var59);
                  var8[var58] = var61 + var63 + -(var61 * var63 >> 11);
                  var9[var58] = -(var60 * var64 >> 11) + var60 + var64;
                  ++var58;
               } while(var58 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var66) {
         throw class612.method4503(var66, field7790[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4096(int arg0, byte arg1) {
      try {
         label22: {
            ++field7787;
            if (class793.field11537 == 1) {
               class771.field11103 = arg0;
               if (!client.field10022) {
                  break label22;
               }
            }

            if (~class793.field11537 == -3) {
               class94.field1536 = arg0;
            }
         }

         if (arg1 <= -5) {
            ;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7790[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field7783;
         if (arg0 != 0) {
            this.field7786 = 97;
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
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
                              var5 = this.method4463(arg1, 13064, 0);
                              var6 = this.method4463(arg1, 13064, 1);
                              int var7 = this.field7786;
                              if (~var7 != -2) {
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
                                       while(class563.field8014 > var10) {
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
                                       var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
                                       ++var13;
                                    }

                                    while(true) {
                                       while(~class563.field8014 < ~var13) {
                                          var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
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

                                 if (~var7 == -8) {
                                    var16 = 0;
                                    if (var3 || ~var16 > ~class563.field8014) {
                                       do {
                                          var17 = var5[var16];
                                          var4[var16] = var17 != 4096 ? (var6[var16] << 12) / (-var17 + 4096) : 4096;
                                          ++var16;
                                       } while(~var16 > ~class563.field8014);
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
                                    if (var3 || ~var20 > ~class563.field8014) {
                                       do {
                                          var21 = var6[var20];
                                          var22 = var5[var20];
                                          var4[var20] = var22 < var21 ? var22 : var21;
                                          ++var20;
                                       } while(~var20 > ~class563.field8014);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label524;
                                 }

                                 if (var7 == 10) {
                                    break label524;
                                 }

                                 if (var7 == 11) {
                                    var26 = 0;
                                    if (var3 || ~var26 > ~class563.field8014) {
                                       do {
                                          var27 = var5[var26];
                                          var28 = var6[var26];
                                          var4[var26] = ~var28 > ~var27 ? -var28 + var27 : var28 - var27;
                                          ++var26;
                                       } while(~var26 > ~class563.field8014);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label523;
                                 }

                                 if (~var7 != -13) {
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
                                 while(~var8 > ~class563.field8014) {
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
                              while(class563.field8014 > var9) {
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
                                    while(class563.field8014 > var10) {
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
                           var4[var11] = var12 != 0 ? (var5[var11] << 12) / var12 : 4096;
                           ++var11;
                        }

                        label463:
                        while(true) {
                           if (~var11 <= ~class563.field8014) {
                              if (!var3) {
                                 return var4;
                              }

                              var13 = 0;
                              if (var3) {
                                 var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
                                 ++var13;
                              }

                              while(true) {
                                 while(~class563.field8014 < ~var13) {
                                    var4[var13] = -((4096 - var6[var13]) * (-var5[var13] + 4096) >> 12) + 4096;
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
                           var4[var11] = var12 != 0 ? (var5[var11] << 12) / var12 : 4096;
                           ++var11;
                        }
                     }

                     int var14 = 0;
                     int var15;
                     if (var3) {
                        var15 = var6[var14];
                        var4[var14] = ~var15 <= -2049 ? 4096 - ((4096 - var15) * (-var5[var14] + 4096) >> 11) : var5[var14] * var15 >> 11;
                        ++var14;
                     }

                     while(true) {
                        if (var14 >= class563.field8014) {
                           if (!var3) {
                              return var4;
                           }

                           var16 = 0;
                           if (var3 || ~var16 > ~class563.field8014) {
                              do {
                                 var17 = var5[var16];
                                 var4[var16] = var17 != 4096 ? (var6[var16] << 12) / (-var17 + 4096) : 4096;
                                 ++var16;
                              } while(~var16 > ~class563.field8014);
                           }

                           if (!var3) {
                              return var4;
                           }
                           break;
                        }

                        var15 = var6[var14];
                        var4[var14] = ~var15 <= -2049 ? 4096 - ((4096 - var15) * (-var5[var14] + 4096) >> 11) : var5[var14] * var15 >> 11;
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
                     if (~class563.field8014 >= ~var18) {
                        if (!var3) {
                           return var4;
                        }

                        var20 = 0;
                        if (var3 || ~var20 > ~class563.field8014) {
                           do {
                              var21 = var6[var20];
                              var22 = var5[var20];
                              var4[var20] = var22 < var21 ? var22 : var21;
                              ++var20;
                           } while(~var20 > ~class563.field8014);
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
                  var24 = var5[var23];
                  var25 = var6[var23];
                  var4[var23] = ~var24 >= ~var25 ? var25 : var24;
                  ++var23;
               }

               while(true) {
                  if (var23 >= class563.field8014) {
                     if (!var3) {
                        return var4;
                     }

                     var26 = 0;
                     if (var3 || ~var26 > ~class563.field8014) {
                        do {
                           var27 = var5[var26];
                           var28 = var6[var26];
                           var4[var26] = ~var28 > ~var27 ? -var28 + var27 : var28 - var27;
                           ++var26;
                        } while(~var26 > ~class563.field8014);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var24 = var5[var23];
                  var25 = var6[var23];
                  var4[var23] = ~var24 >= ~var25 ? var25 : var24;
                  ++var23;
               }
            }

            int var29 = 0;
            if (var3 || class563.field8014 > var29) {
               do {
                  int var30 = var6[var29];
                  int var31 = var5[var29];
                  var4[var29] = var30 + var31 + -(var30 * var31 >> 11);
                  ++var29;
               } while(class563.field8014 > var29);
            }
         }

         return var4;
      } catch (RuntimeException var33) {
         throw class612.method4503(var33, field7790[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method4097(int arg0) {
      try {
         if (arg0 == 7) {
            ++field7788;
            if (class104.method1019(class394.field5712, (byte)80)) {
               if (class745.field10604.field3713 != null) {
                  class755.method5457(7, false);
               } else {
                  class755.method5457(5, false);
               }
            } else {
               if (~class394.field5712 != -6 && ~class394.field5712 != -7) {
                  if (~class394.field5712 == -14) {
                     class755.method5457(3, false);
                     return;
                  }
               } else {
                  class755.method5457(3, false);
               }

            }
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7790[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field7785;
         if (arg2 > -6) {
            this.method5(-75, 4);
         }

         if (~arg1 != -1) {
            if (~arg1 != -2) {
               return;
            }

            if (!client.field10022) {
               super.field8641 = ~arg0.method665(false) == -2;
               return;
            }
         }

         this.field7786 = arg0.method665(false);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7790[5] + (arg0 != null ? field7790[4] : field7790[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public static final void method4098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         label71: {
            if (~arg9 > ~class729.field10384 || ~class604.field8618 > ~arg9 || class729.field10384 > arg6 || arg6 > class604.field8618 || arg0 < class729.field10384 || ~arg0 < ~class604.field8618 || arg8 < class729.field10384 || ~class604.field8618 > ~arg8 || class587.field8239 > arg1 || ~class767.field11011 > ~arg1 || ~class587.field8239 < ~arg7 || arg7 > class767.field11011 || ~arg2 > ~class587.field8239 || ~arg2 < ~class767.field11011 || arg4 < class587.field8239 || class767.field11011 < arg4) {
               class650.method4738(arg2, arg5, arg4, arg0, arg1, arg8, arg6, arg3 + -16885, arg9, arg7);
               if (!client.field10022) {
                  break label71;
               }
            }

            class395.method3072(arg9, arg0, false, arg1, arg8, arg7, arg6, arg2, arg4, arg5);
         }

         if (arg3 != 0) {
            method4098(-80, -122, -56, 45, -43, -119, 111, -101, -35, 7);
         }

         ++field7784;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7790[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "<init>",
      descriptor = "()V"
   )
   public class547() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4099(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4100(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
