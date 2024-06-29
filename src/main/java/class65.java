import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class65 {
   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field794 = method491(method490("2\u001a\"*\u0003"));
   @OriginalMember(
      owner = "client!nr",
      name = "e",
      descriptor = "Llea;"
   )
   public static class639 field792 = new class639(5, -1);
   @OriginalMember(
      owner = "client!nr",
      name = "d",
      descriptor = "I"
   )
   public static int field789;
   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "I"
   )
   public static int field791;
   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "Ldda;"
   )
   public static class405 field788;
   @OriginalMember(
      owner = "client!nr",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field790;
   @OriginalMember(
      owner = "client!nr",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field793;

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method489(byte arg0) {
      try {
         field788 = null;
         if (arg0 == -69) {
            field793 = null;
            field792 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field794 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
