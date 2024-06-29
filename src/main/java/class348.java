import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class348 extends class247 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5118 = method2758(method2757("\b}I\u0002{"));
   @OriginalMember(
      owner = "client!za",
      name = "m",
      descriptor = "I"
   )
   public static int field5114 = -1;
   @OriginalMember(
      owner = "client!za",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field5116 = new int[1000];
   @OriginalMember(
      owner = "client!za",
      name = "k",
      descriptor = "I"
   )
   public static int field5113;
   @OriginalMember(
      owner = "client!za",
      name = "n",
      descriptor = "I"
   )
   public static int field5115;
   @OriginalMember(
      owner = "client!za",
      name = "l",
      descriptor = "I"
   )
   public static int field5117;
   @OriginalMember(
      owner = "client!za",
      name = "j",
      descriptor = "Lsa;"
   )
   public static class39 field5112;

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2756(byte arg0) {
      try {
         field5116 = null;
         int var1 = 49 / ((arg0 - -34) / 45);
         field5112 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5118 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2757(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2758(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
