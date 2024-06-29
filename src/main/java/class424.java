import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class424 extends class428 {
   @OriginalMember(
      owner = "client!df",
      name = "m",
      descriptor = "J"
   )
   public long field6040;
   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6043 = new String[]{method3138(method3137(")\u0016\u0015'q")), method3138(method3137("#\u0005W\b")), method3138(method3137("6^\u0015J$")), method3138(method3137(")\u0016\u0015%q")), method3138(method3137(")\u0016\u0015X0#\u0019OZq")), method3138(method3137(")\u0016\u0015&q")), method3138(method3137(")\u0016\u0015 q")), method3138(method3137(")\u0016\u0015!q"))};
   @OriginalMember(
      owner = "client!df",
      name = "o",
      descriptor = "I"
   )
   public static int field6038 = -1;
   @OriginalMember(
      owner = "client!df",
      name = "t",
      descriptor = "Lak;"
   )
   public static class371 field6036 = new class371(4);
   @OriginalMember(
      owner = "client!df",
      name = "r",
      descriptor = "I"
   )
   public static int field6035;
   @OriginalMember(
      owner = "client!df",
      name = "p",
      descriptor = "I"
   )
   public static int field6037;
   @OriginalMember(
      owner = "client!df",
      name = "n",
      descriptor = "I"
   )
   public static int field6039;
   @OriginalMember(
      owner = "client!df",
      name = "q",
      descriptor = "I"
   )
   public static int field6041;
   @OriginalMember(
      owner = "client!df",
      name = "s",
      descriptor = "Lcn;"
   )
   public static class544 field6042;

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IIIZIIILuo;III)Z"
   )
   public static final boolean method3132(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class603 arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4360;

      try {
         ++field6035;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg9;
         if (!arg3) {
            return false;
         } else {
            int var17 = -var15 + arg6;
            class711.field10378[var14][var15] = 99;
            class95.field1228[var14][var15] = 0;
            byte var18 = 0;
            class280.field3894[var18] = arg9;
            int var19 = 0;
            byte var10001 = var18;
            int var28 = var18 + 1;
            class533.field7598[var10001] = arg6;
            int[][] var20 = arg7.field8870;
            if (!var11 && ~var28 == ~var19) {
               class111.field1401 = arg6;
               class39.field559 = arg9;
               return false;
            } else {
               int var12;
               int var13;
               label230:
               do {
                  var13 = class533.field7598[var19];
                  var12 = class280.field3894[var19];
                  var19 = 4095 & var19 + 1;
                  int var21 = -var16 + var12;
                  int var22 = -var17 + var13;
                  int var23 = var12 - arg7.field8860;
                  int var24 = -arg7.field8871 + var13;
                  int var25 = arg10;
                  int var10000 = arg10;
                  byte var29 = -4;

                  do {
                     if (var10000 != var29) {
                        if (~var25 != 2) {
                           if (var25 != -2) {
                              if (~var25 != 0) {
                                 label217: {
                                    if (~var25 != -1 && ~var25 != -2 && ~var25 != -3 && ~var25 != -4) {
                                       if (var25 != 9) {
                                          if (arg7.method4390(2, arg10, var13, arg5, arg4, arg8, var12, (byte)-23)) {
                                             class111.field1401 = var13;
                                             class39.field559 = var12;
                                             return true;
                                          }
                                          break label217;
                                       }

                                       if (var11) {
                                          if (arg4 == var12 && ~arg5 == ~var13) {
                                             class39.field559 = var12;
                                             class111.field1401 = var13;
                                             return true;
                                          }
                                          break label217;
                                       }
                                    }

                                    if (arg7.method4398(var12, var13, false, arg10, arg5, arg4, arg8, 2)) {
                                       class111.field1401 = var13;
                                       class39.field559 = var12;
                                       return true;
                                    }
                                 }
                              } else if (arg7.method4392(6, arg1, arg2, arg4, arg5, var12, var13, arg0, 2)) {
                                 class111.field1401 = var13;
                                 class39.field559 = var12;
                                 return true;
                              }
                           } else if (arg7.method4388(2, arg2, var13, arg5, var12, arg1, 2, arg4, arg0, (byte)-127)) {
                              class111.field1401 = var13;
                              class39.field559 = var12;
                              return true;
                           }
                        } else if (class111.method905(arg5, 2, arg2, var12, var13, arg0, -119, 2, arg4)) {
                           class111.field1401 = var13;
                           class39.field559 = var12;
                           return true;
                        }
                     } else if (arg4 == var12 && ~arg5 == ~var13) {
                        class39.field559 = var12;
                        class111.field1401 = var13;
                        return true;
                     }

                     var25 = class95.field1228[var21][var22] + 1;
                     if (~var21 < -1 && ~class711.field10378[var21 + -1][var22] == -1 && ~(1134821376 & var20[var23 + -1][var24]) == -1 && (1310982144 & var20[var23 + -1][var24 + 1]) == 0) {
                        class280.field3894[var28] = var12 + -1;
                        class533.field7598[var28] = var13;
                        class711.field10378[var21 + -1][var22] = 2;
                        var28 = 4095 & var28 + 1;
                        class95.field1228[var21 + -1][var22] = var25;
                     }

                     if (var21 < 126 && ~class711.field10378[var21 - -1][var22] == -1 && (var20[var23 - -2][var24] & 1625554944) == 0 && (var20[var23 + 2][var24 + 1] & 2015625216) == 0) {
                        class280.field3894[var28] = var12 + 1;
                        class533.field7598[var28] = var13;
                        class711.field10378[var21 - -1][var22] = 8;
                        var28 = 4095 & var28 + 1;
                        class95.field1228[var21 - -1][var22] = var25;
                     }

                     if (var22 > 0 && class711.field10378[var21][var22 + -1] == 0 && (1134821376 & var20[var23][var24 + -1]) == 0 && ~(var20[var23 - -1][var24 + -1] & 1625554944) == -1) {
                        class280.field3894[var28] = var12;
                        class533.field7598[var28] = var13 + -1;
                        var28 = 4095 & var28 + 1;
                        class711.field10378[var21][var22 + -1] = 1;
                        class95.field1228[var21][var22 + -1] = var25;
                     }

                     if (var22 < 126 && class711.field10378[var21][var22 + 1] == 0 && ~(var20[var23][var24 - -2] & 1310982144) == -1 && ~(2015625216 & var20[var23 + 1][var24 + 2]) == -1) {
                        class280.field3894[var28] = var12;
                        class533.field7598[var28] = var13 + 1;
                        var28 = var28 + 1 & 4095;
                        class711.field10378[var21][var22 + 1] = 4;
                        class95.field1228[var21][var22 + 1] = var25;
                     }

                     if (var21 > 0 && ~var22 < -1 && ~class711.field10378[var21 + -1][var22 + -1] == -1 && ~(var20[var23 + -1][var24] & 1336147968) == -1 && ~(1134821376 & var20[var23 - 1][var24 + -1]) == -1 && (1675886592 & var20[var23][var24 + -1]) == 0) {
                        class280.field3894[var28] = var12 + -1;
                        class533.field7598[var28] = var13 - 1;
                        class711.field10378[var21 - 1][var22 - 1] = 3;
                        var28 = 4095 & var28 - -1;
                        class95.field1228[var21 + -1][var22 + -1] = var25;
                     }

                     if (var21 < 126 && var22 > 0 && class711.field10378[var21 + 1][var22 + -1] == 0 && ~(var20[var23 + 1][var24 + -1] & 1675886592) == -1 && (1625554944 & var20[var23 + 2][var24 + -1]) == 0 && ~(var20[var23 + 2][var24] & 2028208128) == -1) {
                        class280.field3894[var28] = var12 + 1;
                        class533.field7598[var28] = var13 + -1;
                        class711.field10378[var21 - -1][var22 + -1] = 9;
                        var28 = 4095 & var28 + 1;
                        class95.field1228[var21 + 1][var22 + -1] = var25;
                     }

                     if (var21 > 0 && ~var22 > -127 && class711.field10378[var21 + -1][var22 - -1] == 0 && (var20[var23 - 1][var24 + 1] & 1336147968) == 0 && ~(var20[var23 + -1][var24 - -2] & 1310982144) == -1 && (var20[var23][var24 + 2] & 2116288512) == 0) {
                        class280.field3894[var28] = var12 + -1;
                        class533.field7598[var28] = var13 - -1;
                        var28 = var28 - -1 & 4095;
                        class711.field10378[var21 + -1][var22 + 1] = 6;
                        class95.field1228[var21 + -1][var22 + 1] = var25;
                     }

                     if (~var21 <= -127) {
                        continue label230;
                     }

                     var10000 = ~var22;
                     var29 = -127;
                  } while(var11);

                  if (var10000 > -127 && class711.field10378[var21 - -1][var22 + 1] == 0 && ~(var20[var23 + 1][var24 - -2] & 2116288512) == -1 && (2015625216 & var20[var23 + 2][var24 - -2]) == 0 && (var20[var23 - -2][var24 + 1] & 2028208128) == 0) {
                     class280.field3894[var28] = var12 + 1;
                     class533.field7598[var28] = var13 + 1;
                     class711.field10378[var21 + 1][var22 + 1] = 12;
                     var28 = var28 + 1 & 4095;
                     class95.field1228[var21 + 1][var22 + 1] = var25;
                  }
               } while(~var28 != ~var19);

               class111.field1401 = var13;
               class39.field559 = var12;
               return false;
            }
         }
      } catch (RuntimeException var27) {
         throw class237.method1823(var27, field6043[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field6043[2] : field6043[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method3133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         int var9 = 50 % ((20 - arg3) / 42);
         class92.method797(arg2, false, arg7, 0, arg5, arg4, arg6, arg8, arg1, arg0);
         ++field6037;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field6043[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(B)Lwf;"
   )
   public static final class147 method3134(byte arg0) {
      try {
         int var1 = 35 % ((arg0 - -27) / 39);
         ++field6041;
         class147 var2 = class432.method3192((byte)-123);
         var2.method1169(11065, 0L);
         var2.method1195((byte)22, class750.field11103);
         var2.method1169(11065, class484.field6927);
         var2.method1169(11065, class168.field2353);
         var2.method1152(class140.field1790, class498.field7219, 0);
         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6043[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3135(int arg0) {
      try {
         field6036 = null;
         if (arg0 == -1438) {
            field6042 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6043[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "()V"
   )
   public class424() {
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method3136(String arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field6039;
         if (class613.field9015 && ~(class375.field5425 & 24) != -1) {
            boolean var3 = false;
            int var4 = class390.field5657;
            if (arg1 != -1) {
               method3135(-24);
            }

            int[] var5 = class254.field3459;
            int var6 = 0;
            if (var2 || ~var4 < ~var6) {
               do {
                  class121 var7 = class380.field5483[var5[var6]];
                  if (var7.field1575 != null) {
                     if (!var7.field1575.equalsIgnoreCase(arg0)) {
                        ++var6;
                     } else {
                        if (class564.field8045 != var7 || (16 & class375.field5425) == 0) {
                           if (var7 == null) {
                              ++var6;
                              continue;
                           }

                           if (~(class375.field5425 & 8) == -1) {
                              ++var6;
                              continue;
                           }
                        }

                        ++class668.field9713;
                        class447 var8 = class40.method350(class397.field5731, class430.field6150.field106, true);
                        var8.field6359.method1185(var5[var6], true);
                        var8.field6359.method1183(arg1 ^ 637822778, 0);
                        var8.field6359.method1190(arg1 ^ 9719, class573.field8327);
                        var8.field6359.method1172(arg1 ^ 29897, class535.field7636);
                        var8.field6359.method1155(class732.field10714, (byte)-126);
                        class430.field6150.method55(13256, var8);
                        class53.method418(true, var7.method972(-1), var7.method972(-1), var7.field3888[0], var7.field3884[0], 0, (byte)87, -2, 0);
                        var3 = true;
                        if (!var2) {
                           break;
                        }

                        ++var6;
                     }
                  } else {
                     ++var6;
                  }
               } while(~var4 < ~var6);
            }

            if (!var3) {
               class684.method4989(class180.field2500.method1437(class608.field8920, 50) + arg0, 4, 4095);
            }

            if (class613.field9015) {
               class763.method5535(-1);
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field6043[0] + (arg0 != null ? field6043[2] : field6043[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "(J)V"
   )
   public class424(long arg0) {
      try {
         this.field6040 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6043[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3137(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3138(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
