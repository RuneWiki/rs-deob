import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class742 extends class53 {
   @OriginalMember(
      owner = "client!sq",
      name = "D",
      descriptor = "I"
   )
   public int field10566;
   @OriginalMember(
      owner = "client!sq",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10572 = new String[]{method5353(method5352("\u000b.I1t")), method5353(method5352("\u000b.I2t")), method5353(method5352("\u000b.IL5\u00166\u0013Nt")), method5353(method5352("\u0016*\u000b\u001c")), method5353(method5352("\u0003qI^!"))};
   @OriginalMember(
      owner = "client!sq",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field10570 = new int[1000];
   @OriginalMember(
      owner = "client!sq",
      name = "C",
      descriptor = "I"
   )
   public static int field10569 = 1;
   @OriginalMember(
      owner = "client!sq",
      name = "B",
      descriptor = "I"
   )
   public static int field10571;
   @OriginalMember(
      owner = "client!sq",
      name = "E",
      descriptor = "Ldu;"
   )
   public static class92 field10568;
   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "[Lfga;"
   )
   public static class154[] field10567;

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5351(int arg0) {
      try {
         field10568 = null;
         field10567 = null;
         if (arg0 != 1000) {
            method5351(28);
         }

         field10570 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10572[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "<init>",
      descriptor = "(Leu;Lmj;IIIIIIIIIIIIII)V"
   )
   public class742(class634 arg0, class730 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);

      try {
         this.field10566 = arg15;
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field10572[2] + (arg0 != null ? field10572[4] : field10572[3]) + ',' + (arg1 != null ? field10572[4] : field10572[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         if (arg0 >= -70) {
            field10569 = -8;
         }

         ++field10571;
         return class543.field7660;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10572[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
