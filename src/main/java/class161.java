import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class161 {
   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2059 = new String[]{method1348(method1347("|/\fA7")), method1348(method1347("|/\fC7")), method1348(method1347("|/\f@7"))};
   @OriginalMember(
      owner = "client!uh",
      name = "b",
      descriptor = "I"
   )
   public static int field2057;
   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "I"
   )
   public static int field2058;
   @OriginalMember(
      owner = "client!uh",
      name = "c",
      descriptor = "[Loha;"
   )
   public static class562[] field2056;

   @OriginalMember(
      owner = "client!uh",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1344(byte arg0) {
      try {
         ++field2057;
         if (arg0 != -104) {
            method1344((byte)20);
         }

         if (class737.field10797 != null) {
            class737.field10797.method4398(6000);
         }

         if (class785.field11467 != null) {
            class785.field11467.method4398(arg0 ^ -5912);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2059[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1345(int arg0) {
      try {
         field2056 = null;
         if (arg0 != -5868) {
            method1344((byte)43);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2059[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "a",
      descriptor = "(B)[Luha;"
   )
   public static final class5[] method1346(byte arg0) {
      try {
         ++field2058;
         int var1 = -22 / ((-59 - arg0) / 58);
         return new class5[]{class561.field8216, class561.field8217, class561.field8219, class561.field8220, class561.field8221, class561.field8222, class561.field8223, class561.field8224, class561.field8225, class561.field8226, class561.field8227, class561.field8228, class561.field8229};
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2059[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
