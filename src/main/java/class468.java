import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class468 {
   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7010 = new String[]{method3501(method3500("B<U:X")), method3501(method3500("B<U9X"))};
   @OriginalMember(
      owner = "client!lv",
      name = "e",
      descriptor = "Lsda;"
   )
   public static class269 field7006 = new class269(46, 4);
   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field7008 = new float[4];
   @OriginalMember(
      owner = "client!lv",
      name = "c",
      descriptor = "D"
   )
   public static double field7007;
   @OriginalMember(
      owner = "client!lv",
      name = "d",
      descriptor = "I"
   )
   public static int field7005;
   @OriginalMember(
      owner = "client!lv",
      name = "b",
      descriptor = "Lhv;"
   )
   public static class544 field7009;

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3498(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3499(byte arg0) {
      try {
         field7006 = null;
         field7008 = null;
         field7009 = null;
         if (arg0 <= 83) {
            field7006 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7010[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
