import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class554 {
   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "Loi;"
   )
   public class69 field8138 = new class69();
   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8143 = method4189(method4188("\u0013\u0001LQ\u0012"));
   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field8140 = false;
   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "Lfea;"
   )
   public static class681 field8142 = new class681(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!nh",
      name = "d",
      descriptor = "I"
   )
   public static int field8139;
   @OriginalMember(
      owner = "client!nh",
      name = "e",
      descriptor = "[Lpd;"
   )
   public static class648[] field8141;

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4187(int arg0) {
      try {
         field8141 = null;
         field8142 = null;
         if (arg0 != 1) {
            field8139 = 118;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8143 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4188(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4189(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
