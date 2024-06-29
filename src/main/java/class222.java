import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class222 {
   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3165 = method1746(method1745("\u001aZ()-G"));
   @OriginalMember(
      owner = "client!uga",
      name = "b",
      descriptor = "J"
   )
   public static long field3162 = -1L;
   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "I"
   )
   public static int field3161;
   @OriginalMember(
      owner = "client!uga",
      name = "d",
      descriptor = "I"
   )
   public static int field3163;
   @OriginalMember(
      owner = "client!uga",
      name = "c",
      descriptor = "I"
   )
   public static int field3164;

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1744(int arg0, int arg1, int arg2) {
      try {
         ++field3163;
         return arg1 != 19887 ? false : false;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3165 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1745(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1746(char[] arg0) {
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
            var10005 = 61;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
