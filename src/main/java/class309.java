import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class309 {
   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4317 = new String[]{method2470(method2469("_/D%k")), method2470(method2469("_/U =Y/M&=| W$tP<")), method2470(method2469("_/U =T9WoPT U `")), method2470(method2469("V<F gP\u001aL.\u007f^'W")), method2470(method2469("@,")), method2470(method2469("B9"))};

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(Ld;Ljava/awt/Canvas;Lww;II)Lha;"
   )
   public static final class479 method2468(class102 arg0, Canvas arg1, class339 arg2, int arg3, int arg4) {
      try {
         if (!class679.method4955(34069)) {
            throw new RuntimeException("");
         } else if (!class52.method385(field4317[0], -58)) {
            throw new RuntimeException("");
         } else {
            int var5 = 7 / ((arg4 - -13) / 39);
            Class var6 = Class.forName(field4317[4]);
            Method var7 = var6.getDeclaredMethod(field4317[3], Class.forName(field4317[2]), Class.forName("d"), Class.forName(field4317[5]), Class.forName(field4317[1]));
            return (class479)var7.invoke((Object)null, arg1, arg0, arg2, new Integer(arg3));
         }
      } catch (Throwable var9) {
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2470(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
