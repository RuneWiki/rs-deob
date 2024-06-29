import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class163 {
   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2071 = new String[]{method1358(method1357("b\tzRG")), method1358(method1357("xSz8\u0012")), method1358(method1357("wR8\u0010")), method1358(method1357("xSz>\u0012")), method1358(method1357("xSz?\u0012")), method1358(method1357("xSz=\u0012"))};
   @OriginalMember(
      owner = "client!at",
      name = "f",
      descriptor = "Lfea;"
   )
   public static class681 field2067 = new class681(0, 2, 2, 1);
   @OriginalMember(
      owner = "client!at",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2069 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!at",
      name = "c",
      descriptor = "I"
   )
   public static int field2068 = 0;
   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "I"
   )
   public static int field2064;
   @OriginalMember(
      owner = "client!at",
      name = "g",
      descriptor = "I"
   )
   public static int field2065;
   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "I"
   )
   public static int field2066;
   @OriginalMember(
      owner = "client!at",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field2070;

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(I)J"
   )
   public static final synchronized long method1353(int arg0) {
      try {
         ++field2065;
         long var1 = System.currentTimeMillis();
         if (arg0 > -118) {
            field2070 = null;
         }

         if (~var1 > ~class652.field9741) {
            class739.field10821 += -var1 + class652.field9741;
         }

         class652.field9741 = var1;
         return class739.field10821 + var1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2071[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IZZILjava/lang/String;)V"
   )
   public static final void method1354(int arg0, boolean arg1, boolean arg2, int arg3, String arg4) {
      try {
         ++field2066;
         class1.method2(arg2, arg3, arg4, arg1, arg0, (String)null, -72);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2071[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2071[0] : field2071[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1355(int arg0) {
      try {
         field2067 = null;
         if (arg0 != 2) {
            field2067 = null;
         }

         field2070 = null;
         field2069 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2071[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1356(byte arg0) {
      try {
         if (arg0 != 75) {
            field2067 = null;
         }

         ++field2064;
         if (class652.field9742) {
            return 6;
         } else if (class213.field2705 == null) {
            return 0;
         } else {
            int var1 = class213.field2705.field7909;
            if (class308.method2464(16, var1)) {
               return 1;
            } else if (class505.method3816(84, var1)) {
               return 2;
            } else if (class258.method2080(var1, 25161)) {
               return 3;
            } else {
               return class141.method1161(var1, false) ? 4 : 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2071[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1357(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1358(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
