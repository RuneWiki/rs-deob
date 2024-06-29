import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class775 {
   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11350 = new String[]{method5604(method5603("#\u0001k6R")), method5604(method5603("#\u0001k5R")), method5604(method5603("=\u001a)\u001b")), method5604(method5603("(AkY\u0007")), method5604(method5603(">\b$"))};
   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "I"
   )
   public static int field11344;
   @OriginalMember(
      owner = "client!pn",
      name = "e",
      descriptor = "I"
   )
   public int field11345;
   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "I"
   )
   public int field11346;
   @OriginalMember(
      owner = "client!pn",
      name = "f",
      descriptor = "I"
   )
   public int field11348;
   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "I"
   )
   public static int field11349;
   @OriginalMember(
      owner = "client!pn",
      name = "d",
      descriptor = "Lq;"
   )
   public static class448 field11347;

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5601(int arg0) {
      try {
         if (arg0 == 8410) {
            field11347 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11350[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(Ljava/lang/String;BI)Lkka;"
   )
   public static final class326 method5602(String arg0, byte arg1, int arg2) {
      try {
         ++field11344;
         if (arg1 != 29) {
            return null;
         } else {
            class326 var3;
            try {
               var3 = (class326)Class.forName(field11350[4]).newInstance();
            } catch (Throwable var5) {
               var3 = new class579();
            }

            var3.field4682 = arg0;
            var3.field4676 = arg2;
            return var3;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11350[1] + (arg0 != null ? field11350[3] : field11350[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5603(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5604(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
