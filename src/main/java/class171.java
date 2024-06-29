import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class171 {
   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2148 = new String[]{method1340(method1339("2Mz@|")), method1340(method1339("2MzC|")), method1340(method1339(")I8n")), method1340(method1339("<\u0012z,)")), method1340(method1339("(L1l>4"))};
   @OriginalMember(
      owner = "client!uq",
      name = "b",
      descriptor = "Ldd;"
   )
   public static class735 field2146 = new class735(13, 0, 1, 0);
   @OriginalMember(
      owner = "client!uq",
      name = "c",
      descriptor = "I"
   )
   public static int field2143;
   @OriginalMember(
      owner = "client!uq",
      name = "e",
      descriptor = "I"
   )
   public static int field2144;
   @OriginalMember(
      owner = "client!uq",
      name = "d",
      descriptor = "I"
   )
   public static int field2147;
   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field2145;

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1337(int arg0) {
      try {
         field2146 = null;
         if (arg0 != -25413) {
            method1337(-1);
         }

         field2145 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2148[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(ZLjava/lang/String;ILbj;Z)V"
   )
   public static final void method1338(boolean arg0, String arg1, int arg2, class255 arg3, boolean arg4) {
      try {
         int var5 = -73 / ((arg2 - 78) / 35);
         class607.method4433(arg4, (byte)-48, arg1, arg3, arg0, field2148[4]);
         ++field2143;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2148[1] + arg0 + ',' + (arg1 != null ? field2148[3] : field2148[2]) + ',' + arg2 + ',' + (arg3 != null ? field2148[3] : field2148[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1339(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1340(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
