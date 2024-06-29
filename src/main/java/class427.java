import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class427 {
   @OriginalMember(
      owner = "client!we",
      name = "h",
      descriptor = "Ldw;"
   )
   private class748 field6521 = new class748(64);
   @OriginalMember(
      owner = "client!we",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field6520;
   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6533 = new String[]{method3260(method3259("\u0014'\u000f|D")), method3260(method3259("\u0001|M>")), method3260(method3259("\u0018l\u000fnP\u0001`Ul\u0011")), method3260(method3259("\u0018l\u000f\u001b\u0011")), method3260(method3259("\u0018l\u000f\u0013\u0011")), method3260(method3259("\u0018l\u000f\u0017\u0011")), method3260(method3259("\u0018l\u000f\u0011\u0011")), method3260(method3259("\u0018l\u000f\u0014\u0011")), method3260(method3259("\u0018l\u000f\u001a\u0011")), method3260(method3259("\u0018l\u000f\u0016\u0011")), method3260(method3259("&gW3U\u0006m\u0001 X\u000b`Yh")), method3260(method3259("SkSl\u0011^9\u0011w\u0010")), method3260(method3259("\u0018l\u000f\u0010\u0011")), method3260(method3259("0zU3M\u0006jD>\\\u0002lO&J")), method3260(method3259("\u0002z")), method3260(method3259(";fN9\u0003O")), method3260(method3259("\u0018l\u000f\u0015\u0011"))};
   @OriginalMember(
      owner = "client!we",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field6526 = new int[4096];
   @OriginalMember(
      owner = "client!we",
      name = "j",
      descriptor = "I"
   )
   public static int field6522;
   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "I"
   )
   public static int field6524;
   @OriginalMember(
      owner = "client!we",
      name = "d",
      descriptor = "I"
   )
   public static int field6525;
   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "I"
   )
   public static int field6527;
   @OriginalMember(
      owner = "client!we",
      name = "i",
      descriptor = "I"
   )
   public static int field6528;
   @OriginalMember(
      owner = "client!we",
      name = "e",
      descriptor = "I"
   )
   public static int field6529;
   @OriginalMember(
      owner = "client!we",
      name = "k",
      descriptor = "I"
   )
   public static int field6530;
   @OriginalMember(
      owner = "client!we",
      name = "l",
      descriptor = "I"
   )
   public static int field6531;
   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "I"
   )
   public static int field6532;
   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "Lts;"
   )
   public static class561 field6523;

   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3250(int arg0) {
      try {
         int var2 = 106 % ((69 - arg0) / 46);
         ++field6532;
         class748 var3 = this.field6521;
         synchronized(this.field6521) {
            this.field6521.method5445(697465426);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6533[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(ZIII)Ljava/lang/String;"
   )
   public static final String method3251(boolean arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field6531;
         if (~arg1 <= -3 && ~arg1 >= -37) {
            if (arg0 && arg3 >= 0) {
               int var5 = 2;
               int var6 = arg3 / arg1;
               if (var4 != 0) {
                  ++var5;
                  var6 /= arg1;
               }

               while(true) {
                  if (var6 == 0) {
                     char[] var7 = new char[var5];
                     var7[0] = '+';
                     int var8 = var5 - 1;
                     if (var4 == 0) {
                        int var10000;
                        if (var4 != 0) {
                           var10000 = arg3;
                        } else if (~var8 >= -1) {
                           var10000 = arg2;
                           if (var4 == 0) {
                              if (arg2 >= -20) {
                                 method3256(-50);
                              }

                              return new String(var7);
                           }
                        } else {
                           var10000 = arg3;
                        }

                        while(true) {
                           int var9 = var10000;
                           arg3 /= arg1;
                           int var10 = -(arg1 * arg3) + var9;
                           if (var10 >= 10) {
                              var7[var8] = (char)(var10 + 87);
                              if (var4 != 0) {
                                 var7[var8] = (char)(var10 + 48);
                                 --var8;
                              } else {
                                 --var8;
                              }
                           } else {
                              var7[var8] = (char)(var10 + 48);
                              --var8;
                           }

                           if (~var8 >= -1) {
                              var10000 = arg2;
                              if (var4 == 0) {
                                 if (arg2 >= -20) {
                                    method3256(-50);
                                 }

                                 return new String(var7);
                              }
                           } else {
                              var10000 = arg3;
                           }
                        }
                     }
                  } else {
                     ++var5;
                  }

                  var6 /= arg1;
               }
            } else {
               return Integer.toString(arg3, arg1);
            }
         } else {
            throw new IllegalArgumentException(field6533[10] + arg1);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field6533[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method3252(byte param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3253(byte arg0) {
      try {
         field6526 = null;
         field6523 = null;
         int var1 = -38 / ((arg0 - 47) / 39);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6533[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3254(byte arg0) {
      try {
         if (arg0 != -93) {
            this.method3257((byte)-114, -120);
         }

         class748 var2 = this.field6521;
         synchronized(this.field6521) {
            this.field6521.method5451(-127);
         }

         ++field6530;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6533[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method3255(byte arg0) {
      int var1 = client.field4530;

      try {
         class662.method4752(86, false);
         ++field6522;
         class573.field8529 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1 != 0) {
            if (class336.field4809[var3] != -1 && class483.field7165[var3] == null) {
               class483.field7165[var3] = class614.field8980.method3899(-69, 0, class336.field4809[var3]);
               if (class483.field7165[var3] == null) {
                  var2 = false;
                  ++class573.field8529;
               }
            }

            if (class447.field6796[var3] != -1 && class706.field10568[var3] == null) {
               class706.field10568[var3] = class614.field8980.method3887(class219.field2790[var3], class447.field6796[var3], 0, 56);
               if (class706.field10568[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            if (~class164.field2057[var3] != 0 && class467.field7002[var3] == null) {
               class467.field7002[var3] = class614.field8980.method3899(-101, 0, class164.field2057[var3]);
               if (class467.field7002[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            if (~class357.field5408[var3] != 0 && class238.field3026[var3] == null) {
               class238.field3026[var3] = class614.field8980.method3899(-93, 0, class357.field5408[var3]);
               if (class238.field3026[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            if (class433.field6613 != null && class37.field402[var3] == null && class433.field6613[var3] != -1) {
               class37.field402[var3] = class614.field8980.method3887(class219.field2790[var3], class433.field6613[var3], 0, 56);
               if (class37.field402[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            ++var3;
         }

         while(true) {
            if (var3 >= class483.field7165.length) {
               if (var1 == 0) {
                  if (class72.field916 == null) {
                     label767: {
                        if (class543.field7900 != null && class665.field9670.method3904(110, class543.field7900.field6713 + field6533[13])) {
                           if (!class665.field9670.method3886(122, class543.field7900.field6713 + field6533[13])) {
                              ++class573.field8529;
                              var2 = false;
                              if (var1 == 0) {
                                 break label767;
                              }
                           }

                           class72.field916 = class629.method4533((byte)95, class665.field9670, class71.field894, class543.field7900.field6713 + field6533[13]);
                           if (var1 == 0) {
                              break label767;
                           }
                        }

                        class72.field916 = new class560(0);
                     }
                  }

                  if (!var2) {
                     class767.field11252 = 1;
                     return;
                  }

                  class69.field873 = 0;
                  boolean var4 = true;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (var1 != 0) {
                     var6 = class706.field10568[var5];
                     if (var6 != null) {
                        var7 = (class483.field7166[var5] >> 8) * 64 + -class718.field10676;
                        var8 = (255 & class483.field7166[var5]) * 64 + -class669.field10064;
                        if (class643.field9369 != 0) {
                           var7 = 10;
                           var8 = 10;
                        }

                        var4 &= class543.method4012(var7, class323.field4603, var6, class178.field2197, -98, var8);
                     }

                     var9 = class238.field3026[var5];
                     if (var9 != null) {
                        var10 = (class483.field7166[var5] >> 8) * 64 + -class718.field10676;
                        var11 = (255 & class483.field7166[var5]) * 64 - class669.field10064;
                        if (~class643.field9369 != -1) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class543.method4012(var10, class323.field4603, var9, class178.field2197, -102, var11);
                     }

                     ++var5;
                  }

                  while(class483.field7165.length > var5) {
                     var6 = class706.field10568[var5];
                     if (var6 != null) {
                        var7 = (class483.field7166[var5] >> 8) * 64 + -class718.field10676;
                        var8 = (255 & class483.field7166[var5]) * 64 + -class669.field10064;
                        if (class643.field9369 != 0) {
                           var7 = 10;
                           var8 = 10;
                        }

                        var4 &= class543.method4012(var7, class323.field4603, var6, class178.field2197, -98, var8);
                     }

                     var9 = class238.field3026[var5];
                     if (var9 != null) {
                        var10 = (class483.field7166[var5] >> 8) * 64 + -class718.field10676;
                        var11 = (255 & class483.field7166[var5]) * 64 - class669.field10064;
                        if (~class643.field9369 != -1) {
                           var11 = 10;
                           var10 = 10;
                        }

                        var4 &= class543.method4012(var10, class323.field4603, var9, class178.field2197, -102, var11);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class767.field11252 = 2;
                     return;
                  }

                  if (class767.field11252 != 0) {
                     class183.method1433(class288.field4045, class786.field11439, 0, true, class417.field6389, class204.field2576.method1562((byte)-118, class728.field10827) + field6533[11]);
                  }

                  class351.method2741(8);
                  class607.method4426(-16770);
                  class413.method3152((byte)-110);
                  boolean var12 = false;
                  if (class786.field11439.method649() && class261.field3566.field9456.method1910(91) == 2) {
                     int var13 = 0;
                     if (var1 != 0 || var13 < class483.field7165.length) {
                        do {
                           if (class238.field3026[var13] == null) {
                              if (class467.field7002[var13] != null) {
                                 var12 = true;
                                 if (var1 == 0) {
                                    break;
                                 }

                                 ++var13;
                              } else {
                                 ++var13;
                              }
                           } else {
                              var12 = true;
                              if (var1 == 0) {
                                 break;
                              }

                              ++var13;
                           }
                        } while(var13 < class483.field7165.length);
                     }
                  }

                  int var14;
                  label697: {
                     if (~class261.field3566.field9439.method1555(86) == -2) {
                        var14 = class411.field6310[class780.field11379];
                        if (var1 == 0) {
                           break label697;
                        }
                     }

                     var14 = class326.field4628[class780.field11379];
                  }

                  if (class786.field11439.method585()) {
                     ++var14;
                  }

                  label670: {
                     class248.method1870(class786.field11439, class437.field6675, 9, 4, class323.field4603, class178.field2197, var14, var12, ~class786.field11439.method586() < -1);
                     class492.method3646(class611.field8951);
                     if (class611.field8951 == 0) {
                        class75.method734((class67)null);
                        if (var1 == 0) {
                           break label670;
                        }
                     }

                     class75.method734(class57.field721);
                  }

                  int var15 = 0;
                  if (var1 != 0) {
                     class532.field7778[var15].method5387(3);
                     ++var15;
                  }

                  while(true) {
                     while(var15 < 4) {
                        class532.field7778[var15].method5387(3);
                        ++var15;
                     }

                     class773.method5572(true);
                     class524.method3854(false, -3);
                     class454.method3419(-2230);
                     class759.field11182 = false;
                     class264.field3610 = null;
                     class351.method2741(8);
                     System.gc();
                     class662.method4752(124, true);
                     class368.method2857((byte)-97);
                     class538.field7860 = class261.field3566.field9453.method3566(109);
                     if (var1 == 0) {
                        label663: {
                           class60.field746 = ~class56.field704 <= -97;
                           class208.field2652 = class261.field3566.field9456.method1910(118) == 2;
                           class530.field7704 = ~class261.field3566.field9431.method2469(85) == -2;
                           class538.field7867 = class261.field3566.field9428.method2175(99) != 1 ? class255.field3404 : -1;
                           class62.field775 = class261.field3566.field9451.method3262(111) == 1;
                           class515.field7535 = ~class261.field3566.field9467.method2369(99) == -2;
                           class221.field2832 = new class153(4, class323.field4603, class178.field2197, false);
                           if (class643.field9369 != 0) {
                              class7.method61(class483.field7165, class221.field2832, false);
                              if (var1 == 0) {
                                 break label663;
                              }
                           }

                           class544.method4020(3, class483.field7165, class221.field2832);
                        }

                        class473.method3521(class323.field4603 >> 4, -114, class178.field2197 >> 4);
                        class511.method3801(2118461347);
                        if (var12) {
                           label656: {
                              class284.method2172(true);
                              class688.field10365 = new class153(1, class323.field4603, class178.field2197, true);
                              if (class643.field9369 == 0) {
                                 class544.method4020(3, class467.field7002, class688.field10365);
                                 class662.method4752(77, true);
                                 if (var1 == 0) {
                                    break label656;
                                 }
                              }

                              class7.method61(class467.field7002, class688.field10365, false);
                              class662.method4752(73, true);
                           }

                           class688.field10365.method3856(class221.field2832.field7624[0], 0, (byte)-67);
                           class688.field10365.method3863((byte)-21, (class739[])null, (int[][][])null, class786.field11439);
                           class284.method2172(false);
                        }

                        label650: {
                           class221.field2832.method3863((byte)-21, class532.field7778, !var12 ? null : class688.field10365.field7624, class786.field11439);
                           if (~class643.field9369 == -1) {
                              class662.method4752(108, true);
                              class398.method3060(0, class706.field10568, class221.field2832);
                              if (class37.field402 == null) {
                                 break label650;
                              }

                              class373.method2896(-22969);
                              if (var1 == 0) {
                                 break label650;
                              }
                           }

                           class662.method4752(74, true);
                           class49.method391(class221.field2832, 0, class706.field10568);
                        }

                        class607.method4426(-16770);
                        if (~class56.field704 > -97) {
                           class530.method3919(0);
                        }

                        class662.method4752(84, true);
                        class221.field2832.method3857(var12 ? class650.field9484[0] : null, (class293)null, -9654, class786.field11439);
                        class221.field2832.method1259((byte)107, false, class786.field11439);
                        class662.method4752(108, true);
                        if (var12) {
                           label638: {
                              class284.method2172(true);
                              class662.method4752(82, true);
                              if (class643.field9369 == 0) {
                                 class398.method3060(0, class238.field3026, class688.field10365);
                                 if (var1 == 0) {
                                    break label638;
                                 }
                              }

                              class49.method391(class688.field10365, 0, class238.field3026);
                           }

                           class607.method4426(-16770);
                           class662.method4752(89, true);
                           class688.field10365.method3857((class293)null, class147.field1843[0], -9654, class786.field11439);
                           class688.field10365.method1259((byte)-69, true, class786.field11439);
                           class662.method4752(100, true);
                           class284.method2172(false);
                        }

                        class762.method5519(80);
                        int var16 = class221.field2832.field1923;
                        if (~var16 < ~class551.field8158) {
                           var16 = class551.field8158;
                        }

                        if (~var16 > ~(class551.field8158 - 1)) {
                           var16 = class551.field8158 + -1;
                        }

                        label392: {
                           if (~class261.field3566.field9428.method2175(115) != -1) {
                              class75.method731(0);
                              if (var1 == 0) {
                                 break label392;
                              }
                           }

                           class75.method731(var16);
                        }

                        int var17 = 0;
                        short var10000;
                        class180 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class180 var27;
                        if (var1 != 0) {
                           var10000 = 0;
                        } else if (~var17 <= -5) {
                           class571.method4231(2);
                           class351.method2741(8);
                           class124.method1020((byte)60);
                           class607.method4426(-16770);
                           var10000 = -17110;
                           if (var1 == 0) {
                              class416.method3179(-17110);
                              if (class691.field10404 != null && class429.field6546 != null && class672.field10112 == 11) {
                                 ++class262.field3582;
                                 var20 = class486.method3603(class411.field6301, (byte)-103, class48.field583);
                                 var20.field2211.method1094(-89, 1057001181);
                                 class763.method5527(false, var20);
                              }

                              if (~class643.field9369 == -1) {
                                 var21 = (-(class323.field4603 >> 4) + class465.field6983) / 8;
                                 var22 = (class465.field6983 - -(class323.field4603 >> 4)) / 8;
                                 var23 = (-(class178.field2197 >> 4) + class688.field10364) / 8;
                                 var24 = ((class178.field2197 >> 4) + class688.field10364) / 8;
                                 var25 = var21 - 1;
                                 if (var1 != 0 || ~(var22 + 1) <= ~var25) {
                                    do {
                                       var26 = var23 - 1;
                                       if (var1 != 0) {
                                          if (~var21 >= ~var25) {
                                             if (var22 >= var25) {
                                                if (var26 >= var23) {
                                                   if (var24 < var26) {
                                                      class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                      class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                   class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                   ++var26;
                                                }
                                             } else {
                                                class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                ++var26;
                                             }
                                          } else {
                                             class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                             class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(~var26 >= ~(var24 + 1)) {
                                             if (~var21 >= ~var25) {
                                                if (var22 >= var25) {
                                                   if (var26 >= var23) {
                                                      if (var24 < var26) {
                                                         class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                         class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                      class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                   class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                   ++var26;
                                                }
                                             } else {
                                                class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                ++var26;
                                             }
                                          }

                                          if (var1 == 0) {
                                             ++var25;
                                             break;
                                          }

                                          class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                          ++var26;
                                       }
                                    } while(~(var22 + 1) <= ~var25);
                                 }
                              }

                              label568: {
                                 if (~class672.field10112 != -5) {
                                    if (~class672.field10112 != -9) {
                                       class317.method2411(10, (byte)-54);
                                       if (class429.field6546 == null) {
                                          break label568;
                                       }

                                       var27 = class486.method3603(class444.field6755, (byte)-29, class48.field583);
                                       class763.method5527(false, var27);
                                       if (var1 == 0) {
                                          break label568;
                                       }
                                    }

                                    class317.method2411(7, (byte)106);
                                    if (var1 == 0) {
                                       break label568;
                                    }
                                 }

                                 class317.method2411(3, (byte)119);
                              }

                              class32.method226(true);
                              class351.method2741(8);
                              class252.method1903(32);
                              class321.field4583 = true;
                              if (arg0 <= 102) {
                                 method3255((byte)90);
                              }

                              if (class577.field8566) {
                                 class335.method2539((byte)-110, field6533[15] + (class188.method1462(true) + -class196.field2436) + field6533[14]);
                                 class577.field8566 = false;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = 0;
                        }

                        while(true) {
                           label628: {
                              int var18 = var10000;
                              int var19;
                              if (var1 != 0) {
                                 var19 = 0;
                                 if (var1 != 0) {
                                    class293.method2237(var18, 0, var19, var17);
                                    ++var19;
                                 }
                              } else {
                                 if (var18 >= class323.field4603) {
                                    break label628;
                                 }

                                 var19 = 0;
                                 if (var1 != 0) {
                                    class293.method2237(var18, 0, var19, var17);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(class178.field2197 > var19) {
                                    class293.method2237(var18, 0, var19, var17);
                                    ++var19;
                                 }

                                 if (var1 == 0) {
                                    ++var18;
                                    if (var18 >= class323.field4603) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1 != 0) {
                                       class293.method2237(var18, 0, var19, var17);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (~var17 <= -5) {
                              class571.method4231(2);
                              class351.method2741(8);
                              class124.method1020((byte)60);
                              class607.method4426(-16770);
                              var10000 = -17110;
                              if (var1 == 0) {
                                 class416.method3179(-17110);
                                 if (class691.field10404 != null && class429.field6546 != null && class672.field10112 == 11) {
                                    ++class262.field3582;
                                    var20 = class486.method3603(class411.field6301, (byte)-103, class48.field583);
                                    var20.field2211.method1094(-89, 1057001181);
                                    class763.method5527(false, var20);
                                 }

                                 if (~class643.field9369 == -1) {
                                    var21 = (-(class323.field4603 >> 4) + class465.field6983) / 8;
                                    var22 = (class465.field6983 - -(class323.field4603 >> 4)) / 8;
                                    var23 = (-(class178.field2197 >> 4) + class688.field10364) / 8;
                                    var24 = ((class178.field2197 >> 4) + class688.field10364) / 8;
                                    var25 = var21 - 1;
                                    if (var1 != 0 || ~(var22 + 1) <= ~var25) {
                                       do {
                                          var26 = var23 - 1;
                                          if (var1 != 0) {
                                             if (~var21 >= ~var25) {
                                                if (var22 >= var25) {
                                                   if (var26 >= var23) {
                                                      if (var24 < var26) {
                                                         class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                         class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                      class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                   class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                   ++var26;
                                                }
                                             } else {
                                                class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(~var26 >= ~(var24 + 1)) {
                                                if (~var21 >= ~var25) {
                                                   if (var22 >= var25) {
                                                      if (var26 >= var23) {
                                                         if (var24 < var26) {
                                                            class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                            class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                         class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                      class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class614.field8980.method3895("m" + var25 + "_" + var26, (byte)113);
                                                   class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                                   ++var26;
                                                }
                                             }

                                             if (var1 == 0) {
                                                ++var25;
                                                break;
                                             }

                                             class614.field8980.method3895("l" + var25 + "_" + var26, (byte)116);
                                             ++var26;
                                          }
                                       } while(~(var22 + 1) <= ~var25);
                                    }
                                 }

                                 label279: {
                                    if (~class672.field10112 != -5) {
                                       if (~class672.field10112 != -9) {
                                          class317.method2411(10, (byte)-54);
                                          if (class429.field6546 == null) {
                                             break label279;
                                          }

                                          var27 = class486.method3603(class444.field6755, (byte)-29, class48.field583);
                                          class763.method5527(false, var27);
                                          if (var1 == 0) {
                                             break label279;
                                          }
                                       }

                                       class317.method2411(7, (byte)106);
                                       if (var1 == 0) {
                                          break label279;
                                       }
                                    }

                                    class317.method2411(3, (byte)119);
                                 }

                                 class32.method226(true);
                                 class351.method2741(8);
                                 class252.method1903(32);
                                 class321.field4583 = true;
                                 if (arg0 <= 102) {
                                    method3255((byte)90);
                                 }

                                 if (class577.field8566) {
                                    class335.method2539((byte)-110, field6533[15] + (class188.method1462(true) + -class196.field2436) + field6533[14]);
                                    class577.field8566 = false;
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
            } else if (class336.field4809[var3] != -1 && class483.field7165[var3] == null) {
               class483.field7165[var3] = class614.field8980.method3899(-69, 0, class336.field4809[var3]);
               if (class483.field7165[var3] == null) {
                  var2 = false;
                  ++class573.field8529;
               }
            }

            if (class447.field6796[var3] != -1 && class706.field10568[var3] == null) {
               class706.field10568[var3] = class614.field8980.method3887(class219.field2790[var3], class447.field6796[var3], 0, 56);
               if (class706.field10568[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            if (~class164.field2057[var3] != 0 && class467.field7002[var3] == null) {
               class467.field7002[var3] = class614.field8980.method3899(-101, 0, class164.field2057[var3]);
               if (class467.field7002[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            if (~class357.field5408[var3] != 0 && class238.field3026[var3] == null) {
               class238.field3026[var3] = class614.field8980.method3899(-93, 0, class357.field5408[var3]);
               if (class238.field3026[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            if (class433.field6613 != null && class37.field402[var3] == null && class433.field6613[var3] != -1) {
               class37.field402[var3] = class614.field8980.method3887(class219.field2790[var3], class433.field6613[var3], 0, 56);
               if (class37.field402[var3] == null) {
                  ++class573.field8529;
                  var2 = false;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class670.method4877(var29, field6533[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(I)Ljj;"
   )
   public static final class128 method3256(int arg0) {
      try {
         if (arg0 != 9614) {
            field6526 = null;
         }

         ++field6528;
         class128 var1 = new class128(518);
         class327.field4651 = new int[4];
         class327.field4651[2] = (int)(Math.random() * 9.9999999E7D);
         class327.field4651[3] = (int)(Math.random() * 9.9999999E7D);
         class327.field4651[0] = (int)(9.9999999E7D * Math.random());
         class327.field4651[1] = (int)(9.9999999E7D * Math.random());
         var1.method1085(10, (byte)-11);
         var1.method1094(-110, class327.field4651[0]);
         var1.method1094(-53, class327.field4651[1]);
         var1.method1094(-125, class327.field4651[2]);
         var1.method1094(-26, class327.field4651[3]);
         return var1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6533[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method3257(byte arg0, int arg1) {
      try {
         class748 var3 = this.field6521;
         synchronized(this.field6521) {
            this.field6521.method5453(arg1, false);
         }

         ++field6527;
         if (arg0 != -60) {
            method3252((byte)-106, -59, -1, -44, -81);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6533[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(II)Ldia;"
   )
   public final class243 method3258(int arg0, int arg1) {
      try {
         ++field6525;
         class748 var3 = this.field6521;
         class243 var4;
         synchronized(this.field6521) {
            var4 = (class243)this.field6521.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field6520;
            byte[] var6;
            synchronized(this.field6520) {
               var6 = this.field6520.method3899(-125, arg1, 31);
            }

            class243 var7 = new class243();
            if (var6 != null) {
               var7.method1807(new class128(var6), 122);
            }

            class748 var8 = this.field6521;
            synchronized(this.field6521) {
               if (arg0 != 21650) {
                  return null;
               } else {
                  this.field6521.method5455(-2049, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field6533[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class427(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field6520 = arg2;
         this.field6520.method3875(0, 31);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6533[2] + (arg0 != null ? field6533[0] : field6533[1]) + ',' + arg1 + ',' + (arg2 != null ? field6533[0] : field6533[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3259(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3260(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
