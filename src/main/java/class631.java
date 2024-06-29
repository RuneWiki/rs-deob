import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class631 extends OutputStream {
   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8835 = new String[]{method4585(method4584("@ *q*[1a.")), method4585(method4584("@ *Gp"))};
   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "Lw;"
   )
   public static class317 field8832 = new class317();
   @OriginalMember(
      owner = "client!re",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8834 = "";
   @OriginalMember(
      owner = "client!re",
      name = "d",
      descriptor = "I"
   )
   public static int field8831;
   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field8833;

   @OriginalMember(
      owner = "client!re",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field8831;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8835[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4583(boolean arg0) {
      try {
         field8833 = null;
         field8832 = null;
         if (arg0) {
            field8833 = null;
         }

         field8834 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8835[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4584(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4585(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
