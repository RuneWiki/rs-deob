import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class700 {
   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "[I"
   )
   public int[] field10254;
   @OriginalMember(
      owner = "client!qi",
      name = "h",
      descriptor = "[I"
   )
   public int[] field10256;
   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "[[F"
   )
   public float[][] field10252;
   @OriginalMember(
      owner = "client!qi",
      name = "e",
      descriptor = "[I"
   )
   public int[] field10257;
   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10260 = new String[]{method5103(method5102("\\Fqu8")), method5103(method5102("V\u0001q\u001am")), method5103(method5102("\\Fq\byCF+\n8")), method5103(method5102("CZ3X"))};
   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "I"
   )
   public static int field10258 = 0;
   @OriginalMember(
      owner = "client!qi",
      name = "d",
      descriptor = "Lbu;"
   )
   public static class596 field10253 = new class596();
   @OriginalMember(
      owner = "client!qi",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10255;
   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "[Lef;"
   )
   public static class204[] field10259;

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "([I[I[I[[F)V"
   )
   public class700(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field10254 = arg1;
         this.field10256 = arg2;
         this.field10252 = arg3;
         this.field10257 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10260[2] + (arg0 != null ? field10260[1] : field10260[3]) + ',' + (arg1 != null ? field10260[1] : field10260[3]) + ',' + (arg2 != null ? field10260[1] : field10260[3]) + ',' + (arg3 != null ? field10260[1] : field10260[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5101(byte arg0) {
      try {
         int var1 = 82 / ((arg0 - 50) / 37);
         field10259 = null;
         field10255 = null;
         field10253 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10260[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5102(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5103(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
