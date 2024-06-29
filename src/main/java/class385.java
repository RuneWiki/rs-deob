import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class385 {
   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5597 = method2922(method2921("rlT3u/"));
   @OriginalMember(
      owner = "client!uia",
      name = "b",
      descriptor = "D"
   )
   public static double field5595;
   @OriginalMember(
      owner = "client!uia",
      name = "c",
      descriptor = "Llfa;"
   )
   public class126 field5594;
   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "Ljava/awt/Image;"
   )
   public static Image field5596;

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2920(int arg0) {
      try {
         field5596 = null;
         if (arg0 != -20359) {
            method2920(-108);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5597 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
