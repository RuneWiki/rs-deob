import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class684 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9887 = new String[]{method4985(method4984("=\"se")), method4985(method4984("(y1'\u001c")), method4985(method4984("261OI"))};
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field9885 = false;
   @OriginalMember(
      owner = "client!aa",
      name = "c",
      descriptor = "I"
   )
   public static int field9884;
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "I"
   )
   public static int field9886;

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method4983(int arg0, class17 arg1) {
      try {
         class666.field9377 = class702.method5125(class313.field4704, arg1, true, false);
         ++field9886;
         class537.field7543 = class50.method543(arg1, 0, class313.field4704);
         if (arg0 != 27395) {
            method4983(31, (class17)null);
         }

         class510.field7243 = class702.method5125(class622.field8893, arg1, true, false);
         class383.field5587 = class50.method543(arg1, 0, class622.field8893);
         class437.field6409 = class702.method5125(class502.field7166, arg1, true, false);
         class705.field10143 = class50.method543(arg1, 0, class502.field7166);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9887[2] + arg0 + ',' + (arg1 != null ? field9887[1] : field9887[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4984(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4985(char[] arg0) {
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
            var10005 = 87;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
