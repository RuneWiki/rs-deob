import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class138 {
   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1750 = new String[]{method1152(method1151("^\u001d\u0015\b\u0010")), method1152(method1151("^\u001d\u0015\u000b\u0010"))};
   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "Laka;"
   )
   public static class418 field1747 = new class418(130, 2);
   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "I"
   )
   public static int field1749;
   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "Lrca;"
   )
   public static class37 field1748;

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1149(int arg0) {
      try {
         field1748 = null;
         if (arg0 == 0) {
            field1747 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1750[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1150(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1151(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1152(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
