import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class430 {
   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6305 = new String[]{method3356(method3355("\"}A\u0003\u0004}")), method3356(method3355(";oLA")), method3356(method3355(".4\u000e\u0003;")), method3356(method3355("\"}A\u0003\u0007}")), method3356(method3355("\"}A\u0003\u0005}"))};
   @OriginalMember(
      owner = "client!wga",
      name = "f",
      descriptor = "I"
   )
   public static int field6302 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field6299 = new class724(124, -1);
   @OriginalMember(
      owner = "client!wga",
      name = "d",
      descriptor = "Lfm;"
   )
   public static class164 field6304 = new class164(34, 3);
   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "I"
   )
   public static int field6300;
   @OriginalMember(
      owner = "client!wga",
      name = "e",
      descriptor = "I"
   )
   public static int field6301;
   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "I"
   )
   public static int field6303;

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(I[[BLeh;)V"
   )
   public static final void method3352(int param0, byte[][] param1, class543 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(IILjava/io/File;)[B"
   )
   public static final byte[] method3353(int arg0, int arg1, File arg2) {
      try {
         ++field6301;

         try {
            if (arg0 != -1413362034) {
               return null;
            } else {
               byte[] var3 = new byte[arg1];
               class378.method2946(2, arg2, var3, arg1);
               return var3;
            }
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6305[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6305[2] : field6305[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3354(int arg0) {
      try {
         field6304 = null;
         field6299 = null;
         if (arg0 >= -79) {
            method3353(42, -93, (File)null);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6305[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3355(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3356(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
