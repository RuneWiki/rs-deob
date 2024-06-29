import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class98 {
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1309 = method898(method897("lac\u0012A"));
   @OriginalMember(
      owner = "client!sl",
      name = "h",
      descriptor = "Lse;"
   )
   public static class6 field1301 = new class6(29, -1);
   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "I"
   )
   public static int field1303 = 4;
   @OriginalMember(
      owner = "client!sl",
      name = "j",
      descriptor = "I"
   )
   public static int field1304 = 0;
   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field1302 = new class418(129, 6);
   @OriginalMember(
      owner = "client!sl",
      name = "l",
      descriptor = "Lfea;"
   )
   public static class681 field1308 = new class681(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!sl",
      name = "i",
      descriptor = "B"
   )
   public byte field1298;
   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "I"
   )
   public static int field1297;
   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "I"
   )
   public static int field1300;
   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "I"
   )
   public int field1307;
   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "Lda;"
   )
   public static class447 field1306;
   @OriginalMember(
      owner = "client!sl",
      name = "k",
      descriptor = "Lst;"
   )
   public static class706 field1305;
   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field1299;

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method896(int arg0) {
      try {
         if (arg0 != -25500) {
            field1303 = 51;
         }

         field1305 = null;
         field1306 = null;
         field1308 = null;
         field1301 = null;
         field1302 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1309 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method897(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method898(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
