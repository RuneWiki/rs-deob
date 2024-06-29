import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class386 implements class87 {
   @OriginalMember(
      owner = "client!hd",
      name = "d",
      descriptor = "Lbga;"
   )
   private class398 field5630 = new class398(128);
   @OriginalMember(
      owner = "client!hd",
      name = "e",
      descriptor = "[I"
   )
   public int[] field5631;
   @OriginalMember(
      owner = "client!hd",
      name = "m",
      descriptor = "[I"
   )
   private int[] field5625;
   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5637 = new String[]{method3018(method3017("^b#HZ")), method3018(method3017("^b#EZ")), method3018(method3017("^b#@Z")), method3018(method3017("^b#BZ")), method3018(method3017("^b#GZ")), method3018(method3017("^b#IZ")), method3018(method3017("^b#=\u001bXoy?Z")), method3018(method3017("^b#DZ")), method3018(method3017("^b#CZ")), method3018(method3017("^b#FZ"))};
   @OriginalMember(
      owner = "client!hd",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field5627 = new int[4096];
   @OriginalMember(
      owner = "client!hd",
      name = "j",
      descriptor = "I"
   )
   public static int field5623;
   @OriginalMember(
      owner = "client!hd",
      name = "g",
      descriptor = "I"
   )
   public static int field5624;
   @OriginalMember(
      owner = "client!hd",
      name = "h",
      descriptor = "I"
   )
   public static int field5626;
   @OriginalMember(
      owner = "client!hd",
      name = "l",
      descriptor = "I"
   )
   public static int field5628;
   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "I"
   )
   public static int field5629;
   @OriginalMember(
      owner = "client!hd",
      name = "c",
      descriptor = "I"
   )
   public static int field5632;
   @OriginalMember(
      owner = "client!hd",
      name = "n",
      descriptor = "I"
   )
   public static int field5633;
   @OriginalMember(
      owner = "client!hd",
      name = "k",
      descriptor = "I"
   )
   public static int field5634;
   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "I"
   )
   public static int field5635;
   @OriginalMember(
      owner = "client!hd",
      name = "i",
      descriptor = "I"
   )
   public static int field5636;

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method3010(int arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         class116 var6;
         label51: {
            ++field5628;
            long var4 = class604.method4452(-112);
            var6 = arg1 ? (class116)this.field5630.method3102(112) : (class116)this.field5630.method3095((byte)-118);
            if (var3) {
               if (~(4611686018427387903L & var6.field1839) > ~var4) {
                  if ((var6.field1839 & 4611686018427387904L) != 0L) {
                     break label51;
                  }

                  var6.method2140((byte)97);
                  if (var3) {
                     break label51;
                  }
               }

               var6 = (class116)this.field5630.method3095((byte)-118);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  int var8 = -91 / ((arg0 - 21) / 51);
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  long var11;
                  var10000 = (var11 = ~(4611686018427387903L & var6.field1839) - ~var4) == 0L ? 0 : (var11 < 0L ? -1 : 1);
               }

               if (var10000 > 0) {
                  if ((var6.field1839 & 4611686018427387904L) != 0L) {
                     break;
                  }

                  var6.method2140((byte)97);
                  if (var3) {
                     break;
                  }
               }

               var6 = (class116)this.field5630.method3095((byte)-118);
            }
         }

         int var7 = (int)var6.field3777;
         this.field5631[var7] = this.field5625[var7];
         var6.method2140((byte)-111);
         return var7;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5637[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method3011(int arg0, int arg1, int arg2) {
      try {
         ++field5634;
         class507 var4 = class225.field3194.method2718(arg2 ^ 4404, arg1);
         int var5 = var4.field7204;
         int var6 = var4.field7200;
         if (arg2 != -4405) {
            field5636 = -113;
         }

         int var7 = var4.field7205;
         int var8 = class557.field7907[-var6 + var7];
         if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
         }

         int var9 = var8 << var6;
         this.method3015(arg2 + 4533, var5, this.field5625[var5] & ~var9 | arg0 << var6 & var9);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5637[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "c",
      descriptor = "(III)V"
   )
   public final void method3012(int arg0, int arg1, int arg2) {
      try {
         ++field5635;
         class507 var4 = class225.field3194.method2718(-1, arg0);
         int var5 = var4.field7204;
         int var6 = var4.field7200;
         int var7 = var4.field7205;
         int var8 = class557.field7907[var7 - var6];
         if (arg2 > arg1 || ~arg1 < ~var8) {
            arg1 = 0;
         }

         int var9 = var8 << var6;
         this.method3016(~var9 & this.field5631[var5] | arg1 << var6 & var9, var5, (byte)37);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5637[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method906(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            return 100;
         } else {
            ++field5626;
            return this.field5631[arg1];
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5637[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3013(int arg0) {
      try {
         field5627 = null;
         if (arg0 != 25769) {
            field5627 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5637[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3014(int arg0) {
      boolean var2 = client.field10022;

      try {
         int var3 = arg0;
         if (!var2 && class690.field9935.field7452 <= arg0) {
            ++field5624;
            this.field5630 = new class398(128);
         } else {
            do {
               class503 var4 = class690.field9935.method3948(arg0 ^ 41, var3);
               if (var4 != null && var4.field7172 == 0) {
                  this.field5625[var3] = 0;
                  this.field5631[var3] = 0;
               }

               ++var3;
            } while(class690.field9935.field7452 > var3);

            ++field5624;
            this.field5630 = new class398(128);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5637[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "<init>",
      descriptor = "()V"
   )
   public class386() {
      try {
         this.field5631 = new int[class690.field9935.field7452];
         this.field5625 = new int[class690.field9935.field7452];
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5637[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method907(int arg0, int arg1) {
      try {
         ++field5623;
         if (arg1 > -118) {
            method3013(-84);
         }

         class507 var3 = class225.field3194.method2718(-1, arg0);
         int var4 = var3.field7204;
         int var5 = var3.field7200;
         int var6 = var3.field7205;
         int var7 = class557.field7907[var6 - var5];
         return var7 & this.field5631[var4] >> var5;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5637[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3015(int arg0, int arg1, int arg2) {
      try {
         this.field5625[arg1] = arg2;
         if (arg0 != 128) {
            field5636 = -110;
         }

         ++field5629;
         class116 var4 = (class116)this.field5630.method3101(-1, (long)arg1);
         if (var4 != null) {
            if (var4.field1839 != 4611686018427387905L) {
               var4.field1839 = 500L + class604.method4452(arg0 + -243) | 4611686018427387904L;
               return;
            }
         } else {
            class116 var5 = new class116(4611686018427387905L);
            this.field5630.method3098((long)arg1, var5, arg0 + -129);
         }

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5637[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method3016(int arg0, int arg1, byte arg2) {
      try {
         this.field5631[arg1] = arg0;
         ++field5632;
         if (arg2 != 37) {
            this.method907(84, -11);
         }

         class116 var4 = (class116)this.field5630.method3101(-1, (long)arg1);
         if (var4 != null) {
            var4.field1839 = 500L + class604.method4452(72);
         } else {
            class116 var5 = new class116(500L + class604.method4452(-123));
            this.field5630.method3098((long)arg1, var5, -1);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5637[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3017(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3018(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
