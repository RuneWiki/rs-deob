import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class282 {
   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3916 = new String[]{method2145(method2144("gcsN9")), method2145(method2144("r81\f")), method2145(method2144("n#s\"l")), method2145(method2144("n#s!l"))};
   @OriginalMember(
      owner = "client!rn",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field3911 = new class536(31, 8);
   @OriginalMember(
      owner = "client!rn",
      name = "c",
      descriptor = "Lkda;"
   )
   public static class412 field3914 = new class412(method2145(method2144("U\u0003\t\"\u0001H\f")), method2145(method2144("s+;\t'y")), method2145(method2144("C$3\u0014&y9<")), 6);
   @OriginalMember(
      owner = "client!rn",
      name = "e",
      descriptor = "I"
   )
   public static int field3912;
   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "I"
   )
   public static int field3913;
   @OriginalMember(
      owner = "client!rn",
      name = "b",
      descriptor = "I"
   )
   public static int field3915;

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(ILjava/lang/String;ZZLjava/lang/String;)V"
   )
   public static final void method2142(int arg0, String arg1, boolean arg2, boolean arg3, String arg4) {
      try {
         ++field3912;
         class147.method1203((byte)118, arg4, arg3, -1, arg1, arg0, arg2);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3916[2] + arg0 + ',' + (arg1 != null ? field3916[0] : field3916[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3916[0] : field3916[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2143(byte arg0) {
      try {
         field3911 = null;
         int var1 = -119 / ((53 - arg0) / 58);
         field3914 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3916[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2144(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2145(char[] arg0) {
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
            var10005 = 77;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
