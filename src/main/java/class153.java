import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class153 {
   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2343 = method1479(method1478("Sc\u0004{z\u001d"));
   @OriginalMember(
      owner = "client!faa",
      name = "b",
      descriptor = "Lvf;"
   )
   public static class73 field2341 = new class73();
   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "I"
   )
   public static int field2342;
   @OriginalMember(
      owner = "client!faa",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2340;

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1477(byte arg0) {
      try {
         if (arg0 != 70) {
            method1477((byte)-92);
         }

         field2341 = null;
         field2340 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2343 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1478(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1479(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
