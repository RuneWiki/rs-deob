import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class25 extends class82 {
   @OriginalMember(
      owner = "client!kba",
      name = "g",
      descriptor = "I"
   )
   public int field387;
   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field391 = new String[]{method203(method202("$kX\u0004-g")), method203(method202("$kX\u0004P&gP^Rg"))};
   @OriginalMember(
      owner = "client!kba",
      name = "i",
      descriptor = "J"
   )
   public static long field389 = 0L;
   @OriginalMember(
      owner = "client!kba",
      name = "j",
      descriptor = "Laka;"
   )
   public static class418 field388 = new class418(53, -2);
   @OriginalMember(
      owner = "client!kba",
      name = "k",
      descriptor = "I"
   )
   public static int field390;
   @OriginalMember(
      owner = "client!kba",
      name = "h",
      descriptor = "Lww;"
   )
   public static class339 field386;

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class25(int arg0) {
      try {
         this.field387 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field391[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method201(int arg0) {
      try {
         field388 = null;
         if (arg0 != 53) {
            field386 = null;
         }

         field386 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field391[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
