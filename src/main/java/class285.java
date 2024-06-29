import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class285 {
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4497 = new String[]{method2383(method2382("I;(U\u0007")), method2383(method2382("I;(V\u0007"))};
   @OriginalMember(
      owner = "client!mj",
      name = "d",
      descriptor = "Lhka;"
   )
   public static class377 field4494 = new class377(6, 4);
   @OriginalMember(
      owner = "client!mj",
      name = "c",
      descriptor = "I"
   )
   public static int field4493;
   @OriginalMember(
      owner = "client!mj",
      name = "b",
      descriptor = "I"
   )
   public static int field4495;
   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "[[[I"
   )
   public static int[][][] field4496;

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2380(int arg0) {
      try {
         field4494 = null;
         if (arg0 != 6) {
            method2381((byte)-53, 122, 45, -90, 108);
         }

         field4496 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4497[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method2381(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4493;
         int var5 = 33 / ((14 - arg0) / 38);
         if (~class443.field6806 >= ~(-arg2 + arg3) && arg2 + arg3 <= class182.field2833 && ~class368.field5724 >= ~(-arg2 + arg4) && class84.field1212 >= arg2 + arg4) {
            class413.method3308(arg1, arg2, arg3, arg4, -1285978623);
         } else {
            class463.method3591(-1, arg2, arg1, arg4, arg3);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4497[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
