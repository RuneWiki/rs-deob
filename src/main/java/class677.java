import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class677 implements class644 {
   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "I"
   )
   public int field9936;
   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "I"
   )
   public int field9942;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "I"
   )
   public int field9931;
   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "Lfk;"
   )
   public class678 field9941;
   @OriginalMember(
      owner = "client!rs",
      name = "o",
      descriptor = "I"
   )
   public int field9928;
   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "I"
   )
   public int field9924;
   @OriginalMember(
      owner = "client!rs",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field9925;
   @OriginalMember(
      owner = "client!rs",
      name = "m",
      descriptor = "I"
   )
   public int field9939;
   @OriginalMember(
      owner = "client!rs",
      name = "i",
      descriptor = "I"
   )
   public int field9933;
   @OriginalMember(
      owner = "client!rs",
      name = "j",
      descriptor = "Lqda;"
   )
   public class112 field9937;
   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "I"
   )
   public int field9938;
   @OriginalMember(
      owner = "client!rs",
      name = "k",
      descriptor = "I"
   )
   public int field9940;
   @OriginalMember(
      owner = "client!rs",
      name = "r",
      descriptor = "I"
   )
   public int field9927;
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9943 = new String[]{method4949(method4948("=R\"\b|!Hx\n=")), method4949(method4948("4\u000f\"\u001ah")), method4949(method4948("!T`X")), method4949(method4948("\"R")), method4949(method4948("\u001bNc_/o")), method4949(method4948("\u0010RxUa&BiXp\"Db@f")), method4949(method4948("=R\"w=")), method4949(method4948("sC~\n=~\u0011<\u0011<")), method4949(method4948("=R\"u=")), method4949(method4948("=R\"v="))};
   @OriginalMember(
      owner = "client!rs",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field9929 = true;
   @OriginalMember(
      owner = "client!rs",
      name = "p",
      descriptor = "Luw;"
   )
   public static class435 field9934 = new class435(86, 11);
   @OriginalMember(
      owner = "client!rs",
      name = "q",
      descriptor = "I"
   )
   public static int field9926;
   @OriginalMember(
      owner = "client!rs",
      name = "g",
      descriptor = "I"
   )
   public static int field9930;
   @OriginalMember(
      owner = "client!rs",
      name = "n",
      descriptor = "I"
   )
   public static int field9932;
   @OriginalMember(
      owner = "client!rs",
      name = "h",
      descriptor = "I"
   )
   public static int field9935;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static final void method4946(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field9930;
         class442.method3327(false, true);
         class381.field5649 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1) {
            if (class205.field3058[var3] != -1 && class756.field10978[var3] == null) {
               class756.field10978[var3] = class515.field7506.method1347((byte)123, class205.field3058[var3], 0);
               if (class756.field10978[var3] == null) {
                  ++class381.field5649;
                  var2 = false;
               }
            }

            if (~class213.field3183[var3] != 0 && class245.field3526[var3] == null) {
               class245.field3526[var3] = class515.field7506.method1317(0, class213.field3183[var3], 0, class487.field7079[var3]);
               if (class245.field3526[var3] == null) {
                  var2 = false;
                  ++class381.field5649;
               }
            }

            if (class131.field2180[var3] != -1 && class360.field5391[var3] == null) {
               class360.field5391[var3] = class515.field7506.method1347((byte)125, class131.field2180[var3], 0);
               if (class360.field5391[var3] == null) {
                  var2 = false;
                  ++class381.field5649;
               }
            }

            if (class631.field9200[var3] != -1 && class719.field10376[var3] == null) {
               class719.field10376[var3] = class515.field7506.method1347((byte)126, class631.field9200[var3], 0);
               if (class719.field10376[var3] == null) {
                  ++class381.field5649;
                  var2 = false;
               }
            }

            if (class629.field9178 != null && class64.field1171[var3] == null && ~class629.field9178[var3] != 0) {
               class64.field1171[var3] = class515.field7506.method1317(0, class629.field9178[var3], 0, class487.field7079[var3]);
               if (class64.field1171[var3] == null) {
                  ++class381.field5649;
                  var2 = false;
               }
            }

            ++var3;
         }

         while(true) {
            if (~var3 <= ~class756.field10978.length) {
               if (!var1) {
                  if (class526.field7675 == null) {
                     label758: {
                        if (class417.field6105 != null && class392.field5783.method1316(class417.field6105.field434 + field9943[5], (byte)-33)) {
                           if (!class392.field5783.method1320(class417.field6105.field434 + field9943[5], arg0 ^ 110)) {
                              ++class381.field5649;
                              var2 = false;
                              if (!var1) {
                                 break label758;
                              }
                           }

                           class526.field7675 = class485.method3666(class417.field6105.field434 + field9943[5], class392.field5783, -2, class116.field1905);
                           if (!var1) {
                              break label758;
                           }
                        }

                        class526.field7675 = new class360(0);
                     }
                  }

                  if (!var2) {
                     class531.field7738 = 1;
                     return;
                  }

                  class270.field3837 = 0;
                  boolean var4 = true;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (var1) {
                     var6 = class245.field3526[var5];
                     if (var6 != null) {
                        var7 = (class733.field10553[var5] >> 8) * 64 + -class347.field4939;
                        var8 = (class733.field10553[var5] & 255) * 64 + -class753.field10887;
                        if (class124.field2049 != 0) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class203.method1737(class209.field3112, class1.field3, var7, false, var8, var6);
                     }

                     var9 = class719.field10376[var5];
                     if (var9 != null) {
                        var10 = (class733.field10553[var5] >> 8) * 64 + -class347.field4939;
                        var11 = (class733.field10553[var5] & 255) * 64 - class753.field10887;
                        if (~class124.field2049 != -1) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class203.method1737(class209.field3112, class1.field3, var10, false, var11, var9);
                     }

                     ++var5;
                  }

                  while(var5 < class756.field10978.length) {
                     var6 = class245.field3526[var5];
                     if (var6 != null) {
                        var7 = (class733.field10553[var5] >> 8) * 64 + -class347.field4939;
                        var8 = (class733.field10553[var5] & 255) * 64 + -class753.field10887;
                        if (class124.field2049 != 0) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class203.method1737(class209.field3112, class1.field3, var7, false, var8, var6);
                     }

                     var9 = class719.field10376[var5];
                     if (var9 != null) {
                        var10 = (class733.field10553[var5] >> 8) * 64 + -class347.field4939;
                        var11 = (class733.field10553[var5] & 255) * 64 - class753.field10887;
                        if (~class124.field2049 != -1) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class203.method1737(class209.field3112, class1.field3, var10, false, var11, var9);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class531.field7738 = 2;
                     return;
                  }

                  if (~class531.field7738 != -1) {
                     class263.method2107(class141.field2309, class100.field1611.method961(class385.field5684, true) + field9943[7], true, class678.field9949, 2, class444.field6473);
                  }

                  class743.method5393(4);
                  class377.method2948((byte)-102);
                  class413.method3158((byte)-64);
                  boolean var12 = false;
                  if (class444.field6473.method386() && ~class510.field7454.field11150.method1313(false) == -3) {
                     int var13 = 0;
                     if (var1 || ~class756.field10978.length < ~var13) {
                        do {
                           if (class719.field10376[var13] == null) {
                              if (class360.field5391[var13] != null) {
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
                        } while(~class756.field10978.length < ~var13);
                     }
                  }

                  int var14;
                  label688: {
                     if (class510.field7454.field11181.method1262(false) == 1) {
                        var14 = class8.field77[class39.field928];
                        if (!var1) {
                           break label688;
                        }
                     }

                     var14 = class780.field11427[class39.field928];
                  }

                  if (class444.field6473.method411()) {
                     ++var14;
                  }

                  label661: {
                     class262.method2097(class444.field6473, class377.field5604, 9, 4, class209.field3112, class1.field3, var14, var12, class444.field6473.method329() > 0);
                     class595.method4397(class639.field9312);
                     if (~class639.field9312 == -1) {
                        class243.method1976((class66)null);
                        if (!var1) {
                           break label661;
                        }
                     }

                     class243.method1976(class193.field2920);
                  }

                  int var15 = 0;
                  if (var1) {
                     class218.field3299[var15].method4602(-12962);
                     ++var15;
                  }

                  while(true) {
                     while(var15 < 4) {
                        class218.field3299[var15].method4602(-12962);
                        ++var15;
                     }

                     class708.method5142(true);
                     class760.method5497(false, 106);
                     client.method2451(30282);
                     class746.field10772 = false;
                     class360.field5396 = null;
                     class743.method5393(4);
                     System.gc();
                     class442.method3327(true, true);
                     class308.method2405(arg0 + 30);
                     class113.field1830 = class510.field7454.field11143.method4626(false);
                     if (!var1) {
                        label654: {
                           class528.field7694 = ~class73.field1307 <= -97;
                           class544.field7885 = class510.field7454.field11150.method1313(false) == 2;
                           class784.field11488 = ~class510.field7454.field11139.method5300(false) == -2;
                           class632.field9221 = class510.field7454.field11159.method1137(false) == 1 ? -1 : class359.field5371;
                           class402.field5935 = arg0 == class510.field7454.field11175.method2967(false);
                           class712.field10334 = ~class510.field7454.field11166.method5470(false) == -2;
                           class358.field5362 = new class363(4, class209.field3112, class1.field3, false);
                           if (~class124.field2049 != -1) {
                              class626.method4585(class756.field10978, class358.field5362, -97);
                              if (!var1) {
                                 break label654;
                              }
                           }

                           class237.method1941(class756.field10978, class358.field5362, false);
                        }

                        class275.method2163(class1.field3 >> 4, (byte)-127, class209.field3112 >> 4);
                        class592.method4370(arg0 ^ 34962);
                        if (var12) {
                           label647: {
                              class230.method1908(true);
                              class90.field1478 = new class363(1, class209.field3112, class1.field3, true);
                              if (class124.field2049 == 0) {
                                 class237.method1941(class360.field5391, class90.field1478, false);
                                 class442.method3327(true, true);
                                 if (!var1) {
                                    break label647;
                                 }
                              }

                              class626.method4585(class360.field5391, class90.field1478, -108);
                              class442.method3327(true, true);
                           }

                           class90.field1478.method1094(85, class358.field5362.field1883[0], 0);
                           class90.field1478.method1102((int[][][])null, (byte)-87, (class628[])null, class444.field6473);
                           class230.method1908(false);
                        }

                        label641: {
                           class358.field5362.method1102(var12 ? class90.field1478.field1883 : null, (byte)-76, class218.field3299, class444.field6473);
                           if (~class124.field2049 == -1) {
                              class442.method3327(true, true);
                              class5.method37(-105, class358.field5362, class245.field3526);
                              if (class64.field1171 == null) {
                                 break label641;
                              }

                              class533.method3992((byte)-94);
                              if (!var1) {
                                 break label641;
                              }
                           }

                           class442.method3327(true, true);
                           class435.method3273(arg0 ^ 91, class245.field3526, class358.field5362);
                        }

                        class377.method2948((byte)-102);
                        if (~class73.field1307 > -97) {
                           class262.method2094(false);
                        }

                        class442.method3327(true, true);
                        class358.field5362.method1101(class444.field6473, (class293)null, !var12 ? null : class455.field6647[0], (byte)69);
                        class358.field5362.method2843(-17312, class444.field6473, false);
                        class442.method3327(true, true);
                        if (var12) {
                           label629: {
                              class230.method1908(true);
                              class442.method3327(true, true);
                              if (class124.field2049 != 0) {
                                 class435.method3273(arg0 + 121, class719.field10376, class90.field1478);
                                 if (!var1) {
                                    break label629;
                                 }
                              }

                              class5.method37(-114, class90.field1478, class719.field10376);
                           }

                           class377.method2948((byte)-102);
                           class442.method3327(true, true);
                           class90.field1478.method1101(class444.field6473, class530.field7721[0], (class293)null, (byte)69);
                           class90.field1478.method2843(-17312, class444.field6473, true);
                           class442.method3327(true, true);
                           class230.method1908(false);
                        }

                        class127.method1236(131586);
                        int var16 = class358.field5362.field5418;
                        if (class731.field10504 < var16) {
                           var16 = class731.field10504;
                        }

                        if (~var16 > ~(class731.field10504 + -1)) {
                           var16 = class731.field10504 + -1;
                        }

                        label389: {
                           if (~class510.field7454.field11159.method1137(false) == -1) {
                              class690.method5024(var16);
                              if (!var1) {
                                 break label389;
                              }
                           }

                           class690.method5024(0);
                        }

                        int var17 = 0;
                        int var10000;
                        class542 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class542 var27;
                        if (var1) {
                           var10000 = 0;
                        } else if (~var17 <= -5) {
                           class158.method1443(512);
                           class743.method5393(4);
                           class140.method1310(-1);
                           class377.method2948((byte)-102);
                           var10000 = arg0 ^ 9770;
                           if (!var1) {
                              class348.method2686(var10000);
                              if (class123.field1971 != null && class361.field5404 != null && ~class376.field5588 == -12) {
                                 ++class153.field2442;
                                 var20 = class549.method4093((byte)-113, class292.field4065, class126.field2108);
                                 var20.field7859.method3540(1057001181, arg0 + 898075919);
                                 class740.method5332(var20, (byte)77);
                              }

                              if (~class124.field2049 == -1) {
                                 var21 = (-(class209.field3112 >> 4) + class36.field883) / 8;
                                 var22 = (class36.field883 - -(class209.field3112 >> 4)) / 8;
                                 var23 = (-(class1.field3 >> 4) + class375.field5579) / 8;
                                 var24 = (class375.field5579 - -(class1.field3 >> 4)) / 8;
                                 var25 = var21 - 1;
                                 if (var1 || ~var25 >= ~(var22 - -1)) {
                                    do {
                                       var26 = var23 + -1;
                                       if (var1) {
                                          if (~var21 >= ~var25) {
                                             if (~var22 <= ~var25) {
                                                if (var23 <= var26) {
                                                   if (~var24 > ~var26) {
                                                      class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                      class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                   class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             } else {
                                                class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                ++var26;
                                             }
                                          } else {
                                             class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                             class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(~var26 >= ~(var24 + 1)) {
                                             if (~var21 >= ~var25) {
                                                if (~var22 <= ~var25) {
                                                   if (var23 <= var26) {
                                                      if (~var24 > ~var26) {
                                                         class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                         class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                      class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                   class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             } else {
                                                class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                ++var26;
                                             }
                                          }

                                          if (!var1) {
                                             ++var25;
                                             break;
                                          }

                                          class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                          ++var26;
                                       }
                                    } while(~var25 >= ~(var22 - -1));
                                 }
                              }

                              label855: {
                                 if (class376.field5588 == 4) {
                                    class645.method4735(3, -128);
                                    if (!var1) {
                                       break label855;
                                    }
                                 }

                                 if (~class376.field5588 != -9) {
                                    class645.method4735(10, -106);
                                    if (class361.field5404 == null) {
                                       break label855;
                                    }

                                    var27 = class549.method4093((byte)-113, class270.field3825, class126.field2108);
                                    class740.method5332(var27, (byte)77);
                                    if (!var1) {
                                       break label855;
                                    }
                                 }

                                 class645.method4735(7, -123);
                              }

                              class205.method1743((byte)-54);
                              class743.method5393(arg0 + 3);
                              class179.method1590((byte)123);
                              class186.field2818 = true;
                              if (class186.field2813) {
                                 class622.method4561(field9943[4] + (class57.method650(118) - class532.field7746) + field9943[3], (byte)112);
                                 class186.field2813 = false;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = 0;
                        }

                        while(true) {
                           label619: {
                              int var18 = var10000;
                              int var19;
                              if (var1) {
                                 var19 = 0;
                                 if (var1) {
                                    class212.method1806(var19, var18, var17, 123);
                                    ++var19;
                                 }
                              } else {
                                 if (class209.field3112 <= var18) {
                                    break label619;
                                 }

                                 var19 = 0;
                                 if (var1) {
                                    class212.method1806(var19, var18, var17, 123);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(~var19 > ~class1.field3) {
                                    class212.method1806(var19, var18, var17, 123);
                                    ++var19;
                                 }

                                 if (!var1) {
                                    ++var18;
                                    if (class209.field3112 <= var18) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1) {
                                       class212.method1806(var19, var18, var17, 123);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (~var17 <= -5) {
                              class158.method1443(512);
                              class743.method5393(4);
                              class140.method1310(-1);
                              class377.method2948((byte)-102);
                              var10000 = arg0 ^ 9770;
                              if (!var1) {
                                 class348.method2686(var10000);
                                 if (class123.field1971 != null && class361.field5404 != null && ~class376.field5588 == -12) {
                                    ++class153.field2442;
                                    var20 = class549.method4093((byte)-113, class292.field4065, class126.field2108);
                                    var20.field7859.method3540(1057001181, arg0 + 898075919);
                                    class740.method5332(var20, (byte)77);
                                 }

                                 if (~class124.field2049 == -1) {
                                    var21 = (-(class209.field3112 >> 4) + class36.field883) / 8;
                                    var22 = (class36.field883 - -(class209.field3112 >> 4)) / 8;
                                    var23 = (-(class1.field3 >> 4) + class375.field5579) / 8;
                                    var24 = (class375.field5579 - -(class1.field3 >> 4)) / 8;
                                    var25 = var21 - 1;
                                    if (var1 || ~var25 >= ~(var22 - -1)) {
                                       do {
                                          var26 = var23 + -1;
                                          if (var1) {
                                             if (~var21 >= ~var25) {
                                                if (~var22 <= ~var25) {
                                                   if (var23 <= var26) {
                                                      if (~var24 > ~var26) {
                                                         class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                         class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                      class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                   class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             } else {
                                                class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(~var26 >= ~(var24 + 1)) {
                                                if (~var21 >= ~var25) {
                                                   if (~var22 <= ~var25) {
                                                      if (var23 <= var26) {
                                                         if (~var24 > ~var26) {
                                                            class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                            class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                         class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                      class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7506.method1327(true, "m" + var25 + "_" + var26);
                                                   class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                                   ++var26;
                                                }
                                             }

                                             if (!var1) {
                                                ++var25;
                                                break;
                                             }

                                             class515.field7506.method1327(true, "l" + var25 + "_" + var26);
                                             ++var26;
                                          }
                                       } while(~var25 >= ~(var22 - -1));
                                    }
                                 }

                                 label870: {
                                    if (class376.field5588 == 4) {
                                       class645.method4735(3, -128);
                                       if (!var1) {
                                          break label870;
                                       }
                                    }

                                    if (~class376.field5588 != -9) {
                                       class645.method4735(10, -106);
                                       if (class361.field5404 == null) {
                                          break label870;
                                       }

                                       var27 = class549.method4093((byte)-113, class270.field3825, class126.field2108);
                                       class740.method5332(var27, (byte)77);
                                       if (!var1) {
                                          break label870;
                                       }
                                    }

                                    class645.method4735(7, -123);
                                 }

                                 class205.method1743((byte)-54);
                                 class743.method5393(arg0 + 3);
                                 class179.method1590((byte)123);
                                 class186.field2818 = true;
                                 if (class186.field2813) {
                                    class622.method4561(field9943[4] + (class57.method650(118) - class532.field7746) + field9943[3], (byte)112);
                                    class186.field2813 = false;
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
            } else if (class205.field3058[var3] != -1 && class756.field10978[var3] == null) {
               class756.field10978[var3] = class515.field7506.method1347((byte)123, class205.field3058[var3], 0);
               if (class756.field10978[var3] == null) {
                  ++class381.field5649;
                  var2 = false;
               }
            }

            if (~class213.field3183[var3] != 0 && class245.field3526[var3] == null) {
               class245.field3526[var3] = class515.field7506.method1317(0, class213.field3183[var3], 0, class487.field7079[var3]);
               if (class245.field3526[var3] == null) {
                  var2 = false;
                  ++class381.field5649;
               }
            }

            if (class131.field2180[var3] != -1 && class360.field5391[var3] == null) {
               class360.field5391[var3] = class515.field7506.method1347((byte)125, class131.field2180[var3], 0);
               if (class360.field5391[var3] == null) {
                  var2 = false;
                  ++class381.field5649;
               }
            }

            if (class631.field9200[var3] != -1 && class719.field10376[var3] == null) {
               class719.field10376[var3] = class515.field7506.method1347((byte)126, class631.field9200[var3], 0);
               if (class719.field10376[var3] == null) {
                  ++class381.field5649;
                  var2 = false;
               }
            }

            if (class629.field9178 != null && class64.field1171[var3] == null && ~class629.field9178[var3] != 0) {
               class64.field1171[var3] = class515.field7506.method1317(0, class629.field9178[var3], 0, class487.field7079[var3]);
               if (class64.field1171[var3] == null) {
                  ++class381.field5649;
                  var2 = false;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field9943[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "(I)V",
      line = 480
   )
   public static void method4947(int arg0) {
      try {
         if (arg0 != -1303861276) {
            method4946(-98);
         }

         field9934 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9943[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(B)Lqg;",
      line = 493
   )
   public final class485 method672(byte arg0) {
      try {
         if (arg0 != 83) {
            return null;
         } else {
            ++field9926;
            return class318.field4600;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9943[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Lfk;Lqda;IIIIIIIIII)V",
      line = 524
   )
   public class677(String arg0, class678 arg1, class112 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field9936 = arg7;
         this.field9942 = arg3;
         this.field9931 = arg6;
         this.field9941 = arg1;
         this.field9928 = arg8;
         this.field9924 = arg4;
         this.field9925 = arg0;
         this.field9939 = arg11;
         this.field9933 = arg12;
         this.field9937 = arg2;
         this.field9938 = arg5;
         this.field9940 = arg9;
         this.field9927 = arg10;
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field9943[0] + (arg0 != null ? field9943[1] : field9943[2]) + ',' + (arg1 != null ? field9943[1] : field9943[2]) + ',' + (arg2 != null ? field9943[1] : field9943[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4948(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4949(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
