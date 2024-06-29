import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class499 {
   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "I"
   )
   public int field6961;
   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6962 = new String[]{method3787(method3786("\t\ni\fj\u0003\u00133\u000e+")), method3787(method3786("\t\niDl>\u000e5Ym\nR")), method3787(method3786("\t\niq+"))};
   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6959 = new int[2];
   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "I"
   )
   public static int field6960;

   @OriginalMember(
      owner = "client!dp",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6960;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6962[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3785(byte arg0) {
      try {
         if (arg0 == 3) {
            field6959 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6962[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class499(int arg0, int arg1) {
      try {
         this.field6961 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6962[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3786(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3787(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
