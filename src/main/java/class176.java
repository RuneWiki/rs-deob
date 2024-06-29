import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class176 {
   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2182 = method1396(method1395("\u0000\u0017p\u0000l&\u000b,\u001dm\u0012W"));
   @OriginalMember(
      owner = "client!uh",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field2178 = false;
   @OriginalMember(
      owner = "client!uh",
      name = "b",
      descriptor = "I"
   )
   public static int field2179 = 0;
   @OriginalMember(
      owner = "client!uh",
      name = "d",
      descriptor = "I"
   )
   public static int field2180;
   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "I"
   )
   public static int field2181;

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1394() {
      class188.method1461(1, class424.field6437);
   }

   @OriginalMember(
      owner = "client!uh",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2180;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2182 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
