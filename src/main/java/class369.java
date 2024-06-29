import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class369 extends class555 {
   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5208 = new String[]{method2858(method2857("\tL\bF_")), method2858(method2857("\tL\bC_")), method2858(method2857("\tL\bM_")), method2858(method2857("\tL\bO_")), method2858(method2857("\tL\bH_")), method2858(method2857("\u000fC")), method2858(method2857("\u000fB")), method2858(method2857("\tL\bD_")), method2858(method2857("\tL\bK_")), method2858(method2857("\tL\bA_")), method2858(method2857("\tL\bG_")), method2858(method2857("\tL\b@_")), method2858(method2857("\tL\bN_")), method2858(method2857("\u0014ZJi")), method2858(method2857("\tL\bB_")), method2858(method2857("\u0001\u0001\b+\n")), method2858(method2857("\tL\bL_")), method2858(method2857("\tL\bI_"))};
   @OriginalMember(
      owner = "client!sc",
      name = "h",
      descriptor = "I"
   )
   public static int field5190 = -2;
   @OriginalMember(
      owner = "client!sc",
      name = "g",
      descriptor = "Lnw;"
   )
   public static class616 field5195 = new class616(13, -1);
   @OriginalMember(
      owner = "client!sc",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5203 = null;
   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "I"
   )
   public static int field5205 = 0;
   @OriginalMember(
      owner = "client!sc",
      name = "m",
      descriptor = "I"
   )
   public static int field5189;
   @OriginalMember(
      owner = "client!sc",
      name = "p",
      descriptor = "I"
   )
   public static int field5191;
   @OriginalMember(
      owner = "client!sc",
      name = "s",
      descriptor = "I"
   )
   public static int field5192;
   @OriginalMember(
      owner = "client!sc",
      name = "i",
      descriptor = "I"
   )
   public static int field5193;
   @OriginalMember(
      owner = "client!sc",
      name = "l",
      descriptor = "I"
   )
   public static int field5194;
   @OriginalMember(
      owner = "client!sc",
      name = "u",
      descriptor = "I"
   )
   public static int field5196;
   @OriginalMember(
      owner = "client!sc",
      name = "t",
      descriptor = "I"
   )
   public static int field5197;
   @OriginalMember(
      owner = "client!sc",
      name = "w",
      descriptor = "I"
   )
   public static int field5198;
   @OriginalMember(
      owner = "client!sc",
      name = "r",
      descriptor = "I"
   )
   public static int field5199;
   @OriginalMember(
      owner = "client!sc",
      name = "n",
      descriptor = "I"
   )
   public static int field5200;
   @OriginalMember(
      owner = "client!sc",
      name = "x",
      descriptor = "I"
   )
   public static int field5201;
   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "I"
   )
   public static int field5202;
   @OriginalMember(
      owner = "client!sc",
      name = "q",
      descriptor = "I"
   )
   public static int field5206;
   @OriginalMember(
      owner = "client!sc",
      name = "o",
      descriptor = "I"
   )
   public static int field5207;
   @OriginalMember(
      owner = "client!sc",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5204;

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2847(int arg0) {
      boolean var1 = client.field4273;

      try {
         if (arg0 == -13697) {
            label34: {
               if (class280.field3748 != null) {
                  class310.method2322((byte)114);
                  if (!var1) {
                     break label34;
                  }
               }

               if (class25.field324 != -1) {
                  class563.method4045(-121);
                  if (!var1) {
                     break label34;
                  }
               }

               class655.method4731(class631.field8834, class616.field8591, (byte)113);
            }

            ++field5193;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5208[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         ++field5202;
         int var3 = 74 / ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5208[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BLbt;)Ljn;"
   )
   public static final class752 method2848(byte arg0, class47 arg1) {
      try {
         class752 var2;
         label25: {
            ++field5191;
            if (class565.field7712 != null) {
               var2 = class565.field7712;
               class565.field7712 = class565.field7712.field10923;
               var2.field10923 = null;
               --class12.field138;
               if (!client.field4273) {
                  break label25;
               }
            }

            var2 = new class752();
         }

         if (arg0 != -89) {
            method2850(10);
         }

         var2.field10922 = arg1;
         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5208[14] + arg0 + ',' + (arg1 != null ? field5208[15] : field5208[13]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 == -13712) {
            if (this.method2855((byte)100)) {
               if (super.field7633.field8451.method2771(3) && !class677.method4965(28991, super.field7633.field8451.method2770((byte)-110))) {
                  super.field7632 = 1;
               }

               if (super.field7633.field8464.method996((byte)-127) == 1) {
                  super.field7632 = 1;
               }
            }

            ++field5201;
            if (~super.field7632 == -4) {
               super.field7632 = 2;
            }

            if (~super.field7632 > -1 || ~super.field7632 < -4) {
               super.field7632 = this.method635(125);
            }

         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5208[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class369(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method2849(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5199;
         class206 var2 = class605.field8474.field2788;
         class677.field9944 = var2.method4288((byte)64);
         int var3 = var2.method4310(2);
         int var4 = var2.method4275(arg0 + -38);
         int var5 = var2.method4292(127);
         if (arg0 == -32) {
            boolean var6 = var2.method4288((byte)82) == 1;
            class619.method4508((byte)90);
            class350.method2763((byte)60, var5);
            var2.method1563(11798);
            int var7 = 0;
            int var8;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var10000;
            int var16;
            int var17;
            int var10001;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var1) {
               var8 = 0;
            } else if (var7 >= 4) {
               var2.method1554(arg0 + 39);
               var8 = (class605.field8474.field2798 - var2.field8243) / 16;
               class178.field2213 = new int[var8][4];
               var11 = 0;
               if (!var1) {
                  label273: {
                     if (var1) {
                        var12 = 0;
                        if (var1) {
                           class178.field2213[var11][var12] = var2.method4302(true);
                           ++var12;
                        }
                     } else {
                        if (~var8 >= ~var11) {
                           class215.field2661 = new int[var8];
                           class325.field4367 = new byte[var8][];
                           class239.field2982 = null;
                           class125.field1565 = new byte[var8][];
                           class548.field7491 = new int[var8];
                           class12.field142 = new int[var8];
                           class794.field11597 = new int[var8];
                           class527.field7205 = new byte[var8][];
                           class777.field11309 = new byte[var8][];
                           class777.field11300 = new int[var8];
                           class740.field10786 = null;
                           var8 = 0;
                           var12 = 0;
                           if (!var1) {
                              break label273;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class178.field2213[var11][var12] = var2.method4302(true);
                           ++var12;
                        }
                     }

                     while(true) {
                        while(~var12 > -5) {
                           class178.field2213[var11][var12] = var2.method4302(true);
                           ++var12;
                        }

                        if (!var1) {
                           ++var11;
                           if (~var8 >= ~var11) {
                              class215.field2661 = new int[var8];
                              class325.field4367 = new byte[var8][];
                              class239.field2982 = null;
                              class125.field1565 = new byte[var8][];
                              class548.field7491 = new int[var8];
                              class12.field142 = new int[var8];
                              class794.field11597 = new int[var8];
                              class527.field7205 = new byte[var8][];
                              class777.field11309 = new byte[var8][];
                              class777.field11300 = new int[var8];
                              class740.field10786 = null;
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class178.field2213[var11][var12] = var2.method4302(true);
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     }
                  }

                  if (var1) {
                     var10000 = 0;
                  } else if (var12 >= 4) {
                     var10000 = var3;
                     if (!var1) {
                        class778.method5571(var3, false, 12, var4, var6);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     var13 = var10000;
                     if (var1 || ~var13 > ~(class507.field7030 >> 3)) {
                        do {
                           var14 = 0;
                           if (var1 || ~(class215.field2667 >> 3) < ~var14) {
                              label373:
                              do {
                                 var15 = class406.field5727[var12][var13][var14];
                                 if (~var15 == 0) {
                                    ++var14;
                                 } else {
                                    var16 = 1023 & var15 >> 14;
                                    var17 = (var15 & 16376) >> 3;
                                    var18 = (var16 / 8 << 8) - -(var17 / 8);
                                    var19 = 0;
                                    if (var1) {
                                       var10000 = class794.field11597[var19];
                                       var10001 = var18;
                                    } else if (~var8 >= ~var19) {
                                       var10000 = var18;
                                       var10001 = -1;
                                       if (!var1) {
                                          if (var18 != -1) {
                                             class794.field11597[var8] = var18;
                                             var20 = 255 & var18 >> 8;
                                             var21 = var18 & 255;
                                             class777.field11300[var8] = class95.field1264.method740(class168.method1321(arg0, 31), "m" + var20 + "_" + var21);
                                             class548.field7491[var8] = class95.field1264.method740(arg0 + 31, "l" + var20 + "_" + var21);
                                             class12.field142[var8] = class95.field1264.method740(-1, field5208[6] + var20 + "_" + var21);
                                             class215.field2661[var8] = class95.field1264.method740(-1, field5208[5] + var20 + "_" + var21);
                                             ++var8;
                                          }

                                          ++var14;
                                          continue;
                                       }
                                    } else {
                                       var10000 = class794.field11597[var19];
                                       var10001 = var18;
                                    }

                                    do {
                                       while(true) {
                                          if (var10000 == var10001) {
                                             var18 = -1;
                                             if (!var1) {
                                                var10000 = var18;
                                                var10001 = -1;
                                                break;
                                             }

                                             ++var19;
                                          } else {
                                             ++var19;
                                          }

                                          if (~var8 >= ~var19) {
                                             var10000 = var18;
                                             var10001 = -1;
                                             if (!var1) {
                                                if (var18 != -1) {
                                                   class794.field11597[var8] = var18;
                                                   var20 = 255 & var18 >> 8;
                                                   var21 = var18 & 255;
                                                   class777.field11300[var8] = class95.field1264.method740(class168.method1321(arg0, 31), "m" + var20 + "_" + var21);
                                                   class548.field7491[var8] = class95.field1264.method740(arg0 + 31, "l" + var20 + "_" + var21);
                                                   class12.field142[var8] = class95.field1264.method740(-1, field5208[6] + var20 + "_" + var21);
                                                   class215.field2661[var8] = class95.field1264.method740(-1, field5208[5] + var20 + "_" + var21);
                                                   ++var8;
                                                }

                                                ++var14;
                                                continue label373;
                                             }
                                          } else {
                                             var10000 = class794.field11597[var19];
                                             var10001 = var18;
                                          }
                                       }
                                    } while(var1);

                                    if (var18 != -1) {
                                       class794.field11597[var8] = var18;
                                       var20 = 255 & var18 >> 8;
                                       var21 = var18 & 255;
                                       class777.field11300[var8] = class95.field1264.method740(class168.method1321(arg0, 31), "m" + var20 + "_" + var21);
                                       class548.field7491[var8] = class95.field1264.method740(arg0 + 31, "l" + var20 + "_" + var21);
                                       class12.field142[var8] = class95.field1264.method740(-1, field5208[6] + var20 + "_" + var21);
                                       class215.field2661[var8] = class95.field1264.method740(-1, field5208[5] + var20 + "_" + var21);
                                       ++var8;
                                    }

                                    ++var14;
                                 }
                              } while(~(class215.field2667 >> 3) < ~var14);
                           }

                           ++var13;
                        } while(~var13 > ~(class507.field7030 >> 3));
                     }

                     ++var12;
                     if (var12 >= 4) {
                        var10000 = var3;
                        if (!var1) {
                           class778.method5571(var3, false, 12, var4, var6);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }
            } else {
               var8 = 0;
            }

            while(true) {
               label508: {
                  int var9;
                  int var10;
                  if (var1) {
                     var9 = 0;
                     if (var1) {
                        var10 = var2.method1566(1, -12869);
                        if (var10 != 1) {
                           class406.field5727[var7][var8][var9] = -1;
                           if (var1) {
                              class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                           ++var9;
                        }
                     }
                  } else {
                     if (class507.field7030 >> 3 <= var8) {
                        break label508;
                     }

                     var9 = 0;
                     if (var1) {
                        var10 = var2.method1566(1, -12869);
                        if (var10 != 1) {
                           class406.field5727[var7][var8][var9] = -1;
                           if (var1) {
                              class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                           ++var9;
                        }
                     }
                  }

                  while(true) {
                     while(class215.field2667 >> 3 > var9) {
                        var10 = var2.method1566(1, -12869);
                        if (var10 != 1) {
                           class406.field5727[var7][var8][var9] = -1;
                           if (var1) {
                              class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                           ++var9;
                        }
                     }

                     ++var8;
                     if (class507.field7030 >> 3 <= var8) {
                        break;
                     }

                     var9 = 0;
                     if (var1) {
                        var10 = var2.method1566(1, -12869);
                        if (var10 != 1) {
                           class406.field5727[var7][var8][var9] = -1;
                           if (var1) {
                              class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class406.field5727[var7][var8][var9] = var2.method1566(26, -12869);
                           ++var9;
                        }
                     }
                  }
               }

               ++var7;
               if (var7 >= 4) {
                  var2.method1554(arg0 + 39);
                  var8 = (class605.field8474.field2798 - var2.field8243) / 16;
                  class178.field2213 = new int[var8][4];
                  var11 = 0;
                  if (!var1) {
                     label117: {
                        if (var1) {
                           var12 = 0;
                           if (var1) {
                              class178.field2213[var11][var12] = var2.method4302(true);
                              ++var12;
                           }
                        } else {
                           if (~var8 >= ~var11) {
                              class215.field2661 = new int[var8];
                              class325.field4367 = new byte[var8][];
                              class239.field2982 = null;
                              class125.field1565 = new byte[var8][];
                              class548.field7491 = new int[var8];
                              class12.field142 = new int[var8];
                              class794.field11597 = new int[var8];
                              class527.field7205 = new byte[var8][];
                              class777.field11309 = new byte[var8][];
                              class777.field11300 = new int[var8];
                              class740.field10786 = null;
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break label117;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class178.field2213[var11][var12] = var2.method4302(true);
                              ++var12;
                           }
                        }

                        while(true) {
                           while(~var12 > -5) {
                              class178.field2213[var11][var12] = var2.method4302(true);
                              ++var12;
                           }

                           if (!var1) {
                              ++var11;
                              if (~var8 >= ~var11) {
                                 class215.field2661 = new int[var8];
                                 class325.field4367 = new byte[var8][];
                                 class239.field2982 = null;
                                 class125.field1565 = new byte[var8][];
                                 class548.field7491 = new int[var8];
                                 class12.field142 = new int[var8];
                                 class794.field11597 = new int[var8];
                                 class527.field7205 = new byte[var8][];
                                 class777.field11309 = new byte[var8][];
                                 class777.field11300 = new int[var8];
                                 class740.field10786 = null;
                                 var8 = 0;
                                 var12 = 0;
                                 if (!var1) {
                                    break;
                                 }
                              } else {
                                 var12 = 0;
                              }

                              if (var1) {
                                 class178.field2213[var11][var12] = var2.method4302(true);
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        }
                     }

                     if (var1) {
                        var10000 = 0;
                     } else if (var12 >= 4) {
                        var10000 = var3;
                        if (!var1) {
                           class778.method5571(var3, false, 12, var4, var6);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        var13 = var10000;
                        if (var1 || ~var13 > ~(class507.field7030 >> 3)) {
                           do {
                              var14 = 0;
                              if (var1 || ~(class215.field2667 >> 3) < ~var14) {
                                 label199:
                                 do {
                                    var15 = class406.field5727[var12][var13][var14];
                                    if (~var15 == 0) {
                                       ++var14;
                                    } else {
                                       var16 = 1023 & var15 >> 14;
                                       var17 = (var15 & 16376) >> 3;
                                       var18 = (var16 / 8 << 8) - -(var17 / 8);
                                       var19 = 0;
                                       if (var1) {
                                          var10000 = class794.field11597[var19];
                                          var10001 = var18;
                                       } else if (~var8 >= ~var19) {
                                          var10000 = var18;
                                          var10001 = -1;
                                          if (!var1) {
                                             if (var18 != -1) {
                                                class794.field11597[var8] = var18;
                                                var20 = 255 & var18 >> 8;
                                                var21 = var18 & 255;
                                                class777.field11300[var8] = class95.field1264.method740(class168.method1321(arg0, 31), "m" + var20 + "_" + var21);
                                                class548.field7491[var8] = class95.field1264.method740(arg0 + 31, "l" + var20 + "_" + var21);
                                                class12.field142[var8] = class95.field1264.method740(-1, field5208[6] + var20 + "_" + var21);
                                                class215.field2661[var8] = class95.field1264.method740(-1, field5208[5] + var20 + "_" + var21);
                                                ++var8;
                                             }

                                             ++var14;
                                             continue;
                                          }
                                       } else {
                                          var10000 = class794.field11597[var19];
                                          var10001 = var18;
                                       }

                                       do {
                                          while(true) {
                                             if (var10000 == var10001) {
                                                var18 = -1;
                                                if (!var1) {
                                                   var10000 = var18;
                                                   var10001 = -1;
                                                   break;
                                                }

                                                ++var19;
                                             } else {
                                                ++var19;
                                             }

                                             if (~var8 >= ~var19) {
                                                var10000 = var18;
                                                var10001 = -1;
                                                if (!var1) {
                                                   if (var18 != -1) {
                                                      class794.field11597[var8] = var18;
                                                      var20 = 255 & var18 >> 8;
                                                      var21 = var18 & 255;
                                                      class777.field11300[var8] = class95.field1264.method740(class168.method1321(arg0, 31), "m" + var20 + "_" + var21);
                                                      class548.field7491[var8] = class95.field1264.method740(arg0 + 31, "l" + var20 + "_" + var21);
                                                      class12.field142[var8] = class95.field1264.method740(-1, field5208[6] + var20 + "_" + var21);
                                                      class215.field2661[var8] = class95.field1264.method740(-1, field5208[5] + var20 + "_" + var21);
                                                      ++var8;
                                                   }

                                                   ++var14;
                                                   continue label199;
                                                }
                                             } else {
                                                var10000 = class794.field11597[var19];
                                                var10001 = var18;
                                             }
                                          }
                                       } while(var1);

                                       if (var18 != -1) {
                                          class794.field11597[var8] = var18;
                                          var20 = 255 & var18 >> 8;
                                          var21 = var18 & 255;
                                          class777.field11300[var8] = class95.field1264.method740(class168.method1321(arg0, 31), "m" + var20 + "_" + var21);
                                          class548.field7491[var8] = class95.field1264.method740(arg0 + 31, "l" + var20 + "_" + var21);
                                          class12.field142[var8] = class95.field1264.method740(-1, field5208[6] + var20 + "_" + var21);
                                          class215.field2661[var8] = class95.field1264.method740(-1, field5208[5] + var20 + "_" + var21);
                                          ++var8;
                                       }

                                       ++var14;
                                    }
                                 } while(~(class215.field2667 >> 3) < ~var14);
                              }

                              ++var13;
                           } while(~var13 > ~(class507.field7030 >> 3));
                        }

                        ++var12;
                        if (var12 >= 4) {
                           var10000 = var3;
                           if (!var1) {
                              class778.method5571(var3, false, 12, var4, var6);
                              return;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }
               } else {
                  var8 = 0;
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field5208[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2850(int arg0) {
      try {
         ++field5192;
         if (arg0 != 6015) {
            field5205 = 24;
         }

         class468.field6451 = new class657[class639.field9016.method719(true)][];
         class549.field7503 = new class657[class639.field9016.method719(true)][];
         class388.field5433 = new boolean[class639.field9016.method719(true)];
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5208[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method2851(byte arg0) {
      try {
         if (arg0 > -61) {
            return 55;
         } else {
            ++field5196;
            return super.field7632;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5208[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            field5204 = true;
         }

         ++field5189;
         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5208[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2852(int arg0) {
      try {
         field5195 = null;
         if (arg0 == 0) {
            field5203 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5208[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "(B)V"
   )
   public static final void method2853(byte arg0) {
      try {
         class60.field642.method4245(true);
         ++field5206;
         if (arg0 < 83) {
            method2849((byte)-41);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5208[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            return 112;
         } else {
            ++field5194;
            if (class406.method3083((byte)36, arg0)) {
               if (super.field7633.field8451.method2771(3) && !class677.method4965(28991, super.field7633.field8451.method2770((byte)-106))) {
                  return 3;
               }

               if (~super.field7633.field8464.method996((byte)-100) == -2) {
                  return 3;
               }
            }

            if (arg0 == 3) {
               return 3;
            } else {
               return class406.method3083((byte)36, arg0) ? 2 : 1;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5208[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2854(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg3 == 2) {
            ++field5197;
            int var5 = class206.field2535;
            if (~var5 != -1) {
               if (~var5 == -2) {
                  class529.field7263 = arg1;
                  class366.field5164 = arg0;
                  class534.field7300 = arg4;
                  class290.field3837 = arg2;
                  class206.field2535 = 2;
                  return;
               }

               if (~var5 != -3) {
                  return;
               }

               if (!client.field4273) {
                  if (arg4 < class534.field7300) {
                     class534.field7300 = arg4;
                  }

                  if (class529.field7263 > arg1) {
                     class529.field7263 = arg1;
                  }

                  if (arg0 > class366.field5164) {
                     class366.field5164 = arg0;
                  }

                  if (~arg2 < ~class290.field3837) {
                     class290.field3837 = arg2;
                  }

                  return;
               }
            }

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5208[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2855(byte arg0) {
      try {
         ++field5207;
         return arg0 < 81 ? true : class406.method3083((byte)36, super.field7632);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5208[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "(B)Z"
   )
   public final boolean method2856(byte arg0) {
      try {
         if (arg0 != -107) {
            this.method633(-86, (byte)-88);
         }

         ++field5200;
         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5208[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class369(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2857(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2858(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
