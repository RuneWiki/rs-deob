import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class class454 extends class382 {
   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6602 = new String[]{method3500(method3499("5i)dA")), method3500(method3499("\"1)\t\u0014")), method3500(method3499(" 2k&")), method3500(method3499("\"1)\u000b\u0014"))};
   @OriginalMember(
      owner = "client!lv",
      name = "g",
      descriptor = "I"
   )
   public static int field6597 = 0;
   @OriginalMember(
      owner = "client!lv",
      name = "d",
      descriptor = "Lhn;"
   )
   public static class357 field6599 = new class357(method3500(method3499("\u0007\tS\by\u001a\u0006")), method3500(method3499("!!a#_+")), method3500(method3499("\u0011.i>^+3f")), 6);
   @OriginalMember(
      owner = "client!lv",
      name = "h",
      descriptor = "I"
   )
   public static int field6601 = 0;
   @OriginalMember(
      owner = "client!lv",
      name = "e",
      descriptor = "I"
   )
   public static int field6600;
   @OriginalMember(
      owner = "client!lv",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6598;

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3496(byte arg0) {
      try {
         if (arg0 <= -96) {
            field6598 = null;
            field6599 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6602[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(IILha;IIIII)V"
   )
   public static final void method3497(int arg0, int arg1, class17 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field6600;
         arg2.method223(arg7, arg4, 1, arg0, arg6, arg3);
         if (arg1 < 68) {
            field6597 = 62;
         }

         arg2.method223(arg7 + 1, arg4 + -2, 1, arg0 + 1, arg5, 16);
         arg2.method186(arg4 + -2, arg3 - 19, (byte)-11, arg5, arg7 + 18, arg0 + 1);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6602[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6602[0] : field6602[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(I)Lcca;"
   )
   public abstract class293 method3498(int arg0);

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3499(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3500(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
