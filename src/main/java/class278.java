import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class278 {
   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3712 = new String[]{method2116(method2115("\u0005b85\r")), method2116(method2115("\u0005b86\r"))};
   @OriginalMember(
      owner = "client!rh",
      name = "e",
      descriptor = "I"
   )
   public static int field3707 = 0;
   @OriginalMember(
      owner = "client!rh",
      name = "d",
      descriptor = "Loq;"
   )
   public static class380 field3708 = new class380();
   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "I"
   )
   public static int field3710;
   @OriginalMember(
      owner = "client!rh",
      name = "b",
      descriptor = "I"
   )
   public static int field3711;
   @OriginalMember(
      owner = "client!rh",
      name = "c",
      descriptor = "Laha;"
   )
   public static class404 field3709;

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2113(int arg0, int arg1) {
      try {
         ++field3710;
         class26.field331 = arg1;
         class663.field9447.method4245(true);
         if (arg0 != -9018) {
            method2114((byte)64);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3712[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2114(byte arg0) {
      try {
         if (arg0 <= 28) {
            method2113(0, -46);
         }

         field3708 = null;
         field3709 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3712[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
