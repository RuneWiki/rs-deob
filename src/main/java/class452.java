import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class452 extends class247 {
   @OriginalMember(
      owner = "client!fj",
      name = "o",
      descriptor = "I"
   )
   public int field6587;
   @OriginalMember(
      owner = "client!fj",
      name = "q",
      descriptor = "I"
   )
   public int field6584;
   @OriginalMember(
      owner = "client!fj",
      name = "j",
      descriptor = "Z"
   )
   public boolean field6586;
   @OriginalMember(
      owner = "client!fj",
      name = "l",
      descriptor = "Lij;"
   )
   public class538 field6590;
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6592 = new String[]{method3491(method3490("Q\u0015U|")), method3491(method3490("Y\n\u0017,\u0003Q\tM.B")), method3491(method3490("DN\u0017>\u0017"))};
   @OriginalMember(
      owner = "client!fj",
      name = "k",
      descriptor = "I"
   )
   public static int field6591 = 0;
   @OriginalMember(
      owner = "client!fj",
      name = "p",
      descriptor = "Z"
   )
   public boolean field6585;
   @OriginalMember(
      owner = "client!fj",
      name = "m",
      descriptor = "Z"
   )
   public boolean field6588;
   @OriginalMember(
      owner = "client!fj",
      name = "n",
      descriptor = "Z"
   )
   public boolean field6589;

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "(ILij;IZ)V"
   )
   public class452(int arg0, class538 arg1, int arg2, boolean arg3) {
      try {
         this.field6587 = arg0;
         this.field6584 = arg2;
         this.field6586 = arg3;
         this.field6590 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6592[1] + arg0 + ',' + (arg1 != null ? field6592[2] : field6592[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
