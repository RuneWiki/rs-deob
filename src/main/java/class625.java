import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class625 {
   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9099 = new String[]{method4514(method4513("2\u001a2^h")), method4514(method4513("2\u001a2]h")), method4514(method4513("&\u001esh);\u0011Jv$0\u0019]{")), method4514(method4513("2\u001a2[h")), method4514(method4513("2\u001a2\\h"))};
   @OriginalMember(
      owner = "client!gl",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field9095 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!gl",
      name = "d",
      descriptor = "I"
   )
   public int field9091;
   @OriginalMember(
      owner = "client!gl",
      name = "f",
      descriptor = "I"
   )
   public static int field9092;
   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "I"
   )
   public int field9093;
   @OriginalMember(
      owner = "client!gl",
      name = "e",
      descriptor = "I"
   )
   public static int field9094;
   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "I"
   )
   public int field9096;
   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "I"
   )
   public static int field9097;
   @OriginalMember(
      owner = "client!gl",
      name = "h",
      descriptor = "I"
   )
   public int field9098;

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method4509(int arg0, int arg1, boolean arg2) {
      try {
         ++field9097;
         if (!class243.method1805(arg1, arg0, arg2)) {
            return false;
         } else {
            return ~(arg0 & 45056) != -1 | class216.method1636(arg1, 0, arg0) | class473.method3522(arg1, arg0, 0) ? true : (class415.method3173(arg0, 10695, arg1) | class255.method1919(arg0, 0, arg1)) & ~(55 & arg1) == -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9099[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method4510(byte arg0) {
      try {
         if (arg0 >= -23) {
            field9095 = null;
         }

         ++field9094;
         if (client.field4512) {
            try {
               if ((Boolean)class359.method2803(field9099[2], class238.field3003, (byte)-82)) {
                  return false;
               }

               return true;
            } catch (Throwable var2) {
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9099[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4511(int arg0) {
      try {
         field9095 = null;
         if (arg0 != 12288) {
            method4511(-91);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9099[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4512(int arg0) {
      try {
         class777.field11357 = 0;
         if (arg0 < 117) {
            method4512(-47);
         }

         ++field9092;
         class348.field5289 = -2;
         class442.field6744 = -2;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9099[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4514(char[] arg0) {
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
            var10005 = 118;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
