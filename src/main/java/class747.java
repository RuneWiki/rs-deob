import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class747 {
   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10778 = new String[]{method5424(method5423("B\"h7h")), method5424(method5423("]{hX=")), method5424(method5423("Wy*u"))};
   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "I"
   )
   public static int field10776;
   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "I"
   )
   public static int field10777;
   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "J"
   )
   public static long field10775;

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Ljava/lang/String;IB)V",
      line = 9
   )
   public static final void method5422(String arg0, int arg1, byte arg2) {
      try {
         ++field10776;
         if (arg2 != -90) {
            field10775 = 28L;
         }

         ++class454.field6632;
         class542 var3 = class549.method4093((byte)-113, class707.field10266, class126.field2108);
         var3.field7859.method3571(arg2 + 345, 1 - -class70.method747(arg0, -9));
         var3.field7859.method3530(-15815, arg1);
         var3.field7859.method3546((byte)-128, arg0);
         class740.method5332(var3, (byte)77);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10778[1] + (arg0 != null ? field10778[0] : field10778[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5423(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5424(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
