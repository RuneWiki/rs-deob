import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class442 {
   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6745 = new String[]{method3348(method3347("I^LxG")), method3348(method3347("I^L{G")), method3348(method3347("I^L~G")), method3348(method3347("I^LyG"))};
   @OriginalMember(
      owner = "client!ep",
      name = "n",
      descriptor = "Lsd;"
   )
   public static class101 field6731 = new class101(33, 12);
   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field6734 = new class269(48, 2);
   @OriginalMember(
      owner = "client!ep",
      name = "j",
      descriptor = "Lsd;"
   )
   public static class101 field6737 = new class101(53, 10);
   @OriginalMember(
      owner = "client!ep",
      name = "g",
      descriptor = "Lsda;"
   )
   public static class269 field6739 = new class269(28, 4);
   @OriginalMember(
      owner = "client!ep",
      name = "k",
      descriptor = "I"
   )
   public static int field6741 = 1403;
   @OriginalMember(
      owner = "client!ep",
      name = "i",
      descriptor = "I"
   )
   public static int field6744 = -2;
   @OriginalMember(
      owner = "client!ep",
      name = "l",
      descriptor = "I"
   )
   public static int field6742 = 0;
   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6740 = null;
   @OriginalMember(
      owner = "client!ep",
      name = "e",
      descriptor = "F"
   )
   public static float field6743;
   @OriginalMember(
      owner = "client!ep",
      name = "f",
      descriptor = "I"
   )
   public static int field6732;
   @OriginalMember(
      owner = "client!ep",
      name = "h",
      descriptor = "I"
   )
   public static int field6733;
   @OriginalMember(
      owner = "client!ep",
      name = "c",
      descriptor = "I"
   )
   public static int field6735;
   @OriginalMember(
      owner = "client!ep",
      name = "d",
      descriptor = "[Lah;"
   )
   public static class404[] field6738;
   @OriginalMember(
      owner = "client!ep",
      name = "m",
      descriptor = "[Z"
   )
   public static boolean[] field6736;

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(ZZB)V"
   )
   public static final void method3343(boolean arg0, boolean arg1, byte arg2) {
      try {
         if (arg1) {
            --class85.field1040;
            if (~class85.field1040 == -1) {
               class672.field10111 = null;
            }
         }

         if (arg0) {
            --class286.field4024;
            if (class286.field4024 == 0) {
               class628.field9131 = null;
            }
         }

         ++field6733;
         if (arg2 > -85) {
            method3343(false, false, (byte)41);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6745[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method3344(int arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field6735;
         if (~class180.field2223 > -101) {
            return -2;
         } else {
            int var5 = arg3;
            int var6 = Integer.MAX_VALUE;
            int var7 = -class329.field4688 + arg2;
            int var8 = -class329.field4696 + arg0;
            class446 var9 = (class446)class329.field4676.method4071((byte)126);
            int var10000;
            if (var4 != 0) {
               var10000 = var9.field6786;
            } else if (var9 == null) {
               var10000 = arg3;
               if (var4 == 0) {
                  return arg3;
               }
            } else {
               var10000 = var9.field6786;
            }

            while(true) {
               if (var10000 == arg1) {
                  int var10 = var9.field6780;
                  int var11 = var9.field6777;
                  int var12 = class329.field4696 + var11 | class329.field4688 + var10 << 14;
                  int var13 = (var7 - var10) * (var7 - var10) - -((-var11 + var8) * (-var11 + var8));
                  if (~var5 <= -1) {
                     if (~var13 > ~var6) {
                        var6 = var13;
                        var5 = var12;
                     }
                  } else {
                     var6 = var13;
                     var5 = var12;
                  }
               }

               var9 = (class446)class329.field4676.method4059((byte)123);
               if (var9 == null) {
                  var10000 = var5;
                  if (var4 == 0) {
                     return var5;
                  }
               } else {
                  var10000 = var9.field6786;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field6745[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IIIIIIBI)V"
   )
   public static final void method3345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      try {
         int var8;
         label30: {
            ++field6732;
            var8 = arg4 + -334;
            if (var8 < 0) {
               var8 = 0;
               if (client.field4530 == 0) {
                  break label30;
               }
            }

            if (~var8 < -101) {
               var8 = 100;
            }
         }

         if (arg6 >= 55) {
            int var9 = class104.field1259 - -((-class104.field1259 + class497.field7372) * var8 / 100);
            class221.field2828 = class221.field2834 * var9 >> 8;
            int var17 = arg5 * var9 >> 8;
            int var10 = 16383 & -arg2 + 16384;
            int var11 = 16383 & -arg1 + 16384;
            int var12 = 0;
            int var13 = 0;
            int var14 = var17;
            if (~var10 != -1) {
               var13 = class689.field10389[var10] * -var17 >> 14;
               var14 = class689.field10391[var10] * var17 >> 14;
            }

            if (var11 != 0) {
               var12 = class689.field10389[var11] * var14 >> 14;
               var14 = class689.field10391[var11] * var14 >> 14;
            }

            class292.field4078 = arg1;
            class503.field7464 = 0;
            class731.field10844 = -var12 + arg3;
            class232.field2947 = -var14 + arg7;
            class733.field10871 = -var13 + arg0;
            class713.field10637 = arg2;
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field6745[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3346(int arg0) {
      try {
         field6739 = null;
         field6734 = null;
         field6736 = null;
         field6740 = null;
         field6737 = null;
         if (arg0 != -327767576) {
            method3343(true, true, (byte)39);
         }

         field6731 = null;
         field6738 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6745[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
