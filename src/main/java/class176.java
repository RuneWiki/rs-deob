import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class176 {
   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2613 = new String[]{method1617(method1616("\u0016S\u0010\u001e\u000b")), method1617(method1616("\u0016S\u0010\u001d\u000b"))};
   @OriginalMember(
      owner = "client!at",
      name = "c",
      descriptor = "Lfm;"
   )
   public static class164 field2611 = new class164(48, 3);
   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "I"
   )
   public static int field2610;
   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "Lr;"
   )
   public class412 field2612;
   @OriginalMember(
      owner = "client!at",
      name = "d",
      descriptor = "Lka;"
   )
   public class761 field2609;

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1614(boolean arg0) {
      try {
         if (!arg0) {
            field2611 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2613[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1615(int arg0) {
      try {
         class465.field6756.method1052(true);
         ++field2610;
         int var1 = 15 / ((arg0 - -66) / 32);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2613[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!at",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
