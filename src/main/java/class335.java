import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class335 extends OutputStream {
   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4604 = new String[]{method2660(method2659(",\u001f\u001adY7\u0015\u000f/\u0006")), method2660(method2659(",\u001f\u001adom"))};
   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "Lro;"
   )
   public static class288 field4603 = class146.method1184((byte)-17);
   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "I"
   )
   public static int field4601;
   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "I"
   )
   public static int field4602;
   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "[Lnl;"
   )
   public static class713[] field4600;

   @OriginalMember(
      owner = "client!ica",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field4602;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4604[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2658(int arg0) {
      try {
         field4603 = null;
         field4600 = null;
         if (arg0 != 27102) {
            field4603 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4604[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2659(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2660(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
