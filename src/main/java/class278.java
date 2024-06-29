import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class278 {
   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3788 = new String[]{method2113(method2112("\u001f'Q\u001f\u0005")), method2113(method2112("\u001f'Q\u001c\u0005"))};
   @OriginalMember(
      owner = "client!rh",
      name = "e",
      descriptor = "I"
   )
   public static int field3784 = 0;
   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "I"
   )
   public static int field3787 = 0;
   @OriginalMember(
      owner = "client!rh",
      name = "b",
      descriptor = "I"
   )
   public static int field3785;
   @OriginalMember(
      owner = "client!rh",
      name = "c",
      descriptor = "I"
   )
   public static int field3786;
   @OriginalMember(
      owner = "client!rh",
      name = "d",
      descriptor = "Lci;"
   )
   public static class476 field3783;

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(III)V",
      line = 3
   )
   public static final void method2110(int arg0, int arg1, int arg2) {
      try {
         ++field3785;
         class755 var3 = class317.method2325((long)arg2, arg1 ^ 100, arg1);
         var3.method5479(1288);
         var3.field11184 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3788[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(I)V",
      line = 21
   )
   public static void method2111(int arg0) {
      try {
         field3783 = null;
         if (arg0 != -18278) {
            method2111(98);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3788[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2112(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2113(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
