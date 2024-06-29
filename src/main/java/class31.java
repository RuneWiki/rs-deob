import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 {
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field478 = new String[]{method233(method232("c4\u0014-")), method233(method232("c4\u0012-")), method233(method232("c4\u0013-")), method233(method232("c4\u0011-")), method233(method232("bo<i")), method233(method232("w4~+&"))};
   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "I"
   )
   public static int field473;
   @OriginalMember(
      owner = "client!o",
      name = "d",
      descriptor = "I"
   )
   public static int field475;
   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "I"
   )
   public static int field476;
   @OriginalMember(
      owner = "client!o",
      name = "e",
      descriptor = "I"
   )
   public static int field477;
   @OriginalMember(
      owner = "client!o",
      name = "c",
      descriptor = "[[[Luo;"
   )
   public static class600[][][] field474;

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method228(byte arg0) {
      try {
         int var1 = -12 % ((-22 - arg0) / 33);
         field474 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field478[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(I)[Lqg;"
   )
   public static final class485[] method229(int arg0) {
      try {
         if (arg0 > -15) {
            return null;
         } else {
            ++field477;
            return new class485[]{class443.field6458, class604.field8697, class722.field10450, class471.field6841, class289.field4044, class431.field6249, class601.field8675, class318.field4600, class313.field4510, class477.field6955};
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field478[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(Ljava/lang/String;IZ)V"
   )
   public static final void method230(String arg0, int arg1, boolean arg2) {
      try {
         class152.method1413(arg1, arg2, arg0, -1, arg1 ^ 24481);
         ++field475;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field478[3] + (arg0 != null ? field478[5] : field478[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method231(boolean arg0) {
      try {
         if (arg0) {
            class298.field4166 = new class332();
            ++field476;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field478[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method232(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method233(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
