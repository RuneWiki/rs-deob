import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class153 extends class524 {
   @OriginalMember(
      owner = "client!mr",
      name = "F",
      descriptor = "I"
   )
   public int field1923 = 99;
   @OriginalMember(
      owner = "client!mr",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1935 = new String[]{method1270(method1269("4:\u0005\u0007l")), method1270(method1269("7=G.")), method1270(method1269("\"f\u0005l9")), method1270(method1269("4:\u0005\u0004l")), method1270(method1269("4:\u0005\u000bl")), method1270(method1269("4:\u0005\nl")), method1270(method1269("4:\u0005\u0005l")), method1270(method1269("4:\u0005\u0001l")), method1270(method1269("3)]#j5)E%j\u000b=E6-4-")), method1270(method1269("8>J+(8*G'\u0014+'H'7*'Y1")), method1270(method1269("2$")), method1270(method1269("4:\u0005\u0003l")), method1270(method1269("4:\u0005\u0006l")), method1270(method1269("4:\u0005\u0000l")), method1270(method1269("4:\u0005\u000el")), method1270(method1269("4:\u0005\bl")), method1270(method1269("4:\u0005\tl"))};
   @OriginalMember(
      owner = "client!mr",
      name = "V",
      descriptor = "I"
   )
   public static int field1918;
   @OriginalMember(
      owner = "client!mr",
      name = "R",
      descriptor = "I"
   )
   public static int field1919;
   @OriginalMember(
      owner = "client!mr",
      name = "O",
      descriptor = "I"
   )
   public static int field1920;
   @OriginalMember(
      owner = "client!mr",
      name = "W",
      descriptor = "I"
   )
   public static int field1921;
   @OriginalMember(
      owner = "client!mr",
      name = "Q",
      descriptor = "I"
   )
   public static int field1922;
   @OriginalMember(
      owner = "client!mr",
      name = "P",
      descriptor = "I"
   )
   public static int field1924;
   @OriginalMember(
      owner = "client!mr",
      name = "N",
      descriptor = "I"
   )
   public static int field1925;
   @OriginalMember(
      owner = "client!mr",
      name = "S",
      descriptor = "I"
   )
   public static int field1926;
   @OriginalMember(
      owner = "client!mr",
      name = "H",
      descriptor = "I"
   )
   public static int field1927;
   @OriginalMember(
      owner = "client!mr",
      name = "L",
      descriptor = "I"
   )
   public static int field1928;
   @OriginalMember(
      owner = "client!mr",
      name = "J",
      descriptor = "I"
   )
   public static int field1929;
   @OriginalMember(
      owner = "client!mr",
      name = "G",
      descriptor = "I"
   )
   public static int field1930;
   @OriginalMember(
      owner = "client!mr",
      name = "T",
      descriptor = "I"
   )
   public static int field1931;
   @OriginalMember(
      owner = "client!mr",
      name = "U",
      descriptor = "I"
   )
   public static int field1932;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!mr",
      name = "I",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1933;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!mr",
      name = "K",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1934;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1268(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IIIILha;ILega;)V",
      line = 3
   )
   public final void method1256(int arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5, class739 arg6) {
      int var8 = client.field4530;

      try {
         ++field1927;
         class86 var9 = this.method1257(-2, arg1, arg2, arg3, arg5);
         if (var9 != null) {
            label142: {
               class557 var10 = class151.field1896.method5072(30, var9.method350(25061));
               int var11 = var9.method355(-29081);
               int var12 = var9.method358(27);
               if (var10.method4136((byte)-101)) {
                  class155.method1286(var10, arg1, arg3, true, arg2);
               }

               if (var9.method353(1197)) {
                  var9.method354(30494, arg4);
               }

               if (arg5 == 0) {
                  class148.method1220(arg2, arg3, arg1);
                  if (~var10.field8304 != -1) {
                     arg6.method5385(!var10.field8308, arg3, arg1, var11, (byte)-108, var12, var10.field8309);
                  }

                  if (~var10.field8313 != -2) {
                     break label142;
                  }

                  if (var12 != 0) {
                     if (~var12 != -2) {
                        if (var12 == 2) {
                           class528.method3912(1, arg2, arg1, true, arg3 + 1);
                           if (var8 == 0) {
                              break label142;
                           }
                        }

                        if (~var12 != -4) {
                           break label142;
                        }

                        class528.method3912(2, arg2, arg1, true, arg3);
                        if (var8 == 0) {
                           break label142;
                        }
                     }

                     class528.method3912(2, arg2, arg1 + 1, true, arg3);
                     if (var8 == 0) {
                        break label142;
                     }
                  }

                  class528.method3912(1, arg2, arg1, true, arg3);
                  if (var8 == 0) {
                     break label142;
                  }
               }

               if (~arg5 == -2) {
                  class16.method115(arg2, arg3, arg1);
                  if (var8 == 0) {
                     break label142;
                  }
               }

               if (~arg5 == -3) {
                  class126.method1030(arg2, arg3, arg1, field1933 != null ? field1933 : (field1933 = method1268(field1935[10])));
                  if (var10.field8304 != 0 && var10.field8357 + arg3 < super.field7604 && ~super.field7608 < ~(var10.field8357 + arg1) && ~super.field7604 < ~(var10.field8350 + arg3) && ~super.field7608 < ~(arg1 - -var10.field8350)) {
                     arg6.method5380(arg1, var10.field8350, !var10.field8308, var10.field8309, arg3, var12, 100, var10.field8357);
                  }

                  if (var11 != 9) {
                     break label142;
                  }

                  if (~(1 & var12) != -1) {
                     class528.method3912(16, arg2, arg1, true, arg3);
                     if (var8 == 0) {
                        break label142;
                     }
                  }

                  class528.method3912(8, arg2, arg1, true, arg3);
                  if (var8 == 0) {
                     break label142;
                  }
               }

               if (arg5 == 3) {
                  class371.method2885(arg2, arg3, arg1);
                  if (~var10.field8304 == -2) {
                     arg6.method5390(arg1, arg3, -101);
                  }
               }
            }
         }

         int var13 = -81 % ((arg0 - 57) / 50);
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field1935[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1935[2] : field1935[1]) + ',' + arg5 + ',' + (arg6 != null ? field1935[2] : field1935[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "c",
      descriptor = "(IIIII)Lkl;",
      line = 95
   )
   public final class86 method1257(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1932;
         class86 var6 = null;
         if (arg4 == 0) {
            var6 = (class86)class29.method203(arg2, arg3, arg1);
         }

         if (~arg4 == arg0) {
            var6 = (class86)class746.method5435(arg2, arg3, arg1);
         }

         if (~arg4 == -3) {
            var6 = (class86)class660.method4742(arg2, arg3, arg1, field1933 != null ? field1933 : (field1933 = method1268(field1935[10])));
         }

         if (~arg4 == -4) {
            var6 = (class86)class97.method856(arg2, arg3, arg1);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1935[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IIIIIIZILha;ILega;)V",
      line = 118
   )
   public final void method1258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class66 arg8, int arg9, class739 arg10) {
      int var12 = client.field4530;

      try {
         ++field1922;
         if (class261.field3566.field9428.method2175(126) != 0 || class61.method501(arg1, arg4, arg2, class255.field3404, (byte)73)) {
            if (this.field1923 > arg0) {
               this.field1923 = arg0;
            }

            class557 var13 = class151.field1896.method5072(30, arg5);
            if (~class261.field3566.field9467.method2369(103) != -1 || !var13.field8293) {
               int var14;
               int var15;
               label796: {
                  if (arg9 != 1 && arg9 != 3) {
                     var14 = var13.field8350;
                     var15 = var13.field8357;
                     if (var12 == 0) {
                        break label796;
                     }
                  }

                  var15 = var13.field8350;
                  var14 = var13.field8357;
               }

               int var16;
               int var17;
               label790: {
                  if (super.field7604 < arg4 + var15) {
                     var16 = arg4;
                     var17 = arg4 + 1;
                     if (var12 == 0) {
                        break label790;
                     }
                  }

                  var17 = (var15 - -1 >> 1) + arg4;
                  var16 = (var15 >> 1) + arg4;
               }

               int var18;
               int var19;
               label785: {
                  if (arg2 - -var14 <= super.field7608) {
                     var18 = (var14 + 1 >> 1) + arg2;
                     var19 = (var14 >> 1) + arg2;
                     if (var12 == 0) {
                        break label785;
                     }
                  }

                  var18 = arg2 + 1;
                  var19 = arg2;
               }

               class293 var20 = class377.field5711[arg1];
               int var21 = var20.method2235(var19, 2116912585, var16) + (var20.method2235(var19, 2116912585, var17) - -var20.method2235(var18, 2116912585, var16)) - -var20.method2235(var18, 2116912585, var17) >> 2;
               int var22 = (arg4 << 9) - -(var15 << 8);
               int var23 = (arg2 << 9) + (var14 << 8);
               boolean var24 = class497.field7359 && !super.field7602 && var13.field8354;
               if (var13.method4136((byte)-106)) {
                  class597.method4374(1111756009, arg9, (class687)null, arg2, var13, arg0, arg4, (class155)null);
               }

               boolean var25 = ~arg3 == 0 && var13.field8327 == -1 && var13.field8267 == null && var13.field8320 == null && !var13.field8295 && !var13.field8333;
               if (!class205.field2637 || (!class55.method454(arg7, 11159) || var13.field8313 == 1) && (!class718.method5190(arg7, 17) || var13.field8313 != 0)) {
                  if (arg7 == 22) {
                     if (~class261.field3566.field9461.method5177(110) != -1 || ~var13.field8317 != -1 || ~var13.field8304 == -2 || var13.field8324) {
                        class249 var27;
                        label521: {
                           if (var25) {
                              class137 var26 = new class137(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg9, var24);
                              if (var26.method353(1197)) {
                                 var26.method351(arg8, (byte)-128);
                              }

                              var27 = var26;
                              if (var12 == 0) {
                                 break label521;
                              }
                           }

                           var27 = new class74(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg9, arg3);
                        }

                        class179.method1409(arg0, arg4, arg2, var27);
                        if (var13.field8304 == 1 && arg10 != null) {
                           arg10.method5379(arg2, arg4, -31066);
                        }

                     }
                  } else if (arg7 != 10 && arg7 != 11) {
                     if ((~arg7 > -13 || arg7 > 17) && (~arg7 > -19 || ~arg7 < -22)) {
                        if (~arg7 == -1) {
                           int var36 = var13.field8313;
                           if (class111.field1354 && ~var13.field8313 == 0) {
                              var36 = 1;
                           }

                           class411 var37;
                           label811: {
                              if (!var25) {
                                 var37 = new class365(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9, arg3);
                                 if (var12 == 0) {
                                    break label811;
                                 }
                              }

                              class312 var38 = new class312(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9, var24);
                              if (var38.method353(1197)) {
                                 var38.method351(arg8, (byte)-126);
                              }

                              var37 = var38;
                           }

                           label812: {
                              class159.method1320(arg0, arg4, arg2, var37, (class411)null);
                              if (arg9 == 0) {
                                 if (class497.field7359 && var13.field8279) {
                                    var20.method789(arg4, arg2, 50);
                                    var20.method789(arg4, arg2 + 1, 50);
                                 }

                                 if (var36 != 1 || super.field7602) {
                                    break label812;
                                 }

                                 class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 1, arg4, true);
                                 if (var12 == 0) {
                                    break label812;
                                 }
                              }

                              if (~arg9 != -2) {
                                 if (~arg9 != -3) {
                                    if (arg9 != 3) {
                                       break label812;
                                    }

                                    if (class497.field7359 && var13.field8279) {
                                       var20.method789(arg4, arg2, 50);
                                       var20.method789(arg4 + 1, arg2, 50);
                                    }

                                    if (~var36 != -2 || super.field7602) {
                                       break label812;
                                    }

                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 2, arg4, true);
                                    if (var12 == 0) {
                                       break label812;
                                    }
                                 }

                                 if (class497.field7359 && var13.field8279) {
                                    var20.method789(arg4 + 1, arg2, 50);
                                    var20.method789(arg4 + 1, arg2 + 1, 50);
                                 }

                                 if (~var36 != -2 || super.field7602) {
                                    break label812;
                                 }

                                 class487.method3613(var13.field8270, -var13.field8306, arg0, arg2, 1, arg4 + 1, true);
                                 if (var12 == 0) {
                                    break label812;
                                 }
                              }

                              if (class497.field7359 && var13.field8279) {
                                 var20.method789(arg4, arg2 + 1, 50);
                                 var20.method789(arg4 + 1, arg2 + 1, 50);
                              }

                              if (~var36 == -2 && !super.field7602) {
                                 class487.method3613(var13.field8270, -var13.field8306, arg0, arg2 + 1, 2, arg4, true);
                              }
                           }

                           if (~var13.field8304 != -1 && arg10 != null) {
                              arg10.method5388(!var13.field8308, var13.field8309, arg4, arg7, arg2, arg9, (byte)-37);
                           }

                           if (var13.field8310 != 64) {
                              class552.method4083(arg0, arg4, arg2, var13.field8310);
                           }

                        } else if (~arg7 == -2) {
                           class411 var39;
                           label817: {
                              if (!var25) {
                                 var39 = new class365(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9, arg3);
                                 if (var12 == 0) {
                                    break label817;
                                 }
                              }

                              class312 var40 = new class312(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9, var24);
                              if (var40.method353(1197)) {
                                 var40.method351(arg8, (byte)-119);
                              }

                              var39 = var40;
                           }

                           class159.method1320(arg0, arg4, arg2, var39, (class411)null);
                           if (var13.field8279 && class497.field7359) {
                              label818: {
                                 if (arg9 == 0) {
                                    var20.method789(arg4, arg2 + 1, 50);
                                    if (var12 == 0) {
                                       break label818;
                                    }
                                 }

                                 if (~arg9 == -2) {
                                    var20.method789(arg4 + 1, arg2 + 1, 50);
                                    if (var12 == 0) {
                                       break label818;
                                    }
                                 }

                                 if (~arg9 != -3) {
                                    if (~arg9 != -4) {
                                       break label818;
                                    }

                                    var20.method789(arg4, arg2, 50);
                                    if (var12 == 0) {
                                       break label818;
                                    }
                                 }

                                 var20.method789(arg4 - -1, arg2, 50);
                              }
                           }

                           if (~var13.field8304 != -1 && arg10 != null) {
                              arg10.method5388(!var13.field8308, var13.field8309, arg4, arg7, arg2, arg9, (byte)-37);
                           }

                        } else if (arg7 == 2) {
                           class411 var44;
                           class411 var45;
                           label617: {
                              int var41 = 3 & arg9 + 1;
                              if (var25) {
                                 class312 var42 = new class312(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9 + 4, var24);
                                 class312 var43 = new class312(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, var41, var24);
                                 if (var42.method353(1197)) {
                                    var42.method351(arg8, (byte)-125);
                                 }

                                 if (var43.method353(1197)) {
                                    var43.method351(arg8, (byte)-124);
                                 }

                                 var44 = var43;
                                 var45 = var42;
                                 if (var12 == 0) {
                                    break label617;
                                 }
                              }

                              var45 = new class365(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9 + 4, arg3);
                              var44 = new class365(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, var41, arg3);
                           }

                           class159.method1320(arg0, arg4, arg2, var45, var44);
                           if ((var13.field8313 == 1 || class111.field1354 && ~var13.field8313 == 0) && !super.field7602) {
                              label821: {
                                 if (arg9 == 0) {
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 1, arg4, true);
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2 + 1, 2, arg4, !arg6);
                                    if (var12 == 0) {
                                       break label821;
                                    }
                                 }

                                 if (~arg9 == -2) {
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 1, arg4 + 1, true);
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2 + 1, 2, arg4, true);
                                    if (var12 == 0) {
                                       break label821;
                                    }
                                 }

                                 if (arg9 == 2) {
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 1, arg4 + 1, true);
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 2, arg4, true);
                                    if (var12 == 0) {
                                       break label821;
                                    }
                                 }

                                 if (arg9 == 3) {
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 1, arg4, true);
                                    class487.method3613(var13.field8270, var13.field8306, arg0, arg2, 2, arg4, true);
                                 }
                              }
                           }

                           if (var13.field8304 != 0 && arg10 != null) {
                              arg10.method5388(!var13.field8308, var13.field8309, arg4, arg7, arg2, arg9, (byte)-37);
                           }

                           if (~var13.field8310 != -65) {
                              class552.method4083(arg0, arg4, arg2, var13.field8310);
                           }

                        } else if (arg7 == 3) {
                           class411 var46;
                           label639: {
                              if (!var25) {
                                 var46 = new class365(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9, arg3);
                                 if (var12 == 0) {
                                    break label639;
                                 }
                              }

                              class312 var47 = new class312(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg7, arg9, var24);
                              var46 = var47;
                              if (var47.method353(1197)) {
                                 var47.method351(arg8, (byte)-128);
                              }
                           }

                           class159.method1320(arg0, arg4, arg2, var46, (class411)null);
                           if (var13.field8279 && class497.field7359) {
                              label632: {
                                 if (arg9 != 0) {
                                    if (~arg9 != -2) {
                                       if (~arg9 != -3) {
                                          if (arg9 != 3) {
                                             break label632;
                                          }

                                          var20.method789(arg4, arg2, 50);
                                          if (var12 == 0) {
                                             break label632;
                                          }
                                       }

                                       var20.method789(arg4 - -1, arg2, 50);
                                       if (var12 == 0) {
                                          break label632;
                                       }
                                    }

                                    var20.method789(arg4 + 1, arg2 + 1, 50);
                                    if (var12 == 0) {
                                       break label632;
                                    }
                                 }

                                 var20.method789(arg4, arg2 + 1, 50);
                              }
                           }

                           if (var13.field8304 != 0 && arg10 != null) {
                              arg10.method5388(!var13.field8308, var13.field8309, arg4, arg7, arg2, arg9, (byte)-37);
                           }

                        } else if (arg7 == 9) {
                           class741 var48;
                           label824: {
                              if (!var25) {
                                 var48 = new class451(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg4, arg4 + -1 + var15, arg2, arg2 + var14 + -1, arg7, arg9, arg3);
                                 if (var12 == 0) {
                                    break label824;
                                 }
                              }

                              class45 var49 = new class45(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg4, arg4, arg2, arg2, arg7, arg9, var24);
                              if (var49.method353(1197)) {
                                 var49.method351(arg8, (byte)-124);
                              }

                              var48 = var49;
                           }

                           class117.method978(var48, false);
                           if (var13.field8313 == 1 && !super.field7602) {
                              byte var50;
                              label646: {
                                 if ((arg9 & 1) != 0) {
                                    var50 = 16;
                                    if (var12 == 0) {
                                       break label646;
                                    }
                                 }

                                 var50 = 8;
                              }

                              class487.method3613(var13.field8270, 0, arg0, arg2, var50, arg4, true);
                           }

                           if (var13.field8304 != 0 && arg10 != null) {
                              arg10.method5389(var15, var13.field8309, arg4, arg2, !var13.field8308, (byte)28, var14);
                           }

                           if (var13.field8310 != 64) {
                              class552.method4083(arg0, arg4, arg2, var13.field8310);
                           }

                        } else if (~arg7 == -5) {
                           class707 var52;
                           label662: {
                              if (var25) {
                                 class201 var51 = new class201(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, 0, 0, arg7, arg9);
                                 if (var51.method353(1197)) {
                                    var51.method351(arg8, (byte)-117);
                                 }

                                 var52 = var51;
                                 if (var12 == 0) {
                                    break label662;
                                 }
                              }

                              var52 = new class718(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, 0, 0, arg7, arg9, arg3);
                           }

                           class621.method4482(arg0, arg4, arg2, var52, (class707)null);
                        } else if (arg7 == 5) {
                           int var53 = 65;
                           class86 var54 = (class86)class29.method203(arg0, arg4, arg2);
                           if (var54 != null) {
                              var53 = 1 + class151.field1896.method5072(30, var54.method350(25061)).field8310;
                           }

                           class707 var56;
                           label670: {
                              if (var25) {
                                 class201 var55 = new class201(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, class224.field2870[arg9] * var53, class691.field10405[arg9] * var53, arg7, arg9);
                                 if (var55.method353(1197)) {
                                    var55.method351(arg8, (byte)-127);
                                 }

                                 var56 = var55;
                                 if (var12 == 0) {
                                    break label670;
                                 }
                              }

                              var56 = new class718(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, class224.field2870[arg9] * var53, class691.field10405[arg9] * var53, arg7, arg9, arg3);
                           }

                           class621.method4482(arg0, arg4, arg2, var56, (class707)null);
                        } else if (~arg7 == -7) {
                           int var57 = 33;
                           class86 var58 = (class86)class29.method203(arg0, arg4, arg2);
                           if (var58 != null) {
                              var57 = 1 + class151.field1896.method5072(30, var58.method350(25061)).field8310 / 2;
                           }

                           class707 var60;
                           label680: {
                              if (var25) {
                                 class201 var59 = new class201(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, class224.field2870[arg9] * var57, class691.field10405[arg9] * var57, arg7, arg9 + 4);
                                 var60 = var59;
                                 if (!var59.method353(1197)) {
                                    break label680;
                                 }

                                 var59.method351(arg8, (byte)-118);
                                 if (var12 == 0) {
                                    break label680;
                                 }
                              }

                              var60 = new class718(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, class345.field5261[arg9] * var57, class568.field8462[arg9] * var57, arg7, arg9 - -4, arg3);
                           }

                           class621.method4482(arg0, arg4, arg2, var60, (class707)null);
                        } else if (~arg7 == -8) {
                           class707 var62;
                           label688: {
                              int var61 = arg9 + 2 & 3;
                              if (!var25) {
                                 var62 = new class718(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, 0, 0, arg7, var61 + 4, arg3);
                                 if (var12 == 0) {
                                    break label688;
                                 }
                              }

                              class201 var63 = new class201(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, 0, 0, arg7, var61 + 4);
                              var62 = var63;
                              if (var63.method353(1197)) {
                                 var63.method351(arg8, (byte)-116);
                              }
                           }

                           class621.method4482(arg0, arg4, arg2, var62, (class707)null);
                        } else if (arg7 == 8) {
                           int var64 = 3 & arg9 - -2;
                           int var65 = 33;
                           class86 var66 = (class86)class29.method203(arg0, arg4, arg2);
                           if (var66 != null) {
                              var65 = class151.field1896.method5072(30, var66.method350(25061)).field8310 / 2 - -1;
                           }

                           class707 var69;
                           class707 var70;
                           label698: {
                              if (var25) {
                                 class201 var67 = new class201(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, class345.field5261[arg9] * var65, class568.field8462[arg9] * var65, arg7, arg9 + 4);
                                 class201 var68 = new class201(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, 0, 0, arg7, var64 + 4);
                                 if (var67.method353(1197)) {
                                    var67.method351(arg8, (byte)-119);
                                 }

                                 var69 = var68;
                                 var70 = var67;
                                 if (!var68.method353(1197)) {
                                    break label698;
                                 }

                                 var68.method351(arg8, (byte)-128);
                                 if (var12 == 0) {
                                    break label698;
                                 }
                              }

                              class718 var71 = new class718(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, class345.field5261[arg9] * var65, class568.field8462[arg9] * var65, arg7, arg9 + 4, arg3);
                              class718 var72 = new class718(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, 0, 0, arg7, var64 - -4, arg3);
                              var70 = var71;
                              var69 = var72;
                           }

                           class621.method4482(arg0, arg4, arg2, var70, var69);
                        } else if (arg6) {
                           this.field1923 = 113;
                        }
                     } else {
                        class741 var34;
                        label829: {
                           if (!var25) {
                              var34 = new class451(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg4, arg4 - -var15 + -1, arg2, arg2 + -1 - -var14, arg7, arg9, arg3);
                              if (var12 == 0) {
                                 break label829;
                              }
                           }

                           class45 var35 = new class45(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg4, arg4 + -1 + var15, arg2, arg2 + -1 + var14, arg7, arg9, var24);
                           if (var35.method353(1197)) {
                              var35.method351(arg8, (byte)-121);
                           }

                           var34 = var35;
                        }

                        class117.method978(var34, false);
                        if (class497.field7359 && !super.field7602 && ~arg7 <= -13 && arg7 <= 17 && arg7 != 13 && ~arg0 < -1 && var13.field8313 != 0) {
                           super.field7621[arg0][arg4][arg2] = (byte)class379.method2928(super.field7621[arg0][arg4][arg2], 4);
                        }

                        if (var13.field8304 != 0 && arg10 != null) {
                           arg10.method5389(var15, var13.field8309, arg4, arg2, !var13.field8308, (byte)-118, var14);
                        }

                     }
                  } else {
                     class45 var28 = null;
                     class741 var30;
                     int var31;
                     if (var25) {
                        class45 var29 = new class45(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg4, var15 + -1 + arg4, arg2, arg2 + var14 - 1, arg7, arg9, var24);
                        var30 = var29;
                        var28 = var29;
                        var31 = var29.method357(-113);
                     } else {
                        var30 = new class451(arg8, var13, arg0, arg1, var22, var21, var23, super.field7602, arg4, arg4 + var15 - 1, arg2, arg2 - 1 + var14, arg7, arg9, arg3);
                        var31 = 15;
                     }

                     if (class117.method978(var30, false)) {
                        if (var28 != null && var28.method353(1197)) {
                           var28.method351(arg8, (byte)-121);
                        }

                        if (var13.field8279 && class497.field7359) {
                           if (var31 > 30) {
                              var31 = 30;
                           }

                           int var32 = 0;
                           if (var12 != 0 || ~var32 >= ~var15) {
                              do {
                                 int var33 = 0;
                                 if (var12 != 0) {
                                    var20.method789(arg4 - -var32, arg2 + var33, var31);
                                    ++var33;
                                 }

                                 while(true) {
                                    while(var33 <= var14) {
                                       var20.method789(arg4 - -var32, arg2 + var33, var31);
                                       ++var33;
                                    }

                                    if (var12 == 0) {
                                       ++var32;
                                       break;
                                    }

                                    ++var33;
                                 }
                              } while(~var32 >= ~var15);
                           }
                        }
                     }

                     if (~var13.field8304 != -1 && arg10 != null) {
                        arg10.method5389(var15, var13.field8309, arg4, arg2, !var13.field8308, (byte)-111, var14);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class670.method4877(var74, field1935[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field1935[2] : field1935[1]) + ',' + arg9 + ',' + (arg10 != null ? field1935[2] : field1935[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "<init>",
      descriptor = "(IIIZ)V",
      line = 745
   )
   public class153(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class318.field4552, class234.field2978);
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(BZLha;)V",
      line = 751
   )
   public final void method1259(byte param1, boolean param2, class66 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mr",
      name = "b",
      descriptor = "(I)V",
      line = 888
   )
   public static final void method1260(int arg0) {
      try {
         try {
            Method var1 = (field1934 != null ? field1934 : (field1934 = method1268(field1935[8]))).getMethod(field1935[9]);
            if (arg0 >= -41) {
               method1263(true, 72, 33, 20, 10);
            }

            if (var1 != null) {
               try {
                  Runtime var2 = Runtime.getRuntime();
                  Integer var3 = (Integer)var1.invoke(var2, (Object[])null);
                  class102.field1243 = var3;
               } catch (Throwable var5) {
               }
            }
         } catch (Exception var6) {
         }

         ++field1925;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1935[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(II[Lega;BLha;[B)V",
      line = 920
   )
   public final void method1261(int arg0, int arg1, class739[] arg2, byte arg3, class66 arg4, byte[] arg5) {
      int var7 = client.field4530;

      try {
         ++field1926;
         if (arg3 == -125) {
            class128 var8 = new class128(arg5);
            int var9 = -1;

            label71:
            do {
               int var10 = var8.method1088(255);
               int var10000 = ~var10;

               while(var10000 != -1) {
                  var9 += var10;
                  int var11 = 0;

                  while(true) {
                     int var12 = var8.method1061((byte)60);
                     if (var12 == 0) {
                        continue label71;
                     }

                     var11 += var12 - 1;
                     int var13 = var11 & 63;
                     int var14 = (var11 & 4059) >> 6;
                     int var15 = var11 >> 12;
                     int var16 = var8.method1104(255);
                     int var17 = var16 >> 2;
                     int var18 = var16 & 3;
                     int var19 = arg1 + var14;
                     int var20 = var13 - -arg0;
                     if (~var19 < -1) {
                        var10000 = var20;
                        if (var7 != 0) {
                           break;
                        }

                        if (var20 > 0 && ~var19 > ~(super.field7604 - 1) && super.field7608 - 1 > var20) {
                           class739 var21 = null;
                           if (!super.field7602) {
                              int var22 = var15;
                              if (~(2 & class65.field797[1][var19][var20]) == -3) {
                                 var22 = var15 - 1;
                              }

                              if (var22 >= 0) {
                                 var21 = arg2[var22];
                              }
                           }

                           this.method1258(var15, var15, var20, -1, var19, var9, false, var17, arg4, var18, var21);
                           if (var7 != 0) {
                              continue label71;
                           }
                        }
                     }
                  }
               }

               return;
            } while(var7 == 0);

         }
      } catch (RuntimeException var24) {
         throw class670.method4877(var24, field1935[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1935[2] : field1935[1]) + ',' + arg3 + ',' + (arg4 != null ? field1935[2] : field1935[1]) + ',' + (arg5 != null ? field1935[2] : field1935[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(II)I",
      line = 994
   )
   public static int method1262(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1935[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(ZIIII)V",
      line = 1004
   )
   public static final void method1263(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field1920;
         if (arg0 || class465.field6983 != arg1 || ~class688.field10364 != ~arg3 || class551.field8158 != class255.field3404 && class261.field3566.field9428.method2175(arg2 + 112) != 1) {
            class465.field6983 = arg1;
            class688.field10364 = arg3;
            class255.field3404 = class551.field8158;
            if (class261.field3566.field9428.method2175(90) == 1) {
               class255.field3404 = 0;
            }

            int var8;
            int var9;
            int var10000;
            label459: {
               class317.method2411(arg4, (byte)4);
               class183.method1433(class288.field4045, class786.field11439, 0, true, class417.field6389, class204.field2576.method1562((byte)-113, class728.field10827));
               int var6 = class718.field10676;
               int var7 = class669.field10064;
               class718.field10676 = (-(class323.field4603 >> 4) + class465.field6983) * 8;
               class669.field10064 = (-(class178.field2197 >> 4) + class688.field10364) * 8;
               class543.field7900 = class329.method2485(class465.field6983 * 8, class688.field10364 * 8);
               class72.field916 = null;
               var8 = -var6 + class718.field10676;
               var9 = -var7 + class669.field10064;
               if (~arg4 != -12) {
                  boolean var10 = false;
                  class159.field2021 = 0;
                  int var11 = (class323.field4603 - 1) * 512;
                  int var12 = class178.field2197 * 512 + -512;
                  int var13 = 0;
                  if (var5 != 0 || var13 < class132.field1657) {
                     do {
                        class726 var14 = class506.field7478[var13];
                        if (var14 == null) {
                           ++var13;
                        } else {
                           class155 var15 = var14.field10794;
                           var15.field9003 -= var8 * 512;
                           var15.field9007 -= var9 * 512;
                           if (~var15.field9003 <= -1 && ~var11 <= ~var15.field9003 && ~var15.field9007 <= -1 && var12 >= var15.field9007) {
                              label427: {
                                 byte var16 = 1;
                                 int var17 = 0;
                                 if (var5 != 0) {
                                    var15.field6114[var17] -= var8;
                                    var15.field6116[var17] -= var9;
                                    var10000 = ~var15.field6114[var17];
                                 } else if (~var17 <= -11) {
                                    var10000 = var16;
                                    if (var5 == 0) {
                                       break label427;
                                    }
                                 } else {
                                    var15.field6114[var17] -= var8;
                                    var15.field6116[var17] -= var9;
                                    var10000 = ~var15.field6114[var17];
                                 }

                                 while(true) {
                                    if (var10000 <= -1) {
                                       if (class323.field4603 > var15.field6114[var17]) {
                                          if (~var15.field6116[var17] <= -1) {
                                             if (~class178.field2197 >= ~var15.field6116[var17]) {
                                                var16 = 0;
                                                ++var17;
                                             } else {
                                                ++var17;
                                             }
                                          } else {
                                             var16 = 0;
                                             ++var17;
                                          }
                                       } else {
                                          var16 = 0;
                                          ++var17;
                                       }
                                    } else {
                                       var16 = 0;
                                       ++var17;
                                    }

                                    if (~var17 <= -11) {
                                       var10000 = var16;
                                       if (var5 == 0) {
                                          break;
                                       }
                                    } else {
                                       var15.field6114[var17] -= var8;
                                       var15.field6116[var17] -= var9;
                                       var10000 = ~var15.field6114[var17];
                                    }
                                 }
                              }

                              if (var10000 == 0) {
                                 var15.method1288(arg2 ^ 73, (class369)null);
                                 var14.method2720(0);
                                 var10 = true;
                                 if (var5 == 0) {
                                    ++var13;
                                    continue;
                                 }
                              }

                              class115.field1381[class159.field2021++] = var15.field6027;
                              if (var5 == 0) {
                                 ++var13;
                                 continue;
                              }
                           }

                           var15.method1288(-69, (class369)null);
                           var10 = true;
                           var14.method2720(0);
                           ++var13;
                        }
                     } while(var13 < class132.field1657);
                  }

                  if (!var10) {
                     break label459;
                  }

                  class132.field1657 = class259.field3509.method5672(0);
                  class259.field3509.method5679(true, class506.field7478);
                  if (var5 == 0) {
                     break label459;
                  }
               }

               int var18 = 0;
               if (var5 != 0 || class132.field1657 > var18) {
                  do {
                     class726 var19 = class506.field7478[var18];
                     if (var19 == null) {
                        ++var18;
                     } else {
                        class155 var20 = var19.field10794;
                        int var21 = 0;
                        if (var5 != 0) {
                           var20.field6114[var21] -= var8;
                           var20.field6116[var21] -= var9;
                           ++var21;
                        }

                        while(true) {
                           while(~var21 > -11) {
                              var20.field6114[var21] -= var8;
                              var20.field6116[var21] -= var9;
                              ++var21;
                           }

                           var20.field9003 -= var8 * 512;
                           if (var5 == 0) {
                              var20.field9007 -= var9 * 512;
                              ++var18;
                              break;
                           }

                           var20.field6116[var21] -= var9;
                           ++var21;
                        }
                     }
                  } while(class132.field1657 > var18);
               }
            }

            int var22 = 0;
            if (var5 != 0 || ~var22 > -2049) {
               do {
                  class687 var23 = class661.field9578[var22];
                  if (var23 == null) {
                     ++var22;
                  } else {
                     int var24 = 0;
                     if (var5 != 0) {
                        var23.field6114[var24] -= var8;
                        var23.field6116[var24] -= var9;
                        ++var24;
                     }

                     while(true) {
                        while(~var24 > -11) {
                           var23.field6114[var24] -= var8;
                           var23.field6116[var24] -= var9;
                           ++var24;
                        }

                        var23.field9003 -= var8 * 512;
                        if (var5 == 0) {
                           var23.field9007 -= var9 * 512;
                           ++var22;
                           break;
                        }

                        var23.field6116[var24] -= var9;
                        ++var24;
                     }
                  }
               } while(~var22 > -2049);
            }

            class263[] var25 = class594.field8758;
            int var26 = 0;
            class263 var27;
            if (var5 != 0) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field3590 -= var9 * 512;
                  var27.field3591 -= var8 * 512;
               }

               ++var26;
            }

            while(~var26 > ~var25.length) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field3590 -= var9 * 512;
                  var27.field3591 -= var8 * 512;
               }

               ++var26;
            }

            class395 var28;
            label206: {
               var28 = (class395)class68.field860.method4071((byte)126);
               if (var5 != 0) {
                  var28.field6011 -= var8;
                  var28.field6010 -= var9;
               } else if (var28 == null) {
                  var28 = (class395)class257.field3487.method4071((byte)126);
                  if (var5 == 0) {
                     break label206;
                  }
               } else {
                  var28.field6011 -= var8;
                  var28.field6010 -= var9;
               }

               while(true) {
                  if (class643.field9369 != 4) {
                     if (var28.field6011 >= 0) {
                        if (~var28.field6010 <= -1) {
                           if (var28.field6011 < class323.field4603) {
                              if (var28.field6010 >= class178.field2197) {
                                 var28.method2720(0);
                              }
                           } else {
                              var28.method2720(0);
                           }
                        } else {
                           var28.method2720(0);
                        }
                     } else {
                        var28.method2720(0);
                     }
                  }

                  var28 = (class395)class68.field860.method4059((byte)117);
                  if (var28 == null) {
                     var28 = (class395)class257.field3487.method4071((byte)126);
                     if (var5 == 0) {
                        break;
                     }
                  } else {
                     var28.field6011 -= var8;
                     var28.field6010 -= var9;
                  }
               }
            }

            if (var5 != 0) {
               var28.field6010 -= var9;
               var28.field6011 -= var8;
               if (~class643.field9369 != -5) {
                  if (~var28.field6011 <= -1) {
                     if (var28.field6010 >= 0) {
                        if (~var28.field6011 > ~class323.field4603) {
                           if (~class178.field2197 >= ~var28.field6010) {
                              var28.method2720(arg2 + 1);
                              var28 = (class395)class257.field3487.method4059((byte)-44);
                           } else {
                              var28 = (class395)class257.field3487.method4059((byte)-44);
                           }
                        } else {
                           var28.method2720(arg2 + 1);
                           var28 = (class395)class257.field3487.method4059((byte)-44);
                        }
                     } else {
                        var28.method2720(arg2 + 1);
                        var28 = (class395)class257.field3487.method4059((byte)-44);
                     }
                  } else {
                     var28.method2720(arg2 + 1);
                     var28 = (class395)class257.field3487.method4059((byte)-44);
                  }
               } else {
                  var28 = (class395)class257.field3487.method4059((byte)-44);
               }
            }

            while(true) {
               byte var10001;
               if (var28 == null) {
                  var10000 = ~class643.field9369;
                  var10001 = -5;
                  if (var5 == 0) {
                     if (var10000 != -5) {
                        class167 var29 = (class167)class561.field8393.method5677((byte)44);
                        if (var5 != 0 || var29 != null) {
                           do {
                              int var30 = (int)(16383L & var29.field5280);
                              int var31 = var30 - class718.field10676;
                              int var32 = (int)(var29.field5280 >> 14 & 16383L);
                              int var33 = -class669.field10064 + var32;
                              if (~var31 > -1 || var33 < 0 || class323.field4603 <= var31 || var33 >= class178.field2197) {
                                 var29.method2720(arg2 + 1);
                              }

                              var29 = (class167)class561.field8393.method5671(arg2 ^ 108);
                           } while(var29 != null);
                        }
                     }

                     if (~class637.field9260 != arg2) {
                        class639.field9316 -= var9;
                        class637.field9260 -= var8;
                     }

                     label474: {
                        class33.method229(arg2 ^ -2049);
                        if (arg4 == 11) {
                           if (~class675.field10142 == -5) {
                              class573.field8527 -= var8 * 512;
                              class747.field11068 -= var9 * 512;
                              class537.field7853 -= var8 * 512;
                              class650.field9486 -= var9 * 512;
                              if (var5 == 0) {
                                 break label474;
                              }
                           }

                           class675.field10142 = 1;
                           class387.field5919 = -1;
                           class57.field717 = -1;
                           if (var5 == 0) {
                              break label474;
                           }
                        }

                        class552.field8167 -= var8;
                        class29.field320 -= var8;
                        class310.field4418 -= var9;
                        class731.field10844 -= var8 * 512;
                        class513.field7524 -= var9;
                        class232.field2947 -= var9 * 512;
                        if (Math.abs(var8) > class323.field4603 || ~Math.abs(var9) < ~class178.field2197) {
                           class239.method1784(arg2 + 2);
                        }
                     }

                     class403.method3095((byte)-27);
                     class431.method3282(false);
                     class629.field9155.method4062(arg2 + 1);
                     class699.field10495.method4062(0);
                     class792.field11509.method98(true);
                     class71.method710(-117);
                     return;
                  }
               } else {
                  var28.field6010 -= var9;
                  var28.field6011 -= var8;
                  var10000 = ~class643.field9369;
                  var10001 = -5;
               }

               if (var10000 != var10001) {
                  if (~var28.field6011 <= -1) {
                     if (var28.field6010 >= 0) {
                        if (~var28.field6011 > ~class323.field4603) {
                           if (~class178.field2197 >= ~var28.field6010) {
                              var28.method2720(arg2 + 1);
                              var28 = (class395)class257.field3487.method4059((byte)-44);
                           } else {
                              var28 = (class395)class257.field3487.method4059((byte)-44);
                           }
                        } else {
                           var28.method2720(arg2 + 1);
                           var28 = (class395)class257.field3487.method4059((byte)-44);
                        }
                     } else {
                        var28.method2720(arg2 + 1);
                        var28 = (class395)class257.field3487.method4059((byte)-44);
                     }
                  } else {
                     var28.method2720(arg2 + 1);
                     var28 = (class395)class257.field3487.method4059((byte)-44);
                  }
               } else {
                  var28 = (class395)class257.field3487.method4059((byte)-44);
               }
            }
         }
      } catch (RuntimeException var35) {
         throw class670.method4877(var35, field1935[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "([IILha;ILjj;I)V",
      line = 1277
   )
   public final void method1264(int[] param1, int param2, class66 param3, int param4, class128 param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IIZII[Lega;II[BLha;I)V",
      line = 1641
   )
   public final void method1265(int arg0, int arg1, boolean arg2, int arg3, int arg4, class739[] arg5, int arg6, int arg7, byte[] arg8, class66 arg9, int arg10) {
      int var12 = client.field4530;

      try {
         if (arg2) {
            ++field1919;
            class128 var13 = new class128(arg8);
            int var14 = -1;

            label81:
            do {
               int var15 = var13.method1088(255);
               int var10000 = ~var15;
               int var10001 = -1;

               while(var10000 != var10001) {
                  var14 += var15;
                  int var16 = 0;

                  while(true) {
                     int var17 = var13.method1061((byte)60);
                     if (var17 == 0) {
                        continue label81;
                     }

                     var16 += var17 + -1;
                     int var18 = 63 & var16;
                     int var19 = (4061 & var16) >> 6;
                     int var20 = var16 >> 12;
                     int var21 = var13.method1104(255);
                     int var22 = var21 >> 2;
                     int var23 = 3 & var21;
                     if (~arg3 == ~var20) {
                        var10000 = arg4;
                        var10001 = var19;
                        if (var12 != 0) {
                           break;
                        }

                        if (arg4 <= var19 && var19 < arg4 + 8 && ~var18 <= ~arg1 && ~(arg1 + 8) < ~var18) {
                           class557 var24 = class151.field1896.method5072(30, var14);
                           int var25 = class307.method2323(var24.field8357, arg10, var23, var24.field8350, 7 & var18, 7 & var19, (byte)112) + arg0;
                           int var26 = arg6 - -class686.method4983(7 & var19, 3, var24.field8350, var23, var18 & 7, var24.field8357, arg10);
                           if (~var25 < -1 && var26 > 0 && ~var25 > ~(super.field7604 + -1) && super.field7608 + -1 > var26) {
                              class739 var27 = null;
                              if (!super.field7602) {
                                 int var28 = arg7;
                                 if (~(class65.field797[1][var25][var26] & 2) == -3) {
                                    var28 = arg7 - 1;
                                 }

                                 if (~var28 <= -1) {
                                    var27 = arg5[var28];
                                 }
                              }

                              this.method1258(arg7, arg7, var26, -1, var25, var14, false, var22, arg9, arg10 + var23 & 3, var27);
                              if (var12 != 0) {
                                 continue label81;
                              }
                           }
                        }
                     }
                  }
               }

               return;
            } while(var12 == 0);

         }
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field1935[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1935[2] : field1935[1]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field1935[2] : field1935[1]) + ',' + (arg9 != null ? field1935[2] : field1935[1]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IILjj;[IIIIIIILha;)V",
      line = 1722
   )
   public final void method1266(int param1, int param2, class128 param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, class66 param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mr",
      name = "c",
      descriptor = "(I)V",
      line = 2018
   )
   public static final void method1267(int arg0) {
      try {
         class318.field4552.method5252(Integer.MAX_VALUE, 5);
         ++field1924;
         class234.field2978.method2129(5, true);
         class68.field859.method2005(5, -2);
         class151.field1896.method5070(5, 83);
         class536.field7845.method3365(5, (byte)-120);
         class54.field616.method1695(5, (byte)102);
         if (arg0 >= -35) {
            method1260(104);
         }

         class576.field8554.method3194(5, 100);
         class619.field9029.method3636(5, 0);
         class639.field9324.method3988(123, 5);
         class748.field11092.method3537(true, 5);
         class387.field5915.method2457(5, 122);
         class759.field11174.method1658((byte)124, 5);
         class536.field7828.method3294(5, 22379);
         class427.field6523.method4156(false, 5);
         class170.field2105.method3802(5, (byte)-125);
         class793.field11562.method2812(5, -2);
         class127.field1526.method1962(22575, 5);
         class530.field7707.method3480((byte)16, 5);
         class576.field8556.method3257((byte)-60, 5);
         class299.field4267.method3951(5, (byte)-122);
         class525.field7633.method4920(5, 0);
         class271.field3780.method2777(5, true);
         class571.method4234(5, -123);
         class234.method1756(10163, 50);
         class543.method4008(50, -5984);
         class688.method5007(5, (byte)111);
         class780.method5615(5, -122);
         class126.field1520.method5453(5, false);
         class165.field2073.method5453(5, false);
         class73.field929.method5453(5, false);
         class659.field9554.method5453(5, false);
         class265.field3645.method5453(5, false);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1935[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
