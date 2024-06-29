import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class370 {
   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "Ltv;"
   )
   private class590 field5217 = new class590(256);
   @OriginalMember(
      owner = "client!tu",
      name = "d",
      descriptor = "Ld;"
   )
   private class160 field5216;
   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "Lor;"
   )
   private class670 field5210;
   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5221 = new String[]{method2866(method2865("\u001f\"@a]")), method2866(method2865("\u0010y@\n\b")), method2866(method2865("\u0005\"\u0002H")), method2866(method2865("\u001f\"@\u0018\u001c\u0005>\u001a\u001a]")), method2866(method2865("\u001f\"@e]")), method2866(method2865("\u001f\"@g]")), method2866(method2865("\u001f\"@b]")), method2866(method2865("\u001f\"@`]")), method2866(method2865("\u001f\"@f]"))};
   @OriginalMember(
      owner = "client!tu",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5211 = new String[100];
   @OriginalMember(
      owner = "client!tu",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field5209 = new int[13];
   @OriginalMember(
      owner = "client!tu",
      name = "j",
      descriptor = "I"
   )
   public static int field5213;
   @OriginalMember(
      owner = "client!tu",
      name = "k",
      descriptor = "I"
   )
   public static int field5214;
   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "I"
   )
   public static int field5215;
   @OriginalMember(
      owner = "client!tu",
      name = "g",
      descriptor = "I"
   )
   public static int field5218;
   @OriginalMember(
      owner = "client!tu",
      name = "l",
      descriptor = "I"
   )
   public static int field5219;
   @OriginalMember(
      owner = "client!tu",
      name = "f",
      descriptor = "I"
   )
   public static int field5220;
   @OriginalMember(
      owner = "client!tu",
      name = "i",
      descriptor = "[[Z"
   )
   public static boolean[][] field5212;

   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2859(int arg0) {
      try {
         field5209 = null;
         if (arg0 == 2639) {
            field5212 = null;
            field5211 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5221[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2860(int arg0) {
      try {
         this.field5217.method4234(arg0 ^ 7, arg0);
         ++field5218;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5221[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(IBLjava/lang/String;)V"
   )
   public static final void method2861(int arg0, byte arg1, String arg2) {
      try {
         int var3 = -124 / ((27 - arg1) / 55);
         ++field5213;
         class446 var4 = class635.method4607(126, (long)arg0, 2);
         var4.method3311(true);
         var4.field6172 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5221[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5221[1] : field5221[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2862(int arg0) {
      try {
         ++field5214;
         this.field5217.method4245(true);
         if (arg0 != -15959) {
            this.method2862(106);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5221[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2863(int arg0, int arg1, int arg2) {
      try {
         ++field5219;
         if (!class46.method390(arg1, -28538, arg0)) {
            return false;
         } else {
            if (arg2 <= 85) {
               method2861(12, (byte)19, (String)null);
            }

            return ~(arg1 & 36864) != -1 | class498.method3605(77, arg1, arg0) | class442.method3285(arg1, arg0, (byte)65) ? true : (class222.method1690(-110, arg0, arg1) | (8192 & arg1) != 0 | class56.method431(-26347, arg1, arg0)) & ~(arg0 & 55) == -1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5221[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "<init>",
      descriptor = "(Lor;Ld;)V"
   )
   public class370(class670 arg0, class160 arg1) {
      try {
         this.field5216 = arg1;
         this.field5210 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5221[3] + (arg0 != null ? field5221[1] : field5221[2]) + ',' + (arg1 != null ? field5221[1] : field5221[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(II)Lmj;"
   )
   public final class684 method2864(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5215;
         Object var4 = this.field5217.method4239((long)arg1, arg0);
         if (var4 != null) {
            return (class684)var4;
         } else if (!this.field5216.method1289((byte)-89, arg1)) {
            return null;
         } else {
            class359 var5;
            class684 var8;
            label73: {
               var5 = this.field5216.method1293(arg1, -5150);
               int var6 = var5.field5116 ? 64 : this.field5210.field9706;
               if (!var5.field5099 || !this.field5210.method583()) {
                  int[] var7;
                  label74: {
                     if (~var5.field5113 == -3 || !class118.method1003(-32614, var5.field5114)) {
                        var7 = this.field5216.method1291(var6, false, var6, 0.7F, arg1, (byte)63);
                        if (!var3) {
                           break label74;
                        }
                     }

                     var7 = this.field5216.method1292(var6, true, (byte)124, 0.7F, var6, arg1);
                  }

                  var8 = new class684(this.field5210, 3553, 6408, var6, var6, ~var5.field5106 != -1, var7, 0, 0, false);
                  if (!var3) {
                     break label73;
                  }
               }

               float[] var9 = this.field5216.method1290(0.7F, false, 103, var6, arg1, var6);
               var8 = new class684(this.field5210, 3553, 34842, var6, var6, var5.field5106 != 0, var9, 6408);
            }

            var8.method4998(arg0 + 10497, var5.field5108, var5.field5107);
            this.field5217.method4238(arg0 ^ 23, var8, (long)arg1);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5221[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2865(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2866(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
