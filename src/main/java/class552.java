import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class552 {
   @OriginalMember(
      owner = "client!pa",
      name = "c",
      descriptor = "[[F"
   )
   public float[][] field7872;
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "[I"
   )
   public int[] field7875;
   @OriginalMember(
      owner = "client!pa",
      name = "d",
      descriptor = "[I"
   )
   public int[] field7871;
   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "[I"
   )
   public int[] field7873;
   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7877 = new String[]{method4134(method4133("Z*\u0005\u0002\rD\"_\u0000L")), method4134(method4133("D>GR")), method4134(method4133("Qe\u0005\u0010\u0019"))};
   @OriginalMember(
      owner = "client!pa",
      name = "f",
      descriptor = "I"
   )
   public static int field7874 = 0;
   @OriginalMember(
      owner = "client!pa",
      name = "e",
      descriptor = "I"
   )
   public static int field7876;

   @OriginalMember(
      owner = "client!pa",
      name = "<init>",
      descriptor = "([I[I[I[[F)V"
   )
   public class552(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field7872 = arg3;
         this.field7875 = arg0;
         this.field7871 = arg1;
         this.field7873 = arg2;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7877[0] + (arg0 != null ? field7877[2] : field7877[1]) + ',' + (arg1 != null ? field7877[2] : field7877[1]) + ',' + (arg2 != null ? field7877[2] : field7877[1]) + ',' + (arg3 != null ? field7877[2] : field7877[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4133(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4134(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
