import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class382 {
   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5310 = new String[]{method3032(method3031("\tBU")), method3032(method3031("\u0016PXs")), method3032(method3031("\u0003\u000b\u001a1\u001e")), method3032(method3031("\u0011K\u001a]K")), method3032(method3031("\u0011K\u001a^K"))};
   @OriginalMember(
      owner = "client!in",
      name = "b",
      descriptor = "I"
   )
   public static int field5307;
   @OriginalMember(
      owner = "client!in",
      name = "c",
      descriptor = "I"
   )
   public static int field5308;
   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "Lpd;"
   )
   public static class648 field5309;

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(IBLjava/awt/Canvas;I)Lfba;"
   )
   public static final class629 method3029(int arg0, byte arg1, Canvas arg2, int arg3) {
      try {
         ++field5308;

         try {
            Class var4 = Class.forName(field5310[0]);
            int var5 = -78 / ((arg1 - 3) / 42);
            class629 var6 = (class629)var4.newInstance();
            var6.method381(arg0, false, arg3, arg2);
            return var6;
         } catch (Throwable var9) {
            class345 var7 = new class345();
            var7.method381(arg0, false, arg3, arg2);
            return var7;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5310[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5310[2] : field5310[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3030(byte arg0) {
      try {
         field5309 = null;
         int var1 = -92 / ((arg0 - -34) / 45);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5310[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3031(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3032(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
