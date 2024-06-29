import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class418 {
   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6118 = new String[]{method3268(method3267("e\u0016X[O")), method3268(method3267("r\f")), method3268(method3267("r\r")), method3268(method3267("e\u0016XXO")), method3268(method3267("i\u0015\u001au")), method3268(method3267("*MH9")), method3268(method3267("e\u0016XZO")), method3268(method3267("E\u0015\u001fu\u0003=@@/W")), method3268(method3267("|NX7\u001a"))};
   @OriginalMember(
      owner = "client!bv",
      name = "c",
      descriptor = "I"
   )
   public static int field6114;
   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "I"
   )
   public static int field6117;
   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "Lsb;"
   )
   public static class261 field6115;
   @OriginalMember(
      owner = "client!bv",
      name = "d",
      descriptor = "Lkn;"
   )
   public static class437 field6116;

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3264(byte arg0) {
      try {
         field6116 = null;
         field6115 = null;
         if (arg0 != 114) {
            method3265(-30);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6118[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3265(int arg0) {
      boolean var1 = client.field10022;

      try {
         class69.method729(class476.field6870.field9150.method1776(-66), (byte)-120);
         ++field6114;
         if (arg0 >= 124) {
            int var2;
            int var3;
            int var7;
            label79: {
               var2 = (class670.field9407 >> 12) - -(class115.field1824 >> 3);
               var3 = (class480.field6903 >> 3) + (class222.field3158 >> 12);
               class128.field2049 = class117.field1849.field6824 = 0;
               class117.field1849.method1504(8, 8, 91);
               byte var4 = 18;
               class320.field4776 = new byte[var4][];
               class168.field2520 = new byte[var4][];
               class16.field220 = new byte[var4][];
               class51.field762 = new byte[var4][];
               class251.field3825 = new int[var4];
               class282.field4260 = new int[var4];
               class387.field5648 = new int[var4];
               class701.field10107 = new int[var4][4];
               class626.field8942 = new int[var4];
               class277.field4198 = new byte[var4][];
               class460.field6709 = new int[var4];
               class65.field897 = new int[var4];
               int var5 = 0;
               int var6 = (-(class234.field3626 >> 4) + var2) / 8;
               if (var1) {
                  var7 = (var3 - (class209.field2989 >> 4)) / 8;
               } else if (~((var2 - -(class234.field3626 >> 4)) / 8) > ~var6) {
                  var7 = var5;
                  if (!var1) {
                     break label79;
                  }
               } else {
                  var7 = (var3 - (class209.field2989 >> 4)) / 8;
               }

               while(true) {
                  if (var1 || var7 <= ((class209.field2989 >> 4) + var3) / 8) {
                     do {
                        int var8 = (var6 << 8) - -var7;
                        class460.field6709[var5] = var8;
                        class626.field8942[var5] = class488.field6962.method443("m" + var6 + "_" + var7, 16);
                        class282.field4260[var5] = class488.field6962.method443("l" + var6 + "_" + var7, 16);
                        class387.field5648[var5] = class488.field6962.method443("n" + var6 + "_" + var7, 16);
                        class65.field897[var5] = class488.field6962.method443(field6118[2] + var6 + "_" + var7, 16);
                        class251.field3825[var5] = class488.field6962.method443(field6118[1] + var6 + "_" + var7, 16);
                        if (~class387.field5648[var5] == 0) {
                           class626.field8942[var5] = -1;
                           class282.field4260[var5] = -1;
                           class65.field897[var5] = -1;
                           class251.field3825[var5] = -1;
                        }

                        ++var5;
                        ++var7;
                     } while(var7 <= ((class209.field2989 >> 4) + var3) / 8);
                  }

                  ++var6;
                  if (~((var2 - -(class234.field3626 >> 4)) / 8) > ~var6) {
                     var7 = var5;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var7 = (var3 - (class209.field2989 >> 4)) / 8;
                  }
               }
            }

            if (var1) {
               class387.field5648[var7] = -1;
               class626.field8942[var7] = -1;
               class282.field4260[var7] = -1;
               class65.field897[var7] = -1;
               class251.field3825[var7] = -1;
               ++var7;
            }

            while(true) {
               while(~var7 > ~class387.field5648.length) {
                  class387.field5648[var7] = -1;
                  class626.field8942[var7] = -1;
                  class282.field4260[var7] = -1;
                  class65.field897[var7] = -1;
                  class251.field3825[var7] = -1;
                  ++var7;
               }

               if (!var1) {
                  byte var9;
                  label49: {
                     if (class394.field5712 == 3) {
                        var9 = 4;
                        if (!var1) {
                           break label49;
                        }
                     }

                     if (class394.field5712 != 9) {
                        if (~class394.field5712 != -8) {
                           throw new RuntimeException(String.valueOf(class394.field5712));
                        }

                        var9 = 8;
                        if (var1) {
                           throw new RuntimeException(String.valueOf(class394.field5712));
                        }
                     } else {
                        var9 = 10;
                     }
                  }

                  class240.method2107(var2, var9, false, var3, (byte)65);
                  return;
               }

               ++var7;
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field6118[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method3266(class17 arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field6117;
         int var3 = 0;
         int var4 = 0;
         if (class563.field8012) {
            var3 = class425.method3319(0);
            var4 = class630.method4620((byte)85);
         }

         arg0.method150(var3, var4, class557.field7909 - -var3, var4 + 350);
         arg0.method226(var3, var4, class557.field7909, 350, class7.field125 << 24 | 3351159, 1);
         class515.method3870(var4, class557.field7909 + var3, (byte)-50, var4 + 350, var3);
         int var5 = 350 / class237.field3662;
         if (arg1 <= 41) {
            field6115 = null;
         }

         int var6;
         int var10000;
         int var10001;
         label87: {
            if (class383.field5590 > 0) {
               label88: {
                  var6 = 346 - (class237.field3662 - -4);
                  int var7 = var5 * var6 / (var5 - 1 + class383.field5590);
                  int var8 = 4;
                  if (class383.field5590 > 1) {
                     var8 += (var6 - var7) * (class383.field5590 - class362.field5351 + -1) / (class383.field5590 + -1);
                  }

                  arg0.method226(var3 - -class557.field7909 + -16, var4 - -var8, 12, var7, 3351159 | class7.field125 << 24, 2);
                  int var9 = class362.field5351;
                  if (!var2) {
                     if (~var9 <= ~(class362.field5351 - -var5)) {
                        break label88;
                     }

                     var10000 = ~class383.field5590;
                     var10001 = ~var9;
                     if (var2) {
                        break label87;
                     }

                     if (var10000 >= var10001) {
                        break label88;
                     }
                  }

                  do {
                     String[] var10 = class757.method5467(5, class359.field5307[var9], '\b');
                     int var11 = (class557.field7909 + -8 + -16) / var10.length;
                     int var12 = 0;
                     if (var2 || var12 < var10.length) {
                        do {
                           int var13 = 8 - -(var11 * var12);
                           arg0.method150(var3 - -var13, var4, var11 + -8 + var13 + var3, var4 + 350);
                           class510.field7243.method1860(var3 + var13, false, var4 - (var9 - class362.field5351) * class237.field3662 + -class198.field2871 + 350 + -2 + -class383.field5587.field6458, -16777216, -1, class265.method2266(var10[var12], -127));
                           ++var12;
                        } while(var12 < var10.length);
                     }

                     ++var9;
                     if (~var9 <= ~(class362.field5351 - -var5)) {
                        break;
                     }

                     var10000 = ~class383.field5590;
                     var10001 = ~var9;
                     if (var2) {
                        break label87;
                     }
                  } while(var10000 < var10001);
               }
            }

            class666.field9377.method1868(-16777216, -1, 0, var3 + -25 + class557.field7909, field6118[7], var4 - -350 + -20);
            arg0.method150(var3, var4, var3 - -class557.field7909, var4 + 350);
            arg0.method253(var3, (byte)-109, -1, var4 + 350 + -class198.field2871, class557.field7909);
            class437.field6409.method1860(var3 + 10, false, -class705.field10143.field6458 + var4 - -350 + -1, -16777216, -1, field6118[5] + class265.method2266(class772.field11182, 46));
            if (!class77.field1240) {
               return;
            }

            var6 = -1;
            var10000 = ~(class51.field770 % 30);
            var10001 = -16;
         }

         if (var10000 < var10001) {
            var6 = 16777215;
         }

         arg0.method225(class705.field10143.method3430(32, field6118[5] + class265.method2266(class772.field11182, -112).substring(0, class454.field6601)) + var3 + 10, -1732, var4 - 11 + -class705.field10143.field6458 + 350, var6, 12);
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field6118[6] + (arg0 != null ? field6118[8] : field6118[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3267(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3268(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
