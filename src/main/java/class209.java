import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class209 {
   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3181 = new String[]{method1825(method1824("?\u0019}_\u00059?wQ\u001d7\u0002l")), method1825(method1824(".\u0019")), method1825(method1824("6\nn__0\nvY_\u0015\u0005l[\u00169\u0019")), method1825(method1824("6\n\u007fZ\t")), method1825(method1824("9\t")), method1825(method1824("6\nn__=\u001cl\u00102=\u0005n_\u0002"))};

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Lrr;ILd;)Lha;",
      line = 5
   )
   public static final class610 method1823(int arg0, Canvas arg1, class678 arg2, int arg3, class150 arg4) {
      try {
         if (!class479.method3725((byte)-6)) {
            throw new RuntimeException("");
         } else if (class158.method1410((byte)-93, field3181[3])) {
            Class var5 = Class.forName(field3181[4]);
            if (arg3 > -2) {
               return (class610)null;
            } else {
               Method var6 = var5.getDeclaredMethod(field3181[0], Class.forName(field3181[5]), Class.forName("d"), Class.forName(field3181[1]), Class.forName(field3181[2]));
               return (class610)var6.invoke((Object)null, arg1, arg4, arg2, new Integer(arg0));
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var8) {
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1824(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1825(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
