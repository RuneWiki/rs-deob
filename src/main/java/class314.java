import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class314 {
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4713 = new String[]{method2560(method2559("\"Q\u001a6X")), method2560(method2559("\"Q\u001a7X"))};
   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field4711 = new float[4];
   @OriginalMember(
      owner = "client!fr",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field4712 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "I"
   )
   public static int field4710;

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method888(int arg0);

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method2557(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (~class476.field6870.field9134.method3775(-70) != -1 && ~arg5 != -1 && class501.field7151 < 50 && ~arg2 != 0) {
            class24.field345[class501.field7151++] = new class180((byte)1, arg2, arg5, arg0, arg4, 0, arg3, (class471)null);
         }

         ++field4710;
         if (!arg1) {
            method2558(true);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4713[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2558(boolean arg0) {
      try {
         if (arg0) {
            field4711 = null;
            field4712 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4713[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2559(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2560(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
