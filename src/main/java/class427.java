import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class427 {
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5967 = new String[]{method3211(method3210("\u001fm\u0000:W")), method3211(method3210("\u001fm\u00009W"))};
   @OriginalMember(
      owner = "client!ns",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field5965 = new int[1];
   @OriginalMember(
      owner = "client!ns",
      name = "d",
      descriptor = "I"
   )
   public static int field5964;
   @OriginalMember(
      owner = "client!ns",
      name = "c",
      descriptor = "Ltba;"
   )
   public static class172 field5963;
   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "Lmf;"
   )
   public static class443 field5966;

   @OriginalMember(
      owner = "client!ns",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3208(byte arg0) {
      try {
         field5966 = null;
         field5963 = null;
         field5965 = null;
         if (arg0 != -127) {
            field5966 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5967[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3209(byte arg0) {
      try {
         class411.field5793 = false;
         if (arg0 == -64) {
            ++field5964;
            class570.method4093(-30624);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5967[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
