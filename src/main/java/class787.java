import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class787 implements class26 {
   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "I"
   )
   public int field11539;
   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11540 = new String[]{method5710(method5709("H{iV\u001fLu3T^")), method5710(method5709("H{i+^"))};
   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "I"
   )
   public static int field11538 = 0;
   @OriginalMember(
      owner = "client!jg",
      name = "c",
      descriptor = "I"
   )
   public static int field11537;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public final class783 method193(int arg0) {
      try {
         ++field11537;
         return arg0 != -1 ? null : class186.field2916;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11540[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class787(int arg0) {
      try {
         this.field11539 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11540[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5709(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5710(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
