import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class691 {
   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10406 = method5030(method5029(">=R\u001dH\u007f"));
   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10405 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field10403 = new class101(2, 1);
   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field10404;

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method5028(int arg0) {
      try {
         field10403 = null;
         if (arg0 != 0) {
            method5028(-83);
         }

         field10405 = null;
         field10404 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10406 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5029(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5030(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
