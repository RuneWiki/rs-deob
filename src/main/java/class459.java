import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class459 {
   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7009 = method3582(method3581("[oAGy"));
   @OriginalMember(
      owner = "client!qh",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7008 = new String[100];
   @OriginalMember(
      owner = "client!qh",
      name = "d",
      descriptor = "I"
   )
   public static int field7007 = 1401;
   @OriginalMember(
      owner = "client!qh",
      name = "c",
      descriptor = "I"
   )
   public static int field7004;
   @OriginalMember(
      owner = "client!qh",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field7005;
   @OriginalMember(
      owner = "client!qh",
      name = "e",
      descriptor = "[[[Lika;"
   )
   public static class190[][][] field7003;
   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "[[[Lika;"
   )
   public static class190[][][] field7006;

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method3580(int arg0) {
      try {
         field7008 = null;
         field7003 = null;
         field7006 = null;
         int var1 = -123 % ((arg0 - -5) / 55);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7009 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3581(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3582(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
