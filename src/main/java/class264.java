import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class264 {
   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3447 = new String[]{method2031(method2030("\u0007;'*\u0001")), method2031(method2030("\u0007;')\u0001")), method2031(method2030("\b+e\u0004")), method2031(method2030("\u001dp'FT"))};
   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "I"
   )
   public static int field3445;
   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "Ldha;"
   )
   public static class84 field3446;

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(II[B)[B"
   )
   public static final byte[] method2028(int arg0, int arg1, byte[] arg2) {
      try {
         ++field3445;
         byte[] var3 = new byte[arg1];
         class714.method5200(arg2, 0, var3, arg0, arg1);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3447[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3447[3] : field3447[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2029(byte arg0) {
      try {
         int var1 = 58 / ((-47 - arg0) / 43);
         field3446 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3447[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2030(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2031(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
