import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class265 implements class262 {
   @OriginalMember(
      owner = "client!de",
      name = "c",
      descriptor = "I"
   )
   public int field4050;
   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4053 = new String[]{method2270(method2269(";\u0007)\u00153")), method2270(method2269(";\u000bu1x+\u000eh3r1B")), method2270(method2269("rO9t")), method2270(method2269("1\u0017k8")), method2270(method2269("$L)zf")), method2270(method2269(";\u0007)\u00163")), method2270(method2269(";\u0007)hr1\u000bsj3")), method2270(method2269(";\u0007)\u00103"))};
   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "I"
   )
   public static int field4046 = 0;
   @OriginalMember(
      owner = "client!de",
      name = "f",
      descriptor = "I"
   )
   public static int field4047 = -1;
   @OriginalMember(
      owner = "client!de",
      name = "b",
      descriptor = "I"
   )
   public static int field4048;
   @OriginalMember(
      owner = "client!de",
      name = "d",
      descriptor = "I"
   )
   public static int field4049;
   @OriginalMember(
      owner = "client!de",
      name = "e",
      descriptor = "I"
   )
   public static int field4051;
   @OriginalMember(
      owner = "client!de",
      name = "g",
      descriptor = "I"
   )
   public static int field4052;

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method2266(String arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         int var3 = 12 % ((arg1 - -50) / 60);
         ++field4048;
         String var4 = null;
         int var5 = arg0.indexOf(field4053[2]);
         if (~var5 <= -1) {
            var4 = arg0.substring(0, var5 - -4);
            arg0 = arg0.substring(var5 + 4);
         }

         if (arg0.startsWith(field4053[1])) {
            int var6 = arg0.indexOf(" ", field4053[1].length());
            if (~var6 <= -1) {
               int var7 = arg0.length();
               arg0 = arg0.substring(0, var6) + " ";
               int var8 = var6 + 1;
               if (var2 || ~var7 < ~var8) {
                  do {
                     arg0 = arg0 + "*";
                     ++var8;
                  } while(~var7 < ~var8);
               }
            }
         }

         return var4 != null ? var4 + arg0 : arg0;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4053[5] + (arg0 != null ? field4053[4] : field4053[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(III)Lft;"
   )
   public static final class188 method2267(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      if (var3 == null) {
         return null;
      } else {
         class188 var4 = var3.field4680;
         var3.field4680 = null;
         class631.method4625(var4);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "([J[Ljava/lang/Object;I)V"
   )
   public static final void method2268(long[] arg0, Object[] arg1, int arg2) {
      try {
         class100.method986(arg1, arg0, arg0.length + arg2, -1, 0);
         ++field4051;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4053[7] + (arg0 != null ? field4053[4] : field4053[3]) + ',' + (arg1 != null ? field4053[4] : field4053[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         ++field4052;
         return arg0 > -70 ? null : class196.field2831;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4053[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class265(int arg0) {
      try {
         this.field4050 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4053[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
