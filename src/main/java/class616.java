import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class616 extends class612 {
   @OriginalMember(
      owner = "client!bb",
      name = "o",
      descriptor = "I"
   )
   public int field8762;
   @OriginalMember(
      owner = "client!bb",
      name = "q",
      descriptor = "I"
   )
   public int field8760;
   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8764 = new String[]{method4533(method4532("\t\u0002\u0004\u0000~")), method4533(method4532("\t\u0002\u0004\u0003~")), method4533(method4532("\t\u0002\u0004}?\u0005\t^\u007f~")), method4533(method4532("\u0010N\u0004o+")), method4533(method4532("\u0005\u0015F-"))};
   @OriginalMember(
      owner = "client!bb",
      name = "n",
      descriptor = "[Lie;"
   )
   public static class639[] field8759 = new class639[0];
   @OriginalMember(
      owner = "client!bb",
      name = "r",
      descriptor = "I"
   )
   public static int field8761;
   @OriginalMember(
      owner = "client!bb",
      name = "p",
      descriptor = "I"
   )
   public static int field8763;

   @OriginalMember(
      owner = "client!bb",
      name = "<init>",
      descriptor = "(Leu;Lmj;IIIIIIIIII)V"
   )
   public class616(class634 arg0, class730 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field8762 = arg10;
         this.field8760 = arg11;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field8764[2] + (arg0 != null ? field8764[3] : field8764[4]) + ',' + (arg1 != null ? field8764[3] : field8764[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         ++field8763;
         if (arg0 > -70) {
            this.field8762 = -45;
         }

         return class197.field2850;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8764[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4531(boolean arg0) {
      try {
         field8759 = null;
         if (arg0) {
            method4531(true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8764[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4532(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4533(char[] arg0) {
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
            var10005 = 96;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
