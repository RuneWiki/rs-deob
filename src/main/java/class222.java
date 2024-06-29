import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class222 extends class67 {
   @OriginalMember(
      owner = "client!tj",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3349 = new String[]{method1921(method1920("fA4sU")), method1921(method1920("fA4~U")), method1921(method1920("fA4rU")), method1921(method1920("fA4uU")), method1921(method1920("fA4qU")), method1921(method1920("gG")), method1921(method1920("gF")), method1921(method1920("fA4tU")), method1921(method1920("fA4\u007fU")), method1921(method1920("fA4pU")), method1921(method1920("fA4vU"))};
   @OriginalMember(
      owner = "client!tj",
      name = "y",
      descriptor = "I"
   )
   public static int field3342 = 0;
   @OriginalMember(
      owner = "client!tj",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field3341 = true;
   @OriginalMember(
      owner = "client!tj",
      name = "s",
      descriptor = "I"
   )
   public static int field3343 = 0;
   @OriginalMember(
      owner = "client!tj",
      name = "v",
      descriptor = "Ldha;"
   )
   public static class642 field3340 = new class642("", 14);
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field3347 = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
   @OriginalMember(
      owner = "client!tj",
      name = "p",
      descriptor = "Lnaa;"
   )
   public static class113 field3348 = new class113(26, 2);
   @OriginalMember(
      owner = "client!tj",
      name = "w",
      descriptor = "I"
   )
   public static int field3332;
   @OriginalMember(
      owner = "client!tj",
      name = "u",
      descriptor = "I"
   )
   public static int field3333;
   @OriginalMember(
      owner = "client!tj",
      name = "t",
      descriptor = "I"
   )
   public static int field3334;
   @OriginalMember(
      owner = "client!tj",
      name = "m",
      descriptor = "I"
   )
   public static int field3335;
   @OriginalMember(
      owner = "client!tj",
      name = "l",
      descriptor = "I"
   )
   public static int field3336;
   @OriginalMember(
      owner = "client!tj",
      name = "r",
      descriptor = "I"
   )
   public static int field3337;
   @OriginalMember(
      owner = "client!tj",
      name = "o",
      descriptor = "I"
   )
   public static int field3338;
   @OriginalMember(
      owner = "client!tj",
      name = "k",
      descriptor = "I"
   )
   public static int field3339;
   @OriginalMember(
      owner = "client!tj",
      name = "A",
      descriptor = "I"
   )
   public static int field3344;
   @OriginalMember(
      owner = "client!tj",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field3345;
   @OriginalMember(
      owner = "client!tj",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field3346;

   @OriginalMember(
      owner = "client!tj",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class222(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method162(127);
         }

         ++field3336;
         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3349[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field3342 = -17;
         }

         ++field3334;
         return 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3349[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1915(boolean arg0) {
      boolean var1 = client.field1786;

      try {
         ++field3332;
         class102 var2 = class510.field7801.field362;
         int var3 = var2.method2834(7183);
         int var4 = var2.method2877(-31130);
         class55.field683 = var2.method2857((byte)120);
         int var5 = var2.method2848(-112);
         int var6 = ~var2.method2877(-31130) != -2 ? 0 : 1;
         class227.method1966((byte)-1);
         class735.method5409((byte)20, var4);
         var2.method994(-19645);
         if (!arg0) {
            method1919(-23);
         }

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
            var2.method986(8);
            var8 = (-var2.field5436 + class510.field7801.field370) / 16;
            class398.field6243 = new int[var8][4];
            var11 = 0;
            if (!var1) {
               label275: {
                  if (var1) {
                     var12 = 0;
                     if (var1) {
                        class398.field6243[var11][var12] = var2.method2894(118);
                        ++var12;
                     }
                  } else {
                     if (~var8 >= ~var11) {
                        class190.field2943 = null;
                        class147.field2216 = new int[var8];
                        class109.field1510 = new int[var8];
                        class341.field5192 = new byte[var8][];
                        class104.field1448 = new int[var8];
                        class332.field5034 = new byte[var8][];
                        class614.field8918 = new int[var8];
                        class511.field7815 = new byte[var8][];
                        class689.field10244 = new byte[var8][];
                        class62.field796 = new int[var8];
                        class432.field6654 = null;
                        var8 = 0;
                        var12 = 0;
                        if (!var1) {
                           break label275;
                        }
                     } else {
                        var12 = 0;
                     }

                     if (var1) {
                        class398.field6243[var11][var12] = var2.method2894(118);
                        ++var12;
                     }
                  }

                  while(true) {
                     while(~var12 > -5) {
                        class398.field6243[var11][var12] = var2.method2894(118);
                        ++var12;
                     }

                     if (!var1) {
                        ++var11;
                        if (~var8 >= ~var11) {
                           class190.field2943 = null;
                           class147.field2216 = new int[var8];
                           class109.field1510 = new int[var8];
                           class341.field5192 = new byte[var8][];
                           class104.field1448 = new int[var8];
                           class332.field5034 = new byte[var8][];
                           class614.field8918 = new int[var8];
                           class511.field7815 = new byte[var8][];
                           class689.field10244 = new byte[var8][];
                           class62.field796 = new int[var8];
                           class432.field6654 = null;
                           var8 = 0;
                           var12 = 0;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class398.field6243[var11][var12] = var2.method2894(118);
                           ++var12;
                        }
                     } else {
                        ++var12;
                     }
                  }
               }

               if (var1) {
                  var10000 = 0;
               } else if (~var12 <= -5) {
                  var10000 = var6;
                  if (!var1) {
                     class510.method3965((boolean)var6, var5, 12, var3, (byte)97);
                     return;
                  }
               } else {
                  var10000 = 0;
               }

               while(true) {
                  var13 = var10000;
                  if (var1 || class513.field7828 >> 3 > var13) {
                     do {
                        var14 = 0;
                        if (var1 || class475.field7230 >> 3 > var14) {
                           label375:
                           do {
                              var15 = class285.field4496[var12][var13][var14];
                              if (~var15 == 0) {
                                 ++var14;
                              } else {
                                 var16 = 1023 & var15 >> 14;
                                 var17 = (var15 & 16383) >> 3;
                                 var18 = (var16 / 8 << 8) + var17 / 8;
                                 var19 = 0;
                                 if (var1) {
                                    var10000 = class62.field796[var19];
                                    var10001 = var18;
                                 } else if (~var19 <= ~var8) {
                                    var10000 = var18;
                                    var10001 = -1;
                                    if (!var1) {
                                       if (var18 != -1) {
                                          class62.field796[var8] = var18;
                                          var20 = 255 & var18 >> 8;
                                          var21 = var18 & 255;
                                          class614.field8918[var8] = class742.field11031.method4999("m" + var20 + "_" + var21, (byte)63);
                                          class104.field1448[var8] = class742.field11031.method4999("l" + var20 + "_" + var21, (byte)101);
                                          class109.field1510[var8] = class742.field11031.method4999(field3349[6] + var20 + "_" + var21, (byte)116);
                                          class147.field2216[var8] = class742.field11031.method4999(field3349[5] + var20 + "_" + var21, (byte)37);
                                          ++var8;
                                       }

                                       ++var14;
                                       continue;
                                    }
                                 } else {
                                    var10000 = class62.field796[var19];
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

                                       if (~var19 <= ~var8) {
                                          var10000 = var18;
                                          var10001 = -1;
                                          if (!var1) {
                                             if (var18 != -1) {
                                                class62.field796[var8] = var18;
                                                var20 = 255 & var18 >> 8;
                                                var21 = var18 & 255;
                                                class614.field8918[var8] = class742.field11031.method4999("m" + var20 + "_" + var21, (byte)63);
                                                class104.field1448[var8] = class742.field11031.method4999("l" + var20 + "_" + var21, (byte)101);
                                                class109.field1510[var8] = class742.field11031.method4999(field3349[6] + var20 + "_" + var21, (byte)116);
                                                class147.field2216[var8] = class742.field11031.method4999(field3349[5] + var20 + "_" + var21, (byte)37);
                                                ++var8;
                                             }

                                             ++var14;
                                             continue label375;
                                          }
                                       } else {
                                          var10000 = class62.field796[var19];
                                          var10001 = var18;
                                       }
                                    }
                                 } while(var1);

                                 if (var18 != -1) {
                                    class62.field796[var8] = var18;
                                    var20 = 255 & var18 >> 8;
                                    var21 = var18 & 255;
                                    class614.field8918[var8] = class742.field11031.method4999("m" + var20 + "_" + var21, (byte)63);
                                    class104.field1448[var8] = class742.field11031.method4999("l" + var20 + "_" + var21, (byte)101);
                                    class109.field1510[var8] = class742.field11031.method4999(field3349[6] + var20 + "_" + var21, (byte)116);
                                    class147.field2216[var8] = class742.field11031.method4999(field3349[5] + var20 + "_" + var21, (byte)37);
                                    ++var8;
                                 }

                                 ++var14;
                              }
                           } while(class475.field7230 >> 3 > var14);
                        }

                        ++var13;
                     } while(class513.field7828 >> 3 > var13);
                  }

                  ++var12;
                  if (~var12 <= -5) {
                     var10000 = var6;
                     if (!var1) {
                        class510.method3965((boolean)var6, var5, 12, var3, (byte)97);
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
            label510: {
               int var9;
               int var10;
               if (var1) {
                  var9 = 0;
                  if (var1) {
                     var10 = var2.method988((byte)-116, 1);
                     if (var10 == 1) {
                        class285.field4496[var7][var8][var9] = var2.method988((byte)-116, 26);
                        if (var1) {
                           class285.field4496[var7][var8][var9] = -1;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        class285.field4496[var7][var8][var9] = -1;
                        ++var9;
                     }
                  }
               } else {
                  if (~(class513.field7828 >> 3) >= ~var8) {
                     break label510;
                  }

                  var9 = 0;
                  if (var1) {
                     var10 = var2.method988((byte)-116, 1);
                     if (var10 == 1) {
                        class285.field4496[var7][var8][var9] = var2.method988((byte)-116, 26);
                        if (var1) {
                           class285.field4496[var7][var8][var9] = -1;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        class285.field4496[var7][var8][var9] = -1;
                        ++var9;
                     }
                  }
               }

               while(true) {
                  while(var9 < class475.field7230 >> 3) {
                     var10 = var2.method988((byte)-116, 1);
                     if (var10 == 1) {
                        class285.field4496[var7][var8][var9] = var2.method988((byte)-116, 26);
                        if (var1) {
                           class285.field4496[var7][var8][var9] = -1;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        class285.field4496[var7][var8][var9] = -1;
                        ++var9;
                     }
                  }

                  ++var8;
                  if (~(class513.field7828 >> 3) >= ~var8) {
                     break;
                  }

                  var9 = 0;
                  if (var1) {
                     var10 = var2.method988((byte)-116, 1);
                     if (var10 == 1) {
                        class285.field4496[var7][var8][var9] = var2.method988((byte)-116, 26);
                        if (var1) {
                           class285.field4496[var7][var8][var9] = -1;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        class285.field4496[var7][var8][var9] = -1;
                        ++var9;
                     }
                  }
               }
            }

            ++var7;
            if (var7 >= 4) {
               var2.method986(8);
               var8 = (-var2.field5436 + class510.field7801.field370) / 16;
               class398.field6243 = new int[var8][4];
               var11 = 0;
               if (!var1) {
                  label119: {
                     if (var1) {
                        var12 = 0;
                        if (var1) {
                           class398.field6243[var11][var12] = var2.method2894(118);
                           ++var12;
                        }
                     } else {
                        if (~var8 >= ~var11) {
                           class190.field2943 = null;
                           class147.field2216 = new int[var8];
                           class109.field1510 = new int[var8];
                           class341.field5192 = new byte[var8][];
                           class104.field1448 = new int[var8];
                           class332.field5034 = new byte[var8][];
                           class614.field8918 = new int[var8];
                           class511.field7815 = new byte[var8][];
                           class689.field10244 = new byte[var8][];
                           class62.field796 = new int[var8];
                           class432.field6654 = null;
                           var8 = 0;
                           var12 = 0;
                           if (!var1) {
                              break label119;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class398.field6243[var11][var12] = var2.method2894(118);
                           ++var12;
                        }
                     }

                     while(true) {
                        while(~var12 > -5) {
                           class398.field6243[var11][var12] = var2.method2894(118);
                           ++var12;
                        }

                        if (!var1) {
                           ++var11;
                           if (~var8 >= ~var11) {
                              class190.field2943 = null;
                              class147.field2216 = new int[var8];
                              class109.field1510 = new int[var8];
                              class341.field5192 = new byte[var8][];
                              class104.field1448 = new int[var8];
                              class332.field5034 = new byte[var8][];
                              class614.field8918 = new int[var8];
                              class511.field7815 = new byte[var8][];
                              class689.field10244 = new byte[var8][];
                              class62.field796 = new int[var8];
                              class432.field6654 = null;
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class398.field6243[var11][var12] = var2.method2894(118);
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     }
                  }

                  if (var1) {
                     var10000 = 0;
                  } else if (~var12 <= -5) {
                     var10000 = var6;
                     if (!var1) {
                        class510.method3965((boolean)var6, var5, 12, var3, (byte)97);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     var13 = var10000;
                     if (var1 || class513.field7828 >> 3 > var13) {
                        do {
                           var14 = 0;
                           if (var1 || class475.field7230 >> 3 > var14) {
                              label201:
                              do {
                                 var15 = class285.field4496[var12][var13][var14];
                                 if (~var15 == 0) {
                                    ++var14;
                                 } else {
                                    var16 = 1023 & var15 >> 14;
                                    var17 = (var15 & 16383) >> 3;
                                    var18 = (var16 / 8 << 8) + var17 / 8;
                                    var19 = 0;
                                    if (var1) {
                                       var10000 = class62.field796[var19];
                                       var10001 = var18;
                                    } else if (~var19 <= ~var8) {
                                       var10000 = var18;
                                       var10001 = -1;
                                       if (!var1) {
                                          if (var18 != -1) {
                                             class62.field796[var8] = var18;
                                             var20 = 255 & var18 >> 8;
                                             var21 = var18 & 255;
                                             class614.field8918[var8] = class742.field11031.method4999("m" + var20 + "_" + var21, (byte)63);
                                             class104.field1448[var8] = class742.field11031.method4999("l" + var20 + "_" + var21, (byte)101);
                                             class109.field1510[var8] = class742.field11031.method4999(field3349[6] + var20 + "_" + var21, (byte)116);
                                             class147.field2216[var8] = class742.field11031.method4999(field3349[5] + var20 + "_" + var21, (byte)37);
                                             ++var8;
                                          }

                                          ++var14;
                                          continue;
                                       }
                                    } else {
                                       var10000 = class62.field796[var19];
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

                                          if (~var19 <= ~var8) {
                                             var10000 = var18;
                                             var10001 = -1;
                                             if (!var1) {
                                                if (var18 != -1) {
                                                   class62.field796[var8] = var18;
                                                   var20 = 255 & var18 >> 8;
                                                   var21 = var18 & 255;
                                                   class614.field8918[var8] = class742.field11031.method4999("m" + var20 + "_" + var21, (byte)63);
                                                   class104.field1448[var8] = class742.field11031.method4999("l" + var20 + "_" + var21, (byte)101);
                                                   class109.field1510[var8] = class742.field11031.method4999(field3349[6] + var20 + "_" + var21, (byte)116);
                                                   class147.field2216[var8] = class742.field11031.method4999(field3349[5] + var20 + "_" + var21, (byte)37);
                                                   ++var8;
                                                }

                                                ++var14;
                                                continue label201;
                                             }
                                          } else {
                                             var10000 = class62.field796[var19];
                                             var10001 = var18;
                                          }
                                       }
                                    } while(var1);

                                    if (var18 != -1) {
                                       class62.field796[var8] = var18;
                                       var20 = 255 & var18 >> 8;
                                       var21 = var18 & 255;
                                       class614.field8918[var8] = class742.field11031.method4999("m" + var20 + "_" + var21, (byte)63);
                                       class104.field1448[var8] = class742.field11031.method4999("l" + var20 + "_" + var21, (byte)101);
                                       class109.field1510[var8] = class742.field11031.method4999(field3349[6] + var20 + "_" + var21, (byte)116);
                                       class147.field2216[var8] = class742.field11031.method4999(field3349[5] + var20 + "_" + var21, (byte)37);
                                       ++var8;
                                    }

                                    ++var14;
                                 }
                              } while(class475.field7230 >> 3 > var14);
                           }

                           ++var13;
                        } while(class513.field7828 >> 3 > var13);
                     }

                     ++var12;
                     if (~var12 <= -5) {
                        var10000 = var6;
                        if (!var1) {
                           class510.method3965((boolean)var6, var5, 12, var3, (byte)97);
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
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field3349[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 == -69) {
            label30: {
               ++field3344;
               if (super.field881.method292((byte)116) == class619.field9004) {
                  if (!super.field881.method298(arg0 + 165)) {
                     break label30;
                  }

                  super.field877 = 0;
                  if (!client.field1786) {
                     break label30;
                  }
               }

               super.field877 = 1;
            }

            if (super.field877 != 0 && ~super.field877 != -2) {
               super.field877 = this.method162(arg0 ^ -69);
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3349[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1916(int arg0) {
      try {
         ++field3333;
         if (super.field881.method298(arg0 + -3247)) {
            return false;
         } else if (arg0 != 3343) {
            return false;
         } else {
            return super.field881.method292((byte)119) == class619.field9004;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3349[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIIZZI)V"
   )
   public static final void method1917(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field3335;
         long var7 = (long)((!arg3 ? 0 : Integer.MIN_VALUE) | arg1);
         class503 var9 = (class503)class263.field4321.method3141(var7, !arg4);
         if (var9 == null) {
            var9 = new class503();
            class263.field4321.method3143(48, var9, var7);
         }

         if (arg4) {
            method1917(-100, -126, -16, false, false, 32);
         }

         if (~var9.field7680.length >= ~arg0) {
            int[] var10 = new int[arg0 + 1];
            int[] var11 = new int[arg0 - -1];
            int var12 = 0;
            if (var6) {
               var10[var12] = var9.field7680[var12];
               var11[var12] = var9.field7681[var12];
               ++var12;
            }

            label74:
            while(true) {
               while(~var12 > ~var9.field7680.length) {
                  var10[var12] = var9.field7680[var12];
                  var11[var12] = var9.field7681[var12];
                  ++var12;
               }

               int var13 = var9.field7680.length;
               if (!var6) {
                  if (var6) {
                     var10[var13] = -1;
                     var11[var13] = 0;
                     ++var13;
                  }

                  while(true) {
                     while(~arg0 < ~var13) {
                        var10[var13] = -1;
                        var11[var13] = 0;
                        ++var13;
                     }

                     var9.field7680 = var10;
                     if (!var6) {
                        var9.field7681 = var11;
                        break label74;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }

         var9.field7680[arg0] = arg2;
         var9.field7681[arg0] = arg5;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field3349[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method1918(int arg0) {
      try {
         ++field3339;
         if (arg0 != 480102311) {
            method1917(-99, 100, -49, true, false, -31);
         }

         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3349[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field3338;
         if (super.field881.method298(96)) {
            return 3;
         } else if (super.field881.method292((byte)124) == class619.field9004) {
            if (~arg0 == -1) {
               if (super.field881.field495.method5210(480102311) == 1) {
                  return 2;
               }

               if (~super.field881.field547.method4414(480102311) == -2) {
                  return 2;
               }

               if (~super.field881.field525.method4566(480102311) < -1) {
                  return 2;
               }
            }

            return 1;
         } else {
            if (arg1 > -74) {
               field3342 = 32;
            }

            return 3;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3349[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1919(int arg0) {
      try {
         field3346 = null;
         if (arg0 != -26165) {
            method1915(false);
         }

         field3348 = null;
         field3347 = null;
         field3345 = null;
         field3340 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3349[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class222(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1920(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1921(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
