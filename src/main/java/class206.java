import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class206 {
   @OriginalMember(
      owner = "client!bw",
      name = "i",
      descriptor = "Z"
   )
   public boolean field3128;
   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3137 = new String[]{method1802(method1801("rd)%?")), method1802(method1801("k=)Nj")), method1802(method1801("rd)&?")), method1802(method1801("~fk\f")), method1802(method1801("rd)#?")), method1802(method1801("rd)\\~~zs^?")), method1802(method1801("D|h\u000b-0")), method1802(method1801(",qu^?!#7E>")), method1802(method1801("}`")), method1802(method1801("O`s\u0001cypb\fr}vi\u0014d")), method1802(method1801("rd)$?")), method1802(method1801("rd)!?")), method1802(method1801("rd)\"?"))};
   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field3126 = false;
   @OriginalMember(
      owner = "client!bw",
      name = "g",
      descriptor = "Luk;"
   )
   public static class498 field3125 = new class498(28, 0);
   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "I"
   )
   public static int field3123;
   @OriginalMember(
      owner = "client!bw",
      name = "d",
      descriptor = "I"
   )
   public static int field3124;
   @OriginalMember(
      owner = "client!bw",
      name = "e",
      descriptor = "I"
   )
   public static int field3127;
   @OriginalMember(
      owner = "client!bw",
      name = "h",
      descriptor = "I"
   )
   public static int field3129;
   @OriginalMember(
      owner = "client!bw",
      name = "f",
      descriptor = "I"
   )
   public static int field3134;
   @OriginalMember(
      owner = "client!bw",
      name = "n",
      descriptor = "I"
   )
   public static int field3136;
   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "Lgfa;"
   )
   public class631 field3131;
   @OriginalMember(
      owner = "client!bw",
      name = "l",
      descriptor = "Lgfa;"
   )
   public class631 field3132;
   @OriginalMember(
      owner = "client!bw",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field3130;
   @OriginalMember(
      owner = "client!bw",
      name = "m",
      descriptor = "Z"
   )
   public boolean field3135;
   @OriginalMember(
      owner = "client!bw",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field3133;

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method1795(byte arg0) {
      try {
         field3133 = null;
         field3125 = null;
         if (arg0 != 94) {
            field3125 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3137[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(I)Z",
      line = 22
   )
   public final boolean method1796(int arg0) {
      try {
         if (arg0 != -21667) {
            method1797(false, (byte)95);
         }

         ++field3124;
         return this.field3135 && !this.field3128;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3137[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(ZB)Z",
      line = 36
   )
   public static final boolean method1797(boolean arg0, byte arg1) {
      try {
         ++field3127;
         boolean var2 = class351.field5356.method617();
         if (arg1 <= 50) {
            method1798(-51);
         }

         if (arg0 != !var2) {
            return true;
         } else {
            label49: {
               if (!arg0) {
                  class351.field5356.method646();
                  if (!client.field1786) {
                     break label49;
                  }
               }

               if (!class351.field5356.method668()) {
                  arg0 = false;
               }
            }

            if (!arg0 != !var2) {
               class687.field10213.method299(-17, !arg0 ? 0 : 1, class687.field10213.field535);
               class388.method3135(0);
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3137[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(I)V",
      line = 75
   )
   public static final void method1798(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field3123;
         class337.method2749((byte)106, false);
         class306.field4786 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1) {
            if (~class614.field8918[var3] != 0 && class332.field5034[var3] == null) {
               class332.field5034[var3] = class742.field11031.method5017(class614.field8918[var3], 0, (byte)71);
               if (class332.field5034[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (class104.field1448[var3] != -1 && class689.field10244[var3] == null) {
               class689.field10244[var3] = class742.field11031.method5015((byte)126, class104.field1448[var3], 0, class398.field6243[var3]);
               if (class689.field10244[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (class109.field1510[var3] != -1 && class341.field5192[var3] == null) {
               class341.field5192[var3] = class742.field11031.method5017(class109.field1510[var3], 0, (byte)71);
               if (class341.field5192[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (~class147.field2216[var3] != 0 && class511.field7815[var3] == null) {
               class511.field7815[var3] = class742.field11031.method5017(class147.field2216[var3], 0, (byte)71);
               if (class511.field7815[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (class190.field2943 != null && class432.field6654[var3] == null && ~class190.field2943[var3] != 0) {
               class432.field6654[var3] = class742.field11031.method5015((byte)-49, class190.field2943[var3], 0, class398.field6243[var3]);
               if (class432.field6654[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            ++var3;
         }

         while(true) {
            if (~var3 <= ~class332.field5034.length) {
               if (!var1) {
                  if (class320.field4908 == null) {
                     label773: {
                        if (class117.field1571 != null && class293.field4641.method5011(class117.field1571.field2965 + field3137[9], true)) {
                           if (class293.field4641.method5009(class117.field1571.field2965 + field3137[9], 29704)) {
                              class320.field4908 = class361.method2954(class117.field1571.field2965 + field3137[9], class373.field5773, class293.field4641, 0);
                              if (!var1) {
                                 break label773;
                              }
                           }

                           ++class306.field4786;
                           var2 = false;
                           if (!var1) {
                              break label773;
                           }
                        }

                        class320.field4908 = new class794(0);
                     }
                  }

                  if (!var2) {
                     class13.field163 = 1;
                     return;
                  }

                  class338.field5181 = 0;
                  boolean var4 = true;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (arg0 != 6453) {
                     method1797(true, (byte)80);
                     if (var1) {
                        var6 = class689.field10244[var5];
                        if (var6 != null) {
                           var7 = (class62.field796[var5] >> 8) * 64 - class120.field1694;
                           var8 = (class62.field796[var5] & 255) * 64 + -class119.field1606;
                           if (class55.field683 != 0) {
                              var7 = 10;
                              var8 = 10;
                           }

                           var4 &= class302.method2529(var7, class513.field7828, class475.field7230, var6, 98, var8);
                        }

                        var9 = class511.field7815[var5];
                        if (var9 != null) {
                           var10 = (class62.field796[var5] >> 8) * 64 + -class120.field1694;
                           var11 = (255 & class62.field796[var5]) * 64 + -class119.field1606;
                           if (~class55.field683 != -1) {
                              var10 = 10;
                              var11 = 10;
                           }

                           var4 &= class302.method2529(var10, class513.field7828, class475.field7230, var9, 102, var11);
                        }

                        ++var5;
                     }
                  }

                  while(var5 < class332.field5034.length) {
                     var6 = class689.field10244[var5];
                     if (var6 != null) {
                        var7 = (class62.field796[var5] >> 8) * 64 - class120.field1694;
                        var8 = (class62.field796[var5] & 255) * 64 + -class119.field1606;
                        if (class55.field683 != 0) {
                           var7 = 10;
                           var8 = 10;
                        }

                        var4 &= class302.method2529(var7, class513.field7828, class475.field7230, var6, 98, var8);
                     }

                     var9 = class511.field7815[var5];
                     if (var9 != null) {
                        var10 = (class62.field796[var5] >> 8) * 64 + -class120.field1694;
                        var11 = (255 & class62.field796[var5]) * 64 + -class119.field1606;
                        if (~class55.field683 != -1) {
                           var10 = 10;
                           var11 = 10;
                        }

                        var4 &= class302.method2529(var10, class513.field7828, class475.field7230, var9, 102, var11);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class13.field163 = 2;
                     return;
                  }

                  if (~class13.field163 != -1) {
                     class255.method2160(class577.field8538, 16, class351.field5356, true, class499.field7600.method3875(class493.field7455, 97) + field3137[7], class564.field8381);
                  }

                  class532.method4095(-60);
                  class600.method4442(-27112);
                  class520.method4016(arg0 ^ 6455);
                  boolean var12 = false;
                  if (class351.field5356.method585() && class687.field10213.field525.method4566(arg0 ^ 480108178) == 2) {
                     int var13 = 0;
                     if (var1 || var13 < class332.field5034.length) {
                        do {
                           if (class511.field7815[var13] == null) {
                              if (class341.field5192[var13] != null) {
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
                        } while(var13 < class332.field5034.length);
                     }
                  }

                  int var14;
                  label702: {
                     if (class687.field10213.field495.method5210(480102311) == 1) {
                        var14 = class620.field9020[class554.field8281];
                        if (!var1) {
                           break label702;
                        }
                     }

                     var14 = class348.field5331[class554.field8281];
                  }

                  if (class351.field5356.method594()) {
                     ++var14;
                  }

                  label675: {
                     class246.method2087(class351.field5356, class387.field6085, 9, 4, class513.field7828, class475.field7230, var14, var12, class351.field5356.method687() > 0);
                     class721.method5334(class400.field6283);
                     if (~class400.field6283 == -1) {
                        class88.method847((class288)null);
                        if (!var1) {
                           break label675;
                        }
                     }

                     class88.method847(class722.field10805);
                  }

                  int var15 = 0;
                  if (var1) {
                     class221.field3326[var15].method3744(arg0 ^ -6469);
                     ++var15;
                  }

                  while(true) {
                     while(~var15 > -5) {
                        class221.field3326[var15].method3744(arg0 ^ -6469);
                        ++var15;
                     }

                     class786.method5705(-127);
                     class498.method3867((byte)31, false);
                     class287.method2394(-6);
                     class570.field8437 = false;
                     class532.method4095(-103);
                     System.gc();
                     class337.method2749((byte)106, true);
                     class523.method4040((byte)102);
                     class265.field4336 = class687.field10213.field498.method5540(480102311);
                     if (!var1) {
                        label668: {
                           class24.field302 = ~class480.field7293 <= -97;
                           class491.field7431 = ~class687.field10213.field525.method4566(480102311) == -3;
                           class730.field10894 = class687.field10213.field513.method4463(480102311) == 1;
                           class736.field10955 = ~class687.field10213.field536.method5531(arg0 ^ 480108178) == -2 ? -1 : class426.field6582;
                           class658.field9836 = ~class687.field10213.field529.method1918(arg0 + 480095858) == -2;
                           class389.field6134 = class687.field10213.field547.method4414(480102311) == 1;
                           class401.field6289 = new class508(4, class513.field7828, class475.field7230, false);
                           if (class55.field683 == 0) {
                              class173.method1591(116, class401.field6289, class332.field5034);
                              if (!var1) {
                                 break label668;
                              }
                           }

                           class625.method4587((byte)79, class332.field5034, class401.field6289);
                        }

                        class36.method260(class475.field7230 >> 4, -32684, class513.field7828 >> 4);
                        class523.method4038(arg0 ^ -6425);
                        if (var12) {
                           label661: {
                              class19.method142(true);
                              class431.field6646 = new class508(1, class513.field7828, class475.field7230, true);
                              if (~class55.field683 == -1) {
                                 class173.method1591(112, class431.field6646, class341.field5192);
                                 class337.method2749((byte)106, true);
                                 if (!var1) {
                                    break label661;
                                 }
                              }

                              class625.method4587((byte)-53, class341.field5192, class431.field6646);
                              class337.method2749((byte)106, true);
                           }

                           class431.field6646.method3231(0, class401.field6289.field6265[0], 1);
                           class431.field6646.method3230(class351.field5356, (class482[])null, false, (int[][][])null);
                           class19.method142(false);
                        }

                        label655: {
                           class401.field6289.method3230(class351.field5356, class221.field3326, false, var12 ? class431.field6646.field6265 : null);
                           if (~class55.field683 != -1) {
                              class337.method2749((byte)106, true);
                              class63.method485(class689.field10244, class401.field6289, 8);
                              if (!var1) {
                                 break label655;
                              }
                           }

                           class337.method2749((byte)106, true);
                           class144.method1307((byte)110, class401.field6289, class689.field10244);
                           if (class432.field6654 != null) {
                              class119.method1088((byte)67);
                           }
                        }

                        class600.method4442(-27112);
                        if (~class480.field7293 > -97) {
                           class37.method268((byte)84);
                        }

                        class337.method2749((byte)106, true);
                        class401.field6289.method3234(var12 ? class190.field2949[0] : null, (class271)null, true, class351.field5356);
                        class401.field6289.method3946(false, class351.field5356, (byte)-35);
                        class337.method2749((byte)106, true);
                        if (var12) {
                           label645: {
                              class19.method142(true);
                              class337.method2749((byte)106, true);
                              if (~class55.field683 != -1) {
                                 class63.method485(class511.field7815, class431.field6646, 8);
                                 if (!var1) {
                                    break label645;
                                 }
                              }

                              class144.method1307((byte)67, class431.field6646, class511.field7815);
                           }

                           class600.method4442(-27112);
                           class337.method2749((byte)106, true);
                           class431.field6646.method3234((class271)null, class96.field1355[0], true, class351.field5356);
                           class431.field6646.method3946(true, class351.field5356, (byte)-35);
                           class337.method2749((byte)106, true);
                           class19.method142(false);
                        }

                        class671.method4944(true);
                        int var16 = class401.field6289.field7784;
                        if (~class464.field7054 > ~var16) {
                           var16 = class464.field7054;
                        }

                        if (class464.field7054 + -1 > var16) {
                           var16 = class464.field7054 + -1;
                        }

                        label398: {
                           if (class687.field10213.field536.method5531(480102311) == 0) {
                              class652.method4733(var16);
                              if (!var1) {
                                 break label398;
                              }
                           }

                           class652.method4733(0);
                        }

                        int var17 = 0;
                        short var10000;
                        class577 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class577 var27;
                        if (var1) {
                           var10000 = 0;
                        } else if (~var17 <= -5) {
                           class462.method3586(255);
                           class532.method4095(-61);
                           class110.method1045(1);
                           class600.method4442(-27112);
                           var10000 = -25930;
                           if (!var1) {
                              class199.method1753(-25930);
                              if (class479.field7289 != null && class510.field7801.field355 != null && ~class342.field5204 == -13) {
                                 ++class699.field10397;
                                 var20 = class218.method1888(class718.field10765, 121, class510.field7801.field361);
                                 var20.field8531.method2849(1057001181, (byte)-34);
                                 class510.field7801.method211(var20, 124);
                              }

                              if (class55.field683 == 0) {
                                 var21 = (-(class513.field7828 >> 4) + class335.field5146) / 8;
                                 var22 = ((class513.field7828 >> 4) + class335.field5146) / 8;
                                 var23 = (-(class475.field7230 >> 4) + class294.field4663) / 8;
                                 var24 = ((class475.field7230 >> 4) + class294.field4663) / 8;
                                 var25 = var21 + -1;
                                 if (var1 || ~(var22 + 1) <= ~var25) {
                                    do {
                                       var26 = var23 + -1;
                                       if (var1) {
                                          if (~var25 <= ~var21) {
                                             if (~var22 <= ~var25) {
                                                if (var26 >= var23) {
                                                   if (~var24 > ~var26) {
                                                      class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                      class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                   class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                   ++var26;
                                                }
                                             } else {
                                                class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                ++var26;
                                             }
                                          } else {
                                             class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                             class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(var24 + 1 >= var26) {
                                             if (~var25 <= ~var21) {
                                                if (~var22 <= ~var25) {
                                                   if (var26 >= var23) {
                                                      if (~var24 > ~var26) {
                                                         class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                         class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                      class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                   class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                   ++var26;
                                                }
                                             } else {
                                                class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                ++var26;
                                             }
                                          }

                                          if (!var1) {
                                             ++var25;
                                             break;
                                          }

                                          class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                          ++var26;
                                       }
                                    } while(~(var22 + 1) <= ~var25);
                                 }
                              }

                              label574: {
                                 if (~class342.field5204 != -5) {
                                    if (class342.field5204 == 8) {
                                       class69.method532(1, 7);
                                       if (!var1) {
                                          break label574;
                                       }
                                    }

                                    if (~class342.field5204 == -11) {
                                       class69.method532(1, 9);
                                       if (!var1) {
                                          break label574;
                                       }
                                    }

                                    class69.method532(arg0 + -6452, 11);
                                    if (class510.field7801.field355 == null) {
                                       break label574;
                                    }

                                    var27 = class218.method1888(class442.field6796, 105, class510.field7801.field361);
                                    class510.field7801.method211(var27, arg0 + -6335);
                                    if (!var1) {
                                       break label574;
                                    }
                                 }

                                 class69.method532(arg0 + -6452, 3);
                              }

                              class532.method4087(-1);
                              class532.method4095(-71);
                              class56.method415((byte)117);
                              class67.field884 = true;
                              if (class252.field3809) {
                                 class120.method1111((byte)93, field3137[6] + (-class588.field8677 + class162.method1442(14080)) + field3137[8]);
                                 class252.field3809 = false;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = 0;
                        }

                        while(true) {
                           label635: {
                              int var18 = var10000;
                              int var19;
                              if (var1) {
                                 var19 = 0;
                                 if (var1) {
                                    class801.method5771(-19718, var18, var19, var17);
                                    ++var19;
                                 }
                              } else {
                                 if (~var18 <= ~class513.field7828) {
                                    break label635;
                                 }

                                 var19 = 0;
                                 if (var1) {
                                    class801.method5771(-19718, var18, var19, var17);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(var19 < class475.field7230) {
                                    class801.method5771(-19718, var18, var19, var17);
                                    ++var19;
                                 }

                                 if (!var1) {
                                    ++var18;
                                    if (~var18 <= ~class513.field7828) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1) {
                                       class801.method5771(-19718, var18, var19, var17);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (~var17 <= -5) {
                              class462.method3586(255);
                              class532.method4095(-61);
                              class110.method1045(1);
                              class600.method4442(-27112);
                              var10000 = -25930;
                              if (!var1) {
                                 class199.method1753(-25930);
                                 if (class479.field7289 != null && class510.field7801.field355 != null && ~class342.field5204 == -13) {
                                    ++class699.field10397;
                                    var20 = class218.method1888(class718.field10765, 121, class510.field7801.field361);
                                    var20.field8531.method2849(1057001181, (byte)-34);
                                    class510.field7801.method211(var20, 124);
                                 }

                                 if (class55.field683 == 0) {
                                    var21 = (-(class513.field7828 >> 4) + class335.field5146) / 8;
                                    var22 = ((class513.field7828 >> 4) + class335.field5146) / 8;
                                    var23 = (-(class475.field7230 >> 4) + class294.field4663) / 8;
                                    var24 = ((class475.field7230 >> 4) + class294.field4663) / 8;
                                    var25 = var21 + -1;
                                    if (var1 || ~(var22 + 1) <= ~var25) {
                                       do {
                                          var26 = var23 + -1;
                                          if (var1) {
                                             if (~var25 <= ~var21) {
                                                if (~var22 <= ~var25) {
                                                   if (var26 >= var23) {
                                                      if (~var24 > ~var26) {
                                                         class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                         class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                      class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                   class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                   ++var26;
                                                }
                                             } else {
                                                class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(var24 + 1 >= var26) {
                                                if (~var25 <= ~var21) {
                                                   if (~var22 <= ~var25) {
                                                      if (var26 >= var23) {
                                                         if (~var24 > ~var26) {
                                                            class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                            class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                         class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                      class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class742.field11031.method5021("m" + var25 + "_" + var26, (byte)124);
                                                   class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                                   ++var26;
                                                }
                                             }

                                             if (!var1) {
                                                ++var25;
                                                break;
                                             }

                                             class742.field11031.method5021("l" + var25 + "_" + var26, (byte)118);
                                             ++var26;
                                          }
                                       } while(~(var22 + 1) <= ~var25);
                                    }
                                 }

                                 label285: {
                                    if (~class342.field5204 != -5) {
                                       if (class342.field5204 == 8) {
                                          class69.method532(1, 7);
                                          if (!var1) {
                                             break label285;
                                          }
                                       }

                                       if (~class342.field5204 == -11) {
                                          class69.method532(1, 9);
                                          if (!var1) {
                                             break label285;
                                          }
                                       }

                                       class69.method532(arg0 + -6452, 11);
                                       if (class510.field7801.field355 == null) {
                                          break label285;
                                       }

                                       var27 = class218.method1888(class442.field6796, 105, class510.field7801.field361);
                                       class510.field7801.method211(var27, arg0 + -6335);
                                       if (!var1) {
                                          break label285;
                                       }
                                    }

                                    class69.method532(arg0 + -6452, 3);
                                 }

                                 class532.method4087(-1);
                                 class532.method4095(-71);
                                 class56.method415((byte)117);
                                 class67.field884 = true;
                                 if (class252.field3809) {
                                    class120.method1111((byte)93, field3137[6] + (-class588.field8677 + class162.method1442(14080)) + field3137[8]);
                                    class252.field3809 = false;
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
            } else if (~class614.field8918[var3] != 0 && class332.field5034[var3] == null) {
               class332.field5034[var3] = class742.field11031.method5017(class614.field8918[var3], 0, (byte)71);
               if (class332.field5034[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (class104.field1448[var3] != -1 && class689.field10244[var3] == null) {
               class689.field10244[var3] = class742.field11031.method5015((byte)126, class104.field1448[var3], 0, class398.field6243[var3]);
               if (class689.field10244[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (class109.field1510[var3] != -1 && class341.field5192[var3] == null) {
               class341.field5192[var3] = class742.field11031.method5017(class109.field1510[var3], 0, (byte)71);
               if (class341.field5192[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (~class147.field2216[var3] != 0 && class511.field7815[var3] == null) {
               class511.field7815[var3] = class742.field11031.method5017(class147.field2216[var3], 0, (byte)71);
               if (class511.field7815[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            if (class190.field2943 != null && class432.field6654[var3] == null && ~class190.field2943[var3] != 0) {
               class432.field6654[var3] = class742.field11031.method5015((byte)-49, class190.field2943[var3], 0, class398.field6243[var3]);
               if (class432.field6654[var3] == null) {
                  var2 = false;
                  ++class306.field4786;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class482.method3757(var29, field3137[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(Lrr;IIB)Les;",
      line = 561
   )
   public static final class191 method1799(class678 arg0, int arg1, int arg2, byte arg3) {
      boolean var4 = client.field1786;

      try {
         if (arg3 != -55) {
            method1797(true, (byte)-2);
         }

         ++field3129;
         class354 var5 = new class354(arg0.method5017(arg2, arg1, (byte)71));
         class191 var6 = new class191(arg1, var5.method2843(-1), var5.method2843(-1), var5.method2894(arg3 ^ -74), var5.method2894(102), ~var5.method2855(-31007) == -2, var5.method2855(-31007), var5.method2855(arg3 + -30952));
         int var7 = var5.method2855(-31007);
         int var8 = 0;
         class191 var10000;
         if (var4) {
            var10000 = var6;
         } else if (var7 <= var8) {
            var6.method1699(true);
            var10000 = var6;
            if (!var4) {
               return var6;
            }
         } else {
            var10000 = var6;
         }

         while(true) {
            var10000.field2975.method4980(new class724(var5.method2855(-31007), var5.method2848(arg3 ^ 93), var5.method2848(-98), var5.method2848(-118), var5.method2848(-106), var5.method2848(-94), var5.method2848(-109), var5.method2848(-124), var5.method2848(-107)), 0);
            ++var8;
            if (var7 <= var8) {
               var6.method1699(true);
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = var6;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3137[2] + (arg0 != null ? field3137[1] : field3137[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "<init>",
      descriptor = "(Z)V",
      line = 594
   )
   public class206(boolean arg0) {
      try {
         this.field3128 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3137[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(B)V",
      line = 605
   )
   public final void method1800(byte arg0) {
      try {
         if (this.field3132 != null) {
            this.field3132.method1533(16966);
         }

         ++field3136;
         if (arg0 != 85) {
            method1797(true, (byte)126);
         }

         this.field3135 = false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3137[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
