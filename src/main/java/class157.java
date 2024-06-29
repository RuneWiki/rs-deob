import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class157 {
   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2025 = new String[]{method1328(method1327("\u0015/:K")), method1328(method1327("\u001187\tbS")), method1328(method1327("\u0000tx\t^")), method1328(method1327("\u001187\taS"))};
   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "I"
   )
   public static int field2022 = 0;
   @OriginalMember(
      owner = "client!jba",
      name = "d",
      descriptor = "I"
   )
   public static int field2024 = 1337;
   @OriginalMember(
      owner = "client!jba",
      name = "b",
      descriptor = "I"
   )
   public static int field2021;
   @OriginalMember(
      owner = "client!jba",
      name = "c",
      descriptor = "I"
   )
   public static int field2023;

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(IIIIIIILko;III)Z"
   )
   public static final boolean method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class327 arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field1481;

      try {
         if (arg1 != 14774) {
            method1326(21L, (byte)-29);
         }

         ++field2021;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg4;
         int var17 = -var15 + arg2;
         class313.field4343[var14][var15] = 99;
         class422.field5758[var14][var15] = 0;
         byte var18 = 0;
         class473.field6560[var18] = arg4;
         int var19 = 0;
         byte var10001 = var18;
         int var28 = var18 + 1;
         class765.field11192[var10001] = arg2;
         int[][] var20 = arg7.field4510;
         if (!var11 && ~var28 == ~var19) {
            class392.field5427 = arg2;
            class621.field9183 = arg4;
            return false;
         } else {
            int var12;
            int var13;
            label230:
            do {
               var12 = class473.field6560[var19];
               var13 = class765.field11192[var19];
               int var21 = -var17 + var13;
               var19 = var19 + 1 & 4095;
               int var22 = -var16 + var12;
               int var23 = var12 - arg7.field4518;
               int var24 = -arg7.field4515 + var13;
               int var25 = arg0;
               int var10000 = arg0;
               byte var29 = -4;

               do {
                  if (var10000 != var29) {
                     if (var25 != -3) {
                        if (var25 != -2) {
                           if (var25 != -1) {
                              label217: {
                                 if (~var25 != -1 && var25 != 1 && ~var25 != -3 && var25 != 3) {
                                    if (~var25 != -10) {
                                       if (arg7.method2594(arg10, arg0, arg8, var12, (byte)125, arg9, var13, 2)) {
                                          class621.field9183 = var12;
                                          class392.field5427 = var13;
                                          return true;
                                       }
                                       break label217;
                                    }

                                    if (var11) {
                                       if (~arg10 == ~var12 && arg8 == var13) {
                                          class392.field5427 = var13;
                                          class621.field9183 = var12;
                                          return true;
                                       }
                                       break label217;
                                    }
                                 }

                                 if (arg7.method2584(var13, arg8, arg9, arg0, arg10, var12, (byte)114, 2)) {
                                    class392.field5427 = var13;
                                    class621.field9183 = var12;
                                    return true;
                                 }
                              }
                           } else if (arg7.method2590(var12, arg5, false, 2, arg10, arg3, var13, arg8, arg6)) {
                              class392.field5427 = var13;
                              class621.field9183 = var12;
                              return true;
                           }
                        } else if (arg7.method2586(arg6, arg5, arg8, 2, arg10, var12, arg3, 2, var13, 29546)) {
                           class621.field9183 = var12;
                           class392.field5427 = var13;
                           return true;
                        }
                     } else if (class313.method2488(arg10, arg6, 2, arg8, arg3, var12, 2, 88, var13)) {
                        class392.field5427 = var13;
                        class621.field9183 = var12;
                        return true;
                     }
                  } else if (~arg10 == ~var12 && arg8 == var13) {
                     class392.field5427 = var13;
                     class621.field9183 = var12;
                     return true;
                  }

                  var25 = class422.field5758[var22][var21] + 1;
                  if (~var22 < -1 && ~class313.field4343[var22 - 1][var21] == -1 && (var20[var23 + -1][var24] & 1134821376) == 0 && ~(1310982144 & var20[var23 + -1][var24 + 1]) == -1) {
                     class473.field6560[var28] = var12 - 1;
                     class765.field11192[var28] = var13;
                     class313.field4343[var22 - 1][var21] = 2;
                     var28 = var28 + 1 & 4095;
                     class422.field5758[var22 + -1][var21] = var25;
                  }

                  if (~var22 > -127 && class313.field4343[var22 + 1][var21] == 0 && ~(1625554944 & var20[var23 + 2][var24]) == -1 && (var20[var23 - -2][var24 + 1] & 2015625216) == 0) {
                     class473.field6560[var28] = var12 - -1;
                     class765.field11192[var28] = var13;
                     var28 = var28 + 1 & 4095;
                     class313.field4343[var22 + 1][var21] = 8;
                     class422.field5758[var22 + 1][var21] = var25;
                  }

                  if (~var21 < -1 && class313.field4343[var22][var21 + -1] == 0 && (var20[var23][var24 + -1] & 1134821376) == 0 && (var20[var23 + 1][var24 + -1] & 1625554944) == 0) {
                     class473.field6560[var28] = var12;
                     class765.field11192[var28] = var13 - 1;
                     class313.field4343[var22][var21 + -1] = 1;
                     var28 = 4095 & var28 + 1;
                     class422.field5758[var22][var21 + -1] = var25;
                  }

                  if (~var21 > -127 && class313.field4343[var22][var21 - -1] == 0 && ~(var20[var23][var24 + 2] & 1310982144) == -1 && ~(2015625216 & var20[var23 + 1][var24 - -2]) == -1) {
                     class473.field6560[var28] = var12;
                     class765.field11192[var28] = var13 + 1;
                     class313.field4343[var22][var21 + 1] = 4;
                     var28 = 4095 & var28 + 1;
                     class422.field5758[var22][var21 + 1] = var25;
                  }

                  if (var22 > 0 && ~var21 < -1 && ~class313.field4343[var22 + -1][var21 - 1] == -1 && ~(1336147968 & var20[var23 + -1][var24]) == -1 && ~(1134821376 & var20[var23 + -1][var24 + -1]) == -1 && (1675886592 & var20[var23][var24 + -1]) == 0) {
                     class473.field6560[var28] = var12 + -1;
                     class765.field11192[var28] = var13 - 1;
                     var28 = var28 + 1 & 4095;
                     class313.field4343[var22 + -1][var21 + -1] = 3;
                     class422.field5758[var22 + -1][var21 + -1] = var25;
                  }

                  if (var22 < 126 && var21 > 0 && class313.field4343[var22 - -1][var21 - 1] == 0 && ~(1675886592 & var20[var23 + 1][var24 + -1]) == -1 && ~(var20[var23 + 2][var24 + -1] & 1625554944) == -1 && ~(var20[var23 + 2][var24] & 2028208128) == -1) {
                     class473.field6560[var28] = var12 + 1;
                     class765.field11192[var28] = var13 + -1;
                     class313.field4343[var22 - -1][var21 + -1] = 9;
                     var28 = 4095 & var28 + 1;
                     class422.field5758[var22 + 1][var21 + -1] = var25;
                  }

                  if (~var22 < -1 && ~var21 > -127 && ~class313.field4343[var22 + -1][var21 + 1] == -1 && (var20[var23 - 1][var24 + 1] & 1336147968) == 0 && (var20[var23 - 1][var24 - -2] & 1310982144) == 0 && (2116288512 & var20[var23][var24 - -2]) == 0) {
                     class473.field6560[var28] = var12 - 1;
                     class765.field11192[var28] = var13 - -1;
                     class313.field4343[var22 + -1][var21 + 1] = 6;
                     var28 = 4095 & var28 + 1;
                     class422.field5758[var22 + -1][var21 + 1] = var25;
                  }

                  if (var22 >= 126) {
                     continue label230;
                  }

                  var10000 = ~var21;
                  var29 = -127;
               } while(var11);

               if (var10000 > -127 && class313.field4343[var22 + 1][var21 - -1] == 0 && ~(var20[var23 + 1][var24 - -2] & 2116288512) == -1 && (2015625216 & var20[var23 + 2][var24 + 2]) == 0 && (2028208128 & var20[var23 + 2][var24 + 1]) == 0) {
                  class473.field6560[var28] = var12 + 1;
                  class765.field11192[var28] = var13 + 1;
                  class313.field4343[var22 - -1][var21 + 1] = 12;
                  var28 = var28 + 1 & 4095;
                  class422.field5758[var22 - -1][var21 + 1] = var25;
               }
            } while(~var28 != ~var19);

            class392.field5427 = var13;
            class621.field9183 = var12;
            return false;
         }
      } catch (RuntimeException var27) {
         throw class93.method866(var27, field2025[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2025[2] : field2025[0]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(JB)V"
   )
   public static final void method1326(long arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2023;
         if (class548.field8080 != null) {
            label85: {
               if (~class784.field11454 == -2 || ~class784.field11454 == -6) {
                  class5.method42(-91, arg0);
                  if (!var3) {
                     break label85;
                  }
               }

               if (~class784.field11454 == -5) {
                  class697.method5079(arg0, (byte)-116);
               }
            }
         }

         class49.method371(114, (long)class413.field5678, class629.field9294);
         if (~class661.field9817 != 0) {
            class249.method1978(25325, class661.field9817);
         }

         int var4 = 0;
         if (var3) {
            if (class485.field6750[var4]) {
               class626.field9246[var4] = true;
            }

            class708.field10409[var4] = class485.field6750[var4];
            class485.field6750[var4] = false;
            ++var4;
         }

         while(true) {
            int var10000;
            if (~var4 <= ~class121.field1604) {
               class737.field10800 = class413.field5678;
               class23.method179((class642)null, -1, 121, -1);
               class211.method1735(true, (class642)null, -1, -1);
               var10000 = class661.field9817;
               if (!var3) {
                  if (var10000 != -1) {
                     class121.field1604 = 0;
                     class738.method5358(-26067);
                  }

                  class629.field9294.method443();
                  class595.method4428(class629.field9294, 119);
                  if (arg1 > -53) {
                     method1325(-104, 60, -82, -74, -111, 120, 43, (class327)null, 106, 35, -79);
                  }

                  int var5 = class567.method4260(23876);
                  if (var5 == -1) {
                     var5 = class436.field5949;
                  }

                  if (var5 == -1) {
                     var5 = class707.field10402;
                  }

                  class95.method882(var5, 2);
                  int var6 = class204.field2593.method78(0) << 8;
                  class331.method2622(class204.field2593.field10468 + var6, class204.field2593.field10467 + var6, class173.field2238, 88, class204.field2593.field10457);
                  class173.field2238 = 0;
                  return;
               }
            } else {
               var10000 = class485.field6750[var4];
            }

            if (var10000 != 0) {
               class626.field9246[var4] = true;
            }

            class708.field10409[var4] = class485.field6750[var4];
            class485.field6750[var4] = false;
            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2025[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1327(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1328(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
