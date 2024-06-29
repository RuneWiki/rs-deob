import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class107 {
   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1435 = new String[]{method965(method964("[{xt?\u0019")), method965(method964("[{xt<\u0019")), method965(method964("[{xt=\u0019"))};
   @OriginalMember(
      owner = "client!jha",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1424 = new int[2048];
   @OriginalMember(
      owner = "client!jha",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field1430 = false;
   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field1433 = new class6(78, 7);
   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "B"
   )
   public byte field1425;
   @OriginalMember(
      owner = "client!jha",
      name = "k",
      descriptor = "I"
   )
   public static int field1429;
   @OriginalMember(
      owner = "client!jha",
      name = "c",
      descriptor = "I"
   )
   public static int field1431;
   @OriginalMember(
      owner = "client!jha",
      name = "i",
      descriptor = "I"
   )
   public int field1434;
   @OriginalMember(
      owner = "client!jha",
      name = "h",
      descriptor = "Lclient;"
   )
   public static client field1426;
   @OriginalMember(
      owner = "client!jha",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field1423;
   @OriginalMember(
      owner = "client!jha",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field1427;
   @OriginalMember(
      owner = "client!jha",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field1428;
   @OriginalMember(
      owner = "client!jha",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field1432;

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method961(byte arg0) {
      try {
         ++field1429;
         if (arg0 != 110) {
            field1433 = null;
         }

         int var1 = class359.field5014.method4230(-19719);
         if (~var1 > ~(class161.field2056.length - 1)) {
            class359.field5014 = class161.field2056[var1 + 1];
         }

         return 100;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1435[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method962(int arg0) {
      try {
         field1433 = null;
         if (arg0 == -2) {
            field1424 = null;
            field1426 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1435[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IIIZIII)V"
   )
   public static final void method963(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      try {
         ++field1431;
         if (!arg3) {
            field1424 = null;
         }

         if (~arg5 <= ~class415.field5689 && ~class282.field3921 <= ~arg4 && arg6 >= class577.field8561 && ~class586.field8647 <= ~arg2) {
            if (~arg1 != -2) {
               class612.method4511(-101, arg1, arg4, arg6, arg5, arg0, arg2);
            } else {
               class557.method4201(arg4, arg6, -1, arg0, arg2, arg5);
            }
         } else if (~arg1 == -2) {
            class509.method3839(arg2, arg0, arg4, arg6, -2049, arg5);
         } else {
            class507.method3828(arg4, arg2, (byte)-39, arg6, arg0, arg1, arg5);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1435[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method964(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method965(char[] arg0) {
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
            var10005 = 19;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
