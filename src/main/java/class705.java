import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class705 extends class612 {
   @OriginalMember(
      owner = "client!uw",
      name = "s",
      descriptor = "I"
   )
   public int field10139;
   @OriginalMember(
      owner = "client!uw",
      name = "p",
      descriptor = "I"
   )
   public int field10140;
   @OriginalMember(
      owner = "client!uw",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10150 = new String[]{method5145(method5144("d^\u001fe")), method5145(method5144("q\u0005]'\u001e")), method5145(method5144("\u007f\\]5\ndB\u00077K")), method5145(method5144("6I\u00017K;\u001bC,J")), method5145(method5144("^D\u001cbY*")), method5145(method5144("\u007f\\]LK")), method5145(method5144("UX\u0007h\u0017cH\u0016e\u0006gN\u001d}\u0010")), method5145(method5144("gX")), method5145(method5144("\u007f\\]KK")), method5145(method5144("\u007f\\]HK")), method5145(method5144("\u007f\\]OK"))};
   @OriginalMember(
      owner = "client!uw",
      name = "n",
      descriptor = "I"
   )
   public static int field10142 = -1;
   @OriginalMember(
      owner = "client!uw",
      name = "t",
      descriptor = "Lhha;"
   )
   public static class724 field10138 = new class724(65, 3);
   @OriginalMember(
      owner = "client!uw",
      name = "r",
      descriptor = "J"
   )
   public static long field10149 = 0L;
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field10148 = false;
   @OriginalMember(
      owner = "client!uw",
      name = "v",
      descriptor = "I"
   )
   public static int field10137;
   @OriginalMember(
      owner = "client!uw",
      name = "q",
      descriptor = "I"
   )
   public static int field10144;
   @OriginalMember(
      owner = "client!uw",
      name = "u",
      descriptor = "I"
   )
   public static int field10145;
   @OriginalMember(
      owner = "client!uw",
      name = "w",
      descriptor = "Lrba;"
   )
   public static class150 field10141;
   @OriginalMember(
      owner = "client!uw",
      name = "o",
      descriptor = "Lwm;"
   )
   public static class440 field10143;
   @OriginalMember(
      owner = "client!uw",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field10146;
   @OriginalMember(
      owner = "client!uw",
      name = "x",
      descriptor = "[Ldea;"
   )
   public static class471[] field10147;

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method5141(boolean arg0) {
      try {
         ++field10137;
         ++class671.field9411;
         class381 var1 = class801.method5775(class100.field1578, 0, class745.field10605.field3718);
         if (!arg0) {
            field10138 = null;
         }

         var1.field5570.method674(-71, class478.field6882);
         class745.field10605.method2111(14024, var1);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10150[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "<init>",
      descriptor = "(Leu;Lmj;IIIIIIIII)V"
   )
   public class705(class634 arg0, class730 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field10139 = arg10;
         this.field10140 = arg9;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field10150[2] + (arg0 != null ? field10150[1] : field10150[0]) + ',' + (arg1 != null ? field10150[1] : field10150[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5142(boolean arg0) {
      try {
         field10147 = null;
         field10141 = null;
         if (!arg0) {
            field10143 = null;
            field10138 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10150[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5143(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field10144;
         class223.method1916(false, false);
         class124.field1984 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1) {
            if (~class626.field8942[var3] != 0 && class168.field2520[var3] == null) {
               class168.field2520[var3] = class488.field6962.method460((byte)-11, 0, class626.field8942[var3]);
               if (class168.field2520[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            if (~class282.field4260[var3] != 0 && class277.field4198[var3] == null) {
               class277.field4198[var3] = class488.field6962.method462(class701.field10107[var3], class282.field4260[var3], 20468, 0);
               if (class277.field4198[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            if (~class65.field897[var3] != 0 && class16.field220[var3] == null) {
               class16.field220[var3] = class488.field6962.method460((byte)-11, 0, class65.field897[var3]);
               if (class16.field220[var3] == null) {
                  ++class124.field1984;
                  var2 = false;
               }
            }

            if (class251.field3825[var3] != -1 && class51.field762[var3] == null) {
               class51.field762[var3] = class488.field6962.method460((byte)-11, 0, class251.field3825[var3]);
               if (class51.field762[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            if (class387.field5648 != null && class320.field4776[var3] == null && ~class387.field5648[var3] != 0) {
               class320.field4776[var3] = class488.field6962.method462(class701.field10107[var3], class387.field5648[var3], 20468, 0);
               if (class320.field4776[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            ++var3;
         }

         while(true) {
            if (~var3 <= ~class168.field2520.length) {
               if (!var1) {
                  if (class378.field5525 == null) {
                     label912: {
                        if (class290.field4331 == null || !class254.field3858.method447(class290.field4331.field831 + field10150[6], 7004)) {
                           class378.field5525 = new class790(0);
                           if (!var1) {
                              break label912;
                           }
                        }

                        if (class254.field3858.method463((byte)-126, class290.field4331.field831 + field10150[6])) {
                           class378.field5525 = class462.method3564(27812, class254.field3858, class521.field7329, class290.field4331.field831 + field10150[6]);
                           if (!var1) {
                              break label912;
                           }
                        }

                        var2 = false;
                        ++class124.field1984;
                     }
                  }

                  if (!var2) {
                     class702.field10113 = 1;
                     return;
                  }

                  boolean var4 = true;
                  class161.field2455 = 0;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (var1) {
                     var6 = class277.field4198[var5];
                     if (var6 != null) {
                        var7 = (class460.field6709[var5] >> 8) * 64 - class115.field1824;
                        var8 = (255 & class460.field6709[var5]) * 64 - class480.field6903;
                        if (class22.field325 != 0) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class243.method2122(var6, var8, class234.field3626, -23, var7, class209.field2989);
                     }

                     var9 = class51.field762[var5];
                     if (var9 != null) {
                        var10 = (class460.field6709[var5] >> 8) * 64 + -class115.field1824;
                        var11 = (255 & class460.field6709[var5]) * 64 - class480.field6903;
                        if (class22.field325 != 0) {
                           var10 = 10;
                           var11 = 10;
                        }

                        var4 &= class243.method2122(var9, var11, class234.field3626, -23, var10, class209.field2989);
                     }

                     ++var5;
                  }

                  while(class168.field2520.length > var5) {
                     var6 = class277.field4198[var5];
                     if (var6 != null) {
                        var7 = (class460.field6709[var5] >> 8) * 64 - class115.field1824;
                        var8 = (255 & class460.field6709[var5]) * 64 - class480.field6903;
                        if (class22.field325 != 0) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class243.method2122(var6, var8, class234.field3626, -23, var7, class209.field2989);
                     }

                     var9 = class51.field762[var5];
                     if (var9 != null) {
                        var10 = (class460.field6709[var5] >> 8) * 64 + -class115.field1824;
                        var11 = (255 & class460.field6709[var5]) * 64 - class480.field6903;
                        if (class22.field325 != 0) {
                           var10 = 10;
                           var11 = 10;
                        }

                        var4 &= class243.method2122(var9, var11, class234.field3626, -23, var10, class209.field2989);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class702.field10113 = 2;
                     return;
                  }

                  if (class702.field10113 != 0) {
                     class644.method4685(class383.field5587, class765.field10915.method5512(-2, class777.field11340) + field10150[3], (byte)-65, true, class510.field7243, class54.field794);
                  }

                  class622.method4576((byte)-95);
                  class372.method2915((byte)35);
                  class663.method4820(1);
                  boolean var12 = false;
                  if (class54.field794.method180() && class476.field6870.field9149.method5014(-125) == 2) {
                     int var13 = 0;
                     if (var1 || ~var13 > ~class168.field2520.length) {
                        do {
                           if (class51.field762[var13] == null) {
                              if (class16.field220[var13] != null) {
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
                        } while(~var13 > ~class168.field2520.length);
                     }
                  }

                  int var14;
                  label707: {
                     if (class476.field6870.field9117.method3836(-79) != 1) {
                        var14 = class84.field1301[class303.field4586];
                        if (!var1) {
                           break label707;
                        }
                     }

                     var14 = class160.field2449[class303.field4586];
                  }

                  if (arg0 >= -113) {
                     return;
                  }

                  if (class54.field794.method200()) {
                     ++var14;
                  }

                  label679: {
                     class667.method4845(class54.field794, class88.field1320, 9, 4, class234.field3626, class209.field2989, var14, var12, class54.field794.method203() > 0);
                     class166.method1562(class430.field6302);
                     if (~class430.field6302 == -1) {
                        class444.method3445((class216)null);
                        if (!var1) {
                           break label679;
                        }
                     }

                     class444.method3445(class666.field9377);
                  }

                  int var15 = 0;
                  if (var1) {
                     class100.field1588[var15].method4812((byte)-13);
                     ++var15;
                  }

                  while(true) {
                     while(var15 < 4) {
                        class100.field1588[var15].method4812((byte)-13);
                        ++var15;
                     }

                     class13.method109(77);
                     class356.method2802((byte)103, false);
                     class372.method2917((byte)79);
                     class164.field2484 = false;
                     class622.method4576((byte)-55);
                     System.gc();
                     class223.method1916(false, true);
                     class735.method5326(-11418);
                     class637.field9010 = class476.field6870.field9118.method709(-102);
                     if (!var1) {
                        label672: {
                           class306.field4637 = class654.field9274 >= 96;
                           class587.field8248 = class476.field6870.field9149.method5014(-70) == 2;
                           class261.field4009 = ~class476.field6870.field9128.method2605(-60) == -2;
                           class416.field6100 = ~class476.field6870.field9133.method2232(-101) != -2 ? class697.field10057 : -1;
                           class691.field9946 = class476.field6870.field9119.method5500(-55) == 1;
                           class272.field4164 = class476.field6870.field9138.method2740(-78) == 1;
                           class203.field2904 = new class543(4, class234.field3626, class209.field2989, false);
                           if (class22.field325 != 0) {
                              class430.method3352(101, class168.field2520, class203.field2904);
                              if (!var1) {
                                 break label672;
                              }
                           }

                           class23.method304(-31419, class203.field2904, class168.field2520);
                        }

                        class396.method3085(class234.field3626 >> 4, class209.field2989 >> 4, -1);
                        class309.method2534((byte)72);
                        if (var12) {
                           label665: {
                              class662.method4802(true);
                              class509.field7225 = new class543(1, class234.field3626, class209.field2989, true);
                              if (class22.field325 == 0) {
                                 class23.method304(-31419, class509.field7225, class16.field220);
                                 class223.method1916(false, true);
                                 if (!var1) {
                                    break label665;
                                 }
                              }

                              class430.method3352(70, class16.field220, class509.field7225);
                              class223.method1916(false, true);
                           }

                           class509.field7225.method1124(-79, class203.field2904.field1822[0], 0);
                           class509.field7225.method1122((int[][][])null, 25496, class54.field794, (class663[])null);
                           class662.method4802(false);
                        }

                        label659: {
                           class203.field2904.method1122(!var12 ? null : class509.field7225.field1822, 25496, class54.field794, class100.field1588);
                           if (class22.field325 == 0) {
                              class223.method1916(false, true);
                              class363.method2852(class277.field4198, class203.field2904, (byte)-106);
                              if (class320.field4776 == null) {
                                 break label659;
                              }

                              class729.method5283((byte)122);
                              if (!var1) {
                                 break label659;
                              }
                           }

                           class223.method1916(false, true);
                           class519.method3881(class203.field2904, class277.field4198, (byte)-97);
                        }

                        class372.method2915((byte)35);
                        if (class654.field9274 < 96) {
                           class509.method3835(1);
                        }

                        class223.method1916(false, true);
                        class203.field2904.method1123(var12 ? class634.field8989[0] : null, (class751)null, (byte)-110, class54.field794);
                        class203.field2904.method4059(false, -3, class54.field794);
                        class223.method1916(false, true);
                        if (var12) {
                           label647: {
                              class662.method4802(true);
                              class223.method1916(false, true);
                              if (~class22.field325 != -1) {
                                 class519.method3881(class509.field7225, class51.field762, (byte)-97);
                                 if (!var1) {
                                    break label647;
                                 }
                              }

                              class363.method2852(class51.field762, class509.field7225, (byte)-93);
                           }

                           class372.method2915((byte)35);
                           class223.method1916(false, true);
                           class509.field7225.method1123((class751)null, class558.field7922[0], (byte)-110, class54.field794);
                           class509.field7225.method4059(true, -3, class54.field794);
                           class223.method1916(false, true);
                           class662.method4802(false);
                        }

                        class499.method3781(105);
                        int var16 = class203.field2904.field7655;
                        if (~class128.field2049 > ~var16) {
                           var16 = class128.field2049;
                        }

                        if (~(class128.field2049 + -1) < ~var16) {
                           var16 = class128.field2049 + -1;
                        }

                        label400: {
                           if (class476.field6870.field9133.method2232(-70) != 0) {
                              class703.method5132(0);
                              if (!var1) {
                                 break label400;
                              }
                           }

                           class703.method5132(var16);
                        }

                        int var17 = 0;
                        byte var10000;
                        class381 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class381 var27;
                        if (var1) {
                           var10000 = 0;
                        } else if (var17 >= 4) {
                           class670.method4857(true);
                           class622.method4576((byte)-79);
                           class799.method5758(-105);
                           class372.method2915((byte)35);
                           var10000 = 1;
                           if (!var1) {
                              class509.method3837(true);
                              if (class800.field11642 != null && class745.field10605.field3713 != null && ~class394.field5712 == -13) {
                                 ++class249.field3816;
                                 var20 = class801.method5775(class245.field3767, 0, class745.field10605.field3718);
                                 var20.field5570.method674(-92, 1057001181);
                                 class745.field10605.method2111(14024, var20);
                              }

                              if (class22.field325 == 0) {
                                 var21 = (-(class234.field3626 >> 4) + class2.field18) / 8;
                                 var22 = ((class234.field3626 >> 4) + class2.field18) / 8;
                                 var23 = (-(class209.field2989 >> 4) + class130.field2098) / 8;
                                 var24 = ((class209.field2989 >> 4) + class130.field2098) / 8;
                                 var25 = var21 + -1;
                                 if (var1 || ~var25 >= ~(var22 + 1)) {
                                    do {
                                       var26 = var23 - 1;
                                       if (var1) {
                                          if (~var25 <= ~var21) {
                                             if (~var22 <= ~var25) {
                                                if (var23 <= var26) {
                                                   if (~var26 < ~var24) {
                                                      class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                      class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                   class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                   ++var26;
                                                }
                                             } else {
                                                class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                ++var26;
                                             }
                                          } else {
                                             class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                             class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(var24 + 1 >= var26) {
                                             if (~var25 <= ~var21) {
                                                if (~var22 <= ~var25) {
                                                   if (var23 <= var26) {
                                                      if (~var26 < ~var24) {
                                                         class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                         class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                      class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                   class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                   ++var26;
                                                }
                                             } else {
                                                class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                ++var26;
                                             }
                                          }

                                          if (!var1) {
                                             ++var25;
                                             break;
                                          }

                                          class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                          ++var26;
                                       }
                                    } while(~var25 >= ~(var22 + 1));
                                 }
                              }

                              label878: {
                                 if (~class394.field5712 == -5) {
                                    class755.method5457(3, false);
                                    if (!var1) {
                                       break label878;
                                    }
                                 }

                                 if (class394.field5712 != 8) {
                                    if (class394.field5712 != 10) {
                                       class755.method5457(11, false);
                                       if (class745.field10605.field3713 == null) {
                                          break label878;
                                       }

                                       var27 = class801.method5775(class738.field10540, 0, class745.field10605.field3718);
                                       class745.field10605.method2111(14024, var27);
                                       if (!var1) {
                                          break label878;
                                       }
                                    }

                                    class755.method5457(9, false);
                                    if (!var1) {
                                       break label878;
                                    }
                                 }

                                 class755.method5457(7, false);
                              }

                              class463.method3569(-1);
                              class622.method4576((byte)-46);
                              class102.method1002((byte)-73);
                              class248.field3804 = true;
                              if (class355.field5249) {
                                 class137.method1389(-113, field10150[4] + (class604.method4452(32) - class60.field855) + field10150[7]);
                                 class355.field5249 = false;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = 0;
                        }

                        while(true) {
                           label637: {
                              int var18 = var10000;
                              int var19;
                              if (var1) {
                                 var19 = 0;
                                 if (var1) {
                                    class367.method2894(var19, var18, 5193, var17);
                                    ++var19;
                                 }
                              } else {
                                 if (var18 >= class234.field3626) {
                                    break label637;
                                 }

                                 var19 = 0;
                                 if (var1) {
                                    class367.method2894(var19, var18, 5193, var17);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(class209.field2989 > var19) {
                                    class367.method2894(var19, var18, 5193, var17);
                                    ++var19;
                                 }

                                 if (!var1) {
                                    ++var18;
                                    if (var18 >= class234.field3626) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1) {
                                       class367.method2894(var19, var18, 5193, var17);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (var17 >= 4) {
                              class670.method4857(true);
                              class622.method4576((byte)-79);
                              class799.method5758(-105);
                              class372.method2915((byte)35);
                              var10000 = 1;
                              if (!var1) {
                                 class509.method3837(true);
                                 if (class800.field11642 != null && class745.field10605.field3713 != null && ~class394.field5712 == -13) {
                                    ++class249.field3816;
                                    var20 = class801.method5775(class245.field3767, 0, class745.field10605.field3718);
                                    var20.field5570.method674(-92, 1057001181);
                                    class745.field10605.method2111(14024, var20);
                                 }

                                 if (class22.field325 == 0) {
                                    var21 = (-(class234.field3626 >> 4) + class2.field18) / 8;
                                    var22 = ((class234.field3626 >> 4) + class2.field18) / 8;
                                    var23 = (-(class209.field2989 >> 4) + class130.field2098) / 8;
                                    var24 = ((class209.field2989 >> 4) + class130.field2098) / 8;
                                    var25 = var21 + -1;
                                    if (var1 || ~var25 >= ~(var22 + 1)) {
                                       do {
                                          var26 = var23 - 1;
                                          if (var1) {
                                             if (~var25 <= ~var21) {
                                                if (~var22 <= ~var25) {
                                                   if (var23 <= var26) {
                                                      if (~var26 < ~var24) {
                                                         class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                         class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                      class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                   class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                   ++var26;
                                                }
                                             } else {
                                                class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(var24 + 1 >= var26) {
                                                if (~var25 <= ~var21) {
                                                   if (~var22 <= ~var25) {
                                                      if (var23 <= var26) {
                                                         if (~var26 < ~var24) {
                                                            class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                            class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                         class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                      class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class488.field6962.method440("m" + var25 + "_" + var26, 25741);
                                                   class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                                   ++var26;
                                                }
                                             }

                                             if (!var1) {
                                                ++var25;
                                                break;
                                             }

                                             class488.field6962.method440("l" + var25 + "_" + var26, 25741);
                                             ++var26;
                                          }
                                       } while(~var25 >= ~(var22 + 1));
                                    }
                                 }

                                 label893: {
                                    if (~class394.field5712 == -5) {
                                       class755.method5457(3, false);
                                       if (!var1) {
                                          break label893;
                                       }
                                    }

                                    if (class394.field5712 != 8) {
                                       if (class394.field5712 != 10) {
                                          class755.method5457(11, false);
                                          if (class745.field10605.field3713 == null) {
                                             break label893;
                                          }

                                          var27 = class801.method5775(class738.field10540, 0, class745.field10605.field3718);
                                          class745.field10605.method2111(14024, var27);
                                          if (!var1) {
                                             break label893;
                                          }
                                       }

                                       class755.method5457(9, false);
                                       if (!var1) {
                                          break label893;
                                       }
                                    }

                                    class755.method5457(7, false);
                                 }

                                 class463.method3569(-1);
                                 class622.method4576((byte)-46);
                                 class102.method1002((byte)-73);
                                 class248.field3804 = true;
                                 if (class355.field5249) {
                                    class137.method1389(-113, field10150[4] + (class604.method4452(32) - class60.field855) + field10150[7]);
                                    class355.field5249 = false;
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
            } else if (~class626.field8942[var3] != 0 && class168.field2520[var3] == null) {
               class168.field2520[var3] = class488.field6962.method460((byte)-11, 0, class626.field8942[var3]);
               if (class168.field2520[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            if (~class282.field4260[var3] != 0 && class277.field4198[var3] == null) {
               class277.field4198[var3] = class488.field6962.method462(class701.field10107[var3], class282.field4260[var3], 20468, 0);
               if (class277.field4198[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            if (~class65.field897[var3] != 0 && class16.field220[var3] == null) {
               class16.field220[var3] = class488.field6962.method460((byte)-11, 0, class65.field897[var3]);
               if (class16.field220[var3] == null) {
                  ++class124.field1984;
                  var2 = false;
               }
            }

            if (class251.field3825[var3] != -1 && class51.field762[var3] == null) {
               class51.field762[var3] = class488.field6962.method460((byte)-11, 0, class251.field3825[var3]);
               if (class51.field762[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            if (class387.field5648 != null && class320.field4776[var3] == null && ~class387.field5648[var3] != 0) {
               class320.field4776[var3] = class488.field6962.method462(class701.field10107[var3], class387.field5648[var3], 20468, 0);
               if (class320.field4776[var3] == null) {
                  var2 = false;
                  ++class124.field1984;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class612.method4503(var29, field10150[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         ++field10145;
         if (arg0 > -70) {
            method5141(true);
         }

         return class556.field7899;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10150[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5144(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5145(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
