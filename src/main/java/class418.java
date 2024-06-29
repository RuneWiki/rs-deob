import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class418 {
   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6111 = new String[]{method3190(method3189("S[\u0013t6")), method3190(method3189("S[\u0013w6"))};
   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "I"
   )
   public static int field6110 = 0;
   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "I"
   )
   public static int field6109;
   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "Lhw;"
   )
   public static class141 field6108;

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3187(byte arg0) {
      try {
         if (arg0 >= -81) {
            field6110 = 126;
         }

         field6108 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6111[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "(B)J"
   )
   public static final long method3188(byte arg0) {
      try {
         if (arg0 <= 30) {
            method3187((byte)22);
         }

         ++field6109;
         return class344.field4894.method3140((byte)82);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6111[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3189(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3190(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
