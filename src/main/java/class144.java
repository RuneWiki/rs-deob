import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class144 extends class557 {
   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2292 = new String[]{method1434(method1433(",Z\fIYe")), method1434(method1433(",Z\fI^e")), method1434(method1433("6\u0010CIb")), method1434(method1433("#K\u0001\u000b")), method1434(method1433(",Z\fI\\e")), method1434(method1433(",Z\fI]e")), method1434(method1433(",Z\fIWe")), method1434(method1433(",Z\fIZe")), method1434(method1433(",Z\fIUe")), method1434(method1433(",Z\fIVe")), method1434(method1433(",Z\fIXe")), method1434(method1433(",Z\fI[e"))};
   @OriginalMember(
      owner = "client!ada",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field2290 = false;
   @OriginalMember(
      owner = "client!ada",
      name = "o",
      descriptor = "Liw;"
   )
   public static class107 field2280 = new class107(30);
   @OriginalMember(
      owner = "client!ada",
      name = "i",
      descriptor = "Lhha;"
   )
   public static class724 field2291 = new class724(37, 4);
   @OriginalMember(
      owner = "client!ada",
      name = "q",
      descriptor = "I"
   )
   public static int field2281;
   @OriginalMember(
      owner = "client!ada",
      name = "j",
      descriptor = "I"
   )
   public static int field2282;
   @OriginalMember(
      owner = "client!ada",
      name = "l",
      descriptor = "I"
   )
   public static int field2283;
   @OriginalMember(
      owner = "client!ada",
      name = "s",
      descriptor = "I"
   )
   public static int field2284;
   @OriginalMember(
      owner = "client!ada",
      name = "h",
      descriptor = "I"
   )
   public static int field2285;
   @OriginalMember(
      owner = "client!ada",
      name = "n",
      descriptor = "I"
   )
   public static int field2286;
   @OriginalMember(
      owner = "client!ada",
      name = "m",
      descriptor = "I"
   )
   public static int field2287;
   @OriginalMember(
      owner = "client!ada",
      name = "k",
      descriptor = "I"
   )
   public static int field2288;
   @OriginalMember(
      owner = "client!ada",
      name = "p",
      descriptor = "I"
   )
   public static int field2289;

   @OriginalMember(
      owner = "client!ada",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class144(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ada",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1427(int arg0) {
      try {
         if (arg0 > -52) {
            this.method98((byte)77);
         }

         ++field2289;
         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2292[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field2283;
         if (super.field7905 != 1 && super.field7905 != 0) {
            super.field7905 = this.method97(0);
         }

         if (arg0 != -22) {
            this.method1427(36);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2292[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "(B)I"
   )
   public static final int method1428(byte arg0) {
      try {
         if (arg0 < 67) {
            method1431(96);
         }

         ++field2285;
         return ~class217.field3113 == -2 ? class515.field7310 : class682.field9878;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2292[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field2288;
         super.field7905 = arg0;
         if (!arg1) {
            method1430('h', (byte)-27);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2292[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field2284;
         if (arg0 != 0) {
            this.method98((byte)65);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2292[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class144(int arg0, class647 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1429(byte arg0) {
      try {
         field2280 = null;
         field2291 = null;
         if (arg0 < 111) {
            field2291 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2292[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(CB)B"
   )
   public static final byte method1430(char arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2282;
         if (arg1 != 97) {
            return -67;
         } else {
            byte var3;
            if (~arg0 < -1 && ~arg0 > -129 || ~arg0 <= -161 && arg0 <= 255) {
               var3 = (byte)arg0;
               if (!var2) {
                  return var3;
               }
            }

            if (arg0 != 8364) {
               if (arg0 == 8218) {
                  var3 = -126;
                  if (!var2) {
                     return var3;
                  }
               }

               if (~arg0 != -403) {
                  if (arg0 == 8222) {
                     var3 = -124;
                     if (!var2) {
                        return var3;
                     }
                  }

                  if (~arg0 == -8231) {
                     var3 = -123;
                     if (!var2) {
                        return var3;
                     }
                  }

                  if (~arg0 != -8225) {
                     if (~arg0 == -8226) {
                        var3 = -121;
                        if (!var2) {
                           return var3;
                        }
                     }

                     if (arg0 == 710) {
                        var3 = -120;
                        if (!var2) {
                           return var3;
                        }
                     }

                     if (~arg0 != -8241) {
                        if (~arg0 != -353) {
                           if (~arg0 == -8250) {
                              var3 = -117;
                              if (!var2) {
                                 return var3;
                              }
                           }

                           if (arg0 != 338) {
                              if (~arg0 != -382) {
                                 if (~arg0 != -8217) {
                                    if (arg0 != 8217) {
                                       if (arg0 != 8220) {
                                          if (~arg0 == -8222) {
                                             var3 = -108;
                                             if (!var2) {
                                                return var3;
                                             }
                                          }

                                          if (~arg0 != -8227) {
                                             if (arg0 != 8211) {
                                                if (arg0 == 8212) {
                                                   var3 = -105;
                                                   if (!var2) {
                                                      return var3;
                                                   }
                                                }

                                                if (~arg0 != -733) {
                                                   if (~arg0 == -8483) {
                                                      var3 = -103;
                                                      if (!var2) {
                                                         return var3;
                                                      }
                                                   }

                                                   if (arg0 == 353) {
                                                      var3 = -102;
                                                      if (!var2) {
                                                         return var3;
                                                      }
                                                   }

                                                   if (~arg0 != -8251) {
                                                      if (arg0 == 339) {
                                                         var3 = -100;
                                                         if (!var2) {
                                                            return var3;
                                                         }
                                                      }

                                                      if (~arg0 == -383) {
                                                         var3 = -98;
                                                         if (!var2) {
                                                            return var3;
                                                         }
                                                      }

                                                      if (arg0 != 376) {
                                                         var3 = 63;
                                                         if (!var2) {
                                                            return var3;
                                                         }
                                                      }

                                                      var3 = -97;
                                                      if (!var2) {
                                                         return var3;
                                                      }
                                                   }

                                                   var3 = -101;
                                                   if (!var2) {
                                                      return var3;
                                                   }
                                                }

                                                var3 = -104;
                                                if (!var2) {
                                                   return var3;
                                                }
                                             }

                                             var3 = -106;
                                             if (!var2) {
                                                return var3;
                                             }
                                          }

                                          var3 = -107;
                                          if (!var2) {
                                             return var3;
                                          }
                                       }

                                       var3 = -109;
                                       if (!var2) {
                                          return var3;
                                       }
                                    }

                                    var3 = -110;
                                    if (!var2) {
                                       return var3;
                                    }
                                 }

                                 var3 = -111;
                                 if (!var2) {
                                    return var3;
                                 }
                              }

                              var3 = -114;
                              if (!var2) {
                                 return var3;
                              }
                           }

                           var3 = -116;
                           if (!var2) {
                              return var3;
                           }
                        }

                        var3 = -118;
                        if (!var2) {
                           return var3;
                        }
                     }

                     var3 = -119;
                     if (!var2) {
                        return var3;
                     }
                  }

                  var3 = -122;
                  if (!var2) {
                     return var3;
                  }
               }

               var3 = -125;
               if (!var2) {
                  return var3;
               }
            }

            var3 = -128;
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2292[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "(I)[Ljm;"
   )
   public static final class483[] method1431(int arg0) {
      try {
         if (arg0 != 99) {
            return null;
         } else {
            ++field2281;
            return new class483[]{class609.field8675, class225.field3195, class451.field6581};
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2292[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field2287;
         if (arg0 != 1) {
            this.method92(-105, -58);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2292[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(IIIIIIILbc;III)Z"
   )
   public static final boolean method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class663 arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field10022;

      try {
         ++field2286;
         if (arg8 != 2) {
            method1432(-105, -78, 93, 85, -92, 93, -121, (class663)null, 4, 83, 118);
         }

         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg3;
         class182.field2674[var14][var15] = 99;
         int var17 = -var15 + arg5;
         class646.field9094[var14][var15] = 0;
         byte var18 = 0;
         int var19 = 0;
         class182.field2678[var18] = arg3;
         int var28 = var18 + 1;
         class386.field5627[var18] = arg5;
         int[][] var20 = arg7.field9352;
         if (!var11 && var28 == var19) {
            class622.field8888 = arg5;
            class188.field2771 = arg3;
            return false;
         } else {
            int var12;
            int var13;
            label218:
            do {
               var13 = class386.field5627[var19];
               var12 = class182.field2678[var19];
               int var21 = -var17 + var13;
               int var22 = -var16 + var12;
               int var23 = -arg7.field9348 + var13;
               int var24 = -arg7.field9344 + var12;
               var19 = var19 + 1 & 4095;
               int var25 = arg9;
               int var10000 = arg9;
               byte var29 = -4;

               do {
                  if (var10000 != var29) {
                     if (~var25 != 2) {
                        if (~var25 != 1) {
                           if (var25 != -1) {
                              label205: {
                                 if (var25 != 0 && ~var25 != -2 && var25 != 2 && var25 != 3) {
                                    if (var25 != 9) {
                                       if (arg7.method4807(arg1, arg9, var13, arg2, arg10, 1, var12, -76)) {
                                          class188.field2771 = var12;
                                          class622.field8888 = var13;
                                          return true;
                                       }
                                       break label205;
                                    }

                                    if (var11) {
                                       if (~arg2 == ~var12 && arg10 == var13) {
                                          class622.field8888 = var13;
                                          class188.field2771 = var12;
                                          return true;
                                       }
                                       break label205;
                                    }
                                 }

                                 if (arg7.method4813(arg2, arg10, 1, var13, arg9, 633, arg1, var12)) {
                                    class188.field2771 = var12;
                                    class622.field8888 = var13;
                                    return true;
                                 }
                              }
                           } else if (arg7.method4817(arg0, arg6, var13, arg4, arg2, 2665, 1, arg10, var12)) {
                              class622.field8888 = var13;
                              class188.field2771 = var12;
                              return true;
                           }
                        } else if (arg7.method4814(var12, arg0, 1, var13, arg2, arg4, 1, arg10, arg6, (byte)117)) {
                           class188.field2771 = var12;
                           class622.field8888 = var13;
                           return true;
                        }
                     } else if (class380.method2965(arg0, 1, arg10, 1, arg6, var12, var13, arg2, true)) {
                        class188.field2771 = var12;
                        class622.field8888 = var13;
                        return true;
                     }
                  } else if (~arg2 == ~var12 && arg10 == var13) {
                     class622.field8888 = var13;
                     class188.field2771 = var12;
                     return true;
                  }

                  var25 = class646.field9094[var22][var21] + 1;
                  if (var22 > 0 && class182.field2674[var22 - 1][var21] == 0 && (1109655552 & var20[var24 + -1][var23]) == 0) {
                     class182.field2678[var28] = var12 + -1;
                     class386.field5627[var28] = var13;
                     class182.field2674[var22 - 1][var21] = 2;
                     var28 = 4095 & var28 + 1;
                     class646.field9094[var22 + -1][var21] = var25;
                  }

                  if (~var22 > -128 && ~class182.field2674[var22 - -1][var21] == -1 && (1612972032 & var20[var24 + 1][var23]) == 0) {
                     class182.field2678[var28] = var12 + 1;
                     class386.field5627[var28] = var13;
                     var28 = 4095 & var28 - -1;
                     class182.field2674[var22 + 1][var21] = 8;
                     class646.field9094[var22 + 1][var21] = var25;
                  }

                  if (~var21 < -1 && ~class182.field2674[var22][var21 + -1] == -1 && ~(var20[var24][var23 + -1] & 1084489728) == -1) {
                     class182.field2678[var28] = var12;
                     class386.field5627[var28] = var13 + -1;
                     class182.field2674[var22][var21 + -1] = 1;
                     var28 = 4095 & var28 + 1;
                     class646.field9094[var22][var21 - 1] = var25;
                  }

                  if (~var21 > -128 && ~class182.field2674[var22][var21 + 1] == -1 && ~(var20[var24][var23 + 1] & 1210318848) == -1) {
                     class182.field2678[var28] = var12;
                     class386.field5627[var28] = var13 + 1;
                     var28 = 4095 & var28 + 1;
                     class182.field2674[var22][var21 + 1] = 4;
                     class646.field9094[var22][var21 + 1] = var25;
                  }

                  if (~var22 < -1 && var21 > 0 && ~class182.field2674[var22 + -1][var21 + -1] == -1 && ~(1134821376 & var20[var24 + -1][var23 + -1]) == -1 && (1109655552 & var20[var24 - 1][var23]) == 0 && (1084489728 & var20[var24][var23 + -1]) == 0) {
                     class182.field2678[var28] = var12 + -1;
                     class386.field5627[var28] = var13 + -1;
                     class182.field2674[var22 + -1][var21 - 1] = 3;
                     var28 = 4095 & var28 + 1;
                     class646.field9094[var22 + -1][var21 + -1] = var25;
                  }

                  if (~var22 > -128 && ~var21 < -1 && ~class182.field2674[var22 + 1][var21 + -1] == -1 && (1625554944 & var20[var24 + 1][var23 - 1]) == 0 && (1612972032 & var20[var24 - -1][var23]) == 0 && ~(1084489728 & var20[var24][var23 + -1]) == -1) {
                     class182.field2678[var28] = var12 + 1;
                     class386.field5627[var28] = var13 + -1;
                     class182.field2674[var22 - -1][var21 - 1] = 9;
                     var28 = var28 - -1 & 4095;
                     class646.field9094[var22 + 1][var21 + -1] = var25;
                  }

                  if (var22 > 0 && var21 < 127 && class182.field2674[var22 + -1][var21 - -1] == 0 && (var20[var24 + -1][var23 + 1] & 1310982144) == 0 && ~(var20[var24 - 1][var23] & 1109655552) == -1 && ~(1210318848 & var20[var24][var23 - -1]) == -1) {
                     class182.field2678[var28] = var12 + -1;
                     class386.field5627[var28] = var13 - -1;
                     var28 = var28 + 1 & 4095;
                     class182.field2674[var22 + -1][var21 + 1] = 6;
                     class646.field9094[var22 + -1][var21 + 1] = var25;
                  }

                  if (~var22 <= -128) {
                     continue label218;
                  }

                  var10000 = var21;
                  var29 = 127;
               } while(var11);

               if (var21 < 127 && ~class182.field2674[var22 + 1][var21 + 1] == -1 && (2015625216 & var20[var24 + 1][var23 + 1]) == 0 && ~(1612972032 & var20[var24 + 1][var23]) == -1 && ~(1210318848 & var20[var24][var23 + 1]) == -1) {
                  class182.field2678[var28] = var12 + 1;
                  class386.field5627[var28] = var13 + 1;
                  var28 = 4095 & var28 - -1;
                  class182.field2674[var22 - -1][var21 + 1] = 12;
                  class646.field9094[var22 + 1][var21 - -1] = var25;
               }
            } while(var28 != var19);

            class622.field8888 = var13;
            class188.field2771 = var12;
            return false;
         }
      } catch (RuntimeException var27) {
         throw class612.method4503(var27, field2292[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2292[2] : field2292[3]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1433(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1434(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
