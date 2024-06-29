import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public abstract class class223 extends class386 {
   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3330 = new String[]{method1874(method1873("\u001d\u001fw\u0013\u0001")), method1874(method1873("\u0005T8\u0013=N")), method1874(method1873("\bD5Q")), method1874(method1873("\u0005T8\u0013>N")), method1874(method1873("\u0005T8\u0013;N")), method1874(method1873("\u0005T8\u00139N"))};
   @OriginalMember(
      owner = "client!cea",
      name = "h",
      descriptor = "Lhm;"
   )
   public static class230 field3327 = new class230(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!cea",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field3328 = false;
   @OriginalMember(
      owner = "client!cea",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field3329 = new int[1000];
   @OriginalMember(
      owner = "client!cea",
      name = "m",
      descriptor = "I"
   )
   public static int field3324;
   @OriginalMember(
      owner = "client!cea",
      name = "k",
      descriptor = "I"
   )
   public static int field3325;
   @OriginalMember(
      owner = "client!cea",
      name = "j",
      descriptor = "I"
   )
   public static int field3326;

   @OriginalMember(
      owner = "client!cea",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public static void method1869(int arg0) {
      try {
         field3329 = null;
         if (arg0 == 14508) {
            field3327 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3330[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(II)S",
      line = 19
   )
   public static final short method1870(int arg0, int arg1) {
      try {
         int var2;
         int var6;
         int var7;
         label22: {
            ++field3324;
            var2 = arg0 >> 10 & 63;
            int var3 = arg0 >> 3 & 112;
            int var4 = 127 & arg0;
            int var5 = ~var4 < -65 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
            var6 = var4 + var5;
            if (~var6 == -1) {
               var7 = var5 << 1;
               if (!client.field4564) {
                  break label22;
               }
            }

            var7 = (var5 << 8) / var6;
         }

         if (arg1 != 1859335297) {
            method1871(-89, (class451)null, (byte)112, (int[])null);
         }

         return (short)(var6 | var2 << 10 | var7 >> 4 << 7);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3330[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(ILuba;B[I)V",
      line = 47
   )
   public static final void method1871(int arg0, class451 arg1, byte arg2, int[] arg3) {
      boolean var4 = client.field4564;

      try {
         if (arg2 <= 60) {
            method1869(-112);
         }

         ++field3326;
         int var10000;
         if (arg1.field11288 != null) {
            label96: {
               byte var5 = 1;
               int var6 = 0;
               if (var4) {
                  var10000 = ~arg3[var6];
               } else if (~arg1.field11288.length >= ~var6) {
                  var10000 = var5;
                  if (!var4) {
                     break label96;
                  }
               } else {
                  var10000 = ~arg3[var6];
               }

               label95:
               do {
                  while(true) {
                     if (var10000 != ~arg1.field11288[var6]) {
                        var5 = 0;
                        if (!var4) {
                           var10000 = var5;
                           break;
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }

                     if (~arg1.field11288.length >= ~var6) {
                        var10000 = var5;
                        if (!var4) {
                           break label95;
                        }
                     } else {
                        var10000 = ~arg3[var6];
                     }
                  }
               } while(var4);
            }

            if (var10000 != 0 && ~arg1.field11224 != 0) {
               class295 var7 = class588.field8496.method3781(5, arg1.field11224);
               int var8 = var7.field4114;
               if (var8 == 1) {
                  arg1.field11250 = 0;
                  arg1.field11234 = 0;
                  arg1.field11231 = 1;
                  arg1.field11295 = arg0;
                  arg1.field11267 = 0;
                  if (!arg1.field11222) {
                     class720.method5205(0, arg1, arg1.field11267, var7);
                  }
               }

               if (~var8 == -3) {
                  arg1.field11234 = 0;
               }
            }
         }

         byte var9 = 1;
         int var10 = 0;
         if (var4) {
            if (arg3[var10] != -1) {
               var9 = 0;
            }
         } else {
            if (var10 >= arg3.length) {
               var10000 = var9;
               if (!var4) {
                  if (var9 != 0) {
                     arg1.field11316 = arg1.field11321;
                     arg1.field11295 = arg0;
                     arg1.field11288 = arg3;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg3[var10];
            }

            if (var10000 != -1) {
               var9 = 0;
            }
         }

         while(true) {
            if (arg1.field11288 != null) {
               if (~arg1.field11288[var10] != 0) {
                  if (~class588.field8496.method3781(5, arg3[var10]).field4108 <= ~class588.field8496.method3781(5, arg1.field11288[var10]).field4108) {
                     arg1.field11288 = arg3;
                     arg1.field11295 = arg0;
                     arg1.field11316 = arg1.field11321;
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  arg1.field11288 = arg3;
                  arg1.field11295 = arg0;
                  arg1.field11316 = arg1.field11321;
                  ++var10;
               }
            } else {
               arg1.field11288 = arg3;
               arg1.field11295 = arg0;
               arg1.field11316 = arg1.field11321;
               ++var10;
            }

            if (var10 >= arg3.length) {
               var10000 = var9;
               if (!var4) {
                  if (var9 != 0) {
                     arg1.field11316 = arg1.field11321;
                     arg1.field11295 = arg0;
                     arg1.field11288 = arg3;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg3[var10];
            }

            if (var10000 != -1) {
               var9 = 0;
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field3330[1] + arg0 + ',' + (arg1 != null ? field3330[0] : field3330[2]) + ',' + arg2 + ',' + (arg3 != null ? field3330[0] : field3330[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "b",
      descriptor = "(II)I",
      line = 137
   )
   public static final int method1872(int arg0, int arg1) {
      try {
         ++field3325;
         int var2 = arg0 >>> 1;
         int var3 = var2 | var2 >>> 1;
         int var4 = var3 | var3 >>> 2;
         int var5 = var4 | var4 >>> 4;
         int var6 = var5 | var5 >>> 8;
         if (arg1 != 969328545) {
            method1870(121, -14);
         }

         int var7 = var6 | var6 >>> 16;
         return arg0 & ~var7;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3330[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(I)Lnd;"
   )
   public abstract class568 method860(int arg0);

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1873(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1874(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
