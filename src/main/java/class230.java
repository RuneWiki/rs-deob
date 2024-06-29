import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class230 extends class213 {
   @OriginalMember(
      owner = "client!cha",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3242 = new String[]{method1794(method1793("\\\n)H>")), method1794(method1793("IQk\n")), method1794(method1793("DLfH\u0001\u000f")), method1794(method1793("sr=F")), method1794(method1793("DLfH\u0005\u000f")), method1794(method1793("DLfH\u0000\u000f")), method1794(method1793("DLfH\u0007\u000f")), method1794(method1793("DLfH\u0002\u000f")), method1794(method1793("DLfH\u0006\u000f"))};
   @OriginalMember(
      owner = "client!cha",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field3238 = new int[32];
   @OriginalMember(
      owner = "client!cha",
      name = "t",
      descriptor = "I"
   )
   public static int field3232;
   @OriginalMember(
      owner = "client!cha",
      name = "C",
      descriptor = "I"
   )
   private int field3234;
   @OriginalMember(
      owner = "client!cha",
      name = "y",
      descriptor = "I"
   )
   public static int field3235;
   @OriginalMember(
      owner = "client!cha",
      name = "x",
      descriptor = "I"
   )
   public static int field3236;
   @OriginalMember(
      owner = "client!cha",
      name = "A",
      descriptor = "I"
   )
   public static int field3237;
   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "I"
   )
   private int field3239;
   @OriginalMember(
      owner = "client!cha",
      name = "u",
      descriptor = "I"
   )
   public static int field3240;
   @OriginalMember(
      owner = "client!cha",
      name = "v",
      descriptor = "I"
   )
   public static int field3241;
   @OriginalMember(
      owner = "client!cha",
      name = "B",
      descriptor = "Lcka;"
   )
   public static class187 field3233;

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1789(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         if (arg0 != 14722) {
            method1790((byte)126);
         }

         ++field3241;
         if (~class116.field1452 > -101) {
            return -2;
         } else {
            int var5 = -2;
            int var6 = Integer.MAX_VALUE;
            int var7 = -class650.field9513 + arg3;
            int var8 = -class650.field9523 + arg1;
            class357 var9 = (class357)class650.field9493.method2933(arg0 + -14720);
            int var10000;
            if (var4) {
               var10000 = arg2;
            } else if (var9 == null) {
               var10000 = var5;
               if (!var4) {
                  return var5;
               }
            } else {
               var10000 = arg2;
            }

            while(true) {
               if (var10000 == var9.field4793) {
                  int var10 = var9.field4795;
                  int var11 = var9.field4801;
                  int var12 = class650.field9513 + var10 << 14 | var11 - -class650.field9523;
                  int var13 = (-var10 + var7) * (-var10 + var7) - -((-var11 + var8) * (-var11 + var8));
                  if (var5 >= 0) {
                     if (var6 > var13) {
                        var6 = var13;
                        var5 = var12;
                     }
                  } else {
                     var6 = var13;
                     var5 = var12;
                  }
               }

               var9 = (class357)class650.field9493.method2940(false);
               if (var9 == null) {
                  var10000 = var5;
                  if (!var4) {
                     return var5;
                  }
               } else {
                  var10000 = arg2;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field3242[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1790(byte arg0) {
      boolean var1 = client.field4360;

      try {
         class699 var2 = (class699)class148.field1935.method328(1745388291);
         class456 var4;
         class685 var5;
         if (var1) {
            if (!var2.field10230.method4675(arg0 + 193)) {
               var2.field10230.method5170(arg0 ^ -88);

               try {
                  var2.field10230.method4678((byte)-83);
               } catch (Exception var8) {
                  class668.method4876(arg0 + 36, field3242[3] + var2.field10227, var8);
                  class342.method2509(var2.field10227, (byte)83);
               }

               if (!var2.field10228 && !var2.field10233) {
                  var4 = var2.field10230.method4674(-32268);
                  if (var4 != null) {
                     var5 = var4.method3325(30361);
                     if (var5 != null) {
                        var5.method4993(var2.field10236, 6022);
                        class280.field3897.method4814(var5);
                        var2.field10228 = true;
                        if (var1) {
                           class342.method2509(var2.field10227, (byte)116);
                        }
                     }
                  }
               }
            } else {
               class342.method2509(var2.field10227, (byte)116);
            }

            var2 = (class699)class148.field1935.method325(arg0 + -4541);
         }

         while(true) {
            while(var2 != null) {
               if (!var2.field10230.method4675(arg0 + 193)) {
                  var2.field10230.method5170(arg0 ^ -88);

                  try {
                     var2.field10230.method4678((byte)-83);
                  } catch (Exception var7) {
                     class668.method4876(arg0 + 36, field3242[3] + var2.field10227, var7);
                     class342.method2509(var2.field10227, (byte)83);
                  }

                  if (!var2.field10228 && !var2.field10233) {
                     var4 = var2.field10230.method4674(-32268);
                     if (var4 != null) {
                        var5 = var4.method3325(30361);
                        if (var5 != null) {
                           var5.method4993(var2.field10236, 6022);
                           class280.field3897.method4814(var5);
                           var2.field10228 = true;
                           if (var1) {
                              class342.method2509(var2.field10227, (byte)116);
                           }
                        }
                     }
                  }
               } else {
                  class342.method2509(var2.field10227, (byte)116);
               }

               var2 = (class699)class148.field1935.method325(arg0 + -4541);
            }

            if (!var1) {
               if (arg0 != -88) {
                  method1792(-64);
               }

               ++field3240;
               return;
            }

            class342.method2509(arg0, (byte)-88);
            var2 = (class699)class148.field1935.method325(arg0 + -4541);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3242[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         if (arg1 > -38) {
            method1789(-64, -29, 23, -89);
         }

         this.field3239 = arg0.method1164(19693);
         ++field3237;
         this.field3234 = arg0.method1164(19693);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3242[5] + (arg0 != null ? field3242[0] : field3242[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         arg0.method3434((byte)116, this.field3234, this.field3239);
         ++field3232;
         if (!arg1) {
            field3233 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3242[7] + (arg0 != null ? field3242[0] : field3242[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "([FIB)[F"
   )
   public static final float[] method1791(float[] arg0, int arg1, byte arg2) {
      try {
         ++field3236;
         float[] var3 = new float[arg1];
         class242.method1852(arg0, 0, var3, 0, arg1);
         if (arg2 < 0) {
            method1791((float[])null, -120, (byte)74);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3242[2] + (arg0 != null ? field3242[0] : field3242[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1792(int arg0) {
      try {
         field3238 = null;
         field3233 = null;
         if (arg0 != Integer.MAX_VALUE) {
            method1789(-16, -54, 59, -111);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3242[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
