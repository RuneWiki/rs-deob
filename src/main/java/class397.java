import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class397 {
   @OriginalMember(
      owner = "client!mv",
      name = "p",
      descriptor = "I"
   )
   public int field5721 = 8;
   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "I"
   )
   public int field5730 = 16777215;
   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5739 = new String[]{method3005(method3004("\u001e}&Rh")), method3005(method3004("\u001d~d|")), method3005(method3004("\b%&>=")), method3005(method3004("\u001e}&Wh")), method3005(method3004("\u001e}&Qh")), method3005(method3004("\u001e}&Vh")), method3005(method3004("\u001e}&Uh")), method3005(method3004("\u001e}&Sh")), method3005(method3004("\u001e}&Th"))};
   @OriginalMember(
      owner = "client!mv",
      name = "r",
      descriptor = "Lek;"
   )
   public static class536 field5731 = new class536(50, 11);
   @OriginalMember(
      owner = "client!mv",
      name = "i",
      descriptor = "[[[I"
   )
   public static int[][][] field5734 = new int[2][][];
   @OriginalMember(
      owner = "client!mv",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field5735 = new class118(30, -2);
   @OriginalMember(
      owner = "client!mv",
      name = "c",
      descriptor = "[Lmn;"
   )
   public static class389[] field5737 = new class389[8];
   @OriginalMember(
      owner = "client!mv",
      name = "s",
      descriptor = "I"
   )
   public static int field5719;
   @OriginalMember(
      owner = "client!mv",
      name = "f",
      descriptor = "I"
   )
   public int field5720;
   @OriginalMember(
      owner = "client!mv",
      name = "m",
      descriptor = "I"
   )
   public int field5722;
   @OriginalMember(
      owner = "client!mv",
      name = "t",
      descriptor = "I"
   )
   public static int field5724;
   @OriginalMember(
      owner = "client!mv",
      name = "j",
      descriptor = "I"
   )
   public static int field5725;
   @OriginalMember(
      owner = "client!mv",
      name = "g",
      descriptor = "I"
   )
   public int field5726;
   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "I"
   )
   public static int field5727;
   @OriginalMember(
      owner = "client!mv",
      name = "l",
      descriptor = "I"
   )
   public static int field5728;
   @OriginalMember(
      owner = "client!mv",
      name = "n",
      descriptor = "I"
   )
   public int field5729;
   @OriginalMember(
      owner = "client!mv",
      name = "q",
      descriptor = "I"
   )
   public static int field5732;
   @OriginalMember(
      owner = "client!mv",
      name = "o",
      descriptor = "I"
   )
   public int field5733;
   @OriginalMember(
      owner = "client!mv",
      name = "k",
      descriptor = "I"
   )
   public static int field5736;
   @OriginalMember(
      owner = "client!mv",
      name = "d",
      descriptor = "I"
   )
   public static int field5738;
   @OriginalMember(
      owner = "client!mv",
      name = "h",
      descriptor = "Z"
   )
   public boolean field5723;

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIIII)V",
      line = 7
   )
   public static final void method2997(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg2 != 0) {
            field5719 = -107;
         }

         if (class245.field3374 <= arg3 && arg3 <= class699.field10237) {
            int var8 = class298.method2224(arg4, class457.field6528, class348.field4702, -250);
            int var7 = class298.method2224(arg0, class457.field6528, class348.field4702, -250);
            class483.method3506(arg1, var8, var7, arg3, arg2);
         }

         ++field5725;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5739[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "(B)V",
      line = 29
   )
   public static final void method2998(byte arg0) {
      try {
         if (class538.field7681 >= 0) {
            long var1;
            label21: {
               var1 = class133.method1054(-29025);
               class538.field7681 = (int)((long)class538.field7681 - (-class408.field5900 + var1));
               if (~class538.field7681 < -1) {
                  int var3 = (class538.field7681 << 8) / class785.field11521;
                  int var4 = -var3 + 255;
                  float var5 = (float)var3 / 255.0F;
                  float var6 = -var5 + 1.0F;
                  class132.field1691 = ((65280 & class288.field3993) * var3 + (class16.field188.field6904 & 65280) * var4 & 16711680) + ((class288.field3993 & 16711935) * var3 + (class16.field188.field6904 & 16711935) * var4 & -16711936) >>> 8;
                  class273.field3755 = class733.field10728 * var3 - -(class16.field188.field6910 * var4) >> 8;
                  class155.field2213 = (class16.field188.field6909 - class337.field4586) * var6 + class337.field4586;
                  class565.field8055 = (-class553.field7928 + class16.field188.field6902) * var6 + class553.field7928;
                  class445.field6340 = (class16.field188.field6900 - class165.field2339) * var6 + class165.field2339;
                  class245.field3372 = (-class773.field11364 + class16.field188.field6912) * var6 + class773.field11364;
                  class623.field9162 = (-class655.field9591 + class16.field188.field6913) * var6 + class655.field9591;
                  class342.field4647 = ((16711935 & class613.field8993) * var3 - -((class16.field188.field6911 & 16711935) * var4) & -16711936) + ((65280 & class613.field8993) * var3 + (class16.field188.field6911 & 65280) * var4 & 16711680) >>> 8;
                  class147.field1883 = (class16.field188.field6899 - class495.field7167) * var6 + class495.field7167;
                  if (class310.field4258 == class16.field188.field6915) {
                     break label21;
                  }

                  class153.field2163 = class274.field3758.method540(class310.field4258, class16.field188.field6915, var6, class153.field2163);
                  if (!client.field4360) {
                     break label21;
                  }
               }

               class445.field6340 = class16.field188.field6900;
               class132.field1691 = class16.field188.field6904;
               class342.field4647 = class16.field188.field6911;
               class623.field9162 = class16.field188.field6913;
               class245.field3372 = class16.field188.field6912;
               class273.field3755 = class16.field188.field6910;
               class565.field8055 = class16.field188.field6902;
               class538.field7681 = -1;
               class147.field1883 = class16.field188.field6899;
               class155.field2213 = class16.field188.field6909;
               class153.field2163 = class16.field188.field6915;
            }

            class408.field5900 = var1;
         }

         int var7 = 70 / ((-51 - arg0) / 43);
         ++field5732;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5739[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IILwf;)V",
      line = 85
   )
   private final void method2999(int arg0, int arg1, class147 arg2) {
      try {
         ++field5727;
         if (arg1 != 31180) {
            this.method3001((byte)-87, (class147)null);
         }

         if (~arg0 == -2) {
            this.field5721 = arg2.method1211(-26166);
         } else if (~arg0 != -3) {
            if (~arg0 == -4) {
               this.field5733 = arg2.method1187((byte)-74);
               this.field5726 = arg2.method1187((byte)-91);
               this.field5720 = arg2.method1187((byte)-102);
            } else {
               if (~arg0 != -5) {
                  if (arg0 == 5) {
                     this.field5722 = arg2.method1211(arg1 + -57346);
                     return;
                  }

                  if (arg0 == 6) {
                     this.field5730 = arg2.method1166((byte)-127);
                     return;
                  }
               } else {
                  this.field5729 = arg2.method1143(-15465);
               }

            }
         } else {
            this.field5723 = true;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5739[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5739[2] : field5739[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIIIIIIIB)V",
      line = 131
   )
   public static final void method3000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
      boolean var9 = client.field4360;

      try {
         ++field5736;
         if (!class635.method4596(arg4, 28505)) {
            if (~arg0 != 0) {
               class188.field2673[arg0] = true;
            } else {
               int var10 = 0;
               if (var9) {
                  class188.field2673[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(var10 < 100) {
                     class188.field2673[var10] = true;
                     ++var10;
                  }

                  if (!var9) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            int var11 = 0;
            if (arg8 != 39) {
               method2997(64, -49, 110, -119, 64);
            }

            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class681.field10034) {
               var14 = class80.field1036;
               var13 = class785.field11512;
               var15 = class256.field3479;
               var11 = field5719;
               var12 = class203.field2888;
               class256.field3479 = 1;
            }

            label91: {
               if (class428.field6127[arg4] != null) {
                  class382.method2886(arg6, -1, arg7, class428.field6127[arg4], ~arg0 > -1, arg0, arg3, arg1, arg5, arg8 ^ 8785, arg2);
                  if (!var9) {
                     break label91;
                  }
               }

               class382.method2886(arg6, -1, arg7, class547.field7851[arg4], ~arg0 > -1, arg0, arg3, arg1, arg5, 8822, arg2);
            }

            if (class681.field10034) {
               if (arg0 >= 0 && class256.field3479 == 2) {
                  class193.method1520(class203.field2888, arg8 ^ -119, class80.field1036, class785.field11512, field5719);
               }

               class785.field11512 = var13;
               class203.field2888 = var12;
               class256.field3479 = var15;
               field5719 = var11;
               class80.field1036 = var14;
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field5739[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 197
   )
   public final void method3001(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 >= -13) {
            method2998((byte)23);
         }

         ++field5728;

         do {
            int var4 = arg1.method1143(-15465);
            if (~var4 == -1) {
               break;
            }

            this.method2999(var4, 31180, arg1);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5739[7] + arg0 + ',' + (arg1 != null ? field5739[2] : field5739[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lwf;I)Lgka;",
      line = 221
   )
   public static final class394 method3002(class147 arg0, int arg1) {
      try {
         int var2 = 59 / ((arg1 - 26) / 42);
         ++field5724;
         return new class394(arg0.method1187((byte)74), arg0.method1187((byte)95), arg0.method1187((byte)-91), arg0.method1187((byte)-75), arg0.method1166((byte)-120), arg0.method1166((byte)-32), arg0.method1143(-15465));
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5739[0] + (arg0 != null ? field5739[2] : field5739[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(B)V",
      line = 241
   )
   public static void method3003(byte arg0) {
      try {
         field5734 = null;
         field5731 = null;
         field5737 = null;
         field5735 = null;
         if (arg0 != -39) {
            field5719 = -99;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5739[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3004(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3005(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
