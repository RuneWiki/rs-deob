import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class277 extends class428 {
   @OriginalMember(
      owner = "client!mda",
      name = "o",
      descriptor = "I"
   )
   public int field3781;
   @OriginalMember(
      owner = "client!mda",
      name = "p",
      descriptor = "I"
   )
   public int field3779;
   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3782 = new String[]{method2109(method2108("8,\u000bT\u0013}")), method2109(method2108("8,\u000bTl<&\u0003\u000en}")), method2109(method2108(";=\u0006\u0016")), method2109(method2108("ueTZl6'\u0006G63qZN`k")), method2109(method2108("8,\u000bT\u0011}")), method2109(method2108("ueT")), method2109(method2108("i+\u0005\u0016mex\f\u001c63v")), method2109(method2108(".fDT-")), method2109(method2108("i+\u0005\u0016m3.SJdev")), method2109(method2108("ueTZl6'\u0006G`e.\f\u001c6k")), method2109(method2108("8,\u000bT\u0012}"))};
   @OriginalMember(
      owner = "client!mda",
      name = "q",
      descriptor = "Leg;"
   )
   public static class118 field3780 = new class118(38, 8);
   @OriginalMember(
      owner = "client!mda",
      name = "n",
      descriptor = "I"
   )
   public static int field3777;
   @OriginalMember(
      owner = "client!mda",
      name = "m",
      descriptor = "I"
   )
   public static int field3778;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2105(int arg0, int arg1) {
      try {
         if (class300.field4107.field6441.method4080(114) == 0) {
            arg0 = -1;
         }

         ++field3777;
         if (~class179.field2465 != ~arg0) {
            int var2 = -28 / ((arg1 - -34) / 49);
            if (~arg0 != 0) {
               label29: {
                  class13 var3 = class247.field3409.method911(arg0, true);
                  class439 var4 = var3.method76(1);
                  if (var4 != null) {
                     class316.field4304.method4503(new Point(var3.field147, var3.field146), var4.method3244(), 65324, class557.field7990, var4.method3233(), var4.method3242());
                     class179.field2465 = arg0;
                     if (!client.field4360) {
                        break label29;
                     }
                  }

                  arg0 = -1;
               }
            }

            if (~arg0 == 0 && ~class179.field2465 != 0) {
               class316.field4304.method4503(new Point(), (int[])null, 65324, class557.field7990, -1, -1);
               class179.field2465 = -1;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3782[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(BIILha;)V"
   )
   public static final void method2106(byte arg0, int arg1, int arg2, class66 arg3) {
      boolean var4 = client.field4360;

      try {
         ++field3778;
         if (arg2 >= 0 && ~arg1 <= -1 && ~class369.field5077 != -1 && ~class761.field11251 != -1) {
            int var5;
            int var6;
            int var7;
            int var8;
            class521 var9;
            int var10;
            int var11;
            label704: {
               if (!class681.field10034) {
                  arg3.method492(class733.field10730, class17.field195, class369.field5077, class761.field11251);
                  var5 = class761.field11251;
                  var6 = class17.field195;
                  var7 = class369.field5077;
                  var8 = class733.field10730;
                  arg3.method592(class564.field8046, class284.field3939, class369.field5077, class761.field11251);
                  var9 = arg3.method596();
                  var9.method1232(class73.field906, class720.field10511, class782.field11470, class382.field5505, class9.field87, class407.field5885);
                  var10 = arg2;
                  var11 = arg1;
                  arg3.method532(var9);
                  if (!var4) {
                     break label704;
                  }
               }

               class670.method4882(false, -128);
               var9 = arg3.method600();
               int[] var12 = arg3.method558();
               var8 = var12[0];
               var7 = var12[2];
               var5 = var12[3];
               var6 = var12[1];
               var10 = arg2 - -class79.method709(false, -5201);
               var11 = arg1 - -class365.method2721(false, (byte)124);
            }

            class123.method995(-2, true);
            if (var7 == 0) {
               var7 = 1;
            }

            if (~var5 == -1) {
               var5 = 1;
            }

            if (class265.field3658 != null && (!class613.field9015 || ~(class375.field5425 & 64) != -1)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label690: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg3.method595();
                  var16 = arg3.method504();
                  if (!class183.field2581) {
                     var17 = (-var8 + var10) * var16 / var7;
                     var18 = (-var8 + var10) * var15 / var7;
                     var19 = (var11 - var6) * var16 / var5;
                     var20 = (-var6 + var11) * var15 / var5;
                     if (!var4) {
                        break label690;
                     }
                  }

                  var20 = var19 = (-var6 + var11) * class298.field4088 / var5;
                  var18 = var17 = (-var8 + var10) * class298.field4088 / var7;
               }

               int[] var21 = new int[]{var18, var20, var15};
               var9.method1225(var21);
               int[] var22 = new int[]{var17, var19, var16};
               var9.method1225(var22);
               float var23 = class176.method1420((float)var22[0], (byte)73, (float)var21[0], (float)var22[2], (float)var21[1], (float)var21[2], (float)var22[1], 4);
               if (var23 > 0.0F) {
                  int var24 = var22[0] - var21[0];
                  int var25 = var22[2] + -var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = var26 - -(class564.field8045.method972(-1) + -1 << 8) >> 9;
                  var14 = (-1 + class564.field8045.method972(-1) << 8) + var27 >> 9;
                  byte var28 = class564.field8045.field10701;
                  if (~var28 > -4 && ~(class613.field9016[1][var26 >> 9][var27 >> 9] & 2) != -1) {
                     int var90 = var28 + 1;
                  }
               }

               if (~var13 != 0 && var14 != -1) {
                  label715: {
                     if (class613.field9015 && ~(64 & class375.field5425) != -1) {
                        class678 var29 = class504.method3657(-124, class573.field8327, class535.field7636);
                        if (var29 != null) {
                           class655.method4799(class198.field2816, false, field3782[5], true, (long)(var13 << 0 | var14), var14, 52, var13, 0L, true, 49, class14.field160, -1);
                           if (!var4) {
                              break label715;
                           }
                        }

                        class763.method5535(-1);
                        if (!var4) {
                           break label715;
                        }
                     }

                     if (class545.field7814) {
                        class655.method4799(class180.field2506.method1437(class608.field8920, 50), false, "", true, (long)(var13 << 0 | var14), var14, 52, var13, 0L, true, 11, -1, -1);
                     }

                     ++class659.field9613;
                     class655.method4799(class274.field3763, false, "", true, (long)(var13 << 0 | var14), var14, 68, var13, 0L, true, 4, class403.field5827, -1);
                  }
               }
            }

            if (class681.field10034) {
               class111.method901(64);
            }

            if (arg0 > 0) {
               method2107(46);
            }

            int var30 = 0;
            int var10000;
            int var10001;
            if (!var4) {
               var10000 = ~var30;
               if (!class681.field10034) {
                  var10001 = 1;
                  if (!var4) {
                     var10001 = ~1;
                  }
               } else {
                  var10001 = ~2;
               }

               if (var10000 <= var10001) {
                  class123.method995(-2, false);
                  return;
               }
            }

            do {
               boolean var31 = ~var30 == -1;
               class263 var32 = var31 ? class146.field1851 : class790.field11583;
               int var33 = arg2;
               int var34 = arg1;
               if (class681.field10034) {
                  class670.method4882(var31, -127);
                  var33 = arg2 + class79.method709(var31, -5201);
                  var34 = arg1 + class365.method2721(var31, (byte)124);
               }

               boolean var91;
               label668: {
                  class762 var35 = var32.field3628;
                  class623 var36 = (class623)var35.method5529((byte)-42);
                  if (var4) {
                     var91 = class503.field7308;
                  } else if (var36 == null) {
                     var91 = class681.field10034;
                     if (!var4) {
                        break label668;
                     }
                  } else {
                     var91 = class503.field7308;
                  }

                  while(true) {
                     if ((var91 || ~class564.field8045.field10701 == ~var36.field9168.field10701) && var36.method4530(arg3, var34, 0, var33)) {
                        label740: {
                           boolean var37 = false;
                           boolean var38 = false;
                           int var39;
                           int var40;
                           if (!(var36.field9168 instanceof class627)) {
                              var39 = var36.field9168.field10694 >> 9;
                              var40 = var36.field9168.field10693 >> 9;
                              if (var4) {
                                 var40 = ((class627)var36.field9168).field9208;
                                 var39 = ((class627)var36.field9168).field9207;
                              }
                           } else {
                              var40 = ((class627)var36.field9168).field9208;
                              var39 = ((class627)var36.field9168).field9207;
                           }

                           if (var36.field9168 instanceof class121) {
                              class121 var41 = (class121)var36.field9168;
                              int var42 = var41.method972(-1);
                              if ((var42 & 1) == 0 && ~(511 & var41.field10694) == -1 && (511 & var41.field10693) == 0 || ~(var42 & 1) == -2 && (var41.field10694 & 511) == 256 && ~(var41.field10693 & 511) == -257) {
                                 int var43 = var41.field10694 - (var41.method972(-1) - 1 << 8);
                                 int var44 = var41.field10693 + -(var41.method972(-1) - 1 << 8);
                                 int var45 = 0;
                                 if (var4 || ~class475.field6836 < ~var45) {
                                    do {
                                       class529 var46 = (class529)class328.field4479.method329((byte)-108, (long)class352.field4728[var45]);
                                       if (var46 != null) {
                                          class506 var47 = var46.field7559;
                                          if (~class96.field1234 != ~var47.field3810) {
                                             if (!var47.field3801 && !var4) {
                                                ++var45;
                                             } else {
                                                int var48 = -(var47.field7333.field10909 + -1 << 8) + var47.field10694;
                                                int var49 = -(var47.field7333.field10909 - 1 << 8) + var47.field10693;
                                                if (var48 >= var43 && var47.field7333.field10909 <= var41.method972(-1) + -(-var43 + var48 >> 9) && ~var44 >= ~var49 && var47.field7333.field10909 <= -(var49 - var44 >> 9) + var41.method972(-1)) {
                                                   class12.method70(var47, (byte)-117, class564.field8045.field10701 != var36.field9168.field10701);
                                                   var47.field3810 = class96.field1234;
                                                }

                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } else {
                                          ++var45;
                                       }
                                    } while(~class475.field6836 < ~var45);
                                 }

                                 int var50 = class390.field5657;
                                 int[] var51 = class254.field3459;
                                 int var52 = 0;
                                 if (var4 || var50 > var52) {
                                    do {
                                       class121 var53 = class380.field5483[var51[var52]];
                                       if (var53 != null) {
                                          if (~class96.field1234 != ~var53.field3810) {
                                             if (var41 != var53) {
                                                if (!var53.field3801 && !var4) {
                                                   ++var52;
                                                } else {
                                                   int var54 = var53.field10694 - (var53.method972(-1) - 1 << 8);
                                                   int var55 = var53.field10693 + -(var53.method972(-1) + -1 << 8);
                                                   if (~var43 >= ~var54 && ~var53.method972(-1) >= ~(var41.method972(-1) - (-var43 + var54 >> 9)) && var44 <= var55 && ~var53.method972(-1) >= ~(var41.method972(-1) + -(var55 - var44 >> 9))) {
                                                      class262.method2003(class564.field8045.field10701 != var36.field9168.field10701, var53, 84);
                                                      var53.field3810 = class96.field1234;
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
                                    } while(var50 > var52);
                                 }
                              }

                              if (~class96.field1234 == ~var41.field3810) {
                                 break label740;
                              }

                              class262.method2003(class564.field8045.field10701 != var36.field9168.field10701, var41, 118);
                              var41.field3810 = class96.field1234;
                           }

                           if (var36.field9168 instanceof class506) {
                              class506 var56 = (class506)var36.field9168;
                              if (var56.field7333 != null) {
                                 if (~(1 & var56.field7333.field10909) == -1 && (511 & var56.field10694) == 0 && (var56.field10693 & 511) == 0 || ~(1 & var56.field7333.field10909) == -2 && ~(var56.field10694 & 511) == -257 && ~(var56.field10693 & 511) == -257) {
                                    int var57 = -(var56.field7333.field10909 + -1 << 8) + var56.field10694;
                                    int var58 = -(var56.field7333.field10909 + -1 << 8) + var56.field10693;
                                    int var59 = 0;
                                    if (var4 || class475.field6836 > var59) {
                                       do {
                                          class529 var60 = (class529)class328.field4479.method329((byte)100, (long)class352.field4728[var59]);
                                          if (var60 != null) {
                                             class506 var61 = var60.field7559;
                                             if (class96.field1234 != var61.field3810) {
                                                if (var56 != var61) {
                                                   if (!var61.field3801 && !var4) {
                                                      ++var59;
                                                   } else {
                                                      int var62 = -(var61.field7333.field10909 + -1 << 8) + var61.field10694;
                                                      int var63 = -(var61.field7333.field10909 - 1 << 8) + var61.field10693;
                                                      if (~var62 <= ~var57 && -(-var57 + var62 >> 9) + var56.field7333.field10909 >= var61.field7333.field10909 && var63 >= var58 && ~(-(-var58 + var63 >> 9) + var56.field7333.field10909) <= ~var61.field7333.field10909) {
                                                         class12.method70(var61, (byte)-126, ~class564.field8045.field10701 != ~var36.field9168.field10701);
                                                         var61.field3810 = class96.field1234;
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
                                       } while(class475.field6836 > var59);
                                    }

                                    int var64 = class390.field5657;
                                    int[] var65 = class254.field3459;
                                    int var66 = 0;
                                    if (var4 || ~var66 > ~var64) {
                                       do {
                                          class121 var67 = class380.field5483[var65[var66]];
                                          if (var67 != null) {
                                             if (~class96.field1234 != ~var67.field3810) {
                                                if (!var67.field3801 && !var4) {
                                                   ++var66;
                                                } else {
                                                   int var68 = var67.field10694 + -(-1 + var67.method972(-1) << 8);
                                                   int var69 = var67.field10693 + -(-1 + var67.method972(-1) << 8);
                                                   if (~var68 <= ~var57 && ~var67.method972(-1) >= ~(-(-var57 + var68 >> 9) + var56.field7333.field10909) && var58 <= var69 && ~var67.method972(-1) >= ~(-(-var58 + var69 >> 9) + var56.field7333.field10909)) {
                                                      class262.method2003(class564.field8045.field10701 != var36.field9168.field10701, var67, -82);
                                                      var67.field3810 = class96.field1234;
                                                   }

                                                   ++var66;
                                                }
                                             } else {
                                                ++var66;
                                             }
                                          } else {
                                             ++var66;
                                          }
                                       } while(~var66 > ~var64);
                                    }
                                 }

                                 if (~class96.field1234 == ~var56.field3810) {
                                    break label740;
                                 }

                                 class12.method70(var56, (byte)-120, class564.field8045.field10701 != var36.field9168.field10701);
                                 var56.field3810 = class96.field1234;
                              }
                           }

                           if (var36.field9168 instanceof class546) {
                              int var70 = var39 - -class672.field9740;
                              int var71 = class533.field7595 + var40;
                              class622 var72 = (class622)class39.field556.method329((byte)103, (long)(var71 << 14 | var36.field9168.field10701 << 28 | var70));
                              if (var72 != null) {
                                 int var73 = 0;
                                 class553 var74 = (class553)var72.field9154.method2936(false);
                                 if (var4 || var74 != null) {
                                    do {
                                       class358 var75 = class468.field6728.method2261(-1, var74.field7927);
                                       if (class613.field9015 && ~class564.field8045.field10701 == ~var36.field9168.field10701) {
                                          class649 var76 = class260.field3611 == -1 ? null : class327.field4469.method1334(class260.field3611, (byte)-3);
                                          if (~(1 & class375.field5425) != -1 && (var76 == null || var75.method2668(class260.field3611, false, var76.field9474) != var76.field9474)) {
                                             ++class541.field7766;
                                             class655.method4799(class198.field2816, false, class37.field523 + field3782[3] + var75.field4830, false, (long)var73, var40, 81, var39, (long)var74.field7927, true, 45, class14.field160, -1);
                                          }
                                       }

                                       if (class564.field8045.field10701 == var36.field9168.field10701) {
                                          String[] var77 = var75.field4887;
                                          int var78 = 4;
                                          if (var4 || ~var78 <= -1) {
                                             do {
                                                if (var77 != null && var77[var78] != null) {
                                                   byte var79 = 0;
                                                   int var80 = class534.field7616;
                                                   if (~var78 == -1) {
                                                      var79 = 53;
                                                   }

                                                   if (~var78 == -2) {
                                                      var79 = 59;
                                                   }

                                                   if (var78 == 2) {
                                                      var79 = 3;
                                                   }

                                                   if (var78 == 3) {
                                                      var79 = 51;
                                                   }

                                                   if (~var75.field4877 == ~var78) {
                                                      var80 = var75.field4828;
                                                   }

                                                   if (~var78 == -5) {
                                                      var79 = 47;
                                                   }

                                                   if (~var75.field4870 == ~var78) {
                                                      var80 = var75.field4807;
                                                   }

                                                   ++class491.field7027;
                                                   class655.method4799(var77[var78], false, field3782[8] + var75.field4830, false, (long)var73, var40, 44, var39, (long)var74.field7927, true, var79, var80, -1);
                                                }

                                                --var78;
                                             } while(~var78 <= -1);
                                          }
                                       }

                                       class655.method4799(class180.field2501.method1437(class608.field8920, 50), class564.field8045.field10701 != var36.field9168.field10701, field3782[8] + var75.field4830, false, (long)var73, var40, 102, var39, (long)var74.field7927, true, 1002, class237.field3309, -1);
                                       ++class18.field204;
                                       ++var73;
                                       var74 = (class553)var72.field9154.method2928((byte)-24);
                                    } while(var74 != null);
                                 }
                              }
                           }

                           if (var36.field9168 instanceof class604) {
                              class604 var81 = (class604)var36.field9168;
                              class259 var82 = class387.field5618.method3977(var81.method236(28154), (byte)75);
                              if (var82.field3539 != null) {
                                 var82 = var82.method1984(class21.field248, 21723);
                              }

                              if (var82 != null) {
                                 if (class613.field9015 && class564.field8045.field10701 == var36.field9168.field10701) {
                                    class649 var83 = ~class260.field3611 != 0 ? class327.field4469.method1334(class260.field3611, (byte)101) : null;
                                    if ((class375.field5425 & 4) != 0 && (var83 == null || ~var82.method1981(class260.field3611, var83.field9474, -63) != ~var83.field9474)) {
                                       class655.method4799(class198.field2816, false, class37.field523 + field3782[9] + var82.field3519, false, (long)var81.hashCode(), var40, 59, var39, class192.method1513(var39, var40, 3, var81), true, 16, class14.field160, -1);
                                       ++class304.field4148;
                                    }
                                 }

                                 if (class564.field8045.field10701 == var36.field9168.field10701) {
                                    String[] var84 = var82.field3513;
                                    if (var84 != null) {
                                       int var85 = 4;
                                       if (var4 || var85 >= 0) {
                                          do {
                                             if (var84[var85] != null) {
                                                short var86 = 0;
                                                if (~var85 == -1) {
                                                   var86 = 60;
                                                }

                                                int var87 = class534.field7616;
                                                if (var85 == 1) {
                                                   var86 = 50;
                                                }

                                                if (~var85 == -3) {
                                                   var86 = 52;
                                                }

                                                if (~var85 == -4) {
                                                   var86 = 46;
                                                }

                                                if (var82.field3586 == var85) {
                                                   var87 = var82.field3520;
                                                }

                                                if (~var85 == -5) {
                                                   var86 = 1009;
                                                }

                                                if (var82.field3561 == var85) {
                                                   var87 = var82.field3588;
                                                }

                                                class655.method4799(var84[var85], false, field3782[6] + var82.field3519, false, (long)var81.hashCode(), var40, 85, var39, class192.method1513(var39, var40, 3, var81), true, var86, var87, -1);
                                                ++class639.field9338;
                                             }

                                             --var85;
                                          } while(var85 >= 0);
                                       }
                                    }

                                    ++class758.field11222;
                                    class655.method4799(class180.field2501.method1437(class608.field8920, 50), ~class564.field8045.field10701 != ~var36.field9168.field10701, field3782[6] + var82.field3519, false, (long)var81.hashCode(), var40, 105, var39, (long)var82.field3544, true, 1010, class237.field3309, -1);
                                 }
                              }
                           }
                        }
                     }

                     var36 = (class623)var35.method5527((byte)45);
                     if (var36 == null) {
                        var91 = class681.field10034;
                        if (!var4) {
                           break;
                        }
                     } else {
                        var91 = class503.field7308;
                     }
                  }
               }

               if (var91) {
                  class111.method901(64);
               }

               ++var30;
               var10000 = ~var30;
               if (!class681.field10034) {
                  var10001 = 1;
                  if (!var4) {
                     var10001 = ~1;
                  }
               } else {
                  var10001 = ~2;
               }
            } while(var10000 > var10001);

            class123.method995(-2, false);
         }
      } catch (RuntimeException var89) {
         throw class237.method1823(var89, field3782[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3782[7] : field3782[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2107(int arg0) {
      try {
         if (arg0 >= -115) {
            field3780 = null;
         }

         field3780 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3782[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class277(int arg0, int arg1) {
      try {
         this.field3781 = arg0;
         this.field3779 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3782[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2108(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2109(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
