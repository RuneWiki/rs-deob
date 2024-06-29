import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class502 extends class428 {
   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7293 = method3646(method3645("SQo[\u0013\u0014"));
   @OriginalMember(
      owner = "client!oga",
      name = "q",
      descriptor = "I"
   )
   public static int field7285 = -1;
   @OriginalMember(
      owner = "client!oga",
      name = "o",
      descriptor = "I"
   )
   public static int field7282;
   @OriginalMember(
      owner = "client!oga",
      name = "n",
      descriptor = "I"
   )
   public int field7286;
   @OriginalMember(
      owner = "client!oga",
      name = "s",
      descriptor = "I"
   )
   public int field7288;
   @OriginalMember(
      owner = "client!oga",
      name = "w",
      descriptor = "I"
   )
   public static int field7289;
   @OriginalMember(
      owner = "client!oga",
      name = "v",
      descriptor = "J"
   )
   public static long field7290;
   @OriginalMember(
      owner = "client!oga",
      name = "r",
      descriptor = "[I"
   )
   public int[] field7284;
   @OriginalMember(
      owner = "client!oga",
      name = "m",
      descriptor = "[I"
   )
   public int[] field7287;
   @OriginalMember(
      owner = "client!oga",
      name = "p",
      descriptor = "[I"
   )
   public int[] field7292;
   @OriginalMember(
      owner = "client!oga",
      name = "t",
      descriptor = "[Lvca;"
   )
   public class296[] field7283;
   @OriginalMember(
      owner = "client!oga",
      name = "u",
      descriptor = "[Lvca;"
   )
   public class296[] field7291;
   @OriginalMember(
      owner = "client!oga",
      name = "x",
      descriptor = "[[[B"
   )
   public byte[][][] field7281;

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method3644(int arg0, boolean arg1, int arg2) {
      try {
         ++field7289;
         if (arg1) {
            method3644(65, true, 62);
         }

         return ~(arg0 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7293 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3646(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
