import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class208 {
   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2647 = new String[]{method1719(method1718("oB\u0014Y\u007f")), method1719(method1718("-\n\u0004;knHV&1k\u001e\n/g3")), method1719(method1718("-\n\u0004;knHV&g=A\\}13")), method1719(method1718("cRVw")), method1719(method1718("oB\u0014X\u007f")), method1719(method1718("1DUwj=\u0017\\}1k\u0019")), method1719(method1718("v\t\u00145*")), method1719(method1718("-\n\u0004")), method1719(method1718("1DUwjkA\u0003+c=\u0019")), method1719(method1718("oB\u0014Z\u007f")), method1719(method1718("oB\u0014_\u007f"))};
   @OriginalMember(
      owner = "client!be",
      name = "c",
      descriptor = "Lfea;"
   )
   public static class681 field2643 = new class681(9, 0, 4, 1);
   @OriginalMember(
      owner = "client!be",
      name = "b",
      descriptor = "I"
   )
   public static int field2642;
   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "I"
   )
   public static int field2644;
   @OriginalMember(
      owner = "client!be",
      name = "e",
      descriptor = "I"
   )
   public static int field2645;
   @OriginalMember(
      owner = "client!be",
      name = "d",
      descriptor = "I"
   )
   public static int field2646;

   @OriginalMember(
      owner = "client!be",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1714(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1715(byte arg0) {
      try {
         field2643 = null;
         if (arg0 > -68) {
            method1716((byte)-48, -120, 54);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2647[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method1716(byte arg0, int arg1, int arg2) {
      try {
         ++field2642;
         if (arg0 != -91) {
            method1715((byte)-11);
         }

         return ~(arg1 & 16) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2647[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(ILha;BI)V"
   )
   public static final void method1717(int arg0, class479 arg1, byte arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field2645;
         if (arg3 >= 0 && ~arg0 <= -1 && class749.field10935 != 0 && ~class304.field4253 != -1) {
            class93 var5;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            label697: {
               if (class28.field416) {
                  class301.method2420(false, 19934);
                  var5 = arg1.method484();
                  int[] var6 = arg1.method419();
                  var7 = var6[0];
                  var8 = var6[1];
                  var9 = var6[2];
                  var10 = var6[3];
                  var11 = arg3 + class511.method3857((byte)-9, false);
                  var12 = class616.method4541(false, (byte)102) + arg0;
                  if (!var4) {
                     break label697;
                  }
               }

               arg1.method504(class318.field4383, class356.field4967, class749.field10935, class304.field4253);
               var9 = class749.field10935;
               var8 = class356.field4967;
               var7 = class318.field4383;
               var10 = class304.field4253;
               arg1.method460(class58.field760, class348.field4773, class749.field10935, class304.field4253);
               var5 = arg1.method480();
               var5.method869(class430.field5845, class136.field1729, class86.field1186, class650.field9713, class146.field1830, class134.field1689);
               var11 = arg3;
               var12 = arg0;
               arg1.method397(var5);
            }

            class442.method3404(true, 4096);
            if (~var9 == -1) {
               var9 = 1;
            }

            if (var10 == 0) {
               var10 = 1;
            }

            if (class373.field5223 != null && (!class597.field8823 || (64 & class112.field1500) != 0)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label683: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg1.method519();
                  var16 = arg1.method499();
                  if (!class400.field5500) {
                     var17 = (var12 - var8) * var16 / var10;
                     var18 = (-var7 + var11) * var15 / var9;
                     var19 = (var12 - var8) * var15 / var10;
                     var20 = (var11 - var7) * var16 / var9;
                     if (!var4) {
                        break label683;
                     }
                  }

                  var18 = var20 = (-var7 + var11) * class629.field9293 / var9;
                  var19 = var17 = (-var8 + var12) * class629.field9293 / var10;
               }

               int[] var21 = new int[]{var18, var19, var15};
               var5.method870(var21);
               int[] var22 = new int[]{var20, var17, var16};
               var5.method870(var22);
               float var23 = class411.method3226((float)var21[2], (float)var22[2], 4, (float)var21[1], (float)var22[1], (float)var22[0], true, (float)var21[0]);
               if (var23 > 0.0F) {
                  int var24 = var22[0] + -var21[0];
                  int var25 = var22[2] - var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = var26 - -(class204.field2593.method78(0) + -1 << 8) >> 9;
                  var14 = var27 - -(-1 + class204.field2593.method78(0) << 8) >> 9;
                  byte var28 = class204.field2593.field10457;
                  if (var28 < 3 && (class245.field3092[1][var26 >> 9][var27 >> 9] & 2) != 0) {
                     int var90 = var28 + 1;
                  }
               }

               if (var13 != -1 && var14 != -1) {
                  label776: {
                     if (!class597.field8823 || (64 & class112.field1500) == 0) {
                        if (class459.field6312) {
                           class254.method2040(60, true, 0L, "", var14, false, true, (byte)-117, -1, -1, class606.field8930.method4490(class782.field11389, -16777216), var13, (long)(var14 | var13 << 0));
                        }

                        ++class19.field308;
                        class254.method2040(48, true, 0L, "", var14, false, true, (byte)-73, -1, class331.field4568, class327.field4531, var13, (long)(var14 | var13 << 0));
                        if (!var4) {
                           break label776;
                        }
                     }

                     class642 var29 = class77.method737(-16985, class26.field392, class371.field5188);
                     if (var29 == null) {
                        class321.method2526(27352);
                        if (!var4) {
                           break label776;
                        }
                     }

                     class254.method2040(58, true, 0L, field2647[7], var14, false, true, (byte)-123, -1, class741.field10841, class649.field9694, var13, (long)(var13 << 0 | var14));
                  }
               }
            }

            if (class28.field416) {
               class684.method4980(0);
            }

            if (arg2 >= -11) {
               field2643 = null;
            }

            int var30 = 0;
            byte var10000;
            if (!var4) {
               if (class28.field416) {
                  var10000 = 2;
                  if (!var4) {
                  }
               } else {
                  var10000 = 1;
               }

               if (var10000 <= var30) {
                  class442.method3404(false, 4096);
                  return;
               }
            }

            do {
               boolean var31 = var30 == 0;
               class39 var32 = !var31 ? class194.field2462 : class422.field5749;
               int var33 = arg3;
               int var34 = arg0;
               if (class28.field416) {
                  class301.method2420(var31, 19934);
                  var33 = arg3 + class511.method3857((byte)-106, var31);
                  var34 = arg0 + class616.method4541(var31, (byte)-105);
               }

               boolean var91;
               label657: {
                  class627 var35 = var32.field543;
                  class328 var36 = (class328)var35.method4639(-122);
                  if (var4) {
                     var91 = class444.field6020;
                  } else if (var36 == null) {
                     var91 = class28.field416;
                     if (!var4) {
                        break label657;
                     }
                  } else {
                     var91 = class444.field6020;
                  }

                  while(true) {
                     if ((var91 || ~class204.field2593.field10457 == ~var36.field4540.field10457) && var36.method2603(var34, arg1, -115, var33)) {
                        label734: {
                           boolean var37 = false;
                           boolean var38 = false;
                           int var39;
                           int var40;
                           if (var36.field4540 instanceof class680) {
                              var39 = ((class680)var36.field4540).field10010;
                              var40 = ((class680)var36.field4540).field10011;
                              if (var4) {
                                 var40 = var36.field4540.field10468 >> 9;
                                 var39 = var36.field4540.field10467 >> 9;
                              }
                           } else {
                              var40 = var36.field4540.field10468 >> 9;
                              var39 = var36.field4540.field10467 >> 9;
                           }

                           if (var36.field4540 instanceof class783) {
                              class783 var41 = (class783)var36.field4540;
                              int var42 = var41.method78(0);
                              if ((1 & var42) == 0 && ~(var41.field10467 & 511) == -1 && (var41.field10468 & 511) == 0 || ~(var42 & 1) == -2 && ~(511 & var41.field10467) == -257 && (511 & var41.field10468) == 256) {
                                 int var43 = var41.field10467 + -(var41.method78(0) + -1 << 8);
                                 int var44 = var41.field10468 + -(var41.method78(0) - 1 << 8);
                                 int var45 = 0;
                                 if (var4 || ~var45 > ~class737.field10798) {
                                    do {
                                       class411 var46 = (class411)class35.field493.method1818(-1, (long)class277.field3534[var45]);
                                       if (var46 != null) {
                                          class81 var47 = var46.field5654;
                                          if (~class413.field5678 != ~var47.field135) {
                                             if (!var47.field148 && !var4) {
                                                ++var45;
                                             } else {
                                                int var48 = -(var47.field1135.field6546 - 1 << 8) + var47.field10467;
                                                int var49 = -(var47.field1135.field6546 - 1 << 8) + var47.field10468;
                                                if (~var48 <= ~var43 && ~var47.field1135.field6546 >= ~(-(-var43 + var48 >> 9) + var41.method78(0)) && var49 >= var44 && var47.field1135.field6546 <= var41.method78(0) + -(-var44 + var49 >> 9)) {
                                                   class595.method4436(var47, -1, class204.field2593.field10457 != var36.field4540.field10457);
                                                   var47.field135 = class413.field5678;
                                                }

                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } else {
                                          ++var45;
                                       }
                                    } while(~var45 > ~class737.field10798);
                                 }

                                 int var50 = class304.field4255;
                                 int[] var51 = class710.field10421;
                                 int var52 = 0;
                                 if (var4 || ~var52 > ~var50) {
                                    do {
                                       class783 var53 = class59.field771[var51[var52]];
                                       if (var53 != null) {
                                          if (class413.field5678 != var53.field135) {
                                             if (var41 != var53) {
                                                if (!var53.field148 && !var4) {
                                                   ++var52;
                                                } else {
                                                   int var54 = var53.field10467 + -(-1 + var53.method78(0) << 8);
                                                   int var55 = var53.field10468 - (var53.method78(0) - 1 << 8);
                                                   if (~var54 <= ~var43 && var53.method78(0) <= var41.method78(0) + -(-var43 + var54 >> 9) && var55 >= var44 && ~var53.method78(0) >= ~(-(-var44 + var55 >> 9) + var41.method78(0))) {
                                                      class684.method4978(~class204.field2593.field10457 != ~var36.field4540.field10457, false, var53);
                                                      var53.field135 = class413.field5678;
                                                   }

                                                   ++var52;
                                                }
                                             } else {
                                                ++var52;
                                             }
                                          } else {
                                             ++var52;
                                          }
                                       } else {
                                          ++var52;
                                       }
                                    } while(~var52 > ~var50);
                                 }
                              }

                              if (~class413.field5678 == ~var41.field135) {
                                 break label734;
                              }

                              class684.method4978(class204.field2593.field10457 != var36.field4540.field10457, false, var41);
                              var41.field135 = class413.field5678;
                           }

                           if (var36.field4540 instanceof class81) {
                              class81 var56 = (class81)var36.field4540;
                              if (var56.field1135 != null) {
                                 if (~(1 & var56.field1135.field6546) == -1 && ~(511 & var56.field10467) == -1 && ~(511 & var56.field10468) == -1 || ~(var56.field1135.field6546 & 1) == -2 && ~(511 & var56.field10467) == -257 && (var56.field10468 & 511) == 256) {
                                    int var57 = -(var56.field1135.field6546 + -1 << 8) + var56.field10467;
                                    int var58 = -(var56.field1135.field6546 + -1 << 8) + var56.field10468;
                                    int var59 = 0;
                                    if (var4 || ~class737.field10798 < ~var59) {
                                       do {
                                          class411 var60 = (class411)class35.field493.method1818(-1, (long)class277.field3534[var59]);
                                          if (var60 != null) {
                                             class81 var61 = var60.field5654;
                                             if (~class413.field5678 != ~var61.field135) {
                                                if (var56 != var61) {
                                                   if (!var61.field148 && !var4) {
                                                      ++var59;
                                                   } else {
                                                      int var62 = -(var61.field1135.field6546 - 1 << 8) + var61.field10467;
                                                      int var63 = -(var61.field1135.field6546 - 1 << 8) + var61.field10468;
                                                      if (~var57 >= ~var62 && ~(-(-var57 + var62 >> 9) + var56.field1135.field6546) <= ~var61.field1135.field6546 && ~var58 >= ~var63 && ~(-(-var58 + var63 >> 9) + var56.field1135.field6546) <= ~var61.field1135.field6546) {
                                                         class595.method4436(var61, -1, class204.field2593.field10457 != var36.field4540.field10457);
                                                         var61.field135 = class413.field5678;
                                                      }

                                                      ++var59;
                                                   }
                                                } else {
                                                   ++var59;
                                                }
                                             } else {
                                                ++var59;
                                             }
                                          } else {
                                             ++var59;
                                          }
                                       } while(~class737.field10798 < ~var59);
                                    }

                                    int var64 = class304.field4255;
                                    int[] var65 = class710.field10421;
                                    int var66 = 0;
                                    if (var4 || var64 > var66) {
                                       do {
                                          class783 var67 = class59.field771[var65[var66]];
                                          if (var67 != null) {
                                             if (~class413.field5678 != ~var67.field135) {
                                                if (!var67.field148 && !var4) {
                                                   ++var66;
                                                } else {
                                                   int var68 = var67.field10467 - (var67.method78(0) + -1 << 8);
                                                   int var69 = var67.field10468 - (var67.method78(0) - 1 << 8);
                                                   if (~var68 <= ~var57 && ~var67.method78(0) >= ~(-(var68 - var57 >> 9) + var56.field1135.field6546) && ~var58 >= ~var69 && ~var67.method78(0) >= ~(var56.field1135.field6546 - (var69 - var58 >> 9))) {
                                                      class684.method4978(~class204.field2593.field10457 != ~var36.field4540.field10457, false, var67);
                                                      var67.field135 = class413.field5678;
                                                   }

                                                   ++var66;
                                                }
                                             } else {
                                                ++var66;
                                             }
                                          } else {
                                             ++var66;
                                          }
                                       } while(var64 > var66);
                                    }
                                 }

                                 if (~class413.field5678 == ~var56.field135) {
                                    break label734;
                                 }

                                 class595.method4436(var56, -1, ~class204.field2593.field10457 != ~var36.field4540.field10457);
                                 var56.field135 = class413.field5678;
                              }
                           }

                           if (var36.field4540 instanceof class341) {
                              int var70 = class539.field7889 + var39;
                              int var71 = var40 - -class353.field4940;
                              class206 var72 = (class206)class207.field2635.method1818(-1, (long)(var71 << 14 | var36.field4540.field10457 << 28 | var70));
                              if (var72 != null) {
                                 int var73 = 0;
                                 class486 var74 = (class486)var72.field2626.method284((byte)45);
                                 if (var4 || var74 != null) {
                                    do {
                                       class546 var75 = class166.field2126.method5576(var74.field6782, (byte)-63);
                                       if (class597.field8823 && class204.field2593.field10457 == var36.field4540.field10457) {
                                          class32 var76 = ~class268.field3427 == 0 ? null : class566.field8336.method1210(class268.field3427, true);
                                          if (~(class112.field1500 & 1) != -1 && (var76 == null || var75.method4141(12186, class268.field3427, var76.field466) != var76.field466)) {
                                             ++class8.field102;
                                             class254.method2040(10, true, (long)var74.field6782, class207.field2632 + field2647[1] + var75.field8056, var40, false, false, (byte)-92, -1, class741.field10841, class649.field9694, var39, (long)var73);
                                          }
                                       }

                                       if (class204.field2593.field10457 == var36.field4540.field10457) {
                                          String[] var77 = var75.field8049;
                                          int var78 = 4;
                                          if (var4 || ~var78 <= -1) {
                                             do {
                                                if (var77 != null && var77[var78] != null) {
                                                   byte var79 = 0;
                                                   if (~var78 == -1) {
                                                      var79 = 53;
                                                   }

                                                   int var80 = class286.field3953;
                                                   if (var78 == 1) {
                                                      var79 = 23;
                                                   }

                                                   if (var78 == 2) {
                                                      var79 = 8;
                                                   }

                                                   if (var78 == 3) {
                                                      var79 = 51;
                                                   }

                                                   if (~var75.field8017 == ~var78) {
                                                      var80 = var75.field7980;
                                                   }

                                                   if (~var78 == -5) {
                                                      var79 = 47;
                                                   }

                                                   if (~var75.field8047 == ~var78) {
                                                      var80 = var75.field8002;
                                                   }

                                                   class254.method2040(var79, true, (long)var74.field6782, field2647[8] + var75.field8056, var40, false, false, (byte)-38, -1, var80, var77[var78], var39, (long)var73);
                                                   ++class3.field32;
                                                }

                                                --var78;
                                             } while(~var78 <= -1);
                                          }
                                       }

                                       class254.method2040(1011, true, (long)var74.field6782, field2647[8] + var75.field8056, var40, ~class204.field2593.field10457 != ~var36.field4540.field10457, false, (byte)-101, -1, class250.field3157, class606.field8925.method4490(class782.field11389, -16777216), var39, (long)var73);
                                       ++class571.field8395;
                                       ++var73;
                                       var74 = (class486)var72.field2626.method280(0);
                                    } while(var74 != null);
                                 }
                              }
                           }

                           if (var36.field4540 instanceof class660) {
                              class660 var81 = (class660)var36.field4540;
                              class294 var82 = class438.field5967.method929((byte)-89, var81.method175((byte)9));
                              if (var82.field4036 != null) {
                                 var82 = var82.method2362(class175.field2266, true);
                              }

                              if (var82 != null) {
                                 if (class597.field8823 && class204.field2593.field10457 == var36.field4540.field10457) {
                                    class32 var83 = class268.field3427 != -1 ? class566.field8336.method1210(class268.field3427, true) : null;
                                    if (~(class112.field1500 & 4) != -1 && (var83 == null || ~var82.method2377(-108, var83.field466, class268.field3427) != ~var83.field466)) {
                                       ++class128.field1639;
                                       class254.method2040(21, true, class59.method540(37, var81, var40, var39), class207.field2632 + field2647[2] + var82.field4097, var40, false, false, (byte)-119, -1, class741.field10841, class649.field9694, var39, (long)var81.hashCode());
                                    }
                                 }

                                 if (~class204.field2593.field10457 == ~var36.field4540.field10457) {
                                    String[] var84 = var82.field4048;
                                    if (var84 != null) {
                                       int var85 = 4;
                                       if (var4 || ~var85 <= -1) {
                                          do {
                                             if (var84[var85] != null) {
                                                short var86 = 0;
                                                if (~var85 == -1) {
                                                   var86 = 20;
                                                }

                                                int var87 = class286.field3953;
                                                if (~var85 == -2) {
                                                   var86 = 19;
                                                }

                                                if (~var85 == -3) {
                                                   var86 = 50;
                                                }

                                                if (~var85 == -4) {
                                                   var86 = 9;
                                                }

                                                if (~var82.field4124 == ~var85) {
                                                   var87 = var82.field4051;
                                                }

                                                if (var85 == 4) {
                                                   var86 = 1008;
                                                }

                                                if (~var82.field4096 == ~var85) {
                                                   var87 = var82.field4126;
                                                }

                                                ++class586.field8651;
                                                class254.method2040(var86, true, class59.method540(80, var81, var40, var39), field2647[5] + var82.field4097, var40, false, false, (byte)-86, -1, var87, var84[var85], var39, (long)var81.hashCode());
                                             }

                                             --var85;
                                          } while(~var85 <= -1);
                                       }
                                    }

                                    ++class426.field5807;
                                    class254.method2040(1010, true, (long)var82.field4110, field2647[5] + var82.field4097, var40, ~class204.field2593.field10457 != ~var36.field4540.field10457, false, (byte)-98, -1, class250.field3157, class606.field8925.method4490(class782.field11389, -16777216), var39, (long)var81.hashCode());
                                 }
                              }
                           }
                        }
                     }

                     var36 = (class328)var35.method4636((byte)52);
                     if (var36 == null) {
                        var91 = class28.field416;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var91 = class444.field6020;
                     }
                  }
               }

               if (var91) {
                  class684.method4980(0);
               }

               ++var30;
               if (class28.field416) {
                  var10000 = 2;
                  if (!var4) {
                  }
               } else {
                  var10000 = 1;
               }
            } while(var10000 > var30);

            class442.method3404(false, 4096);
         }
      } catch (RuntimeException var89) {
         throw class93.method866(var89, field2647[4] + arg0 + ',' + (arg1 != null ? field2647[6] : field2647[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1718(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1719(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
