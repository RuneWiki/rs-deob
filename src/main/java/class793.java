import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class793 {
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11604 = new String[]{method5726(method5725("s\u000e\u0018\u0018")), method5726(method5725("fUZZN")), method5726(method5725("s\u000fZ5\u001b")), method5726(method5725("s\u000fZ0\u001b")), method5726(method5725("s\u000fZ7\u001b")), method5726(method5725("s\u000fZ6\u001b"))};
   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "Ldp;"
   )
   public static class499 field11596 = new class499(3, 2);
   @OriginalMember(
      owner = "client!nt",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field11599 = new class418(65, 7);
   @OriginalMember(
      owner = "client!nt",
      name = "e",
      descriptor = "Lhv;"
   )
   public static class227 field11600 = new class227(512);
   @OriginalMember(
      owner = "client!nt",
      name = "h",
      descriptor = "[[I"
   )
   public static int[][] field11603 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "I"
   )
   public static int field11597;
   @OriginalMember(
      owner = "client!nt",
      name = "f",
      descriptor = "I"
   )
   public static int field11598;
   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "I"
   )
   public static int field11601;
   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "Lpd;"
   )
   public static class648 field11602;

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5721(int arg0) {
      try {
         int var1 = -76 / ((29 - arg0) / 51);
         field11603 = null;
         field11596 = null;
         field11600 = null;
         field11602 = null;
         field11599 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11604[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(FFFB)F"
   )
   public static final float method5722(float arg0, float arg1, float arg2, byte arg3) {
      try {
         if (arg3 != 67) {
            return -1.3717368F;
         } else {
            ++field11598;
            return (arg1 - arg2) * arg0 + arg2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11604[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(BILsa;I)V"
   )
   public static final void method5723(byte arg0, int arg1, class783 arg2, int arg3) {
      try {
         if (arg0 < 30) {
            method5723((byte)68, 28, (class783)null, -124);
         }

         ++field11597;
         int[] var4 = new int[4];
         class349.method2764(var4, 0, var4.length, arg3);
         class705.method5126(var4, -22952, arg2, arg1);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11604[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11604[1] : field11604[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(BIIIIII)J"
   )
   public static final long method5724(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg0 != -114) {
            field11596 = null;
         }

         class585.field8632.clear();
         ++field11601;
         class585.field8632.set(arg6, arg3, arg5, arg4, arg2, arg1);
         return class585.field8632.getTime().getTime();
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11604[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5725(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5726(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
