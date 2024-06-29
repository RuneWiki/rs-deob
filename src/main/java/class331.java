import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class331 extends class555 {
   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4741 = new String[]{method2632(method2631("\t_\u00004\u0014I")), method2632(method2631("\t_\u00004\u0013I")), method2632(method2631("\t_\u00004\u0010I")), method2632(method2631("\t_\u00004\u0015I")), method2632(method2631("\t_\u00004\u0017I")), method2632(method2631("\t_\u00004\u0016I")), method2632(method2631("\fJ")), method2632(method2631(">J\u0015{%\bZ\u0004v4\f\\\u000fn\"")), method2632(method2631("5V\u000eqkA")), method2632(method2631("\t_\u00004\u0012I")), method2632(method2631("][\u0013$yP\tQ?x"))};
   @OriginalMember(
      owner = "client!hfa",
      name = "h",
      descriptor = "I"
   )
   public static int field4734 = 0;
   @OriginalMember(
      owner = "client!hfa",
      name = "m",
      descriptor = "[Lfg;"
   )
   public static class138[] field4738 = new class138[4];
   @OriginalMember(
      owner = "client!hfa",
      name = "j",
      descriptor = "I"
   )
   public static int field4732;
   @OriginalMember(
      owner = "client!hfa",
      name = "i",
      descriptor = "I"
   )
   public static int field4733;
   @OriginalMember(
      owner = "client!hfa",
      name = "l",
      descriptor = "I"
   )
   public static int field4735;
   @OriginalMember(
      owner = "client!hfa",
      name = "f",
      descriptor = "I"
   )
   public static int field4736;
   @OriginalMember(
      owner = "client!hfa",
      name = "n",
      descriptor = "I"
   )
   public static int field4737;
   @OriginalMember(
      owner = "client!hfa",
      name = "g",
      descriptor = "I"
   )
   public static int field4739;
   @OriginalMember(
      owner = "client!hfa",
      name = "k",
      descriptor = "I"
   )
   public static int field4740;

   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method2628(byte arg0) {
      try {
         ++field4739;
         return arg0 > -61 ? -41 : super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4741[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field4740;
         if (arg0 < 124) {
            return 116;
         } else {
            return super.field7633.method4418((byte)-123) == class551.field7585 && super.field7633.method4414(0) ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4741[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 == -13712) {
            ++field4732;
            super.field7632 = this.method635(127);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4741[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field4736;
         return arg1 <= 36 ? -112 : 3;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4741[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2629(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         class784.method5648(true, false);
         ++field4735;
         class256.field3272 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1) {
            if (~class777.field11300[var3] != 0 && class325.field4367[var3] == null) {
               class325.field4367[var3] = class95.field1264.method732(0, class777.field11300[var3], (byte)75);
               if (class325.field4367[var3] == null) {
                  var2 = false;
                  ++class256.field3272;
               }
            }

            if (~class548.field7491[var3] != 0 && class777.field11309[var3] == null) {
               class777.field11309[var3] = class95.field1264.method735(0, class178.field2213[var3], (byte)127, class548.field7491[var3]);
               if (class777.field11309[var3] == null) {
                  ++class256.field3272;
                  var2 = false;
               }
            }

            if (~class12.field142[var3] != 0 && class125.field1565[var3] == null) {
               class125.field1565[var3] = class95.field1264.method732(0, class12.field142[var3], (byte)99);
               if (class125.field1565[var3] == null) {
                  ++class256.field3272;
                  var2 = false;
               }
            }

            if (~class215.field2661[var3] != 0 && class527.field7205[var3] == null) {
               class527.field7205[var3] = class95.field1264.method732(0, class215.field2661[var3], (byte)54);
               if (class527.field7205[var3] == null) {
                  var2 = false;
                  ++class256.field3272;
               }
            }

            if (class740.field10786 != null && class239.field2982[var3] == null && class740.field10786[var3] != -1) {
               class239.field2982[var3] = class95.field1264.method735(0, class178.field2213[var3], (byte)121, class740.field10786[var3]);
               if (class239.field2982[var3] == null) {
                  ++class256.field3272;
                  var2 = false;
               }
            }

            ++var3;
         }

         while(true) {
            if (class325.field4367.length <= var3) {
               if (!var1) {
                  if (class222.field2768 == null) {
                     label782: {
                        if (class29.field360 != null && class554.field7627.method731(class29.field360.field1576 + field4741[7], (byte)100)) {
                           if (!class554.field7627.method741(-16463, class29.field360.field1576 + field4741[7])) {
                              ++class256.field3272;
                              var2 = false;
                              if (!var1) {
                                 break label782;
                              }
                           }

                           class222.field2768 = class90.method860(class56.field607, class554.field7627, class29.field360.field1576 + field4741[7], (byte)-127);
                           if (!var1) {
                              break label782;
                           }
                        }

                        class222.field2768 = new class263(0);
                     }
                  }

                  if (!var2) {
                     class76.field957 = 1;
                     return;
                  }

                  class12.field145 = 0;
                  boolean var4 = true;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (var1) {
                     var6 = class777.field11309[var5];
                     if (var6 != null) {
                        var7 = (class794.field11597[var5] >> 8) * 64 + -class752.field10921;
                        var8 = (class794.field11597[var5] & 255) * 64 - class17.field237;
                        if (~class677.field9944 != -1) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class322.method2422(var6, class215.field2667, var8, var7, class507.field7030, 27342);
                     }

                     var9 = class527.field7205[var5];
                     if (var9 != null) {
                        var10 = (class794.field11597[var5] >> 8) * 64 + -class752.field10921;
                        var11 = (class794.field11597[var5] & 255) * 64 + -class17.field237;
                        if (~class677.field9944 != -1) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class322.method2422(var9, class215.field2667, var11, var10, class507.field7030, 27342);
                     }

                     ++var5;
                  }

                  while(~class325.field4367.length < ~var5) {
                     var6 = class777.field11309[var5];
                     if (var6 != null) {
                        var7 = (class794.field11597[var5] >> 8) * 64 + -class752.field10921;
                        var8 = (class794.field11597[var5] & 255) * 64 - class17.field237;
                        if (~class677.field9944 != -1) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class322.method2422(var6, class215.field2667, var8, var7, class507.field7030, 27342);
                     }

                     var9 = class527.field7205[var5];
                     if (var9 != null) {
                        var10 = (class794.field11597[var5] >> 8) * 64 + -class752.field10921;
                        var11 = (class794.field11597[var5] & 255) * 64 + -class17.field237;
                        if (~class677.field9944 != -1) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class322.method2422(var9, class215.field2667, var11, var10, class507.field7030, 27342);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class76.field957 = 2;
                     return;
                  }

                  if (~class76.field957 != -1) {
                     class134.method1128(class551.field7533.method3980(class494.field6787, true) + field4741[10], !arg0, class163.field2095, class22.field281, class338.field4832, true);
                  }

                  class736.method5336((byte)96);
                  class749.method5415(true);
                  class29.method241((byte)124);
                  boolean var12 = false;
                  if (class338.field4832.method517() && class674.field9907.field8450.method1369((byte)-63) == 2) {
                     int var13 = 0;
                     if (var1 || class325.field4367.length > var13) {
                        do {
                           if (class527.field7205[var13] == null) {
                              if (class125.field1565[var13] != null) {
                                 var12 = true;
                                 if (!var1) {
                                    break;
                                 }

                                 ++var13;
                              } else {
                                 ++var13;
                              }
                           } else {
                              var12 = true;
                              if (!var1) {
                                 break;
                              }

                              ++var13;
                           }
                        } while(class325.field4367.length > var13);
                     }
                  }

                  int var14;
                  label712: {
                     if (class674.field9907.field8436.method928((byte)-67) != 1) {
                        var14 = class13.field150[class633.field8954];
                        if (!var1) {
                           break label712;
                        }
                     }

                     var14 = class578.field7934[class633.field8954];
                  }

                  if (class338.field4832.method596()) {
                     ++var14;
                  }

                  label685: {
                     class349.method2754(class338.field4832, class33.field393, 9, 4, class507.field7030, class215.field2667, var14, var12, ~class338.field4832.method500() < -1);
                     class312.method2342(class758.field10979);
                     if (class758.field10979 != 0) {
                        class108.method960(class183.field2263);
                        if (!var1) {
                           break label685;
                        }
                     }

                     class108.method960((class66)null);
                  }

                  int var15 = 0;
                  if (var1) {
                     field4738[var15].method1158((byte)-126);
                     ++var15;
                  }

                  while(true) {
                     while(var15 < 4) {
                        field4738[var15].method1158((byte)-126);
                        ++var15;
                     }

                     class170.method1333(-30690);
                     class367.method2837((byte)47, false);
                     class716.method5211(255);
                     class256.field3271 = null;
                     class355.field5068 = false;
                     class736.method5336((byte)96);
                     System.gc();
                     class784.method5648(true, true);
                     class315.method2368(-16259);
                     class750.field10917 = class674.field9907.field8448.method3509((byte)-111);
                     if (!var1) {
                        label678: {
                           class607.field8509 = class155.field2005 >= 96;
                           class481.field6640 = class674.field9907.field8450.method1369((byte)-92) == 2;
                           class754.field10948 = ~class674.field9907.field8457.method1798((byte)-79) == -2;
                           class691.field10097 = class674.field9907.field8458.method2628((byte)-85) == 1 ? -1 : class316.field4223;
                           class521.field7138 = ~class674.field9907.field8461.method1732((byte)-112) == -2;
                           class153.field1984 = ~class674.field9907.field8447.method4066((byte)-121) == -2;
                           class620.field8662 = new class372(4, class507.field7030, class215.field2667, false);
                           if (~class677.field9944 == -1) {
                              class556.method4009(124, class325.field4367, class620.field8662);
                              if (!var1) {
                                 break label678;
                              }
                           }

                           class750.method5424(class620.field8662, -1187719144, class325.field4367);
                        }

                        class170.method1331(class507.field7030 >> 4, class215.field2667 >> 4, -103);
                        class665.method4815((byte)125);
                        if (var12) {
                           label671: {
                              class530.method3827(true);
                              class378.field5301 = new class372(1, class507.field7030, class215.field2667, true);
                              if (~class677.field9944 != -1) {
                                 class750.method5424(class378.field5301, -1187719144, class125.field1565);
                                 class784.method5648(true, true);
                                 if (!var1) {
                                    break label671;
                                 }
                              }

                              class556.method4009(124, class125.field1565, class378.field5301);
                              class784.method5648(true, true);
                           }

                           class378.field5301.method5050(class620.field8662.field10133[0], 0, 0);
                           class378.field5301.method5044((class138[])null, class338.field4832, (byte)-128, (int[][][])null);
                           class530.method3827(false);
                        }

                        label665: {
                           class620.field8662.method5044(field4738, class338.field4832, (byte)-127, !var12 ? null : class378.field5301.field10133);
                           if (class677.field9944 != 0) {
                              class784.method5648(true, true);
                              class124.method1037(class777.field11309, (byte)-19, class620.field8662);
                              if (!var1) {
                                 break label665;
                              }
                           }

                           class784.method5648(true, true);
                           class20.method173(class777.field11309, class620.field8662, (byte)-114);
                           if (class239.field2982 != null) {
                              class8.method67((byte)-92);
                           }
                        }

                        class749.method5415(true);
                        if (class155.field2005 < 96) {
                           class570.method4092(!arg0);
                        }

                        class784.method5648(arg0, true);
                        class620.field8662.method5040((class295)null, false, var12 ? class73.field900[0] : null, class338.field4832);
                        class620.field8662.method2876(false, class338.field4832, -126);
                        class784.method5648(true, true);
                        if (var12) {
                           label655: {
                              class530.method3827(true);
                              class784.method5648(true, true);
                              if (~class677.field9944 == -1) {
                                 class20.method173(class527.field7205, class378.field5301, (byte)-125);
                                 if (!var1) {
                                    break label655;
                                 }
                              }

                              class124.method1037(class527.field7205, (byte)-19, class378.field5301);
                           }

                           class749.method5415(arg0);
                           class784.method5648(true, true);
                           class378.field5301.method5040(class144.field1906[0], false, (class295)null, class338.field4832);
                           class378.field5301.method2876(true, class338.field4832, 10);
                           class784.method5648(true, true);
                           class530.method3827(false);
                        }

                        class94.method878(-128);
                        int var16 = class620.field8662.field5240;
                        if (~var16 < ~class239.field2981) {
                           var16 = class239.field2981;
                        }

                        if (class239.field2981 + -1 > var16) {
                           var16 = class239.field2981 + -1;
                        }

                        label408: {
                           if (~class674.field9907.field8458.method2628((byte)-124) != -1) {
                              class250.method1883(0);
                              if (!var1) {
                                 break label408;
                              }
                           }

                           class250.method1883(var16);
                        }

                        int var17 = 0;
                        byte var10000;
                        class471 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class471 var27;
                        if (var1) {
                           var10000 = 0;
                        } else if (~var17 <= -5) {
                           class643.method4643(72);
                           class736.method5336((byte)96);
                           class787.method5666((byte)-101);
                           class749.method5415(arg0);
                           var10000 = 0;
                           if (!var1) {
                              class138.method1161(0);
                              if (class533.field7289 != null && class605.field8474.field2779 != null && ~class445.field6162 == -13) {
                                 ++class595.field8286;
                                 var20 = class133.method1118(class605.field8474.field2787, 2, class556.field7637);
                                 var20.field6527.method4337(1057001181, 1184007664);
                                 class605.field8474.method1702((byte)-114, var20);
                              }

                              if (~class677.field9944 == -1) {
                                 var21 = (-(class507.field7030 >> 4) + class446.field6176) / 8;
                                 var22 = ((class507.field7030 >> 4) + class446.field6176) / 8;
                                 var23 = (-(class215.field2667 >> 4) + class270.field3503) / 8;
                                 var24 = (class270.field3503 - -(class215.field2667 >> 4)) / 8;
                                 var25 = var21 + -1;
                                 if (var1 || ~(var22 + 1) <= ~var25) {
                                    do {
                                       var26 = var23 - 1;
                                       if (var1) {
                                          if (var21 <= var25) {
                                             if (~var25 >= ~var22) {
                                                if (~var23 >= ~var26) {
                                                   if (var26 > var24) {
                                                      class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                      class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                   class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             } else {
                                                class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                ++var26;
                                             }
                                          } else {
                                             class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                             class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(~var26 >= ~(var24 + 1)) {
                                             if (var21 <= var25) {
                                                if (~var25 >= ~var22) {
                                                   if (~var23 >= ~var26) {
                                                      if (var26 > var24) {
                                                         class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                         class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                      class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                   class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             } else {
                                                class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                ++var26;
                                             }
                                          }

                                          if (!var1) {
                                             ++var25;
                                             break;
                                          }

                                          class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                          ++var26;
                                       }
                                    } while(~(var22 + 1) <= ~var25);
                                 }
                              }

                              label584: {
                                 if (class445.field6162 != 4) {
                                    if (~class445.field6162 == -9) {
                                       class397.method3019(51, 7);
                                       if (!var1) {
                                          break label584;
                                       }
                                    }

                                    if (class445.field6162 != 10) {
                                       class397.method3019(-56, 11);
                                       if (class605.field8474.field2779 == null) {
                                          break label584;
                                       }

                                       var27 = class133.method1118(class605.field8474.field2787, 2, class573.field7891);
                                       class605.field8474.method1702((byte)-57, var27);
                                       if (!var1) {
                                          break label584;
                                       }
                                    }

                                    class397.method3019(39, 9);
                                    if (!var1) {
                                       break label584;
                                    }
                                 }

                                 class397.method3019(-89, 3);
                              }

                              class568.method4069(108);
                              class736.method5336((byte)96);
                              class132.method1107((byte)-8);
                              class591.field8180 = true;
                              if (class559.field7673) {
                                 class705.method5131(field4741[8] + (-class291.field3843 + class792.method5708(-25005)) + field4741[6], 0);
                                 class559.field7673 = false;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = 0;
                        }

                        while(true) {
                           label645: {
                              int var18 = var10000;
                              int var19;
                              if (var1) {
                                 var19 = 0;
                                 if (var1) {
                                    class792.method5709(var19, var17, (byte)-30, var18);
                                    ++var19;
                                 }
                              } else {
                                 if (~var18 <= ~class507.field7030) {
                                    break label645;
                                 }

                                 var19 = 0;
                                 if (var1) {
                                    class792.method5709(var19, var17, (byte)-30, var18);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(class215.field2667 > var19) {
                                    class792.method5709(var19, var17, (byte)-30, var18);
                                    ++var19;
                                 }

                                 if (!var1) {
                                    ++var18;
                                    if (~var18 <= ~class507.field7030) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1) {
                                       class792.method5709(var19, var17, (byte)-30, var18);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (~var17 <= -5) {
                              class643.method4643(72);
                              class736.method5336((byte)96);
                              class787.method5666((byte)-101);
                              class749.method5415(arg0);
                              var10000 = 0;
                              if (!var1) {
                                 class138.method1161(0);
                                 if (class533.field7289 != null && class605.field8474.field2779 != null && ~class445.field6162 == -13) {
                                    ++class595.field8286;
                                    var20 = class133.method1118(class605.field8474.field2787, 2, class556.field7637);
                                    var20.field6527.method4337(1057001181, 1184007664);
                                    class605.field8474.method1702((byte)-114, var20);
                                 }

                                 if (~class677.field9944 == -1) {
                                    var21 = (-(class507.field7030 >> 4) + class446.field6176) / 8;
                                    var22 = ((class507.field7030 >> 4) + class446.field6176) / 8;
                                    var23 = (-(class215.field2667 >> 4) + class270.field3503) / 8;
                                    var24 = (class270.field3503 - -(class215.field2667 >> 4)) / 8;
                                    var25 = var21 + -1;
                                    if (var1 || ~(var22 + 1) <= ~var25) {
                                       do {
                                          var26 = var23 - 1;
                                          if (var1) {
                                             if (var21 <= var25) {
                                                if (~var25 >= ~var22) {
                                                   if (~var23 >= ~var26) {
                                                      if (var26 > var24) {
                                                         class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                         class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                      class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                   class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             } else {
                                                class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(~var26 >= ~(var24 + 1)) {
                                                if (var21 <= var25) {
                                                   if (~var25 >= ~var22) {
                                                      if (~var23 >= ~var26) {
                                                         if (var26 > var24) {
                                                            class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                            class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                         class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                      class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class95.field1264.method722((byte)119, "m" + var25 + "_" + var26);
                                                   class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             }

                                             if (!var1) {
                                                ++var25;
                                                break;
                                             }

                                             class95.field1264.method722((byte)122, "l" + var25 + "_" + var26);
                                             ++var26;
                                          }
                                       } while(~(var22 + 1) <= ~var25);
                                    }
                                 }

                                 label295: {
                                    if (class445.field6162 != 4) {
                                       if (~class445.field6162 == -9) {
                                          class397.method3019(51, 7);
                                          if (!var1) {
                                             break label295;
                                          }
                                       }

                                       if (class445.field6162 != 10) {
                                          class397.method3019(-56, 11);
                                          if (class605.field8474.field2779 == null) {
                                             break label295;
                                          }

                                          var27 = class133.method1118(class605.field8474.field2787, 2, class573.field7891);
                                          class605.field8474.method1702((byte)-57, var27);
                                          if (!var1) {
                                             break label295;
                                          }
                                       }

                                       class397.method3019(39, 9);
                                       if (!var1) {
                                          break label295;
                                       }
                                    }

                                    class397.method3019(-89, 3);
                                 }

                                 class568.method4069(108);
                                 class736.method5336((byte)96);
                                 class132.method1107((byte)-8);
                                 class591.field8180 = true;
                                 if (class559.field7673) {
                                    class705.method5131(field4741[8] + (-class291.field3843 + class792.method5708(-25005)) + field4741[6], 0);
                                    class559.field7673 = false;
                                    return;
                                 }

                                 return;
                              }
                           } else {
                              var10000 = 0;
                           }
                        }
                     }

                     ++var15;
                  }
               }
            } else if (~class777.field11300[var3] != 0 && class325.field4367[var3] == null) {
               class325.field4367[var3] = class95.field1264.method732(0, class777.field11300[var3], (byte)75);
               if (class325.field4367[var3] == null) {
                  var2 = false;
                  ++class256.field3272;
               }
            }

            if (~class548.field7491[var3] != 0 && class777.field11309[var3] == null) {
               class777.field11309[var3] = class95.field1264.method735(0, class178.field2213[var3], (byte)127, class548.field7491[var3]);
               if (class777.field11309[var3] == null) {
                  ++class256.field3272;
                  var2 = false;
               }
            }

            if (~class12.field142[var3] != 0 && class125.field1565[var3] == null) {
               class125.field1565[var3] = class95.field1264.method732(0, class12.field142[var3], (byte)99);
               if (class125.field1565[var3] == null) {
                  ++class256.field3272;
                  var2 = false;
               }
            }

            if (~class215.field2661[var3] != 0 && class527.field7205[var3] == null) {
               class527.field7205[var3] = class95.field1264.method732(0, class215.field2661[var3], (byte)54);
               if (class527.field7205[var3] == null) {
                  var2 = false;
                  ++class256.field3272;
               }
            }

            if (class740.field10786 != null && class239.field2982[var3] == null && class740.field10786[var3] != -1) {
               class239.field2982[var3] = class95.field1264.method735(0, class178.field2213[var3], (byte)121, class740.field10786[var3]);
               if (class239.field2982[var3] == null) {
                  ++class256.field3272;
                  var2 = false;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field4741[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class331(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field4737;
         super.field7632 = arg0;
         int var3 = -5 % ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4741[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class331(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2630(byte arg0) {
      try {
         if (arg0 != -30) {
            method2630((byte)9);
         }

         field4738 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4741[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2631(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2632(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
