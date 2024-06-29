import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class326 {
   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4960 = new String[]{method2671(method2670("\u001fhH\u0013u")), method2671(method2670("\u0000|\n=")), method2671(method2670("\u0015'H\u007f ")), method2671(method2670("\u001fhH\u0010u"))};
   @OriginalMember(
      owner = "client!qa",
      name = "b",
      descriptor = "I"
   )
   public static int field4957 = 0;
   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "Lsn;"
   )
   public static class675 field4958 = new class675();
   @OriginalMember(
      owner = "client!qa",
      name = "c",
      descriptor = "I"
   )
   public static int field4959;

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(Lha;II)Ljq;"
   )
   public static final class672 method2668(class610 arg0, int arg1, int arg2) {
      try {
         if (arg2 != 23825) {
            return null;
         } else {
            ++field4959;
            class332 var3 = (class332)class570.field8426.method3141((long)arg1, true);
            if (var3 != null) {
               class473 var4 = var3.field5035.method4091(true);
               var3.field5025 = true;
               if (var4 != null) {
                  return var4.method3680(arg0, 0);
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4960[3] + (arg0 != null ? field4960[2] : field4960[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2669(int arg0) {
      try {
         field4958 = null;
         if (arg0 != 11819) {
            field4958 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4960[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2670(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2671(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
