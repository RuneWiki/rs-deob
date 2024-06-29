import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class745 {
   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10876 = new String[]{method5401(method5400("\"=Dx\b")), method5401(method5400("\"=D}\b")), method5401(method5400("(`D\u0012]")), method5401(method5400("=;\u0006P")), method5401(method5400("\"=D\u007f\b")), method5401(method5400("\"=D~\b")), method5401(method5400("\f=\u001e]T:-\u000fPE>+\u0004HS")), method5401(method5400("\u0007!\u0005W\u001as")), method5401(method5400("\"=Dy\b")), method5401(method5400("o,\u0018\u0002\bb~Z\u0019\t")), method5401(method5400(">="))};
   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field10870 = new int[1];
   @OriginalMember(
      owner = "client!qs",
      name = "e",
      descriptor = "I"
   )
   public static int field10875 = 0;
   @OriginalMember(
      owner = "client!qs",
      name = "c",
      descriptor = "I"
   )
   public static int field10871;
   @OriginalMember(
      owner = "client!qs",
      name = "f",
      descriptor = "I"
   )
   public static int field10872;
   @OriginalMember(
      owner = "client!qs",
      name = "d",
      descriptor = "I"
   )
   public static int field10873;
   @OriginalMember(
      owner = "client!qs",
      name = "b",
      descriptor = "I"
   )
   public static int field10874;

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5395(boolean arg0) {
      boolean var1 = client.field1481;

      try {
         ++field10872;
         class614.method4526(-2514, false);
         class700.field10258 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1) {
            if (class141.field1781[var3] != -1 && class772.field11242[var3] == null) {
               class772.field11242[var3] = class657.field9803.method2697(0, class141.field1781[var3], !arg0);
               if (class772.field11242[var3] == null) {
                  ++class700.field10258;
                  var2 = false;
               }
            }

            if (~class708.field10405[var3] != 0 && class123.field1614[var3] == null) {
               class123.field1614[var3] = class657.field9803.method2710(class288.field3982[var3], (byte)52, class708.field10405[var3], 0);
               if (class123.field1614[var3] == null) {
                  var2 = false;
                  ++class700.field10258;
               }
            }

            if (~class455.field6280[var3] != 0 && class640.field9381[var3] == null) {
               class640.field9381[var3] = class657.field9803.method2697(0, class455.field6280[var3], false);
               if (class640.field9381[var3] == null) {
                  ++class700.field10258;
                  var2 = false;
               }
            }

            if (class118.field1543[var3] != -1 && class359.field5005[var3] == null) {
               class359.field5005[var3] = class657.field9803.method2697(0, class118.field1543[var3], !arg0);
               if (class359.field5005[var3] == null) {
                  var2 = false;
                  ++class700.field10258;
               }
            }

            if (class108.field1437 != null && class640.field9391[var3] == null && class108.field1437[var3] != -1) {
               class640.field9391[var3] = class657.field9803.method2710(class288.field3982[var3], (byte)52, class108.field1437[var3], 0);
               if (class640.field9391[var3] == null) {
                  var2 = false;
                  ++class700.field10258;
               }
            }

            ++var3;
         }

         while(true) {
            if (class772.field11242.length <= var3) {
               if (!var1) {
                  if (class795.field11625 == null) {
                     label952: {
                        if (class454.field6258 == null || !class487.field6798.method2705(class454.field6258.field1584 + field10876[6], 113)) {
                           class795.field11625 = new class601(0);
                           if (!var1) {
                              break label952;
                           }
                        }

                        if (class487.field6798.method2696(255, class454.field6258.field1584 + field10876[6])) {
                           class795.field11625 = class334.method2653(-21863, class487.field6798, class743.field10861, class454.field6258.field1584 + field10876[6]);
                           if (!var1) {
                              break label952;
                           }
                        }

                        ++class700.field10258;
                        var2 = false;
                     }
                  }

                  if (!var2) {
                     class779.field11364 = 1;
                     return;
                  }

                  class566.field8338 = 0;
                  boolean var4 = true;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (var1) {
                     var6 = class123.field1614[var5];
                     if (var6 != null) {
                        var7 = (class383.field5321[var5] >> 8) * 64 - class539.field7889;
                        var8 = (255 & class383.field5321[var5]) * 64 + -class353.field4940;
                        if (~class493.field6885 != -1) {
                           var7 = 10;
                           var8 = 10;
                        }

                        var4 &= class136.method1139(class273.field3491, var8, -123, var7, var6, class211.field2689);
                     }

                     var9 = class359.field5005[var5];
                     if (var9 != null) {
                        var10 = (class383.field5321[var5] >> 8) * 64 - class539.field7889;
                        var11 = (class383.field5321[var5] & 255) * 64 - class353.field4940;
                        if (class493.field6885 != 0) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class136.method1139(class273.field3491, var11, -125, var10, var9, class211.field2689);
                     }

                     ++var5;
                  }

                  while(var5 < class772.field11242.length) {
                     var6 = class123.field1614[var5];
                     if (var6 != null) {
                        var7 = (class383.field5321[var5] >> 8) * 64 - class539.field7889;
                        var8 = (255 & class383.field5321[var5]) * 64 + -class353.field4940;
                        if (~class493.field6885 != -1) {
                           var7 = 10;
                           var8 = 10;
                        }

                        var4 &= class136.method1139(class273.field3491, var8, -123, var7, var6, class211.field2689);
                     }

                     var9 = class359.field5005[var5];
                     if (var9 != null) {
                        var10 = (class383.field5321[var5] >> 8) * 64 - class539.field7889;
                        var11 = (class383.field5321[var5] & 255) * 64 - class353.field4940;
                        if (class493.field6885 != 0) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class136.method1139(class273.field3491, var11, -125, var10, var9, class211.field2689);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class779.field11364 = 2;
                     return;
                  }

                  if (class779.field11364 != 0) {
                     class120.method1058(true, -570417178, class629.field9294, class689.field10134, class606.field8915.method4490(class782.field11389, -16777216) + field10876[9], class209.field2657);
                  }

                  class161.method1344((byte)-104);
                  class230.method1829((byte)58);
                  class380.method3013(-97);
                  boolean var12 = false;
                  if (class629.field9294.method408() && class757.field11093.field11005.method5083(-18033) == 2) {
                     int var13 = 0;
                     if (var1 || ~var13 > ~class772.field11242.length) {
                        do {
                           if (class359.field5005[var13] == null) {
                              if (class640.field9381[var13] != null) {
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
                        } while(~var13 > ~class772.field11242.length);
                     }
                  }

                  int var14;
                  label718: {
                     if (~class757.field11093.field10999.method3532(-18033) != -2) {
                        var14 = class262.field3327[class562.field8268];
                        if (!var1) {
                           break label718;
                        }
                     }

                     var14 = class590.field8696[class562.field8268];
                  }

                  if (class629.field9294.method455()) {
                     ++var14;
                  }

                  label691: {
                     class28.method224(class629.field9294, class567.field8349, 9, 4, class273.field3491, class211.field2689, var14, var12, ~class629.field9294.method487() < -1);
                     class259.method2088(class203.field2585);
                     if (~class203.field2585 != -1) {
                        class704.method5115(class59.field770);
                        if (!var1) {
                           break label691;
                        }
                     }

                     class704.method5115((class447)null);
                  }

                  int var15 = 0;
                  if (var1) {
                     class324.field4438[var15].method2596(9128);
                     ++var15;
                  }

                  while(true) {
                     while(~var15 > -5) {
                        class324.field4438[var15].method2596(9128);
                        ++var15;
                     }

                     class90.method835(-118);
                     class768.method5549(false, -111);
                     class44.method333((byte)46);
                     class676.field9996 = null;
                     class565.field8318 = false;
                     class161.method1344((byte)-104);
                     System.gc();
                     class614.method4526(-2514, true);
                     class366.method2888(84);
                     class159.field2039 = class757.field11093.field11003.method5662(-18033);
                     if (!var1) {
                        label684: {
                           class89.field1208 = class578.field8565 >= 96;
                           class412.field5662 = ~class757.field11093.field11005.method5083(-18033) == -3;
                           class673.field9971 = ~class757.field11093.field11016.method1496(-18033) == -2;
                           class404.field5546 = class757.field11093.field10978.method2092(-18033) != 1 ? class600.field8858 : -1;
                           class523.field7338 = class757.field11093.field10967.method1752(-18033) == 1;
                           class264.field3344 = ~class757.field11093.field10973.method5420(-18033) == -2;
                           class456.field6286 = new class621(4, class273.field3491, class211.field2689, false);
                           if (~class493.field6885 == -1) {
                              class390.method3084(-121, class456.field6286, class772.field11242);
                              if (!var1) {
                                 break label684;
                              }
                           }

                           class234.method1863(class456.field6286, -47, class772.field11242);
                        }

                        class661.method4836((byte)96, class273.field3491 >> 4, class211.field2689 >> 4);
                        class592.method4411(124);
                        if (var12) {
                           label677: {
                              class665.method4861(true);
                              class57.field757 = new class621(1, class273.field3491, class211.field2689, true);
                              if (~class493.field6885 != -1) {
                                 class234.method1863(class57.field757, 95, class640.field9381);
                                 class614.method4526(-2514, true);
                                 if (!var1) {
                                    break label677;
                                 }
                              }

                              class390.method3084(-123, class57.field757, class640.field9381);
                              class614.method4526(-2514, true);
                           }

                           class57.field757.method3070(0, 75, class456.field6286.field5371[0]);
                           class57.field757.method3069((class327[])null, class629.field9294, !arg0, (int[][][])null);
                           class665.method4861(false);
                        }

                        label671: {
                           class456.field6286.method3069(class324.field4438, class629.field9294, false, !var12 ? null : class57.field757.field5371);
                           if (~class493.field6885 == -1) {
                              class614.method4526(-2514, true);
                              class173.method1487(class456.field6286, (byte)-60, class123.field1614);
                              if (class640.field9391 == null) {
                                 break label671;
                              }

                              class66.method612(10238);
                              if (!var1) {
                                 break label671;
                              }
                           }

                           class614.method4526(-2514, true);
                           class3.method21((byte)-98, class123.field1614, class456.field6286);
                        }

                        class230.method1829((byte)58);
                        if (~class578.field8565 > -97) {
                           class640.method4708(70);
                        }

                        class614.method4526(-2514, true);
                        class456.field6286.method3080(var12 ? class569.field8364[0] : null, (class423)null, (byte)-18, class629.field9294);
                        class456.field6286.method4599(false, (byte)121, class629.field9294);
                        class614.method4526(-2514, arg0);
                        if (var12) {
                           label659: {
                              class665.method4861(true);
                              class614.method4526(-2514, true);
                              if (class493.field6885 == 0) {
                                 class173.method1487(class57.field757, (byte)-109, class359.field5005);
                                 if (!var1) {
                                    break label659;
                                 }
                              }

                              class3.method21((byte)-98, class359.field5005, class57.field757);
                           }

                           class230.method1829((byte)58);
                           class614.method4526(-2514, true);
                           class57.field757.method3080((class423)null, class373.field5223[0], (byte)-34, class629.field9294);
                           class57.field757.method4599(true, (byte)-119, class629.field9294);
                           class614.method4526(-2514, true);
                           class665.method4861(false);
                        }

                        class213.method1744(136);
                        int var16 = class456.field6286.field9184;
                        if (~var16 < ~class674.field9984) {
                           var16 = class674.field9984;
                        }

                        if (var16 < class674.field9984 + -1) {
                           var16 = class674.field9984 + -1;
                        }

                        label412: {
                           if (~class757.field11093.field10978.method2092(-18033) == -1) {
                              class431.method3332(var16);
                              if (!var1) {
                                 break label412;
                              }
                           }

                           class431.method3332(0);
                        }

                        int var17 = 0;
                        byte var10000;
                        class702 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class702 var27;
                        if (var1) {
                           var10000 = 0;
                        } else if (var17 >= 4) {
                           class6.method50((byte)-79);
                           class161.method1344((byte)-104);
                           class393.method3102((byte)-68);
                           class230.method1829((byte)58);
                           var10000 = -88;
                           if (!var1) {
                              class84.method804((byte)-88);
                              if (class570.field8391 != null && class387.field5365.field8760 != null && ~class157.field2022 == -13) {
                                 ++class234.field2905;
                                 var20 = class19.method142(class387.field5365.field8765, class785.field11470, (byte)-106);
                                 var20.field10264.method649((byte)-124, 1057001181);
                                 class387.field5365.method4423(var20, (byte)99);
                              }

                              if (~class493.field6885 == -1) {
                                 var21 = (-(class273.field3491 >> 4) + class751.field10959) / 8;
                                 var22 = ((class273.field3491 >> 4) + class751.field10959) / 8;
                                 var23 = (class703.field10273 - (class211.field2689 >> 4)) / 8;
                                 var24 = ((class211.field2689 >> 4) + class703.field10273) / 8;
                                 var25 = var21 + -1;
                                 if (var1 || var22 + 1 >= var25) {
                                    do {
                                       var26 = var23 + -1;
                                       if (var1) {
                                          if (~var25 <= ~var21) {
                                             if (~var22 <= ~var25) {
                                                if (var23 <= var26) {
                                                   if (~var24 > ~var26) {
                                                      class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                      class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                   class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                   ++var26;
                                                }
                                             } else {
                                                class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                ++var26;
                                             }
                                          } else {
                                             class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                             class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(~var26 >= ~(var24 + 1)) {
                                             if (~var25 <= ~var21) {
                                                if (~var22 <= ~var25) {
                                                   if (var23 <= var26) {
                                                      if (~var24 > ~var26) {
                                                         class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                         class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                      class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                   class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                   ++var26;
                                                }
                                             } else {
                                                class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                ++var26;
                                             }
                                          }

                                          if (!var1) {
                                             ++var25;
                                             break;
                                          }

                                          class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                          ++var26;
                                       }
                                    } while(var22 + 1 >= var25);
                                 }
                              }

                              label906: {
                                 if (~class157.field2022 == -5) {
                                    class577.method4324((byte)-125, 3);
                                    if (!var1) {
                                       break label906;
                                    }
                                 }

                                 if (~class157.field2022 != -9) {
                                    if (~class157.field2022 == -11) {
                                       class577.method4324((byte)-127, 9);
                                       if (!var1) {
                                          break label906;
                                       }
                                    }

                                    class577.method4324((byte)-124, 11);
                                    if (class387.field5365.field8760 == null) {
                                       break label906;
                                    }

                                    var27 = class19.method142(class387.field5365.field8765, class779.field11358, (byte)-128);
                                    class387.field5365.method4423(var27, (byte)109);
                                    if (!var1) {
                                       break label906;
                                    }
                                 }

                                 class577.method4324((byte)-125, 7);
                              }

                              class400.method3140(arg0);
                              class161.method1344((byte)-104);
                              class67.method669(100);
                              class323.field4420 = true;
                              if (class359.field5013) {
                                 class586.method4369(field10876[7] + (class163.method1353(-119) + -class716.field10512) + field10876[10], 96);
                                 class359.field5013 = false;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = 0;
                        }

                        while(true) {
                           label649: {
                              int var18 = var10000;
                              int var19;
                              if (var1) {
                                 var19 = 0;
                                 if (var1) {
                                    class19.method144(var18, var17, var19, true);
                                    ++var19;
                                 }
                              } else {
                                 if (~var18 <= ~class273.field3491) {
                                    break label649;
                                 }

                                 var19 = 0;
                                 if (var1) {
                                    class19.method144(var18, var17, var19, true);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(~class211.field2689 < ~var19) {
                                    class19.method144(var18, var17, var19, true);
                                    ++var19;
                                 }

                                 if (!var1) {
                                    ++var18;
                                    if (~var18 <= ~class273.field3491) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1) {
                                       class19.method144(var18, var17, var19, true);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (var17 >= 4) {
                              class6.method50((byte)-79);
                              class161.method1344((byte)-104);
                              class393.method3102((byte)-68);
                              class230.method1829((byte)58);
                              var10000 = -88;
                              if (!var1) {
                                 class84.method804((byte)-88);
                                 if (class570.field8391 != null && class387.field5365.field8760 != null && ~class157.field2022 == -13) {
                                    ++class234.field2905;
                                    var20 = class19.method142(class387.field5365.field8765, class785.field11470, (byte)-106);
                                    var20.field10264.method649((byte)-124, 1057001181);
                                    class387.field5365.method4423(var20, (byte)99);
                                 }

                                 if (~class493.field6885 == -1) {
                                    var21 = (-(class273.field3491 >> 4) + class751.field10959) / 8;
                                    var22 = ((class273.field3491 >> 4) + class751.field10959) / 8;
                                    var23 = (class703.field10273 - (class211.field2689 >> 4)) / 8;
                                    var24 = ((class211.field2689 >> 4) + class703.field10273) / 8;
                                    var25 = var21 + -1;
                                    if (var1 || var22 + 1 >= var25) {
                                       do {
                                          var26 = var23 + -1;
                                          if (var1) {
                                             if (~var25 <= ~var21) {
                                                if (~var22 <= ~var25) {
                                                   if (var23 <= var26) {
                                                      if (~var24 > ~var26) {
                                                         class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                         class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                      class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                   class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                   ++var26;
                                                }
                                             } else {
                                                class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(~var26 >= ~(var24 + 1)) {
                                                if (~var25 <= ~var21) {
                                                   if (~var22 <= ~var25) {
                                                      if (var23 <= var26) {
                                                         if (~var24 > ~var26) {
                                                            class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                            class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                         class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                      class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class657.field9803.method2687("m" + var25 + "_" + var26, (byte)114);
                                                   class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                                   ++var26;
                                                }
                                             }

                                             if (!var1) {
                                                ++var25;
                                                break;
                                             }

                                             class657.field9803.method2687("l" + var25 + "_" + var26, (byte)96);
                                             ++var26;
                                          }
                                       } while(var22 + 1 >= var25);
                                    }
                                 }

                                 label922: {
                                    if (~class157.field2022 == -5) {
                                       class577.method4324((byte)-125, 3);
                                       if (!var1) {
                                          break label922;
                                       }
                                    }

                                    if (~class157.field2022 != -9) {
                                       if (~class157.field2022 == -11) {
                                          class577.method4324((byte)-127, 9);
                                          if (!var1) {
                                             break label922;
                                          }
                                       }

                                       class577.method4324((byte)-124, 11);
                                       if (class387.field5365.field8760 == null) {
                                          break label922;
                                       }

                                       var27 = class19.method142(class387.field5365.field8765, class779.field11358, (byte)-128);
                                       class387.field5365.method4423(var27, (byte)109);
                                       if (!var1) {
                                          break label922;
                                       }
                                    }

                                    class577.method4324((byte)-125, 7);
                                 }

                                 class400.method3140(arg0);
                                 class161.method1344((byte)-104);
                                 class67.method669(100);
                                 class323.field4420 = true;
                                 if (class359.field5013) {
                                    class586.method4369(field10876[7] + (class163.method1353(-119) + -class716.field10512) + field10876[10], 96);
                                    class359.field5013 = false;
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
            } else if (class141.field1781[var3] != -1 && class772.field11242[var3] == null) {
               class772.field11242[var3] = class657.field9803.method2697(0, class141.field1781[var3], !arg0);
               if (class772.field11242[var3] == null) {
                  ++class700.field10258;
                  var2 = false;
               }
            }

            if (~class708.field10405[var3] != 0 && class123.field1614[var3] == null) {
               class123.field1614[var3] = class657.field9803.method2710(class288.field3982[var3], (byte)52, class708.field10405[var3], 0);
               if (class123.field1614[var3] == null) {
                  var2 = false;
                  ++class700.field10258;
               }
            }

            if (~class455.field6280[var3] != 0 && class640.field9381[var3] == null) {
               class640.field9381[var3] = class657.field9803.method2697(0, class455.field6280[var3], false);
               if (class640.field9381[var3] == null) {
                  ++class700.field10258;
                  var2 = false;
               }
            }

            if (class118.field1543[var3] != -1 && class359.field5005[var3] == null) {
               class359.field5005[var3] = class657.field9803.method2697(0, class118.field1543[var3], !arg0);
               if (class359.field5005[var3] == null) {
                  var2 = false;
                  ++class700.field10258;
               }
            }

            if (class108.field1437 != null && class640.field9391[var3] == null && class108.field1437[var3] != -1) {
               class640.field9391[var3] = class657.field9803.method2710(class288.field3982[var3], (byte)52, class108.field1437[var3], 0);
               if (class640.field9391[var3] == null) {
                  var2 = false;
                  ++class700.field10258;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class93.method866(var29, field10876[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method5396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         ++field10874;
         class560 var8 = (class560)class94.field1271.method4639(-78);
         int var10000;
         if (var7) {
            var10000 = ~var8.field8203;
         } else if (var8 == null) {
            var10000 = arg5;
            if (!var7) {
               if (arg5 != 0) {
                  field10870 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = ~var8.field8203;
         }

         while(true) {
            label58: {
               if (var10000 >= ~class413.field5678) {
                  var8.method797((byte)105);
                  if (!var7) {
                     var8 = (class560)class94.field1271.method4636((byte)106);
                     break label58;
                  }
               }

               class59.method539(arg6, arg5 ^ 862696096, arg1, arg3 >> 1, (var8.field8204 << 9) + 256, var8.field8198 * 2, var8.field8202, (var8.field8197 << 9) + 256, arg0 >> 1);
               class98.field1306.method3421(0, class489.field6820[1] + arg2, class489.field6820[0] + arg4, 8364, var8.field8205, var8.field8201 | -16777216);
               var8 = (class560)class94.field1271.method4636((byte)106);
            }

            if (var8 == null) {
               var10000 = arg5;
               if (!var7) {
                  if (arg5 != 0) {
                     field10870 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = ~var8.field8203;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field10876[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Ljava/lang/String;ZB)V"
   )
   public static final void method5397(String arg0, boolean arg1, byte arg2) {
      boolean var3 = client.field1481;

      try {
         ++field10871;
         if (arg0 != null) {
            if (~class84.field1166 <= -101) {
               class632.method4663(class606.field8942.method4490(class782.field11389, arg2 ^ -16777182), 4, -121);
            } else {
               String var4 = class464.method3533((byte)87, arg0);
               if (var4 != null) {
                  byte var10000;
                  label99: {
                     int var5 = 0;
                     if (var3) {
                        var10000 = 87;
                     } else if (var5 >= class84.field1166) {
                        var10000 = 0;
                        if (!var3) {
                           break label99;
                        }
                     } else {
                        var10000 = 87;
                     }

                     while(true) {
                        String var6 = class464.method3533(var10000, class670.field9923[var5]);
                        if (var6 != null && var6.equals(var4)) {
                           class632.method4663(arg0 + class606.field8943.method4490(class782.field11389, -16777216), 4, arg2 + -156);
                           return;
                        }

                        if (class211.field2685[var5] != null) {
                           String var7 = class464.method3533((byte)87, class211.field2685[var5]);
                           if (var7 != null && var7.equals(var4)) {
                              class632.method4663(arg0 + class606.field8943.method4490(class782.field11389, -16777216), 4, -123);
                              return;
                           }
                        }

                        ++var5;
                        if (var5 >= class84.field1166) {
                           var10000 = 0;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = 87;
                        }
                     }
                  }

                  int var8 = var10000;
                  class594 var11;
                  class702 var12;
                  if (var3) {
                     var10000 = 87;
                  } else if (var8 >= class202.field2575) {
                     var10000 = class464.method3533((byte)87, class204.field2593.field11422).equals(var4);
                     if (!var3) {
                        if (var10000 != 0) {
                           class632.method4663(class606.field8945.method4490(class782.field11389, -16777216), 4, -112);
                           return;
                        }

                        ++class25.field390;
                        var11 = class145.method1177((byte)112);
                        var12 = class19.method142(var11.field8765, class666.field9869, (byte)-113);
                        var12.field10264.method593(class398.method3129(arg2 ^ 46, arg0) + 1, 867770704);
                        var12.field10264.method595(-15010, arg0);
                        var12.field10264.method593(!arg1 ? 0 : 1, arg2 + 867770670);
                        var11.method4423(var12, (byte)111);
                        if (arg2 != 34) {
                           method5395(false);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = 87;
                  }

                  while(true) {
                     String var9 = class464.method3533(var10000, class35.field495[var8]);
                     if (var9 != null && var9.equals(var4)) {
                        class632.method4663(class606.field8948.method4490(class782.field11389, -16777216) + arg0 + class606.field8949.method4490(class782.field11389, -16777216), 4, arg2 ^ -93);
                        return;
                     }

                     if (class193.field2456[var8] != null) {
                        String var10 = class464.method3533((byte)87, class193.field2456[var8]);
                        if (var10 != null && var10.equals(var4)) {
                           class632.method4663(class606.field8948.method4490(class782.field11389, arg2 + -16777250) + arg0 + class606.field8949.method4490(class782.field11389, -16777216), 4, -115);
                           return;
                        }
                     }

                     ++var8;
                     if (var8 >= class202.field2575) {
                        var10000 = class464.method3533((byte)87, class204.field2593.field11422).equals(var4);
                        if (!var3) {
                           if (var10000 != 0) {
                              class632.method4663(class606.field8945.method4490(class782.field11389, -16777216), 4, -112);
                              return;
                           }

                           ++class25.field390;
                           var11 = class145.method1177((byte)112);
                           var12 = class19.method142(var11.field8765, class666.field9869, (byte)-113);
                           var12.field10264.method593(class398.method3129(arg2 ^ 46, arg0) + 1, 867770704);
                           var12.field10264.method595(-15010, arg0);
                           var12.field10264.method593(!arg1 ? 0 : 1, arg2 + 867770670);
                           var11.method4423(var12, (byte)111);
                           if (arg2 != 34) {
                              method5395(false);
                              return;
                           }

                           return;
                        }
                     } else {
                        var10000 = 87;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field10876[5] + (arg0 != null ? field10876[2] : field10876[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5398(int arg0) {
      try {
         if (arg0 != 4) {
            field10870 = null;
         }

         field10870 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10876[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(ILww;II)Lls;"
   )
   public static final class167 method5399(int arg0, class339 arg1, int arg2, int arg3) {
      try {
         if (arg0 != 64) {
            return null;
         } else {
            ++field10873;
            byte[] var4 = arg1.method2697(arg3, arg2, false);
            return var4 == null ? null : new class167(var4);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10876[1] + arg0 + ',' + (arg1 != null ? field10876[2] : field10876[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5400(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5401(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
