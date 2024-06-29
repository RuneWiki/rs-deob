import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class85 {
   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1307 = new String[]{method897(method896("\u000eB")), method897(method896("\u0000Fnn?\u0006`d`'\b]\u007f")), method897(method896("\tUlk3")), method897(method896("\u0010U")), method897(method896("\tU}ne\u000fUehe*Z\u007fj,\u0006F")), method897(method896("\tU}ne\u0002C\u007f!\b\u0002Z}n8"))};

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(IILsa;Ld;Ljava/awt/Canvas;)Lha;"
   )
   public static final class17 method895(int arg0, int arg1, class39 arg2, class672 arg3, Canvas arg4) {
      try {
         if (!class619.method4562((byte)15)) {
            throw new RuntimeException("");
         } else if (class354.method2785(field1307[2], arg0 ^ -21944)) {
            Class var5 = Class.forName(field1307[0]);
            if (arg0 != 21960) {
               return (class17)null;
            } else {
               Method var6 = var5.getDeclaredMethod(field1307[1], Class.forName(field1307[5]), Class.forName("d"), Class.forName(field1307[3]), Class.forName(field1307[4]));
               return (class17)var6.invoke((Object)null, arg4, arg3, arg2, new Integer(arg1));
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var8) {
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method896(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method897(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
