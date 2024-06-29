import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class494 {
   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6792 = method3585(method3584("k\u0000uR\u0011a8`\u000e\f`\f<"));
   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "I"
   )
   public static int field6787 = 0;
   @OriginalMember(
      owner = "client!eka",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field6788 = false;
   @OriginalMember(
      owner = "client!eka",
      name = "e",
      descriptor = "I"
   )
   public static int field6789;
   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "I"
   )
   public static int field6790;
   @OriginalMember(
      owner = "client!eka",
      name = "c",
      descriptor = "I"
   )
   public static int field6791;

   @OriginalMember(
      owner = "client!eka",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6791;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6792 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3584(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3585(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
