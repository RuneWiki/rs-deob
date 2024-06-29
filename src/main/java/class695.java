import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class695 {
   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "[I"
   )
   public int[] field10320;
   @OriginalMember(
      owner = "client!br",
      name = "c",
      descriptor = "[I"
   )
   public int[] field10323;
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "[[F"
   )
   public float[][] field10321;
   @OriginalMember(
      owner = "client!br",
      name = "f",
      descriptor = "[I"
   )
   public int[] field10325;
   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10326 = new String[]{method5112(method5111("B*g\u001b\n")), method5112(method5111("N-%6")), method5112(method5111("[vgt_")), method5112(method5111("B*gfKN1=d\n"))};
   @OriginalMember(
      owner = "client!br",
      name = "e",
      descriptor = "Ljw;"
   )
   public static class779 field10322 = new class779(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!br",
      name = "d",
      descriptor = "I"
   )
   public static int field10324;

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5110(byte arg0) {
      try {
         if (arg0 != 67) {
            method5110((byte)100);
         }

         field10322 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10326[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "<init>",
      descriptor = "([I[I[I[[F)V"
   )
   public class695(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field10320 = arg2;
         this.field10323 = arg0;
         this.field10321 = arg3;
         this.field10325 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10326[3] + (arg0 != null ? field10326[2] : field10326[1]) + ',' + (arg1 != null ? field10326[2] : field10326[1]) + ',' + (arg2 != null ? field10326[2] : field10326[1]) + ',' + (arg3 != null ? field10326[2] : field10326[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5111(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5112(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
