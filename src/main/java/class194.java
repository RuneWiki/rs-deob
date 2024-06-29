import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class194 {
   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2815 = new String[]{method1711(method1710("C\u001fP\u0017 ")), method1711(method1710("C\u001fP\u0014 "))};
   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field2814 = new class724(9, -2);
   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "I"
   )
   public static int field2812;
   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "I"
   )
   public static int field2813;

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method1708(boolean arg0, int arg1) {
      try {
         ++field2813;
         class476.field6870.method4707(0, false, class476.field6870.field9127);
         class476.field6870.method4707(0, false, class476.field6870.field9133);
         class476.field6870.method4707(1, false, class476.field6870.field9110);
         class476.field6870.method4707(1, false, class476.field6870.field9145);
         class476.field6870.method4707(arg1, false, class476.field6870.field9151);
         class476.field6870.method4707(0, false, class476.field6870.field9117);
         class476.field6870.method4707(0, false, class476.field6870.field9119);
         class476.field6870.method4707(0, false, class476.field6870.field9104);
         class476.field6870.method4707(0, false, class476.field6870.field9126);
         class476.field6870.method4707(0, false, class476.field6870.field9148);
         class476.field6870.method4707(0, false, class476.field6870.field9118);
         class476.field6870.method4707(0, false, class476.field6870.field9138);
         class476.field6870.method4707(0, false, class476.field6870.field9128);
         class476.field6870.method4707(0, false, class476.field6870.field9149);
         class476.field6870.method4707(0, false, class476.field6870.field9147);
         class476.field6870.method4707(0, false, class476.field6870.field9146);
         class476.field6870.method4707(0, false, class476.field6870.field9140);
         class476.field6870.method4707(0, false, class476.field6870.field9150);
         class476.field6870.method4707(0, false, class476.field6870.field9142);
         class476.field6870.method4707(0, false, class476.field6870.field9141);
         class267.method2281(2);
         class476.field6870.method4707(2, false, class476.field6870.field9108);
         class476.field6870.method4707(1, false, class476.field6870.field9105);
         class345.method2741(0);
         class215.method1854((byte)-124);
         class350.field5131 = true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2815[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1709(boolean arg0) {
      try {
         if (!arg0) {
            field2814 = null;
         }

         field2814 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2815[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1710(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1711(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
