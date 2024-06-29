import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class598 extends class603 {
   @OriginalMember(
      owner = "client!hj",
      name = "t",
      descriptor = "I"
   )
   public int field8770;
   @OriginalMember(
      owner = "client!hj",
      name = "x",
      descriptor = "I"
   )
   public int field8767;
   @OriginalMember(
      owner = "client!hj",
      name = "s",
      descriptor = "I"
   )
   public int field8776;
   @OriginalMember(
      owner = "client!hj",
      name = "w",
      descriptor = "I"
   )
   public int field8769;
   @OriginalMember(
      owner = "client!hj",
      name = "o",
      descriptor = "I"
   )
   public int field8774;
   @OriginalMember(
      owner = "client!hj",
      name = "y",
      descriptor = "I"
   )
   public int field8771;
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8778 = new String[]{method4436(method4435("M)&L.")), method4436(method4435("K6db")), method4436(method4435("M)&2oK*|0.")), method4436(method4435("^m& {")), method4436(method4435("M)&O."))};
   @OriginalMember(
      owner = "client!hj",
      name = "v",
      descriptor = "Lsg;"
   )
   public static class742 field8768 = new class742();
   @OriginalMember(
      owner = "client!hj",
      name = "r",
      descriptor = "I"
   )
   public static int field8777 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "p",
      descriptor = "I"
   )
   public static int field8772;
   @OriginalMember(
      owner = "client!hj",
      name = "q",
      descriptor = "I"
   )
   public static int field8773;
   @OriginalMember(
      owner = "client!hj",
      name = "u",
      descriptor = "I"
   )
   public static int field8775;

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4434(byte arg0) {
      try {
         field8768 = null;
         if (arg0 != 123) {
            method4434((byte)-113);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8778[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "<init>",
      descriptor = "(Lrga;Lgea;IIIIIIIIIIIII)V"
   )
   public class598(class694 arg0, class750 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field8770 = arg13;
         this.field8767 = arg12;
         this.field8776 = arg11;
         this.field8769 = arg10;
         this.field8774 = arg14;
         this.field8771 = arg9;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8778[2] + (arg0 != null ? field8778[3] : field8778[1]) + ',' + (arg1 != null ? field8778[3] : field8778[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public class783 method193(int arg0) {
      try {
         ++field8773;
         return arg0 != -1 ? null : class288.field4528;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8778[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4435(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4436(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
