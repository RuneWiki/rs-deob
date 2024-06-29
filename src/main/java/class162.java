import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class162 {
   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2063 = new String[]{method1352(method1351("c3HMp")), method1352(method1351("rz\u0007ML0")), method1352(method1351("vh\n\u000f")), method1352(method1351("rz\u0007MO0"))};
   @OriginalMember(
      owner = "client!jga",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2061 = new int[200];
   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field2062 = new class418(126, 6);
   @OriginalMember(
      owner = "client!jga",
      name = "b",
      descriptor = "I"
   )
   public static int field2060;

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "([I[II)V"
   )
   public static final void method1349(int[] param0, int[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1350(int arg0) {
      try {
         if (arg0 != 6) {
            method1349((int[])null, (int[])null, 76);
         }

         field2061 = null;
         field2062 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2063[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1351(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1352(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
