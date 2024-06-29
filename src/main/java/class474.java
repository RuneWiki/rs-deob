import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class474 {
   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6931 = method3595(method3594("\u0011?br@"));
   @OriginalMember(
      owner = "client!la",
      name = "d",
      descriptor = "I"
   )
   public static int field6927;
   @OriginalMember(
      owner = "client!la",
      name = "e",
      descriptor = "I"
   )
   public static int field6928;
   @OriginalMember(
      owner = "client!la",
      name = "b",
      descriptor = "Lhw;"
   )
   public static class141 field6926;
   @OriginalMember(
      owner = "client!la",
      name = "c",
      descriptor = "Lee;"
   )
   public class703 field6929;
   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6930;

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3593(byte arg0) {
      try {
         field6930 = null;
         field6926 = null;
         if (arg0 != 97) {
            method3593((byte)95);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6931 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3595(char[] arg0) {
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
            var10005 = 94;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
