import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class78 extends OutputStream {
   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field968 = new String[]{method707(method706("A$(\u0018%")), method707(method706("A$(.\u007fX&cq"))};
   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "I"
   )
   public static int field966;
   @OriginalMember(
      owner = "client!pv",
      name = "c",
      descriptor = "I"
   )
   public static int field967;
   @OriginalMember(
      owner = "client!pv",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field965;

   @OriginalMember(
      owner = "client!pv",
      name = "write",
      descriptor = "(I)V",
      line = 8
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field966;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field968[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(I)V",
      line = 16
   )
   public static void method705(int arg0) {
      try {
         field965 = null;
         int var1 = -107 / ((arg0 - -9) / 60);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field968[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method706(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method707(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
