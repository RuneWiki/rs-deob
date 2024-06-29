import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class248 extends class213 {
   @OriginalMember(
      owner = "client!ida",
      name = "G",
      descriptor = "I"
   )
   private int field3113 = 6;
   @OriginalMember(
      owner = "client!ida",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3116 = new String[]{method1869(method1868("M\u001dy7T\f")), method1869(method1868("M\u001dy7_\f")), method1869(method1868("M\u001dy7\\\f")), method1869(method1868("M\u001dy7]\f")), method1869(method1868("J\ftu")), method1869(method1868("M\u001dy7Y\f")), method1869(method1868("_W67c"))};
   @OriginalMember(
      owner = "client!ida",
      name = "J",
      descriptor = "Lgka;"
   )
   public static class394 field3111 = new class394("", 14);
   @OriginalMember(
      owner = "client!ida",
      name = "H",
      descriptor = "I"
   )
   public static int field3110;
   @OriginalMember(
      owner = "client!ida",
      name = "D",
      descriptor = "I"
   )
   public static int field3112;
   @OriginalMember(
      owner = "client!ida",
      name = "I",
      descriptor = "I"
   )
   public static int field3114;
   @OriginalMember(
      owner = "client!ida",
      name = "F",
      descriptor = "I"
   )
   public static int field3115;

   @OriginalMember(
      owner = "client!ida",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1866(int arg0) {
      try {
         if (arg0 != -1854) {
            field3111 = null;
         }

         field3111 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3116[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "<init>",
      descriptor = "()V"
   )
   public class248() {
      super(2, false);
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 < 26) {
            this.method212(-22, (byte)-1);
         }

         ++field3112;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719) {
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
                              int[][] var5 = this.method1615(true, arg0, 0);
                              int[][] var6 = this.method1615(true, arg0, 1);
                              var7 = var4[0];
                              var8 = var4[1];
                              var9 = var4[2];
                              var10 = var5[0];
                              var11 = var5[1];
                              var12 = var5[2];
                              var13 = var6[0];
                              var14 = var6[1];
                              var15 = var6[2];
                              int var16 = this.field3113;
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
                                       while(~class576.field7916 < ~var19) {
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
                                       var7[var24] = 4096 - ((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12);
                                       var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                       var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                       ++var24;
                                    }

                                    while(true) {
                                       while(var24 < class576.field7916) {
                                          var7[var24] = 4096 - ((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12);
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
                                    if (var3 || ~class576.field7916 < ~var29) {
                                       do {
                                          var30 = var10[var29];
                                          var31 = var12[var29];
                                          var32 = var11[var29];
                                          var7[var29] = var30 == 4096 ? 4096 : (var13[var29] << 12) / (-var30 + 4096);
                                          var8[var29] = var32 != 4096 ? (var14[var29] << 12) / (-var32 + 4096) : 4096;
                                          var9[var29] = ~var31 == -4097 ? 4096 : (var15[var29] << 12) / (-var31 + 4096);
                                          ++var29;
                                       } while(~class576.field7916 < ~var29);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label730;
                                 }

                                 if (var16 == 8) {
                                    break label730;
                                 }

                                 if (~var16 == -10) {
                                    var37 = 0;
                                    if (var3 || class576.field7916 > var37) {
                                       do {
                                          var38 = var12[var37];
                                          var39 = var14[var37];
                                          var40 = var15[var37];
                                          var41 = var10[var37];
                                          var42 = var13[var37];
                                          var43 = var11[var37];
                                          var7[var37] = var41 >= var42 ? var42 : var41;
                                          var8[var37] = ~var43 > ~var39 ? var43 : var39;
                                          var9[var37] = ~var38 <= ~var40 ? var40 : var38;
                                          ++var37;
                                       } while(class576.field7916 > var37);
                                    }

                                    if (!var3) {
                                       return var4;
                                    }
                                    break label729;
                                 }

                                 if (var16 == 10) {
                                    break label729;
                                 }

                                 if (var16 == 11) {
                                    var51 = 0;
                                    if (var3 || ~var51 > ~class576.field7916) {
                                       do {
                                          var52 = var13[var51];
                                          var53 = var11[var51];
                                          var54 = var12[var51];
                                          var55 = var14[var51];
                                          var56 = var15[var51];
                                          var57 = var10[var51];
                                          var7[var51] = ~var52 <= ~var57 ? -var57 + var52 : -var52 + var57;
                                          var8[var51] = var53 > var55 ? -var55 + var53 : -var53 + var55;
                                          var9[var51] = var56 < var54 ? -var56 + var54 : -var54 + var56;
                                          ++var51;
                                       } while(~var51 > ~class576.field7916);
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
                                 while(~var17 > ~class576.field7916) {
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
                              while(~class576.field7916 < ~var18) {
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
                                    while(~class576.field7916 < ~var19) {
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
                           var7[var20] = ~var22 == -1 ? 4096 : (var10[var20] << 12) / var22;
                           var8[var20] = var23 == 0 ? 4096 : (var11[var20] << 12) / var23;
                           var9[var20] = ~var21 == -1 ? 4096 : (var12[var20] << 12) / var21;
                           ++var20;
                        }

                        label597:
                        while(true) {
                           if (var20 >= class576.field7916) {
                              if (!var3) {
                                 return var4;
                              }

                              var24 = 0;
                              if (var3) {
                                 var7[var24] = 4096 - ((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12);
                                 var8[var24] = 4096 - ((-var11[var24] + 4096) * (-var14[var24] + 4096) >> 12);
                                 var9[var24] = -((-var12[var24] + 4096) * (-var15[var24] + 4096) >> 12) + 4096;
                                 ++var24;
                              }

                              while(true) {
                                 while(var24 < class576.field7916) {
                                    var7[var24] = 4096 - ((-var10[var24] + 4096) * (-var13[var24] + 4096) >> 12);
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

                           var21 = var15[var20];
                           var22 = var13[var20];
                           var23 = var14[var20];
                           var7[var20] = ~var22 == -1 ? 4096 : (var10[var20] << 12) / var22;
                           var8[var20] = var23 == 0 ? 4096 : (var11[var20] << 12) / var23;
                           var9[var20] = ~var21 == -1 ? 4096 : (var12[var20] << 12) / var21;
                           ++var20;
                        }
                     }

                     int var25 = 0;
                     if (!var3 && var25 >= class576.field7916) {
                        if (!var3) {
                           return var4;
                        }

                        var29 = 0;
                        if (var3 || ~class576.field7916 < ~var29) {
                           do {
                              var30 = var10[var29];
                              var31 = var12[var29];
                              var32 = var11[var29];
                              var7[var29] = var30 == 4096 ? 4096 : (var13[var29] << 12) / (-var30 + 4096);
                              var8[var29] = var32 != 4096 ? (var14[var29] << 12) / (-var32 + 4096) : 4096;
                              var9[var29] = ~var31 == -4097 ? 4096 : (var15[var29] << 12) / (-var31 + 4096);
                              ++var29;
                           } while(~class576.field7916 < ~var29);
                        }

                        if (!var3) {
                           return var4;
                        }
                     } else {
                        while(true) {
                           int var26 = var15[var25];
                           int var27 = var13[var25];
                           int var28 = var14[var25];
                           var7[var25] = var27 >= 2048 ? -((-var10[var25] + 4096) * (-var27 + 4096) >> 11) + 4096 : var10[var25] * var27 >> 11;
                           var8[var25] = ~var28 > -2049 ? var11[var25] * var28 >> 11 : -((4096 - var11[var25]) * (-var28 + 4096) >> 11) + 4096;
                           var9[var25] = var26 >= 2048 ? -((-var12[var25] + 4096) * (-var26 + 4096) >> 11) + 4096 : var12[var25] * var26 >> 11;
                           ++var25;
                           if (var25 >= class576.field7916) {
                              if (!var3) {
                                 return var4;
                              }

                              var29 = 0;
                              if (var3 || ~class576.field7916 < ~var29) {
                                 do {
                                    var30 = var10[var29];
                                    var31 = var12[var29];
                                    var32 = var11[var29];
                                    var7[var29] = var30 == 4096 ? 4096 : (var13[var29] << 12) / (-var30 + 4096);
                                    var8[var29] = var32 != 4096 ? (var14[var29] << 12) / (-var32 + 4096) : 4096;
                                    var9[var29] = ~var31 == -4097 ? 4096 : (var15[var29] << 12) / (-var31 + 4096);
                                    ++var29;
                                 } while(~class576.field7916 < ~var29);
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
                     var8[var33] = var36 == 0 ? 0 : 4096 - (-var14[var33] + 4096 << 12) / var36;
                     var9[var33] = ~var34 == -1 ? 0 : -((-var15[var33] + 4096 << 12) / var34) + 4096;
                     ++var33;
                  }

                  while(true) {
                     if (var33 >= class576.field7916) {
                        if (!var3) {
                           return var4;
                        }

                        var37 = 0;
                        if (var3 || class576.field7916 > var37) {
                           do {
                              var38 = var12[var37];
                              var39 = var14[var37];
                              var40 = var15[var37];
                              var41 = var10[var37];
                              var42 = var13[var37];
                              var43 = var11[var37];
                              var7[var37] = var41 >= var42 ? var42 : var41;
                              var8[var37] = ~var43 > ~var39 ? var43 : var39;
                              var9[var37] = ~var38 <= ~var40 ? var40 : var38;
                              ++var37;
                           } while(class576.field7916 > var37);
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
                     var8[var33] = var36 == 0 ? 0 : 4096 - (-var14[var33] + 4096 << 12) / var36;
                     var9[var33] = ~var34 == -1 ? 0 : -((-var15[var33] + 4096 << 12) / var34) + 4096;
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
                  var45 = var13[var44];
                  var46 = var14[var44];
                  var47 = var12[var44];
                  var48 = var10[var44];
                  var49 = var11[var44];
                  var50 = var15[var44];
                  var7[var44] = var45 >= var48 ? var45 : var48;
                  var8[var44] = ~var46 > ~var49 ? var49 : var46;
                  var9[var44] = ~var50 > ~var47 ? var47 : var50;
                  ++var44;
               }

               while(true) {
                  if (var44 >= class576.field7916) {
                     if (!var3) {
                        return var4;
                     }

                     var51 = 0;
                     if (var3 || ~var51 > ~class576.field7916) {
                        do {
                           var52 = var13[var51];
                           var53 = var11[var51];
                           var54 = var12[var51];
                           var55 = var14[var51];
                           var56 = var15[var51];
                           var57 = var10[var51];
                           var7[var51] = ~var52 <= ~var57 ? -var57 + var52 : -var52 + var57;
                           var8[var51] = var53 > var55 ? -var55 + var53 : -var53 + var55;
                           var9[var51] = var56 < var54 ? -var56 + var54 : -var54 + var56;
                           ++var51;
                        } while(~var51 > ~class576.field7916);
                     }

                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  var45 = var13[var44];
                  var46 = var14[var44];
                  var47 = var12[var44];
                  var48 = var10[var44];
                  var49 = var11[var44];
                  var50 = var15[var44];
                  var7[var44] = var45 >= var48 ? var45 : var48;
                  var8[var44] = ~var46 > ~var49 ? var49 : var46;
                  var9[var44] = ~var50 > ~var47 ? var47 : var50;
                  ++var44;
               }
            }

            int var58 = 0;
            if (var3 || ~var58 > ~class576.field7916) {
               do {
                  int var59 = var15[var58];
                  int var60 = var12[var58];
                  int var61 = var14[var58];
                  int var62 = var11[var58];
                  int var63 = var10[var58];
                  int var64 = var13[var58];
                  var7[var58] = var63 + var64 + -(var63 * var64 >> 11);
                  var8[var58] = var61 + var62 - (var61 * var62 >> 11);
                  var9[var58] = var60 - -var59 + -(var59 * var60 >> 11);
                  ++var58;
               } while(~var58 > ~class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var66) {
         throw class534.method3846(var66, field3116[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "g",
      descriptor = "(I)Luaa;"
   )
   public static final class126 method1867(int arg0) {
      try {
         ++field3110;
         return arg0 <= 57 ? null : class618.field8615;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3116[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field3115;
         int var4 = 108 % ((68 - arg1) / 48);
         if (~arg2 != -1) {
            if (arg2 != 1) {
               return;
            }

            if (!client.field4273) {
               super.field2645 = arg0.method4288((byte)115) == 1;
               return;
            }
         }

         this.field3113 = arg0.method4288((byte)68);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3116[5] + (arg0 != null ? field3116[6] : field3116[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field3114;
         if (arg1 != 2064866508) {
            method1866(92);
         }

         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
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
                              var5 = this.method1619((byte)99, arg0, 0);
                              var6 = this.method1619((byte)69, arg0, 1);
                              int var7 = this.field3113;
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
                                       while(~var10 > ~class576.field7916) {
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

                                 if (var7 == 4) {
                                    break label527;
                                 }

                                 if (var7 == 5) {
                                    var13 = 0;
                                    if (var3) {
                                       var4[var13] = -((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12) + 4096;
                                       ++var13;
                                    }

                                    while(true) {
                                       while(var13 < class576.field7916) {
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

                                 if (~var7 == -8) {
                                    var16 = 0;
                                    if (var3 || ~class576.field7916 < ~var16) {
                                       do {
                                          var17 = var5[var16];
                                          var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                          ++var16;
                                       } while(~class576.field7916 < ~var16);
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
                                    if (var3 || ~class576.field7916 < ~var20) {
                                       do {
                                          var21 = var6[var20];
                                          var22 = var5[var20];
                                          var4[var20] = ~var22 > ~var21 ? var22 : var21;
                                          ++var20;
                                       } while(~class576.field7916 < ~var20);
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
                                    if (var3 || ~class576.field7916 < ~var26) {
                                       do {
                                          var27 = var5[var26];
                                          var28 = var6[var26];
                                          var4[var26] = ~var27 < ~var28 ? -var28 + var27 : var28 - var27;
                                          ++var26;
                                       } while(~class576.field7916 < ~var26);
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
                                 var4[var8] = var5[var8] - -var6[var8];
                                 ++var8;
                              }

                              while(true) {
                                 while(~var8 > ~class576.field7916) {
                                    var4[var8] = var5[var8] - -var6[var8];
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
                              while(class576.field7916 > var9) {
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
                                    while(~var10 > ~class576.field7916) {
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
                           if (~class576.field7916 >= ~var11) {
                              if (!var3) {
                                 return var4;
                              }

                              var13 = 0;
                              if (var3) {
                                 var4[var13] = -((-var5[var13] + 4096) * (-var6[var13] + 4096) >> 12) + 4096;
                                 ++var13;
                              }

                              while(true) {
                                 while(var13 < class576.field7916) {
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
                           var4[var11] = var12 != 0 ? (var5[var11] << 12) / var12 : 4096;
                           ++var11;
                        }
                     }

                     int var14 = 0;
                     int var15;
                     if (var3) {
                        var15 = var6[var14];
                        var4[var14] = ~var15 > -2049 ? var5[var14] * var15 >> 11 : -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096;
                        ++var14;
                     }

                     while(true) {
                        if (var14 >= class576.field7916) {
                           if (!var3) {
                              return var4;
                           }

                           var16 = 0;
                           if (var3 || ~class576.field7916 < ~var16) {
                              do {
                                 var17 = var5[var16];
                                 var4[var16] = var17 == 4096 ? 4096 : (var6[var16] << 12) / (-var17 + 4096);
                                 ++var16;
                              } while(~class576.field7916 < ~var16);
                           }

                           if (!var3) {
                              return var4;
                           }
                           break;
                        }

                        var15 = var6[var14];
                        var4[var14] = ~var15 > -2049 ? var5[var14] * var15 >> 11 : -((-var5[var14] + 4096) * (-var15 + 4096) >> 11) + 4096;
                        ++var14;
                     }
                  }

                  int var18 = 0;
                  int var19;
                  if (var3) {
                     var19 = var5[var18];
                     var4[var18] = var19 != 0 ? -((-var6[var18] + 4096 << 12) / var19) + 4096 : 0;
                     ++var18;
                  }

                  while(true) {
                     if (~class576.field7916 >= ~var18) {
                        if (!var3) {
                           return var4;
                        }

                        var20 = 0;
                        if (var3 || ~class576.field7916 < ~var20) {
                           do {
                              var21 = var6[var20];
                              var22 = var5[var20];
                              var4[var20] = ~var22 > ~var21 ? var22 : var21;
                              ++var20;
                           } while(~class576.field7916 < ~var20);
                        }

                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     var19 = var5[var18];
                     var4[var18] = var19 != 0 ? -((-var6[var18] + 4096 << 12) / var19) + 4096 : 0;
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
                  if (~class576.field7916 >= ~var23) {
                     if (!var3) {
                        return var4;
                     }

                     var26 = 0;
                     if (var3 || ~class576.field7916 < ~var26) {
                        do {
                           var27 = var5[var26];
                           var28 = var6[var26];
                           var4[var26] = ~var27 < ~var28 ? -var28 + var27 : var28 - var27;
                           ++var26;
                        } while(~class576.field7916 < ~var26);
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
            if (var3 || class576.field7916 > var29) {
               do {
                  int var30 = var6[var29];
                  int var31 = var5[var29];
                  var4[var29] = var31 - -var30 + -(var30 * var31 >> 11);
                  ++var29;
               } while(class576.field7916 > var29);
            }
         }

         return var4;
      } catch (RuntimeException var33) {
         throw class534.method3846(var33, field3116[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1868(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1869(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
