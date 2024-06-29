import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class135 {
   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1727 = method1157(method1156("b\\^\u0012]"));
   @OriginalMember(
      owner = "client!ju",
      name = "c",
      descriptor = "I"
   )
   public static int field1726 = 0;
   @OriginalMember(
      owner = "client!ju",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field1725 = new int[6][];
   @OriginalMember(
      owner = "client!ju",
      name = "e",
      descriptor = "B"
   )
   public byte field1722;
   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "I"
   )
   public int field1723;
   @OriginalMember(
      owner = "client!ju",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field1724;

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method1155(byte arg0) {
      try {
         field1725 = null;
         if (arg0 >= -25) {
            field1726 = 35;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1727 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1156(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1157(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
