import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class609 {
   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8871 = method4488(method4487("\t\u000f%b@"));
   @OriginalMember(
      owner = "client!ls",
      name = "d",
      descriptor = "Llb;"
   )
   public static class246 field8867 = new class246(true);
   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "Ljw;"
   )
   public static class779 field8869 = new class779(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!ls",
      name = "b",
      descriptor = "Lrr;"
   )
   public static class678 field8868;
   @OriginalMember(
      owner = "client!ls",
      name = "c",
      descriptor = "Lkp;"
   )
   public static class776 field8870;

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method4486(int arg0) {
      try {
         field8869 = null;
         field8870 = null;
         if (arg0 == 18814) {
            field8868 = null;
            field8867 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8871 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
