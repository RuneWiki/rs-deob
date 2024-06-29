import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class498 {
   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7384 = new String[]{method3716(method3715("{E\f*8")), method3716(method3715("{E\f)8"))};
   @OriginalMember(
      owner = "client!nm",
      name = "j",
      descriptor = "Lce;"
   )
   public static class324 field7376 = new class324(method3716(method3715("Yat.")), 0);
   @OriginalMember(
      owner = "client!nm",
      name = "g",
      descriptor = "I"
   )
   public static int field7377;
   @OriginalMember(
      owner = "client!nm",
      name = "c",
      descriptor = "I"
   )
   public static int field7378;
   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "I"
   )
   public static int field7379;
   @OriginalMember(
      owner = "client!nm",
      name = "h",
      descriptor = "I"
   )
   public static int field7380;
   @OriginalMember(
      owner = "client!nm",
      name = "f",
      descriptor = "I"
   )
   public static int field7383;
   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field7375;
   @OriginalMember(
      owner = "client!nm",
      name = "d",
      descriptor = "[S"
   )
   public short[] field7374;
   @OriginalMember(
      owner = "client!nm",
      name = "i",
      descriptor = "[S"
   )
   public short[] field7381;
   @OriginalMember(
      owner = "client!nm",
      name = "e",
      descriptor = "[S"
   )
   public short[] field7382;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3713(int arg0, int arg1, int arg2) {
      try {
         ++field7377;
         int var3 = -108 / ((-25 - arg1) / 49);
         return (arg0 & 540800) != 0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7384[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3714(int arg0) {
      try {
         int var1 = 32 % ((arg0 - 10) / 43);
         field7376 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7384[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3715(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3716(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
