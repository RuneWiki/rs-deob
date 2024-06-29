import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class604 extends class22 {
   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8876 = new String[]{method4478(method4477("\u0010R=F\n]")), method4478(method4477("\u001bO0\u0004")), method4478(method4477("\u0010R=F\u000f]")), method4478(method4477("\u000e\u0014rF1"))};
   @OriginalMember(
      owner = "client!eha",
      name = "d",
      descriptor = "I"
   )
   public static int field8874;
   @OriginalMember(
      owner = "client!eha",
      name = "e",
      descriptor = "I"
   )
   public static int field8875;
   @OriginalMember(
      owner = "client!eha",
      name = "c",
      descriptor = "Lww;"
   )
   public static class339 field8873;

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method4475(byte arg0, String arg1) {
      try {
         ++field8874;
         if (!arg1.equals("")) {
            ++class98.field1297;
            if (arg0 <= 59) {
               field8875 = -72;
            }

            class594 var2 = class145.method1177((byte)117);
            class702 var3 = class19.method142(var2.field8765, class647.field9683, (byte)-77);
            var3.field10264.method593(class398.method3129(12, arg1), 867770704);
            var3.field10264.method595(-15010, arg1);
            var2.method4423(var3, (byte)107);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8876[2] + arg0 + ',' + (arg1 != null ? field8876[3] : field8876[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4476(byte arg0) {
      try {
         field8873 = null;
         if (arg0 != 107) {
            field8875 = -16;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8876[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
