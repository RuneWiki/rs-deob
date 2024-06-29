import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class443 {
   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6467 = new String[]{method3338(method3337("b*3<j\"")), method3338(method3337("b*3<o\"")), method3338(method3337("b*3<k\"")), method3338(method3337("qa|<S")), method3338(method3337("b*3<m\"")), method3338(method3337("d:>~")), method3338(method3337("b*3<l\""))};
   @OriginalMember(
      owner = "client!hea",
      name = "d",
      descriptor = "Lqg;"
   )
   public static class485 field6458 = new class485(0, 1);
   @OriginalMember(
      owner = "client!hea",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6466 = new int[3];
   @OriginalMember(
      owner = "client!hea",
      name = "i",
      descriptor = "I"
   )
   public static int field6459;
   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "I"
   )
   public static int field6460;
   @OriginalMember(
      owner = "client!hea",
      name = "g",
      descriptor = "I"
   )
   public static int field6461;
   @OriginalMember(
      owner = "client!hea",
      name = "e",
      descriptor = "I"
   )
   public static int field6463;
   @OriginalMember(
      owner = "client!hea",
      name = "h",
      descriptor = "I"
   )
   public static int field6464;
   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "I"
   )
   public static int field6465;
   @OriginalMember(
      owner = "client!hea",
      name = "c",
      descriptor = "[[[B"
   )
   public static byte[][][] field6462;

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3332(byte arg0) {
      try {
         if (arg0 > 41) {
            field6462 = null;
            field6466 = null;
            field6458 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6467[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3333(byte arg0) {
      try {
         if (arg0 == -28) {
            if (class124.field2049 == 1 || ~class124.field2049 == -4 || class536.field7812 != class124.field2049 && (class124.field2049 == 0 || class536.field7812 == 0)) {
               class492.field7163 = 0;
               class16.field293 = 0;
               class78.field1344.method1570((byte)15);
            }

            ++field6461;
            class536.field7812 = class124.field2049;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6467[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "([BB)[B"
   )
   public static final byte[] method3334(byte[] arg0, byte arg1) {
      try {
         ++field6459;
         int var2 = arg0.length;
         if (arg1 < 51) {
            return null;
         } else {
            byte[] var3 = new byte[var2];
            class365.method2856(arg0, 0, var3, 0, var2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6467[4] + (arg0 != null ? field6467[3] : field6467[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method3335(int arg0, byte arg1, int arg2) {
      try {
         int var3 = -81 / (arg1 / 48);
         ++field6464;
         return class90.method888(arg0, 123, arg2) || class455.method3422(84, arg0, arg2);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6467[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3336(int arg0, int arg1, int arg2) {
      try {
         if (arg2 < 111) {
            field6462 = null;
         }

         ++field6460;
         return ~(2048 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6467[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3337(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3338(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
