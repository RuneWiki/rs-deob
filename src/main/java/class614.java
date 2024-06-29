import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class614 implements class272 {
   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "Ljg;"
   )
   private class787 field8919;
   @OriginalMember(
      owner = "client!wr",
      name = "k",
      descriptor = "Lrr;"
   )
   private class678 field8924;
   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8927 = new String[]{method4525(method4524("HSM]\u0005")), method4525(method4524("HSMX\u0005")), method4525(method4524("QT\u000fu")), method4525(method4524("HSM%DQH\u0017'\u0005")), method4525(method4524("D\u000fM7P")), method4525(method4524("HSM\\\u0005")), method4525(method4524("HSM_\u0005")), method4525(method4524("HSM^\u0005")), method4525(method4524("HSMZ\u0005"))};
   @OriginalMember(
      owner = "client!wr",
      name = "d",
      descriptor = "J"
   )
   public static long field8921 = 0L;
   @OriginalMember(
      owner = "client!wr",
      name = "f",
      descriptor = "I"
   )
   public static int field8917;
   @OriginalMember(
      owner = "client!wr",
      name = "g",
      descriptor = "I"
   )
   public static int field8920;
   @OriginalMember(
      owner = "client!wr",
      name = "e",
      descriptor = "I"
   )
   public static int field8922;
   @OriginalMember(
      owner = "client!wr",
      name = "i",
      descriptor = "I"
   )
   public static int field8925;
   @OriginalMember(
      owner = "client!wr",
      name = "h",
      descriptor = "I"
   )
   public static int field8926;
   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "Lbja;"
   )
   public static class275 field8916;
   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "Ljq;"
   )
   private class672 field8923;
   @OriginalMember(
      owner = "client!wr",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field8918;

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Lica;I)Lww;",
      line = 7
   )
   public static final class342 method4520(class354 arg0, int arg1) {
      try {
         ++field8917;
         if (arg1 != 2) {
            method4521(107, -115, -66);
         }

         class407 var2 = class419.method3340(12, arg0);
         int var3 = arg0.method2845(125);
         return new class342(var2.field6344, var2.field6345, var2.field6334, var2.field6342, var2.field6337, var3);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8927[6] + (arg0 != null ? field8927[4] : field8927[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "(B)V",
      line = 22
   )
   public final void method282(byte arg0) {
      try {
         ++field8926;
         this.field8923 = class85.method828(109, this.field8924, this.field8919.field11539);
         if (arg0 <= 98) {
            method4523(10);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8927[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(III)Z",
      line = 40
   )
   public static final boolean method4521(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            method4523(24);
         }

         ++field8925;
         return ~(arg0 & 32) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8927[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(ZZ)V",
      line = 53
   )
   public final void method284(boolean arg0, boolean arg1) {
      try {
         if (arg1) {
            int var3 = class154.field2293 < class316.field4878 ? class316.field4878 : class154.field2293;
            int var4 = class692.field10301 <= class445.field6835 ? class445.field6835 : class692.field10301;
            int var5 = this.field8923.method2106();
            int var6 = this.field8923.method2108();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (~var9 < ~var4) {
               var8 = var4 * var5 / var6;
               var9 = var4;
               var10 = 0;
               var7 = (-var8 + var3) / 2;
            }

            this.field8923.method4954(var7, var10, var8, var9);
         }

         if (arg0) {
            field8918 = null;
         }

         ++field8922;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field8927[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(B)Z",
      line = 94
   )
   public final boolean method285(byte arg0) {
      try {
         ++field8920;
         if (arg0 != 8) {
            field8918 = null;
         }

         return this.field8924.method5002(this.field8919.field11539, (byte)86);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8927[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V",
      line = 106
   )
   public static final void method4522(int arg0, int arg1, int arg2, Class arg3) {
      class190 var4 = class711.field10694[arg0][arg1][arg2];
      if (var4 != null) {
         for(class605 var5 = var4.field2962; var5 != null; var5 = var5.field8840) {
            class78 var6 = var5.field8839;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1040 == arg1 && var6.field1044 == arg2) {
               class118.method1084(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(I)V",
      line = 132
   )
   public static void method4523(int arg0) {
      try {
         field8918 = null;
         field8916 = null;
         int var1 = 18 / ((32 - arg0) / 36);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8927[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "<init>",
      descriptor = "(Lrr;Ljg;)V",
      line = 141
   )
   public class614(class678 arg0, class787 arg1) {
      try {
         this.field8919 = arg1;
         this.field8924 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8927[3] + (arg0 != null ? field8927[4] : field8927[2]) + ',' + (arg1 != null ? field8927[4] : field8927[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4524(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4525(char[] arg0) {
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
            var10005 = 33;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
