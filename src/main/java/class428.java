import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class428 {
   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5823 = new String[]{method3316(method3315("Jle\u0003Q\t")), method3316(method3315("Jle\u0003R\t")), method3316(method3315("Jle\u0003S\t"))};
   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "I"
   )
   public static int field5822 = -1;
   @OriginalMember(
      owner = "client!kfa",
      name = "g",
      descriptor = "Lae;"
   )
   public static class285 field5820 = new class285(method3316(method3315("vCT")), 2);
   @OriginalMember(
      owner = "client!kfa",
      name = "h",
      descriptor = "F"
   )
   public static float field5817;
   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "I"
   )
   public static int field5819;
   @OriginalMember(
      owner = "client!kfa",
      name = "d",
      descriptor = "I"
   )
   public static int field5821;
   @OriginalMember(
      owner = "client!kfa",
      name = "f",
      descriptor = "Lww;"
   )
   public static class339 field5815;
   @OriginalMember(
      owner = "client!kfa",
      name = "e",
      descriptor = "Lkia;"
   )
   public static class93 field5818;
   @OriginalMember(
      owner = "client!kfa",
      name = "c",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field5816;

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method3312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         ++field5821;
         int var9 = 0;
         int var10 = arg0;
         int var11 = 0;
         int var12 = -arg3 + arg6;
         int var13 = arg0 - arg3;
         int var14 = arg6 * arg6;
         int var15 = arg0 * arg0;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg0 << 1;
         int var23 = var13 << 1;
         int var24 = (-var22 + 1) * var14 + var18;
         int var25 = var15 - (var22 + -1) * var19;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = -((var23 + -1) * var21) + var17;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = arg2 * var20;
         int var35 = (var23 - 3) * var21;
         int var36 = var29;
         int var37 = (arg0 + -1) * var28;
         int var38 = var31;
         int var39 = (var13 + -1) * var30;
         boolean var10000;
         if (class577.field8561 <= arg1) {
            if (~class586.field8647 <= ~arg1) {
               int[] var40 = class237.field3001[arg1];
               int var41 = class180.method1522(arg2 ^ 25492, class415.field5689, class282.field3921, -arg6 + arg4);
               int var42 = class180.method1522(arg2 ^ 25492, class415.field5689, class282.field3921, arg4 + arg6);
               int var43 = class180.method1522(arg2 + 25492, class415.field5689, class282.field3921, -var12 + arg4);
               int var44 = class180.method1522(25495, class415.field5689, class282.field3921, arg4 + var12);
               class385.method3045(arg7, var43, var40, var41, (byte)-115);
               class385.method3045(arg5, var44, var40, var43, (byte)-59);
               class385.method3045(arg7, var42, var40, var44, (byte)-85);
               if (var8) {
                  var10000 = ~arg0 >= ~var13;
               } else {
                  if (arg0 <= 0) {
                     return;
                  }

                  var10000 = ~arg0 >= ~var13;
               }
            } else {
               if (arg0 <= 0) {
                  return;
               }

               var10000 = ~arg0 >= ~var13;
            }
         } else {
            if (arg0 <= 0) {
               return;
            }

            var10000 = ~arg0 >= ~var13;
         }

         while(true) {
            while(true) {
               boolean var45 = var10000;
               if (var45) {
                  label245: {
                     if (~var26 > -1) {
                        if (var8) {
                           var27 += var38;
                           var26 += var34;
                           var38 += var31;
                           ++var11;
                           var34 += var31;
                        }
                     } else {
                        if (!var8) {
                           if (var27 < 0) {
                              var27 += var38;
                              var26 += var34;
                              var38 += var31;
                              ++var11;
                              var34 += var31;
                           }

                           var27 += -var35;
                           var26 += -var39;
                           var35 -= var30;
                           var39 -= var30;
                           break label245;
                        }

                        var34 = var27;
                     }

                     while(true) {
                        while(~var26 > -1) {
                           var27 += var38;
                           var26 += var34;
                           var38 += var31;
                           ++var11;
                           var34 += var31;
                        }

                        if (!var8) {
                           if (var27 < 0) {
                              var27 += var38;
                              var26 += var34;
                              var38 += var31;
                              ++var11;
                              var34 += var31;
                           }

                           var27 += -var35;
                           var26 += -var39;
                           var35 -= var30;
                           var39 -= var30;
                           break;
                        }

                        var34 = var27;
                     }
                  }
               }

               int var56;
               label213: {
                  if (~var24 > -1) {
                     if (var8) {
                        var24 += var32;
                        var25 += var36;
                        var36 += var29;
                        var32 += var29;
                        ++var9;
                     }
                  } else {
                     var56 = var25;
                     if (!var8) {
                        break label213;
                     }

                     var32 = var25;
                     ++var9;
                  }

                  while(true) {
                     while(var24 < 0) {
                        var24 += var32;
                        var25 += var36;
                        var36 += var29;
                        var32 += var29;
                        ++var9;
                     }

                     var56 = var25;
                     if (!var8) {
                        break;
                     }

                     var32 = var25;
                     ++var9;
                  }
               }

               if (var56 < 0) {
                  var24 += var32;
                  var25 += var36;
                  ++var9;
                  var36 += var29;
                  var32 += var29;
               }

               var24 += -var37;
               var25 += -var33;
               var37 -= var28;
               var33 -= var28;
               --var10;
               int var46 = -var10 + arg1;
               int var47 = arg1 + var10;
               if (var47 >= class577.field8561) {
                  var56 = ~class586.field8647;
                  int var10001 = ~var46;
                  if (var8) {
                     var10000 = var56 >= var10001;
                     continue;
                  }

                  if (var56 <= var10001) {
                     int var48 = class180.method1522(arg2 + 25492, class415.field5689, class282.field3921, arg4 + var9);
                     int var49 = class180.method1522(25495, class415.field5689, class282.field3921, arg4 - var9);
                     if (var45) {
                        int var50 = class180.method1522(arg2 ^ 25492, class415.field5689, class282.field3921, arg4 + var11);
                        int var51 = class180.method1522(arg2 ^ 25492, class415.field5689, class282.field3921, -var11 + arg4);
                        if (~var46 <= ~class577.field8561) {
                           int[] var52 = class237.field3001[var46];
                           class385.method3045(arg7, var51, var52, var49, (byte)-86);
                           class385.method3045(arg5, var50, var52, var51, (byte)-119);
                           class385.method3045(arg7, var48, var52, var50, (byte)-81);
                        }

                        if (~class586.field8647 <= ~var47) {
                           int[] var53 = class237.field3001[var47];
                           class385.method3045(arg7, var51, var53, var49, (byte)-116);
                           class385.method3045(arg5, var50, var53, var51, (byte)-89);
                           class385.method3045(arg7, var48, var53, var50, (byte)-69);
                           if (var8) {
                              if (~var46 <= ~class577.field8561) {
                                 class385.method3045(arg7, var48, class237.field3001[var46], var49, (byte)-86);
                              }

                              if (class586.field8647 >= var47) {
                                 class385.method3045(arg7, var48, class237.field3001[var47], var49, (byte)-118);
                              }
                           }
                        }
                     } else {
                        if (~var46 <= ~class577.field8561) {
                           class385.method3045(arg7, var48, class237.field3001[var46], var49, (byte)-86);
                        }

                        if (class586.field8647 >= var47) {
                           class385.method3045(arg7, var48, class237.field3001[var47], var49, (byte)-118);
                        }
                     }
                  }
               }

               if (var10 <= 0) {
                  return;
               }

               var10000 = ~var10 >= ~var13;
            }
         }
      } catch (RuntimeException var55) {
         throw class93.method866(var55, field5823[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(IIIIIIIIII)Z"
   )
   public static final boolean method3313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field1481;

      try {
         ++field5819;
         if (~arg7 >= -2001 && ~arg8 >= -2001 && ~arg9 >= -2001 && ~arg3 >= -2001 && ~arg6 >= -2001 && ~arg1 >= -2001) {
            if (arg7 >= -2000 && ~arg8 <= 1999 && arg9 >= -2000 && ~arg3 <= 1999 && arg6 >= -2000 && arg1 >= -2000) {
               if (class535.field7836 == 2) {
                  int var11 = class277.field3541 * arg7 + arg3;
                  if (var11 >= 0 && ~var11 > ~class566.field8330.length && ~((arg0 << 8) + -38400) > ~class566.field8330[var11]) {
                     return false;
                  }

                  int var12 = class277.field3541 * arg8 + arg6;
                  if (var12 >= 0 && ~var12 > ~class566.field8330.length && ~((arg2 << 8) + -38400) > ~class566.field8330[var12]) {
                     return false;
                  }

                  int var13 = arg1 - -(class277.field3541 * arg9);
                  if (~var13 <= -1 && var13 < class566.field8330.length && class566.field8330[var13] > (arg4 << 8) + -38400) {
                     return false;
                  }
               }

               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               label1115: {
                  var14 = -arg3 + arg6;
                  var15 = -arg7 + arg8;
                  var16 = arg1 - arg3;
                  var17 = -arg7 + arg9;
                  var18 = -arg0 + arg2;
                  var19 = -arg0 + arg4;
                  if (~arg7 > ~arg8 && ~arg9 < ~arg9) {
                     --arg7;
                     if (~arg8 >= ~arg9) {
                        ++arg9;
                        if (!var10) {
                           break label1115;
                        }
                     }

                     ++arg8;
                     if (!var10) {
                        break label1115;
                     }
                  }

                  if (~arg8 > ~arg9) {
                     label1083: {
                        if (arg7 > arg9) {
                           ++arg7;
                           if (!var10) {
                              break label1083;
                           }
                        }

                        ++arg9;
                     }

                     --arg8;
                     if (!var10) {
                        break label1115;
                     }
                  }

                  --arg9;
                  if (~arg8 > ~arg7) {
                     ++arg7;
                     if (!var10) {
                        break label1115;
                     }
                  }

                  ++arg8;
               }

               int var20 = 0;
               if (arg7 != arg8) {
                  var20 = (arg6 - arg3 << 12) / (-arg7 + arg8);
               }

               int var21 = 0;
               if (arg8 != arg9) {
                  var21 = (arg1 - arg6 << 12) / (-arg8 + arg9);
               }

               int var22 = 0;
               if (arg5 < 92) {
                  return true;
               } else {
                  if (~arg7 != ~arg9) {
                     var22 = (-arg1 + arg3 << 12) / (-arg9 + arg7);
                  }

                  int var23 = var14 * var17 - var15 * var16;
                  if (var23 == 0) {
                     return false;
                  } else {
                     int var24 = (var17 * var18 + -(var15 * var19) << 8) / var23;
                     int var25 = (var14 * var19 + -(var16 * var18) << 8) / var23;
                     boolean var10000;
                     if (arg8 >= arg7 && arg9 >= arg7) {
                        if (arg7 >= class362.field5024) {
                           return true;
                        } else {
                           if (~arg8 < ~class362.field5024) {
                              arg8 = class362.field5024;
                           }

                           if (~arg9 < ~class362.field5024) {
                              arg9 = class362.field5024;
                           }

                           arg0 = (arg0 << 8) + -(arg3 * var24) + var24;
                           if (~arg9 >= ~arg8) {
                              arg6 = arg3 <<= 12;
                              arg1 <<= 12;
                              if (~arg7 > -1) {
                                 arg0 -= arg7 * var25;
                                 arg3 -= arg7 * var20;
                                 arg6 -= arg7 * var22;
                                 arg7 = 0;
                              }

                              if (~arg9 > -1) {
                                 arg1 -= arg9 * var21;
                                 arg9 = 0;
                              }

                              if (arg7 != arg9 && var20 > var22 || ~arg7 == ~arg9 && ~var20 > ~var21) {
                                 arg8 -= arg9;
                                 arg9 -= arg7;
                                 arg7 = class277.field3541 * arg7;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) - -1, arg7, arg0, (arg6 >> 12) + -1)) {
                                       return false;
                                    }

                                    arg7 += class277.field3541;
                                    arg3 += var20;
                                    arg6 += var22;
                                    arg0 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (~arg9 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg7, arg0, (arg1 >> 12) + -1)) {
                                                   return false;
                                                }

                                                arg7 += class277.field3541;
                                                arg0 += var25;
                                                arg3 += var20;
                                                arg1 += var21;
                                             }

                                             while(true) {
                                                --arg8;
                                                if (~arg8 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg7, arg0, (arg1 >> 12) + -1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg7 += class277.field3541;
                                                arg0 += var25;
                                                arg3 += var20;
                                                arg1 += var21;
                                             }
                                          }

                                          arg0 += var25;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) - -1, arg7, arg0, (arg6 >> 12) + -1)) {
                                             return false;
                                          }

                                          arg7 += class277.field3541;
                                          arg3 += var20;
                                          arg6 += var22;
                                          arg0 += var25;
                                       }
                                    }
                                 }
                              } else {
                                 arg8 -= arg9;
                                 arg9 -= arg7;
                                 arg7 = class277.field3541 * arg7;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg7, arg0, (arg3 >> 12) + -1)) {
                                       return false;
                                    }

                                    arg6 += var22;
                                    arg7 += class277.field3541;
                                    arg0 += var25;
                                    arg3 += var20;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (~arg9 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg7, arg0, (arg3 >> 12) - 1)) {
                                                   return false;
                                                }

                                                arg7 += class277.field3541;
                                                arg1 += var21;
                                                arg3 += var20;
                                                arg0 += var25;
                                             }

                                             while(true) {
                                                --arg8;
                                                if (~arg8 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg7, arg0, (arg3 >> 12) - 1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg7 += class277.field3541;
                                                arg1 += var21;
                                                arg3 += var20;
                                                arg0 += var25;
                                             }
                                          }

                                          arg3 += var20;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg7, arg0, (arg3 >> 12) + -1)) {
                                             return false;
                                          }

                                          arg6 += var22;
                                          arg7 += class277.field3541;
                                          arg0 += var25;
                                          arg3 += var20;
                                       }
                                    }
                                 }
                              }
                           } else {
                              arg1 = arg3 <<= 12;
                              if (~arg7 > -1) {
                                 arg1 -= arg7 * var22;
                                 arg3 -= arg7 * var20;
                                 arg0 -= arg7 * var25;
                                 arg7 = 0;
                              }

                              arg6 <<= 12;
                              if (arg8 < 0) {
                                 arg6 -= arg8 * var21;
                                 arg8 = 0;
                              }

                              if ((~arg7 == ~arg8 || ~var22 <= ~var20) && (~arg7 != ~arg8 || var21 >= var22)) {
                                 arg9 -= arg8;
                                 arg8 -= arg7;
                                 arg7 = class277.field3541 * arg7;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg7, arg0, (arg3 >> 12) + -1)) {
                                       return false;
                                    }

                                    arg1 += var22;
                                    arg3 += var20;
                                    arg0 += var25;
                                    arg7 += class277.field3541;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg8;
                                       if (~arg8 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg7, arg0, (arg6 >> 12) + -1)) {
                                                   return false;
                                                }

                                                arg0 += var25;
                                                arg1 += var22;
                                                arg6 += var21;
                                                arg7 += class277.field3541;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg7, arg0, (arg6 >> 12) + -1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg0 += var25;
                                                arg1 += var22;
                                                arg6 += var21;
                                                arg7 += class277.field3541;
                                             }
                                          }

                                          arg7 += class277.field3541;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg7, arg0, (arg3 >> 12) + -1)) {
                                             return false;
                                          }

                                          arg1 += var22;
                                          arg3 += var20;
                                          arg0 += var25;
                                          arg7 += class277.field3541;
                                       }
                                    }
                                 }
                              } else {
                                 arg9 -= arg8;
                                 arg8 -= arg7;
                                 arg7 = class277.field3541 * arg7;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg7, arg0, (arg1 >> 12) - 1)) {
                                       return false;
                                    }

                                    arg1 += var22;
                                    arg7 += class277.field3541;
                                    arg3 += var20;
                                    arg0 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg8;
                                       if (arg8 < 0) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg7, arg0, (arg1 >> 12) + -1)) {
                                                   return false;
                                                }

                                                arg6 += var21;
                                                arg1 += var22;
                                                arg7 += class277.field3541;
                                                arg0 += var25;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg7, arg0, (arg1 >> 12) + -1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg6 += var21;
                                                arg1 += var22;
                                                arg7 += class277.field3541;
                                                arg0 += var25;
                                             }
                                          }

                                          arg0 += var25;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg7, arg0, (arg1 >> 12) - 1)) {
                                             return false;
                                          }

                                          arg1 += var22;
                                          arg7 += class277.field3541;
                                          arg3 += var20;
                                          arg0 += var25;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if (arg9 >= arg8) {
                        if (arg8 >= class362.field5024) {
                           return true;
                        } else {
                           arg2 = (arg2 << 8) - arg6 * var24 + var24;
                           if (~arg9 < ~class362.field5024) {
                              arg9 = class362.field5024;
                           }

                           if (arg7 > class362.field5024) {
                              arg7 = class362.field5024;
                           }

                           if (~arg9 <= ~arg7) {
                              arg1 = arg6 <<= 12;
                              arg3 <<= 12;
                              if (~arg8 > -1) {
                                 arg2 -= arg8 * var25;
                                 arg1 -= arg8 * var20;
                                 arg6 -= arg8 * var21;
                                 arg8 = 0;
                              }

                              if (arg7 < 0) {
                                 arg3 -= arg7 * var22;
                                 arg7 = 0;
                              }

                              if (~var20 <= ~var21) {
                                 arg9 -= arg7;
                                 arg7 -= arg8;
                                 arg8 = class277.field3541 * arg8;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) - -1, arg8, arg2, (arg6 >> 12) + -1)) {
                                       return false;
                                    }

                                    arg6 += var21;
                                    arg2 += var25;
                                    arg8 += class277.field3541;
                                    arg1 += var20;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg7;
                                       if (arg7 < 0) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg8, arg2, (arg6 >> 12) - 1)) {
                                                   return false;
                                                }

                                                arg6 += var21;
                                                arg2 += var25;
                                                arg8 += class277.field3541;
                                                arg3 += var22;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg8, arg2, (arg6 >> 12) - 1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg6 += var21;
                                                arg2 += var25;
                                                arg8 += class277.field3541;
                                                arg3 += var22;
                                             }
                                          }

                                          arg1 += var20;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) - -1, arg8, arg2, (arg6 >> 12) + -1)) {
                                             return false;
                                          }

                                          arg6 += var21;
                                          arg2 += var25;
                                          arg8 += class277.field3541;
                                          arg1 += var20;
                                       }
                                    }
                                 }
                              } else {
                                 arg9 -= arg7;
                                 arg7 -= arg8;
                                 arg8 = class277.field3541 * arg8;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg8, arg2, (arg1 >> 12) + -1)) {
                                       return false;
                                    }

                                    arg8 += class277.field3541;
                                    arg1 += var20;
                                    arg6 += var21;
                                    arg2 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg7;
                                       if (~arg7 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg8, arg2, (arg3 >> 12) + -1)) {
                                                   return false;
                                                }

                                                arg6 += var21;
                                                arg3 += var22;
                                                arg8 += class277.field3541;
                                                arg2 += var25;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg8, arg2, (arg3 >> 12) + -1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg6 += var21;
                                                arg3 += var22;
                                                arg8 += class277.field3541;
                                                arg2 += var25;
                                             }
                                          }

                                          arg2 += var25;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg8, arg2, (arg1 >> 12) + -1)) {
                                             return false;
                                          }

                                          arg8 += class277.field3541;
                                          arg1 += var20;
                                          arg6 += var21;
                                          arg2 += var25;
                                       }
                                    }
                                 }
                              }
                           } else {
                              arg3 = arg6 <<= 12;
                              arg1 <<= 12;
                              if (~arg8 > -1) {
                                 arg2 -= arg8 * var25;
                                 arg6 -= arg8 * var21;
                                 arg3 -= arg8 * var20;
                                 arg8 = 0;
                              }

                              if (arg9 < 0) {
                                 arg1 -= arg9 * var22;
                                 arg9 = 0;
                              }

                              if (~arg8 != ~arg9 && var20 < var21 || arg8 == arg9 && ~var20 < ~var22) {
                                 arg7 -= arg9;
                                 arg9 -= arg8;
                                 arg8 = class277.field3541 * arg8;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg8, arg2, (arg3 >> 12) + -1)) {
                                       return false;
                                    }

                                    arg2 += var25;
                                    arg8 += class277.field3541;
                                    arg6 += var21;
                                    arg3 += var20;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (arg9 < 0) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg8, arg2, (arg3 >> 12) + -1)) {
                                                   return false;
                                                }

                                                arg3 += var20;
                                                arg8 += class277.field3541;
                                                arg2 += var25;
                                                arg1 += var22;
                                             }

                                             while(true) {
                                                --arg7;
                                                if (~arg7 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg8, arg2, (arg3 >> 12) + -1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg3 += var20;
                                                arg8 += class277.field3541;
                                                arg2 += var25;
                                                arg1 += var22;
                                             }
                                          }

                                          arg3 += var20;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg8, arg2, (arg3 >> 12) + -1)) {
                                             return false;
                                          }

                                          arg2 += var25;
                                          arg8 += class277.field3541;
                                          arg6 += var21;
                                          arg3 += var20;
                                       }
                                    }
                                 }
                              } else {
                                 arg7 -= arg9;
                                 arg9 -= arg8;
                                 arg8 = class277.field3541 * arg8;
                                 if (var10) {
                                    if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg8, arg2, (arg6 >> 12) - 1)) {
                                       return false;
                                    }

                                    arg2 += var25;
                                    arg6 += var21;
                                    arg3 += var20;
                                    arg8 += class277.field3541;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (~arg9 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg8, arg2, (arg1 >> 12) + -1)) {
                                                   return false;
                                                }

                                                arg3 += var20;
                                                arg1 += var22;
                                                arg8 += class277.field3541;
                                                arg2 += var25;
                                             }

                                             while(true) {
                                                --arg7;
                                                if (~arg7 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg8, arg2, (arg1 >> 12) + -1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg3 += var20;
                                                arg1 += var22;
                                                arg8 += class277.field3541;
                                                arg2 += var25;
                                             }
                                          }

                                          arg8 += class277.field3541;
                                       } else {
                                          if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg8, arg2, (arg6 >> 12) - 1)) {
                                             return false;
                                          }

                                          arg2 += var25;
                                          arg6 += var21;
                                          arg3 += var20;
                                          arg8 += class277.field3541;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if (class362.field5024 <= arg9) {
                        return true;
                     } else {
                        arg4 = (arg4 << 8) - arg1 * var24 + var24;
                        if (~arg8 < ~class362.field5024) {
                           arg8 = class362.field5024;
                        }

                        if (~class362.field5024 > ~arg7) {
                           arg7 = class362.field5024;
                        }

                        if (~arg7 > ~arg8) {
                           arg6 = arg1 <<= 12;
                           if (~arg9 > -1) {
                              arg1 -= arg9 * var22;
                              arg4 -= arg9 * var25;
                              arg6 -= arg9 * var21;
                              arg9 = 0;
                           }

                           arg3 <<= 12;
                           if (~arg7 > -1) {
                              arg3 -= arg7 * var20;
                              arg7 = 0;
                           }

                           if (var21 >= var22) {
                              arg8 -= arg7;
                              arg7 -= arg9;
                              arg9 = class277.field3541 * arg9;
                              if (var10) {
                                 if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg9, arg4, (arg1 >> 12) - 1)) {
                                    return false;
                                 }

                                 arg4 += var25;
                                 arg1 += var22;
                                 arg6 += var21;
                                 arg9 += class277.field3541;
                              }

                              while(true) {
                                 while(true) {
                                    --arg7;
                                    if (arg7 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg9, arg4, (arg3 >> 12) + -1)) {
                                                return false;
                                             }

                                             arg3 += var20;
                                             arg9 += class277.field3541;
                                             arg4 += var25;
                                             arg6 += var21;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (arg8 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg9, arg4, (arg3 >> 12) + -1);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var20;
                                             arg9 += class277.field3541;
                                             arg4 += var25;
                                             arg6 += var21;
                                          }
                                       }

                                       arg9 += class277.field3541;
                                    } else {
                                       if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg9, arg4, (arg1 >> 12) - 1)) {
                                          return false;
                                       }

                                       arg4 += var25;
                                       arg1 += var22;
                                       arg6 += var21;
                                       arg9 += class277.field3541;
                                    }
                                 }
                              }
                           } else {
                              arg8 -= arg7;
                              arg7 -= arg9;
                              arg9 = class277.field3541 * arg9;
                              if (var10) {
                                 if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg9, arg4, (arg6 >> 12) + -1)) {
                                    return false;
                                 }

                                 arg4 += var25;
                                 arg9 += class277.field3541;
                                 arg1 += var22;
                                 arg6 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg7;
                                    if (arg7 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) - -1, arg9, arg4, (arg6 >> 12) - 1)) {
                                                return false;
                                             }

                                             arg3 += var20;
                                             arg9 += class277.field3541;
                                             arg6 += var21;
                                             arg4 += var25;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (~arg8 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) - -1, arg9, arg4, (arg6 >> 12) - 1);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var20;
                                             arg9 += class277.field3541;
                                             arg6 += var21;
                                             arg4 += var25;
                                          }
                                       }

                                       arg6 += var21;
                                    } else {
                                       if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg9, arg4, (arg6 >> 12) + -1)) {
                                          return false;
                                       }

                                       arg4 += var25;
                                       arg9 += class277.field3541;
                                       arg1 += var22;
                                       arg6 += var21;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg3 = arg1 <<= 12;
                           if (arg9 < 0) {
                              arg4 -= arg9 * var25;
                              arg1 -= arg9 * var22;
                              arg3 -= arg9 * var21;
                              arg9 = 0;
                           }

                           arg6 <<= 12;
                           if (arg8 < 0) {
                              arg6 -= arg8 * var20;
                              arg8 = 0;
                           }

                           if (var22 > var21) {
                              arg7 -= arg8;
                              arg8 -= arg9;
                              arg9 = class277.field3541 * arg9;
                              if (var10) {
                                 if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg9, arg4, (arg3 >> 12) + -1)) {
                                    return false;
                                 }

                                 arg1 += var22;
                                 arg9 += class277.field3541;
                                 arg3 += var21;
                                 arg4 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (arg8 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) - -1, arg9, arg4, (arg6 >> 12) + -1)) {
                                                return false;
                                             }

                                             arg9 += class277.field3541;
                                             arg6 += var20;
                                             arg1 += var22;
                                             arg4 += var25;
                                          }

                                          while(true) {
                                             --arg7;
                                             if (~arg7 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) - -1, arg9, arg4, (arg6 >> 12) + -1);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg9 += class277.field3541;
                                             arg6 += var20;
                                             arg1 += var22;
                                             arg4 += var25;
                                          }
                                       }

                                       arg4 += var25;
                                    } else {
                                       if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg1 >> 12) + 1, arg9, arg4, (arg3 >> 12) + -1)) {
                                          return false;
                                       }

                                       arg1 += var22;
                                       arg9 += class277.field3541;
                                       arg3 += var21;
                                       arg4 += var25;
                                    }
                                 }
                              }
                           } else {
                              arg7 -= arg8;
                              arg8 -= arg9;
                              arg9 = class277.field3541 * arg9;
                              if (var10) {
                                 if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg9, arg4, (arg1 >> 12) + -1)) {
                                    return false;
                                 }

                                 arg9 += class277.field3541;
                                 arg4 += var25;
                                 arg1 += var22;
                                 arg3 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (arg8 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg9, arg4, (arg1 >> 12) + -1)) {
                                                return false;
                                             }

                                             arg6 += var20;
                                             arg9 += class277.field3541;
                                             arg4 += var25;
                                             arg1 += var22;
                                          }

                                          while(true) {
                                             --arg7;
                                             if (~arg7 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class590.method4393(var24, class566.field8330, 0, 65535, (arg6 >> 12) + 1, arg9, arg4, (arg1 >> 12) + -1);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg6 += var20;
                                             arg9 += class277.field3541;
                                             arg4 += var25;
                                             arg1 += var22;
                                          }
                                       }

                                       arg3 += var21;
                                    } else {
                                       if (!class590.method4393(var24, class566.field8330, 0, 65535, (arg3 >> 12) + 1, arg9, arg4, (arg1 >> 12) + -1)) {
                                          return false;
                                       }

                                       arg9 += class277.field3541;
                                       arg4 += var25;
                                       arg1 += var22;
                                       arg3 += var21;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var27) {
         throw class93.method866(var27, field5823[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3314(int arg0) {
      try {
         field5818 = null;
         field5816 = null;
         field5815 = null;
         field5820 = null;
         if (arg0 != 12140) {
            field5822 = -108;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5823[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3315(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3316(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
