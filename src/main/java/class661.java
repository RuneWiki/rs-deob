import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class661 {
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9820 = method4838(method4837("\r<^QE"));
   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "I"
   )
   public static int field9818 = 0;
   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "I"
   )
   public static volatile int field9817 = -1;
   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "I"
   )
   public static int field9819;

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method4836(byte arg0, int arg1, int arg2) {
      try {
         ++field9819;
         if (arg0 != 96) {
            field9817 = -50;
         }

         class244 var3 = class475.field6627[arg1][arg2];
         if (var3 != null) {
            class91.field1223 = var3.field3081;
            class419.field5720 = var3.field3086;
            class262.field3330 = var3.field3088;
         }

         class526.method3932((byte)-74);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9820 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4837(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4838(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
