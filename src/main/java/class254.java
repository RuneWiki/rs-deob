import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class254 extends class389 {
   @OriginalMember(
      owner = "client!dt",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3463 = new String[]{method1947(method1946("zv[6\u0007")), method1947(method1946("zv[0\u0007")), method1947(method1946("zv[3\u0007"))};
   @OriginalMember(
      owner = "client!dt",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field3459 = new int[2048];
   @OriginalMember(
      owner = "client!dt",
      name = "I",
      descriptor = "Lkt;"
   )
   public static class169 field3461 = new class169();
   @OriginalMember(
      owner = "client!dt",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field3462 = new int[500];
   @OriginalMember(
      owner = "client!dt",
      name = "E",
      descriptor = "I"
   )
   public static int field3458;
   @OriginalMember(
      owner = "client!dt",
      name = "F",
      descriptor = "I"
   )
   public static int field3460;

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(IBII)V",
      line = 6
   )
   public final void method778(int arg0, byte arg1, int arg2, int arg3) {
      try {
         super.field5639 = arg3;
         if (arg1 <= -121) {
            super.field5645 = arg0;
            ++field3460;
            super.field5638 = arg2;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3463[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 19
   )
   public class254(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "(B)V",
      line = 22
   )
   public static void method1944(byte arg0) {
      try {
         field3462 = null;
         field3461 = null;
         if (arg0 != 126) {
            method1944((byte)19);
         }

         field3459 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3463[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(IF)V",
      line = 36
   )
   public final void method777(int arg0, float arg1) {
      try {
         ++field3458;
         super.field5649 = arg1;
         if (arg0 != -12978) {
            field3461 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3463[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(IIII)V",
      line = 50
   )
   public static final void method1945(int arg0, int arg1, int arg2, int arg3) {
      class517 var4 = class663.field9659[arg0][arg1][arg2];
      if (var4 != null) {
         class300 var5 = var4.field7474;
         class300 var6 = var4.field7475;
         if (var5 != null) {
            var5.field4100 = (short)(var5.field4100 * arg3 / (16 << class773.field11359 - 7));
            var5.field4105 = (short)(var5.field4105 * arg3 / (16 << class773.field11359 - 7));
         }

         if (var6 != null) {
            var6.field4100 = (short)(var6.field4100 * arg3 / (16 << class773.field11359 - 7));
            var6.field4105 = (short)(var6.field4105 * arg3 / (16 << class773.field11359 - 7));
         }

      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1946(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1947(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
