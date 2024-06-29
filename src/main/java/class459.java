import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class459 extends class22 {
   @OriginalMember(
      owner = "client!io",
      name = "n",
      descriptor = "I"
   )
   public int field6727;
   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6734 = new String[]{method3453(method3452("\n1cD\u0019")), method3453(method3452("\n1c9X\r79;\u0019"))};
   @OriginalMember(
      owner = "client!io",
      name = "p",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field6726 = new String[][]{{method3453(method3452(")?#")), method3453(method3452("%;/")), method3453(method3452(".??")), method3453(method3452("\".?")), method3453(method3452(".?4")), method3453(method3452(")+#")), method3453(method3452(")+!")), method3453(method3452("\"+*")), method3453(method3452("0;=")), method3453(method3452(",=9")), method3453(method3452("-1;")), method3453(method3452("';."))}, {method3453(method3452(")?#")), method3453(method3452("%;/")), method3453(method3452(".º?")), method3453(method3452("\".?")), method3453(method3452(".?$")), method3453(method3452(")+#")), method3453(method3452(")+!")), method3453(method3452("\"+*")), method3453(method3452("0;=")), method3453(method3452(",59")), method3453(method3452("-1;")), method3453(method3452("';7"))}, {method3453(method3452("\t?#")), method3453(method3452("\u0005·;")), method3453(method3452("\u000e??v")), method3453(method3452("\u0002(?")), method3453(method3452("\u000e?$")), method3453(method3452("\t+$k")), method3453(method3452("\t+$i")), method3453(method3452("\u00021¶q")), method3453(method3452("\u0010;=q")), method3453(method3452("\f=9")), method3453(method3452("\r1;")), method3453(method3452("\u0007·."))}, {method3453(method3452("\t?#")), method3453(method3452("\u0005;;")), method3453(method3452("\u000e??")), method3453(method3452("\u0002<?")), method3453(method3452("\u000e?$")), method3453(method3452("\t+#")), method3453(method3452("\t+!")), method3453(method3452("\u00029\"")), method3453(method3452("\u0010;9")), method3453(method3452("\f+9")), method3453(method3452("\r1;")), method3453(method3452("\u0007;7"))}, {method3453(method3452("\t?#")), method3453(method3452("\u0005;/")), method3453(method3452("\u000e,9")), method3453(method3452("\u0002.?")), method3453(method3452("\u000e;$")), method3453(method3452("\t+#")), method3453(method3452("\t+!")), method3453(method3452("\u0002+*")), method3453(method3452("\u0010;=")), method3453(method3452("\f59")), method3453(method3452("\r1;")), method3453(method3452("\u0007;."))}};
   @OriginalMember(
      owner = "client!io",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field6728 = null;
   @OriginalMember(
      owner = "client!io",
      name = "m",
      descriptor = "Lca;"
   )
   public static class320 field6730 = new class320(method3453(method3452("\u0011+#`B\u0000?=`")), method3453(method3452("1+#`b\u0000?=`")), 0);
   @OriginalMember(
      owner = "client!io",
      name = "o",
      descriptor = "I"
   )
   public static int field6733 = 1406;
   @OriginalMember(
      owner = "client!io",
      name = "k",
      descriptor = "Lgh;"
   )
   public static class572 field6731 = new class572(20, 3);
   @OriginalMember(
      owner = "client!io",
      name = "j",
      descriptor = "I"
   )
   public static int field6729;
   @OriginalMember(
      owner = "client!io",
      name = "l",
      descriptor = "Lfk;"
   )
   public static class678 field6732;

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3451(int arg0) {
      try {
         field6728 = null;
         field6731 = null;
         field6730 = null;
         field6732 = null;
         field6726 = null;
         if (arg0 != -15917) {
            field6730 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6734[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "<init>",
      descriptor = "()V"
   )
   public class459() {
   }

   @OriginalMember(
      owner = "client!io",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class459(int arg0) {
      try {
         this.field6727 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6734[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3452(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3453(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
