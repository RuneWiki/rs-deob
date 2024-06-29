import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class361 {
   @OriginalMember(
      owner = "client!tk",
      name = "f",
      descriptor = "Ldw;"
   )
   private class748 field5438 = new class748(64);
   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "Leaa;"
   )
   private class526 field5444;
   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5448 = new String[]{method2819(method2818("r_\u00008\u0016")), method2819(method2818("hAB\u0017")), method2819(method2818("}\u001a\u0000UC")), method2819(method2818("r_\u0000<\u0016")), method2819(method2818("r_\u0000?\u0016")), method2819(method2818("sZT\u001aN")), method2819(method2818("lUI\u000fVc[\\\u001a")), method2819(method2818("iDK\u0015Mh")), method2819(method2818("j[I\u001c[b]@")), method2819(method2818("&D]\u0012Dc\u000e")), method2819(method2818("jGY\u000b\u001ev[]A")), method2819(method2818("jGY\u000bL&DA\b\u0004")), method2819(method2818("|U^")), method2819(method2818("r_\u0000>\u0016")), method2819(method2818("rVG")), method2819(method2818("dXO\u0015U(C]")), method2819(method2818("r_\u00009\u0016")), method2819(method2818("r_\u0000:\u0016")), method2819(method2818("r_\u0000=\u0016")), method2819(method2818("r_\u0000GWh]ZE\u0016"))};
   @OriginalMember(
      owner = "client!tk",
      name = "e",
      descriptor = "I"
   )
   public static int field5439;
   @OriginalMember(
      owner = "client!tk",
      name = "j",
      descriptor = "I"
   )
   public static int field5440;
   @OriginalMember(
      owner = "client!tk",
      name = "i",
      descriptor = "I"
   )
   public static int field5441;
   @OriginalMember(
      owner = "client!tk",
      name = "g",
      descriptor = "I"
   )
   public static int field5442;
   @OriginalMember(
      owner = "client!tk",
      name = "d",
      descriptor = "I"
   )
   public static int field5443;
   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "I"
   )
   public static int field5445;
   @OriginalMember(
      owner = "client!tk",
      name = "h",
      descriptor = "I"
   )
   public static int field5446;
   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "I"
   )
   public static int field5447;

   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2811(int arg0) {
      try {
         class748 var2 = this.field5438;
         synchronized(this.field5438) {
            this.field5438.method5445(697465426);
            if (arg0 != 0) {
               this.method2811(123);
            }
         }

         ++field5441;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5448[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2812(int arg0, int arg1) {
      try {
         ++field5445;
         class748 var3 = this.field5438;
         synchronized(this.field5438) {
            this.field5438.method5453(arg0, false);
            if (arg1 != -2) {
               this.method2813(-126);
            }

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5448[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2813(int arg0) {
      try {
         ++field5439;
         class748 var2 = this.field5438;
         synchronized(this.field5438) {
            if (arg0 >= 116) {
               this.field5438.method5451(-127);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5448[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2814(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field5442;
         if (class777.field11357 != 0 && class777.field11357 != 10) {
            try {
               short var2;
               label647: {
                  if (~class269.field3752 != -1) {
                     var2 = 2000;
                     if (var1 == 0) {
                        break label647;
                     }
                  }

                  var2 = 250;
               }

               if (class515.field7538 && ~class777.field11357 <= -7) {
                  var2 = 6000;
               }

               if (var2 < ++class362.field5455) {
                  label680: {
                     if (class429.field6546 != null) {
                        class429.field6546.method812(2035738378);
                        class429.field6546 = null;
                     }

                     if (~class269.field3752 > -4) {
                        label637: {
                           if (~class448.field6805 == -3) {
                              class351.field5344.method5034(3455);
                              if (var1 == 0) {
                                 break label637;
                              }
                           }

                           class330.field4710.method5034(arg0 + 3344);
                        }

                        class362.field5455 = 0;
                        ++class269.field3752;
                        class777.field11357 = 1;
                        if (var1 == 0) {
                           break label680;
                        }
                     }

                     class777.field11357 = 0;
                     class553.method4089((byte)-76, -5);
                     return;
                  }
               }

               if (~class777.field11357 == -2) {
                  label624: {
                     if (~class448.field6805 == -3) {
                        class189.field2352 = class351.field5344.method5036(class755.field11144, arg0 ^ 468);
                        if (var1 == 0) {
                           break label624;
                        }
                     }

                     class189.field2352 = class330.field4710.method5036(class755.field11144, 443);
                  }

                  class777.field11357 = 2;
               }

               if (arg0 == 111) {
                  if (~class777.field11357 == -3) {
                     if (~class189.field2352.field159 == -3) {
                        throw new IOException();
                     }

                     if (~class189.field2352.field159 != -2) {
                        return;
                     }

                     class180 var3;
                     label613: {
                        class429.field6546 = class25.method163((Socket)class189.field2352.field160, (byte)120, 15000);
                        class189.field2352 = null;
                        class781.method5618(112);
                        var3 = class370.method2879(60);
                        if (class515.field7538) {
                           var3.field2211.method1085(class185.field2307.field11435, (byte)-11);
                           var3.field2211.method1103(0, -32);
                           int var4 = var3.field2211.field1590;
                           var3.field2211.method1094(-64, 651);
                           if (class448.field6805 == 2) {
                              var3.field2211.method1085(class672.field10112 == 13 ? 1 : 0, (byte)-11);
                           }

                           class128 var5 = class427.method3256(9614);
                           var5.method1085(class752.field11122, (byte)-11);
                           var5.method1103((int)(Math.random() * 9.9999999E7D), -97);
                           var5.method1085(class728.field10827, (byte)-11);
                           var5.method1094(arg0 + -237, class225.field2894);
                           int var6 = 0;
                           if (var1 != 0) {
                              var5.method1094(-97, (int)(Math.random() * 9.9999999E7D));
                              ++var6;
                           }

                           while(true) {
                              while(var6 < 6) {
                                 var5.method1094(-97, (int)(Math.random() * 9.9999999E7D));
                                 ++var6;
                              }

                              var5.method1071(class401.field6165, arg0 + -360854244);
                              var5.method1085(class489.field7224.field256, (byte)-11);
                              var5.method1085((int)(9.9999999E7D * Math.random()), (byte)-11);
                              var5.method1040(class791.field11486, class447.field6799, (byte)-84);
                              var3.field2211.method1059(var5.field1590, -2125022416, var5.field1552, 0);
                              var3.field2211.method1068(-var4 + var3.field2211.field1590, (byte)-126);
                              if (var1 == 0) {
                                 if (var1 == 0) {
                                    break label613;
                                 }
                                 break;
                              }

                              ++var6;
                           }
                        }

                        var3.field2211.method1085(class185.field2288.field11435, (byte)-11);
                     }

                     class763.method5527(false, var3);
                     class694.method5045((byte)-105);
                     class777.field11357 = 3;
                  }

                  if (class777.field11357 == 3) {
                     label661: {
                        if (!class429.field6546.method807(1, true)) {
                           return;
                        }

                        class429.field6546.method809(class401.field6163.field1552, (byte)40, 0, 1);
                        int var7 = 255 & class401.field6163.field1552[0];
                        if (~var7 != -1) {
                           class777.field11357 = 0;
                           class553.method4089((byte)-82, var7);
                           class429.field6546.method812(2035738378);
                           class429.field6546 = null;
                           class109.method935((byte)0);
                           return;
                        }

                        if (!class515.field7538) {
                           class777.field11357 = 8;
                           if (var1 == 0) {
                              break label661;
                           }
                        }

                        class777.field11357 = 4;
                     }
                  }

                  if (class777.field11357 == 4) {
                     if (!class429.field6546.method807(2, true)) {
                        return;
                     }

                     class429.field6546.method809(class401.field6163.field1552, (byte)65, 0, 2);
                     class401.field6163.field1590 = 0;
                     class401.field6163.field1590 = class401.field6163.method1038((byte)-121);
                     class777.field11357 = 5;
                  }

                  if (~class777.field11357 == -6) {
                     if (!class429.field6546.method807(class401.field6163.field1590, true)) {
                        return;
                     }

                     class429.field6546.method809(class401.field6163.field1552, (byte)-114, 0, class401.field6163.field1590);
                     class401.field6163.method1084(class327.field4651, (byte)10);
                     class401.field6163.field1590 = 0;
                     String var8 = class401.field6163.method1049((byte)-52);
                     class401.field6163.field1590 = 0;
                     String var9 = field5448[7];
                     if (!client.field4512 || ~class106.method917(var8, (byte)100, class755.field11144, 1, var9).field159 == -3) {
                        class489.method3626(var8, var9, arg0 + -111, true, class755.field11144, class261.field3566.field9464.method4225(104) == 1);
                     }

                     class777.field11357 = 6;
                  }

                  if (~class777.field11357 == -7) {
                     if (!class429.field6546.method807(1, true)) {
                        return;
                     }

                     class429.field6546.method809(class401.field6163.field1552, (byte)-97, 0, 1);
                     if (~(class401.field6163.field1552[0] & 255) == -2) {
                        class777.field11357 = 7;
                     }
                  }

                  if (~class777.field11357 == -8) {
                     if (!class429.field6546.method807(16, true)) {
                        return;
                     }

                     class429.field6546.method809(class401.field6163.field1552, (byte)-115, 0, 16);
                     class401.field6163.field1590 = 16;
                     class401.field6163.method1084(class327.field4651, (byte)10);
                     class401.field6163.field1590 = 0;
                     class685.field10283 = class591.field8737 = class240.method1790(37, class401.field6163.method1063(117));
                     class256.field3450 = class401.field6163.method1063(98);
                     class777.field11357 = 8;
                  }

                  if (class777.field11357 == 8) {
                     class180 var10;
                     label665: {
                        class401.field6163.field1590 = 0;
                        class781.method5618(-64);
                        var10 = class370.method2879(arg0 + -218);
                        class520 var11 = var10.field2211;
                        if (class448.field6805 != 2) {
                           class785 var12;
                           label561: {
                              if (!class515.field7538) {
                                 var12 = class185.field2300;
                                 if (var1 == 0) {
                                    break label561;
                                 }
                              }

                              var12 = class185.field2308;
                           }

                           var11.method1085(var12.field11435, (byte)-11);
                           var11.method1103(0, -38);
                           int var13 = var11.field1590;
                           int var14 = var11.field1590;
                           if (!class515.field7538) {
                              var11.method1094(arg0 ^ -13, 651);
                              class128 var15 = class537.method3982(arg0 ^ 114);
                              var11.method1059(var15.field1590, -2125022416, var15.field1552, 0);
                              var14 = var11.field1590;
                              var11.method1101(class685.field10283, -63);
                           }

                           var11.method1085(class489.field7224.field256, (byte)-11);
                           var11.method1085(class728.field10827, (byte)-11);
                           class23.method151(var11, false);
                           var11.method1101(class37.field401, -113);
                           var11.method1094(-126, class225.field2894);
                           class444.method3356(var11, (byte)37);
                           var11.method1089(var14, (byte)23, class327.field4651, var11.field1590);
                           var11.method1068(var11.field1590 - var13, (byte)-126);
                           if (var1 == 0) {
                              break label665;
                           }
                        }

                        class785 var16;
                        label556: {
                           if (class515.field7538) {
                              var16 = class185.field2308;
                              if (var1 == 0) {
                                 break label556;
                              }
                           }

                           var16 = class185.field2298;
                        }

                        var11.method1085(var16.field11435, (byte)-11);
                        var11.method1103(0, -105);
                        int var17 = var11.field1590;
                        int var18 = var11.field1590;
                        if (!class515.field7538) {
                           var11.method1094(-90, 651);
                           var11.method1085(class672.field10112 == 13 ? 1 : 0, (byte)-11);
                           int var19 = var11.field1590;
                           class128 var20 = class537.method3982(29);
                           var11.method1059(var20.field1590, -2125022416, var20.field1552, 0);
                           var18 = var11.field1590;
                           var11.method1101(class685.field10283, -128);
                        }

                        var11.method1085(class149.field1859, (byte)-11);
                        var11.method1085(class694.method5042(true), (byte)-11);
                        var11.method1103(class207.field2647, -126);
                        var11.method1103(class411.field6305, -81);
                        var11.method1085(class261.field3566.field9435.method72(86), (byte)-11);
                        class23.method151(var11, false);
                        var11.method1101(class37.field401, arg0 + -215);
                        var11.method1094(arg0 ^ -10, class225.field2894);
                        class128 var21 = class261.field3566.method4679(24);
                        var11.method1085(var21.field1590, (byte)-11);
                        var11.method1059(var21.field1590, -2125022416, var21.field1552, 0);
                        class455.field6907 = true;
                        class128 var22 = new class128(class488.field7219.method4555(true));
                        class488.field7219.method4553(var22, -126);
                        var11.method1059(var22.field1552.length, -2125022416, var22.field1552, 0);
                        var11.method1103(class744.field11043, -55);
                        var11.method1071(class768.field11265, -360854133);
                        var11.method1085(class365.field5474 == null ? 0 : 1, (byte)-11);
                        if (class365.field5474 != null) {
                           var11.method1101(class365.field5474, -80);
                        }

                        var11.method1085(class5.method43(field5448[6], -20946) ? 1 : 0, (byte)-11);
                        var11.method1085(client.field4512 ? 1 : 0, (byte)-11);
                        class444.method3356(var11, (byte)-4);
                        var11.method1089(var18, (byte)100, class327.field4651, var11.field1590);
                        var11.method1068(-var17 + var11.field1590, (byte)-126);
                     }

                     class763.method5527(false, var10);
                     class694.method5045((byte)-63);
                     class48.field583 = new class634(class327.field4651);
                     int var23 = 0;
                     if (var1 != 0) {
                        class327.field4651[var23] += 50;
                        ++var23;
                     }

                     while(true) {
                        while(~var23 > -5) {
                           class327.field4651[var23] += 50;
                           ++var23;
                        }

                        class401.field6163.method3839(class327.field4651, arg0 + 144);
                        class777.field11357 = 9;
                        if (var1 == 0) {
                           class327.field4651 = null;
                           break;
                        }

                        ++var23;
                     }
                  }

                  int var24;
                  label735: {
                     if (~class777.field11357 == -10) {
                        label693: {
                           if (!class429.field6546.method807(1, true)) {
                              return;
                           }

                           class429.field6546.method809(class401.field6163.field1552, (byte)75, 0, 1);
                           var24 = 255 & class401.field6163.field1552[0];
                           if (var24 == 21) {
                              class777.field11357 = 12;
                              if (var1 == 0) {
                                 break label693;
                              }
                           }

                           if (var24 == 29) {
                              class777.field11357 = 18;
                              if (var1 == 0) {
                                 break label693;
                              }
                           }

                           if (var24 == 1) {
                              break label735;
                           }

                           if (var24 != 2) {
                              label671: {
                                 if (var24 == 15) {
                                    class61.field759 = -2;
                                    class777.field11357 = 19;
                                    if (var1 == 0) {
                                       break label671;
                                    }
                                 }

                                 if (var24 == 23 && class269.field3752 < 3) {
                                    class777.field11357 = 1;
                                    class362.field5455 = 0;
                                    ++class269.field3752;
                                    class429.field6546.method812(2035738378);
                                    class429.field6546 = null;
                                    return;
                                 }

                                 if (class81.field993 && !class515.field7538 && class752.field11122 != -1 && ~var24 == -36) {
                                    class777.field11357 = 1;
                                    class362.field5455 = 0;
                                    class515.field7538 = true;
                                    class429.field6546.method812(arg0 + 2035738267);
                                    class429.field6546 = null;
                                    return;
                                 }

                                 class777.field11357 = 0;
                                 class553.method4089((byte)-128, var24);
                                 class429.field6546.method812(arg0 + 2035738267);
                                 class429.field6546 = null;
                                 class109.method935((byte)0);
                                 return;
                              }
                           } else {
                              class777.field11357 = 13;
                              if (var1 != 0) {
                                 break label735;
                              }
                           }
                        }
                     }

                     if (class777.field11357 == 11) {
                        class781.method5618(-102);
                        class180 var25 = class370.method2879(arg0 ^ -19);
                        class520 var26 = var25.field2211;
                        var26.method3836(-1, class48.field583);
                        var26.method3838(23928, class185.field2304.field11435);
                        class763.method5527(false, var25);
                        class694.method5045((byte)-102);
                        class777.field11357 = 9;
                        return;
                     }

                     if (class777.field11357 == 12) {
                        if (!class429.field6546.method807(1, true)) {
                           return;
                        }

                        class429.field6546.method809(class401.field6163.field1552, (byte)120, 0, 1);
                        int var27 = 255 & class401.field6163.field1552[0];
                        class669.field10062 = var27 * 50;
                        class777.field11357 = 0;
                        class553.method4089((byte)-117, 21);
                        class429.field6546.method812(2035738378);
                        class429.field6546 = null;
                        class109.method935((byte)0);
                        return;
                     }

                     if (~class777.field11357 == -19) {
                        if (!class429.field6546.method807(1, true)) {
                           return;
                        }

                        class429.field6546.method809(class401.field6163.field1552, (byte)-18, 0, 1);
                        class619.field9030 = class401.field6163.field1552[0] & 255;
                        class777.field11357 = 0;
                        class553.method4089((byte)-82, 29);
                        class429.field6546.method812(2035738378);
                        class429.field6546 = null;
                        class109.method935((byte)0);
                        return;
                     }

                     if (class777.field11357 == 13) {
                        if (!class429.field6546.method807(1, true)) {
                           return;
                        }

                        class429.field6546.method809(class401.field6163.field1552, (byte)-113, 0, 1);
                        class618.field9023 = class401.field6163.field1552[0] & 255;
                        class777.field11357 = 14;
                        return;
                     }

                     label723: {
                        if (class777.field11357 == 14) {
                           label674: {
                              class520 var28 = class401.field6163;
                              if (class448.field6805 == 2) {
                                 if (!class429.field6546.method807(class618.field9023, true)) {
                                    return;
                                 }

                                 class429.field6546.method809(var28.field1552, (byte)49, 0, class618.field9023);
                                 var28.field1590 = 0;
                                 class445.field6773 = var28.method1104(255);
                                 class676.field10181 = var28.method1104(255);
                                 class526.field7669 = ~var28.method1104(255) == -2;
                                 class731.field10853 = ~var28.method1104(arg0 + 144) == -2;
                                 class447.field6797 = ~var28.method1104(255) == -2;
                                 class202.field2543 = ~var28.method1104(255) == -2;
                                 class741.field10996 = var28.method1038((byte)-97);
                                 class739.field10966 = ~var28.method1104(arg0 ^ 144) == -2;
                                 class277.field3872 = var28.method1052((byte)-66);
                                 class71.field894 = ~var28.method1104(arg0 ^ 144) == -2;
                                 class151.field1896.method5074(arg0 + 32257, class71.field894);
                                 class54.field616.method1693((byte)-53, class71.field894);
                                 class536.field7845.method3366(class71.field894, 5);
                                 if (var1 == 0) {
                                    break label674;
                                 }
                              }

                              if (!class429.field6546.method807(class618.field9023, true)) {
                                 return;
                              }

                              class429.field6546.method809(var28.field1552, (byte)26, 0, class618.field9023);
                              var28.field1590 = 0;
                              class445.field6773 = var28.method1104(arg0 + 144);
                              class676.field10181 = var28.method1104(255);
                              class526.field7669 = var28.method1104(255) == 1;
                              class731.field10853 = ~var28.method1104(arg0 ^ 144) == -2;
                              class447.field6797 = var28.method1104(arg0 + 144) == 1;
                              class569.field8486 = var28.method1063(92);
                              class182.field2260 = -class188.method1462(true) + class569.field8486 - var28.method1090(-1);
                              int var29 = var28.method1104(255);
                              class739.field10966 = ~(var29 & 1) != -1;
                              class321.field4584 = ~(var29 & 2) != -1;
                              class774.field11329 = var28.method1041(4758);
                              class748.field11095 = var28.method1038((byte)-96);
                              class553.field8202 = var28.method1038((byte)-118);
                              class214.field2718 = var28.method1038((byte)-125);
                              class603.field8849 = var28.method1041(4758);
                              class71.field903 = class755.field11144.method5210(22, class603.field8849);
                              class598.field8802 = var28.method1104(255);
                              class102.field1248 = var28.method1038((byte)-110);
                              class429.field6552 = var28.method1038((byte)-104);
                              class788.field11459 = var28.method1104(arg0 + 144) == 1;
                              class693.field10418.field10332 = class693.field10418.field10316 = class703.field10540 = var28.method1049((byte)125);
                              class126.field1521 = var28.method1104(255);
                              class743.field11022 = var28.method1041(arg0 ^ 4857);
                              class64.field794 = var28.method1104(255) == 1;
                              class732.field10859 = new class693();
                              class732.field10859.field10414 = var28.method1038((byte)-95);
                              if (class732.field10859.field10414 == 65535) {
                                 class732.field10859.field10414 = -1;
                              }

                              class732.field10859.field10410 = var28.method1049((byte)-4);
                              if (class487.field7208 != class281.field3917) {
                                 class732.field10859.field10409 = class732.field10859.field10414 + 40000;
                                 class732.field10859.field10407 = 50000 - -class732.field10859.field10414;
                              }

                              if (class487.field7208 != class266.field3653 && (class547.field8115 != class487.field7208 || class445.field6773 < 2) && (class351.field5344.method5037(true, class478.field7106) || class351.field5344.method5037(true, class89.field1080))) {
                                 class478.method3543(-1);
                              }
                           }

                           label729: {
                              if (class526.field7669 && !class447.field6797 || class739.field10966) {
                                 try {
                                    class359.method2803(field5448[12], class238.field3003, (byte)-80);
                                    break label729;
                                 } catch (Throwable var37) {
                                    if (!class712.field10628) {
                                       break label729;
                                    }

                                    try {
                                       class238.field3003.getAppletContext().showDocument(new URL(class238.field3003.getCodeBase(), field5448[15]), field5448[14]);
                                       break label729;
                                    } catch (Exception var36) {
                                       if (var1 == 0) {
                                          break label729;
                                       }
                                    }
                                 }
                              }

                              try {
                                 class359.method2803(field5448[5], class238.field3003, (byte)-99);
                              } catch (Throwable var35) {
                              }
                           }

                           if (class487.field7208 == class281.field3917) {
                              try {
                                 class359.method2803(field5448[8], class238.field3003, (byte)-126);
                              } catch (Throwable var34) {
                              }
                           }

                           if (~class448.field6805 != -3) {
                              break label723;
                           }

                           class777.field11357 = 16;
                           if (var1 != 0) {
                              break label723;
                           }
                        }

                        if (class777.field11357 == 16) {
                           if (!class429.field6546.method807(3, true)) {
                              return;
                           }

                           class429.field6546.method809(class401.field6163.field1552, (byte)-104, 0, 3);
                           class777.field11357 = 17;
                        }

                        if (~class777.field11357 == -18) {
                           class520 var30 = class401.field6163;
                           var30.field1590 = 0;
                           if (var30.method3837(arg0 + 13)) {
                              if (!class429.field6546.method807(1, true)) {
                                 return;
                              }

                              class429.field6546.method809(var30.field1552, (byte)-111, 3, 1);
                           }

                           class239.field3045 = class100.method879((byte)124)[var30.method3830((byte)-108)];
                           class61.field759 = var30.method1038((byte)-113);
                           class777.field11357 = 15;
                        }

                        if (class777.field11357 == 15) {
                           if (!class429.field6546.method807(class61.field759, true)) {
                              return;
                           }

                           int var31;
                           label438: {
                              class429.field6546.method809(class401.field6163.field1552, (byte)-107, 0, class61.field759);
                              class401.field6163.field1590 = 0;
                              class777.field11357 = 0;
                              var31 = class61.field759;
                              class553.method4089((byte)-93, 2);
                              class234.method1758(0);
                              class333.method2528(class401.field6163, 0);
                              class465.field6983 = -1;
                              if (class674.field10130 != class239.field3045) {
                                 class574.method4246(false);
                                 if (var1 == 0) {
                                    break label438;
                                 }
                              }

                              class58.method486((byte)70);
                           }

                           if (class401.field6163.field1590 != var31) {
                              throw new RuntimeException(field5448[10] + class401.field6163.field1590 + field5448[9] + var31);
                           }

                           class239.field3045 = null;
                           return;
                        }

                        if (class777.field11357 == 19) {
                           if (class61.field759 == -2) {
                              if (!class429.field6546.method807(2, true)) {
                                 return;
                              }

                              class429.field6546.method809(class401.field6163.field1552, (byte)-102, 0, 2);
                              class401.field6163.field1590 = 0;
                              class61.field759 = class401.field6163.method1038((byte)-123);
                           }

                           if (!class429.field6546.method807(class61.field759, true)) {
                              return;
                           }

                           class429.field6546.method809(class401.field6163.field1552, (byte)-123, 0, class61.field759);
                           class401.field6163.field1590 = 0;
                           class777.field11357 = 0;
                           int var32 = class61.field759;
                           class553.method4089((byte)-123, 15);
                           class147.method1215((byte)110);
                           class333.method2528(class401.field6163, arg0 ^ 111);
                           if (~class401.field6163.field1590 != ~var32) {
                              throw new RuntimeException(field5448[11] + class401.field6163.field1590 + field5448[9] + var32);
                           }

                           class239.field3045 = null;
                           return;
                        }

                        return;
                     }

                     class777.field11357 = 0;
                     class553.method4089((byte)-125, 2);
                     class310.method2341(arg0 + -234);
                     class317.method2411(7, (byte)-89);
                     class239.field3045 = null;
                     return;
                  }

                  class777.field11357 = 10;
                  class553.method4089((byte)-74, var24);
               }
            } catch (IOException var38) {
               if (class429.field6546 != null) {
                  class429.field6546.method812(2035738378);
                  class429.field6546 = null;
               }

               if (~class269.field3752 <= -4) {
                  class777.field11357 = 0;
                  class553.method4089((byte)-76, -4);
                  class109.method935((byte)0);
               } else {
                  label428: {
                     if (~class448.field6805 != -3) {
                        class330.field4710.method5034(3455);
                        if (var1 == 0) {
                           break label428;
                        }
                     }

                     class351.field5344.method5034(3455);
                  }

                  class362.field5455 = 0;
                  class777.field11357 = 1;
                  ++class269.field3752;
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class670.method4877(var39, field5448[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(II)Lth;"
   )
   public final class621 method2815(int arg0, int arg1) {
      try {
         ++field5440;
         class748 var3 = this.field5438;
         class621 var4;
         synchronized(this.field5438) {
            var4 = (class621)this.field5438.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field5444;
            byte[] var6;
            synchronized(this.field5444) {
               var6 = this.field5444.method3899(-121, arg0, 35);
            }

            class621 var7 = new class621();
            if (arg1 != -30204) {
               method2814((byte)2);
            }

            if (var6 != null) {
               var7.method4485(new class128(var6), (byte)-24);
            }

            var7.method4486((byte)-97);
            class748 var8 = this.field5438;
            synchronized(this.field5438) {
               this.field5438.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5448[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2816(int arg0, int arg1, int arg2) {
      try {
         ++field5447;
         class403 var3 = class453.method3410((long)arg2, true, 16);
         var3.method3093(22144);
         if (arg1 > -76) {
            method2814((byte)-38);
         }

         var3.field6185 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5448[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(Ljfa;I)V"
   )
   public static final void method2817(class303 arg0, int arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 == -1885) {
            ++field5446;
            if (arg0 != null) {
               class459.field6947.method4060(23, arg0);
               ++class354.field5375;
               Object var3 = null;
               class488 var4;
               if (!arg0.field4322 && !"".equals(arg0.field4318)) {
                  class488 var10000;
                  long var5;
                  label75: {
                     var5 = arg0.field4330;
                     var4 = (class488)class292.field4074.method5681(var5, -1);
                     if (var2 != 0) {
                        var10000 = var4;
                     } else if (var4 == null) {
                        var10000 = var4;
                        if (var2 == 0) {
                           break label75;
                        }
                     } else {
                        var10000 = var4;
                     }

                     label74:
                     while(true) {
                        while(var10000.field7213.equals(arg0.field4318)) {
                           var10000 = var4;
                           if (var2 == 0) {
                              break label74;
                           }
                        }

                        var4 = (class488)class292.field4074.method5673(-107);
                        if (var4 == null) {
                           var10000 = var4;
                           if (var2 == 0) {
                              break;
                           }
                        } else {
                           var10000 = var4;
                        }
                     }
                  }

                  if (var10000 == null) {
                     var4 = (class488)class659.field9558.method5454(var5, 18261);
                     if (var4 != null && !var4.field7213.equals(arg0.field4318)) {
                        var4 = null;
                     }

                     if (var4 == null) {
                        var4 = new class488(arg0.field4318);
                     }

                     class292.field4074.method5682(var5, var4, (byte)7);
                     ++class554.field8214;
                  }
               } else {
                  var4 = new class488(arg0.field4318);
                  ++class554.field8214;
               }

               if (var4.method3619(false, arg0)) {
                  class556.method4118((byte)-55, var4);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5448[3] + (arg0 != null ? field5448[2] : field5448[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class361(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field5444 = arg2;
         if (this.field5444 != null) {
            this.field5444.method3875(0, 35);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5448[19] + (arg0 != null ? field5448[2] : field5448[1]) + ',' + arg1 + ',' + (arg2 != null ? field5448[2] : field5448[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2818(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2819(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
