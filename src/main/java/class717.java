import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class717 {
   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field10663;
   @OriginalMember(
      owner = "client!jm",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field10662;
   @OriginalMember(
      owner = "client!jm",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field10664;
   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10666 = new String[]{method5188(method5187("\u0012|s@\"")), method5188(method5187("\u0003?s/w")), method5188(method5187("\u0012|s=c\u0016x)?\"")), method5188(method5187("\u0016d1m"))};
   @OriginalMember(
      owner = "client!jm",
      name = "d",
      descriptor = "I"
   )
   public static int field10661 = 0;
   @OriginalMember(
      owner = "client!jm",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field10665 = new int[1];

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method5185(int arg0) {
      try {
         field10665 = null;
         if (arg0 < 105) {
            method5186(-121, -108, -26);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10666[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(III)Lhe;",
      line = 19
   )
   public static final class389 method5186(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      return var3 == null ? null : var3.field910;
   }

   @OriginalMember(
      owner = "client!jm",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
      line = 31
   )
   public class717(String arg0, String arg1, String arg2) {
      try {
         this.field10663 = arg1;
         this.field10662 = arg0;
         this.field10664 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10666[2] + (arg0 != null ? field10666[1] : field10666[3]) + ',' + (arg1 != null ? field10666[1] : field10666[3]) + ',' + (arg2 != null ? field10666[1] : field10666[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5187(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5188(char[] arg0) {
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
            var10005 = 17;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
