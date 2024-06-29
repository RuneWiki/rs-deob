import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class316 {
   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4532 = new String[]{method2408(method2407("y\u000b=")), method2408(method2407("v\u000b;\\\u0016")), method2408(method2407("z\u0003")), method2408(method2407("\u007f\u00189Y\u001ay>3W\u0002w\u0003(")), method2408(method2407("v\u000b*Y@}\u001d(\u0016-}\u0004*Y\u001d")), method2408(method2407("v\u000b*Y@p\u000b2_@U\u0004(]\ty\u0018"))};

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Ld;Leaa;IILjava/awt/Canvas;)Lha;",
      line = 5
   )
   public static final class66 method2406(class160 arg0, class526 arg1, int arg2, int arg3, Canvas arg4) {
      try {
         if (class589.method4337(true)) {
            if (class298.method2280(0, field4532[1])) {
               if (arg3 != -223) {
                  method2406((class160)null, (class526)null, 72, -23, (Canvas)null);
               }

               Class var5 = Class.forName(field4532[2]);
               Method var6 = var5.getDeclaredMethod(field4532[3], Class.forName(field4532[4]), Class.forName("d"), Class.forName(field4532[0]), Class.forName(field4532[5]));
               return (class66)var6.invoke((Object)null, arg4, arg0, arg1, new Integer(arg2));
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
      owner = "client!nb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
