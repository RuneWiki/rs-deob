import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class179 {
   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2209 = method1412(method1411("3k) xx"));
   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2207 = new int[3];
   @OriginalMember(
      owner = "client!cfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2208;
   @OriginalMember(
      owner = "client!cfa",
      name = "b",
      descriptor = "Lat;"
   )
   public static class396 field2206;

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(IIILtea;)V",
      line = 20
   )
   public static final void method1409(int arg0, int arg1, int arg2, class249 arg3) {
      class72 var4 = class349.method2732(arg0, arg1, arg2);
      if (var4 != null) {
         var4.field919 = arg3;
         int var5 = class650.field9484 == class377.field5711 ? 1 : 0;
         if (arg3.method2(-7577)) {
            if (arg3.method5(-26787)) {
               arg3.field8996 = class197.field2449[var5];
               class197.field2449[var5] = arg3;
               return;
            }

            arg3.field8996 = class764.field11222[var5];
            class764.field11222[var5] = arg3;
            class321.field4583 = true;
            return;
         }

         arg3.field8996 = class535.field7803[var5];
         class535.field7803[var5] = arg3;
      }

   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(B)V",
      line = 51
   )
   public static void method1410(byte arg0) {
      try {
         if (arg0 != 58) {
            field2206 = null;
         }

         field2206 = null;
         field2207 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2209 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1411(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1412(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
