import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class240 extends class302 {
   @OriginalMember(
      owner = "client!jd",
      name = "K",
      descriptor = "I"
   )
   private int field3047 = 4096;
   @OriginalMember(
      owner = "client!jd",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3054 = new String[]{method1792(method1791("U\u0015KeM")), method1792(method1791("U\u0015KaM")), method1792(method1791("D_K\n\u0018")), method1792(method1791("U\u0015KgM")), method1792(method1791("Q\u0004\tH")), method1792(method1791("U\u0015KcM")), method1792(method1791("U\u0015KbM"))};
   @OriginalMember(
      owner = "client!jd",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field3049 = new int[14];
   @OriginalMember(
      owner = "client!jd",
      name = "H",
      descriptor = "I"
   )
   public static int field3048;
   @OriginalMember(
      owner = "client!jd",
      name = "J",
      descriptor = "I"
   )
   public static int field3051;
   @OriginalMember(
      owner = "client!jd",
      name = "I",
      descriptor = "I"
   )
   public static int field3052;
   @OriginalMember(
      owner = "client!jd",
      name = "N",
      descriptor = "I"
   )
   public static int field3053;
   @OriginalMember(
      owner = "client!jd",
      name = "M",
      descriptor = "Lsu;"
   )
   public static class220 field3050;

   @OriginalMember(
      owner = "client!jd",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method1788(int arg0) {
      try {
         field3049 = null;
         if (arg0 != -2461) {
            method1790(-12, -43L);
         }

         field3050 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3054[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field3051;
         if (~arg0 == -1) {
            this.field3047 = arg2.method1038((byte)-105);
         }

         if (arg1 != 0) {
            method1790(-119, -110L);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3054[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3054[2] : field3054[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "<init>",
      descriptor = "()V"
   )
   public class240() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field3052;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(class275.field3837 & arg0 + -1, false, 0);
            int[] var6 = this.method2299(arg0, false, 0);
            int[] var7 = this.method2299(arg0 - -1 & class275.field3837, false, 0);
            int var8 = 0;
            if (var3 != 0 || var8 < class344.field5238) {
               do {
                  int var9 = (var7[var8] - var5[var8]) * this.field3047;
                  int var10 = (var6[var8 + 1 & class264.field3612] + -var6[var8 + -1 & class264.field3612]) * this.field3047;
                  int var11 = var10 >> 12;
                  int var12 = var9 >> 12;
                  int var13 = var11 * var11 >> 12;
                  int var14 = var12 * var12 >> 12;
                  int var15 = (int)(4096.0D * Math.sqrt((double)((float)(var13 + var14 + 4096) / 4096.0F)));
                  int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                  var4[var8] = -var16 + 4096;
                  ++var8;
               } while(var8 < class344.field5238);
            }
         }

         return arg1 >= -37 ? null : var4;
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field3054[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(Ljava/lang/String;BI)V"
   )
   public static final void method1789(String arg0, byte arg1, int arg2) {
      try {
         ++field3053;
         class403 var3 = class453.method3410((long)arg2, true, 3);
         var3.method3093(22144);
         int var4 = -7 % ((-26 - arg1) / 48);
         var3.field6184 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3054[3] + (arg0 != null ? field3054[2] : field3054[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(IJ)Ljava/lang/String;"
   )
   public static final String method1790(int arg0, long arg1) {
      int var3 = client.field4530;

      try {
         ++field3048;
         if (arg1 > 0L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % (long)arg0) == -1L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3 != 0) {
                  var5 = arg1 / 37L;
                  ++var4;
               }

               while(true) {
                  while(var5 != 0L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  StringBuffer var7 = new StringBuffer(var4);
                  if (var3 == 0) {
                     if (var3 == 0 && ~arg1 == -1L) {
                        return var7.reverse().toString();
                     } else {
                        do {
                           long var8 = arg1;
                           arg1 /= 37L;
                           var7.append(class258.field3491[(int)(var8 - arg1 * 37L)]);
                        } while(~arg1 != -1L);

                        return var7.reverse().toString();
                     }
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3054[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1791(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1792(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
