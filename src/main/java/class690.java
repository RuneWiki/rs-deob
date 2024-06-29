import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class690 extends class500 {
   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10091 = method5027(method5026("\u001c\u001e\n\fZ"));
   @OriginalMember(
      owner = "client!sv",
      name = "j",
      descriptor = "Lnw;"
   )
   public static class616 field10088 = new class616(21, 4);
   @OriginalMember(
      owner = "client!sv",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field10090 = false;
   @OriginalMember(
      owner = "client!sv",
      name = "l",
      descriptor = "I"
   )
   public static int field10089;

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public abstract void method27(boolean arg0, class139 arg1);

   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5025(boolean arg0) {
      try {
         field10088 = null;
         if (!arg0) {
            field10090 = true;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10091 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public abstract void method26(class594 arg0, byte arg1);

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
