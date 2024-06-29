import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class208 {
   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2973 = method1651(method1650("\u000b*@M0"));
   @OriginalMember(
      owner = "client!me",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field2971 = new class118(65, -1);
   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "Llea;"
   )
   public static class639 field2972 = new class639(13, 8);

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1649(int arg0) {
      try {
         field2972 = null;
         if (arg0 == 2047) {
            field2971 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2973 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1650(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1651(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
