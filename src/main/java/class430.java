import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class430 {
   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6641 = new String[]{method3404(method3403(";C\u0019S\r{")), method3404(method3403(";C\u0019S;<r\f\u000f&=FP")), method3404(method3403(";C\u0019S\u000e{"))};
   @OriginalMember(
      owner = "client!hba",
      name = "d",
      descriptor = "Lhba;"
   )
   public static class430 field6635 = new class430();
   @OriginalMember(
      owner = "client!hba",
      name = "h",
      descriptor = "Lhba;"
   )
   public static class430 field6636 = new class430();
   @OriginalMember(
      owner = "client!hba",
      name = "e",
      descriptor = "Lhba;"
   )
   public static class430 field6637 = new class430();
   @OriginalMember(
      owner = "client!hba",
      name = "g",
      descriptor = "Lhba;"
   )
   public static class430 field6638 = new class430();
   @OriginalMember(
      owner = "client!hba",
      name = "b",
      descriptor = "Luk;"
   )
   public static class498 field6639 = new class498(132, 10);
   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "I"
   )
   public static int field6633;
   @OriginalMember(
      owner = "client!hba",
      name = "c",
      descriptor = "I"
   )
   public static int field6634;
   @OriginalMember(
      owner = "client!hba",
      name = "f",
      descriptor = "I"
   )
   public static int field6640;

   @OriginalMember(
      owner = "client!hba",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6634;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6641[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3401(int arg0) {
      try {
         field6637 = null;
         field6635 = null;
         field6636 = null;
         if (arg0 == 132) {
            field6638 = null;
            field6639 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6641[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(DI)V"
   )
   public static final void method3402(double arg0, int arg1) {
      try {
         class412.field6408.method1549(class691.field10264);
         ++field6633;
         class412.field6408.method1546(0, 0, (int)arg0);
         int var3 = -124 % ((arg1 - -16) / 46);
         class450.field6888.method688(class412.field6408);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6641[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3404(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
