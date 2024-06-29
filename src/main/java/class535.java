import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class535 extends class294 {
   @OriginalMember(
      owner = "client!aba",
      name = "q",
      descriptor = "Lsn;"
   )
   public class675 field8105 = new class675();
   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8112 = new String[]{method4114(method4113("SuL(\u007f")), method4114(method4113("F.\u000ej")), method4114(method4113("I9\u0003(C\u0000")), method4114(method4113("I9\u0003(@\u0000"))};
   @OriginalMember(
      owner = "client!aba",
      name = "p",
      descriptor = "Luk;"
   )
   public static class498 field8106 = new class498(34, -2);
   @OriginalMember(
      owner = "client!aba",
      name = "o",
      descriptor = "Lhr;"
   )
   public static class666 field8110 = new class666();
   @OriginalMember(
      owner = "client!aba",
      name = "s",
      descriptor = "Ljl;"
   )
   public static class133 field8111 = new class133();
   @OriginalMember(
      owner = "client!aba",
      name = "m",
      descriptor = "I"
   )
   public static int field8108;
   @OriginalMember(
      owner = "client!aba",
      name = "n",
      descriptor = "Lrga;"
   )
   public static class694 field8109;
   @OriginalMember(
      owner = "client!aba",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field8107;

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method4111(int arg0) {
      try {
         field8111 = null;
         field8109 = null;
         field8106 = null;
         field8110 = null;
         int var1 = -68 / (-arg0 / 44);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8112[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(ILica;)Ldi;",
      line = 28
   )
   public static final class714 method4112(int arg0, class354 arg1) {
      try {
         ++field8108;
         class603 var2 = class429.method3392(80, arg1);
         int var3 = arg1.method2894(121);
         int var4 = arg1.method2894(122);
         if (arg0 >= -50) {
            return null;
         } else {
            int var5 = arg1.method2848(-125);
            return new class714(var2.field8810, var2.field8815, var2.field8819, var2.field8823, var2.field8820, var2.field8811, var2.field8818, var2.field8822, var2.field8814, var3, var4, var5);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8112[2] + arg0 + ',' + (arg1 != null ? field8112[0] : field8112[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4113(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4114(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
