import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class758 {
   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11224 = method5505(method5504("^8y\u001d\u000f"));
   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field11223 = new class118(28, -1);
   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "I"
   )
   public static int field11222;

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5503(byte arg0) {
      try {
         if (arg0 > -54) {
            method5503((byte)27);
         }

         field11223 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11224 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
