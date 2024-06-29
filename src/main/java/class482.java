import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class482 {
   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6916 = new String[]{method3685(method3684("\u0003S{G:")), method3685(method3684("\u0016\b9\u0005")), method3685(method3684("\b\u0012{+o")), method3685(method3684("\b\u0012{*o")), method3685(method3684("\b\u0012{(o"))};
   @OriginalMember(
      owner = "client!po",
      name = "d",
      descriptor = "Lvf;"
   )
   public static class73 field6912 = new class73();
   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6913 = new int[4096];
   @OriginalMember(
      owner = "client!po",
      name = "e",
      descriptor = "Ldb;"
   )
   public static class685 field6914;
   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field6915;
   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "I"
   )
   public static int field6911;

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ZILaea;III)Lefa;"
   )
   public static final class436 method3681(boolean arg0, int arg1, class678 arg2, int arg3, int arg4, int arg5) {
      try {
         if (!arg0) {
            method3681(true, 42, (class678)null, -2, 25, -126);
         }

         ++field6911;
         if (arg2.field9791 || class122.method1209(arg5, 109) && class122.method1209(arg3, -54)) {
            return new class436(arg2, 3553, arg4, arg1, arg5, arg3, true);
         } else {
            return !arg2.field9777 ? new class436(arg2, arg4, arg1, arg5, arg3, class645.method4694(arg5, (byte)-128), class645.method4694(arg3, (byte)-128), true) : new class436(arg2, 34037, arg4, arg1, arg5, arg3, true);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6916[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6916[0] : field6916[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3682(int arg0) {
      try {
         field6915 = null;
         field6914 = null;
         int var1 = 73 % ((-14 - arg0) / 60);
         field6912 = null;
         field6913 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6916[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method3683(long arg0, long arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6916[3] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         field6913[var0] = class117.method1141(1125517004, var0);
      }

      field6914 = new class685(11, 7);
      field6915 = new class164(23, -1);
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3684(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3685(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
