import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class164 {
   @OriginalMember(
      owner = "client!as",
      name = "d",
      descriptor = "[S"
   )
   public short[] field2322;
   @OriginalMember(
      owner = "client!as",
      name = "e",
      descriptor = "[S"
   )
   public short[] field2323;
   @OriginalMember(
      owner = "client!as",
      name = "c",
      descriptor = "[I"
   )
   public int[] field2324;
   @OriginalMember(
      owner = "client!as",
      name = "b",
      descriptor = "J"
   )
   public long field2321;
   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2325 = new String[]{method1364(method1363("Jv<p")), method1364(method1363("Ep~ \u0018Jj$\"Y")), method1364(method1363("_-~2\f"))};
   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "I"
   )
   public static int field2320 = 0;

   @OriginalMember(
      owner = "client!as",
      name = "<init>",
      descriptor = "(J[I[S[S)V",
      line = 12
   )
   public class164(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field2322 = arg3;
         this.field2323 = arg2;
         this.field2324 = arg1;
         this.field2321 = arg0;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2325[1] + arg0 + ',' + (arg1 != null ? field2325[2] : field2325[0]) + ',' + (arg2 != null ? field2325[2] : field2325[0]) + ',' + (arg3 != null ? field2325[2] : field2325[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "<init>",
      descriptor = "()V",
      line = 22
   )
   protected class164() {
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
