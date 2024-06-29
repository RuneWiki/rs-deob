import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class338 {
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4799 = new String[]{method2618(method2617("\b1")), method2618(method2617("\u0016#\u0016")), method2618(method2617("\u00034\u0012su\u0005\u0012\u0018}m\u000b/\u0003")), method2618(method2617("\n'\u0001s/\f'\u0019u/)(\u0003wf\u00054")), method2618(method2617("\n'\u0001s/\u00011\u0003<B\u0001(\u0001sr")), method2618(method2617("\n'\u0010vy"))};

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ILd;Lhw;ILjava/awt/Canvas;)Lha;",
      line = 7
   )
   public static final class65 method2616(int arg0, class160 arg1, class141 arg2, int arg3, Canvas arg4) {
      try {
         if (!class321.method2506(false)) {
            throw new RuntimeException("");
         } else if (class621.method4548((byte)59, field4799[5])) {
            if (arg3 <= 45) {
               method2616(-102, (class160)null, (class141)null, 72, (Canvas)null);
            }

            Class var5 = Class.forName(field4799[1]);
            Method var6 = var5.getDeclaredMethod(field4799[2], Class.forName(field4799[4]), Class.forName("d"), Class.forName(field4799[0]), Class.forName(field4799[3]));
            return (class65)var6.invoke((Object)null, arg4, arg1, arg2, new Integer(arg0));
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var8) {
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2617(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2618(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
