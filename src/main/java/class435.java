import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class435 extends class606 {
   @OriginalMember(
      owner = "client!cea",
      name = "H",
      descriptor = "I"
   )
   private int field6368 = 4;
   @OriginalMember(
      owner = "client!cea",
      name = "I",
      descriptor = "I"
   )
   private int field6373 = 4;
   @OriginalMember(
      owner = "client!cea",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6377 = new String[]{method3392(method3391("\u001b\u0018!3ZP")), method3392(method3391("\u0003Sn3b")), method3392(method3391("\u0016\b,q")), method3392(method3391("\u001b\u0018!3^P")), method3392(method3391("\u001b\u0018!3WP")), method3392(method3391("\u001b\u0018!3\\P")), method3392(method3391("\u001b\u0018!3]P"))};
   @OriginalMember(
      owner = "client!cea",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field6372 = new int[3];
   @OriginalMember(
      owner = "client!cea",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field6375 = false;
   @OriginalMember(
      owner = "client!cea",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field6376 = new int[4];
   @OriginalMember(
      owner = "client!cea",
      name = "J",
      descriptor = "I"
   )
   public static int field6367;
   @OriginalMember(
      owner = "client!cea",
      name = "L",
      descriptor = "I"
   )
   public static int field6369;
   @OriginalMember(
      owner = "client!cea",
      name = "K",
      descriptor = "I"
   )
   public static int field6371;
   @OriginalMember(
      owner = "client!cea",
      name = "F",
      descriptor = "I"
   )
   public static int field6374;
   @OriginalMember(
      owner = "client!cea",
      name = "G",
      descriptor = "Lsa;"
   )
   public static class39 field6370;

   @OriginalMember(
      owner = "client!cea",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 373) {
            field6375 = false;
         }

         ++field6369;
         int[][] var4 = super.field8649.method5536(arg0 ^ 23627, arg1);
         if (super.field8649.field11043) {
            int var5;
            int[][] var7;
            label40: {
               var5 = class563.field8014 / this.field6373;
               int var6 = class451.field6570 / this.field6368;
               if (var6 <= 0) {
                  var7 = this.method4467(0, 0, (byte)88);
                  if (!var3) {
                     break label40;
                  }
               }

               int var8 = arg1 % var6;
               var7 = this.method4467(0, class451.field6570 * var8 / var6, (byte)38);
            }

            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            int var15 = 0;
            if (var3 || ~class563.field8014 < ~var15) {
               do {
                  int var17;
                  if (~var5 < -1) {
                     int var16 = var15 % var5;
                     var17 = class563.field8014 * var16 / var5;
                     if (var3) {
                        var17 = 0;
                     }
                  } else {
                     var17 = 0;
                  }

                  var12[var15] = var9[var17];
                  var13[var15] = var10[var17];
                  var14[var15] = var11[var17];
                  ++var15;
               } while(~class563.field8014 < ~var15);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field6377[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "<init>",
      descriptor = "()V"
   )
   public class435() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cea",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method3389(byte arg0) {
      try {
         if (arg0 <= 75) {
            method3389((byte)-71);
         }

         field6372 = null;
         field6370 = null;
         field6376 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6377[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field6374;
         if (arg2 < -6) {
            if (arg1 != 0) {
               if (arg1 != 1) {
                  return;
               }

               if (!client.field10022) {
                  this.field6368 = arg0.method665(false);
                  return;
               }
            }

            this.field6373 = arg0.method665(false);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6377[3] + (arg0 != null ? field6377[1] : field6377[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(ZII)Ljava/lang/String;"
   )
   public static final String method3390(boolean arg0, int arg1, int arg2) {
      try {
         ++field6367;
         if (arg1 <= 25) {
            field6376 = null;
         }

         return arg0 && ~arg2 <= -1 ? class381.method2976(10, arg0, (byte)99, arg2) : Integer.toString(arg2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6377[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6371;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            method3390(false, 40, -91);
         }

         if (super.field8645.field4884) {
            int var5;
            int[] var7;
            label42: {
               var5 = class563.field8014 / this.field6373;
               int var6 = class451.field6570 / this.field6368;
               if (~var6 >= -1) {
                  var7 = this.method4463(0, arg0 + 13064, 0);
                  if (!var3) {
                     break label42;
                  }
               }

               int var8 = arg1 % var6;
               var7 = this.method4463(class451.field6570 * var8 / var6, 13064, 0);
            }

            int var9 = 0;
            if (var3 || var9 < class563.field8014) {
               do {
                  if (~var5 < -1) {
                     int var10 = var9 % var5;
                     var4[var9] = var7[class563.field8014 * var10 / var5];
                     if (!var3) {
                        ++var9;
                        continue;
                     }
                  }

                  var4[var9] = var7[0];
                  ++var9;
               } while(var9 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field6377[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
