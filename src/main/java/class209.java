import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class209 {
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2586 = method1590(method1589("\u007f'\u001cb."));
   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "I"
   )
   public static int field2582 = 0;
   @OriginalMember(
      owner = "client!pk",
      name = "d",
      descriptor = "Lbga;"
   )
   public static class378 field2583 = new class378(75, 1);
   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2585 = new int[1];
   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field2584;

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1588(byte arg0) {
      try {
         field2583 = null;
         field2584 = null;
         field2585 = null;
         int var1 = 116 / ((arg0 - -19) / 57);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2586 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1589(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1590(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
