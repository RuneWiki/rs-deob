import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class518 {
   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7556 = method3823(method3822("8\u0006\u0013\u0014]"));
   @OriginalMember(
      owner = "client!ew",
      name = "e",
      descriptor = "I"
   )
   public static int field7553 = 500;
   @OriginalMember(
      owner = "client!ew",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field7551 = new class101(86, 6);
   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "I"
   )
   public static int field7552;
   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "I"
   )
   public static int field7554;
   @OriginalMember(
      owner = "client!ew",
      name = "c",
      descriptor = "I"
   )
   public static int field7555;

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static void method3821(byte arg0) {
      try {
         field7551 = null;
         if (arg0 != 4) {
            method3821((byte)-7);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7556 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3822(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3823(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
