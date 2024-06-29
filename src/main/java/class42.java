import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class42 {
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field555 = method314(method313("cO\u001aSp"));
   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "I"
   )
   public static int field552 = 0;
   @OriginalMember(
      owner = "client!ts",
      name = "d",
      descriptor = "Lhv;"
   )
   public static class227 field551 = new class227(16);
   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "F"
   )
   public static float field554;
   @OriginalMember(
      owner = "client!ts",
      name = "c",
      descriptor = "I"
   )
   public static int field553;

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method312(int arg0) {
      try {
         field551 = null;
         if (arg0 < 24) {
            method312(11);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field555 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method313(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method314(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
