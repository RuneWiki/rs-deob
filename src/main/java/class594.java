import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class594 extends class598 {
   @OriginalMember(
      owner = "client!uba",
      name = "B",
      descriptor = "I"
   )
   public int field8741;
   @OriginalMember(
      owner = "client!uba",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8747 = new String[]{method4423(method4422("\u0005f/w5X")), method4423(method4422("\u000b*`w\t")), method4423(method4422("\u001eq\"5")), method4423(method4422("\u0005f/wH\u0019j'-JX")), method4423(method4422("\u0005f/w1X"))};
   @OriginalMember(
      owner = "client!uba",
      name = "E",
      descriptor = "I"
   )
   public static int field8743 = -1;
   @OriginalMember(
      owner = "client!uba",
      name = "A",
      descriptor = "Llj;"
   )
   public static class304 field8740 = new class304(32);
   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "Luk;"
   )
   public static class498 field8745 = new class498(54, 1);
   @OriginalMember(
      owner = "client!uba",
      name = "D",
      descriptor = "I"
   )
   public static int field8742;
   @OriginalMember(
      owner = "client!uba",
      name = "F",
      descriptor = "I"
   )
   public static int field8744;
   @OriginalMember(
      owner = "client!uba",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field8746;

   @OriginalMember(
      owner = "client!uba",
      name = "c",
      descriptor = "(I)V",
      line = 5
   )
   public static void method4421(int arg0) {
      try {
         field8746 = null;
         if (arg0 != 54) {
            field8745 = null;
         }

         field8745 = null;
         field8740 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8747[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(I)Lbda;",
      line = 18
   )
   public final class783 method193(int arg0) {
      try {
         if (arg0 != -1) {
            field8740 = null;
         }

         ++field8744;
         return class133.field1892;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8747[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "<init>",
      descriptor = "(Lrga;Lgea;IIIIIIIIIIIIII)V",
      line = 29
   )
   public class594(class694 arg0, class750 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);

      try {
         this.field8741 = arg15;
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field8747[3] + (arg0 != null ? field8747[1] : field8747[2]) + ',' + (arg1 != null ? field8747[1] : field8747[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4422(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4423(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
