import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class168 {
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2099 = new String[]{method1360(method1359("$\u0004O5 ")), method1360(method1359("$\u0004O3 ")), method1360(method1359("$\u0004O2 ")), method1360(method1359("7[O_u")), method1360(method1359("\"\u0000\r\u001d")), method1360(method1359("$\u0004O0 ")), method1360(method1359("?\u0016\u0000\u0001ml\u0018\u0000\u0018f")), method1360(method1359("$\u0000\u0007\u0017e-\u001b")), method1360(method1359("$\u0004O4 ")), method1360(method1359(" \u001a\u0003\u0013q?\u0016\u0013\u0014m\"")), method1360(method1359(" \u001a\u0006\u0018f?\u0016\u0013\u0014m\""))};
   @OriginalMember(
      owner = "client!hq",
      name = "i",
      descriptor = "I"
   )
   public int field2090;
   @OriginalMember(
      owner = "client!hq",
      name = "c",
      descriptor = "I"
   )
   public static int field2091;
   @OriginalMember(
      owner = "client!hq",
      name = "h",
      descriptor = "I"
   )
   public int field2092;
   @OriginalMember(
      owner = "client!hq",
      name = "f",
      descriptor = "I"
   )
   public static int field2093;
   @OriginalMember(
      owner = "client!hq",
      name = "g",
      descriptor = "I"
   )
   public int field2094;
   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "I"
   )
   public static int field2095;
   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "I"
   )
   public static int field2096;
   @OriginalMember(
      owner = "client!hq",
      name = "e",
      descriptor = "I"
   )
   public static int field2097;
   @OriginalMember(
      owner = "client!hq",
      name = "d",
      descriptor = "I"
   )
   public int field2098;

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(I)I",
      line = 4
   )
   public static final int method1354(int arg0) {
      int var1 = client.field4530;

      try {
         ++field2095;
         if (~class261.field3566.field9437.method4584(115) == -1) {
            int var2 = 0;
            if (var1 != 0 || var2 < class123.field1494) {
               do {
                  if (~class348.field5290[var2].method958(22585) != -116 && ~class348.field5290[var2].method958(22585) != -84) {
                     ++var2;
                  } else {
                     class261.field3566.method4677(class261.field3566.field9437, arg0 + -16331, 1);
                     class365.field5486 = true;
                     if (var1 == 0) {
                        break;
                     }

                     ++var2;
                  }
               } while(var2 < class123.field1494);
            }
         }

         if (class541.field7892 == class172.field2127) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int)((var3.totalMemory() + -var3.freeMemory()) / 1024L);
            long var5 = class188.method1462(true);
            if (class599.field8806 == 0L) {
               class599.field8806 = var5;
            }

            if (var4 > 16384 && ~(-class599.field8806 + var5) > -5001L) {
               if (~(-class409.field6238 + var5) < -1001L) {
                  System.gc();
                  class409.field6238 = var5;
               }

               return 0;
            }
         }

         if (class541.field7892 == class172.field2136) {
            if (class594.field8757 == null) {
               class594.field8757 = new class270(class481.field7144, class726.field10790, class650.field9482, class164.field2066);
            }

            if (!class594.field8757.method2084(arg0 + 3635)) {
               return 0;
            }

            class630.method4542(true, (String)null, 0, true);
            class235.field2986 = !class676.method4937(512);
            class474.field7069 = class78.method744(1, class235.field2986 ? 34 : 32, false, (byte)88);
            class499.field7412 = class78.method744(1, 33, false, (byte)88);
            class712.field10625 = class78.method744(1, 13, false, (byte)88);
         }

         if (class541.field7892 == class172.field2138) {
            boolean var7 = class499.field7412.method3882(111);
            int var8 = class277.field3859[33].method4664(27334);
            int var9 = var8 + class277.field3859[class235.field2986 ? 34 : 32].method4664(27334);
            int var10 = var9 + class277.field3859[13].method4664(27334);
            int var11 = var10 + (var7 ? 100 : class499.field7412.method3893(-92));
            if (var11 != 400) {
               return var11 / 4;
            }

            class753.field11133 = class474.field7069.method3879(0);
            class437.field6669 = class499.field7412.method3879(0);
            class392.method2997(arg0 ^ 16438, class474.field7069);
            int var12 = class261.field3566.field9471.method2754(99);
            class115.field1370 = new class29(class489.field7224, class728.field10827, class499.field7412);
            int[] var13 = class115.field1370.method201(var12, 0);
            if (~var13.length == -1) {
               var13 = class115.field1370.method201(0, arg0 ^ 16454);
            }

            class23 var14 = new class23(class474.field7069, class712.field10625);
            if (var13.length > 0) {
               class26.field282 = new class494[var13.length];
               int var15 = 0;
               if (var1 != 0 || var15 < class26.field282.length) {
                  do {
                     class26.field282[var15] = new class287(class115.field1370.method200((byte)54, var13[var15]), var14);
                     ++var15;
                  } while(var15 < class26.field282.length);
               }
            }
         }

         if (class541.field7892 == class172.field2139) {
            class611.method4451(49, class712.field10625, class357.method2789(29510), class474.field7069);
         }

         if (class541.field7892 == class172.field2140) {
            int var16 = class538.method3990((byte)25);
            int var17 = class502.method3745(2);
            if (var16 < var17) {
               return var16 * 100 / var17;
            }
         }

         if (class541.field7892 == class172.field2141) {
            if (class26.field282 != null && ~class26.field282.length < -1) {
               if (~class26.field282[0].method2186(arg0 + -47701) > -101) {
                  return 0;
               }

               if (class26.field282.length > 1 && class115.field1370.method209(-1) && ~class26.field282[1].method2186(-31247) > -101) {
                  return 0;
               }
            }

            class536.method3978(false, class786.field11439);
            class405.method3108(class786.field11439, false);
            class317.method2411(1, (byte)8);
         }

         if (class541.field7892 == class172.field2142) {
            int var18 = 0;
            if (var1 != 0 || var18 < 4) {
               do {
                  class532.field7778[var18] = class249.method1882(arg0 + -16448, class178.field2197, class323.field4603);
                  ++var18;
               } while(var18 < 4);
            }
         }

         if (class541.field7892 == class172.field2143) {
            class521.field7580 = class78.method744(1, 8, false, (byte)88);
            class303.field4326 = class78.method744(1, 0, false, (byte)88);
            class793.field11544 = class78.method744(1, 1, false, (byte)88);
            class539.field7873 = class78.method744(1, 2, false, (byte)88);
            class261.field3570 = class78.method744(1, 3, false, (byte)88);
            class491.field7266 = class78.method744(1, 4, false, (byte)88);
            class614.field8980 = class78.method744(1, 5, true, (byte)88);
            class382.field5861 = class78.method744(1, 6, true, (byte)88);
            class551.field8148 = class78.method744(1, 7, false, (byte)88);
            class248.field3318 = class78.method744(1, 9, false, (byte)88);
            class351.field5343 = class78.method744(1, 10, false, (byte)88);
            class172.field2157 = class78.method744(1, 11, false, (byte)88);
            class306.field4362 = class78.method744(1, 12, false, (byte)88);
            class604.field8882 = class78.method744(1, 14, false, (byte)88);
            class251.field3357 = class78.method744(1, 15, false, (byte)88);
            class386.field5912 = class78.method744(1, 16, false, (byte)88);
            class276.field3850 = class78.method744(1, 17, false, (byte)88);
            class552.field8187 = class78.method744(1, 18, false, (byte)88);
            class261.field3549 = class78.method744(1, 19, false, (byte)88);
            class728.field10821 = class78.method744(1, 20, false, (byte)88);
            class763.field11220 = class78.method744(1, 21, false, (byte)88);
            class31.field345 = class78.method744(1, 22, false, (byte)88);
            class665.field9670 = class78.method744(1, 23, true, (byte)88);
            class682.field10241 = class78.method744(1, 24, false, (byte)88);
            class356.field5390 = class78.method744(1, 25, false, (byte)88);
            class185.field2312 = class78.method744(1, 26, true, (byte)88);
            class307.field4368 = class78.method744(1, 27, false, (byte)88);
            class421.field6410 = class78.method744(1, 28, true, (byte)88);
            class183.field2269 = class78.method744(1, 29, false, (byte)88);
            class761.field11189 = class78.method744(1, 30, true, (byte)88);
            class552.field8190 = class78.method744(1, 31, true, (byte)88);
            class525.field7630 = class78.method744(2, 36, true, (byte)88);
         }

         if (class541.field7892 == class172.field2144) {
            int var19 = 0;
            int var20 = 0;
            if (var1 != 0) {
               if (class277.field3859[var20] != null) {
                  var19 += class277.field3859[var20].method4664(27334) * class449.field6820[var20] / 100;
                  ++var20;
               } else {
                  ++var20;
               }
            }

            while(true) {
               while(~var20 > -38) {
                  if (class277.field3859[var20] != null) {
                     var19 += class277.field3859[var20].method4664(27334) * class449.field6820[var20] / 100;
                     ++var20;
                  } else {
                     ++var20;
                  }
               }

               if (var1 == 0) {
                  if (var19 != 100) {
                     if (class214.field2717 < 0) {
                        class214.field2717 = var19;
                     }

                     return (var19 - class214.field2717) * 100 / (-class214.field2717 + 100);
                  }

                  class272.method2098(class521.field7580, 11197);
                  class611.method4451(49, class712.field10625, class357.method2789(29510), class521.field7580);
                  break;
               }

               var19 += 100;
               ++var20;
            }
         }

         if (class541.field7892 == class172.field2145) {
            if (~class576.field8559 == 0) {
               class576.field8559 = class382.field5861.method3902(field2099[6], 79);
            }

            class336.method2544(arg0 ^ 12596);
            class317.method2411(2, (byte)119);
         }

         if (class541.field7892 == class172.field2146) {
            class723.method5246(-770208028, class755.field11144, class761.field11189);
         }

         if (class541.field7892 == class172.field2147) {
            int var21 = class74.method726(arg0 ^ -16441);
            if (~var21 > -101) {
               return var21;
            }

            class15.method107(class421.field6410.method3888((byte)40, 1), (byte)-37);
            class232.method1750(class421.field6410.method3888((byte)40, 3), 86);
            class259.field3511 = new class545(class421.field6410);
         }

         if (class541.field7892 == class172.field2148) {
            if (class668.field10056 != -1 && !class551.field8148.method3889(0, -107, class668.field10056)) {
               return 99;
            }

            class204.field2629 = new class136(class185.field2312, class248.field3318, class521.field7580);
            class170.field2105 = new class511(class489.field7224, class728.field10827, class539.field7873);
            class759.field11174 = new class219(class489.field7224, class728.field10827, class539.field7873, class259.field3511);
            class299.field4267 = new class532(class489.field7224, class728.field10827, class539.field7873, class521.field7580);
            class370.field5634 = new class282(class489.field7224, class728.field10827, class276.field3850);
            class318.field4552 = new class724(class489.field7224, class728.field10827, class539.field7873);
            class234.field2978 = new class276(class489.field7224, class728.field10827, class539.field7873);
            class271.field3780 = new class356(class489.field7224, class728.field10827, class539.field7873, class521.field7580);
            class68.field859 = new class264(class489.field7224, class728.field10827, class539.field7873, class551.field8148);
            class774.field11331 = new class420(class489.field7224, class728.field10827, class539.field7873);
            class576.field8556 = new class427(class489.field7224, class728.field10827, class539.field7873);
            class151.field1896 = new class699(class489.field7224, class728.field10827, true, class386.field5912, class551.field8148);
            class536.field7828 = new class432(class489.field7224, class728.field10827, class539.field7873, class521.field7580);
            class427.field6523 = new class561(class489.field7224, class728.field10827, class539.field7873, class521.field7580);
            class536.field7845 = new class445(class489.field7224, class728.field10827, true, class552.field8187, class551.field8148);
            class54.field616 = new class222(class489.field7224, class728.field10827, true, class170.field2105, class261.field3549, class551.field8148);
            class793.field11562 = new class361(class489.field7224, class728.field10827, class539.field7873);
            class576.field8554 = new class417(class489.field7224, class728.field10827, class728.field10821, class303.field4326, class793.field11544);
            class127.field1526 = new class259(class489.field7224, class728.field10827, class539.field7873);
            class530.field7707 = new class466(class489.field7224, class728.field10827, class539.field7873);
            class619.field9029 = new class491(class489.field7224, class728.field10827, class763.field11220, class551.field8148);
            class525.field7633 = new class674(class489.field7224, class728.field10827, class539.field7873);
            class605.field8890 = new class48(class489.field7224, class728.field10827, class539.field7873);
            class622.field9071 = new class22(class489.field7224, class728.field10827, class539.field7873);
            class639.field9324 = new class538(class489.field7224, class728.field10827, class31.field345);
            class748.field11092 = new class477(class489.field7224, class728.field10827, class539.field7873);
            class387.field5915 = new class325(class489.field7224, class728.field10827, class539.field7873);
            class413.method3154(class521.field7580, class712.field10625, class261.field3570, class551.field8148, false);
            class263.method1995((byte)-43, class183.field2269);
            class269.field3753 = new class196(class728.field10827, class682.field10241, class356.field5390);
            class761.field11185 = new class221(class728.field10827, class682.field10241, class356.field5390, new class307());
            class559.method4143((byte)64);
            class151.field1896.method5068(116, ~class261.field3566.field9428.method2175(95) == -1);
            class597.field8793 = new class152();
            class157.method1304(-116);
            class684.method4972(class307.field4368, false);
            class258.method1952(class204.field2629, true, class551.field8148);
            class15 var22 = new class15(class351.field5343.method3878(false, field2099[7], ""));
            class733.method5328(var22, -122);

            try {
               jagmisc.init();
            } catch (Throwable var31) {
            }

            class401.field6167 = class39.method270(82);
            class488.field7219 = new class633(true, class755.field11144);
         }

         if (class541.field7892 == class172.field2150) {
            int var23 = class16.method118((byte)-64, class521.field7580) - -class687.method4995((byte)-1, true);
            int var24 = class58.method489((byte)55) - -class502.method3745(2);
            if (~var23 > ~var24) {
               return var23 * 100 / var24;
            }
         }

         if (arg0 != 16454) {
            return 11;
         } else {
            if (class541.field7892 == class172.field2151) {
               class329.method2474(class665.field9670, class318.field4552, class234.field2978, class151.field1896, class536.field7828, class427.field6523, class597.field8793);
            }

            if (class541.field7892 == class172.field2152) {
               class491.field7260 = new boolean[class622.field9071.field232];
               class732.field10855 = new int[class622.field9071.field232];
               class1.field56 = new String[class605.field8890.field582];
               int var25 = 0;
               if (var1 != 0) {
                  if (class622.field9071.method148(-62, var25).field1653 == 0) {
                     class491.field7260[var25] = true;
                     ++class668.field10057;
                  }

                  class732.field10855[var25] = -1;
                  ++var25;
               }

               while(true) {
                  while(var25 < class622.field9071.field232) {
                     if (class622.field9071.method148(-62, var25).field1653 == 0) {
                        class491.field7260[var25] = true;
                        ++class668.field10057;
                     }

                     class732.field10855[var25] = -1;
                     ++var25;
                  }

                  class262.method1992(-128);
                  class22.field236 = class261.field3570.method3902(field2099[10], 110);
                  class314.field4492 = class261.field3570.method3902(field2099[9], 103);
                  class614.field8980.method3880(false, arg0 + -16455, true);
                  class382.field5861.method3880(true, -1, true);
                  class521.field7580.method3880(true, -1, true);
                  class712.field10625.method3880(true, arg0 ^ -16455, true);
                  class351.field5343.method3880(true, -1, true);
                  class261.field3570.method3880(true, -1, true);
                  class87.field1056 = true;
                  class539.field7873.field7651 = 2;
                  class276.field3850.field7651 = 2;
                  class386.field5912.field7651 = 2;
                  class552.field8187.field7651 = 2;
                  class261.field3549.field7651 = 2;
                  class728.field10821.field7651 = 2;
                  if (var1 == 0) {
                     class763.field11220.field7651 = 2;
                     break;
                  }

                  ++var25;
               }
            }

            if (class541.field7892 == class172.field2153) {
               if (!class647.method4669(class22.field236, (byte)-59)) {
                  return 0;
               }

               boolean var26 = true;
               int var27 = 0;
               if (var1 != 0 || ~class136.field1744[class22.field236].length < ~var27) {
                  do {
                     class544 var28 = class136.field1744[class22.field236][var27];
                     if (~var28.field7920 == -6 && var28.field8079 != -1 && !class521.field7580.method3889(0, -126, var28.field8079)) {
                        var26 = false;
                     }

                     ++var27;
                  } while(~class136.field1744[class22.field236].length < ~var27);
               }

               if (!var26) {
                  return 0;
               }
            }

            if (class541.field7892 == class172.field2154) {
               class247.method1851((byte)-44, true);
            }

            if (class541.field7892 == class172.field2155) {
               class623.field9082.method3015((byte)80);

               try {
                  class753.field11134.join();
               } catch (InterruptedException var30) {
                  return 0;
               }

               label267: {
                  class753.field11134 = null;
                  class474.field7069 = null;
                  class499.field7412 = null;
                  class623.field9082 = null;
                  class115.field1370 = null;
                  class26.field282 = null;
                  class678.method4949(2);
                  class577.field8570 = ~class261.field3566.field9437.method4584(107) == -2;
                  class261.field3566.method4677(class261.field3566.field9437, 76, 1);
                  if (!class577.field8570) {
                     if (!class261.field3566.field9465.field8498 || ~class488.field7219.field9191 <= -513 || class488.field7219.field9191 == 0) {
                        break label267;
                     }

                     class261.field3566.method4677(class261.field3566.field9465, 106, 0);
                     if (var1 == 0) {
                        break label267;
                     }
                  }

                  class261.field3566.method4677(class261.field3566.field9465, 109, 0);
               }

               label256: {
                  class471.method3510((byte)118);
                  if (!class577.field8570) {
                     class428.method3261(false, arg0 + -16578, class261.field3566.field9465.method4225(125));
                     if (var1 == 0) {
                        break label256;
                     }
                  }

                  class428.method3261(false, -122, 0);
               }

               class734.method5339(arg0 ^ 16426, -1, class261.field3566.field9448.method4352(123), -1, false);
               class536.method3978(false, class786.field11439);
               class405.method3108(class786.field11439, false);
               class288.method2195(class521.field7580, class786.field11439, 93);
               class416.method3180(class134.field1717, -6202);
            }

            return class481.method3572(arg0 + -16455);
         }
      } catch (RuntimeException var32) {
         throw class670.method4877(var32, field2099[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(BII)Z",
      line = 456
   )
   public static final boolean method1355(byte arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field2097;
         if (!class750.field11111) {
            return false;
         } else {
            int var4 = arg2 >> 16;
            int var5 = 65535 & arg2;
            if (arg0 != -16) {
               return true;
            } else if (class136.field1744[var4] != null && class136.field1744[var4][var5] != null) {
               int var10000;
               class544 var6;
               class303 var7;
               label194: {
                  var6 = class136.field1744[var4][var5];
                  if (arg1 != -1 || var6.field7920 != 0) {
                     var7 = (class303)class459.field6947.method4071((byte)127);
                     if (var3 != 0) {
                        if (~var7.field4321 == ~arg1 && ~var6.field8054 == ~var7.field4328 && (var7.field4333 == 17 || ~var7.field4333 == -1004 || var7.field4333 == 20 || ~var7.field4333 == -22 || ~var7.field4333 == -12)) {
                           return true;
                        }

                        var7 = (class303)class459.field6947.method4059((byte)108);
                     }

                     while(true) {
                        while(var7 != null) {
                           if (~var7.field4321 == ~arg1 && ~var6.field8054 == ~var7.field4328 && (var7.field4333 == 17 || ~var7.field4333 == -1004 || var7.field4333 == 20 || ~var7.field4333 == -22 || ~var7.field4333 == -12)) {
                              return true;
                           }

                           var7 = (class303)class459.field6947.method4059((byte)108);
                        }

                        if (var3 == 0) {
                           if (var3 == 0) {
                              var10000 = 0;
                              if (var3 == 0) {
                                 return false;
                              }
                              break label194;
                           }
                           break;
                        }

                        var7 = (class303)class459.field6947.method4059((byte)108);
                     }
                  }

                  var7 = (class303)class459.field6947.method4071((byte)127);
                  if (var3 != 0) {
                     var10000 = var7.field4333;
                  } else if (var7 == null) {
                     var10000 = 0;
                     if (var3 == 0) {
                        return false;
                     }
                  } else {
                     var10000 = var7.field4333;
                  }
               }

               while(true) {
                  if (var10000 != 17 && ~var7.field4333 != -1004 && ~var7.field4333 != -21 && var7.field4333 != 21 && var7.field4333 != 11) {
                     var7 = (class303)class459.field6947.method4059((byte)-43);
                  } else {
                     class544 var8 = class543.method4011(var7.field4328, (byte)126);
                     if (var3 != 0) {
                        if (var6.field8054 == var8.field8054) {
                           return true;
                        }

                        var8 = class610.method4447(15178, var8);
                     }

                     while(var8 != null) {
                        if (var6.field8054 == var8.field8054) {
                           return true;
                        }

                        var8 = class610.method4447(15178, var8);
                     }

                     var7 = (class303)class459.field6947.method4059((byte)-43);
                  }

                  if (var7 == null) {
                     var10000 = 0;
                     if (var3 == 0) {
                        return false;
                     }
                  } else {
                     var10000 = var7.field4333;
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2099[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(Lct;I)I",
      line = 524
   )
   public static final int method1356(class155 arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field2091;
         class369 var3 = arg0.field1971;
         if (var3.field5590 != null) {
            var3 = var3.method2872(true, class597.field8793);
            if (var3 == null) {
               return -1;
            }
         }

         int var4 = var3.field5560;
         class283 var5 = arg0.method3052(20733);
         if (~arg0.field6078 != arg1 && !arg0.field6106) {
            if (arg0.field6078 != var5.field3959 && arg0.field6078 != var5.field3964 && arg0.field6078 != var5.field3942 && arg0.field6078 != var5.field3960) {
               if (arg0.field6078 != var5.field3950 && ~arg0.field6078 != ~var5.field3938 && ~arg0.field6078 != ~var5.field3977 && arg0.field6078 != var5.field3949) {
                  return var4;
               }

               var4 = var3.field5587;
               if (var2 == 0) {
                  return var4;
               }
            }

            var4 = var3.field5624;
            if (var2 == 0) {
               return var4;
            }
         }

         var4 = var3.field5600;
         return var4;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2099[2] + (arg0 != null ? field2099[3] : field2099[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(IIJ)Ljava/lang/String;",
      line = 561
   )
   public static final String method1357(int arg0, int arg1, long arg2) {
      try {
         class500.method3735(arg2, (byte)-92);
         ++field2096;
         int var4 = class447.field6798.get(5);
         int var5 = class447.field6798.get(arg1);
         int var6 = class447.field6798.get(1);
         return ~arg0 == -4 ? class482.method3578(arg0, 105, arg2) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class783.field11419[arg0][var5] + "-" + var6;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2099[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(I)[Lvh;",
      line = 579
   )
   public static final class378[] method1358(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field2093;
            return new class378[]{class436.field6657, class397.field6094, class536.field7815};
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2099[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1359(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1360(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
