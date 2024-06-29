import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class184 {
   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2269 = new String[]{method1408(method1407("\u00102m\u0001;P")), method1408(method1407("\u00102m\u00018P"))};
   @OriginalMember(
      owner = "client!hga",
      name = "a",
      descriptor = "Lnw;"
   )
   public static class616 field2266 = new class616(80, 3);
   @OriginalMember(
      owner = "client!hga",
      name = "d",
      descriptor = "I"
   )
   public static int field2268 = 0;
   @OriginalMember(
      owner = "client!hga",
      name = "c",
      descriptor = "I"
   )
   public static int field2267;
   @OriginalMember(
      owner = "client!hga",
      name = "b",
      descriptor = "Lgn;"
   )
   public class732 field2265;

   @OriginalMember(
      owner = "client!hga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1405(int arg0) {
      try {
         int var1 = 47 / ((arg0 - -60) / 52);
         field2266 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2269[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "a",
      descriptor = "(Z)Lwm;"
   )
   public static final class594 method1406(boolean arg0) {
      try {
         ++field2267;
         class594 var1 = class622.method4522(2);
         if (arg0) {
            method1405(94);
         }

         var1.method4307(103, 0L);
         var1.method4332((byte)-124, class616.field8591);
         var1.method4307(-69, class436.field6059);
         var1.method4307(-110, class698.field10183);
         var1.method4316(class141.field1886, 88, class654.field9148);
         return var1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2269[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1408(char[] arg0) {
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
            var10005 = 85;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
