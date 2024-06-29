import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class682 extends OutputStream {
   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10162 = new String[]{method5047(method5046("\u001a@`feB")), method5047(method5046("\u001a@`fS\u0018Cu-\f"))};
   @OriginalMember(
      owner = "client!pja",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field10160 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "I"
   )
   public static int field10161;

   @OriginalMember(
      owner = "client!pja",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field10161;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10162[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5045(int arg0) {
      try {
         if (arg0 == 2) {
            field10160 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10162[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5046(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5047(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
