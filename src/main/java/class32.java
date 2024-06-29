import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 {
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field353 = new String[]{method228(method227("T)#+\t\u0015")), method228(method227("T)#+\n\u0015"))};
   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "Ldw;"
   )
   public static class748 field349 = new class748(8);
   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "Lsda;"
   )
   public static class269 field352 = new class269(84, -1);
   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "I"
   )
   public static int field350;
   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "I"
   )
   public static int field351;

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Z)V",
      line = 8
   )
   public static void method225(boolean arg0) {
      try {
         field352 = null;
         if (!arg0) {
            field349 = null;
         }

         field349 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field353[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "(Z)V",
      line = 24
   )
   public static final void method226(boolean arg0) {
      try {
         if (~class378.field5716 != 0) {
            class231.method1741(72, -1, -1, false, class378.field5716);
            class378.field5716 = -1;
         }

         ++field350;
         if (!arg0) {
            field349 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field353[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method227(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method228(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
