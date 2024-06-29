import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class788 {
   @OriginalMember(
      owner = "client!kia",
      name = "e",
      descriptor = "I"
   )
   public int field11484;
   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11488 = new String[]{method5694(method5693("C$\\PgA#T\ne\u0000")), method5694(method5693("C$\\P\u001a\u0000")), method5694(method5693("F8Q\u0012")), method5694(method5693("C$\\P\u0019\u0000")), method5694(method5693("Sc\u0013P&")), method5694(method5693("C$\\P/G\u001eI\f2F*\u0015"))};
   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "I"
   )
   public static int field11483 = 0;
   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "I"
   )
   public static int field11485;
   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "I"
   )
   public static int field11487;
   @OriginalMember(
      owner = "client!kia",
      name = "d",
      descriptor = "[Lwb;"
   )
   public static class578[] field11486;
   @OriginalMember(
      owner = "client!kia",
      name = "f",
      descriptor = "[[I"
   )
   public static int[][] field11482;

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5691(byte arg0) {
      try {
         field11486 = null;
         field11482 = null;
         if (arg0 > -109) {
            method5691((byte)119);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11488[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11485;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11488[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class788(int arg0, int arg1) {
      try {
         this.field11484 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11488[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(Ljava/lang/String;II)I"
   )
   public static final int method5692(String arg0, int arg1, int arg2) {
      try {
         ++field11487;
         if (arg1 < 70) {
            field11482 = null;
         }

         return class24.method312(arg0, arg2, true, -37);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11488[3] + (arg0 != null ? field11488[4] : field11488[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5693(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5694(char[] arg0) {
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
            var10005 = 77;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
