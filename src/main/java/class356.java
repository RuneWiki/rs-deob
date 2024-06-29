import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class356 extends class644 {
   @OriginalMember(
      owner = "client!qea",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4974 = new String[]{method2829(method2828("})1R)K9 _8O?+G.")), method2829(method2828("Ytk\u001d ")), method2829(method2828("S?$\u001d\u001a\n")), method2829(method2828("L/)_")), method2829(method2828("S?$\u001d\u0018\n")), method2829(method2828("S?$\u001d\u0019\n")), method2829(method2828("S?$\u001d\u001f\n")), method2829(method2828("S?$\u001d\u001e\n")), method2829(method2828("G?$")), method2829(method2828("H;3RsC-1\u001d\u001eM75\\3G41")), method2829(method2828("S?$\u001d\u001c\n")), method2829(method2828("S?$\u001d\u0014\n")), method2829(method2828("S?$\u001d\u0015\n")), method2829(method2828("S?$\u001d\u001b\n"))};
   @OriginalMember(
      owner = "client!qea",
      name = "y",
      descriptor = "I"
   )
   public static int field4961;
   @OriginalMember(
      owner = "client!qea",
      name = "x",
      descriptor = "I"
   )
   public static int field4962;
   @OriginalMember(
      owner = "client!qea",
      name = "t",
      descriptor = "I"
   )
   public static int field4963;
   @OriginalMember(
      owner = "client!qea",
      name = "s",
      descriptor = "I"
   )
   public static int field4965;
   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "I"
   )
   public static int field4966;
   @OriginalMember(
      owner = "client!qea",
      name = "B",
      descriptor = "I"
   )
   public static int field4967;
   @OriginalMember(
      owner = "client!qea",
      name = "v",
      descriptor = "I"
   )
   public static int field4968;
   @OriginalMember(
      owner = "client!qea",
      name = "A",
      descriptor = "I"
   )
   public static int field4969;
   @OriginalMember(
      owner = "client!qea",
      name = "E",
      descriptor = "I"
   )
   public static int field4970;
   @OriginalMember(
      owner = "client!qea",
      name = "u",
      descriptor = "I"
   )
   private int field4971;
   @OriginalMember(
      owner = "client!qea",
      name = "D",
      descriptor = "I"
   )
   public static int field4972;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!qea",
      name = "C",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4973;
   @OriginalMember(
      owner = "client!qea",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   private String field4964;

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(BILjava/lang/String;Z)V"
   )
   public static final void method2820(byte arg0, int arg1, String arg2, boolean arg3) {
      try {
         class188.method1577((byte)-51);
         ++field4962;
         if (arg1 == 0) {
            class629.field9294 = class655.method4807(0, class765.field11191, (byte)-70, class590.field8691, 2 * class757.field11093.field10969.method5235(-18033), class47.field598);
            if (arg2 != null) {
               class629.field9294.method426(0);
               class19 var13 = class40.method303(0, class90.field1221, -62, class94.field1276);
               class447 var14 = class629.field9294.method430(var13, class65.method584(class268.field3430, class90.field1221, 0), true);
               class729.method5273(0);
               class120.method1058(true, -570417178, class629.field9294, var13, arg2, var14);
            }
         } else {
            class479 var4 = null;
            if (arg2 != null) {
               var4 = class655.method4807(0, class765.field11191, (byte)-54, class590.field8691, 0, class47.field598);
               var4.method426(0);
               class19 var5 = class40.method303(0, class90.field1221, -92, class94.field1276);
               class447 var6 = var4.method430(var5, class65.method584(class268.field3430, class90.field1221, 0), true);
               class729.method5273(0);
               class120.method1058(true, -570417178, var4, var5, arg2, var6);
            }

            boolean var27 = false;

            label251: {
               try {
                  var27 = true;
                  class629.field9294 = class655.method4807(arg1, class765.field11191, (byte)-37, class590.field8691, 2 * class757.field11093.field10969.method5235(-18033), class47.field598);
                  if (arg2 != null) {
                     var4.method426(0);
                     class19 var7 = class40.method303(0, class90.field1221, -115, class94.field1276);
                     class447 var8 = var4.method430(var7, class65.method584(class268.field3430, class90.field1221, 0), true);
                     class729.method5273(0);
                     class120.method1058(true, -570417178, var4, var7, arg2, var8);
                  }

                  if (class629.field9294.method433()) {
                     boolean var9 = true;

                     try {
                        var9 = class12.field244.field461 > 256;
                     } catch (Throwable var31) {
                     }

                     class735 var10;
                     label231: {
                        if (!var9) {
                           var10 = class629.field9294.method469(104857600);
                           if (!client.field1481) {
                              break label231;
                           }
                        }

                        var10 = class629.field9294.method469(146800640);
                     }

                     class629.field9294.method483(var10);
                     var27 = false;
                  } else {
                     var27 = false;
                  }
                  break label251;
               } catch (Throwable var32) {
                  int var11 = class757.field11093.field11012.method27(-18033);
                  if (~var11 == -3) {
                     class337.field4608 = true;
                  }

                  class757.field11093.method5438(true, class757.field11093.field11012, 0);
                  method2820((byte)-127, var11, arg2, arg3);
                  Object var10000 = null;
                  var27 = false;
               } finally {
                  if (var27) {
                     Object var19 = null;
                     if (var4 != null) {
                        try {
                           var4.method3649(false);
                        } catch (Throwable var29) {
                        }
                     }

                  }
               }

               if (var4 != null) {
                  try {
                     var4.method3649(false);
                  } catch (Throwable var28) {
                  }
               }

               return;
            }

            Object var18 = null;
            if (var4 != null) {
               try {
                  var4.method3649(false);
               } catch (Throwable var30) {
               }
            }
         }

         class757.field11093.field11012.method26((byte)-96, !arg3);
         class757.field11093.method5438(true, class757.field11093.field11012, arg1);
         class247.method1965(-68);
         class629.field9294.method506(10000);
         class629.field9294.method468(32);
         class428.field5818 = class629.field9294.method480();
         int var15 = 11 % ((arg0 - -27) / 62);
         class216.field2745 = class629.field9294.method480();
         class482.method3664(2);
         class629.field9294.method501(class757.field11093.field10968.method4778(-18033) == 1);
         if (class629.field9294.method461()) {
            class210.method1727(~class757.field11093.field11000.method935(-18033) == -2, true);
         }

         class754.method5464(class211.field2689 >> 3, class273.field3491 >> 3, class629.field9294, (byte)-104);
         class274.method2167(-1662);
         class228.field2860 = false;
         class187.field2382 = true;
         class594.field8753 = null;
         class30.method239(-16530);
      } catch (RuntimeException var34) {
         throw class93.method866(var34, field4974[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4974[1] : field4974[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2821(byte arg0) {
      try {
         if (class737.field10797 != null) {
            class737.field10797.method4401(arg0 + -17);
         }

         ++field4965;
         if (class785.field11467 != null) {
            class785.field11467.method4401(0);
         }

         if (arg0 != 17) {
            method2820((byte)-117, 36, (String)null, false);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4974[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2822(int arg0, int arg1, int arg2) {
      try {
         ++field4961;
         if (arg2 < 61) {
            field4967 = 79;
         }

         return class735.method5321(arg0, arg1, 127) | ~(arg1 & 458752) != -1 || class529.method3952(arg1, -108, arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4974[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(ILko;IIIIIIIII)Z"
   )
   public static final boolean method2823(int arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field1481;

      try {
         ++field4963;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg5;
         int var17 = -var15 + arg4;
         class313.field4343[var14][var15] = 99;
         if (arg10 != 1134821376) {
            field4967 = -32;
         }

         class422.field5758[var14][var15] = 0;
         byte var18 = 0;
         int var19 = 0;
         class473.field6560[var18] = arg5;
         byte var10001 = var18;
         int var28 = var18 + 1;
         class765.field11192[var10001] = arg4;
         int[][] var20 = arg1.field4510;
         if (!var11 && ~var28 == ~var19) {
            class621.field9183 = arg5;
            class392.field5427 = arg4;
            return false;
         } else {
            int var12;
            int var13;
            label218:
            do {
               var13 = class765.field11192[var19];
               var12 = class473.field6560[var19];
               int var21 = -arg1.field4515 + var13;
               int var22 = var13 - var17;
               int var23 = -var16 + var12;
               var19 = var19 - -1 & 4095;
               int var24 = var12 - arg1.field4518;
               int var25 = arg2;
               int var10000 = arg2;
               byte var29 = -4;

               do {
                  if (var10000 != var29) {
                     if (~var25 != 2) {
                        if (~var25 != 1) {
                           if (var25 != -1) {
                              label205: {
                                 if (var25 != 0 && ~var25 != -2 && var25 != 2 && var25 != 3) {
                                    if (~var25 != -10) {
                                       if (arg1.method2594(arg7, arg2, arg6, var12, (byte)79, arg9, var13, 1)) {
                                          class392.field5427 = var13;
                                          class621.field9183 = var12;
                                          return true;
                                       }
                                       break label205;
                                    }

                                    if (var11) {
                                       if (arg7 == var12 && arg6 == var13) {
                                          class392.field5427 = var13;
                                          class621.field9183 = var12;
                                          return true;
                                       }
                                       break label205;
                                    }
                                 }

                                 if (arg1.method2584(var13, arg6, arg9, arg2, arg7, var12, (byte)73, 1)) {
                                    class621.field9183 = var12;
                                    class392.field5427 = var13;
                                    return true;
                                 }
                              }
                           } else if (arg1.method2590(var12, arg0, false, 1, arg7, arg8, var13, arg6, arg3)) {
                              class621.field9183 = var12;
                              class392.field5427 = var13;
                              return true;
                           }
                        } else if (arg1.method2586(arg3, arg0, arg6, 1, arg7, var12, arg8, 1, var13, 29546)) {
                           class621.field9183 = var12;
                           class392.field5427 = var13;
                           return true;
                        }
                     } else if (class313.method2488(arg7, arg3, 1, arg6, arg8, var12, 1, arg10 + -1134821289, var13)) {
                        class621.field9183 = var12;
                        class392.field5427 = var13;
                        return true;
                     }
                  } else if (arg7 == var12 && arg6 == var13) {
                     class392.field5427 = var13;
                     class621.field9183 = var12;
                     return true;
                  }

                  var25 = class422.field5758[var23][var22] + 1;
                  if (~var23 < -1 && ~class313.field4343[var23 + -1][var22] == -1 && (var20[var24 + -1][var21] & 1109655552) == 0) {
                     class473.field6560[var28] = var12 + -1;
                     class765.field11192[var28] = var13;
                     var28 = var28 + 1 & 4095;
                     class313.field4343[var23 - 1][var22] = 2;
                     class422.field5758[var23 + -1][var22] = var25;
                  }

                  if (~var23 > -128 && class313.field4343[var23 - -1][var22] == 0 && ~(1612972032 & var20[var24 + 1][var21]) == -1) {
                     class473.field6560[var28] = var12 + 1;
                     class765.field11192[var28] = var13;
                     var28 = var28 + 1 & 4095;
                     class313.field4343[var23 + 1][var22] = 8;
                     class422.field5758[var23 - -1][var22] = var25;
                  }

                  if (var22 > 0 && class313.field4343[var23][var22 - 1] == 0 && ~(1084489728 & var20[var24][var21 + -1]) == -1) {
                     class473.field6560[var28] = var12;
                     class765.field11192[var28] = var13 + -1;
                     var28 = 4095 & var28 - -1;
                     class313.field4343[var23][var22 + -1] = 1;
                     class422.field5758[var23][var22 + -1] = var25;
                  }

                  if (~var22 > -128 && class313.field4343[var23][var22 + 1] == 0 && ~(1210318848 & var20[var24][var21 - -1]) == -1) {
                     class473.field6560[var28] = var12;
                     class765.field11192[var28] = var13 + 1;
                     class313.field4343[var23][var22 - -1] = 4;
                     var28 = 4095 & var28 + 1;
                     class422.field5758[var23][var22 + 1] = var25;
                  }

                  if (var23 > 0 && ~var22 < -1 && ~class313.field4343[var23 - 1][var22 + -1] == -1 && (1134821376 & var20[var24 - 1][var21 + -1]) == 0 && ~(var20[var24 + -1][var21] & 1109655552) == -1 && ~(1084489728 & var20[var24][var21 + -1]) == -1) {
                     class473.field6560[var28] = var12 + -1;
                     class765.field11192[var28] = var13 + -1;
                     class313.field4343[var23 - 1][var22 + -1] = 3;
                     var28 = var28 + 1 & 4095;
                     class422.field5758[var23 + -1][var22 + -1] = var25;
                  }

                  if (var23 < 127 && ~var22 < -1 && ~class313.field4343[var23 + 1][var22 - 1] == -1 && ~(1625554944 & var20[var24 - -1][var21 + -1]) == -1 && ~(1612972032 & var20[var24 + 1][var21]) == -1 && ~(1084489728 & var20[var24][var21 + -1]) == -1) {
                     class473.field6560[var28] = var12 + 1;
                     class765.field11192[var28] = var13 + -1;
                     var28 = var28 - -1 & 4095;
                     class313.field4343[var23 + 1][var22 + -1] = 9;
                     class422.field5758[var23 + 1][var22 - 1] = var25;
                  }

                  if (var23 > 0 && ~var22 > -128 && class313.field4343[var23 + -1][var22 - -1] == 0 && (var20[var24 - 1][var21 + 1] & 1310982144) == 0 && ~(var20[var24 - 1][var21] & 1109655552) == -1 && (var20[var24][var21 + 1] & 1210318848) == 0) {
                     class473.field6560[var28] = var12 + -1;
                     class765.field11192[var28] = var13 + 1;
                     var28 = 4095 & var28 + 1;
                     class313.field4343[var23 + -1][var22 + 1] = 6;
                     class422.field5758[var23 + -1][var22 + 1] = var25;
                  }

                  if (var23 >= 127) {
                     continue label218;
                  }

                  var10000 = ~var22;
                  var29 = -128;
               } while(var11);

               if (var10000 > -128 && class313.field4343[var23 + 1][var22 + 1] == 0 && (2015625216 & var20[var24 + 1][var21 + 1]) == 0 && ~(var20[var24 + 1][var21] & 1612972032) == -1 && ~(var20[var24][var21 + 1] & 1210318848) == -1) {
                  class473.field6560[var28] = var12 + 1;
                  class765.field11192[var28] = var13 + 1;
                  var28 = var28 + 1 & 4095;
                  class313.field4343[var23 + 1][var22 + 1] = 12;
                  class422.field5758[var23 - -1][var22 - -1] = var25;
               }
            } while(~var28 != ~var19);

            class621.field9183 = var12;
            class392.field5427 = var13;
            return false;
         }
      } catch (RuntimeException var27) {
         throw class93.method866(var27, field4974[5] + arg0 + ',' + (arg1 != null ? field4974[1] : field4974[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(Ljava/awt/Component;BZ)Ljo;"
   )
   public static final class376 method2824(Component arg0, byte arg1, boolean arg2) {
      try {
         ++field4969;
         if (arg1 != -121) {
            return null;
         } else {
            try {
               Constructor var3 = Class.forName(field4974[8]).getDeclaredConstructor(field4973 != null ? field4973 : (field4973 = method2827(field4974[9])), Boolean.TYPE);
               return (class376)var3.newInstance(arg0, new Boolean(arg2));
            } catch (Throwable var5) {
               return new class595(arg0, arg2);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4974[7] + (arg0 != null ? field4974[1] : field4974[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         ++field4966;
         if (arg0 == 19163) {
            arg1.method5705(this.field4964, (byte)-58, this.field4971);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4974[6] + arg0 + ',' + (arg1 != null ? field4974[1] : field4974[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         this.field4971 = arg1.method610(126);
         if (arg0 == 11) {
            ++field4970;
            this.field4964 = arg1.method606(11856);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4974[4] + arg0 + ',' + (arg1 != null ? field4974[1] : field4974[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method2825(int arg0) {
      try {
         ++field4972;
         if (class175.field2258 == 1) {
            return class453.field6250;
         } else {
            if (arg0 != 0) {
               method2826((class102)null, (class479)null, -10);
            }

            return 0;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4974[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(Ld;Lha;I)V"
   )
   public static final void method2826(class102 arg0, class479 arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field4968;
         if (class326.field4469 != null) {
            if (class264.field3355 < 10) {
               if (!class326.field4470.method2696(arg2 ^ 176, class326.field4469.field1584)) {
                  class264.field3355 = class487.field6798.method2693(0, class326.field4469.field1584) / 10;
                  return;
               }

               class563.method4240(456);
               class264.field3355 = 10;
            }

            if (~class264.field3355 == -11) {
               class326.field4502 = class326.field4469.field1593 >> 6 << 6;
               class326.field4499 = class326.field4469.field1581 >> 6 << 6;
               class326.field4492 = (class326.field4469.field1599 >> 6 << 6) - class326.field4502 + 64;
               class326.field4486 = (class326.field4469.field1579 >> 6 << 6) + 64 - class326.field4499;
               int[] var4 = new int[3];
               int var5 = -1;
               int var6 = -1;
               if (class326.field4469.method1056(var4, (class204.field2593.field10468 >> 9) + class353.field4940, class204.field2593.field10457, (byte)87, (class204.field2593.field10467 >> 9) + class539.field7889)) {
                  var5 = var4[1] + -class326.field4502;
                  var6 = var4[2] + -class326.field4499;
               }

               label209: {
                  if (!class192.field2431 && var5 >= 0 && class326.field4492 > var5 && ~var6 <= -1 && ~var6 > ~class326.field4486) {
                     int var7 = var5 + ((int)(Math.random() * 10.0D) - 5);
                     int var8 = var6 + (int)(10.0D * Math.random()) + -5;
                     class381.field5303 = var8;
                     class345.field4731 = var7;
                     if (!var3) {
                        break label209;
                     }
                  }

                  if (~class328.field4543 == 0 || ~class460.field6317 == 0) {
                     class326.field4469.method1057(16383 & class326.field4469.field1589 >> 14, (byte)99, class326.field4469.field1589 & 16383, var4);
                     class381.field5303 = var4[2] + -class326.field4499;
                     class345.field4731 = var4[1] + -class326.field4502;
                     if (!var3) {
                        break label209;
                     }
                  }

                  class326.field4469.method1057(class328.field4543, (byte)109, class460.field6317, var4);
                  if (var4 != null) {
                     class381.field5303 = var4[2] + -class326.field4499;
                     class345.field4731 = var4[1] - class326.field4502;
                  }

                  class192.field2431 = false;
                  class460.field6317 = -1;
                  class328.field4543 = -1;
               }

               label153: {
                  if (class326.field4469.field1585 != 37) {
                     if (~class326.field4469.field1585 == -51) {
                        class326.field4481 = 4.0F;
                        class326.field4483 = 4.0F;
                        if (!var3) {
                           break label153;
                        }
                     }

                     if (class326.field4469.field1585 == 75) {
                        class326.field4481 = 6.0F;
                        class326.field4483 = 6.0F;
                        if (!var3) {
                           break label153;
                        }
                     }

                     if (class326.field4469.field1585 != 100) {
                        if (class326.field4469.field1585 != 200) {
                           class326.field4481 = 8.0F;
                           class326.field4483 = 8.0F;
                           if (!var3) {
                              break label153;
                           }
                        }

                        class326.field4481 = 16.0F;
                        class326.field4483 = 16.0F;
                        if (!var3) {
                           break label153;
                        }
                     }

                     class326.field4481 = 8.0F;
                     class326.field4483 = 8.0F;
                     if (!var3) {
                        break label153;
                     }
                  }

                  class326.field4481 = 3.0F;
                  class326.field4483 = 3.0F;
               }

               class326.field4485 = (int)class326.field4481 >> 1;
               class326.field4476 = class737.method5349(false, class326.field4485);
               class541.method4094(true);
               class326.method2560();
               class138.field1748 = new class37();
               class326.field4482 += -2 + (int)(Math.random() * 5.0D);
               if (class326.field4482 < -8) {
                  class326.field4482 = -8;
               }

               if (~class326.field4482 < -9) {
                  class326.field4482 = 8;
               }

               class326.field4484 += -2 + (int)(5.0D * Math.random());
               if (class326.field4484 < -16) {
                  class326.field4484 = -16;
               }

               if (~class326.field4484 < -17) {
                  class326.field4484 = 16;
               }

               class326.method2576(arg0, class326.field4482 >> 2 << 10, class326.field4484 >> 1);
               class326.field4471.method4936(1024, 12646, 256);
               class326.field4467.method1601(256, 256, 34);
               class326.field4468.method931(4096, (byte)-124);
               class781.field11387.method1663((byte)35, 256);
               class264.field3355 = 20;
            } else if (class264.field3355 == 20) {
               class614.method4526(arg2 ^ -2463, true);
               class326.method2573(arg1, class326.field4482, class326.field4484);
               class264.field3355 = 60;
               class614.method4526(-2514, true);
               class67.method669(arg2 ^ 62);
            } else if (class264.field3355 != 60) {
               if (class264.field3355 == 70) {
                  class791.field11578 = new class394(arg1, 11, true, class590.field8691);
                  class264.field3355 = 73;
                  class614.method4526(-2514, true);
                  class67.method669(95);
               } else if (class264.field3355 == 73) {
                  class12.field242 = new class394(arg1, 12, true, class590.field8691);
                  class264.field3355 = 76;
                  class614.method4526(-2514, true);
                  class67.method669(arg2 ^ 54);
               } else if (class264.field3355 == 76) {
                  class783.field11427 = new class394(arg1, 14, true, class590.field8691);
                  class264.field3355 = 79;
                  class614.method4526(arg2 ^ -2463, true);
                  class67.method669(114);
               } else if (class264.field3355 == arg2) {
                  class644.field9661 = new class394(arg1, 17, true, class590.field8691);
                  class264.field3355 = 82;
                  class614.method4526(-2514, true);
                  class67.method669(107);
               } else if (~class264.field3355 == -83) {
                  class479.field6660 = new class394(arg1, 19, true, class590.field8691);
                  class264.field3355 = 85;
                  class614.method4526(-2514, true);
                  class67.method669(arg2 + 46);
               } else if (class264.field3355 == 85) {
                  class631.field9312 = new class394(arg1, 22, true, class590.field8691);
                  class264.field3355 = 88;
                  class614.method4526(-2514, true);
                  class67.method669(123);
               } else if (~class264.field3355 == -89) {
                  class58.field765 = new class394(arg1, 26, true, class590.field8691);
                  class264.field3355 = 91;
                  class614.method4526(-2514, true);
                  class67.method669(118);
               } else {
                  class693.field10174 = new class394(arg1, 30, true, class590.field8691);
                  class264.field3355 = 100;
                  class614.method4526(-2514, true);
                  class67.method669(101);
                  System.gc();
               }
            } else {
               label192: {
                  if (!class326.field4470.method2705(class326.field4469.field1584 + field4974[0], 117)) {
                     class326.field4477 = new class601(0);
                     if (!var3) {
                        break label192;
                     }
                  }

                  if (!class326.field4470.method2696(arg2 + 176, class326.field4469.field1584 + field4974[0])) {
                     return;
                  }

                  class326.field4477 = class334.method2653(-21863, class326.field4470, class743.field10861, class326.field4469.field1584 + field4974[0]);
               }

               class326.method2571();
               class264.field3355 = 70;
               class614.method4526(-2514, true);
               class67.method669(114);
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field4974[2] + (arg0 != null ? field4974[1] : field4974[3]) + ',' + (arg1 != null ? field4974[1] : field4974[3]) + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2827(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2828(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2829(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
