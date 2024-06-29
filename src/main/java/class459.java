import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class459 {
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6314 = new String[]{method3505(method3504("4\u0012yP\u001dn")), method3505(method3504("4\u0012yP\u001en"))};
   @OriginalMember(
      owner = "client!rha",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6311 = new int[13];
   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "Lfea;"
   )
   public static class681 field6313 = new class681(6, 0, 4, 2);
   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "I"
   )
   public static int field6309;
   @OriginalMember(
      owner = "client!rha",
      name = "d",
      descriptor = "I"
   )
   public static int field6310;
   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field6312;

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3502(int arg0, int arg1, int arg2) {
      try {
         ++field6309;
         if (class792.method5717((byte)-93, arg1)) {
            class567.method4261(arg2, 120, class419.field5722[arg1]);
            int var3 = 39 % ((arg0 - 56) / 60);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6314[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3503(boolean arg0) {
      try {
         field6313 = null;
         if (arg0) {
            field6311 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6314[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
