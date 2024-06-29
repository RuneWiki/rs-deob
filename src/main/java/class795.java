import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class class795 extends class15 {
   @OriginalMember(
      owner = "client!wv",
      name = "w",
      descriptor = "Z"
   )
   public volatile boolean field11623 = true;
   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11629 = method5734(method5733("&P-\u0014!"));
   @OriginalMember(
      owner = "client!wv",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field11622 = false;
   @OriginalMember(
      owner = "client!wv",
      name = "s",
      descriptor = "I"
   )
   public static int field11627 = 0;
   @OriginalMember(
      owner = "client!wv",
      name = "v",
      descriptor = "[[I"
   )
   public static int[][] field11626 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!wv",
      name = "u",
      descriptor = "Lpu;"
   )
   public static class601 field11625;
   @OriginalMember(
      owner = "client!wv",
      name = "y",
      descriptor = "Z"
   )
   public boolean field11624;
   @OriginalMember(
      owner = "client!wv",
      name = "t",
      descriptor = "Z"
   )
   public boolean field11628;

   @OriginalMember(
      owner = "client!wv",
      name = "d",
      descriptor = "(I)[B"
   )
   public abstract byte[] method4356(int arg0);

   @OriginalMember(
      owner = "client!wv",
      name = "c",
      descriptor = "(I)I"
   )
   public abstract int method4354(int arg0);

   @OriginalMember(
      owner = "client!wv",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method5732(int arg0) {
      try {
         if (arg0 != 12) {
            method5732(-37);
         }

         field11625 = null;
         field11626 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11629 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5733(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5734(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
