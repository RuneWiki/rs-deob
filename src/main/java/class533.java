import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class533 implements class110 {
   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "I"
   )
   public int field7826;
   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7830 = new String[]{method4058(method4057(",z\\\u0010\u00052sTJ\u0007s")), method4058(method4057(",z\\\u0010xs")), method4058(method4057(",z\\\u0010{s"))};
   @OriginalMember(
      owner = "client!wga",
      name = "d",
      descriptor = "I"
   )
   public static int field7825 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field7827 = new class6(37, 0);
   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "I"
   )
   public static int field7828;
   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "Lww;"
   )
   public static class339 field7829;

   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4056(byte arg0) {
      try {
         field7829 = null;
         field7827 = null;
         if (arg0 != -33) {
            field7829 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7830[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         int var2 = -65 % ((4 - arg0) / 37);
         ++field7828;
         return class238.field3033;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7830[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class533(int arg0) {
      try {
         this.field7826 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7830[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4057(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4058(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
