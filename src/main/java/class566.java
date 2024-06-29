import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class566 {
   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7724 = new String[]{method4059(method4058("\u007f}>Y\u0019")), method4059(method4058("\u007f}>l^Nobq_z3"))};
   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "Lbf;"
   )
   public static class566 field7718 = new class566();
   @OriginalMember(
      owner = "client!bf",
      name = "d",
      descriptor = "Lbf;"
   )
   public static class566 field7719 = new class566();
   @OriginalMember(
      owner = "client!bf",
      name = "c",
      descriptor = "Lbf;"
   )
   public static class566 field7720 = new class566();
   @OriginalMember(
      owner = "client!bf",
      name = "f",
      descriptor = "Lbf;"
   )
   public static class566 field7721 = new class566();
   @OriginalMember(
      owner = "client!bf",
      name = "h",
      descriptor = "[C"
   )
   public static char[] field7723 = new char[]{'[', ']', '#'};
   @OriginalMember(
      owner = "client!bf",
      name = "g",
      descriptor = "I"
   )
   public static int field7716;
   @OriginalMember(
      owner = "client!bf",
      name = "e",
      descriptor = "I"
   )
   public static int field7717;
   @OriginalMember(
      owner = "client!bf",
      name = "b",
      descriptor = "I"
   )
   public static int field7722;

   @OriginalMember(
      owner = "client!bf",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field7717;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7724[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4057(int arg0) {
      try {
         field7719 = null;
         field7720 = null;
         field7718 = null;
         if (arg0 != -7317) {
            field7718 = null;
         }

         field7723 = null;
         field7721 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7724[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4058(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4059(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
