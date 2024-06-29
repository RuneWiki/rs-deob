import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class177 {
   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2619 = new String[]{method1621(method1620("|ha\u000eG")), method1621(method1620("|ha\rG")), method1621(method1620("s%ab\u0012")), method1621(method1620("f~# "))};
   @OriginalMember(
      owner = "client!tc",
      name = "c",
      descriptor = "Lwt;"
   )
   public static class9 field2615 = new class9(16);
   @OriginalMember(
      owner = "client!tc",
      name = "d",
      descriptor = "I"
   )
   public static int field2616 = 0;
   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field2617 = new class724(41, 8);
   @OriginalMember(
      owner = "client!tc",
      name = "b",
      descriptor = "I"
   )
   public static int field2614;
   @OriginalMember(
      owner = "client!tc",
      name = "e",
      descriptor = "I"
   )
   public static int field2618;

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(ILkaa;BZI)V"
   )
   public static final void method1618(int param0, class158 param1, byte param2, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1619(byte arg0) {
      try {
         int var1 = -108 / ((20 - arg0) / 44);
         field2617 = null;
         field2615 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2619[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1620(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1621(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
