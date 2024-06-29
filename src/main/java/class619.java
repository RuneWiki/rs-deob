import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class619 extends InputStream {
   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8659 = new String[]{method4510(method4509("\u0015F(\u001f\u001f")), method4510(method4509("\u0015F(\u001e\u001f")), method4510(method4509("\u0015F(\u001c\u001f")), method4510(method4509("\u0015F(/R\u001dC."))};
   @OriginalMember(
      owner = "client!ia",
      name = "d",
      descriptor = "Lnw;"
   )
   public static class616 field8651 = new class616(1, 0);
   @OriginalMember(
      owner = "client!ia",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field8655 = false;
   @OriginalMember(
      owner = "client!ia",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field8657 = new int[13];
   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "I"
   )
   public static int field8650;
   @OriginalMember(
      owner = "client!ia",
      name = "i",
      descriptor = "I"
   )
   public static int field8652;
   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "I"
   )
   public static int field8653;
   @OriginalMember(
      owner = "client!ia",
      name = "c",
      descriptor = "I"
   )
   public static int field8654;
   @OriginalMember(
      owner = "client!ia",
      name = "f",
      descriptor = "I"
   )
   public static int field8656;
   @OriginalMember(
      owner = "client!ia",
      name = "e",
      descriptor = "I"
   )
   public static int field8658;

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4506(int arg0, byte arg1, int arg2) {
      try {
         ++field8654;
         if (~arg0 == -12) {
            arg0 = 10;
         }

         if (arg1 != -22) {
            return false;
         } else {
            class774 var3 = class472.field6533.method3586(64, arg2);
            if (arg0 >= 5 && ~arg0 >= -9) {
               arg0 = 4;
            }

            return var3.method5546((byte)-115, arg0);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8659[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4507(byte arg0) {
      try {
         field8657 = null;
         field8651 = null;
         if (arg0 <= 31) {
            method4507((byte)-3);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8659[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         ++field8650;
         class173.method1347(-79, 30000L);
         return -1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8659[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4508(byte arg0) {
      try {
         if (~class677.field9944 == -2 || class677.field9944 == 3 || ~class69.field806 != ~class677.field9944 && (class677.field9944 == 0 || class69.field806 == 0)) {
            class667.field9489 = 0;
            class741.field10800 = 0;
            class335.field4808.method1851(arg0);
         }

         ++field8656;
         if (arg0 != 90) {
            field8655 = true;
         }

         class69.field806 = class677.field9944;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8659[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4509(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4510(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
