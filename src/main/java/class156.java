import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class156 {
   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2010 = method1276(method1275("&\u000b8K0"));
   @OriginalMember(
      owner = "client!pj",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field2007 = new class378(102, 12);
   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field2008;
   @OriginalMember(
      owner = "client!pj",
      name = "b",
      descriptor = "Lqh;"
   )
   public static class74 field2009;

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1274(boolean arg0) {
      try {
         field2008 = null;
         field2007 = null;
         if (!arg0) {
            method1274(true);
         }

         field2009 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2010 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1275(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1276(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
