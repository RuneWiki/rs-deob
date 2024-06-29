import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class421 {
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5905 = method3185(method3184("%EtIm"));
   @OriginalMember(
      owner = "client!sg",
      name = "f",
      descriptor = "[F"
   )
   public static float[] field5899 = new float[2];
   @OriginalMember(
      owner = "client!sg",
      name = "e",
      descriptor = "Lof;"
   )
   public static class653 field5901 = new class653();
   @OriginalMember(
      owner = "client!sg",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field5902 = false;
   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "I"
   )
   public static int field5904;
   @OriginalMember(
      owner = "client!sg",
      name = "c",
      descriptor = "[Lun;"
   )
   public static class448[] field5900;
   @OriginalMember(
      owner = "client!sg",
      name = "b",
      descriptor = "[Leb;"
   )
   public static class657[] field5903;

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3182(int arg0) {
      try {
         if (arg0 != -13476) {
            field5901 = null;
         }

         field5900 = null;
         field5901 = null;
         field5899 = null;
         field5903 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5905 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(Lkl;I)Lkl;"
   )
   public abstract class86 method3183(class86 arg0, int arg1);

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3184(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3185(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
