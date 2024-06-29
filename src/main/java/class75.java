import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class75 {
   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field968 = new String[]{method737(method736("||\u0018V\u0006'")), method737(method736("||\u0018V\u0005'")), method737(method736("||\u0018V\u0002'")), method737(method736("||\u0018V\u0000'"))};
   @OriginalMember(
      owner = "client!sga",
      name = "f",
      descriptor = "Lii;"
   )
   public static class579 field963 = new class579(4);
   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field967 = new int[8];
   @OriginalMember(
      owner = "client!sga",
      name = "c",
      descriptor = "I"
   )
   public static int field962;
   @OriginalMember(
      owner = "client!sga",
      name = "d",
      descriptor = "I"
   )
   public static int field964;
   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "I"
   )
   public static int field965;
   @OriginalMember(
      owner = "client!sga",
      name = "e",
      descriptor = "[Lat;"
   )
   public static class396[] field966;

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(II)I",
      line = 3
   )
   public static final int method730(int arg0, int arg1) {
      try {
         if (arg0 != 14535) {
            field966 = null;
         }

         ++field962;
         return (arg1 & 260568) >> 11;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field968[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "c",
      descriptor = "(I)V",
      line = 18
   )
   public static final void method731(int arg0) {
      class370.field5635 = arg0;

      for(int var1 = 0; var1 < class239.field3036; ++var1) {
         for(int var2 = 0; var2 < class220.field2796; ++var2) {
            if (class353.field5360[arg0][var1][var2] == null) {
               class353.field5360[arg0][var1][var2] = new class72(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(I)V",
      line = 42
   )
   public static final void method732(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(IIIBIIIIII)Z",
      line = 933
   )
   public static final boolean method733(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      int var10 = client.field4530;

      try {
         ++field964;
         if (arg1 <= 2000 && ~arg9 >= -2001 && ~arg6 >= -2001 && ~arg7 >= -2001 && ~arg8 >= -2001 && arg5 <= 2000) {
            if (arg1 >= -2000 && arg9 >= -2000 && ~arg6 <= 1999 && arg7 >= -2000 && arg8 >= -2000 && arg5 >= -2000) {
               if (~class637.field9265 == -3) {
                  int var11 = arg7 - -(class25.field261 * arg1);
                  if (var11 >= 0 && var11 < class755.field11143.length && ~((arg4 << 8) + -38400) > ~class755.field11143[var11]) {
                     return false;
                  }

                  int var12 = class25.field261 * arg9 + arg8;
                  if (~var12 <= -1 && var12 < class755.field11143.length && class755.field11143[var12] > (arg2 << 8) + -38400) {
                     return false;
                  }

                  int var13 = class25.field261 * arg6 + arg5;
                  if (~var13 <= -1 && var13 < class755.field11143.length && ~class755.field11143[var13] < ~((arg0 << 8) + -38400)) {
                     return false;
                  }
               }

               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               label1117: {
                  var14 = -arg7 + arg8;
                  var15 = -arg1 + arg9;
                  var16 = -arg7 + arg5;
                  var17 = -arg1 + arg6;
                  var18 = arg2 - arg4;
                  var19 = arg0 - arg4;
                  if (~arg1 > ~arg9 && ~arg6 < ~arg6) {
                     --arg1;
                     if (~arg9 >= ~arg6) {
                        ++arg6;
                        if (var10 == 0) {
                           break label1117;
                        }
                     }

                     ++arg9;
                     if (var10 == 0) {
                        break label1117;
                     }
                  }

                  if (~arg9 > ~arg6) {
                     label1085: {
                        if (~arg1 >= ~arg6) {
                           ++arg6;
                           if (var10 == 0) {
                              break label1085;
                           }
                        }

                        ++arg1;
                     }

                     --arg9;
                     if (var10 == 0) {
                        break label1117;
                     }
                  }

                  label1078: {
                     if (arg9 >= arg1) {
                        ++arg9;
                        if (var10 == 0) {
                           break label1078;
                        }
                     }

                     ++arg1;
                  }

                  --arg6;
               }

               if (arg3 != -37) {
                  return true;
               } else {
                  int var20 = 0;
                  if (arg1 != arg9) {
                     var20 = (arg8 - arg7 << 12) / (-arg1 + arg9);
                  }

                  int var21 = 0;
                  if (arg6 != arg9) {
                     var21 = (-arg8 + arg5 << 12) / (arg6 - arg9);
                  }

                  int var22 = 0;
                  if (~arg1 != ~arg6) {
                     var22 = (-arg5 + arg7 << 12) / (-arg6 + arg1);
                  }

                  int var23 = var14 * var17 + -(var15 * var16);
                  if (~var23 == -1) {
                     return false;
                  } else {
                     int var24 = (var17 * var18 + -(var15 * var19) << 8) / var23;
                     int var25 = (var14 * var19 + -(var16 * var18) << 8) / var23;
                     boolean var10000;
                     if (~arg1 >= ~arg9 && ~arg6 <= ~arg1) {
                        if (arg1 >= class40.field433) {
                           return true;
                        } else {
                           if (class40.field433 < arg6) {
                              arg6 = class40.field433;
                           }

                           arg4 = (arg4 << 8) - -var24 + -(arg7 * var24);
                           if (~class40.field433 > ~arg9) {
                              arg9 = class40.field433;
                           }

                           if (~arg6 >= ~arg9) {
                              arg8 = arg7 <<= 12;
                              arg5 <<= 12;
                              if (arg1 < 0) {
                                 arg4 -= arg1 * var25;
                                 arg7 -= arg1 * var20;
                                 arg8 -= arg1 * var22;
                                 arg1 = 0;
                              }

                              if (arg6 < 0) {
                                 arg5 -= arg6 * var21;
                                 arg6 = 0;
                              }

                              if (~arg1 != ~arg6 && var22 < var20 || arg1 == arg6 && ~var21 < ~var20) {
                                 arg9 -= arg6;
                                 arg6 -= arg1;
                                 arg1 = class25.field261 * arg1;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, arg3 ^ 124, (arg7 >> 12) - -1, 0, arg4, var24, arg1)) {
                                       return false;
                                    }

                                    arg1 += class25.field261;
                                    arg4 += var25;
                                    arg7 += var20;
                                    arg8 += var22;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (arg6 < 0) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -121, (arg7 >> 12) + 1, 0, arg4, var24, arg1)) {
                                                   return false;
                                                }

                                                arg5 += var21;
                                                arg7 += var20;
                                                arg1 += class25.field261;
                                                arg4 += var25;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg5 >> 12) + -1, -121, (arg7 >> 12) + 1, 0, arg4, var24, arg1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg5 += var21;
                                                arg7 += var20;
                                                arg1 += class25.field261;
                                                arg4 += var25;
                                             }
                                          }

                                          arg8 += var22;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, arg3 ^ 124, (arg7 >> 12) - -1, 0, arg4, var24, arg1)) {
                                             return false;
                                          }

                                          arg1 += class25.field261;
                                          arg4 += var25;
                                          arg7 += var20;
                                          arg8 += var22;
                                       }
                                    }
                                 }
                              } else {
                                 arg9 -= arg6;
                                 arg6 -= arg1;
                                 arg1 = class25.field261 * arg1;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg7 >> 12) - 1, -72, (arg8 >> 12) + 1, 0, arg4, var24, arg1)) {
                                       return false;
                                    }

                                    arg7 += var20;
                                    arg1 += class25.field261;
                                    arg8 += var22;
                                    arg4 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (arg6 < 0) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -87, (arg5 >> 12) + 1, 0, arg4, var24, arg1)) {
                                                   return false;
                                                }

                                                arg7 += var20;
                                                arg1 += class25.field261;
                                                arg5 += var21;
                                                arg4 += var25;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (~arg9 > -1) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg7 >> 12) + -1, -87, (arg5 >> 12) + 1, 0, arg4, var24, arg1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg7 += var20;
                                                arg1 += class25.field261;
                                                arg5 += var21;
                                                arg4 += var25;
                                             }
                                          }

                                          arg4 += var25;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg7 >> 12) - 1, -72, (arg8 >> 12) + 1, 0, arg4, var24, arg1)) {
                                             return false;
                                          }

                                          arg7 += var20;
                                          arg1 += class25.field261;
                                          arg8 += var22;
                                          arg4 += var25;
                                       }
                                    }
                                 }
                              }
                           } else {
                              arg5 = arg7 <<= 12;
                              arg8 <<= 12;
                              if (arg1 < 0) {
                                 arg4 -= arg1 * var25;
                                 arg5 -= arg1 * var22;
                                 arg7 -= arg1 * var20;
                                 arg1 = 0;
                              }

                              if (arg9 < 0) {
                                 arg8 -= arg9 * var21;
                                 arg9 = 0;
                              }

                              if ((arg1 == arg9 || var20 <= var22) && (~arg1 != ~arg9 || ~var21 <= ~var22)) {
                                 arg6 -= arg9;
                                 arg9 -= arg1;
                                 arg1 = class25.field261 * arg1;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -79, (arg5 >> 12) + 1, 0, arg4, var24, arg1)) {
                                       return false;
                                    }

                                    arg4 += var25;
                                    arg1 += class25.field261;
                                    arg5 += var22;
                                    arg7 += var20;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (~arg9 > -1) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, -105, (arg5 >> 12) - -1, 0, arg4, var24, arg1)) {
                                                   return false;
                                                }

                                                arg4 += var25;
                                                arg1 += class25.field261;
                                                arg8 += var21;
                                                arg5 += var22;
                                             }

                                             while(true) {
                                                --arg6;
                                                if (arg6 < 0) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg8 >> 12) + -1, -105, (arg5 >> 12) - -1, 0, arg4, var24, arg1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg4 += var25;
                                                arg1 += class25.field261;
                                                arg8 += var21;
                                                arg5 += var22;
                                             }
                                          }

                                          arg7 += var20;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -79, (arg5 >> 12) + 1, 0, arg4, var24, arg1)) {
                                             return false;
                                          }

                                          arg4 += var25;
                                          arg1 += class25.field261;
                                          arg5 += var22;
                                          arg7 += var20;
                                       }
                                    }
                                 }
                              } else {
                                 arg6 -= arg9;
                                 arg9 -= arg1;
                                 arg1 = class25.field261 * arg1;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, arg3 ^ 24, (arg7 >> 12) + 1, 0, arg4, var24, arg1)) {
                                       return false;
                                    }

                                    arg4 += var25;
                                    arg5 += var22;
                                    arg7 += var20;
                                    arg1 += class25.field261;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (~arg9 > -1) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -89, (arg8 >> 12) + 1, 0, arg4, var24, arg1)) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg8 += var21;
                                                arg4 += var25;
                                                arg1 += class25.field261;
                                             }

                                             while(true) {
                                                --arg6;
                                                if (~arg6 > -1) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg5 >> 12) + -1, -89, (arg8 >> 12) + 1, 0, arg4, var24, arg1);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg8 += var21;
                                                arg4 += var25;
                                                arg1 += class25.field261;
                                             }
                                          }

                                          arg1 += class25.field261;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, arg3 ^ 24, (arg7 >> 12) + 1, 0, arg4, var24, arg1)) {
                                             return false;
                                          }

                                          arg4 += var25;
                                          arg5 += var22;
                                          arg7 += var20;
                                          arg1 += class25.field261;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if (arg6 >= arg9) {
                        if (class40.field433 <= arg9) {
                           return true;
                        } else {
                           if (class40.field433 < arg1) {
                              arg1 = class40.field433;
                           }

                           if (~arg6 < ~class40.field433) {
                              arg6 = class40.field433;
                           }

                           arg2 = (arg2 << 8) + -(arg8 * var24) + var24;
                           if (~arg6 <= ~arg1) {
                              arg5 = arg8 <<= 12;
                              arg7 <<= 12;
                              if (arg9 < 0) {
                                 arg2 -= arg9 * var25;
                                 arg5 -= arg9 * var20;
                                 arg8 -= arg9 * var21;
                                 arg9 = 0;
                              }

                              if (arg1 < 0) {
                                 arg7 -= arg1 * var22;
                                 arg1 = 0;
                              }

                              if (~var21 >= ~var20) {
                                 arg6 -= arg1;
                                 arg1 -= arg9;
                                 arg9 = class25.field261 * arg9;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg8 >> 12) - 1, arg3 ^ 118, (arg5 >> 12) + 1, 0, arg2, var24, arg9)) {
                                       return false;
                                    }

                                    arg8 += var21;
                                    arg9 += class25.field261;
                                    arg5 += var20;
                                    arg2 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (arg1 < 0) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, -109, (arg7 >> 12) - -1, 0, arg2, var24, arg9)) {
                                                   return false;
                                                }

                                                arg2 += var25;
                                                arg9 += class25.field261;
                                                arg7 += var22;
                                                arg8 += var21;
                                             }

                                             while(true) {
                                                --arg6;
                                                if (~arg6 > -1) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg8 >> 12) + -1, -109, (arg7 >> 12) - -1, 0, arg2, var24, arg9);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg2 += var25;
                                                arg9 += class25.field261;
                                                arg7 += var22;
                                                arg8 += var21;
                                             }
                                          }

                                          arg2 += var25;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg8 >> 12) - 1, arg3 ^ 118, (arg5 >> 12) + 1, 0, arg2, var24, arg9)) {
                                             return false;
                                          }

                                          arg8 += var21;
                                          arg9 += class25.field261;
                                          arg5 += var20;
                                          arg2 += var25;
                                       }
                                    }
                                 }
                              } else {
                                 arg6 -= arg1;
                                 arg1 -= arg9;
                                 arg9 = class25.field261 * arg9;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, arg3 + -79, (arg8 >> 12) + 1, 0, arg2, var24, arg9)) {
                                       return false;
                                    }

                                    arg5 += var20;
                                    arg9 += class25.field261;
                                    arg8 += var21;
                                    arg2 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (arg1 < 0) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -76, (arg8 >> 12) - -1, 0, arg2, var24, arg9)) {
                                                   return false;
                                                }

                                                arg8 += var21;
                                                arg7 += var22;
                                                arg2 += var25;
                                                arg9 += class25.field261;
                                             }

                                             while(true) {
                                                --arg6;
                                                if (arg6 < 0) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg7 >> 12) + -1, -76, (arg8 >> 12) - -1, 0, arg2, var24, arg9);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg8 += var21;
                                                arg7 += var22;
                                                arg2 += var25;
                                                arg9 += class25.field261;
                                             }
                                          }

                                          arg2 += var25;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, arg3 + -79, (arg8 >> 12) + 1, 0, arg2, var24, arg9)) {
                                             return false;
                                          }

                                          arg5 += var20;
                                          arg9 += class25.field261;
                                          arg8 += var21;
                                          arg2 += var25;
                                       }
                                    }
                                 }
                              }
                           } else {
                              arg7 = arg8 <<= 12;
                              if (~arg9 > -1) {
                                 arg7 -= arg9 * var20;
                                 arg8 -= arg9 * var21;
                                 arg2 -= arg9 * var25;
                                 arg9 = 0;
                              }

                              arg5 <<= 12;
                              if (arg6 < 0) {
                                 arg5 -= arg6 * var22;
                                 arg6 = 0;
                              }

                              if (arg6 != arg9 && var20 < var21 || arg6 == arg9 && ~var20 < ~var22) {
                                 arg1 -= arg6;
                                 arg6 -= arg9;
                                 arg9 = class25.field261 * arg9;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -115, (arg8 >> 12) - -1, 0, arg2, var24, arg9)) {
                                       return false;
                                    }

                                    arg8 += var21;
                                    arg2 += var25;
                                    arg9 += class25.field261;
                                    arg7 += var20;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (arg6 < 0) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -117, (arg5 >> 12) + 1, 0, arg2, var24, arg9)) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg7 += var20;
                                                arg2 += var25;
                                                arg9 += class25.field261;
                                             }

                                             while(true) {
                                                --arg1;
                                                if (~arg1 > -1) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg7 >> 12) + -1, -117, (arg5 >> 12) + 1, 0, arg2, var24, arg9);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg7 += var20;
                                                arg2 += var25;
                                                arg9 += class25.field261;
                                             }
                                          }

                                          arg7 += var20;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -115, (arg8 >> 12) - -1, 0, arg2, var24, arg9)) {
                                             return false;
                                          }

                                          arg8 += var21;
                                          arg2 += var25;
                                          arg9 += class25.field261;
                                          arg7 += var20;
                                       }
                                    }
                                 }
                              } else {
                                 arg1 -= arg6;
                                 arg6 -= arg9;
                                 arg9 = class25.field261 * arg9;
                                 if (var10 != 0) {
                                    if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, -117, (arg7 >> 12) + 1, 0, arg2, var24, arg9)) {
                                       return false;
                                    }

                                    arg2 += var25;
                                    arg7 += var20;
                                    arg9 += class25.field261;
                                    arg8 += var21;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg6;
                                       if (~arg6 > -1) {
                                          if (var10 == 0) {
                                             if (var10 != 0) {
                                                if (!class366.method2841(class755.field11143, (arg5 >> 12) - 1, -128, (arg7 >> 12) + 1, 0, arg2, var24, arg9)) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg9 += class25.field261;
                                                arg7 += var20;
                                                arg2 += var25;
                                             }

                                             while(true) {
                                                --arg1;
                                                if (arg1 < 0) {
                                                   var10000 = true;
                                                   if (var10 == 0) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class366.method2841(class755.field11143, (arg5 >> 12) - 1, -128, (arg7 >> 12) + 1, 0, arg2, var24, arg9);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg9 += class25.field261;
                                                arg7 += var20;
                                                arg2 += var25;
                                             }
                                          }

                                          arg8 += var21;
                                       } else {
                                          if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, -117, (arg7 >> 12) + 1, 0, arg2, var24, arg9)) {
                                             return false;
                                          }

                                          arg2 += var25;
                                          arg7 += var20;
                                          arg9 += class25.field261;
                                          arg8 += var21;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if (arg6 >= class40.field433) {
                        return true;
                     } else {
                        if (class40.field433 < arg9) {
                           arg9 = class40.field433;
                        }

                        if (arg1 > class40.field433) {
                           arg1 = class40.field433;
                        }

                        arg0 = (arg0 << 8) + var24 - arg5 * var24;
                        if (~arg9 >= ~arg1) {
                           arg7 = arg5 <<= 12;
                           if (~arg6 > -1) {
                              arg0 -= arg6 * var25;
                              arg5 -= arg6 * var22;
                              arg7 -= arg6 * var21;
                              arg6 = 0;
                           }

                           arg8 <<= 12;
                           if (arg9 < 0) {
                              arg8 -= arg9 * var20;
                              arg9 = 0;
                           }

                           if (~var21 > ~var22) {
                              arg1 -= arg9;
                              arg9 -= arg6;
                              arg6 = class25.field261 * arg6;
                              if (var10 != 0) {
                                 if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, arg3 + -29, (arg5 >> 12) - -1, 0, arg0, var24, arg6)) {
                                    return false;
                                 }

                                 arg7 += var21;
                                 arg5 += var22;
                                 arg0 += var25;
                                 arg6 += class25.field261;
                              }

                              while(true) {
                                 while(true) {
                                    --arg9;
                                    if (~arg9 > -1) {
                                       if (var10 == 0) {
                                          if (var10 != 0) {
                                             if (!class366.method2841(class755.field11143, (arg8 >> 12) + -1, -125, (arg5 >> 12) + 1, 0, arg0, var24, arg6)) {
                                                return false;
                                             }

                                             arg6 += class25.field261;
                                             arg8 += var20;
                                             arg0 += var25;
                                             arg5 += var22;
                                          }

                                          while(true) {
                                             --arg1;
                                             if (arg1 < 0) {
                                                var10000 = true;
                                                if (var10 == 0) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class366.method2841(class755.field11143, (arg8 >> 12) + -1, -125, (arg5 >> 12) + 1, 0, arg0, var24, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg6 += class25.field261;
                                             arg8 += var20;
                                             arg0 += var25;
                                             arg5 += var22;
                                          }
                                       }

                                       arg6 += class25.field261;
                                    } else {
                                       if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, arg3 + -29, (arg5 >> 12) - -1, 0, arg0, var24, arg6)) {
                                          return false;
                                       }

                                       arg7 += var21;
                                       arg5 += var22;
                                       arg0 += var25;
                                       arg6 += class25.field261;
                                    }
                                 }
                              }
                           } else {
                              arg1 -= arg9;
                              arg9 -= arg6;
                              arg6 = class25.field261 * arg6;
                              if (var10 != 0) {
                                 if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -74, (arg7 >> 12) - -1, 0, arg0, var24, arg6)) {
                                    return false;
                                 }

                                 arg6 += class25.field261;
                                 arg5 += var22;
                                 arg0 += var25;
                                 arg7 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg9;
                                    if (arg9 < 0) {
                                       if (var10 == 0) {
                                          if (var10 != 0) {
                                             if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -90, (arg8 >> 12) + 1, 0, arg0, var24, arg6)) {
                                                return false;
                                             }

                                             arg0 += var25;
                                             arg6 += class25.field261;
                                             arg5 += var22;
                                             arg8 += var20;
                                          }

                                          while(true) {
                                             --arg1;
                                             if (arg1 < 0) {
                                                var10000 = true;
                                                if (var10 == 0) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class366.method2841(class755.field11143, (arg5 >> 12) + -1, -90, (arg8 >> 12) + 1, 0, arg0, var24, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg0 += var25;
                                             arg6 += class25.field261;
                                             arg5 += var22;
                                             arg8 += var20;
                                          }
                                       }

                                       arg7 += var21;
                                    } else {
                                       if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -74, (arg7 >> 12) - -1, 0, arg0, var24, arg6)) {
                                          return false;
                                       }

                                       arg6 += class25.field261;
                                       arg5 += var22;
                                       arg0 += var25;
                                       arg7 += var21;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg8 = arg5 <<= 12;
                           arg7 <<= 12;
                           if (arg6 < 0) {
                              arg8 -= arg6 * var21;
                              arg5 -= arg6 * var22;
                              arg0 -= arg6 * var25;
                              arg6 = 0;
                           }

                           if (arg1 < 0) {
                              arg7 -= arg1 * var20;
                              arg1 = 0;
                           }

                           if (~var22 < ~var21) {
                              arg9 -= arg1;
                              arg1 -= arg6;
                              arg6 = class25.field261 * arg6;
                              if (var10 != 0) {
                                 if (!class366.method2841(class755.field11143, (arg8 >> 12) - 1, -117, (arg5 >> 12) + 1, 0, arg0, var24, arg6)) {
                                    return false;
                                 }

                                 arg6 += class25.field261;
                                 arg5 += var22;
                                 arg0 += var25;
                                 arg8 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (var10 == 0) {
                                          if (var10 != 0) {
                                             if (!class366.method2841(class755.field11143, (arg8 >> 12) - 1, -89, (arg7 >> 12) - -1, 0, arg0, var24, arg6)) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg0 += var25;
                                             arg8 += var21;
                                             arg6 += class25.field261;
                                          }

                                          while(true) {
                                             --arg9;
                                             if (~arg9 > -1) {
                                                var10000 = true;
                                                if (var10 == 0) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class366.method2841(class755.field11143, (arg8 >> 12) - 1, -89, (arg7 >> 12) - -1, 0, arg0, var24, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg0 += var25;
                                             arg8 += var21;
                                             arg6 += class25.field261;
                                          }
                                       }

                                       arg8 += var21;
                                    } else {
                                       if (!class366.method2841(class755.field11143, (arg8 >> 12) - 1, -117, (arg5 >> 12) + 1, 0, arg0, var24, arg6)) {
                                          return false;
                                       }

                                       arg6 += class25.field261;
                                       arg5 += var22;
                                       arg0 += var25;
                                       arg8 += var21;
                                    }
                                 }
                              }
                           } else {
                              arg9 -= arg1;
                              arg1 -= arg6;
                              arg6 = class25.field261 * arg6;
                              if (var10 != 0) {
                                 if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -66, (arg8 >> 12) + 1, 0, arg0, var24, arg6)) {
                                    return false;
                                 }

                                 arg0 += var25;
                                 arg6 += class25.field261;
                                 arg5 += var22;
                                 arg8 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (var10 == 0) {
                                          if (var10 != 0) {
                                             if (!class366.method2841(class755.field11143, (arg7 >> 12) + -1, -70, (arg8 >> 12) + 1, 0, arg0, var24, arg6)) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg0 += var25;
                                             arg6 += class25.field261;
                                             arg8 += var21;
                                          }

                                          while(true) {
                                             --arg9;
                                             if (arg9 < 0) {
                                                var10000 = true;
                                                if (var10 == 0) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class366.method2841(class755.field11143, (arg7 >> 12) + -1, -70, (arg8 >> 12) + 1, 0, arg0, var24, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg7 += var20;
                                             arg0 += var25;
                                             arg6 += class25.field261;
                                             arg8 += var21;
                                          }
                                       }

                                       arg8 += var21;
                                    } else {
                                       if (!class366.method2841(class755.field11143, (arg5 >> 12) + -1, -66, (arg8 >> 12) + 1, 0, arg0, var24, arg6)) {
                                          return false;
                                       }

                                       arg0 += var25;
                                       arg6 += class25.field261;
                                       arg5 += var22;
                                       arg8 += var21;
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
         throw class670.method4877(var27, field968[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(Lda;)V",
      line = 1574
   )
   public static final void method734(class67 arg0) {
      class634.field9238 = arg0;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(I)V",
      line = 1581
   )
   public static void method735(int arg0) {
      try {
         field963 = null;
         if (arg0 != -1) {
            method735(73);
         }

         field967 = null;
         field966 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field968[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method736(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method737(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
