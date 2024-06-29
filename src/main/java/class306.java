import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class306 {
   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4366 = new String[]{method2321(method2320("=/#icr")), method2321(method2320("=/#iar")), method2321(method2320("3!#")), method2321(method2320("=/#ibr"))};
   @OriginalMember(
      owner = "client!gga",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4363 = new int[1];
   @OriginalMember(
      owner = "client!gga",
      name = "d",
      descriptor = "I"
   )
   public static int field4361;
   @OriginalMember(
      owner = "client!gga",
      name = "c",
      descriptor = "I"
   )
   public static int field4364;
   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "I"
   )
   public static int field4365;
   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "Leaa;"
   )
   public static class526 field4362;

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static final void method2317(byte arg0) {
      try {
         ++field4365;
         if (arg0 >= -85) {
            method2318((byte)-85);
         }

         class224.field2867 = new class550();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4366[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "(B)V",
      line = 19
   )
   public static void method2318(byte arg0) {
      try {
         int var1 = 72 % ((8 - arg0) / 40);
         field4363 = null;
         field4362 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4366[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "c",
      descriptor = "(B)Lsh;",
      line = 34
   )
   public static final class76 method2319(byte arg0) {
      try {
         ++field4364;

         try {
            return (class76)Class.forName(field4366[2]).newInstance();
         } catch (Throwable var2) {
            if (arg0 != -57) {
               field4361 = 81;
            }

            return new class77();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4366[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2320(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2321(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
