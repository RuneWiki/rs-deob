import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class111 extends class516 {
   @OriginalMember(
      owner = "client!qha",
      name = "g",
      descriptor = "Lbe;"
   )
   public class40 field1402;
   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1408 = new String[]{method977(method976("j\u0012Q\u0017,3")), method977(method976("j\u0012Q\u0017/3")), method977(method976("`T\u001e\u0017\u0010")), method977(method976("u\u000f\\U")), method977(method976("j\u0012Q\u0017Qr\u0014YMS3"))};
   @OriginalMember(
      owner = "client!qha",
      name = "m",
      descriptor = "I"
   )
   public static int field1400 = 0;
   @OriginalMember(
      owner = "client!qha",
      name = "h",
      descriptor = "I"
   )
   public static int field1406 = 0;
   @OriginalMember(
      owner = "client!qha",
      name = "i",
      descriptor = "I"
   )
   public static int field1401;
   @OriginalMember(
      owner = "client!qha",
      name = "f",
      descriptor = "I"
   )
   public static int field1403;
   @OriginalMember(
      owner = "client!qha",
      name = "l",
      descriptor = "I"
   )
   public static int field1407;
   @OriginalMember(
      owner = "client!qha",
      name = "k",
      descriptor = "Lqh;"
   )
   public static class74 field1405;
   @OriginalMember(
      owner = "client!qha",
      name = "j",
      descriptor = "[[[Lcea;"
   )
   public static class225[][][] field1404;

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method974(byte arg0) {
      try {
         if (arg0 < -119) {
            field1405 = null;
            field1404 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1408[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "<init>",
      descriptor = "(Lor;II[B)V"
   )
   public class111(class670 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field1402 = class273.method2089(arg1, 6406, arg3, 3553, arg2, 6406, arg0, false);
         this.field1402.method4998(10497, false, false);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1408[4] + (arg0 != null ? field1408[2] : field1408[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1408[2] : field1408[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method975(int arg0, int arg1) {
      try {
         class540.field7380 = new int[arg1];
         if (arg0 != 0) {
            field1400 = -87;
         }

         class329.field4719 = new int[arg1];
         class441.field6116 = new int[arg1];
         ++field1403;
         class53.field579 = new int[arg1];
         class779.field11372 = new int[arg1];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1408[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method976(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method977(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
