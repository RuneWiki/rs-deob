import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class55 extends OutputStream {
   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1111 = new String[]{method643(method642("\u0012wL{%\u0001{Y0z")), method643(method642("\u0012wL{\u0013["))};
   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "Lgh;"
   )
   public static class572 field1107 = new class572(57, 4);
   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "I"
   )
   public static int field1109 = 0;
   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field1110 = new class572(39, -1);
   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "I"
   )
   public static int field1108;

   @OriginalMember(
      owner = "client!aea",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field1108;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1111[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method641(boolean arg0) {
      try {
         if (arg0) {
            method641(false);
         }

         field1107 = null;
         field1110 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1111[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
