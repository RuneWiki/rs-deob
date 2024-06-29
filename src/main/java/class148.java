import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class148 {
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1939 = method1243(method1242("(\u007f\\,\u0002"));
   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field1935 = new int[13];
   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "I"
   )
   public static int field1936 = 0;
   @OriginalMember(
      owner = "client!fn",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field1937 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!fn",
      name = "d",
      descriptor = "I"
   )
   public static int field1938;

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1241(int arg0) {
      try {
         field1935 = null;
         field1937 = null;
         if (arg0 != 1024) {
            method1241(-89);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1939 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
