import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class44 {
   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field505 = new String[]{method378(method377("Th.G}\n")), method378(method377("Th.G~\n")), method378(method377("L\u007f#\u0005")), method378(method377("Th.Gx\n")), method378(method377("Y$aGA"))};
   @OriginalMember(
      owner = "client!vba",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field501 = new int[5];
   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field504 = new class378(138, -2);
   @OriginalMember(
      owner = "client!vba",
      name = "d",
      descriptor = "I"
   )
   public static int field502;
   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "I"
   )
   public static int field503;

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(IIIBII)V"
   )
   public static final void method373(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field502;
         int var7 = -arg4 + arg2;
         int var8 = -arg5 + arg1;
         if (var7 == 0) {
            if (var8 != 0) {
               class466.method3416(arg0, arg4, arg1, 10070, arg5);
            }

         } else if (~var8 == -1) {
            class701.method5088(arg2, -1086528703, arg0, arg4, arg5);
         } else {
            int var9 = (var8 << 12) / var7;
            if (arg3 == -103) {
               int var10;
               int var11;
               int var12;
               label74: {
                  var10 = -(arg4 * var9 >> 12) + arg5;
                  if (arg4 >= class265.field3451) {
                     if (arg4 <= class663.field9442) {
                        var11 = arg4;
                        var12 = arg5;
                        if (!var6) {
                           break label74;
                        }
                     }

                     var11 = class663.field9442;
                     var12 = (class663.field9442 * var9 >> 12) + var10;
                     if (!var6) {
                        break label74;
                     }
                  }

                  var12 = var10 - -(class265.field3451 * var9 >> 12);
                  var11 = class265.field3451;
               }

               int var13;
               int var14;
               label83: {
                  if (class265.field3451 > arg2) {
                     var13 = class265.field3451;
                     var14 = (class265.field3451 * var9 >> 12) + var10;
                     if (!var6) {
                        break label83;
                     }
                  }

                  if (~arg2 < ~class663.field9442) {
                     var14 = var10 - -(class663.field9442 * var9 >> 12);
                     var13 = class663.field9442;
                     if (!var6) {
                        break label83;
                     }
                  }

                  var13 = arg2;
                  var14 = arg1;
               }

               label57: {
                  if (~class478.field6604 >= ~var12) {
                     if (class313.field4171 >= var12) {
                        break label57;
                     }

                     var12 = class313.field4171;
                     var11 = (class313.field4171 - var10 << 12) / var9;
                     if (!var6) {
                        break label57;
                     }
                  }

                  var12 = class478.field6604;
                  var11 = (-var10 + class478.field6604 << 12) / var9;
               }

               label50: {
                  if (var14 >= class478.field6604) {
                     if (~class313.field4171 <= ~var14) {
                        break label50;
                     }

                     var13 = (-var10 + class313.field4171 << 12) / var9;
                     var14 = class313.field4171;
                     if (!var6) {
                        break label50;
                     }
                  }

                  var14 = class478.field6604;
                  var13 = (class478.field6604 - var10 << 12) / var9;
               }

               class324.method2440(var13, var12, var14, -125, arg0, var11);
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field505[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method374(int arg0, int arg1) {
      class225 var2 = class111.field1404[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class225 var4 = class111.field1404[var3][arg0][arg1] = class111.field1404[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class752 var5 = var4.field2821; var5 != null; var5 = var5.field10923) {
               class47 var6 = var5.field10922;
               if (var6.field547 == arg0 && var6.field540 == arg1) {
                  --var6.field1001;
               }
            }

            if (var4.field2820 != null) {
               --var4.field2820.field1001;
            }

            if (var4.field2831 != null) {
               --var4.field2831.field1001;
            }

            if (var4.field2830 != null) {
               --var4.field2830.field1001;
            }

            if (var4.field2824 != null) {
               --var4.field2824.field1001;
            }

            if (var4.field2822 != null) {
               --var4.field2822.field1001;
            }
         }
      }

      if (class111.field1404[0][arg0][arg1] == null) {
         class111.field1404[0][arg0][arg1] = new class225(0);
         class111.field1404[0][arg0][arg1].field2825 = 1;
      }

      class111.field1404[0][arg0][arg1].field2828 = var2;
      class111.field1404[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(BLwm;)Ldba;"
   )
   public static final class101 method375(byte arg0, class594 arg1) {
      try {
         ++field503;
         class190 var2 = class127.method1068((byte)71)[arg1.method4288((byte)99)];
         class169 var3 = class393.method2992(126)[arg1.method4288((byte)79)];
         int var4 = arg1.method4333(-104);
         int var5 = arg1.method4333(-80);
         int var6 = arg1.method4280(-19104);
         int var7 = arg1.method4280(-19104);
         int var8 = arg1.method4333(-126);
         int var9 = 58 % ((arg0 - 41) / 63);
         int var10 = arg1.method4302(true);
         int var11 = arg1.method4302(true);
         return new class101(var2, var3, var4, var5, var6, var7, var8, var10, var11);
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field505[3] + arg0 + ',' + (arg1 != null ? field505[4] : field505[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method376(int arg0) {
      try {
         field501 = null;
         if (arg0 != -8962) {
            method373(-44, 75, 60, (byte)93, 91, 69);
         }

         field504 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field505[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method378(char[] arg0) {
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
            var10005 = 10;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
