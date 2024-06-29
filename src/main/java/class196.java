import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class196 {
   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2833 = new String[]{method1723(method1722("\n\u001eY/]")), method1723(method1722("\n\u001eY,]"))};
   @OriginalMember(
      owner = "client!cf",
      name = "d",
      descriptor = "Liw;"
   )
   public static class107 field2827 = new class107(3000000, 200);
   @OriginalMember(
      owner = "client!cf",
      name = "e",
      descriptor = "Lfm;"
   )
   public static class164 field2829 = new class164(89, 7);
   @OriginalMember(
      owner = "client!cf",
      name = "b",
      descriptor = "I"
   )
   public static int field2830 = 0;
   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "I"
   )
   public static int field2832 = 1339;
   @OriginalMember(
      owner = "client!cf",
      name = "c",
      descriptor = "Ldi;"
   )
   public static class577 field2831 = new class577(8, 1);
   @OriginalMember(
      owner = "client!cf",
      name = "f",
      descriptor = "I"
   )
   public static int field2828;

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1720(boolean arg0) {
      try {
         field2829 = null;
         if (!arg0) {
            method1721(51);
         }

         field2827 = null;
         field2831 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2833[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(I)[Lmj;"
   )
   public static final class730[] method1721(int arg0) {
      try {
         ++field2828;
         if (arg0 != 89) {
            field2829 = null;
         }

         return new class730[]{class91.field1334, class709.field10173, class582.field8179};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2833[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1722(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1723(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
