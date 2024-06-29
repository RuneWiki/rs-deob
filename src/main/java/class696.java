import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class696 {
   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10053 = new String[]{method5096(method5095("*Lnb>o")), method5096(method5095("*Lnb=o"))};
   @OriginalMember(
      owner = "client!mfa",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field10049 = new int[32];
   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "Ljga;"
   )
   public static class91 field10048 = null;
   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "Lfm;"
   )
   public static class164 field10051 = new class164(92, -1);
   @OriginalMember(
      owner = "client!mfa",
      name = "e",
      descriptor = "F"
   )
   public static float field10050;
   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "I"
   )
   public static int field10052;

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5093(int arg0) {
      try {
         field10051 = null;
         field10049 = null;
         if (arg0 != 92) {
            field10050 = -1.1086271F;
         }

         field10048 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10053[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5094(int arg0, int arg1) {
      try {
         if (arg1 != 31215) {
            return false;
         } else {
            ++field10052;
            return ~arg0 == -12 || ~arg0 == -13 || arg0 == 13;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10053[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5095(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5096(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
