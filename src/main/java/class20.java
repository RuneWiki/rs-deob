import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 {
   @OriginalMember(
      owner = "client!l",
      name = "i",
      descriptor = "Ldn;"
   )
   private class546 field250 = new class546();
   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "Lhha;"
   )
   private class549 field257 = new class549();
   @OriginalMember(
      owner = "client!l",
      name = "g",
      descriptor = "I"
   )
   private int field255;
   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "I"
   )
   private int field256;
   @OriginalMember(
      owner = "client!l",
      name = "f",
      descriptor = "Ldia;"
   )
   private class245 field258;
   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field259 = new String[]{method179(method178(")eL>")), method179(method178(")eN>")), method179(method178(")eH>")), method179(method178(")eJ>")), method179(method178(")eO>")), method179(method178("+>gz")), method179(method178(")eI>")), method179(method178(">e%8s")), method179(method178(")e7\u007f`,?5>")), method179(method178(")eM>"))};
   @OriginalMember(
      owner = "client!l",
      name = "c",
      descriptor = "I"
   )
   public static int field247;
   @OriginalMember(
      owner = "client!l",
      name = "e",
      descriptor = "I"
   )
   public static int field248;
   @OriginalMember(
      owner = "client!l",
      name = "k",
      descriptor = "I"
   )
   public static int field251;
   @OriginalMember(
      owner = "client!l",
      name = "l",
      descriptor = "I"
   )
   public static int field252;
   @OriginalMember(
      owner = "client!l",
      name = "h",
      descriptor = "I"
   )
   public static int field253;
   @OriginalMember(
      owner = "client!l",
      name = "j",
      descriptor = "I"
   )
   public static int field254;
   @OriginalMember(
      owner = "client!l",
      name = "d",
      descriptor = "Lqh;"
   )
   public static class74 field249;

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method171(long arg0, int arg1) {
      try {
         ++field253;
         class546 var4 = (class546)this.field258.method1839(16, arg0);
         if (var4 != null) {
            var4.method3609(86);
            var4.method3943(-4);
            ++this.field256;
         }

         int var5 = -89 / ((arg1 - -11) / 56);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field259[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method172(int arg0) {
      try {
         this.field257.method3970(-79);
         ++field254;
         this.field258.method1851(-122);
         this.field250 = new class546();
         this.field256 = this.field255;
         int var2 = -108 / ((arg0 - -21) / 48);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field259[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "([[BLrq;B)V"
   )
   public static final void method173(byte[][] arg0, class372 arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         ++field248;
         int var4 = class325.field4367.length;
         int var5 = 0;
         if (!var3 && ~var5 <= ~var4) {
            if (arg2 > -93) {
               field249 = null;
            }
         } else {
            do {
               byte[] var6 = arg0[var5];
               if (var6 != null) {
                  int var7 = (class794.field11597[var5] >> 8) * 64 + -class752.field10921;
                  int var8 = (255 & class794.field11597[var5]) * 64 + -class17.field237;
                  class736.method5336((byte)96);
                  arg1.method2881(var7, var6, class338.field4832, class331.field4738, var8, (byte)118);
               }

               ++var5;
            } while(~var5 > ~var4);

            if (arg2 > -93) {
               field249 = null;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field259[9] + (arg0 != null ? field259[7] : field259[5]) + ',' + (arg1 != null ? field259[7] : field259[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method174(int arg0) {
      try {
         if (arg0 != 64) {
            field249 = null;
         }

         field249 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field259[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(IJLdn;)V"
   )
   public final void method175(int arg0, long arg1, class546 arg2) {
      try {
         label25: {
            ++field247;
            if (this.field256 != arg0) {
               --this.field256;
               if (!client.field4273) {
                  break label25;
               }
            }

            class546 var5 = this.field257.method3966(false);
            var5.method3609(98);
            var5.method3943(-4);
            if (this.field250 == var5) {
               class546 var6 = this.field257.method3966(false);
               var6.method3609(80);
               var6.method3943(-4);
            }
         }

         this.field258.method1841(arg1, true, arg2);
         this.field257.method3968(arg2, (byte)107);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field259[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field259[7] : field259[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(ZJ)Ldn;"
   )
   public final class546 method176(boolean arg0, long arg1) {
      try {
         if (arg0) {
            method173((byte[][])null, (class372)null, (byte)-50);
         }

         ++field251;
         class546 var4 = (class546)this.field258.method1839(-122, arg1);
         if (var4 != null) {
            this.field257.method3968(var4, (byte)-52);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field259[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(IZIIIIFI)[I"
   )
   public static final int[] method177(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
      try {
         ++field252;
         int[] var8 = new int[arg5];
         class276 var9 = new class276();
         var9.field3688 = arg4;
         var9.field3681 = arg2;
         var9.field3684 = arg1;
         var9.field3676 = arg7;
         var9.field3679 = arg3;
         var9.field3690 = (int)(arg6 * 4096.0F);
         var9.method1457(28274);
         class368.method2841(arg5, 1159665196, 1);
         var9.method2101(var8, arg0, (byte)43);
         return var8;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field259[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class20(int arg0) {
      try {
         this.field255 = arg0;
         this.field256 = arg0;

         int var2;
         for(var2 = 1; ~(var2 + var2) > ~arg0; var2 += var2) {
         }

         this.field258 = new class245(var2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field259[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method178(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method179(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
