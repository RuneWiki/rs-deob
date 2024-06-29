import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class387 {
   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6090 = new String[]{method3132(method3131("M3y'4")), method3132(method3131("M46\u0011y\u001e:6\br")), method3132(method3131("V\"1\u0007q_9")), method3132(method3131("M3y\"4")), method3132(method3131("M3y%4")), method3132(method3131("M3y$4"))};
   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "Lfq;"
   )
   public static class374 field6083 = null;
   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field6084 = true;
   @OriginalMember(
      owner = "client!sd",
      name = "f",
      descriptor = "I"
   )
   public static int field6085 = 1;
   @OriginalMember(
      owner = "client!sd",
      name = "e",
      descriptor = "I"
   )
   public static int field6089 = 52;
   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "I"
   )
   public static int field6086;
   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "I"
   )
   public static int field6087;
   @OriginalMember(
      owner = "client!sd",
      name = "g",
      descriptor = "I"
   )
   public static int field6088;

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(I)J"
   )
   public abstract long method2297(int arg0);

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3127(int arg0) {
      try {
         if (arg0 > 82) {
            field6083 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6090[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(JI)I"
   )
   public final int method3128(long arg0, int arg1) {
      try {
         ++field6087;
         long var4 = this.method2297(-106);
         if (var4 > (long)arg1) {
            class697.method5128(var4, -71);
         }

         return this.method2299((byte)87, arg0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6090[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(BJ)I"
   )
   public abstract int method2299(byte arg0, long arg1);

   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "(I)J"
   )
   public abstract long method2300(int arg0);

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3129(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(Z)I"
   )
   public static final int method3130(boolean arg0) {
      boolean var1 = client.field1786;

      try {
         if (~class687.field10213.field522.method1006(480102311) == -1) {
            int var2 = 0;
            if (var1 || ~var2 > ~class202.field3089) {
               do {
                  if (class608.field8857[var2].method315(31589) != 's') {
                     if (class608.field8857[var2].method315(31589) == 'S') {
                        class687.field10213.method299(-17, 1, class687.field10213.field522);
                        class452.field6908 = true;
                        if (!var1) {
                           break;
                        }

                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     class687.field10213.method299(-17, 1, class687.field10213.field522);
                     class452.field6908 = true;
                     if (!var1) {
                        break;
                     }

                     ++var2;
                  }
               } while(~var2 > ~class202.field3089);
            }
         }

         if (arg0) {
            field6085 = -71;
         }

         ++field6086;
         if (class782.field11475 == class718.field10761) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int)((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class162.method1442(14080);
            if (class316.field4885 == 0L) {
               class316.field4885 = var5;
            }

            if (var4 > 16384 && ~(-class316.field4885 + var5) > -5001L) {
               if (-class483.field7358 + var5 > 1000L) {
                  System.gc();
                  class483.field7358 = var5;
               }

               return 0;
            }
         }

         if (class782.field11478 == class718.field10761) {
            if (class397.field6223 == null) {
               class397.field6223 = new class477(class522.field7958, class740.field11003, class87.field1269, class28.field340);
            }

            if (!class397.field6223.method3712(-43)) {
               return 0;
            }

            class423.method3358(false, (String)null, true, 0);
            class466.field7081 = !class369.method3023(256);
            class520.field7906 = class240.method2045(!class466.field7081 ? 32 : 34, 1, false, -1);
            class683.field10174 = class240.method2045(33, 1, false, -1);
            class27.field324 = class240.method2045(13, 1, false, -1);
         }

         if (class782.field11479 == class718.field10761) {
            boolean var7 = class683.field10174.method5006((byte)122);
            int var8 = class311.field4826[33].method5437(94);
            int var9 = var8 + class311.field4826[!class466.field7081 ? 32 : 34].method5437(99);
            int var10 = var9 + class311.field4826[13].method5437(116);
            int var11 = var10 + (var7 ? 100 : class683.field10174.method4997(false));
            if (var11 != 400) {
               return var11 / 4;
            }

            class127.field1821 = class520.field7906.method5020(1);
            class760.field11233 = class683.field10174.method5020(1);
            class315.method2609(class520.field7906, (byte)-97);
            int var12 = class687.field10213.field539.method5627(480102311);
            class312.field4845 = new class435(class410.field6382, class493.field7455, class683.field10174);
            int[] var13 = class312.field4845.method3424(-72, var12);
            if (var13.length == 0) {
               var13 = class312.field4845.method3424(-76, 0);
            }

            class745 var14 = new class745(class520.field7906, class27.field324);
            if (~var13.length < -1) {
               class366.field5697 = new class157[var13.length];
               int var15 = 0;
               if (var1 || ~class366.field5697.length < ~var15) {
                  do {
                     class366.field5697[var15] = new class90(class312.field4845.method3425(var13[var15], 3782), var14);
                     ++var15;
                  } while(~class366.field5697.length < ~var15);
               }
            }
         }

         if (class782.field11480 == class718.field10761) {
            class485.method3773(class520.field7906, class27.field324, 1, class464.method3602(-94));
         }

         if (class782.field11481 == class718.field10761) {
            int var16 = class624.method4580(126);
            int var17 = class119.method1090(-116);
            if (~var17 < ~var16) {
               return var16 * 100 / var17;
            }
         }

         if (class782.field11482 == class718.field10761) {
            if (class366.field5697 != null && class366.field5697.length > 0) {
               if (class366.field5697[0].method856((byte)-107) < 100) {
                  return 0;
               }

               if (~class366.field5697.length < -2 && class312.field4845.method3428(true) && ~class366.field5697[1].method856((byte)-108) > -101) {
                  return 0;
               }
            }

            class463.method3592(0, class351.field5356);
            class40.method283(class351.field5356, 110);
            class69.method532(1, 1);
         }

         if (class782.field11483 == class718.field10761) {
            int var18 = 0;
            if (var1 || ~var18 > -5) {
               do {
                  class221.field3326[var18] = class689.method5079(-60, class513.field7828, class475.field7230);
                  ++var18;
               } while(~var18 > -5);
            }
         }

         if (class782.field11484 == class718.field10761) {
            class316.field4879 = class240.method2045(8, 1, false, -1);
            class426.field6578 = class240.method2045(0, 1, false, -1);
            class8.field62 = class240.method2045(1, 1, false, -1);
            class542.field8173 = class240.method2045(2, 1, false, -1);
            class135.field1904 = class240.method2045(3, 1, false, -1);
            class633.field9157 = class240.method2045(4, 1, false, -1);
            class742.field11031 = class240.method2045(5, 1, true, -1);
            class690.field10251 = class240.method2045(6, 1, true, -1);
            class467.field7107 = class240.method2045(7, 1, false, -1);
            class364.field5630 = class240.method2045(9, 1, false, -1);
            class761.field11251 = class240.method2045(10, 1, false, -1);
            class455.field6954 = class240.method2045(11, 1, false, -1);
            class357.field5518 = class240.method2045(12, 1, false, -1);
            class450.field6891 = class240.method2045(14, 1, false, -1);
            class329.field4989 = class240.method2045(15, 1, false, -1);
            class32.field407 = class240.method2045(16, 1, false, -1);
            class391.field6141 = class240.method2045(17, 1, false, -1);
            class734.field10945 = class240.method2045(18, 1, false, -1);
            class208.field3175 = class240.method2045(19, 1, false, -1);
            class356.field5481 = class240.method2045(20, 1, false, -1);
            class201.field3081 = class240.method2045(21, 1, false, -1);
            class500.field7657 = class240.method2045(22, 1, false, -1);
            class293.field4641 = class240.method2045(23, 1, true, -1);
            class126.field1809 = class240.method2045(24, 1, false, -1);
            class449.field6884 = class240.method2045(25, 1, false, -1);
            class499.field7653 = class240.method2045(26, 1, true, -1);
            class758.field11219 = class240.method2045(27, 1, false, -1);
            class219.field3322 = class240.method2045(28, 1, true, -1);
            class633.field9156 = class240.method2045(29, 1, false, -1);
            class331.field5020 = class240.method2045(30, 1, true, -1);
            class385.field6069 = class240.method2045(31, 1, true, -1);
            class609.field8868 = class240.method2045(36, 2, true, -1);
         }

         if (class782.field11485 == class718.field10761) {
            int var19 = 0;
            int var20 = 0;
            if (var1) {
               if (class311.field4826[var20] != null) {
                  var19 += class311.field4826[var20].method5437(108) * class214.field3252[var20] / 100;
                  ++var20;
               } else {
                  ++var20;
               }
            }

            while(true) {
               while(var20 < 37) {
                  if (class311.field4826[var20] != null) {
                     var19 += class311.field4826[var20].method5437(108) * class214.field3252[var20] / 100;
                     ++var20;
                  } else {
                     ++var20;
                  }
               }

               if (!var1) {
                  if (var19 != 100) {
                     if (class594.field8743 < 0) {
                        class594.field8743 = var19;
                     }

                     return (-class594.field8743 + var19) * 100 / (-class594.field8743 + 100);
                  }

                  class325.method2664(class316.field4879, (byte)-88);
                  class485.method3773(class316.field4879, class27.field324, 1, class464.method3602(-124));
                  break;
               }

               var19 += 100;
               ++var20;
            }
         }

         if (class782.field11486 == class718.field10761) {
            if (class155.field2312 == -1) {
               class155.field2312 = class690.field10251.method4999(field6090[1], (byte)49);
            }

            class47.method335(-121);
            class69.method532(1, 2);
         }

         if (class782.field11487 == class718.field10761) {
            class624.method4581(class498.field7578, false, class331.field5020);
         }

         if (class782.field11488 == class718.field10761) {
            int var21 = class553.method4204((byte)72);
            if (var21 < 100) {
               return var21;
            }

            class183.method1662(class219.field3322.method5025(0, 1), -24048);
            class325.method2656(-1, class219.field3322.method5025(0, 3));
            class31.field381 = new class47(class219.field3322);
         }

         if (class782.field11489 == class718.field10761) {
            if (~class650.field9378 != 0 && !class467.field7107.method4994(0, 100, class650.field9378)) {
               return 99;
            }

            class652.field9583 = new class155(class499.field7653, class364.field5630, class316.field4879);
            class610.field8879 = new class24(class410.field6382, class493.field7455, class542.field8173);
            class252.field3808 = new class14(class410.field6382, class493.field7455, class542.field8173, class31.field381);
            class581.field8578 = new class704(class410.field6382, class493.field7455, class542.field8173, class316.field4879);
            class684.field10178 = new class296(class410.field6382, class493.field7455, class391.field6141);
            class429.field6629 = new class731(class410.field6382, class493.field7455, class542.field8173);
            class29.field347 = new class747(class410.field6382, class493.field7455, class542.field8173);
            class523.field7971 = new class204(class410.field6382, class493.field7455, class542.field8173, class316.field4879);
            class738.field10964 = new class486(class410.field6382, class493.field7455, class542.field8173, class467.field7107);
            class639.field9250 = new class514(class410.field6382, class493.field7455, class542.field8173);
            class342.field5201 = new class123(class410.field6382, class493.field7455, class542.field8173);
            class102.field1434 = new class158(class410.field6382, class493.field7455, true, class32.field407, class467.field7107);
            class508.field7776 = new class17(class410.field6382, class493.field7455, class542.field8173, class316.field4879);
            class230.field3520 = new class520(class410.field6382, class493.field7455, class542.field8173, class316.field4879);
            class412.field6401 = new class81(class410.field6382, class493.field7455, true, class734.field10945, class467.field7107);
            class247.field3763 = new class241(class410.field6382, class493.field7455, true, class610.field8879, class208.field3175, class467.field7107);
            class293.field4644 = new class101(class410.field6382, class493.field7455, class542.field8173);
            class314.field4861 = new class657(class410.field6382, class493.field7455, class356.field5481, class426.field6578, class8.field62);
            class739.field10975 = new class464(class410.field6382, class493.field7455, class542.field8173);
            class88.field1274 = new class238(class410.field6382, class493.field7455, class542.field8173);
            class317.field4896 = new class181(class410.field6382, class493.field7455, class201.field3081, class467.field7107);
            class649.field9349 = new class698(class410.field6382, class493.field7455, class542.field8173);
            class437.field6687 = new class616(class410.field6382, class493.field7455, class542.field8173);
            class623.field9050 = new class777(class410.field6382, class493.field7455, class542.field8173);
            class228.field3467 = new class108(class410.field6382, class493.field7455, class500.field7657);
            class479.field7291 = new class65(class410.field6382, class493.field7455, class542.field8173);
            class750.field11119 = new class392(class410.field6382, class493.field7455, class542.field8173);
            class750.field11116 = new class438(class410.field6382, class493.field7455, class542.field8173);
            class411.method3290(class27.field324, class467.field7107, class135.field1904, (byte)-107, class316.field4879);
            class741.method5444(false, class633.field9156);
            class653.field9775 = new class226(class493.field7455, class126.field1809, class449.field6884);
            class557.field8302 = new class540(class493.field7455, class126.field1809, class449.field6884, new class177());
            class435.method3426(true);
            class102.field1434.method1415(~class687.field10213.field536.method5531(480102311) == -1, true);
            class45.field599 = new class98();
            class698.method5133(-5);
            class136.method1264((byte)-93, class314.field4861);
            class485.method3771(class758.field11219, 0);
            class38.method273(class467.field7107, 44795308, class652.field9583);
            class431 var22 = new class431(class761.field11251.method5023("", field6090[2], 0));
            class374.method3049(true, var22);

            try {
               jagmisc.init();
            } catch (Throwable var31) {
            }

            class255.field3856 = class425.method3374(-9);
            class610.field8885 = new class632(true, class498.field7578);
         }

         if (class782.field11491 == class718.field10761) {
            int var23 = class577.method4324((byte)-83, class316.field4879) - -class665.method4915(true, 0);
            int var24 = class582.method4352(-11254) - -class119.method1090(-119);
            if (var23 < var24) {
               return var23 * 100 / var24;
            }
         }

         if (class782.field11492 == class718.field10761) {
            class60.method459(class293.field4641, class429.field6629, class29.field347, class102.field1434, class508.field7776, class230.field3520, class45.field599);
         }

         if (class782.field11493 == class718.field10761) {
            class84.field1222 = new int[class623.field9050.field11409];
            class755.field11193 = new String[class437.field6687.field8935];
            class486.field7390 = new boolean[class623.field9050.field11409];
            int var25 = 0;
            if (var1) {
               if (~class623.field9050.method5652((byte)-56, var25).field7789 == -1) {
                  class486.field7390[var25] = true;
                  ++class618.field8988;
               }

               class84.field1222[var25] = -1;
               ++var25;
            }

            while(true) {
               while(~class623.field9050.field11409 < ~var25) {
                  if (~class623.field9050.method5652((byte)-56, var25).field7789 == -1) {
                     class486.field7390[var25] = true;
                     ++class618.field8988;
                  }

                  class84.field1222[var25] = -1;
                  ++var25;
               }

               class151.method1381((byte)-108);
               class742.field11031.method5007(true, 122, false);
               class690.field10251.method5007(true, 72, true);
               class316.field4879.method5007(true, 105, true);
               class27.field324.method5007(true, 68, true);
               class761.field11251.method5007(true, 60, true);
               class22.field287 = true;
               class542.field8173.field10119 = 2;
               class391.field6141.field10119 = 2;
               class32.field407.field10119 = 2;
               class734.field10945.field10119 = 2;
               class208.field3175.field10119 = 2;
               class356.field5481.field10119 = 2;
               if (!var1) {
                  class201.field3081.field10119 = 2;
                  break;
               }

               ++var25;
            }
         }

         if (class782.field11494 == class718.field10761) {
            if (!client.method1170(class728.field10872, (byte)-119)) {
               return 0;
            }

            boolean var26 = true;
            int var27 = 0;
            if (var1 || ~var27 > ~class296.field4672[class728.field10872].length) {
               do {
                  class374 var28 = class296.field4672[class728.field10872][var27];
                  if (~var28.field5910 == -6 && var28.field5824 != -1 && !class316.field4879.method4994(0, 100, var28.field5824)) {
                     var26 = false;
                  }

                  ++var27;
               } while(~var27 > ~class296.field4672[class728.field10872].length);
            }

            if (!var26) {
               return 0;
            }
         }

         if (class782.field11495 == class718.field10761) {
            class705.method5199(0, true);
         }

         if (class782.field11496 == class718.field10761) {
            class443.field6804.method1341(100);

            try {
               class90.field1302.join();
            } catch (InterruptedException var30) {
               return 0;
            }

            label267: {
               class312.field4845 = null;
               class90.field1302 = null;
               class520.field7906 = null;
               class366.field5697 = null;
               class443.field6804 = null;
               class683.field10174 = null;
               class336.method2740((byte)-89);
               class93.field1332 = class687.field10213.field522.method1006(480102311) == 1;
               class687.field10213.method299(-17, 1, class687.field10213.field522);
               if (!class93.field1332) {
                  if (!class687.field10213.field494.field6696 || ~class610.field8885.field9141 <= -513 || ~class610.field8885.field9141 == -1) {
                     break label267;
                  }

                  class687.field10213.method299(-17, 0, class687.field10213.field494);
                  if (!var1) {
                     break label267;
                  }
               }

               class687.field10213.method299(-17, 0, class687.field10213.field494);
            }

            label256: {
               class388.method3135(0);
               if (class93.field1332) {
                  class473.method3678(2744, 0, false);
                  if (!var1) {
                     break label256;
                  }
               }

               class473.method3678(2744, class687.field10213.field494.method3440(480102311), false);
            }

            class41.method294(-128, class687.field10213.field504.method3173(480102311), -1, -1, false);
            class463.method3592(0, class351.field5356);
            class40.method283(class351.field5356, 110);
            class281.method2351(class351.field5356, 32323, class316.field4879);
            class636.method4643(-10, class547.field8199);
         }

         return class456.method3565(47);
      } catch (RuntimeException var32) {
         throw class482.method3757(var32, field6090[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method2296(byte arg0);

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
