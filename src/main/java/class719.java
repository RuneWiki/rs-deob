import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class719 extends class22 {
   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10381 = method5197(method5196("|0WM\u001e"));
   @OriginalMember(
      owner = "client!ev",
      name = "m",
      descriptor = "Lgh;"
   )
   public static class572 field10377 = new class572(101, 3);
   @OriginalMember(
      owner = "client!ev",
      name = "o",
      descriptor = "Lgw;"
   )
   public static class179 field10380 = new class179(3000000, 200);
   @OriginalMember(
      owner = "client!ev",
      name = "l",
      descriptor = "I"
   )
   public int field10375;
   @OriginalMember(
      owner = "client!ev",
      name = "n",
      descriptor = "I"
   )
   public static int field10378;
   @OriginalMember(
      owner = "client!ev",
      name = "k",
      descriptor = "I"
   )
   public int field10379;
   @OriginalMember(
      owner = "client!ev",
      name = "j",
      descriptor = "[[B"
   )
   public static byte[][] field10376;

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5195(int arg0) {
      try {
         field10376 = null;
         field10380 = null;
         if (arg0 != 200) {
            method5195(14);
         }

         field10377 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10381 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5197(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
