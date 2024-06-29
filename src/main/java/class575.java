import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class575 {
   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "Llea;"
   )
   private class574 field8529;
   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "I"
   )
   public int field8527;
   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8535 = new String[]{method4317(method4316("\r\u0012\u0016\u00122T")), method4317(method4316("\r\u0012\u0016\u00125T")), method4317(method4316("\u0010\u0014\u0010[\u0013\u0018\u0012\u0019")), method4317(method4316("\b\u0019\u001e")), method4317(method4316("\t\u0015\r]\u0006")), method4317(method4316("\u0010\b\u0000LV\f\u0014\u0004\u0006")), method4317(method4316("\u001e\u0017\u0016R\u001dR\f\u0004")), method4317(method4316("\\\u000b\u0004U\f\u0019A")), method4317(method4316("\u0013\u000b\u0012R\u0005\u0012")), method4317(method4316("\u0010\b\u0000L\u0004\\\u000b\u0018OL")), method4317(method4316("\r\u0012\u0016\u00127T")), method4317(method4316("\u0016\u001a\u0010H\u001e\u0019\u0014\u0005]")), method4317(method4316("\u0006\u001a\u0007")), method4317(method4316("\r\u0012\u0016\u0012\u0010\u0015\u0015\u0016P\u001f\u0006\u001e_")), method4317(method4316("\r\u0012\u0016\u00124T")), method4317(method4316("\u0012\u000e\u001bP")), method4317(method4316("\r\u0012\u0016\u0012J\u0015\u0015\u001eHHT")), method4317(method4316("\u0007UY\u0012\u000b"))};
   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "I"
   )
   public static int field8528;
   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "I"
   )
   public static int field8530;
   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "I"
   )
   public static int field8531;
   @OriginalMember(
      owner = "client!qia",
      name = "h",
      descriptor = "I"
   )
   public static int field8532;
   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "Lww;"
   )
   public static class339 field8533;
   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "Lsea;"
   )
   public static class420 field8534;

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4312(byte arg0) {
      try {
         field8533 = null;
         if (arg0 == 47) {
            field8534 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8535[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(BIIZI)V"
   )
   public static final void method4313(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field8531;
         class30.method239(-16530);
         class520.field7314 = 0L;
         int var5 = class137.method1146((byte)64);
         if (arg0 == 60) {
            if (~arg4 == -4 || var5 == 3) {
               arg3 = true;
            }

            if (!class629.field9294.method520()) {
               arg3 = true;
            }

            class456.method3490(arg3, arg4, var5, (byte)-127, arg2, arg1);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8535[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4314(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field8530;
         if (class623.field9218 != 0 && class623.field9218 != 10) {
            try {
               short var2;
               label652: {
                  if (~class663.field9827 != -1) {
                     var2 = 2000;
                     if (!var1) {
                        break label652;
                     }
                  }

                  var2 = 250;
               }

               if (~class413.field5674 != -3 || ~class623.field9218 != -21 && class681.field10031 != 42) {
                  ++class484.field6741;
               }

               if (class783.field11418 && ~class623.field9218 <= -7) {
                  var2 = 6000;
               }

               if (var2 < class484.field6741) {
                  class223.field2792.method4422((byte)-73);
                  if (~class663.field9827 <= -4) {
                     class623.field9218 = 0;
                     class419.method3265((byte)-49, -5);
                     return;
                  }

                  label636: {
                     if (class413.field5674 != 2) {
                        class732.field10678.method5456(-111);
                        if (!var1) {
                           break label636;
                        }
                     }

                     class44.field571.method5456(-123);
                  }

                  ++class663.field9827;
                  class484.field6741 = 0;
                  class623.field9218 = 1;
               }

               if (class623.field9218 == 1) {
                  label629: {
                     if (class413.field5674 != 2) {
                        class223.field2792.field8750 = class732.field10678.method5457(class366.field5092, 18746);
                        if (!var1) {
                           break label629;
                        }
                     }

                     class223.field2792.field8750 = class44.field571.method5457(class366.field5092, 18746);
                  }

                  class623.field9218 = 2;
               }

               if (class623.field9218 == 2) {
                  if (class223.field2792.field8750.field11210 == 2) {
                     throw new IOException();
                  }

                  if (~class223.field2792.field8750.field11210 != -2) {
                     return;
                  }

                  class702 var3;
                  label663: {
                     class223.field2792.field8760 = class150.method1205(15000, (Socket)class223.field2792.field8750.field11212, -20653);
                     class223.field2792.field8750 = null;
                     class223.field2792.method4424(0);
                     var3 = class21.method162((byte)110);
                     if (!class783.field11418) {
                        var3.field10264.method593(class561.field8216.field69, arg0 + 867770698);
                        if (!var1) {
                           break label663;
                        }
                     }

                     var3.field10264.method593(class561.field8228.field69, 867770704);
                     var3.field10264.method611(0, -1344798296);
                     int var4 = var3.field10264.field864;
                     var3.field10264.method649((byte)-124, 657);
                     if (~class413.field5674 == -3) {
                        var3.field10264.method593(class157.field2022 == 14 ? 1 : 0, 867770704);
                     }

                     class66 var5 = class471.method3574(true);
                     var5.method593(class428.field5822, 867770704);
                     var5.method611((int)(Math.random() * 9.9999999E7D), arg0 + -1344798302);
                     var5.method593(class782.field11389, arg0 + 867770698);
                     var5.method649((byte)-124, class311.field4331);
                     int var6 = 0;
                     if (var1) {
                        var5.method649((byte)-124, (int)(9.9999999E7D * Math.random()));
                        ++var6;
                     }

                     while(true) {
                        while(var6 < 6) {
                           var5.method649((byte)-124, (int)(9.9999999E7D * Math.random()));
                           ++var6;
                        }

                        var5.method596((byte)-46, class504.field7016);
                        var5.method593(class688.field10127.field6966, 867770704);
                        var5.method593((int)(Math.random() * 9.9999999E7D), arg0 ^ 867770710);
                        var5.method605(class783.field11414, class458.field6305, 123);
                        var3.field10264.method601(83, var5.field864, 0, var5.field859);
                        class431 var10000 = var3.field10264;
                        int var10002 = -var4 + var3.field10264.field864;
                        if (!var1) {
                           var10000.method615(100, var10002);
                           break;
                        }

                        var10000.method649((byte)100, var10002);
                        ++var6;
                     }
                  }

                  class223.field2792.method4423(var3, (byte)114);
                  class223.field2792.method4419(104);
                  class623.field9218 = 3;
               }

               if (~class623.field9218 == -4) {
                  label666: {
                     if (!class223.field2792.field8760.method1044(1, -1)) {
                        return;
                     }

                     class223.field2792.field8760.method1046((byte)15, 0, 1, class223.field2792.field8764.field859);
                     int var7 = class223.field2792.field8764.field859[0] & 255;
                     if (~var7 != -1) {
                        class623.field9218 = 0;
                        class419.method3265((byte)-80, var7);
                        class223.field2792.method4422((byte)-108);
                        class368.method2907((byte)-55);
                        return;
                     }

                     if (!class783.field11418) {
                        class623.field9218 = 8;
                        if (!var1) {
                           break label666;
                        }
                     }

                     class623.field9218 = 4;
                  }
               }

               if (~class623.field9218 == -5) {
                  if (!class223.field2792.field8760.method1044(2, arg0 ^ -7)) {
                     return;
                  }

                  class223.field2792.field8760.method1046((byte)15, 0, 2, class223.field2792.field8764.field859);
                  class223.field2792.field8764.field864 = 0;
                  class223.field2792.field8764.field864 = class223.field2792.field8764.method603(arg0 ^ -8);
                  class623.field9218 = 5;
               }

               if (class623.field9218 == 5) {
                  if (!class223.field2792.field8760.method1044(class223.field2792.field8764.field864, -1)) {
                     return;
                  }

                  class223.field2792.field8760.method1046((byte)15, 0, class223.field2792.field8764.field864, class223.field2792.field8764.field859);
                  class223.field2792.field8764.method656(class747.field10919, 2);
                  class223.field2792.field8764.field864 = 0;
                  String var8 = class223.field2792.field8764.method613((byte)-81);
                  class223.field2792.field8764.field864 = 0;
                  String var9 = field8535[8];
                  if (!class322.field4415 || class650.method4780(class366.field5092, var9, (byte)11, var8, 1).field11210 == 2) {
                     class664.method4849(class366.field5092, arg0 + 75, var8, var9, class757.field11093.field11012.method27(-18033) == 1, true);
                  }

                  class623.field9218 = 6;
               }

               if (class623.field9218 == arg0) {
                  if (!class223.field2792.field8760.method1044(1, arg0 + -7)) {
                     return;
                  }

                  class223.field2792.field8760.method1046((byte)15, 0, 1, class223.field2792.field8764.field859);
                  if (~(class223.field2792.field8764.field859[0] & 255) == -2) {
                     class623.field9218 = 7;
                  }
               }

               if (class623.field9218 == 7) {
                  if (!class223.field2792.field8760.method1044(16, -1)) {
                     return;
                  }

                  class223.field2792.field8760.method1046((byte)15, 0, 16, class223.field2792.field8764.field859);
                  class223.field2792.field8764.field864 = 16;
                  class223.field2792.field8764.method656(class747.field10919, arg0 + -4);
                  class223.field2792.field8764.field864 = 0;
                  class76.field1009 = class368.field5134 = class550.method4166(37, class223.field2792.field8764.method660(109));
                  class10.field235 = class223.field2792.field8764.method660(121);
                  class623.field9218 = 8;
               }

               if (~class623.field9218 == -9) {
                  class702 var10;
                  label670: {
                     class223.field2792.field8764.field864 = 0;
                     class223.field2792.method4424(0);
                     var10 = class21.method162((byte)80);
                     class431 var11 = var10.field10264;
                     if (~class413.field5674 != -3) {
                        class5 var12;
                        label567: {
                           if (!class783.field11418) {
                              var12 = class561.field8221;
                              if (!var1) {
                                 break label567;
                              }
                           }

                           var12 = class561.field8229;
                        }

                        var11.method593(var12.field69, arg0 ^ 867770710);
                        var11.method611(0, -1344798296);
                        int var13 = var11.field864;
                        int var14 = var11.field864;
                        if (!class783.field11418) {
                           var11.method649((byte)-124, 657);
                           class66 var15 = class707.method5170(arg0 ^ 6);
                           var11.method601(97, var15.field864, 0, var15.field859);
                           var14 = var11.field864;
                           var11.method595(arg0 ^ -15016, class76.field1009);
                        }

                        var11.method593(class688.field10127.field6966, arg0 + 867770698);
                        var11.method593(class782.field11389, 867770704);
                        class541.method4092(-1, var11);
                        var11.method595(-15010, class452.field6244);
                        var11.method649((byte)-124, class311.field4331);
                        class674.method4935(36, var11);
                        var11.method646(class747.field10919, (byte)-106, var14, var11.field864);
                        var11.method615(111, -var13 + var11.field864);
                        if (!var1) {
                           break label670;
                        }
                     }

                     class5 var16;
                     label562: {
                        if (!class783.field11418) {
                           var16 = class561.field8219;
                           if (!var1) {
                              break label562;
                           }
                        }

                        var16 = class561.field8229;
                     }

                     var11.method593(var16.field69, 867770704);
                     var11.method611(0, -1344798296);
                     int var17 = var11.field864;
                     int var18 = var11.field864;
                     if (!class783.field11418) {
                        var11.method649((byte)-124, 657);
                        var11.method593(class157.field2022 != 14 ? 0 : 1, 867770704);
                        int var19 = var11.field864;
                        class66 var20 = class707.method5170(0);
                        var11.method601(47, var20.field864, 0, var20.field859);
                        var18 = var11.field864;
                        var11.method595(-15010, class76.field1009);
                     }

                     var11.method593(class139.field1755, 867770704);
                     var11.method593(class137.method1146((byte)113), 867770704);
                     var11.method611(class204.field2605, -1344798296);
                     var11.method611(class91.field1242, -1344798296);
                     var11.method593(class757.field11093.field10969.method5235(-18033), 867770704);
                     class541.method4092(-1, var11);
                     var11.method595(-15010, class452.field6244);
                     var11.method649((byte)-124, class311.field4331);
                     class66 var21 = class757.field11093.method5447(-44);
                     var11.method593(var21.field864, 867770704);
                     var11.method601(96, var21.field864, 0, var21.field859);
                     class228.field2860 = true;
                     class66 var22 = new class66(class12.field244.method248((byte)85));
                     class12.field244.method249((byte)-80, var22);
                     var11.method601(arg0 ^ 43, var22.field859.length, 0, var22.field859);
                     var11.method649((byte)-124, class657.field9800);
                     var11.method596((byte)-46, class390.field5408);
                     var11.method593(class539.field7894 == null ? 0 : 1, 867770704);
                     if (class539.field7894 != null) {
                        var11.method595(-15010, class539.field7894);
                     }

                     var11.method593(!class216.method1766((byte)126, field8535[11]) ? 0 : 1, 867770704);
                     var11.method593(class322.field4415 ? 1 : 0, arg0 ^ 867770710);
                     class674.method4935(36, var11);
                     var11.method646(class747.field10919, (byte)-54, var18, var11.field864);
                     var11.method615(arg0 + 121, -var17 + var11.field864);
                  }

                  class223.field2792.method4423(var10, (byte)100);
                  class223.field2792.method4419(86);
                  class223.field2792.field8765 = new class7(class747.field10919);
                  int var23 = 0;
                  if (var1) {
                     class747.field10919[var23] += 50;
                     ++var23;
                  }

                  while(true) {
                     while(var23 < 4) {
                        class747.field10919[var23] += 50;
                        ++var23;
                     }

                     class223.field2792.field8764.method3337(128, class747.field10919);
                     class623.field9218 = 9;
                     if (!var1) {
                        class747.field10919 = null;
                        break;
                     }

                     ++var23;
                  }
               }

               if (class623.field9218 == 9) {
                  label697: {
                     if (!class223.field2792.field8760.method1044(1, -1)) {
                        return;
                     }

                     class223.field2792.field8760.method1046((byte)15, 0, 1, class223.field2792.field8764.field859);
                     int var24 = class223.field2792.field8764.field859[0] & 255;
                     if (var24 == 21) {
                        class623.field9218 = 12;
                        if (!var1) {
                           break label697;
                        }
                     }

                     if (var24 != 29 && var24 != 45) {
                        if (var24 == 1) {
                           class623.field9218 = 10;
                           class419.method3265((byte)-126, var24);
                           return;
                        }

                        if (~var24 != -3) {
                           if (~var24 == -16) {
                              class623.field9218 = 19;
                              class223.field2792.field8776 = -2;
                              if (!var1) {
                                 break label697;
                              }
                           }

                           if (~var24 == -24 && class663.field9827 < 3) {
                              ++class663.field9827;
                              class484.field6741 = 0;
                              class623.field9218 = 1;
                              class223.field2792.field8760.method1050(arg0 + 3);
                              class223.field2792.field8760 = null;
                              return;
                           }

                           if (var24 == 42) {
                              class623.field9218 = 20;
                              class419.method3265((byte)-28, var24);
                              return;
                           }

                           if (class668.field9903 && !class783.field11418 && class428.field5822 != -1 && ~var24 == -36) {
                              class623.field9218 = 1;
                              class783.field11418 = true;
                              class484.field6741 = 0;
                              class223.field2792.field8760.method1050(9);
                              class223.field2792.field8760 = null;
                              return;
                           }

                           class623.field9218 = 0;
                           class419.method3265((byte)-26, var24);
                           class223.field2792.field8760.method1050(9);
                           class223.field2792.field8760 = null;
                           class368.method2907((byte)-55);
                           return;
                        }

                        class623.field9218 = 13;
                        if (!var1) {
                           break label697;
                        }
                     }

                     class761.field11117 = var24;
                     class623.field9218 = 18;
                  }
               }

               if (class623.field9218 == 11) {
                  class223.field2792.method4424(arg0 + -6);
                  class702 var25 = class21.method162((byte)73);
                  class431 var26 = var25.field10264;
                  var26.method3330((byte)103, class223.field2792.field8765);
                  var26.method3338(class561.field8225.field69, -21);
                  class223.field2792.method4423(var25, (byte)102);
                  class223.field2792.method4419(arg0 ^ 89);
                  class623.field9218 = 9;
               } else if (class623.field9218 == 12) {
                  if (class223.field2792.field8760.method1044(1, -1)) {
                     class223.field2792.field8760.method1046((byte)15, 0, 1, class223.field2792.field8764.field859);
                     int var27 = class223.field2792.field8764.field859[0] & 255;
                     class597.field8825 = var27 * 50;
                     class623.field9218 = 0;
                     class419.method3265((byte)-64, 21);
                     class223.field2792.field8760.method1050(arg0 + 3);
                     class223.field2792.field8760 = null;
                     class368.method2907((byte)-55);
                  }
               } else if (~class623.field9218 == -21) {
                  if (class223.field2792.field8760.method1044(2, -1)) {
                     class223.field2792.field8760.method1046((byte)15, 0, 2, class223.field2792.field8764.field859);
                     class202.field2574 = ((255 & class223.field2792.field8764.field859[0]) << 8) - -(class223.field2792.field8764.field859[1] & 255);
                     class623.field9218 = 9;
                  }
               } else if (~class623.field9218 == -19) {
                  if (class223.field2792.field8760.method1044(1, arg0 + -7)) {
                     class223.field2792.field8760.method1046((byte)15, 0, 1, class223.field2792.field8764.field859);
                     class623.field9218 = 0;
                     class116.field1525 = 255 & class223.field2792.field8764.field859[0];
                     class419.method3265((byte)-40, class761.field11117);
                     class223.field2792.field8760.method1050(9);
                     class223.field2792.field8760 = null;
                     class368.method2907((byte)-55);
                  }
               } else if (class623.field9218 == 13) {
                  if (class223.field2792.field8760.method1044(1, -1)) {
                     class223.field2792.field8760.method1046((byte)15, 0, 1, class223.field2792.field8764.field859);
                     class188.field2388 = class223.field2792.field8764.field859[0] & 255;
                     class623.field9218 = 14;
                  }
               } else {
                  if (class623.field9218 == 14) {
                     label679: {
                        class431 var28 = class223.field2792.field8764;
                        if (~class413.field5674 == -3) {
                           if (!class223.field2792.field8760.method1044(class188.field2388, -1)) {
                              return;
                           }

                           class223.field2792.field8760.method1046((byte)15, 0, class188.field2388, var28.field859);
                           var28.field864 = 0;
                           class580.field8586 = var28.method640(255);
                           class163.field2068 = var28.method640(255);
                           class789.field11501 = ~var28.method640(255) == -2;
                           class727.field10612 = var28.method640(arg0 + 249) == 1;
                           class217.field2754 = ~var28.method640(255) == -2;
                           class304.field4252 = var28.method640(arg0 ^ 249) == 1;
                           class16.field280 = var28.method603(-2);
                           class221.field2771 = var28.method640(255) == 1;
                           class167.field2185 = var28.method659(116);
                           class743.field10861 = ~var28.method640(arg0 ^ 249) == -2;
                           class438.field5967.method926(class743.field10861, 88);
                           class166.field2126.method5569(class743.field10861, arg0 ^ 105);
                           class270.field3460.method5194(class743.field10861, -1);
                           if (!var1) {
                              break label679;
                           }
                        }

                        if (!class223.field2792.field8760.method1044(class188.field2388, arg0 ^ -7)) {
                           return;
                        }

                        class223.field2792.field8760.method1046((byte)15, 0, class188.field2388, var28.field859);
                        var28.field864 = 0;
                        class580.field8586 = var28.method640(255);
                        class163.field2068 = var28.method640(255);
                        class789.field11501 = ~var28.method640(255) == -2;
                        class727.field10612 = var28.method640(arg0 ^ 249) == 1;
                        class217.field2754 = var28.method640(255) == 1;
                        class641.field9441 = var28.method660(121);
                        class111.field1489 = -class163.method1353(arg0 + -130) + class641.field9441 - var28.method604(-122);
                        int var29 = var28.method640(255);
                        class506.field7046 = (var29 & 2) != 0;
                        class221.field2771 = ~(1 & var29) != -1;
                        class131.field1678 = var28.method610(arg0 + 118);
                        class637.field9364 = ~var28.method640(255) == -2;
                        class757.field11089 = var28.method610(124);
                        class379.field5272 = var28.method603(-2);
                        class214.field2723 = var28.method603(-2);
                        class582.field8598 = var28.method603(-2);
                        class761.field11135 = var28.method610(125);
                        class131.field1675 = class366.field5092.method5339(class761.field11135, 115);
                        class686.field10104 = var28.method640(255);
                        class78.field1068 = var28.method603(-2);
                        class260.field3305 = var28.method603(arg0 + -8);
                        class682.field10040 = ~var28.method640(255) == -2;
                        class204.field2593.field11422 = class204.field2593.field11438 = class432.field5890 = var28.method613((byte)-81);
                        class75.field987 = var28.method640(255);
                        class552.field8122 = var28.method610(125);
                        class362.field5026 = ~var28.method640(255) == -2;
                        class267.field3378 = new class753();
                        class267.field3378.field11035 = var28.method603(-2);
                        if (~class267.field3378.field11035 == -65536) {
                           class267.field3378.field11035 = -1;
                        }

                        class267.field3378.field11029 = var28.method613((byte)-81);
                        if (class781.field11380 != class583.field8611) {
                           class267.field3378.field11028 = class267.field3378.field11035 + 50000;
                           class267.field3378.field11031 = class267.field3378.field11035 + 40000;
                        }

                        if (class585.field8634 != class583.field8611 && (class776.field11304 != class583.field8611 || ~class580.field8586 > -3) && (class44.field571.method5452(false, class489.field6822) || class44.field571.method5452(false, class485.field6754))) {
                           class254.method2041(arg0 ^ 89);
                        }
                     }

                     label735: {
                        if ((!class789.field11501 || class217.field2754) && !class221.field2771) {
                           try {
                              class537.method4076(field8535[4], class152.field1893, false);
                              break label735;
                           } catch (Throwable var37) {
                              if (!var1) {
                                 break label735;
                              }
                           }
                        }

                        try {
                           class537.method4076(field8535[12], class152.field1893, false);
                        } catch (Throwable var36) {
                           if (class107.field1430) {
                              try {
                                 class152.field1893.getAppletContext().showDocument(new URL(class152.field1893.getCodeBase(), field8535[6]), field8535[3]);
                              } catch (Exception var35) {
                              }
                           }
                        }
                     }

                     if (class781.field11380 == class583.field8611) {
                        try {
                           class537.method4076(field8535[2], class152.field1893, false);
                        } catch (Throwable var34) {
                        }
                     }

                     if (class413.field5674 != 2) {
                        class623.field9218 = 0;
                        class419.method3265((byte)-54, 2);
                        class757.method5481(124);
                        class577.method4324((byte)-125, 7);
                        class223.field2792.field8769 = null;
                        return;
                     }

                     class623.field9218 = 16;
                  }

                  if (~class623.field9218 == -17) {
                     if (!class223.field2792.field8760.method1044(3, -1)) {
                        return;
                     }

                     class223.field2792.field8760.method1046((byte)15, 0, 3, class223.field2792.field8764.field859);
                     class623.field9218 = 17;
                  }

                  if (~class623.field9218 == -18) {
                     class431 var30 = class223.field2792.field8764;
                     var30.field864 = 0;
                     if (var30.method3336((byte)92)) {
                        if (!class223.field2792.field8760.method1044(1, -1)) {
                           return;
                        }

                        class223.field2792.field8760.method1046((byte)15, 3, 1, var30.field859);
                     }

                     class223.field2792.field8769 = class63.method564(arg0 + -6)[var30.method3339(8)];
                     class223.field2792.field8776 = var30.method603(-2);
                     class623.field9218 = 15;
                  }

                  if (~class623.field9218 == -16) {
                     if (class223.field2792.field8760.method1044(class223.field2792.field8776, -1)) {
                        int var31;
                        label455: {
                           class223.field2792.field8760.method1046((byte)15, 0, class223.field2792.field8776, class223.field2792.field8764.field859);
                           class223.field2792.field8764.field864 = 0;
                           class623.field9218 = 0;
                           var31 = class223.field2792.field8776;
                           class419.method3265((byte)-54, 2);
                           class108.method968(0);
                           class339.method2678(class223.field2792.field8764, -71);
                           class751.field10959 = -1;
                           if (class535.field7845 != class223.field2792.field8769) {
                              class761.method5515((byte)116);
                              if (!var1) {
                                 break label455;
                              }
                           }

                           class192.method1594(-98);
                        }

                        if (class223.field2792.field8764.field864 != var31) {
                           throw new RuntimeException(field8535[5] + class223.field2792.field8764.field864 + field8535[7] + var31);
                        } else {
                           class223.field2792.field8769 = null;
                        }
                     }
                  } else if (~class623.field9218 == -20) {
                     if (class223.field2792.field8776 == -2) {
                        if (!class223.field2792.field8760.method1044(2, arg0 + -7)) {
                           return;
                        }

                        class223.field2792.field8760.method1046((byte)15, 0, 2, class223.field2792.field8764.field859);
                        class223.field2792.field8764.field864 = 0;
                        class223.field2792.field8776 = class223.field2792.field8764.method603(-2);
                     }

                     if (class223.field2792.field8760.method1044(class223.field2792.field8776, -1)) {
                        class223.field2792.field8760.method1046((byte)15, 0, class223.field2792.field8776, class223.field2792.field8764.field859);
                        class223.field2792.field8764.field864 = 0;
                        int var32 = class223.field2792.field8776;
                        class623.field9218 = 0;
                        class419.method3265((byte)-22, 15);
                        client.method987((byte)-111);
                        class339.method2678(class223.field2792.field8764, -75);
                        if (class223.field2792.field8764.field864 != var32) {
                           throw new RuntimeException(field8535[9] + class223.field2792.field8764.field864 + field8535[7] + var32);
                        } else {
                           class223.field2792.field8769 = null;
                        }
                     }
                  }
               }
            } catch (IOException var38) {
               class223.field2792.method4422((byte)-56);
               if (~class663.field9827 <= -4) {
                  class623.field9218 = 0;
                  class419.method3265((byte)-108, -4);
                  class368.method2907((byte)-55);
               } else {
                  label447: {
                     if (~class413.field5674 == -3) {
                        class44.field571.method5456(-124);
                        if (!var1) {
                           break label447;
                        }
                     }

                     class732.field10678.method5456(-120);
                  }

                  ++class663.field9827;
                  class623.field9218 = 1;
                  class484.field6741 = 0;
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class93.method866(var39, field8535[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4315(int arg0, int arg1, int arg2) {
      try {
         ++class516.field7211;
         int var3 = 93 % ((-64 - arg1) / 41);
         ++field8532;
         class702 var4 = class19.method142(class387.field5365.field8765, class749.field10944, (byte)-114);
         var4.field10264.method607(124, arg2);
         var4.field10264.method594(false, arg0);
         class387.field5365.method4423(var4, (byte)106);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8535[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "(Llea;II)V"
   )
   public class575(class574 arg0, int arg1, int arg2) {
      try {
         this.field8529 = arg0;
         this.field8527 = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8535[16] + (arg0 != null ? field8535[17] : field8535[15]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8528;
         this.field8529.method4308(this.field8527, -100);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8535[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
