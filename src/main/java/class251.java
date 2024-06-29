import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class251 extends OutputStream {
   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3600 = new String[]{method2035(method2034("^6dA+S6/\u001e")), method2035(method2034("^6dwq")), method2035(method2034("^6dtq"))};
   @OriginalMember(
      owner = "client!dt",
      name = "e",
      descriptor = "Liw;"
   )
   public static class332 field3595 = new class332();
   @OriginalMember(
      owner = "client!dt",
      name = "h",
      descriptor = "F"
   )
   public static float field3596;
   @OriginalMember(
      owner = "client!dt",
      name = "g",
      descriptor = "I"
   )
   public static int field3592;
   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "I"
   )
   public static int field3594;
   @OriginalMember(
      owner = "client!dt",
      name = "f",
      descriptor = "I"
   )
   public static int field3597;
   @OriginalMember(
      owner = "client!dt",
      name = "d",
      descriptor = "I"
   )
   public static int field3598;
   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "I"
   )
   public static int field3599;
   @OriginalMember(
      owner = "client!dt",
      name = "c",
      descriptor = "Lsm;"
   )
   public static class297 field3593;

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2032(boolean arg0) {
      try {
         field3593 = null;
         if (!arg0) {
            field3597 = -84;
         }

         field3595 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3600[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2033(int arg0, int arg1) {
      try {
         ++field3592;
         int var2 = -18 % ((arg1 - -71) / 49);
         return arg0 >>> 7;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3600[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field3594;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3600[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2034(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2035(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
