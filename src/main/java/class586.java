import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class586 {
   @OriginalMember(
      owner = "client!lja",
      name = "i",
      descriptor = "Lob;"
   )
   private class779 field8215;
   @OriginalMember(
      owner = "client!lja",
      name = "j",
      descriptor = "I"
   )
   private int field8208;
   @OriginalMember(
      owner = "client!lja",
      name = "f",
      descriptor = "I"
   )
   public int field8210;
   @OriginalMember(
      owner = "client!lja",
      name = "o",
      descriptor = "I"
   )
   public int field8211;
   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8228 = new String[]{method4307(method4306("$A<\tw`")), method4307(method4306("&^1K")), method4307(method4306("3\u0005s\tO")), method4307(method4306("$A<\ts`")), method4307(method4306("$A<\tF'x)U[&Lu")), method4307(method4306("$A<\t\u000e!E4S\f`")), method4307(method4306("$A<\tq`")), method4307(method4306("e\u0006c\u0007")), method4307(method4306("$A<\tp`"))};
   @OriginalMember(
      owner = "client!lja",
      name = "s",
      descriptor = "Llja;"
   )
   public static class586 field8209 = new class586(0, 3, class779.field11375);
   @OriginalMember(
      owner = "client!lja",
      name = "g",
      descriptor = "Llja;"
   )
   public static class586 field8216 = new class586(1, 3, class779.field11375);
   @OriginalMember(
      owner = "client!lja",
      name = "n",
      descriptor = "Llja;"
   )
   public static class586 field8218 = new class586(2, 4, class779.field11371);
   @OriginalMember(
      owner = "client!lja",
      name = "q",
      descriptor = "Llja;"
   )
   public static class586 field8219 = new class586(3, 1, class779.field11375);
   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "Llja;"
   )
   public static class586 field8220 = new class586(4, 2, class779.field11375);
   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "Llja;"
   )
   public static class586 field8221 = new class586(5, 3, class779.field11375);
   @OriginalMember(
      owner = "client!lja",
      name = "m",
      descriptor = "Llja;"
   )
   public static class586 field8222 = new class586(6, 4, class779.field11375);
   @OriginalMember(
      owner = "client!lja",
      name = "l",
      descriptor = "I"
   )
   public static int field8223 = class682.method4979(16, true);
   @OriginalMember(
      owner = "client!lja",
      name = "k",
      descriptor = "I"
   )
   public static int field8225 = 1400;
   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field8224 = new class164(64, 8);
   @OriginalMember(
      owner = "client!lja",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field8226 = new int[1000];
   @OriginalMember(
      owner = "client!lja",
      name = "p",
      descriptor = "I"
   )
   public static int field8227 = 0;
   @OriginalMember(
      owner = "client!lja",
      name = "e",
      descriptor = "I"
   )
   public static int field8212;
   @OriginalMember(
      owner = "client!lja",
      name = "d",
      descriptor = "I"
   )
   public static int field8213;
   @OriginalMember(
      owner = "client!lja",
      name = "h",
      descriptor = "I"
   )
   public static int field8214;
   @OriginalMember(
      owner = "client!lja",
      name = "t",
      descriptor = "I"
   )
   public static int field8217;

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(II)Llja;"
   )
   public static final class586 method4301(int arg0, int arg1) {
      try {
         ++field8217;
         if (arg1 != 0) {
            if (~arg1 == -2) {
               return field8216;
            }

            if (~arg1 == -3) {
               return field8218;
            }

            if (~arg1 == -4) {
               return field8219;
            }

            if (~arg1 == -5) {
               return field8220;
            }

            if (~arg1 == -6) {
               return field8221;
            }

            if (~arg1 != -7) {
               if (arg0 <= 28) {
                  method4304(-43);
               }

               return null;
            }

            if (!client.field10022) {
               return field8222;
            }
         }

         return field8209;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8228[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IIILnu;)V"
   )
   public static final void method4302(int arg0, int arg1, int arg2, class349 arg3) {
      class312 var4 = class366.method2886(arg0, arg1, arg2);
      if (var4 != null) {
         var4.field4677 = arg3;
         int var5 = class634.field8989 == class225.field3197 ? 1 : 0;
         if (arg3.method725(-6664)) {
            if (arg3.method723(-68)) {
               arg3.field6823 = class705.field10147[var5];
               class705.field10147[var5] = arg3;
               return;
            }

            arg3.field6823 = class615.field8739[var5];
            class615.field8739[var5] = arg3;
            class248.field3804 = true;
            return;
         }

         arg3.field6823 = class399.field5912[var5];
         class399.field5912[var5] = arg3;
      }

   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(III[BIIIB[B)V"
   )
   public static final void method4303(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte arg7, byte[] arg8) {
      boolean var9 = client.field10022;

      try {
         int var10 = 50 % ((arg7 - 62) / 47);
         ++field8212;
         int var11 = -(arg5 >> 2);
         int var17 = -(arg5 & 3);
         int var12 = -arg2;
         if (var9 || var12 < 0) {
            label84:
            do {
               int var13 = var11;
               int var10001;
               if (var9) {
                  var10001 = arg6++;
                  arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                  int var18 = arg6++;
                  arg8[var18] = (byte)(arg8[var18] + -arg3[arg0++]);
                  int var19 = arg6++;
                  arg8[var19] = (byte)(arg8[var19] + -arg3[arg0++]);
                  int var20 = arg6++;
                  arg8[var20] = (byte)(arg8[var20] + -arg3[arg0++]);
                  var13 = var11 + 1;
               }

               while(true) {
                  while(~var13 > -1) {
                     var10001 = arg6++;
                     arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                     var10001 = arg6++;
                     arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                     var10001 = arg6++;
                     arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                     var10001 = arg6++;
                     arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                     ++var13;
                  }

                  int var14 = var17;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg6++;
                        arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                        var14 = var17 + 1;
                     }

                     while(true) {
                        while(var14 < 0) {
                           var10001 = arg6++;
                           arg8[var10001] = (byte)(arg8[var10001] + -arg3[arg0++]);
                           ++var14;
                        }

                        arg0 += arg4;
                        arg6 += arg1;
                        if (!var9) {
                           ++var12;
                           continue label84;
                        }

                        ++var14;
                     }
                  }

                  ++var13;
               }
            } while(var12 < 0);

         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field8228[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8228[2] : field8228[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field8228[2] : field8228[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4304(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4305(boolean arg0) {
      try {
         field8222 = null;
         field8218 = null;
         field8224 = null;
         field8209 = null;
         if (!arg0) {
            field8221 = null;
         }

         field8221 = null;
         field8226 = null;
         field8216 = null;
         field8220 = null;
         field8219 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8228[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "(IILob;)V"
   )
   private class586(int arg0, int arg1, class779 arg2) {
      try {
         this.field8215 = arg2;
         this.field8208 = arg1;
         this.field8210 = arg0;
         this.field8211 = this.field8215.field11369 * this.field8208;
         if (~this.field8210 <= -17) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8228[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8228[2] : field8228[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8214;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8228[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
