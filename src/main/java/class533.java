import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class533 {
   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7292 = new String[]{method3841(method3840("kSO*x")), method3841(method3840("f\u0018OE-")), method3841(method3840("~\b\rh")), method3841(method3840("f\u0018O@-")), method3841(method3840("f\u0018OF-"))};
   @OriginalMember(
      owner = "client!ve",
      name = "d",
      descriptor = "I"
   )
   public static int field7288;
   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "I"
   )
   public static int field7290;
   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "I"
   )
   public static int field7291;
   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field7289;

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3837(int arg0) {
      try {
         if (arg0 != 1) {
            method3838(-96, -81, 84, -21, 23, 17, -67, 123, 100, -9);
         }

         field7289 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7292[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(ILac;)Lac;"
   )
   public abstract class570 method1295(int arg0, class570 arg1);

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(IIIIIIIIII)Z"
   )
   public static final boolean method3838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4273;

      try {
         ++field7290;
         if (~arg8 >= -2001 && ~arg6 >= -2001 && arg3 <= 2000 && arg0 <= 2000 && arg4 <= 2000 && ~arg1 >= -2001) {
            if (arg8 >= -2000 && ~arg6 <= 1999 && arg3 >= -2000 && ~arg0 <= 1999 && arg4 >= -2000 && ~arg1 <= 1999) {
               if (~class100.field1286 == -3) {
                  int var11 = class243.field3041 * arg8 + arg0;
                  if (~var11 <= -1 && var11 < class793.field11583.length && (arg5 << 8) + -38400 < class793.field11583[var11]) {
                     return false;
                  }

                  int var12 = class243.field3041 * arg6 + arg4;
                  if (var12 >= 0 && var12 < class793.field11583.length && (arg7 << 8) + -38400 < class793.field11583[var12]) {
                     return false;
                  }

                  int var13 = class243.field3041 * arg3 + arg1;
                  if (var13 >= 0 && class793.field11583.length > var13 && (arg2 << 8) + -38400 < class793.field11583[var13]) {
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
                  var14 = -arg0 + arg4;
                  var15 = -arg8 + arg6;
                  var16 = -arg0 + arg1;
                  var17 = arg3 - arg8;
                  var18 = -arg5 + arg7;
                  var19 = -arg5 + arg2;
                  if (arg8 < arg6 && arg3 < arg3) {
                     label1090: {
                        if (~arg3 <= ~arg6) {
                           ++arg3;
                           if (!var10) {
                              break label1090;
                           }
                        }

                        ++arg6;
                     }

                     --arg8;
                     if (!var10) {
                        break label1115;
                     }
                  }

                  if (~arg6 > ~arg3) {
                     --arg6;
                     if (~arg3 <= ~arg8) {
                        ++arg3;
                        if (!var10) {
                           break label1115;
                        }
                     }

                     ++arg8;
                     if (!var10) {
                        break label1115;
                     }
                  }

                  label1076: {
                     if (~arg6 > ~arg8) {
                        ++arg8;
                        if (!var10) {
                           break label1076;
                        }
                     }

                     ++arg6;
                  }

                  --arg3;
               }

               int var20 = 0;
               if (arg6 != arg8) {
                  var20 = (-arg0 + arg4 << 12) / (-arg8 + arg6);
               }

               int var21 = 0;
               if (arg3 != arg6) {
                  var21 = (-arg4 + arg1 << 12) / (-arg6 + arg3);
               }

               int var22 = arg9;
               if (arg3 != arg8) {
                  var22 = (-arg1 + arg0 << 12) / (-arg3 + arg8);
               }

               int var23 = var14 * var17 + -(var15 * var16);
               if (~var23 == -1) {
                  return false;
               } else {
                  int var24 = (var17 * var18 + -(var15 * var19) << 8) / var23;
                  int var25 = (var14 * var19 + -(var16 * var18) << 8) / var23;
                  boolean var10000;
                  if (~arg8 >= ~arg6 && arg3 >= arg8) {
                     if (~class696.field10168 >= ~arg8) {
                        return true;
                     } else {
                        if (class696.field10168 < arg3) {
                           arg3 = class696.field10168;
                        }

                        arg5 = (arg5 << 8) - arg0 * var24 + var24;
                        if (arg6 > class696.field10168) {
                           arg6 = class696.field10168;
                        }

                        if (~arg3 >= ~arg6) {
                           arg4 = arg0 <<= 12;
                           if (~arg8 > -1) {
                              arg4 -= arg8 * var22;
                              arg5 -= arg8 * var25;
                              arg0 -= arg8 * var20;
                              arg8 = 0;
                           }

                           arg1 <<= 12;
                           if (~arg3 > -1) {
                              arg1 -= arg3 * var21;
                              arg3 = 0;
                           }

                           if (~arg3 != ~arg8 && var22 < var20 || ~arg3 == ~arg8 && var21 > var20) {
                              arg6 -= arg3;
                              arg3 -= arg8;
                              arg8 = class243.field3041 * arg8;
                              if (var10) {
                                 if (!class482.method3508((arg4 >> 12) - 1, (arg0 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                    return false;
                                 }

                                 arg8 += class243.field3041;
                                 arg5 += var25;
                                 arg0 += var20;
                                 arg4 += var22;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg1 >> 12) - 1, (arg0 >> 12) - -1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                                return false;
                                             }

                                             arg5 += var25;
                                             arg0 += var20;
                                             arg1 += var21;
                                             arg8 += class243.field3041;
                                          }

                                          while(true) {
                                             --arg6;
                                             if (arg6 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg1 >> 12) - 1, (arg0 >> 12) - -1, 0, arg8, var24, class793.field11583, (byte)125, arg5);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg5 += var25;
                                             arg0 += var20;
                                             arg1 += var21;
                                             arg8 += class243.field3041;
                                          }
                                       }

                                       arg4 += var22;
                                    } else {
                                       if (!class482.method3508((arg4 >> 12) - 1, (arg0 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                          return false;
                                       }

                                       arg8 += class243.field3041;
                                       arg5 += var25;
                                       arg0 += var20;
                                       arg4 += var22;
                                    }
                                 }
                              }
                           } else {
                              arg6 -= arg3;
                              arg3 -= arg8;
                              arg8 = class243.field3041 * arg8;
                              if (var10) {
                                 if (!class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                    return false;
                                 }

                                 arg0 += var20;
                                 arg4 += var22;
                                 arg5 += var25;
                                 arg8 += class243.field3041;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                                return false;
                                             }

                                             arg1 += var21;
                                             arg0 += var20;
                                             arg5 += var25;
                                             arg8 += class243.field3041;
                                          }

                                          while(true) {
                                             --arg6;
                                             if (~arg6 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg1 += var21;
                                             arg0 += var20;
                                             arg5 += var25;
                                             arg8 += class243.field3041;
                                          }
                                       }

                                       arg8 += class243.field3041;
                                    } else {
                                       if (!class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                          return false;
                                       }

                                       arg0 += var20;
                                       arg4 += var22;
                                       arg5 += var25;
                                       arg8 += class243.field3041;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg1 = arg0 <<= 12;
                           arg4 <<= 12;
                           if (~arg8 > -1) {
                              arg1 -= arg8 * var22;
                              arg5 -= arg8 * var25;
                              arg0 -= arg8 * var20;
                              arg8 = 0;
                           }

                           if (~arg6 > -1) {
                              arg4 -= arg6 * var21;
                              arg6 = 0;
                           }

                           if (arg6 != arg8 && ~var20 < ~var22 || ~arg6 == ~arg8 && ~var22 < ~var21) {
                              arg3 -= arg6;
                              arg6 -= arg8;
                              arg8 = class243.field3041 * arg8;
                              if (var10) {
                                 if (!class482.method3508((arg1 >> 12) - 1, (arg0 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                    return false;
                                 }

                                 arg1 += var22;
                                 arg8 += class243.field3041;
                                 arg0 += var20;
                                 arg5 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                                return false;
                                             }

                                             arg5 += var25;
                                             arg1 += var22;
                                             arg4 += var21;
                                             arg8 += class243.field3041;
                                          }

                                          while(true) {
                                             --arg3;
                                             if (~arg3 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg5 += var25;
                                             arg1 += var22;
                                             arg4 += var21;
                                             arg8 += class243.field3041;
                                          }
                                       }

                                       arg5 += var25;
                                    } else {
                                       if (!class482.method3508((arg1 >> 12) - 1, (arg0 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                          return false;
                                       }

                                       arg1 += var22;
                                       arg8 += class243.field3041;
                                       arg0 += var20;
                                       arg5 += var25;
                                    }
                                 }
                              }
                           } else {
                              arg3 -= arg6;
                              arg6 -= arg8;
                              arg8 = class243.field3041 * arg8;
                              if (var10) {
                                 if (!class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                    return false;
                                 }

                                 arg8 += class243.field3041;
                                 arg0 += var20;
                                 arg1 += var22;
                                 arg5 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg4 >> 12) - 1, (arg1 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                                return false;
                                             }

                                             arg8 += class243.field3041;
                                             arg5 += var25;
                                             arg1 += var22;
                                             arg4 += var21;
                                          }

                                          while(true) {
                                             --arg3;
                                             if (~arg3 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg4 >> 12) - 1, (arg1 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg8 += class243.field3041;
                                             arg5 += var25;
                                             arg1 += var22;
                                             arg4 += var21;
                                          }
                                       }

                                       arg5 += var25;
                                    } else {
                                       if (!class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg8, var24, class793.field11583, (byte)125, arg5)) {
                                          return false;
                                       }

                                       arg8 += class243.field3041;
                                       arg0 += var20;
                                       arg1 += var22;
                                       arg5 += var25;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (~arg6 < ~arg3) {
                     if (arg3 >= class696.field10168) {
                        return true;
                     } else {
                        arg2 = (arg2 << 8) + -(arg1 * var24) + var24;
                        if (arg8 > class696.field10168) {
                           arg8 = class696.field10168;
                        }

                        if (~arg6 < ~class696.field10168) {
                           arg6 = class696.field10168;
                        }

                        if (~arg6 >= ~arg8) {
                           arg0 = arg1 <<= 12;
                           if (~arg3 > -1) {
                              arg1 -= arg3 * var22;
                              arg0 -= arg3 * var21;
                              arg2 -= arg3 * var25;
                              arg3 = 0;
                           }

                           arg4 <<= 12;
                           if (arg6 < 0) {
                              arg4 -= arg6 * var20;
                              arg6 = 0;
                           }

                           if (~var21 > ~var22) {
                              arg8 -= arg6;
                              arg6 -= arg3;
                              arg3 = class243.field3041 * arg3;
                              if (var10) {
                                 if (!class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                    return false;
                                 }

                                 arg1 += var22;
                                 arg3 += class243.field3041;
                                 arg0 += var21;
                                 arg2 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg4 >> 12) + -1, (arg1 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg2 += var25;
                                             arg1 += var22;
                                             arg4 += var20;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (~arg8 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg4 >> 12) + -1, (arg1 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg2 += var25;
                                             arg1 += var22;
                                             arg4 += var20;
                                          }
                                       }

                                       arg2 += var25;
                                    } else {
                                       if (!class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                          return false;
                                       }

                                       arg1 += var22;
                                       arg3 += class243.field3041;
                                       arg0 += var21;
                                       arg2 += var25;
                                    }
                                 }
                              }
                           } else {
                              arg8 -= arg6;
                              arg6 -= arg3;
                              arg3 = class243.field3041 * arg3;
                              if (var10) {
                                 if (!class482.method3508((arg1 >> 12) + -1, (arg0 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                    return false;
                                 }

                                 arg3 += class243.field3041;
                                 arg2 += var25;
                                 arg1 += var22;
                                 arg0 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg2 += var25;
                                             arg1 += var22;
                                             arg4 += var20;
                                          }

                                          while(true) {
                                             --arg8;
                                             if (~arg8 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg2 += var25;
                                             arg1 += var22;
                                             arg4 += var20;
                                          }
                                       }

                                       arg0 += var21;
                                    } else {
                                       if (!class482.method3508((arg1 >> 12) + -1, (arg0 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                          return false;
                                       }

                                       arg3 += class243.field3041;
                                       arg2 += var25;
                                       arg1 += var22;
                                       arg0 += var21;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg4 = arg1 <<= 12;
                           arg0 <<= 12;
                           if (arg3 < 0) {
                              arg2 -= arg3 * var25;
                              arg1 -= arg3 * var22;
                              arg4 -= arg3 * var21;
                              arg3 = 0;
                           }

                           if (arg8 < 0) {
                              arg0 -= arg8 * var20;
                              arg8 = 0;
                           }

                           if (~var21 > ~var22) {
                              arg6 -= arg8;
                              arg8 -= arg3;
                              arg3 = class243.field3041 * arg3;
                              if (var10) {
                                 if (!class482.method3508((arg4 >> 12) + -1, (arg1 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                    return false;
                                 }

                                 arg3 += class243.field3041;
                                 arg2 += var25;
                                 arg1 += var22;
                                 arg4 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (~arg8 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg4 >> 12) - 1, (arg0 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg4 += var21;
                                             arg0 += var20;
                                             arg2 += var25;
                                          }

                                          while(true) {
                                             --arg6;
                                             if (arg6 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg4 >> 12) - 1, (arg0 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg4 += var21;
                                             arg0 += var20;
                                             arg2 += var25;
                                          }
                                       }

                                       arg4 += var21;
                                    } else {
                                       if (!class482.method3508((arg4 >> 12) + -1, (arg1 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                          return false;
                                       }

                                       arg3 += class243.field3041;
                                       arg2 += var25;
                                       arg1 += var22;
                                       arg4 += var21;
                                    }
                                 }
                              }
                           } else {
                              arg6 -= arg8;
                              arg8 -= arg3;
                              arg3 = class243.field3041 * arg3;
                              if (var10) {
                                 if (!class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                    return false;
                                 }

                                 arg3 += class243.field3041;
                                 arg1 += var22;
                                 arg2 += var25;
                                 arg4 += var21;
                              }

                              while(true) {
                                 while(true) {
                                    --arg8;
                                    if (~arg8 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg0 += var20;
                                             arg2 += var25;
                                             arg4 += var21;
                                          }

                                          while(true) {
                                             --arg6;
                                             if (arg6 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += class243.field3041;
                                             arg0 += var20;
                                             arg2 += var25;
                                             arg4 += var21;
                                          }
                                       }

                                       arg4 += var21;
                                    } else {
                                       if (!class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg3, var24, class793.field11583, (byte)125, arg2)) {
                                          return false;
                                       }

                                       arg3 += class243.field3041;
                                       arg1 += var22;
                                       arg2 += var25;
                                       arg4 += var21;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (~class696.field10168 >= ~arg6) {
                     return true;
                  } else {
                     if (~arg3 < ~class696.field10168) {
                        arg3 = class696.field10168;
                     }

                     if (~class696.field10168 > ~arg8) {
                        arg8 = class696.field10168;
                     }

                     arg7 = (arg7 << 8) + -(arg4 * var24) - -var24;
                     if (arg3 < arg8) {
                        arg0 = arg4 <<= 12;
                        arg1 <<= 12;
                        if (arg6 < 0) {
                           arg0 -= arg6 * var20;
                           arg7 -= arg6 * var25;
                           arg4 -= arg6 * var21;
                           arg6 = 0;
                        }

                        if (~arg3 > -1) {
                           arg1 -= arg3 * var22;
                           arg3 = 0;
                        }

                        if (~arg3 != ~arg6 && var21 > var20 || arg3 == arg6 && var22 < var20) {
                           arg8 -= arg3;
                           arg3 -= arg6;
                           arg6 = class243.field3041 * arg6;
                           if (var10) {
                              if (!class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                 return false;
                              }

                              arg0 += var20;
                              arg4 += var21;
                              arg7 += var25;
                              arg6 += class243.field3041;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                             return false;
                                          }

                                          arg1 += var22;
                                          arg0 += var20;
                                          arg6 += class243.field3041;
                                          arg7 += var25;
                                       }

                                       while(true) {
                                          --arg8;
                                          if (arg8 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class482.method3508((arg0 >> 12) + -1, (arg1 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg1 += var22;
                                          arg0 += var20;
                                          arg6 += class243.field3041;
                                          arg7 += var25;
                                       }
                                    }

                                    arg6 += class243.field3041;
                                 } else {
                                    if (!class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                       return false;
                                    }

                                    arg0 += var20;
                                    arg4 += var21;
                                    arg7 += var25;
                                    arg6 += class243.field3041;
                                 }
                              }
                           }
                        } else {
                           arg8 -= arg3;
                           arg3 -= arg6;
                           arg6 = class243.field3041 * arg6;
                           if (var10) {
                              if (!class482.method3508((arg4 >> 12) + -1, (arg0 >> 12) - -1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                 return false;
                              }

                              arg4 += var21;
                              arg0 += var20;
                              arg7 += var25;
                              arg6 += class243.field3041;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (arg3 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class482.method3508((arg1 >> 12) + -1, (arg0 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                             return false;
                                          }

                                          arg0 += var20;
                                          arg7 += var25;
                                          arg6 += class243.field3041;
                                          arg1 += var22;
                                       }

                                       while(true) {
                                          --arg8;
                                          if (arg8 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class482.method3508((arg1 >> 12) + -1, (arg0 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg0 += var20;
                                          arg7 += var25;
                                          arg6 += class243.field3041;
                                          arg1 += var22;
                                       }
                                    }

                                    arg6 += class243.field3041;
                                 } else {
                                    if (!class482.method3508((arg4 >> 12) + -1, (arg0 >> 12) - -1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                       return false;
                                    }

                                    arg4 += var21;
                                    arg0 += var20;
                                    arg7 += var25;
                                    arg6 += class243.field3041;
                                 }
                              }
                           }
                        }
                     } else {
                        arg1 = arg4 <<= 12;
                        if (~arg6 > -1) {
                           arg7 -= arg6 * var25;
                           arg4 -= arg6 * var21;
                           arg1 -= arg6 * var20;
                           arg6 = 0;
                        }

                        arg0 <<= 12;
                        if (arg8 < 0) {
                           arg0 -= arg8 * var22;
                           arg8 = 0;
                        }

                        if (~var20 > ~var21) {
                           arg3 -= arg8;
                           arg8 -= arg6;
                           arg6 = class243.field3041 * arg6;
                           if (var10) {
                              if (!class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                 return false;
                              }

                              arg7 += var25;
                              arg6 += class243.field3041;
                              arg1 += var20;
                              arg4 += var21;
                           }

                           while(true) {
                              while(true) {
                                 --arg8;
                                 if (arg8 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                             return false;
                                          }

                                          arg6 += class243.field3041;
                                          arg0 += var22;
                                          arg4 += var21;
                                          arg7 += var25;
                                       }

                                       while(true) {
                                          --arg3;
                                          if (~arg3 > -1) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class482.method3508((arg0 >> 12) + -1, (arg4 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg6 += class243.field3041;
                                          arg0 += var22;
                                          arg4 += var21;
                                          arg7 += var25;
                                       }
                                    }

                                    arg4 += var21;
                                 } else {
                                    if (!class482.method3508((arg1 >> 12) + -1, (arg4 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                       return false;
                                    }

                                    arg7 += var25;
                                    arg6 += class243.field3041;
                                    arg1 += var20;
                                    arg4 += var21;
                                 }
                              }
                           }
                        } else {
                           arg3 -= arg8;
                           arg8 -= arg6;
                           arg6 = class243.field3041 * arg6;
                           if (var10) {
                              if (!class482.method3508((arg4 >> 12) + -1, (arg1 >> 12) - -1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                 return false;
                              }

                              arg7 += var25;
                              arg6 += class243.field3041;
                              arg4 += var21;
                              arg1 += var20;
                           }

                           while(true) {
                              while(true) {
                                 --arg8;
                                 if (arg8 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class482.method3508((arg4 >> 12) + -1, (arg0 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                             return false;
                                          }

                                          arg7 += var25;
                                          arg6 += class243.field3041;
                                          arg4 += var21;
                                          arg0 += var22;
                                       }

                                       while(true) {
                                          --arg3;
                                          if (arg3 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class482.method3508((arg4 >> 12) + -1, (arg0 >> 12) + 1, 0, arg6, var24, class793.field11583, (byte)125, arg7);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg7 += var25;
                                          arg6 += class243.field3041;
                                          arg4 += var21;
                                          arg0 += var22;
                                       }
                                    }

                                    arg1 += var20;
                                 } else {
                                    if (!class482.method3508((arg4 >> 12) + -1, (arg1 >> 12) - -1, 0, arg6, var24, class793.field11583, (byte)125, arg7)) {
                                       return false;
                                    }

                                    arg7 += var25;
                                    arg6 += class243.field3041;
                                    arg4 += var21;
                                    arg1 += var20;
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
         throw class534.method3846(var27, field7292[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(ILqh;B)Lop;"
   )
   public static final class201 method3839(int arg0, class74 arg1, byte arg2) {
      try {
         ++field7291;
         byte[] var3 = arg1.method733(arg0, (byte)-71);
         if (var3 == null) {
            return null;
         } else {
            if (arg2 != -48) {
               method3837(-125);
            }

            return new class201(var3);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7292[1] + arg0 + ',' + (arg1 != null ? field7292[0] : field7292[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3840(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3841(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
