import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class166 {
   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2341 = new String[]{method1373(method1372("R*&/nY<$`\u0003Y%&/3")), method1373(method1372("R*7*8")), method1373(method1372("S-")), method1373(method1372("R*&/nT*>)nq%$+']9")), method1373(method1372("Z)")), method1373(method1372("[95/4]\u001f?!,S\"$"))};

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ld;Lkf;IZ)Lha;"
   )
   public static final class66 method1371(Canvas arg0, class162 arg1, class266 arg2, int arg3, boolean arg4) {
      try {
         if (!class606.method4418((byte)-107)) {
            throw new RuntimeException("");
         } else if (class715.method5188(-19503, field2341[1])) {
            Class var5 = Class.forName(field2341[4]);
            if (arg4) {
               return (class66)null;
            } else {
               Method var6 = var5.getDeclaredMethod(field2341[5], Class.forName(field2341[0]), Class.forName("d"), Class.forName(field2341[2]), Class.forName(field2341[3]));
               return (class66)var6.invoke((Object)null, arg0, arg1, arg2, new Integer(arg3));
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var8) {
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
