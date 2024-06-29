import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class573 extends class70 {
   @OriginalMember(
      owner = "client!sia",
      name = "L",
      descriptor = "I"
   )
   private int field8485 = 1024;
   @OriginalMember(
      owner = "client!sia",
      name = "R",
      descriptor = "I"
   )
   private int field8486 = 2048;
   @OriginalMember(
      owner = "client!sia",
      name = "Q",
      descriptor = "I"
   )
   private int field8493 = 3072;
   @OriginalMember(
      owner = "client!sia",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8497 = new String[]{method4313(method4312("M!6\u00170\u0016")), method4313(method4312("M!6\u00172\u0016")), method4313(method4312("M!6\u00176\u0016")), method4313(method4312("M!6\u00171\u0016")), method4313(method4312("M!6\u00177\u0016")), method4313(method4312("M!6\u0017?\u0016")), method4313(method4312("Efy\u0017\b")), method4313(method4312("P=;U")), method4313(method4312("M!6\u00174\u0016")), method4313(method4312("M!6\u00173\u0016")), method4313(method4312("M!6\u0017=\u0016"))};
   @OriginalMember(
      owner = "client!sia",
      name = "K",
      descriptor = "I"
   )
   public static int field8488 = 4;
   @OriginalMember(
      owner = "client!sia",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field8496 = new int[1000];
   @OriginalMember(
      owner = "client!sia",
      name = "U",
      descriptor = "Ljl;"
   )
   public static class133 field8484 = new class133();
   @OriginalMember(
      owner = "client!sia",
      name = "T",
      descriptor = "F"
   )
   public static float field8481;
   @OriginalMember(
      owner = "client!sia",
      name = "N",
      descriptor = "I"
   )
   public static int field8482;
   @OriginalMember(
      owner = "client!sia",
      name = "G",
      descriptor = "I"
   )
   public static int field8483;
   @OriginalMember(
      owner = "client!sia",
      name = "O",
      descriptor = "I"
   )
   public static int field8487;
   @OriginalMember(
      owner = "client!sia",
      name = "M",
      descriptor = "I"
   )
   public static int field8489;
   @OriginalMember(
      owner = "client!sia",
      name = "I",
      descriptor = "I"
   )
   public static int field8490;
   @OriginalMember(
      owner = "client!sia",
      name = "J",
      descriptor = "I"
   )
   public static int field8491;
   @OriginalMember(
      owner = "client!sia",
      name = "P",
      descriptor = "I"
   )
   public static int field8492;
   @OriginalMember(
      owner = "client!sia",
      name = "S",
      descriptor = "I"
   )
   public static int field8494;
   @OriginalMember(
      owner = "client!sia",
      name = "H",
      descriptor = "I"
   )
   public static int field8495;

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public final void method275(boolean arg0) {
      try {
         if (arg0) {
            this.method8((byte)-113, -59);
         }

         ++field8483;
         this.field8486 = -this.field8485 + this.field8493;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8497[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "g",
      descriptor = "(I)V",
      line = 15
   )
   public static void method4307(int arg0) {
      try {
         field8496 = null;
         field8484 = null;
         if (arg0 != 336682444) {
            field8484 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8497[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "(II)V",
      line = 28
   )
   public static final void method4308(int arg0, int arg1) {
      try {
         ++field8492;
         if (arg1 != 16711680) {
            field8488 = -42;
         }

         class304 var2 = class594.field8740;
         synchronized(class594.field8740) {
            class594.field8740.method2552(arg0, 21533);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8497[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(II)[[I",
      line = 41
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8487;
         int[][] var4 = super.field918.method3276((byte)108, arg1);
         if (super.field918.field6361) {
            int[][] var5 = this.method539(true, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class678.field10127) {
               do {
                  var9[var12] = this.field8485 - -(var6[var12] * this.field8486 >> 12);
                  var10[var12] = (var7[var12] * this.field8486 >> 12) + this.field8485;
                  var11[var12] = this.field8485 - -(var8[var12] * this.field8486 >> 12);
                  ++var12;
               } while(var12 < class678.field10127);
            }
         }

         return arg0 != 32 ? null : var4;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field8497[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IILica;)V",
      line = 92
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field8494;
         if (arg0 != -1) {
            method4308(92, -89);
         }

         if (arg1 != 0) {
            if (arg1 == 1) {
               this.field8493 = arg2.method2848(-106);
               return;
            }

            if (~arg1 != -3) {
               return;
            }

            if (!client.field1786) {
               super.field933 = ~arg2.method2855(arg0 ^ 31006) == -2;
               return;
            }
         }

         this.field8485 = arg2.method2848(-94);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8497[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8497[6] : field8497[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(BI)[I",
      line = 137
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8482;
         if (arg0 != 87) {
            return null;
         } else {
            int[] var4 = super.field923.method3718(arg0 + -89, arg1);
            if (super.field923.field7284) {
               int[] var5 = this.method545(0, arg1, (byte)-104);
               int var6 = 0;
               if (var3 || var6 < class678.field10127) {
                  do {
                     var4[var6] = this.field8485 - -(var5[var6] * this.field8486 >> 12);
                     ++var6;
                  } while(var6 < class678.field10127);
               }
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8497[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "<init>",
      descriptor = "()V",
      line = 243
   )
   public class573() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IBIIIII)V",
      line = 175
   )
   public static final void method4309(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         ++field8489;
         int var8 = -arg6 + arg0;
         int var9 = arg2 + arg6;
         int var10 = arg2;
         if (var7) {
            class689.method5076(arg5, arg3, (byte)57, class512.field7820[arg2], arg4);
            var10 = arg2 + 1;
         }

         while(true) {
            while(~var9 < ~var10) {
               class689.method5076(arg5, arg3, (byte)57, class512.field7820[var10], arg4);
               ++var10;
            }

            int var11 = -arg6 + arg5;
            int var12 = arg3 + arg6;
            int var13 = arg0;
            if (!var7) {
               if (var7) {
                  class689.method5076(arg5, arg3, (byte)57, class512.field7820[arg0], arg4);
                  var13 = arg0 - 1;
               }

               while(true) {
                  int var10000;
                  int var10001;
                  if (var8 >= var13) {
                     var10000 = arg1;
                     var10001 = -127;
                     if (!var7) {
                        if (arg1 >= -127) {
                           field8488 = -88;
                        }

                        int var14 = var9;
                        if (!var7 && var8 < var9) {
                           return;
                        }

                        do {
                           int[] var15 = class512.field7820[var14];
                           class689.method5076(var12, arg3, (byte)57, var15, arg4);
                           class689.method5076(arg5, var11, (byte)57, var15, arg4);
                           ++var14;
                        } while(var8 >= var14);

                        return;
                     }
                  } else {
                     var10000 = arg5;
                     var10001 = arg3;
                  }

                  class689.method5076(var10000, var10001, (byte)57, class512.field7820[var13], arg4);
                  --var13;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8497[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(BLfq;)V",
      line = 221
   )
   public static final void method4310(byte arg0, class374 arg1) {
      try {
         ++field8495;
         if (arg0 > -4) {
            field8488 = -63;
         }

         if (~class771.field11354 == ~arg1.field5898) {
            class721.field10798[arg1.field5858] = true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8497[8] + arg0 + ',' + (arg1 != null ? field8497[6] : field8497[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "(III)I",
      line = 246
   )
   public static final int method4311(int arg0, int arg1, int arg2) {
      try {
         ++field8491;
         int var3 = arg2 >>> 24;
         if (arg1 != 1313937672) {
            return -66;
         } else {
            int var7 = (16711680 & (65280 & arg2) * var3 | -16711936 & (arg2 & 16711935) * var3) >>> 8;
            int var4 = 255 - var3;
            return (((arg0 & 65280) * var4 & 16711680 | -16711936 & (arg0 & 16711935) * var4) >>> 8) + var7;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8497[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
