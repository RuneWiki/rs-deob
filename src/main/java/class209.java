import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class209 {
   @OriginalMember(
      owner = "client!rfa",
      name = "l",
      descriptor = "I"
   )
   public int field3103;
   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3113 = new String[]{method1783(method1782("Q8\u0012(\u0015J0\u001ar\u0017\u000b")), method1783(method1782("Q8\u0012(j\u000b")), method1783(method1782("M+\u001fj")), method1783(method1782("Xp](T")), method1783(method1782("Q8\u0012(h\u000b")), method1783(method1782("Q8\u0012(]L\r\u0007t@M9[")), method1783(method1782("Q8\u0012(k\u000b"))};
   @OriginalMember(
      owner = "client!rfa",
      name = "i",
      descriptor = "Lrfa;"
   )
   public static class209 field3099 = new class209(1);
   @OriginalMember(
      owner = "client!rfa",
      name = "e",
      descriptor = "Lrfa;"
   )
   public static class209 field3102 = new class209(2);
   @OriginalMember(
      owner = "client!rfa",
      name = "h",
      descriptor = "Lrfa;"
   )
   public static class209 field3105 = new class209(4);
   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "Lrfa;"
   )
   public static class209 field3106 = new class209(1);
   @OriginalMember(
      owner = "client!rfa",
      name = "k",
      descriptor = "Lrfa;"
   )
   public static class209 field3107 = new class209(2);
   @OriginalMember(
      owner = "client!rfa",
      name = "f",
      descriptor = "Lrfa;"
   )
   public static class209 field3108 = new class209(4);
   @OriginalMember(
      owner = "client!rfa",
      name = "m",
      descriptor = "Lrfa;"
   )
   public static class209 field3109 = new class209(2);
   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "Lrfa;"
   )
   public static class209 field3110 = new class209(4);
   @OriginalMember(
      owner = "client!rfa",
      name = "c",
      descriptor = "I"
   )
   public static int field3112 = 104;
   @OriginalMember(
      owner = "client!rfa",
      name = "j",
      descriptor = "J"
   )
   public static long field3111 = 0L;
   @OriginalMember(
      owner = "client!rfa",
      name = "n",
      descriptor = "I"
   )
   public static int field3100;
   @OriginalMember(
      owner = "client!rfa",
      name = "d",
      descriptor = "I"
   )
   public static int field3101;
   @OriginalMember(
      owner = "client!rfa",
      name = "g",
      descriptor = "I"
   )
   public static int field3104;

   @OriginalMember(
      owner = "client!rfa",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 14
   )
   public final String toString() {
      try {
         ++field3100;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3113[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(ILoo;)[Lfq;",
      line = 22
   )
   public static final class211[] method1779(int arg0, class651 arg1) {
      boolean var2 = client.field4564;

      try {
         ++field3104;
         if (!arg1.method4791(-22516)) {
            return new class211[0];
         } else {
            class789 var3 = arg1.method4787(-44);
            if (var2) {
               class624.method4569((byte)98, 10L);
            }

            while(true) {
               int var10000;
               if (var3.field11542 != 0) {
                  var10000 = var3.field11542;
                  if (!var2) {
                     if (var10000 == 2) {
                        return new class211[0];
                     }

                     int[] var4 = (int[])var3.field11537;
                     class211[] var5 = new class211[var4.length >> 2];
                     int var6 = 0;
                     if (!var2 && ~var6 <= ~var5.length) {
                        if (arg0 > -75) {
                           method1779(-116, (class651)null);
                        }

                        return var5;
                     }

                     do {
                        class211 var7 = new class211();
                        var5[var6] = var7;
                        var7.field3149 = var4[var6 << 2];
                        var7.field3151 = var4[(var6 << 2) + 1];
                        var7.field3147 = var4[(var6 << 2) - -2];
                        var7.field3148 = var4[(var6 << 2) + 3];
                        ++var6;
                     } while(~var6 > ~var5.length);

                     if (arg0 > -75) {
                        method1779(-116, (class651)null);
                     }

                     return var5;
                  }
               } else {
                  var10000 = 98;
               }

               class624.method4569((byte)var10000, 10L);
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3113[1] + arg0 + ',' + (arg1 != null ? field3113[3] : field3113[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(III)Z",
      line = 64
   )
   public static final boolean method1780(int arg0, int arg1, int arg2) {
      try {
         ++field3101;
         int var3 = -75 % ((13 - arg0) / 62);
         return class340.method2634(arg1, arg2, -34) | (458752 & arg2) != 0 || class624.method4571(arg2, arg1, -30);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3113[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "(I)V",
      line = 73
   )
   private class209(int arg0) {
      try {
         this.field3103 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3113[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(I)V",
      line = 81
   )
   public static void method1781(int arg0) {
      try {
         field3099 = null;
         field3108 = null;
         field3107 = null;
         field3110 = null;
         if (arg0 != -9036) {
            method1781(42);
         }

         field3102 = null;
         field3105 = null;
         field3106 = null;
         field3109 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3113[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1782(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1783(char[] arg0) {
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
            var10005 = 94;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
