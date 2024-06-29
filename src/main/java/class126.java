import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public abstract class class126 {
   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1523 = method1033(method1032("-'\u001f`Gp"));
   @OriginalMember(
      owner = "client!uaa",
      name = "c",
      descriptor = "Ldw;"
   )
   public static class748 field1520 = new class748(4);
   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "Lmc;"
   )
   public static class144 field1522 = new class144();
   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "I"
   )
   public static int field1521;

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V"
   )
   public static final void method1030(int arg0, int arg1, int arg2, Class arg3) {
      class72 var4 = class353.field5360[arg0][arg1][arg2];
      if (var4 != null) {
         for(class389 var5 = var4.field910; var5 != null; var5 = var5.field5942) {
            class741 var6 = var5.field5943;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10995 == arg1 && var6.field11000 == arg2) {
               class256.method1927(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1031(boolean arg0) {
      try {
         field1522 = null;
         if (arg0) {
            field1520 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1523 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1032(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1033(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
