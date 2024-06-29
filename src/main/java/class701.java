import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class701 extends class515 {
   @OriginalMember(
      owner = "client!vfa",
      name = "m",
      descriptor = "[I"
   )
   public int[] field10256;
   @OriginalMember(
      owner = "client!vfa",
      name = "l",
      descriptor = "[I"
   )
   public int[] field10255;
   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10257 = new String[]{method5092(method5091("F'\u0003\u0016")), method5092(method5091("S|AT5")), method5092(method5091("^4\u000eTtA<\u0006\u000ev\u0000")), method5092(method5091("^4\u000eT\t\u0000"))};
   @OriginalMember(
      owner = "client!vfa",
      name = "n",
      descriptor = "Lgo;"
   )
   public static class656 field10254 = new class656();

   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5090(int arg0) {
      try {
         int var1 = -3 % ((arg0 - -68) / 47);
         field10254 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10257[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "<init>",
      descriptor = "(II[I[I)V"
   )
   public class701(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field10256 = arg2;
         this.field10255 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10257[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10257[1] : field10257[0]) + ',' + (arg3 != null ? field10257[1] : field10257[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5091(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5092(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
