import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class585 {
   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8637 = new String[]{method4368(method4367("2-O0}")), method4368(method4367("9wO_(")), method4368(method4367(",,\r\u001d")), method4368(method4367("2-O3}"))};
   @OriginalMember(
      owner = "client!pt",
      name = "g",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field8631 = Calendar.getInstance();
   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field8632 = Calendar.getInstance(TimeZone.getTimeZone(method4368(method4367("\u0005\u00145"))));
   @OriginalMember(
      owner = "client!pt",
      name = "d",
      descriptor = "Lae;"
   )
   public static class285 field8633 = new class285(method4368(method4367("\u0010\u001a")), 1);
   @OriginalMember(
      owner = "client!pt",
      name = "f",
      descriptor = "Llia;"
   )
   public static class633 field8634 = new class633(method4368(method4367("\u000e\u0016\"0\u0019")), "", method4368(method4367(".6\u0002\u00109")), 4);
   @OriginalMember(
      owner = "client!pt",
      name = "c",
      descriptor = "I"
   )
   public static int field8630;
   @OriginalMember(
      owner = "client!pt",
      name = "b",
      descriptor = "I"
   )
   public static int field8636;
   @OriginalMember(
      owner = "client!pt",
      name = "e",
      descriptor = "Let;"
   )
   public static class753 field8635;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V"
   )
   public static final void method4365(boolean arg0, String arg1) {
      try {
         if (!arg0) {
            field8633 = null;
         }

         ++field8630;
         class702.method5107(0, 0, arg1, "", -18224, "", "");
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8637[3] + arg0 + ',' + (arg1 != null ? field8637[1] : field8637[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4366(int arg0) {
      try {
         field8633 = null;
         if (arg0 == 17709) {
            field8631 = null;
            field8635 = null;
            field8634 = null;
            field8632 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8637[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4367(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4368(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
