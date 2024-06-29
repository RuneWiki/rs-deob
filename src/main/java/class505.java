import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public abstract class class505 extends class428 {
   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7329 = new String[]{method3667(method3666("K\u001f#o/")), method3667(method3666("^Da-")), method3667(method3666("QA#\u0002z")), method3667(method3666("QA#\u0003z")), method3667(method3666("QA#\u0007z")), method3667(method3666("QA#\u0004z")), method3667(method3666("QA#\u0005z"))};
   @OriginalMember(
      owner = "client!ap",
      name = "m",
      descriptor = "Loba;"
   )
   public static class274 field7325 = new class274();
   @OriginalMember(
      owner = "client!ap",
      name = "o",
      descriptor = "[Z"
   )
   public static boolean[] field7326 = new boolean[100];
   @OriginalMember(
      owner = "client!ap",
      name = "r",
      descriptor = "I"
   )
   public static int field7323;
   @OriginalMember(
      owner = "client!ap",
      name = "p",
      descriptor = "I"
   )
   public static int field7324;
   @OriginalMember(
      owner = "client!ap",
      name = "q",
      descriptor = "I"
   )
   public static int field7327;
   @OriginalMember(
      owner = "client!ap",
      name = "n",
      descriptor = "I"
   )
   public static int field7328;

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(BIII)I",
      line = 5
   )
   public static final int method3661(byte arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         if (arg0 != -65) {
            return 119;
         } else {
            label42: {
               if (~arg2 < -244) {
                  arg3 >>= 4;
                  if (!var4) {
                     break label42;
                  }
               }

               if (~arg2 < -218) {
                  arg3 >>= 3;
                  if (!var4) {
                     break label42;
                  }
               }

               if (arg2 <= 192) {
                  if (~arg2 >= -180) {
                     break label42;
                  }

                  arg3 >>= 1;
                  if (!var4) {
                     break label42;
                  }
               }

               arg3 >>= 2;
            }

            ++field7328;
            return ((63 & arg1 >> 2) << 10) + (arg2 >> 1) - -(arg3 >> 5 << 7);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7329[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(IIBIILmk;I)Z",
      line = 33
   )
   public static final boolean method3662(int arg0, int arg1, byte arg2, int arg3, int arg4, class62 arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field7324;
         if (class696.field10207 && class273.field3754) {
            if (~class330.field4497 > -101) {
               return false;
            } else {
               int var8 = -77 % ((-70 - arg2) / 53);
               if (~arg0 == ~arg1 && ~arg4 == ~arg6) {
                  if (!class50.method405(arg0, 118, arg4, arg3)) {
                     return false;
                  } else if (class146.method1138(arg5, -1)) {
                     ++class20.field225;
                     return true;
                  } else {
                     return false;
                  }
               } else {
                  int var9 = arg0;
                  int var10;
                  int var10000;
                  if (var7) {
                     var10 = arg4;
                     if (var7) {
                        if (class147.field1929[arg3][arg0][arg4] == -class500.field7247) {
                           return false;
                        }

                        var10 = arg4 + 1;
                     }
                  } else {
                     if (arg0 > arg1) {
                        var10000 = class146.method1138(arg5, -1);
                        if (!var7) {
                           if (var10000 == 0) {
                              return false;
                           }

                           ++class20.field225;
                           return true;
                        }
                     } else {
                        var10000 = arg4;
                     }

                     var10 = var10000;
                     if (var7) {
                        if (class147.field1929[arg3][arg0][var10] == -class500.field7247) {
                           return false;
                        }

                        ++var10;
                     }
                  }

                  while(true) {
                     while(~arg6 <= ~var10) {
                        if (class147.field1929[arg3][var9][var10] == -class500.field7247) {
                           return false;
                        }

                        ++var10;
                     }

                     if (!var7) {
                        ++var9;
                        if (var9 > arg1) {
                           var10000 = class146.method1138(arg5, -1);
                           if (!var7) {
                              if (var10000 == 0) {
                                 return false;
                              }

                              ++class20.field225;
                              return true;
                           }
                        } else {
                           var10000 = arg4;
                        }

                        var10 = var10000;
                        if (var7) {
                           if (class147.field1929[arg3][var9][var10] == -class500.field7247) {
                              return false;
                           }

                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field7329[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7329[0] : field7329[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(I)V",
      line = 88
   )
   public static final void method3663(int arg0) {
      try {
         class64.method485((byte)49);
         ++field7323;
         class640.method4626(22050, 2, ~class300.field4107.field6409.method843(-99) == -2, 48000);
         class218.field3125 = class621.method4515(class316.field4304, -28746, 0, 22050, class557.field7990);
         class377.method2860(125, class521.method3783(9, (class582)null), true);
         class393.field5688 = class621.method4515(class316.field4304, -28746, 1, 2048, class557.field7990);
         class393.field5688.method1548(class280.field3897, -20253);
         if (arg0 > -81) {
            method3664(29, 12, -75, 6, -32, 68);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7329[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 109
   )
   public static final void method3664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         class762.field11256 = arg4;
         ++field7327;
         class102.field1309 = arg0;
         if (arg1 != -14960) {
            field7325 = null;
         }

         class27.field415 = arg3;
         class188.field2679 = arg5;
         class415.field5979 = arg2;
         if (~class415.field5979 <= -101) {
            int var6 = class27.field415 * 512 - -256;
            int var7 = class188.field2679 * 512 + 256;
            int var8 = class102.method851(class561.field8019, (byte)127, var6, var7) - class102.field1309;
            int var9 = -class224.field3188 + var6;
            int var10 = -class421.field6021 + var8;
            int var11 = var7 - class782.field11465;
            int var12 = (int)Math.sqrt((double)(var9 * var9 - -(var11 * var11)));
            class207.field2966 = (int)(2607.5945876176133D * Math.atan2((double)var10, (double)var12)) & 16383;
            class10.field96 = 16383 & (int)(-2607.5945876176133D * Math.atan2((double)var9, (double)var11));
            if (~class207.field2966 > -1025) {
               class207.field2966 = 1024;
            }

            class723.field10552 = 0;
            if (class207.field2966 > 3072) {
               class207.field2966 = 3072;
            }
         }

         class380.field5481 = 2;
         class25.field376 = -1;
         class744.field10854 = -1;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field7329[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "b",
      descriptor = "(I)V",
      line = 162
   )
   public static void method3665(int arg0) {
      try {
         field7326 = null;
         if (arg0 != 25744) {
            method3661((byte)-77, 84, -74, -2);
         }

         field7325 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7329[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public abstract void method1338(int arg0, class147 arg1);

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(Ldda;Z)V"
   )
   public abstract void method1339(class405 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3666(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3667(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
