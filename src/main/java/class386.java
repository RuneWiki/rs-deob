import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class386 {
   @OriginalMember(
      owner = "client!uv",
      name = "k",
      descriptor = "I"
   )
   public int field5406;
   @OriginalMember(
      owner = "client!uv",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field5405;
   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "I"
   )
   public int field5409;
   @OriginalMember(
      owner = "client!uv",
      name = "h",
      descriptor = "J"
   )
   public long field5412;
   @OriginalMember(
      owner = "client!uv",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field5411;
   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5417 = new String[]{method2957(method2956("\"~\u0014\u000b<")), method2957(method2956("\"~\u0014v}9aNt<")), method2957(method2956("9}V&")), method2957(method2956(",&\u0014di"))};
   @OriginalMember(
      owner = "client!uv",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field5410 = new int[200];
   @OriginalMember(
      owner = "client!uv",
      name = "i",
      descriptor = "Lbga;"
   )
   public static class378 field5414 = new class378(51, 3);
   @OriginalMember(
      owner = "client!uv",
      name = "c",
      descriptor = "Lo;"
   )
   public static class31 field5415 = new class31(13, 7);
   @OriginalMember(
      owner = "client!uv",
      name = "e",
      descriptor = "F"
   )
   public static float field5408;
   @OriginalMember(
      owner = "client!uv",
      name = "l",
      descriptor = "I"
   )
   public static int field5413;
   @OriginalMember(
      owner = "client!uv",
      name = "b",
      descriptor = "I"
   )
   public static int field5416;
   @OriginalMember(
      owner = "client!uv",
      name = "j",
      descriptor = "[[[B"
   )
   public static byte[][][] field5407;

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2955(byte arg0) {
      try {
         field5415 = null;
         field5410 = null;
         field5414 = null;
         field5407 = null;
         if (arg0 < 2) {
            method2955((byte)74);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5417[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V"
   )
   public class386(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field5406 = arg2;
         this.field5405 = arg1;
         this.field5409 = arg0;
         this.field5412 = arg4;
         this.field5411 = arg3;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5417[1] + arg0 + ',' + (arg1 != null ? field5417[3] : field5417[2]) + ',' + arg2 + ',' + (arg3 != null ? field5417[3] : field5417[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2956(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2957(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
