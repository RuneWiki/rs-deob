import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class322 implements class534 {
   @OriginalMember(
      owner = "client!gf",
      name = "i",
      descriptor = "Lsa;"
   )
   private class39 field4801;
   @OriginalMember(
      owner = "client!gf",
      name = "c",
      descriptor = "Lde;"
   )
   private class265 field4804;
   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4807 = new String[]{method2600(method2599("5&w*\u000e")), method2600(method2599("5&w/\u000e")), method2600(method2599("5&w!\u000e")), method2600(method2599("5&wTO<)-V\u000e")), method2600(method2599("<55\u0004")), method2600(method2599(")nwF[")), method2600(method2599("5&w \u000e")), method2600(method2599("5&w)\u000e"))};
   @OriginalMember(
      owner = "client!gf",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field4798 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4806 = new int[3];
   @OriginalMember(
      owner = "client!gf",
      name = "g",
      descriptor = "I"
   )
   public static int field4799;
   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "I"
   )
   public static int field4800;
   @OriginalMember(
      owner = "client!gf",
      name = "d",
      descriptor = "I"
   )
   public static int field4802;
   @OriginalMember(
      owner = "client!gf",
      name = "e",
      descriptor = "I"
   )
   public static int field4805;
   @OriginalMember(
      owner = "client!gf",
      name = "f",
      descriptor = "Lma;"
   )
   private class148 field4803;

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method988(byte arg0) {
      try {
         this.field4803 = class403.method3147(this.field4801, false, this.field4804.field4050);
         if (arg0 > 88) {
            ++field4799;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4807[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2597(byte arg0) {
      try {
         if (arg0 > -78) {
            method2598(-105);
         }

         class107 var1 = class455.field6619;
         synchronized(class455.field6619) {
            class455.field6619.method1052(true);
         }

         ++field4800;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4807[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method984(int arg0) {
      try {
         if (arg0 < 67) {
            this.field4803 = null;
         }

         ++field4805;
         return this.field4801.method450(0, this.field4804.field4050);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4807[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method983(boolean arg0, int arg1) {
      try {
         ++field4802;
         if (arg0) {
            int var3 = ~class111.field1737 <= ~class557.field7909 ? class111.field1737 : class557.field7909;
            int var4 = class140.field2243 <= class595.field8386 ? class595.field8386 : class140.field2243;
            int var5 = this.field4803.method1351();
            int var6 = this.field4803.method1356();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (-var9 + var4) / 2;
            if (~var4 > ~var9) {
               var9 = var4;
               var8 = var4 * var5 / var6;
               var10 = 0;
               var7 = (-var8 + var3) / 2;
            }

            this.field4803.method1449(var7, var10, var8, var9);
         }

         if (arg1 >= -55) {
            this.field4803 = null;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field4807[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "<init>",
      descriptor = "(Lsa;Lde;)V"
   )
   public class322(class39 arg0, class265 arg1) {
      try {
         this.field4801 = arg0;
         this.field4804 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4807[3] + (arg0 != null ? field4807[5] : field4807[4]) + ',' + (arg1 != null ? field4807[5] : field4807[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2598(int arg0) {
      try {
         if (arg0 != 16776960) {
            method2597((byte)-49);
         }

         field4798 = null;
         field4806 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4807[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2599(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2600(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
