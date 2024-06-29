import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class class380 extends class22 {
   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5637 = method2964(method2963("\u0001W\u0015'a"));
   @OriginalMember(
      owner = "client!uv",
      name = "j",
      descriptor = "Leb;"
   )
   public static class650 field5636 = new class650(0, 3);

   static {
      new class248("", 73);
   }

   @OriginalMember(
      owner = "client!uv",
      name = "e",
      descriptor = "(I)V",
      line = 4
   )
   public static void method2962(int arg0) {
      try {
         field5636 = null;
         if (arg0 != -4) {
            field5636 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5637 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(B)I"
   )
   public abstract int method1284(byte arg0);

   @OriginalMember(
      owner = "client!uv",
      name = "g",
      descriptor = "(I)J"
   )
   public abstract long method1280(int arg0);

   @OriginalMember(
      owner = "client!uv",
      name = "f",
      descriptor = "(I)I"
   )
   public abstract int method1281(int arg0);

   @OriginalMember(
      owner = "client!uv",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method1282(int arg0);

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method1278(int arg0);

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
