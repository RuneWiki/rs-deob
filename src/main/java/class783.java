import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class783 {
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11476 = method5640(method5639("dY1{\u0012$"));
   @OriginalMember(
      owner = "client!hda",
      name = "b",
      descriptor = "I"
   )
   public static int field11473;
   @OriginalMember(
      owner = "client!hda",
      name = "c",
      descriptor = "I"
   )
   public static int field11474;
   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "Lbg;"
   )
   public static class492 field11472;
   @OriginalMember(
      owner = "client!hda",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field11475;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(Z)V",
      line = 6
   )
   public static void method5638(boolean arg0) {
      try {
         if (arg0) {
            method5638(false);
         }

         field11472 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11476 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5640(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
