import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class322 extends OutputStream {
   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4417 = method2530(method2529("\u0000\t 8y\u0007\u00035s&"));
   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field4415 = false;
   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "I"
   )
   public static int field4416;

   @OriginalMember(
      owner = "client!uca",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field4416;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4417 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
