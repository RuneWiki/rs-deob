import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class618 {
   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9109 = new String[]{method4491(method4490("G\"|h'")), method4491(method4490("G\"|k'"))};
   @OriginalMember(
      owner = "client!vs",
      name = "c",
      descriptor = "I"
   )
   public static int field9107 = 0;
   @OriginalMember(
      owner = "client!vs",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field9106 = new class118(78, 2);
   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field9108 = new int[]{1, 0, -1, 0};
   @OriginalMember(
      owner = "client!vs",
      name = "d",
      descriptor = "I"
   )
   public static int field9105;

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4488(byte arg0) {
      try {
         field9106 = null;
         int var1 = 86 % ((-64 - arg0) / 53);
         field9108 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9109[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(IIII)I",
      line = 14
   )
   public static final int method4489(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9105;
         if (arg1 > -70) {
            return -118;
         } else if ((class613.field9016[arg3][arg0][arg2] & 8) != 0) {
            return 0;
         } else {
            return ~arg3 < -1 && (class613.field9016[1][arg0][arg2] & 2) != 0 ? arg3 + -1 : arg3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9109[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
