import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class425 {
   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5955 = new String[]{method3204(method3203("o\u0004X-m")), method3204(method3203("~OXA8")), method3204(method3203("z_\u001ao")), method3204(method3203("4\u0007H")), method3204(method3203("(I\u0019o-$\u001a\u0010evr\u0014")), method3204(method3203("4\u0007H#,wE\u001a> $L\u0010ev*")), method3204(method3203("(I\u0019o-rLO3$$\u0014")), method3204(method3203("~OXB8")), method3204(method3203("4\u0007H#,wE\u001a>vr\u0013F7 *"))};
   @OriginalMember(
      owner = "client!je",
      name = "b",
      descriptor = "I"
   )
   public static int field5953;
   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "I"
   )
   public static int field5954;

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method3201(int arg0, class65 arg1) {
      try {
         label23: {
            if (!class336.field4817) {
               class134.method1127(arg1, (byte)121);
               if (!client.field4273) {
                  break label23;
               }
            }

            class391.method2972(true, arg1);
         }

         ++field5953;
         int var2 = -81 % ((arg0 - 61) / 37);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5955[1] + arg0 + ',' + (arg1 != null ? field5955[0] : field5955[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(IIBLha;)V"
   )
   public static final void method3202(int arg0, int arg1, byte arg2, class65 arg3) {
      boolean var4 = client.field4273;

      try {
         ++field5954;
         if (arg0 >= 0 && arg1 >= 0 && ~class338.field4837 != -1 && class663.field9446 != 0) {
            if (arg2 < 25) {
               method3201(-81, (class65)null);
            }

            int var5;
            int var6;
            int var7;
            int var8;
            class17 var9;
            int var10;
            int var11;
            label703: {
               if (!class775.field11283) {
                  arg3.method526(class691.field10099, class278.field3711, class338.field4837, class663.field9446);
                  var5 = class338.field4837;
                  var6 = class663.field9446;
                  var7 = class691.field10099;
                  var8 = class278.field3711;
                  arg3.method577(class623.field8694, class174.field2174, class338.field4837, class663.field9446);
                  var9 = arg3.method603();
                  var9.method149(class12.field143, class345.field4942, class497.field6825, class252.field3195, class228.field2853, class215.field2669);
                  var10 = arg0;
                  arg3.method581(var9);
                  var11 = arg1;
                  if (!var4) {
                     break label703;
                  }
               }

               class196.method1475((byte)-69, false);
               var9 = arg3.method507();
               int[] var12 = arg3.method599();
               var5 = var12[2];
               var7 = var12[0];
               var6 = var12[3];
               var8 = var12[1];
               var10 = arg0 + class242.method1810(0, false);
               var11 = arg1 - -class378.method2916(false, -78);
            }

            if (var6 == 0) {
               var6 = 1;
            }

            if (~var5 == -1) {
               var5 = 1;
            }

            class78.method757(true, 56);
            if (class144.field1906 != null && (!class221.field2764 || (class32.field377 & 64) != 0)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label689: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg3.method567();
                  var16 = arg3.method578();
                  if (class33.field392) {
                     var18 = var17 = (-var7 + var10) * class334.field4784 / var5;
                     var20 = var19 = (var11 - var8) * class334.field4784 / var6;
                     if (!var4) {
                        break label689;
                     }
                  }

                  var17 = (var10 - var7) * var16 / var5;
                  var20 = (-var8 + var11) * var15 / var6;
                  var18 = (-var7 + var10) * var15 / var5;
                  var19 = (-var8 + var11) * var16 / var6;
               }

               int[] var21 = new int[]{var18, var20, var15};
               int[] var22 = new int[]{var17, var19, var16};
               var9.method153(var21);
               var9.method153(var22);
               float var23 = class355.method2791((float)var21[1], (float)var22[1], (byte)-114, (float)var22[2], (float)var22[0], (float)var21[2], (float)var21[0], 4);
               if (var23 > 0.0F) {
                  int var24 = var22[0] - var21[0];
                  int var25 = var22[2] + -var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = (-1 + class278.field3709.method3060((byte)38) << 8) + var26 >> 9;
                  var14 = (class278.field3709.method3060((byte)38) + -1 << 8) + var27 >> 9;
                  byte var28 = class278.field3709.field1001;
                  if (var28 < 3 && (2 & class100.field1295[1][var26 >> 9][var27 >> 9]) != 0) {
                     int var90 = var28 + 1;
                  }
               }

               if (~var13 != 0 && var14 != -1) {
                  label715: {
                     if (class221.field2764 && (class32.field377 & 64) != 0) {
                        class657 var29 = class728.method5295(class593.field8208, class226.field2837, -1);
                        if (var29 == null) {
                           class239.method1790(22);
                           if (!var4) {
                              break label715;
                           }
                        }

                        class324.method2441(0L, false, 121, (long)(var13 << 0 | var14), field5955[3], var13, class460.field6309, -1, var14, true, 21, true, class740.field10780);
                        if (!var4) {
                           break label715;
                        }
                     }

                     if (class774.field11242) {
                        class324.method2441(0L, false, 123, (long)(var13 << 0 | var14), "", var13, class551.field7548.method3980(class494.field6787, true), -1, var14, true, 23, true, -1);
                     }

                     ++class276.field3673;
                     class324.method2441(0L, false, 125, (long)(var14 | var13 << 0), "", var13, class696.field10171, -1, var14, true, 10, true, class350.field5016);
                  }
               }
            }

            if (class775.field11283) {
               class584.method4194(5122);
            }

            int var30 = 0;
            int var10000;
            if (!var4) {
               if (!class775.field11283) {
                  var10000 = 1;
                  if (!var4) {
                     var10000 = ~1;
                  }
               } else {
                  var10000 = ~2;
               }

               if (var10000 >= ~var30) {
                  class78.method757(false, 53);
                  return;
               }
            }

            do {
               boolean var31 = var30 == 0;
               class32 var32 = var31 ? class46.field528 : class526.field7199;
               int var33 = arg0;
               int var34 = arg1;
               if (class775.field11283) {
                  class196.method1475((byte)-69, var31);
                  var33 = arg0 + class242.method1810(0, var31);
                  var34 = arg1 + class378.method2916(var31, 93);
               }

               boolean var91;
               label669: {
                  class411 var35 = var32.field381;
                  class794 var36 = (class794)var35.method3110(-107);
                  if (var4) {
                     var91 = class201.field2473;
                  } else if (var36 == null) {
                     var91 = class775.field11283;
                     if (!var4) {
                        break label669;
                     }
                  } else {
                     var91 = class201.field2473;
                  }

                  while(true) {
                     if ((var91 || ~class278.field3709.field1001 == ~var36.field11600.field1001) && var36.method5719(var34, var33, arg3, (byte)72)) {
                        label740: {
                           boolean var37 = false;
                           boolean var38 = false;
                           int var39;
                           int var40;
                           if (var36.field11600 instanceof class47) {
                              var39 = ((class47)var36.field11600).field547;
                              var40 = ((class47)var36.field11600).field540;
                              if (var4) {
                                 var40 = var36.field11600.field1003 >> 9;
                                 var39 = var36.field11600.field999 >> 9;
                              }
                           } else {
                              var40 = var36.field11600.field1003 >> 9;
                              var39 = var36.field11600.field999 >> 9;
                           }

                           if (var36.field11600 instanceof class404) {
                              class404 var41 = (class404)var36.field11600;
                              int var42 = var41.method3060((byte)38);
                              if ((1 & var42) == 0 && (var41.field999 & 511) == 0 && ~(511 & var41.field1003) == -1 || (var42 & 1) == 1 && ~(var41.field999 & 511) == -257 && ~(var41.field1003 & 511) == -257) {
                                 int var43 = var41.field999 + -(var41.method3060((byte)38) + -1 << 8);
                                 int var44 = var41.field1003 + -(var41.method3060((byte)38) - 1 << 8);
                                 int var45 = 0;
                                 if (var4 || class741.field10800 > var45) {
                                    do {
                                       class243 var46 = (class243)class335.field4808.method1839(-115, (long)class285.field3785[var45]);
                                       if (var46 != null) {
                                          class680 var47 = var46.field3043;
                                          if (~class369.field5205 != ~var47.field7754) {
                                             if (!var47.field7821 && !var4) {
                                                ++var45;
                                             } else {
                                                int var48 = -(var47.field9989.field5538 + -1 << 8) + var47.field999;
                                                int var49 = var47.field1003 - (var47.field9989.field5538 - 1 << 8);
                                                if (var43 <= var48 && var47.field9989.field5538 <= -(var48 - var43 >> 9) + var41.method3060((byte)38) && var44 <= var49 && var47.field9989.field5538 <= var41.method3060((byte)38) + -(-var44 + var49 >> 9)) {
                                                   class563.method4046(var47, (byte)-127, class278.field3709.field1001 != var36.field11600.field1001);
                                                   var47.field7754 = class369.field5205;
                                                }

                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } else {
                                          ++var45;
                                       }
                                    } while(class741.field10800 > var45);
                                 }

                                 int var50 = class261.field3357;
                                 int[] var51 = class294.field3862;
                                 int var52 = 0;
                                 if (var4 || ~var52 > ~var50) {
                                    do {
                                       class404 var53 = class136.field1773[var51[var52]];
                                       if (var53 != null) {
                                          if (class369.field5205 != var53.field7754) {
                                             if (var41 != var53) {
                                                if (!var53.field7821 && !var4) {
                                                   ++var52;
                                                } else {
                                                   int var54 = var53.field999 - (-1 + var53.method3060((byte)38) << 8);
                                                   int var55 = var53.field1003 - (-1 + var53.method3060((byte)38) << 8);
                                                   if (~var43 >= ~var54 && ~var53.method3060((byte)38) >= ~(-(-var43 + var54 >> 9) + var41.method3060((byte)38)) && ~var55 <= ~var44 && var53.method3060((byte)38) <= var41.method3060((byte)38) - (-var44 + var55 >> 9)) {
                                                      class325.method2451(126, class278.field3709.field1001 != var36.field11600.field1001, var53);
                                                      var53.field7754 = class369.field5205;
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

                              if (class369.field5205 == var41.field7754) {
                                 break label740;
                              }

                              class325.method2451(117, class278.field3709.field1001 != var36.field11600.field1001, var41);
                              var41.field7754 = class369.field5205;
                           }

                           if (var36.field11600 instanceof class680) {
                              class680 var56 = (class680)var36.field11600;
                              if (var56.field9989 != null) {
                                 if ((var56.field9989.field5538 & 1) == 0 && ~(var56.field999 & 511) == -1 && ~(var56.field1003 & 511) == -1 || ~(1 & var56.field9989.field5538) == -2 && ~(511 & var56.field999) == -257 && (var56.field1003 & 511) == 256) {
                                    int var57 = -(var56.field9989.field5538 + -1 << 8) + var56.field999;
                                    int var58 = -(var56.field9989.field5538 + -1 << 8) + var56.field1003;
                                    int var59 = 0;
                                    if (var4 || ~class741.field10800 < ~var59) {
                                       do {
                                          class243 var60 = (class243)class335.field4808.method1839(-111, (long)class285.field3785[var59]);
                                          if (var60 != null) {
                                             class680 var61 = var60.field3043;
                                             if (~class369.field5205 != ~var61.field7754) {
                                                if (var56 != var61) {
                                                   if (!var61.field7821 && !var4) {
                                                      ++var59;
                                                   } else {
                                                      int var62 = var61.field999 - (var61.field9989.field5538 + -1 << 8);
                                                      int var63 = -(var61.field9989.field5538 + -1 << 8) + var61.field1003;
                                                      if (var62 >= var57 && ~var61.field9989.field5538 >= ~(-(-var57 + var62 >> 9) + var56.field9989.field5538) && ~var58 >= ~var63 && ~var61.field9989.field5538 >= ~(-(-var58 + var63 >> 9) + var56.field9989.field5538)) {
                                                         class563.method4046(var61, (byte)45, ~class278.field3709.field1001 != ~var36.field11600.field1001);
                                                         var61.field7754 = class369.field5205;
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
                                       } while(~class741.field10800 < ~var59);
                                    }

                                    int var64 = class261.field3357;
                                    int[] var65 = class294.field3862;
                                    int var66 = 0;
                                    if (var4 || var66 < var64) {
                                       do {
                                          class404 var67 = class136.field1773[var65[var66]];
                                          if (var67 != null) {
                                             if (~class369.field5205 != ~var67.field7754) {
                                                if (!var67.field7821 && !var4) {
                                                   ++var66;
                                                } else {
                                                   int var68 = var67.field999 + -(-1 + var67.method3060((byte)38) << 8);
                                                   int var69 = var67.field1003 + -(-1 + var67.method3060((byte)38) << 8);
                                                   if (~var57 >= ~var68 && ~var67.method3060((byte)38) >= ~(-(-var57 + var68 >> 9) + var56.field9989.field5538) && var69 >= var58 && ~var67.method3060((byte)38) >= ~(-(-var58 + var69 >> 9) + var56.field9989.field5538)) {
                                                      class325.method2451(-56, ~class278.field3709.field1001 != ~var36.field11600.field1001, var67);
                                                      var67.field7754 = class369.field5205;
                                                   }

                                                   ++var66;
                                                }
                                             } else {
                                                ++var66;
                                             }
                                          } else {
                                             ++var66;
                                          }
                                       } while(var66 < var64);
                                    }
                                 }

                                 if (class369.field5205 == var56.field7754) {
                                    break label740;
                                 }

                                 class563.method4046(var56, (byte)-99, ~class278.field3709.field1001 != ~var36.field11600.field1001);
                                 var56.field7754 = class369.field5205;
                              }
                           }

                           if (var36.field11600 instanceof class219) {
                              int var70 = class752.field10921 + var39;
                              int var71 = var40 - -class17.field237;
                              class480 var72 = (class480)class2.field7.method1839(13, (long)(var71 << 14 | var36.field11600.field1001 << 28 | var70));
                              if (var72 != null) {
                                 int var73 = 0;
                                 class666 var74 = (class666)var72.field6636.method3863((byte)82);
                                 if (var4 || var74 != null) {
                                    do {
                                       class261 var75 = class645.field9054.method485(0, var74.field9471);
                                       if (class221.field2764 && class278.field3709.field1001 == var36.field11600.field1001) {
                                          class786 var76 = ~class111.field1407 != 0 ? class717.field10511.method5460(class111.field1407, 11) : null;
                                          if ((1 & class32.field377) != 0 && (var76 == null || var75.method1995(-1, var76.field11479, class111.field1407) != var76.field11479)) {
                                             class324.method2441((long)var74.field9471, false, 121, (long)var73, class88.field1123 + field5955[8] + var75.field3371, var39, class460.field6309, -1, var40, true, 47, false, class740.field10780);
                                             ++class771.field11097;
                                          }
                                       }

                                       if (~class278.field3709.field1001 == ~var36.field11600.field1001) {
                                          String[] var77 = var75.field3366;
                                          int var78 = 4;
                                          if (var4 || ~var78 <= -1) {
                                             do {
                                                if (var77 != null && var77[var78] != null) {
                                                   byte var79 = 0;
                                                   int var80 = class478.field6607;
                                                   if (~var78 == -1) {
                                                      var79 = 48;
                                                   }

                                                   if (~var78 == -2) {
                                                      var79 = 58;
                                                   }

                                                   if (~var78 == -3) {
                                                      var79 = 18;
                                                   }

                                                   if (var78 == 3) {
                                                      var79 = 57;
                                                   }

                                                   if (var78 == 4) {
                                                      var79 = 44;
                                                   }

                                                   if (~var75.field3378 == ~var78) {
                                                      var80 = var75.field3334;
                                                   }

                                                   if (~var75.field3362 == ~var78) {
                                                      var80 = var75.field3355;
                                                   }

                                                   class324.method2441((long)var74.field9471, false, 124, (long)var73, field5955[6] + var75.field3371, var39, var77[var78], -1, var40, true, var79, false, var80);
                                                   ++class231.field2874;
                                                }

                                                --var78;
                                             } while(~var78 <= -1);
                                          }
                                       }

                                       class324.method2441((long)var74.field9471, class278.field3709.field1001 != var36.field11600.field1001, 124, (long)var73, field5955[6] + var75.field3371, var39, class551.field7543.method3980(class494.field6787, true), -1, var40, true, 1006, false, class347.field4990);
                                       ++class254.field3227;
                                       var74 = (class666)var72.field6636.method3865((byte)127);
                                       ++var73;
                                    } while(var74 != null);
                                 }
                              }
                           }

                           if (var36.field11600 instanceof class712) {
                              class712 var81 = (class712)var36.field11600;
                              class774 var82 = class472.field6533.method3586(64, var81.method2281((byte)-128));
                              if (var82.field11186 != null) {
                                 var82 = var82.method5539(class259.field3320, 111);
                              }

                              if (var82 != null) {
                                 if (class221.field2764 && ~class278.field3709.field1001 == ~var36.field11600.field1001) {
                                    class786 var83 = class111.field1407 == -1 ? null : class717.field10511.method5460(class111.field1407, 11);
                                    if ((4 & class32.field377) != 0 && (var83 == null || ~var82.method5551(71, class111.field1407, var83.field11479) != ~var83.field11479)) {
                                       class324.method2441(class707.method5145((byte)-104, var81, var40, var39), false, 123, (long)var81.hashCode(), class88.field1123 + field5955[5] + var82.field11214, var39, class460.field6309, -1, var40, true, 20, false, class740.field10780);
                                       ++class183.field2260;
                                    }
                                 }

                                 if (~class278.field3709.field1001 == ~var36.field11600.field1001) {
                                    String[] var84 = var82.field11233;
                                    if (var84 != null) {
                                       int var85 = 4;
                                       if (var4 || ~var85 <= -1) {
                                          do {
                                             if (var84[var85] != null) {
                                                short var86 = 0;
                                                int var87 = class478.field6607;
                                                if (var85 == 0) {
                                                   var86 = 12;
                                                }

                                                if (~var85 == -2) {
                                                   var86 = 52;
                                                }

                                                if (var85 == 2) {
                                                   var86 = 17;
                                                }

                                                if (var85 == 3) {
                                                   var86 = 15;
                                                }

                                                if (var82.field11237 == var85) {
                                                   var87 = var82.field11221;
                                                }

                                                if (var85 == 4) {
                                                   var86 = 1008;
                                                }

                                                if (var82.field11226 == var85) {
                                                   var87 = var82.field11176;
                                                }

                                                class324.method2441(class707.method5145((byte)-104, var81, var40, var39), false, 122, (long)var81.hashCode(), field5955[4] + var82.field11214, var39, var84[var85], -1, var40, true, var86, false, var87);
                                                ++class63.field695;
                                             }

                                             --var85;
                                          } while(~var85 <= -1);
                                       }
                                    }

                                    class324.method2441((long)var82.field11210, ~class278.field3709.field1001 != ~var36.field11600.field1001, 123, (long)var81.hashCode(), field5955[4] + var82.field11214, var39, class551.field7543.method3980(class494.field6787, true), -1, var40, true, 1007, false, class347.field4990);
                                    ++class210.field2614;
                                 }
                              }
                           }
                        }
                     }

                     var36 = (class794)var35.method3114(2);
                     if (var36 == null) {
                        var91 = class775.field11283;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var91 = class201.field2473;
                     }
                  }
               }

               if (var91) {
                  class584.method4194(5122);
               }

               ++var30;
               if (!class775.field11283) {
                  var10000 = 1;
                  if (!var4) {
                     var10000 = ~1;
                  }
               } else {
                  var10000 = ~2;
               }
            } while(var10000 < ~var30);

            class78.method757(false, 53);
         }
      } catch (RuntimeException var89) {
         throw class534.method3846(var89, field5955[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5955[0] : field5955[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3203(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3204(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
