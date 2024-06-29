import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class357 extends class428 {
   @OriginalMember(
      owner = "client!rd",
      name = "v",
      descriptor = "I"
   )
   public int field4793 = -1;
   @OriginalMember(
      owner = "client!rd",
      name = "p",
      descriptor = "Z"
   )
   public boolean field4799 = false;
   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4803 = new String[]{method2664(method2663("Q\u007f(YWMrr[\u0016")), method2664(method2663("Q\u007f('\u0016")), method2664(method2663("Q\u007f($\u0016")), method2664(method2663("Mnj\t")), method2664(method2663("X5(KC"))};
   @OriginalMember(
      owner = "client!rd",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field4792 = true;
   @OriginalMember(
      owner = "client!rd",
      name = "s",
      descriptor = "I"
   )
   public int field4794;
   @OriginalMember(
      owner = "client!rd",
      name = "n",
      descriptor = "I"
   )
   public int field4795;
   @OriginalMember(
      owner = "client!rd",
      name = "q",
      descriptor = "I"
   )
   public static int field4796;
   @OriginalMember(
      owner = "client!rd",
      name = "o",
      descriptor = "I"
   )
   public static int field4797;
   @OriginalMember(
      owner = "client!rd",
      name = "r",
      descriptor = "I"
   )
   public static int field4798;
   @OriginalMember(
      owner = "client!rd",
      name = "w",
      descriptor = "I"
   )
   public int field4800;
   @OriginalMember(
      owner = "client!rd",
      name = "m",
      descriptor = "I"
   )
   public int field4801;
   @OriginalMember(
      owner = "client!rd",
      name = "t",
      descriptor = "I"
   )
   public int field4802;

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(IJLbl;BIIIILaa;)V",
      line = 10
   )
   public static final void method2661(int arg0, long arg1, class678 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class515 arg8) {
      try {
         ++field4798;
         int var10 = arg4 * arg4 + arg7 * arg7;
         if (~((long)var10) >= ~arg1) {
            int var11 = -115 / ((arg3 - 33) / 47);
            int var12 = Math.min(arg2.field9904 / 2, arg2.field9980 / 2);
            if (var10 <= var12 * var12) {
               class535.method3859(arg8, class739.field10782[arg0], arg4, arg2, arg5, (byte)113, arg6, arg7);
            } else {
               int var13;
               label36: {
                  var12 -= 10;
                  if (class380.field5481 != 4) {
                     var13 = 16383 & (int)class117.field1467 + class237.field3298;
                     if (!client.field4360) {
                        break label36;
                     }
                  }

                  var13 = 16383 & (int)class117.field1467;
               }

               int var14 = class363.field4956[var13];
               int var15 = class363.field4987[var13];
               if (~class380.field5481 != -5) {
                  var15 = var15 * 256 / (class642.field9387 + 256);
                  var14 = var14 * 256 / (class642.field9387 + 256);
               }

               int var16 = arg4 * var15 + arg7 * var14 >> 14;
               int var17 = arg7 * var15 + -(arg4 * var14) >> 14;
               double var18 = Math.atan2((double)var16, (double)var17);
               int var20 = (int)(Math.sin(var18) * (double)var12);
               int var21 = (int)(Math.cos(var18) * (double)var12);
               class534.field7618[arg0].method3579((float)arg2.field9904 / 2.0F + (float)arg5 + (float)var20, (float)arg2.field9980 / 2.0F + (float)arg6 - (float)var21, 4096, (int)(-var18 / 6.283185307179586D * 65535.0D));
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field4803[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4803[4] : field4803[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field4803[4] : field4803[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "(I)V",
      line = 119
   )
   public class357(int arg0) {
      try {
         this.field4793 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4803[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 72
   )
   public static final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field4797;
         if (arg8 > -98) {
            method2661(57, -108L, (class678)null, (byte)-57, 16, -36, -62, -86, (class515)null);
         }

         if (arg0 >= 1 && ~arg5 <= -2 && arg0 <= class644.field9403 + -2 && ~arg5 >= ~(class337.field4594 + -2)) {
            int var9 = arg6;
            if (~arg6 > -4 && class437.method3224(arg5, true, arg0)) {
               var9 = arg6 + 1;
            }

            if (~class300.field4107.field6412.method1017(-127) == -1 && !class572.method4091(var9, arg0, class169.field2359, arg5, -87)) {
               return;
            }

            if (class663.field9659 == null) {
               return;
            }

            class101.field1294.method1938(class383.field5543, arg6, class767.field11309[arg6], true, arg5, arg0, arg2);
            if (arg4 >= 0) {
               int var10 = class300.field4107.field6448.method4664(100);
               class300.field4107.method3301(25349, class300.field4107.field6448, 1);
               class101.field1294.method1931(arg5, arg4, arg3, arg1, arg6, class383.field5543, (byte)104, var9, class767.field11309[arg6], arg0, arg7);
               class300.field4107.method3301(25349, class300.field4107.field6448, var10);
               return;
            }
         }

      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field4803[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2663(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2664(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
