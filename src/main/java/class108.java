import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class108 {
   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1349 = new String[]{method882(method881("-9\u001b\u0017Rt")), method882(method881("-9\u001b\u0017Qt"))};
   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "Loi;"
   )
   public static class80 field1346 = new class80(260);
   @OriginalMember(
      owner = "client!qfa",
      name = "c",
      descriptor = "I"
   )
   public static int field1348 = 0;
   @OriginalMember(
      owner = "client!qfa",
      name = "b",
      descriptor = "I"
   )
   public static int field1347;

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method879(int arg0, int arg1, int arg2) {
      try {
         ++field1347;
         if (arg1 < 103) {
            field1346 = null;
         }

         return ~(arg0 & 34) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1349[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method880(int arg0) {
      try {
         if (arg0 >= 46) {
            field1346 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1349[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method881(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method882(char[] arg0) {
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
            var10005 = 95;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
