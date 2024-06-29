import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class716 {
   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10514 = method5225(method5224("\u001a@1\u001b\u001b"));
   @OriginalMember(
      owner = "client!bm",
      name = "f",
      descriptor = "Laka;"
   )
   public static class418 field10513 = new class418(44, 2);
   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "I"
   )
   public int field10508;
   @OriginalMember(
      owner = "client!bm",
      name = "e",
      descriptor = "I"
   )
   public static int field10509;
   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "I"
   )
   public int field10510;
   @OriginalMember(
      owner = "client!bm",
      name = "c",
      descriptor = "I"
   )
   public int field10511;
   @OriginalMember(
      owner = "client!bm",
      name = "d",
      descriptor = "J"
   )
   public static long field10512;

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5223(byte arg0) {
      try {
         if (arg0 > -71) {
            method5223((byte)-47);
         }

         field10513 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10514 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5224(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5225(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
