import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class471 {
   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6762 = new String[]{method3417(method3416("M-\u0001S7")), method3417(method3416("M-\u0001P7")), method3417(method3416("M-\u0001R7"))};
   @OriginalMember(
      owner = "client!lv",
      name = "c",
      descriptor = "I"
   )
   public static int field6760 = 0;
   @OriginalMember(
      owner = "client!lv",
      name = "d",
      descriptor = "I"
   )
   public static int field6758;
   @OriginalMember(
      owner = "client!lv",
      name = "b",
      descriptor = "I"
   )
   public static int field6759;
   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "I"
   )
   public static int field6761;

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3413(int arg0) {
      try {
         class84.field1088.method731(arg0 ^ arg0);
         ++field6761;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6762[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3414(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 19) {
            field6760 = 41;
         }

         ++field6759;
         return class222.method1744(arg1, arg2 + 19868, arg0) || class159.method1329(arg1, arg0, arg2 + 45);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6762[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public static final boolean method3415(int arg0, boolean arg1) {
      try {
         ++field6758;
         if (!arg1) {
            field6760 = 98;
         }

         return ~(arg0 & -arg0) == ~arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6762[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3416(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3417(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
