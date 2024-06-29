import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class596 {
   @OriginalMember(
      owner = "client!ri",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field8396;
   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field8392;
   @OriginalMember(
      owner = "client!ri",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field8395;
   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8399 = new String[]{method4373(method4372("\u0018\u0012\u001a7G")), method4373(method4372("\rIXu")), method4373(method4372("\u0011U\u001a%S\rU@'\u0012")), method4373(method4372("\u0011U\u001aX\u0012"))};
   @OriginalMember(
      owner = "client!ri",
      name = "d",
      descriptor = "Lbu;"
   )
   public static class234 field8393 = new class234(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!ri",
      name = "c",
      descriptor = "I"
   )
   public static int field8398 = 0;
   @OriginalMember(
      owner = "client!ri",
      name = "g",
      descriptor = "Lfm;"
   )
   public static class164 field8397 = new class164(57, 7);
   @OriginalMember(
      owner = "client!ri",
      name = "f",
      descriptor = "Lsa;"
   )
   public static class39 field8394;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4371(byte arg0) {
      try {
         field8394 = null;
         field8397 = null;
         if (arg0 != 73) {
            field8398 = -51;
         }

         field8393 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8399[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
   )
   public class596(String arg0, String arg1, String arg2) {
      try {
         this.field8396 = arg1;
         this.field8392 = arg0;
         this.field8395 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8399[2] + (arg0 != null ? field8399[0] : field8399[1]) + ',' + (arg1 != null ? field8399[0] : field8399[1]) + ',' + (arg2 != null ? field8399[0] : field8399[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
