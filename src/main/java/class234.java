import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class234 {
   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3586 = new String[]{method2017(method2016("B%'d")), method2017(method2016("Y6*&\u0016\u0004")), method2017(method2016("W~e&(")), method2017(method2016("Y6*&\u0010\u0004")), method2017(method2016("Y6*&\u0011\u0004")), method2017(method2016("Y6*&\u0017\u0004"))};
   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "[B"
   )
   public static byte[] field3579 = new byte[520];
   @OriginalMember(
      owner = "client!ufa",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field3584 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
   @OriginalMember(
      owner = "client!ufa",
      name = "f",
      descriptor = "I"
   )
   public static int field3585 = 1;
   @OriginalMember(
      owner = "client!ufa",
      name = "d",
      descriptor = "D"
   )
   public static double field3582;
   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "I"
   )
   public static int field3578;
   @OriginalMember(
      owner = "client!ufa",
      name = "h",
      descriptor = "I"
   )
   public static int field3580;
   @OriginalMember(
      owner = "client!ufa",
      name = "e",
      descriptor = "I"
   )
   public static int field3581;
   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "I"
   )
   public static int field3583;

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(ZIILjava/lang/String;Ljava/lang/String;ZI)V"
   )
   public static final void method2011(boolean param0, int param1, int param2, String param3, String param4, boolean param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2012(boolean arg0) {
      try {
         field3579 = null;
         if (arg0) {
            field3584 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3586[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(IIIZI)I"
   )
   private static final int method2013(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         if (!arg3) {
            field3584 = null;
         }

         ++field3578;
         int var5 = -class83.field1194[arg1 * 8192 / arg4] + 65536 >> 1;
         return ((-var5 + 65536) * arg2 >> 16) - -(arg0 * var5 >> 16);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3586[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2014() {
      for(int var0 = 0; var0 < class238.field3620.length; ++var0) {
         class238.field3620[var0].method4101();
      }

      class238.field3620 = null;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(IIIB)I"
   )
   public static final int method2015(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field3581;
         int var4 = arg2 / arg1;
         int var5 = arg1 + -1 & arg2;
         if (arg3 >= -1) {
            field3582 = 0.15183673447138804D;
         }

         int var6 = arg0 / arg1;
         int var7 = arg1 - 1 & arg0;
         int var8 = class179.method1627(var4, -1, var6);
         int var9 = class179.method1627(var4 + 1, -1, var6);
         int var10 = class179.method1627(var4, -1, var6 + 1);
         int var11 = class179.method1627(var4 + 1, -1, var6 + 1);
         int var12 = method2013(var9, var5, var8, true, arg1);
         int var13 = method2013(var11, var5, var10, true, arg1);
         return method2013(var13, var7, var12, true, arg1);
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field3586[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2016(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2017(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
