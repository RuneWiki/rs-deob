import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class591 {
   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8360 = new String[]{method4349(method4348("\u001a\n\tH{")), method4349(method4348("\u000b\u000bSK0\u001b\u000bTy:\u001a\u0002B")), method4349(method4348("\u0016\u000fJo")), method4349(method4348("\u0012\u000fQk}\u0014\u000fIm};\u0002Fy 4\u0001Fn6\n")), method4349(method4348("\u0010\u000fIn?\u001d")), method4349(method4348("\u0012\u000fQk}\u0014\u000fIm}\n\u000bAf6\u001b\u001a\tK0\u001b\u000bTy:\u001a\u0002BE1\u0012\u000bD~")), method4349(method4348("\u0016\u000fSc%\u001d\"Nh!\u0019\u001cNo ")), method4349(method4348("\u001e\u0007Ik?\u0011\u0014B")), method4349(method4348("\u001a\n\tK{"))};
   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field8356 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
   @OriginalMember(
      owner = "client!bd",
      name = "c",
      descriptor = "I"
   )
   public static int field8358 = 0;
   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field8359 = false;
   @OriginalMember(
      owner = "client!bd",
      name = "d",
      descriptor = "I"
   )
   public static int field8357;

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method4346(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4347(byte arg0) {
      try {
         if (arg0 != -83) {
            method4347((byte)117);
         }

         field8356 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8360[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4349(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
