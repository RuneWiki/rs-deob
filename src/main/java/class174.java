import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class174 {
   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2598 = new String[]{method1608(method1607("G6v8n")), method1608(method1607("G6v:n"))};
   @OriginalMember(
      owner = "client!he",
      name = "g",
      descriptor = "Lfm;"
   )
   public static class164 field2593 = new class164(16, -1);
   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field2594 = true;
   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2597 = new int[2];
   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "I"
   )
   public static int field2591;
   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "I"
   )
   public int field2592;
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "I"
   )
   public static int field2596;
   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field2595;

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(Z)Ljava/net/Socket;"
   )
   public final Socket method1605(boolean arg0) throws IOException {
      try {
         ++field2591;
         return arg0 ? null : new Socket(this.field2595, this.field2592);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2598[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;"
   )
   public abstract Socket method485(byte arg0) throws IOException;

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1606(int arg0) {
      try {
         field2593 = null;
         if (arg0 == 12740) {
            field2597 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2598[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
