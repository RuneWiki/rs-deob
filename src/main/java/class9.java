import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class9 {
   @OriginalMember(
      owner = "client!wt",
      name = "l",
      descriptor = "Lfn;"
   )
   private class96 field150 = new class96();
   @OriginalMember(
      owner = "client!wt",
      name = "f",
      descriptor = "Lom;"
   )
   private class722 field163 = new class722();
   @OriginalMember(
      owner = "client!wt",
      name = "c",
      descriptor = "I"
   )
   private int field161;
   @OriginalMember(
      owner = "client!wt",
      name = "d",
      descriptor = "I"
   )
   private int field158;
   @OriginalMember(
      owner = "client!wt",
      name = "g",
      descriptor = "Lbga;"
   )
   private class398 field159;
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field164 = new String[]{method81(method80("&\u0005% 2")), method81(method80("*_%Hg")), method81(method80("3^gb")), method81(method80("*_%Jg")), method81(method80("1Dli*9Be")), method81(method80("1X|~=}[d}u")), method81(method80(")Ib")), method81(method80("(Eqo?")), method81(method80("7Jlz'8Dyo")), method81(method80("?Gj`$s\\x")), method81(method80("*_%Lg")), method81(method80("}[xg58\u0011")), method81(method80("1X|~o-Dx4")), method81(method80("'J{")), method81(method80("\u0011Dlg!}X\u007fk?}\u001a3.!2_+x.1Bo.)2Y+~*3Ob`(\u000fNx~ 3Xn3")), method81(method80("2[n`<3")), method81(method80("*_%Mg")), method81(method80("*_%Kg")), method81(method80("*_%Ig")), method81(method80("*_%2&3B\u007f0g"))};
   @OriginalMember(
      owner = "client!wt",
      name = "e",
      descriptor = "Lfm;"
   )
   public static class164 field156 = new class164(26, 2);
   @OriginalMember(
      owner = "client!wt",
      name = "i",
      descriptor = "Lfm;"
   )
   public static class164 field157 = new class164(54, -1);
   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "I"
   )
   public static int field151;
   @OriginalMember(
      owner = "client!wt",
      name = "n",
      descriptor = "I"
   )
   public static int field152;
   @OriginalMember(
      owner = "client!wt",
      name = "j",
      descriptor = "I"
   )
   public static int field153;
   @OriginalMember(
      owner = "client!wt",
      name = "m",
      descriptor = "I"
   )
   public static int field154;
   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "I"
   )
   public static int field155;
   @OriginalMember(
      owner = "client!wt",
      name = "h",
      descriptor = "Lnaa;"
   )
   public static class621 field162;
   @OriginalMember(
      owner = "client!wt",
      name = "k",
      descriptor = "Lro;"
   )
   public static class759 field160;

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(BJLfn;)V"
   )
   public final void method73(byte arg0, long arg1, class96 arg2) {
      try {
         label29: {
            if (~this.field161 == -1) {
               class96 var5 = this.field163.method5229((byte)-126);
               var5.method2140((byte)123);
               var5.method962(false);
               if (this.field150 != var5) {
                  break label29;
               }

               class96 var6 = this.field163.method5229((byte)-126);
               var6.method2140((byte)-89);
               var6.method962(false);
               if (!client.field10022) {
                  break label29;
               }
            }

            --this.field161;
         }

         ++field151;
         this.field159.method3098(arg1, arg2, -1);
         if (arg0 == 108) {
            this.field163.method5224(arg2, 73);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field164[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field164[0] : field164[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(ZJ)V"
   )
   public final void method74(boolean arg0, long arg1) {
      try {
         ++field154;
         if (!arg0) {
            this.field163 = null;
         }

         class96 var4 = (class96)this.field159.method3101(-1, arg1);
         if (var4 != null) {
            var4.method2140((byte)88);
            var4.method962(false);
            ++this.field161;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field164[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "()V"
   )
   public static final void method75() {
      while(true) {
         boolean var0 = true;

         for(int var1 = 0; var1 < class468.field6786.length; ++var1) {
            if (!class468.field6786[var1].method973()) {
               synchronized(class468.field6786[var1]) {
                  class468.field6786[var1].notify();
               }

               var0 = false;
            } else {
               class768.field11023[var1] = class468.field6786[var1].method972();
            }
         }

         if (var0) {
            class468.field6786[class468.field6786.length - 1].method978();
            class13.method107(1);

            while(true) {
               boolean var3 = true;

               for(int var4 = 0; var4 < class468.field6786.length - 1; ++var4) {
                  if (!class468.field6786[var4].method973()) {
                     synchronized(class468.field6786[var4]) {
                        class468.field6786[var4].notify();
                     }

                     var3 = false;
                  }
               }

               if (var3) {
                  for(int var6 = 1; var6 < class468.field6786.length - 2; ++var6) {
                     class468.field6786[var6].method978();
                  }

                  class13.method107(2);

                  while(!class468.field6786[0].method973()) {
                     synchronized(class468.field6786[0]) {
                        class468.field6786[0].notify();
                     }

                     try {
                        class97.method968(32353, 1L);
                     } catch (Exception var9) {
                     }
                  }

                  class468.field6786[0].method978();
                  return;
               }

               try {
                  class97.method968(32353, 1L);
               } catch (Exception var12) {
               }
            }
         }

         try {
            class97.method968(32353, 1L);
         } catch (Exception var8) {
         }
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method76(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         ++field153;
         if (class528.field7463 != 0 && ~class528.field7463 != -11) {
            try {
               short var2;
               label672: {
                  if (class116.field1840 == 0) {
                     var2 = 250;
                     if (!var1) {
                        break label672;
                     }
                  }

                  var2 = 2000;
               }

               if (arg0) {
                  method75();
               }

               if (class123.field1977 && ~class528.field7463 <= -7) {
                  var2 = 6000;
               }

               if (~class793.field11537 != -3 || class528.field7463 != 20 && class94.field1536 != 42) {
                  ++class3.field23;
               }

               if (var2 < class3.field23) {
                  class527.field7461.method2114(0);
                  if (class116.field1840 >= 3) {
                     class528.field7463 = 0;
                     class547.method4096(-5, (byte)-78);
                     return;
                  }

                  label654: {
                     if (~class793.field11537 == -3) {
                        class750.field10662.method1415((byte)-126);
                        if (!var1) {
                           break label654;
                        }
                     }

                     class432.field6349.method1415((byte)-47);
                  }

                  ++class116.field1840;
                  class3.field23 = 0;
                  class528.field7463 = 1;
               }

               if (class528.field7463 == 1) {
                  label647: {
                     if (~class793.field11537 != -3) {
                        class527.field7461.field3707 = class432.field6349.method1416((byte)-4, class720.field10318);
                        if (!var1) {
                           break label647;
                        }
                     }

                     class527.field7461.field3707 = class750.field10662.method1416((byte)-4, class720.field10318);
                  }

                  class528.field7463 = 2;
               }

               if (~class528.field7463 == -3) {
                  if (class527.field7461.field3707.field1526 == 2) {
                     throw new IOException();
                  }

                  if (~class527.field7461.field3707.field1526 != -2) {
                     return;
                  }

                  class381 var3;
                  label637: {
                     class527.field7461.field3713 = class150.method1461(0, 15000, (Socket)class527.field7461.field3707.field1525);
                     class527.field7461.field3707 = null;
                     class527.field7461.method2110((byte)67);
                     var3 = class563.method4194((byte)-112);
                     if (class123.field1977) {
                        var3.field5570.method656((byte)-93, class765.field10981.field11484);
                        var3.field5570.method653(0, -62);
                        int var4 = var3.field5570.field945;
                        var3.field5570.method674(-44, 660);
                        if (class793.field11537 == 2) {
                           var3.field5570.method656((byte)113, class394.field5712 == 14 ? 1 : 0);
                        }

                        class65 var5 = class228.method2028(false);
                        var5.method656((byte)-128, class777.field11335);
                        var5.method653((int)(Math.random() * 9.9999999E7D), -73);
                        var5.method656((byte)-123, class777.field11340);
                        var5.method674(-92, class302.field4544);
                        int var6 = 0;
                        if (var1) {
                           var5.method674(-39, (int)(9.9999999E7D * Math.random()));
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 6) {
                              var5.method674(-39, (int)(9.9999999E7D * Math.random()));
                              ++var6;
                           }

                           var5.method686(-1927998584, class297.field4414);
                           var5.method656((byte)-110, class343.field5054.field5700);
                           var5.method656((byte)-117, (int)(Math.random() * 9.9999999E7D));
                           var5.method662(false, class719.field10294, class702.field10115);
                           var3.field5570.method694(0, var5.field945, var5.field942, -7033);
                           var3.field5570.method670((byte)-7, -var4 + var3.field5570.field945);
                           if (!var1) {
                              if (!var1) {
                                 break label637;
                              }
                              break;
                           }

                           ++var6;
                        }
                     }

                     var3.field5570.method656((byte)-124, class765.field10969.field11484);
                  }

                  class527.field7461.method2111(14024, var3);
                  class527.field7461.method2115((byte)0);
                  class528.field7463 = 3;
               }

               if (~class528.field7463 == -4) {
                  label686: {
                     if (!class527.field7461.field3713.method2549(1, 29842)) {
                        return;
                     }

                     class527.field7461.field3713.method2551(1, 103, 0, class527.field7461.field3719.field942);
                     int var7 = 255 & class527.field7461.field3719.field942[0];
                     if (var7 != 0) {
                        class528.field7463 = 0;
                        class547.method4096(var7, (byte)-47);
                        class527.field7461.method2114(0);
                        class547.method4097(7);
                        return;
                     }

                     if (!class123.field1977) {
                        class528.field7463 = 8;
                        if (!var1) {
                           break label686;
                        }
                     }

                     class528.field7463 = 4;
                  }
               }

               if (~class528.field7463 == -5) {
                  if (!class527.field7461.field3713.method2549(2, 29842)) {
                     return;
                  }

                  class527.field7461.field3713.method2551(2, 107, 0, class527.field7461.field3719.field942);
                  class527.field7461.field3719.field945 = 0;
                  class527.field7461.field3719.field945 = class527.field7461.field3719.method685(-2);
                  class528.field7463 = 5;
               }

               if (~class528.field7463 == -6) {
                  if (!class527.field7461.field3713.method2549(class527.field7461.field3719.field945, 29842)) {
                     return;
                  }

                  class527.field7461.field3713.method2551(class527.field7461.field3719.field945, 93, 0, class527.field7461.field3719.field942);
                  class527.field7461.field3719.method644(class536.field7523, -125);
                  class527.field7461.field3719.field945 = 0;
                  String var8 = class527.field7461.field3719.method698((byte)109);
                  class527.field7461.field3719.field945 = 0;
                  String var9 = field164[15];
                  if (!class202.field2887 || ~class76.method842(class720.field10318, var9, 1, (byte)101, var8).field1526 == -3) {
                     class727.method5259(var9, var8, true, class476.field6870.field9109.method4676(-69) == 1, 3009, class720.field10318);
                  }

                  class528.field7463 = 6;
               }

               if (~class528.field7463 == -7) {
                  if (!class527.field7461.field3713.method2549(1, 29842)) {
                     return;
                  }

                  class527.field7461.field3713.method2551(1, 97, 0, class527.field7461.field3719.field942);
                  if (~(255 & class527.field7461.field3719.field942[0]) == -2) {
                     class528.field7463 = 7;
                  }
               }

               if (class528.field7463 == 7) {
                  if (!class527.field7461.field3713.method2549(16, 29842)) {
                     return;
                  }

                  class527.field7461.field3713.method2551(16, 121, 0, class527.field7461.field3719.field942);
                  class527.field7461.field3719.field945 = 16;
                  class527.field7461.field3719.method644(class536.field7523, -123);
                  class527.field7461.field3719.field945 = 0;
                  class226.field3216 = class704.field10134 = class29.method363(class527.field7461.field3719.method680(-129), 37);
                  class396.field5869 = class527.field7461.field3719.method680(-129);
                  class528.field7463 = 8;
               }

               if (~class528.field7463 == -9) {
                  class381 var10;
                  label690: {
                     class527.field7461.field3719.field945 = 0;
                     class527.field7461.method2110((byte)117);
                     var10 = class563.method4194((byte)-95);
                     class408 var11 = var10.field5570;
                     if (~class793.field11537 == -3) {
                        class788 var12;
                        label585: {
                           if (!class123.field1977) {
                              var12 = class765.field10972;
                              if (!var1) {
                                 break label585;
                              }
                           }

                           var12 = class765.field10982;
                        }

                        var11.method656((byte)-103, var12.field11484);
                        var11.method653(0, -108);
                        int var13 = var11.field945;
                        int var14 = var11.field945;
                        if (!class123.field1977) {
                           var11.method674(-57, 660);
                           var11.method656((byte)-97, class394.field5712 == 14 ? 1 : 0);
                           int var15 = var11.field945;
                           class65 var16 = class225.method1931((byte)89);
                           var11.method694(0, var16.field945, var16.field942, -7033);
                           var14 = var11.field945;
                           var11.method658(class226.field3216, -47);
                        }

                        var11.method656((byte)-90, class585.field8203);
                        var11.method656((byte)-106, class40.method477(false));
                        var11.method653(class557.field7909, -90);
                        var11.method653(class140.field2243, -113);
                        var11.method656((byte)65, class476.field6870.field9146.method4480(-66));
                        class531.method3966(var11, (byte)-1);
                        var11.method658(class432.field6350, -127);
                        var11.method674(-107, class302.field4544);
                        class65 var17 = class476.field6870.method4709(-5651);
                        var11.method656((byte)-124, var17.field945);
                        var11.method694(0, var17.field945, var17.field942, -7033);
                        class664.field9354 = true;
                        class65 var18 = new class65(class223.field3173.method3214((byte)-56));
                        class223.field3173.method3216(var18, 113);
                        var11.method694(0, var18.field942.length, var18.field942, -7033);
                        var11.method674(-59, class478.field6882);
                        var11.method686(-1927998584, class635.field9003);
                        var11.method656((byte)-104, class537.field7555 == null ? 0 : 1);
                        if (class537.field7555 != null) {
                           var11.method658(class537.field7555, -36);
                        }

                        var11.method656((byte)91, class646.method4703((byte)115, field164[8]) ? 1 : 0);
                        var11.method656((byte)-101, class202.field2887 ? 1 : 0);
                        class228.method2027((byte)119, var11);
                        var11.method657(var11.field945, class536.field7523, var14, (byte)122);
                        var11.method670((byte)-7, -var13 + var11.field945);
                        if (!var1) {
                           break label690;
                        }
                     }

                     class788 var19;
                     label580: {
                        if (class123.field1977) {
                           var19 = class765.field10982;
                           if (!var1) {
                              break label580;
                           }
                        }

                        var19 = class765.field10974;
                     }

                     var11.method656((byte)105, var19.field11484);
                     var11.method653(0, -94);
                     int var20 = var11.field945;
                     int var21 = var11.field945;
                     if (!class123.field1977) {
                        var11.method674(-125, 660);
                        class65 var22 = class225.method1931((byte)125);
                        var11.method694(0, var22.field945, var22.field942, -7033);
                        var21 = var11.field945;
                        var11.method658(class226.field3216, -32);
                     }

                     var11.method656((byte)39, class343.field5054.field5700);
                     var11.method656((byte)42, class777.field11340);
                     class531.method3966(var11, (byte)-1);
                     var11.method658(class432.field6350, -82);
                     var11.method674(-25, class302.field4544);
                     class228.method2027((byte)123, var11);
                     var11.method657(var11.field945, class536.field7523, var21, (byte)120);
                     var11.method670((byte)-7, -var20 + var11.field945);
                  }

                  class527.field7461.method2111(14024, var10);
                  class527.field7461.method2115((byte)0);
                  class527.field7461.field3718 = new class292(class536.field7523);
                  int var23 = 0;
                  if (var1) {
                     class536.field7523[var23] += 50;
                     ++var23;
                  }

                  while(true) {
                     while(~var23 > -5) {
                        class536.field7523[var23] += 50;
                        ++var23;
                     }

                     class527.field7461.field3719.method3198(255, class536.field7523);
                     class528.field7463 = 9;
                     if (!var1) {
                        class536.field7523 = null;
                        break;
                     }

                     ++var23;
                  }
               }

               if (class528.field7463 == 9) {
                  label694: {
                     if (!class527.field7461.field3713.method2549(1, 29842)) {
                        return;
                     }

                     class527.field7461.field3713.method2551(1, 97, 0, class527.field7461.field3719.field942);
                     int var24 = 255 & class527.field7461.field3719.field942[0];
                     if (var24 == 21) {
                        class528.field7463 = 12;
                        if (!var1) {
                           break label694;
                        }
                     }

                     if (var24 != 29 && var24 != 45) {
                        if (~var24 == -2) {
                           class528.field7463 = 10;
                           class547.method4096(var24, (byte)-54);
                           return;
                        }

                        if (~var24 != -3) {
                           if (~var24 != -16) {
                              if (~var24 == -24 && class116.field1840 < 3) {
                                 class3.field23 = 0;
                                 ++class116.field1840;
                                 class528.field7463 = 1;
                                 class527.field7461.field3713.method2554(false);
                                 class527.field7461.field3713 = null;
                                 return;
                              }

                              if (var24 != 42) {
                                 if (class76.field1214 && !class123.field1977 && ~class777.field11335 != 0 && var24 == 35) {
                                    class528.field7463 = 1;
                                    class123.field1977 = true;
                                    class3.field23 = 0;
                                    class527.field7461.field3713.method2554(arg0);
                                    class527.field7461.field3713 = null;
                                    return;
                                 }

                                 class528.field7463 = 0;
                                 class547.method4096(var24, (byte)-22);
                                 class527.field7461.field3713.method2554(false);
                                 class527.field7461.field3713 = null;
                                 class547.method4097(7);
                                 return;
                              }

                              class528.field7463 = 20;
                              class547.method4096(var24, (byte)-109);
                              return;
                           }

                           class528.field7463 = 19;
                           class527.field7461.field3721 = -2;
                           if (!var1) {
                              break label694;
                           }
                        }

                        class528.field7463 = 13;
                        if (!var1) {
                           break label694;
                        }
                     }

                     class91.field1518 = var24;
                     class528.field7463 = 18;
                  }
               }

               if (class528.field7463 == 11) {
                  class527.field7461.method2110((byte)65);
                  class381 var25 = class563.method4194((byte)-114);
                  class408 var26 = var25.field5570;
                  var26.method3199((byte)96, class527.field7461.field3718);
                  var26.method3200(class765.field10978.field11484, 792388743);
                  class527.field7461.method2111(14024, var25);
                  class527.field7461.method2115((byte)0);
                  class528.field7463 = 9;
               } else if (~class528.field7463 == -13) {
                  if (class527.field7461.field3713.method2549(1, 29842)) {
                     class527.field7461.field3713.method2551(1, 119, 0, class527.field7461.field3719.field942);
                     int var27 = class527.field7461.field3719.field942[0] & 255;
                     class528.field7463 = 0;
                     class711.field10211 = var27 * 50;
                     class547.method4096(21, (byte)-102);
                     class527.field7461.field3713.method2554(false);
                     class527.field7461.field3713 = null;
                     class547.method4097(7);
                  }
               } else if (class528.field7463 == 20) {
                  if (class527.field7461.field3713.method2549(2, 29842)) {
                     class527.field7461.field3713.method2551(2, 111, 0, class527.field7461.field3719.field942);
                     class734.field10439 = ((255 & class527.field7461.field3719.field942[0]) << 8) + (class527.field7461.field3719.field942[1] & 255);
                     class528.field7463 = 9;
                  }
               } else if (~class528.field7463 == -19) {
                  label697: {
                     if (class91.field1518 != 29) {
                        if (class91.field1518 != 45) {
                           throw new IllegalStateException(field164[14] + class91.field1518);
                        }

                        if (!class527.field7461.field3713.method2549(3, 29842)) {
                           return;
                        }

                        class527.field7461.field3713.method2551(3, 90, 0, class527.field7461.field3719.field942);
                        class268.field4090 = ((255 & class527.field7461.field3719.field942[1]) << 8) + (class527.field7461.field3719.field942[2] & 255);
                        class312.field4676 = class527.field7461.field3719.field942[0] & 255;
                        if (!var1) {
                           break label697;
                        }
                     }

                     if (!class527.field7461.field3713.method2549(1, 29842)) {
                        return;
                     }

                     class527.field7461.field3713.method2551(1, 96, 0, class527.field7461.field3719.field942);
                     class312.field4676 = 255 & class527.field7461.field3719.field942[0];
                  }

                  class528.field7463 = 0;
                  class547.method4096(class91.field1518, (byte)-87);
                  class527.field7461.field3713.method2554(arg0);
                  class527.field7461.field3713 = null;
                  class547.method4097(7);
               } else if (class528.field7463 == 13) {
                  if (class527.field7461.field3713.method2549(1, 29842)) {
                     class527.field7461.field3713.method2551(1, 87, 0, class527.field7461.field3719.field942);
                     class110.field1711 = class527.field7461.field3719.field942[0] & 255;
                     class528.field7463 = 14;
                  }
               } else {
                  if (~class528.field7463 == -15) {
                     label701: {
                        class408 var28 = class527.field7461.field3719;
                        if (class793.field11537 != 2) {
                           if (!class527.field7461.field3713.method2549(class110.field1711, 29842)) {
                              return;
                           }

                           class527.field7461.field3713.method2551(class110.field1711, 99, 0, var28.field942);
                           var28.field945 = 0;
                           class33.field489 = var28.method665(false);
                           class7.field133 = var28.method665(false);
                           class74.field1183 = var28.method665(false) == 1;
                           class286.field4290 = var28.method665(arg0) == 1;
                           class238.field3673 = var28.method665(false) == 1;
                           class61.field872 = var28.method680(-129);
                           class397.field5878 = class61.field872 - class604.method4452(-123) - var28.method696(-952918624);
                           int var29 = var28.method665(false);
                           class425.field6225 = (1 & var29) != 0;
                           class130.field2099 = ~(var29 & 2) != -1;
                           class37.field545 = var28.method701(255);
                           class697.field10065 = ~var28.method665(false) == -2;
                           class712.field10228 = var28.method701(255);
                           class215.field3076 = var28.method685(-2);
                           class489.field7002 = var28.method685(-2);
                           class638.field9015 = var28.method685(-2);
                           class230.field3579 = var28.method701(255);
                           class113.field1794 = class720.field10318.method879(class230.field3579, (byte)-123);
                           class414.field6073 = var28.method665(false);
                           class558.field7925 = var28.method685(-2);
                           class174.field2596 = var28.method685(-2);
                           class1.field10 = var28.method665(false) == 1;
                           class117.field1849.field2402 = class117.field1849.field2414 = class701.field10100 = var28.method698((byte)-117);
                           class765.field10970 = var28.method665(false);
                           class634.field8991 = var28.method701(255);
                           class24.field348 = var28.method665(false) == 1;
                           class195.field2819 = new class142();
                           class195.field2819.field2262 = var28.method685(-2);
                           if (~class195.field2819.field2262 == -65536) {
                              class195.field2819.field2262 = -1;
                           }

                           class195.field2819.field2258 = var28.method698((byte)42);
                           if (class479.field6892 != class160.field2451) {
                              class195.field2819.field2260 = class195.field2819.field2262 + 40000;
                              class195.field2819.field2264 = class195.field2819.field2262 + 50000;
                           }

                           if (class693.field9999 == class479.field6892 || class550.field7866 == class479.field6892 && class33.field489 >= 2 || !class750.field10662.method1419(class107.field1674, (byte)118)) {
                              break label701;
                           }

                           class414.method3242((byte)-102);
                           if (!var1) {
                              break label701;
                           }
                        }

                        if (!class527.field7461.field3713.method2549(class110.field1711, 29842)) {
                           return;
                        }

                        class527.field7461.field3713.method2551(class110.field1711, 82, 0, var28.field942);
                        var28.field945 = 0;
                        class33.field489 = var28.method665(false);
                        class7.field133 = var28.method665(false);
                        class74.field1183 = var28.method665(arg0) == 1;
                        class286.field4290 = ~var28.method665(arg0) == -2;
                        class238.field3673 = var28.method665(arg0) == 1;
                        class229.field3565 = var28.method665(false) == 1;
                        class394.field5731 = var28.method685(-2);
                        class425.field6225 = ~var28.method665(false) == -2;
                        class550.field7867 = var28.method649((byte)39);
                        class521.field7329 = var28.method665(false) == 1;
                        class549.field7834.method3853(class521.field7329, (byte)109);
                        class201.field2882.method5587(21762, class521.field7329);
                        class478.field6879.method4870(class521.field7329, -119);
                     }

                     label757: {
                        if (class74.field1183 && !class238.field3673 || class425.field6225) {
                           try {
                              class726.method5254(88, class289.field4303, field164[13]);
                              break label757;
                           } catch (Throwable var37) {
                              if (!class413.field6054) {
                                 break label757;
                              }

                              try {
                                 class289.field4303.getAppletContext().showDocument(new URL(class289.field4303.getCodeBase(), field164[9]), field164[6]);
                                 break label757;
                              } catch (Exception var36) {
                                 if (!var1) {
                                    break label757;
                                 }
                              }
                           }
                        }

                        try {
                           class726.method5254(109, class289.field4303, field164[7]);
                        } catch (Throwable var35) {
                        }
                     }

                     if (class479.field6892 == class160.field2451) {
                        try {
                           class726.method5254(98, class289.field4303, field164[4]);
                        } catch (Throwable var34) {
                        }
                     }

                     if (class793.field11537 != 2) {
                        class528.field7463 = 0;
                        class547.method4096(2, (byte)-48);
                        class508.method3825(47);
                        class755.method5457(7, arg0);
                        class527.field7461.field3724 = null;
                        return;
                     }

                     class528.field7463 = 16;
                  }

                  if (class528.field7463 == 16) {
                     if (!class527.field7461.field3713.method2549(3, 29842)) {
                        return;
                     }

                     class527.field7461.field3713.method2551(3, 125, 0, class527.field7461.field3719.field942);
                     class528.field7463 = 17;
                  }

                  if (class528.field7463 == 17) {
                     class408 var30 = class527.field7461.field3719;
                     var30.field945 = 0;
                     if (var30.method3196(-129)) {
                        if (!class527.field7461.field3713.method2549(1, 29842)) {
                           return;
                        }

                        class527.field7461.field3713.method2551(1, 115, 3, var30.field942);
                     }

                     class527.field7461.field3724 = class446.method3460(0)[var30.method3193(-128)];
                     class527.field7461.field3721 = var30.method685(-2);
                     class528.field7463 = 15;
                  }

                  if (class528.field7463 == 15) {
                     if (class527.field7461.field3713.method2549(class527.field7461.field3721, 29842)) {
                        int var31;
                        label474: {
                           class527.field7461.field3713.method2551(class527.field7461.field3721, 113, 0, class527.field7461.field3719.field942);
                           class527.field7461.field3719.field945 = 0;
                           var31 = class527.field7461.field3721;
                           class528.field7463 = 0;
                           class547.method4096(2, (byte)-110);
                           class615.method4528(26604);
                           class132.method1355(class527.field7461.field3719, (byte)-128);
                           class2.field18 = -1;
                           if (class194.field2814 != class527.field7461.field3724) {
                              class744.method5357(-5);
                              if (!var1) {
                                 break label474;
                              }
                           }

                           class195.method1714((byte)-49);
                        }

                        if (~class527.field7461.field3719.field945 != ~var31) {
                           throw new RuntimeException(field164[12] + class527.field7461.field3719.field945 + field164[11] + var31);
                        } else {
                           class527.field7461.field3724 = null;
                        }
                     }
                  } else if (class528.field7463 == 19) {
                     if (~class527.field7461.field3721 == 1) {
                        if (!class527.field7461.field3713.method2549(2, 29842)) {
                           return;
                        }

                        class527.field7461.field3713.method2551(2, 121, 0, class527.field7461.field3719.field942);
                        class527.field7461.field3719.field945 = 0;
                        class527.field7461.field3721 = class527.field7461.field3719.method685(-2);
                     }

                     if (class527.field7461.field3713.method2549(class527.field7461.field3721, 29842)) {
                        class527.field7461.field3713.method2551(class527.field7461.field3721, 103, 0, class527.field7461.field3719.field942);
                        class527.field7461.field3719.field945 = 0;
                        int var32 = class527.field7461.field3721;
                        class528.field7463 = 0;
                        class547.method4096(15, (byte)-120);
                        class767.method5525((byte)114);
                        class132.method1355(class527.field7461.field3719, (byte)-128);
                        if (class527.field7461.field3719.field945 != var32) {
                           throw new RuntimeException(field164[5] + class527.field7461.field3719.field945 + field164[11] + var32);
                        } else {
                           class527.field7461.field3724 = null;
                        }
                     }
                  }
               }
            } catch (IOException var38) {
               class527.field7461.method2114(0);
               if (class116.field1840 < 3) {
                  label457: {
                     if (class793.field11537 == 2) {
                        class750.field10662.method1415((byte)-49);
                        if (!var1) {
                           break label457;
                        }
                     }

                     class432.field6349.method1415((byte)-87);
                  }

                  class3.field23 = 0;
                  class528.field7463 = 1;
                  ++class116.field1840;
               } else {
                  class528.field7463 = 0;
                  class547.method4096(-4, (byte)-16);
                  class547.method4097(7);
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class612.method4503(var39, field164[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method77(int arg0) {
      try {
         if (arg0 >= -60) {
            method79(false);
         }

         ++field155;
         this.field163.method5222((byte)-63);
         this.field159.method3096(-113);
         this.field150 = new class96();
         this.field161 = this.field158;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field164[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(IJ)Lfn;"
   )
   public final class96 method78(int arg0, long arg1) {
      try {
         ++field152;
         class96 var4 = (class96)this.field159.method3101(-1, arg1);
         if (var4 != null) {
            this.field163.method5224(var4, 124);
         }

         if (arg0 != 0) {
            field162 = null;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field164[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method79(boolean arg0) {
      try {
         field160 = null;
         field156 = null;
         field157 = null;
         if (!arg0) {
            method76(true);
         }

         field162 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field164[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class9(int arg0) {
      try {
         this.field161 = arg0;
         this.field158 = arg0;

         int var2;
         for(var2 = 1; ~(var2 + var2) > ~arg0; var2 += var2) {
         }

         this.field159 = new class398(var2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field164[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method80(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method81(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
