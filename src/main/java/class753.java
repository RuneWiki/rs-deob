import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class753 {
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10926 = new String[]{method5434(method5433("g\u001bA*4a=K$,o\u0000P")), method5434(method5433("u\u0001")), method5434(method5433("n\bR*ne\u001ePe\u0003e\u0007R*3")), method5434(method5433("n\bR*nh\bJ,nM\u0007P.'a\u001b")), method5434(method5433("n\bC/8")), method5434(method5433("r\u0007"))};

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(Lqh;Ld;ILjava/awt/Canvas;B)Lha;"
   )
   public static final class65 method5432(class74 arg0, class160 arg1, int arg2, Canvas arg3, byte arg4) {
      try {
         if (class4.method29(255)) {
            if (class280.method2139(105, field10926[4])) {
               Class var5 = Class.forName(field10926[5]);
               if (arg4 < 75) {
                  return (class65)null;
               } else {
                  Method var6 = var5.getDeclaredMethod(field10926[0], Class.forName(field10926[2]), Class.forName("d"), Class.forName(field10926[1]), Class.forName(field10926[3]));
                  return (class65)var6.invoke((Object)null, arg3, arg1, arg0, new Integer(arg2));
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var8) {
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5433(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5434(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
