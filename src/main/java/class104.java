import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class104 {
   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1260 = method896(method895("aZZtF"));
   @OriginalMember(
      owner = "client!qu",
      name = "d",
      descriptor = "Lvha;"
   )
   public static class713 field1257 = new class713();
   @OriginalMember(
      owner = "client!qu",
      name = "b",
      descriptor = "Lcj;"
   )
   public static class721 field1258 = new class721(8, 0, 4, 1);
   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "S"
   )
   public static short field1259 = 256;
   @OriginalMember(
      owner = "client!qu",
      name = "c",
      descriptor = "Lsha;"
   )
   public class758 field1256;

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method894(int arg0) {
      try {
         field1257 = null;
         if (arg0 != -29092) {
            method894(113);
         }

         field1258 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1260 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method895(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method896(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
