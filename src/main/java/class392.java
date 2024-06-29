import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class392 {
   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5680 = new String[]{method2980(method2979("\u001d~dZ^")), method2980(method2979("\u001d~dY^"))};
   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "I"
   )
   public static int field5678;
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "I"
   )
   public static int field5679;
   @OriginalMember(
      owner = "client!pa",
      name = "c",
      descriptor = "[Lgn;"
   )
   public static class731[] field5677;

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2977(byte arg0) {
      try {
         field5677 = null;
         if (arg0 < 111) {
            field5677 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5680[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(IB)Lhs;"
   )
   public static final class346 method2978(int arg0, byte arg1) {
      try {
         ++field5679;
         class346 var2 = (class346)class427.field6118.method725(0, (long)arg0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class753.field11152.method2037(false, arg0, 0);
            class346 var4 = new class346();
            if (var3 != null) {
               var4.method2532(new class147(var3), (byte)-81, arg0);
            }

            if (arg1 != -79) {
               return null;
            } else {
               class427.field6118.method723(0, (long)arg0, var4);
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5680[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2979(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2980(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
