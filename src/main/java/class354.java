import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class354 extends class247 {
   @OriginalMember(
      owner = "client!ho",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field5236;
   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5242 = new String[]{method2788(method2787("4|ork")), method2788(method2787("'=o\u001d>")), method2788(method2787("2f-_")), method2788(method2787("4|oqk")), method2788(method2787("4|o\u000f*2z5\rk")), method2788(method2787("4|opk")), method2788(method2787("0{ "))};
   @OriginalMember(
      owner = "client!ho",
      name = "l",
      descriptor = "Lfm;"
   )
   public static class164 field5235 = new class164(72, 3);
   @OriginalMember(
      owner = "client!ho",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field5238 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!ho",
      name = "m",
      descriptor = "[Lkca;"
   )
   public static class12[] field5240 = new class12[75];
   @OriginalMember(
      owner = "client!ho",
      name = "n",
      descriptor = "I"
   )
   public static int field5237;
   @OriginalMember(
      owner = "client!ho",
      name = "k",
      descriptor = "I"
   )
   public static int field5239;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ho",
      name = "p",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5241;

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(ILlw;)V"
   )
   public static final void method2783(int arg0, class408 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field5237;
         if (arg0 != 517737136) {
            field5240 = null;
         }

         int var3 = 0;
         if (var2 || ~class36.field527 < ~var3) {
            do {
               int var4 = class302.field4541[var3];
               class158 var5 = class501.field7137[var4];
               int var6 = arg1.method665(false);
               if (~(var6 & 32) != -1) {
                  var6 += arg1.method665(false) << 8;
               }

               if ((var6 & 32768) != 0) {
                  var6 += arg1.method665(false) << 16;
               }

               class84.method891(false, var4, var6, var5, arg1);
               ++var3;
            } while(~class36.field527 < ~var3);

         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5242[0] + arg0 + ',' + (arg1 != null ? field5242[1] : field5242[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2784(int arg0) {
      try {
         int var1 = 125 % ((43 - arg0) / 58);
         field5238 = null;
         field5240 = null;
         field5235 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5242[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "()V"
   )
   public class354() {
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method2785(String arg0, int arg1) {
      try {
         if (arg1 >= -98) {
            return false;
         } else {
            ++field5239;
            return class423.method3295(arg0, -10268, field5241 != null ? field5241 : (field5241 = method2786(field5242[6])));
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5242[5] + (arg0 != null ? field5242[1] : field5242[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class354(String arg0) {
      try {
         this.field5236 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5242[4] + (arg0 != null ? field5242[1] : field5242[2]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2786(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2787(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2788(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
