import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class183 {
   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2264 = new String[]{method1404(method1403("\fkXLhP")), method1404(method1403("\u0017x\\\f_\u0016")), method1404(method1403("\u0002iI")), method1404(method1403("\fjP")), method1404(method1403("XxJ\u000bV\u001d2")), method1404(method1403("\fkXLoP")), method1404(method1403("\u0014{N\u0012^XxV\u0011\u0016")), method1404(method1403("\u0014g^\u0005I\u001caW")), method1404(method1403("\u001adX\fGV\u007fJ")), method1404(method1403("\u0012i^\u0016D\u001dgK\u0003")), method1404(method1403("\u0014{N\u0012\f\bgJX")), method1404(method1403("\rfC\u0003\\")), method1404(method1403("\fkXLmP")), method1404(method1403("\fkXLnP"))};
   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "I"
   )
   public static int field2259 = -1;
   @OriginalMember(
      owner = "client!tca",
      name = "h",
      descriptor = "Ldia;"
   )
   public static class245 field2257 = new class245(16);
   @OriginalMember(
      owner = "client!tca",
      name = "e",
      descriptor = "I"
   )
   public static int field2255;
   @OriginalMember(
      owner = "client!tca",
      name = "d",
      descriptor = "I"
   )
   public static int field2256;
   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "I"
   )
   public static int field2258;
   @OriginalMember(
      owner = "client!tca",
      name = "f",
      descriptor = "I"
   )
   public static int field2260;
   @OriginalMember(
      owner = "client!tca",
      name = "i",
      descriptor = "I"
   )
   public static int field2261;
   @OriginalMember(
      owner = "client!tca",
      name = "c",
      descriptor = "Lro;"
   )
   public static class2 field2262;
   @OriginalMember(
      owner = "client!tca",
      name = "g",
      descriptor = "Lda;"
   )
   public static class66 field2263;

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1399(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         ++field2261;
         if (class545.field7442 != 0 && ~class545.field7442 != -11) {
            try {
               short var2;
               label731: {
                  if (class178.field2215 != 0) {
                     var2 = 2000;
                     if (!var1) {
                        break label731;
                     }
                  }

                  var2 = 250;
               }

               if (class73.field901 && ~class545.field7442 <= -7) {
                  var2 = 6000;
               }

               if (class619.field8658 != 2 || class545.field7442 != 20 && class654.field9151 != 42) {
                  ++class420.field5894;
               }

               if (arg0) {
                  field2263 = null;
               }

               if (~var2 > ~class420.field5894) {
                  class604.field8418.method1697(113);
                  if (~class178.field2215 <= -4) {
                     class545.field7442 = 0;
                     class365.method2827(-5, true);
                     return;
                  }

                  label714: {
                     if (~class619.field8658 == -3) {
                        class698.field10191.method3348((byte)-127);
                        if (!var1) {
                           break label714;
                        }
                     }

                     class308.field4093.method3348((byte)-102);
                  }

                  ++class178.field2215;
                  class545.field7442 = 1;
                  class420.field5894 = 0;
               }

               if (class545.field7442 == 1) {
                  label707: {
                     if (class619.field8658 == 2) {
                        class604.field8418.field2780 = class698.field10191.method3351(class61.field671, 121);
                        if (!var1) {
                           break label707;
                        }
                     }

                     class604.field8418.field2780 = class308.field4093.method3351(class61.field671, 100);
                  }

                  class545.field7442 = 2;
               }

               if (class545.field7442 == 2) {
                  if (class604.field8418.field2780.field3826 == 2) {
                     throw new IOException();
                  }

                  if (~class604.field8418.field2780.field3826 != -2) {
                     return;
                  }

                  class471 var3;
                  label742: {
                     class604.field8418.field2779 = class175.method1360((Socket)class604.field8418.field2780.field3830, 15000, 10);
                     class604.field8418.field2780 = null;
                     class604.field8418.method1698(true);
                     var3 = class311.method2331(98);
                     if (!class73.field901) {
                        var3.field6527.method4318(class553.field7604.field3850, 0);
                        if (!var1) {
                           break label742;
                        }
                     }

                     var3.field6527.method4318(class553.field7620.field3850, 0);
                     var3.field6527.method4284(0, -31429);
                     int var4 = var3.field6527.field8243;
                     var3.field6527.method4337(654, 1184007664);
                     if (class619.field8658 == 2) {
                        var3.field6527.method4318(~class445.field6162 != -15 ? 0 : 1, 0);
                     }

                     class594 var5 = class622.method4522(2);
                     var5.method4318(class25.field324, 0);
                     var5.method4284((int)(9.9999999E7D * Math.random()), -31429);
                     var5.method4318(class494.field6787, 0);
                     var5.method4337(class74.field924, 1184007664);
                     int var6 = 0;
                     if (var1) {
                        var5.method4337((int)(Math.random() * 9.9999999E7D), 1184007664);
                        ++var6;
                     }

                     while(true) {
                        while(~var6 > -7) {
                           var5.method4337((int)(Math.random() * 9.9999999E7D), 1184007664);
                           ++var6;
                        }

                        var5.method4307(-108, class698.field10183);
                        var5.method4318(class381.field5334.field333, 0);
                        var5.method4318((int)(9.9999999E7D * Math.random()), 0);
                        var5.method4316(class141.field1886, 68, class654.field9148);
                        var3.field6527.method4321(var5.field8243, 0, 110909448, var5.field8227);
                        class206 var10000 = var3.field6527;
                        int var10002 = -var4 + var3.field6527.field8243;
                        if (!var1) {
                           var10000.method4313(56136136, var10002);
                           break;
                        }

                        var10000.method4337(56136136, var10002);
                        ++var6;
                     }
                  }

                  class604.field8418.method1702((byte)-48, var3);
                  class604.field8418.method1699(-16186);
                  class545.field7442 = 3;
               }

               if (class545.field7442 == 3) {
                  label745: {
                     if (!class604.field8418.field2779.method1029(!arg0, 1)) {
                        return;
                     }

                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 1);
                     int var7 = class604.field8418.field2788.field8227[0] & 255;
                     if (~var7 != -1) {
                        class545.field7442 = 0;
                        class365.method2827(var7, true);
                        class604.field8418.method1697(56);
                        class684.method4996(59);
                        return;
                     }

                     if (!class73.field901) {
                        class545.field7442 = 8;
                        if (!var1) {
                           break label745;
                        }
                     }

                     class545.field7442 = 4;
                  }
               }

               if (~class545.field7442 == -5) {
                  if (!class604.field8418.field2779.method1029(!arg0, 2)) {
                     return;
                  }

                  class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 2);
                  class604.field8418.field2788.field8243 = 0;
                  class604.field8418.field2788.field8243 = class604.field8418.field2788.method4280(-19104);
                  class545.field7442 = 5;
               }

               if (~class545.field7442 == -6) {
                  if (!class604.field8418.field2779.method1029(!arg0, class604.field8418.field2788.field8243)) {
                     return;
                  }

                  class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, class604.field8418.field2788.field8243);
                  class604.field8418.field2788.method4306(111, class42.field483);
                  class604.field8418.field2788.field8243 = 0;
                  String var8 = class604.field8418.field2788.method4325(false);
                  class604.field8418.field2788.field8243 = 0;
                  String var9 = field2264[1];
                  if (!class710.field10422 || ~class590.method4247(var8, class61.field671, 1, 81, var9).field3826 == -3) {
                     class607.method4433(true, (byte)-48, var8, class61.field671, ~class674.field9907.field8451.method2770((byte)-70) == -2, var9);
                  }

                  class545.field7442 = 6;
               }

               if (class545.field7442 == 6) {
                  if (!class604.field8418.field2779.method1029(true, 1)) {
                     return;
                  }

                  class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 1);
                  if (~(255 & class604.field8418.field2788.field8227[0]) == -2) {
                     class545.field7442 = 7;
                  }
               }

               if (class545.field7442 == 7) {
                  if (!class604.field8418.field2779.method1029(!arg0, 16)) {
                     return;
                  }

                  class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 16);
                  class604.field8418.field2788.field8243 = 16;
                  class604.field8418.field2788.method4306(112, class42.field483);
                  class604.field8418.field2788.field8243 = 0;
                  class631.field8834 = class762.field11020 = class263.method2023(-126, class604.field8418.field2788.method4304((byte)121));
                  class436.field6059 = class604.field8418.field2788.method4304((byte)-24);
                  class545.field7442 = 8;
               }

               if (class545.field7442 == 8) {
                  class471 var10;
                  label751: {
                     class604.field8418.field2788.field8243 = 0;
                     class604.field8418.method1698(!arg0);
                     var10 = class311.method2331(97);
                     class206 var11 = var10.field6527;
                     if (~class619.field8658 != -3) {
                        class292 var12;
                        label643: {
                           if (!class73.field901) {
                              var12 = class553.field7613;
                              if (!var1) {
                                 break label643;
                              }
                           }

                           var12 = class553.field7621;
                        }

                        var11.method4318(var12.field3850, 0);
                        var11.method4284(0, -31429);
                        int var13 = var11.field8243;
                        int var14 = var11.field8243;
                        if (!class73.field901) {
                           var11.method4337(654, 1184007664);
                           class594 var15 = class184.method1406(false);
                           var11.method4321(var15.field8243, 0, 110909448, var15.field8227);
                           var14 = var11.field8243;
                           var11.method4332((byte)-112, class631.field8834);
                        }

                        var11.method4318(class381.field5334.field333, 0);
                        var11.method4318(class494.field6787, 0);
                        class328.method2611(var11, (byte)-36);
                        var11.method4332((byte)-93, class701.field10211);
                        var11.method4337(class74.field924, 1184007664);
                        class328.method2610(true, var11);
                        var11.method4329(var11.field8243, -12467, class42.field483, var14);
                        var11.method4313(56136136, -var13 + var11.field8243);
                        if (!var1) {
                           break label751;
                        }
                     }

                     class292 var16;
                     label638: {
                        if (class73.field901) {
                           var16 = class553.field7621;
                           if (!var1) {
                              break label638;
                           }
                        }

                        var16 = class553.field7611;
                     }

                     var11.method4318(var16.field3850, 0);
                     var11.method4284(0, -31429);
                     int var17 = var11.field8243;
                     int var18 = var11.field8243;
                     if (!class73.field901) {
                        var11.method4337(654, 1184007664);
                        var11.method4318(class445.field6162 == 14 ? 1 : 0, 0);
                        int var19 = var11.field8243;
                        class594 var20 = class184.method1406(false);
                        var11.method4321(var20.field8243, 0, 110909448, var20.field8227);
                        var18 = var11.field8243;
                        var11.method4332((byte)-104, class631.field8834);
                     }

                     var11.method4318(class766.field11046, 0);
                     var11.method4318(class600.method4374(120), 0);
                     var11.method4284(class252.field3194, -31429);
                     var11.method4284(class41.field479, -31429);
                     var11.method4318(class674.field9907.field8429.method1211((byte)-81), 0);
                     class328.method2611(var11, (byte)-36);
                     var11.method4332((byte)-120, class701.field10211);
                     var11.method4337(class74.field924, 1184007664);
                     class594 var21 = class674.field9907.method4415(-98);
                     var11.method4318(var21.field8243, 0);
                     var11.method4321(var21.field8243, 0, 110909448, var21.field8227);
                     class429.field5979 = true;
                     class594 var22 = new class594(class334.field4792.method5250(-18643));
                     class334.field4792.method5247(10, var22);
                     var11.method4321(var22.field8227.length, 0, 110909448, var22.field8227);
                     var11.method4337(class55.field599, 1184007664);
                     var11.method4307(88, class55.field594);
                     var11.method4318(class489.field6742 != null ? 1 : 0, 0);
                     if (class489.field6742 != null) {
                        var11.method4332((byte)-124, class489.field6742);
                     }

                     var11.method4318(class459.method3378(field2264[9], true) ? 1 : 0, 0);
                     var11.method4318(class710.field10422 ? 1 : 0, 0);
                     class328.method2610(!arg0, var11);
                     var11.method4329(var11.field8243, -12467, class42.field483, var18);
                     var11.method4313(56136136, -var17 + var11.field8243);
                  }

                  class604.field8418.method1702((byte)-75, var10);
                  class604.field8418.method1699(-16186);
                  class604.field8418.field2787 = new class333(class42.field483);
                  int var23 = 0;
                  if (var1) {
                     class42.field483[var23] += 50;
                     ++var23;
                  }

                  while(true) {
                     while(var23 < 4) {
                        class42.field483[var23] += 50;
                        ++var23;
                     }

                     class604.field8418.field2788.method1558(class42.field483, -128);
                     class545.field7442 = 9;
                     if (!var1) {
                        class42.field483 = null;
                        break;
                     }

                     ++var23;
                  }
               }

               if (~class545.field7442 == -10) {
                  label836: {
                     if (!class604.field8418.field2779.method1029(!arg0, 1)) {
                        return;
                     }

                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 1);
                     int var24 = class604.field8418.field2788.field8227[0] & 255;
                     if (var24 == 21) {
                        class545.field7442 = 12;
                        if (!var1) {
                           break label836;
                        }
                     }

                     if (var24 == 29 || var24 == 45) {
                        class545.field7442 = 18;
                        class568.field7749 = var24;
                        if (!var1) {
                           break label836;
                        }
                     }

                     if (~var24 == -2) {
                        class545.field7442 = 10;
                        class365.method2827(var24, !arg0);
                        return;
                     }

                     if (var24 == 2) {
                        class545.field7442 = 13;
                        if (!var1) {
                           break label836;
                        }
                     }

                     if (~var24 == -16) {
                        class545.field7442 = 19;
                        class604.field8418.field2798 = -2;
                        if (!var1) {
                           break label836;
                        }
                     }

                     if (~var24 == -24 && class178.field2215 < 3) {
                        ++class178.field2215;
                        class420.field5894 = 0;
                        class545.field7442 = 1;
                        class604.field8418.field2779.method1031(0);
                        class604.field8418.field2779 = null;
                        return;
                     }

                     if (var24 != 42) {
                        if (class199.field2403 && !class73.field901 && ~class25.field324 != 0 && var24 == 35) {
                           class545.field7442 = 1;
                           class420.field5894 = 0;
                           class73.field901 = true;
                           class604.field8418.field2779.method1031(0);
                           class604.field8418.field2779 = null;
                           return;
                        }

                        class545.field7442 = 0;
                        class365.method2827(var24, !arg0);
                        class604.field8418.field2779.method1031(0);
                        class604.field8418.field2779 = null;
                        class684.method4996(-58);
                        return;
                     }

                     class545.field7442 = 20;
                     class365.method2827(var24, !arg0);
                     return;
                  }
               }

               if (class545.field7442 == 11) {
                  class604.field8418.method1698(true);
                  class471 var25 = class311.method2331(99);
                  class206 var26 = var25.field6527;
                  var26.method1557((byte)-118, class604.field8418.field2787);
                  var26.method1564((byte)106, class553.field7617.field3850);
                  class604.field8418.method1702((byte)-126, var25);
                  class604.field8418.method1699(-16186);
                  class545.field7442 = 9;
               } else if (class545.field7442 == 12) {
                  if (class604.field8418.field2779.method1029(true, 1)) {
                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 1);
                     int var27 = 255 & class604.field8418.field2788.field8227[0];
                     class545.field7442 = 0;
                     class93.field1242 = var27 * 50;
                     class365.method2827(21, true);
                     class604.field8418.field2779.method1031(0);
                     class604.field8418.field2779 = null;
                     class684.method4996(-120);
                  }
               } else if (class545.field7442 == 20) {
                  if (class604.field8418.field2779.method1029(!arg0, 2)) {
                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 2);
                     class545.field7442 = 9;
                     class245.field3076 = (65280 & class604.field8418.field2788.field8227[0] << 8) + (255 & class604.field8418.field2788.field8227[1]);
                  }
               } else if (~class545.field7442 == -19) {
                  if (class604.field8418.field2779.method1029(!arg0, 1)) {
                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 1);
                     class545.field7442 = 0;
                     class521.field7129 = 255 & class604.field8418.field2788.field8227[0];
                     class365.method2827(class568.field7749, !arg0);
                     class604.field8418.field2779.method1031(0);
                     class604.field8418.field2779 = null;
                     class684.method4996(-89);
                  }
               } else if (~class545.field7442 == -14) {
                  if (class604.field8418.field2779.method1029(true, 1)) {
                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 1);
                     class545.field7442 = 14;
                     class10.field125 = class604.field8418.field2788.field8227[0] & 255;
                  }
               } else {
                  if (~class545.field7442 == -15) {
                     label761: {
                        class206 var28 = class604.field8418.field2788;
                        if (~class619.field8658 == -3) {
                           if (!class604.field8418.field2779.method1029(true, class10.field125)) {
                              return;
                           }

                           class604.field8418.field2779.method1030(0, var28.field8227, (byte)43, class10.field125);
                           var28.field8243 = 0;
                           class179.field2223 = var28.method4288((byte)121);
                           class18.field242 = var28.method4288((byte)102);
                           class785.field11467 = ~var28.method4288((byte)127) == -2;
                           class683.field10013 = ~var28.method4288((byte)124) == -2;
                           class65.field738 = var28.method4288((byte)105) == 1;
                           class556.field7642 = var28.method4288((byte)115) == 1;
                           class602.field8397 = var28.method4280(-19104);
                           class530.field7265 = ~var28.method4288((byte)90) == -2;
                           class263.field3443 = var28.method4309((byte)96);
                           class56.field607 = ~var28.method4288((byte)117) == -2;
                           class472.field6533.method3593(class56.field607, (byte)47);
                           class645.field9054.method484(class56.field607, 0);
                           class742.field10813.method2435(true, class56.field607);
                           if (!var1) {
                              break label761;
                           }
                        }

                        if (!class604.field8418.field2779.method1029(!arg0, class10.field125)) {
                           return;
                        }

                        class604.field8418.field2779.method1030(0, var28.field8227, (byte)43, class10.field125);
                        var28.field8243 = 0;
                        class179.field2223 = var28.method4288((byte)121);
                        class18.field242 = var28.method4288((byte)127);
                        class785.field11467 = var28.method4288((byte)123) == 1;
                        class683.field10013 = ~var28.method4288((byte)63) == -2;
                        class65.field738 = ~var28.method4288((byte)71) == -2;
                        class179.field2222 = var28.method4304((byte)27);
                        class312.field4140 = class179.field2222 - class792.method5708(-25005) - var28.method4277(-66);
                        int var29 = var28.method4288((byte)79);
                        class530.field7265 = ~(1 & var29) != -1;
                        class226.field2838 = (2 & var29) != 0;
                        class603.field8412 = var28.method4302(true);
                        class623.field8703 = var28.method4280(-19104);
                        class511.field7077 = var28.method4280(-19104);
                        class127.field1607 = var28.method4280(-19104);
                        class338.field4841 = var28.method4302(true);
                        class296.field3878 = class61.field671.method1950(3, class338.field4841);
                        class460.field6311 = var28.method4288((byte)66);
                        class552.field7598 = var28.method4280(-19104);
                        class257.field3291 = var28.method4280(-19104);
                        class311.field4118 = ~var28.method4288((byte)80) == -2;
                        class278.field3709.field5662 = class278.field3709.field5664 = class755.field10960 = var28.method4325(false);
                        class12.field141 = var28.method4288((byte)113);
                        class367.field5176 = var28.method4302(true);
                        class465.field6391 = ~var28.method4288((byte)92) == -2;
                        class97.field1272 = new class454();
                        class97.field1272.field6242 = var28.method4280(-19104);
                        if (class97.field1272.field6242 == 65535) {
                           class97.field1272.field6242 = -1;
                        }

                        class97.field1272.field6244 = var28.method4325(arg0);
                        if (class304.field4027 != class269.field3480) {
                           class97.field1272.field6241 = 50000 - -class97.field1272.field6242;
                           class97.field1272.field6239 = class97.field1272.field6242 + 40000;
                        }

                        if (class5.field30 != class269.field3480 && (class269.field3480 != class146.field1928 || ~class179.field2223 > -3) && (class698.field10191.method3347(56, class85.field1100) || class698.field10191.method3347(105, class41.field473))) {
                           class277.method2110(true);
                        }
                     }

                     label848: {
                        if (class785.field11467 && !class65.field738 || class530.field7265) {
                           try {
                              class164.method1307(-22955, class126.field1586, field2264[2]);
                              break label848;
                           } catch (Throwable var37) {
                              if (!class749.field10902) {
                                 break label848;
                              }

                              try {
                                 class126.field1586.getAppletContext().showDocument(new URL(class126.field1586.getCodeBase(), field2264[8]), field2264[3]);
                                 break label848;
                              } catch (Exception var36) {
                                 if (!var1) {
                                    break label848;
                                 }
                              }
                           }
                        }

                        try {
                           class164.method1307(-22955, class126.field1586, field2264[11]);
                        } catch (Throwable var35) {
                        }
                     }

                     if (class304.field4027 == class269.field3480) {
                        try {
                           class164.method1307(-22955, class126.field1586, field2264[7]);
                        } catch (Throwable var34) {
                        }
                     }

                     if (class619.field8658 != 2) {
                        class545.field7442 = 0;
                        class365.method2827(2, true);
                        class131.method1104((byte)-94);
                        class397.method3019(88, 7);
                        class604.field8418.field2790 = null;
                        return;
                     }

                     class545.field7442 = 16;
                  }

                  if (~class545.field7442 == -17) {
                     if (!class604.field8418.field2779.method1029(true, 3)) {
                        return;
                     }

                     class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 3);
                     class545.field7442 = 17;
                  }

                  if (class545.field7442 == 17) {
                     class206 var30 = class604.field8418.field2788;
                     var30.field8243 = 0;
                     if (var30.method1555(7537)) {
                        if (!class604.field8418.field2779.method1029(true, 1)) {
                           return;
                        }

                        class604.field8418.field2779.method1030(3, var30.field8227, (byte)43, 1);
                     }

                     class604.field8418.field2790 = class785.method5654(16)[var30.method1565(-117)];
                     class604.field8418.field2798 = var30.method4280(-19104);
                     class545.field7442 = 15;
                  }

                  if (class545.field7442 == 15) {
                     if (class604.field8418.field2779.method1029(true, class604.field8418.field2798)) {
                        int var31;
                        label526: {
                           class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, class604.field8418.field2798);
                           class604.field8418.field2788.field8243 = 0;
                           class545.field7442 = 0;
                           var31 = class604.field8418.field2798;
                           class365.method2827(2, true);
                           class203.method1526(0);
                           class35.method272(103, class604.field8418.field2788);
                           class446.field6176 = -1;
                           if (class232.field2882 == class604.field8418.field2790) {
                              class369.method2849((byte)-32);
                              if (!var1) {
                                 break label526;
                              }
                           }

                           class45.method381(8);
                        }

                        if (~class604.field8418.field2788.field8243 != ~var31) {
                           throw new RuntimeException(field2264[10] + class604.field8418.field2788.field8243 + field2264[4] + var31);
                        } else {
                           class604.field8418.field2790 = null;
                        }
                     }
                  } else if (~class545.field7442 == -20) {
                     if (~class604.field8418.field2798 == 1) {
                        if (!class604.field8418.field2779.method1029(true, 2)) {
                           return;
                        }

                        class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, 2);
                        class604.field8418.field2788.field8243 = 0;
                        class604.field8418.field2798 = class604.field8418.field2788.method4280(-19104);
                     }

                     if (class604.field8418.field2779.method1029(true, class604.field8418.field2798)) {
                        class604.field8418.field2779.method1030(0, class604.field8418.field2788.field8227, (byte)43, class604.field8418.field2798);
                        class604.field8418.field2788.field8243 = 0;
                        class545.field7442 = 0;
                        int var32 = class604.field8418.field2798;
                        class365.method2827(15, true);
                        class224.method1713((byte)-14);
                        class35.method272(110, class604.field8418.field2788);
                        if (~class604.field8418.field2788.field8243 != ~var32) {
                           throw new RuntimeException(field2264[6] + class604.field8418.field2788.field8243 + field2264[4] + var32);
                        } else {
                           class604.field8418.field2790 = null;
                        }
                     }
                  }
               }
            } catch (IOException var38) {
               class604.field8418.method1697(115);
               if (~class178.field2215 <= -4) {
                  class545.field7442 = 0;
                  class365.method2827(-4, true);
                  class684.method4996(-104);
               } else {
                  label518: {
                     if (class619.field8658 == 2) {
                        class698.field10191.method3348((byte)-108);
                        if (!var1) {
                           break label518;
                        }
                     }

                     class308.field4093.method3348((byte)-125);
                  }

                  class545.field7442 = 1;
                  class420.field5894 = 0;
                  ++class178.field2215;
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class534.method3846(var39, field2264[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1400(int arg0) {
      try {
         ++field2258;
         if (class614.field8576 != null) {
            class614.field8576.method58(2);
         }

         if (arg0 != 6) {
            method1402(55);
         }

         if (class7.field62 != null) {
            class7.field62.method58(2);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2264[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1401(byte arg0) {
      try {
         int var1 = -16 % ((25 - arg0) / 45);
         field2262 = null;
         field2263 = null;
         field2257 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2264[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1402(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1404(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
