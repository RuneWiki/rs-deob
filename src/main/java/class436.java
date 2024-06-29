import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class436 {
   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "I"
   )
   public int field6239 = -1;
   @OriginalMember(
      owner = "client!dg",
      name = "j",
      descriptor = "I"
   )
   public int field6237 = -1;
   @OriginalMember(
      owner = "client!dg",
      name = "m",
      descriptor = "[I"
   )
   public int[] field6240;
   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6248 = new String[]{method3220(method3219("~ T3,")), method3220(method3219("~ TKmt.\u000eI,")), method3220(method3219("~ T6,")), method3220(method3219("h$\u001b")), method3220(method3219("aiTYy")), method3220(method3219("t2\u0016\u001b")), method3220(method3219("~ T4,")), method3220(method3219("r2\u001c\u0011i{)")), method3220(method3219("~ T5,")), method3220(method3219("i$\u001b\u0007a:*\u001b\u001ej"))};
   @OriginalMember(
      owner = "client!dg",
      name = "e",
      descriptor = "I"
   )
   public static int field6244 = 0;
   @OriginalMember(
      owner = "client!dg",
      name = "i",
      descriptor = "Lwga;"
   )
   public static class781 field6238 = class635.method4593(0);
   @OriginalMember(
      owner = "client!dg",
      name = "l",
      descriptor = "Lek;"
   )
   public static class536 field6246 = new class536(63, 3);
   @OriginalMember(
      owner = "client!dg",
      name = "g",
      descriptor = "I"
   )
   public static int field6241;
   @OriginalMember(
      owner = "client!dg",
      name = "f",
      descriptor = "I"
   )
   public static int field6242;
   @OriginalMember(
      owner = "client!dg",
      name = "k",
      descriptor = "I"
   )
   public static int field6243;
   @OriginalMember(
      owner = "client!dg",
      name = "d",
      descriptor = "I"
   )
   public static int field6247;
   @OriginalMember(
      owner = "client!dg",
      name = "h",
      descriptor = "[I"
   )
   public int[] field6235;
   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "[I"
   )
   public int[] field6236;
   @OriginalMember(
      owner = "client!dg",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6245;

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(Lwf;I)V"
   )
   private final void method3215(class147 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field6242;

         int var10000;
         label139:
         while(true) {
            int var4 = arg0.method1143(-15465);
            if (var4 != 0) {
               var10000 = ~var4;
               if (var3) {
                  break;
               }

               if (var10000 == -2) {
                  int var5 = arg0.method1143(arg1 ^ -15465);
                  this.field6240 = new int[var5];
                  int var6 = 0;
                  if (var3) {
                     this.field6240[var6] = arg0.method1143(-15465);
                     ++var6;
                  }

                  while(true) {
                     while(this.field6240.length > var6) {
                        this.field6240[var6] = arg0.method1143(-15465);
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           continue label139;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               if (~var4 == -4) {
                  this.field6239 = arg0.method1143(-15465);
                  if (!var3) {
                     continue;
                  }
               }

               if (~var4 != -5) {
                  if (var4 != 5) {
                     if (var4 != 6) {
                        continue;
                     }

                     this.field6235 = new int[arg0.method1143(-15465)];
                     int var7 = 0;
                     if (var3) {
                        this.field6235[var7] = arg0.method1143(arg1 + -15465);
                        ++var7;
                     }

                     while(true) {
                        while(~var7 > ~this.field6235.length) {
                           this.field6235[var7] = arg0.method1143(arg1 + -15465);
                           ++var7;
                        }

                        if (!var3) {
                           if (!var3) {
                              continue label139;
                           }
                           break;
                        }

                        ++var7;
                     }
                  }

                  this.field6236 = new int[arg0.method1143(arg1 ^ -15465)];
                  int var8 = 0;
                  if (var3) {
                     this.field6236[var8] = arg0.method1143(-15465);
                     ++var8;
                  }

                  while(true) {
                     while(~var8 > ~this.field6236.length) {
                        this.field6236[var8] = arg0.method1143(-15465);
                        ++var8;
                     }

                     if (!var3) {
                        if (!var3) {
                           continue label139;
                        }
                        break;
                     }

                     ++var8;
                  }
               }

               this.field6237 = arg0.method1143(-15465);
               if (!var3) {
                  continue;
               }
            }

            var10000 = arg1;
            break;
         }

         if (var10000 != 0) {
            this.field6236 = null;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field6248[6] + (arg0 != null ? field6248[4] : field6248[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method3216(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (class300.field4107.field6426.method4877(111) == 0) {
            int var2 = 0;
            if (var1 || class629.field9234 > var2) {
               do {
                  if (class88.field1150[var2].method2926(78) != 's' && class88.field1150[var2].method2926(104) != 'S') {
                     ++var2;
                  } else {
                     class300.field4107.method3301(25349, class300.field4107.field6426, 1);
                     class102.field1312 = true;
                     if (!var1) {
                        break;
                     }

                     ++var2;
                  }
               } while(class629.field9234 > var2);
            }
         }

         ++field6243;
         if (arg0 < 91) {
            method3218(-63);
         }

         if (class230.field3233 == class187.field2638) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int)((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class133.method1054(-29025);
            if (~class651.field9545 == -1L) {
               class651.field9545 = var5;
            }

            if (var4 > 16384 && -class651.field9545 + var5 < 5000L) {
               if (-class42.field580 + var5 > 1000L) {
                  System.gc();
                  class42.field580 = var5;
               }

               return 0;
            }
         }

         if (class230.field3233 == class187.field2639) {
            if (class488.field6969 == null) {
               class488.field6969 = new class779(class667.field9694, class139.field1773, class14.field161, class14.field163);
            }

            if (!class488.field6969.method5607((byte)-100)) {
               return 0;
            }

            class342.method2507((String)null, 0, true, 0);
            class527.field7546 = !class652.method4781(true);
            class571.field8125 = class265.method2024(1, false, 1000000, class527.field7546 ? 34 : 32);
            class683.field10045 = class265.method2024(1, false, 1000000, 33);
            class487.field6954 = class265.method2024(1, false, 1000000, 13);
         }

         if (class230.field3233 == class187.field2640) {
            boolean var7 = class683.field10045.method2056(121);
            int var8 = class101.field1295[33].method3546(true);
            int var9 = var8 + class101.field1295[class527.field7546 ? 34 : 32].method3546(true);
            int var10 = var9 + class101.field1295[13].method3546(true);
            int var11 = var10 + (!var7 ? class683.field10045.method2044(0) : 100);
            if (~var11 != -401) {
               return var11 / 4;
            }

            class239.field3344 = class571.field8125.method2055(false);
            class723.field10551 = class683.field10045.method2055(false);
            class340.method2496(class571.field8125, 122);
            int var12 = class300.field4107.field6425.method3245(87);
            class13.field149 = new class21(class134.field1715, class608.field8920, class683.field10045);
            int[] var13 = class13.field149.method128(var12, 89);
            if (~var13.length == -1) {
               var13 = class13.field149.method128(0, 18);
            }

            class119 var14 = new class119(class571.field8125, class487.field6954);
            if (~var13.length < -1) {
               class634.field9271 = new class770[var13.length];
               int var15 = 0;
               if (var1 || ~var15 > ~class634.field9271.length) {
                  do {
                     class634.field9271[var15] = new class636(class13.field149.method130(var13[var15], (byte)-128), var14);
                     ++var15;
                  } while(~var15 > ~class634.field9271.length);
               }
            }
         }

         if (class230.field3233 == class187.field2641) {
            class279.method2120(-8192, class487.field6954, class571.field8125, class689.method5030(39));
         }

         if (class230.field3233 == class187.field2642) {
            int var16 = class70.method654((byte)-117);
            int var17 = class564.method4022(4);
            if (var16 < var17) {
               return var16 * 100 / var17;
            }
         }

         if (class230.field3233 == class187.field2643) {
            if (class634.field9271 != null && class634.field9271.length > 0) {
               if (class634.field9271[0].method3862((byte)-106) < 100) {
                  return 0;
               }

               if (class634.field9271.length > 1 && class13.field149.method129(-104) && class634.field9271[1].method3862((byte)-111) < 100) {
                  return 0;
               }
            }

            class751.method5451(-125, class383.field5543);
            class253.method1933(false, class383.field5543);
            class731.method5321(1, (byte)-93);
         }

         if (class230.field3233 == class187.field2644) {
            int var18 = 0;
            if (var1 || ~var18 > -5) {
               do {
                  class767.field11309[var18] = class425.method3139((byte)-70, class337.field4594, class644.field9403);
                  ++var18;
               } while(~var18 > -5);
            }
         }

         if (class230.field3233 == class187.field2645) {
            class281.field3904 = class265.method2024(1, false, 1000000, 8);
            class536.field7672 = class265.method2024(1, false, 1000000, 0);
            class267.field3710 = class265.method2024(1, false, 1000000, 1);
            class418.field6003 = class265.method2024(1, false, 1000000, 2);
            class49.field653 = class265.method2024(1, false, 1000000, 3);
            class146.field1852 = class265.method2024(1, false, 1000000, 4);
            class515.field7437 = class265.method2024(1, true, 1000000, 5);
            class707.field10327 = class265.method2024(1, true, 1000000, 6);
            class699.field10238 = class265.method2024(1, false, 1000000, 7);
            class552.field7921 = class265.method2024(1, false, 1000000, 9);
            class342.field4638 = class265.method2024(1, false, 1000000, 10);
            class598.field8789 = class265.method2024(1, false, 1000000, 11);
            class595.field8745 = class265.method2024(1, false, 1000000, 12);
            class525.field7531 = class265.method2024(1, false, 1000000, 14);
            class213.field3038 = class265.method2024(1, false, 1000000, 15);
            class617.field9088 = class265.method2024(1, false, 1000000, 16);
            class249.field3427 = class265.method2024(1, false, 1000000, 17);
            class666.field9672 = class265.method2024(1, false, 1000000, 18);
            class612.field8985 = class265.method2024(1, false, 1000000, 19);
            class80.field1051 = class265.method2024(1, false, 1000000, 20);
            class170.field2370 = class265.method2024(1, false, 1000000, 21);
            class778.field11397 = class265.method2024(1, false, 1000000, 22);
            class77.field960 = class265.method2024(1, true, 1000000, 23);
            class86.field1135 = class265.method2024(1, false, 1000000, 24);
            class446.field6347 = class265.method2024(1, false, 1000000, 25);
            class252.field3436 = class265.method2024(1, true, 1000000, 26);
            class259.field3556 = class265.method2024(1, false, 1000000, 27);
            class223.field3171 = class265.method2024(1, true, 1000000, 28);
            class635.field9288 = class265.method2024(1, false, 1000000, 29);
            class399.field5754 = class265.method2024(1, true, 1000000, 30);
            class387.field5601 = class265.method2024(1, true, 1000000, 31);
            class742.field10816 = class265.method2024(2, true, 1000000, 36);
         }

         if (class230.field3233 == class187.field2646) {
            int var19 = 0;
            int var20 = 0;
            if (var1) {
               if (class101.field1295[var20] != null) {
                  var19 += class101.field1295[var20].method3546(true) * class234.field3270[var20] / 100;
                  ++var20;
               } else {
                  ++var20;
               }
            }

            while(true) {
               while(~var20 > -38) {
                  if (class101.field1295[var20] != null) {
                     var19 += class101.field1295[var20].method3546(true) * class234.field3270[var20] / 100;
                     ++var20;
                  } else {
                     ++var20;
                  }
               }

               if (!var1) {
                  if (var19 != 100) {
                     if (~class224.field3189 > -1) {
                        class224.field3189 = var19;
                     }

                     return (-class224.field3189 + var19) * 100 / (100 - class224.field3189);
                  }

                  class673.method4894(class281.field3904, (byte)-76);
                  class279.method2120(-8192, class487.field6954, class281.field3904, class689.method5030(-125));
                  break;
               }

               var19 += 100;
               ++var20;
            }
         }

         if (class230.field3233 == class187.field2647) {
            if (class578.field8531 == -1) {
               class578.field8531 = class707.field10327.method2031(0, field6248[9]);
            }

            class606.method4415(0);
            class731.method5321(2, (byte)-109);
         }

         if (class230.field3233 == class187.field2648) {
            class617.method4485(class399.field5754, class316.field4304, 12638);
         }

         if (class230.field3233 == class187.field2649) {
            int var21 = class319.method2368((byte)13);
            if (~var21 > -101) {
               return var21;
            }

            class589.method4284(-99, class223.field3171.method2061((byte)124, 1));
            class644.method4660(-126, class223.field3171.method2061((byte)28, 3));
            class452.field6400 = new class436(class223.field3171);
         }

         if (class230.field3233 == class187.field2650) {
            if (class287.field3966 != -1 && !class699.field10238.method2036(0, class287.field3966, 0)) {
               return 99;
            }

            class271.field3742 = new class194(class252.field3436, class552.field7921, class281.field3904);
            class327.field4469 = new class159(class134.field1715, class608.field8920, class418.field6003);
            class780.field11425 = new class140(class134.field1715, class608.field8920, class418.field6003, class452.field6400);
            class247.field3409 = new class112(class134.field1715, class608.field8920, class418.field6003, class281.field3904);
            class424.field6042 = new class544(class134.field1715, class608.field8920, class249.field3427);
            class266.field3701 = new class321(class134.field1715, class608.field8920, class418.field6003);
            class375.field5415 = new class597(class134.field1715, class608.field8920, class418.field6003);
            class778.field11405 = new class444(class134.field1715, class608.field8920, class418.field6003, class281.field3904);
            class427.field6121 = new class138(class134.field1715, class608.field8920, class418.field6003, class699.field10238);
            class676.field9795 = new class697(class134.field1715, class608.field8920, class418.field6003);
            class645.field9420 = new class708(class134.field1715, class608.field8920, class418.field6003);
            class387.field5618 = new class555(class134.field1715, class608.field8920, true, class617.field9088, class699.field10238);
            class61.field747 = new class786(class134.field1715, class608.field8920, class418.field6003, class281.field3904);
            class294.field4046 = new class635(class134.field1715, class608.field8920, class418.field6003, class281.field3904);
            class195.field2761 = new class220(class134.field1715, class608.field8920, true, class666.field9672, class699.field10238);
            class468.field6728 = new class304(class134.field1715, class608.field8920, true, class327.field4469, class612.field8985, class699.field10238);
            class741.field10810 = new class336(class134.field1715, class608.field8920, class418.field6003);
            class190.field2702 = new class606(class134.field1715, class608.field8920, class80.field1051, class536.field7672, class267.field3710);
            class685.field10097 = new class73(class134.field1715, class608.field8920, class418.field6003);
            class426.field6104 = new class327(class134.field1715, class608.field8920, class418.field6003);
            class478.field6875 = new class255(class134.field1715, class608.field8920, class170.field2370, class699.field10238);
            class612.field8982 = new class474(class134.field1715, class608.field8920, class418.field6003);
            class378.field5455 = new class240(class134.field1715, class608.field8920, class418.field6003);
            class759.field11227 = new class583(class134.field1715, class608.field8920, class418.field6003);
            class631.field9253 = new class587(class134.field1715, class608.field8920, class778.field11397);
            class468.field6732 = new class484(class134.field1715, class608.field8920, class418.field6003);
            class657.field9605 = new class135(class134.field1715, class608.field8920, class418.field6003);
            class184.field2587 = new class725(class134.field1715, class608.field8920, class418.field6003);
            class595.method4325(true, class699.field10238, class487.field6954, class281.field3904, class49.field653);
            class60.method462(-8658, class635.field9288);
            class181.field2545 = new class74(class608.field8920, class86.field1135, class446.field6347);
            class433.field6211 = new class766(class608.field8920, class86.field1135, class446.field6347, new class467());
            class649.method4729((byte)115);
            class387.field5618.method3983(-2, ~class300.field4107.field6412.method1017(-86) == -1);
            class21.field248 = new class57();
            class793.method5717(5539);
            class199.method1569(-5249, class259.field3556);
            class182.method1448(class271.field3742, (byte)-113, class699.field10238);
            class761 var22 = new class761(class342.field4638.method2032("", (byte)-72, field6248[7]));
            class725.method5278((byte)113, var22);

            try {
               jagmisc.init();
            } catch (Throwable var31) {
            }

            class22.field252 = class651.method4763(-1);
            class169.field2360 = new class90(true, class316.field4304);
         }

         if (class230.field3233 == class187.field2652) {
            int var23 = class390.method2966(false, class281.field3904) + class165.method1366(0, true);
            int var24 = class693.method5053((byte)120) - -class564.method4022(4);
            if (~var23 > ~var24) {
               return var23 * 100 / var24;
            }
         }

         if (class230.field3233 == class187.field2653) {
            class650.method4745(class77.field960, class266.field3701, class375.field5415, class387.field5618, class61.field747, class294.field4046, class21.field248);
         }

         if (class230.field3233 == class187.field2654) {
            class14.field164 = new int[class759.field11227.field8634];
            class20.field222 = new boolean[class759.field11227.field8634];
            class423.field6032 = new String[class378.field5455.field3349];
            int var25 = 0;
            if (var1) {
               if (class759.field11227.method4251(var25, (byte)-107).field1644 == 0) {
                  class20.field222[var25] = true;
                  ++class17.field201;
               }

               class14.field164[var25] = -1;
               ++var25;
            }

            while(true) {
               while(~class759.field11227.field8634 < ~var25) {
                  if (class759.field11227.method4251(var25, (byte)-107).field1644 == 0) {
                     class20.field222[var25] = true;
                     ++class17.field201;
                  }

                  class14.field164[var25] = -1;
                  ++var25;
               }

               class209.method1652(false);
               class515.field7437.method2053(true, false, 1);
               class707.field10327.method2053(true, true, 1);
               class281.field3904.method2053(true, true, 1);
               class487.field6954.method2053(true, true, 1);
               class342.field4638.method2053(true, true, 1);
               class199.field2834 = true;
               class418.field6003.field3692 = 2;
               class249.field3427.field3692 = 2;
               class617.field9088.field3692 = 2;
               class666.field9672.field3692 = 2;
               class612.field8985.field3692 = 2;
               class80.field1051.field3692 = 2;
               if (!var1) {
                  class170.field2370.field3692 = 2;
                  break;
               }

               ++var25;
            }
         }

         if (class230.field3233 == class187.field2655) {
            if (!class635.method4596(class156.field2224, 28505)) {
               return 0;
            }

            boolean var26 = true;
            int var27 = 0;
            if (var1 || ~var27 > ~class547.field7851[class156.field2224].length) {
               do {
                  class678 var28 = class547.field7851[class156.field2224][var27];
                  if (var28.field9992 == 5 && var28.field9905 != -1 && !class281.field3904.method2036(0, var28.field9905, 0)) {
                     var26 = false;
                  }

                  ++var27;
               } while(~var27 > ~class547.field7851[class156.field2224].length);
            }

            if (!var26) {
               return 0;
            }
         }

         if (class230.field3233 == class187.field2656) {
            class183.method1458(true, -1001);
         }

         if (class230.field3233 == class187.field2657) {
            class660.field9618.method5439((byte)122);

            try {
               class319.field4375.join();
            } catch (InterruptedException var30) {
               return 0;
            }

            label264: {
               class683.field10045 = null;
               class319.field4375 = null;
               class571.field8125 = null;
               class660.field9618 = null;
               class634.field9271 = null;
               class13.field149 = null;
               class32.method288((byte)-57);
               class766.field11296 = class300.field4107.field6426.method4877(-18) == 1;
               class300.field4107.method3301(25349, class300.field4107.field6426, 1);
               if (class766.field11296) {
                  class300.field4107.method3301(25349, class300.field4107.field6406, 0);
                  if (!var1) {
                     break label264;
                  }
               }

               if (class300.field4107.field6406.field617 && class169.field2360.field1162 < 512 && ~class169.field2360.field1162 != -1) {
                  class300.field4107.method3301(25349, class300.field4107.field6406, 0);
               }
            }

            label259: {
               class441.method3246(0);
               if (class766.field11296) {
                  class42.method358(0, -3, false);
                  if (!var1) {
                     break label259;
                  }
               }

               class42.method358(class300.field4107.field6406.method391(95), -3, false);
            }

            class331.method2445(false, -1, class300.field4107.field6443.method2725(107), false, -1);
            class751.method5451(-128, class383.field5543);
            class253.method1933(false, class383.field5543);
            class464.method3368(-17844, class383.field5543, class281.field3904);
            class636.method4601(class432.field6169, (byte)-104);
         }

         return class144.method1130(-106);
      } catch (RuntimeException var32) {
         throw class237.method1823(var32, field6248[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(BILjava/awt/Canvas;I)Lsu;"
   )
   public static final class224 method3217(byte arg0, int arg1, Canvas arg2, int arg3) {
      try {
         ++field6241;

         try {
            Class var4 = Class.forName(field6248[3]);
            class224 var5 = (class224)var4.newInstance();
            if (arg0 > -70) {
               method3217((byte)50, 109, (Canvas)null, -27);
            }

            var5.method1698((byte)-71, arg3, arg1, arg2);
            return var5;
         } catch (Throwable var8) {
            class215 var6 = new class215();
            var6.method1698((byte)-93, arg3, arg1, arg2);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field6248[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6248[4] : field6248[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "<init>",
      descriptor = "(Lkf;)V"
   )
   private class436(class266 arg0) {
      try {
         byte[] var2 = arg0.method2061((byte)62, 6);
         this.method3215(new class147(var2), 0);
         if (this.field6240 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6248[1] + (arg0 != null ? field6248[4] : field6248[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3218(int arg0) {
      try {
         field6246 = null;
         if (arg0 >= 117) {
            field6238 = null;
            field6245 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6248[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "<init>",
      descriptor = "()V"
   )
   protected class436() {
      try {
         this.field6240 = new int[0];
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6248[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3219(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3220(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
