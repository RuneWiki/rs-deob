import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 extends class264 {
   @OriginalMember(
      owner = "client!be",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field576 = new String[]{method357(method356("\\Y?1y")), method357(method356("\\Y?0y")), method357(method356("\\Y?7y"))};
   @OriginalMember(
      owner = "client!be",
      name = "H",
      descriptor = "I"
   )
   public static int field572;
   @OriginalMember(
      owner = "client!be",
      name = "I",
      descriptor = "I"
   )
   public static int field573;
   @OriginalMember(
      owner = "client!be",
      name = "G",
      descriptor = "I"
   )
   public static int field574;
   @OriginalMember(
      owner = "client!be",
      name = "F",
      descriptor = "I"
   )
   public static int field575;
   @OriginalMember(
      owner = "client!be",
      name = "J",
      descriptor = "J"
   )
   public static long field571;

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(II)[I",
      line = 3
   )
   public final int[] method6(int arg0, int arg1) {
      try {
         int var3 = -45 / ((24 - arg1) / 44);
         ++field573;
         return class258.field3496;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field576[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "()V",
      line = 19
   )
   public class41() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(IIII)I",
      line = 22
   )
   public static final int method354(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg2 & arg3;
         ++field575;
         if (~var6 == -1) {
            return arg0;
         } else if (~var6 == -2) {
            return -arg1 + 7;
         } else {
            return ~var6 == -3 ? -arg0 + 7 : arg1;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field576[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(BI)Z",
      line = 46
   )
   public static final boolean method355(byte arg0, int arg1) {
      try {
         ++field574;
         if (arg0 != 7) {
            method354(79, -39, 98, -88);
         }

         return arg1 >= 4 && arg1 <= 8;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field576[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method356(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method357(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
