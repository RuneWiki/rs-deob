import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class445 implements class261 {
   @OriginalMember(
      owner = "client!mba",
      name = "m",
      descriptor = "Lkf;"
   )
   private class266 field6334;
   @OriginalMember(
      owner = "client!mba",
      name = "d",
      descriptor = "Lqj;"
   )
   private class538 field6333;
   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6342 = new String[]{method3273(method3272("\u0019\u0019nsw\\")), method3273(method3272("\u000fU!sO")), method3273(method3272("\u001a\u000ec1")), method3273(method3272("\u0019\u0019nsq\\")), method3273(method3272("\u0019\u0019nsz\\")), method3273(method3272("\u0019\u0019ns\u000e\u001d\u0015f)\f\\")), method3273(method3272("\u0019\u0019nsv\\")), method3273(method3272("\u0019\b")), method3273(method3272("\u0019\u0019nsp\\")), method3273(method3272("+\b{<F\u001d\u0018j1W\u0019\u001ea)A")), method3273(method3272("H\u0019}c\u001aEK?x\u001b")), method3273(method3272(" \u0014`6\bT")), method3273(method3272("\u0019\u0019nss\\"))};
   @OriginalMember(
      owner = "client!mba",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field6335 = false;
   @OriginalMember(
      owner = "client!mba",
      name = "l",
      descriptor = "Lek;"
   )
   public static class536 field6337 = new class536(43, 8);
   @OriginalMember(
      owner = "client!mba",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field6338 = new int[8];
   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "F"
   )
   public static float field6340;
   @OriginalMember(
      owner = "client!mba",
      name = "n",
      descriptor = "I"
   )
   public static int field6328;
   @OriginalMember(
      owner = "client!mba",
      name = "f",
      descriptor = "I"
   )
   public static int field6329;
   @OriginalMember(
      owner = "client!mba",
      name = "h",
      descriptor = "I"
   )
   public static int field6330;
   @OriginalMember(
      owner = "client!mba",
      name = "b",
      descriptor = "I"
   )
   public static int field6331;
   @OriginalMember(
      owner = "client!mba",
      name = "k",
      descriptor = "I"
   )
   public static int field6336;
   @OriginalMember(
      owner = "client!mba",
      name = "j",
      descriptor = "I"
   )
   public static int field6339;
   @OriginalMember(
      owner = "client!mba",
      name = "e",
      descriptor = "I"
   )
   public static int field6341;
   @OriginalMember(
      owner = "client!mba",
      name = "c",
      descriptor = "Lbg;"
   )
   private class492 field6332;

   @OriginalMember(
      owner = "client!mba",
      name = "b",
      descriptor = "(I)Z",
      line = 4
   )
   public final boolean method860(int arg0) {
      try {
         if (arg0 != 9201) {
            this.field6333 = null;
         }

         ++field6336;
         return this.field6334.method2051(this.field6333.field7679, (byte)60);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6342[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "c",
      descriptor = "(I)V",
      line = 15
   )
   public static final void method3269(int arg0) {
      boolean var1 = client.field4360;

      try {
         class489.method3557(false, -51);
         ++field6330;
         class144.field1834 = 0;
         boolean var2 = true;
         int var3 = 0;
         if (var1) {
            if (class77.field962[var3] != -1 && class371.field5388[var3] == null) {
               class371.field5388[var3] = class515.field7437.method2037(false, 0, class77.field962[var3]);
               if (class371.field5388[var3] == null) {
                  var2 = false;
                  ++class144.field1834;
               }
            }

            if (class474.field6824[var3] != -1 && class212.field3029[var3] == null) {
               class212.field3029[var3] = class515.field7437.method2062(class636.field9306[var3], class474.field6824[var3], 0, 0);
               if (class212.field3029[var3] == null) {
                  var2 = false;
                  ++class144.field1834;
               }
            }

            if (class784.field11482[var3] != -1 && class668.field9714[var3] == null) {
               class668.field9714[var3] = class515.field7437.method2037(false, 0, class784.field11482[var3]);
               if (class668.field9714[var3] == null) {
                  ++class144.field1834;
                  var2 = false;
               }
            }

            if (class769.field11340[var3] != -1 && class78.field965[var3] == null) {
               class78.field965[var3] = class515.field7437.method2037(false, 0, class769.field11340[var3]);
               if (class78.field965[var3] == null) {
                  ++class144.field1834;
                  var2 = false;
               }
            }

            if (class464.field6705 != null && class356.field4787[var3] == null && ~class464.field6705[var3] != 0) {
               class356.field4787[var3] = class515.field7437.method2062(class636.field9306[var3], class464.field6705[var3], 0, 0);
               if (class356.field4787[var3] == null) {
                  var2 = false;
                  ++class144.field1834;
               }
            }

            ++var3;
         }

         while(true) {
            if (~class371.field5388.length >= ~var3) {
               if (!var1) {
                  if (class543.field7801 == null) {
                     label775: {
                        if (class70.field863 != null && class77.field960.method2050(class70.field863.field11143 + field6342[9], 38)) {
                           if (!class77.field960.method2033(false, class70.field863.field11143 + field6342[9])) {
                              ++class144.field1834;
                              var2 = false;
                              if (!var1) {
                                 break label775;
                              }
                           }

                           class543.field7801 = class352.method2570(class70.field863.field11143 + field6342[9], class77.field960, class88.field1148, (byte)-128);
                           if (!var1) {
                              break label775;
                           }
                        }

                        class543.field7801 = new class92(0);
                     }
                  }

                  if (!var2) {
                     class73.field904 = 1;
                     return;
                  }

                  boolean var4 = true;
                  class26.field412 = 0;
                  int var5 = 0;
                  byte[] var6;
                  int var7;
                  int var8;
                  byte[] var9;
                  int var10;
                  int var11;
                  if (var1) {
                     var6 = class212.field3029[var5];
                     if (var6 != null) {
                        var7 = (class436.field6245[var5] >> 8) * 64 - class672.field9740;
                        var8 = (255 & class436.field6245[var5]) * 64 + -class533.field7595;
                        if (~class594.field8738 != -1) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class137.method1083(var8, var6, class644.field9403, false, class337.field4594, var7);
                     }

                     var9 = class78.field965[var5];
                     if (var9 != null) {
                        var10 = (class436.field6245[var5] >> 8) * 64 + -class672.field9740;
                        var11 = (255 & class436.field6245[var5]) * 64 - class533.field7595;
                        if (~class594.field8738 != -1) {
                           var10 = 10;
                           var11 = 10;
                        }

                        var4 &= class137.method1083(var11, var9, class644.field9403, false, class337.field4594, var10);
                     }

                     ++var5;
                  }

                  while(var5 < class371.field5388.length) {
                     var6 = class212.field3029[var5];
                     if (var6 != null) {
                        var7 = (class436.field6245[var5] >> 8) * 64 - class672.field9740;
                        var8 = (255 & class436.field6245[var5]) * 64 + -class533.field7595;
                        if (~class594.field8738 != -1) {
                           var8 = 10;
                           var7 = 10;
                        }

                        var4 &= class137.method1083(var8, var6, class644.field9403, false, class337.field4594, var7);
                     }

                     var9 = class78.field965[var5];
                     if (var9 != null) {
                        var10 = (class436.field6245[var5] >> 8) * 64 + -class672.field9740;
                        var11 = (255 & class436.field6245[var5]) * 64 - class533.field7595;
                        if (~class594.field8738 != -1) {
                           var10 = 10;
                           var11 = 10;
                        }

                        var4 &= class137.method1083(var11, var9, class644.field9403, false, class337.field4594, var10);
                     }

                     ++var5;
                  }

                  if (!var4) {
                     class73.field904 = 2;
                     return;
                  }

                  if (class73.field904 != 0) {
                     class626.method4545(class383.field5543, true, class347.field4690, 2, class180.field2491.method1437(class608.field8920, 50) + field6342[10], class427.field6124);
                  }

                  class581.method4207(50);
                  class84.method750(-121);
                  class444.method3265((byte)121);
                  boolean var12 = false;
                  if (class383.field5543.method564() && class300.field4107.field6407.method752(-37) == 2) {
                     int var13 = 0;
                     if (var1 || class371.field5388.length > var13) {
                        do {
                           if (class78.field965[var13] == null) {
                              if (class668.field9714[var13] != null) {
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
                        } while(class371.field5388.length > var13);
                     }
                  }

                  int var14;
                  label705: {
                     if (~class300.field4107.field6455.method5490(114) != -2) {
                        var14 = class434.field6222[class424.field6038];
                        if (!var1) {
                           break label705;
                        }
                     }

                     var14 = class33.field477[class424.field6038];
                  }

                  if (class383.field5543.method507()) {
                     ++var14;
                  }

                  label697: {
                     class528.method3818(class383.field5543, class597.field8778, 9, 4, class644.field9403, class337.field4594, var14, var12, class383.field5543.method593() > 0);
                     class192.method1516(class713.field10395);
                     if (class713.field10395 == 0) {
                        class571.method4086((class67)null);
                        if (!var1) {
                           break label697;
                        }
                     }

                     class571.method4086(class215.field3075);
                  }

                  if (arg0 < 15) {
                     field6339 = -29;
                  }

                  int var15 = 0;
                  if (var1) {
                     class767.field11309[var15].method4397(31436);
                     ++var15;
                  }

                  while(true) {
                     while(var15 < 4) {
                        class767.field11309[var15].method4397(31436);
                        ++var15;
                     }

                     class179.method1433(5);
                     class759.method5507(121, false);
                     class366.method2730((byte)41);
                     class566.field8064 = null;
                     class595.field8747 = false;
                     class581.method4207(50);
                     System.gc();
                     class489.method3557(true, -51);
                     class244.method1861((byte)95);
                     class260.field3609 = class300.field4107.field6423.method3404(-80);
                     if (!var1) {
                        label670: {
                           class573.field8146 = ~class409.field5915 <= -97;
                           class722.field10543 = class300.field4107.field6407.method752(85) == 2;
                           class682.field10036 = ~class300.field4107.field6431.method824(-11) == -2;
                           class53.field674 = ~class300.field4107.field6412.method1017(99) == -2 ? -1 : class169.field2359;
                           class401.field5812 = ~class300.field4107.field6449.method1711(-117) == -2;
                           class547.field7848 = ~class300.field4107.field6434.method1454(99) == -2;
                           class101.field1294 = new class253(4, class644.field9403, class337.field4594, false);
                           if (class594.field8738 != 0) {
                              class76.method690(class371.field5388, 16333, class101.field1294);
                              if (!var1) {
                                 break label670;
                              }
                           }

                           class752.method5455(class371.field5388, class101.field1294, -107);
                        }

                        class676.method4912(false, class337.field4594 >> 4, class644.field9403 >> 4);
                        class62.method473((byte)-98);
                        if (var12) {
                           label663: {
                              class769.method5569(true);
                              class246.field3398 = new class253(1, class644.field9403, class337.field4594, true);
                              if (class594.field8738 == 0) {
                                 class752.method5455(class668.field9714, class246.field3398, -115);
                                 class489.method3557(true, -51);
                                 if (!var1) {
                                    break label663;
                                 }
                              }

                              class76.method690(class668.field9714, 16333, class246.field3398);
                              class489.method3557(true, -51);
                           }

                           class246.field3398.method4869(0, 1, class101.field1294.field9683[0]);
                           class246.field3398.method4871((byte)108, (class603[])null, class383.field5543, (int[][][])null);
                           class769.method5569(false);
                        }

                        label657: {
                           class101.field1294.method4871((byte)115, class767.field11309, class383.field5543, var12 ? class246.field3398.field9683 : null);
                           if (class594.field8738 != 0) {
                              class489.method3557(true, -51);
                              class138.method1094(class212.field3029, class101.field1294, (byte)-30);
                              if (!var1) {
                                 break label657;
                              }
                           }

                           class489.method3557(true, -51);
                           class173.method1404(class101.field1294, 125, class212.field3029);
                           if (class356.field4787 != null) {
                              class402.method3033(true);
                           }
                        }

                        class84.method750(-81);
                        if (~class409.field5915 > -97) {
                           class483.method3504((byte)-114);
                        }

                        class489.method3557(true, -51);
                        class101.field1294.method4859(!var12 ? null : class757.field11220[0], false, class383.field5543, (class295)null);
                        class101.field1294.method1934(false, class383.field5543, (byte)-117);
                        class489.method3557(true, -51);
                        if (var12) {
                           label647: {
                              class769.method5569(true);
                              class489.method3557(true, -51);
                              if (~class594.field8738 == -1) {
                                 class173.method1404(class246.field3398, 126, class78.field965);
                                 if (!var1) {
                                    break label647;
                                 }
                              }

                              class138.method1094(class78.field965, class246.field3398, (byte)-17);
                           }

                           class84.method750(-96);
                           class489.method3557(true, -51);
                           class246.field3398.method4859((class295)null, false, class383.field5543, class265.field3658[0]);
                           class246.field3398.method1934(true, class383.field5543, (byte)-127);
                           class489.method3557(true, -51);
                           class769.method5569(false);
                        }

                        class327.method2426(30);
                        int var16 = class101.field1294.field3446;
                        if (class561.field8019 < var16) {
                           var16 = class561.field8019;
                        }

                        if (class561.field8019 + -1 > var16) {
                           var16 = class561.field8019 - 1;
                        }

                        label400: {
                           if (class300.field4107.field6412.method1017(-91) == 0) {
                              class688.method5023(var16);
                              if (!var1) {
                                 break label400;
                              }
                           }

                           class688.method5023(0);
                        }

                        int var17 = 0;
                        byte var10000;
                        class447 var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        class447 var27;
                        if (var1) {
                           var10000 = 0;
                        } else if (~var17 <= -5) {
                           class61.method467(-128);
                           class581.method4207(50);
                           class478.method3482(0);
                           class84.method750(-66);
                           var10000 = -104;
                           if (!var1) {
                              class401.method3029(-104);
                              if (class549.field7865 != null && class430.field6150.field102 != null && ~class622.field9156 == -13) {
                                 ++class76.field949;
                                 var20 = class40.method350(class76.field952, class430.field6150.field106, true);
                                 var20.field6359.method1160(105, 1057001181);
                                 class430.field6150.method55(13256, var20);
                              }

                              if (~class594.field8738 == -1) {
                                 var21 = (-(class644.field9403 >> 4) + class72.field877) / 8;
                                 var22 = (class72.field877 - -(class644.field9403 >> 4)) / 8;
                                 var23 = (-(class337.field4594 >> 4) + class53.field676) / 8;
                                 var24 = ((class337.field4594 >> 4) + class53.field676) / 8;
                                 var25 = var21 + -1;
                                 if (var1 || var22 + 1 >= var25) {
                                    do {
                                       var26 = var23 - 1;
                                       if (var1) {
                                          if (~var21 >= ~var25) {
                                             if (~var22 <= ~var25) {
                                                if (~var26 <= ~var23) {
                                                   if (var24 < var26) {
                                                      class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                      class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                      ++var26;
                                                   } else {
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                   class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                   ++var26;
                                                }
                                             } else {
                                                class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                ++var26;
                                             }
                                          } else {
                                             class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                             class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                             ++var26;
                                          }
                                       }

                                       while(true) {
                                          while(~var26 >= ~(var24 - -1)) {
                                             if (~var21 >= ~var25) {
                                                if (~var22 <= ~var25) {
                                                   if (~var26 <= ~var23) {
                                                      if (var24 < var26) {
                                                         class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                         class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                      class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                   class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                   ++var26;
                                                }
                                             } else {
                                                class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                ++var26;
                                             }
                                          }

                                          if (!var1) {
                                             ++var25;
                                             break;
                                          }

                                          class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                          ++var26;
                                       }
                                    } while(var22 + 1 >= var25);
                                 }
                              }

                              label872: {
                                 if (~class622.field9156 == -5) {
                                    class731.method5321(3, (byte)-90);
                                    if (!var1) {
                                       break label872;
                                    }
                                 }

                                 if (class622.field9156 != 8) {
                                    if (class622.field9156 == 10) {
                                       class731.method5321(9, (byte)-107);
                                       if (!var1) {
                                          break label872;
                                       }
                                    }

                                    class731.method5321(11, (byte)-111);
                                    if (class430.field6150.field102 == null) {
                                       break label872;
                                    }

                                    var27 = class40.method350(class138.field1764, class430.field6150.field106, true);
                                    class430.field6150.method55(13256, var27);
                                    if (!var1) {
                                       break label872;
                                    }
                                 }

                                 class731.method5321(7, (byte)-89);
                              }

                              class692.method5050(-103);
                              class581.method4207(50);
                              class134.method1060((byte)115);
                              class171.field2384 = true;
                              if (class252.field3438) {
                                 class756.method5492((byte)106, field6342[11] + (-class637.field9319 + class133.method1054(-29025)) + field6342[7]);
                                 class252.field3438 = false;
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
                                    class284.method2152(-4, var17, var18, var19);
                                    ++var19;
                                 }
                              } else {
                                 if (var18 >= class644.field9403) {
                                    break label637;
                                 }

                                 var19 = 0;
                                 if (var1) {
                                    class284.method2152(-4, var17, var18, var19);
                                    ++var19;
                                 }
                              }

                              while(true) {
                                 while(~var19 > ~class337.field4594) {
                                    class284.method2152(-4, var17, var18, var19);
                                    ++var19;
                                 }

                                 if (!var1) {
                                    ++var18;
                                    if (var18 >= class644.field9403) {
                                       break;
                                    }

                                    var19 = 0;
                                    if (var1) {
                                       class284.method2152(-4, var17, var18, var19);
                                       ++var19;
                                    }
                                 } else {
                                    ++var19;
                                 }
                              }
                           }

                           ++var17;
                           if (~var17 <= -5) {
                              class61.method467(-128);
                              class581.method4207(50);
                              class478.method3482(0);
                              class84.method750(-66);
                              var10000 = -104;
                              if (!var1) {
                                 class401.method3029(-104);
                                 if (class549.field7865 != null && class430.field6150.field102 != null && ~class622.field9156 == -13) {
                                    ++class76.field949;
                                    var20 = class40.method350(class76.field952, class430.field6150.field106, true);
                                    var20.field6359.method1160(105, 1057001181);
                                    class430.field6150.method55(13256, var20);
                                 }

                                 if (~class594.field8738 == -1) {
                                    var21 = (-(class644.field9403 >> 4) + class72.field877) / 8;
                                    var22 = (class72.field877 - -(class644.field9403 >> 4)) / 8;
                                    var23 = (-(class337.field4594 >> 4) + class53.field676) / 8;
                                    var24 = ((class337.field4594 >> 4) + class53.field676) / 8;
                                    var25 = var21 + -1;
                                    if (var1 || var22 + 1 >= var25) {
                                       do {
                                          var26 = var23 - 1;
                                          if (var1) {
                                             if (~var21 >= ~var25) {
                                                if (~var22 <= ~var25) {
                                                   if (~var26 <= ~var23) {
                                                      if (var24 < var26) {
                                                         class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                         class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                         ++var26;
                                                      } else {
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                      class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                   class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                   ++var26;
                                                }
                                             } else {
                                                class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                ++var26;
                                             }
                                          }

                                          while(true) {
                                             while(~var26 >= ~(var24 - -1)) {
                                                if (~var21 >= ~var25) {
                                                   if (~var22 <= ~var25) {
                                                      if (~var26 <= ~var23) {
                                                         if (var24 < var26) {
                                                            class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                            class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                            ++var26;
                                                         } else {
                                                            ++var26;
                                                         }
                                                      } else {
                                                         class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                         class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                         ++var26;
                                                      }
                                                   } else {
                                                      class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                      class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                      ++var26;
                                                   }
                                                } else {
                                                   class515.field7437.method2043("m" + var25 + "_" + var26, (byte)-71);
                                                   class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                                   ++var26;
                                                }
                                             }

                                             if (!var1) {
                                                ++var25;
                                                break;
                                             }

                                             class515.field7437.method2043("l" + var25 + "_" + var26, (byte)-71);
                                             ++var26;
                                          }
                                       } while(var22 + 1 >= var25);
                                    }
                                 }

                                 label888: {
                                    if (~class622.field9156 == -5) {
                                       class731.method5321(3, (byte)-90);
                                       if (!var1) {
                                          break label888;
                                       }
                                    }

                                    if (class622.field9156 != 8) {
                                       if (class622.field9156 == 10) {
                                          class731.method5321(9, (byte)-107);
                                          if (!var1) {
                                             break label888;
                                          }
                                       }

                                       class731.method5321(11, (byte)-111);
                                       if (class430.field6150.field102 == null) {
                                          break label888;
                                       }

                                       var27 = class40.method350(class138.field1764, class430.field6150.field106, true);
                                       class430.field6150.method55(13256, var27);
                                       if (!var1) {
                                          break label888;
                                       }
                                    }

                                    class731.method5321(7, (byte)-89);
                                 }

                                 class692.method5050(-103);
                                 class581.method4207(50);
                                 class134.method1060((byte)115);
                                 class171.field2384 = true;
                                 if (class252.field3438) {
                                    class756.method5492((byte)106, field6342[11] + (-class637.field9319 + class133.method1054(-29025)) + field6342[7]);
                                    class252.field3438 = false;
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
            } else if (class77.field962[var3] != -1 && class371.field5388[var3] == null) {
               class371.field5388[var3] = class515.field7437.method2037(false, 0, class77.field962[var3]);
               if (class371.field5388[var3] == null) {
                  var2 = false;
                  ++class144.field1834;
               }
            }

            if (class474.field6824[var3] != -1 && class212.field3029[var3] == null) {
               class212.field3029[var3] = class515.field7437.method2062(class636.field9306[var3], class474.field6824[var3], 0, 0);
               if (class212.field3029[var3] == null) {
                  var2 = false;
                  ++class144.field1834;
               }
            }

            if (class784.field11482[var3] != -1 && class668.field9714[var3] == null) {
               class668.field9714[var3] = class515.field7437.method2037(false, 0, class784.field11482[var3]);
               if (class668.field9714[var3] == null) {
                  ++class144.field1834;
                  var2 = false;
               }
            }

            if (class769.field11340[var3] != -1 && class78.field965[var3] == null) {
               class78.field965[var3] = class515.field7437.method2037(false, 0, class769.field11340[var3]);
               if (class78.field965[var3] == null) {
                  ++class144.field1834;
                  var2 = false;
               }
            }

            if (class464.field6705 != null && class356.field4787[var3] == null && ~class464.field6705[var3] != 0) {
               class356.field4787[var3] = class515.field7437.method2062(class636.field9306[var3], class464.field6705[var3], 0, 0);
               if (class356.field4787[var3] == null) {
                  var2 = false;
                  ++class144.field1834;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var29) {
         throw class237.method1823(var29, field6342[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(I)V",
      line = 501
   )
   public final void method862(int arg0) {
      try {
         if (arg0 != -23681) {
            this.field6334 = null;
         }

         ++field6328;
         this.field6332 = class506.method3671((byte)46, this.field6333.field7679, this.field6334);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6342[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(II[BIIII)V",
      line = 512
   )
   public static final void method3270(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field6329;
         if (~arg1 < -1 && !class471.method3415(arg1, true)) {
            throw new IllegalArgumentException("");
         } else if (~arg4 < -1 && !class471.method3415(arg4, true)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class596.method4332(arg5, arg6 ^ 6409);
            int var9 = arg6;
            int var10 = arg4 > arg1 ? arg1 : arg4;
            int var11 = arg1 >> 1;
            int var12 = arg4 >> 1;
            byte[] var13 = arg2;
            byte[] var14 = new byte[var8 * var12 * var11];

            while(true) {
               OpenGL.glTexImage2Dub(arg3, var9, arg0, arg1, arg4, 0, arg5, 5121, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label97: {
                  int var15 = arg1 * var8;
                  byte[] var16 = var14;
                  int var17 = 0;
                  if (var7) {
                     var10000 = var17;
                  } else if (~var8 >= ~var17) {
                     var14 = var13;
                     arg1 = var11;
                     var13 = var16;
                     arg4 = var12;
                     var10 >>= 1;
                     var12 >>= 1;
                     ++var9;
                     var10000 = var11 >> 1;
                     if (!var7) {
                        break label97;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var17 - -var15;
                     int var21 = 0;
                     if (var7 || ~var12 < ~var21) {
                        do {
                           label91: {
                              int var22 = 0;
                              if (var7) {
                                 var10000 = var13[var19];
                              } else if (var11 <= var22) {
                                 var20 += var15;
                                 var10000 = var15 + var19;
                                 if (!var7) {
                                    break label91;
                                 }
                              } else {
                                 var10000 = var13[var19];
                              }

                              while(true) {
                                 int var23 = var10000;
                                 int var24 = var8 + var19;
                                 int var25 = var13[var24] + var23;
                                 var19 = var8 + var24;
                                 int var26 = var13[var20] + var25;
                                 int var27 = var8 + var20;
                                 int var28 = var13[var27] + var26;
                                 var20 = var8 + var27;
                                 var14[var18] = (byte)(var28 >> 2);
                                 var18 += var8;
                                 ++var22;
                                 if (var11 <= var22) {
                                    var20 += var15;
                                    var10000 = var15 + var19;
                                    if (!var7) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var13[var19];
                                 }
                              }
                           }

                           var19 = var10000;
                           ++var21;
                        } while(~var12 < ~var21);
                     }

                     ++var17;
                     if (~var8 >= ~var17) {
                        var14 = var13;
                        arg1 = var11;
                        var13 = var16;
                        arg4 = var12;
                        var10 >>= 1;
                        var12 >>= 1;
                        ++var9;
                        var10000 = var11 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var11 = var10000;
            }
         }
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field6342[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6342[1] : field6342[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(B)V",
      line = 607
   )
   public static void method3271(byte arg0) {
      try {
         if (arg0 < 111) {
            method3271((byte)-71);
         }

         field6337 = null;
         field6338 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6342[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "<init>",
      descriptor = "(Lkf;Lqj;)V",
      line = 625
   )
   public class445(class266 arg0, class538 arg1) {
      try {
         this.field6334 = arg0;
         this.field6333 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6342[5] + (arg0 != null ? field6342[1] : field6342[2]) + ',' + (arg1 != null ? field6342[1] : field6342[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(BZ)V",
      line = 635
   )
   public final void method861(byte arg0, boolean arg1) {
      try {
         int var3 = 122 % ((arg0 - -31) / 44);
         ++field6331;
         if (arg1) {
            int var4 = ~class87.field1142 <= ~class237.field3310 ? class87.field1142 : class237.field3310;
            int var5 = class692.field10185 > class60.field743 ? class692.field10185 : class60.field743;
            int var6 = this.field6332.method960();
            int var7 = this.field6332.method957();
            int var8 = 0;
            int var9 = var4;
            int var10 = var4 * var7 / var6;
            int var11 = (var5 - var10) / 2;
            if (~var5 > ~var10) {
               var11 = 0;
               var10 = var5;
               var9 = var5 * var6 / var7;
               var8 = (-var9 + var4) / 2;
            }

            this.field6332.method3577(var8, var11, var9, var10);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field6342[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
