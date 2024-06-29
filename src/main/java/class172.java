import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class172 {
   @OriginalMember(
      owner = "client!aq",
      name = "c",
      descriptor = "Lkd;"
   )
   public class297 field2387;
   @OriginalMember(
      owner = "client!aq",
      name = "l",
      descriptor = "Lkd;"
   )
   public class297 field2386;
   @OriginalMember(
      owner = "client!aq",
      name = "i",
      descriptor = "[Lfc;"
   )
   public class272[] field2397;
   @OriginalMember(
      owner = "client!aq",
      name = "k",
      descriptor = "[Lfc;"
   )
   private class272[] field2396;
   @OriginalMember(
      owner = "client!aq",
      name = "j",
      descriptor = "Lsc;"
   )
   private class369 field2391;
   @OriginalMember(
      owner = "client!aq",
      name = "d",
      descriptor = "Z"
   )
   public boolean field2393;
   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2398 = new String[]{method1403(method1402("+/\u0010*\u0010")), method1403(method1402("+/\u0010-\u0010")), method1403(method1402("+/\u0010SQ$7JQ\u0010")), method1403(method1402("1p\u0010AE")), method1403(method1402("$+R\u0003")), method1403(method1402("+/\u0010,\u0010")), method1403(method1402("+/\u0010+\u0010")), method1403(method1402("+/\u0010.\u0010"))};
   @OriginalMember(
      owner = "client!aq",
      name = "g",
      descriptor = "I"
   )
   public static int field2388;
   @OriginalMember(
      owner = "client!aq",
      name = "f",
      descriptor = "I"
   )
   public static int field2389;
   @OriginalMember(
      owner = "client!aq",
      name = "h",
      descriptor = "I"
   )
   public static int field2390;
   @OriginalMember(
      owner = "client!aq",
      name = "e",
      descriptor = "I"
   )
   public static int field2392;
   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "I"
   )
   public static int field2394;
   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "I"
   )
   public static int field2395;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(BIIIIIIIII)Z"
   )
   public static final boolean method1397(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4360;

      try {
         ++field2389;
         if (arg9 <= 2000 && arg7 <= 2000 && ~arg2 >= -2001 && ~arg1 >= -2001 && ~arg6 >= -2001 && arg5 <= 2000) {
            if (arg9 >= -2000 && ~arg7 <= 1999 && arg2 >= -2000 && ~arg1 <= 1999 && ~arg6 <= 1999 && ~arg5 <= 1999) {
               if (class73.field903 == 2) {
                  int var11 = class533.field7596 * arg9 + arg1;
                  if (~var11 <= -1 && var11 < class139.field1774.length && ~class139.field1774[var11] < ~((arg4 << 8) + -38400)) {
                     return false;
                  }

                  int var12 = arg6 - -(class533.field7596 * arg7);
                  if (~var12 <= -1 && ~class139.field1774.length < ~var12 && ~((arg3 << 8) + -38400) > ~class139.field1774[var12]) {
                     return false;
                  }

                  int var13 = class533.field7596 * arg2 + arg5;
                  if (~var13 <= -1 && class139.field1774.length > var13 && ~class139.field1774[var13] < ~((arg8 << 8) + -38400)) {
                     return false;
                  }
               }

               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               label1211: {
                  var14 = -arg1 + arg6;
                  var15 = -arg9 + arg7;
                  var16 = -arg1 + arg5;
                  var17 = -arg9 + arg2;
                  var18 = arg3 - arg4;
                  var19 = arg8 - arg4;
                  if (~arg7 >= ~arg9 || ~arg2 >= ~arg2) {
                     if (~arg2 < ~arg7) {
                        --arg7;
                        if (arg2 >= arg9) {
                           ++arg2;
                           if (!var10) {
                              break label1211;
                           }
                        }

                        ++arg9;
                        if (!var10) {
                           break label1211;
                        }
                     }

                     --arg2;
                     if (~arg9 < ~arg7) {
                        ++arg9;
                        if (!var10) {
                           break label1211;
                        }
                     }

                     ++arg7;
                     if (!var10) {
                        break label1211;
                     }
                  }

                  label1078: {
                     if (~arg7 < ~arg2) {
                        ++arg7;
                        if (!var10) {
                           break label1078;
                        }
                     }

                     ++arg2;
                  }

                  --arg9;
               }

               if (arg0 != -94) {
                  return true;
               } else {
                  int var20 = 0;
                  if (arg7 != arg9) {
                     var20 = (-arg1 + arg6 << 12) / (-arg9 + arg7);
                  }

                  int var21 = 0;
                  if (~arg2 != ~arg7) {
                     var21 = (-arg6 + arg5 << 12) / (-arg7 + arg2);
                  }

                  int var22 = 0;
                  if (arg2 != arg9) {
                     var22 = (arg1 - arg5 << 12) / (-arg2 + arg9);
                  }

                  int var23 = var14 * var17 + -(var15 * var16);
                  if (~var23 == -1) {
                     return false;
                  } else {
                     int var24 = (var17 * var18 + -(var15 * var19) << 8) / var23;
                     int var25 = (var14 * var19 + -(var16 * var18) << 8) / var23;
                     boolean var10000;
                     if (arg9 <= arg7 && ~arg9 >= ~arg2) {
                        if (~class408.field5905 >= ~arg9) {
                           return true;
                        } else {
                           if (class408.field5905 < arg7) {
                              arg7 = class408.field5905;
                           }

                           if (~arg2 < ~class408.field5905) {
                              arg2 = class408.field5905;
                           }

                           arg4 = (arg4 << 8) - (arg1 * var24 - var24);
                           if (~arg2 >= ~arg7) {
                              arg6 = arg1 <<= 12;
                              arg5 <<= 12;
                              if (arg9 < 0) {
                                 arg6 -= arg9 * var22;
                                 arg4 -= arg9 * var25;
                                 arg1 -= arg9 * var20;
                                 arg9 = 0;
                              }

                              if (~arg2 > -1) {
                                 arg5 -= arg2 * var21;
                                 arg2 = 0;
                              }

                              if (arg2 != arg9 && var20 > var22 || arg2 == arg9 && ~var21 < ~var20) {
                                 arg7 -= arg2;
                                 arg2 -= arg9;
                                 arg9 = class533.field7596 * arg9;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg9, (arg1 >> 12) - -1, arg4, (byte)-110)) {
                                       return false;
                                    }

                                    arg6 += var22;
                                    arg9 += class533.field7596;
                                    arg1 += var20;
                                    arg4 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg2;
                                       if (~arg2 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg9, (arg1 >> 12) + 1, arg4, (byte)60)) {
                                                   return false;
                                                }

                                                arg1 += var20;
                                                arg5 += var21;
                                                arg4 += var25;
                                                arg9 += class533.field7596;
                                             }

                                             while(true) {
                                                --arg7;
                                                if (arg7 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg9, (arg1 >> 12) + 1, arg4, (byte)60);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg1 += var20;
                                                arg5 += var21;
                                                arg4 += var25;
                                                arg9 += class533.field7596;
                                             }
                                          }

                                          arg4 += var25;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg9, (arg1 >> 12) - -1, arg4, (byte)-110)) {
                                             return false;
                                          }

                                          arg6 += var22;
                                          arg9 += class533.field7596;
                                          arg1 += var20;
                                          arg4 += var25;
                                       }
                                    }
                                 }
                              } else {
                                 arg7 -= arg2;
                                 arg2 -= arg9;
                                 arg9 = class533.field7596 * arg9;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg9, (arg6 >> 12) - -1, arg4, (byte)86)) {
                                       return false;
                                    }

                                    arg1 += var20;
                                    arg6 += var22;
                                    arg4 += var25;
                                    arg9 += class533.field7596;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg2;
                                       if (arg2 < 0) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg9, (arg5 >> 12) + 1, arg4, (byte)-119)) {
                                                   return false;
                                                }

                                                arg4 += var25;
                                                arg5 += var21;
                                                arg1 += var20;
                                                arg9 += class533.field7596;
                                             }

                                             while(true) {
                                                --arg7;
                                                if (~arg7 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg9, (arg5 >> 12) + 1, arg4, (byte)-119);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg4 += var25;
                                                arg5 += var21;
                                                arg1 += var20;
                                                arg9 += class533.field7596;
                                             }
                                          }

                                          arg9 += class533.field7596;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg9, (arg6 >> 12) - -1, arg4, (byte)86)) {
                                             return false;
                                          }

                                          arg1 += var20;
                                          arg6 += var22;
                                          arg4 += var25;
                                          arg9 += class533.field7596;
                                       }
                                    }
                                 }
                              }
                           } else {
                              arg5 = arg1 <<= 12;
                              arg6 <<= 12;
                              if (arg9 < 0) {
                                 arg5 -= arg9 * var22;
                                 arg4 -= arg9 * var25;
                                 arg1 -= arg9 * var20;
                                 arg9 = 0;
                              }

                              if (arg7 < 0) {
                                 arg6 -= arg7 * var21;
                                 arg7 = 0;
                              }

                              if ((arg7 == arg9 || var22 >= var20) && (~arg7 != ~arg9 || var21 >= var22)) {
                                 arg2 -= arg7;
                                 arg7 -= arg9;
                                 arg9 = class533.field7596 * arg9;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg9, (arg5 >> 12) + 1, arg4, (byte)27)) {
                                       return false;
                                    }

                                    arg1 += var20;
                                    arg5 += var22;
                                    arg9 += class533.field7596;
                                    arg4 += var25;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg7;
                                       if (arg7 < 0) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg9, (arg5 >> 12) - -1, arg4, (byte)-126)) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg4 += var25;
                                                arg6 += var21;
                                                arg9 += class533.field7596;
                                             }

                                             while(true) {
                                                --arg2;
                                                if (arg2 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg9, (arg5 >> 12) - -1, arg4, (byte)-126);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg4 += var25;
                                                arg6 += var21;
                                                arg9 += class533.field7596;
                                             }
                                          }

                                          arg4 += var25;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg9, (arg5 >> 12) + 1, arg4, (byte)27)) {
                                             return false;
                                          }

                                          arg1 += var20;
                                          arg5 += var22;
                                          arg9 += class533.field7596;
                                          arg4 += var25;
                                       }
                                    }
                                 }
                              } else {
                                 arg2 -= arg7;
                                 arg7 -= arg9;
                                 arg9 = class533.field7596 * arg9;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) - 1, arg9, (arg1 >> 12) + 1, arg4, (byte)25)) {
                                       return false;
                                    }

                                    arg9 += class533.field7596;
                                    arg5 += var22;
                                    arg4 += var25;
                                    arg1 += var20;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg7;
                                       if (~arg7 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg9, (arg6 >> 12) + 1, arg4, (byte)2)) {
                                                   return false;
                                                }

                                                arg9 += class533.field7596;
                                                arg4 += var25;
                                                arg6 += var21;
                                                arg5 += var22;
                                             }

                                             while(true) {
                                                --arg2;
                                                if (~arg2 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg9, (arg6 >> 12) + 1, arg4, (byte)2);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg9 += class533.field7596;
                                                arg4 += var25;
                                                arg6 += var21;
                                                arg5 += var22;
                                             }
                                          }

                                          arg1 += var20;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) - 1, arg9, (arg1 >> 12) + 1, arg4, (byte)25)) {
                                             return false;
                                          }

                                          arg9 += class533.field7596;
                                          arg5 += var22;
                                          arg4 += var25;
                                          arg1 += var20;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if (~arg7 < ~arg2) {
                        if (class408.field5905 <= arg2) {
                           return true;
                        } else {
                           arg8 = (arg8 << 8) + -(arg5 * var24) + var24;
                           if (~arg7 < ~class408.field5905) {
                              arg7 = class408.field5905;
                           }

                           if (~arg9 < ~class408.field5905) {
                              arg9 = class408.field5905;
                           }

                           if (~arg7 < ~arg9) {
                              arg6 = arg5 <<= 12;
                              if (arg2 < 0) {
                                 arg6 -= arg2 * var21;
                                 arg8 -= arg2 * var25;
                                 arg5 -= arg2 * var22;
                                 arg2 = 0;
                              }

                              arg1 <<= 12;
                              if (~arg9 > -1) {
                                 arg1 -= arg9 * var20;
                                 arg9 = 0;
                              }

                              if (var21 < var22) {
                                 arg7 -= arg9;
                                 arg9 -= arg2;
                                 arg2 = class533.field7596 * arg2;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg2, (arg5 >> 12) + 1, arg8, (byte)-122)) {
                                       return false;
                                    }

                                    arg2 += class533.field7596;
                                    arg6 += var21;
                                    arg8 += var25;
                                    arg5 += var22;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (arg9 < 0) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) - 1, arg2, (arg1 >> 12) + 1, arg8, (byte)29)) {
                                                   return false;
                                                }

                                                arg8 += var25;
                                                arg1 += var20;
                                                arg2 += class533.field7596;
                                                arg6 += var21;
                                             }

                                             while(true) {
                                                --arg7;
                                                if (~arg7 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg6 >> 12) - 1, arg2, (arg1 >> 12) + 1, arg8, (byte)29);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg8 += var25;
                                                arg1 += var20;
                                                arg2 += class533.field7596;
                                                arg6 += var21;
                                             }
                                          }

                                          arg5 += var22;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg2, (arg5 >> 12) + 1, arg8, (byte)-122)) {
                                             return false;
                                          }

                                          arg2 += class533.field7596;
                                          arg6 += var21;
                                          arg8 += var25;
                                          arg5 += var22;
                                       }
                                    }
                                 }
                              } else {
                                 arg7 -= arg9;
                                 arg9 -= arg2;
                                 arg2 = class533.field7596 * arg2;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg2, (arg6 >> 12) + 1, arg8, (byte)-111)) {
                                       return false;
                                    }

                                    arg6 += var21;
                                    arg5 += var22;
                                    arg8 += var25;
                                    arg2 += class533.field7596;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg9;
                                       if (~arg9 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg2, (arg6 >> 12) + 1, arg8, (byte)-106)) {
                                                   return false;
                                                }

                                                arg2 += class533.field7596;
                                                arg6 += var21;
                                                arg1 += var20;
                                                arg8 += var25;
                                             }

                                             while(true) {
                                                --arg7;
                                                if (~arg7 > -1) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg2, (arg6 >> 12) + 1, arg8, (byte)-106);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg2 += class533.field7596;
                                                arg6 += var21;
                                                arg1 += var20;
                                                arg8 += var25;
                                             }
                                          }

                                          arg2 += class533.field7596;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg2, (arg6 >> 12) + 1, arg8, (byte)-111)) {
                                             return false;
                                          }

                                          arg6 += var21;
                                          arg5 += var22;
                                          arg8 += var25;
                                          arg2 += class533.field7596;
                                       }
                                    }
                                 }
                              }
                           } else {
                              arg1 = arg5 <<= 12;
                              if (arg2 < 0) {
                                 arg8 -= arg2 * var25;
                                 arg1 -= arg2 * var21;
                                 arg5 -= arg2 * var22;
                                 arg2 = 0;
                              }

                              arg6 <<= 12;
                              if (~arg7 > -1) {
                                 arg6 -= arg7 * var20;
                                 arg7 = 0;
                              }

                              if (var22 > var21) {
                                 arg9 -= arg7;
                                 arg7 -= arg2;
                                 arg2 = class533.field7596 * arg2;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg2, (arg5 >> 12) + 1, arg8, (byte)-121)) {
                                       return false;
                                    }

                                    arg2 += class533.field7596;
                                    arg8 += var25;
                                    arg5 += var22;
                                    arg1 += var21;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg7;
                                       if (~arg7 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg2, (arg5 >> 12) + 1, arg8, (byte)119)) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg2 += class533.field7596;
                                                arg6 += var20;
                                                arg8 += var25;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg2, (arg5 >> 12) + 1, arg8, (byte)119);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg5 += var22;
                                                arg2 += class533.field7596;
                                                arg6 += var20;
                                                arg8 += var25;
                                             }
                                          }

                                          arg1 += var21;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg2, (arg5 >> 12) + 1, arg8, (byte)-121)) {
                                             return false;
                                          }

                                          arg2 += class533.field7596;
                                          arg8 += var25;
                                          arg5 += var22;
                                          arg1 += var21;
                                       }
                                    }
                                 }
                              } else {
                                 arg9 -= arg7;
                                 arg7 -= arg2;
                                 arg2 = class533.field7596 * arg2;
                                 if (var10) {
                                    if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg2, (arg1 >> 12) + 1, arg8, (byte)27)) {
                                       return false;
                                    }

                                    arg8 += var25;
                                    arg1 += var21;
                                    arg2 += class533.field7596;
                                    arg5 += var22;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg7;
                                       if (~arg7 > -1) {
                                          if (!var10) {
                                             if (var10) {
                                                if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg2, (arg6 >> 12) + 1, arg8, (byte)-98)) {
                                                   return false;
                                                }

                                                arg6 += var20;
                                                arg8 += var25;
                                                arg5 += var22;
                                                arg2 += class533.field7596;
                                             }

                                             while(true) {
                                                --arg9;
                                                if (arg9 < 0) {
                                                   var10000 = true;
                                                   if (!var10) {
                                                      return true;
                                                   }
                                                } else {
                                                   var10000 = class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg2, (arg6 >> 12) + 1, arg8, (byte)-98);
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }

                                                arg6 += var20;
                                                arg8 += var25;
                                                arg5 += var22;
                                                arg2 += class533.field7596;
                                             }
                                          }

                                          arg5 += var22;
                                       } else {
                                          if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg2, (arg1 >> 12) + 1, arg8, (byte)27)) {
                                             return false;
                                          }

                                          arg8 += var25;
                                          arg1 += var21;
                                          arg2 += class533.field7596;
                                          arg5 += var22;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if (~arg7 <= ~class408.field5905) {
                        return true;
                     } else {
                        if (arg9 > class408.field5905) {
                           arg9 = class408.field5905;
                        }

                        arg3 = (arg3 << 8) + var24 + -(arg6 * var24);
                        if (arg2 > class408.field5905) {
                           arg2 = class408.field5905;
                        }

                        if (~arg9 < ~arg2) {
                           arg1 = arg6 <<= 12;
                           if (arg7 < 0) {
                              arg1 -= arg7 * var20;
                              arg3 -= arg7 * var25;
                              arg6 -= arg7 * var21;
                              arg7 = 0;
                           }

                           arg5 <<= 12;
                           if (~arg2 > -1) {
                              arg5 -= arg2 * var22;
                              arg2 = 0;
                           }

                           if (arg2 != arg7 && ~var20 > ~var21 || arg2 == arg7 && var20 > var22) {
                              arg9 -= arg2;
                              arg2 -= arg7;
                              arg7 = class533.field7596 * arg7;
                              if (var10) {
                                 if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg7, (arg6 >> 12) + 1, arg3, (byte)-119)) {
                                    return false;
                                 }

                                 arg6 += var21;
                                 arg1 += var20;
                                 arg7 += class533.field7596;
                                 arg3 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg7, (arg5 >> 12) + 1, arg3, (byte)-120)) {
                                                return false;
                                             }

                                             arg5 += var22;
                                             arg7 += class533.field7596;
                                             arg1 += var20;
                                             arg3 += var25;
                                          }

                                          while(true) {
                                             --arg9;
                                             if (arg9 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg7, (arg5 >> 12) + 1, arg3, (byte)-120);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg5 += var22;
                                             arg7 += class533.field7596;
                                             arg1 += var20;
                                             arg3 += var25;
                                          }
                                       }

                                       arg3 += var25;
                                    } else {
                                       if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg7, (arg6 >> 12) + 1, arg3, (byte)-119)) {
                                          return false;
                                       }

                                       arg6 += var21;
                                       arg1 += var20;
                                       arg7 += class533.field7596;
                                       arg3 += var25;
                                    }
                                 }
                              }
                           } else {
                              arg9 -= arg2;
                              arg2 -= arg7;
                              arg7 = class533.field7596 * arg7;
                              if (var10) {
                                 if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg7, (arg1 >> 12) + 1, arg3, (byte)-118)) {
                                    return false;
                                 }

                                 arg7 += class533.field7596;
                                 arg6 += var21;
                                 arg1 += var20;
                                 arg3 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg7, (arg1 >> 12) + 1, arg3, (byte)40)) {
                                                return false;
                                             }

                                             arg1 += var20;
                                             arg3 += var25;
                                             arg7 += class533.field7596;
                                             arg5 += var22;
                                          }

                                          while(true) {
                                             --arg9;
                                             if (~arg9 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class239.method1837(0, var24, class139.field1774, (arg5 >> 12) + -1, arg7, (arg1 >> 12) + 1, arg3, (byte)40);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg1 += var20;
                                             arg3 += var25;
                                             arg7 += class533.field7596;
                                             arg5 += var22;
                                          }
                                       }

                                       arg3 += var25;
                                    } else {
                                       if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg7, (arg1 >> 12) + 1, arg3, (byte)-118)) {
                                          return false;
                                       }

                                       arg7 += class533.field7596;
                                       arg6 += var21;
                                       arg1 += var20;
                                       arg3 += var25;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg5 = arg6 <<= 12;
                           arg1 <<= 12;
                           if (~arg7 > -1) {
                              arg3 -= arg7 * var25;
                              arg6 -= arg7 * var21;
                              arg5 -= arg7 * var20;
                              arg7 = 0;
                           }

                           if (arg9 < 0) {
                              arg1 -= arg9 * var22;
                              arg9 = 0;
                           }

                           if (~var21 < ~var20) {
                              arg2 -= arg9;
                              arg9 -= arg7;
                              arg7 = class533.field7596 * arg7;
                              if (var10) {
                                 if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) - 1, arg7, (arg6 >> 12) + 1, arg3, (byte)-100)) {
                                    return false;
                                 }

                                 arg6 += var21;
                                 arg3 += var25;
                                 arg7 += class533.field7596;
                                 arg5 += var20;
                              }

                              while(true) {
                                 while(true) {
                                    --arg9;
                                    if (~arg9 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg7, (arg6 >> 12) + 1, arg3, (byte)-93)) {
                                                return false;
                                             }

                                             arg3 += var25;
                                             arg7 += class533.field7596;
                                             arg6 += var21;
                                             arg1 += var22;
                                          }

                                          while(true) {
                                             --arg2;
                                             if (~arg2 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class239.method1837(0, var24, class139.field1774, (arg1 >> 12) + -1, arg7, (arg6 >> 12) + 1, arg3, (byte)-93);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var25;
                                             arg7 += class533.field7596;
                                             arg6 += var21;
                                             arg1 += var22;
                                          }
                                       }

                                       arg5 += var20;
                                    } else {
                                       if (!class239.method1837(0, var24, class139.field1774, (arg5 >> 12) - 1, arg7, (arg6 >> 12) + 1, arg3, (byte)-100)) {
                                          return false;
                                       }

                                       arg6 += var21;
                                       arg3 += var25;
                                       arg7 += class533.field7596;
                                       arg5 += var20;
                                    }
                                 }
                              }
                           } else {
                              arg2 -= arg9;
                              arg9 -= arg7;
                              arg7 = class533.field7596 * arg7;
                              if (var10) {
                                 if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg7, (arg5 >> 12) + 1, arg3, (byte)-118)) {
                                    return false;
                                 }

                                 arg3 += var25;
                                 arg6 += var21;
                                 arg5 += var20;
                                 arg7 += class533.field7596;
                              }

                              while(true) {
                                 while(true) {
                                    --arg9;
                                    if (~arg9 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) - 1, arg7, (arg1 >> 12) + 1, arg3, (byte)66)) {
                                                return false;
                                             }

                                             arg6 += var21;
                                             arg3 += var25;
                                             arg7 += class533.field7596;
                                             arg1 += var22;
                                          }

                                          while(true) {
                                             --arg2;
                                             if (~arg2 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class239.method1837(0, var24, class139.field1774, (arg6 >> 12) - 1, arg7, (arg1 >> 12) + 1, arg3, (byte)66);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg6 += var21;
                                             arg3 += var25;
                                             arg7 += class533.field7596;
                                             arg1 += var22;
                                          }
                                       }

                                       arg7 += class533.field7596;
                                    } else {
                                       if (!class239.method1837(0, var24, class139.field1774, (arg6 >> 12) + -1, arg7, (arg5 >> 12) + 1, arg3, (byte)-118)) {
                                          return false;
                                       }

                                       arg3 += var25;
                                       arg6 += var21;
                                       arg5 += var20;
                                       arg7 += class533.field7596;
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
         throw class237.method1823(var27, field2398[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1398(int arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 > -25) {
            return false;
         } else {
            ++field2392;
            if (this.field2386 == null) {
               if (class588.field8684 == null) {
                  byte[] var3 = class674.method4898(8, 126, new class367(419684), 16.0F, 16, 0.5F, 128, 4.0F, 0.6F, 128, 4.0F);
                  class588.field8684 = class133.method1053(var3, false, (byte)92);
               }

               byte[] var4 = class345.method2527(-64, class588.field8684, false);
               byte[] var5 = new byte[var4.length * 4];
               int var6 = 0;
               int var7 = 0;
               if (var2 || ~var7 > -17) {
                  do {
                     int var8 = var7 * 16384;
                     int var9 = var8;
                     int var10 = 0;
                     if (var2 || ~var10 > -129) {
                        do {
                           int var11 = var10 * 128 + var9;
                           int var12 = (127 & var10 + -1) * 128 + var9;
                           int var13 = var9 - -((127 & var10 + 1) * 128);
                           int var14 = 0;
                           if (var2 || var14 < 128) {
                              do {
                                 float var15 = (float)((255 & var4[var12 + var14]) + -(var4[var13 + var14] & 255));
                                 float var16 = (float)((255 & var4[var11 - -(127 & var14 + -1)]) - (255 & var4[(127 & var14 + 1) + var11]));
                                 float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                                 var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                                 var5[var6++] = (byte)((int)(var17 * 128.0F + 127.0F));
                                 var5[var6++] = (byte)((int)(var15 * var17 + 127.0F));
                                 var5[var6++] = var4[var8++];
                                 ++var14;
                              } while(var14 < 128);
                           }

                           ++var10;
                        } while(~var10 > -129);
                     }

                     ++var7;
                  } while(~var7 > -17);
               }

               this.field2386 = this.field2391.method2580(128, 16, 128, true, var5, class424.field6036);
            }

            return this.field2386 != null;
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field2398[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1399(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         ++field2388;
         int var6 = 0;
         int var7 = arg2;
         int var8 = -arg2;
         byte var9 = -1;
         int var10 = class298.method2224(arg2 + arg3, class457.field6528, class348.field4702, arg0 ^ 23961);
         if (arg0 == -23905) {
            int var11 = class298.method2224(-arg2 + arg3, class457.field6528, class348.field4702, -250);
            class149.method1249(-7, var11, arg4, class341.field4631[arg1], var10);
            int var10000;
            int var10001;
            int var22;
            if (var5) {
               var22 = var9 + 2;
               var10000 = var8;
               var10001 = var22;
            } else {
               if (arg2 <= var6) {
                  return;
               }

               var22 = var9 + 2;
               var10000 = var8;
               var10001 = var22;
            }

            while(true) {
               while(true) {
                  var8 = var10000 + var10001;
                  if (var8 > 0) {
                     --var7;
                     var8 -= var7 << 1;
                     int var12 = -var7 + arg1;
                     int var13 = arg1 + var7;
                     if (var13 >= class245.field3374 && ~var12 >= ~class699.field10237) {
                        int var14 = class298.method2224(arg3 + var6, class457.field6528, class348.field4702, -250);
                        int var15 = class298.method2224(arg3 - var6, class457.field6528, class348.field4702, arg0 ^ 23961);
                        if (~var13 >= ~class699.field10237) {
                           class149.method1249(-7, var15, arg4, class341.field4631[var13], var14);
                        }

                        if (~var12 <= ~class245.field3374) {
                           class149.method1249(-7, var15, arg4, class341.field4631[var12], var14);
                        }
                     }
                  }

                  ++var6;
                  int var16 = -var6 + arg1;
                  int var17 = arg1 + var6;
                  if (var17 < class245.field3374) {
                     break;
                  }

                  var10000 = ~class699.field10237;
                  var10001 = ~var16;
                  if (!var5) {
                     if (var10000 <= var10001) {
                        int var18 = class298.method2224(arg3 + var7, class457.field6528, class348.field4702, arg0 ^ 23961);
                        int var19 = class298.method2224(-var7 + arg3, class457.field6528, class348.field4702, -250);
                        if (var17 <= class699.field10237) {
                           class149.method1249(-7, var19, arg4, class341.field4631[var17], var18);
                        }

                        if (~var16 <= ~class245.field3374) {
                           class149.method1249(-7, var19, arg4, class341.field4631[var16], var18);
                        }
                     }
                     break;
                  }
               }

               if (var7 <= var6) {
                  return;
               }

               var22 += 2;
               var10000 = var8;
               var10001 = var22;
            }
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field2398[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1400(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 21923) {
            return false;
         } else {
            ++field2394;
            return ~(arg0 & 544) == -545 | ~(24 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2398[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1401(int arg0) {
      try {
         ++field2390;
         if (arg0 >= -38) {
            this.field2391 = null;
         }

         if (this.field2393) {
            return this.field2387 != null;
         } else {
            return this.field2397 != null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2398[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "<init>",
      descriptor = "(Lsc;)V"
   )
   public class172(class369 arg0) {
      boolean var2 = client.field4360;
      super();
      this.field2387 = null;
      this.field2386 = null;
      this.field2397 = null;
      this.field2396 = null;

      try {
         this.field2391 = arg0;
         this.field2393 = this.field2391.field5281;
         if (this.field2393 && !this.field2391.method2599(class301.field4117, (byte)111, class227.field3212)) {
            this.field2393 = false;
         }

         if (this.field2393 || this.field2391.method2636(true, class301.field4117, class227.field3212)) {
            class434.method3207((byte)-63);
            if (this.field2393) {
               byte[] var3 = class345.method2527(-116, class212.field3033, false);
               this.field2387 = this.field2391.method2580(128, 16, 128, true, var3, class227.field3212);
               byte[] var4 = class345.method2527(-70, class754.field11177, false);
               this.field2391.method2580(128, 16, 128, true, var4, class227.field3212);
            } else {
               Object var10000;
               int var10001;
               label55: {
                  this.field2397 = new class272[16];
                  int var5 = 0;
                  if (var2) {
                     var10000 = class212.field3033;
                     var10001 = var5 * 128 * 128 * 2;
                  } else if (var5 >= 16) {
                     var10000 = this;
                     var10001 = 16;
                     if (!var2) {
                        break label55;
                     }
                  } else {
                     var10000 = class212.field3033;
                     var10001 = var5 * 128 * 128 * 2;
                  }

                  while(true) {
                     byte[] var6 = class140.method1107(var10000, var10001, 97, 32768);
                     this.field2397[var5] = this.field2391.method2743(128, true, class227.field3212, var6, -5, 128);
                     ++var5;
                     if (var5 >= 16) {
                        var10000 = this;
                        var10001 = 16;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = class212.field3033;
                        var10001 = var5 * 128 * 128 * 2;
                     }
                  }
               }

               ((class172)var10000).field2396 = new class272[var10001];
               int var7 = 0;
               if (var2 || ~var7 > -17) {
                  do {
                     byte[] var8 = class140.method1107(class754.field11177, var7 * 128 * 128 * 2, 109, 32768);
                     this.field2396[var7] = this.field2391.method2743(128, true, class227.field3212, var8, -5, 128);
                     ++var7;
                  } while(~var7 > -17);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2398[2] + (arg0 != null ? field2398[3] : field2398[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1402(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1403(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
